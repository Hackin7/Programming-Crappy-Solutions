package a.h.n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Field f998a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f999b;

    public static void b(CompoundButton button, ColorStateList tint) {
        button.setButtonTintList(tint);
    }

    public static void c(CompoundButton button, PorterDuff.Mode tintMode) {
        button.setButtonTintMode(tintMode);
    }

    public static Drawable a(CompoundButton button) {
        if (Build.VERSION.SDK_INT >= 23) {
            return button.getButtonDrawable();
        }
        if (!f999b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f998a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f999b = true;
        }
        Field field = f998a;
        if (field != null) {
            try {
                return (Drawable) field.get(button);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f998a = null;
            }
        }
        return null;
    }
}
