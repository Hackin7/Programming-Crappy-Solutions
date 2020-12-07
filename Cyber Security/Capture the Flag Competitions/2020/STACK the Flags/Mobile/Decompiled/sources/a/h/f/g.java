package a.h.f;

import a.h.e.c.c;
import a.h.j.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f831g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public g() {
        Method abortCreation;
        Method freeze;
        Method addFontFromBuffer;
        Method addFontFromAssetManager;
        Method addFontFromAssetManager2;
        Constructor<?> fontFamilyCtor;
        Class<?> fontFamily;
        try {
            fontFamily = u();
            fontFamilyCtor = v(fontFamily);
            addFontFromAssetManager2 = r(fontFamily);
            addFontFromAssetManager = s(fontFamily);
            addFontFromBuffer = w(fontFamily);
            freeze = q(fontFamily);
            abortCreation = t(fontFamily);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            fontFamily = null;
            fontFamilyCtor = null;
            addFontFromAssetManager2 = null;
            addFontFromAssetManager = null;
            addFontFromBuffer = null;
            freeze = null;
            abortCreation = null;
        }
        this.f831g = fontFamily;
        this.h = fontFamilyCtor;
        this.i = addFontFromAssetManager2;
        this.j = addFontFromAssetManager;
        this.k = addFontFromBuffer;
        this.l = freeze;
        this.m = abortCreation;
    }

    public final boolean p() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    private Object k() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            return null;
        }
    }

    public final boolean m(Context context, Object family, String fileName, int ttcIndex, int weight, int style, FontVariationAxis[] axes) {
        try {
            return ((Boolean) this.i.invoke(family, context.getAssets(), fileName, 0, false, Integer.valueOf(ttcIndex), Integer.valueOf(weight), Integer.valueOf(style), axes)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    public final boolean n(Object family, ByteBuffer buffer, int ttcIndex, int weight, int style) {
        try {
            return ((Boolean) this.j.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Integer.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    public Typeface h(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f831g, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.m.invoke(null, familyArray, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return null;
        }
    }

    public final boolean o(Object family) {
        try {
            return ((Boolean) this.k.invoke(family, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    public final void l(Object family) {
        try {
            this.l.invoke(family, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
        }
    }

    @Override // a.h.f.e, a.h.f.j
    public Typeface a(Context context, c.b entry, Resources resources, int style) {
        if (!p()) {
            return super.a(context, entry, resources, style);
        }
        Object fontFamily = k();
        if (fontFamily == null) {
            return null;
        }
        c.C0016c[] a2 = entry.a();
        for (c.C0016c fontFile : a2) {
            if (!m(context, fontFamily, fontFile.a(), fontFile.c(), fontFile.e(), fontFile.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFile.d()))) {
                l(fontFamily);
                return null;
            }
        }
        if (!o(fontFamily)) {
            return null;
        }
        return h(fontFamily);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00a9 */
    @Override // a.h.f.e, a.h.f.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fonts, int style) {
        Typeface typeface;
        int i2;
        if (fonts.length < 1) {
            return null;
        }
        if (!p()) {
            b.f bestFont = f(fonts, style);
            try {
                ParcelFileDescriptor pfd = context.getContentResolver().openFileDescriptor(bestFont.c(), "r", cancellationSignal);
                if (pfd == null) {
                    if (pfd != null) {
                        pfd.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(pfd.getFileDescriptor()).setWeight(bestFont.d()).setItalic(bestFont.e()).build();
                    pfd.close();
                    return build;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (IOException e2) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> uriBuffer = b.i(context, fonts, cancellationSignal);
            Object fontFamily = k();
            if (fontFamily == null) {
                return null;
            }
            int length = fonts.length;
            boolean atLeastOneFont = false;
            int i3 = 0;
            while (i3 < length) {
                b.f font = fonts[i3];
                ByteBuffer fontBuffer = uriBuffer.get(font.c());
                if (fontBuffer == null) {
                    i2 = i3;
                } else {
                    i2 = i3;
                    if (!n(fontFamily, fontBuffer, font.b(), font.d(), font.e() ? 1 : 0)) {
                        l(fontFamily);
                        return null;
                    }
                    atLeastOneFont = true;
                }
                i3 = i2 + 1;
                atLeastOneFont = atLeastOneFont;
            }
            if (!atLeastOneFont) {
                l(fontFamily);
                return null;
            } else if (o(fontFamily) && (typeface = h(fontFamily)) != null) {
                return Typeface.create(typeface, style);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // a.h.f.j
    public Typeface d(Context context, Resources resources, int id, String path, int style) {
        if (!p()) {
            return super.d(context, resources, id, path, style);
        }
        Object fontFamily = k();
        if (fontFamily == null) {
            return null;
        }
        if (!m(context, fontFamily, path, 0, -1, -1, null)) {
            l(fontFamily);
            return null;
        } else if (!o(fontFamily)) {
            return null;
        } else {
            return h(fontFamily);
        }
    }

    public Class<?> u() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> v(Class<?> fontFamily) {
        return fontFamily.getConstructor(new Class[0]);
    }

    public Method r(Class<?> fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls, cls, cls, FontVariationAxis[].class);
    }

    public Method s(Class<?> fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromBuffer", ByteBuffer.class, cls, FontVariationAxis[].class, cls, cls);
    }

    public Method w(Class<?> fontFamily) {
        return fontFamily.getMethod("freeze", new Class[0]);
    }

    public Method q(Class<?> fontFamily) {
        return fontFamily.getMethod("abortCreation", new Class[0]);
    }

    public Method t(Class<?> fontFamily) {
        Class cls = Integer.TYPE;
        Method m2 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamily, 1).getClass(), cls, cls);
        m2.setAccessible(true);
        return m2;
    }
}
