package b.d.a.a.u;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2647a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2648b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2649c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2650d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2651e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2652f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f2653g = {16842913, 16843623, 16842908};
    public static final int[] h = {16842913, 16842908};
    public static final int[] i = {16842913, 16843623};
    public static final int[] j = {16842913};

    public static ColorStateList a(ColorStateList rippleColor) {
        int[][] states = new int[2][];
        int[] colors = new int[2];
        states[0] = j;
        colors[0] = c(rippleColor, f2652f);
        int i2 = 0 + 1;
        states[i2] = StateSet.NOTHING;
        colors[i2] = c(rippleColor, f2648b);
        int i3 = i2 + 1;
        return new ColorStateList(states, colors);
    }

    public static int c(ColorStateList rippleColor, int[] state) {
        int color;
        if (rippleColor != null) {
            color = rippleColor.getColorForState(state, rippleColor.getDefaultColor());
        } else {
            color = 0;
        }
        return b(color);
    }

    @TargetApi(21)
    public static int b(int color) {
        return a.h.f.a.d(color, Math.min(Color.alpha(color) * 2, 255));
    }
}
