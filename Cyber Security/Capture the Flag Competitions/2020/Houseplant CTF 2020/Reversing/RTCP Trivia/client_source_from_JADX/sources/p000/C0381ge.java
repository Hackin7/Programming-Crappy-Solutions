package p000;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ge */
public abstract class C0381ge {

    /* renamed from: a */
    private final Context f1718a;

    /* renamed from: e */
    public C0382a f1719e;

    /* renamed from: f */
    public C0383b f1720f;

    /* renamed from: ge$a */
    public interface C0382a {
        /* renamed from: b */
        void mo884b(boolean z);
    }

    /* renamed from: ge$b */
    public interface C0383b {
        /* renamed from: a */
        void mo251a();
    }

    public C0381ge(Context context) {
        this.f1718a = context;
    }

    /* renamed from: a */
    public abstract View mo307a();

    /* renamed from: a */
    public View mo316a(MenuItem menuItem) {
        return mo307a();
    }

    /* renamed from: a */
    public void mo308a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo317a(C0383b bVar) {
        if (this.f1720f != null) {
            StringBuilder sb = new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.f1720f = bVar;
    }

    /* renamed from: a */
    public final void mo1809a(boolean z) {
        if (this.f1719e != null) {
            this.f1719e.mo884b(z);
        }
    }

    /* renamed from: b */
    public boolean mo309b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo310c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo318d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo319e() {
        return true;
    }
}
