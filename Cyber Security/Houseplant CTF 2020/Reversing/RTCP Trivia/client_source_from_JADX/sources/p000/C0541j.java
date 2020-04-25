package p000;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: j */
final class C0541j {

    /* renamed from: a */
    static Field f2229a;

    /* renamed from: b */
    static boolean f2230b;

    /* renamed from: c */
    static Field f2231c;

    /* renamed from: d */
    static boolean f2232d;

    /* renamed from: e */
    private static Class f2233e;

    /* renamed from: f */
    private static boolean f2234f;

    /* renamed from: g */
    private static Field f2235g;

    /* renamed from: h */
    private static boolean f2236h;

    /* renamed from: a */
    static void m1710a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f2234f) {
            try {
                f2233e = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2234f = true;
        }
        if (f2233e != null) {
            if (!f2236h) {
                try {
                    Field declaredField = f2233e.getDeclaredField("mUnthemedEntries");
                    f2235g = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f2236h = true;
            }
            if (f2235g != null) {
                try {
                    longSparseArray = (LongSparseArray) f2235g.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
