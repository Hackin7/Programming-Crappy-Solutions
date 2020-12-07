package androidx.coordinatorlayout.widget;

import a.h.m.b0;
import a.h.m.m;
import a.h.m.o;
import a.h.m.p;
import a.h.m.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements m {
    public static final String u;
    public static final Class<?>[] v = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<c>>> w = new ThreadLocal<>();
    public static final Comparator<View> x = new i();
    public static final a.h.l.e<Rect> y = new a.h.l.g(12);

    /* renamed from: b  reason: collision with root package name */
    public final List<View> f1644b;

    /* renamed from: c  reason: collision with root package name */
    public final a.g.d.a<View> f1645c;

    /* renamed from: d  reason: collision with root package name */
    public final List<View> f1646d;

    /* renamed from: e  reason: collision with root package name */
    public final List<View> f1647e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1648f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f1649g;
    public boolean h;
    public boolean i;
    public int[] j;
    public View k;
    public View l;
    public g m;
    public boolean n;
    public b0 o;
    public boolean p;
    public Drawable q;
    public ViewGroup.OnHierarchyChangeListener r;
    public p s;
    public final o t;

    public interface b {
        c getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    static {
        Package pkg = CoordinatorLayout.class.getPackage();
        u = pkg != null ? pkg.getName() : null;
    }

    public static Rect a() {
        Rect rect = y.b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void O(Rect rect) {
        rect.setEmpty();
        y.a(rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, a.g.a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a2;
        this.f1644b = new ArrayList();
        this.f1645c = new a.g.d.a<>();
        this.f1646d = new ArrayList();
        this.f1647e = new ArrayList();
        this.f1648f = new int[2];
        this.t = new o();
        if (defStyleAttr == 0) {
            a2 = context.obtainStyledAttributes(attrs, a.g.c.CoordinatorLayout, 0, a.g.b.Widget_Support_CoordinatorLayout);
        } else {
            a2 = context.obtainStyledAttributes(attrs, a.g.c.CoordinatorLayout, defStyleAttr, 0);
        }
        int keylineArrayRes = a2.getResourceId(a.g.c.CoordinatorLayout_keylines, 0);
        if (keylineArrayRes != 0) {
            Resources res = context.getResources();
            this.j = res.getIntArray(keylineArrayRes);
            float density = res.getDisplayMetrics().density;
            int count = this.j.length;
            for (int i2 = 0; i2 < count; i2++) {
                int[] iArr = this.j;
                iArr[i2] = (int) (((float) iArr[i2]) * density);
            }
        }
        this.q = a2.getDrawable(a.g.c.CoordinatorLayout_statusBarBackground);
        a2.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null && s.s(this)) {
            s.W(this);
        }
        this.i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    public void setStatusBarBackground(Drawable bg) {
        Drawable drawable = this.q;
        if (drawable != bg) {
            Drawable drawable2 = null;
            if (drawable != null) {
                drawable.setCallback(null);
            }
            if (bg != null) {
                drawable2 = bg.mutate();
            }
            this.q = drawable2;
            if (drawable2 != null) {
                if (drawable2.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                a.h.f.l.a.m(this.q, s.v(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            s.T(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] state = getDrawableState();
        boolean changed = false;
        Drawable d2 = this.q;
        if (d2 != null && d2.isStateful()) {
            changed = false | d2.setState(state);
        }
        if (changed) {
            invalidate();
        }
    }

    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.q;
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean visible = visibility == 0;
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != visible) {
            this.q.setVisible(visible, false);
        }
    }

    public void setStatusBarBackgroundResource(int resId) {
        setStatusBarBackground(resId != 0 ? a.h.e.a.c(getContext(), resId) : null);
    }

    public void setStatusBarBackgroundColor(int color) {
        setStatusBarBackground(new ColorDrawable(color));
    }

    public final b0 W(b0 insets) {
        if (a.h.l.c.a(this.o, insets)) {
            return insets;
        }
        this.o = insets;
        boolean z = true;
        boolean z2 = insets != null && insets.g() > 0;
        this.p = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        b0 insets2 = e(insets);
        requestLayout();
        return insets2;
    }

    public final b0 getLastWindowInsets() {
        return this.o;
    }

    public final void Q(boolean notifyOnInterceptTouchEvent) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            c b2 = ((f) child.getLayoutParams()).f();
            if (b2 != null) {
                long now = SystemClock.uptimeMillis();
                MotionEvent cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                if (notifyOnInterceptTouchEvent) {
                    b2.k(this, child, cancelEvent);
                } else {
                    b2.C(this, child, cancelEvent);
                }
                cancelEvent.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m();
        }
        this.k = null;
        this.h = false;
    }

    public final void z(List<View> out) {
        out.clear();
        boolean useCustomOrder = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            out.add(getChildAt(useCustomOrder ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(out, comparator);
        }
    }

    public final boolean L(MotionEvent ev, int type) {
        boolean intercepted = false;
        boolean newBlock = false;
        MotionEvent cancelEvent = null;
        int action = ev.getActionMasked();
        List<View> topmostChildList = this.f1646d;
        z(topmostChildList);
        int childCount = topmostChildList.size();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = topmostChildList.get(i2);
            f lp = (f) child.getLayoutParams();
            c b2 = lp.f();
            boolean z = true;
            if (!(intercepted || newBlock) || action == 0) {
                if (!intercepted && b2 != null) {
                    if (type == 0) {
                        intercepted = b2.k(this, child, ev);
                    } else if (type == 1) {
                        intercepted = b2.C(this, child, ev);
                    }
                    if (intercepted) {
                        this.k = child;
                    }
                }
                boolean wasBlocking = lp.c();
                boolean isBlocking = lp.i(this, child);
                if (!isBlocking || wasBlocking) {
                    z = false;
                }
                newBlock = z;
                if (isBlocking && !newBlock) {
                    break;
                }
            } else if (b2 != null) {
                if (cancelEvent == null) {
                    long now = SystemClock.uptimeMillis();
                    cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                }
                if (type == 0) {
                    b2.k(this, child, cancelEvent);
                } else if (type == 1) {
                    b2.C(this, child, cancelEvent);
                }
            }
        }
        topmostChildList.clear();
        return intercepted;
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            Q(true);
        }
        boolean intercepted = L(ev, 0);
        if (action == 1 || action == 3) {
            Q(true);
        }
        return intercepted;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r6 != false) goto L_0x0017;
     */
    public boolean onTouchEvent(MotionEvent ev) {
        boolean handled = false;
        boolean cancelSuper = false;
        MotionEvent cancelEvent = null;
        int action = ev.getActionMasked();
        if (this.k == null) {
            boolean L = L(ev, 1);
            cancelSuper = L;
        }
        c b2 = ((f) this.k.getLayoutParams()).f();
        if (b2 != null) {
            handled = b2.C(this, this.k, ev);
        }
        if (this.k == null) {
            handled |= super.onTouchEvent(ev);
        } else if (cancelSuper) {
            if (0 == 0) {
                long now = SystemClock.uptimeMillis();
                cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            }
            super.onTouchEvent(cancelEvent);
        }
        if (cancelEvent != null) {
            cancelEvent.recycle();
        }
        if (action == 1 || action == 3) {
            Q(false);
        }
        return handled;
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
        if (disallowIntercept && !this.h) {
            Q(false);
            this.h = true;
        }
    }

    public final int w(int index) {
        int[] iArr = this.j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + index);
            return 0;
        } else if (index >= 0 && index < iArr.length) {
            return iArr[index];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + index + " out of range for " + this);
            return 0;
        }
    }

    public static c K(Context context, AttributeSet attrs, String name) {
        String fullName;
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        if (name.startsWith(".")) {
            fullName = context.getPackageName() + name;
        } else if (name.indexOf(46) >= 0) {
            fullName = name;
        } else if (!TextUtils.isEmpty(u)) {
            fullName = u + '.' + name;
        } else {
            fullName = name;
        }
        try {
            Map<String, Constructor<Behavior>> constructors = w.get();
            if (constructors == null) {
                constructors = new HashMap<>();
                w.set(constructors);
            }
            Constructor<Behavior> c2 = constructors.get(fullName);
            if (c2 == null) {
                c2 = context.getClassLoader().loadClass(fullName).getConstructor(v);
                c2.setAccessible(true);
                constructors.put(fullName, c2);
            }
            return (c) c2.newInstance(context, attrs);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + fullName, e2);
        }
    }

    public f y(View child) {
        f result = (f) child.getLayoutParams();
        if (!result.f1653b) {
            if (child instanceof b) {
                c attachedBehavior = ((b) child).getBehavior();
                if (attachedBehavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                result.o(attachedBehavior);
                result.f1653b = true;
            } else {
                d defaultBehavior = null;
                for (Class<?> childClass = child.getClass(); childClass != null; childClass = childClass.getSuperclass()) {
                    d dVar = (d) childClass.getAnnotation(d.class);
                    defaultBehavior = dVar;
                    if (dVar != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        result.o((c) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget" + " a default constructor?", e2);
                    }
                }
                result.f1653b = true;
            }
        }
        return result;
    }

    public final void M() {
        this.f1644b.clear();
        this.f1645c.c();
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View view = getChildAt(i2);
            f lp = y(view);
            lp.d(this, view);
            this.f1645c.b(view);
            for (int j2 = 0; j2 < count; j2++) {
                if (j2 != i2) {
                    View other = getChildAt(j2);
                    if (lp.b(this, view, other)) {
                        if (!this.f1645c.d(other)) {
                            this.f1645c.b(other);
                        }
                        this.f1645c.a(other, view);
                    }
                }
            }
        }
        this.f1644b.addAll(this.f1645c.i());
        Collections.reverse(this.f1644b);
    }

    public void t(View descendant, Rect out) {
        a.g.d.b.a(this, descendant, out);
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void J(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0139, code lost:
        if (r29.m(r35, r21, r26, r23, r28, 0) == false) goto L_0x014a;
     */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightMode;
        int childCount;
        int i2;
        int widthUsed;
        int heightUsed;
        int childState;
        int childHeightMeasureSpec;
        int childWidthMeasureSpec;
        int childState2;
        int widthUsed2;
        int heightUsed2;
        M();
        g();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int layoutDirection = s.v(this);
        boolean applyInsets = true;
        boolean isRtl = layoutDirection == 1;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int widthPadding = paddingLeft + paddingRight;
        int heightPadding = paddingTop + paddingBottom;
        int widthUsed3 = getSuggestedMinimumWidth();
        int heightUsed3 = getSuggestedMinimumHeight();
        if (this.o == null || !s.s(this)) {
            applyInsets = false;
        }
        int childCount2 = this.f1644b.size();
        int i3 = 0;
        int childState3 = widthUsed3;
        int heightUsed4 = 0;
        while (i3 < childCount2) {
            View child = this.f1644b.get(i3);
            if (child.getVisibility() == 8) {
                i2 = i3;
                childCount = childCount2;
                heightMode = heightMode2;
            } else {
                f lp = (f) child.getLayoutParams();
                int keylineWidthUsed = 0;
                int keylineWidthUsed2 = lp.f1656e;
                if (keylineWidthUsed2 < 0 || widthMode == 0) {
                    childState = heightUsed4;
                    heightUsed = heightUsed3;
                    widthUsed = childState3;
                } else {
                    int keylinePos = w(keylineWidthUsed2);
                    childState = heightUsed4;
                    int keylineGravity = a.h.m.d.b(T(lp.f1654c), layoutDirection) & 7;
                    heightUsed = heightUsed3;
                    if ((keylineGravity != 3 || isRtl) && (keylineGravity != 5 || !isRtl)) {
                        widthUsed = childState3;
                        if ((keylineGravity == 5 && !isRtl) || (keylineGravity == 3 && isRtl)) {
                            keylineWidthUsed = Math.max(0, keylinePos - paddingLeft);
                        }
                    } else {
                        widthUsed = childState3;
                        keylineWidthUsed = Math.max(0, (widthSize - paddingRight) - keylinePos);
                    }
                }
                if (!applyInsets || s.s(child)) {
                    childWidthMeasureSpec = widthMeasureSpec;
                    childHeightMeasureSpec = heightMeasureSpec;
                } else {
                    int horizInsets = this.o.e() + this.o.f();
                    int vertInsets = this.o.g() + this.o.d();
                    childWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthSize - horizInsets, widthMode);
                    childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(heightSize - vertInsets, heightMode2);
                }
                c b2 = lp.f();
                if (b2 != null) {
                    heightUsed2 = heightUsed;
                    childState2 = childState;
                    widthUsed2 = widthUsed;
                    i2 = i3;
                    childCount = childCount2;
                    heightMode = heightMode2;
                } else {
                    childState2 = childState;
                    heightUsed2 = heightUsed;
                    widthUsed2 = widthUsed;
                    i2 = i3;
                    childCount = childCount2;
                    heightMode = heightMode2;
                }
                J(child, childWidthMeasureSpec, keylineWidthUsed, childHeightMeasureSpec, 0);
                childState3 = Math.max(widthUsed2, widthPadding + child.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin);
                heightUsed3 = Math.max(heightUsed2, heightPadding + child.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
                heightUsed4 = View.combineMeasuredStates(childState2, child.getMeasuredState());
            }
            i3 = i2 + 1;
            childCount2 = childCount;
            heightMode2 = heightMode;
        }
        setMeasuredDimension(View.resolveSizeAndState(childState3, widthMeasureSpec, -16777216 & heightUsed4), View.resolveSizeAndState(heightUsed3, heightMeasureSpec, heightUsed4 << 16));
    }

    public final b0 e(b0 insets) {
        c b2;
        if (insets.k()) {
            return insets;
        }
        int z = getChildCount();
        for (int i2 = 0; i2 < z; i2++) {
            View child = getChildAt(i2);
            if (s.s(child) && (b2 = ((f) child.getLayoutParams()).f()) != null) {
                insets = b2.f(insets);
                if (insets.k()) {
                    break;
                }
            }
        }
        return insets;
    }

    public void I(View child, int layoutDirection) {
        f lp = (f) child.getLayoutParams();
        if (!lp.a()) {
            View view = lp.k;
            if (view != null) {
                D(child, view, layoutDirection);
                return;
            }
            int i2 = lp.f1656e;
            if (i2 >= 0) {
                E(child, i2, layoutDirection);
            } else {
                C(child, layoutDirection);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        c behavior;
        int layoutDirection = s.v(this);
        int childCount = this.f1644b.size();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = this.f1644b.get(i2);
            if (child.getVisibility() != 8 && ((behavior = ((f) child.getLayoutParams()).f()) == null || !behavior.l(this, child, layoutDirection))) {
                I(child, layoutDirection);
            }
        }
    }

    public void onDraw(Canvas c2) {
        super.onDraw(c2);
        if (this.p && this.q != null) {
            b0 b0Var = this.o;
            int inset = b0Var != null ? b0Var.g() : 0;
            if (inset > 0) {
                this.q.setBounds(0, 0, getWidth(), inset);
                this.q.draw(c2);
            }
        }
    }

    public void setFitsSystemWindows(boolean fitSystemWindows) {
        super.setFitsSystemWindows(fitSystemWindows);
        X();
    }

    public void N(View child, Rect r2) {
        ((f) child.getLayoutParams()).q(r2);
    }

    public void x(View child, Rect out) {
        out.set(((f) child.getLayoutParams()).h());
    }

    public void q(View child, boolean transform, Rect out) {
        if (child.isLayoutRequested() || child.getVisibility() == 8) {
            out.setEmpty();
        } else if (transform) {
            t(child, out);
        } else {
            out.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
        }
    }

    public final void v(int layoutDirection, Rect anchorRect, Rect out, f lp, int childWidth, int childHeight) {
        int left;
        int top;
        int absGravity = a.h.m.d.b(R(lp.f1654c), layoutDirection);
        int absAnchorGravity = a.h.m.d.b(S(lp.f1655d), layoutDirection);
        int hgrav = absGravity & 7;
        int vgrav = absGravity & 112;
        int anchorHgrav = absAnchorGravity & 7;
        int anchorVgrav = absAnchorGravity & 112;
        if (anchorHgrav == 1) {
            left = anchorRect.left + (anchorRect.width() / 2);
        } else if (anchorHgrav != 5) {
            left = anchorRect.left;
        } else {
            left = anchorRect.right;
        }
        if (anchorVgrav == 16) {
            top = anchorRect.top + (anchorRect.height() / 2);
        } else if (anchorVgrav != 80) {
            top = anchorRect.top;
        } else {
            top = anchorRect.bottom;
        }
        if (hgrav == 1) {
            left -= childWidth / 2;
        } else if (hgrav != 5) {
            left -= childWidth;
        }
        if (vgrav == 16) {
            top -= childHeight / 2;
        } else if (vgrav != 80) {
            top -= childHeight;
        }
        out.set(left, top, left + childWidth, top + childHeight);
    }

    public final void d(f lp, Rect out, int childWidth, int childHeight) {
        int width = getWidth();
        int height = getHeight();
        int left = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, Math.min(out.left, ((width - getPaddingRight()) - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin));
        int top = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, Math.min(out.top, ((height - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin));
        out.set(left, top, left + childWidth, top + childHeight);
    }

    public void u(View child, int layoutDirection, Rect anchorRect, Rect out) {
        f lp = (f) child.getLayoutParams();
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        v(layoutDirection, anchorRect, out, lp, childWidth, childHeight);
        d(lp, out, childWidth, childHeight);
    }

    public final void D(View child, View anchor, int layoutDirection) {
        Rect anchorRect = a();
        Rect childRect = a();
        try {
            t(anchor, anchorRect);
            u(child, layoutDirection, anchorRect, childRect);
            child.layout(childRect.left, childRect.top, childRect.right, childRect.bottom);
        } finally {
            O(anchorRect);
            O(childRect);
        }
    }

    public final void E(View child, int keyline, int layoutDirection) {
        int keyline2;
        f lp = (f) child.getLayoutParams();
        int absGravity = a.h.m.d.b(T(lp.f1654c), layoutDirection);
        int hgrav = absGravity & 7;
        int vgrav = absGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        if (layoutDirection == 1) {
            keyline2 = width - keyline;
        } else {
            keyline2 = keyline;
        }
        int left = w(keyline2) - childWidth;
        int top = 0;
        if (hgrav == 1) {
            left += childWidth / 2;
        } else if (hgrav == 5) {
            left += childWidth;
        }
        if (vgrav == 16) {
            top = 0 + (childHeight / 2);
        } else if (vgrav == 80) {
            top = 0 + childHeight;
        }
        int left2 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, Math.min(left, ((width - getPaddingRight()) - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin));
        int top2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, Math.min(top, ((height - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin));
        child.layout(left2, top2, left2 + childWidth, top2 + childHeight);
    }

    public final void C(View child, int layoutDirection) {
        f lp = (f) child.getLayoutParams();
        Rect parent = a();
        parent.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        if (this.o != null && s.s(this) && !s.s(child)) {
            parent.left += this.o.e();
            parent.top += this.o.g();
            parent.right -= this.o.f();
            parent.bottom -= this.o.d();
        }
        Rect out = a();
        a.h.m.d.a(S(lp.f1654c), child.getMeasuredWidth(), child.getMeasuredHeight(), parent, out, layoutDirection);
        child.layout(out.left, out.top, out.right, out.bottom);
        O(parent);
        O(out);
    }

    public static int S(int gravity) {
        if ((gravity & 7) == 0) {
            gravity |= 8388611;
        }
        if ((gravity & 112) == 0) {
            return gravity | 48;
        }
        return gravity;
    }

    public static int T(int gravity) {
        if (gravity == 0) {
            return 8388661;
        }
        return gravity;
    }

    public static int R(int gravity) {
        if (gravity == 0) {
            return 17;
        }
        return gravity;
    }

    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        f lp = (f) child.getLayoutParams();
        c cVar = lp.f1652a;
        if (cVar != null) {
            float scrimAlpha = cVar.d();
            if (scrimAlpha > 0.0f) {
                if (this.f1649g == null) {
                    this.f1649g = new Paint();
                }
                this.f1649g.setColor(lp.f1652a.c());
                this.f1649g.setAlpha(c(Math.round(255.0f * scrimAlpha), 0, 255));
                int saved = canvas.save();
                if (child.isOpaque()) {
                    canvas.clipRect((float) child.getLeft(), (float) child.getTop(), (float) child.getRight(), (float) child.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1649g);
                canvas.restoreToCount(saved);
            }
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    public static int c(int value, int min, int max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    public final void H(int type) {
        boolean handled;
        int layoutDirection = s.v(this);
        int childCount = this.f1644b.size();
        Rect inset = a();
        Rect drawRect = a();
        Rect lastDrawRect = a();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = this.f1644b.get(i2);
            f lp = (f) child.getLayoutParams();
            if (type != 0 || child.getVisibility() != 8) {
                for (int j2 = 0; j2 < i2; j2++) {
                    if (lp.l == this.f1644b.get(j2)) {
                        G(child, layoutDirection);
                    }
                }
                q(child, true, drawRect);
                if (lp.f1658g != 0 && !drawRect.isEmpty()) {
                    int absInsetEdge = a.h.m.d.b(lp.f1658g, layoutDirection);
                    int i3 = absInsetEdge & 112;
                    if (i3 == 48) {
                        inset.top = Math.max(inset.top, drawRect.bottom);
                    } else if (i3 == 80) {
                        inset.bottom = Math.max(inset.bottom, getHeight() - drawRect.top);
                    }
                    int i4 = absInsetEdge & 7;
                    if (i4 == 3) {
                        inset.left = Math.max(inset.left, drawRect.right);
                    } else if (i4 == 5) {
                        inset.right = Math.max(inset.right, getWidth() - drawRect.left);
                    }
                }
                if (lp.h != 0 && child.getVisibility() == 0) {
                    F(child, inset, layoutDirection);
                }
                int i5 = 2;
                if (type != 2) {
                    x(child, lastDrawRect);
                    if (!lastDrawRect.equals(drawRect)) {
                        N(child, drawRect);
                    }
                }
                int j3 = i2 + 1;
                while (j3 < childCount) {
                    View checkChild = this.f1644b.get(j3);
                    f checkLp = (f) checkChild.getLayoutParams();
                    c b2 = checkLp.f();
                    if (b2 != null && b2.e(this, checkChild, child)) {
                        if (type != 0 || !checkLp.g()) {
                            if (type != i5) {
                                handled = b2.h(this, checkChild, child);
                            } else {
                                b2.i();
                                handled = true;
                            }
                            if (type == 1) {
                                checkLp.p(handled);
                            }
                        } else {
                            checkLp.k();
                        }
                    }
                    j3++;
                    i5 = 2;
                }
            }
        }
        O(inset);
        O(drawRect);
        O(lastDrawRect);
    }

    public final void F(View child, Rect inset, int layoutDirection) {
        int distance;
        int i2;
        int distance2;
        int i3;
        int distance3;
        int i4;
        int distance4;
        int i5;
        if (s.K(child) && child.getWidth() > 0 && child.getHeight() > 0) {
            f lp = (f) child.getLayoutParams();
            c behavior = lp.f();
            Rect dodgeRect = a();
            Rect bounds = a();
            bounds.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
            if (behavior == null || !behavior.b(this, child, dodgeRect)) {
                dodgeRect.set(bounds);
            } else if (!bounds.contains(dodgeRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + dodgeRect.toShortString() + " | Bounds:" + bounds.toShortString());
            }
            O(bounds);
            if (dodgeRect.isEmpty()) {
                O(dodgeRect);
                return;
            }
            int absDodgeInsetEdges = a.h.m.d.b(lp.h, layoutDirection);
            boolean offsetY = false;
            if ((absDodgeInsetEdges & 48) == 48 && (distance4 = (dodgeRect.top - ((ViewGroup.MarginLayoutParams) lp).topMargin) - lp.j) < (i5 = inset.top)) {
                V(child, i5 - distance4);
                offsetY = true;
            }
            if ((absDodgeInsetEdges & 80) == 80 && (distance3 = ((getHeight() - dodgeRect.bottom) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) + lp.j) < (i4 = inset.bottom)) {
                V(child, distance3 - i4);
                offsetY = true;
            }
            if (!offsetY) {
                V(child, 0);
            }
            boolean offsetX = false;
            if ((absDodgeInsetEdges & 3) == 3 && (distance2 = (dodgeRect.left - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - lp.i) < (i3 = inset.left)) {
                U(child, i3 - distance2);
                offsetX = true;
            }
            if ((absDodgeInsetEdges & 5) == 5 && (distance = ((getWidth() - dodgeRect.right) - ((ViewGroup.MarginLayoutParams) lp).rightMargin) + lp.i) < (i2 = inset.right)) {
                U(child, distance - i2);
                offsetX = true;
            }
            if (!offsetX) {
                U(child, 0);
            }
            O(dodgeRect);
        }
    }

    public final void U(View child, int offsetX) {
        f lp = (f) child.getLayoutParams();
        int i2 = lp.i;
        if (i2 != offsetX) {
            s.P(child, offsetX - i2);
            lp.i = offsetX;
        }
    }

    public final void V(View child, int offsetY) {
        f lp = (f) child.getLayoutParams();
        int i2 = lp.j;
        if (i2 != offsetY) {
            s.Q(child, offsetY - i2);
            lp.j = offsetY;
        }
    }

    public void f(View view) {
        List<View> dependents = this.f1645c.g(view);
        if (!(dependents == null || dependents.isEmpty())) {
            for (int i2 = 0; i2 < dependents.size(); i2++) {
                View child = dependents.get(i2);
                c b2 = ((f) child.getLayoutParams()).f();
                if (b2 != null) {
                    b2.h(this, child, view);
                }
            }
        }
    }

    public List<View> r(View child) {
        List<View> dependencies = this.f1645c.h(child);
        this.f1647e.clear();
        if (dependencies != null) {
            this.f1647e.addAll(dependencies);
        }
        return this.f1647e;
    }

    public List<View> s(View child) {
        List<View> edges = this.f1645c.g(child);
        this.f1647e.clear();
        if (edges != null) {
            this.f1647e.addAll(edges);
        }
        return this.f1647e;
    }

    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f1644b);
    }

    public void g() {
        boolean hasDependencies = false;
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (A(getChildAt(i2))) {
                hasDependencies = true;
                break;
            } else {
                i2++;
            }
        }
        if (hasDependencies == this.n) {
            return;
        }
        if (hasDependencies) {
            b();
        } else {
            P();
        }
    }

    public final boolean A(View child) {
        return this.f1645c.j(child);
    }

    public void b() {
        if (this.i) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        this.n = true;
    }

    public void P() {
        if (this.i && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        this.n = false;
    }

    public void G(View child, int layoutDirection) {
        c b2;
        f lp = (f) child.getLayoutParams();
        if (lp.k != null) {
            Rect anchorRect = a();
            Rect childRect = a();
            Rect desiredChildRect = a();
            t(lp.k, anchorRect);
            boolean changed = false;
            q(child, false, childRect);
            int childWidth = child.getMeasuredWidth();
            int childHeight = child.getMeasuredHeight();
            v(layoutDirection, anchorRect, desiredChildRect, lp, childWidth, childHeight);
            if (!(desiredChildRect.left == childRect.left && desiredChildRect.top == childRect.top)) {
                changed = true;
            }
            d(lp, desiredChildRect, childWidth, childHeight);
            int dx = desiredChildRect.left - childRect.left;
            int dy = desiredChildRect.top - childRect.top;
            if (dx != 0) {
                s.P(child, dx);
            }
            if (dy != 0) {
                s.Q(child, dy);
            }
            if (changed && (b2 = lp.f()) != null) {
                b2.h(this, child, lp.k);
            }
            O(anchorRect);
            O(childRect);
            O(desiredChildRect);
        }
    }

    public boolean B(View child, int x2, int y2) {
        Rect r2 = a();
        t(child, r2);
        try {
            return r2.contains(x2, y2);
        } finally {
            O(r2);
        }
    }

    /* renamed from: l */
    public f generateLayoutParams(AttributeSet attrs) {
        return new f(getContext(), attrs);
    }

    /* renamed from: p */
    public f generateLayoutParams(ViewGroup.LayoutParams p2) {
        if (p2 instanceof f) {
            return new f((f) p2);
        }
        if (p2 instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) p2);
        }
        return new f(p2);
    }

    /* renamed from: k */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof f) && super.checkLayoutParams(p2);
    }

    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return o(child, target, nestedScrollAxes, 0);
    }

    @Override // a.h.m.m
    public boolean o(View child, View target, int axes, int type) {
        int childCount = getChildCount();
        boolean handled = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                f lp = (f) view.getLayoutParams();
                c viewBehavior = lp.f();
                if (viewBehavior != null) {
                    boolean accepted = viewBehavior.z(this, view, child, target, axes, type);
                    lp.r(type, accepted);
                    handled |= accepted;
                } else {
                    lp.r(type, false);
                }
            }
        }
        return handled;
    }

    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        h(child, target, nestedScrollAxes, 0);
    }

    @Override // a.h.m.m
    public void h(View child, View target, int nestedScrollAxes, int type) {
        c viewBehavior;
        this.t.b(nestedScrollAxes, type);
        this.l = target;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            f lp = (f) view.getLayoutParams();
            if (lp.j(type) && (viewBehavior = lp.f()) != null) {
                viewBehavior.u(this, view, child, target, nestedScrollAxes, type);
            }
        }
    }

    public void onStopNestedScroll(View target) {
        i(target, 0);
    }

    @Override // a.h.m.m
    public void i(View target, int type) {
        this.t.d(type);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            f lp = (f) view.getLayoutParams();
            if (lp.j(type)) {
                c viewBehavior = lp.f();
                if (viewBehavior != null) {
                    viewBehavior.B(this, view, target, type);
                }
                lp.l(type);
                lp.k();
            }
        }
        this.l = null;
    }

    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        n(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0);
    }

    @Override // a.h.m.m
    public void n(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        c viewBehavior;
        int childCount = getChildCount();
        boolean accepted = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                f lp = (f) view.getLayoutParams();
                if (lp.j(type) && (viewBehavior = lp.f()) != null) {
                    viewBehavior.s(this, view, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
                    accepted = true;
                }
            }
        }
        if (accepted) {
            H(1);
        }
    }

    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        j(target, dx, dy, consumed, 0);
    }

    @Override // a.h.m.m
    public void j(View target, int dx, int dy, int[] consumed, int type) {
        int xConsumed;
        int yConsumed;
        int childCount = getChildCount();
        int xConsumed2 = 0;
        int yConsumed2 = 0;
        boolean accepted = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                f lp = (f) view.getLayoutParams();
                if (lp.j(type)) {
                    c viewBehavior = lp.f();
                    if (viewBehavior != null) {
                        int[] iArr = this.f1648f;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        viewBehavior.q(this, view, target, dx, dy, iArr, type);
                        int[] iArr2 = this.f1648f;
                        if (dx > 0) {
                            xConsumed = Math.max(xConsumed2, iArr2[0]);
                        } else {
                            xConsumed = Math.min(xConsumed2, iArr2[0]);
                        }
                        int[] iArr3 = this.f1648f;
                        if (dy > 0) {
                            yConsumed = Math.max(yConsumed2, iArr3[1]);
                        } else {
                            yConsumed = Math.min(yConsumed2, iArr3[1]);
                        }
                        xConsumed2 = xConsumed;
                        yConsumed2 = yConsumed;
                        accepted = true;
                    }
                }
            }
        }
        consumed[0] = xConsumed2;
        consumed[1] = yConsumed2;
        if (accepted) {
            H(1);
        }
    }

    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        c viewBehavior;
        boolean handled = false;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                f lp = (f) view.getLayoutParams();
                if (lp.j(0) && (viewBehavior = lp.f()) != null) {
                    handled |= viewBehavior.n();
                }
            }
        }
        if (handled) {
            H(1);
        }
        return handled;
    }

    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        c viewBehavior;
        boolean handled = false;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = getChildAt(i2);
            if (view.getVisibility() != 8) {
                f lp = (f) view.getLayoutParams();
                if (lp.j(0) && (viewBehavior = lp.f()) != null) {
                    handled |= viewBehavior.o(this, view, target, velocityX, velocityY);
                }
            }
        }
        return handled;
    }

    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    public static class i implements Comparator<View> {
        /* renamed from: a */
        public int compare(View lhs, View rhs) {
            float lz = s.D(lhs);
            float rz = s.D(rhs);
            if (lz > rz) {
                return -1;
            }
            if (lz < rz) {
                return 1;
            }
            return 0;
        }
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attrs) {
        }

        public void g(f params) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout parent, V v, MotionEvent ev) {
            return false;
        }

        public boolean C(CoordinatorLayout parent, V v, MotionEvent ev) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;)I */
        public int c() {
            return -16777216;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;)F */
        public float d() {
            return 0.0f;
        }

        public boolean a(CoordinatorLayout parent, V v) {
            return d() > 0.0f;
        }

        public boolean e(CoordinatorLayout parent, V v, View dependency) {
            return false;
        }

        public boolean h(CoordinatorLayout parent, V v, View dependency) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;)V */
        public void i() {
        }

        public boolean m(CoordinatorLayout parent, V v, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
            return false;
        }

        public boolean l(CoordinatorLayout parent, V v, int layoutDirection) {
            return false;
        }

        @Deprecated
        public boolean y(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int axes) {
            return false;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int axes, int type) {
            if (type == 0) {
                return y(coordinatorLayout, child, directTargetChild, target, axes);
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;Landroid/view/View;I)V */
        @Deprecated
        public void t() {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int axes, int type) {
            if (type == 0) {
                t();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;)V */
        @Deprecated
        public void A() {
        }

        public void B(CoordinatorLayout coordinatorLayout, V v, View target, int type) {
            if (type == 0) {
                A();
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        }

        public void s(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
            if (type == 0) {
                r(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;II[I)V */
        @Deprecated
        public void p() {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View target, int dx, int dy, int[] consumed, int type) {
            if (type == 0) {
                p();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;FFZ)Z */
        public boolean n() {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, View target, float velocityX, float velocityY) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;La/h/m/b0;)La/h/m/b0; */
        public b0 f(b0 insets) {
            return insets;
        }

        public boolean v(CoordinatorLayout coordinatorLayout, V v, Rect rectangle, boolean immediate) {
            return false;
        }

        public void w(CoordinatorLayout parent, V v, Parcelable state) {
        }

        public Parcelable x(CoordinatorLayout parent, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean b(CoordinatorLayout parent, V v, Rect rect) {
            return false;
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1652a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1653b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1654c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1655d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1656e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1657f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1658g = 0;
        public int h = 0;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q = new Rect();

        public f(int width, int height) {
            super(width, height);
        }

        public f(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a2 = context.obtainStyledAttributes(attrs, a.g.c.CoordinatorLayout_Layout);
            this.f1654c = a2.getInteger(a.g.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f1657f = a2.getResourceId(a.g.c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1655d = a2.getInteger(a.g.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f1656e = a2.getInteger(a.g.c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f1658g = a2.getInt(a.g.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = a2.getInt(a.g.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = a2.hasValue(a.g.c.CoordinatorLayout_Layout_layout_behavior);
            this.f1653b = hasValue;
            if (hasValue) {
                this.f1652a = CoordinatorLayout.K(context, attrs, a2.getString(a.g.c.CoordinatorLayout_Layout_layout_behavior));
            }
            a2.recycle();
            c cVar = this.f1652a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f p2) {
            super((ViewGroup.MarginLayoutParams) p2);
        }

        public f(ViewGroup.MarginLayoutParams p2) {
            super(p2);
        }

        public f(ViewGroup.LayoutParams p2) {
            super(p2);
        }

        public int e() {
            return this.f1657f;
        }

        public c f() {
            return this.f1652a;
        }

        public void o(c behavior) {
            c cVar = this.f1652a;
            if (cVar != behavior) {
                if (cVar != null) {
                    cVar.j();
                }
                this.f1652a = behavior;
                this.f1653b = true;
                if (behavior != null) {
                    behavior.g(this);
                }
            }
        }

        public void q(Rect r) {
            this.q.set(r);
        }

        public Rect h() {
            return this.q;
        }

        public boolean a() {
            return this.k == null && this.f1657f != -1;
        }

        public boolean c() {
            if (this.f1652a == null) {
                this.m = false;
            }
            return this.m;
        }

        public boolean i(CoordinatorLayout parent, View child) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            c cVar = this.f1652a;
            boolean a2 = z | (cVar != null ? cVar.a(parent, child) : false);
            this.m = a2;
            return a2;
        }

        public void m() {
            this.m = false;
        }

        public void l(int type) {
            r(type, false);
        }

        public void r(int type, boolean accept) {
            if (type == 0) {
                this.n = accept;
            } else if (type == 1) {
                this.o = accept;
            }
        }

        public boolean j(int type) {
            if (type == 0) {
                return this.n;
            }
            if (type != 1) {
                return false;
            }
            return this.o;
        }

        public boolean g() {
            return this.p;
        }

        public void p(boolean changed) {
            this.p = changed;
        }

        public void k() {
            this.p = false;
        }

        public boolean b(CoordinatorLayout parent, View child, View dependency) {
            c cVar;
            return dependency == this.l || s(dependency, s.v(parent)) || ((cVar = this.f1652a) != null && cVar.e(parent, child, dependency));
        }

        public View d(CoordinatorLayout parent, View forChild) {
            if (this.f1657f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !t(forChild, parent)) {
                n(forChild, parent);
            }
            return this.k;
        }

        public final void n(View forChild, CoordinatorLayout parent) {
            View findViewById = parent.findViewById(this.f1657f);
            this.k = findViewById;
            if (findViewById != null) {
                if (findViewById != parent) {
                    View directChild = this.k;
                    ViewParent p2 = findViewById.getParent();
                    while (p2 != parent && p2 != null) {
                        if (p2 != forChild) {
                            if (p2 instanceof View) {
                                directChild = (View) p2;
                            }
                            p2 = p2.getParent();
                        } else if (parent.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.l = directChild;
                } else if (parent.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (parent.isInEditMode()) {
                this.l = null;
                this.k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + parent.getResources().getResourceName(this.f1657f) + " to anchor view " + forChild);
            }
        }

        public final boolean t(View forChild, CoordinatorLayout parent) {
            if (this.k.getId() != this.f1657f) {
                return false;
            }
            View directChild = this.k;
            for (ViewParent p2 = this.k.getParent(); p2 != parent; p2 = p2.getParent()) {
                if (p2 == null || p2 == forChild) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (p2 instanceof View) {
                    directChild = (View) p2;
                }
            }
            this.l = directChild;
            return true;
        }

        public final boolean s(View other, int layoutDirection) {
            int absInset = a.h.m.d.b(((f) other.getLayoutParams()).f1658g, layoutDirection);
            return absInset != 0 && (a.h.m.d.b(this.h, layoutDirection) & absInset) == absInset;
        }
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public void onChildViewAdded(View parent, View child) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        public void onChildViewRemoved(View parent, View child) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable state) {
        Parcelable savedState;
        if (!(state instanceof h)) {
            super.onRestoreInstanceState(state);
            return;
        }
        h ss = (h) state;
        super.onRestoreInstanceState(ss.a());
        SparseArray<Parcelable> behaviorStates = ss.f1660d;
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
            int childId = child.getId();
            c b2 = y(child).f();
            if (!(childId == -1 || b2 == null || (savedState = behaviorStates.get(childId)) == null)) {
                b2.w(this, child, savedState);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable state;
        h ss = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> behaviorStates = new SparseArray<>();
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
            int childId = child.getId();
            c b2 = ((f) child.getLayoutParams()).f();
            if (!(childId == -1 || b2 == null || (state = b2.x(this, child)) == null)) {
                behaviorStates.append(childId, state);
            }
        }
        ss.f1660d = behaviorStates;
        return ss;
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        c behavior = ((f) child.getLayoutParams()).f();
        if (behavior == null || !behavior.v(this, child, rectangle, immediate)) {
            return super.requestChildRectangleOnScreen(child, rectangle, immediate);
        }
        return true;
    }

    public final void X() {
        if (s.s(this)) {
            if (this.s == null) {
                this.s = new a();
            }
            s.j0(this, this.s);
            setSystemUiVisibility(1280);
            return;
        }
        s.j0(this, null);
    }

    public class a implements p {
        public a() {
        }

        @Override // a.h.m.p
        public b0 a(View v, b0 insets) {
            return CoordinatorLayout.this.W(insets);
        }
    }

    public static class h extends a.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public SparseArray<Parcelable> f1660d;

        public h(Parcel source, ClassLoader loader) {
            super(source, loader);
            int size = source.readInt();
            int[] ids = new int[size];
            source.readIntArray(ids);
            Parcelable[] states = source.readParcelableArray(loader);
            this.f1660d = new SparseArray<>(size);
            for (int i = 0; i < size; i++) {
                this.f1660d.append(ids[i], states[i]);
            }
        }

        public h(Parcelable superState) {
            super(superState);
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            SparseArray<Parcelable> sparseArray = this.f1660d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            dest.writeInt(size);
            int[] ids = new int[size];
            Parcelable[] states = new Parcelable[size];
            for (int i = 0; i < size; i++) {
                ids[i] = this.f1660d.keyAt(i);
                states[i] = this.f1660d.valueAt(i);
            }
            dest.writeIntArray(ids);
            dest.writeParcelableArray(states, flags);
        }

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            /* renamed from: b */
            public h createFromParcel(Parcel in, ClassLoader loader) {
                return new h(in, loader);
            }

            /* renamed from: a */
            public h createFromParcel(Parcel in) {
                return new h(in, null);
            }

            /* renamed from: c */
            public h[] newArray(int size) {
                return new h[size];
            }
        }
    }
}
