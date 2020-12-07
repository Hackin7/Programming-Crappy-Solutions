package a.r;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class b0 extends a0 {

    /* renamed from: e  reason: collision with root package name */
    public static Method f1322e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1323f;

    /* renamed from: g  reason: collision with root package name */
    public static Method f1324g;
    public static boolean h;

    @Override // a.r.d0
    public void f(View view, Matrix matrix) {
        j();
        Method method = f1322e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @Override // a.r.d0
    public void g(View view, Matrix matrix) {
        k();
        Method method = f1324g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public final void j() {
        if (!f1323f) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f1322e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e2);
            }
            f1323f = true;
        }
    }

    public final void k() {
        if (!h) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f1324g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e2);
            }
            h = true;
        }
    }
}
