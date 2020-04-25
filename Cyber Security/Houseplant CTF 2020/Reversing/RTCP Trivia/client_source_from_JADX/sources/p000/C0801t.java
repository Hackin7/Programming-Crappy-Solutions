package p000;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: t */
public final class C0801t {

    /* renamed from: a */
    public Context f3390a;

    private C0801t(Context context) {
        this.f3390a = context;
    }

    /* renamed from: a */
    public static C0801t m2659a(Context context) {
        return new C0801t(context);
    }

    /* renamed from: a */
    public final int mo2803a() {
        Configuration configuration = this.f3390a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: b */
    public final boolean mo2804b() {
        return this.f3390a.getResources().getBoolean(C0118b.abc_action_bar_embed_tabs);
    }
}
