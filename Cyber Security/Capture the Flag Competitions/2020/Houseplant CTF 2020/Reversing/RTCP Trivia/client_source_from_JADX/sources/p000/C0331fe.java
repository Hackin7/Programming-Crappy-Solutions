package p000;

import android.graphics.Color;

/* renamed from: fe */
public final class C0331fe {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f1614a = new ThreadLocal<>();

    /* renamed from: a */
    public static int m1084a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, m1085a(Color.red(i), alpha2, Color.red(i2), alpha, i3), m1085a(Color.green(i), alpha2, Color.green(i2), alpha, i3), m1085a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    /* renamed from: a */
    private static int m1085a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: b */
    public static int m1086b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
