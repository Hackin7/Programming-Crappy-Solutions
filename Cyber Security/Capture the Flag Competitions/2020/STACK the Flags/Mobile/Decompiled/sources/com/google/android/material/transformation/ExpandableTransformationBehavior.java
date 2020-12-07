package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f2804b;

    public abstract AnimatorSet I(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean G(View dependency, View child, boolean expanded, boolean animated) {
        boolean currentlyAnimating = this.f2804b != null;
        if (currentlyAnimating) {
            this.f2804b.cancel();
        }
        AnimatorSet I = I(dependency, child, expanded, currentlyAnimating);
        this.f2804b = I;
        I.addListener(new a());
        this.f2804b.start();
        if (!animated) {
            this.f2804b.end();
        }
        return true;
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animation) {
            ExpandableTransformationBehavior.this.f2804b = null;
        }
    }
}
