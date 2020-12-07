package a.b.o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {

    /* renamed from: b  reason: collision with root package name */
    public Object f120b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f121c;

    public interface a {
        boolean a(b bVar, Menu menu);

        boolean b(b bVar, MenuItem menuItem);

        boolean c(b bVar, Menu menu);

        void d(b bVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence i();

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void p(Object tag) {
        this.f120b = tag;
    }

    public Object h() {
        return this.f120b;
    }

    public void s(boolean titleOptional) {
        this.f121c = titleOptional;
    }

    public boolean j() {
        return this.f121c;
    }
}
