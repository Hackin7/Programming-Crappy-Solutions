package a.b.o;

import a.b.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f122a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f123b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f124c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f125d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f126e;

    public d() {
        super(null);
    }

    public d(Context base, int themeResId) {
        super(base);
        this.f122a = themeResId;
    }

    public d(Context base, Resources.Theme theme) {
        super(base);
        this.f123b = theme;
    }

    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    public void a(Configuration overrideConfiguration) {
        if (this.f126e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f125d == null) {
            this.f125d = new Configuration(overrideConfiguration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public Resources getResources() {
        return b();
    }

    public final Resources b() {
        if (this.f126e == null) {
            Configuration configuration = this.f125d;
            if (configuration == null) {
                this.f126e = super.getResources();
            } else {
                this.f126e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f126e;
    }

    public void setTheme(int resid) {
        if (this.f122a != resid) {
            this.f122a = resid;
            d();
        }
    }

    public int c() {
        return this.f122a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f123b;
        if (theme != null) {
            return theme;
        }
        if (this.f122a == 0) {
            this.f122a = i.Theme_AppCompat_Light;
        }
        d();
        return this.f123b;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        if (this.f124c == null) {
            this.f124c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f124c;
    }

    public void e(Resources.Theme theme, int resid) {
        theme.applyStyle(resid, true);
    }

    public final void d() {
        if (this.f123b == null) {
            this.f123b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f123b.setTo(theme);
            }
        }
        e(this.f123b, this.f122a);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
