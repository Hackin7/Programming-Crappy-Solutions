package a.h.m;

import android.view.ViewGroup;

public final class g {
    public static int b(ViewGroup.MarginLayoutParams lp) {
        return lp.getMarginStart();
    }

    public static int a(ViewGroup.MarginLayoutParams lp) {
        return lp.getMarginEnd();
    }

    public static void c(ViewGroup.MarginLayoutParams lp, int marginEnd) {
        lp.setMarginEnd(marginEnd);
    }
}
