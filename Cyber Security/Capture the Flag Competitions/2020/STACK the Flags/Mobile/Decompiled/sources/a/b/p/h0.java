package a.b.p;

import a.b.o.j.p;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final float f320b;

    /* renamed from: c  reason: collision with root package name */
    public final int f321c;

    /* renamed from: d  reason: collision with root package name */
    public final int f322d;

    /* renamed from: e  reason: collision with root package name */
    public final View f323e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f324f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f325g;
    public boolean h;
    public int i;
    public final int[] j = new int[2];

    public abstract p b();

    public abstract boolean c();

    public h0(View src) {
        this.f323e = src;
        src.setLongClickable(true);
        src.addOnAttachStateChangeListener(this);
        this.f320b = (float) ViewConfiguration.get(src.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f321c = tapTimeout;
        this.f322d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View v, MotionEvent event) {
        boolean forwarding;
        boolean wasForwarding = this.h;
        if (wasForwarding) {
            forwarding = f(event) || !d();
        } else {
            forwarding = g(event) && c();
            if (forwarding) {
                long now = SystemClock.uptimeMillis();
                MotionEvent e2 = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                this.f323e.onTouchEvent(e2);
                e2.recycle();
            }
        }
        this.h = forwarding;
        if (forwarding || wasForwarding) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        this.h = false;
        this.i = -1;
        Runnable runnable = this.f324f;
        if (runnable != null) {
            this.f323e.removeCallbacks(runnable);
        }
    }

    public boolean d() {
        p popup = b();
        if (popup == null || !popup.b()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006f;
     */
    public final boolean g(MotionEvent srcEvent) {
        View src = this.f323e;
        if (!src.isEnabled()) {
            return false;
        }
        int actionMasked = srcEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int activePointerIndex = srcEvent.findPointerIndex(this.i);
                    if (activePointerIndex >= 0 && !h(src, srcEvent.getX(activePointerIndex), srcEvent.getY(activePointerIndex), this.f320b)) {
                        a();
                        src.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            a();
        } else {
            this.i = srcEvent.getPointerId(0);
            if (this.f324f == null) {
                this.f324f = new a();
            }
            src.postDelayed(this.f324f, (long) this.f321c);
            if (this.f325g == null) {
                this.f325g = new b();
            }
            src.postDelayed(this.f325g, (long) this.f322d);
        }
        return false;
    }

    public final void a() {
        Runnable runnable = this.f325g;
        if (runnable != null) {
            this.f323e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f324f;
        if (runnable2 != null) {
            this.f323e.removeCallbacks(runnable2);
        }
    }

    public void e() {
        a();
        View src = this.f323e;
        if (src.isEnabled() && !src.isLongClickable() && c()) {
            src.getParent().requestDisallowInterceptTouchEvent(true);
            long now = SystemClock.uptimeMillis();
            MotionEvent e2 = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            src.onTouchEvent(e2);
            e2.recycle();
            this.h = true;
        }
    }

    public final boolean f(MotionEvent srcEvent) {
        f0 dst;
        View src = this.f323e;
        p popup = b();
        if (popup == null || !popup.b() || (dst = (f0) popup.k()) == null || !dst.isShown()) {
            return false;
        }
        MotionEvent dstEvent = MotionEvent.obtainNoHistory(srcEvent);
        i(src, dstEvent);
        j(dst, dstEvent);
        boolean handled = dst.e(dstEvent, this.i);
        dstEvent.recycle();
        int action = srcEvent.getActionMasked();
        boolean keepForwarding = (action == 1 || action == 3) ? false : true;
        if (!handled || !keepForwarding) {
            return false;
        }
        return true;
    }

    public static boolean h(View view, float localX, float localY, float slop) {
        return localX >= (-slop) && localY >= (-slop) && localX < ((float) (view.getRight() - view.getLeft())) + slop && localY < ((float) (view.getBottom() - view.getTop())) + slop;
    }

    public final boolean j(View view, MotionEvent event) {
        int[] loc = this.j;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) (-loc[0]), (float) (-loc[1]));
        return true;
    }

    public final boolean i(View view, MotionEvent event) {
        int[] loc = this.j;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) loc[0], (float) loc[1]);
        return true;
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ViewParent parent = h0.this.f323e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            h0.this.e();
        }
    }
}
