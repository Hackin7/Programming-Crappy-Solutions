package a.b.o.j;

import a.b.o.j.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;

public class f extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public g f202b;

    /* renamed from: c  reason: collision with root package name */
    public int f203c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f204d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f205e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutInflater f206f;

    /* renamed from: g  reason: collision with root package name */
    public final int f207g;

    public f(g menu, LayoutInflater inflater, boolean overflowOnly, int itemLayoutRes) {
        this.f205e = overflowOnly;
        this.f206f = inflater;
        this.f202b = menu;
        this.f207g = itemLayoutRes;
        a();
    }

    public void d(boolean forceShow) {
        this.f204d = forceShow;
    }

    public int getCount() {
        ArrayList<MenuItemImpl> items = this.f205e ? this.f202b.z() : this.f202b.E();
        if (this.f203c < 0) {
            return items.size();
        }
        return items.size() - 1;
    }

    public g b() {
        return this.f202b;
    }

    /* renamed from: c */
    public i getItem(int position) {
        ArrayList<MenuItemImpl> items = this.f205e ? this.f202b.z() : this.f202b.E();
        int i = this.f203c;
        if (i >= 0 && position >= i) {
            position++;
        }
        return (i) items.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.f206f.inflate(this.f207g, parent, false);
        }
        int currGroupId = getItem(position).getGroupId();
        ((ListMenuItemView) convertView).setGroupDividerEnabled(this.f202b.F() && currGroupId != (position + -1 >= 0 ? getItem(position + -1).getGroupId() : currGroupId));
        n.a itemView = (n.a) convertView;
        if (this.f204d) {
            ((ListMenuItemView) convertView).setForceShowIcon(true);
        }
        itemView.e(getItem(position), 0);
        return convertView;
    }

    public void a() {
        i expandedItem = this.f202b.v();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> items = this.f202b.z();
            int count = items.size();
            for (int i = 0; i < count; i++) {
                if (((i) items.get(i)) == expandedItem) {
                    this.f203c = i;
                    return;
                }
            }
        }
        this.f203c = -1;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
