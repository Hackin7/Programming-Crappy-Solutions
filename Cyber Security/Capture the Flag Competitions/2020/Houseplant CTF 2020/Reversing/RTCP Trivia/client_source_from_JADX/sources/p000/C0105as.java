package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: as */
public final class C0105as {
    /* renamed from: a */
    public static Menu m376a(Context context, C0353fs fsVar) {
        return new C0106at(context, fsVar);
    }

    /* renamed from: a */
    public static MenuItem m377a(Context context, C0354ft ftVar) {
        return VERSION.SDK_INT >= 16 ? new C0030an(context, ftVar) : new C0025am(context, ftVar);
    }
}
