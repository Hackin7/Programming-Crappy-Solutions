package a.b.o;

import a.b.b;
import a.b.d;
import a.b.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f119a;

    public static a b(Context context) {
        return new a(context);
    }

    public a(Context context) {
        this.f119a = context;
    }

    public int d() {
        Configuration configuration = this.f119a.getResources().getConfiguration();
        int widthDp = configuration.screenWidthDp;
        int heightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || widthDp > 600) {
            return 5;
        }
        if (widthDp > 960 && heightDp > 720) {
            return 5;
        }
        if (widthDp > 720 && heightDp > 960) {
            return 5;
        }
        if (widthDp >= 500) {
            return 4;
        }
        if (widthDp > 640 && heightDp > 480) {
            return 4;
        }
        if (widthDp > 480 && heightDp > 640) {
            return 4;
        }
        if (widthDp >= 360) {
            return 3;
        }
        return 2;
    }

    public boolean h() {
        return true;
    }

    public int c() {
        return this.f119a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean g() {
        return this.f119a.getResources().getBoolean(b.abc_action_bar_embed_tabs);
    }

    public int f() {
        TypedArray a2 = this.f119a.obtainStyledAttributes(null, j.ActionBar, a.b.a.actionBarStyle, 0);
        int height = a2.getLayoutDimension(j.ActionBar_height, 0);
        Resources r = this.f119a.getResources();
        if (!g()) {
            height = Math.min(height, r.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        a2.recycle();
        return height;
    }

    public boolean a() {
        return this.f119a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int e() {
        return this.f119a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
    }
}
