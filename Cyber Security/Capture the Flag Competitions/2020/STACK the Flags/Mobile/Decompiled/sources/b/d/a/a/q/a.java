package b.d.a.a.q;

import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a {
    public static final TimeInterpolator B = b.d.a.a.k.a.f2537b;
    public static final int[] C = {16842919, 16842910};
    public static final int[] D = {16843623, 16842908, 16842910};
    public static final int[] E = {16842908, 16842910};
    public static final int[] F = {16843623, 16842910};
    public static final int[] G = {16842910};
    public static final int[] H = new int[0];
    public ViewTreeObserver.OnPreDrawListener A;

    /* renamed from: a  reason: collision with root package name */
    public int f2605a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Animator f2606b;

    /* renamed from: c  reason: collision with root package name */
    public b.d.a.a.k.h f2607c;

    /* renamed from: d  reason: collision with root package name */
    public b.d.a.a.k.h f2608d;

    /* renamed from: e  reason: collision with root package name */
    public b.d.a.a.k.h f2609e;

    /* renamed from: f  reason: collision with root package name */
    public b.d.a.a.k.h f2610f;

    /* renamed from: g  reason: collision with root package name */
    public final b.d.a.a.r.e f2611g;
    public b.d.a.a.v.a h;
    public float i;
    public Drawable j;
    public Drawable k;
    public b.d.a.a.r.a l;
    public Drawable m;
    public float n;
    public float o;
    public float p;
    public int q;
    public float r = 1.0f;
    public ArrayList<Animator.AnimatorListener> s;
    public ArrayList<Animator.AnimatorListener> t;
    public final b.d.a.a.r.h u;
    public final b.d.a.a.v.b v;
    public final Rect w = new Rect();
    public final RectF x = new RectF();
    public final RectF y = new RectF();
    public final Matrix z = new Matrix();

    public interface g {
    }

    public abstract void A(int[] iArr);

    public abstract void B(float f2, float f3, float f4);

    public abstract void C(Rect rect);

    public abstract boolean G();

    public abstract void H(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2);

    public abstract float l();

    public abstract void o(Rect rect);

    public abstract void u();

    public abstract b.d.a.a.r.a v();

    public abstract GradientDrawable w();

    public abstract void y();

    public a(b.d.a.a.r.h view, b.d.a.a.v.b shadowViewDelegate) {
        this.u = view;
        this.v = shadowViewDelegate;
        b.d.a.a.r.e eVar = new b.d.a.a.r.e();
        this.f2611g = eVar;
        eVar.a(C, f(new f()));
        this.f2611g.a(D, f(new e()));
        this.f2611g.a(E, f(new e()));
        this.f2611g.a(F, f(new e()));
        this.f2611g.a(G, f(new h()));
        this.f2611g.a(H, f(new d(this)));
        this.i = this.u.getRotation();
    }

    public void I(ColorStateList tint) {
        Drawable drawable = this.j;
        if (drawable != null) {
            a.h.f.l.a.o(drawable, tint);
        }
        b.d.a.a.r.a aVar = this.l;
        if (aVar != null) {
            aVar.b(tint);
        }
    }

    public void J(PorterDuff.Mode tintMode) {
        Drawable drawable = this.j;
        if (drawable != null) {
            a.h.f.l.a.p(drawable, tintMode);
        }
    }

    public void Q(ColorStateList rippleColor) {
        Drawable drawable = this.k;
        if (drawable != null) {
            a.h.f.l.a.o(drawable, b.d.a.a.u.a.a(rippleColor));
        }
    }

    public final void K(float elevation) {
        if (this.n != elevation) {
            this.n = elevation;
            B(elevation, this.o, this.p);
        }
    }

    public float n() {
        return this.o;
    }

    public float p() {
        return this.p;
    }

    public final void M(float translationZ) {
        if (this.o != translationZ) {
            this.o = translationZ;
            B(this.n, translationZ, this.p);
        }
    }

    public final void P(float translationZ) {
        if (this.p != translationZ) {
            this.p = translationZ;
            B(this.n, this.o, translationZ);
        }
    }

    public final void O(int maxImageSize) {
        if (this.q != maxImageSize) {
            this.q = maxImageSize;
            V();
        }
    }

    public final void V() {
        N(this.r);
    }

    public final void N(float scale) {
        this.r = scale;
        Matrix matrix = this.z;
        c(scale, matrix);
        this.u.setImageMatrix(matrix);
    }

    public final void c(float scale, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.u.getDrawable();
        if (drawable != null && this.q != 0) {
            RectF drawableBounds = this.x;
            RectF imageBounds = this.y;
            drawableBounds.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.q;
            imageBounds.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(drawableBounds, imageBounds, Matrix.ScaleToFit.CENTER);
            int i3 = this.q;
            matrix.postScale(scale, scale, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    public final b.d.a.a.k.h q() {
        return this.f2607c;
    }

    public final void R(b.d.a.a.k.h spec) {
        this.f2607c = spec;
    }

    public final b.d.a.a.k.h m() {
        return this.f2608d;
    }

    public final void L(b.d.a.a.k.h spec) {
        this.f2608d = spec;
    }

    public void b(Animator.AnimatorListener listener) {
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(listener);
    }

    public void F(Animator.AnimatorListener listener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.s;
        if (arrayList != null) {
            arrayList.remove(listener);
        }
    }

    public void a(Animator.AnimatorListener listener) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(listener);
    }

    public void E(Animator.AnimatorListener listener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.t;
        if (arrayList != null) {
            arrayList.remove(listener);
        }
    }

    public void r(g listener, boolean fromUser) {
        if (!s()) {
            Animator animator = this.f2606b;
            if (animator != null) {
                animator.cancel();
            }
            if (S()) {
                b.d.a.a.k.h hVar = this.f2608d;
                if (hVar == null) {
                    hVar = j();
                }
                AnimatorSet set = d(hVar, 0.0f, 0.0f, 0.0f);
                set.addListener(new C0057a(fromUser, listener));
                ArrayList<Animator.AnimatorListener> arrayList = this.t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.addListener(it.next());
                    }
                }
                set.start();
                return;
            }
            this.u.b(fromUser ? 8 : 4, fromUser);
            if (listener != null) {
                ((FloatingActionButton.a) listener).a();
                throw null;
            }
        }
    }

    /* renamed from: b.d.a.a.q.a$a  reason: collision with other inner class name */
    public class C0057a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2612a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f2613b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f2614c;

        public C0057a(boolean z, g gVar) {
            this.f2613b = z;
            this.f2614c = gVar;
        }

        public void onAnimationStart(Animator animation) {
            a.this.u.b(0, this.f2613b);
            a aVar = a.this;
            aVar.f2605a = 1;
            aVar.f2606b = animation;
            this.f2612a = false;
        }

        public void onAnimationCancel(Animator animation) {
            this.f2612a = true;
        }

        public void onAnimationEnd(Animator animation) {
            a aVar = a.this;
            aVar.f2605a = 0;
            aVar.f2606b = null;
            if (!this.f2612a) {
                aVar.u.b(this.f2613b ? 8 : 4, this.f2613b);
                g gVar = this.f2614c;
                if (gVar != null) {
                    ((FloatingActionButton.a) gVar).a();
                    throw null;
                }
            }
        }
    }

    public void T(g listener, boolean fromUser) {
        if (!t()) {
            Animator animator = this.f2606b;
            if (animator != null) {
                animator.cancel();
            }
            if (S()) {
                if (this.u.getVisibility() != 0) {
                    this.u.setAlpha(0.0f);
                    this.u.setScaleY(0.0f);
                    this.u.setScaleX(0.0f);
                    N(0.0f);
                }
                b.d.a.a.k.h hVar = this.f2607c;
                if (hVar == null) {
                    hVar = k();
                }
                AnimatorSet set = d(hVar, 1.0f, 1.0f, 1.0f);
                set.addListener(new b(fromUser, listener));
                ArrayList<Animator.AnimatorListener> arrayList = this.s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.addListener(it.next());
                    }
                }
                set.start();
                return;
            }
            this.u.b(0, fromUser);
            this.u.setAlpha(1.0f);
            this.u.setScaleY(1.0f);
            this.u.setScaleX(1.0f);
            N(1.0f);
            if (listener != null) {
                ((FloatingActionButton.a) listener).b();
                throw null;
            }
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2616a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f2617b;

        public b(boolean z, g gVar) {
            this.f2616a = z;
            this.f2617b = gVar;
        }

        public void onAnimationStart(Animator animation) {
            a.this.u.b(0, this.f2616a);
            a aVar = a.this;
            aVar.f2605a = 2;
            aVar.f2606b = animation;
        }

        public void onAnimationEnd(Animator animation) {
            a aVar = a.this;
            aVar.f2605a = 0;
            aVar.f2606b = null;
            g gVar = this.f2617b;
            if (gVar != null) {
                ((FloatingActionButton.a) gVar).b();
                throw null;
            }
        }
    }

    public final b.d.a.a.k.h k() {
        if (this.f2609e == null) {
            this.f2609e = b.d.a.a.k.h.c(this.u.getContext(), b.d.a.a.a.design_fab_show_motion_spec);
        }
        return this.f2609e;
    }

    public final b.d.a.a.k.h j() {
        if (this.f2610f == null) {
            this.f2610f = b.d.a.a.k.h.c(this.u.getContext(), b.d.a.a.a.design_fab_hide_motion_spec);
        }
        return this.f2610f;
    }

    public final AnimatorSet d(b.d.a.a.k.h spec, float opacity, float scale, float iconScale) {
        List<Animator> animators = new ArrayList<>();
        Animator animator = ObjectAnimator.ofFloat(this.u, View.ALPHA, opacity);
        spec.e("opacity").a(animator);
        animators.add(animator);
        Animator animator2 = ObjectAnimator.ofFloat(this.u, View.SCALE_X, scale);
        spec.e("scale").a(animator2);
        animators.add(animator2);
        Animator animator3 = ObjectAnimator.ofFloat(this.u, View.SCALE_Y, scale);
        spec.e("scale").a(animator3);
        animators.add(animator3);
        c(iconScale, this.z);
        Animator animator4 = ObjectAnimator.ofObject(this.u, new b.d.a.a.k.f(), new b.d.a.a.k.g(), new Matrix(this.z));
        spec.e("iconScale").a(animator4);
        animators.add(animator4);
        AnimatorSet set = new AnimatorSet();
        b.d.a.a.k.b.a(set, animators);
        return set;
    }

    public final Drawable i() {
        return this.m;
    }

    public final void W() {
        Rect rect = this.w;
        o(rect);
        C(rect);
        ((FloatingActionButton.c) this.v).d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x() {
        if (G()) {
            h();
            this.u.getViewTreeObserver().addOnPreDrawListener(this.A);
        }
    }

    public void z() {
        if (this.A != null) {
            this.u.getViewTreeObserver().removeOnPreDrawListener(this.A);
            this.A = null;
        }
    }

    public b.d.a.a.r.a e(int borderWidth, ColorStateList backgroundTint) {
        Context context = this.u.getContext();
        b.d.a.a.r.a borderDrawable = v();
        borderDrawable.d(a.h.e.a.a(context, b.d.a.a.c.design_fab_stroke_top_outer_color), a.h.e.a.a(context, b.d.a.a.c.design_fab_stroke_top_inner_color), a.h.e.a.a(context, b.d.a.a.c.design_fab_stroke_end_inner_color), a.h.e.a.a(context, b.d.a.a.c.design_fab_stroke_end_outer_color));
        borderDrawable.c((float) borderWidth);
        borderDrawable.b(backgroundTint);
        return borderDrawable;
    }

    public void D() {
        float rotation = this.u.getRotation();
        if (this.i != rotation) {
            this.i = rotation;
            U();
        }
    }

    public final void h() {
        if (this.A == null) {
            this.A = new c();
        }
    }

    public class c implements ViewTreeObserver.OnPreDrawListener {
        public c() {
        }

        public boolean onPreDraw() {
            a.this.D();
            return true;
        }
    }

    public GradientDrawable g() {
        GradientDrawable d2 = w();
        d2.setShape(1);
        d2.setColor(-1);
        return d2;
    }

    public boolean t() {
        if (this.u.getVisibility() != 0) {
            if (this.f2605a == 2) {
                return true;
            }
            return false;
        } else if (this.f2605a != 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean s() {
        if (this.u.getVisibility() == 0) {
            if (this.f2605a == 1) {
                return true;
            }
            return false;
        } else if (this.f2605a != 2) {
            return true;
        } else {
            return false;
        }
    }

    public final ValueAnimator f(i impl) {
        ValueAnimator animator = new ValueAnimator();
        animator.setInterpolator(B);
        animator.setDuration(100L);
        animator.addListener(impl);
        animator.addUpdateListener(impl);
        animator.setFloatValues(0.0f, 1.0f);
        return animator;
    }

    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2623a;

        /* renamed from: b  reason: collision with root package name */
        public float f2624b;

        /* renamed from: c  reason: collision with root package name */
        public float f2625c;

        public abstract float a();

        public i() {
        }

        public /* synthetic */ i(a x0, C0057a x1) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            if (!this.f2623a) {
                this.f2624b = a.this.h.e();
                this.f2625c = a();
                this.f2623a = true;
            }
            b.d.a.a.v.a aVar = a.this.h;
            float f2 = this.f2624b;
            aVar.g(f2 + ((this.f2625c - f2) * animator.getAnimatedFraction()));
        }

        public void onAnimationEnd(Animator animator) {
            a.this.h.g(this.f2625c);
            this.f2623a = false;
        }
    }

    public class h extends i {
        public h() {
            super(a.this, null);
        }

        @Override // b.d.a.a.q.a.i
        public float a() {
            return a.this.n;
        }
    }

    public class e extends i {
        public e() {
            super(a.this, null);
        }

        @Override // b.d.a.a.q.a.i
        public float a() {
            a aVar = a.this;
            return aVar.n + aVar.o;
        }
    }

    public class f extends i {
        public f() {
            super(a.this, null);
        }

        @Override // b.d.a.a.q.a.i
        public float a() {
            a aVar = a.this;
            return aVar.n + aVar.p;
        }
    }

    public class d extends i {
        public d(a aVar) {
            super(aVar, null);
        }

        @Override // b.d.a.a.q.a.i
        public float a() {
            return 0.0f;
        }
    }

    public final boolean S() {
        return s.K(this.u) && !this.u.isInEditMode();
    }

    public final void U() {
        b.d.a.a.v.a aVar = this.h;
        if (aVar != null) {
            aVar.f(-this.i);
        }
        b.d.a.a.r.a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.e(-this.i);
        }
    }
}
