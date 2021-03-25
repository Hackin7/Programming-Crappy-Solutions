package net.sqlcipher.database;

import a.q.a.a;
import a.q.a.b;

public class SupportHelper implements b {
    public final boolean clearPassphrase;
    public byte[] passphrase;
    public SQLiteOpenHelper standardHelper;

    public SupportHelper(b.a configuration, byte[] passphrase2, SQLiteDatabaseHook hook, boolean clearPassphrase2) {
        SQLiteDatabase.loadLibs(configuration.f1317a);
        this.passphrase = passphrase2;
        this.clearPassphrase = clearPassphrase2;
        throw null;
    }

    public String getDatabaseName() {
        return this.standardHelper.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.standardHelper.setWriteAheadLoggingEnabled(enabled);
    }

    public a getWritableDatabase() {
        try {
            SQLiteDatabase result = this.standardHelper.getWritableDatabase(this.passphrase);
            if (this.clearPassphrase && this.passphrase != null) {
                int i = 0;
                while (true) {
                    byte[] bArr = this.passphrase;
                    if (i >= bArr.length) {
                        break;
                    }
                    bArr[i] = 0;
                    i++;
                }
            }
            return result;
        } catch (SQLiteException ex) {
            byte[] bArr2 = this.passphrase;
            if (bArr2 != null) {
                boolean isCleared = true;
                for (byte b2 : bArr2) {
                    isCleared = isCleared && b2 == 0;
                }
                if (isCleared) {
                    throw new IllegalStateException("The passphrase appears to be cleared. This happens bydefault the first time you use the factory to open a database, so we can remove thecleartext passphrase from memory. If you close the database yourself, please use afresh SupportFactory to reopen it. If something else (e.g., Room) closed thedatabase, and you cannot control that, use SupportFactory boolean constructor option to opt out of the automatic password clearing step. See the project README for more information.", ex);
                }
            }
            throw ex;
        }
    }

    public a getReadableDatabase() {
        return getWritableDatabase();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.standardHelper.close();
    }
}
