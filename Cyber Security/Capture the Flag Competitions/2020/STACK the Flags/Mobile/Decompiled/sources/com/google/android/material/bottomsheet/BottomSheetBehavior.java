package com.google.android.material.bottomsheet;

import a.h.m.s;
import a.j.b.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.d.a.a.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2725a = true;

    /* renamed from: b  reason: collision with root package name */
    public float f2726b;

    /* renamed from: c  reason: collision with root package name */
    public int f2727c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2728d;

    /* renamed from: e  reason: collision with root package name */
    public int f2729e;

    /* renamed from: f  reason: collision with root package name */
    public int f2730f;

    /* renamed from: g  reason: collision with root package name */
    public int f2731g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l = 4;
    public a.j.b.a m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public WeakReference<V> r;
    public WeakReference<View> s;
    public c t;
    public VelocityTracker u;
    public int v;
    public int w;
    public boolean x;
    public Map<View, Integer> y;
    public final a.c z = new b();

    public static abstract class c {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i);
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        int i2;
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.BottomSheetBehavior_Layout);
        TypedValue value = a2.peekValue(j.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (value == null || (i2 = value.data) != -1) {
            Q(a2.getDimensionPixelSize(j.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            Q(i2);
        }
        P(a2.getBoolean(j.BottomSheetBehavior_Layout_behavior_hideable, false));
        O(a2.getBoolean(j.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        R(a2.getBoolean(j.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        a2.recycle();
        this.f2726b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable x(CoordinatorLayout parent, V child) {
        return new d(super.x(parent, child), this.l);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void w(CoordinatorLayout parent, V child, Parcelable state) {
        d ss = (d) state;
        super.w(parent, child, ss.a());
        int i2 = ss.f2736d;
        if (i2 == 1 || i2 == 2) {
            this.l = 4;
        } else {
            this.l = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout parent, V child, int layoutDirection) {
        if (s.s(parent) && !s.s(child)) {
            child.setFitsSystemWindows(true);
        }
        int savedTop = child.getTop();
        parent.I(child, layoutDirection);
        this.q = parent.getHeight();
        if (this.f2728d) {
            if (this.f2729e == 0) {
                this.f2729e = parent.getResources().getDimensionPixelSize(b.d.a.a.d.design_bottom_sheet_peek_height_min);
            }
            this.f2730f = Math.max(this.f2729e, this.q - ((parent.getWidth() * 9) / 16));
        } else {
            this.f2730f = this.f2727c;
        }
        this.f2731g = Math.max(0, this.q - child.getHeight());
        this.h = this.q / 2;
        F();
        int i2 = this.l;
        if (i2 == 3) {
            s.Q(child, J());
        } else if (i2 == 6) {
            s.Q(child, this.h);
        } else if (!this.j || i2 != 5) {
            int i3 = this.l;
            if (i3 == 4) {
                s.Q(child, this.i);
            } else if (i3 == 1 || i3 == 2) {
                s.Q(child, savedTop - child.getTop());
            }
        } else {
            s.Q(child, this.q);
        }
        if (this.m == null) {
            this.m = a.j.b.a.l(parent, this.z);
        }
        this.r = new WeakReference<>(child);
        this.s = new WeakReference<>(H(child));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout parent, V child, MotionEvent event) {
        a.j.b.a aVar;
        if (!child.isShown()) {
            this.n = true;
            return false;
        }
        int action = event.getActionMasked();
        if (action == 0) {
            M();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(event);
        View scroll = null;
        if (action == 0) {
            int initialX = (int) event.getX();
            this.w = (int) event.getY();
            WeakReference<View> weakReference = this.s;
            View scroll2 = weakReference != null ? weakReference.get() : null;
            if (scroll2 != null && parent.B(scroll2, initialX, this.w)) {
                this.v = event.getPointerId(event.getActionIndex());
                this.x = true;
            }
            this.n = this.v == -1 && !parent.B(child, initialX, this.w);
        } else if (action == 1 || action == 3) {
            this.x = false;
            this.v = -1;
            if (this.n) {
                this.n = false;
                return false;
            }
        }
        if (!this.n && (aVar = this.m) != null && aVar.F(event)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.s;
        if (weakReference2 != null) {
            scroll = weakReference2.get();
        }
        if (action != 2 || scroll == null || this.n || this.l == 1 || parent.B(scroll, (int) event.getX(), (int) event.getY()) || this.m == null || Math.abs(((float) this.w) - event.getY()) <= ((float) this.m.t())) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean C(CoordinatorLayout parent, V child, MotionEvent event) {
        if (!child.isShown()) {
            return false;
        }
        int action = event.getActionMasked();
        if (this.l == 1 && action == 0) {
            return true;
        }
        a.j.b.a aVar = this.m;
        if (aVar != null) {
            aVar.y(event);
        }
        if (action == 0) {
            M();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(event);
        if (action == 2 && !this.n && Math.abs(((float) this.w) - event.getY()) > ((float) this.m.t())) {
            this.m.b(child, event.getPointerId(event.getActionIndex()));
        }
        return !this.n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(CoordinatorLayout coordinatorLayout, V v2, View directTargetChild, View target, int axes, int type) {
        this.o = 0;
        this.p = false;
        if ((axes & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed, int type) {
        if (type != 1 && target == this.s.get()) {
            int currentTop = child.getTop();
            int newTop = currentTop - dy;
            if (dy > 0) {
                if (newTop < J()) {
                    consumed[1] = currentTop - J();
                    s.Q(child, -consumed[1]);
                    T(3);
                } else {
                    consumed[1] = dy;
                    s.Q(child, -dy);
                    T(1);
                }
            } else if (dy < 0 && !target.canScrollVertically(-1)) {
                int i2 = this.i;
                if (newTop <= i2 || this.j) {
                    consumed[1] = dy;
                    s.Q(child, -dy);
                    T(1);
                } else {
                    consumed[1] = currentTop - i2;
                    s.Q(child, -consumed[1]);
                    T(4);
                }
            }
            G(child.getTop());
            this.o = dy;
            this.p = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V child, View target, int type) {
        int targetState;
        int top;
        if (child.getTop() == J()) {
            T(3);
        } else if (target == this.s.get() && this.p) {
            if (this.o > 0) {
                top = J();
                targetState = 3;
            } else if (this.j && U(child, L())) {
                top = this.q;
                targetState = 5;
            } else if (this.o == 0) {
                int currentTop = child.getTop();
                if (!this.f2725a) {
                    int top2 = this.h;
                    if (currentTop < top2) {
                        if (currentTop < Math.abs(currentTop - this.i)) {
                            top = 0;
                            targetState = 3;
                        } else {
                            top = this.h;
                            targetState = 6;
                        }
                    } else if (Math.abs(currentTop - top2) < Math.abs(currentTop - this.i)) {
                        top = this.h;
                        targetState = 6;
                    } else {
                        top = this.i;
                        targetState = 4;
                    }
                } else if (Math.abs(currentTop - this.f2731g) < Math.abs(currentTop - this.i)) {
                    top = this.f2731g;
                    targetState = 3;
                } else {
                    top = this.i;
                    targetState = 4;
                }
            } else {
                top = this.i;
                targetState = 4;
            }
            if (this.m.G(child, child.getLeft(), top)) {
                T(2);
                s.U(child, new e(child, targetState));
            } else {
                T(targetState);
            }
            this.p = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY) {
        if (target == this.s.get()) {
            if (this.l != 3) {
                return true;
            }
            super.o(coordinatorLayout, child, target, velocityX, velocityY);
        }
        return false;
    }

    public void O(boolean fitToContents) {
        if (this.f2725a != fitToContents) {
            this.f2725a = fitToContents;
            if (this.r != null) {
                F();
            }
            T((!this.f2725a || this.l != 6) ? this.l : 3);
        }
    }

    public final void Q(int peekHeight) {
        WeakReference<V> weakReference;
        V view;
        boolean layout = false;
        if (peekHeight == -1) {
            if (!this.f2728d) {
                this.f2728d = true;
                layout = true;
            }
        } else if (this.f2728d || this.f2727c != peekHeight) {
            this.f2728d = false;
            this.f2727c = Math.max(0, peekHeight);
            this.i = this.q - peekHeight;
            layout = true;
        }
        if (layout && this.l == 4 && (weakReference = this.r) != null && (view = weakReference.get()) != null) {
            view.requestLayout();
        }
    }

    public void P(boolean hideable) {
        this.j = hideable;
    }

    public void R(boolean skipCollapsed) {
        this.k = skipCollapsed;
    }

    public void N(c callback) {
        this.t = callback;
    }

    public final void S(int state) {
        if (state != this.l) {
            WeakReference<V> weakReference = this.r;
            if (weakReference != null) {
                V child = weakReference.get();
                if (child != null) {
                    ViewParent parent = child.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !s.J(child)) {
                        V(child, state);
                    } else {
                        child.post(new a(child, state));
                    }
                }
            } else if (state == 4 || state == 3 || state == 6 || (this.j && state == 5)) {
                this.l = state;
            }
        }
    }

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2732b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2733c;

        public a(View view, int i) {
            this.f2732b = view;
            this.f2733c = i;
        }

        public void run() {
            BottomSheetBehavior.this.V(this.f2732b, this.f2733c);
        }
    }

    public final int K() {
        return this.l;
    }

    public void T(int state) {
        c cVar;
        if (this.l != state) {
            this.l = state;
            if (state == 6 || state == 3) {
                W(true);
            } else if (state == 5 || state == 4) {
                W(false);
            }
            View bottomSheet = this.r.get();
            if (bottomSheet != null && (cVar = this.t) != null) {
                cVar.b(bottomSheet, state);
            }
        }
    }

    public final void F() {
        if (this.f2725a) {
            this.i = Math.max(this.q - this.f2730f, this.f2731g);
        } else {
            this.i = this.q - this.f2730f;
        }
    }

    public final void M() {
        this.v = -1;
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    public boolean U(View child, float yvel) {
        if (this.k) {
            return true;
        }
        if (child.getTop() >= this.i && Math.abs((((float) child.getTop()) + (0.1f * yvel)) - ((float) this.i)) / ((float) this.f2727c) > 0.5f) {
            return true;
        }
        return false;
    }

    public View H(View view) {
        if (s.L(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup group = (ViewGroup) view;
        int count = group.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View scrollingChild = H(group.getChildAt(i2));
            if (scrollingChild != null) {
                return scrollingChild;
            }
        }
        return null;
    }

    public final float L() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(SQLiteDatabase.SLEEP_AFTER_YIELD_QUANTUM, this.f2726b);
        return this.u.getYVelocity(this.v);
    }

    public final int J() {
        if (this.f2725a) {
            return this.f2731g;
        }
        return 0;
    }

    public void V(View child, int state) {
        int top;
        if (state == 4) {
            top = this.i;
        } else if (state == 6) {
            top = this.h;
            if (this.f2725a && top <= this.f2731g) {
                state = 3;
                top = this.f2731g;
            }
        } else if (state == 3) {
            top = J();
        } else if (!this.j || state != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + state);
        } else {
            top = this.q;
        }
        if (this.m.G(child, child.getLeft(), top)) {
            T(2);
            s.U(child, new e(child, state));
            return;
        }
        T(state);
    }

    public class b extends a.c {
        public b() {
        }

        @Override // a.j.b.a.c
        public boolean m(View child, int pointerId) {
            WeakReference<V> weakReference;
            View scroll;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i = bottomSheetBehavior.l;
            if (i == 1 || bottomSheetBehavior.x) {
                return false;
            }
            if ((i != 3 || bottomSheetBehavior.v != pointerId || (scroll = bottomSheetBehavior.s.get()) == null || !scroll.canScrollVertically(-1)) && (weakReference = BottomSheetBehavior.this.r) != null && weakReference.get() == child) {
                return true;
            }
            return false;
        }

        @Override // a.j.b.a.c
        public void k(View changedView, int left, int top, int dx, int dy) {
            BottomSheetBehavior.this.G(top);
        }

        @Override // a.j.b.a.c
        public void j(int state) {
            if (state == 1) {
                BottomSheetBehavior.this.T(1);
            }
        }

        @Override // a.j.b.a.c
        public void l(View releasedChild, float xvel, float yvel) {
            int targetState;
            int top;
            if (yvel >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.j && bottomSheetBehavior.U(releasedChild, yvel) && (releasedChild.getTop() > BottomSheetBehavior.this.i || Math.abs(xvel) < Math.abs(yvel))) {
                    top = BottomSheetBehavior.this.q;
                    targetState = 5;
                } else if (yvel == 0.0f || Math.abs(xvel) > Math.abs(yvel)) {
                    int currentTop = releasedChild.getTop();
                    if (!BottomSheetBehavior.this.f2725a) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int targetState2 = bottomSheetBehavior2.h;
                        if (currentTop < targetState2) {
                            if (currentTop < Math.abs(currentTop - bottomSheetBehavior2.i)) {
                                top = 0;
                                targetState = 3;
                            } else {
                                top = BottomSheetBehavior.this.h;
                                targetState = 6;
                            }
                        } else if (Math.abs(currentTop - targetState2) < Math.abs(currentTop - BottomSheetBehavior.this.i)) {
                            top = BottomSheetBehavior.this.h;
                            targetState = 6;
                        } else {
                            top = BottomSheetBehavior.this.i;
                            targetState = 4;
                        }
                    } else if (Math.abs(currentTop - BottomSheetBehavior.this.f2731g) < Math.abs(currentTop - BottomSheetBehavior.this.i)) {
                        top = BottomSheetBehavior.this.f2731g;
                        targetState = 3;
                    } else {
                        top = BottomSheetBehavior.this.i;
                        targetState = 4;
                    }
                } else {
                    top = BottomSheetBehavior.this.i;
                    targetState = 4;
                }
            } else if (BottomSheetBehavior.this.f2725a) {
                top = BottomSheetBehavior.this.f2731g;
                targetState = 3;
            } else {
                int currentTop2 = releasedChild.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (currentTop2 > bottomSheetBehavior3.h) {
                    top = bottomSheetBehavior3.h;
                    targetState = 6;
                } else {
                    top = 0;
                    targetState = 3;
                }
            }
            if (BottomSheetBehavior.this.m.E(releasedChild.getLeft(), top)) {
                BottomSheetBehavior.this.T(2);
                s.U(releasedChild, new e(releasedChild, targetState));
                return;
            }
            BottomSheetBehavior.this.T(targetState);
        }

        @Override // a.j.b.a.c
        public int b(View child, int top, int dy) {
            int J = BottomSheetBehavior.this.J();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a.h.h.a.a(top, J, bottomSheetBehavior.j ? bottomSheetBehavior.q : bottomSheetBehavior.i);
        }

        @Override // a.j.b.a.c
        public int a(View child, int left, int dx) {
            return child.getLeft();
        }

        @Override // a.j.b.a.c
        public int e(View child) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.j) {
                return bottomSheetBehavior.q;
            }
            return bottomSheetBehavior.i;
        }
    }

    public void G(int top) {
        c cVar;
        View bottomSheet = this.r.get();
        if (bottomSheet != null && (cVar = this.t) != null) {
            int i2 = this.i;
            if (top > i2) {
                cVar.a(bottomSheet, ((float) (i2 - top)) / ((float) (this.q - i2)));
            } else {
                cVar.a(bottomSheet, ((float) (i2 - top)) / ((float) (i2 - J())));
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final View f2737b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2738c;

        public e(View view, int targetState) {
            this.f2737b = view;
            this.f2738c = targetState;
        }

        public void run() {
            a.j.b.a aVar = BottomSheetBehavior.this.m;
            if (aVar == null || !aVar.k(true)) {
                BottomSheetBehavior.this.T(this.f2738c);
            } else {
                s.U(this.f2737b, this);
            }
        }
    }

    public static class d extends a.j.a.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public final int f2736d;

        public d(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f2736d = source.readInt();
        }

        public d(Parcelable superState, int state) {
            super(superState);
            this.f2736d = state;
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f2736d);
        }

        public static class a implements Parcelable.ClassLoaderCreator<d> {
            /* renamed from: b */
            public d createFromParcel(Parcel in, ClassLoader loader) {
                return new d(in, loader);
            }

            /* renamed from: a */
            public d createFromParcel(Parcel in) {
                return new d(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public d[] newArray(int size) {
                return new d[size];
            }
        }
    }

    public static <V extends View> BottomSheetBehavior<V> I(V view) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c behavior = ((CoordinatorLayout.f) params).f();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void W(boolean expanded) {
        WeakReference<V> weakReference = this.r;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get().getParent();
            if (viewParent instanceof CoordinatorLayout) {
                CoordinatorLayout parent = (CoordinatorLayout) viewParent;
                int childCount = parent.getChildCount();
                if (expanded) {
                    if (this.y == null) {
                        this.y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child = parent.getChildAt(i2);
                    if (child != this.r.get()) {
                        if (!expanded) {
                            Map<View, Integer> map = this.y;
                            if (map != null && map.containsKey(child)) {
                                s.h0(child, this.y.get(child).intValue());
                            }
                        } else {
                            this.y.put(child, Integer.valueOf(child.getImportantForAccessibility()));
                            s.h0(child, 4);
                        }
                    }
                }
                if (!expanded) {
                    this.y = null;
                }
            }
        }
    }
}
