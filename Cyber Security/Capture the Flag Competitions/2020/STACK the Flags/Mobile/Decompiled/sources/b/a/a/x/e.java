package b.a.a.x;

import android.view.Choreographer;
import b.a.a.c;
import b.a.a.d;

public class e extends a implements Choreographer.FrameCallback {

    /* renamed from: d  reason: collision with root package name */
    public float f2319d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2320e = false;

    /* renamed from: f  reason: collision with root package name */
    public long f2321f = 0;

    /* renamed from: g  reason: collision with root package name */
    public float f2322g = 0.0f;
    public int h = 0;
    public float i = -2.14748365E9f;
    public float j = 2.14748365E9f;
    public d k;
    public boolean l = false;

    public Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    public float h() {
        d dVar = this.k;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.f2322g - dVar.o()) / (this.k.f() - this.k.o());
    }

    public float getAnimatedFraction() {
        if (this.k == null) {
            return 0.0f;
        }
        if (n()) {
            return (k() - this.f2322g) / (k() - l());
        }
        return (this.f2322g - l()) / (k() - l());
    }

    public long getDuration() {
        d dVar = this.k;
        if (dVar == null) {
            return 0;
        }
        return (long) dVar.d();
    }

    public float i() {
        return this.f2322g;
    }

    public boolean isRunning() {
        return this.l;
    }

    public void doFrame(long frameTimeNanos) {
        q();
        if (this.k != null && isRunning()) {
            c.a("LottieValueAnimator#doFrame");
            long j2 = this.f2321f;
            long timeSinceFrame = 0;
            if (j2 != 0) {
                timeSinceFrame = frameTimeNanos - j2;
            }
            float dFrames = ((float) timeSinceFrame) / j();
            float f2 = this.f2322g + (n() ? -dFrames : dFrames);
            this.f2322g = f2;
            boolean ended = !g.d(f2, l(), k());
            this.f2322g = g.b(this.f2322g, l(), k());
            this.f2321f = frameTimeNanos;
            e();
            if (ended) {
                if (getRepeatCount() == -1 || this.h < getRepeatCount()) {
                    c();
                    this.h++;
                    if (getRepeatMode() == 2) {
                        this.f2320e = !this.f2320e;
                        u();
                    } else {
                        this.f2322g = n() ? k() : l();
                    }
                    this.f2321f = frameTimeNanos;
                } else {
                    this.f2322g = this.f2319d < 0.0f ? l() : k();
                    r();
                    b(n());
                }
            }
            B();
            c.b("LottieValueAnimator#doFrame");
        }
    }

    public final float j() {
        d dVar = this.k;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.h()) / Math.abs(this.f2319d);
    }

    public void f() {
        this.k = null;
        this.i = -2.14748365E9f;
        this.j = 2.14748365E9f;
    }

    public void v(d composition) {
        boolean keepMinAndMaxFrames = this.k == null;
        this.k = composition;
        if (keepMinAndMaxFrames) {
            y((float) ((int) Math.max(this.i, composition.o())), (float) ((int) Math.min(this.j, composition.f())));
        } else {
            y((float) ((int) composition.o()), (float) ((int) composition.f()));
        }
        float frame = this.f2322g;
        this.f2322g = 0.0f;
        w((float) ((int) frame));
        e();
    }

    public void w(float frame) {
        if (this.f2322g != frame) {
            this.f2322g = g.b(frame, l(), k());
            this.f2321f = 0;
            e();
        }
    }

    public void z(int minFrame) {
        y((float) minFrame, (float) ((int) this.j));
    }

    public void x(float maxFrame) {
        y(this.i, maxFrame);
    }

    public void y(float minFrame, float maxFrame) {
        if (minFrame <= maxFrame) {
            d dVar = this.k;
            float compositionMinFrame = dVar == null ? -3.4028235E38f : dVar.o();
            d dVar2 = this.k;
            float compositionMaxFrame = dVar2 == null ? Float.MAX_VALUE : dVar2.f();
            this.i = g.b(minFrame, compositionMinFrame, compositionMaxFrame);
            this.j = g.b(maxFrame, compositionMinFrame, compositionMaxFrame);
            w((float) ((int) g.b(this.f2322g, minFrame, maxFrame)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(minFrame), Float.valueOf(maxFrame)));
    }

    public void u() {
        A(-m());
    }

    public void A(float speed) {
        this.f2319d = speed;
    }

    public float m() {
        return this.f2319d;
    }

    public void setRepeatMode(int value) {
        super.setRepeatMode(value);
        if (value != 2 && this.f2320e) {
            this.f2320e = false;
            u();
        }
    }

    public void p() {
        this.l = true;
        d(n());
        w((float) ((int) (n() ? k() : l())));
        this.f2321f = 0;
        this.h = 0;
        q();
    }

    public void g() {
        r();
        b(n());
    }

    public void o() {
        r();
    }

    public void t() {
        this.l = true;
        q();
        this.f2321f = 0;
        if (n() && i() == l()) {
            this.f2322g = k();
        } else if (!n() && i() == k()) {
            this.f2322g = l();
        }
    }

    public void cancel() {
        a();
        r();
    }

    public final boolean n() {
        return m() < 0.0f;
    }

    public float l() {
        d dVar = this.k;
        if (dVar == null) {
            return 0.0f;
        }
        float f2 = this.i;
        return f2 == -2.14748365E9f ? dVar.o() : f2;
    }

    public float k() {
        d dVar = this.k;
        if (dVar == null) {
            return 0.0f;
        }
        float f2 = this.j;
        return f2 == 2.14748365E9f ? dVar.f() : f2;
    }

    public void q() {
        if (isRunning()) {
            s(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void r() {
        s(true);
    }

    public void s(boolean stopRunning) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (stopRunning) {
            this.l = false;
        }
    }

    public final void B() {
        if (this.k != null) {
            float f2 = this.f2322g;
            if (f2 < this.i || f2 > this.j) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.f2322g)));
            }
        }
    }
}
