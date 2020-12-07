package a.r;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class c0 extends b0 {
    public static Method i;
    public static boolean j;

    @Override // a.r.d0
    public void d(View v, int left, int top, int right, int bottom) {
        l();
        Method method = i;
        if (method != null) {
            try {
                method.invoke(v, Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom));
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    public final void l() {
        if (!j) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e2);
            }
            j = true;
        }
    }
}
