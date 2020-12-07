package com.google.android.material.appbar;

import a.h.m.k;
import a.h.m.s;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.d.a.a.b;
import b.d.a.a.j;
import b.d.a.a.l.e;
import java.lang.ref.WeakReference;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public int f2684b;

    /* renamed from: c  reason: collision with root package name */
    public int f2685c;

    /* renamed from: d  reason: collision with root package name */
    public int f2686d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2687e;

    /* renamed from: f  reason: collision with root package name */
    public int f2688f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2689g;
    public boolean h;
    public boolean i;
    public int[] j;

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        h();
    }

    public void onLayout(boolean changed, int l, int t, int r, int b2) {
        super.onLayout(changed, l, t, r, b2);
        h();
        boolean z = false;
        this.f2687e = false;
        int i2 = 0;
        int z2 = getChildCount();
        while (true) {
            if (i2 >= z2) {
                break;
            } else if (((a) getChildAt(i2).getLayoutParams()).b() != null) {
                this.f2687e = true;
                break;
            } else {
                i2++;
            }
        }
        if (this.i || f()) {
            z = true;
        }
        m(z);
    }

    public final boolean f() {
        int z = getChildCount();
        for (int i2 = 0; i2 < z; i2++) {
            if (((a) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        this.f2684b = -1;
        this.f2685c = -1;
        this.f2686d = -1;
    }

    public void setOrientation(int orientation) {
        if (orientation == 1) {
            super.setOrientation(orientation);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setExpanded(boolean expanded) {
        k(expanded, s.K(this));
    }

    public void k(boolean expanded, boolean animate) {
        l(expanded, animate, true);
    }

    public final void l(boolean expanded, boolean animate, boolean force) {
        int i2 = 0;
        int i3 = (expanded ? 1 : 2) | (animate ? 4 : 0);
        if (force) {
            i2 = 8;
        }
        this.f2688f = i3 | i2;
        requestLayout();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof a;
    }

    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    /* renamed from: c */
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    /* renamed from: d */
    public a generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof LinearLayout.LayoutParams) {
            return new a((LinearLayout.LayoutParams) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) p);
        }
        return new a(p);
    }

    public boolean e() {
        return this.f2687e;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f2684b;
        if (i2 != -1) {
            return i2;
        }
        int range = 0;
        int i3 = 0;
        int z = getChildCount();
        while (true) {
            if (i3 >= z) {
                break;
            }
            View child = getChildAt(i3);
            a lp = (a) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight();
            int flags = lp.f2696a;
            if ((flags & 1) == 0) {
                break;
            }
            range += ((LinearLayout.LayoutParams) lp).topMargin + childHeight + ((LinearLayout.LayoutParams) lp).bottomMargin;
            if ((flags & 2) != 0) {
                range -= s.w(child);
                break;
            }
            i3++;
        }
        int max = Math.max(0, range - getTopInset());
        this.f2684b = max;
        return max;
    }

    public boolean g() {
        return getTotalScrollRange() != 0;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public int getDownNestedPreScrollRange() {
        int i2 = this.f2685c;
        if (i2 != -1) {
            return i2;
        }
        int range = 0;
        for (int i3 = getChildCount() - 1; i3 >= 0; i3--) {
            View child = getChildAt(i3);
            a lp = (a) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight();
            int flags = lp.f2696a;
            if ((flags & 5) == 5) {
                int range2 = range + ((LinearLayout.LayoutParams) lp).topMargin + ((LinearLayout.LayoutParams) lp).bottomMargin;
                if ((flags & 8) != 0) {
                    range = range2 + s.w(child);
                } else if ((flags & 2) != 0) {
                    range = range2 + (childHeight - s.w(child));
                } else {
                    range = range2 + (childHeight - getTopInset());
                }
            } else if (range > 0) {
                break;
            }
        }
        int max = Math.max(0, range);
        this.f2685c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.f2686d;
        if (i2 != -1) {
            return i2;
        }
        int range = 0;
        int i3 = 0;
        int z = getChildCount();
        while (true) {
            if (i3 >= z) {
                break;
            }
            View child = getChildAt(i3);
            a lp = (a) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight() + ((LinearLayout.LayoutParams) lp).topMargin + ((LinearLayout.LayoutParams) lp).bottomMargin;
            int flags = lp.f2696a;
            if ((flags & 1) == 0) {
                break;
            }
            range += childHeight;
            if ((flags & 2) != 0) {
                range -= s.w(child) + getTopInset();
                break;
            }
            i3++;
        }
        int max = Math.max(0, range);
        this.f2686d = max;
        return max;
    }

    public void a(int offset) {
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minHeight = s.w(this);
        if (minHeight != 0) {
            return (minHeight * 2) + topInset;
        }
        int childCount = getChildCount();
        int lastChildMinHeight = childCount >= 1 ? s.w(getChildAt(childCount - 1)) : 0;
        if (lastChildMinHeight != 0) {
            return (lastChildMinHeight * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public int[] onCreateDrawableState(int extraSpace) {
        if (this.j == null) {
            this.j = new int[4];
        }
        int[] extraStates = this.j;
        int[] states = super.onCreateDrawableState(extraStates.length + extraSpace);
        extraStates[0] = this.f2689g ? b.state_liftable : -b.state_liftable;
        extraStates[1] = (!this.f2689g || !this.h) ? -b.state_lifted : b.state_lifted;
        extraStates[2] = this.f2689g ? b.state_collapsible : -b.state_collapsible;
        extraStates[3] = (!this.f2689g || !this.h) ? -b.state_collapsed : b.state_collapsed;
        return LinearLayout.mergeDrawableStates(states, extraStates);
    }

    public final boolean m(boolean liftable) {
        if (this.f2689g == liftable) {
            return false;
        }
        this.f2689g = liftable;
        refreshDrawableState();
        return true;
    }

    public boolean n(boolean lifted) {
        if (this.h == lifted) {
            return false;
        }
        this.h = lifted;
        refreshDrawableState();
        return true;
    }

    public void setLiftOnScroll(boolean liftOnScroll) {
        this.i = liftOnScroll;
    }

    public boolean i() {
        return this.i;
    }

    @Deprecated
    public void setTargetElevation(float elevation) {
        e.a(this, elevation);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public int getPendingAction() {
        return this.f2688f;
    }

    public void j() {
        this.f2688f = 0;
    }

    public final int getTopInset() {
        return 0;
    }

    public static class a extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2696a = 1;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f2697b;

        public a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            TypedArray a2 = c2.obtainStyledAttributes(attrs, j.AppBarLayout_Layout);
            this.f2696a = a2.getInt(j.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (a2.hasValue(j.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f2697b = AnimationUtils.loadInterpolator(c2, a2.getResourceId(j.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            a2.recycle();
        }

        public a(int width, int height) {
            super(width, height);
        }

        public a(ViewGroup.LayoutParams p) {
            super(p);
        }

        public a(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public a(LinearLayout.LayoutParams source) {
            super(source);
        }

        public int a() {
            return this.f2696a;
        }

        public Interpolator b() {
            return this.f2697b;
        }

        public boolean c() {
            int i = this.f2696a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
    }

    public static class BaseBehavior<T extends AppBarLayout> extends b.d.a.a.l.a<T> {
        public int k;
        public int l;
        public ValueAnimator m;
        public int n = -1;
        public boolean o;
        public float p;
        public WeakReference<View> q;

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c, b.d.a.a.l.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            d0(coordinatorLayout, (AppBarLayout) view, i);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            f0(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr, i3);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            g0(coordinatorLayout, (AppBarLayout) view, view2, i4, i5);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return j0(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TT;Landroid/view/View;Landroid/view/View;II)Z */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.material.appbar.AppBarLayout */
        /* JADX WARN: Multi-variable type inference failed */
        public boolean j0(CoordinatorLayout parent, AppBarLayout appBarLayout, View directTargetChild, int nestedScrollAxes, int type) {
            ValueAnimator valueAnimator;
            boolean started = (nestedScrollAxes & 2) != 0 && (appBarLayout.i() || U(parent, appBarLayout, directTargetChild));
            if (started && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.l = type;
            return started;
        }

        public final boolean U(CoordinatorLayout parent, T child, View directTargetChild) {
            return child.g() && parent.getHeight() - directTargetChild.getHeight() <= child.getHeight();
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TT;Landroid/view/View;II[II)V */
        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.google.android.material.appbar.AppBarLayout */
        /* JADX WARN: Multi-variable type inference failed */
        public void f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View target, int dy, int[] consumed, int type) {
            int max;
            int min;
            if (dy != 0) {
                if (dy < 0) {
                    min = -appBarLayout.getTotalScrollRange();
                    max = appBarLayout.getDownNestedPreScrollRange() + min;
                } else {
                    min = -appBarLayout.getUpNestedPreScrollRange();
                    max = 0;
                }
                if (min != max) {
                    consumed[1] = N(coordinatorLayout, appBarLayout, dy, min, max);
                    o0(dy, appBarLayout, target, type);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TT;Landroid/view/View;IIIII)V */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.google.android.material.appbar.AppBarLayout */
        /* JADX WARN: Multi-variable type inference failed */
        public void g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View target, int dyUnconsumed, int type) {
            if (dyUnconsumed < 0) {
                N(coordinatorLayout, appBarLayout, dyUnconsumed, -appBarLayout.getDownNestedScrollRange(), 0);
                o0(dyUnconsumed, appBarLayout, target, type);
            }
            if (appBarLayout.i()) {
                appBarLayout.n(target.getScrollY() > 0);
            }
        }

        public final void o0(int dy, T child, View target, int type) {
            if (type == 1) {
                int curOffset = L();
                if ((dy < 0 && curOffset == 0) || (dy > 0 && curOffset == (-child.getDownNestedScrollRange()))) {
                    s.p0(target, 1);
                }
            }
        }

        /* renamed from: k0 */
        public void B(CoordinatorLayout coordinatorLayout, T abl, View target, int type) {
            if (this.l == 0 || type == 1) {
                n0(coordinatorLayout, abl);
            }
            this.q = new WeakReference<>(target);
        }

        public final void R(CoordinatorLayout coordinatorLayout, T child, int offset, float velocity) {
            int duration;
            int distance = Math.abs(L() - offset);
            float velocity2 = Math.abs(velocity);
            if (velocity2 > 0.0f) {
                duration = Math.round((((float) distance) / velocity2) * 1000.0f) * 3;
            } else {
                duration = (int) ((1.0f + (((float) distance) / ((float) child.getHeight()))) * 150.0f);
            }
            S(coordinatorLayout, child, offset, duration);
        }

        public final void S(CoordinatorLayout coordinatorLayout, T child, int offset, int duration) {
            int currentOffset = L();
            if (currentOffset == offset) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(b.d.a.a.k.a.f2539d);
                this.m.addUpdateListener(new a(coordinatorLayout, child));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration((long) Math.min(duration, 600));
            this.m.setIntValues(currentOffset, offset);
            this.m.start();
        }

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f2690a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f2691b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f2690a = coordinatorLayout;
                this.f2691b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator animator) {
                BaseBehavior.this.O(this.f2690a, this.f2691b, ((Integer) animator.getAnimatedValue()).intValue());
            }
        }

        public final int Y(T abl, int offset) {
            int count = abl.getChildCount();
            for (int i = 0; i < count; i++) {
                View child = abl.getChildAt(i);
                int top = child.getTop();
                int bottom = child.getBottom();
                a lp = (a) child.getLayoutParams();
                if (V(lp.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) lp).topMargin;
                    bottom += ((LinearLayout.LayoutParams) lp).bottomMargin;
                }
                if (top <= (-offset) && bottom >= (-offset)) {
                    return i;
                }
            }
            return -1;
        }

        public final void n0(CoordinatorLayout coordinatorLayout, T abl) {
            int offset = L();
            int offsetChildIndex = Y(abl, offset);
            if (offsetChildIndex >= 0) {
                View offsetChild = abl.getChildAt(offsetChildIndex);
                a lp = (a) offsetChild.getLayoutParams();
                int flags = lp.a();
                if ((flags & 17) == 17) {
                    int snapTop = -offsetChild.getTop();
                    int snapBottom = -offsetChild.getBottom();
                    if (offsetChildIndex == abl.getChildCount() - 1) {
                        snapBottom += abl.getTopInset();
                    }
                    if (V(flags, 2)) {
                        snapBottom += s.w(offsetChild);
                    } else if (V(flags, 5)) {
                        int seam = s.w(offsetChild) + snapBottom;
                        if (offset < seam) {
                            snapTop = seam;
                        } else {
                            snapBottom = seam;
                        }
                    }
                    if (V(flags, 32)) {
                        snapTop += ((LinearLayout.LayoutParams) lp).topMargin;
                        snapBottom -= ((LinearLayout.LayoutParams) lp).bottomMargin;
                    }
                    R(coordinatorLayout, abl, a.h.h.a.a(offset < (snapBottom + snapTop) / 2 ? snapBottom : snapTop, -abl.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public static boolean V(int flags, int check) {
            return (flags & check) == check;
        }

        /* renamed from: e0 */
        public boolean m(CoordinatorLayout parent, T child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) child.getLayoutParams())).height == -2) {
                parent.J(child, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec(0, 0), heightUsed);
                return true;
            }
            super.m(parent, child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
            return false;
        }

        public boolean d0(CoordinatorLayout parent, T abl, int layoutDirection) {
            int offset;
            super.l(parent, abl, layoutDirection);
            int pendingAction = abl.getPendingAction();
            int i = this.n;
            if (i >= 0 && (pendingAction & 8) == 0) {
                View child = abl.getChildAt(i);
                int offset2 = -child.getBottom();
                if (this.o) {
                    offset = offset2 + s.w(child) + abl.getTopInset();
                } else {
                    offset = offset2 + Math.round(((float) child.getHeight()) * this.p);
                }
                O(parent, abl, offset);
            } else if (pendingAction != 0) {
                boolean animate = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int offset3 = -abl.getUpNestedPreScrollRange();
                    if (animate) {
                        R(parent, abl, offset3, 0.0f);
                    } else {
                        O(parent, abl, offset3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (animate) {
                        R(parent, abl, 0, 0.0f);
                    } else {
                        O(parent, abl, 0);
                    }
                }
            }
            abl.j();
            this.n = -1;
            F(a.h.h.a.a(D(), -abl.getTotalScrollRange(), 0));
            p0(parent, abl, D(), 0, true);
            abl.a(D());
            return true;
        }

        /* renamed from: T */
        public boolean G(T t) {
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View scrollingView = weakReference.get();
            if (scrollingView == null || !scrollingView.isShown() || scrollingView.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* renamed from: c0 */
        public void M(CoordinatorLayout parent, T layout) {
            n0(parent, layout);
        }

        /* renamed from: Z */
        public int J(T view) {
            return -view.getDownNestedScrollRange();
        }

        /* renamed from: a0 */
        public int K(T view) {
            return view.getTotalScrollRange();
        }

        /* renamed from: l0 */
        public int P(CoordinatorLayout coordinatorLayout, T appBarLayout, int newOffset, int minOffset, int maxOffset) {
            int curOffset = L();
            int consumed = 0;
            if (minOffset == 0 || curOffset < minOffset || curOffset > maxOffset) {
                this.k = 0;
            } else {
                int newOffset2 = a.h.h.a.a(newOffset, minOffset, maxOffset);
                if (curOffset != newOffset2) {
                    int interpolatedOffset = appBarLayout.e() ? b0(appBarLayout, newOffset2) : newOffset2;
                    boolean offsetChanged = F(interpolatedOffset);
                    consumed = curOffset - newOffset2;
                    this.k = newOffset2 - interpolatedOffset;
                    if (!offsetChanged && appBarLayout.e()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.a(D());
                    p0(coordinatorLayout, appBarLayout, newOffset2, newOffset2 < curOffset ? -1 : 1, false);
                }
            }
            return consumed;
        }

        public final int b0(T layout, int offset) {
            int absOffset = Math.abs(offset);
            int i = 0;
            int z = layout.getChildCount();
            while (true) {
                if (i >= z) {
                    break;
                }
                View child = layout.getChildAt(i);
                a childLp = (a) child.getLayoutParams();
                Interpolator interpolator = childLp.b();
                if (absOffset < child.getTop() || absOffset > child.getBottom()) {
                    i++;
                } else if (interpolator != null) {
                    int childScrollableHeight = 0;
                    int flags = childLp.a();
                    if ((flags & 1) != 0) {
                        childScrollableHeight = 0 + child.getHeight() + ((LinearLayout.LayoutParams) childLp).topMargin + ((LinearLayout.LayoutParams) childLp).bottomMargin;
                        if ((flags & 2) != 0) {
                            childScrollableHeight -= s.w(child);
                        }
                    }
                    if (s.s(child)) {
                        childScrollableHeight -= layout.getTopInset();
                    }
                    if (childScrollableHeight > 0) {
                        return Integer.signum(offset) * (child.getTop() + Math.round(((float) childScrollableHeight) * interpolator.getInterpolation(((float) (absOffset - child.getTop())) / ((float) childScrollableHeight))));
                    }
                }
            }
            return offset;
        }

        public final void p0(CoordinatorLayout parent, T layout, int offset, int direction, boolean forceJump) {
            View scrollingChild;
            View child = X(layout, offset);
            if (child != null) {
                int flags = ((a) child.getLayoutParams()).a();
                boolean lifted = false;
                boolean z = false;
                if ((flags & 1) != 0) {
                    int minHeight = s.w(child);
                    if (direction > 0 && (flags & 12) != 0) {
                        lifted = (-offset) >= (child.getBottom() - minHeight) - layout.getTopInset();
                    } else if ((flags & 2) != 0) {
                        lifted = (-offset) >= (child.getBottom() - minHeight) - layout.getTopInset();
                    }
                }
                if (layout.i() && (scrollingChild = W(parent)) != null) {
                    if (scrollingChild.getScrollY() > 0) {
                        z = true;
                    }
                    lifted = z;
                }
                boolean changed = layout.n(lifted);
                if (forceJump || (changed && m0(parent, layout))) {
                    layout.jumpDrawablesToCurrentState();
                }
            }
        }

        public final boolean m0(CoordinatorLayout parent, T layout) {
            List<View> dependencies = parent.s(layout);
            int size = dependencies.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c behavior = ((CoordinatorLayout.f) dependencies.get(i).getLayoutParams()).f();
                if (behavior instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behavior).J() != 0;
                }
            }
            return false;
        }

        public static View X(AppBarLayout layout, int offset) {
            int absOffset = Math.abs(offset);
            int z = layout.getChildCount();
            for (int i = 0; i < z; i++) {
                View child = layout.getChildAt(i);
                if (absOffset >= child.getTop() && absOffset <= child.getBottom()) {
                    return child;
                }
            }
            return null;
        }

        public final View W(CoordinatorLayout parent) {
            int z = parent.getChildCount();
            for (int i = 0; i < z; i++) {
                View child = parent.getChildAt(i);
                if (child instanceof k) {
                    return child;
                }
            }
            return null;
        }

        @Override // b.d.a.a.l.a
        public int L() {
            return D() + this.k;
        }

        /* renamed from: i0 */
        public Parcelable x(CoordinatorLayout parent, T abl) {
            Parcelable superState = super.x(parent, abl);
            int offset = D();
            int count = abl.getChildCount();
            for (int i = 0; i < count; i++) {
                View child = abl.getChildAt(i);
                int visBottom = child.getBottom() + offset;
                if (child.getTop() + offset <= 0 && visBottom >= 0) {
                    b ss = new b(superState);
                    ss.f2693d = i;
                    ss.f2695f = visBottom == s.w(child) + abl.getTopInset();
                    ss.f2694e = ((float) visBottom) / ((float) child.getHeight());
                    return ss;
                }
            }
            return superState;
        }

        /* renamed from: h0 */
        public void w(CoordinatorLayout parent, T appBarLayout, Parcelable state) {
            if (state instanceof b) {
                b ss = (b) state;
                super.w(parent, appBarLayout, ss.a());
                this.n = ss.f2693d;
                this.p = ss.f2694e;
                this.o = ss.f2695f;
                return;
            }
            super.w(parent, appBarLayout, state);
            this.n = -1;
        }

        public static class b extends a.j.a.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: d  reason: collision with root package name */
            public int f2693d;

            /* renamed from: e  reason: collision with root package name */
            public float f2694e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f2695f;

            public b(Parcel source, ClassLoader loader) {
                super(source, loader);
                this.f2693d = source.readInt();
                this.f2694e = source.readFloat();
                this.f2695f = source.readByte() != 0;
            }

            public b(Parcelable superState) {
                super(superState);
            }

            @Override // a.j.a.a
            public void writeToParcel(Parcel dest, int flags) {
                super.writeToParcel(dest, flags);
                dest.writeInt(this.f2693d);
                dest.writeFloat(this.f2694e);
                dest.writeByte(this.f2695f ? (byte) 1 : 0);
            }

            public static class a implements Parcelable.ClassLoaderCreator<b> {
                /* renamed from: b */
                public b createFromParcel(Parcel source, ClassLoader loader) {
                    return new b(source, loader);
                }

                /* renamed from: a */
                public b createFromParcel(Parcel source) {
                    return new b(source, null);
                }

                /* renamed from: c */
                public b[] newArray(int size) {
                    return new b[size];
                }
            }
        }
    }

    public static class ScrollingViewBehavior extends b.d.a.a.l.b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a2 = context.obtainStyledAttributes(attrs, j.ScrollingViewBehavior_Layout);
            N(a2.getDimensionPixelSize(j.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            a2.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout parent, View child, View dependency) {
            return dependency instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout parent, View child, View dependency) {
            Q(child, dependency);
            R(child, dependency);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean v(CoordinatorLayout parent, View child, Rect rectangle, boolean immediate) {
            AppBarLayout header = G(parent.r(child));
            if (header != null) {
                rectangle.offset(child.getLeft(), child.getTop());
                Rect parentRect = this.f2564d;
                parentRect.set(0, 0, parent.getWidth(), parent.getHeight());
                if (!parentRect.contains(rectangle)) {
                    header.k(false, !immediate);
                    return true;
                }
            }
            return false;
        }

        public final void Q(View child, View dependency) {
            CoordinatorLayout.c behavior = ((CoordinatorLayout.f) dependency.getLayoutParams()).f();
            if (behavior instanceof BaseBehavior) {
                s.Q(child, (((dependency.getBottom() - child.getTop()) + ((BaseBehavior) behavior).k) + L()) - H(dependency));
            }
        }

        @Override // b.d.a.a.l.b
        public float I(View header) {
            int availScrollRange;
            if (header instanceof AppBarLayout) {
                AppBarLayout abl = (AppBarLayout) header;
                int totalScrollRange = abl.getTotalScrollRange();
                int preScrollDown = abl.getDownNestedPreScrollRange();
                int offset = P(abl);
                if ((preScrollDown == 0 || totalScrollRange + offset > preScrollDown) && (availScrollRange = totalScrollRange - preScrollDown) != 0) {
                    return (((float) offset) / ((float) availScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public static int P(AppBarLayout abl) {
            CoordinatorLayout.c behavior = ((CoordinatorLayout.f) abl.getLayoutParams()).f();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).L();
            }
            return 0;
        }

        /* renamed from: O */
        public AppBarLayout G(List<View> views) {
            int z = views.size();
            for (int i = 0; i < z; i++) {
                View view = views.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // b.d.a.a.l.b
        public int K(View v) {
            if (v instanceof AppBarLayout) {
                return ((AppBarLayout) v).getTotalScrollRange();
            }
            return super.K(v);
        }

        public final void R(View child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) dependency;
                if (appBarLayout.i()) {
                    appBarLayout.n(child.getScrollY() > 0);
                }
            }
        }
    }
}
