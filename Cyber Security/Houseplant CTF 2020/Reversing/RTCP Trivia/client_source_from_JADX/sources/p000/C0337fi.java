package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: fi */
final class C0337fi extends C0340fl {

    /* renamed from: a */
    private static final Class f1621a;

    /* renamed from: b */
    private static final Constructor f1622b;

    /* renamed from: c */
    private static final Method f1623c;

    /* renamed from: d */
    private static final Method f1624d;

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f1622b = constructor;
        f1621a = cls;
        f1623c = method;
        f1624d = method2;
    }

    C0337fi() {
    }

    /* renamed from: a */
    private static Typeface m1106a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1621a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1624d.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m1107a() {
        if (f1623c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f1623c != null;
    }

    /* renamed from: a */
    private static boolean m1108a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1623c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m1109b() {
        try {
            return f1622b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo1702a(Context context, C0319b bVar, Resources resources, int i) {
        C0320c[] cVarArr;
        Object b = m1109b();
        for (C0320c cVar : bVar.f1597a) {
            ByteBuffer a = C0344fm.m1138a(context, resources, cVar.f1603f);
            if (a == null || !m1108a(b, a, cVar.f1602e, cVar.f1599b, cVar.f1600c)) {
                return null;
            }
        }
        return m1106a(b);
    }

    /* renamed from: a */
    public final Typeface mo1701a(Context context, C0363b[] bVarArr, int i) {
        Object b = m1109b();
        C0256dk dkVar = new C0256dk();
        for (C0363b bVar : bVarArr) {
            Uri uri = bVar.f1670a;
            ByteBuffer byteBuffer = (ByteBuffer) dkVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0344fm.m1139a(context, uri);
                dkVar.put(uri, byteBuffer);
            }
            if (!m1108a(b, byteBuffer, bVar.f1671b, bVar.f1672c, bVar.f1673d)) {
                return null;
            }
        }
        return Typeface.create(m1106a(b), i);
    }
}
