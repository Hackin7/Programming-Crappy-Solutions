package net.sqlcipher.database;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import net.sqlcipher.Cursor;

public final class SqliteWrapper {
    public static final String SQLITE_EXCEPTION_DETAIL_MESSAGE = "unable to open database file";
    public static final String TAG = "SqliteWrapper";

    public static boolean isLowMemory(SQLiteException e2) {
        return e2.getMessage().equals(SQLITE_EXCEPTION_DETAIL_MESSAGE);
    }

    public static void checkSQLiteException(Context context, SQLiteException e2) {
        if (isLowMemory(e2)) {
            Toast.makeText(context, e2.getMessage(), 0).show();
            return;
        }
        throw e2;
    }

    public static Cursor query(Context context, ContentResolver resolver, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        try {
            return (Cursor) resolver.query(uri, projection, selection, selectionArgs, sortOrder);
        } catch (SQLiteException e2) {
            Log.e(TAG, "Catch a SQLiteException when query: ", e2);
            checkSQLiteException(context, e2);
            return null;
        }
    }

    public static boolean requery(Context context, android.database.Cursor cursor) {
        try {
            return cursor.requery();
        } catch (SQLiteException e2) {
            Log.e(TAG, "Catch a SQLiteException when requery: ", e2);
            checkSQLiteException(context, e2);
            return false;
        }
    }

    public static int update(Context context, ContentResolver resolver, Uri uri, ContentValues values, String where, String[] selectionArgs) {
        try {
            return resolver.update(uri, values, where, selectionArgs);
        } catch (SQLiteException e2) {
            Log.e(TAG, "Catch a SQLiteException when update: ", e2);
            checkSQLiteException(context, e2);
            return -1;
        }
    }

    public static int delete(Context context, ContentResolver resolver, Uri uri, String where, String[] selectionArgs) {
        try {
            return resolver.delete(uri, where, selectionArgs);
        } catch (SQLiteException e2) {
            Log.e(TAG, "Catch a SQLiteException when delete: ", e2);
            checkSQLiteException(context, e2);
            return -1;
        }
    }

    public static Uri insert(Context context, ContentResolver resolver, Uri uri, ContentValues values) {
        try {
            return resolver.insert(uri, values);
        } catch (SQLiteException e2) {
            Log.e(TAG, "Catch a SQLiteException when insert: ", e2);
            checkSQLiteException(context, e2);
            return null;
        }
    }
}
