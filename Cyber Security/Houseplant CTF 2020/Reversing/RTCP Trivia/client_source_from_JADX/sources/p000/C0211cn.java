package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: cn */
final class C0211cn {

    /* renamed from: a */
    static final int[] f1067a = {-16842910};

    /* renamed from: b */
    static final int[] f1068b = {16842908};

    /* renamed from: c */
    static final int[] f1069c = {16843518};

    /* renamed from: d */
    static final int[] f1070d = {16842919};

    /* renamed from: e */
    static final int[] f1071e = {16842912};

    /* renamed from: f */
    static final int[] f1072f = {16842913};

    /* renamed from: g */
    static final int[] f1073g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f1074h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f1075i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f1076j = new int[1];

    /* renamed from: a */
    public static int m669a(Context context, int i) {
        f1076j[0] = i;
        C0215cr a = C0215cr.m675a(context, (AttributeSet) null, f1076j);
        try {
            int b = a.mo1314b(0, 0);
            return b;
        } finally {
            a.f1087b.recycle();
        }
    }

    /* renamed from: b */
    public static ColorStateList m670b(Context context, int i) {
        f1076j[0] = i;
        C0215cr a = C0215cr.m675a(context, (AttributeSet) null, f1076j);
        try {
            ColorStateList e = a.mo1321e(0);
            return e;
        } finally {
            a.f1087b.recycle();
        }
    }

    /* renamed from: c */
    public static int m671c(Context context, int i) {
        ColorStateList b = m670b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f1067a, b.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f1075i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f1075i.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = m669a(context, i);
        return C0331fe.m1086b(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
