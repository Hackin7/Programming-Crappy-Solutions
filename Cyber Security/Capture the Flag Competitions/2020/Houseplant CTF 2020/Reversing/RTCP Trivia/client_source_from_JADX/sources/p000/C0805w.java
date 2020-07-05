package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;

/* renamed from: w */
public final class C0805w extends ContextWrapper {

    /* renamed from: a */
    public int f3393a;

    /* renamed from: b */
    private Theme f3394b;

    /* renamed from: c */
    private LayoutInflater f3395c;

    /* renamed from: d */
    private Configuration f3396d;

    /* renamed from: e */
    private Resources f3397e;

    public C0805w() {
        super(null);
    }

    public C0805w(Context context, int i) {
        super(context);
        this.f3393a = i;
    }

    /* renamed from: a */
    private void m2682a() {
        if (this.f3394b == null) {
            this.f3394b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3394b.setTo(theme);
            }
        }
        this.f3394b.applyStyle(this.f3393a, true);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        Resources resources;
        if (this.f3397e == null) {
            if (this.f3396d == null) {
                resources = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(this.f3396d).getResources();
            }
            this.f3397e = resources;
        }
        return this.f3397e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3395c == null) {
            this.f3395c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3395c;
    }

    public final Theme getTheme() {
        if (this.f3394b != null) {
            return this.f3394b;
        }
        if (this.f3393a == 0) {
            this.f3393a = C0125i.Theme_AppCompat_Light;
        }
        m2682a();
        return this.f3394b;
    }

    public final void setTheme(int i) {
        if (this.f3393a != i) {
            this.f3393a = i;
            m2682a();
        }
    }
}
