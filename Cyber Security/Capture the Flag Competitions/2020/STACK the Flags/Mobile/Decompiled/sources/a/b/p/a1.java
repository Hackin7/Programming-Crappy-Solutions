package a.b.p;

import a.h.m.s;
import a.h.m.t;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

public class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static a1 k;
    public static a1 l;

    /* renamed from: b  reason: collision with root package name */
    public final View f270b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f271c;

    /* renamed from: d  reason: collision with root package name */
    public final int f272d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f273e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f274f = new b();

    /* renamed from: g  reason: collision with root package name */
    public int f275g;
    public int h;
    public b1 i;
    public boolean j;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            a1.this.g(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a1.this.c();
        }
    }

    public static void f(View view, CharSequence tooltipText) {
        a1 a1Var = k;
        if (a1Var != null && a1Var.f270b == view) {
            e(null);
        }
        if (TextUtils.isEmpty(tooltipText)) {
            a1 a1Var2 = l;
            if (a1Var2 != null && a1Var2.f270b == view) {
                a1Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new a1(view, tooltipText);
    }

    public a1(View anchor, CharSequence tooltipText) {
        this.f270b = anchor;
        this.f271c = tooltipText;
        this.f272d = t.c(ViewConfiguration.get(anchor.getContext()));
        b();
        this.f270b.setOnLongClickListener(this);
        this.f270b.setOnHoverListener(this);
    }

    public boolean onLongClick(View v) {
        this.f275g = v.getWidth() / 2;
        this.h = v.getHeight() / 2;
        g(true);
        return true;
    }

    public boolean onHover(View v, MotionEvent event) {
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager manager = (AccessibilityManager) this.f270b.getContext().getSystemService("accessibility");
        if (manager.isEnabled() && manager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f270b.isEnabled() && this.i == null && h(event)) {
            e(this);
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        c();
    }

    public void g(boolean fromTouch) {
        long timeout;
        if (s.J(this.f270b)) {
            e(null);
            a1 a1Var = l;
            if (a1Var != null) {
                a1Var.c();
            }
            l = this;
            this.j = fromTouch;
            b1 b1Var = new b1(this.f270b.getContext());
            this.i = b1Var;
            b1Var.e(this.f270b, this.f275g, this.h, this.j, this.f271c);
            this.f270b.addOnAttachStateChangeListener(this);
            if (this.j) {
                timeout = 2500;
            } else if ((s.C(this.f270b) & 1) == 1) {
                timeout = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                timeout = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f270b.removeCallbacks(this.f274f);
            this.f270b.postDelayed(this.f274f, timeout);
        }
    }

    public void c() {
        if (l == this) {
            l = null;
            b1 b1Var = this.i;
            if (b1Var != null) {
                b1Var.c();
                this.i = null;
                b();
                this.f270b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            e(null);
        }
        this.f270b.removeCallbacks(this.f274f);
    }

    public static void e(a1 handler) {
        a1 a1Var = k;
        if (a1Var != null) {
            a1Var.a();
        }
        k = handler;
        if (handler != null) {
            handler.d();
        }
    }

    public final void d() {
        this.f270b.postDelayed(this.f273e, (long) ViewConfiguration.getLongPressTimeout());
    }

    public final void a() {
        this.f270b.removeCallbacks(this.f273e);
    }

    public final boolean h(MotionEvent event) {
        int newAnchorX = (int) event.getX();
        int newAnchorY = (int) event.getY();
        if (Math.abs(newAnchorX - this.f275g) <= this.f272d && Math.abs(newAnchorY - this.h) <= this.f272d) {
            return false;
        }
        this.f275g = newAnchorX;
        this.h = newAnchorY;
        return true;
    }

    public final void b() {
        this.f275g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }
}
