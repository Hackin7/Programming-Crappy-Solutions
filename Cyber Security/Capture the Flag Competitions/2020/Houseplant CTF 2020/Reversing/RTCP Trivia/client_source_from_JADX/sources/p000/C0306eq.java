package p000;

import android.app.Activity;
import android.os.Build.VERSION;

/* renamed from: eq */
public final class C0306eq extends C0313ev {

    /* renamed from: a */
    private static C0307a f1587a;

    /* renamed from: eq$a */
    public interface C0307a {
        /* renamed from: a */
        boolean mo1686a();
    }

    /* renamed from: a */
    public static C0307a m1035a() {
        return f1587a;
    }

    /* renamed from: a */
    public static void m1036a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }
}
