package a.b.p;

import a.b.j;
import a.h.f.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

public class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f408a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f409b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f410c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f411d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f412e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f413f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f414g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
        int[] iArr = {-16842919, -16842908};
    }

    public static int c(Context context, int attr) {
        int[] iArr = f414g;
        iArr[0] = attr;
        w0 a2 = w0.t(context, null, iArr);
        try {
            return a2.b(0, 0);
        } finally {
            a2.v();
        }
    }

    public static ColorStateList e(Context context, int attr) {
        int[] iArr = f414g;
        iArr[0] = attr;
        w0 a2 = w0.t(context, null, iArr);
        try {
            return a2.c(0);
        } finally {
            a2.v();
        }
    }

    public static int b(Context context, int attr) {
        ColorStateList csl = e(context, attr);
        if (csl != null && csl.isStateful()) {
            return csl.getColorForState(f409b, csl.getDefaultColor());
        }
        TypedValue tv = f();
        context.getTheme().resolveAttribute(16842803, tv, true);
        return d(context, attr, tv.getFloat());
    }

    public static TypedValue f() {
        TypedValue typedValue = f408a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f408a.set(typedValue2);
        return typedValue2;
    }

    public static int d(Context context, int attr, float alpha) {
        int color = c(context, attr);
        return a.d(color, Math.round(((float) Color.alpha(color)) * alpha));
    }

    public static void a(View view, Context context) {
        TypedArray a2 = context.obtainStyledAttributes(j.AppCompatTheme);
        try {
            if (!a2.hasValue(j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            a2.recycle();
        }
    }
}
