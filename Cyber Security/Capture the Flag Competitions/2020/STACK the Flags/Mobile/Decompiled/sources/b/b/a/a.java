package b.b.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f2345a = 700;

    /* renamed from: b  reason: collision with root package name */
    public final float f2346b = 0.7f;

    /* renamed from: c  reason: collision with root package name */
    public b.b.a.e.a f2347c;

    /* renamed from: d  reason: collision with root package name */
    public float f2348d;

    /* renamed from: e  reason: collision with root package name */
    public Matrix f2349e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    public final Paint f2350f = new Paint(0);

    /* renamed from: g  reason: collision with root package name */
    public final Paint f2351g = new Paint();
    public int h;
    public boolean i;
    public boolean j = true;
    public boolean k;
    public Bitmap l;
    public boolean m;
    public float n;
    public float o;
    public ValueAnimator p;
    public int q = b.b.a.e.b.f2369c.b();
    public int r = -1;
    public int s;
    public int t;
    public float u;
    public float v;
    public final d w;

    public abstract void Q(float f2);

    public a(int width, int height, float waveCenterY, float density, d view) {
        d.c.a.a.b(view, "view");
        this.s = width;
        this.t = height;
        this.u = waveCenterY;
        this.v = density;
        this.w = view;
        this.f2350f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f2350f.setStyle(Paint.Style.FILL);
        this.f2350f.setFlags(1);
        this.f2351g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f2347c = new b.b.a.e.a((float) this.s, (float) this.t, this.v);
        this.u = this.f2346b * ((float) this.t);
    }

    public final int A() {
        return this.s;
    }

    public final int q() {
        return this.t;
    }

    public final void P(float f2) {
        this.u = f2;
    }

    public final float z() {
        return this.u;
    }

    public final float n() {
        return this.v;
    }

    public final d y() {
        return this.w;
    }

    public final float B() {
        return this.f2346b;
    }

    public final b.b.a.e.a r() {
        return this.f2347c;
    }

    public final void L(float f2) {
        this.f2348d = f2;
    }

    public final float s() {
        return this.f2348d;
    }

    public final Matrix x() {
        return this.f2349e;
    }

    public final Paint p() {
        return this.f2350f;
    }

    public final Paint u() {
        return this.f2351g;
    }

    public final void H(int i2) {
        this.h = i2;
    }

    public final int k() {
        return this.h;
    }

    public final void K(boolean z) {
        this.i = z;
    }

    public final boolean o() {
        return this.i;
    }

    public final void M(boolean z) {
        this.j = z;
    }

    public final boolean t() {
        return this.j;
    }

    public final void O(boolean z) {
        this.k = z;
    }

    public final boolean w() {
        return this.k;
    }

    public final void G(Bitmap bitmap) {
        this.l = bitmap;
    }

    public final Bitmap i() {
        return this.l;
    }

    public final void F(boolean z) {
        this.m = z;
    }

    public final boolean h() {
        return this.m;
    }

    public final void J(float f2) {
        this.n = f2;
    }

    public final float m() {
        return this.n;
    }

    public final void I(float f2) {
        this.o = f2;
    }

    public final float l() {
        return this.o;
    }

    public final void N(int i2) {
        this.q = i2;
    }

    public final int v() {
        return this.q;
    }

    public final int j() {
        return this.h - this.r;
    }

    public final boolean C() {
        return this.l != null;
    }

    public void D(int newPosition) {
        if (this.r < 0) {
            this.r = newPosition;
        }
        this.f2349e.setTranslate(((float) this.s) * ((float) newPosition), 0.0f);
        this.o = (float) this.s;
        this.n = this.f2346b * ((float) this.t);
    }

    public static /* synthetic */ void g(a aVar, float f2, long j2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = 150;
            }
            aVar.f(f2, j2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateY");
    }

    public final void f(float y, long duration) {
        this.m = true;
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, y);
        this.p = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(duration);
        }
        ValueAnimator valueAnimator2 = this.p;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new e(this));
        }
        Animator $this$doOnEnd$iv = this.p;
        if ($this$doOnEnd$iv != null) {
            $this$doOnEnd$iv.addListener(new d(this));
        }
        ValueAnimator valueAnimator3 = this.p;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f2354a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f2355b;

        public b(a aVar, boolean z) {
            this.f2354a = aVar;
            this.f2355b = z;
        }

        public void onAnimationRepeat(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            d.c.a.a.b(animator, "animator");
            int v = this.f2354a.v();
            b.b.a.e.b.f2369c.a();
            if (v == 0 && this.f2354a.k() < this.f2354a.y().getCount() + 1 && this.f2355b) {
                this.f2354a.y().c(false);
                this.f2354a.O(false);
                d y = this.f2354a.y();
                b.b.a.e.b.f2369c.a();
                y.a(0);
                this.f2354a.y().b();
                this.f2354a.E();
            }
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
        public final /* synthetic */ a f2356a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f2357b;

        public c(a aVar, boolean z) {
            this.f2356a = aVar;
            this.f2357b = z;
        }

        public void onAnimationRepeat(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            d.c.a.a.b(animator, "animator");
            if (this.f2356a.v() == b.b.a.e.b.f2369c.c() && this.f2356a.k() > 0 && this.f2357b) {
                this.f2356a.y().c(false);
                this.f2356a.Q(0.0f);
                this.f2356a.O(false);
                this.f2356a.y().a(b.b.a.e.b.f2369c.c());
                this.f2356a.y().b();
            }
        }

        public void onAnimationCancel(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f2358a;

        public d(a aVar) {
            this.f2358a = aVar;
        }

        public void onAnimationRepeat(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            d.c.a.a.b(animator, "animator");
            this.f2358a.F(false);
        }

        public void onAnimationCancel(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            d.c.a.a.b(animator, "animator");
        }
    }

    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f2359a;

        public e(a aVar) {
            this.f2359a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator it) {
            a aVar = this.f2359a;
            d.c.a.a.a(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue != null) {
                aVar.J(((Float) animatedValue).floatValue());
                a aVar2 = this.f2359a;
                aVar2.P(aVar2.m());
                a aVar3 = this.f2359a;
                aVar3.Q(aVar3.l());
                this.f2359a.y().b();
                return;
            }
            throw new d.b("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static /* synthetic */ ValueAnimator b(a aVar, float f2, float f3, long j2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                j2 = aVar.f2345a;
            }
            return aVar.a(f2, f3, j2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
    }

    public final ValueAnimator a(float currentX, float endX, long duration) {
        ValueAnimator animator = ValueAnimator.ofFloat(currentX, endX);
        d.c.a.b count = new d.c.a.b();
        count.f2824b = 0;
        animator.addUpdateListener(new C0048a(this, count));
        d.c.a.a.a(animator, "animator");
        animator.setDuration(duration);
        return animator;
    }

    /* renamed from: b.b.a.a$a  reason: collision with other inner class name */
    public static final class C0048a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f2352a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d.c.a.b f2353b;

        public C0048a(a aVar, d.c.a.b bVar) {
            this.f2352a = aVar;
            this.f2353b = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator it) {
            a aVar = this.f2352a;
            d.c.a.a.a(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (animatedValue != null) {
                aVar.Q(((Float) animatedValue).floatValue());
                this.f2352a.y().b();
                this.f2353b.f2824b++;
                return;
            }
            throw new d.b("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static /* synthetic */ void e(a aVar, float f2, boolean z, long j2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                j2 = 150;
            }
            aVar.d(f2, z, j2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateRight");
    }

    public final void d(float currentX, boolean switchPage, long duration) {
        if (switchPage) {
            this.w.c(true);
        }
        ValueAnimator animator = a(currentX, (float) this.s, duration);
        animator.addListener(new c(this, switchPage));
        if (switchPage) {
            f(this.f2346b * ((float) this.t), duration);
        }
        animator.start();
    }

    public final void c(float currentX, boolean switchPage) {
        if (switchPage) {
            this.w.c(true);
        }
        int i2 = this.s;
        ValueAnimator animator = b(this, currentX, ((float) i2) - (((float) i2) * 2.2222223f), 0, 4, null);
        animator.addListener(new b(this, switchPage));
        animator.start();
    }

    public void E() {
    }
}
