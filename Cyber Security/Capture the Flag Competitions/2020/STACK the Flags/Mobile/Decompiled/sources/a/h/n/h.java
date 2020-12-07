package a.h.n;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1000a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1001b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f1002c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1003d;

    public static void c(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
        popup.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    public static void a(PopupWindow popupWindow, boolean overlapAnchor) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(overlapAnchor);
            return;
        }
        if (!f1003d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f1002c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            f1003d = true;
        }
        Field field = f1002c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(overlapAnchor));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int layoutType) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(layoutType);
            return;
        }
        if (!f1001b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f1000a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e2) {
            }
            f1001b = true;
        }
        Method method = f1000a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(layoutType));
            } catch (Exception e3) {
            }
        }
    }
}
