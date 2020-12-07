package net.sqlcipher;

import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.database.CursorWindow;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.database.SQLiteAbortException;
import net.sqlcipher.database.SQLiteConstraintException;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabaseCorruptException;
import net.sqlcipher.database.SQLiteDiskIOException;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteFullException;
import net.sqlcipher.database.SQLiteProgram;
import net.sqlcipher.database.SQLiteStatement;

public class DatabaseUtils {
    public static final boolean DEBUG = false;
    public static final char[] HEX_DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final boolean LOCAL_LOGV = false;
    public static final String TAG = "DatabaseUtils";
    public static final String[] countProjection = {"count(*)"};
    public static Collator mColl = null;

    public static final void writeExceptionToParcel(Parcel reply, Exception e2) {
        int code;
        boolean logException = true;
        if (e2 instanceof FileNotFoundException) {
            code = 1;
            logException = false;
        } else if (e2 instanceof IllegalArgumentException) {
            code = 2;
        } else if (e2 instanceof UnsupportedOperationException) {
            code = 3;
        } else if (e2 instanceof SQLiteAbortException) {
            code = 4;
        } else if (e2 instanceof SQLiteConstraintException) {
            code = 5;
        } else if (e2 instanceof SQLiteDatabaseCorruptException) {
            code = 6;
        } else if (e2 instanceof SQLiteFullException) {
            code = 7;
        } else if (e2 instanceof SQLiteDiskIOException) {
            code = 8;
        } else if (e2 instanceof SQLiteException) {
            code = 9;
        } else if (e2 instanceof OperationApplicationException) {
            code = 10;
        } else {
            reply.writeException(e2);
            Log.e(TAG, "Writing exception to parcel", e2);
            return;
        }
        reply.writeInt(code);
        reply.writeString(e2.getMessage());
        if (logException) {
            Log.e(TAG, "Writing exception to parcel", e2);
        }
    }

    public static final void readExceptionFromParcel(Parcel reply) {
        int code = reply.readInt();
        if (code != 0) {
            readExceptionFromParcel(reply, reply.readString(), code);
        }
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel reply) {
        int code = reply.readInt();
        if (code != 0) {
            String msg = reply.readString();
            if (code != 1) {
                readExceptionFromParcel(reply, msg, code);
                return;
            }
            throw new FileNotFoundException(msg);
        }
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel reply) {
        int code = reply.readInt();
        if (code != 0) {
            String msg = reply.readString();
            if (code != 10) {
                readExceptionFromParcel(reply, msg, code);
                return;
            }
            throw new OperationApplicationException(msg);
        }
    }

    public static final void readExceptionFromParcel(Parcel reply, String msg, int code) {
        switch (code) {
            case 2:
                throw new IllegalArgumentException(msg);
            case 3:
                throw new UnsupportedOperationException(msg);
            case 4:
                throw new SQLiteAbortException(msg);
            case 5:
                throw new SQLiteConstraintException(msg);
            case 6:
                throw new SQLiteDatabaseCorruptException(msg);
            case 7:
                throw new SQLiteFullException(msg);
            case 8:
                throw new SQLiteDiskIOException(msg);
            case 9:
                throw new SQLiteException(msg);
            default:
                reply.readException(code, msg);
                return;
        }
    }

    public static void bindObjectToProgram(SQLiteProgram prog, int index, Object value) {
        if (value == null) {
            prog.bindNull(index);
        } else if ((value instanceof Double) || (value instanceof Float)) {
            prog.bindDouble(index, ((Number) value).doubleValue());
        } else if (value instanceof Number) {
            prog.bindLong(index, ((Number) value).longValue());
        } else if (value instanceof Boolean) {
            if (((Boolean) value).booleanValue()) {
                prog.bindLong(index, 1);
            } else {
                prog.bindLong(index, 0);
            }
        } else if (value instanceof byte[]) {
            prog.bindBlob(index, (byte[]) value);
        } else {
            prog.bindString(index, value.toString());
        }
    }

    public static int getTypeOfObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        if ((obj instanceof Long) || (obj instanceof Integer)) {
            return 1;
        }
        return 3;
    }

    public static void appendEscapedSQLString(StringBuilder sb, String sqlString) {
        sb.append('\'');
        if (sqlString.indexOf(39) != -1) {
            int length = sqlString.length();
            for (int i = 0; i < length; i++) {
                char c2 = sqlString.charAt(i);
                if (c2 == '\'') {
                    sb.append('\'');
                }
                sb.append(c2);
            }
        } else {
            sb.append(sqlString);
        }
        sb.append('\'');
    }

    public static String sqlEscapeString(String value) {
        StringBuilder escaper = new StringBuilder();
        appendEscapedSQLString(escaper, value);
        return escaper.toString();
    }

    public static final void appendValueToSql(StringBuilder sql, Object value) {
        if (value == null) {
            sql.append("NULL");
        } else if (!(value instanceof Boolean)) {
            appendEscapedSQLString(sql, value.toString());
        } else if (((Boolean) value).booleanValue()) {
            sql.append('1');
        } else {
            sql.append('0');
        }
    }

    public static String concatenateWhere(String a2, String b2) {
        if (TextUtils.isEmpty(a2)) {
            return b2;
        }
        if (TextUtils.isEmpty(b2)) {
            return a2;
        }
        return "(" + a2 + ") AND (" + b2 + ")";
    }

    public static String getCollationKey(String name) {
        byte[] arr = getCollationKeyInBytes(name);
        try {
            return new String(arr, 0, getKeyLen(arr), "ISO8859_1");
        } catch (Exception e2) {
            return BuildConfig.FLAVOR;
        }
    }

    public static String getHexCollationKey(String name) {
        byte[] arr = getCollationKeyInBytes(name);
        return new String(encodeHex(arr, HEX_DIGITS_LOWER), 0, getKeyLen(arr) * 2);
    }

    public static char[] encodeHex(byte[] data, char[] toDigits) {
        int l = data.length;
        char[] out = new char[(l << 1)];
        int j = 0;
        for (int i = 0; i < l; i++) {
            int j2 = j + 1;
            out[j] = toDigits[(data[i] & 240) >>> 4];
            j = j2 + 1;
            out[j2] = toDigits[data[i] & 15];
        }
        return out;
    }

    public static int getKeyLen(byte[] arr) {
        if (arr[arr.length - 1] != 0) {
            return arr.length;
        }
        return arr.length - 1;
    }

    public static byte[] getCollationKeyInBytes(String name) {
        if (mColl == null) {
            Collator instance = Collator.getInstance();
            mColl = instance;
            instance.setStrength(0);
        }
        return mColl.getCollationKey(name).toByteArray();
    }

    public static void dumpCursor(Cursor cursor) {
        dumpCursor(cursor, System.out);
    }

    public static void dumpCursor(Cursor cursor, PrintStream stream) {
        stream.println(">>>>> Dumping cursor " + cursor);
        if (cursor != null) {
            int startPos = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, stream);
            }
            cursor.moveToPosition(startPos);
        }
        stream.println("<<<<<");
    }

    public static void dumpCursor(Cursor cursor, StringBuilder sb) {
        sb.append(">>>>> Dumping cursor " + cursor + "\n");
        if (cursor != null) {
            int startPos = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb);
            }
            cursor.moveToPosition(startPos);
        }
        sb.append("<<<<<\n");
    }

    public static String dumpCursorToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCursor(cursor, sb);
        return sb.toString();
    }

    public static void dumpCurrentRow(Cursor cursor) {
        dumpCurrentRow(cursor, System.out);
    }

    public static void dumpCurrentRow(Cursor cursor, PrintStream stream) {
        String value;
        String[] cols = cursor.getColumnNames();
        stream.println(BuildConfig.FLAVOR + cursor.getPosition() + " {");
        int length = cols.length;
        for (int i = 0; i < length; i++) {
            try {
                value = cursor.getString(i);
            } catch (SQLiteException e2) {
                value = "<unprintable>";
            }
            stream.println("   " + cols[i] + '=' + value);
        }
        stream.println("}");
    }

    public static void dumpCurrentRow(Cursor cursor, StringBuilder sb) {
        String value;
        String[] cols = cursor.getColumnNames();
        sb.append(BuildConfig.FLAVOR + cursor.getPosition() + " {\n");
        int length = cols.length;
        for (int i = 0; i < length; i++) {
            try {
                value = cursor.getString(i);
            } catch (SQLiteException e2) {
                value = "<unprintable>";
            }
            sb.append("   " + cols[i] + '=' + value + "\n");
        }
        sb.append("}\n");
    }

    public static String dumpCurrentRowToString(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCurrentRow(cursor, sb);
        return sb.toString();
    }

    public static void cursorStringToContentValues(Cursor cursor, String field, ContentValues values) {
        cursorStringToContentValues(cursor, field, values, field);
    }

    public static void cursorStringToInsertHelper(Cursor cursor, String field, InsertHelper inserter, int index) {
        inserter.bind(index, cursor.getString(cursor.getColumnIndexOrThrow(field)));
    }

    public static void cursorStringToContentValues(Cursor cursor, String field, ContentValues values, String key) {
        values.put(key, cursor.getString(cursor.getColumnIndexOrThrow(field)));
    }

    public static void cursorIntToContentValues(Cursor cursor, String field, ContentValues values) {
        cursorIntToContentValues(cursor, field, values, field);
    }

    public static void cursorIntToContentValues(Cursor cursor, String field, ContentValues values, String key) {
        int colIndex = cursor.getColumnIndex(field);
        if (!cursor.isNull(colIndex)) {
            values.put(key, Integer.valueOf(cursor.getInt(colIndex)));
        } else {
            values.put(key, (Integer) null);
        }
    }

    public static void cursorLongToContentValues(Cursor cursor, String field, ContentValues values) {
        cursorLongToContentValues(cursor, field, values, field);
    }

    public static void cursorLongToContentValues(Cursor cursor, String field, ContentValues values, String key) {
        int colIndex = cursor.getColumnIndex(field);
        if (!cursor.isNull(colIndex)) {
            values.put(key, Long.valueOf(cursor.getLong(colIndex)));
        } else {
            values.put(key, (Long) null);
        }
    }

    public static void cursorDoubleToCursorValues(Cursor cursor, String field, ContentValues values) {
        cursorDoubleToContentValues(cursor, field, values, field);
    }

    public static void cursorDoubleToContentValues(Cursor cursor, String field, ContentValues values, String key) {
        int colIndex = cursor.getColumnIndex(field);
        if (!cursor.isNull(colIndex)) {
            values.put(key, Double.valueOf(cursor.getDouble(colIndex)));
        } else {
            values.put(key, (Double) null);
        }
    }

    public static void cursorRowToContentValues(Cursor cursor, ContentValues values) {
        AbstractWindowedCursor awc = cursor instanceof AbstractWindowedCursor ? (AbstractWindowedCursor) cursor : null;
        String[] columns = cursor.getColumnNames();
        int length = columns.length;
        for (int i = 0; i < length; i++) {
            if (awc == null || !awc.isBlob(i)) {
                values.put(columns[i], cursor.getString(i));
            } else {
                values.put(columns[i], cursor.getBlob(i));
            }
        }
    }

    public static long queryNumEntries(SQLiteDatabase db, String table) {
        Cursor cursor = db.query(table, countProjection, null, null, null, null, null);
        try {
            cursor.moveToFirst();
            return cursor.getLong(0);
        } finally {
            cursor.close();
        }
    }

    public static long longForQuery(SQLiteDatabase db, String query, String[] selectionArgs) {
        SQLiteStatement prog = db.compileStatement(query);
        try {
            return longForQuery(prog, selectionArgs);
        } finally {
            prog.close();
        }
    }

    public static long longForQuery(SQLiteStatement prog, String[] selectionArgs) {
        if (selectionArgs != null) {
            int size = selectionArgs.length;
            for (int i = 0; i < size; i++) {
                bindObjectToProgram(prog, i + 1, selectionArgs[i]);
            }
        }
        return prog.simpleQueryForLong();
    }

    public static String stringForQuery(SQLiteDatabase db, String query, String[] selectionArgs) {
        SQLiteStatement prog = db.compileStatement(query);
        try {
            return stringForQuery(prog, selectionArgs);
        } finally {
            prog.close();
        }
    }

    public static String stringForQuery(SQLiteStatement prog, String[] selectionArgs) {
        if (selectionArgs != null) {
            int size = selectionArgs.length;
            for (int i = 0; i < size; i++) {
                bindObjectToProgram(prog, i + 1, selectionArgs[i]);
            }
        }
        return prog.simpleQueryForString();
    }

    public static void cursorStringToContentValuesIfPresent(Cursor cursor, ContentValues values, String column) {
        int index = cursor.getColumnIndexOrThrow(column);
        if (!cursor.isNull(index)) {
            values.put(column, cursor.getString(index));
        }
    }

    public static void cursorLongToContentValuesIfPresent(Cursor cursor, ContentValues values, String column) {
        int index = cursor.getColumnIndexOrThrow(column);
        if (!cursor.isNull(index)) {
            values.put(column, Long.valueOf(cursor.getLong(index)));
        }
    }

    public static void cursorShortToContentValuesIfPresent(Cursor cursor, ContentValues values, String column) {
        int index = cursor.getColumnIndexOrThrow(column);
        if (!cursor.isNull(index)) {
            values.put(column, Short.valueOf(cursor.getShort(index)));
        }
    }

    public static void cursorIntToContentValuesIfPresent(Cursor cursor, ContentValues values, String column) {
        int index = cursor.getColumnIndexOrThrow(column);
        if (!cursor.isNull(index)) {
            values.put(column, Integer.valueOf(cursor.getInt(index)));
        }
    }

    public static void cursorFloatToContentValuesIfPresent(Cursor cursor, ContentValues values, String column) {
        int index = cursor.getColumnIndexOrThrow(column);
        if (!cursor.isNull(index)) {
            values.put(column, Float.valueOf(cursor.getFloat(index)));
        }
    }

    public static void cursorDoubleToContentValuesIfPresent(Cursor cursor, ContentValues values, String column) {
        int index = cursor.getColumnIndexOrThrow(column);
        if (!cursor.isNull(index)) {
            values.put(column, Double.valueOf(cursor.getDouble(index)));
        }
    }

    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        public HashMap<String, Integer> mColumns;
        public final SQLiteDatabase mDb;
        public String mInsertSQL = null;
        public SQLiteStatement mInsertStatement = null;
        public SQLiteStatement mPreparedStatement = null;
        public SQLiteStatement mReplaceStatement = null;
        public final String mTableName;

        public InsertHelper(SQLiteDatabase db, String tableName) {
            this.mDb = db;
            this.mTableName = tableName;
        }

        private void buildSQL() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("INSERT INTO ");
            sb.append(this.mTableName);
            sb.append(" (");
            StringBuilder sbv = new StringBuilder(128);
            sbv.append("VALUES (");
            int i = 1;
            Cursor cur = null;
            try {
                SQLiteDatabase sQLiteDatabase = this.mDb;
                Cursor cur2 = sQLiteDatabase.rawQuery("PRAGMA table_info(" + this.mTableName + ")", (String[]) null);
                this.mColumns = new HashMap<>(cur2.getCount());
                while (cur2.moveToNext()) {
                    String columnName = cur2.getString(1);
                    String defaultValue = cur2.getString(4);
                    this.mColumns.put(columnName, Integer.valueOf(i));
                    sb.append("'");
                    sb.append(columnName);
                    sb.append("'");
                    if (defaultValue == null) {
                        sbv.append("?");
                    } else {
                        sbv.append("COALESCE(?, ");
                        sbv.append(defaultValue);
                        sbv.append(")");
                    }
                    String str = ", ";
                    sb.append(i == cur2.getCount() ? ") " : str);
                    if (i == cur2.getCount()) {
                        str = ");";
                    }
                    sbv.append(str);
                    i++;
                }
                cur2.close();
                sb.append((CharSequence) sbv);
                this.mInsertSQL = sb.toString();
            } catch (Throwable th) {
                if (0 != 0) {
                    cur.close();
                }
                throw th;
            }
        }

        private SQLiteStatement getStatement(boolean allowReplace) {
            if (allowReplace) {
                if (this.mReplaceStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    this.mReplaceStatement = this.mDb.compileStatement("INSERT OR REPLACE" + this.mInsertSQL.substring(6));
                }
                return this.mReplaceStatement;
            }
            if (this.mInsertStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
            }
            return this.mInsertStatement;
        }

        private synchronized long insertInternal(ContentValues values, boolean allowReplace) {
            SQLiteStatement stmt;
            try {
                stmt = getStatement(allowReplace);
                stmt.clearBindings();
                for (Map.Entry<String, Object> e2 : values.valueSet()) {
                    DatabaseUtils.bindObjectToProgram(stmt, getColumnIndex(e2.getKey()), e2.getValue());
                }
            } catch (SQLException e3) {
                Log.e(DatabaseUtils.TAG, "Error inserting " + values + " into table  " + this.mTableName, e3);
                return -1;
            }
            return stmt.executeInsert();
        }

        public int getColumnIndex(String key) {
            getStatement(false);
            Integer index = this.mColumns.get(key);
            if (index != null) {
                return index.intValue();
            }
            throw new IllegalArgumentException("column '" + key + "' is invalid");
        }

        public void bind(int index, double value) {
            this.mPreparedStatement.bindDouble(index, value);
        }

        public void bind(int index, float value) {
            this.mPreparedStatement.bindDouble(index, (double) value);
        }

        public void bind(int index, long value) {
            this.mPreparedStatement.bindLong(index, value);
        }

        public void bind(int index, int value) {
            this.mPreparedStatement.bindLong(index, (long) value);
        }

        public void bind(int index, boolean value) {
            this.mPreparedStatement.bindLong(index, value ? 1 : 0);
        }

        public void bindNull(int index) {
            this.mPreparedStatement.bindNull(index);
        }

        public void bind(int index, byte[] value) {
            if (value == null) {
                this.mPreparedStatement.bindNull(index);
            } else {
                this.mPreparedStatement.bindBlob(index, value);
            }
        }

        public void bind(int index, String value) {
            if (value == null) {
                this.mPreparedStatement.bindNull(index);
            } else {
                this.mPreparedStatement.bindString(index, value);
            }
        }

        public long insert(ContentValues values) {
            return insertInternal(values, false);
        }

        public long execute() {
            SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (sQLiteStatement != null) {
                try {
                    return sQLiteStatement.executeInsert();
                } catch (SQLException e2) {
                    Log.e(DatabaseUtils.TAG, "Error executing InsertHelper with table " + this.mTableName, e2);
                    return -1;
                } finally {
                    this.mPreparedStatement = null;
                }
            } else {
                throw new IllegalStateException("you must prepare this inserter before calling execute");
            }
        }

        public void prepareForInsert() {
            SQLiteStatement statement = getStatement(false);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public void prepareForReplace() {
            SQLiteStatement statement = getStatement(true);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public long replace(ContentValues values) {
            return insertInternal(values, true);
        }

        public void close() {
            SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            SQLiteStatement sQLiteStatement2 = this.mReplaceStatement;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }
    }

    public static void cursorFillWindow(Cursor cursor, int position, CursorWindow window) {
        boolean success;
        if (position >= 0 && position < cursor.getCount()) {
            int oldPos = cursor.getPosition();
            int numColumns = cursor.getColumnCount();
            window.clear();
            window.setStartPosition(position);
            window.setNumColumns(numColumns);
            if (cursor.moveToPosition(position)) {
                while (window.allocRow()) {
                    int i = 0;
                    while (true) {
                        if (i >= numColumns) {
                            break;
                        }
                        int type = cursor.getType(i);
                        if (type == 0) {
                            success = window.putNull(position, i);
                        } else if (type == 1) {
                            success = window.putLong(cursor.getLong(i), position, i);
                        } else if (type == 2) {
                            success = window.putDouble(cursor.getDouble(i), position, i);
                        } else if (type != 4) {
                            String value = cursor.getString(i);
                            if (value != null) {
                                success = window.putString(value, position, i);
                            } else {
                                success = window.putNull(position, i);
                            }
                        } else {
                            byte[] value2 = cursor.getBlob(i);
                            if (value2 != null) {
                                success = window.putBlob(value2, position, i);
                            } else {
                                success = window.putNull(position, i);
                            }
                        }
                        if (!success) {
                            window.freeLastRow();
                            break;
                        }
                        i++;
                    }
                    position++;
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
            }
            cursor.moveToPosition(oldPos);
        }
    }
}
