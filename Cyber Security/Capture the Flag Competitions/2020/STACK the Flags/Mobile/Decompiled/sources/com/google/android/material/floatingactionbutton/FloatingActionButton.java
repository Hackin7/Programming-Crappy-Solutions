package com.google.android.material.floatingactionbutton;

import a.b.p.n;
import a.h.m.s;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.d.a.a.d;
import b.d.a.a.i;
import b.d.a.a.j;
import b.d.a.a.q.a;
import b.d.a.a.r.f;
import b.d.a.a.r.g;
import b.d.a.a.r.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class FloatingActionButton extends h implements b.d.a.a.p.a {

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f2740c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f2741d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f2742e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f2743f;

    /* renamed from: g  reason: collision with root package name */
    public int f2744g;
    public ColorStateList h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public final Rect n;
    public final Rect o;
    public final n p;
    public final b.d.a.a.p.b q;
    public b.d.a.a.q.a r;

    public static abstract class b {
    }

    public FloatingActionButton(Context context, AttributeSet attrs) {
        this(context, attrs, b.d.a.a.b.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.n = new Rect();
        this.o = new Rect();
        TypedArray a2 = f.h(context, attrs, j.FloatingActionButton, defStyleAttr, i.Widget_Design_FloatingActionButton, new int[0]);
        this.f2740c = b.d.a.a.t.a.a(context, a2, j.FloatingActionButton_backgroundTint);
        this.f2741d = g.a(a2.getInt(j.FloatingActionButton_backgroundTintMode, -1), null);
        this.h = b.d.a.a.t.a.a(context, a2, j.FloatingActionButton_rippleColor);
        this.i = a2.getInt(j.FloatingActionButton_fabSize, -1);
        this.j = a2.getDimensionPixelSize(j.FloatingActionButton_fabCustomSize, 0);
        this.f2744g = a2.getDimensionPixelSize(j.FloatingActionButton_borderWidth, 0);
        float elevation = a2.getDimension(j.FloatingActionButton_elevation, 0.0f);
        float hoveredFocusedTranslationZ = a2.getDimension(j.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float pressedTranslationZ = a2.getDimension(j.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.m = a2.getBoolean(j.FloatingActionButton_useCompatPadding, false);
        this.l = a2.getDimensionPixelSize(j.FloatingActionButton_maxImageSize, 0);
        b.d.a.a.k.h showMotionSpec = b.d.a.a.k.h.b(context, a2, j.FloatingActionButton_showMotionSpec);
        b.d.a.a.k.h hideMotionSpec = b.d.a.a.k.h.b(context, a2, j.FloatingActionButton_hideMotionSpec);
        a2.recycle();
        n nVar = new n(this);
        this.p = nVar;
        nVar.f(attrs, defStyleAttr);
        this.q = new b.d.a.a.p.b(this);
        getImpl().H(this.f2740c, this.f2741d, this.h, this.f2744g);
        getImpl().K(elevation);
        getImpl().M(hoveredFocusedTranslationZ);
        getImpl().P(pressedTranslationZ);
        getImpl().O(this.l);
        getImpl().R(showMotionSpec);
        getImpl().L(hideMotionSpec);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int preferredSize = getSizeDimension();
        this.k = (preferredSize - this.l) / 2;
        getImpl().W();
        int d2 = Math.min(q(preferredSize, widthMeasureSpec), q(preferredSize, heightMeasureSpec));
        Rect rect = this.n;
        setMeasuredDimension(rect.left + d2 + rect.right, rect.top + d2 + rect.bottom);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.h;
    }

    public void setRippleColor(int color) {
        setRippleColor(ColorStateList.valueOf(color));
    }

    public void setRippleColor(ColorStateList color) {
        if (this.h != color) {
            this.h = color;
            getImpl().Q(this.h);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f2740c;
    }

    public void setBackgroundTintList(ColorStateList tint) {
        if (this.f2740c != tint) {
            this.f2740c = tint;
            getImpl().I(tint);
        }
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f2741d;
    }

    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (this.f2741d != tintMode) {
            this.f2741d = tintMode;
            getImpl().J(tintMode);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        setBackgroundTintList(tint);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        setBackgroundTintMode(tintMode);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public void setSupportImageTintList(ColorStateList tint) {
        if (this.f2742e != tint) {
            this.f2742e = tint;
            n();
        }
    }

    public ColorStateList getSupportImageTintList() {
        return this.f2742e;
    }

    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        if (this.f2743f != tintMode) {
            this.f2743f = tintMode;
            n();
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f2743f;
    }

    public final void n() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f2742e;
            if (colorStateList == null) {
                a.h.f.l.a.c(drawable);
                return;
            }
            int color = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f2743f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(a.b.p.j.e(color, mode));
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int resid) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int color) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(int resId) {
        this.p.g(resId);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().V();
    }

    public void r(b listener, boolean fromUser) {
        getImpl().T(s(listener), fromUser);
    }

    public void f(Animator.AnimatorListener listener) {
        getImpl().b(listener);
    }

    public void p(Animator.AnimatorListener listener) {
        getImpl().F(listener);
    }

    public void k(b listener, boolean fromUser) {
        getImpl().r(s(listener), fromUser);
    }

    public void e(Animator.AnimatorListener listener) {
        getImpl().a(listener);
    }

    public void o(Animator.AnimatorListener listener) {
        getImpl().E(listener);
    }

    @Override // b.d.a.a.p.a
    public boolean a() {
        return this.q.c();
    }

    public void setExpandedComponentIdHint(int expandedComponentIdHint) {
        this.q.f(expandedComponentIdHint);
    }

    public int getExpandedComponentIdHint() {
        return this.q.b();
    }

    public void setUseCompatPadding(boolean useCompatPadding) {
        if (this.m != useCompatPadding) {
            this.m = useCompatPadding;
            getImpl().y();
        }
    }

    public boolean getUseCompatPadding() {
        return this.m;
    }

    public void setSize(int size) {
        this.j = 0;
        if (size != this.i) {
            this.i = size;
            requestLayout();
        }
    }

    public int getSize() {
        return this.i;
    }

    public final a.g s(b listener) {
        if (listener == null) {
            return null;
        }
        return new a();
    }

    public class a implements a.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f2747a = null;

        public a() {
        }

        public void b() {
            throw null;
        }

        public void a() {
            throw null;
        }
    }

    public boolean l() {
        return getImpl().t();
    }

    public void setCustomSize(int size) {
        if (size >= 0) {
            this.j = size;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public int getCustomSize() {
        return this.j;
    }

    public int getSizeDimension() {
        return j(this.i);
    }

    public final int j(int size) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources res = getResources();
        if (size != -1) {
            if (size != 1) {
                return res.getDimensionPixelSize(d.design_fab_size_normal);
            }
            return res.getDimensionPixelSize(d.design_fab_size_mini);
        } else if (Math.max(res.getConfiguration().screenWidthDp, res.getConfiguration().screenHeightDp) < 470) {
            return j(1);
        } else {
            return j(0);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().x();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().z();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().u();
    }

    public Parcelable onSaveInstanceState() {
        b.d.a.a.x.a state = new b.d.a.a.x.a(super.onSaveInstanceState());
        state.f2665d.put("expandableWidgetHelper", this.q.e());
        return state;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof b.d.a.a.x.a)) {
            super.onRestoreInstanceState(state);
            return;
        }
        b.d.a.a.x.a ess = (b.d.a.a.x.a) state;
        super.onRestoreInstanceState(ess.a());
        this.q.d(ess.f2665d.get("expandableWidgetHelper"));
    }

    @Deprecated
    public boolean h(Rect rect) {
        if (!s.K(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m(rect);
        return true;
    }

    public void i(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m(rect);
    }

    public final void m(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.n;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public Drawable getContentBackground() {
        return getImpl().i();
    }

    public static int q(int desiredSize, int measureSpec) {
        int specMode = View.MeasureSpec.getMode(measureSpec);
        int specSize = View.MeasureSpec.getSize(measureSpec);
        if (specMode == Integer.MIN_VALUE) {
            return Math.min(desiredSize, specSize);
        }
        if (specMode == 0) {
            return desiredSize;
        }
        if (specMode == 1073741824) {
            return specSize;
        }
        throw new IllegalArgumentException();
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() != 0 || !h(this.o) || this.o.contains((int) ev.getX(), (int) ev.getY())) {
            return super.onTouchEvent(ev);
        }
        return false;
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f2745a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2746b;

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return D((FloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            G(coordinatorLayout, (FloatingActionButton) view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            H(coordinatorLayout, (FloatingActionButton) view, i);
            return true;
        }

        public BaseBehavior() {
            this.f2746b = true;
        }

        public BaseBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a2 = context.obtainStyledAttributes(attrs, j.FloatingActionButton_Behavior_Layout);
            this.f2746b = a2.getBoolean(j.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            a2.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f lp) {
            if (lp.h == 0) {
                lp.h = 80;
            }
        }

        public boolean G(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                J(parent, (AppBarLayout) dependency, child);
                return false;
            } else if (!E(dependency)) {
                return false;
            } else {
                K(dependency, child);
                return false;
            }
        }

        public static boolean E(View view) {
            ViewGroup.LayoutParams lp = view.getLayoutParams();
            if (lp instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) lp).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public final boolean I(View dependency, FloatingActionButton child) {
            CoordinatorLayout.f lp = (CoordinatorLayout.f) child.getLayoutParams();
            if (this.f2746b && lp.e() == dependency.getId() && child.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean J(CoordinatorLayout parent, AppBarLayout appBarLayout, FloatingActionButton child) {
            if (!I(appBarLayout, child)) {
                return false;
            }
            if (this.f2745a == null) {
                this.f2745a = new Rect();
            }
            Rect rect = this.f2745a;
            b.d.a.a.r.c.a(parent, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                child.k(null, false);
                return true;
            }
            child.r(null, false);
            return true;
        }

        public final boolean K(View bottomSheet, FloatingActionButton child) {
            if (!I(bottomSheet, child)) {
                return false;
            }
            if (bottomSheet.getTop() < (child.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) child.getLayoutParams())).topMargin) {
                child.k(null, false);
                return true;
            }
            child.r(null, false);
            return true;
        }

        public boolean H(CoordinatorLayout parent, FloatingActionButton child, int layoutDirection) {
            List<View> dependencies = parent.r(child);
            int count = dependencies.size();
            for (int i = 0; i < count; i++) {
                View dependency = dependencies.get(i);
                if (!(dependency instanceof AppBarLayout)) {
                    if (E(dependency) && K(dependency, child)) {
                        break;
                    }
                } else if (J(parent, (AppBarLayout) dependency, child)) {
                    break;
                }
            }
            parent.I(child, layoutDirection);
            F(parent, child);
            return true;
        }

        public boolean D(FloatingActionButton child, Rect rect) {
            Rect shadowPadding = child.n;
            rect.set(child.getLeft() + shadowPadding.left, child.getTop() + shadowPadding.top, child.getRight() - shadowPadding.right, child.getBottom() - shadowPadding.bottom);
            return true;
        }

        public final void F(CoordinatorLayout parent, FloatingActionButton fab) {
            Rect padding = fab.n;
            if (padding != null && padding.centerX() > 0 && padding.centerY() > 0) {
                CoordinatorLayout.f lp = (CoordinatorLayout.f) fab.getLayoutParams();
                int offsetTB = 0;
                int offsetLR = 0;
                if (fab.getRight() >= parent.getWidth() - ((ViewGroup.MarginLayoutParams) lp).rightMargin) {
                    offsetLR = padding.right;
                } else if (fab.getLeft() <= ((ViewGroup.MarginLayoutParams) lp).leftMargin) {
                    offsetLR = -padding.left;
                }
                if (fab.getBottom() >= parent.getHeight() - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) {
                    offsetTB = padding.bottom;
                } else if (fab.getTop() <= ((ViewGroup.MarginLayoutParams) lp).topMargin) {
                    offsetTB = -padding.top;
                }
                if (offsetTB != 0) {
                    s.Q(fab, offsetTB);
                }
                if (offsetLR != 0) {
                    s.P(fab, offsetLR);
                }
            }
        }
    }

    public float getCompatElevation() {
        return getImpl().l();
    }

    public void setCompatElevation(float elevation) {
        getImpl().K(elevation);
    }

    public void setCompatElevationResource(int id) {
        setCompatElevation(getResources().getDimension(id));
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().n();
    }

    public void setCompatHoveredFocusedTranslationZ(float translationZ) {
        getImpl().M(translationZ);
    }

    public void setCompatHoveredFocusedTranslationZResource(int id) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(id));
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().p();
    }

    public void setCompatPressedTranslationZ(float translationZ) {
        getImpl().P(translationZ);
    }

    public void setCompatPressedTranslationZResource(int id) {
        setCompatPressedTranslationZ(getResources().getDimension(id));
    }

    public b.d.a.a.k.h getShowMotionSpec() {
        return getImpl().q();
    }

    public void setShowMotionSpec(b.d.a.a.k.h spec) {
        getImpl().R(spec);
    }

    public void setShowMotionSpecResource(int id) {
        setShowMotionSpec(b.d.a.a.k.h.c(getContext(), id));
    }

    public b.d.a.a.k.h getHideMotionSpec() {
        return getImpl().m();
    }

    public void setHideMotionSpec(b.d.a.a.k.h spec) {
        getImpl().L(spec);
    }

    public void setHideMotionSpecResource(int id) {
        setHideMotionSpec(b.d.a.a.k.h.c(getContext(), id));
    }

    private b.d.a.a.q.a getImpl() {
        if (this.r == null) {
            this.r = g();
        }
        return this.r;
    }

    public final b.d.a.a.q.a g() {
        return new b.d.a.a.q.b(this, new c());
    }

    public class c implements b.d.a.a.v.b {
        public c() {
        }

        public float a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        public void d(int left, int top, int right, int bottom) {
            FloatingActionButton.this.n.set(left, top, right, bottom);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(floatingActionButton.k + left, FloatingActionButton.this.k + top, FloatingActionButton.this.k + right, FloatingActionButton.this.k + bottom);
        }

        public void c(Drawable background) {
            FloatingActionButton.super.setBackgroundDrawable(background);
        }

        public boolean b() {
            return FloatingActionButton.this.m;
        }
    }
}
