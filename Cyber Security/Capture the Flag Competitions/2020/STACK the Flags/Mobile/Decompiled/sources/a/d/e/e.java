package a.d.e;

import android.graphics.drawable.Drawable;

public class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final double f507a = Math.cos(Math.toRadians(45.0d));

    public static float b(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (addPaddingForCorners) {
            return (float) (((double) (1.5f * maxShadowSize)) + ((1.0d - f507a) * ((double) cornerRadius)));
        }
        return 1.5f * maxShadowSize;
    }

    public static float a(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (addPaddingForCorners) {
            return (float) (((double) maxShadowSize) + ((1.0d - f507a) * ((double) cornerRadius)));
        }
        return maxShadowSize;
    }
}
