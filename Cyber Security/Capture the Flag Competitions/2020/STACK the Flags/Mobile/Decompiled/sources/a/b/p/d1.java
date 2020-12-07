package a.b.p;

import a.h.m.s;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f296a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f296a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f296a.setAccessible(true);
            }
        } catch (NoSuchMethodException e2) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean b(View view) {
        return s.v(view) == 1;
    }

    public static void a(View view, Rect inoutInsets, Rect outLocalInsets) {
        Method method = f296a;
        if (method != null) {
            try {
                method.invoke(view, inoutInsets, outLocalInsets);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (NoSuchMethodException e2) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        } catch (IllegalAccessException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        }
    }
}
