package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: gg */
public final class C0385gg {

    /* renamed from: a */
    private static boolean f1721a = false;

    /* renamed from: b */
    private static Method f1722b = null;

    /* renamed from: c */
    private static boolean f1723c = false;

    /* renamed from: d */
    private static Field f1724d;

    /* renamed from: gg$a */
    public interface C0386a {
        /* renamed from: a */
        boolean mo1687a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static OnKeyListener m1232a(Dialog dialog) {
        if (!f1723c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f1724d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1723c = true;
        }
        if (f1724d != null) {
            try {
                return (OnKeyListener) f1724d.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m1233a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f1721a) {
            try {
                f1722b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f1721a = true;
        }
        if (f1722b != null) {
            try {
                return ((Boolean) f1722b.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m1234a(View view, KeyEvent keyEvent) {
        return C0396gq.m1263a(view, keyEvent);
    }

    /* renamed from: a */
    public static boolean m1235a(C0386a aVar, View view, Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.mo1687a(keyEvent);
        }
        DispatcherState dispatcherState = null;
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null && m1233a(actionBar, keyEvent)) {
                    return true;
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C0396gq.m1265b(decorView, keyEvent)) {
                return true;
            }
            if (decorView != null) {
                dispatcherState = decorView.getKeyDispatcherState();
            }
            return keyEvent.dispatch(activity, dispatcherState, activity);
        } else if (!(callback instanceof Dialog)) {
            return (view != null && C0396gq.m1265b(view, keyEvent)) || aVar.mo1687a(keyEvent);
        } else {
            Dialog dialog = (Dialog) callback;
            OnKeyListener a = m1232a(dialog);
            if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            if (C0396gq.m1265b(decorView2, keyEvent)) {
                return true;
            }
            if (decorView2 != null) {
                dispatcherState = decorView2.getKeyDispatcherState();
            }
            return keyEvent.dispatch(dialog, dispatcherState, dialog);
        }
    }
}
