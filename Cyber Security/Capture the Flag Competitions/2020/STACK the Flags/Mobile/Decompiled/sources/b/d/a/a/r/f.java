package b.d.a.a.r;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.d.a.a.b;
import b.d.a.a.j;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2644a = {b.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2645b = {b.colorSecondary};

    public static TypedArray h(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        b(context, set, defStyleAttr, defStyleRes);
        d(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        return context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes);
    }

    public static void b(Context context, AttributeSet set, int defStyleAttr, int defStyleRes) {
        TypedArray a2 = context.obtainStyledAttributes(set, j.ThemeEnforcement, defStyleAttr, defStyleRes);
        boolean enforceMaterialTheme = a2.getBoolean(j.ThemeEnforcement_enforceMaterialTheme, false);
        a2.recycle();
        if (enforceMaterialTheme) {
            c(context);
        }
        a(context);
    }

    public static void d(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        TypedArray themeEnforcementAttrs = context.obtainStyledAttributes(set, j.ThemeEnforcement, defStyleAttr, defStyleRes);
        boolean validTextAppearance = false;
        if (!themeEnforcementAttrs.getBoolean(j.ThemeEnforcement_enforceTextAppearance, false)) {
            themeEnforcementAttrs.recycle();
            return;
        }
        if (textAppearanceResIndices != null && textAppearanceResIndices.length != 0) {
            validTextAppearance = f(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        } else if (themeEnforcementAttrs.getResourceId(j.ThemeEnforcement_android_textAppearance, -1) != -1) {
            validTextAppearance = true;
        }
        themeEnforcementAttrs.recycle();
        if (!validTextAppearance) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static boolean f(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        TypedArray componentAttrs = context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes);
        for (int customTextAppearanceIndex : textAppearanceResIndices) {
            if (componentAttrs.getResourceId(customTextAppearanceIndex, -1) == -1) {
                componentAttrs.recycle();
                return false;
            }
        }
        componentAttrs.recycle();
        return true;
    }

    public static void a(Context context) {
        e(context, f2644a, "Theme.AppCompat");
    }

    public static void c(Context context) {
        e(context, f2645b, "Theme.MaterialComponents");
    }

    public static boolean g(Context context, int[] themeAttributes) {
        TypedArray a2 = context.obtainStyledAttributes(themeAttributes);
        boolean success = a2.hasValue(0);
        a2.recycle();
        return success;
    }

    public static void e(Context context, int[] themeAttributes, String themeName) {
        if (!g(context, themeAttributes)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + themeName + " (or a descendant).");
        }
    }
}
