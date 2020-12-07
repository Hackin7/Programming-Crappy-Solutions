package a.h.f;

import a.e.g;
import a.h.e.c.c;
import a.h.j.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

public class f extends j {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f827b;

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor<?> f828c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f829d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f830e;

    static {
        Method addFontMethod;
        Constructor<?> fontFamilyCtor;
        Method createFromFamiliesWithDefaultMethod;
        Class<?> fontFamilyClass;
        try {
            fontFamilyClass = Class.forName("android.graphics.FontFamily");
            fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
            addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamilyClass, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            fontFamilyCtor = null;
            addFontMethod = null;
            fontFamilyClass = null;
            createFromFamiliesWithDefaultMethod = null;
        }
        f828c = fontFamilyCtor;
        f827b = fontFamilyClass;
        f829d = addFontMethod;
        f830e = createFromFamiliesWithDefaultMethod;
    }

    public static boolean i() {
        if (f829d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f829d != null;
    }

    public static Object j() {
        try {
            return f828c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            return null;
        }
    }

    public static boolean g(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        try {
            return ((Boolean) f829d.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    public static Typeface h(Object family) {
        try {
            Object familyArray = Array.newInstance(f827b, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f830e.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return null;
        }
    }

    @Override // a.h.f.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fonts, int style) {
        Object family = j();
        if (family == null) {
            return null;
        }
        SimpleArrayMap<Uri, ByteBuffer> bufferCache = new g<>();
        for (b.f font : fonts) {
            Uri uri = font.c();
            ByteBuffer buffer = (ByteBuffer) bufferCache.get(uri);
            if (buffer == null) {
                buffer = k.f(context, cancellationSignal, uri);
                bufferCache.put(uri, buffer);
            }
            if (buffer == null || !g(family, buffer, font.b(), font.d(), font.e())) {
                return null;
            }
        }
        Typeface typeface = h(family);
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, style);
    }

    @Override // a.h.f.j
    public Typeface a(Context context, c.b entry, Resources resources, int style) {
        Object family = j();
        if (family == null) {
            return null;
        }
        c.C0016c[] a2 = entry.a();
        for (c.C0016c e2 : a2) {
            ByteBuffer buffer = k.b(context, resources, e2.b());
            if (buffer == null || !g(family, buffer, e2.c(), e2.e(), e2.f())) {
                return null;
            }
        }
        return h(family);
    }
}
