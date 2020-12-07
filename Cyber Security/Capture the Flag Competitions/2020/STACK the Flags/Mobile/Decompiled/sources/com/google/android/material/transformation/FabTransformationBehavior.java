package com.google.android.material.transformation;

import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.d.a.a.f;
import b.d.a.a.k.h;
import b.d.a.a.k.i;
import b.d.a.a.k.j;
import b.d.a.a.o.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2806c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f2807d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f2808e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2809f;

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f2817a;

        /* renamed from: b  reason: collision with root package name */
        public j f2818b;
    }

    public abstract e a0(Context context, boolean z);

    public FabTransformationBehavior() {
        this.f2806c = new Rect();
        this.f2807d = new RectF();
        this.f2808e = new RectF();
        this.f2809f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2806c = new Rect();
        this.f2807d = new RectF();
        this.f2808e = new RectF();
        this.f2809f = new int[2];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout parent, View child, View dependency) {
        if (child.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(dependency instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) dependency).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == child.getId()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f lp) {
        if (lp.h == 0) {
            lp.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet I(View dependency, View child, boolean expanded, boolean isAnimating) {
        e spec = a0(child.getContext(), expanded);
        List<Animator> animations = new ArrayList<>();
        List<Animator.AnimatorListener> listeners = new ArrayList<>();
        T(dependency, child, expanded, isAnimating, spec, animations);
        RectF childBounds = this.f2807d;
        Y(dependency, child, expanded, isAnimating, spec, animations, childBounds);
        float childWidth = childBounds.width();
        float childHeight = childBounds.height();
        V(dependency, child, expanded, isAnimating, spec, animations, listeners);
        U(dependency, child, expanded, isAnimating, spec, childWidth, childHeight, animations, listeners);
        S(dependency, child, expanded, isAnimating, spec, animations);
        R(child, expanded, isAnimating, spec, animations);
        AnimatorSet set = new AnimatorSet();
        b.d.a.a.k.b.a(set, animations);
        set.addListener(new a(this, expanded, child, dependency));
        int count = listeners.size();
        for (int i = 0; i < count; i++) {
            set.addListener(listeners.get(i));
        }
        return set;
    }

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2810a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2811b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f2812c;

        public a(FabTransformationBehavior this$0, boolean z, View view, View view2) {
            this.f2810a = z;
            this.f2811b = view;
            this.f2812c = view2;
        }

        public void onAnimationStart(Animator animation) {
            if (this.f2810a) {
                this.f2811b.setVisibility(0);
                this.f2812c.setAlpha(0.0f);
                this.f2812c.setVisibility(4);
            }
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f2810a) {
                this.f2811b.setVisibility(4);
                this.f2812c.setAlpha(1.0f);
                this.f2812c.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$e;Ljava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;)V */
    @TargetApi(21)
    public final void T(View dependency, View child, boolean expanded, boolean currentlyAnimating, e spec, List list) {
        ObjectAnimator objectAnimator;
        float translationZ = s.q(child) - s.q(dependency);
        if (expanded) {
            if (!currentlyAnimating) {
                child.setTranslationZ(-translationZ);
            }
            objectAnimator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Z, -translationZ);
        }
        spec.f2817a.e("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$e;Ljava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;Landroid/graphics/RectF;)V */
    public final void Y(View dependency, View child, boolean expanded, boolean currentlyAnimating, e spec, List list, RectF childBounds) {
        i translationXTiming;
        i translationYTiming;
        i translationXTiming2;
        i translationYTiming2;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float translationX = N(dependency, child, spec.f2818b);
        float translationY = O(dependency, child, spec.f2818b);
        if (translationX == 0.0f || translationY == 0.0f) {
            translationXTiming = spec.f2817a.e("translationXLinear");
            translationYTiming = spec.f2817a.e("translationYLinear");
        } else if ((!expanded || translationY >= 0.0f) && (expanded || translationY <= 0.0f)) {
            translationXTiming = spec.f2817a.e("translationXCurveDownwards");
            translationYTiming = spec.f2817a.e("translationYCurveDownwards");
        } else {
            translationXTiming = spec.f2817a.e("translationXCurveUpwards");
            translationYTiming = spec.f2817a.e("translationYCurveUpwards");
        }
        if (expanded) {
            if (!currentlyAnimating) {
                child.setTranslationX(-translationX);
                child.setTranslationY(-translationY);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(child, View.TRANSLATION_X, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, 0.0f);
            translationYTiming2 = translationYTiming;
            translationXTiming2 = translationXTiming;
            K(child, spec, translationXTiming, translationYTiming, -translationX, -translationY, 0.0f, 0.0f, childBounds);
            objectAnimator2 = ofFloat;
            objectAnimator = ofFloat2;
        } else {
            translationYTiming2 = translationYTiming;
            translationXTiming2 = translationXTiming;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(child, View.TRANSLATION_X, -translationX);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, -translationY);
            objectAnimator2 = ofFloat3;
            objectAnimator = ofFloat4;
        }
        translationXTiming2.a(objectAnimator2);
        translationYTiming2.a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    public final void V(View dependency, View child, boolean expanded, boolean currentlyAnimating, e spec, List<Animator> animations, List<Animator.AnimatorListener> listeners) {
        ObjectAnimator animator;
        if ((child instanceof b.d.a.a.o.c) && (dependency instanceof ImageView)) {
            b.d.a.a.o.c circularRevealChild = (b.d.a.a.o.c) child;
            Drawable icon = ((ImageView) dependency).getDrawable();
            if (icon != null) {
                icon.mutate();
                if (expanded) {
                    if (!currentlyAnimating) {
                        icon.setAlpha(255);
                    }
                    animator = ObjectAnimator.ofInt(icon, b.d.a.a.k.e.f2542b, 0);
                } else {
                    animator = ObjectAnimator.ofInt(icon, b.d.a.a.k.e.f2542b, 255);
                }
                animator.addUpdateListener(new b(this, child));
                spec.f2817a.e("iconFade").a(animator);
                animations.add(animator);
                listeners.add(new c(this, circularRevealChild, icon));
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2813a;

        public b(FabTransformationBehavior this$0, View view) {
            this.f2813a = view;
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            this.f2813a.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b.d.a.a.o.c f2814a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Drawable f2815b;

        public c(FabTransformationBehavior this$0, b.d.a.a.o.c cVar, Drawable drawable) {
            this.f2814a = cVar;
            this.f2815b = drawable;
        }

        public void onAnimationStart(Animator animation) {
            this.f2814a.setCircularRevealOverlayDrawable(this.f2815b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f2814a.setCircularRevealOverlayDrawable(null);
        }
    }

    public final void U(View dependency, View child, boolean expanded, boolean currentlyAnimating, e spec, float childWidth, float childHeight, List<Animator> animations, List<Animator.AnimatorListener> listeners) {
        b.d.a.a.o.c circularRevealChild;
        i timing;
        Animator animator;
        if (child instanceof b.d.a.a.o.c) {
            b.d.a.a.o.c circularRevealChild2 = (b.d.a.a.o.c) child;
            float revealCenterX = L(dependency, child, spec.f2818b);
            float revealCenterY = M(dependency, child, spec.f2818b);
            ((FloatingActionButton) dependency).h(this.f2806c);
            float dependencyRadius = ((float) this.f2806c.width()) / 2.0f;
            i timing2 = spec.f2817a.e("expansion");
            if (expanded) {
                if (!currentlyAnimating) {
                    circularRevealChild2.setRevealInfo(new c.e(revealCenterX, revealCenterY, dependencyRadius));
                }
                float fromRadius = currentlyAnimating ? circularRevealChild2.getRevealInfo().f2601c : dependencyRadius;
                Animator animator2 = b.d.a.a.o.a.a(circularRevealChild2, revealCenterX, revealCenterY, b.d.a.a.s.a.b(revealCenterX, revealCenterY, 0.0f, 0.0f, childWidth, childHeight));
                animator2.addListener(new d(this, circularRevealChild2));
                timing = timing2;
                X(child, timing2.c(), (int) revealCenterX, (int) revealCenterY, fromRadius, animations);
                circularRevealChild = circularRevealChild2;
                animator = animator2;
            } else {
                timing = timing2;
                float fromRadius2 = circularRevealChild2.getRevealInfo().f2601c;
                Animator animator3 = b.d.a.a.o.a.a(circularRevealChild2, revealCenterX, revealCenterY, dependencyRadius);
                X(child, timing.c(), (int) revealCenterX, (int) revealCenterY, fromRadius2, animations);
                circularRevealChild = circularRevealChild2;
                W(child, timing.c(), timing.d(), spec.f2817a.f(), (int) revealCenterX, (int) revealCenterY, dependencyRadius, animations);
                animator = animator3;
            }
            timing.a(animator);
            animations.add(animator);
            listeners.add(b.d.a.a.o.a.b(circularRevealChild));
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b.d.a.a.o.c f2816a;

        public d(FabTransformationBehavior this$0, b.d.a.a.o.c cVar) {
            this.f2816a = cVar;
        }

        public void onAnimationEnd(Animator animation) {
            c.e revealInfo = this.f2816a.getRevealInfo();
            revealInfo.f2601c = Float.MAX_VALUE;
            this.f2816a.setRevealInfo(revealInfo);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$e;Ljava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;)V */
    public final void S(View dependency, View child, boolean expanded, boolean currentlyAnimating, e spec, List list) {
        ObjectAnimator animator;
        if (child instanceof b.d.a.a.o.c) {
            b.d.a.a.o.c circularRevealChild = (b.d.a.a.o.c) child;
            int tint = Z(dependency);
            int transparent = 16777215 & tint;
            if (expanded) {
                if (!currentlyAnimating) {
                    circularRevealChild.setCircularRevealScrimColor(tint);
                }
                animator = ObjectAnimator.ofInt(circularRevealChild, c.d.f2598a, transparent);
            } else {
                animator = ObjectAnimator.ofInt(circularRevealChild, c.d.f2598a, tint);
            }
            animator.setEvaluator(b.d.a.a.k.c.b());
            spec.f2817a.e("color").a(animator);
            list.add(animator);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$e;Ljava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;)V */
    public final void R(View child, boolean expanded, boolean currentlyAnimating, e spec, List list) {
        ObjectAnimator objectAnimator;
        if (child instanceof ViewGroup) {
            if (child instanceof b.d.a.a.o.c) {
            }
            ViewGroup childContentContainer = J(child);
            if (childContentContainer != null) {
                if (expanded) {
                    if (!currentlyAnimating) {
                        b.d.a.a.k.d.f2541a.set(childContentContainer, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(childContentContainer, b.d.a.a.k.d.f2541a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(childContentContainer, b.d.a.a.k.d.f2541a, 0.0f);
                }
                spec.f2817a.e("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    public final float N(View dependency, View child, j positioning) {
        RectF dependencyBounds = this.f2807d;
        RectF childBounds = this.f2808e;
        Q(dependency, dependencyBounds);
        Q(child, childBounds);
        float translationX = 0.0f;
        int i = positioning.f2554a & 7;
        if (i == 1) {
            translationX = childBounds.centerX() - dependencyBounds.centerX();
        } else if (i == 3) {
            translationX = childBounds.left - dependencyBounds.left;
        } else if (i == 5) {
            translationX = childBounds.right - dependencyBounds.right;
        }
        return translationX + positioning.f2555b;
    }

    public final float O(View dependency, View child, j positioning) {
        RectF dependencyBounds = this.f2807d;
        RectF childBounds = this.f2808e;
        Q(dependency, dependencyBounds);
        Q(child, childBounds);
        float translationY = 0.0f;
        int i = positioning.f2554a & 112;
        if (i == 16) {
            translationY = childBounds.centerY() - dependencyBounds.centerY();
        } else if (i == 48) {
            translationY = childBounds.top - dependencyBounds.top;
        } else if (i == 80) {
            translationY = childBounds.bottom - dependencyBounds.bottom;
        }
        return translationY + positioning.f2556c;
    }

    public final void Q(View view, RectF rect) {
        rect.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] windowLocation = this.f2809f;
        view.getLocationInWindow(windowLocation);
        rect.offsetTo((float) windowLocation[0], (float) windowLocation[1]);
        rect.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public final float L(View dependency, View child, j positioning) {
        RectF dependencyBounds = this.f2807d;
        RectF childBounds = this.f2808e;
        Q(dependency, dependencyBounds);
        Q(child, childBounds);
        childBounds.offset(-N(dependency, child, positioning), 0.0f);
        return dependencyBounds.centerX() - childBounds.left;
    }

    public final float M(View dependency, View child, j positioning) {
        RectF dependencyBounds = this.f2807d;
        RectF childBounds = this.f2808e;
        Q(dependency, dependencyBounds);
        Q(child, childBounds);
        childBounds.offset(0.0f, -O(dependency, child, positioning));
        return dependencyBounds.centerY() - childBounds.top;
    }

    public final void K(View child, e spec, i translationXTiming, i translationYTiming, float fromX, float fromY, float toX, float toY, RectF childBounds) {
        float translationX = P(spec, translationXTiming, fromX, toX);
        float translationY = P(spec, translationYTiming, fromY, toY);
        Rect window = this.f2806c;
        child.getWindowVisibleDisplayFrame(window);
        RectF windowF = this.f2807d;
        windowF.set(window);
        RectF childVisibleBounds = this.f2808e;
        Q(child, childVisibleBounds);
        childVisibleBounds.offset(translationX, translationY);
        childVisibleBounds.intersect(windowF);
        childBounds.set(childVisibleBounds);
    }

    public final float P(e spec, i timing, float from, float to) {
        long delay = timing.c();
        long duration = timing.d();
        i expansionTiming = spec.f2817a.e("expansion");
        return b.d.a.a.k.a.a(from, to, timing.e().getInterpolation(((float) (((expansionTiming.c() + expansionTiming.d()) + 17) - delay)) / ((float) duration)));
    }

    public final ViewGroup J(View view) {
        View childContentContainer = view.findViewById(f.mtrl_child_content_container);
        if (childContentContainer != null) {
            return b0(childContentContainer);
        }
        if ((view instanceof b.d.a.a.z.b) || (view instanceof b.d.a.a.z.a)) {
            return b0(((ViewGroup) view).getChildAt(0));
        }
        return b0(view);
    }

    public final ViewGroup b0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public final int Z(View view) {
        ColorStateList tintList = s.m(view);
        if (tintList != null) {
            return tintList.getColorForState(view.getDrawableState(), tintList.getDefaultColor());
        }
        return 0;
    }

    public final void X(View child, long delay, int revealCenterX, int revealCenterY, float fromRadius, List<Animator> animations) {
        if (delay > 0) {
            Animator animator = ViewAnimationUtils.createCircularReveal(child, revealCenterX, revealCenterY, fromRadius, fromRadius);
            animator.setStartDelay(0);
            animator.setDuration(delay);
            animations.add(animator);
        }
    }

    public final void W(View child, long delay, long duration, long totalDuration, int revealCenterX, int revealCenterY, float toRadius, List<Animator> animations) {
        if (delay + duration < totalDuration) {
            Animator animator = ViewAnimationUtils.createCircularReveal(child, revealCenterX, revealCenterY, toRadius, toRadius);
            animator.setStartDelay(delay + duration);
            animator.setDuration(totalDuration - (delay + duration));
            animations.add(animator);
        }
    }
}
