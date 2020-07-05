package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: gr */
public final class C0400gr {

    /* renamed from: a */
    private static Method f1745a;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f1745a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static int m1283a(ViewConfiguration viewConfiguration) {
        return VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: a */
    public static boolean m1284a(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
