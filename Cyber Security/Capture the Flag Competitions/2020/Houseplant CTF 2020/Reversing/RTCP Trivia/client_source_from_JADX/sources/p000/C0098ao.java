package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: ao */
abstract class C0098ao implements OnItemClickListener, C0101aq, C0107au {

    /* renamed from: g */
    Rect f706g;

    C0098ao() {
    }

    /* renamed from: a */
    protected static int m340a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* renamed from: a */
    protected static C0018ai m341a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0018ai) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0018ai) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m342b(C0019aj ajVar) {
        int size = ajVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = ajVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo107a(int i);

    /* renamed from: a */
    public abstract void mo108a(C0019aj ajVar);

    /* renamed from: a */
    public final void mo96a(Context context, C0019aj ajVar) {
    }

    /* renamed from: a */
    public abstract void mo109a(View view);

    /* renamed from: a */
    public abstract void mo110a(OnDismissListener onDismissListener);

    /* renamed from: b */
    public abstract void mo112b(int i);

    /* renamed from: b */
    public abstract void mo113b(boolean z);

    /* renamed from: b */
    public final boolean mo103b(C0023al alVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo115c(int i);

    /* renamed from: c */
    public abstract void mo116c(boolean z);

    /* renamed from: c */
    public final boolean mo104c(C0023al alVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo119f() {
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m341a(listAdapter).f94a.mo151a((MenuItem) listAdapter.getItem(i), (C0101aq) this, mo119f() ? 0 : 4);
    }
}
