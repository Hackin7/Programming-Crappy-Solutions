package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.d.a.a.k.b;
import b.d.a.a.k.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final i f2819c = new i(75, 150);

    /* renamed from: d  reason: collision with root package name */
    public final i f2820d = new i(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean C(CoordinatorLayout parent, View child, MotionEvent ev) {
        super.C(parent, child, ev);
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet I(View dependency, View child, boolean expanded, boolean isAnimating) {
        List<Animator> animations = new ArrayList<>();
        new ArrayList();
        J(child, expanded, isAnimating, animations);
        AnimatorSet set = new AnimatorSet();
        b.a(set, animations);
        set.addListener(new a(this, expanded, child));
        return set;
    }

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2821a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2822b;

        public a(FabTransformationScrimBehavior this$0, boolean z, View view) {
            this.f2821a = z;
            this.f2822b = view;
        }

        public void onAnimationStart(Animator animation) {
            if (this.f2821a) {
                this.f2822b.setVisibility(0);
            }
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f2821a) {
                this.f2822b.setVisibility(4);
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;ZZLjava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;)V */
    public final void J(View child, boolean expanded, boolean currentlyAnimating, List list) {
        ObjectAnimator objectAnimator;
        i timing = expanded ? this.f2819c : this.f2820d;
        if (expanded) {
            if (!currentlyAnimating) {
                child.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(child, View.ALPHA, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(child, View.ALPHA, 0.0f);
        }
        timing.a(objectAnimator);
        list.add(objectAnimator);
    }
}
