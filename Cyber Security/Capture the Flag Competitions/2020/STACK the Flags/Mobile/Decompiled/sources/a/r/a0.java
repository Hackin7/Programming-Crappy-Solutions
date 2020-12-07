package a.r;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a0 extends d0 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1318a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1319b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f1320c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1321d;

    @Override // a.r.d0
    public void e(View view, float alpha) {
        i();
        Method method = f1318a;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(alpha));
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        } else {
            view.setAlpha(alpha);
        }
    }

    @Override // a.r.d0
    public float b(View view) {
        h();
        Method method = f1320c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.b(view);
    }

    @Override // a.r.d0
    public void c(View view) {
    }

    @Override // a.r.d0
    public void a(View view) {
    }

    public final void i() {
        if (!f1319b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f1318a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e2);
            }
            f1319b = true;
        }
    }

    public final void h() {
        if (!f1321d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f1320c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e2);
            }
            f1321d = true;
        }
    }
}
