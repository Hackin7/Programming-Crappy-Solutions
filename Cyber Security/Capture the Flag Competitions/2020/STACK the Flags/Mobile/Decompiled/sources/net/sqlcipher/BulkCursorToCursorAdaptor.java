package net.sqlcipher;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;
import net.sqlcipher.AbstractCursor;

public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    public static final String TAG = "BulkCursor";
    public IBulkCursor mBulkCursor;
    public String[] mColumns;
    public int mCount;
    public AbstractCursor.SelfContentObserver mObserverBridge;
    public boolean mWantsAllOnMoveCalls;

    public void set(IBulkCursor bulkCursor) {
        this.mBulkCursor = bulkCursor;
        try {
            this.mCount = bulkCursor.count();
            this.mWantsAllOnMoveCalls = this.mBulkCursor.getWantsAllOnMoveCalls();
            String[] columnNames = this.mBulkCursor.getColumnNames();
            this.mColumns = columnNames;
            this.mRowIdColumnIndex = findRowIdColumnIndex(columnNames);
        } catch (RemoteException e2) {
            Log.e(TAG, "Setup failed because the remote process is dead");
        }
    }

    public void set(IBulkCursor bulkCursor, int count, int idIndex) {
        this.mBulkCursor = bulkCursor;
        this.mColumns = null;
        this.mCount = count;
        this.mRowIdColumnIndex = idIndex;
    }

    public static int findRowIdColumnIndex(String[] columnNames) {
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    public synchronized IContentObserver getObserver() {
        if (this.mObserverBridge == null) {
            this.mObserverBridge = new AbstractCursor.SelfContentObserver(this);
        }
        return null;
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getCount() {
        return this.mCount;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean onMove(int oldPosition, int newPosition) {
        try {
            if (this.mWindow != null) {
                if (newPosition >= this.mWindow.getStartPosition()) {
                    if (newPosition < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
                        if (this.mWantsAllOnMoveCalls) {
                            this.mBulkCursor.onMove(newPosition);
                        }
                    }
                }
                this.mWindow = this.mBulkCursor.getWindow(newPosition);
            } else {
                this.mWindow = this.mBulkCursor.getWindow(newPosition);
            }
            if (this.mWindow == null) {
                return false;
            }
            return true;
        } catch (RemoteException e2) {
            Log.e(TAG, "Unable to get window because the remote process is dead");
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public void deactivate() {
        super.deactivate();
        try {
            this.mBulkCursor.deactivate();
        } catch (RemoteException e2) {
            Log.w(TAG, "Remote process exception when deactivating");
        }
        this.mWindow = null;
    }

    @Override // net.sqlcipher.AbstractCursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        try {
            this.mBulkCursor.close();
        } catch (RemoteException e2) {
            Log.w(TAG, "Remote process exception when closing");
        }
        this.mWindow = null;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean requery() {
        try {
            int i = this.mCount;
            int requery = this.mBulkCursor.requery(getObserver(), new CursorWindow(false));
            this.mCount = requery;
            if (requery != -1) {
                this.mPos = -1;
                this.mWindow = null;
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (Exception ex) {
            Log.e(TAG, "Unable to requery because the remote process exception " + ex.getMessage());
            deactivate();
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        try {
            boolean result = this.mBulkCursor.deleteRow(this.mPos);
            if (result) {
                this.mWindow = null;
                int count = this.mBulkCursor.count();
                this.mCount = count;
                if (this.mPos < count) {
                    int oldPos = this.mPos;
                    this.mPos = -1;
                    moveToPosition(oldPos);
                } else {
                    this.mPos = count;
                }
                onChange(true);
            }
            return result;
        } catch (RemoteException e2) {
            Log.e(TAG, "Unable to delete row because the remote process is dead");
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public String[] getColumnNames() {
        if (this.mColumns == null) {
            try {
                this.mColumns = this.mBulkCursor.getColumnNames();
            } catch (RemoteException e2) {
                Log.e(TAG, "Unable to fetch column names because the remote process is dead");
                return null;
            }
        }
        return this.mColumns;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> additionalValues) {
        if (!supportsUpdates()) {
            Log.e(TAG, "commitUpdates not supported on this cursor, did you include the _id column?");
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (additionalValues != null) {
                this.mUpdatedRows.putAll(additionalValues);
            }
            if (this.mUpdatedRows.size() <= 0) {
                return false;
            }
            try {
                boolean result = this.mBulkCursor.updateRows(this.mUpdatedRows);
                if (result) {
                    this.mUpdatedRows.clear();
                    onChange(true);
                }
                return result;
            } catch (RemoteException e2) {
                Log.e(TAG, "Unable to commit updates because the remote process is dead");
                return false;
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public Bundle getExtras() {
        try {
            return this.mBulkCursor.getExtras();
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public Bundle respond(Bundle extras) {
        try {
            return this.mBulkCursor.respond(extras);
        } catch (RemoteException e2) {
            Log.w(TAG, "respond() threw RemoteException, returning an empty bundle.", e2);
            return Bundle.EMPTY;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, net.sqlcipher.AbstractWindowedCursor
    public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public void registerContentObserver(ContentObserver observer) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public void registerDataSetObserver(DataSetObserver observer) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public void unregisterContentObserver(ContentObserver observer) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public void unregisterDataSetObserver(DataSetObserver observer) {
    }
}
