package androidx.core.widget;

import a.h.m.c0.d;
import a.h.m.c0.f;
import a.h.m.j;
import a.h.m.l;
import a.h.m.n;
import a.h.m.o;
import a.h.m.s;
import a.h.n.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class NestedScrollView extends FrameLayout implements n, j {
    public static final a B = new a();
    public static final int[] C = {16843130};
    public b A;

    /* renamed from: b  reason: collision with root package name */
    public long f1674b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1675c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f1676d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f1677e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f1678f;

    /* renamed from: g  reason: collision with root package name */
    public int f1679g;
    public boolean h;
    public boolean i;
    public View j;
    public boolean k;
    public VelocityTracker l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public c w;
    public final o x;
    public final l y;
    public float z;

    public interface b {
    }

    public NestedScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1675c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        y();
        TypedArray a2 = context.obtainStyledAttributes(attrs, C, defStyleAttr, 0);
        setFillViewport(a2.getBoolean(0, false));
        a2.recycle();
        this.x = new o();
        this.y = new l(this);
        setNestedScrollingEnabled(true);
        s.Z(this, B);
    }

    public void k(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        this.y.e(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    public boolean Q(int axes, int type) {
        return this.y.q(axes, type);
    }

    @Override // a.h.m.j
    public void a(int type) {
        this.y.s(type);
    }

    public boolean v(int type) {
        return this.y.l(type);
    }

    public boolean g(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.y.d(dx, dy, consumed, offsetInWindow, type);
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        this.y.n(enabled);
    }

    public boolean isNestedScrollingEnabled() {
        return this.y.m();
    }

    public boolean startNestedScroll(int axes) {
        return Q(axes, 0);
    }

    public void stopNestedScroll() {
        a(0);
    }

    public boolean hasNestedScrollingParent() {
        return v(0);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return this.y.f(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return g(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.y.a(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.y.b(velocityX, velocityY);
    }

    @Override // a.h.m.n
    public void m(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        D(dyUnconsumed, type, consumed);
    }

    public final void D(int dyUnconsumed, int type, int[] consumed) {
        int oldScrollY = getScrollY();
        scrollBy(0, dyUnconsumed);
        int myConsumed = getScrollY() - oldScrollY;
        if (consumed != null) {
            consumed[1] = consumed[1] + myConsumed;
        }
        this.y.e(0, myConsumed, 0, dyUnconsumed - myConsumed, null, type, consumed);
    }

    @Override // a.h.m.m
    public boolean o(View child, View target, int axes, int type) {
        return (axes & 2) != 0;
    }

    @Override // a.h.m.m
    public void h(View child, View target, int axes, int type) {
        this.x.b(axes, type);
        Q(2, type);
    }

    @Override // a.h.m.m
    public void i(View target, int type) {
        this.x.d(type);
        a(type);
    }

    @Override // a.h.m.m
    public void n(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        D(dyUnconsumed, type, null);
    }

    @Override // a.h.m.m
    public void j(View target, int dx, int dy, int[] consumed, int type) {
        g(dx, dy, consumed, null, type);
    }

    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return o(child, target, nestedScrollAxes, 0);
    }

    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        h(child, target, nestedScrollAxes, 0);
    }

    public void onStopNestedScroll(View target) {
        i(target, 0);
    }

    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        D(dyUnconsumed, 0, null);
    }

    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        j(target, dx, dy, consumed, 0);
    }

    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (consumed) {
            return false;
        }
        dispatchNestedFling(0.0f, velocityY, true);
        t((int) velocityY);
        return true;
    }

    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return dispatchNestedPreFling(velocityX, velocityY);
    }

    public int getNestedScrollAxes() {
        return this.x.a();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int length = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < length) {
            return ((float) scrollY) / ((float) length);
        }
        return 1.0f;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View child = getChildAt(0);
        int length = getVerticalFadingEdgeLength();
        int span = ((child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (span < length) {
            return ((float) span) / ((float) length);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public final void y() {
        this.f1676d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration configuration = ViewConfiguration.get(getContext());
        this.o = configuration.getScaledTouchSlop();
        this.p = configuration.getScaledMinimumFlingVelocity();
        this.q = configuration.getScaledMaximumFlingVelocity();
    }

    public void addView(View child) {
        if (getChildCount() <= 0) {
            super.addView(child);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        if (getChildCount() <= 0) {
            super.addView(child, index);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(b l2) {
        this.A = l2;
    }

    public final boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (child.getHeight() + lp.topMargin + lp.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public void setFillViewport(boolean fillViewport) {
        if (fillViewport != this.m) {
            this.m = fillViewport;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
        this.n = smoothScrollingEnabled;
    }

    public void onScrollChanged(int l2, int t2, int oldl, int oldt) {
        super.onScrollChanged(l2, t2, oldl, oldt);
        b bVar = this.A;
        if (bVar != null) {
            ((AlertController.b) bVar).a(this, l2, t2, oldl, oldt);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.m && View.MeasureSpec.getMode(heightMeasureSpec) != 0 && getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int childSize = child.getMeasuredHeight();
            int parentSpace = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - lp.topMargin) - lp.bottomMargin;
            if (childSize < parentSpace) {
                child.measure(FrameLayout.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin, lp.width), View.MeasureSpec.makeMeasureSpec(parentSpace, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || r(event);
    }

    public boolean r(KeyEvent event) {
        this.f1675c.setEmpty();
        int i2 = 130;
        if (!d()) {
            if (!isFocused() || event.getKeyCode() == 4) {
                return false;
            }
            View currentFocused = findFocus();
            if (currentFocused == this) {
                currentFocused = null;
            }
            View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, 130);
            if (nextFocused == null || nextFocused == this || !nextFocused.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (event.getAction() != 0) {
            return false;
        } else {
            int keyCode = event.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (event.isShiftPressed()) {
                        i2 = 33;
                    }
                    G(i2);
                    return false;
                } else if (!event.isAltPressed()) {
                    return c(130);
                } else {
                    return u(130);
                }
            } else if (!event.isAltPressed()) {
                return c(33);
            } else {
                return u(33);
            }
        }
    }

    public final boolean w(int x2, int y2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View child = getChildAt(0);
        if (y2 < child.getTop() - scrollY || y2 >= child.getBottom() - scrollY || x2 < child.getLeft() || x2 >= child.getRight()) {
            return false;
        }
        return true;
    }

    public final void x() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            this.l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void z() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    public final void H() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept) {
            H();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 2 && this.k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int activePointerId = this.r;
                    if (activePointerId != -1) {
                        int pointerIndex = ev.findPointerIndex(activePointerId);
                        if (pointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + activePointerId + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) ev.getY(pointerIndex);
                            if (Math.abs(y2 - this.f1679g) > this.o && (2 & getNestedScrollAxes()) == 0) {
                                this.k = true;
                                this.f1679g = y2;
                                z();
                                this.l.addMovement(ev);
                                this.u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        E(ev);
                    }
                }
            }
            this.k = false;
            this.r = -1;
            H();
            if (this.f1676d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                s.T(this);
            }
            a(0);
        } else {
            int y3 = (int) ev.getY();
            if (!w((int) ev.getX(), y3)) {
                this.k = false;
                H();
            } else {
                this.f1679g = y3;
                this.r = ev.getPointerId(0);
                x();
                this.l.addMovement(ev);
                this.f1676d.computeScrollOffset();
                this.k = true ^ this.f1676d.isFinished();
                Q(2, 0);
            }
        }
        return this.k;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        ViewParent parent;
        int deltaY;
        int deltaY2;
        z();
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        MotionEvent vtev = MotionEvent.obtain(ev);
        vtev.offsetLocation(0.0f, (float) this.u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(SQLiteDatabase.SLEEP_AFTER_YIELD_QUANTUM, (float) this.q);
                int initialVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(initialVelocity) >= this.p) {
                    if (!dispatchNestedPreFling(0.0f, (float) (-initialVelocity))) {
                        dispatchNestedFling(0.0f, (float) (-initialVelocity), true);
                        t(-initialVelocity);
                    }
                } else if (this.f1676d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    s.T(this);
                }
                this.r = -1;
                p();
            } else if (actionMasked == 2) {
                int activePointerIndex = ev.findPointerIndex(this.r);
                if (activePointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                } else {
                    int y2 = (int) ev.getY(activePointerIndex);
                    int deltaY3 = this.f1679g - y2;
                    if (this.k || Math.abs(deltaY3) <= this.o) {
                        deltaY = deltaY3;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        if (deltaY3 > 0) {
                            deltaY = deltaY3 - this.o;
                        } else {
                            deltaY = deltaY3 + this.o;
                        }
                    }
                    if (this.k) {
                        if (g(0, deltaY, this.t, this.s, 0)) {
                            int deltaY4 = deltaY - this.t[1];
                            this.u += this.s[1];
                            deltaY2 = deltaY4;
                        } else {
                            deltaY2 = deltaY;
                        }
                        this.f1679g = y2 - this.s[1];
                        int oldY = getScrollY();
                        int range = getScrollRange();
                        int overscrollMode = getOverScrollMode();
                        boolean canOverscroll = overscrollMode == 0 || (overscrollMode == 1 && range > 0);
                        if (F(0, deltaY2, 0, getScrollY(), 0, range, 0, 0) && !v(0)) {
                            this.l.clear();
                        }
                        int scrolledDeltaY = getScrollY() - oldY;
                        int[] iArr = this.t;
                        iArr[1] = 0;
                        k(0, scrolledDeltaY, 0, deltaY2 - scrolledDeltaY, this.s, 0, iArr);
                        int i2 = this.f1679g;
                        int[] iArr2 = this.s;
                        this.f1679g = i2 - iArr2[1];
                        this.u += iArr2[1];
                        if (canOverscroll) {
                            int deltaY5 = deltaY2 - this.t[1];
                            q();
                            int pulledToY = oldY + deltaY5;
                            if (pulledToY < 0) {
                                d.a(this.f1677e, ((float) deltaY5) / ((float) getHeight()), ev.getX(activePointerIndex) / ((float) getWidth()));
                                if (!this.f1678f.isFinished()) {
                                    this.f1678f.onRelease();
                                }
                            } else if (pulledToY > range) {
                                d.a(this.f1678f, ((float) deltaY5) / ((float) getHeight()), 1.0f - (ev.getX(activePointerIndex) / ((float) getWidth())));
                                if (!this.f1677e.isFinished()) {
                                    this.f1677e.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f1677e;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f1678f.isFinished())) {
                                s.T(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.k && getChildCount() > 0 && this.f1676d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    s.T(this);
                }
                this.r = -1;
                p();
            } else if (actionMasked == 5) {
                int index = ev.getActionIndex();
                this.f1679g = (int) ev.getY(index);
                this.r = ev.getPointerId(index);
            } else if (actionMasked == 6) {
                E(ev);
                this.f1679g = (int) ev.getY(ev.findPointerIndex(this.r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f1676d.isFinished();
            this.k = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1676d.isFinished()) {
                b();
            }
            this.f1679g = (int) ev.getY();
            this.r = ev.getPointerId(0);
            Q(2, 0);
        }
        VelocityTracker velocityTracker2 = this.l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    public final void E(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        if (ev.getPointerId(pointerIndex) == this.r) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.f1679g = (int) ev.getY(newPointerIndex);
            this.r = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) == 0 || event.getAction() != 8 || this.k) {
            return false;
        }
        float vscroll = event.getAxisValue(9);
        if (vscroll == 0.0f) {
            return false;
        }
        int range = getScrollRange();
        int oldScrollY = getScrollY();
        int newScrollY = oldScrollY - ((int) (getVerticalScrollFactorCompat() * vscroll));
        if (newScrollY < 0) {
            newScrollY = 0;
        } else if (newScrollY > range) {
            newScrollY = range;
        }
        if (newScrollY == oldScrollY) {
            return false;
        }
        super.scrollTo(getScrollX(), newScrollY);
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue outValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
                this.z = outValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.z;
    }

    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.scrollTo(scrollX, scrollY);
    }

    public boolean F(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY) {
        int maxOverScrollX2;
        int maxOverScrollY2;
        boolean clampedX;
        boolean clampedY;
        int overScrollMode = getOverScrollMode();
        boolean canScrollHorizontal = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean canScrollVertical = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean overScrollHorizontal = overScrollMode == 0 || (overScrollMode == 1 && canScrollHorizontal);
        boolean overScrollVertical = overScrollMode == 0 || (overScrollMode == 1 && canScrollVertical);
        int newScrollX = scrollX + deltaX;
        if (!overScrollHorizontal) {
            maxOverScrollX2 = 0;
        } else {
            maxOverScrollX2 = maxOverScrollX;
        }
        int newScrollY = scrollY + deltaY;
        if (!overScrollVertical) {
            maxOverScrollY2 = 0;
        } else {
            maxOverScrollY2 = maxOverScrollY;
        }
        int left = -maxOverScrollX2;
        int right = maxOverScrollX2 + scrollRangeX;
        int top = -maxOverScrollY2;
        int bottom = maxOverScrollY2 + scrollRangeY;
        if (newScrollX > right) {
            newScrollX = right;
            clampedX = true;
        } else if (newScrollX < left) {
            newScrollX = left;
            clampedX = true;
        } else {
            clampedX = false;
        }
        if (newScrollY > bottom) {
            newScrollY = bottom;
            clampedY = true;
        } else if (newScrollY < top) {
            newScrollY = top;
            clampedY = true;
        } else {
            clampedY = false;
        }
        if (clampedY) {
            if (!v(1)) {
                this.f1676d.springBack(newScrollX, newScrollY, 0, 0, 0, getScrollRange());
            }
        }
        onOverScrolled(newScrollX, newScrollY, clampedX, clampedY);
        return clampedX || clampedY;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        return Math.max(0, ((child.getHeight() + lp.topMargin) + lp.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public final View s(boolean topFocus, int top, int bottom) {
        List<View> focusables = getFocusables(2);
        View focusCandidate = null;
        boolean foundFullyContainedFocusable = false;
        int count = focusables.size();
        for (int i2 = 0; i2 < count; i2++) {
            View view = focusables.get(i2);
            int viewTop = view.getTop();
            int viewBottom = view.getBottom();
            if (top < viewBottom && viewTop < bottom) {
                boolean viewIsCloserToBoundary = false;
                boolean viewIsFullyContained = top < viewTop && viewBottom < bottom;
                if (focusCandidate == null) {
                    focusCandidate = view;
                    foundFullyContainedFocusable = viewIsFullyContained;
                } else {
                    if ((topFocus && viewTop < focusCandidate.getTop()) || (!topFocus && viewBottom > focusCandidate.getBottom())) {
                        viewIsCloserToBoundary = true;
                    }
                    if (foundFullyContainedFocusable) {
                        if (viewIsFullyContained && viewIsCloserToBoundary) {
                            focusCandidate = view;
                        }
                    } else if (viewIsFullyContained) {
                        focusCandidate = view;
                        foundFullyContainedFocusable = true;
                    } else if (viewIsCloserToBoundary) {
                        focusCandidate = view;
                    }
                }
            }
        }
        return focusCandidate;
    }

    public boolean G(int direction) {
        boolean down = direction == 130;
        int height = getHeight();
        if (down) {
            this.f1675c.top = getScrollY() + height;
            int count = getChildCount();
            if (count > 0) {
                View view = getChildAt(count - 1);
                int bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1675c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1675c.top = getScrollY() - height;
            Rect rect2 = this.f1675c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1675c;
        int i2 = rect3.top;
        int i3 = i2 + height;
        rect3.bottom = i3;
        return J(direction, i2, i3);
    }

    public boolean u(int direction) {
        int count;
        boolean down = direction == 130;
        int height = getHeight();
        Rect rect = this.f1675c;
        rect.top = 0;
        rect.bottom = height;
        if (down && (count = getChildCount()) > 0) {
            View view = getChildAt(count - 1);
            this.f1675c.bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1675c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1675c;
        return J(direction, rect3.top, rect3.bottom);
    }

    public final boolean J(int direction, int top, int bottom) {
        boolean handled = true;
        int height = getHeight();
        int containerTop = getScrollY();
        int containerBottom = containerTop + height;
        boolean up = direction == 33;
        View newFocused = s(up, top, bottom);
        if (newFocused == null) {
            newFocused = this;
        }
        if (top < containerTop || bottom > containerBottom) {
            l(up ? top - containerTop : bottom - containerBottom);
        } else {
            handled = false;
        }
        if (newFocused != findFocus()) {
            newFocused.requestFocus(direction);
        }
        return handled;
    }

    public boolean c(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        }
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        int maxJump = getMaxScrollAmount();
        if (nextFocused == null || !C(nextFocused, maxJump, getHeight())) {
            int scrollDelta = maxJump;
            if (direction == 33 && getScrollY() < scrollDelta) {
                scrollDelta = getScrollY();
            } else if (direction == 130 && getChildCount() > 0) {
                View child = getChildAt(0);
                scrollDelta = Math.min((child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxJump);
            }
            if (scrollDelta == 0) {
                return false;
            }
            l(direction == 130 ? scrollDelta : -scrollDelta);
        } else {
            nextFocused.getDrawingRect(this.f1675c);
            offsetDescendantRectToMyCoords(nextFocused, this.f1675c);
            l(f(this.f1675c));
            nextFocused.requestFocus(direction);
        }
        if (currentFocused == null || !currentFocused.isFocused() || !A(currentFocused)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean A(View descendant) {
        return !C(descendant, 0, getHeight());
    }

    public final boolean C(View descendant, int delta, int height) {
        descendant.getDrawingRect(this.f1675c);
        offsetDescendantRectToMyCoords(descendant, this.f1675c);
        return this.f1675c.bottom + delta >= getScrollY() && this.f1675c.top - delta <= getScrollY() + height;
    }

    public final void l(int delta) {
        if (delta == 0) {
            return;
        }
        if (this.n) {
            M(0, delta);
        } else {
            scrollBy(0, delta);
        }
    }

    public final void M(int dx, int dy) {
        N(dx, dy, SQLiteDatabase.MAX_SQL_CACHE_SIZE, false);
    }

    public final void N(int dx, int dy, int scrollDurationMs, boolean withNestedScrolling) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1674b > 250) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                int scrollY = getScrollY();
                int maxY = Math.max(0, ((child.getHeight() + lp.topMargin) + lp.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
                this.f1676d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + dy, maxY)) - scrollY, scrollDurationMs);
                I(withNestedScrolling);
            } else {
                if (!this.f1676d.isFinished()) {
                    b();
                }
                scrollBy(dx, dy);
            }
            this.f1674b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public void P(int x2, int y2, boolean withNestedScrolling) {
        O(x2, y2, SQLiteDatabase.MAX_SQL_CACHE_SIZE, withNestedScrolling);
    }

    public void O(int x2, int y2, int scrollDurationMs, boolean withNestedScrolling) {
        N(x2 - getScrollX(), y2 - getScrollY(), scrollDurationMs, withNestedScrolling);
    }

    public int computeVerticalScrollRange() {
        int count = getChildCount();
        int parentSpace = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (count == 0) {
            return parentSpace;
        }
        View child = getChildAt(0);
        int scrollRange = child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int overscrollBottom = Math.max(0, scrollRange - parentSpace);
        if (scrollY < 0) {
            return scrollRange - scrollY;
        }
        if (scrollY > overscrollBottom) {
            return scrollRange + (scrollY - overscrollBottom);
        }
        return scrollRange;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        child.measure(FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight(), child.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        child.measure(FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width), View.MeasureSpec.makeMeasureSpec(lp.topMargin + lp.bottomMargin, 0));
    }

    public void computeScroll() {
        if (!this.f1676d.isFinished()) {
            this.f1676d.computeScrollOffset();
            int y2 = this.f1676d.getCurrY();
            int unconsumed = y2 - this.v;
            this.v = y2;
            int[] iArr = this.t;
            boolean canOverscroll = false;
            iArr[1] = 0;
            g(0, unconsumed, iArr, null, 1);
            int unconsumed2 = unconsumed - this.t[1];
            int range = getScrollRange();
            if (unconsumed2 != 0) {
                int oldScrollY = getScrollY();
                F(0, unconsumed2, getScrollX(), oldScrollY, 0, range, 0, 0);
                int scrolledByMe = getScrollY() - oldScrollY;
                int unconsumed3 = unconsumed2 - scrolledByMe;
                int[] iArr2 = this.t;
                iArr2[1] = 0;
                k(0, scrolledByMe, 0, unconsumed3, this.s, 1, iArr2);
                unconsumed2 = unconsumed3 - this.t[1];
            }
            if (unconsumed2 != 0) {
                int mode = getOverScrollMode();
                if (mode == 0 || (mode == 1 && range > 0)) {
                    canOverscroll = true;
                }
                if (canOverscroll) {
                    q();
                    if (unconsumed2 < 0) {
                        if (this.f1677e.isFinished()) {
                            this.f1677e.onAbsorb((int) this.f1676d.getCurrVelocity());
                        }
                    } else if (this.f1678f.isFinished()) {
                        this.f1678f.onAbsorb((int) this.f1676d.getCurrVelocity());
                    }
                }
                b();
            }
            if (!this.f1676d.isFinished()) {
                s.T(this);
            } else {
                a(1);
            }
        }
    }

    public final void I(boolean participateInNestedScrolling) {
        if (participateInNestedScrolling) {
            Q(2, 1);
        } else {
            a(1);
        }
        this.v = getScrollY();
        s.T(this);
    }

    public final void b() {
        this.f1676d.abortAnimation();
        a(1);
    }

    public final void K(View child) {
        child.getDrawingRect(this.f1675c);
        offsetDescendantRectToMyCoords(child, this.f1675c);
        int scrollDelta = f(this.f1675c);
        if (scrollDelta != 0) {
            scrollBy(0, scrollDelta);
        }
    }

    public final boolean L(Rect rect, boolean immediate) {
        int delta = f(rect);
        boolean scroll = delta != 0;
        if (scroll) {
            if (immediate) {
                scrollBy(0, delta);
            } else {
                M(0, delta);
            }
        }
        return scroll;
    }

    public int f(Rect rect) {
        int scrollYDelta;
        int scrollYDelta2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int screenTop = getScrollY();
        int screenBottom = screenTop + height;
        int fadingEdge = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            screenTop += fadingEdge;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (rect.bottom < child.getHeight() + lp.topMargin + lp.bottomMargin) {
            screenBottom -= fadingEdge;
        }
        if (rect.bottom > screenBottom && rect.top > screenTop) {
            if (rect.height() > height) {
                scrollYDelta2 = 0 + (rect.top - screenTop);
            } else {
                scrollYDelta2 = 0 + (rect.bottom - screenBottom);
            }
            return Math.min(scrollYDelta2, (child.getBottom() + lp.bottomMargin) - screenBottom);
        } else if (rect.top >= screenTop || rect.bottom >= screenBottom) {
            return 0;
        } else {
            if (rect.height() > height) {
                scrollYDelta = 0 - (screenBottom - rect.bottom);
            } else {
                scrollYDelta = 0 - (screenTop - rect.top);
            }
            return Math.max(scrollYDelta, -getScrollY());
        }
    }

    public void requestChildFocus(View child, View focused) {
        if (!this.h) {
            K(focused);
        } else {
            this.j = focused;
        }
        super.requestChildFocus(child, focused);
    }

    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        View nextFocus;
        if (direction == 2) {
            direction = 130;
        } else if (direction == 1) {
            direction = 33;
        }
        if (previouslyFocusedRect == null) {
            nextFocus = FocusFinder.getInstance().findNextFocus(this, null, direction);
        } else {
            nextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, previouslyFocusedRect, direction);
        }
        if (nextFocus != null && !A(nextFocus)) {
            return nextFocus.requestFocus(direction, previouslyFocusedRect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        rectangle.offset(child.getLeft() - child.getScrollX(), child.getTop() - child.getScrollY());
        return L(rectangle, immediate);
    }

    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        super.onLayout(changed, l2, t2, r2, b2);
        this.h = false;
        View view = this.j;
        if (view != null && B(view, this)) {
            K(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.f1680b);
                this.w = null;
            }
            int childSize = 0;
            if (getChildCount() > 0) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                childSize = child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            }
            int parentSpace = ((b2 - t2) - getPaddingTop()) - getPaddingBottom();
            int currentScrollY = getScrollY();
            int newScrollY = e(currentScrollY, parentSpace, childSize);
            if (newScrollY != currentScrollY) {
                scrollTo(getScrollX(), newScrollY);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        View currentFocused = findFocus();
        if (currentFocused != null && this != currentFocused && C(currentFocused, 0, oldh)) {
            currentFocused.getDrawingRect(this.f1675c);
            offsetDescendantRectToMyCoords(currentFocused, this.f1675c);
            l(f(this.f1675c));
        }
    }

    public static boolean B(View child, View parent) {
        if (child == parent) {
            return true;
        }
        ViewParent theParent = child.getParent();
        if (!(theParent instanceof ViewGroup) || !B((View) theParent, parent)) {
            return false;
        }
        return true;
    }

    public void t(int velocityY) {
        if (getChildCount() > 0) {
            this.f1676d.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            I(true);
        }
    }

    public final void p() {
        this.k = false;
        H();
        a(0);
        EdgeEffect edgeEffect = this.f1677e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1678f.onRelease();
        }
    }

    public void scrollTo(int x2, int y2) {
        if (getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int x3 = e(x2, (getWidth() - getPaddingLeft()) - getPaddingRight(), child.getWidth() + lp.leftMargin + lp.rightMargin);
            int y3 = e(y2, (getHeight() - getPaddingTop()) - getPaddingBottom(), child.getHeight() + lp.topMargin + lp.bottomMargin);
            if (x3 != getScrollX() || y3 != getScrollY()) {
                super.scrollTo(x3, y3);
            }
        }
    }

    public final void q() {
        if (getOverScrollMode() == 2) {
            this.f1677e = null;
            this.f1678f = null;
        } else if (this.f1677e == null) {
            Context context = getContext();
            this.f1677e = new EdgeEffect(context);
            this.f1678f = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1677e != null) {
            int scrollY = getScrollY();
            if (!this.f1677e.isFinished()) {
                int restoreCount = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int xTranslation = 0;
                int yTranslation = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    xTranslation = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    yTranslation += getPaddingTop();
                }
                canvas.translate((float) xTranslation, (float) yTranslation);
                this.f1677e.setSize(width, height);
                if (this.f1677e.draw(canvas)) {
                    s.T(this);
                }
                canvas.restoreToCount(restoreCount);
            }
            if (!this.f1678f.isFinished()) {
                int restoreCount2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int xTranslation2 = 0;
                int yTranslation2 = Math.max(getScrollRange(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    xTranslation2 = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    yTranslation2 -= getPaddingBottom();
                }
                canvas.translate((float) (xTranslation2 - width2), (float) yTranslation2);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1678f.setSize(width2, height2);
                if (this.f1678f.draw(canvas)) {
                    s.T(this);
                }
                canvas.restoreToCount(restoreCount2);
            }
        }
    }

    public static int e(int n2, int my, int child) {
        if (my >= child || n2 < 0) {
            return 0;
        }
        if (my + n2 > child) {
            return child - my;
        }
        return n2;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof c)) {
            super.onRestoreInstanceState(state);
            return;
        }
        c ss = (c) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.w = ss;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        c ss = new c(super.onSaveInstanceState());
        ss.f1680b = getScrollY();
        return ss;
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1680b;

        public c(Parcelable superState) {
            super(superState);
        }

        public c(Parcel source) {
            super(source);
            this.f1680b = source.readInt();
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f1680b);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1680b + "}";
        }

        public class a implements Parcelable.Creator<c> {
            /* renamed from: a */
            public c createFromParcel(Parcel in) {
                return new c(in);
            }

            /* renamed from: b */
            public c[] newArray(int size) {
                return new c[size];
            }
        }
    }

    public static class a extends a.h.m.a {
        @Override // a.h.m.a
        public boolean j(View host, int action, Bundle arguments) {
            if (super.j(host, action, arguments)) {
                return true;
            }
            NestedScrollView nsvHost = (NestedScrollView) host;
            if (!nsvHost.isEnabled()) {
                return false;
            }
            if (action != 4096) {
                if (action == 8192 || action == 16908344) {
                    int targetScrollY = Math.max(nsvHost.getScrollY() - ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), 0);
                    if (targetScrollY == nsvHost.getScrollY()) {
                        return false;
                    }
                    nsvHost.P(0, targetScrollY, true);
                    return true;
                } else if (action != 16908346) {
                    return false;
                }
            }
            int targetScrollY2 = Math.min(nsvHost.getScrollY() + ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), nsvHost.getScrollRange());
            if (targetScrollY2 == nsvHost.getScrollY()) {
                return false;
            }
            nsvHost.P(0, targetScrollY2, true);
            return true;
        }

        @Override // a.h.m.a
        public void g(View host, a.h.m.c0.d info) {
            int scrollRange;
            super.g(host, info);
            NestedScrollView nsvHost = (NestedScrollView) host;
            info.K(ScrollView.class.getName());
            if (nsvHost.isEnabled() && (scrollRange = nsvHost.getScrollRange()) > 0) {
                info.R(true);
                if (nsvHost.getScrollY() > 0) {
                    info.b(d.a.f936e);
                    info.b(d.a.f937f);
                }
                if (nsvHost.getScrollY() < scrollRange) {
                    info.b(d.a.f935d);
                    info.b(d.a.f938g);
                }
            }
        }

        @Override // a.h.m.a
        public void f(View host, AccessibilityEvent event) {
            super.f(host, event);
            NestedScrollView nsvHost = (NestedScrollView) host;
            event.setClassName(ScrollView.class.getName());
            event.setScrollable(nsvHost.getScrollRange() > 0);
            event.setScrollX(nsvHost.getScrollX());
            event.setScrollY(nsvHost.getScrollY());
            f.a(event, nsvHost.getScrollX());
            f.b(event, nsvHost.getScrollRange());
        }
    }
}
