package a.h.m;

import android.graphics.Rect;
import android.view.Gravity;

public final class d {
    public static void a(int gravity, int w, int h, Rect container, Rect outRect, int layoutDirection) {
        Gravity.apply(gravity, w, h, container, outRect, layoutDirection);
    }

    public static int b(int gravity, int layoutDirection) {
        return Gravity.getAbsoluteGravity(gravity, layoutDirection);
    }
}
