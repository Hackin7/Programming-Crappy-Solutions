package a.b.k;

import a.b.k.a;
import a.b.o.i;
import a.b.o.j.g;
import a.b.o.j.m;
import a.b.p.d0;
import a.b.p.y0;
import a.h.m.s;
import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

public class l extends a {

    /* renamed from: a  reason: collision with root package name */
    public d0 f54a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55b;

    /* renamed from: c  reason: collision with root package name */
    public Window.Callback f56c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f57d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f58e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<a.b> f59f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f60g = new a();
    public final Toolbar.f h = new b();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            l.this.r();
        }
    }

    public class b implements Toolbar.f {
        public b() {
        }

        public boolean a(MenuItem item) {
            return l.this.f56c.onMenuItemSelected(0, item);
        }
    }

    public l(Toolbar toolbar, CharSequence title, Window.Callback windowCallback) {
        this.f54a = new y0(toolbar, false);
        e eVar = new e(windowCallback);
        this.f56c = eVar;
        this.f54a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.h);
        this.f54a.setWindowTitle(title);
    }

    public Window.Callback q() {
        return this.f56c;
    }

    @Override // a.b.k.a
    public Context e() {
        return this.f54a.q();
    }

    @Override // a.b.k.a
    public void l(boolean enabled) {
    }

    @Override // a.b.k.a
    public void m(boolean enabled) {
    }

    @Override // a.b.k.a
    public void g(Configuration config) {
        super.g(config);
    }

    @Override // a.b.k.a
    public void n(CharSequence title) {
        this.f54a.setWindowTitle(title);
    }

    @Override // a.b.k.a
    public int d() {
        return this.f54a.j();
    }

    @Override // a.b.k.a
    public boolean k() {
        return this.f54a.e();
    }

    @Override // a.b.k.a
    public boolean a() {
        return this.f54a.d();
    }

    @Override // a.b.k.a
    public boolean f() {
        this.f54a.o().removeCallbacks(this.f60g);
        s.U(this.f54a.o(), this.f60g);
        return true;
    }

    @Override // a.b.k.a
    public boolean b() {
        if (!this.f54a.u()) {
            return false;
        }
        this.f54a.collapseActionView();
        return true;
    }

    public void r() {
        Menu menu = p();
        g mb = menu instanceof g ? (g) menu : null;
        if (mb != null) {
            mb.d0();
        }
        try {
            menu.clear();
            if (!this.f56c.onCreatePanelMenu(0, menu) || !this.f56c.onPreparePanel(0, null, menu)) {
                menu.clear();
            }
        } finally {
            if (mb != null) {
                mb.c0();
            }
        }
    }

    @Override // a.b.k.a
    public boolean j(KeyEvent event) {
        if (event.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // a.b.k.a
    public boolean i(int keyCode, KeyEvent ev) {
        Menu menu = p();
        if (menu == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(ev != null ? ev.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(keyCode, ev, 0);
    }

    @Override // a.b.k.a
    public void h() {
        this.f54a.o().removeCallbacks(this.f60g);
    }

    @Override // a.b.k.a
    public void c(boolean isVisible) {
        if (isVisible != this.f58e) {
            this.f58e = isVisible;
            int count = this.f59f.size();
            for (int i = 0; i < count; i++) {
                this.f59f.get(i).a(isVisible);
            }
        }
    }

    public class e extends i {
        public e(Window.Callback wrapped) {
            super(wrapped);
        }

        @Override // a.b.o.i
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            boolean result = super.onPreparePanel(featureId, view, menu);
            if (result) {
                l lVar = l.this;
                if (!lVar.f55b) {
                    lVar.f54a.f();
                    l.this.f55b = true;
                }
            }
            return result;
        }

        @Override // a.b.o.i
        public View onCreatePanelView(int featureId) {
            if (featureId == 0) {
                return new View(l.this.f54a.q());
            }
            return super.onCreatePanelView(featureId);
        }
    }

    public final Menu p() {
        if (!this.f57d) {
            this.f54a.i(new c(), new d());
            this.f57d = true;
        }
        return this.f54a.l();
    }

    public final class c implements m.a {

        /* renamed from: b  reason: collision with root package name */
        public boolean f63b;

        public c() {
        }

        @Override // a.b.o.j.m.a
        public boolean b(g subMenu) {
            Window.Callback callback = l.this.f56c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, subMenu);
            return true;
        }

        @Override // a.b.o.j.m.a
        public void a(g menu, boolean allMenusAreClosing) {
            if (!this.f63b) {
                this.f63b = true;
                l.this.f54a.h();
                Window.Callback callback = l.this.f56c;
                if (callback != null) {
                    callback.onPanelClosed(108, menu);
                }
                this.f63b = false;
            }
        }
    }

    public final class d implements g.a {
        public d() {
        }

        @Override // a.b.o.j.g.a
        public boolean a(g menu, MenuItem item) {
            return false;
        }

        @Override // a.b.o.j.g.a
        public void b(g menu) {
            l lVar = l.this;
            if (lVar.f56c == null) {
                return;
            }
            if (lVar.f54a.c()) {
                l.this.f56c.onPanelClosed(108, menu);
            } else if (l.this.f56c.onPreparePanel(0, null, menu)) {
                l.this.f56c.onMenuOpened(108, menu);
            }
        }
    }
}
