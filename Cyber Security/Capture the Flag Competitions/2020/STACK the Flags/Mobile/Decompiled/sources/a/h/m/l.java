package a.h.m;

import android.view.View;
import android.view.ViewParent;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f950a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f951b;

    /* renamed from: c  reason: collision with root package name */
    public final View f952c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f953d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f954e;

    public l(View view) {
        this.f952c = view;
    }

    public void n(boolean enabled) {
        if (this.f953d) {
            s.o0(this.f952c);
        }
        this.f953d = enabled;
    }

    public boolean m() {
        return this.f953d;
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int type) {
        return i(type) != null;
    }

    public boolean p(int axes) {
        return q(axes, 0);
    }

    public boolean q(int axes, int type) {
        if (l(type)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View child = this.f952c;
        for (ViewParent p = this.f952c.getParent(); p != null; p = p.getParent()) {
            if (w.f(p, child, this.f952c, axes, type)) {
                o(type, p);
                w.e(p, child, this.f952c, axes, type);
                return true;
            }
            if (p instanceof View) {
                child = (View) p;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int type) {
        ViewParent parent = i(type);
        if (parent != null) {
            w.g(parent, this.f952c, type);
            o(type, null);
        }
    }

    public boolean f(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return h(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0, null);
    }

    public boolean g(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return h(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, null);
    }

    public void e(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        h(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    public final boolean h(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        int startY;
        int startX;
        int[] consumed2;
        if (m()) {
            ViewParent parent = i(type);
            if (parent == null) {
                return false;
            }
            if (dxConsumed != 0 || dyConsumed != 0 || dxUnconsumed != 0 || dyUnconsumed != 0) {
                if (offsetInWindow != null) {
                    this.f952c.getLocationInWindow(offsetInWindow);
                    startX = offsetInWindow[0];
                    startY = offsetInWindow[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                if (consumed == null) {
                    int[] consumed3 = j();
                    consumed3[0] = 0;
                    consumed3[1] = 0;
                    consumed2 = consumed3;
                } else {
                    consumed2 = consumed;
                }
                w.d(parent, this.f952c, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed2);
                if (offsetInWindow != null) {
                    this.f952c.getLocationInWindow(offsetInWindow);
                    offsetInWindow[0] = offsetInWindow[0] - startX;
                    offsetInWindow[1] = offsetInWindow[1] - startY;
                }
                return true;
            } else if (offsetInWindow != null) {
                offsetInWindow[0] = 0;
                offsetInWindow[1] = 0;
            }
        }
        return false;
    }

    public boolean c(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return d(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean d(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        int startY;
        int startX;
        int[] consumed2;
        if (m()) {
            ViewParent parent = i(type);
            if (parent == null) {
                return false;
            }
            if (dx != 0 || dy != 0) {
                if (offsetInWindow != null) {
                    this.f952c.getLocationInWindow(offsetInWindow);
                    startX = offsetInWindow[0];
                    startY = offsetInWindow[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                if (consumed == null) {
                    consumed2 = j();
                } else {
                    consumed2 = consumed;
                }
                consumed2[0] = 0;
                consumed2[1] = 0;
                w.c(parent, this.f952c, dx, dy, consumed2, type);
                if (offsetInWindow != null) {
                    this.f952c.getLocationInWindow(offsetInWindow);
                    offsetInWindow[0] = offsetInWindow[0] - startX;
                    offsetInWindow[1] = offsetInWindow[1] - startY;
                }
                return (consumed2[0] == 0 && consumed2[1] == 0) ? false : true;
            } else if (offsetInWindow != null) {
                offsetInWindow[0] = 0;
                offsetInWindow[1] = 0;
            }
        }
        return false;
    }

    public boolean a(float velocityX, float velocityY, boolean consumed) {
        ViewParent parent;
        if (!m() || (parent = i(0)) == null) {
            return false;
        }
        return w.a(parent, this.f952c, velocityX, velocityY, consumed);
    }

    public boolean b(float velocityX, float velocityY) {
        ViewParent parent;
        if (!m() || (parent = i(0)) == null) {
            return false;
        }
        return w.b(parent, this.f952c, velocityX, velocityY);
    }

    public final ViewParent i(int type) {
        if (type == 0) {
            return this.f950a;
        }
        if (type != 1) {
            return null;
        }
        return this.f951b;
    }

    public final void o(int type, ViewParent p) {
        if (type == 0) {
            this.f950a = p;
        } else if (type == 1) {
            this.f951b = p;
        }
    }

    public final int[] j() {
        if (this.f954e == null) {
            this.f954e = new int[2];
        }
        return this.f954e;
    }
}
