package a.b.o.j;

import a.b.d;
import a.b.o.j.m;
import a.h.m.s;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f237a;

    /* renamed from: b  reason: collision with root package name */
    public final g f238b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f239c;

    /* renamed from: d  reason: collision with root package name */
    public final int f240d;

    /* renamed from: e  reason: collision with root package name */
    public final int f241e;

    /* renamed from: f  reason: collision with root package name */
    public View f242f;

    /* renamed from: g  reason: collision with root package name */
    public int f243g;
    public boolean h;
    public m.a i;
    public k j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l;

    public l(Context context, g menu, View anchorView, boolean overflowOnly, int popupStyleAttr) {
        this(context, menu, anchorView, overflowOnly, popupStyleAttr, 0);
    }

    public l(Context context, g menu, View anchorView, boolean overflowOnly, int popupStyleAttr, int popupStyleRes) {
        this.f243g = 8388611;
        this.l = new a();
        this.f237a = context;
        this.f238b = menu;
        this.f242f = anchorView;
        this.f239c = overflowOnly;
        this.f240d = popupStyleAttr;
        this.f241e = popupStyleRes;
    }

    public void i(PopupWindow.OnDismissListener listener) {
        this.k = listener;
    }

    public void f(View anchor) {
        this.f242f = anchor;
    }

    public void g(boolean forceShowIcon) {
        this.h = forceShowIcon;
        k kVar = this.j;
        if (kVar != null) {
            kVar.r(forceShowIcon);
        }
    }

    public void h(int gravity) {
        this.f243g = gravity;
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public k c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f242f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int x, int y) {
        if (d()) {
            return true;
        }
        if (this.f242f == null) {
            return false;
        }
        l(x, y, true, true);
        return true;
    }

    public final k a() {
        k popup;
        Display display = ((WindowManager) this.f237a.getSystemService("window")).getDefaultDisplay();
        Point displaySize = new Point();
        display.getRealSize(displaySize);
        if (Math.min(displaySize.x, displaySize.y) >= this.f237a.getResources().getDimensionPixelSize(d.abc_cascading_menus_min_smallest_width)) {
            popup = new d(this.f237a, this.f242f, this.f240d, this.f241e, this.f239c);
        } else {
            popup = new q(this.f237a, this.f238b, this.f242f, this.f240d, this.f241e, this.f239c);
        }
        popup.l(this.f238b);
        popup.u(this.l);
        popup.p(this.f242f);
        popup.h(this.i);
        popup.r(this.h);
        popup.s(this.f243g);
        return popup;
    }

    public final void l(int xOffset, int yOffset, boolean useOffsets, boolean showTitle) {
        k popup = c();
        popup.v(showTitle);
        if (useOffsets) {
            if ((a.h.m.d.b(this.f243g, s.v(this.f242f)) & 7) == 5) {
                xOffset -= this.f242f.getWidth();
            }
            popup.t(xOffset);
            popup.w(yOffset);
            int halfSize = (int) ((48.0f * this.f237a.getResources().getDisplayMetrics().density) / 2.0f);
            popup.q(new Rect(xOffset - halfSize, yOffset - halfSize, xOffset + halfSize, yOffset + halfSize));
        }
        popup.f();
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean d() {
        k kVar = this.j;
        return kVar != null && kVar.b();
    }

    public void j(m.a cb) {
        this.i = cb;
        k kVar = this.j;
        if (kVar != null) {
            kVar.h(cb);
        }
    }

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            l.this.e();
        }
    }
}
