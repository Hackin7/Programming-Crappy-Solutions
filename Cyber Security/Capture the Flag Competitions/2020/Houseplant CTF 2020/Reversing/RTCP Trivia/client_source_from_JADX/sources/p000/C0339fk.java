package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: fk */
public final class C0339fk extends C0338fj {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Typeface mo1704a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1625a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1631g.invoke(null, new Object[]{newInstance, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Method mo1705a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
