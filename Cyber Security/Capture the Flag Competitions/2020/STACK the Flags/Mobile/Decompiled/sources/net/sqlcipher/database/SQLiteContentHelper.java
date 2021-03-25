package net.sqlcipher.database;

import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class SQLiteContentHelper {
    public static AssetFileDescriptor getBlobColumnAsAssetFile(SQLiteDatabase db, String sql, String[] selectionArgs) {
        ParcelFileDescriptor fd = null;
        try {
            MemoryFile file = simpleQueryForBlobMemoryFile(db, sql, selectionArgs);
            if (file != null) {
                try {
                    Method m = file.getClass().getDeclaredMethod("getParcelFileDescriptor", new Class[0]);
                    m.setAccessible(true);
                    fd = (ParcelFileDescriptor) m.invoke(file, new Object[0]);
                } catch (Exception e2) {
                    Log.i("SQLiteContentHelper", "SQLiteCursor.java: " + e2);
                }
                return new AssetFileDescriptor(fd, 0, (long) file.length());
            }
            throw new FileNotFoundException("No results.");
        } catch (IOException ex) {
            throw new FileNotFoundException(ex.toString());
        }
    }

    public static MemoryFile simpleQueryForBlobMemoryFile(SQLiteDatabase db, String sql, String[] selectionArgs) {
        Cursor cursor = db.rawQuery(sql, selectionArgs);
        if (cursor == null) {
            return null;
        }
        try {
            if (!cursor.moveToFirst()) {
                return null;
            }
            byte[] bytes = cursor.getBlob(0);
            if (bytes == null) {
                cursor.close();
                return null;
            }
            MemoryFile file = new MemoryFile(null, bytes.length);
            file.writeBytes(bytes, 0, 0, bytes.length);
            cursor.close();
            return file;
        } finally {
            cursor.close();
        }
    }
}
