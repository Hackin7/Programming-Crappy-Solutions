package a.h.m;

import android.view.View;
import android.view.ViewTreeObserver;

public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f957b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver f958c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f959d;

    public q(View view, Runnable runnable) {
        this.f957b = view;
        this.f958c = view.getViewTreeObserver();
        this.f959d = runnable;
    }

    public static q a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            q listener = new q(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(listener);
            view.addOnAttachStateChangeListener(listener);
            return listener;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        b();
        this.f959d.run();
        return true;
    }

    public void b() {
        if (this.f958c.isAlive()) {
            this.f958c.removeOnPreDrawListener(this);
        } else {
            this.f957b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f957b.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View v) {
        this.f958c = v.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View v) {
        b();
    }
}
