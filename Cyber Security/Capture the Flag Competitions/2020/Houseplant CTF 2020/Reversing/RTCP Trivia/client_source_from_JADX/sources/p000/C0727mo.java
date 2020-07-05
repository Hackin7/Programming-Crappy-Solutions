package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: mo */
final class C0727mo<T> {

    /* renamed from: a */
    private final Class<?> f3120a;

    /* renamed from: b */
    private final String f3121b;

    /* renamed from: c */
    private final Class[] f3122c;

    C0727mo(Class<?> cls, String str, Class... clsArr) {
        this.f3120a = cls;
        this.f3121b = str;
        this.f3122c = clsArr;
    }

    /* renamed from: a */
    private Method m2265a(Class<?> cls) {
        Method method = null;
        if (this.f3121b != null) {
            Method a = m2266a(cls, this.f3121b, this.f3122c);
            if (a != null && this.f3120a != null && !this.f3120a.isAssignableFrom(a.getReturnType())) {
                return null;
            }
            method = a;
        }
        return method;
    }

    /* renamed from: a */
    private static Method m2266a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) != 0) {
                    return method;
                }
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
        }
        return null;
    }

    /* renamed from: c */
    private Object m2267c(T t, Object... objArr) {
        Method a = m2265a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private Object m2268d(T t, Object... objArr) {
        Method a = m2265a(t.getClass());
        if (a == null) {
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(this.f3121b);
            sb.append(" not supported for object ");
            sb.append(t);
            throw new AssertionError(sb.toString());
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            StringBuilder sb2 = new StringBuilder("Unexpectedly could not call: ");
            sb2.append(a);
            AssertionError assertionError = new AssertionError(sb2.toString());
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* renamed from: a */
    public final Object mo2558a(T t, Object... objArr) {
        try {
            return m2267c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: a */
    public final boolean mo2559a(T t) {
        return m2265a(t.getClass()) != null;
    }

    /* renamed from: b */
    public final Object mo2560b(T t, Object... objArr) {
        try {
            return m2268d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
