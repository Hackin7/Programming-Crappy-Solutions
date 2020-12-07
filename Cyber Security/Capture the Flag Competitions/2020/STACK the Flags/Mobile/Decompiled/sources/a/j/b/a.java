package a.j.b;

import a.h.m.s;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import net.sqlcipher.database.SQLiteDatabase;

public class a {
    public static final Interpolator v = new animation.InterpolatorC0029a();

    /* renamed from: a  reason: collision with root package name */
    public int f1021a;

    /* renamed from: b  reason: collision with root package name */
    public int f1022b;

    /* renamed from: c  reason: collision with root package name */
    public int f1023c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f1024d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f1025e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f1026f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f1027g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public OverScroller p;
    public final c q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public final Runnable u = new b();

    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public abstract void j(int i);

        public abstract void k(View view, int i, int i2, int i3, int i4);

        public abstract void l(View view, float f2, float f3);

        public abstract boolean m(View view, int i);

        public void i(View capturedChild, int activePointerId) {
        }

        public void h() {
        }

        public boolean g() {
            return false;
        }

        public void f() {
        }

        public int c(int index) {
            return index;
        }

        public int d(View child) {
            return 0;
        }

        public int e(View child) {
            return 0;
        }
    }

    /* renamed from: a.j.b.a$a  reason: collision with other inner class name */
    public static class animation.InterpolatorC0029a implements Interpolator {
        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a.this.D(0);
        }
    }

    public static a l(ViewGroup forParent, c cb) {
        return new a(forParent.getContext(), forParent, cb);
    }

    public a(Context context, ViewGroup forParent, c cb) {
        if (forParent == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cb != null) {
            this.t = forParent;
            this.q = cb;
            ViewConfiguration vc = ViewConfiguration.get(context);
            this.o = (int) ((20.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.f1022b = vc.getScaledTouchSlop();
            this.m = (float) vc.getScaledMaximumFlingVelocity();
            this.n = (float) vc.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public void b(View childView, int activePointerId) {
        if (childView.getParent() == this.t) {
            this.r = childView;
            this.f1023c = activePointerId;
            this.q.i(childView, activePointerId);
            D(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.t + ")");
    }

    public int t() {
        return this.f1022b;
    }

    public void a() {
        this.f1023c = -1;
        g();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public boolean G(View child, int finalLeft, int finalTop) {
        this.r = child;
        this.f1023c = -1;
        boolean continueSliding = r(finalLeft, finalTop, 0, 0);
        if (!continueSliding && this.f1021a == 0 && this.r != null) {
            this.r = null;
        }
        return continueSliding;
    }

    public boolean E(int finalLeft, int finalTop) {
        if (this.s) {
            return r(finalLeft, finalTop, (int) this.l.getXVelocity(this.f1023c), (int) this.l.getYVelocity(this.f1023c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean r(int finalLeft, int finalTop, int xvel, int yvel) {
        int startLeft = this.r.getLeft();
        int startTop = this.r.getTop();
        int dx = finalLeft - startLeft;
        int dy = finalTop - startTop;
        if (dx == 0 && dy == 0) {
            this.p.abortAnimation();
            D(0);
            return false;
        }
        this.p.startScroll(startLeft, startTop, dx, dy, j(this.r, dx, dy, xvel, yvel));
        D(2);
        return true;
    }

    public final int j(View child, int dx, int dy, int xvel, int yvel) {
        float f2;
        float f3;
        float f4;
        float f5;
        int xvel2 = f(xvel, (int) this.n, (int) this.m);
        int yvel2 = f(yvel, (int) this.n, (int) this.m);
        int absDx = Math.abs(dx);
        int absDy = Math.abs(dy);
        int absXVel = Math.abs(xvel2);
        int absYVel = Math.abs(yvel2);
        int addedVel = absXVel + absYVel;
        int addedDistance = absDx + absDy;
        if (xvel2 != 0) {
            f3 = (float) absXVel;
            f2 = (float) addedVel;
        } else {
            f3 = (float) absDx;
            f2 = (float) addedDistance;
        }
        float xweight = f3 / f2;
        if (yvel2 != 0) {
            f5 = (float) absYVel;
            f4 = (float) addedVel;
        } else {
            f5 = (float) absDy;
            f4 = (float) addedDistance;
        }
        float yweight = f5 / f4;
        return (int) ((((float) i(dx, xvel2, this.q.d(child))) * xweight) + (((float) i(dy, yvel2, this.q.e(child))) * yweight));
    }

    public final int i(int delta, int velocity, int motionRange) {
        int duration;
        if (delta == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        int halfWidth = width / 2;
        float distance = ((float) halfWidth) + (((float) halfWidth) * n(Math.min(1.0f, ((float) Math.abs(delta)) / ((float) width))));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / ((float) velocity2)) * 1000.0f) * 4;
        } else {
            duration = (int) ((1.0f + (((float) Math.abs(delta)) / ((float) motionRange))) * 256.0f);
        }
        return Math.min(duration, 600);
    }

    public final int f(int value, int absMin, int absMax) {
        int absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0;
        }
        if (absValue > absMax) {
            return value > 0 ? absMax : -absMax;
        }
        return value;
    }

    public final float e(float value, float absMin, float absMax) {
        float absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0.0f;
        }
        if (absValue > absMax) {
            return value > 0.0f ? absMax : -absMax;
        }
        return value;
    }

    public final float n(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    public boolean k(boolean deferCallbacks) {
        if (this.f1021a == 2) {
            boolean keepGoing = this.p.computeScrollOffset();
            int x = this.p.getCurrX();
            int y = this.p.getCurrY();
            int dx = x - this.r.getLeft();
            int dy = y - this.r.getTop();
            if (dx != 0) {
                s.P(this.r, dx);
            }
            if (dy != 0) {
                s.Q(this.r, dy);
            }
            if (!(dx == 0 && dy == 0)) {
                this.q.k(this.r, x, y, dx, dy);
            }
            if (keepGoing && x == this.p.getFinalX() && y == this.p.getFinalY()) {
                this.p.abortAnimation();
                keepGoing = false;
            }
            if (!keepGoing) {
                if (deferCallbacks) {
                    this.t.post(this.u);
                } else {
                    D(0);
                }
            }
        }
        if (this.f1021a == 2) {
            return true;
        }
        return false;
    }

    public final void m(float xvel, float yvel) {
        this.s = true;
        this.q.l(this.r, xvel, yvel);
        this.s = false;
        if (this.f1021a == 1) {
            D(0);
        }
    }

    public final void g() {
        float[] fArr = this.f1024d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1025e, 0.0f);
            Arrays.fill(this.f1026f, 0.0f);
            Arrays.fill(this.f1027g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    public final void h(int pointerId) {
        if (this.f1024d != null && v(pointerId)) {
            this.f1024d[pointerId] = 0.0f;
            this.f1025e[pointerId] = 0.0f;
            this.f1026f[pointerId] = 0.0f;
            this.f1027g[pointerId] = 0.0f;
            this.h[pointerId] = 0;
            this.i[pointerId] = 0;
            this.j[pointerId] = 0;
            this.k &= ~(1 << pointerId);
        }
    }

    public final void p(int pointerId) {
        float[] fArr = this.f1024d;
        if (fArr == null || fArr.length <= pointerId) {
            float[] imx = new float[(pointerId + 1)];
            float[] imy = new float[(pointerId + 1)];
            float[] lmx = new float[(pointerId + 1)];
            float[] lmy = new float[(pointerId + 1)];
            int[] iit = new int[(pointerId + 1)];
            int[] edip = new int[(pointerId + 1)];
            int[] edl = new int[(pointerId + 1)];
            float[] fArr2 = this.f1024d;
            if (fArr2 != null) {
                System.arraycopy(fArr2, 0, imx, 0, fArr2.length);
                float[] fArr3 = this.f1025e;
                System.arraycopy(fArr3, 0, imy, 0, fArr3.length);
                float[] fArr4 = this.f1026f;
                System.arraycopy(fArr4, 0, lmx, 0, fArr4.length);
                float[] fArr5 = this.f1027g;
                System.arraycopy(fArr5, 0, lmy, 0, fArr5.length);
                int[] iArr = this.h;
                System.arraycopy(iArr, 0, iit, 0, iArr.length);
                int[] iArr2 = this.i;
                System.arraycopy(iArr2, 0, edip, 0, iArr2.length);
                int[] iArr3 = this.j;
                System.arraycopy(iArr3, 0, edl, 0, iArr3.length);
            }
            this.f1024d = imx;
            this.f1025e = imy;
            this.f1026f = lmx;
            this.f1027g = lmy;
            this.h = iit;
            this.i = edip;
            this.j = edl;
        }
    }

    public final void B(float x, float y, int pointerId) {
        p(pointerId);
        float[] fArr = this.f1024d;
        this.f1026f[pointerId] = x;
        fArr[pointerId] = x;
        float[] fArr2 = this.f1025e;
        this.f1027g[pointerId] = y;
        fArr2[pointerId] = y;
        this.h[pointerId] = s((int) x, (int) y);
        this.k |= 1 << pointerId;
    }

    public final void C(MotionEvent ev) {
        int pointerCount = ev.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = ev.getPointerId(i2);
            if (w(pointerId)) {
                float x = ev.getX(i2);
                float y = ev.getY(i2);
                this.f1026f[pointerId] = x;
                this.f1027g[pointerId] = y;
            }
        }
    }

    public boolean v(int pointerId) {
        return (this.k & (1 << pointerId)) != 0;
    }

    public void D(int state) {
        this.t.removeCallbacks(this.u);
        if (this.f1021a != state) {
            this.f1021a = state;
            this.q.j(state);
            if (this.f1021a == 0) {
                this.r = null;
            }
        }
    }

    public boolean H(View toCapture, int pointerId) {
        if (toCapture == this.r && this.f1023c == pointerId) {
            return true;
        }
        if (toCapture == null || !this.q.m(toCapture, pointerId)) {
            return false;
        }
        this.f1023c = pointerId;
        b(toCapture, pointerId);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010d, code lost:
        if (r2 != r15) goto L_0x011c;
     */
    public boolean F(MotionEvent ev) {
        boolean z;
        int pointerCount;
        int actionIndex;
        int action;
        int action2 = ev.getActionMasked();
        int actionIndex2 = ev.getActionIndex();
        if (action2 == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(ev);
        if (action2 != 0) {
            if (action2 != 1) {
                if (action2 != 2) {
                    if (action2 != 3) {
                        if (action2 == 5) {
                            int pointerId = ev.getPointerId(actionIndex2);
                            float x = ev.getX(actionIndex2);
                            float y = ev.getY(actionIndex2);
                            B(x, y, pointerId);
                            int i2 = this.f1021a;
                            if (i2 == 0) {
                                if ((this.h[pointerId] & 0) != 0) {
                                    this.q.h();
                                }
                            } else if (i2 == 2) {
                                View toCapture = q((int) x, (int) y);
                                if (toCapture == this.r) {
                                    H(toCapture, pointerId);
                                }
                                z = false;
                            }
                            z = false;
                        } else if (action2 != 6) {
                            z = false;
                        } else {
                            h(ev.getPointerId(actionIndex2));
                            z = false;
                        }
                    }
                } else if (this.f1024d == null) {
                    z = false;
                } else if (this.f1025e == null) {
                    z = false;
                } else {
                    int pointerCount2 = ev.getPointerCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= pointerCount2) {
                            break;
                        }
                        int pointerId2 = ev.getPointerId(i3);
                        if (w(pointerId2)) {
                            float x2 = ev.getX(i3);
                            float y2 = ev.getY(i3);
                            float dx = x2 - this.f1024d[pointerId2];
                            float dy = y2 - this.f1025e[pointerId2];
                            View toCapture2 = q((int) x2, (int) y2);
                            boolean pastSlop = toCapture2 != null && d(toCapture2, dx, dy);
                            if (pastSlop) {
                                int oldLeft = toCapture2.getLeft();
                                action = action2;
                                int newLeft = this.q.a(toCapture2, ((int) dx) + oldLeft, (int) dx);
                                int oldTop = toCapture2.getTop();
                                actionIndex = actionIndex2;
                                pointerCount = pointerCount2;
                                int newTop = this.q.b(toCapture2, ((int) dy) + oldTop, (int) dy);
                                int hDragRange = this.q.d(toCapture2);
                                int vDragRange = this.q.e(toCapture2);
                                if (hDragRange != 0) {
                                    if (hDragRange > 0) {
                                    }
                                }
                                if (vDragRange != 0) {
                                    if (vDragRange > 0 && newTop == oldTop) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                action = action2;
                                actionIndex = actionIndex2;
                                pointerCount = pointerCount2;
                            }
                            A(dx, dy, pointerId2);
                            if (this.f1021a != 1) {
                                if (pastSlop && H(toCapture2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            action = action2;
                            actionIndex = actionIndex2;
                            pointerCount = pointerCount2;
                        }
                        i3++;
                        action2 = action;
                        actionIndex2 = actionIndex;
                        pointerCount2 = pointerCount;
                    }
                    C(ev);
                    z = false;
                }
            }
            a();
            z = false;
        } else {
            float x3 = ev.getX();
            float y3 = ev.getY();
            z = false;
            int pointerId3 = ev.getPointerId(0);
            B(x3, y3, pointerId3);
            View toCapture3 = q((int) x3, (int) y3);
            if (toCapture3 == this.r && this.f1021a == 2) {
                H(toCapture3, pointerId3);
            }
            if ((this.h[pointerId3] & 0) != 0) {
                this.q.h();
            }
        }
        if (this.f1021a == 1) {
            return true;
        }
        return z;
    }

    public void y(MotionEvent ev) {
        int action = ev.getActionMasked();
        int actionIndex = ev.getActionIndex();
        if (action == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(ev);
        if (action == 0) {
            float x = ev.getX();
            float y = ev.getY();
            int pointerId = ev.getPointerId(0);
            View toCapture = q((int) x, (int) y);
            B(x, y, pointerId);
            H(toCapture, pointerId);
            if ((this.h[pointerId] & 0) != 0) {
                this.q.h();
            }
        } else if (action == 1) {
            if (this.f1021a == 1) {
                z();
            }
            a();
        } else if (action != 2) {
            if (action == 3) {
                if (this.f1021a == 1) {
                    m(0.0f, 0.0f);
                }
                a();
            } else if (action == 5) {
                int pointerId2 = ev.getPointerId(actionIndex);
                float x2 = ev.getX(actionIndex);
                float y2 = ev.getY(actionIndex);
                B(x2, y2, pointerId2);
                if (this.f1021a == 0) {
                    H(q((int) x2, (int) y2), pointerId2);
                    if ((this.h[pointerId2] & 0) != 0) {
                        this.q.h();
                    }
                } else if (u((int) x2, (int) y2)) {
                    H(this.r, pointerId2);
                }
            } else if (action == 6) {
                int pointerId3 = ev.getPointerId(actionIndex);
                if (this.f1021a == 1 && pointerId3 == this.f1023c) {
                    int newActivePointer = -1;
                    int pointerCount = ev.getPointerCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= pointerCount) {
                            break;
                        }
                        int id = ev.getPointerId(i2);
                        if (id != this.f1023c) {
                            View q2 = q((int) ev.getX(i2), (int) ev.getY(i2));
                            View view = this.r;
                            if (q2 == view && H(view, id)) {
                                newActivePointer = this.f1023c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (newActivePointer == -1) {
                        z();
                    }
                }
                h(pointerId3);
            }
        } else if (this.f1021a != 1) {
            int pointerCount2 = ev.getPointerCount();
            for (int i3 = 0; i3 < pointerCount2; i3++) {
                int pointerId4 = ev.getPointerId(i3);
                if (w(pointerId4)) {
                    float x3 = ev.getX(i3);
                    float y3 = ev.getY(i3);
                    float dx = x3 - this.f1024d[pointerId4];
                    float dy = y3 - this.f1025e[pointerId4];
                    A(dx, dy, pointerId4);
                    if (this.f1021a == 1) {
                        break;
                    }
                    View toCapture2 = q((int) x3, (int) y3);
                    if (d(toCapture2, dx, dy) && H(toCapture2, pointerId4)) {
                        break;
                    }
                }
            }
            C(ev);
        } else if (w(this.f1023c)) {
            int index = ev.findPointerIndex(this.f1023c);
            float x4 = ev.getX(index);
            float y4 = ev.getY(index);
            float[] fArr = this.f1026f;
            int i4 = this.f1023c;
            int idx = (int) (x4 - fArr[i4]);
            int idy = (int) (y4 - this.f1027g[i4]);
            o(this.r.getLeft() + idx, this.r.getTop() + idy, idx, idy);
            C(ev);
        }
    }

    public final void A(float dx, float dy, int pointerId) {
        int dragsStarted = 0;
        if (c(dx, dy, pointerId, 1)) {
            dragsStarted = 0 | 1;
        }
        if (c(dy, dx, pointerId, 4)) {
            dragsStarted |= 4;
        }
        if (c(dx, dy, pointerId, 2)) {
            dragsStarted |= 2;
        }
        if (c(dy, dx, pointerId, 8)) {
            dragsStarted |= 8;
        }
        if (dragsStarted != 0) {
            int[] iArr = this.i;
            iArr[pointerId] = iArr[pointerId] | dragsStarted;
            this.q.f();
        }
    }

    public final boolean c(float delta, float odelta, int pointerId, int edge) {
        float absDelta = Math.abs(delta);
        float absODelta = Math.abs(odelta);
        if (!((this.h[pointerId] & edge) != edge || (0 & edge) == 0 || (this.j[pointerId] & edge) == edge || (this.i[pointerId] & edge) == edge)) {
            int i2 = this.f1022b;
            if (absDelta > ((float) i2) || absODelta > ((float) i2)) {
                if (absDelta < 0.5f * absODelta) {
                    this.q.g();
                }
                if ((this.i[pointerId] & edge) != 0 || absDelta <= ((float) this.f1022b)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean d(View child, float dx, float dy) {
        if (child == null) {
            return false;
        }
        boolean checkHorizontal = this.q.d(child) > 0;
        boolean checkVertical = this.q.e(child) > 0;
        if (checkHorizontal && checkVertical) {
            float f2 = (dx * dx) + (dy * dy);
            int i2 = this.f1022b;
            if (f2 > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (checkHorizontal) {
            if (Math.abs(dx) > ((float) this.f1022b)) {
                return true;
            }
            return false;
        } else if (!checkVertical || Math.abs(dy) <= ((float) this.f1022b)) {
            return false;
        } else {
            return true;
        }
    }

    public final void z() {
        this.l.computeCurrentVelocity(SQLiteDatabase.SLEEP_AFTER_YIELD_QUANTUM, this.m);
        m(e(this.l.getXVelocity(this.f1023c), this.n, this.m), e(this.l.getYVelocity(this.f1023c), this.n, this.m));
    }

    public final void o(int left, int top, int dx, int dy) {
        int clampedX = left;
        int clampedY = top;
        int oldLeft = this.r.getLeft();
        int oldTop = this.r.getTop();
        if (dx != 0) {
            clampedX = this.q.a(this.r, left, dx);
            s.P(this.r, clampedX - oldLeft);
        }
        if (dy != 0) {
            clampedY = this.q.b(this.r, top, dy);
            s.Q(this.r, clampedY - oldTop);
        }
        if (dx != 0 || dy != 0) {
            this.q.k(this.r, clampedX, clampedY, clampedX - oldLeft, clampedY - oldTop);
        }
    }

    public boolean u(int x, int y) {
        return x(this.r, x, y);
    }

    public boolean x(View view, int x, int y) {
        if (view != null && x >= view.getLeft() && x < view.getRight() && y >= view.getTop() && y < view.getBottom()) {
            return true;
        }
        return false;
    }

    public View q(int x, int y) {
        for (int i2 = this.t.getChildCount() - 1; i2 >= 0; i2--) {
            ViewGroup viewGroup = this.t;
            this.q.c(i2);
            View child = viewGroup.getChildAt(i2);
            if (x >= child.getLeft() && x < child.getRight() && y >= child.getTop() && y < child.getBottom()) {
                return child;
            }
        }
        return null;
    }

    public final int s(int x, int y) {
        int result = 0;
        if (x < this.t.getLeft() + this.o) {
            result = 0 | 1;
        }
        if (y < this.t.getTop() + this.o) {
            result |= 4;
        }
        if (x > this.t.getRight() - this.o) {
            result |= 2;
        }
        if (y > this.t.getBottom() - this.o) {
            return result | 8;
        }
        return result;
    }

    public final boolean w(int pointerId) {
        if (v(pointerId)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + pointerId + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
