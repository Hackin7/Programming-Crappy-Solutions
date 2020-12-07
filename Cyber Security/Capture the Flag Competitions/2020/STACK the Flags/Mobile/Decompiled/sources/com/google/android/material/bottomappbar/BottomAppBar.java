package com.google.android.material.bottomappbar;

import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public Animator Q;
    public Animator R;
    public int S;
    public boolean T;
    public boolean U;

    public static /* synthetic */ void T(BottomAppBar x0) {
        x0.k0();
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.S;
    }

    public void setFabAlignmentMode(int fabAlignmentMode) {
        i0(fabAlignmentMode);
        h0(fabAlignmentMode, this.U);
        this.S = fabAlignmentMode;
    }

    public void setBackgroundTint(ColorStateList backgroundTint) {
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getFabCradleMargin() {
        throw null;
    }

    public void setFabCradleMargin(float cradleMargin) {
        if (cradleMargin != getFabCradleMargin()) {
            throw null;
        }
    }

    public float getFabCradleRoundedCornerRadius() {
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float roundedCornerRadius) {
        if (roundedCornerRadius != getFabCradleRoundedCornerRadius()) {
            throw null;
        }
    }

    public float getCradleVerticalOffset() {
        throw null;
    }

    public void setCradleVerticalOffset(float verticalOffset) {
        if (verticalOffset != getCradleVerticalOffset()) {
            throw null;
        }
    }

    public boolean getHideOnScroll() {
        return this.T;
    }

    public void setHideOnScroll(boolean hide) {
        this.T = hide;
    }

    public void setFabDiameter(int diameter) {
        throw null;
    }

    public final void i0(int targetMode) {
        if (this.S != targetMode && s.K(this)) {
            Animator animator = this.Q;
            if (animator != null) {
                animator.cancel();
            }
            List<Animator> animators = new ArrayList<>();
            Z(targetMode, animators);
            a0(targetMode, animators);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(animators);
            this.Q = set;
            set.addListener(new a());
            this.Q.start();
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animation) {
            BottomAppBar.this.Q = null;
        }
    }

    public final void Z(int targetMode, List<Animator> list) {
        if (this.U) {
            throw null;
        }
    }

    public final FloatingActionButton c0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View v : ((CoordinatorLayout) getParent()).s(this)) {
            if (v instanceof FloatingActionButton) {
                return (FloatingActionButton) v;
            }
        }
        return null;
    }

    public final boolean g0() {
        FloatingActionButton fab = c0();
        return fab != null && fab.l();
    }

    public final void a0(int targetMode, List<Animator> animators) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(c0(), "translationX", (float) d0(targetMode));
        animator.setDuration(300L);
        animators.add(animator);
    }

    public final void h0(int targetMode, boolean newFabAttached) {
        if (s.K(this)) {
            Animator animator = this.R;
            if (animator != null) {
                animator.cancel();
            }
            List<Animator> animators = new ArrayList<>();
            if (!g0()) {
                targetMode = 0;
                newFabAttached = false;
            }
            b0(targetMode, newFabAttached, animators);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(animators);
            this.R = set;
            set.addListener(new b());
            this.R.start();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationEnd(Animator animation) {
            BottomAppBar.this.R = null;
        }
    }

    public final void b0(int targetMode, boolean targetAttached, List<Animator> animators) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator fadeIn = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if ((this.U || (targetAttached && g0())) && (this.S == 1 || targetMode == 1)) {
                Animator fadeOut = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                fadeOut.addListener(new c(actionMenuView, targetMode, targetAttached));
                AnimatorSet set = new AnimatorSet();
                set.setDuration(150L);
                set.playSequentially(fadeOut, fadeIn);
                animators.add(set);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                animators.add(fadeIn);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2718a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f2719b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2720c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f2721d;

        public c(ActionMenuView actionMenuView, int i, boolean z) {
            this.f2719b = actionMenuView;
            this.f2720c = i;
            this.f2721d = z;
        }

        public void onAnimationCancel(Animator animation) {
            this.f2718a = true;
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f2718a) {
                BottomAppBar.this.l0(this.f2719b, this.f2720c, this.f2721d);
            }
        }
    }

    public final float e0(boolean targetAttached) {
        FloatingActionButton fab = c0();
        if (fab == null) {
            return 0.0f;
        }
        Rect fabContentRect = new Rect();
        fab.h(fabContentRect);
        float fabHeight = (float) fabContentRect.height();
        if (fabHeight == 0.0f) {
            fabHeight = (float) fab.getMeasuredHeight();
        }
        return ((float) (-getMeasuredHeight())) + (targetAttached ? (-getCradleVerticalOffset()) + (fabHeight / 2.0f) + ((float) (fab.getHeight() - fabContentRect.bottom)) : ((float) (fab.getHeight() - fabContentRect.height())) - ((float) fab.getPaddingBottom()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getFabTranslationY() {
        return e0(this.U);
    }

    public final int d0(int fabAlignmentMode) {
        int i = 1;
        boolean isRtl = s.v(this) == 1;
        if (fabAlignmentMode != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - 0;
        if (isRtl) {
            i = -1;
        }
        return measuredWidth * i;
    }

    private float getFabTranslationX() {
        return (float) d0(this.S);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            if (view instanceof ActionMenuView) {
                return (ActionMenuView) view;
            }
        }
        return null;
    }

    public final void l0(ActionMenuView actionMenuView, int fabAlignmentMode, boolean fabAttached) {
        int i;
        int toolbarLeftContentEnd = 0;
        boolean isRtl = s.v(this) == 1;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View view = getChildAt(i2);
            if ((view.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) view.getLayoutParams()).f2a & 8388615) == 8388611) {
                if (isRtl) {
                    i = view.getLeft();
                } else {
                    i = view.getRight();
                }
                toolbarLeftContentEnd = Math.max(toolbarLeftContentEnd, i);
            }
        }
        actionMenuView.setTranslationX((fabAlignmentMode != 1 || !fabAttached) ? 0.0f : (float) (toolbarLeftContentEnd - (isRtl ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    public final void Y() {
        Animator animator = this.R;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.Q;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public final boolean f0() {
        Animator animator;
        Animator animator2 = this.R;
        return (animator2 != null && animator2.isRunning()) || ((animator = this.Q) != null && animator.isRunning());
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean changed, int l, int t, int r, int b2) {
        super.onLayout(changed, l, t, r, b2);
        Y();
        k0();
        throw null;
    }

    public final void k0() {
        getFabTranslationX();
        throw null;
    }

    public final void X(FloatingActionButton fab) {
        j0(fab);
        fab.e(null);
        fab.f(null);
    }

    public final void j0(FloatingActionButton fab) {
        fab.o(null);
        fab.p(null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence title) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence subtitle) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f2715d = new Rect();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            H(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public final boolean L(FloatingActionButton fab, BottomAppBar child) {
            ((CoordinatorLayout.f) fab.getLayoutParams()).f1655d = 17;
            child.X(fab);
            return true;
        }

        public boolean H(CoordinatorLayout parent, BottomAppBar child, int layoutDirection) {
            FloatingActionButton fab = child.c0();
            if (fab != null) {
                L(fab, child);
                fab.i(this.f2715d);
                child.setFabDiameter(this.f2715d.height());
            }
            if (child.f0()) {
                parent.I(child, layoutDirection);
                super.l(parent, child, layoutDirection);
                return false;
            }
            BottomAppBar.T(child);
            throw null;
        }

        /* renamed from: I */
        public boolean z(CoordinatorLayout coordinatorLayout, BottomAppBar child, View directTargetChild, View target, int axes, int type) {
            return child.getHideOnScroll() && super.z(coordinatorLayout, child, directTargetChild, target, axes, type);
        }

        /* renamed from: K */
        public void G(BottomAppBar child) {
            super.G(child);
            FloatingActionButton fab = child.c0();
            if (fab != null) {
                fab.clearAnimation();
                fab.animate().translationY(child.getFabTranslationY()).setInterpolator(b.d.a.a.k.a.f2538c).setDuration(225);
            }
        }

        /* renamed from: J */
        public void F(BottomAppBar child) {
            super.F(child);
            FloatingActionButton fab = child.c0();
            if (fab != null) {
                fab.h(this.f2715d);
                fab.clearAnimation();
                fab.animate().translationY(((float) (-fab.getPaddingBottom())) + ((float) (fab.getMeasuredHeight() - this.f2715d.height()))).setInterpolator(b.d.a.a.k.a.f2537b).setDuration(175);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        d savedState = new d(super.onSaveInstanceState());
        savedState.f2723d = this.S;
        savedState.f2724e = this.U;
        return savedState;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof d)) {
            super.onRestoreInstanceState(state);
            return;
        }
        d savedState = (d) state;
        super.onRestoreInstanceState(savedState.a());
        this.S = savedState.f2723d;
        this.U = savedState.f2724e;
    }

    public static class d extends a.j.a.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public int f2723d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2724e;

        public d(Parcelable superState) {
            super(superState);
        }

        public d(Parcel in, ClassLoader loader) {
            super(in, loader);
            this.f2723d = in.readInt();
            this.f2724e = in.readInt() != 0;
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f2723d);
            out.writeInt(this.f2724e ? 1 : 0);
        }

        public static class a implements Parcelable.ClassLoaderCreator<d> {
            /* renamed from: b */
            public d createFromParcel(Parcel in, ClassLoader loader) {
                return new d(in, loader);
            }

            /* renamed from: a */
            public d createFromParcel(Parcel in) {
                return new d(in, null);
            }

            /* renamed from: c */
            public d[] newArray(int size) {
                return new d[size];
            }
        }
    }
}
