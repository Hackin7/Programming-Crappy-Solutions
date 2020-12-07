package f.a.a.a.a.c;

import android.content.Context;
import c.a.a.a;
import net.sqlcipher.Cursor;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

public class b extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static b f2867a;

    static {
        a.a(-3412964585400L);
        a.a(-3503158898616L);
        a.a(-3528928702392L);
        a.a(-3563288440760L);
        a.a(-3580468309944L);
        a.a(-3619123015608L);
    }

    public b(Context context) {
        super(context, a.a(-2137359298488L), null, 1);
    }

    public static synchronized b c(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f2867a == null) {
                f2867a = new b(context);
            }
            bVar = f2867a;
        }
        return bVar;
    }

    public boolean b(String user, SQLiteDatabase db) {
        Cursor cursor = db.rawQuery(a.a(-2227553611704L) + user + a.a(-2390762368952L), (String[]) null);
        if (cursor == null || !cursor.moveToFirst()) {
            return false;
        }
        return true;
    }

    public void a(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(a.a(-2403647270840L));
    }

    public boolean d(String id, SQLiteDatabase sqLiteDatabase) {
        Boolean returnValue = false;
        try {
            Cursor cursor = sqLiteDatabase.rawQuery(a.a(-2712884916152L) + id + a.a(-2876093673400L), (String[]) null);
            if (cursor != null && cursor.getCount() > 0) {
                returnValue = true;
            }
            cursor.close();
        } catch (Exception e2) {
            returnValue = false;
        }
        sqLiteDatabase.close();
        return returnValue.booleanValue();
    }

    @Override // net.sqlcipher.database.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(a.a(-2893273542584L));
        sqLiteDatabase.execSQL(a.a(-3219691057080L));
    }

    @Override // net.sqlcipher.database.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
