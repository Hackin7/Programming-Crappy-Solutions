package androidx.appcompat.widget;

import a.b.f;
import a.b.o.j.m;
import a.b.p.c0;
import a.b.p.d0;
import a.h.m.b0;
import a.h.m.m;
import a.h.m.n;
import a.h.m.o;
import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements c0, m, n {
    public static final int[] G = {a.b.a.actionBarSize, 16842841};
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final AnimatorListenerAdapter C;
    public final Runnable D;
    public final Runnable E;
    public final o F;

    /* renamed from: b  reason: collision with root package name */
    public int f1544b;

    /* renamed from: c  reason: collision with root package name */
    public int f1545c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ContentFrameLayout f1546d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f1547e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f1548f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1549g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o = new Rect();
    public final Rect p = new Rect();
    public final Rect q = new Rect();
    public final Rect r = new Rect();
    public final Rect s = new Rect();
    public final Rect t = new Rect();
    public final Rect u = new Rect();
    public b0 v;
    public b0 w;
    public b0 x;
    public b0 y;
    public d z;

    public interface d {
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f1547e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f1547e.animate().translationY((float) (-ActionBarOverlayLayout.this.f1547e.getHeight())).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        b0 b0Var = b0.f912b;
        this.v = b0Var;
        this.w = b0Var;
        this.x = b0Var;
        this.y = b0Var;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        v(context);
        this.F = new o();
    }

    public final void v(Context context) {
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(G);
        boolean z2 = false;
        this.f1544b = ta.getDimensionPixelSize(0, 0);
        Drawable drawable = ta.getDrawable(1);
        this.f1549g = drawable;
        setWillNotDraw(drawable == null);
        ta.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.h = z2;
        this.A = new OverScroller(context);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    public void setActionBarVisibilityCallback(d cb) {
        this.z = cb;
        if (getWindowToken() != null) {
            ((a.b.k.o) this.z).C(this.f1545c);
            if (this.n != 0) {
                onWindowSystemUiVisibilityChanged(this.n);
                s.W(this);
            }
        }
    }

    public void setOverlayMode(boolean overlayMode) {
        this.i = overlayMode;
        this.h = overlayMode && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public boolean w() {
        return this.i;
    }

    public void setHasNonEmbeddedTabs(boolean hasNonEmbeddedTabs) {
        this.j = hasNonEmbeddedTabs;
    }

    public void setShowingForActionMode(boolean showing) {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        v(getContext());
        s.W(this);
    }

    public void onWindowSystemUiVisibilityChanged(int visible) {
        super.onWindowSystemUiVisibilityChanged(visible);
        z();
        int diff = this.n ^ visible;
        this.n = visible;
        boolean z2 = true;
        boolean barVisible = (visible & 4) == 0;
        boolean stable = (visible & 256) != 0;
        d dVar = this.z;
        if (dVar != null) {
            if (stable) {
                z2 = false;
            }
            ((a.b.k.o) dVar).u(z2);
            if (barVisible || !stable) {
                ((a.b.k.o) this.z).L();
            } else {
                ((a.b.k.o) this.z).y();
            }
        }
        if ((diff & 256) != 0 && this.z != null) {
            s.W(this);
        }
    }

    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        this.f1545c = visibility;
        d dVar = this.z;
        if (dVar != null) {
            ((a.b.k.o) dVar).C(visibility);
        }
    }

    public final boolean q(View view, Rect insets, boolean left, boolean top, boolean bottom, boolean right) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean changed = false;
        e lp = (e) view.getLayoutParams();
        if (left && ((ViewGroup.MarginLayoutParams) lp).leftMargin != (i5 = insets.left)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).leftMargin = i5;
        }
        if (top && ((ViewGroup.MarginLayoutParams) lp).topMargin != (i4 = insets.top)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).topMargin = i4;
        }
        if (right && ((ViewGroup.MarginLayoutParams) lp).rightMargin != (i3 = insets.right)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).rightMargin = i3;
        }
        if (!bottom || ((ViewGroup.MarginLayoutParams) lp).bottomMargin == (i2 = insets.bottom)) {
            return changed;
        }
        ((ViewGroup.MarginLayoutParams) lp).bottomMargin = i2;
        return true;
    }

    public boolean fitSystemWindows(Rect insets) {
        return super.fitSystemWindows(insets);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets in) {
        z();
        b0 insets = b0.n(in);
        boolean changed = q(this.f1547e, new Rect(insets.e(), insets.g(), insets.f(), insets.d()), true, true, false, true);
        s.e(this, insets, this.o);
        Rect rect = this.o;
        b0 i2 = insets.i(rect.left, rect.top, rect.right, rect.bottom);
        this.v = i2;
        if (!this.w.equals(i2)) {
            changed = true;
            this.w = this.v;
        }
        if (!this.p.equals(this.o)) {
            changed = true;
            this.p.set(this.o);
        }
        if (changed) {
            requestLayout();
        }
        return insets.a().c().b().m();
    }

    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attrs) {
        return new e(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new e(p2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof e;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        z();
        int topInset = 0;
        measureChildWithMargins(this.f1547e, widthMeasureSpec, 0, heightMeasureSpec, 0);
        e lp = (e) this.f1547e.getLayoutParams();
        int maxWidth = Math.max(0, this.f1547e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin);
        int maxHeight = Math.max(0, this.f1547e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        int childState = View.combineMeasuredStates(0, this.f1547e.getMeasuredState());
        boolean stable = (s.C(this) & 256) != 0;
        if (stable) {
            topInset = this.f1544b;
            if (this.j && this.f1547e.getTabContainer() != null) {
                topInset += this.f1544b;
            }
        } else if (this.f1547e.getVisibility() != 8) {
            topInset = this.f1547e.getMeasuredHeight();
        }
        this.q.set(this.o);
        b0 b0Var = this.v;
        this.x = b0Var;
        if (this.i || stable) {
            a.h.f.b sysWindow = a.h.f.b.a(this.x.e(), this.x.g() + topInset, this.x.f(), this.x.d() + 0);
            b0.a aVar = new b0.a(this.x);
            aVar.c(sysWindow);
            this.x = aVar.a();
        } else {
            Rect rect = this.q;
            rect.top += topInset;
            rect.bottom += 0;
            this.x = b0Var.i(0, topInset, 0, 0);
        }
        q(this.f1546d, this.q, true, true, true, true);
        if (!this.y.equals(this.x)) {
            b0 b0Var2 = this.x;
            this.y = b0Var2;
            s.f(this.f1546d, b0Var2);
        }
        measureChildWithMargins(this.f1546d, widthMeasureSpec, 0, heightMeasureSpec, 0);
        e lp2 = (e) this.f1546d.getLayoutParams();
        int maxWidth2 = Math.max(maxWidth, this.f1546d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp2).leftMargin + ((ViewGroup.MarginLayoutParams) lp2).rightMargin);
        int maxHeight2 = Math.max(maxHeight, this.f1546d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp2).topMargin + ((ViewGroup.MarginLayoutParams) lp2).bottomMargin);
        int childState2 = View.combineMeasuredStates(childState, this.f1546d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(maxWidth2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, childState2), View.resolveSizeAndState(Math.max(maxHeight2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState2 << 16));
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int count = getChildCount();
        int parentLeft = getPaddingLeft();
        int parentTop = getPaddingTop();
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                e lp = (e) child.getLayoutParams();
                int width = child.getMeasuredWidth();
                int height = child.getMeasuredHeight();
                int childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + parentLeft;
                int childTop = ((ViewGroup.MarginLayoutParams) lp).topMargin + parentTop;
                child.layout(childLeft, childTop, childLeft + width, childTop + height);
            }
        }
    }

    public void draw(Canvas c2) {
        int top;
        super.draw(c2);
        if (this.f1549g != null && !this.h) {
            if (this.f1547e.getVisibility() == 0) {
                top = (int) (((float) this.f1547e.getBottom()) + this.f1547e.getTranslationY() + 0.5f);
            } else {
                top = 0;
            }
            this.f1549g.setBounds(0, top, getWidth(), this.f1549g.getIntrinsicHeight() + top);
            this.f1549g.draw(c2);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // a.h.m.n
    public void m(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        n(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
    }

    @Override // a.h.m.m
    public boolean o(View child, View target, int axes, int type) {
        return type == 0 && onStartNestedScroll(child, target, axes);
    }

    @Override // a.h.m.m
    public void h(View child, View target, int axes, int type) {
        if (type == 0) {
            onNestedScrollAccepted(child, target, axes);
        }
    }

    @Override // a.h.m.m
    public void i(View target, int type) {
        if (type == 0) {
            onStopNestedScroll(target);
        }
    }

    @Override // a.h.m.m
    public void n(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (type == 0) {
            onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        }
    }

    @Override // a.h.m.m
    public void j(View target, int dx, int dy, int[] consumed, int type) {
        if (type == 0) {
            onNestedPreScroll(target, dx, dy, consumed);
        }
    }

    public boolean onStartNestedScroll(View child, View target, int axes) {
        if ((axes & 2) == 0 || this.f1547e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    public void onNestedScrollAccepted(View child, View target, int axes) {
        this.F.c(child, target, axes);
        this.m = getActionBarHideOffset();
        u();
        d dVar = this.z;
        if (dVar != null) {
            ((a.b.k.o) dVar).A();
        }
    }

    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        int i2 = this.m + dyConsumed;
        this.m = i2;
        setActionBarHideOffset(i2);
    }

    public void onStopNestedScroll(View target) {
        if (this.k && !this.l) {
            if (this.m <= this.f1547e.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.z;
        if (dVar != null) {
            ((a.b.k.o) dVar).B();
        }
    }

    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!this.k || !consumed) {
            return false;
        }
        if (B(velocityY)) {
            p();
        } else {
            A();
        }
        this.l = true;
        return true;
    }

    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
    }

    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public void z() {
        if (this.f1546d == null) {
            this.f1546d = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f1547e = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f1548f = t(findViewById(f.action_bar));
        }
    }

    public final d0 t(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean hideOnContentScroll) {
        if (hideOnContentScroll != this.k) {
            this.k = hideOnContentScroll;
            if (!hideOnContentScroll) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1547e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int offset) {
        u();
        this.f1547e.setTranslationY((float) (-Math.max(0, Math.min(offset, this.f1547e.getHeight()))));
    }

    public void u() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void y() {
        u();
        postDelayed(this.D, 600);
    }

    public final void x() {
        u();
        postDelayed(this.E, 600);
    }

    public final void A() {
        u();
        this.D.run();
    }

    public final void p() {
        u();
        this.E.run();
    }

    public final boolean B(float velocityY) {
        this.A.fling(0, 0, 0, (int) velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.A.getFinalY() > this.f1547e.getHeight();
    }

    @Override // a.b.p.c0
    public void setWindowCallback(Window.Callback cb) {
        z();
        this.f1548f.setWindowCallback(cb);
    }

    @Override // a.b.p.c0
    public void setWindowTitle(CharSequence title) {
        z();
        this.f1548f.setWindowTitle(title);
    }

    public CharSequence getTitle() {
        z();
        return this.f1548f.getTitle();
    }

    @Override // a.b.p.c0
    public void k(int windowFeature) {
        z();
        if (windowFeature == 2) {
            this.f1548f.t();
        } else if (windowFeature == 5) {
            this.f1548f.v();
        } else if (windowFeature == 109) {
            setOverlayMode(true);
        }
    }

    public void setUiOptions(int uiOptions) {
    }

    public void setIcon(int resId) {
        z();
        this.f1548f.setIcon(resId);
    }

    public void setIcon(Drawable d2) {
        z();
        this.f1548f.setIcon(d2);
    }

    public void setLogo(int resId) {
        z();
        this.f1548f.m(resId);
    }

    @Override // a.b.p.c0
    public boolean g() {
        z();
        return this.f1548f.g();
    }

    @Override // a.b.p.c0
    public boolean c() {
        z();
        return this.f1548f.c();
    }

    @Override // a.b.p.c0
    public boolean b() {
        z();
        return this.f1548f.b();
    }

    @Override // a.b.p.c0
    public boolean e() {
        z();
        return this.f1548f.e();
    }

    @Override // a.b.p.c0
    public boolean d() {
        z();
        return this.f1548f.d();
    }

    @Override // a.b.p.c0
    public void f() {
        z();
        this.f1548f.f();
    }

    @Override // a.b.p.c0
    public void a(Menu menu, m.a cb) {
        z();
        this.f1548f.a(menu, cb);
    }

    @Override // a.b.p.c0
    public void l() {
        z();
        this.f1548f.h();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public e(int width, int height) {
            super(width, height);
        }

        public e(ViewGroup.LayoutParams source) {
            super(source);
        }
    }
}
