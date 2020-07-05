package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: lf */
public final class C0651lf extends RuntimeException {

    /* renamed from: b */
    private static final Method f2821b;

    /* renamed from: a */
    public IOException f2822a;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f2821b = method;
    }

    public C0651lf(IOException iOException) {
        super(iOException);
        this.f2822a = iOException;
    }

    /* renamed from: a */
    static void m2020a(IOException iOException, IOException iOException2) {
        if (f2821b != null) {
            try {
                f2821b.invoke(iOException, new Object[]{iOException2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
