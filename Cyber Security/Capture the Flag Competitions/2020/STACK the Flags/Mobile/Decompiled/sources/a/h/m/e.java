package a.h.m;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f946a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f947b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f948c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Field f949d = null;

    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean d(View root, KeyEvent event) {
        return s.h(root, event);
    }

    public static boolean e(a component, View root, Window.Callback callback, KeyEvent event) {
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.superDispatchKeyEvent(event);
        }
        if (callback instanceof Activity) {
            return b((Activity) callback, event);
        }
        if (callback instanceof Dialog) {
            return c((Dialog) callback, event);
        }
        if ((root == null || !s.g(root, event)) && !component.superDispatchKeyEvent(event)) {
            return false;
        }
        return true;
    }

    public static boolean a(ActionBar actionBar, KeyEvent event) {
        if (!f946a) {
            try {
                f947b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException e2) {
            }
            f946a = true;
        }
        Method method = f947b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, event)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException e3) {
            }
        }
        return false;
    }

    public static boolean b(Activity activity, KeyEvent event) {
        activity.onUserInteraction();
        Window win = activity.getWindow();
        if (win.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null && a(actionBar, event)) {
                return true;
            }
        }
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (s.g(decor, event)) {
            return true;
        }
        return event.dispatch(activity, decor != null ? decor.getKeyDispatcherState() : null, activity);
    }

    public static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!f948c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f949d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f948c = true;
        }
        Field field = f949d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException e3) {
            return null;
        }
    }

    public static boolean c(Dialog dialog, KeyEvent event) {
        DialogInterface.OnKeyListener onKeyListener = f(dialog);
        if (onKeyListener != null && onKeyListener.onKey(dialog, event.getKeyCode(), event)) {
            return true;
        }
        Window win = dialog.getWindow();
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (s.g(decor, event)) {
            return true;
        }
        return event.dispatch(dialog, decor != null ? decor.getKeyDispatcherState() : null, dialog);
    }
}
