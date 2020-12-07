package a.r;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1410a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1411b;

    public static void b(ViewGroup group, boolean suppress) {
        a();
        Method method = f1410a;
        if (method != null) {
            try {
                method.invoke(group, Boolean.valueOf(suppress));
            } catch (IllegalAccessException e2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e2);
            } catch (InvocationTargetException e3) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e3);
            }
        }
    }

    public static void a() {
        if (!f1411b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f1410a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e2);
            }
            f1411b = true;
        }
    }
}
