package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f2698a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2699b = 2;

    /* renamed from: c  reason: collision with root package name */
    public ViewPropertyAnimator f2700c;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout parent, V child, int layoutDirection) {
        this.f2698a = child.getMeasuredHeight();
        super.l(parent, child, layoutDirection);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean y(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int nestedScrollAxes) {
        return nestedScrollAxes == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        if (this.f2699b != 1 && dyConsumed > 0) {
            F(child);
        } else if (this.f2699b != 2 && dyConsumed < 0) {
            G(child);
        }
    }

    public void G(V child) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2700c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            child.clearAnimation();
        }
        this.f2699b = 2;
        E(child, 0, 225, b.d.a.a.k.a.f2538c);
    }

    public void F(V child) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2700c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            child.clearAnimation();
        }
        this.f2699b = 1;
        E(child, this.f2698a, 175, b.d.a.a.k.a.f2537b);
    }

    public final void E(V child, int targetY, long duration, TimeInterpolator interpolator) {
        this.f2700c = child.animate().translationY((float) targetY).setInterpolator(interpolator).setDuration(duration).setListener(new a());
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animation) {
            HideBottomViewOnScrollBehavior.this.f2700c = null;
        }
    }
}
