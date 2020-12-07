package a.h.f.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Method f833a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f834b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f835c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f836d;

    @Deprecated
    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean mirrored) {
        drawable.setAutoMirrored(mirrored);
    }

    public static boolean h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void k(Drawable drawable, float x, float y) {
        drawable.setHotspot(x, y);
    }

    public static void l(Drawable drawable, int left, int top, int right, int bottom) {
        drawable.setHotspotBounds(left, top, right, bottom);
    }

    public static void n(Drawable drawable, int tint) {
        drawable.setTint(tint);
    }

    public static void o(Drawable drawable, ColorStateList tint) {
        drawable.setTintList(tint);
    }

    public static void p(Drawable drawable, PorterDuff.Mode tintMode) {
        drawable.setTintMode(tintMode);
    }

    public static int d(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static ColorFilter e(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void c(Drawable drawable) {
        DrawableContainer.DrawableContainerState state;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            c(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof c) {
            c(((c) drawable).a());
        } else if ((drawable instanceof DrawableContainer) && (state = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int count = state.getChildCount();
            for (int i = 0; i < count; i++) {
                Drawable child = state.getChild(i);
                if (child != null) {
                    c(child);
                }
            }
        }
    }

    public static void g(Drawable drawable, Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        drawable.inflate(res, parser, attrs, theme);
    }

    public static Drawable q(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof b)) {
            return new e(drawable);
        }
        return drawable;
    }

    public static boolean m(Drawable drawable, int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(layoutDirection);
        }
        if (!f834b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f833a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            f834b = true;
        }
        Method method = f833a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(layoutDirection));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f833a = null;
            }
        }
        return false;
    }

    public static int f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f836d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f835c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f836d = true;
        }
        Method method = f835c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                f835c = null;
            }
        }
        return 0;
    }
}
