package f.a.a.a.a.c;

import android.content.Context;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.Cursor;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static a f2866a;

    public a(Context context) {
        super(context, "UserAccounts.db", null, 1);
    }

    public static synchronized a c(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f2866a == null) {
                f2866a = new a(context);
            }
            aVar = f2866a;
        }
        return aVar;
    }

    @Override // net.sqlcipher.database.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Users(username TEXT PRIMARY KEY, password TEXT);");
    }

    @Override // net.sqlcipher.database.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    public void a(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("INSERT INTO Users VALUES ('user', 'My_P@s5w0Rd_iS-L34k3d');");
    }

    public String e(String username, String password, SQLiteDatabase sqLiteDatabase) {
        String password2 = password.toUpperCase();
        String ret = "none";
        try {
            Cursor cursor = sqLiteDatabase.rawQuery(d("SELECT * FROM Users WHERE username= '" + username + "' AND " + "password" + " = '" + password2 + "';"), (String[]) null);
            if (cursor == null || !cursor.moveToFirst() || cursor.getColumnCount() <= 0) {
                cursor.close();
                sqLiteDatabase.close();
                return ret;
            }
            return BuildConfig.FLAVOR + cursor.getString(1);
        } catch (Exception e2) {
            ret = "Not a valid query!";
        }
    }

    public boolean b(String user, SQLiteDatabase db) {
        Cursor cursor = db.rawQuery("SELECT * FROM Users WHERE username= '" + user + "';", (String[]) null);
        if (cursor == null || !cursor.moveToFirst()) {
            return false;
        }
        return true;
    }

    public final String d(String query) {
        query.replaceAll("DROP", " ");
        query.replaceAll("DELETE", " ");
        query.replaceAll("INSERT", " ");
        return query;
    }
}
