package a.h.n;

import a.h.m.s;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    public final C0026a f983b = new C0026a();

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f984c = new AccelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    public final View f985d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f986e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f987f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    public float[] f988g = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int h;
    public int i;
    public float[] j = {0.0f, 0.0f};
    public float[] k = {0.0f, 0.0f};
    public float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    public abstract void j(int i2, int i3);

    public a(View target) {
        this.f985d = target;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        int maxVelocity = (int) ((1575.0f * f2) + 0.5f);
        int minVelocity = (int) ((f2 * 315.0f) + 0.5f);
        o((float) maxVelocity, (float) maxVelocity);
        p((float) minVelocity, (float) minVelocity);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(r);
        r(500);
        q(500);
    }

    public a m(boolean enabled) {
        if (this.q && !enabled) {
            i();
        }
        this.q = enabled;
        return this;
    }

    public a o(float horizontalMax, float verticalMax) {
        float[] fArr = this.l;
        fArr[0] = horizontalMax / 1000.0f;
        fArr[1] = verticalMax / 1000.0f;
        return this;
    }

    public a p(float horizontalMin, float verticalMin) {
        float[] fArr = this.k;
        fArr[0] = horizontalMin / 1000.0f;
        fArr[1] = verticalMin / 1000.0f;
        return this;
    }

    public a t(float horizontal, float vertical) {
        float[] fArr = this.j;
        fArr[0] = horizontal / 1000.0f;
        fArr[1] = vertical / 1000.0f;
        return this;
    }

    public a l(int type) {
        this.h = type;
        return this;
    }

    public a s(float horizontal, float vertical) {
        float[] fArr = this.f987f;
        fArr[0] = horizontal;
        fArr[1] = vertical;
        return this;
    }

    public a n(float horizontalMax, float verticalMax) {
        float[] fArr = this.f988g;
        fArr[0] = horizontalMax;
        fArr[1] = verticalMax;
        return this;
    }

    public a k(int delayMillis) {
        this.i = delayMillis;
        return this;
    }

    public a r(int durationMillis) {
        this.f983b.k(durationMillis);
        return this;
    }

    public a q(int durationMillis) {
        this.f983b.j(durationMillis);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x005a;
     */
    public boolean onTouch(View v, MotionEvent event) {
        if (!this.q) {
            return false;
        }
        int action = event.getActionMasked();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                }
            }
            i();
            return false;
        }
        this.o = true;
        this.m = false;
        this.f983b.l(d(0, event.getX(), (float) v.getWidth(), (float) this.f985d.getWidth()), d(1, event.getY(), (float) v.getHeight(), (float) this.f985d.getHeight()));
        if (!this.p && u()) {
            v();
        }
        return false;
    }

    public boolean u() {
        C0026a scroller = this.f983b;
        int verticalDirection = scroller.f();
        int horizontalDirection = scroller.d();
        if (verticalDirection != 0 && b(verticalDirection)) {
            return true;
        }
        if (horizontalDirection != 0) {
            a(horizontalDirection);
        }
        return false;
    }

    public final void v() {
        int i2;
        if (this.f986e == null) {
            this.f986e = new b();
        }
        this.p = true;
        this.n = true;
        if (this.m || (i2 = this.i) <= 0) {
            this.f986e.run();
        } else {
            s.V(this.f985d, this.f986e, (long) i2);
        }
        this.m = true;
    }

    public final void i() {
        if (this.n) {
            this.p = false;
        } else {
            this.f983b.i();
        }
    }

    public final float d(int direction, float coordinate, float srcSize, float dstSize) {
        float value = h(this.f987f[direction], srcSize, this.f988g[direction], coordinate);
        if (value == 0.0f) {
            return 0.0f;
        }
        float relativeVelocity = this.j[direction];
        float minimumVelocity = this.k[direction];
        float maximumVelocity = this.l[direction];
        float targetVelocity = relativeVelocity * dstSize;
        if (value > 0.0f) {
            return e(value * targetVelocity, minimumVelocity, maximumVelocity);
        }
        return -e((-value) * targetVelocity, minimumVelocity, maximumVelocity);
    }

    public final float h(float relativeValue, float size, float maxValue, float current) {
        float interpolated;
        float edgeSize = e(relativeValue * size, 0.0f, maxValue);
        float value = g(size - current, edgeSize) - g(current, edgeSize);
        if (value < 0.0f) {
            interpolated = -this.f984c.getInterpolation(-value);
        } else if (value <= 0.0f) {
            return 0.0f;
        } else {
            interpolated = this.f984c.getInterpolation(value);
        }
        return e(interpolated, -1.0f, 1.0f);
    }

    public final float g(float current, float leading) {
        if (leading == 0.0f) {
            return 0.0f;
        }
        int i2 = this.h;
        if (i2 == 0 || i2 == 1) {
            if (current < leading) {
                if (current >= 0.0f) {
                    return 1.0f - (current / leading);
                }
                if (!this.p || this.h != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i2 == 2 && current < 0.0f) {
            return current / (-leading);
        }
        return 0.0f;
    }

    public static int f(int value, int min, int max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    public static float e(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    public void c() {
        long eventTime = SystemClock.uptimeMillis();
        MotionEvent cancel = MotionEvent.obtain(eventTime, eventTime, 3, 0.0f, 0.0f, 0);
        this.f985d.onTouchEvent(cancel);
        cancel.recycle();
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.n) {
                    aVar.n = false;
                    aVar.f983b.m();
                }
                C0026a scroller = a.this.f983b;
                if (scroller.h() || !a.this.u()) {
                    a.this.p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.o) {
                    aVar2.o = false;
                    aVar2.c();
                }
                scroller.a();
                a.this.j(scroller.b(), scroller.c());
                s.U(a.this.f985d, this);
            }
        }
    }

    /* renamed from: a.h.n.a$a  reason: collision with other inner class name */
    public static class C0026a {

        /* renamed from: a  reason: collision with root package name */
        public int f989a;

        /* renamed from: b  reason: collision with root package name */
        public int f990b;

        /* renamed from: c  reason: collision with root package name */
        public float f991c;

        /* renamed from: d  reason: collision with root package name */
        public float f992d;

        /* renamed from: e  reason: collision with root package name */
        public long f993e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f994f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f995g = 0;
        public int h = 0;
        public long i = -1;
        public float j;
        public int k;

        public void k(int durationMillis) {
            this.f989a = durationMillis;
        }

        public void j(int durationMillis) {
            this.f990b = durationMillis;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f993e = currentAnimationTimeMillis;
            this.i = -1;
            this.f994f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.f995g = 0;
            this.h = 0;
        }

        public void i() {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int) (currentTime - this.f993e), 0, this.f990b);
            this.j = e(currentTime);
            this.i = currentTime;
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public final float e(long currentTime) {
            if (currentTime < this.f993e) {
                return 0.0f;
            }
            long j2 = this.i;
            if (j2 < 0 || currentTime < j2) {
                return a.e(((float) (currentTime - this.f993e)) / ((float) this.f989a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.j;
            return (1.0f - f2) + (f2 * a.e(((float) (currentTime - j2)) / ((float) this.k), 0.0f, 1.0f));
        }

        public final float g(float value) {
            return (-4.0f * value * value) + (4.0f * value);
        }

        public void a() {
            if (this.f994f != 0) {
                long currentTime = AnimationUtils.currentAnimationTimeMillis();
                float scale = g(e(currentTime));
                long elapsedSinceDelta = currentTime - this.f994f;
                this.f994f = currentTime;
                this.f995g = (int) (((float) elapsedSinceDelta) * scale * this.f991c);
                this.h = (int) (((float) elapsedSinceDelta) * scale * this.f992d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public void l(float x, float y) {
            this.f991c = x;
            this.f992d = y;
        }

        public int d() {
            float f2 = this.f991c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f992d;
            return (int) (f2 / Math.abs(f2));
        }

        public int b() {
            return this.f995g;
        }

        public int c() {
            return this.h;
        }
    }
}
