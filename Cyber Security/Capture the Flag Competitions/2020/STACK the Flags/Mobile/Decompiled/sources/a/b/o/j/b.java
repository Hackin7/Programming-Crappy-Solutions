package a.b.o.j;

import a.b.o.j.m;
import a.b.o.j.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;

public abstract class b implements m {

    /* renamed from: b  reason: collision with root package name */
    public Context f170b;

    /* renamed from: c  reason: collision with root package name */
    public Context f171c;

    /* renamed from: d  reason: collision with root package name */
    public g f172d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f173e;

    /* renamed from: f  reason: collision with root package name */
    public m.a f174f;

    /* renamed from: g  reason: collision with root package name */
    public int f175g;
    public int h;
    public n i;

    public abstract void f(i iVar, n.a aVar);

    public abstract boolean q(int i2, i iVar);

    public b(Context context, int menuLayoutRes, int itemLayoutRes) {
        this.f170b = context;
        this.f173e = LayoutInflater.from(context);
        this.f175g = menuLayoutRes;
        this.h = itemLayoutRes;
    }

    @Override // a.b.o.j.m
    public void d(Context context, g menu) {
        this.f171c = context;
        LayoutInflater.from(context);
        this.f172d = menu;
    }

    public n o(ViewGroup root) {
        if (this.i == null) {
            n nVar = (n) this.f173e.inflate(this.f175g, root, false);
            this.i = nVar;
            nVar.b(this.f172d);
            j(true);
        }
        return this.i;
    }

    @Override // a.b.o.j.m
    public void j(boolean cleared) {
        ViewGroup parent = (ViewGroup) this.i;
        if (parent != null) {
            int childIndex = 0;
            g gVar = this.f172d;
            if (gVar != null) {
                gVar.r();
                ArrayList<MenuItemImpl> visibleItems = this.f172d.E();
                int itemCount = visibleItems.size();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    i item = (i) visibleItems.get(i2);
                    if (q(childIndex, item)) {
                        View convertView = parent.getChildAt(childIndex);
                        i oldItem = convertView instanceof n.a ? ((n.a) convertView).getItemData() : null;
                        View itemView = n(item, convertView, parent);
                        if (item != oldItem) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != convertView) {
                            b(itemView, childIndex);
                        }
                        childIndex++;
                    }
                }
            }
            while (childIndex < parent.getChildCount()) {
                if (!l(parent, childIndex)) {
                    childIndex++;
                }
            }
        }
    }

    public void b(View itemView, int childIndex) {
        ViewGroup currentParent = (ViewGroup) itemView.getParent();
        if (currentParent != null) {
            currentParent.removeView(itemView);
        }
        ((ViewGroup) this.i).addView(itemView, childIndex);
    }

    public boolean l(ViewGroup parent, int childIndex) {
        parent.removeViewAt(childIndex);
        return true;
    }

    @Override // a.b.o.j.m
    public void h(m.a cb) {
        this.f174f = cb;
    }

    public m.a m() {
        return this.f174f;
    }

    public n.a k(ViewGroup parent) {
        return (n.a) this.f173e.inflate(this.h, parent, false);
    }

    public View n(i item, View convertView, ViewGroup parent) {
        n.a itemView;
        if (convertView instanceof n.a) {
            itemView = (n.a) convertView;
        } else {
            itemView = k(parent);
        }
        f(item, itemView);
        return (View) itemView;
    }

    @Override // a.b.o.j.m
    public void a(g menu, boolean allMenusAreClosing) {
        m.a aVar = this.f174f;
        if (aVar != null) {
            aVar.a(menu, allMenusAreClosing);
        }
    }

    @Override // a.b.o.j.m
    public boolean i(r menu) {
        m.a aVar = this.f174f;
        if (aVar == null) {
            return false;
        }
        return aVar.b(menu != null ? menu : this.f172d);
    }

    @Override // a.b.o.j.m
    public boolean g(g menu, i item) {
        return false;
    }

    @Override // a.b.o.j.m
    public boolean e(g menu, i item) {
        return false;
    }

    public void p(int id) {
    }
}
