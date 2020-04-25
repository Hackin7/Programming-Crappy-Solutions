package p000;

import android.os.Build.VERSION;
import android.view.Gravity;

/* renamed from: gf */
public final class C0384gf {
    /* renamed from: a */
    public static int m1231a(int i, int i2) {
        return VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
