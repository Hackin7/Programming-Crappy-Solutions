package androidx.recyclerview.widget;

import a.h.m.c0.d;
import a.o.c.a;
import a.o.c.b;
import a.o.c.e;
import a.o.c.l;
import a.o.c.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.database.SQLiteDatabase;

public class RecyclerView extends ViewGroup implements a.h.m.j {
    public static final boolean A0 = false;
    public static final boolean B0;
    public static final boolean C0 = true;
    public static final boolean D0 = false;
    public static final boolean E0 = false;
    public static final Class<?>[] F0;
    public static final Interpolator G0 = new c();
    public static final int[] y0 = {16843830};
    public static final int[] z0 = {16842987};
    public boolean A;
    public final AccessibilityManager B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public k G;
    public EdgeEffect H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public l L;
    public int M;
    public int N;
    public VelocityTracker O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public q U;
    public final int V;
    public final int W;
    public float a0;

    /* renamed from: b  reason: collision with root package name */
    public final w f1736b;
    public float b0;

    /* renamed from: c  reason: collision with root package name */
    public final u f1737c;
    public boolean c0;

    /* renamed from: d  reason: collision with root package name */
    public x f1738d;
    public final a0 d0;

    /* renamed from: e  reason: collision with root package name */
    public a.o.c.a f1739e;
    public a.o.c.e e0;

    /* renamed from: f  reason: collision with root package name */
    public a.o.c.b f1740f;
    public e.b f0;

    /* renamed from: g  reason: collision with root package name */
    public final a.o.c.m f1741g;
    public final y g0;
    public boolean h;
    public s h0;
    public final Rect i;
    public List<s> i0;
    public final Rect j;
    public boolean j0;
    public final RectF k;
    public boolean k0;
    public g l;
    public l.b l0;
    public o m;
    public boolean m0;
    public v n;
    public a.o.c.i n0;
    public final ArrayList<n> o;
    public j o0;
    public final ArrayList<r> p;
    public final int[] p0;
    public r q;
    public a.h.m.l q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final int[] s0;
    public boolean t;
    public final int[] t0;
    public boolean u;
    public final int[] u0;
    public int v;
    public final List<b0> v0;
    public boolean w;
    public Runnable w0;
    public boolean x;
    public final m.b x0;
    public boolean y;
    public int z;

    public static class h extends Observable<i> {
    }

    public static abstract class i {
    }

    public interface j {
        int a(int i, int i2);
    }

    public static abstract class q {
    }

    public interface r {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public interface v {
        void a(b0 b0Var);
    }

    public static abstract class z {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        B0 = i2 >= 23;
        Class<?> cls = Integer.TYPE;
        F0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.u && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.r) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.x) {
                    recyclerView2.w = true;
                } else {
                    recyclerView2.v();
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            l lVar = RecyclerView.this.L;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.m0 = false;
        }
    }

    public static class c implements Interpolator {
        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    public class d implements m.b {
        public d() {
        }

        public void b(b0 viewHolder, l.c info, l.c postInfo) {
            RecyclerView.this.f1737c.J(viewHolder);
            RecyclerView.this.o(viewHolder, info, postInfo);
        }

        public void a(b0 viewHolder, l.c preInfo, l.c info) {
            RecyclerView.this.m(viewHolder, preInfo, info);
        }

        public void c(b0 viewHolder, l.c preInfo, l.c postInfo) {
            viewHolder.F(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C) {
                if (recyclerView.L.b(viewHolder, viewHolder, preInfo, postInfo)) {
                    RecyclerView.this.L0();
                }
            } else if (recyclerView.L.d(viewHolder, preInfo, postInfo)) {
                RecyclerView.this.L0();
            }
        }

        public void d(b0 viewHolder) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m.j1(viewHolder.f1750b, recyclerView.f1737c);
        }
    }

    public RecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f1736b = new w(this);
        this.f1737c = new u();
        this.f1741g = new a.o.c.m();
        new a();
        this.i = new Rect();
        this.j = new Rect();
        this.k = new RectF();
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.v = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = new k();
        this.L = new a.o.c.c();
        this.M = 0;
        this.N = -1;
        this.a0 = Float.MIN_VALUE;
        this.b0 = Float.MIN_VALUE;
        this.c0 = true;
        this.d0 = new a0();
        this.f0 = C0 ? new e.b() : null;
        this.g0 = new y();
        this.j0 = false;
        this.k0 = false;
        this.l0 = new m();
        this.m0 = false;
        this.p0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new ArrayList();
        this.w0 = new b();
        this.x0 = new d();
        if (attrs != null) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, z0, defStyle, 0);
            this.h = a2.getBoolean(0, true);
            a2.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration vc = ViewConfiguration.get(context);
        this.T = vc.getScaledTouchSlop();
        this.a0 = a.h.m.t.b(vc, context);
        this.b0 = a.h.m.t.d(vc, context);
        this.V = vc.getScaledMinimumFlingVelocity();
        this.W = vc.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.L.v(this.l0);
        o0();
        q0();
        p0();
        if (a.h.m.s.t(this) == 0) {
            a.h.m.s.h0(this, 1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new a.o.c.i(this));
        boolean nestedScrollingEnabled = true;
        if (attrs != null) {
            TypedArray a3 = context.obtainStyledAttributes(attrs, a.o.b.RecyclerView, defStyle, 0);
            String layoutManagerName = a3.getString(a.o.b.RecyclerView_layoutManager);
            if (a3.getInt(a.o.b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z2 = a3.getBoolean(a.o.b.RecyclerView_fastScrollEnabled, false);
            this.t = z2;
            if (z2) {
                r0((StateListDrawable) a3.getDrawable(a.o.b.RecyclerView_fastScrollVerticalThumbDrawable), a3.getDrawable(a.o.b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) a3.getDrawable(a.o.b.RecyclerView_fastScrollHorizontalThumbDrawable), a3.getDrawable(a.o.b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            a3.recycle();
            w(context, layoutManagerName, attrs, defStyle, 0);
            TypedArray a4 = context.obtainStyledAttributes(attrs, y0, defStyle, 0);
            nestedScrollingEnabled = a4.getBoolean(0, true);
            a4.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(nestedScrollingEnabled);
    }

    public String R() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    @SuppressLint({"InlinedApi"})
    public final void p0() {
        if (a.h.m.s.u(this) == 0) {
            a.h.m.s.i0(this, 8);
        }
    }

    public a.o.c.i getCompatAccessibilityDelegate() {
        return this.n0;
    }

    public void setAccessibilityDelegateCompat(a.o.c.i accessibilityDelegate) {
        this.n0 = accessibilityDelegate;
        a.h.m.s.Z(this, accessibilityDelegate);
    }

    public final void w(Context context, String className, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        ClassLoader classLoader;
        Constructor<? extends LayoutManager> constructor;
        if (className != null) {
            String className2 = className.trim();
            if (!className2.isEmpty()) {
                String className3 = i0(context, className2);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends LayoutManager> layoutManagerClass = classLoader.loadClass(className3).asSubclass(o.class);
                    Object[] constructorArgs = null;
                    try {
                        constructor = layoutManagerClass.getConstructor(F0);
                        constructorArgs = new Object[]{context, attrs, Integer.valueOf(defStyleAttr), Integer.valueOf(defStyleRes)};
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = layoutManagerClass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e1) {
                            e1.initCause(e2);
                            throw new IllegalStateException(attrs.getPositionDescription() + ": Error creating LayoutManager " + className3, e1);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(constructorArgs));
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Unable to find LayoutManager " + className3, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Could not instantiate the LayoutManager: " + className3, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Cannot access non-public constructor " + className3, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attrs.getPositionDescription() + ": Class is not a LayoutManager " + className3, e7);
                }
            }
        }
    }

    public final String i0(Context context, String className) {
        if (className.charAt(0) == '.') {
            return context.getPackageName() + className;
        } else if (className.contains(".")) {
            return className;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + className;
        }
    }

    public class e implements b.AbstractC0034b {
        public e() {
        }

        public int e() {
            return RecyclerView.this.getChildCount();
        }

        public void a(View child, int index) {
            RecyclerView.this.addView(child, index);
            RecyclerView.this.z(child);
        }

        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public void k(int index) {
            View child = RecyclerView.this.getChildAt(index);
            if (child != null) {
                RecyclerView.this.A(child);
                child.clearAnimation();
            }
            RecyclerView.this.removeViewAt(index);
        }

        public View d(int offset) {
            return RecyclerView.this.getChildAt(offset);
        }

        public void j() {
            int count = e();
            for (int i = 0; i < count; i++) {
                View child = d(i);
                RecyclerView.this.A(child);
                child.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public b0 f(View view) {
            return RecyclerView.f0(view);
        }

        public void b(View child, int index, ViewGroup.LayoutParams layoutParams) {
            b0 vh = RecyclerView.f0(child);
            if (vh != null) {
                if (vh.w() || vh.I()) {
                    vh.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + vh + RecyclerView.this.R());
                }
            }
            RecyclerView.this.attachViewToParent(child, index, layoutParams);
        }

        public void c(int offset) {
            b0 vh;
            View view = d(offset);
            if (!(view == null || (vh = RecyclerView.f0(view)) == null)) {
                if (!vh.w() || vh.I()) {
                    vh.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + vh + RecyclerView.this.R());
                }
            }
            RecyclerView.this.detachViewFromParent((RecyclerView) offset);
        }

        public void h(View child) {
            b0 vh = RecyclerView.f0(child);
            if (vh != null) {
                vh.A(RecyclerView.this);
            }
        }

        public void i(View child) {
            b0 vh = RecyclerView.f0(child);
            if (vh != null) {
                vh.B(RecyclerView.this);
            }
        }
    }

    public final void q0() {
        this.f1740f = new a.o.c.b(new e());
    }

    public class f implements a.AbstractC0033a {
        public f() {
        }

        public b0 b(int position) {
            b0 vh = RecyclerView.this.a0(position, true);
            if (vh != null && !RecyclerView.this.f1740f.n(vh.f1750b)) {
                return vh;
            }
            return null;
        }

        public void f(int start, int count) {
            RecyclerView.this.C0(start, count, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j0 = true;
            recyclerView.g0.f1803c += count;
        }

        public void g(int positionStart, int itemCount) {
            RecyclerView.this.C0(positionStart, itemCount, false);
            RecyclerView.this.j0 = true;
        }

        public void c(int positionStart, int itemCount, Object payload) {
            RecyclerView.this.q1(positionStart, itemCount, payload);
            RecyclerView.this.k0 = true;
        }

        public void h(a.b op) {
            a(op);
        }

        public void a(a.b op) {
            int i = op.f1212a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.m.P0(recyclerView, op.f1213b, op.f1215d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.m.S0(recyclerView2, op.f1213b, op.f1215d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.m.U0(recyclerView3, op.f1213b, op.f1215d, op.f1214c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.m.R0(recyclerView4, op.f1213b, op.f1215d, 1);
            }
        }

        public void i(a.b op) {
            a(op);
        }

        public void d(int positionStart, int itemCount) {
            RecyclerView.this.A0(positionStart, itemCount);
            RecyclerView.this.j0 = true;
        }

        public void e(int from, int to) {
            RecyclerView.this.B0(from, to);
            RecyclerView.this.j0 = true;
        }
    }

    public void o0() {
        this.f1739e = new a.o.c.a(new f());
    }

    public void setHasFixedSize(boolean hasFixedSize) {
        this.s = hasFixedSize;
    }

    public void setClipToPadding(boolean clipToPadding) {
        if (clipToPadding != this.h) {
            s0();
        }
        this.h = clipToPadding;
        super.setClipToPadding(clipToPadding);
        if (this.u) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.h;
    }

    public void setScrollingTouchSlop(int slopConstant) {
        ViewConfiguration vc = ViewConfiguration.get(getContext());
        if (slopConstant != 0) {
            if (slopConstant != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + slopConstant + "; using default value");
            } else {
                this.T = vc.getScaledPagingTouchSlop();
                return;
            }
        }
        this.T = vc.getScaledTouchSlop();
    }

    public void setAdapter(g adapter) {
        setLayoutFrozen(false);
        g1(adapter, false, true);
        O0(false);
        requestLayout();
    }

    public void T0() {
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.m;
        if (oVar != null) {
            oVar.h1(this.f1737c);
            this.m.i1(this.f1737c);
        }
        this.f1737c.c();
    }

    public final void g1(g adapter, boolean compatibleWithPrevious, boolean removeAndRecycleViews) {
        g gVar = this.l;
        if (gVar != null) {
            gVar.q(this.f1736b);
            this.l.k();
        }
        if (!compatibleWithPrevious || removeAndRecycleViews) {
            T0();
        }
        this.f1739e.u();
        g oldAdapter = this.l;
        this.l = adapter;
        if (adapter != null) {
            adapter.p(this.f1736b);
            adapter.g();
        }
        o oVar = this.m;
        if (oVar != null) {
            oVar.C0();
        }
        this.f1737c.x(oldAdapter, this.l, compatibleWithPrevious);
        this.g0.f1806f = true;
    }

    public g getAdapter() {
        return this.l;
    }

    public void setRecyclerListener(v listener) {
        this.n = listener;
    }

    public int getBaseline() {
        o oVar = this.m;
        if (oVar == null) {
            return super.getBaseline();
        }
        oVar.F();
        return -1;
    }

    public void setLayoutManager(o layout) {
        if (layout != this.m) {
            o1();
            if (this.m != null) {
                l lVar = this.L;
                if (lVar != null) {
                    lVar.k();
                }
                this.m.h1(this.f1737c);
                this.m.i1(this.f1737c);
                this.f1737c.c();
                if (this.r) {
                    this.m.z(this, this.f1737c);
                }
                this.m.A1(null);
                this.m = null;
            } else {
                this.f1737c.c();
            }
            this.f1740f.o();
            this.m = layout;
            if (layout != null) {
                if (layout.f1771b == null) {
                    layout.A1(this);
                    if (this.r) {
                        this.m.y(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layout + " is already attached to a RecyclerView:" + layout.f1771b.R());
                }
            }
            this.f1737c.K();
            requestLayout();
        }
    }

    public void setOnFlingListener(q onFlingListener) {
        this.U = onFlingListener;
    }

    public q getOnFlingListener() {
        return null;
    }

    public Parcelable onSaveInstanceState() {
        x state = new x(super.onSaveInstanceState());
        x xVar = this.f1738d;
        if (xVar != null) {
            state.b(xVar);
        } else {
            o oVar = this.m;
            if (oVar != null) {
                state.f1800d = oVar.b1();
            } else {
                state.f1800d = null;
            }
        }
        return state;
    }

    public void onRestoreInstanceState(Parcelable state) {
        Parcelable parcelable;
        if (!(state instanceof x)) {
            super.onRestoreInstanceState(state);
            return;
        }
        x xVar = (x) state;
        this.f1738d = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.m;
        if (oVar != null && (parcelable = this.f1738d.f1800d) != null) {
            oVar.a1(parcelable);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    public final void h(b0 viewHolder) {
        View view = viewHolder.f1750b;
        boolean alreadyParented = view.getParent() == this;
        this.f1737c.J(e0(view));
        if (viewHolder.w()) {
            this.f1740f.c(view, -1, view.getLayoutParams(), true);
        } else if (!alreadyParented) {
            this.f1740f.b(view, true);
        } else {
            this.f1740f.k(view);
        }
    }

    public boolean U0(View view) {
        l1();
        boolean removed = this.f1740f.r(view);
        if (removed) {
            b0 viewHolder = f0(view);
            this.f1737c.J(viewHolder);
            this.f1737c.C(viewHolder);
        }
        n1(!removed);
        return removed;
    }

    public o getLayoutManager() {
        return this.m;
    }

    public t getRecycledViewPool() {
        return this.f1737c.i();
    }

    public void setRecycledViewPool(t pool) {
        this.f1737c.E(pool);
    }

    public void setViewCacheExtension(z extension) {
        this.f1737c.F(extension);
    }

    public void setItemViewCacheSize(int size) {
        this.f1737c.G(size);
    }

    public int getScrollState() {
        return this.M;
    }

    public void setScrollState(int state) {
        if (state != this.M) {
            this.M = state;
            if (state != 2) {
                p1();
            }
            K(state);
        }
    }

    public void j(n decor, int index) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.f("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (index < 0) {
            this.o.add(decor);
        } else {
            this.o.add(index, decor);
        }
        w0();
        requestLayout();
    }

    public void i(n decor) {
        j(decor, -1);
    }

    public int getItemDecorationCount() {
        return this.o.size();
    }

    public void V0(n decor) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.f("Cannot remove item decoration during a scroll  or layout");
        }
        this.o.remove(decor);
        if (this.o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j childDrawingOrderCallback) {
        if (childDrawingOrderCallback != this.o0) {
            this.o0 = childDrawingOrderCallback;
            setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(s listener) {
        this.h0 = listener;
    }

    public void l(s listener) {
        if (this.i0 == null) {
            this.i0 = new ArrayList();
        }
        this.i0.add(listener);
    }

    public void X0(s listener) {
        List<s> list = this.i0;
        if (list != null) {
            list.remove(listener);
        }
    }

    public void scrollTo(int x2, int y2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int x2, int y2) {
        o oVar = this.m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.x) {
            boolean canScrollHorizontal = oVar.j();
            boolean canScrollVertical = this.m.k();
            if (canScrollHorizontal || canScrollVertical) {
                int i2 = 0;
                int i3 = canScrollHorizontal ? x2 : 0;
                if (canScrollVertical) {
                    i2 = y2;
                }
                e1(i3, i2, null);
            }
        }
    }

    public void f1(int dx, int dy, int[] consumed) {
        l1();
        F0();
        a.h.i.a.a("RV Scroll");
        S(this.g0);
        int consumedX = 0;
        int consumedY = 0;
        if (dx != 0) {
            consumedX = this.m.t1(dx, this.f1737c, this.g0);
        }
        if (dy != 0) {
            consumedY = this.m.u1(dy, this.f1737c, this.g0);
        }
        a.h.i.a.b();
        Y0();
        G0();
        n1(false);
        if (consumed != null) {
            consumed[0] = consumedX;
            consumed[1] = consumedY;
        }
    }

    public void v() {
        if (!this.u || this.C) {
            a.h.i.a.a("RV FullInvalidate");
            C();
            a.h.i.a.b();
        } else if (this.f1739e.n()) {
            if (this.f1739e.m(4) && !this.f1739e.m(11)) {
                a.h.i.a.a("RV PartialInvalidate");
                l1();
                F0();
                this.f1739e.r();
                if (!this.w) {
                    if (n0()) {
                        C();
                    } else {
                        this.f1739e.g();
                    }
                }
                n1(true);
                G0();
                a.h.i.a.b();
            } else if (this.f1739e.n()) {
                a.h.i.a.a("RV FullInvalidate");
                C();
                a.h.i.a.b();
            }
        }
    }

    public final boolean n0() {
        int childCount = this.f1740f.g();
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.f(i2));
            if (!(holder == null || holder.I() || !holder.x())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (r3 != 0) goto L_0x00a4;
     */
    public boolean e1(int x2, int y2, MotionEvent ev) {
        int consumedX;
        int unconsumedY;
        int unconsumedX;
        int consumedY;
        int consumedY2;
        v();
        if (this.l != null) {
            f1(x2, y2, this.u0);
            int[] iArr = this.u0;
            int consumedX2 = iArr[0];
            int consumedY3 = iArr[1];
            unconsumedX = x2 - consumedX2;
            unconsumedY = y2 - consumedY3;
            consumedX = consumedX2;
            consumedY = consumedY3;
        } else {
            unconsumedX = 0;
            unconsumedY = 0;
            consumedX = 0;
            consumedY = 0;
        }
        if (!this.o.isEmpty()) {
            invalidate();
        }
        if (H(consumedX, consumedY, unconsumedX, unconsumedY, this.r0, 0)) {
            int i2 = this.R;
            int[] iArr2 = this.r0;
            this.R = i2 - iArr2[0];
            this.S -= iArr2[1];
            if (ev != null) {
                ev.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            }
            int[] iArr3 = this.t0;
            int i3 = iArr3[0];
            int[] iArr4 = this.r0;
            iArr3[0] = i3 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (ev != null && !a.h.m.i.a(ev, 8194)) {
                P0(ev.getX(), (float) unconsumedX, ev.getY(), (float) unconsumedY);
            }
            u(x2, y2);
        }
        if (consumedX == 0) {
            consumedY2 = consumedY;
        } else {
            consumedY2 = consumedY;
        }
        L(consumedX, consumedY2);
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (consumedX == 0 && consumedY2 == 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.m;
        if (oVar != null && oVar.j()) {
            return this.m.q(this.g0);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.m;
        if (oVar != null && oVar.j()) {
            return this.m.p(this.g0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.m;
        if (oVar != null && oVar.j()) {
            return this.m.r(this.g0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.m;
        if (oVar != null && oVar.k()) {
            return this.m.t(this.g0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.m;
        if (oVar != null && oVar.k()) {
            return this.m.s(this.g0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.m;
        if (oVar != null && oVar.k()) {
            return this.m.u(this.g0);
        }
        return 0;
    }

    public void l1() {
        int i2 = this.v + 1;
        this.v = i2;
        if (i2 == 1 && !this.x) {
            this.w = false;
        }
    }

    public void n1(boolean performLayoutChildren) {
        if (this.v < 1) {
            this.v = 1;
        }
        if (!performLayoutChildren && !this.x) {
            this.w = false;
        }
        if (this.v == 1) {
            if (performLayoutChildren && this.w && !this.x && this.m != null && this.l != null) {
                C();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public void setLayoutFrozen(boolean frozen) {
        if (frozen != this.x) {
            p("Do not setLayoutFrozen in layout or scroll");
            if (!frozen) {
                this.x = false;
                if (!(!this.w || this.m == null || this.l == null)) {
                    requestLayout();
                }
                this.w = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            this.x = true;
            this.y = true;
            o1();
        }
    }

    public void j1(int dx, int dy) {
        k1(dx, dy, null);
    }

    public void k1(int dx, int dy, Interpolator interpolator) {
        o oVar = this.m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.x) {
            if (!oVar.j()) {
                dx = 0;
            }
            if (!this.m.k()) {
                dy = 0;
            }
            if (dx != 0 || dy != 0) {
                this.d0.h(dx, dy, interpolator);
            }
        }
    }

    public boolean b0(int velocityX, int velocityY) {
        o oVar = this.m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.x) {
            return false;
        } else {
            boolean canScrollHorizontal = oVar.j();
            boolean canScrollVertical = this.m.k();
            if (!canScrollHorizontal || Math.abs(velocityX) < this.V) {
                velocityX = 0;
            }
            if (!canScrollVertical || Math.abs(velocityY) < this.V) {
                velocityY = 0;
            }
            if (!(velocityX == 0 && velocityY == 0) && !dispatchNestedPreFling((float) velocityX, (float) velocityY)) {
                boolean canScroll = canScrollHorizontal || canScrollVertical;
                dispatchNestedFling((float) velocityX, (float) velocityY, canScroll);
                if (canScroll) {
                    int nestedScrollAxis = 0;
                    if (canScrollHorizontal) {
                        nestedScrollAxis = 0 | 1;
                    }
                    if (canScrollVertical) {
                        nestedScrollAxis |= 2;
                    }
                    m1(nestedScrollAxis, 1);
                    int i2 = this.W;
                    int velocityX2 = Math.max(-i2, Math.min(velocityX, i2));
                    int i3 = this.W;
                    this.d0.e(velocityX2, Math.max(-i3, Math.min(velocityY, i3)));
                    return true;
                }
            }
            return false;
        }
    }

    public void o1() {
        setScrollState(0);
        p1();
    }

    public final void p1() {
        this.d0.i();
        o oVar = this.m;
        if (oVar != null) {
            oVar.E1();
        }
    }

    public int getMinFlingVelocity() {
        return this.V;
    }

    public int getMaxFlingVelocity() {
        return this.W;
    }

    public final void P0(float x2, float overscrollX, float y2, float overscrollY) {
        boolean invalidate = false;
        if (overscrollX < 0.0f) {
            O();
            a.h.n.d.a(this.H, (-overscrollX) / ((float) getWidth()), 1.0f - (y2 / ((float) getHeight())));
            invalidate = true;
        } else if (overscrollX > 0.0f) {
            P();
            a.h.n.d.a(this.J, overscrollX / ((float) getWidth()), y2 / ((float) getHeight()));
            invalidate = true;
        }
        if (overscrollY < 0.0f) {
            Q();
            a.h.n.d.a(this.I, (-overscrollY) / ((float) getHeight()), x2 / ((float) getWidth()));
            invalidate = true;
        } else if (overscrollY > 0.0f) {
            N();
            a.h.n.d.a(this.K, overscrollY / ((float) getHeight()), 1.0f - (x2 / ((float) getWidth())));
            invalidate = true;
        }
        if (invalidate || overscrollX != 0.0f || overscrollY != 0.0f) {
            a.h.m.s.T(this);
        }
    }

    public final void S0() {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            needsInvalidate = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            needsInvalidate |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            needsInvalidate |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            needsInvalidate |= this.K.isFinished();
        }
        if (needsInvalidate) {
            a.h.m.s.T(this);
        }
    }

    public void u(int dx, int dy) {
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null && !edgeEffect.isFinished() && dx > 0) {
            this.H.onRelease();
            needsInvalidate = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && dx < 0) {
            this.J.onRelease();
            needsInvalidate |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && dy > 0) {
            this.I.onRelease();
            needsInvalidate |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && dy < 0) {
            this.K.onRelease();
            needsInvalidate |= this.K.isFinished();
        }
        if (needsInvalidate) {
            a.h.m.s.T(this);
        }
    }

    public void c(int velocityX, int velocityY) {
        if (velocityX < 0) {
            O();
            this.H.onAbsorb(-velocityX);
        } else if (velocityX > 0) {
            P();
            this.J.onAbsorb(velocityX);
        }
        if (velocityY < 0) {
            Q();
            this.I.onAbsorb(-velocityY);
        } else if (velocityY > 0) {
            N();
            this.K.onAbsorb(velocityY);
        }
        if (velocityX != 0 || velocityY != 0) {
            a.h.m.s.T(this);
        }
    }

    public void O() {
        if (this.H == null) {
            EdgeEffect a2 = this.G.a(this);
            this.H = a2;
            if (this.h) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void P() {
        if (this.J == null) {
            EdgeEffect a2 = this.G.a(this);
            this.J = a2;
            if (this.h) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void Q() {
        if (this.I == null) {
            EdgeEffect a2 = this.G.a(this);
            this.I = a2;
            if (this.h) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void N() {
        if (this.K == null) {
            EdgeEffect a2 = this.G.a(this);
            this.K = a2;
            if (this.h) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void s0() {
        this.K = null;
        this.I = null;
        this.J = null;
        this.H = null;
    }

    public void setEdgeEffectFactory(k edgeEffectFactory) {
        a.h.l.h.b(edgeEffectFactory);
        this.G = edgeEffectFactory;
        s0();
    }

    public k getEdgeEffectFactory() {
        return this.G;
    }

    public View focusSearch(View focused, int direction) {
        View result;
        View result2 = this.m.O0();
        if (result2 != null) {
            return result2;
        }
        boolean z2 = true;
        boolean canRunFocusFailure = this.l != null && this.m != null && !u0() && !this.x;
        FocusFinder ff = FocusFinder.getInstance();
        if (!canRunFocusFailure || !(direction == 2 || direction == 1)) {
            result = ff.findNextFocus(this, focused, direction);
            if (result == null && canRunFocusFailure) {
                v();
                if (T(focused) == null) {
                    return null;
                }
                l1();
                result = this.m.H0(focused, direction, this.f1737c, this.g0);
                n1(false);
            }
        } else {
            boolean needsFocusFailureLayout = false;
            if (this.m.k()) {
                int absDir = direction == 2 ? 130 : 33;
                needsFocusFailureLayout = ff.findNextFocus(this, focused, absDir) == null;
                if (D0) {
                    direction = absDir;
                }
            }
            if (!needsFocusFailureLayout && this.m.j()) {
                int absDir2 = (direction == 2) ^ (this.m.X() == 1) ? 66 : 17;
                if (ff.findNextFocus(this, focused, absDir2) != null) {
                    z2 = false;
                }
                needsFocusFailureLayout = z2;
                if (D0) {
                    direction = absDir2;
                }
            }
            if (needsFocusFailureLayout) {
                v();
                if (T(focused) == null) {
                    return null;
                }
                l1();
                this.m.H0(focused, direction, this.f1737c, this.g0);
                n1(false);
            }
            result = ff.findNextFocus(this, focused, direction);
        }
        if (result == null || result.hasFocusable()) {
            return v0(focused, result, direction) ? result : super.focusSearch(focused, direction);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(focused, direction);
        }
        Z0(result, null);
        return focused;
    }

    public final boolean v0(View focused, View next, int direction) {
        if (next == null || next == this || T(next) == null) {
            return false;
        }
        if (focused == null || T(focused) == null) {
            return true;
        }
        this.i.set(0, 0, focused.getWidth(), focused.getHeight());
        this.j.set(0, 0, next.getWidth(), next.getHeight());
        offsetDescendantRectToMyCoords(focused, this.i);
        offsetDescendantRectToMyCoords(next, this.j);
        int rtl = this.m.X() == 1 ? -1 : 1;
        int rightness = 0;
        Rect rect = this.i;
        int i2 = rect.left;
        int i3 = this.j.left;
        if ((i2 < i3 || rect.right <= i3) && this.i.right < this.j.right) {
            rightness = 1;
        } else {
            Rect rect2 = this.i;
            int i4 = rect2.right;
            int i5 = this.j.right;
            if ((i4 > i5 || rect2.left >= i5) && this.i.left > this.j.left) {
                rightness = -1;
            }
        }
        int downness = 0;
        Rect rect3 = this.i;
        int i6 = rect3.top;
        int i7 = this.j.top;
        if ((i6 < i7 || rect3.bottom <= i7) && this.i.bottom < this.j.bottom) {
            downness = 1;
        } else {
            Rect rect4 = this.i;
            int i8 = rect4.bottom;
            int i9 = this.j.bottom;
            if ((i8 > i9 || rect4.top >= i9) && this.i.top > this.j.top) {
                downness = -1;
            }
        }
        if (direction != 1) {
            if (direction != 2) {
                if (direction != 17) {
                    if (direction != 33) {
                        if (direction != 66) {
                            if (direction != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + direction + R());
                            } else if (downness > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (rightness > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (downness < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rightness < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (downness > 0 || (downness == 0 && rightness * rtl >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (downness < 0 || (downness == 0 && rightness * rtl <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void requestChildFocus(View child, View focused) {
        if (!this.m.Z0(this, child, focused) && focused != null) {
            Z0(child, focused);
        }
        super.requestChildFocus(child, focused);
    }

    public final void Z0(View child, View focused) {
        View rectView = focused != null ? focused : child;
        this.i.set(0, 0, rectView.getWidth(), rectView.getHeight());
        ViewGroup.LayoutParams focusedLayoutParams = rectView.getLayoutParams();
        if (focusedLayoutParams instanceof p) {
            p lp = (p) focusedLayoutParams;
            if (!lp.f1785c) {
                Rect insets = lp.f1784b;
                Rect rect = this.i;
                rect.left -= insets.left;
                rect.right += insets.right;
                rect.top -= insets.top;
                rect.bottom += insets.bottom;
            }
        }
        if (focused != null) {
            offsetDescendantRectToMyCoords(focused, this.i);
            offsetRectIntoDescendantCoords(child, this.i);
        }
        this.m.p1(this, child, this.i, !this.u, focused == null);
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {
        return this.m.o1(this, child, rect, immediate);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        o oVar = this.m;
        if (oVar == null || !oVar.D0()) {
            super.addFocusables(views, direction, focusableMode);
        }
    }

    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        if (u0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = 0;
        boolean z2 = true;
        this.r = true;
        if (!this.u || isLayoutRequested()) {
            z2 = false;
        }
        this.u = z2;
        o oVar = this.m;
        if (oVar != null) {
            oVar.y(this);
        }
        this.m0 = false;
        if (C0) {
            a.o.c.e eVar = a.o.c.e.f1272f.get();
            this.e0 = eVar;
            if (eVar == null) {
                this.e0 = new a.o.c.e();
                Display display = a.h.m.s.p(this);
                float refreshRate = 60.0f;
                if (!isInEditMode() && display != null) {
                    float displayRefreshRate = display.getRefreshRate();
                    if (displayRefreshRate >= 30.0f) {
                        refreshRate = displayRefreshRate;
                    }
                }
                a.o.c.e eVar2 = this.e0;
                eVar2.f1276d = (long) (1.0E9f / refreshRate);
                a.o.c.e.f1272f.set(eVar2);
            }
            this.e0.a(this);
        }
    }

    public void onDetachedFromWindow() {
        a.o.c.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
        }
        o1();
        this.r = false;
        o oVar = this.m;
        if (oVar != null) {
            oVar.z(this, this.f1737c);
        }
        this.v0.clear();
        removeCallbacks(this.w0);
        this.f1741g.j();
        if (C0 && (eVar = this.e0) != null) {
            eVar.j(this);
            this.e0 = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.r;
    }

    public void p(String message) {
        if (u0()) {
            if (message == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + R());
            }
            throw new IllegalStateException(message);
        } else if (this.F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + R()));
        }
    }

    public void k(r listener) {
        this.p.add(listener);
    }

    public void W0(r listener) {
        this.p.remove(listener);
        if (this.q == listener) {
            this.q = null;
        }
    }

    public final boolean J(MotionEvent e2) {
        int action = e2.getAction();
        if (action == 3 || action == 0) {
            this.q = null;
        }
        int listenerCount = this.p.size();
        for (int i2 = 0; i2 < listenerCount; i2++) {
            r listener = this.p.get(i2);
            if (listener.a(this, e2) && action != 3) {
                this.q = listener;
                return true;
            }
        }
        return false;
    }

    public final boolean I(MotionEvent e2) {
        int action = e2.getAction();
        r rVar = this.q;
        if (rVar != null) {
            if (action == 0) {
                this.q = null;
            } else {
                rVar.b(this, e2);
                if (action == 3 || action == 1) {
                    this.q = null;
                }
                return true;
            }
        }
        if (action == 0) {
            return false;
        }
        int listenerCount = this.p.size();
        for (int i2 = 0; i2 < listenerCount; i2++) {
            r listener = this.p.get(i2);
            if (listener.a(this, e2)) {
                this.q = listener;
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent e2) {
        if (this.x) {
            return false;
        }
        if (J(e2)) {
            r();
            return true;
        }
        o oVar = this.m;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.j();
        boolean canScrollVertically = this.m.k();
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(e2);
        int action = e2.getActionMasked();
        int actionIndex = e2.getActionIndex();
        if (action == 0) {
            if (this.y) {
                this.y = false;
            }
            this.N = e2.getPointerId(0);
            int x2 = (int) (e2.getX() + 0.5f);
            this.R = x2;
            this.P = x2;
            int y2 = (int) (e2.getY() + 0.5f);
            this.S = y2;
            this.Q = y2;
            if (this.M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.t0;
            iArr[1] = 0;
            iArr[0] = 0;
            int nestedScrollAxis = 0;
            if (canScrollHorizontally) {
                nestedScrollAxis = 0 | 1;
            }
            if (canScrollVertically) {
                nestedScrollAxis |= 2;
            }
            m1(nestedScrollAxis, 0);
        } else if (action == 1) {
            this.O.clear();
            a(0);
        } else if (action == 2) {
            int index = e2.findPointerIndex(this.N);
            if (index < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (e2.getX(index) + 0.5f);
            int y3 = (int) (e2.getY(index) + 0.5f);
            if (this.M != 1) {
                int dx = x3 - this.P;
                int dy = y3 - this.Q;
                boolean startScroll = false;
                if (canScrollHorizontally && Math.abs(dx) > this.T) {
                    this.R = x3;
                    startScroll = true;
                }
                if (canScrollVertically && Math.abs(dy) > this.T) {
                    this.S = y3;
                    startScroll = true;
                }
                if (startScroll) {
                    setScrollState(1);
                }
            }
        } else if (action == 3) {
            r();
        } else if (action == 5) {
            this.N = e2.getPointerId(actionIndex);
            int x4 = (int) (e2.getX(actionIndex) + 0.5f);
            this.R = x4;
            this.P = x4;
            int y4 = (int) (e2.getY(actionIndex) + 0.5f);
            this.S = y4;
            this.Q = y4;
        } else if (action == 6) {
            I0(e2);
        }
        if (this.M == 1) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        int listenerCount = this.p.size();
        for (int i2 = 0; i2 < listenerCount; i2++) {
            this.p.get(i2).c(disallowIntercept);
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onTouchEvent(MotionEvent e2) {
        int dy;
        int dx;
        int i2;
        int i3;
        int i4 = 0;
        if (this.x || this.y) {
            return false;
        }
        if (I(e2)) {
            r();
            return true;
        }
        o oVar = this.m;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.j();
        boolean canScrollVertically = this.m.k();
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        boolean eventAddedToVelocityTracker = false;
        MotionEvent vtev = MotionEvent.obtain(e2);
        int action = e2.getActionMasked();
        int actionIndex = e2.getActionIndex();
        if (action == 0) {
            int[] iArr = this.t0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.t0;
        vtev.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (action == 0) {
            this.N = e2.getPointerId(0);
            int x2 = (int) (e2.getX() + 0.5f);
            this.R = x2;
            this.P = x2;
            int y2 = (int) (e2.getY() + 0.5f);
            this.S = y2;
            this.Q = y2;
            int nestedScrollAxis = 0;
            if (canScrollHorizontally) {
                nestedScrollAxis = 0 | 1;
            }
            if (canScrollVertically) {
                nestedScrollAxis |= 2;
            }
            m1(nestedScrollAxis, 0);
        } else if (action == 1) {
            this.O.addMovement(vtev);
            eventAddedToVelocityTracker = true;
            this.O.computeCurrentVelocity(SQLiteDatabase.SLEEP_AFTER_YIELD_QUANTUM, (float) this.W);
            float xvel = canScrollHorizontally ? -this.O.getXVelocity(this.N) : 0.0f;
            float yvel = canScrollVertically ? -this.O.getYVelocity(this.N) : 0.0f;
            if ((xvel == 0.0f && yvel == 0.0f) || !b0((int) xvel, (int) yvel)) {
                setScrollState(0);
            }
            b1();
        } else if (action == 2) {
            int index = e2.findPointerIndex(this.N);
            if (index < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (e2.getX(index) + 0.5f);
            int y3 = (int) (e2.getY(index) + 0.5f);
            int dx2 = this.R - x3;
            int dy2 = this.S - y3;
            if (G(dx2, dy2, this.s0, this.r0, 0)) {
                int[] iArr3 = this.s0;
                dx2 -= iArr3[0];
                dy2 -= iArr3[1];
                int[] iArr4 = this.r0;
                vtev.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.t0;
                int i5 = iArr5[0];
                int[] iArr6 = this.r0;
                iArr5[0] = i5 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.M != 1) {
                boolean startScroll = false;
                if (canScrollHorizontally && Math.abs(dx2) > (i3 = this.T)) {
                    if (dx2 > 0) {
                        dx2 -= i3;
                    } else {
                        dx2 += i3;
                    }
                    startScroll = true;
                }
                if (canScrollVertically && Math.abs(dy2) > (i2 = this.T)) {
                    if (dy2 > 0) {
                        dy2 -= i2;
                    } else {
                        dy2 += i2;
                    }
                    startScroll = true;
                }
                if (startScroll) {
                    setScrollState(1);
                }
                dx = dx2;
                dy = dy2;
            } else {
                dx = dx2;
                dy = dy2;
            }
            if (this.M == 1) {
                int[] iArr7 = this.r0;
                this.R = x3 - iArr7[0];
                this.S = y3 - iArr7[1];
                int i6 = canScrollHorizontally ? dx : 0;
                if (canScrollVertically) {
                    i4 = dy;
                }
                if (e1(i6, i4, vtev)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.e0 == null || (dx == 0 && dy == 0))) {
                    this.e0.f(this, dx, dy);
                }
            }
        } else if (action == 3) {
            r();
        } else if (action == 5) {
            this.N = e2.getPointerId(actionIndex);
            int x4 = (int) (e2.getX(actionIndex) + 0.5f);
            this.R = x4;
            this.P = x4;
            int y4 = (int) (e2.getY(actionIndex) + 0.5f);
            this.S = y4;
            this.Q = y4;
        } else if (action == 6) {
            I0(e2);
        }
        if (!eventAddedToVelocityTracker) {
            this.O.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    public final void b1() {
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        S0();
    }

    public final void r() {
        b1();
        setScrollState(0);
    }

    public final void I0(MotionEvent e2) {
        int actionIndex = e2.getActionIndex();
        if (e2.getPointerId(actionIndex) == this.N) {
            int newIndex = actionIndex == 0 ? 1 : 0;
            this.N = e2.getPointerId(newIndex);
            int x2 = (int) (e2.getX(newIndex) + 0.5f);
            this.R = x2;
            this.P = x2;
            int y2 = (int) (e2.getY(newIndex) + 0.5f);
            this.S = y2;
            this.Q = y2;
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        float hScroll;
        float vScroll;
        if (this.m != null && !this.x && event.getAction() == 8) {
            if ((event.getSource() & 2) != 0) {
                if (this.m.k()) {
                    vScroll = -event.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.m.j()) {
                    hScroll = event.getAxisValue(10);
                } else {
                    hScroll = 0.0f;
                }
            } else if ((event.getSource() & 4194304) != 0) {
                float axisScroll = event.getAxisValue(26);
                if (this.m.k()) {
                    vScroll = -axisScroll;
                    hScroll = 0.0f;
                } else if (this.m.j()) {
                    vScroll = 0.0f;
                    hScroll = axisScroll;
                } else {
                    vScroll = 0.0f;
                    hScroll = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                hScroll = 0.0f;
            }
            if (!(vScroll == 0.0f && hScroll == 0.0f)) {
                e1((int) (this.a0 * hScroll), (int) (this.b0 * vScroll), event);
            }
        }
        return false;
    }

    public void onMeasure(int widthSpec, int heightSpec) {
        o oVar = this.m;
        if (oVar == null) {
            x(widthSpec, heightSpec);
            return;
        }
        boolean measureSpecModeIsExactly = false;
        if (oVar.q0()) {
            int widthMode = View.MeasureSpec.getMode(widthSpec);
            int heightMode = View.MeasureSpec.getMode(heightSpec);
            this.m.X0(widthSpec, heightSpec);
            if (widthMode == 1073741824 && heightMode == 1073741824) {
                measureSpecModeIsExactly = true;
            }
            if (!measureSpecModeIsExactly && this.l != null) {
                if (this.g0.f1804d == 1) {
                    D();
                }
                this.m.w1(widthSpec, heightSpec);
                this.g0.i = true;
                E();
                this.m.z1(widthSpec, heightSpec);
                if (this.m.C1()) {
                    this.m.w1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.g0.i = true;
                    E();
                    this.m.z1(widthSpec, heightSpec);
                }
            }
        } else if (this.s) {
            this.m.X0(widthSpec, heightSpec);
        } else {
            if (this.A) {
                l1();
                F0();
                N0();
                G0();
                y yVar = this.g0;
                if (yVar.k) {
                    yVar.f1807g = true;
                } else {
                    this.f1739e.h();
                    this.g0.f1807g = false;
                }
                this.A = false;
                n1(false);
            } else if (this.g0.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.l;
            if (gVar != null) {
                this.g0.f1805e = gVar.c();
            } else {
                this.g0.f1805e = 0;
            }
            l1();
            this.m.X0(widthSpec, heightSpec);
            n1(false);
            this.g0.f1807g = false;
        }
    }

    public void x(int widthSpec, int heightSpec) {
        setMeasuredDimension(o.m(widthSpec, getPaddingLeft() + getPaddingRight(), a.h.m.s.x(this)), o.m(heightSpec, getPaddingTop() + getPaddingBottom(), a.h.m.s.w(this)));
    }

    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        if (w2 != oldw || h2 != oldh) {
            s0();
        }
    }

    public void setItemAnimator(l animator) {
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
            this.L.v(null);
        }
        this.L = animator;
        if (animator != null) {
            animator.v(this.l0);
        }
    }

    public void F0() {
        this.E++;
    }

    public void G0() {
        H0(true);
    }

    public void H0(boolean enableChangeEvents) {
        int i2 = this.E - 1;
        this.E = i2;
        if (i2 < 1) {
            this.E = 0;
            if (enableChangeEvents) {
                B();
                M();
            }
        }
    }

    public boolean t0() {
        AccessibilityManager accessibilityManager = this.B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final void B() {
        int flags = this.z;
        this.z = 0;
        if (flags != 0 && t0()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            a.h.m.c0.b.b(event, flags);
            sendAccessibilityEventUnchecked(event);
        }
    }

    public boolean u0() {
        return this.E > 0;
    }

    public boolean i1(AccessibilityEvent event) {
        if (!u0()) {
            return false;
        }
        int type = 0;
        if (event != null) {
            type = a.h.m.c0.b.a(event);
        }
        if (type == 0) {
            type = 0;
        }
        this.z |= type;
        return true;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
        if (!i1(event)) {
            super.sendAccessibilityEventUnchecked(event);
        }
    }

    public l getItemAnimator() {
        return this.L;
    }

    public void L0() {
        if (!this.m0 && this.r) {
            a.h.m.s.U(this, this.w0);
            this.m0 = true;
        }
    }

    public final boolean M0() {
        return this.L != null && this.m.F1();
    }

    public final void N0() {
        if (this.C) {
            this.f1739e.u();
            if (this.D) {
                this.m.Q0(this);
            }
        }
        if (M0()) {
            this.f1739e.r();
        } else {
            this.f1739e.h();
        }
        boolean z2 = false;
        boolean animationTypeSupported = this.j0 || this.k0;
        this.g0.j = this.u && this.L != null && (this.C || animationTypeSupported || this.m.f1776g) && (!this.C || this.l.f());
        y yVar = this.g0;
        if (yVar.j && animationTypeSupported && !this.C && M0()) {
            z2 = true;
        }
        yVar.k = z2;
    }

    public void C() {
        if (this.l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            y yVar = this.g0;
            yVar.i = false;
            if (yVar.f1804d == 1) {
                D();
                this.m.v1(this);
                E();
            } else if (!this.f1739e.o() && this.m.m0() == getWidth() && this.m.V() == getHeight()) {
                this.m.v1(this);
            } else {
                this.m.v1(this);
                E();
            }
            F();
        }
    }

    public final void c1() {
        int i2;
        View child = null;
        if (this.c0 && hasFocus() && this.l != null) {
            child = getFocusedChild();
        }
        b0 focusedVh = child == null ? null : U(child);
        if (focusedVh == null) {
            a1();
            return;
        }
        this.g0.m = this.l.f() ? focusedVh.k() : -1;
        y yVar = this.g0;
        if (this.C) {
            i2 = -1;
        } else if (focusedVh.u()) {
            i2 = focusedVh.f1753e;
        } else {
            i2 = focusedVh.j();
        }
        yVar.l = i2;
        this.g0.n = h0(focusedVh.f1750b);
    }

    public final void a1() {
        y yVar = this.g0;
        yVar.m = -1;
        yVar.l = -1;
        yVar.n = -1;
    }

    public final View X() {
        b0 nextFocus;
        int startFocusSearchIndex = this.g0.l;
        if (startFocusSearchIndex == -1) {
            startFocusSearchIndex = 0;
        }
        int itemCount = this.g0.b();
        for (int i2 = startFocusSearchIndex; i2 < itemCount; i2++) {
            b0 nextFocus2 = Y(i2);
            if (nextFocus2 == null) {
                break;
            } else if (nextFocus2.f1750b.hasFocusable()) {
                return nextFocus2.f1750b;
            }
        }
        int i3 = Math.min(itemCount, startFocusSearchIndex) - 1;
        while (i3 >= 0 && (nextFocus = Y(i3)) != null) {
            if (nextFocus.f1750b.hasFocusable()) {
                return nextFocus.f1750b;
            }
            i3--;
        }
        return null;
    }

    public final void R0() {
        View child;
        if (this.c0 && this.l != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!E0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f1740f.n(focusedChild)) {
                            return;
                        }
                    } else if (this.f1740f.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                b0 focusTarget = null;
                if (this.g0.m != -1 && this.l.f()) {
                    focusTarget = Z(this.g0.m);
                }
                View viewToFocus = null;
                if (focusTarget != null && !this.f1740f.n(focusTarget.f1750b) && focusTarget.f1750b.hasFocusable()) {
                    viewToFocus = focusTarget.f1750b;
                } else if (this.f1740f.g() > 0) {
                    viewToFocus = X();
                }
                if (viewToFocus != null) {
                    int i2 = this.g0.n;
                    if (!(((long) i2) == -1 || (child = viewToFocus.findViewById(i2)) == null || !child.isFocusable())) {
                        viewToFocus = child;
                    }
                    viewToFocus.requestFocus();
                }
            }
        }
    }

    public final int h0(View view) {
        int lastKnownId = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                lastKnownId = view.getId();
            }
        }
        return lastKnownId;
    }

    public final void S(y state) {
        if (getScrollState() == 2) {
            OverScroller scroller = this.d0.f1745d;
            state.o = scroller.getFinalX() - scroller.getCurrX();
            scroller.getFinalY();
            scroller.getCurrY();
            return;
        }
        state.o = 0;
    }

    public final void D() {
        boolean z2 = true;
        this.g0.a(1);
        S(this.g0);
        this.g0.i = false;
        l1();
        this.f1741g.f();
        F0();
        N0();
        c1();
        y yVar = this.g0;
        if (!yVar.j || !this.k0) {
            z2 = false;
        }
        yVar.h = z2;
        this.k0 = false;
        this.j0 = false;
        y yVar2 = this.g0;
        yVar2.f1807g = yVar2.k;
        yVar2.f1805e = this.l.c();
        V(this.p0);
        if (this.g0.j) {
            int count = this.f1740f.g();
            for (int i2 = 0; i2 < count; i2++) {
                b0 holder = f0(this.f1740f.f(i2));
                if (!holder.I() && (!holder.s() || this.l.f())) {
                    l lVar = this.L;
                    l.e(holder);
                    holder.o();
                    this.f1741g.e(holder, lVar.t(holder));
                    if (this.g0.h && holder.x() && !holder.u() && !holder.I() && !holder.s()) {
                        this.f1741g.c(d0(holder), holder);
                    }
                }
            }
        }
        if (this.g0.k) {
            d1();
            y yVar3 = this.g0;
            boolean didStructureChange = yVar3.f1806f;
            yVar3.f1806f = false;
            this.m.V0(this.f1737c, yVar3);
            this.g0.f1806f = didStructureChange;
            for (int i3 = 0; i3 < this.f1740f.g(); i3++) {
                b0 viewHolder = f0(this.f1740f.f(i3));
                if (!viewHolder.I() && !this.f1741g.i(viewHolder)) {
                    int flags = l.e(viewHolder);
                    boolean wasHidden = viewHolder.p(8192);
                    if (!wasHidden) {
                        int flags2 = flags | 4096;
                    }
                    l lVar2 = this.L;
                    viewHolder.o();
                    l.c animationInfo = lVar2.t(viewHolder);
                    if (wasHidden) {
                        Q0(viewHolder, animationInfo);
                    } else {
                        this.f1741g.a(viewHolder, animationInfo);
                    }
                }
            }
            t();
        } else {
            t();
        }
        G0();
        n1(false);
        this.g0.f1804d = 2;
    }

    public final void E() {
        l1();
        F0();
        this.g0.a(6);
        this.f1739e.h();
        this.g0.f1805e = this.l.c();
        y yVar = this.g0;
        yVar.f1803c = 0;
        yVar.f1807g = false;
        this.m.V0(this.f1737c, yVar);
        y yVar2 = this.g0;
        yVar2.f1806f = false;
        this.f1738d = null;
        yVar2.j = yVar2.j && this.L != null;
        this.g0.f1804d = 4;
        G0();
        n1(false);
    }

    public final void F() {
        this.g0.a(4);
        l1();
        F0();
        y yVar = this.g0;
        yVar.f1804d = 1;
        if (yVar.j) {
            for (int i2 = this.f1740f.g() - 1; i2 >= 0; i2--) {
                b0 holder = f0(this.f1740f.f(i2));
                if (!holder.I()) {
                    long key = d0(holder);
                    l.c animationInfo = this.L.s(holder);
                    b0 oldChangeViewHolder = this.f1741g.g(key);
                    if (oldChangeViewHolder == null || oldChangeViewHolder.I()) {
                        this.f1741g.d(holder, animationInfo);
                    } else {
                        boolean oldDisappearing = this.f1741g.h(oldChangeViewHolder);
                        boolean newDisappearing = this.f1741g.h(holder);
                        if (!oldDisappearing || oldChangeViewHolder != holder) {
                            l.c preInfo = this.f1741g.n(oldChangeViewHolder);
                            this.f1741g.d(holder, animationInfo);
                            l.c postInfo = this.f1741g.m(holder);
                            if (preInfo == null) {
                                k0(key, holder, oldChangeViewHolder);
                            } else {
                                n(oldChangeViewHolder, holder, preInfo, postInfo, oldDisappearing, newDisappearing);
                            }
                        } else {
                            this.f1741g.d(holder, animationInfo);
                        }
                    }
                }
            }
            this.f1741g.o(this.x0);
        }
        this.m.i1(this.f1737c);
        y yVar2 = this.g0;
        yVar2.f1802b = yVar2.f1805e;
        this.C = false;
        this.D = false;
        yVar2.j = false;
        yVar2.k = false;
        this.m.f1776g = false;
        ArrayList<b0> arrayList = this.f1737c.f1794b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.m;
        if (oVar.m) {
            oVar.l = 0;
            oVar.m = false;
            this.f1737c.K();
        }
        this.m.W0(this.g0);
        G0();
        n1(false);
        this.f1741g.f();
        int[] iArr = this.p0;
        if (y(iArr[0], iArr[1])) {
            L(0, 0);
        }
        R0();
        a1();
    }

    public final void k0(long key, b0 holder, b0 oldChangeViewHolder) {
        int childCount = this.f1740f.g();
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 other = f0(this.f1740f.f(i2));
            if (other != holder && d0(other) == key) {
                g gVar = this.l;
                if (gVar == null || !gVar.f()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + R());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + other + " \n View Holder 2:" + holder + R());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + oldChangeViewHolder + " cannot be found but it is necessary for " + holder + R());
    }

    public void Q0(b0 viewHolder, l.c animationInfo) {
        viewHolder.E(0, 8192);
        if (this.g0.h && viewHolder.x() && !viewHolder.u() && !viewHolder.I()) {
            this.f1741g.c(d0(viewHolder), viewHolder);
        }
        this.f1741g.e(viewHolder, animationInfo);
    }

    public final void V(int[] into) {
        int count = this.f1740f.g();
        if (count == 0) {
            into[0] = -1;
            into[1] = -1;
            return;
        }
        int minPositionPreLayout = Integer.MAX_VALUE;
        int maxPositionPreLayout = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < count; i2++) {
            b0 holder = f0(this.f1740f.f(i2));
            if (!holder.I()) {
                int pos = holder.m();
                if (pos < minPositionPreLayout) {
                    minPositionPreLayout = pos;
                }
                if (pos > maxPositionPreLayout) {
                    maxPositionPreLayout = pos;
                }
            }
        }
        into[0] = minPositionPreLayout;
        into[1] = maxPositionPreLayout;
    }

    public final boolean y(int minPositionPreLayout, int maxPositionPreLayout) {
        V(this.p0);
        int[] iArr = this.p0;
        return (iArr[0] == minPositionPreLayout && iArr[1] == maxPositionPreLayout) ? false : true;
    }

    public void removeDetachedView(View child, boolean animate) {
        b0 vh = f0(child);
        if (vh != null) {
            if (vh.w()) {
                vh.f();
            } else if (!vh.I()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + vh + R());
            }
        }
        child.clearAnimation();
        A(child);
        super.removeDetachedView(child, animate);
    }

    public long d0(b0 holder) {
        return this.l.f() ? holder.k() : (long) holder.f1752d;
    }

    public void m(b0 itemHolder, l.c preLayoutInfo, l.c postLayoutInfo) {
        itemHolder.F(false);
        if (this.L.a(itemHolder, preLayoutInfo, postLayoutInfo)) {
            L0();
        }
    }

    public void o(b0 holder, l.c preLayoutInfo, l.c postLayoutInfo) {
        h(holder);
        holder.F(false);
        if (this.L.c(holder, preLayoutInfo, postLayoutInfo)) {
            L0();
        }
    }

    public final void n(b0 oldHolder, b0 newHolder, l.c preInfo, l.c postInfo, boolean oldHolderDisappearing, boolean newHolderDisappearing) {
        oldHolder.F(false);
        if (oldHolderDisappearing) {
            h(oldHolder);
        }
        if (oldHolder != newHolder) {
            if (newHolderDisappearing) {
                h(newHolder);
            }
            oldHolder.i = newHolder;
            h(oldHolder);
            this.f1737c.J(oldHolder);
            newHolder.F(false);
            newHolder.j = oldHolder;
        }
        if (this.L.b(oldHolder, newHolder, preInfo, postInfo)) {
            L0();
        }
    }

    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        a.h.i.a.a("RV OnLayout");
        C();
        a.h.i.a.b();
        this.u = true;
    }

    public void requestLayout() {
        if (this.v != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    public void w0() {
        int childCount = this.f1740f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((p) this.f1740f.i(i2).getLayoutParams()).f1785c = true;
        }
        this.f1737c.s();
    }

    public void draw(Canvas c2) {
        super.draw(c2);
        int count = this.o.size();
        for (int i2 = 0; i2 < count; i2++) {
            this.o.get(i2).i(c2, this, this.g0);
        }
        boolean needsInvalidate = false;
        EdgeEffect edgeEffect = this.H;
        boolean z2 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int restore = c2.save();
            int padding = this.h ? getPaddingBottom() : 0;
            c2.rotate(270.0f);
            c2.translate((float) ((-getHeight()) + padding), 0.0f);
            EdgeEffect edgeEffect2 = this.H;
            needsInvalidate = edgeEffect2 != null && edgeEffect2.draw(c2);
            c2.restoreToCount(restore);
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int restore2 = c2.save();
            if (this.h) {
                c2.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I;
            needsInvalidate |= edgeEffect4 != null && edgeEffect4.draw(c2);
            c2.restoreToCount(restore2);
        }
        EdgeEffect edgeEffect5 = this.J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int restore3 = c2.save();
            int width = getWidth();
            int padding2 = this.h ? getPaddingTop() : 0;
            c2.rotate(90.0f);
            c2.translate((float) (-padding2), (float) (-width));
            EdgeEffect edgeEffect6 = this.J;
            needsInvalidate |= edgeEffect6 != null && edgeEffect6.draw(c2);
            c2.restoreToCount(restore3);
        }
        EdgeEffect edgeEffect7 = this.K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int restore4 = c2.save();
            c2.rotate(180.0f);
            if (this.h) {
                c2.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                c2.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.K;
            if (edgeEffect8 == null || !edgeEffect8.draw(c2)) {
                z2 = false;
            }
            needsInvalidate |= z2;
            c2.restoreToCount(restore4);
        }
        if (!needsInvalidate && this.L != null && this.o.size() > 0 && this.L.p()) {
            needsInvalidate = true;
        }
        if (needsInvalidate) {
            a.h.m.s.T(this);
        }
    }

    public void onDraw(Canvas c2) {
        super.onDraw(c2);
        int count = this.o.size();
        for (int i2 = 0; i2 < count; i2++) {
            this.o.get(i2).g(c2, this);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof p) && this.m.l((p) p2);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.C();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + R());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.D(getContext(), attrs);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + R());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.E(p2);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + R());
    }

    public void d1() {
        int childCount = this.f1740f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.i(i2));
            if (!holder.I()) {
                holder.D();
            }
        }
    }

    public void t() {
        int childCount = this.f1740f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.i(i2));
            if (!holder.I()) {
                holder.c();
            }
        }
        this.f1737c.d();
    }

    public void B0(int from, int to) {
        int inBetweenOffset;
        int end;
        int start;
        int i2;
        int childCount = this.f1740f.j();
        if (from < to) {
            start = from;
            end = to;
            inBetweenOffset = -1;
        } else {
            start = to;
            end = from;
            inBetweenOffset = 1;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            b0 holder = f0(this.f1740f.i(i3));
            if (holder != null && (i2 = holder.f1752d) >= start && i2 <= end) {
                if (i2 == from) {
                    holder.z(to - from, false);
                } else {
                    holder.z(inBetweenOffset, false);
                }
                this.g0.f1806f = true;
            }
        }
        this.f1737c.v(from, to);
        requestLayout();
    }

    public void A0(int positionStart, int itemCount) {
        int childCount = this.f1740f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.i(i2));
            if (holder != null && !holder.I() && holder.f1752d >= positionStart) {
                holder.z(itemCount, false);
                this.g0.f1806f = true;
            }
        }
        this.f1737c.u(positionStart, itemCount);
        requestLayout();
    }

    public void C0(int positionStart, int itemCount, boolean applyToPreLayout) {
        int positionEnd = positionStart + itemCount;
        int childCount = this.f1740f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.i(i2));
            if (holder != null && !holder.I()) {
                int i3 = holder.f1752d;
                if (i3 >= positionEnd) {
                    holder.z(-itemCount, applyToPreLayout);
                    this.g0.f1806f = true;
                } else if (i3 >= positionStart) {
                    holder.i(positionStart - 1, -itemCount, applyToPreLayout);
                    this.g0.f1806f = true;
                }
            }
        }
        this.f1737c.w(positionStart, itemCount, applyToPreLayout);
        requestLayout();
    }

    public void q1(int positionStart, int itemCount, Object payload) {
        int i2;
        int childCount = this.f1740f.j();
        int positionEnd = positionStart + itemCount;
        for (int i3 = 0; i3 < childCount; i3++) {
            View child = this.f1740f.i(i3);
            b0 holder = f0(child);
            if (holder != null && !holder.I() && (i2 = holder.f1752d) >= positionStart && i2 < positionEnd) {
                holder.b(2);
                holder.a(payload);
                ((p) child.getLayoutParams()).f1785c = true;
            }
        }
        this.f1737c.M(positionStart, itemCount);
    }

    public boolean q(b0 viewHolder) {
        l lVar = this.L;
        return lVar == null || lVar.g(viewHolder, viewHolder.o());
    }

    public void O0(boolean dispatchItemsChanged) {
        this.D |= dispatchItemsChanged;
        this.C = true;
        x0();
    }

    public void x0() {
        int childCount = this.f1740f.j();
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.i(i2));
            if (holder != null && !holder.I()) {
                holder.b(6);
            }
        }
        w0();
        this.f1737c.t();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.c0;
    }

    public void setPreserveFocusAfterLayout(boolean preserveFocusAfterLayout) {
        this.c0 = preserveFocusAfterLayout;
    }

    public b0 e0(View child) {
        ViewParent parent = child.getParent();
        if (parent == null || parent == this) {
            return f0(child);
        }
        throw new IllegalArgumentException("View " + child + " is not a direct child of " + this);
    }

    public View T(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public b0 U(View view) {
        View itemView = T(view);
        if (itemView == null) {
            return null;
        }
        return e0(itemView);
    }

    public static b0 f0(View child) {
        if (child == null) {
            return null;
        }
        return ((p) child.getLayoutParams()).f1783a;
    }

    public b0 Y(int position) {
        if (this.C) {
            return null;
        }
        int childCount = this.f1740f.j();
        b0 hidden = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.i(i2));
            if (holder != null && !holder.u() && c0(holder) == position) {
                if (!this.f1740f.n(holder.f1750b)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    public b0 a0(int position, boolean checkNewPosition) {
        int childCount = this.f1740f.j();
        b0 hidden = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.i(i2));
            if (holder != null && !holder.u()) {
                if (checkNewPosition) {
                    if (holder.f1752d != position) {
                        continue;
                    }
                } else if (holder.m() != position) {
                    continue;
                }
                if (!this.f1740f.n(holder.f1750b)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    public b0 Z(long id) {
        g gVar = this.l;
        if (gVar == null || !gVar.f()) {
            return null;
        }
        int childCount = this.f1740f.j();
        b0 hidden = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            b0 holder = f0(this.f1740f.i(i2));
            if (holder != null && !holder.u() && holder.k() == id) {
                if (!this.f1740f.n(holder.f1750b)) {
                    return holder;
                }
                hidden = holder;
            }
        }
        return hidden;
    }

    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        return super.drawChild(canvas, child, drawingTime);
    }

    public void z0(int dy) {
        int childCount = this.f1740f.g();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f1740f.f(i2).offsetTopAndBottom(dy);
        }
    }

    public void D0() {
    }

    public void E0() {
    }

    public void y0(int dx) {
        int childCount = this.f1740f.g();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f1740f.f(i2).offsetLeftAndRight(dx);
        }
    }

    public static void g0(View view, Rect outBounds) {
        p lp = (p) view.getLayoutParams();
        Rect insets = lp.f1784b;
        outBounds.set((view.getLeft() - insets.left) - ((ViewGroup.MarginLayoutParams) lp).leftMargin, (view.getTop() - insets.top) - ((ViewGroup.MarginLayoutParams) lp).topMargin, view.getRight() + insets.right + ((ViewGroup.MarginLayoutParams) lp).rightMargin, view.getBottom() + insets.bottom + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
    }

    public Rect j0(View child) {
        p lp = (p) child.getLayoutParams();
        if (!lp.f1785c) {
            return lp.f1784b;
        }
        if (this.g0.d() && (lp.b() || lp.d())) {
            return lp.f1784b;
        }
        Rect insets = lp.f1784b;
        insets.set(0, 0, 0, 0);
        int decorCount = this.o.size();
        for (int i2 = 0; i2 < decorCount; i2++) {
            this.i.set(0, 0, 0, 0);
            this.o.get(i2).e(this.i, child, this);
            int i3 = insets.left;
            Rect rect = this.i;
            insets.left = i3 + rect.left;
            insets.top += rect.top;
            insets.right += rect.right;
            insets.bottom += rect.bottom;
        }
        lp.f1785c = false;
        return insets;
    }

    public void K0() {
    }

    public void L(int hresult, int vresult) {
        this.F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        K0();
        s sVar = this.h0;
        if (sVar != null) {
            sVar.b(this, hresult, vresult);
        }
        List<s> list = this.i0;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                this.i0.get(i2).b(this, hresult, vresult);
            }
        }
        this.F--;
    }

    public void J0() {
    }

    public void K(int state) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.c1(state);
        }
        J0();
        s sVar = this.h0;
        if (sVar != null) {
            sVar.a();
        }
        List<s> list = this.i0;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                this.i0.get(i2).a();
            }
        }
    }

    public boolean m0() {
        return !this.u || this.C || this.f1739e.n();
    }

    public class a0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public int f1743b;

        /* renamed from: c  reason: collision with root package name */
        public int f1744c;

        /* renamed from: d  reason: collision with root package name */
        public OverScroller f1745d;

        /* renamed from: e  reason: collision with root package name */
        public Interpolator f1746e = RecyclerView.G0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1747f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1748g = false;

        public a0() {
            this.f1745d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.G0);
        }

        public void run() {
            int overscrollY;
            if (RecyclerView.this.m == null) {
                i();
                return;
            }
            b();
            RecyclerView.this.v();
            OverScroller scroller = this.f1745d;
            o oVar = RecyclerView.this.m;
            if (scroller.computeScrollOffset()) {
                int[] scrollConsumed = RecyclerView.this.s0;
                int x = scroller.getCurrX();
                int y = scroller.getCurrY();
                int dx = x - this.f1743b;
                int dy = y - this.f1744c;
                int hresult = 0;
                int vresult = 0;
                this.f1743b = x;
                this.f1744c = y;
                int overscrollX = 0;
                if (RecyclerView.this.G(dx, dy, scrollConsumed, null, 1)) {
                    dx -= scrollConsumed[0];
                    dy -= scrollConsumed[1];
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.l != null) {
                    recyclerView.f1(dx, dy, recyclerView.u0);
                    int[] iArr = RecyclerView.this.u0;
                    hresult = iArr[0];
                    vresult = iArr[1];
                    overscrollX = dx - hresult;
                    overscrollY = dy - vresult;
                } else {
                    overscrollY = 0;
                }
                if (!RecyclerView.this.o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(dx, dy);
                }
                if (!RecyclerView.this.H(hresult, vresult, overscrollX, overscrollY, null, 1) && !(overscrollX == 0 && overscrollY == 0)) {
                    int vel = (int) scroller.getCurrVelocity();
                    int velX = 0;
                    if (overscrollX != x) {
                        velX = overscrollX < 0 ? -vel : overscrollX > 0 ? vel : 0;
                    }
                    int velY = 0;
                    if (overscrollY != y) {
                        velY = overscrollY < 0 ? -vel : overscrollY > 0 ? vel : 0;
                    }
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        RecyclerView.this.c(velX, velY);
                    }
                    if ((velX != 0 || overscrollX == x || scroller.getFinalX() == 0) && (velY != 0 || overscrollY == y || scroller.getFinalY() == 0)) {
                        scroller.abortAnimation();
                    }
                }
                if (!(hresult == 0 && vresult == 0)) {
                    RecyclerView.this.L(hresult, vresult);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean fullyConsumedAny = (dx == 0 && dy == 0) || (dx != 0 && RecyclerView.this.m.j() && hresult == dx) || (dy != 0 && RecyclerView.this.m.k() && vresult == dy);
                if (scroller.isFinished() || (!fullyConsumedAny && !RecyclerView.this.l0(1))) {
                    RecyclerView.this.setScrollState(0);
                    if (RecyclerView.C0) {
                        RecyclerView.this.f0.b();
                    }
                    RecyclerView.this.a(1);
                } else {
                    f();
                    RecyclerView recyclerView2 = RecyclerView.this;
                    a.o.c.e eVar = recyclerView2.e0;
                    if (eVar != null) {
                        eVar.f(recyclerView2, dx, dy);
                    }
                }
            }
            d();
        }

        public final void b() {
            this.f1748g = false;
            this.f1747f = true;
        }

        public final void d() {
            this.f1747f = false;
            if (this.f1748g) {
                f();
            }
        }

        public void f() {
            if (this.f1747f) {
                this.f1748g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            a.h.m.s.U(RecyclerView.this, this);
        }

        public void e(int velocityX, int velocityY) {
            RecyclerView.this.setScrollState(2);
            this.f1744c = 0;
            this.f1743b = 0;
            this.f1745d.fling(0, 0, velocityX, velocityY, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            f();
        }

        public final float c(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        public final int a(int dx, int dy, int vx, int vy) {
            int duration;
            int absDx = Math.abs(dx);
            int absDy = Math.abs(dy);
            boolean horizontal = absDx > absDy;
            int velocity = (int) Math.sqrt((double) ((vx * vx) + (vy * vy)));
            int delta = (int) Math.sqrt((double) ((dx * dx) + (dy * dy)));
            RecyclerView recyclerView = RecyclerView.this;
            int containerSize = horizontal ? recyclerView.getWidth() : recyclerView.getHeight();
            int halfContainerSize = containerSize / 2;
            float distance = ((float) halfContainerSize) + (((float) halfContainerSize) * c(Math.min(1.0f, (((float) delta) * 1.0f) / ((float) containerSize))));
            if (velocity > 0) {
                duration = Math.round(Math.abs(distance / ((float) velocity)) * 1000.0f) * 4;
            } else {
                duration = (int) (((((float) (horizontal ? absDx : absDy)) / ((float) containerSize)) + 1.0f) * 300.0f);
            }
            return Math.min(duration, (int) SQLiteDatabase.LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT);
        }

        public void h(int dx, int dy, Interpolator interpolator) {
            g(dx, dy, a(dx, dy, 0, 0), interpolator == null ? RecyclerView.G0 : interpolator);
        }

        public void g(int dx, int dy, int duration, Interpolator interpolator) {
            if (this.f1746e != interpolator) {
                this.f1746e = interpolator;
                this.f1745d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f1744c = 0;
            this.f1743b = 0;
            this.f1745d.startScroll(0, 0, dx, dy, duration);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1745d.computeScrollOffset();
            }
            f();
        }

        public void i() {
            RecyclerView.this.removeCallbacks(this);
            this.f1745d.abortAnimation();
        }
    }

    public void Y0() {
        b0 b0Var;
        int count = this.f1740f.g();
        for (int i2 = 0; i2 < count; i2++) {
            View view = this.f1740f.f(i2);
            b0 holder = e0(view);
            if (!(holder == null || (b0Var = holder.j) == null)) {
                View shadowingView = b0Var.f1750b;
                int left = view.getLeft();
                int top = view.getTop();
                if (left != shadowingView.getLeft() || top != shadowingView.getTop()) {
                    shadowingView.layout(left, top, shadowingView.getWidth() + left, shadowingView.getHeight() + top);
                }
            }
        }
    }

    public class w extends i {
        public w(RecyclerView recyclerView) {
        }
    }

    public static class k {
        public EdgeEffect a(RecyclerView view) {
            return new EdgeEffect(view.getContext());
        }
    }

    public static class t {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f1787a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1788b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<b0> f1789a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f1790b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f1791c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f1792d = 0;
        }

        public void b() {
            for (int i = 0; i < this.f1787a.size(); i++) {
                this.f1787a.valueAt(i).f1789a.clear();
            }
        }

        public b0 f(int viewType) {
            a scrapData = this.f1787a.get(viewType);
            if (scrapData == null || scrapData.f1789a.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> scrapHeap = scrapData.f1789a;
            return (b0) scrapHeap.remove(scrapHeap.size() - 1);
        }

        public void i(b0 scrap) {
            int viewType = scrap.l();
            ArrayList<ViewHolder> scrapHeap = g(viewType).f1789a;
            if (this.f1787a.get(viewType).f1790b > scrapHeap.size()) {
                scrap.C();
                scrapHeap.add(scrap);
            }
        }

        public long j(long oldAverage, long newValue) {
            if (oldAverage == 0) {
                return newValue;
            }
            return ((oldAverage / 4) * 3) + (newValue / 4);
        }

        public void e(int viewType, long createTimeNs) {
            a scrapData = g(viewType);
            scrapData.f1791c = j(scrapData.f1791c, createTimeNs);
        }

        public void d(int viewType, long bindTimeNs) {
            a scrapData = g(viewType);
            scrapData.f1792d = j(scrapData.f1792d, bindTimeNs);
        }

        public boolean l(int viewType, long approxCurrentNs, long deadlineNs) {
            long expectedDurationNs = g(viewType).f1791c;
            return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
        }

        public boolean k(int viewType, long approxCurrentNs, long deadlineNs) {
            long expectedDurationNs = g(viewType).f1792d;
            return expectedDurationNs == 0 || approxCurrentNs + expectedDurationNs < deadlineNs;
        }

        public void a() {
            this.f1788b++;
        }

        public void c() {
            this.f1788b--;
        }

        public void h(g oldAdapter, g newAdapter, boolean compatibleWithPrevious) {
            if (oldAdapter != null) {
                c();
            }
            if (!compatibleWithPrevious && this.f1788b == 0) {
                b();
            }
            if (newAdapter != null) {
                a();
            }
        }

        public final a g(int viewType) {
            a scrapData = this.f1787a.get(viewType);
            if (scrapData != null) {
                return scrapData;
            }
            a scrapData2 = new a();
            this.f1787a.put(viewType, scrapData2);
            return scrapData2;
        }
    }

    public static RecyclerView W(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup parent = (ViewGroup) view;
        int count = parent.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            RecyclerView descendant = W(parent.getChildAt(i2));
            if (descendant != null) {
                return descendant;
            }
        }
        return null;
    }

    public static void s(b0 holder) {
        WeakReference<RecyclerView> weakReference = holder.f1751c;
        if (weakReference != null) {
            RecyclerView item = weakReference.get();
            while (item != null) {
                if (item != holder.f1750b) {
                    ViewParent parent = item.getParent();
                    if (parent instanceof View) {
                        item = (View) parent;
                    } else {
                        item = null;
                    }
                } else {
                    return;
                }
            }
            holder.f1751c = null;
        }
    }

    public long getNanoTime() {
        if (C0) {
            return System.nanoTime();
        }
        return 0;
    }

    public final class u {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<b0> f1793a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b0> f1794b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<b0> f1795c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<b0> f1796d = Collections.unmodifiableList(this.f1793a);

        /* renamed from: e  reason: collision with root package name */
        public int f1797e = 2;

        /* renamed from: f  reason: collision with root package name */
        public int f1798f = 2;

        /* renamed from: g  reason: collision with root package name */
        public t f1799g;
        public z h;

        public u() {
        }

        public void c() {
            this.f1793a.clear();
            z();
        }

        public void G(int viewCount) {
            this.f1797e = viewCount;
            K();
        }

        public void K() {
            o oVar = RecyclerView.this.m;
            this.f1798f = this.f1797e + (oVar != null ? oVar.l : 0);
            for (int i2 = this.f1795c.size() - 1; i2 >= 0 && this.f1795c.size() > this.f1798f; i2--) {
                A(i2);
            }
        }

        public List<b0> k() {
            return this.f1796d;
        }

        public boolean L(b0 holder) {
            if (holder.u()) {
                return RecyclerView.this.g0.d();
            }
            int i2 = holder.f1752d;
            if (i2 < 0 || i2 >= RecyclerView.this.l.c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + holder + RecyclerView.this.R());
            } else if (!RecyclerView.this.g0.d() && RecyclerView.this.l.e(holder.f1752d) != holder.l()) {
                return false;
            } else {
                if (!RecyclerView.this.l.f()) {
                    return true;
                }
                long k = holder.k();
                RecyclerView.this.l.d();
                if (k == -1) {
                    return true;
                }
                return false;
            }
        }

        public final boolean H(b0 holder, int offsetPosition, int position, long deadlineNs) {
            holder.s = RecyclerView.this;
            int viewType = holder.l();
            long startBindNs = RecyclerView.this.getNanoTime();
            if (deadlineNs != Long.MAX_VALUE && !this.f1799g.k(viewType, startBindNs, deadlineNs)) {
                return false;
            }
            RecyclerView.this.l.a(holder, offsetPosition);
            this.f1799g.d(holder.l(), RecyclerView.this.getNanoTime() - startBindNs);
            b(holder);
            if (!RecyclerView.this.g0.d()) {
                return true;
            }
            holder.h = position;
            return true;
        }

        public int f(int position) {
            if (position < 0 || position >= RecyclerView.this.g0.b()) {
                throw new IndexOutOfBoundsException("invalid position " + position + ". State " + "item count is " + RecyclerView.this.g0.b() + RecyclerView.this.R());
            } else if (!RecyclerView.this.g0.d()) {
                return position;
            } else {
                return RecyclerView.this.f1739e.k(position);
            }
        }

        public View o(int position) {
            return p(position, false);
        }

        public View p(int position, boolean dryRun) {
            return I(position, dryRun, Long.MAX_VALUE).f1750b;
        }

        public b0 I(int position, boolean dryRun, long deadlineNs) {
            b0 holder;
            boolean fromScrapOrHiddenOrCache;
            p rvLayoutParams;
            RecyclerView innerView;
            if (position < 0 || position >= RecyclerView.this.g0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + position + "(" + position + "). Item count:" + RecyclerView.this.g0.b() + RecyclerView.this.R());
            }
            boolean fromScrapOrHiddenOrCache2 = false;
            b0 holder2 = null;
            boolean z = true;
            if (RecyclerView.this.g0.d()) {
                holder2 = h(position);
                fromScrapOrHiddenOrCache2 = holder2 != null;
            }
            if (holder2 == null && (holder2 = m(position, dryRun)) != null) {
                if (!L(holder2)) {
                    if (!dryRun) {
                        holder2.b(4);
                        if (holder2.v()) {
                            RecyclerView.this.removeDetachedView(holder2.f1750b, false);
                            holder2.J();
                        } else if (holder2.K()) {
                            holder2.e();
                        }
                        C(holder2);
                    }
                    holder2 = null;
                } else {
                    fromScrapOrHiddenOrCache2 = true;
                }
            }
            if (holder2 == null) {
                int offsetPosition = RecyclerView.this.f1739e.k(position);
                if (offsetPosition < 0 || offsetPosition >= RecyclerView.this.l.c()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + position + "(offset:" + offsetPosition + ")." + "state:" + RecyclerView.this.g0.b() + RecyclerView.this.R());
                }
                int type = RecyclerView.this.l.e(offsetPosition);
                if (RecyclerView.this.l.f()) {
                    RecyclerView.this.l.d();
                    holder2 = l(-1, type, dryRun);
                    if (holder2 != null) {
                        holder2.f1752d = offsetPosition;
                        fromScrapOrHiddenOrCache2 = true;
                    }
                }
                if (holder2 == null) {
                }
                if (holder2 == null && (holder2 = i().f(type)) != null) {
                    holder2.C();
                    if (RecyclerView.A0) {
                        r(holder2);
                    }
                }
                if (holder2 == null) {
                    long start = RecyclerView.this.getNanoTime();
                    if (deadlineNs != Long.MAX_VALUE && !this.f1799g.l(type, start, deadlineNs)) {
                        return null;
                    }
                    RecyclerView recyclerView = RecyclerView.this;
                    b0 holder3 = recyclerView.l.b(recyclerView, type);
                    if (RecyclerView.C0 && (innerView = RecyclerView.W(holder3.f1750b)) != null) {
                        holder3.f1751c = new WeakReference<>(innerView);
                    }
                    this.f1799g.e(type, RecyclerView.this.getNanoTime() - start);
                    fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                    holder = holder3;
                } else {
                    fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                    holder = holder2;
                }
            } else {
                fromScrapOrHiddenOrCache = fromScrapOrHiddenOrCache2;
                holder = holder2;
            }
            if (fromScrapOrHiddenOrCache && !RecyclerView.this.g0.d() && holder.p(8192)) {
                holder.E(0, 8192);
                if (RecyclerView.this.g0.j) {
                    int changeFlags = l.e(holder) | 4096;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    l lVar = recyclerView2.L;
                    y yVar = recyclerView2.g0;
                    holder.o();
                    RecyclerView.this.Q0(holder, lVar.t(holder));
                }
            }
            boolean bound = false;
            if (RecyclerView.this.g0.d() && holder.r()) {
                holder.h = position;
            } else if (!holder.r() || holder.y() || holder.s()) {
                bound = H(holder, RecyclerView.this.f1739e.k(position), position, deadlineNs);
            }
            ViewGroup.LayoutParams lp = holder.f1750b.getLayoutParams();
            if (lp == null) {
                rvLayoutParams = (p) RecyclerView.this.generateDefaultLayoutParams();
                holder.f1750b.setLayoutParams(rvLayoutParams);
            } else if (!RecyclerView.this.checkLayoutParams(lp)) {
                rvLayoutParams = (p) RecyclerView.this.generateLayoutParams(lp);
                holder.f1750b.setLayoutParams(rvLayoutParams);
            } else {
                rvLayoutParams = (p) lp;
            }
            rvLayoutParams.f1783a = holder;
            if (!fromScrapOrHiddenOrCache || !bound) {
                z = false;
            }
            rvLayoutParams.f1786d = z;
            return holder;
        }

        public final void b(b0 holder) {
            if (RecyclerView.this.t0()) {
                View itemView = holder.f1750b;
                if (a.h.m.s.t(itemView) == 0) {
                    a.h.m.s.h0(itemView, 1);
                }
                if (!a.h.m.s.E(itemView)) {
                    holder.b(16384);
                    a.h.m.s.Z(itemView, RecyclerView.this.n0.n());
                }
            }
        }

        public final void r(b0 holder) {
            View view = holder.f1750b;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public final void q(ViewGroup viewGroup, boolean invalidateThis) {
            for (int i2 = viewGroup.getChildCount() - 1; i2 >= 0; i2--) {
                View view = viewGroup.getChildAt(i2);
                if (view instanceof ViewGroup) {
                    q((ViewGroup) view, true);
                }
            }
            if (invalidateThis) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public void B(View view) {
            b0 holder = RecyclerView.f0(view);
            if (holder.w()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (holder.v()) {
                holder.J();
            } else if (holder.K()) {
                holder.e();
            }
            C(holder);
        }

        public void z() {
            for (int i2 = this.f1795c.size() - 1; i2 >= 0; i2--) {
                A(i2);
            }
            this.f1795c.clear();
            if (RecyclerView.C0) {
                RecyclerView.this.f0.b();
            }
        }

        public void A(int cachedViewIndex) {
            a(this.f1795c.get(cachedViewIndex), true);
            this.f1795c.remove(cachedViewIndex);
        }

        public void C(b0 holder) {
            boolean z = false;
            if (holder.v() || holder.f1750b.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(holder.v());
                sb.append(" isAttached:");
                if (holder.f1750b.getParent() != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(RecyclerView.this.R());
                throw new IllegalArgumentException(sb.toString());
            } else if (holder.w()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + holder + RecyclerView.this.R());
            } else if (!holder.I()) {
                boolean transientStatePreventsRecycling = holder.h();
                g gVar = RecyclerView.this.l;
                if (gVar != null && transientStatePreventsRecycling) {
                    gVar.l();
                }
                boolean cached = false;
                boolean recycled = false;
                if (0 != 0 || holder.t()) {
                    if (this.f1798f > 0 && !holder.p(526)) {
                        int cachedViewSize = this.f1795c.size();
                        if (cachedViewSize >= this.f1798f && cachedViewSize > 0) {
                            A(0);
                            cachedViewSize--;
                        }
                        int targetCacheIndex = cachedViewSize;
                        if (RecyclerView.C0 && cachedViewSize > 0 && !RecyclerView.this.f0.d(holder.f1752d)) {
                            int cacheIndex = cachedViewSize - 1;
                            while (cacheIndex >= 0) {
                                if (!RecyclerView.this.f0.d(this.f1795c.get(cacheIndex).f1752d)) {
                                    break;
                                }
                                cacheIndex--;
                            }
                            targetCacheIndex = cacheIndex + 1;
                        }
                        this.f1795c.add(targetCacheIndex, holder);
                        cached = true;
                    }
                    if (!cached) {
                        a(holder, true);
                        recycled = true;
                    }
                }
                RecyclerView.this.f1741g.q(holder);
                if (!cached && !recycled && transientStatePreventsRecycling) {
                    holder.s = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.R());
            }
        }

        public void a(b0 holder, boolean dispatchRecycled) {
            RecyclerView.s(holder);
            if (holder.p(16384)) {
                holder.E(0, 16384);
                a.h.m.s.Z(holder.f1750b, null);
            }
            if (dispatchRecycled) {
                g(holder);
            }
            holder.s = null;
            i().i(holder);
        }

        public void y(View view) {
            b0 holder = RecyclerView.f0(view);
            holder.o = null;
            holder.p = false;
            holder.e();
            C(holder);
        }

        public void D(View view) {
            b0 holder = RecyclerView.f0(view);
            if (!holder.p(12) && holder.x() && !RecyclerView.this.q(holder)) {
                if (this.f1794b == null) {
                    this.f1794b = new ArrayList<>();
                }
                holder.G(this, true);
                this.f1794b.add(holder);
            } else if (!holder.s() || holder.u() || RecyclerView.this.l.f()) {
                holder.G(this, false);
                this.f1793a.add(holder);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.R());
            }
        }

        public void J(b0 holder) {
            if (holder.p) {
                this.f1794b.remove(holder);
            } else {
                this.f1793a.remove(holder);
            }
            holder.o = null;
            holder.p = false;
            holder.e();
        }

        public int j() {
            return this.f1793a.size();
        }

        public View n(int index) {
            return this.f1793a.get(index).f1750b;
        }

        public void e() {
            this.f1793a.clear();
            ArrayList<b0> arrayList = this.f1794b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public b0 h(int position) {
            int changedScrapSize;
            int offsetPosition;
            ArrayList<b0> arrayList = this.f1794b;
            if (arrayList == null || (changedScrapSize = arrayList.size()) == 0) {
                return null;
            }
            for (int i2 = 0; i2 < changedScrapSize; i2++) {
                b0 holder = this.f1794b.get(i2);
                if (!holder.K() && holder.m() == position) {
                    holder.b(32);
                    return holder;
                }
            }
            if (RecyclerView.this.l.f() && (offsetPosition = RecyclerView.this.f1739e.k(position)) > 0 && offsetPosition < RecyclerView.this.l.c()) {
                RecyclerView.this.l.d();
                for (int i3 = 0; i3 < changedScrapSize; i3++) {
                    b0 holder2 = this.f1794b.get(i3);
                    if (!holder2.K() && holder2.k() == -1) {
                        holder2.b(32);
                        return holder2;
                    }
                }
            }
            return null;
        }

        public b0 m(int position, boolean dryRun) {
            View view;
            int scrapCount = this.f1793a.size();
            for (int i2 = 0; i2 < scrapCount; i2++) {
                b0 holder = this.f1793a.get(i2);
                if (!holder.K() && holder.m() == position && !holder.s() && (RecyclerView.this.g0.f1807g || !holder.u())) {
                    holder.b(32);
                    return holder;
                }
            }
            if (dryRun || (view = RecyclerView.this.f1740f.e(position)) == null) {
                int cacheSize = this.f1795c.size();
                for (int i3 = 0; i3 < cacheSize; i3++) {
                    b0 holder2 = this.f1795c.get(i3);
                    if (!holder2.s() && holder2.m() == position) {
                        if (!dryRun) {
                            this.f1795c.remove(i3);
                        }
                        return holder2;
                    }
                }
                return null;
            }
            b0 vh = RecyclerView.f0(view);
            RecyclerView.this.f1740f.s(view);
            int layoutIndex = RecyclerView.this.f1740f.m(view);
            if (layoutIndex != -1) {
                RecyclerView.this.f1740f.d(layoutIndex);
                D(view);
                vh.b(8224);
                return vh;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + vh + RecyclerView.this.R());
        }

        public b0 l(long id, int type, boolean dryRun) {
            for (int i2 = this.f1793a.size() - 1; i2 >= 0; i2--) {
                b0 holder = this.f1793a.get(i2);
                if (holder.k() == id && !holder.K()) {
                    if (type == holder.l()) {
                        holder.b(32);
                        if (holder.u() && !RecyclerView.this.g0.d()) {
                            holder.E(2, 14);
                        }
                        return holder;
                    } else if (!dryRun) {
                        this.f1793a.remove(i2);
                        RecyclerView.this.removeDetachedView(holder.f1750b, false);
                        y(holder.f1750b);
                    }
                }
            }
            for (int i3 = this.f1795c.size() - 1; i3 >= 0; i3--) {
                b0 holder2 = this.f1795c.get(i3);
                if (holder2.k() == id) {
                    if (type == holder2.l()) {
                        if (!dryRun) {
                            this.f1795c.remove(i3);
                        }
                        return holder2;
                    } else if (!dryRun) {
                        A(i3);
                        return null;
                    }
                }
            }
            return null;
        }

        public void g(b0 holder) {
            v vVar = RecyclerView.this.n;
            if (vVar != null) {
                vVar.a(holder);
            }
            g gVar = RecyclerView.this.l;
            if (gVar != null) {
                gVar.o();
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.g0 != null) {
                recyclerView.f1741g.q(holder);
            }
        }

        public void x(g oldAdapter, g newAdapter, boolean compatibleWithPrevious) {
            c();
            i().h(oldAdapter, newAdapter, compatibleWithPrevious);
        }

        public void v(int from, int to) {
            int inBetweenOffset;
            int end;
            int start;
            int i2;
            if (from < to) {
                start = from;
                end = to;
                inBetweenOffset = -1;
            } else {
                start = to;
                end = from;
                inBetweenOffset = 1;
            }
            int cachedCount = this.f1795c.size();
            for (int i3 = 0; i3 < cachedCount; i3++) {
                b0 holder = this.f1795c.get(i3);
                if (holder != null && (i2 = holder.f1752d) >= start && i2 <= end) {
                    if (i2 == from) {
                        holder.z(to - from, false);
                    } else {
                        holder.z(inBetweenOffset, false);
                    }
                }
            }
        }

        public void u(int insertedAt, int count) {
            int cachedCount = this.f1795c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                b0 holder = this.f1795c.get(i2);
                if (holder != null && holder.f1752d >= insertedAt) {
                    holder.z(count, true);
                }
            }
        }

        public void w(int removedFrom, int count, boolean applyToPreLayout) {
            int removedEnd = removedFrom + count;
            for (int i2 = this.f1795c.size() - 1; i2 >= 0; i2--) {
                b0 holder = this.f1795c.get(i2);
                if (holder != null) {
                    int i3 = holder.f1752d;
                    if (i3 >= removedEnd) {
                        holder.z(-count, applyToPreLayout);
                    } else if (i3 >= removedFrom) {
                        holder.b(8);
                        A(i2);
                    }
                }
            }
        }

        public void F(z extension) {
            this.h = extension;
        }

        public void E(t pool) {
            t tVar = this.f1799g;
            if (tVar != null) {
                tVar.c();
            }
            this.f1799g = pool;
            if (pool != null && RecyclerView.this.getAdapter() != null) {
                this.f1799g.a();
            }
        }

        public t i() {
            if (this.f1799g == null) {
                this.f1799g = new t();
            }
            return this.f1799g;
        }

        public void M(int positionStart, int itemCount) {
            int pos;
            int positionEnd = positionStart + itemCount;
            for (int i2 = this.f1795c.size() - 1; i2 >= 0; i2--) {
                b0 holder = this.f1795c.get(i2);
                if (holder != null && (pos = holder.f1752d) >= positionStart && pos < positionEnd) {
                    holder.b(2);
                    A(i2);
                }
            }
        }

        public void t() {
            int cachedCount = this.f1795c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                b0 holder = this.f1795c.get(i2);
                if (holder != null) {
                    holder.b(6);
                    holder.a(null);
                }
            }
            g gVar = RecyclerView.this.l;
            if (gVar == null || !gVar.f()) {
                z();
            }
        }

        public void d() {
            int cachedCount = this.f1795c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                this.f1795c.get(i2).c();
            }
            int scrapCount = this.f1793a.size();
            for (int i3 = 0; i3 < scrapCount; i3++) {
                this.f1793a.get(i3).c();
            }
            ArrayList<b0> arrayList = this.f1794b;
            if (arrayList != null) {
                int changedScrapCount = arrayList.size();
                for (int i4 = 0; i4 < changedScrapCount; i4++) {
                    this.f1794b.get(i4).c();
                }
            }
        }

        public void s() {
            int cachedCount = this.f1795c.size();
            for (int i2 = 0; i2 < cachedCount; i2++) {
                p layoutParams = (p) this.f1795c.get(i2).f1750b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f1785c = true;
                }
            }
        }
    }

    public static abstract class g<VH extends b0> {

        /* renamed from: a  reason: collision with root package name */
        public final h f1759a = new h();

        /* renamed from: b  reason: collision with root package name */
        public boolean f1760b = false;

        public abstract int c();

        public abstract void h(VH vh, int i);

        public abstract VH j(ViewGroup viewGroup, int i);

        /* JADX WARN: Incorrect args count in method signature: (TVH;ILjava/util/List<Ljava/lang/Object;>;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$b0 */
        /* JADX WARN: Multi-variable type inference failed */
        public void i(b0 b0Var, int position) {
            h(b0Var, position);
        }

        public final VH b(ViewGroup parent, int viewType) {
            try {
                a.h.i.a.a("RV CreateView");
                VH holder = j(parent, viewType);
                if (holder.f1750b.getParent() == null) {
                    holder.f1755g = viewType;
                    return holder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                a.h.i.a.b();
            }
        }

        public final void a(VH holder, int position) {
            holder.f1752d = position;
            if (f()) {
                d();
                holder.f1754f = -1;
            }
            holder.E(1, 519);
            a.h.i.a.a("RV OnBindView");
            holder.o();
            i(holder, position);
            holder.d();
            ViewGroup.LayoutParams layoutParams = holder.f1750b.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f1785c = true;
            }
            a.h.i.a.b();
        }

        public int e(int position) {
            return 0;
        }

        public long d() {
            return -1;
        }

        public final boolean f() {
            return this.f1760b;
        }

        /* JADX WARN: Incorrect args count in method signature: (TVH;)V */
        public void o() {
        }

        /* JADX WARN: Incorrect args count in method signature: (TVH;)Z */
        public boolean l() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (TVH;)V */
        public void m() {
        }

        /* JADX WARN: Incorrect args count in method signature: (TVH;)V */
        public void n() {
        }

        public void p(i observer) {
            this.f1759a.registerObserver(observer);
        }

        public void q(i observer) {
            this.f1759a.unregisterObserver(observer);
        }

        public void g() {
        }

        public void k() {
        }
    }

    public void A(View child) {
        b0 viewHolder = f0(child);
        E0();
        g gVar = this.l;
        if (gVar != null && viewHolder != null) {
            gVar.n();
        }
    }

    public void z(View child) {
        b0 viewHolder = f0(child);
        D0();
        g gVar = this.l;
        if (gVar != null && viewHolder != null) {
            gVar.m();
        }
    }

    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        public a.o.c.b f1770a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1771b;

        /* renamed from: c  reason: collision with root package name */
        public final l.b f1772c = new a();

        /* renamed from: d  reason: collision with root package name */
        public final l.b f1773d = new b();

        /* renamed from: e  reason: collision with root package name */
        public a.o.c.l f1774e = new a.o.c.l(this.f1772c);

        /* renamed from: f  reason: collision with root package name */
        public a.o.c.l f1775f = new a.o.c.l(this.f1773d);

        /* renamed from: g  reason: collision with root package name */
        public boolean f1776g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = true;
        public boolean k = true;
        public int l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f1779a;

            /* renamed from: b  reason: collision with root package name */
            public int f1780b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1781c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1782d;
        }

        public abstract p C();

        public class a implements l.b {
            public a() {
            }

            @Override // a.o.c.l.b
            public View a(int index) {
                return o.this.H(index);
            }

            @Override // a.o.c.l.b
            public int c() {
                return o.this.c0();
            }

            @Override // a.o.c.l.b
            public int b() {
                return o.this.m0() - o.this.d0();
            }

            @Override // a.o.c.l.b
            public int e(View view) {
                return o.this.P(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // a.o.c.l.b
            public int d(View view) {
                return o.this.S(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements l.b {
            public b() {
            }

            @Override // a.o.c.l.b
            public View a(int index) {
                return o.this.H(index);
            }

            @Override // a.o.c.l.b
            public int c() {
                return o.this.e0();
            }

            @Override // a.o.c.l.b
            public int b() {
                return o.this.V() - o.this.b0();
            }

            @Override // a.o.c.l.b
            public int e(View view) {
                return o.this.T(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // a.o.c.l.b
            public int d(View view) {
                return o.this.N(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public void A1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f1771b = null;
                this.f1770a = null;
                this.p = 0;
                this.q = 0;
            } else {
                this.f1771b = recyclerView;
                this.f1770a = recyclerView.f1740f;
                this.p = recyclerView.getWidth();
                this.q = recyclerView.getHeight();
            }
            this.n = 1073741824;
            this.o = 1073741824;
        }

        public void w1(int wSpec, int hSpec) {
            this.p = View.MeasureSpec.getSize(wSpec);
            int mode = View.MeasureSpec.getMode(wSpec);
            this.n = mode;
            if (mode == 0 && !RecyclerView.B0) {
                this.p = 0;
            }
            this.q = View.MeasureSpec.getSize(hSpec);
            int mode2 = View.MeasureSpec.getMode(hSpec);
            this.o = mode2;
            if (mode2 == 0 && !RecyclerView.B0) {
                this.q = 0;
            }
        }

        public void z1(int widthSpec, int heightSpec) {
            int count = I();
            if (count == 0) {
                this.f1771b.x(widthSpec, heightSpec);
                return;
            }
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            for (int i2 = 0; i2 < count; i2++) {
                View child = H(i2);
                Rect bounds = this.f1771b.i;
                O(child, bounds);
                if (bounds.left < minX) {
                    minX = bounds.left;
                }
                if (bounds.right > maxX) {
                    maxX = bounds.right;
                }
                if (bounds.top < minY) {
                    minY = bounds.top;
                }
                if (bounds.bottom > maxY) {
                    maxY = bounds.bottom;
                }
            }
            this.f1771b.i.set(minX, minY, maxX, maxY);
            y1(this.f1771b.i, widthSpec, heightSpec);
        }

        public void y1(Rect childrenBounds, int wSpec, int hSpec) {
            x1(m(wSpec, childrenBounds.width() + c0() + d0(), a0()), m(hSpec, childrenBounds.height() + e0() + b0(), Z()));
        }

        public void q1() {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public static int m(int spec, int desired, int min) {
            int mode = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(desired, min));
            }
            if (mode != 1073741824) {
                return Math.max(desired, min);
            }
            return size;
        }

        public void f(String message) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                recyclerView.p(message);
            }
        }

        public boolean q0() {
            return this.i;
        }

        public boolean F1() {
            return false;
        }

        public final boolean s0() {
            return this.k;
        }

        public void n(int dx, int dy, y state, c layoutPrefetchRegistry) {
        }

        public void o(int adapterItemCount, c layoutPrefetchRegistry) {
        }

        public void y(RecyclerView view) {
            this.h = true;
            E0();
        }

        public void z(RecyclerView view, u recycler) {
            this.h = false;
            G0(view, recycler);
        }

        public boolean p0() {
            return this.h;
        }

        public boolean l1(Runnable action) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(action);
            }
            return false;
        }

        public void E0() {
        }

        @Deprecated
        public void F0() {
        }

        public void G0(RecyclerView view, u recycler) {
            F0();
        }

        public boolean L() {
            RecyclerView recyclerView = this.f1771b;
            return recyclerView != null && recyclerView.h;
        }

        public void V0(u recycler, y state) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void W0(y state) {
        }

        public boolean l(p lp) {
            return lp != null;
        }

        public p E(ViewGroup.LayoutParams lp) {
            if (lp instanceof p) {
                return new p((p) lp);
            }
            if (lp instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) lp);
            }
            return new p(lp);
        }

        public p D(Context c2, AttributeSet attrs) {
            return new p(c2, attrs);
        }

        public int t1(int dx, u recycler, y state) {
            return 0;
        }

        public int u1(int dy, u recycler, y state) {
            return 0;
        }

        public boolean j() {
            return false;
        }

        public boolean k() {
            return false;
        }

        public boolean v0() {
            return false;
        }

        public int X() {
            return a.h.m.s.v(this.f1771b);
        }

        public void a(View child) {
            b(child, -1);
        }

        public void b(View child, int index) {
            e(child, index, true);
        }

        public void c(View child) {
            d(child, -1);
        }

        public void d(View child, int index) {
            e(child, index, false);
        }

        public final void e(View child, int index, boolean disappearing) {
            b0 holder = RecyclerView.f0(child);
            if (disappearing || holder.u()) {
                this.f1771b.f1741g.b(holder);
            } else {
                this.f1771b.f1741g.p(holder);
            }
            p lp = (p) child.getLayoutParams();
            if (holder.K() || holder.v()) {
                if (holder.v()) {
                    holder.J();
                } else {
                    holder.e();
                }
                this.f1770a.c(child, index, child.getLayoutParams(), false);
            } else if (child.getParent() == this.f1771b) {
                int currentIndex = this.f1770a.m(child);
                if (index == -1) {
                    index = this.f1770a.g();
                }
                if (currentIndex == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1771b.indexOfChild(child) + this.f1771b.R());
                } else if (currentIndex != index) {
                    this.f1771b.m.z0(currentIndex, index);
                }
            } else {
                this.f1770a.a(child, index, false);
                lp.f1785c = true;
            }
            if (lp.f1786d) {
                holder.f1750b.invalidate();
                lp.f1786d = false;
            }
        }

        public void m1(View child) {
            this.f1770a.p(child);
        }

        public void n1(int index) {
            if (H(index) != null) {
                this.f1770a.q(index);
            }
        }

        public int F() {
            return -1;
        }

        public int f0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public View A(View view) {
            View found;
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView == null || (found = recyclerView.T(view)) == null || this.f1770a.n(found)) {
                return null;
            }
            return found;
        }

        public View B(int position) {
            int childCount = I();
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = H(i2);
                b0 vh = RecyclerView.f0(child);
                if (vh != null && vh.m() == position && !vh.I() && (this.f1771b.g0.d() || !vh.u())) {
                    return child;
                }
            }
            return null;
        }

        public void w(int index) {
            H(index);
            x(index);
        }

        public final void x(int index) {
            this.f1770a.d(index);
        }

        public void h(View child, int index, p lp) {
            b0 vh = RecyclerView.f0(child);
            if (vh.u()) {
                this.f1771b.f1741g.b(vh);
            } else {
                this.f1771b.f1741g.p(vh);
            }
            this.f1770a.c(child, index, lp, vh.u());
        }

        public void g(View child, int index) {
            h(child, index, (p) child.getLayoutParams());
        }

        public void z0(int fromIndex, int toIndex) {
            View view = H(fromIndex);
            if (view != null) {
                w(fromIndex);
                g(view, toIndex);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + fromIndex + this.f1771b.toString());
        }

        public void j1(View child, u recycler) {
            m1(child);
            recycler.B(child);
        }

        public void k1(int index, u recycler) {
            View view = H(index);
            n1(index);
            recycler.B(view);
        }

        public int I() {
            a.o.c.b bVar = this.f1770a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public View H(int index) {
            a.o.c.b bVar = this.f1770a;
            if (bVar != null) {
                return bVar.f(index);
            }
            return null;
        }

        public int n0() {
            return this.n;
        }

        public int W() {
            return this.o;
        }

        public int m0() {
            return this.p;
        }

        public int V() {
            return this.q;
        }

        public int c0() {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int e0() {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int d0() {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int b0() {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public View U() {
            View focused;
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView == null || (focused = recyclerView.getFocusedChild()) == null || this.f1770a.n(focused)) {
                return null;
            }
            return focused;
        }

        public void A0(int dx) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                recyclerView.y0(dx);
            }
        }

        public void B0(int dy) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null) {
                recyclerView.z0(dy);
            }
        }

        public void v(u recycler) {
            for (int i2 = I() - 1; i2 >= 0; i2--) {
                s1(recycler, i2, H(i2));
            }
        }

        public final void s1(u recycler, int index, View view) {
            b0 viewHolder = RecyclerView.f0(view);
            if (!viewHolder.I()) {
                if (!viewHolder.s() || viewHolder.u() || this.f1771b.l.f()) {
                    w(index);
                    recycler.D(view);
                    this.f1771b.f1741g.k(viewHolder);
                    return;
                }
                n1(index);
                recycler.C(viewHolder);
            }
        }

        public void i1(u recycler) {
            int scrapCount = recycler.j();
            for (int i2 = scrapCount - 1; i2 >= 0; i2--) {
                View scrap = recycler.n(i2);
                b0 vh = RecyclerView.f0(scrap);
                if (!vh.I()) {
                    vh.F(false);
                    if (vh.w()) {
                        this.f1771b.removeDetachedView(scrap, false);
                    }
                    l lVar = this.f1771b.L;
                    if (lVar != null) {
                        lVar.j(vh);
                    }
                    vh.F(true);
                    recycler.y(scrap);
                }
            }
            recycler.e();
            if (scrapCount > 0) {
                this.f1771b.invalidate();
            }
        }

        public boolean D1(View child, int widthSpec, int heightSpec, p lp) {
            return !this.j || !u0(child.getMeasuredWidth(), widthSpec, ((ViewGroup.MarginLayoutParams) lp).width) || !u0(child.getMeasuredHeight(), heightSpec, ((ViewGroup.MarginLayoutParams) lp).height);
        }

        public boolean B1(View child, int widthSpec, int heightSpec, p lp) {
            return child.isLayoutRequested() || !this.j || !u0(child.getWidth(), widthSpec, ((ViewGroup.MarginLayoutParams) lp).width) || !u0(child.getHeight(), heightSpec, ((ViewGroup.MarginLayoutParams) lp).height);
        }

        public static boolean u0(int childSize, int spec, int dimension) {
            int specMode = View.MeasureSpec.getMode(spec);
            int specSize = View.MeasureSpec.getSize(spec);
            if (dimension > 0 && childSize != dimension) {
                return false;
            }
            if (specMode != Integer.MIN_VALUE) {
                if (specMode == 0) {
                    return true;
                }
                if (specMode == 1073741824 && specSize == childSize) {
                    return true;
                }
                return false;
            } else if (specSize >= childSize) {
                return true;
            } else {
                return false;
            }
        }

        public void y0(View child, int widthUsed, int heightUsed) {
            p lp = (p) child.getLayoutParams();
            Rect insets = this.f1771b.j0(child);
            int widthUsed2 = widthUsed + insets.left + insets.right;
            int heightUsed2 = heightUsed + insets.top + insets.bottom;
            int widthSpec = J(m0(), n0(), c0() + d0() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin + widthUsed2, ((ViewGroup.MarginLayoutParams) lp).width, j());
            int heightSpec = J(V(), W(), e0() + b0() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + heightUsed2, ((ViewGroup.MarginLayoutParams) lp).height, k());
            if (B1(child, widthSpec, heightSpec, lp)) {
                child.measure(widthSpec, heightSpec);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
            if (r8 != 1073741824) goto L_0x0043;
         */
        public static int J(int parentSize, int parentMode, int padding, int childDimension, boolean canScroll) {
            int size = Math.max(0, parentSize - padding);
            int resultSize = 0;
            int resultMode = 0;
            if (canScroll) {
                if (childDimension >= 0) {
                    resultSize = childDimension;
                    resultMode = 1073741824;
                } else if (childDimension == -1) {
                    if (parentMode != Integer.MIN_VALUE) {
                        if (parentMode == 0) {
                            resultSize = 0;
                            resultMode = 0;
                        }
                    }
                    resultSize = size;
                    resultMode = parentMode;
                } else if (childDimension == -2) {
                    resultSize = 0;
                    resultMode = 0;
                }
            } else if (childDimension >= 0) {
                resultSize = childDimension;
                resultMode = 1073741824;
            } else if (childDimension == -1) {
                resultSize = size;
                resultMode = parentMode;
            } else if (childDimension == -2) {
                resultSize = size;
                resultMode = (parentMode == Integer.MIN_VALUE || parentMode == 1073741824) ? Integer.MIN_VALUE : 0;
            }
            return View.MeasureSpec.makeMeasureSpec(resultSize, resultMode);
        }

        public int R(View child) {
            Rect insets = ((p) child.getLayoutParams()).f1784b;
            return child.getMeasuredWidth() + insets.left + insets.right;
        }

        public int Q(View child) {
            Rect insets = ((p) child.getLayoutParams()).f1784b;
            return child.getMeasuredHeight() + insets.top + insets.bottom;
        }

        public void x0(View child, int left, int top, int right, int bottom) {
            p lp = (p) child.getLayoutParams();
            Rect insets = lp.f1784b;
            child.layout(insets.left + left + ((ViewGroup.MarginLayoutParams) lp).leftMargin, insets.top + top + ((ViewGroup.MarginLayoutParams) lp).topMargin, (right - insets.right) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, (bottom - insets.bottom) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        }

        public void l0(View child, boolean includeDecorInsets, Rect out) {
            Matrix childMatrix;
            if (includeDecorInsets) {
                Rect insets = ((p) child.getLayoutParams()).f1784b;
                out.set(-insets.left, -insets.top, child.getWidth() + insets.right, child.getHeight() + insets.bottom);
            } else {
                out.set(0, 0, child.getWidth(), child.getHeight());
            }
            if (!(this.f1771b == null || (childMatrix = child.getMatrix()) == null || childMatrix.isIdentity())) {
                RectF tempRectF = this.f1771b.k;
                tempRectF.set(out);
                childMatrix.mapRect(tempRectF);
                out.set((int) Math.floor((double) tempRectF.left), (int) Math.floor((double) tempRectF.top), (int) Math.ceil((double) tempRectF.right), (int) Math.ceil((double) tempRectF.bottom));
            }
            out.offset(child.getLeft(), child.getTop());
        }

        public void O(View view, Rect outBounds) {
            RecyclerView.g0(view, outBounds);
        }

        public int P(View child) {
            return child.getLeft() - Y(child);
        }

        public int T(View child) {
            return child.getTop() - k0(child);
        }

        public int S(View child) {
            return child.getRight() + h0(child);
        }

        public int N(View child) {
            return child.getBottom() + G(child);
        }

        public void i(View child, Rect outRect) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView == null) {
                outRect.set(0, 0, 0, 0);
            } else {
                outRect.set(recyclerView.j0(child));
            }
        }

        public int k0(View child) {
            return ((p) child.getLayoutParams()).f1784b.top;
        }

        public int G(View child) {
            return ((p) child.getLayoutParams()).f1784b.bottom;
        }

        public int Y(View child) {
            return ((p) child.getLayoutParams()).f1784b.left;
        }

        public int h0(View child) {
            return ((p) child.getLayoutParams()).f1784b.right;
        }

        public View H0(View focused, int direction, u recycler, y state) {
            return null;
        }

        public View O0() {
            return null;
        }

        public final int[] K(View child, Rect rect) {
            int dx;
            int dy;
            int[] out = new int[2];
            int parentLeft = c0();
            int parentTop = e0();
            int parentRight = m0() - d0();
            int parentBottom = V() - b0();
            int childLeft = (child.getLeft() + rect.left) - child.getScrollX();
            int childTop = (child.getTop() + rect.top) - child.getScrollY();
            int childRight = rect.width() + childLeft;
            int offScreenLeft = Math.min(0, childLeft - parentLeft);
            int offScreenTop = Math.min(0, childTop - parentTop);
            int offScreenRight = Math.max(0, childRight - parentRight);
            int offScreenBottom = Math.max(0, (rect.height() + childTop) - parentBottom);
            if (X() == 1) {
                if (offScreenRight != 0) {
                    dx = offScreenRight;
                } else {
                    dx = Math.max(offScreenLeft, childRight - parentRight);
                }
            } else if (offScreenLeft != 0) {
                dx = offScreenLeft;
            } else {
                dx = Math.min(childLeft - parentLeft, offScreenRight);
            }
            if (offScreenTop != 0) {
                dy = offScreenTop;
            } else {
                dy = Math.min(childTop - parentTop, offScreenBottom);
            }
            out[0] = dx;
            out[1] = dy;
            return out;
        }

        public boolean o1(RecyclerView parent, View child, Rect rect, boolean immediate) {
            return p1(parent, child, rect, immediate, false);
        }

        public boolean p1(RecyclerView parent, View child, Rect rect, boolean immediate, boolean focusedChildVisible) {
            int[] scrollAmount = K(child, rect);
            int dx = scrollAmount[0];
            int dy = scrollAmount[1];
            if ((focusedChildVisible && !r0(parent, dx, dy)) || (dx == 0 && dy == 0)) {
                return false;
            }
            if (immediate) {
                parent.scrollBy(dx, dy);
            } else {
                parent.j1(dx, dy);
            }
            return true;
        }

        public boolean w0(View child, boolean completelyVisible) {
            boolean isViewFullyVisible = this.f1774e.b(child, 24579) && this.f1775f.b(child, 24579);
            if (completelyVisible) {
                return isViewFullyVisible;
            }
            if (!isViewFullyVisible) {
                return true;
            }
            return false;
        }

        public final boolean r0(RecyclerView parent, int dx, int dy) {
            View focusedChild = parent.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int parentLeft = c0();
            int parentTop = e0();
            int parentRight = m0() - d0();
            int parentBottom = V() - b0();
            Rect bounds = this.f1771b.i;
            O(focusedChild, bounds);
            if (bounds.left - dx >= parentRight || bounds.right - dx <= parentLeft || bounds.top - dy >= parentBottom || bounds.bottom - dy <= parentTop) {
                return false;
            }
            return true;
        }

        @Deprecated
        public boolean Y0(RecyclerView parent) {
            v0();
            return parent.u0();
        }

        public boolean Z0(RecyclerView parent, View child, View focused) {
            return Y0(parent);
        }

        public void C0() {
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList<Landroid/view/View;>;II)Z */
        public boolean D0() {
            return false;
        }

        public void Q0(RecyclerView recyclerView) {
        }

        public void P0(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        public void S0(RecyclerView recyclerView, int positionStart, int itemCount) {
        }

        public void T0() {
        }

        public void U0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
            T0();
        }

        public void R0(RecyclerView recyclerView, int from, int to, int itemCount) {
        }

        public int p(y state) {
            return 0;
        }

        public int q(y state) {
            return 0;
        }

        public int r(y state) {
            return 0;
        }

        public int s(y state) {
            return 0;
        }

        public int t(y state) {
            return 0;
        }

        public int u(y state) {
            return 0;
        }

        public void X0(int widthSpec, int heightSpec) {
            this.f1771b.x(widthSpec, heightSpec);
        }

        public void x1(int widthSize, int heightSize) {
            this.f1771b.setMeasuredDimension(widthSize, heightSize);
        }

        public int a0() {
            return a.h.m.s.x(this.f1771b);
        }

        public int Z() {
            return a.h.m.s.w(this.f1771b);
        }

        public Parcelable b1() {
            return null;
        }

        public void a1(Parcelable state) {
        }

        public void E1() {
        }

        public void c1(int state) {
        }

        public void h1(u recycler) {
            for (int i2 = I() - 1; i2 >= 0; i2--) {
                if (!RecyclerView.f0(H(i2)).I()) {
                    k1(i2, recycler);
                }
            }
        }

        public void K0(a.h.m.c0.d info) {
            RecyclerView recyclerView = this.f1771b;
            L0(recyclerView.f1737c, recyclerView.g0, info);
        }

        public void L0(u recycler, y state, a.h.m.c0.d info) {
            if (this.f1771b.canScrollVertically(-1) || this.f1771b.canScrollHorizontally(-1)) {
                info.a(8192);
                info.R(true);
            }
            if (this.f1771b.canScrollVertically(1) || this.f1771b.canScrollHorizontally(1)) {
                info.a(4096);
                info.R(true);
            }
            info.L(d.b.a(i0(recycler, state), M(recycler, state), t0(), j0()));
        }

        public void I0(AccessibilityEvent event) {
            RecyclerView recyclerView = this.f1771b;
            u uVar = recyclerView.f1737c;
            y yVar = recyclerView.g0;
            J0(event);
        }

        public void J0(AccessibilityEvent event) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView != null && event != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1771b.canScrollVertically(-1) && !this.f1771b.canScrollHorizontally(-1) && !this.f1771b.canScrollHorizontally(1)) {
                    z = false;
                }
                event.setScrollable(z);
                g gVar = this.f1771b.l;
                if (gVar != null) {
                    event.setItemCount(gVar.c());
                }
            }
        }

        public void M0(View host, a.h.m.c0.d info) {
            b0 vh = RecyclerView.f0(host);
            if (vh != null && !vh.u() && !this.f1770a.n(vh.f1750b)) {
                RecyclerView recyclerView = this.f1771b;
                N0(recyclerView.f1737c, recyclerView.g0, host, info);
            }
        }

        public void N0(u recycler, y state, View host, a.h.m.c0.d info) {
            info.M(d.c.a(k() ? f0(host) : 0, 1, j() ? f0(host) : 0, 1, false, false));
        }

        public void r1() {
            this.f1776g = true;
        }

        public int j0() {
            return 0;
        }

        public int i0(u recycler, y state) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView == null || recyclerView.l == null || !k()) {
                return 1;
            }
            return this.f1771b.l.c();
        }

        public int M(u recycler, y state) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView == null || recyclerView.l == null || !j()) {
                return 1;
            }
            return this.f1771b.l.c();
        }

        public boolean t0() {
            return false;
        }

        public boolean e1(int action, Bundle args) {
            RecyclerView recyclerView = this.f1771b;
            u uVar = recyclerView.f1737c;
            y yVar = recyclerView.g0;
            return d1(action);
        }

        public boolean d1(int action) {
            RecyclerView recyclerView = this.f1771b;
            if (recyclerView == null) {
                return false;
            }
            int vScroll = 0;
            int hScroll = 0;
            if (action == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    vScroll = (V() - e0()) - b0();
                }
                if (this.f1771b.canScrollHorizontally(1)) {
                    hScroll = (m0() - c0()) - d0();
                }
            } else if (action == 8192) {
                if (recyclerView.canScrollVertically(-1)) {
                    vScroll = -((V() - e0()) - b0());
                }
                if (this.f1771b.canScrollHorizontally(-1)) {
                    hScroll = -((m0() - c0()) - d0());
                }
            }
            if (vScroll == 0 && hScroll == 0) {
                return false;
            }
            this.f1771b.j1(hScroll, vScroll);
            return true;
        }

        public boolean g1(View view, int action, Bundle args) {
            RecyclerView recyclerView = this.f1771b;
            u uVar = recyclerView.f1737c;
            y yVar = recyclerView.g0;
            return f1();
        }

        public boolean f1() {
            return false;
        }

        public static d g0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            d properties = new d();
            TypedArray a2 = context.obtainStyledAttributes(attrs, a.o.b.RecyclerView, defStyleAttr, defStyleRes);
            properties.f1779a = a2.getInt(a.o.b.RecyclerView_android_orientation, 1);
            properties.f1780b = a2.getInt(a.o.b.RecyclerView_spanCount, 1);
            properties.f1781c = a2.getBoolean(a.o.b.RecyclerView_reverseLayout, false);
            properties.f1782d = a2.getBoolean(a.o.b.RecyclerView_stackFromEnd, false);
            a2.recycle();
            return properties;
        }

        public void v1(RecyclerView recyclerView) {
            w1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public boolean C1() {
            return false;
        }

        public boolean o0() {
            int childCount = I();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewGroup.LayoutParams lp = H(i2).getLayoutParams();
                if (lp.width < 0 && lp.height < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class n {
        public void g(Canvas c2, RecyclerView parent) {
            f();
        }

        @Deprecated
        public void f() {
        }

        public void i(Canvas c2, RecyclerView parent, y state) {
            h();
        }

        @Deprecated
        public void h() {
        }

        @Deprecated
        public void d(Rect outRect) {
            outRect.set(0, 0, 0, 0);
        }

        public void e(Rect outRect, View view, RecyclerView parent) {
            ((p) view.getLayoutParams()).a();
            d(outRect);
        }
    }

    public static abstract class s {
        public void a() {
        }

        public void b(RecyclerView recyclerView, int dx, int dy) {
        }
    }

    public static abstract class b0 {
        public static final List<Object> t = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public final View f1750b;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<RecyclerView> f1751c;

        /* renamed from: d  reason: collision with root package name */
        public int f1752d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f1753e = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f1754f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1755g = -1;
        public int h = -1;
        public b0 i = null;
        public b0 j = null;
        public int k;
        public List<Object> l = null;
        public List<Object> m = null;
        public int n = 0;
        public u o = null;
        public boolean p = false;
        public int q = 0;
        public int r = -1;
        public RecyclerView s;

        public b0(View itemView) {
            if (itemView != null) {
                this.f1750b = itemView;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void i(int mNewPosition, int offset, boolean applyToPreLayout) {
            b(8);
            z(offset, applyToPreLayout);
            this.f1752d = mNewPosition;
        }

        public void z(int offset, boolean applyToPreLayout) {
            if (this.f1753e == -1) {
                this.f1753e = this.f1752d;
            }
            if (this.h == -1) {
                this.h = this.f1752d;
            }
            if (applyToPreLayout) {
                this.h += offset;
            }
            this.f1752d += offset;
            if (this.f1750b.getLayoutParams() != null) {
                ((p) this.f1750b.getLayoutParams()).f1785c = true;
            }
        }

        public void c() {
            this.f1753e = -1;
            this.h = -1;
        }

        public void D() {
            if (this.f1753e == -1) {
                this.f1753e = this.f1752d;
            }
        }

        public boolean I() {
            return (this.k & 128) != 0;
        }

        public final int m() {
            int i2 = this.h;
            return i2 == -1 ? this.f1752d : i2;
        }

        public final int j() {
            RecyclerView recyclerView = this.s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c0(this);
        }

        public final int n() {
            return this.f1753e;
        }

        public final long k() {
            return this.f1754f;
        }

        public final int l() {
            return this.f1755g;
        }

        public boolean v() {
            return this.o != null;
        }

        public void J() {
            this.o.J(this);
        }

        public boolean K() {
            return (this.k & 32) != 0;
        }

        public void e() {
            this.k &= -33;
        }

        public void f() {
            this.k &= -257;
        }

        public void G(u recycler, boolean isChangeScrap) {
            this.o = recycler;
            this.p = isChangeScrap;
        }

        public boolean s() {
            return (this.k & 4) != 0;
        }

        public boolean y() {
            return (this.k & 2) != 0;
        }

        public boolean r() {
            return (this.k & 1) != 0;
        }

        public boolean u() {
            return (this.k & 8) != 0;
        }

        public boolean p(int flags) {
            return (this.k & flags) != 0;
        }

        public boolean w() {
            return (this.k & 256) != 0;
        }

        public boolean q() {
            return (this.k & 512) != 0 || s();
        }

        public void E(int flags, int mask) {
            this.k = (this.k & (~mask)) | (flags & mask);
        }

        public void b(int flags) {
            this.k |= flags;
        }

        public void a(Object payload) {
            if (payload == null) {
                b(1024);
            } else if ((1024 & this.k) == 0) {
                g();
                this.l.add(payload);
            }
        }

        public final void g() {
            if (this.l == null) {
                ArrayList arrayList = new ArrayList();
                this.l = arrayList;
                this.m = Collections.unmodifiableList(arrayList);
            }
        }

        public void d() {
            List<Object> list = this.l;
            if (list != null) {
                list.clear();
            }
            this.k &= -1025;
        }

        public List<Object> o() {
            if ((this.k & 1024) != 0) {
                return t;
            }
            List<Object> list = this.l;
            if (list == null || list.size() == 0) {
                return t;
            }
            return this.m;
        }

        public void C() {
            this.k = 0;
            this.f1752d = -1;
            this.f1753e = -1;
            this.f1754f = -1;
            this.h = -1;
            this.n = 0;
            this.i = null;
            this.j = null;
            d();
            this.q = 0;
            this.r = -1;
            RecyclerView.s(this);
        }

        public void A(RecyclerView parent) {
            int i2 = this.r;
            if (i2 != -1) {
                this.q = i2;
            } else {
                this.q = a.h.m.s.t(this.f1750b);
            }
            parent.h1(this, 4);
        }

        public void B(RecyclerView parent) {
            parent.h1(this, this.q);
            this.q = 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f1752d + " id=" + this.f1754f + ", oldPos=" + this.f1753e + ", pLpos:" + this.h);
            if (v()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (s()) {
                sb.append(" invalid");
            }
            if (!r()) {
                sb.append(" unbound");
            }
            if (y()) {
                sb.append(" update");
            }
            if (u()) {
                sb.append(" removed");
            }
            if (I()) {
                sb.append(" ignored");
            }
            if (w()) {
                sb.append(" tmpDetached");
            }
            if (!t()) {
                sb.append(" not recyclable(" + this.n + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1750b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final void F(boolean recyclable) {
            int i2 = this.n;
            int i3 = recyclable ? i2 - 1 : i2 + 1;
            this.n = i3;
            if (i3 < 0) {
                this.n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!recyclable && i3 == 1) {
                this.k |= 16;
            } else if (recyclable && this.n == 0) {
                this.k &= -17;
            }
        }

        public final boolean t() {
            return (this.k & 16) == 0 && !a.h.m.s.H(this.f1750b);
        }

        public boolean H() {
            return (this.k & 16) != 0;
        }

        public boolean h() {
            return (this.k & 16) == 0 && a.h.m.s.H(this.f1750b);
        }

        public boolean x() {
            return (this.k & 2) != 0;
        }
    }

    public boolean h1(b0 viewHolder, int importantForAccessibility) {
        if (u0()) {
            viewHolder.r = importantForAccessibility;
            this.v0.add(viewHolder);
            return false;
        }
        a.h.m.s.h0(viewHolder.f1750b, importantForAccessibility);
        return true;
    }

    public void M() {
        int state;
        for (int i2 = this.v0.size() - 1; i2 >= 0; i2--) {
            b0 viewHolder = this.v0.get(i2);
            if (viewHolder.f1750b.getParent() == this && !viewHolder.I() && (state = viewHolder.r) != -1) {
                a.h.m.s.h0(viewHolder.f1750b, state);
                viewHolder.r = -1;
            }
        }
        this.v0.clear();
    }

    public int c0(b0 viewHolder) {
        if (viewHolder.p(524) || !viewHolder.r()) {
            return -1;
        }
        return this.f1739e.c(viewHolder.f1752d);
    }

    public void r0(StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable) {
        if (verticalThumbDrawable == null || verticalTrackDrawable == null || horizontalThumbDrawable == null || horizontalTrackDrawable == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + R());
        }
        Resources resources = getContext().getResources();
        new a.o.c.d(this, verticalThumbDrawable, verticalTrackDrawable, horizontalThumbDrawable, horizontalTrackDrawable, resources.getDimensionPixelSize(a.o.a.fastscroll_default_thickness), resources.getDimensionPixelSize(a.o.a.fastscroll_minimum_range), resources.getDimensionPixelOffset(a.o.a.fastscroll_margin));
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        getScrollingChildHelper().n(enabled);
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public boolean startNestedScroll(int axes) {
        return getScrollingChildHelper().p(axes);
    }

    public boolean m1(int axes, int type) {
        return getScrollingChildHelper().q(axes, type);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    @Override // a.h.m.j
    public void a(int type) {
        getScrollingChildHelper().s(type);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean l0(int type) {
        return getScrollingChildHelper().l(type);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return getScrollingChildHelper().f(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    public boolean H(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().g(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return getScrollingChildHelper().c(dx, dy, consumed, offsetInWindow);
    }

    public boolean G(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return getScrollingChildHelper().d(dx, dy, consumed, offsetInWindow, type);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return getScrollingChildHelper().a(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return getScrollingChildHelper().b(velocityX, velocityY);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public b0 f1783a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1784b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f1785c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1786d = false;

        public p(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public p(int width, int height) {
            super(width, height);
        }

        public p(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public p(ViewGroup.LayoutParams source) {
            super(source);
        }

        public p(p source) {
            super((ViewGroup.LayoutParams) source);
        }

        public boolean d() {
            return this.f1783a.s();
        }

        public boolean c() {
            return this.f1783a.u();
        }

        public boolean b() {
            return this.f1783a.x();
        }

        public int a() {
            return this.f1783a.m();
        }
    }

    public static class x extends a.j.a.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f1800d;

        public x(Parcel in, ClassLoader loader) {
            super(in, loader);
            ClassLoader classLoader;
            if (loader != null) {
                classLoader = loader;
            } else {
                classLoader = o.class.getClassLoader();
            }
            this.f1800d = in.readParcelable(classLoader);
        }

        public x(Parcelable superState) {
            super(superState);
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeParcelable(this.f1800d, 0);
        }

        public void b(x other) {
            this.f1800d = other.f1800d;
        }

        public static class a implements Parcelable.ClassLoaderCreator<x> {
            /* renamed from: b */
            public x createFromParcel(Parcel in, ClassLoader loader) {
                return new x(in, loader);
            }

            /* renamed from: a */
            public x createFromParcel(Parcel in) {
                return new x(in, null);
            }

            /* renamed from: c */
            public x[] newArray(int size) {
                return new x[size];
            }
        }
    }

    public static class y {

        /* renamed from: a  reason: collision with root package name */
        public int f1801a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1802b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1803c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1804d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f1805e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1806f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1807g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;
        public int o;

        public void a(int accepted) {
            if ((this.f1804d & accepted) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(accepted) + " but it is " + Integer.toBinaryString(this.f1804d));
            }
        }

        public void e(g adapter) {
            this.f1804d = 1;
            this.f1805e = adapter.c();
            this.f1807g = false;
            this.h = false;
            this.i = false;
        }

        public boolean d() {
            return this.f1807g;
        }

        public boolean f() {
            return this.k;
        }

        public boolean c() {
            return this.f1801a != -1;
        }

        public int b() {
            return this.f1807g ? this.f1802b - this.f1803c : this.f1805e;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f1801a + ", mData=" + ((Object) null) + ", mItemCount=" + this.f1805e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f1802b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1803c + ", mStructureChanged=" + this.f1806f + ", mInPreLayout=" + this.f1807g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
        }
    }

    public class m implements l.b {
        public m() {
        }

        public void a(b0 item) {
            item.F(true);
            if (item.i != null && item.j == null) {
                item.i = null;
            }
            item.j = null;
            if (!item.H() && !RecyclerView.this.U0(item.f1750b) && item.w()) {
                RecyclerView.this.removeDetachedView(item.f1750b, false);
            }
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public b f1761a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1762b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f1763c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f1764d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f1765e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f1766f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public abstract boolean a(b0 b0Var, c cVar, c cVar2);

        public abstract boolean b(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public abstract boolean c(b0 b0Var, c cVar, c cVar2);

        public abstract boolean d(b0 b0Var, c cVar, c cVar2);

        public abstract boolean f(b0 b0Var);

        public abstract void j(b0 b0Var);

        public abstract void k();

        public abstract boolean p();

        public abstract void u();

        public long n() {
            return this.f1765e;
        }

        public long l() {
            return this.f1763c;
        }

        public long o() {
            return this.f1764d;
        }

        public long m() {
            return this.f1766f;
        }

        public void v(b listener) {
            this.f1761a = listener;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView$y;Landroidx/recyclerview/widget/RecyclerView$b0;ILjava/util/List<Ljava/lang/Object;>;)Landroidx/recyclerview/widget/RecyclerView$l$c; */
        public c t(b0 viewHolder) {
            c q = q();
            q.a(viewHolder);
            return q;
        }

        public c s(b0 viewHolder) {
            c q = q();
            q.a(viewHolder);
            return q;
        }

        public static int e(b0 viewHolder) {
            int flags = viewHolder.k & 14;
            if (viewHolder.s()) {
                return 4;
            }
            if ((flags & 4) != 0) {
                return flags;
            }
            int oldPos = viewHolder.n();
            int pos = viewHolder.j();
            if (oldPos == -1 || pos == -1 || oldPos == pos) {
                return flags;
            }
            return flags | 2048;
        }

        public final void h(b0 viewHolder) {
            r();
            b bVar = this.f1761a;
            if (bVar != null) {
                ((m) bVar).a(viewHolder);
            }
        }

        public void r() {
        }

        public boolean g(b0 viewHolder, List<Object> list) {
            return f(viewHolder);
        }

        public final void i() {
            int count = this.f1762b.size();
            for (int i = 0; i < count; i++) {
                this.f1762b.get(i).a();
            }
            this.f1762b.clear();
        }

        public c q() {
            return new c();
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1767a;

            /* renamed from: b  reason: collision with root package name */
            public int f1768b;

            public c a(b0 holder) {
                b(holder);
                return this;
            }

            public c b(b0 holder) {
                View view = holder.f1750b;
                this.f1767a = view.getLeft();
                this.f1768b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }
    }

    public int getChildDrawingOrder(int childCount, int i2) {
        j jVar = this.o0;
        if (jVar == null) {
            return super.getChildDrawingOrder(childCount, i2);
        }
        return jVar.a(childCount, i2);
    }

    private a.h.m.l getScrollingChildHelper() {
        if (this.q0 == null) {
            this.q0 = new a.h.m.l(this);
        }
        return this.q0;
    }
}
