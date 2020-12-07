package b.d.a.a.v;

import a.b.m.a.c;

public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final double f2654c = Math.cos(Math.toRadians(45.0d));

    public abstract float e();

    public final void f(float f2) {
        throw null;
    }

    public abstract void g(float f2);

    public static float d(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (addPaddingForCorners) {
            return (float) (((double) (1.5f * maxShadowSize)) + ((1.0d - f2654c) * ((double) cornerRadius)));
        }
        return 1.5f * maxShadowSize;
    }

    public static float c(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (addPaddingForCorners) {
            return (float) (((double) maxShadowSize) + ((1.0d - f2654c) * ((double) cornerRadius)));
        }
        return maxShadowSize;
    }
}
