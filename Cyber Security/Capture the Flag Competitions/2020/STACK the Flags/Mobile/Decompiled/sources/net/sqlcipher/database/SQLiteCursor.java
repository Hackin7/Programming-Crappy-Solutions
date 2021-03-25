package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.SQLException;

public class SQLiteCursor extends AbstractWindowedCursor {
    public static final int NO_COUNT = -1;
    public static final String TAG = "Cursor";
    public boolean fillWindowForwardOnly = false;
    public Map<String, Integer> mColumnNameMap;
    public String[] mColumns;
    public int mCount = -1;
    public int mCursorState = 0;
    public int mCursorWindowCapacity = 0;
    public SQLiteDatabase mDatabase;
    public SQLiteCursorDriver mDriver;
    public String mEditTable;
    public int mInitialRead = Integer.MAX_VALUE;
    public ReentrantLock mLock = null;
    public int mMaxRead = Integer.MAX_VALUE;
    public MainThreadNotificationHandler mNotificationHandler;
    public boolean mPendingData = false;
    public SQLiteQuery mQuery;
    public Throwable mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();

    public void setFillWindowForwardOnly(boolean value) {
        this.fillWindowForwardOnly = value;
    }

    public void setLoadStyle(int initialRead, int maxRead) {
        this.mMaxRead = maxRead;
        this.mInitialRead = initialRead;
        this.mLock = new ReentrantLock(true);
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    public final class QueryThread implements Runnable {
        public final int mThreadState;

        public QueryThread(int version) {
            this.mThreadState = version;
        }

        private void sendMessage() {
            SQLiteCursor sQLiteCursor = SQLiteCursor.this;
            MainThreadNotificationHandler mainThreadNotificationHandler = sQLiteCursor.mNotificationHandler;
            if (mainThreadNotificationHandler != null) {
                mainThreadNotificationHandler.sendEmptyMessage(1);
                SQLiteCursor.this.mPendingData = false;
                return;
            }
            sQLiteCursor.mPendingData = true;
        }

        public void run() {
            CursorWindow cw = SQLiteCursor.this.mWindow;
            Process.setThreadPriority(Process.myTid(), 10);
            while (true) {
                if (SQLiteCursor.this.mLock == null) {
                    SQLiteCursor.this.mLock = new ReentrantLock(true);
                }
                SQLiteCursor.this.mLock.lock();
                if (SQLiteCursor.this.mCursorState != this.mThreadState) {
                    SQLiteCursor.this.mLock.unlock();
                    return;
                }
                try {
                    int count = SQLiteCursor.this.mQuery.fillWindow(cw, SQLiteCursor.this.mMaxRead, SQLiteCursor.this.mCount);
                    if (count != 0) {
                        if (count != -1) {
                            SQLiteCursor.this.mCount = count;
                            sendMessage();
                            break;
                        }
                        SQLiteCursor.this.mCount += SQLiteCursor.this.mMaxRead;
                        sendMessage();
                    } else {
                        break;
                    }
                } catch (Exception e2) {
                    return;
                } finally {
                    SQLiteCursor.this.mLock.unlock();
                }
            }
            SQLiteCursor.this.mLock.unlock();
        }
    }

    public static class MainThreadNotificationHandler extends Handler {
        public final WeakReference<SQLiteCursor> wrappedCursor;

        public MainThreadNotificationHandler(SQLiteCursor cursor) {
            this.wrappedCursor = new WeakReference<>(cursor);
        }

        public void handleMessage(Message msg) {
            SQLiteCursor cursor = this.wrappedCursor.get();
            if (cursor != null) {
                cursor.notifyDataSetChange();
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public void registerDataSetObserver(DataSetObserver observer) {
        super.registerDataSetObserver(observer);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    public SQLiteCursor(SQLiteDatabase db, SQLiteCursorDriver driver, String editTable, SQLiteQuery query) {
        this.mDatabase = db;
        this.mDriver = driver;
        this.mEditTable = editTable;
        this.mColumnNameMap = null;
        this.mQuery = query;
        try {
            db.lock();
            int columnCount = this.mQuery.columnCountLocked();
            this.mColumns = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                String columnName = this.mQuery.columnNameLocked(i);
                this.mColumns[i] = columnName;
                if ("_id".equals(columnName)) {
                    this.mRowIdColumnIndex = i;
                }
            }
        } finally {
            db.unlock();
        }
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean onMove(int oldPosition, int newPosition) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null && newPosition >= cursorWindow.getStartPosition() && newPosition < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(newPosition);
        return true;
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    private void fillWindow(int requiredPos) {
        int startPos;
        int i;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            startPos = requiredPos;
        } else {
            if (this.mCount == -1) {
                i = cursorPickFillWindowStartPosition(requiredPos, 0);
            } else {
                i = cursorPickFillWindowStartPosition(requiredPos, this.mCursorWindowCapacity);
            }
            startPos = i;
        }
        this.mWindow.setStartPosition(startPos);
        this.mWindow.setRequiredPosition(requiredPos);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = this.mInitialRead + startPos;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getColumnIndex(String columnName) {
        if (this.mColumnNameMap == null) {
            String[] columns = this.mColumns;
            int columnCount = columns.length;
            HashMap<String, Integer> map = new HashMap<>(columnCount, 1.0f);
            for (int i = 0; i < columnCount; i++) {
                map.put(columns[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = map;
        }
        if (columnName.lastIndexOf(46) != -1) {
            new Exception();
        }
        Integer i2 = this.mColumnNameMap.get(columnName);
        if (i2 != null) {
            return i2.intValue();
        }
        return -1;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        boolean success;
        checkPosition();
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            return false;
        }
        this.mDatabase.lock();
        try {
            this.mDatabase.delete(this.mEditTable, this.mColumns[this.mRowIdColumnIndex] + "=?", new String[]{this.mCurrentRowID.toString()});
            success = true;
        } catch (SQLException e2) {
            success = false;
        }
        try {
            int pos = this.mPos;
            requery();
            moveToPosition(pos);
            if (!success) {
                return false;
            }
            onChange(true);
            return true;
        } finally {
            this.mDatabase.unlock();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }

    /* JADX INFO: finally extract failed */
    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> additionalValues) {
        int i = 0;
        if (!supportsUpdates()) {
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (additionalValues != null) {
                this.mUpdatedRows.putAll(additionalValues);
            }
            if (this.mUpdatedRows.size() == 0) {
                return true;
            }
            this.mDatabase.beginTransaction();
            try {
                StringBuilder sql = new StringBuilder(128);
                for (Map.Entry<Long, Map<String, Object>> rowEntry : this.mUpdatedRows.entrySet()) {
                    Map<String, Object> values = rowEntry.getValue();
                    Long rowIdObj = rowEntry.getKey();
                    if (rowIdObj == null || values == null) {
                        throw new IllegalStateException("null rowId or values found! rowId = " + rowIdObj + ", values = " + values);
                    } else if (values.size() != 0) {
                        long rowId = rowIdObj.longValue();
                        Iterator<Map.Entry<String, Object>> valuesIter = values.entrySet().iterator();
                        sql.setLength(i);
                        sql.append("UPDATE " + this.mEditTable + " SET ");
                        Object[] bindings = new Object[values.size()];
                        int i2 = 0;
                        while (valuesIter.hasNext()) {
                            Map.Entry<String, Object> entry = valuesIter.next();
                            sql.append(entry.getKey());
                            sql.append("=?");
                            bindings[i2] = entry.getValue();
                            if (valuesIter.hasNext()) {
                                sql.append(", ");
                            }
                            i2++;
                        }
                        sql.append(" WHERE " + this.mColumns[this.mRowIdColumnIndex] + '=' + rowId);
                        sql.append(';');
                        this.mDatabase.execSQL(sql.toString(), bindings);
                        this.mDatabase.rowUpdated(this.mEditTable, rowId);
                        i = 0;
                    }
                }
                this.mDatabase.setTransactionSuccessful();
                this.mDatabase.endTransaction();
                this.mUpdatedRows.clear();
                onChange(true);
                return true;
            } catch (Throwable th) {
                this.mDatabase.endTransaction();
                throw th;
            }
        }
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mWindow = null;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    @Override // net.sqlcipher.AbstractCursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    /* JADX INFO: finally extract failed */
    @Override // net.sqlcipher.AbstractCursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mQuery.requery();
                queryThreadUnlock();
                this.mDatabase.unlock();
                return super.requery();
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.mDatabase.unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // net.sqlcipher.AbstractWindowedCursor
    public void setWindow(CursorWindow window) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = -1;
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow = window;
    }

    public void setSelectionArguments(String[] selectionArgs) {
        this.mDriver.setBindArguments(selectionArgs);
    }

    @Override // net.sqlcipher.AbstractCursor, java.lang.Object
    public void finalize() {
        try {
            if (this.mWindow != null) {
                this.mQuery.mSql.length();
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public void fillWindow(int requiredPos, android.database.CursorWindow window) {
        int startPos;
        int i;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            startPos = requiredPos;
        } else {
            if (this.mCount == -1) {
                i = cursorPickFillWindowStartPosition(requiredPos, 0);
            } else {
                i = cursorPickFillWindowStartPosition(requiredPos, this.mCursorWindowCapacity);
            }
            startPos = i;
        }
        this.mWindow.setStartPosition(startPos);
        this.mWindow.setRequiredPosition(requiredPos);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = this.mInitialRead + startPos;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    public int cursorPickFillWindowStartPosition(int cursorPosition, int cursorWindowCapacity) {
        return Math.max(cursorPosition - (cursorWindowCapacity / 3), 0);
    }
}
