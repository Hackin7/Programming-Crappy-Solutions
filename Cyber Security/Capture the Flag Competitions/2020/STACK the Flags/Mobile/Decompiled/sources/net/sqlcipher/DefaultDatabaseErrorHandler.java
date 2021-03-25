package net.sqlcipher;

import android.util.Log;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    public final String TAG = getClass().getSimpleName();

    @Override // net.sqlcipher.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase dbObj) {
        String str = this.TAG;
        Log.e(str, "Corruption reported by sqlite on database, deleting: " + dbObj.getPath());
        if (dbObj.isOpen()) {
            Log.e(this.TAG, "Database object for corrupted database is already open, closing");
            try {
                dbObj.close();
            } catch (Exception e2) {
                Log.e(this.TAG, "Exception closing Database object for corrupted database, ignored", e2);
            }
        }
        deleteDatabaseFile(dbObj.getPath());
    }

    private void deleteDatabaseFile(String fileName) {
        if (!fileName.equalsIgnoreCase(SQLiteDatabase.MEMORY) && fileName.trim().length() != 0) {
            String str = this.TAG;
            Log.e(str, "deleting the database file: " + fileName);
            try {
                new File(fileName).delete();
            } catch (Exception e2) {
                String str2 = this.TAG;
                Log.w(str2, "delete failed: " + e2.getMessage());
            }
        }
    }
}
