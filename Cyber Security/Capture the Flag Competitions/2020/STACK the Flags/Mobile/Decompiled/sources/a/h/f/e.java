package a.h.f;

import a.h.e.c.c;
import a.h.j.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e extends j {

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f822b;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f823c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f824d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f825e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f826f = false;

    public static void j() {
        Method addFontMethod;
        Constructor<?> fontFamilyCtor;
        Class<?> fontFamilyClass;
        Method createFromFamiliesWithDefaultMethod;
        if (!f826f) {
            f826f = true;
            try {
                fontFamilyClass = Class.forName("android.graphics.FontFamily");
                fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
                addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamilyClass, 1).getClass());
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                fontFamilyClass = null;
                fontFamilyCtor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
            }
            f823c = fontFamilyCtor;
            f822b = fontFamilyClass;
            f824d = addFontMethod;
            f825e = createFromFamiliesWithDefaultMethod;
        }
    }

    public final File i(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return new File(path);
            }
            return null;
        } catch (ErrnoException e2) {
            return null;
        }
    }

    public static Object k() {
        j();
        try {
            return f823c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Typeface h(Object family) {
        j();
        try {
            Object familyArray = Array.newInstance(f822b, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f825e.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean g(Object family, String name, int weight, boolean style) {
        j();
        try {
            return ((Boolean) f824d.invoke(family, name, Integer.valueOf(weight), Boolean.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.h.f.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fonts, int style) {
        if (fonts.length < 1) {
            return null;
        }
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
                File file = i(pfd);
                if (file != null) {
                    if (file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        pfd.close();
                        return createFromFile;
                    }
                }
                FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());
                try {
                    Typeface c2 = super.c(context, fis);
                    fis.close();
                    pfd.close();
                    return c2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (IOException e2) {
            return null;
        }
        throw th;
        throw th;
    }

    @Override // a.h.f.j
    public Typeface a(Context context, c.b entry, Resources resources, int style) {
        Object family = k();
        c.C0016c[] a2 = entry.a();
        for (c.C0016c e2 : a2) {
            File tmpFile = k.e(context);
            if (tmpFile == null) {
                return null;
            }
            try {
                if (!k.c(tmpFile, resources, e2.b())) {
                    tmpFile.delete();
                    return null;
                } else if (!g(family, tmpFile.getPath(), e2.e(), e2.f())) {
                    return null;
                } else {
                    tmpFile.delete();
                }
            } catch (RuntimeException e3) {
                return null;
            } finally {
                tmpFile.delete();
            }
        }
        return h(family);
    }
}
