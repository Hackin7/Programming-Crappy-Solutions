package a.h.m.d0;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class a {
    public static Interpolator a(float controlX1, float controlY1, float controlX2, float controlY2) {
        return new PathInterpolator(controlX1, controlY1, controlX2, controlY2);
    }
}
