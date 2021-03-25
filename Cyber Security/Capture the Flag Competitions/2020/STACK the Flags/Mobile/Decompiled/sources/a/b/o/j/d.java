package a.b.o.j;

import a.b.g;
import a.b.o.j.m;
import a.b.p.k0;
import a.b.p.l0;
import a.h.m.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int C = g.abc_cascading_menu_item_layout;
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f179c;

    /* renamed from: d  reason: collision with root package name */
    public final int f180d;

    /* renamed from: e  reason: collision with root package name */
    public final int f181e;

    /* renamed from: f  reason: collision with root package name */
    public final int f182f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f183g;
    public final Handler h;
    public final List<g> i = new ArrayList();
    public final List<C0005d> j = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public final k0 m = new c();
    public int n = 0;
    public int o = 0;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public m.a y;
    public ViewTreeObserver z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.j.size() > 0 && !d.this.j.get(0).f191a.x()) {
                View anchor = d.this.q;
                if (anchor == null || !anchor.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0005d info : d.this.j) {
                    info.f191a.f();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = v.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements k0 {
        public c() {
        }

        @Override // a.b.p.k0
        public void h(g menu, MenuItem item) {
            d.this.h.removeCallbacksAndMessages(menu);
        }

        @Override // a.b.p.k0
        public void e(g menu, MenuItem item) {
            C0005d nextInfo;
            d.this.h.removeCallbacksAndMessages(null);
            int menuIndex = -1;
            int i = 0;
            int count = d.this.j.size();
            while (true) {
                if (i >= count) {
                    break;
                } else if (menu == d.this.j.get(i).f192b) {
                    menuIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (menuIndex != -1) {
                int nextIndex = menuIndex + 1;
                if (nextIndex < d.this.j.size()) {
                    nextInfo = d.this.j.get(nextIndex);
                } else {
                    nextInfo = null;
                }
                d.this.h.postAtTime(new a(nextInfo, item, menu), menu, SystemClock.uptimeMillis() + 200);
            }
        }

        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C0005d f187b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ MenuItem f188c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ g f189d;

            public a(C0005d dVar, MenuItem menuItem, g gVar) {
                this.f187b = dVar;
                this.f188c = menuItem;
                this.f189d = gVar;
            }

            public void run() {
                C0005d dVar = this.f187b;
                if (dVar != null) {
                    d.this.B = true;
                    dVar.f192b.e(false);
                    d.this.B = false;
                }
                if (this.f188c.isEnabled() && this.f188c.hasSubMenu()) {
                    this.f189d.L(this.f188c, 4);
                }
            }
        }
    }

    public d(Context context, View anchor, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f179c = context;
        this.p = anchor;
        this.f181e = popupStyleAttr;
        this.f182f = popupStyleRes;
        this.f183g = overflowOnly;
        this.w = false;
        this.r = D();
        Resources res = context.getResources();
        this.f180d = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(a.b.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // a.b.o.j.k
    public void r(boolean forceShow) {
        this.w = forceShow;
    }

    public final l0 z() {
        l0 popupWindow = new l0(this.f179c, null, this.f181e, this.f182f);
        popupWindow.P(this.m);
        popupWindow.H(this);
        popupWindow.G(this);
        popupWindow.z(this.p);
        popupWindow.C(this.o);
        popupWindow.F(true);
        popupWindow.E(2);
        return popupWindow;
    }

    @Override // a.b.o.j.p
    public void f() {
        if (!b()) {
            for (g menu : this.i) {
                F(menu);
            }
            this.i.clear();
            View view = this.p;
            this.q = view;
            if (view != null) {
                boolean addGlobalListener = this.z == null;
                ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
                this.z = viewTreeObserver;
                if (addGlobalListener) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                this.q.addOnAttachStateChangeListener(this.l);
            }
        }
    }

    @Override // a.b.o.j.p
    public void dismiss() {
        int length = this.j.size();
        if (length > 0) {
            C0005d[] addedMenus = (C0005d[]) this.j.toArray(new C0005d[length]);
            for (int i2 = length - 1; i2 >= 0; i2--) {
                C0005d info = addedMenus[i2];
                if (info.f191a.b()) {
                    info.f191a.dismiss();
                }
            }
        }
    }

    public boolean onKey(View v2, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final int D() {
        return s.v(this.p) == 1 ? 0 : 1;
    }

    public final int E(int nextMenuWidth) {
        List<C0005d> list = this.j;
        ListView lastListView = list.get(list.size() - 1).a();
        int[] screenLocation = new int[2];
        lastListView.getLocationOnScreen(screenLocation);
        Rect displayFrame = new Rect();
        this.q.getWindowVisibleDisplayFrame(displayFrame);
        if (this.r == 1) {
            if (screenLocation[0] + lastListView.getWidth() + nextMenuWidth > displayFrame.right) {
                return 0;
            }
            return 1;
        } else if (screenLocation[0] - nextMenuWidth < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // a.b.o.j.k
    public void l(g menu) {
        menu.c(this, this.f179c);
        if (b()) {
            F(menu);
        } else {
            this.i.add(menu);
        }
    }

    public final void F(g menu) {
        View parentView;
        C0005d parentInfo;
        int parentOffsetY;
        int parentOffsetX;
        int x2;
        LayoutInflater inflater = LayoutInflater.from(this.f179c);
        f adapter = new f(menu, inflater, this.f183g, C);
        if (!b() && this.w) {
            adapter.d(true);
        } else if (b()) {
            adapter.d(k.x(menu));
        }
        int menuWidth = k.o(adapter, null, this.f179c, this.f180d);
        l0 popupWindow = z();
        popupWindow.o(adapter);
        popupWindow.B(menuWidth);
        popupWindow.C(this.o);
        if (this.j.size() > 0) {
            List<C0005d> list = this.j;
            parentInfo = list.get(list.size() - 1);
            parentView = C(parentInfo, menu);
        } else {
            parentInfo = null;
            parentView = null;
        }
        if (parentView != null) {
            popupWindow.Q(false);
            popupWindow.N(null);
            int nextMenuPosition = E(menuWidth);
            boolean showOnRight = nextMenuPosition == 1;
            this.r = nextMenuPosition;
            if (Build.VERSION.SDK_INT >= 26) {
                popupWindow.z(parentView);
                parentOffsetX = 0;
                parentOffsetY = 0;
            } else {
                int[] anchorScreenLocation = new int[2];
                this.p.getLocationOnScreen(anchorScreenLocation);
                int[] parentViewScreenLocation = new int[2];
                parentView.getLocationOnScreen(parentViewScreenLocation);
                if ((this.o & 7) == 5) {
                    anchorScreenLocation[0] = anchorScreenLocation[0] + this.p.getWidth();
                    parentViewScreenLocation[0] = parentViewScreenLocation[0] + parentView.getWidth();
                }
                parentOffsetX = parentViewScreenLocation[0] - anchorScreenLocation[0];
                parentOffsetY = parentViewScreenLocation[1] - anchorScreenLocation[1];
            }
            if ((this.o & 5) == 5) {
                if (showOnRight) {
                    x2 = parentOffsetX + menuWidth;
                } else {
                    x2 = parentOffsetX - parentView.getWidth();
                }
            } else if (showOnRight) {
                x2 = parentView.getWidth() + parentOffsetX;
            } else {
                x2 = parentOffsetX - menuWidth;
            }
            popupWindow.a(x2);
            popupWindow.I(true);
            popupWindow.n(parentOffsetY);
        } else {
            if (this.s) {
                popupWindow.a(this.u);
            }
            if (this.t) {
                popupWindow.n(this.v);
            }
            popupWindow.D(n());
        }
        this.j.add(new C0005d(popupWindow, menu, this.r));
        popupWindow.f();
        ListView listView = popupWindow.k();
        listView.setOnKeyListener(this);
        if (parentInfo == null && this.x && menu.x() != null) {
            FrameLayout titleItemView = (FrameLayout) inflater.inflate(g.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            titleItemView.setEnabled(false);
            ((TextView) titleItemView.findViewById(16908310)).setText(menu.x());
            listView.addHeaderView(titleItemView, null, false);
            popupWindow.f();
        }
    }

    public final MenuItem B(g parent, g submenu) {
        int count = parent.size();
        for (int i2 = 0; i2 < count; i2++) {
            MenuItem item = parent.getItem(i2);
            if (item.hasSubMenu() && submenu == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(C0005d parentInfo, g submenu) {
        int headersCount;
        f menuAdapter;
        int ownerViewPosition;
        MenuItem owner = B(parentInfo.f192b, submenu);
        if (owner == null) {
            return null;
        }
        ListView listView = parentInfo.a();
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) listAdapter;
            headersCount = headerAdapter.getHeadersCount();
            menuAdapter = (f) headerAdapter.getWrappedAdapter();
        } else {
            headersCount = 0;
            menuAdapter = (f) listAdapter;
        }
        int ownerPosition = -1;
        int i2 = 0;
        int count = menuAdapter.getCount();
        while (true) {
            if (i2 >= count) {
                break;
            } else if (owner == menuAdapter.getItem(i2)) {
                ownerPosition = i2;
                break;
            } else {
                i2++;
            }
        }
        if (ownerPosition != -1 && (ownerViewPosition = (ownerPosition + headersCount) - listView.getFirstVisiblePosition()) >= 0 && ownerViewPosition < listView.getChildCount()) {
            return listView.getChildAt(ownerViewPosition);
        }
        return null;
    }

    @Override // a.b.o.j.p
    public boolean b() {
        return this.j.size() > 0 && this.j.get(0).f191a.b();
    }

    public void onDismiss() {
        C0005d dismissedInfo = null;
        int i2 = 0;
        int count = this.j.size();
        while (true) {
            if (i2 >= count) {
                break;
            }
            C0005d info = this.j.get(i2);
            if (!info.f191a.b()) {
                dismissedInfo = info;
                break;
            }
            i2++;
        }
        if (dismissedInfo != null) {
            dismissedInfo.f192b.e(false);
        }
    }

    @Override // a.b.o.j.m
    public void j(boolean cleared) {
        for (C0005d info : this.j) {
            k.y(info.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // a.b.o.j.m
    public void h(m.a cb) {
        this.y = cb;
    }

    @Override // a.b.o.j.m
    public boolean i(r subMenu) {
        for (C0005d info : this.j) {
            if (subMenu == info.f192b) {
                info.a().requestFocus();
                return true;
            }
        }
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        l(subMenu);
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.b(subMenu);
        }
        return true;
    }

    public final int A(g menu) {
        int count = this.j.size();
        for (int i2 = 0; i2 < count; i2++) {
            if (menu == this.j.get(i2).f192b) {
                return i2;
            }
        }
        return -1;
    }

    @Override // a.b.o.j.m
    public void a(g menu, boolean allMenusAreClosing) {
        int menuIndex = A(menu);
        if (menuIndex >= 0) {
            int nextMenuIndex = menuIndex + 1;
            if (nextMenuIndex < this.j.size()) {
                this.j.get(nextMenuIndex).f192b.e(false);
            }
            C0005d info = this.j.remove(menuIndex);
            info.f192b.O(this);
            if (this.B) {
                info.f191a.O(null);
                info.f191a.A(0);
            }
            info.f191a.dismiss();
            int count = this.j.size();
            if (count > 0) {
                this.r = this.j.get(count - 1).f193c;
            } else {
                this.r = D();
            }
            if (count == 0) {
                dismiss();
                m.a aVar = this.y;
                if (aVar != null) {
                    aVar.a(menu, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.l);
                this.A.onDismiss();
            } else if (allMenusAreClosing) {
                this.j.get(0).f192b.e(false);
            }
        }
    }

    @Override // a.b.o.j.m
    public boolean c() {
        return false;
    }

    @Override // a.b.o.j.k
    public void s(int dropDownGravity) {
        if (this.n != dropDownGravity) {
            this.n = dropDownGravity;
            this.o = a.h.m.d.b(dropDownGravity, s.v(this.p));
        }
    }

    @Override // a.b.o.j.k
    public void p(View anchor) {
        if (this.p != anchor) {
            this.p = anchor;
            this.o = a.h.m.d.b(this.n, s.v(anchor));
        }
    }

    @Override // a.b.o.j.k
    public void u(PopupWindow.OnDismissListener listener) {
        this.A = listener;
    }

    @Override // a.b.o.j.p
    public ListView k() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<C0005d> list = this.j;
        return list.get(list.size() - 1).a();
    }

    @Override // a.b.o.j.k
    public void t(int x2) {
        this.s = true;
        this.u = x2;
    }

    @Override // a.b.o.j.k
    public void w(int y2) {
        this.t = true;
        this.v = y2;
    }

    @Override // a.b.o.j.k
    public void v(boolean showTitle) {
        this.x = showTitle;
    }

    @Override // a.b.o.j.k
    public boolean m() {
        return false;
    }

    /* renamed from: a.b.o.j.d$d  reason: collision with other inner class name */
    public static class C0005d {

        /* renamed from: a  reason: collision with root package name */
        public final l0 f191a;

        /* renamed from: b  reason: collision with root package name */
        public final g f192b;

        /* renamed from: c  reason: collision with root package name */
        public final int f193c;

        public C0005d(l0 window, g menu, int position) {
            this.f191a = window;
            this.f192b = menu;
            this.f193c = position;
        }

        public ListView a() {
            return this.f191a.k();
        }
    }
}
