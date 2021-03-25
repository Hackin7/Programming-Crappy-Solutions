package b.d.a.a.l;

import a.h.m.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import net.sqlcipher.database.SQLiteDatabase;

public abstract class a<V extends View> extends c<V> {

    /* renamed from: d  reason: collision with root package name */
    public Runnable f2557d;

    /* renamed from: e  reason: collision with root package name */
    public OverScroller f2558e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2559f;

    /* renamed from: g  reason: collision with root package name */
    public int f2560g = -1;
    public int h;
    public int i = -1;
    public VelocityTracker j;

    public abstract boolean G(V v);

    public abstract int J(V v);

    public abstract int K(V v);

    public abstract int L();

    public abstract void M(CoordinatorLayout coordinatorLayout, V v);

    public abstract int P(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    public a() {
    }

    public a(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r3 != 3) goto L_0x0083;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout parent, V child, MotionEvent ev) {
        int pointerIndex;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(parent.getContext()).getScaledTouchSlop();
        }
        if (ev.getAction() == 2 && this.f2559f) {
            return true;
        }
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int activePointerId = this.f2560g;
                    if (!(activePointerId == -1 || (pointerIndex = ev.findPointerIndex(activePointerId)) == -1)) {
                        int y = (int) ev.getY(pointerIndex);
                        if (Math.abs(y - this.h) > this.i) {
                            this.f2559f = true;
                            this.h = y;
                        }
                    }
                }
            }
            this.f2559f = false;
            this.f2560g = -1;
            VelocityTracker velocityTracker = this.j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.j = null;
            }
        } else {
            this.f2559f = false;
            int x = (int) ev.getX();
            int y2 = (int) ev.getY();
            if (G(child) && parent.B(child, x, y2)) {
                this.h = y2;
                this.f2560g = ev.getPointerId(0);
                H();
            }
        }
        VelocityTracker velocityTracker2 = this.j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(ev);
        }
        return this.f2559f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00af;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean C(CoordinatorLayout parent, V child, MotionEvent ev) {
        int i2;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(parent.getContext()).getScaledTouchSlop();
        }
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.j;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(ev);
                    this.j.computeCurrentVelocity(SQLiteDatabase.SLEEP_AFTER_YIELD_QUANTUM);
                    I(parent, child, -K(child), 0, this.j.getYVelocity(this.f2560g));
                }
            } else if (actionMasked == 2) {
                int activePointerIndex = ev.findPointerIndex(this.f2560g);
                if (activePointerIndex == -1) {
                    return false;
                }
                int y = (int) ev.getY(activePointerIndex);
                int dy = this.h - y;
                if (!this.f2559f && Math.abs(dy) > (i2 = this.i)) {
                    this.f2559f = true;
                    dy = dy > 0 ? dy - i2 : dy + i2;
                }
                if (this.f2559f) {
                    this.h = y;
                    N(parent, child, dy, J(child), 0);
                }
            }
            this.f2559f = false;
            this.f2560g = -1;
            VelocityTracker velocityTracker2 = this.j;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.j = null;
            }
        } else {
            int y2 = (int) ev.getY();
            if (!parent.B(child, (int) ev.getX(), y2) || !G(child)) {
                return false;
            }
            this.h = y2;
            this.f2560g = ev.getPointerId(0);
            H();
        }
        VelocityTracker velocityTracker3 = this.j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(ev);
        }
        return true;
    }

    public int O(CoordinatorLayout parent, V header, int newOffset) {
        return P(parent, header, newOffset, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final int N(CoordinatorLayout coordinatorLayout, V header, int dy, int minOffset, int maxOffset) {
        return P(coordinatorLayout, header, L() - dy, minOffset, maxOffset);
    }

    public final boolean I(CoordinatorLayout coordinatorLayout, V layout, int minOffset, int maxOffset, float velocityY) {
        Runnable runnable = this.f2557d;
        if (runnable != null) {
            layout.removeCallbacks(runnable);
            this.f2557d = null;
        }
        if (this.f2558e == null) {
            this.f2558e = new OverScroller(layout.getContext());
        }
        this.f2558e.fling(0, D(), 0, Math.round(velocityY), 0, 0, minOffset, maxOffset);
        if (this.f2558e.computeScrollOffset()) {
            RunnableC0053a aVar = new RunnableC0053a(coordinatorLayout, layout);
            this.f2557d = aVar;
            s.U(layout, aVar);
            return true;
        }
        M(coordinatorLayout, layout);
        return false;
    }

    public final void H() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* renamed from: b.d.a.a.l.a$a  reason: collision with other inner class name */
    public class RunnableC0053a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final CoordinatorLayout f2561b;

        /* renamed from: c  reason: collision with root package name */
        public final V f2562c;

        public RunnableC0053a(CoordinatorLayout parent, V layout) {
            this.f2561b = parent;
            this.f2562c = layout;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: b.d.a.a.l.a */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: b.d.a.a.l.a */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.f2562c != null && (overScroller = a.this.f2558e) != null) {
                if (overScroller.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.O(this.f2561b, this.f2562c, aVar.f2558e.getCurrY());
                    s.U(this.f2562c, this);
                    return;
                }
                a.this.M(this.f2561b, this.f2562c);
            }
        }
    }
}
