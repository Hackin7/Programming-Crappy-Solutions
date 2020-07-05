package p000;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: hd */
public final class C0437hd {
    /* renamed from: a */
    public static void m1385a(EdgeEffect edgeEffect, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
