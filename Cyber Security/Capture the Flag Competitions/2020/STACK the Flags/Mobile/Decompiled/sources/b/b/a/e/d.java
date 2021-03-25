package b.b.a.e;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;

public final class d extends b.b.a.a {
    public ValueAnimator A;
    public Drawable B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G = 48;
    public float H = 1.0f;
    public boolean I;
    public final float x = 0.1f;
    public final Matrix y = new Matrix();
    public boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(int viewWidth, int viewHeight, float waveCenterY, float density, b.b.a.d view) {
        super(viewWidth, viewHeight, waveCenterY, density, view);
        d.c.a.a.b(view, "view");
        b.f2369c.a();
        N(0);
        K(true);
        G(null);
    }

    public final void g0(Drawable button) {
        this.B = button;
    }

    @Override // b.b.a.a
    public void D(int newPosition) {
        super.D(newPosition);
        H(newPosition);
        M(true);
        if (k() >= y().getCount() - 1) {
            K(false);
            G(null);
        } else {
            K(true);
            G(y().d(b.f2369c.c()));
        }
        Q((float) A());
        y().b();
    }

    public boolean d0(MotionEvent ev) {
        d.c.a.a.b(ev, "ev");
        if (c0(ev)) {
            this.I = true;
            M(true);
            return true;
        }
        I(ev.getX());
        if (ev.getX() > ((float) A()) - (((float) A()) * this.x)) {
            M(true);
            if (k() == y().getCount() - 1) {
                return false;
            }
            b.f2369c.a();
            N(0);
            if (Math.abs(ev.getY() - m()) < ((float) (q() / 10))) {
                J(ev.getY());
                F(false);
            } else {
                b.b.a.a.g(this, ev.getY(), 0, 2, null);
            }
            if (!h()) {
                J(ev.getY());
                P(m());
            }
            return true;
        } else if (!o() || k() <= 0 || ev.getX() >= (((float) A()) * this.x) / ((float) 2)) {
            M(false);
            return false;
        } else {
            Y(this, 1.0f, 0.0f, 0, 4);
            M(false);
            return false;
        }
    }

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f2370a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f2371b;

        public a(d dVar, float f2) {
            this.f2370a = dVar;
            this.f2371b = f2;
        }

        public void onAnimationRepeat(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            d.c.a.a.b(animator, "animator");
            if (this.f2371b == 1.0f) {
                this.f2370a.M(true);
            }
            d dVar = this.f2370a;
            dVar.Q((float) dVar.A());
            this.f2370a.z = false;
        }

        public void onAnimationCancel(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f2373a;

        public c(d dVar) {
            this.f2373a = dVar;
        }

        public void onAnimationRepeat(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            d.c.a.a.b(animator, "animator");
            this.f2373a.M(true);
        }

        public void onAnimationCancel(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }
    }

    /* renamed from: b.b.a.e.d$d  reason: collision with other inner class name */
    public static final class C0049d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f2374a;

        public C0049d(d dVar) {
            this.f2374a = dVar;
        }

        public void onAnimationRepeat(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            d.c.a.a.b(animator, "animator");
            this.f2374a.M(true);
        }

        public void onAnimationCancel(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }
    }

    public boolean f0(MotionEvent ev) {
        d.c.a.a.b(ev, "ev");
        if (this.I) {
            if (c0(ev)) {
                c(ev.getX(), true);
                this.I = false;
                return true;
            }
            this.I = false;
        }
        if (t()) {
            if (!w()) {
                J(ev.getY());
                b.b.a.a.g(this, B() * ((float) q()), 0, 2, null);
            }
            if (((double) (((float) 1) - (ev.getX() / ((float) A())))) < 0.4d) {
                O(false);
                b.b.a.a.e(this, ev.getX(), false, 0, 4, null);
            } else {
                O(true);
                c(ev.getX(), true);
            }
        } else if (((double) (((float) 1) - (ev.getX() / ((float) A())))) > 0.7d) {
            if (this.z) {
                ValueAnimator valueAnimator = this.A;
                if (valueAnimator != null) {
                    valueAnimator.reverse();
                }
                Animator $this$doOnEnd$iv = this.A;
                if ($this$doOnEnd$iv != null) {
                    $this$doOnEnd$iv.addListener(new c(this));
                }
            } else {
                Y(this, 0.0f, 1.0f, 0, 4);
                Animator $this$doOnEnd$iv2 = this.A;
                if ($this$doOnEnd$iv2 != null) {
                    $this$doOnEnd$iv2.addListener(new C0049d(this));
                }
            }
        }
        return true;
    }

    public boolean e0(MotionEvent ev) {
        d.c.a.a.b(ev, "ev");
        this.I = false;
        I(ev.getX());
        J(ev.getY());
        if (!t()) {
            return false;
        }
        I(ev.getX());
        if (!h()) {
            P(ev.getY());
            Q(ev.getX());
            y().b();
        }
        return true;
    }

    @Override // b.b.a.a
    public void Q(float rawX) {
        L((float) Math.min(1.0d, Math.max(0.0d, ((double) (((float) A()) - rawX)) / (((double) A()) * 2.2222222222222223d))));
    }

    public void a0(Canvas canvas) {
        if (o() && i() != null) {
            if (t() || this.z) {
                b0(canvas);
                if (canvas != null) {
                    Bitmap i = i();
                    if (i != null) {
                        canvas.drawBitmap(i, ((float) j()) * ((float) A()), 0.0f, u());
                    } else {
                        d.c.a.a.f();
                        throw null;
                    }
                }
            }
        }
    }

    public final void b0(Canvas canvas) {
        float z2 = z();
        float c2 = r().c(s());
        float e2 = r().e(s());
        float b2 = r().b(s());
        b.f2369c.a();
        e wl = new e(z2, c2, e2, b2, 0);
        wl.b((float) A(), (float) q());
        x().setTranslate(((float) A()) * ((float) j()), 0.0f);
        if (this.z) {
            wl.a().transform(this.y);
        }
        wl.a().transform(x());
        if (canvas != null) {
            canvas.drawPath(wl.a(), p());
        }
        Z(canvas);
    }

    public final void Z(Canvas canvas) {
        if (canvas != null && this.B != null) {
            h0();
            if (!this.z) {
                this.H = r().a(s());
            }
            Drawable drawable = this.B;
            if (drawable != null) {
                drawable.setAlpha((int) (this.H * ((float) 255)));
            }
            Drawable drawable2 = this.B;
            if (drawable2 != null) {
                drawable2.setBounds(this.C, this.D, this.E, this.F);
            }
            Drawable drawable3 = this.B;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
    }

    public final void h0() {
        this.C = (int) ((((float) A()) - ((r().c(s()) - r().b(s())) + (((float) 24) * n()))) + ((float) (A() * j())));
        this.D = (int) (z() - (((float) (this.G / 2)) * n()));
        this.F = (int) (z() + (((float) (this.G / 2)) * n()));
        this.E = (int) (((float) this.C) + (((float) this.G) * n()));
    }

    public final boolean c0(MotionEvent ev) {
        return ev.getX() >= ((float) (this.C - (A() * k()))) && ev.getX() <= ((float) (this.E - (A() * j()))) && ev.getY() >= ((float) this.D) && ev.getY() <= ((float) this.F);
    }

    @Override // b.b.a.a
    public void E() {
        Y(this, 0.0f, 1.0f, 0, 4);
    }

    public static /* synthetic */ void Y(d dVar, float f2, float f3, long j, int i) {
        if ((i & 4) != 0) {
            j = 300;
        }
        dVar.X(f2, f3, j);
    }

    public final void X(float from, float to, long duration) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        this.A = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(duration);
        }
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new b(this));
        }
        Animator $this$doOnEnd$iv = this.A;
        if ($this$doOnEnd$iv != null) {
            $this$doOnEnd$iv.addListener(new a(this, to));
        }
        ValueAnimator valueAnimator2 = this.A;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        this.z = true;
    }

    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f2372a;

        public b(d dVar) {
            this.f2372a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator it) {
            this.f2372a.z = true;
            d.c.a.a.a(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue != null) {
                float v = ((Float) animatedValue).floatValue();
                this.f2372a.H = v * v * v;
                this.f2372a.y.setScale(v, 1.0f, (float) this.f2372a.A(), 0.0f);
                this.f2372a.y().b();
                return;
            }
            throw new d.b("null cannot be cast to non-null type kotlin.Float");
        }
    }
}
