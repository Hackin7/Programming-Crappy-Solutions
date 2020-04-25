package p000;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: id */
final class C0510id implements OnAttachStateChangeListener, OnPreDrawListener {

    /* renamed from: a */
    private final View f2191a;

    /* renamed from: b */
    private ViewTreeObserver f2192b;

    /* renamed from: c */
    private final Runnable f2193c;

    private C0510id(View view, Runnable runnable) {
        this.f2191a = view;
        this.f2192b = view.getViewTreeObserver();
        this.f2193c = runnable;
    }

    /* renamed from: a */
    public static C0510id m1670a(View view, Runnable runnable) {
        C0510id idVar = new C0510id(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(idVar);
        view.addOnAttachStateChangeListener(idVar);
        return idVar;
    }

    /* renamed from: a */
    private void m1671a() {
        (this.f2192b.isAlive() ? this.f2192b : this.f2191a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2191a.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw() {
        m1671a();
        this.f2193c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f2192b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        m1671a();
    }
}
