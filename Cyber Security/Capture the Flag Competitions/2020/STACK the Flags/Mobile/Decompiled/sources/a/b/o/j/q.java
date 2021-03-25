package a.b.o.j;

import a.b.d;
import a.b.g;
import a.b.o.j.m;
import a.b.p.l0;
import a.h.m.s;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    public static final int w = g.abc_popup_menu_item_layout;

    /* renamed from: c  reason: collision with root package name */
    public final Context f246c;

    /* renamed from: d  reason: collision with root package name */
    public final g f247d;

    /* renamed from: e  reason: collision with root package name */
    public final f f248e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f249f;

    /* renamed from: g  reason: collision with root package name */
    public final int f250g;
    public final int h;
    public final int i;
    public final l0 j;
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public m.a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public int u = 0;
    public boolean v;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (q.this.b() && !q.this.j.x()) {
                View anchor = q.this.o;
                if (anchor == null || !anchor.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.j.f();
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
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = v.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.k);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g menu, View anchorView, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f246c = context;
        this.f247d = menu;
        this.f249f = overflowOnly;
        this.f248e = new f(menu, LayoutInflater.from(context), this.f249f, w);
        this.h = popupStyleAttr;
        this.i = popupStyleRes;
        Resources res = context.getResources();
        this.f250g = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.n = anchorView;
        this.j = new l0(this.f246c, null, this.h, this.i);
        menu.c(this, context);
    }

    @Override // a.b.o.j.k
    public void r(boolean forceShow) {
        this.f248e.d(forceShow);
    }

    @Override // a.b.o.j.k
    public void s(int gravity) {
        this.u = gravity;
    }

    public final boolean z() {
        View view;
        if (b()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.G(this);
        this.j.H(this);
        this.j.F(true);
        View anchor = this.o;
        boolean addGlobalListener = this.q == null;
        ViewTreeObserver viewTreeObserver = anchor.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (addGlobalListener) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        anchor.addOnAttachStateChangeListener(this.l);
        this.j.z(anchor);
        this.j.C(this.u);
        if (!this.s) {
            this.t = k.o(this.f248e, null, this.f246c, this.f250g);
            this.s = true;
        }
        this.j.B(this.t);
        this.j.E(2);
        this.j.D(n());
        this.j.f();
        ListView listView = this.j.k();
        listView.setOnKeyListener(this);
        if (this.v && this.f247d.x() != null) {
            FrameLayout titleItemView = (FrameLayout) LayoutInflater.from(this.f246c).inflate(g.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(16908310);
            if (titleView != null) {
                titleView.setText(this.f247d.x());
            }
            titleItemView.setEnabled(false);
            listView.addHeaderView(titleItemView, null, false);
        }
        this.j.o(this.f248e);
        this.j.f();
        return true;
    }

    @Override // a.b.o.j.p
    public void f() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // a.b.o.j.p
    public void dismiss() {
        if (b()) {
            this.j.dismiss();
        }
    }

    @Override // a.b.o.j.k
    public void l(g menu) {
    }

    @Override // a.b.o.j.p
    public boolean b() {
        return !this.r && this.j.b();
    }

    public void onDismiss() {
        this.r = true;
        this.f247d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // a.b.o.j.m
    public void j(boolean cleared) {
        this.s = false;
        f fVar = this.f248e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.o.j.m
    public void h(m.a cb) {
        this.p = cb;
    }

    @Override // a.b.o.j.m
    public boolean i(r subMenu) {
        if (subMenu.hasVisibleItems()) {
            l subPopup = new l(this.f246c, subMenu, this.o, this.f249f, this.h, this.i);
            subPopup.j(this.p);
            subPopup.g(k.x(subMenu));
            subPopup.i(this.m);
            this.m = null;
            this.f247d.e(false);
            int horizontalOffset = this.j.c();
            int verticalOffset = this.j.g();
            if ((Gravity.getAbsoluteGravity(this.u, s.v(this.n)) & 7) == 5) {
                horizontalOffset += this.n.getWidth();
            }
            if (subPopup.n(horizontalOffset, verticalOffset)) {
                m.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.b(subMenu);
                return true;
            }
        }
        return false;
    }

    @Override // a.b.o.j.m
    public void a(g menu, boolean allMenusAreClosing) {
        if (menu == this.f247d) {
            dismiss();
            m.a aVar = this.p;
            if (aVar != null) {
                aVar.a(menu, allMenusAreClosing);
            }
        }
    }

    @Override // a.b.o.j.m
    public boolean c() {
        return false;
    }

    @Override // a.b.o.j.k
    public void p(View anchor) {
        this.n = anchor;
    }

    public boolean onKey(View v2, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // a.b.o.j.k
    public void u(PopupWindow.OnDismissListener listener) {
        this.m = listener;
    }

    @Override // a.b.o.j.p
    public ListView k() {
        return this.j.k();
    }

    @Override // a.b.o.j.k
    public void t(int x) {
        this.j.a(x);
    }

    @Override // a.b.o.j.k
    public void w(int y) {
        this.j.n(y);
    }

    @Override // a.b.o.j.k
    public void v(boolean showTitle) {
        this.v = showTitle;
    }
}
