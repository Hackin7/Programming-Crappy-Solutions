package androidx.activity;

import a.m.d;
import a.m.e;
import a.m.g;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements e {

    /* renamed from: b  reason: collision with root package name */
    public static int f1484b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static Field f1485c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f1486d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f1487e;

    /* renamed from: a  reason: collision with root package name */
    public Activity f1488a;

    public ImmLeaksCleaner(Activity activity) {
        this.f1488a = activity;
    }

    @Override // a.m.e
    public void d(g source, d.a event) {
        if (event == d.a.ON_DESTROY) {
            if (f1484b == 0) {
                h();
            }
            if (f1484b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f1488a.getSystemService("input_method");
                try {
                    Object lock = f1485c.get(inputMethodManager);
                    if (lock != null) {
                        synchronized (lock) {
                            try {
                                View servedView = (View) f1486d.get(inputMethodManager);
                                if (servedView != null) {
                                    if (!servedView.isAttachedToWindow()) {
                                        try {
                                            f1487e.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException e2) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException e3) {
                            } catch (ClassCastException e4) {
                            }
                        }
                    }
                } catch (IllegalAccessException e5) {
                }
            }
        }
    }

    public static void h() {
        try {
            f1484b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f1486d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f1487e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f1485c = declaredField3;
            declaredField3.setAccessible(true);
            f1484b = 1;
        } catch (NoSuchFieldException e2) {
        }
    }
}
