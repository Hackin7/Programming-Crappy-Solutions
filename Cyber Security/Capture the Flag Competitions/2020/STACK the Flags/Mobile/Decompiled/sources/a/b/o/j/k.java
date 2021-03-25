package a.b.o.j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class k implements p, m, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Rect f236b;

    public abstract void l(g gVar);

    public abstract void p(View view);

    public abstract void r(boolean z);

    public abstract void s(int i);

    public abstract void t(int i);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z);

    public abstract void w(int i);

    public void q(Rect bounds) {
        this.f236b = bounds;
    }

    public Rect n() {
        return this.f236b;
    }

    @Override // a.b.o.j.m
    public void d(Context context, g menu) {
    }

    @Override // a.b.o.j.m
    public boolean g(g menu, i item) {
        return false;
    }

    @Override // a.b.o.j.m
    public boolean e(g menu, i item) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListAdapter outerAdapter = (ListAdapter) parent.getAdapter();
        y(outerAdapter).f202b.M((MenuItem) outerAdapter.getItem(position), this, m() ? 0 : 4);
    }

    public static int o(ListAdapter adapter, ViewGroup parent, Context context, int maxAllowedWidth) {
        int maxWidth = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            if (parent == null) {
                parent = new FrameLayout(context);
            }
            itemView = adapter.getView(i, itemView, parent);
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            int itemWidth = itemView.getMeasuredWidth();
            if (itemWidth >= maxAllowedWidth) {
                return maxAllowedWidth;
            }
            if (itemWidth > maxWidth) {
                maxWidth = itemWidth;
            }
        }
        return maxWidth;
    }

    public static f y(ListAdapter adapter) {
        if (adapter instanceof HeaderViewListAdapter) {
            return (f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        return (f) adapter;
    }

    public static boolean x(g menu) {
        int count = menu.size();
        for (int i = 0; i < count; i++) {
            MenuItem childItem = menu.getItem(i);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        return true;
    }
}
