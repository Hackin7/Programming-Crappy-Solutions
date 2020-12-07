package a.b.o.j;

import a.b.g;
import a.b.o.j.m;
import a.b.o.j.n;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Context f194b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f195c;

    /* renamed from: d  reason: collision with root package name */
    public g f196d;

    /* renamed from: e  reason: collision with root package name */
    public ExpandedMenuView f197e;

    /* renamed from: f  reason: collision with root package name */
    public int f198f;

    /* renamed from: g  reason: collision with root package name */
    public int f199g;
    public int h;
    public m.a i;
    public a j;

    public e(Context context, int itemLayoutRes) {
        this(itemLayoutRes, 0);
        this.f194b = context;
        this.f195c = LayoutInflater.from(context);
    }

    public e(int itemLayoutRes, int themeRes) {
        this.h = itemLayoutRes;
        this.f199g = themeRes;
    }

    @Override // a.b.o.j.m
    public void d(Context context, g menu) {
        if (this.f199g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f199g);
            this.f194b = contextThemeWrapper;
            this.f195c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f194b != null) {
            this.f194b = context;
            if (this.f195c == null) {
                this.f195c = LayoutInflater.from(context);
            }
        }
        this.f196d = menu;
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public n f(ViewGroup root) {
        if (this.f197e == null) {
            this.f197e = (ExpandedMenuView) this.f195c.inflate(g.abc_expanded_menu_layout, root, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.f197e.setAdapter((ListAdapter) this.j);
            this.f197e.setOnItemClickListener(this);
        }
        return this.f197e;
    }

    public ListAdapter b() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // a.b.o.j.m
    public void j(boolean cleared) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.o.j.m
    public void h(m.a cb) {
        this.i = cb;
    }

    @Override // a.b.o.j.m
    public boolean i(r subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        new h(subMenu).d(null);
        m.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.b(subMenu);
        return true;
    }

    @Override // a.b.o.j.m
    public void a(g menu, boolean allMenusAreClosing) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.a(menu, allMenusAreClosing);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        this.f196d.M(this.j.getItem(position), this, 0);
    }

    @Override // a.b.o.j.m
    public boolean c() {
        return false;
    }

    @Override // a.b.o.j.m
    public boolean g(g menu, i item) {
        return false;
    }

    @Override // a.b.o.j.m
    public boolean e(g menu, i item) {
        return false;
    }

    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        public int f200b = -1;

        public a() {
            a();
        }

        public int getCount() {
            int count = e.this.f196d.z().size() - e.this.f198f;
            if (this.f200b < 0) {
                return count;
            }
            return count - 1;
        }

        /* renamed from: b */
        public i getItem(int position) {
            ArrayList<MenuItemImpl> items = e.this.f196d.z();
            int position2 = position + e.this.f198f;
            int i = this.f200b;
            if (i >= 0 && position2 >= i) {
                position2++;
            }
            return (i) items.get(position2);
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                e eVar = e.this;
                convertView = eVar.f195c.inflate(eVar.h, parent, false);
            }
            ((n.a) convertView).e(getItem(position), 0);
            return convertView;
        }

        public void a() {
            i expandedItem = e.this.f196d.v();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> items = e.this.f196d.z();
                int count = items.size();
                for (int i = 0; i < count; i++) {
                    if (((i) items.get(i)) == expandedItem) {
                        this.f200b = i;
                        return;
                    }
                }
            }
            this.f200b = -1;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }
}
