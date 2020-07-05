package p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: cx */
public final class C0225cx {

    /* renamed from: a */
    private static Method f1133a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f1133a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f1133a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m738a(View view, Rect rect, Rect rect2) {
        if (f1133a != null) {
            try {
                f1133a.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m739a(View view) {
        return C0396gq.m1264b(view) == 1;
    }

    /* renamed from: b */
    public static void m740b(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            } catch (IllegalAccessException e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            }
        }
    }
}
