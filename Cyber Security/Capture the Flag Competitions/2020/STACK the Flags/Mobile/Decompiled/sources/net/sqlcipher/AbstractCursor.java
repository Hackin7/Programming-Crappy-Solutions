package net.sqlcipher;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCursor implements CrossProcessCursor, Cursor {
    public static final String TAG = "Cursor";
    public boolean mClosed = false;
    public ContentObservable mContentObservable = new ContentObservable();
    public ContentResolver mContentResolver;
    public Long mCurrentRowID = null;
    public DataSetObservable mDataSetObservable = new DataSetObservable();
    public Bundle mExtras = Bundle.EMPTY;
    public Uri mNotifyUri;
    public int mPos = -1;
    public int mRowIdColumnIndex = -1;
    public ContentObserver mSelfObserver;
    public final Object mSelfObserverLock = new Object();
    public boolean mSelfObserverRegistered;
    public HashMap<Long, Map<String, Object>> mUpdatedRows = new HashMap<>();

    public abstract String[] getColumnNames();

    public abstract int getCount();

    public abstract double getDouble(int i);

    public abstract float getFloat(int i);

    public abstract int getInt(int i);

    public abstract long getLong(int i);

    public abstract short getShort(int i);

    public abstract String getString(int i);

    @Override // net.sqlcipher.Cursor
    public abstract int getType(int i);

    public abstract boolean isNull(int i);

    public byte[] getBlob(int column) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    public CursorWindow getWindow() {
        return null;
    }

    public int getColumnCount() {
        return getColumnNames().length;
    }

    public void deactivate() {
        deactivateInternal();
    }

    public void deactivateInternal() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
            this.mSelfObserverRegistered = false;
        }
        this.mDataSetObservable.notifyInvalidated();
    }

    public boolean requery() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && !this.mSelfObserverRegistered) {
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, contentObserver);
            this.mSelfObserverRegistered = true;
        }
        this.mDataSetObservable.notifyChanged();
        return true;
    }

    public boolean isClosed() {
        return this.mClosed;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mClosed = true;
        this.mContentObservable.unregisterAll();
        deactivateInternal();
    }

    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        return false;
    }

    public boolean deleteRow() {
        return false;
    }

    public boolean onMove(int oldPosition, int newPosition) {
        return true;
    }

    public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) {
        String result = getString(columnIndex);
        if (result != null) {
            char[] data = buffer.data;
            if (data == null || data.length < result.length()) {
                buffer.data = result.toCharArray();
            } else {
                result.getChars(0, result.length(), data, 0);
            }
            buffer.sizeCopied = result.length();
            return;
        }
        buffer.sizeCopied = 0;
    }

    public final int getPosition() {
        return this.mPos;
    }

    public final boolean moveToPosition(int position) {
        int count = getCount();
        if (position >= count) {
            this.mPos = count;
            return false;
        } else if (position < 0) {
            this.mPos = -1;
            return false;
        } else {
            int i = this.mPos;
            if (position == i) {
                return true;
            }
            boolean result = onMove(i, position);
            if (!result) {
                this.mPos = -1;
            } else {
                this.mPos = position;
                int i2 = this.mRowIdColumnIndex;
                if (i2 != -1) {
                    this.mCurrentRowID = Long.valueOf(getLong(i2));
                }
            }
            return result;
        }
    }

    public void fillWindow(int position, CursorWindow window) {
        DatabaseUtils.cursorFillWindow(this, position, window);
    }

    public final boolean move(int offset) {
        return moveToPosition(this.mPos + offset);
    }

    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public final boolean moveToNext() {
        return moveToPosition(this.mPos + 1);
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.mPos - 1);
    }

    public final boolean isFirst() {
        return this.mPos == 0 && getCount() != 0;
    }

    public final boolean isLast() {
        int cnt = getCount();
        return this.mPos == cnt + -1 && cnt != 0;
    }

    public final boolean isBeforeFirst() {
        if (getCount() == 0 || this.mPos == -1) {
            return true;
        }
        return false;
    }

    public final boolean isAfterLast() {
        if (getCount() == 0 || this.mPos == getCount()) {
            return true;
        }
        return false;
    }

    public int getColumnIndex(String columnName) {
        int periodIndex = columnName.lastIndexOf(46);
        if (periodIndex != -1) {
            Exception e2 = new Exception();
            Log.e("Cursor", "requesting column name with table name -- " + columnName, e2);
            columnName = columnName.substring(periodIndex + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(columnName)) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String columnName) {
        int index = getColumnIndex(columnName);
        if (index >= 0) {
            return index;
        }
        throw new IllegalArgumentException("column '" + columnName + "' does not exist");
    }

    public String getColumnName(int columnIndex) {
        return getColumnNames()[columnIndex];
    }

    public boolean updateBlob(int columnIndex, byte[] value) {
        return update(columnIndex, value);
    }

    public boolean updateString(int columnIndex, String value) {
        return update(columnIndex, value);
    }

    public boolean updateShort(int columnIndex, short value) {
        return update(columnIndex, Short.valueOf(value));
    }

    public boolean updateInt(int columnIndex, int value) {
        return update(columnIndex, Integer.valueOf(value));
    }

    public boolean updateLong(int columnIndex, long value) {
        return update(columnIndex, Long.valueOf(value));
    }

    public boolean updateFloat(int columnIndex, float value) {
        return update(columnIndex, Float.valueOf(value));
    }

    public boolean updateDouble(int columnIndex, double value) {
        return update(columnIndex, Double.valueOf(value));
    }

    public boolean updateToNull(int columnIndex) {
        return update(columnIndex, null);
    }

    public boolean update(int columnIndex, Object obj) {
        if (!supportsUpdates()) {
            return false;
        }
        Long rowid = Long.valueOf(getLong(this.mRowIdColumnIndex));
        if (rowid != null) {
            synchronized (this.mUpdatedRows) {
                Map<String, Object> row = this.mUpdatedRows.get(rowid);
                if (row == null) {
                    row = new HashMap();
                    this.mUpdatedRows.put(rowid, row);
                }
                row.put(getColumnNames()[columnIndex], obj);
            }
            return true;
        }
        throw new IllegalStateException("null rowid. mRowIdColumnIndex = " + this.mRowIdColumnIndex);
    }

    public boolean hasUpdates() {
        boolean z;
        synchronized (this.mUpdatedRows) {
            z = this.mUpdatedRows.size() > 0;
        }
        return z;
    }

    public void abortUpdates() {
        synchronized (this.mUpdatedRows) {
            this.mUpdatedRows.clear();
        }
    }

    public boolean commitUpdates() {
        return commitUpdates(null);
    }

    public boolean supportsUpdates() {
        return this.mRowIdColumnIndex != -1;
    }

    public void registerContentObserver(ContentObserver observer) {
        this.mContentObservable.registerObserver(observer);
    }

    public void unregisterContentObserver(ContentObserver observer) {
        if (!this.mClosed) {
            this.mContentObservable.unregisterObserver(observer);
        }
    }

    public void notifyDataSetChange() {
        this.mDataSetObservable.notifyChanged();
    }

    public DataSetObservable getDataSetObservable() {
        return this.mDataSetObservable;
    }

    public void registerDataSetObserver(DataSetObserver observer) {
        this.mDataSetObservable.registerObserver(observer);
    }

    public void unregisterDataSetObserver(DataSetObserver observer) {
        this.mDataSetObservable.unregisterObserver(observer);
    }

    public void onChange(boolean selfChange) {
        synchronized (this.mSelfObserverLock) {
            this.mContentObservable.dispatchChange(selfChange);
            if (this.mNotifyUri != null && selfChange) {
                this.mContentResolver.notifyChange(this.mNotifyUri, this.mSelfObserver);
            }
        }
    }

    public void setNotificationUri(ContentResolver cr, Uri notifyUri) {
        synchronized (this.mSelfObserverLock) {
            this.mNotifyUri = notifyUri;
            this.mContentResolver = cr;
            if (this.mSelfObserver != null) {
                cr.unregisterContentObserver(this.mSelfObserver);
            }
            SelfContentObserver selfContentObserver = new SelfContentObserver(this);
            this.mSelfObserver = selfContentObserver;
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, selfContentObserver);
            this.mSelfObserverRegistered = true;
        }
    }

    public Uri getNotificationUri() {
        return this.mNotifyUri;
    }

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public void setExtras(Bundle extras) {
        this.mExtras = extras == null ? Bundle.EMPTY : extras;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public Bundle respond(Bundle extras) {
        return Bundle.EMPTY;
    }

    public boolean isFieldUpdated(int columnIndex) {
        Map<String, Object> updates;
        if (this.mRowIdColumnIndex == -1 || this.mUpdatedRows.size() <= 0 || (updates = this.mUpdatedRows.get(this.mCurrentRowID)) == null || !updates.containsKey(getColumnNames()[columnIndex])) {
            return false;
        }
        return true;
    }

    public Object getUpdatedField(int columnIndex) {
        return this.mUpdatedRows.get(this.mCurrentRowID).get(getColumnNames()[columnIndex]);
    }

    public void checkPosition() {
        if (-1 == this.mPos || getCount() == this.mPos) {
            throw new CursorIndexOutOfBoundsException(this.mPos, getCount());
        }
    }

    @Override // java.lang.Object
    public void finalize() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && this.mSelfObserverRegistered) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
        }
    }

    public static class SelfContentObserver extends ContentObserver {
        public WeakReference<AbstractCursor> mCursor;

        public SelfContentObserver(AbstractCursor cursor) {
            super(null);
            this.mCursor = new WeakReference<>(cursor);
        }

        public boolean deliverSelfNotifications() {
            return false;
        }

        public void onChange(boolean selfChange) {
            AbstractCursor cursor = this.mCursor.get();
            if (cursor != null) {
                cursor.onChange(false);
            }
        }
    }
}
