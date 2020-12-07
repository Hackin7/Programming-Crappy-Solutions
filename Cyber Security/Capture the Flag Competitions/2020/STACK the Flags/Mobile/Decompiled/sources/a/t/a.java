package a.t;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final a.e.a<String, Method> f1472a;

    /* renamed from: b  reason: collision with root package name */
    public final a.e.a<String, Method> f1473b;

    /* renamed from: c  reason: collision with root package name */
    public final a.e.a<String, Class> f1474c;

    public abstract void A(byte[] bArr);

    public abstract void C(CharSequence charSequence);

    public abstract void E(int i);

    public abstract void G(Parcelable parcelable);

    public abstract void I(String str);

    public abstract void a();

    public abstract a b();

    public abstract boolean g();

    public abstract byte[] i();

    public abstract CharSequence k();

    public abstract boolean m(int i);

    public abstract int o();

    public abstract <T extends Parcelable> T q();

    public abstract String s();

    public abstract void w(int i);

    public abstract void y(boolean z);

    public a(a.e.a<String, Method> aVar, a.e.a<String, Method> aVar2, a.e.a<String, Class> aVar3) {
        this.f1472a = aVar;
        this.f1473b = aVar2;
        this.f1474c = aVar3;
    }

    public boolean f() {
        return false;
    }

    public void x() {
    }

    public void z(boolean val, int fieldId) {
        w(fieldId);
        y(val);
    }

    public void B(byte[] b2, int fieldId) {
        w(fieldId);
        A(b2);
    }

    public void D(CharSequence val, int fieldId) {
        w(fieldId);
        C(val);
    }

    public void F(int val, int fieldId) {
        w(fieldId);
        E(val);
    }

    public void J(String val, int fieldId) {
        w(fieldId);
        I(val);
    }

    public void H(Parcelable p, int fieldId) {
        w(fieldId);
        G(p);
    }

    public boolean h(boolean def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return g();
    }

    public int p(int def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return o();
    }

    public String t(String def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return s();
    }

    public byte[] j(byte[] def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return i();
    }

    public <T extends Parcelable> T r(T def, int fieldId) {
        return !m(fieldId) ? def : (T) q();
    }

    public CharSequence l(CharSequence def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return k();
    }

    public void M(c p, int fieldId) {
        w(fieldId);
        L(p);
    }

    public void L(c p) {
        if (p == null) {
            I(null);
            return;
        }
        N(p);
        a subParcel = b();
        K(p, subParcel);
        subParcel.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.t.a */
    /* JADX WARN: Multi-variable type inference failed */
    public final void N(c p) {
        try {
            I(c(p.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(p.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public <T extends c> T v(T def, int fieldId) {
        return !m(fieldId) ? def : (T) u();
    }

    public <T extends c> T u() {
        String name = s();
        if (name == null) {
            return null;
        }
        return (T) n(name, b());
    }

    public <T extends c> T n(String parcelCls, a versionedParcel) {
        try {
            return (T) ((c) d(parcelCls).invoke(null, versionedParcel));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public <T extends c> void K(T val, a versionedParcel) {
        try {
            e(val.getClass()).invoke(null, val, versionedParcel);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public final Method d(String parcelCls) {
        Method m = this.f1472a.get(parcelCls);
        if (m != null) {
            return m;
        }
        System.currentTimeMillis();
        Method m2 = Class.forName(parcelCls, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f1472a.put(parcelCls, m2);
        return m2;
    }

    public final Method e(Class baseCls) {
        Method m = this.f1473b.get(baseCls.getName());
        if (m != null) {
            return m;
        }
        Class cls = c(baseCls);
        System.currentTimeMillis();
        Method m2 = cls.getDeclaredMethod("write", baseCls, a.class);
        this.f1473b.put(baseCls.getName(), m2);
        return m2;
    }

    public final Class c(Class<? extends c> cls) {
        Class ret = this.f1474c.get(cls.getName());
        if (ret != null) {
            return ret;
        }
        Class ret2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f1474c.put(cls.getName(), ret2);
        return ret2;
    }
}
