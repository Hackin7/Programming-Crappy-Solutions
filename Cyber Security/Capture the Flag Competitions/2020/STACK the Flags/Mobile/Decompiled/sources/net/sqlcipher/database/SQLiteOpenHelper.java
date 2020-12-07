package net.sqlcipher.database;

import android.content.Context;
import android.util.Log;
import java.io.File;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DefaultDatabaseErrorHandler;
import net.sqlcipher.database.SQLiteDatabase;

public abstract class SQLiteOpenHelper {
    public static final String TAG = SQLiteOpenHelper.class.getSimpleName();
    public final Context mContext;
    public SQLiteDatabase mDatabase;
    public boolean mDeferSetWriteAheadLoggingEnabled;
    public boolean mEnableWriteAheadLogging;
    public final DatabaseErrorHandler mErrorHandler;
    public final SQLiteDatabase.CursorFactory mFactory;
    public final SQLiteDatabaseHook mHook;
    public boolean mIsInitializing;
    public final String mName;
    public final int mNewVersion;

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        this(context, name, factory, version, null, new DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, SQLiteDatabaseHook hook) {
        this(context, name, factory, version, hook, new DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, SQLiteDatabaseHook hook, DatabaseErrorHandler errorHandler) {
        this.mDatabase = null;
        this.mIsInitializing = false;
        if (version < 1) {
            throw new IllegalArgumentException("Version must be >= 1, was " + version);
        } else if (errorHandler != null) {
            this.mContext = context;
            this.mName = name;
            this.mFactory = factory;
            this.mNewVersion = version;
            this.mHook = hook;
            this.mErrorHandler = errorHandler;
        } else {
            throw new IllegalArgumentException("DatabaseErrorHandler param value can't be null.");
        }
    }

    public synchronized SQLiteDatabase getWritableDatabase(String password) {
        return getWritableDatabase(password == null ? null : password.toCharArray());
    }

    public synchronized SQLiteDatabase getWritableDatabase(char[] password) {
        return getWritableDatabase(password == null ? null : SQLiteDatabase.getBytes(password));
    }

    /* JADX INFO: finally extract failed */
    public synchronized SQLiteDatabase getWritableDatabase(byte[] password) {
        SQLiteDatabase db;
        if (this.mDatabase != null && this.mDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
            return this.mDatabase;
        } else if (!this.mIsInitializing) {
            SQLiteDatabase db2 = null;
            if (this.mDatabase != null) {
                this.mDatabase.lock();
            }
            try {
                this.mIsInitializing = true;
                if (this.mName == null) {
                    db = SQLiteDatabase.create((SQLiteDatabase.CursorFactory) null, BuildConfig.FLAVOR);
                } else {
                    String path = this.mContext.getDatabasePath(this.mName).getPath();
                    File dbPathFile = new File(path);
                    if (!dbPathFile.exists()) {
                        dbPathFile.getParentFile().mkdirs();
                    }
                    db = SQLiteDatabase.openOrCreateDatabase(path, password, this.mFactory, this.mHook, this.mErrorHandler);
                }
                if (this.mDeferSetWriteAheadLoggingEnabled) {
                    this.mEnableWriteAheadLogging = db.enableWriteAheadLogging();
                }
                onConfigure(db);
                int version = db.getVersion();
                if (version != this.mNewVersion) {
                    db.beginTransaction();
                    if (version == 0) {
                        try {
                            onCreate(db);
                        } catch (Throwable th) {
                            db.endTransaction();
                            throw th;
                        }
                    } else if (version > this.mNewVersion) {
                        onDowngrade(db, version, this.mNewVersion);
                    } else {
                        onUpgrade(db, version, this.mNewVersion);
                    }
                    db.setVersion(this.mNewVersion);
                    db.setTransactionSuccessful();
                    db.endTransaction();
                }
                onOpen(db);
                this.mIsInitializing = false;
                if (1 != 0) {
                    if (this.mDatabase != null) {
                        try {
                            this.mDatabase.close();
                        } catch (Exception e2) {
                        }
                        this.mDatabase.unlock();
                    }
                    this.mDatabase = db;
                } else {
                    if (this.mDatabase != null) {
                        this.mDatabase.unlock();
                    }
                    db.close();
                }
                return db;
            } catch (Throwable th2) {
                this.mIsInitializing = false;
                if (0 != 0) {
                    if (this.mDatabase != null) {
                        try {
                            this.mDatabase.close();
                        } catch (Exception e3) {
                        }
                        this.mDatabase.unlock();
                    }
                    this.mDatabase = null;
                } else {
                    if (this.mDatabase != null) {
                        this.mDatabase.unlock();
                    }
                    if (0 != 0) {
                        db2.close();
                    }
                }
                throw th2;
            }
        } else {
            throw new IllegalStateException("getWritableDatabase called recursively");
        }
    }

    public synchronized SQLiteDatabase getReadableDatabase(String password) {
        return getReadableDatabase(password == null ? null : password.toCharArray());
    }

    public synchronized SQLiteDatabase getReadableDatabase(char[] password) {
        return getReadableDatabase(password == null ? null : SQLiteDatabase.getBytes(password));
    }

    /* JADX INFO: Multiple debug info for r0v4 net.sqlcipher.database.SQLiteDatabase: [D('e' net.sqlcipher.database.SQLiteException), D('db' net.sqlcipher.database.SQLiteDatabase)] */
    public synchronized SQLiteDatabase getReadableDatabase(byte[] password) {
        SQLiteDatabase db;
        if (this.mDatabase != null && this.mDatabase.isOpen()) {
            return this.mDatabase;
        } else if (!this.mIsInitializing) {
            try {
                return getWritableDatabase(password);
            } catch (SQLiteException e2) {
                if (this.mName != null) {
                    String str = TAG;
                    Log.e(str, "Couldn't open " + this.mName + " for writing (will try read-only):", e2);
                    db = null;
                    this.mIsInitializing = true;
                    String path = this.mContext.getDatabasePath(this.mName).getPath();
                    File databasePath = new File(path);
                    File databasesDirectory = new File(this.mContext.getDatabasePath(this.mName).getParent());
                    if (!databasesDirectory.exists()) {
                        databasesDirectory.mkdirs();
                    }
                    if (!databasePath.exists()) {
                        this.mIsInitializing = false;
                        SQLiteDatabase db2 = getWritableDatabase(password);
                        this.mIsInitializing = true;
                        db2.close();
                    }
                    SQLiteDatabase db3 = SQLiteDatabase.openDatabase(path, password, this.mFactory, 1, this.mHook, this.mErrorHandler);
                    if (db3.getVersion() == this.mNewVersion) {
                        onOpen(db3);
                        String str2 = TAG;
                        Log.w(str2, "Opened " + this.mName + " in read-only mode");
                        this.mDatabase = db3;
                        this.mIsInitializing = false;
                        if (db3 != db3) {
                            db3.close();
                        }
                        return db3;
                    }
                    throw new SQLiteException("Can't upgrade read-only database from version " + db3.getVersion() + " to " + this.mNewVersion + ": " + path);
                }
                throw e2;
            } catch (Throwable th) {
                this.mIsInitializing = false;
                if (!(0 == 0 || null == this.mDatabase)) {
                    db.close();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("getReadableDatabase called recursively");
        }
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new IllegalStateException("Closed during initialization");
        } else if (this.mDatabase != null && this.mDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public void setWriteAheadLoggingEnabled(boolean enabled) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != enabled) {
                if (this.mDatabase == null || !this.mDatabase.isOpen() || this.mDatabase.isReadOnly()) {
                    this.mDeferSetWriteAheadLoggingEnabled = enabled;
                } else {
                    if (enabled) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                    this.mEnableWriteAheadLogging = enabled;
                }
            }
        }
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        throw new SQLiteException("Can't downgrade database from version " + oldVersion + " to " + newVersion);
    }

    public void onConfigure(SQLiteDatabase db) {
    }

    public void onOpen(SQLiteDatabase db) {
    }
}
