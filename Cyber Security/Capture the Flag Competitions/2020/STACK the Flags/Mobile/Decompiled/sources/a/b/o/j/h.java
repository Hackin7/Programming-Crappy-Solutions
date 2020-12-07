package a.b.o.j;

import a.b.g;
import a.b.k.c;
import a.b.o.j.e;
import a.b.o.j.m;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b  reason: collision with root package name */
    public g f215b;

    /* renamed from: c  reason: collision with root package name */
    public c f216c;

    /* renamed from: d  reason: collision with root package name */
    public e f217d;

    public h(g menu) {
        this.f215b = menu;
    }

    public void d(IBinder windowToken) {
        g menu = this.f215b;
        c.a builder = new c.a(menu.u());
        e eVar = new e(builder.b(), g.abc_list_menu_item_layout);
        this.f217d = eVar;
        eVar.h(this);
        this.f215b.b(this.f217d);
        builder.c(this.f217d.b(), this);
        View headerView = menu.y();
        if (headerView != null) {
            builder.d(headerView);
        } else {
            builder.e(menu.w());
            builder.j(menu.x());
        }
        builder.g(this);
        c a2 = builder.a();
        this.f216c = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams lp = this.f216c.getWindow().getAttributes();
        lp.type = 1003;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        lp.flags |= 131072;
        this.f216c.show();
    }

    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        Window win;
        View decor;
        KeyEvent.DispatcherState ds;
        View decor2;
        KeyEvent.DispatcherState ds2;
        if (keyCode == 82 || keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                Window win2 = this.f216c.getWindow();
                if (!(win2 == null || (decor2 = win2.getDecorView()) == null || (ds2 = decor2.getKeyDispatcherState()) == null)) {
                    ds2.startTracking(event, this);
                    return true;
                }
            } else if (event.getAction() == 1 && !event.isCanceled() && (win = this.f216c.getWindow()) != null && (decor = win.getDecorView()) != null && (ds = decor.getKeyDispatcherState()) != null && ds.isTracking(event)) {
                this.f215b.e(true);
                dialog.dismiss();
                return true;
            }
        }
        return this.f215b.performShortcut(keyCode, event, 0);
    }

    public void c() {
        c cVar = this.f216c;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialog) {
        this.f217d.a(this.f215b, true);
    }

    @Override // a.b.o.j.m.a
    public void a(g menu, boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == this.f215b) {
            c();
        }
    }

    @Override // a.b.o.j.m.a
    public boolean b(g subMenu) {
        return false;
    }

    public void onClick(DialogInterface dialog, int which) {
        this.f215b.L((i) ((e.a) this.f217d.b()).getItem(which), 0);
    }
}
