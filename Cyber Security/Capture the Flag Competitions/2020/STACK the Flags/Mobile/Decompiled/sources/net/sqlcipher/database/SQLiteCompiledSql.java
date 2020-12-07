package net.sqlcipher.database;

import android.util.Log;

public class SQLiteCompiledSql {
    public static final String TAG = "SQLiteCompiledSql";
    public SQLiteDatabase mDatabase;
    public boolean mInUse = false;
    public String mSqlStmt = null;
    public Throwable mStackTrace = null;
    public long nHandle = 0;
    public long nStatement = 0;

    private final native void native_compile(String str);

    private final native void native_finalize();

    public SQLiteCompiledSql(SQLiteDatabase db, String sql) {
        if (db.isOpen()) {
            this.mDatabase = db;
            this.mSqlStmt = sql;
            this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.nHandle = db.mNativeHandle;
            compile(sql, true);
            return;
        }
        throw new IllegalStateException("database " + db.getPath() + " already closed");
    }

    private void compile(String sql, boolean forceCompilation) {
        if (!this.mDatabase.isOpen()) {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        } else if (forceCompilation) {
            this.mDatabase.lock();
            try {
                native_compile(sql);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                Log.v(TAG, "closed and deallocated DbObj (id#" + this.nStatement + ")");
            }
            try {
                this.mDatabase.lock();
                native_finalize();
                this.nStatement = 0;
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    public synchronized boolean acquire() {
        if (this.mInUse) {
            return false;
        }
        this.mInUse = true;
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            Log.v(TAG, "Acquired DbObj (id#" + this.nStatement + ") from DB cache");
        }
        return true;
    }

    public synchronized void release() {
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            Log.v(TAG, "Released DbObj (id#" + this.nStatement + ") back to DB cache");
        }
        this.mInUse = false;
    }

    public void finalize() {
        try {
            if (this.nStatement != 0) {
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    Log.v(TAG, "** warning ** Finalized DbObj (id#" + this.nStatement + ")");
                }
                int len = this.mSqlStmt.length();
                StringBuilder sb = new StringBuilder();
                sb.append("Releasing statement in a finalizer. Please ensure that you explicitly call close() on your cursor: ");
                String str = this.mSqlStmt;
                int i = 100;
                if (len <= 100) {
                    i = len;
                }
                sb.append(str.substring(0, i));
                Log.w(TAG, sb.toString(), this.mStackTrace);
                releaseSqlStatement();
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }
}
