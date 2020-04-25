package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: fj */
public class C0338fj extends C0336fh {

    /* renamed from: a */
    protected final Class f1625a;

    /* renamed from: b */
    protected final Constructor f1626b;

    /* renamed from: c */
    protected final Method f1627c;

    /* renamed from: d */
    protected final Method f1628d;

    /* renamed from: e */
    protected final Method f1629e;

    /* renamed from: f */
    protected final Method f1630f;

    /* renamed from: g */
    protected final Method f1631g;

    public C0338fj() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method4 = cls2.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method3 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method2 = cls2.getMethod("freeze", new Class[0]);
            method5 = cls2.getMethod("abortCreation", new Class[0]);
            method = mo1705a(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f1625a = cls;
        this.f1626b = constructor;
        this.f1627c = method4;
        this.f1628d = method3;
        this.f1629e = method2;
        this.f1630f = method5;
        this.f1631g = method;
    }

    /* renamed from: a */
    private boolean m1112a() {
        if (this.f1627c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1627c != null;
    }

    /* renamed from: a */
    private boolean m1113a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1627c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m1114a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f1628d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private Object m1115b() {
        try {
            return this.f1626b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private boolean m1116b(Object obj) {
        try {
            return ((Boolean) this.f1629e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private void m1117c(Object obj) {
        try {
            this.f1630f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo1703a(Context context, Resources resources, int i, String str, int i2) {
        if (!m1112a()) {
            return super.mo1703a(context, resources, i, str, i2);
        }
        Object b = m1115b();
        if (!m1113a(context, b, str, 0, -1, -1, null)) {
            m1117c(b);
            return null;
        } else if (!m1116b(b)) {
            return null;
        } else {
            return mo1704a(b);
        }
    }

    /* renamed from: a */
    public final Typeface mo1702a(Context context, C0319b bVar, Resources resources, int i) {
        C0320c[] cVarArr;
        if (!m1112a()) {
            return super.mo1702a(context, bVar, resources, i);
        }
        Object b = m1115b();
        for (C0320c cVar : bVar.f1597a) {
            if (!m1113a(context, b, cVar.f1598a, cVar.f1602e, cVar.f1599b, cVar.f1600c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f1601d))) {
                m1117c(b);
                return null;
            }
        }
        if (!m1116b(b)) {
            return null;
        }
        return mo1704a(b);
    }

    /* renamed from: a */
    public final Typeface mo1701a(Context context, C0363b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Throwable th2;
        if (bVarArr.length <= 0) {
            return null;
        }
        if (!m1112a()) {
            C0363b a = mo1706a(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a.f1670a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a.f1672c).setItalic(a.f1673d).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r13;
                    th2 = th4;
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map a2 = C0357fw.m1175a(context, bVarArr);
            Object b = m1115b();
            boolean z = false;
            for (C0363b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) a2.get(bVar.f1670a);
                if (byteBuffer != null) {
                    if (!m1114a(b, byteBuffer, bVar.f1671b, bVar.f1672c, bVar.f1673d ? 1 : 0)) {
                        m1117c(b);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m1117c(b);
                return null;
            } else if (!m1116b(b)) {
                return null;
            } else {
                return Typeface.create(mo1704a(b), i);
            }
        }
        if (openFileDescriptor != null) {
            if (th != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th5) {
                    th.addSuppressed(th5);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1704a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1625a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1631g.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo1705a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
