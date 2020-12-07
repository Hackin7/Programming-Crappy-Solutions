package a.b.o.j;

import a.e.g;
import a.h.g.a.b;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f176a;

    /* renamed from: b  reason: collision with root package name */
    public g<b, MenuItem> f177b;

    /* renamed from: c  reason: collision with root package name */
    public g<a.h.g.a.c, SubMenu> f178c;

    public c(Context context) {
        this.f176a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b supportMenuItem = (b) menuItem;
        if (this.f177b == null) {
            this.f177b = new g<>();
        }
        MenuItem wrappedItem = this.f177b.get(menuItem);
        if (wrappedItem != null) {
            return wrappedItem;
        }
        MenuItem wrappedItem2 = new j(this.f176a, supportMenuItem);
        this.f177b.put(supportMenuItem, wrappedItem2);
        return wrappedItem2;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof a.h.g.a.c)) {
            return subMenu;
        }
        a.h.g.a.c supportSubMenu = (a.h.g.a.c) subMenu;
        if (this.f178c == null) {
            this.f178c = new g<>();
        }
        SubMenu wrappedMenu = this.f178c.get(supportSubMenu);
        if (wrappedMenu != null) {
            return wrappedMenu;
        }
        SubMenu wrappedMenu2 = new s(this.f176a, supportSubMenu);
        this.f178c.put(supportSubMenu, wrappedMenu2);
        return wrappedMenu2;
    }

    public final void e() {
        g<b, MenuItem> gVar = this.f177b;
        if (gVar != null) {
            gVar.clear();
        }
        g<a.h.g.a.c, SubMenu> gVar2 = this.f178c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    public final void f(int groupId) {
        if (this.f177b != null) {
            int i = 0;
            while (i < this.f177b.size()) {
                if (this.f177b.i(i).getGroupId() == groupId) {
                    this.f177b.k(i);
                    i--;
                }
                i++;
            }
        }
    }

    public final void g(int id) {
        if (this.f177b != null) {
            for (int i = 0; i < this.f177b.size(); i++) {
                if (this.f177b.i(i).getItemId() == id) {
                    this.f177b.k(i);
                    return;
                }
            }
        }
    }
}
