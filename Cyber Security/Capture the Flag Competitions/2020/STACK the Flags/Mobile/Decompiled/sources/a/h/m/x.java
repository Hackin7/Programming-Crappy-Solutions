package a.h.m;

import a.b.k.o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f975a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f976b = null;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f977c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f978d = -1;

    public x(View view) {
        this.f975a = new WeakReference<>(view);
    }

    public x d(long value) {
        View view = this.f975a.get();
        if (view != null) {
            view.animate().setDuration(value);
        }
        return this;
    }

    public x a(float value) {
        View view = this.f975a.get();
        if (view != null) {
            view.animate().alpha(value);
        }
        return this;
    }

    public x k(float value) {
        View view = this.f975a.get();
        if (view != null) {
            view.animate().translationY(value);
        }
        return this;
    }

    public long c() {
        View view = this.f975a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public x e(Interpolator value) {
        View view = this.f975a.get();
        if (view != null) {
            view.animate().setInterpolator(value);
        }
        return this;
    }

    public x h(long value) {
        View view = this.f975a.get();
        if (view != null) {
            view.animate().setStartDelay(value);
        }
        return this;
    }

    public void b() {
        View view = this.f975a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void j() {
        View view = this.f975a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public x f(y listener) {
        View view = this.f975a.get();
        if (view != null) {
            g(view, listener);
        }
        return this;
    }

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f979a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f980b;

        public a(x this$0, y yVar, View view) {
            this.f979a = yVar;
            this.f980b = view;
        }

        public void onAnimationCancel(Animator animation) {
            this.f979a.c(this.f980b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f979a.a(this.f980b);
        }

        public void onAnimationStart(Animator animation) {
            this.f979a.b(this.f980b);
        }
    }

    public final void g(View view, y listener) {
        if (listener != null) {
            view.animate().setListener(new a(this, listener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public x i(a0 listener) {
        View view = this.f975a.get();
        if (view != null) {
            ValueAnimator.AnimatorUpdateListener wrapped = null;
            if (listener != null) {
                wrapped = new b(this, listener, view);
            }
            view.animate().setUpdateListener(wrapped);
        }
        return this;
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a0 f981a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f982b;

        public b(x this$0, a0 a0Var, View view) {
            this.f981a = a0Var;
            this.f982b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((o.c) this.f981a).a(this.f982b);
        }
    }
}
