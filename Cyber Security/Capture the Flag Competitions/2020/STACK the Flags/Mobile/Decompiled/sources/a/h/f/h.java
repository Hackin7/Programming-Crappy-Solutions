package a.h.f;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class h extends g {
    @Override // a.h.f.g
    public Typeface h(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f831g, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.m.invoke(null, familyArray, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.h.f.g
    public Method t(Class<?> fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamily, 1).getClass(), String.class, cls, cls);
        m.setAccessible(true);
        return m;
    }
}
