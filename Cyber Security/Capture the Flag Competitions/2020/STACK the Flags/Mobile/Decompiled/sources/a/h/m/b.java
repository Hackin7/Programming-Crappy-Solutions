package a.h.m;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0024b f911a;

    public interface a {
    }

    /* renamed from: a.h.m.b$b  reason: collision with other inner class name */
    public interface AbstractC0024b {
    }

    public abstract View c();

    public b(Context context) {
    }

    public View d(MenuItem forItem) {
        return c();
    }

    public boolean g() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public boolean a() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public void i(a listener) {
    }

    public void j(AbstractC0024b listener) {
        if (!(this.f911a == null || listener == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f911a = listener;
    }

    public void h() {
        this.f911a = null;
    }
}
