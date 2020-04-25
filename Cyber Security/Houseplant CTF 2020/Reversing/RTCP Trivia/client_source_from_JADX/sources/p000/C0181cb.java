package p000;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;

/* renamed from: cb */
public final class C0181cb {

    /* renamed from: a */
    public static final Rect f925a = new Rect();

    /* renamed from: b */
    private static Class<?> f926b;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f926b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static Mode m605a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    static void m606a(Drawable drawable) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            drawable.setState((state == null || state.length == 0) ? C0211cn.f1071e : C0211cn.f1074h);
            drawable.setState(state);
        }
    }

    /* renamed from: b */
    public static boolean m607b(Drawable drawable) {
        while (true) {
            if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT >= 17 || !(drawable instanceof LayerDrawable)) {
                if (!(drawable instanceof DrawableContainer)) {
                    if (!(drawable instanceof C0347fp)) {
                        if (!(drawable instanceof C0798r)) {
                            if (!(drawable instanceof ScaleDrawable)) {
                                break;
                            }
                            drawable = ((ScaleDrawable) drawable).getDrawable();
                        } else {
                            drawable = ((C0798r) drawable).f3386a;
                        }
                    } else {
                        drawable = ((C0347fp) drawable).mo1712a();
                    }
                } else {
                    ConstantState constantState = drawable.getConstantState();
                    if (constantState instanceof DrawableContainerState) {
                        for (Drawable b : ((DrawableContainerState) constantState).getChildren()) {
                            if (!m607b(b)) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
