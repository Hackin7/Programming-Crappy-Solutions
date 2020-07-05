package p000;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: hc */
public final class C0436hc {

    /* renamed from: a */
    private static Field f1880a;

    /* renamed from: b */
    private static boolean f1881b;

    /* renamed from: a */
    public static Drawable m1384a(CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f1881b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1880a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f1881b = true;
        }
        if (f1880a != null) {
            try {
                return (Drawable) f1880a.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f1880a = null;
            }
        }
        return null;
    }
}
