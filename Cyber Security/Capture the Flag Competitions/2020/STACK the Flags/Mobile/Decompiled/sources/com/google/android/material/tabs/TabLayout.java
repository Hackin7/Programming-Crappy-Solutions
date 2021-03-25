package com.google.android.material.tabs;

import a.b.k.a;
import a.b.p.z0;
import a.h.m.r;
import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import b.d.a.a.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.database.SQLiteDatabase;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    public static final a.h.l.e<f> P = new a.h.l.g(16);
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public c E;
    public final ArrayList<c> F;
    public c G;
    public ValueAnimator H;
    public ViewPager I;
    public a.u.a.a J;
    public DataSetObserver K;
    public g L;
    public b M;
    public boolean N;
    public final a.h.l.e<h> O;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<f> f2759b;

    /* renamed from: c  reason: collision with root package name */
    public f f2760c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f2761d;

    /* renamed from: e  reason: collision with root package name */
    public final e f2762e;

    /* renamed from: f  reason: collision with root package name */
    public int f2763f;

    /* renamed from: g  reason: collision with root package name */
    public int f2764g;
    public int h;
    public int i;
    public int j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public PorterDuff.Mode o;
    public float p;
    public float q;
    public final int r;
    public int s;
    public final int t;
    public final int u;
    public final int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public interface c<T extends f> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public TabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, b.d.a.a.b.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2759b = new ArrayList<>();
        this.f2761d = new RectF();
        this.s = Integer.MAX_VALUE;
        this.F = new ArrayList<>();
        this.O = new a.h.l.f(12);
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.f2762e = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a2 = b.d.a.a.r.f.h(context, attrs, j.TabLayout, defStyleAttr, b.d.a.a.i.Widget_Design_TabLayout, j.TabLayout_tabTextAppearance);
        this.f2762e.g(a2.getDimensionPixelSize(j.TabLayout_tabIndicatorHeight, -1));
        this.f2762e.f(a2.getColor(j.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(b.d.a.a.t.a.b(context, a2, j.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(a2.getInt(j.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(a2.getBoolean(j.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = a2.getDimensionPixelSize(j.TabLayout_tabPadding, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.f2764g = dimensionPixelSize;
        this.f2763f = dimensionPixelSize;
        this.f2763f = a2.getDimensionPixelSize(j.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f2764g = a2.getDimensionPixelSize(j.TabLayout_tabPaddingTop, this.f2764g);
        this.h = a2.getDimensionPixelSize(j.TabLayout_tabPaddingEnd, this.h);
        this.i = a2.getDimensionPixelSize(j.TabLayout_tabPaddingBottom, this.i);
        int resourceId = a2.getResourceId(j.TabLayout_tabTextAppearance, b.d.a.a.i.TextAppearance_Design_Tab);
        this.j = resourceId;
        TypedArray ta = context.obtainStyledAttributes(resourceId, a.b.j.TextAppearance);
        try {
            this.p = (float) ta.getDimensionPixelSize(a.b.j.TextAppearance_android_textSize, 0);
            this.k = b.d.a.a.t.a.a(context, ta, a.b.j.TextAppearance_android_textColor);
            ta.recycle();
            if (a2.hasValue(j.TabLayout_tabTextColor)) {
                this.k = b.d.a.a.t.a.a(context, a2, j.TabLayout_tabTextColor);
            }
            if (a2.hasValue(j.TabLayout_tabSelectedTextColor)) {
                this.k = m(this.k.getDefaultColor(), a2.getColor(j.TabLayout_tabSelectedTextColor, 0));
            }
            this.l = b.d.a.a.t.a.a(context, a2, j.TabLayout_tabIconTint);
            this.o = b.d.a.a.r.g.a(a2.getInt(j.TabLayout_tabIconTintMode, -1), null);
            this.m = b.d.a.a.t.a.a(context, a2, j.TabLayout_tabRippleColor);
            this.y = a2.getInt(j.TabLayout_tabIndicatorAnimationDuration, SQLiteDatabase.LOCK_ACQUIRED_WARNING_TIME_IN_MS);
            this.t = a2.getDimensionPixelSize(j.TabLayout_tabMinWidth, -1);
            this.u = a2.getDimensionPixelSize(j.TabLayout_tabMaxWidth, -1);
            this.r = a2.getResourceId(j.TabLayout_tabBackground, 0);
            this.w = a2.getDimensionPixelSize(j.TabLayout_tabContentStart, 0);
            this.A = a2.getInt(j.TabLayout_tabMode, 1);
            this.x = a2.getInt(j.TabLayout_tabGravity, 0);
            this.B = a2.getBoolean(j.TabLayout_tabInlineLabel, false);
            this.D = a2.getBoolean(j.TabLayout_tabUnboundedRipple, false);
            a2.recycle();
            Resources res = getResources();
            this.q = (float) res.getDimensionPixelSize(b.d.a.a.d.design_tab_text_size_2line);
            this.v = res.getDimensionPixelSize(b.d.a.a.d.design_tab_scrollable_min_width);
            j();
        } catch (Throwable th) {
            ta.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(int color) {
        this.f2762e.f(color);
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int height) {
        this.f2762e.g(height);
    }

    public void F(int position, float positionOffset, boolean updateSelectedText) {
        G(position, positionOffset, updateSelectedText, true);
    }

    public void G(int position, float positionOffset, boolean updateSelectedText, boolean updateIndicatorPosition) {
        int roundedPosition = Math.round(((float) position) + positionOffset);
        if (roundedPosition >= 0 && roundedPosition < this.f2762e.getChildCount()) {
            if (updateIndicatorPosition) {
                this.f2762e.e(position, positionOffset);
            }
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.H.cancel();
            }
            scrollTo(k(position, positionOffset), 0);
            if (updateSelectedText) {
                setSelectedTabView(roundedPosition);
            }
        }
    }

    public void c(f tab) {
        e(tab, this.f2759b.isEmpty());
    }

    public void e(f tab, boolean setSelected) {
        d(tab, this.f2759b.size(), setSelected);
    }

    public void d(f tab, int position, boolean setSelected) {
        if (tab.f2787f == this) {
            l(tab, position);
            g(tab);
            if (setSelected) {
                tab.i();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void f(b.d.a.a.y.a item) {
        f tab = w();
        CharSequence charSequence = item.f2666b;
        if (charSequence != null) {
            tab.o(charSequence);
        }
        Drawable drawable = item.f2667c;
        if (drawable != null) {
            tab.m(drawable);
        }
        int i2 = item.f2668d;
        if (i2 != 0) {
            tab.k(i2);
        }
        if (!TextUtils.isEmpty(item.getContentDescription())) {
            tab.j(item.getContentDescription());
        }
        c(tab);
    }

    @Deprecated
    public void setOnTabSelectedListener(c listener) {
        c cVar = this.E;
        if (cVar != null) {
            A(cVar);
        }
        this.E = listener;
        if (listener != null) {
            b(listener);
        }
    }

    public void b(c listener) {
        if (!this.F.contains(listener)) {
            this.F.add(listener);
        }
    }

    public void A(c listener) {
        this.F.remove(listener);
    }

    public f w() {
        f tab = o();
        tab.f2787f = this;
        tab.f2788g = p(tab);
        return tab;
    }

    public f o() {
        f tab = P.b();
        if (tab == null) {
            return new f();
        }
        return tab;
    }

    public boolean y(f tab) {
        return P.a(tab);
    }

    public int getTabCount() {
        return this.f2759b.size();
    }

    public f v(int index) {
        if (index < 0 || index >= getTabCount()) {
            return null;
        }
        return this.f2759b.get(index);
    }

    public int getSelectedTabPosition() {
        f fVar = this.f2760c;
        if (fVar != null) {
            return fVar.e();
        }
        return -1;
    }

    public void z() {
        for (int i2 = this.f2762e.getChildCount() - 1; i2 >= 0; i2--) {
            B(i2);
        }
        Iterator<Tab> i3 = this.f2759b.iterator();
        while (i3.hasNext()) {
            f tab = (f) i3.next();
            i3.remove();
            tab.h();
            y(tab);
        }
        this.f2760c = null;
    }

    public void setTabMode(int mode) {
        if (mode != this.A) {
            this.A = mode;
            j();
        }
    }

    public int getTabMode() {
        return this.A;
    }

    public void setTabGravity(int gravity) {
        if (this.x != gravity) {
            this.x = gravity;
            j();
        }
    }

    public int getTabGravity() {
        return this.x;
    }

    public void setSelectedTabIndicatorGravity(int indicatorGravity) {
        if (this.z != indicatorGravity) {
            this.z = indicatorGravity;
            s.T(this.f2762e);
        }
    }

    public int getTabIndicatorGravity() {
        return this.z;
    }

    public void setTabIndicatorFullWidth(boolean tabIndicatorFullWidth) {
        this.C = tabIndicatorFullWidth;
        s.T(this.f2762e);
    }

    public void setInlineLabel(boolean inline) {
        if (this.B != inline) {
            this.B = inline;
            for (int i2 = 0; i2 < this.f2762e.getChildCount(); i2++) {
                View child = this.f2762e.getChildAt(i2);
                if (child instanceof h) {
                    ((h) child).k();
                }
            }
            j();
        }
    }

    public void setInlineLabelResource(int inlineResourceId) {
        setInlineLabel(getResources().getBoolean(inlineResourceId));
    }

    public void setUnboundedRipple(boolean unboundedRipple) {
        if (this.D != unboundedRipple) {
            this.D = unboundedRipple;
            for (int i2 = 0; i2 < this.f2762e.getChildCount(); i2++) {
                View child = this.f2762e.getChildAt(i2);
                if (child instanceof h) {
                    ((h) child).j(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int unboundedRippleResourceId) {
        setUnboundedRipple(getResources().getBoolean(unboundedRippleResourceId));
    }

    public void setTabTextColors(ColorStateList textColor) {
        if (this.k != textColor) {
            this.k = textColor;
            J();
        }
    }

    public ColorStateList getTabTextColors() {
        return this.k;
    }

    public void setTabIconTint(ColorStateList iconTint) {
        if (this.l != iconTint) {
            this.l = iconTint;
            J();
        }
    }

    public void setTabIconTintResource(int iconTintResourceId) {
        setTabIconTint(a.b.l.a.a.c(getContext(), iconTintResourceId));
    }

    public ColorStateList getTabIconTint() {
        return this.l;
    }

    public ColorStateList getTabRippleColor() {
        return this.m;
    }

    public void setTabRippleColor(ColorStateList color) {
        if (this.m != color) {
            this.m = color;
            for (int i2 = 0; i2 < this.f2762e.getChildCount(); i2++) {
                View child = this.f2762e.getChildAt(i2);
                if (child instanceof h) {
                    ((h) child).j(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int tabRippleColorResourceId) {
        setTabRippleColor(a.b.l.a.a.c(getContext(), tabRippleColorResourceId));
    }

    public Drawable getTabSelectedIndicator() {
        return this.n;
    }

    public void setSelectedTabIndicator(Drawable tabSelectedIndicator) {
        if (this.n != tabSelectedIndicator) {
            this.n = tabSelectedIndicator;
            s.T(this.f2762e);
        }
    }

    public void setSelectedTabIndicator(int tabSelectedIndicatorResourceId) {
        if (tabSelectedIndicatorResourceId != 0) {
            setSelectedTabIndicator(a.b.l.a.a.d(getContext(), tabSelectedIndicatorResourceId));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        H(viewPager, true);
    }

    public void H(ViewPager viewPager, boolean autoRefresh) {
        I(viewPager, autoRefresh, false);
    }

    public final void I(ViewPager viewPager, boolean autoRefresh, boolean implicitSetup) {
        ViewPager viewPager2 = this.I;
        if (viewPager2 != null) {
            g gVar = this.L;
            if (gVar != null) {
                viewPager2.M(gVar);
            }
            b bVar = this.M;
            if (bVar != null) {
                this.I.L(bVar);
            }
        }
        c cVar = this.G;
        if (cVar != null) {
            A(cVar);
            this.G = null;
        }
        if (viewPager != null) {
            this.I = viewPager;
            if (this.L == null) {
                this.L = new g(this);
            }
            this.L.d();
            viewPager.g(this.L);
            i iVar = new i(viewPager);
            this.G = iVar;
            b(iVar);
            a.u.a.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                E(adapter, autoRefresh);
            }
            if (this.M == null) {
                this.M = new b();
            }
            this.M.b(autoRefresh);
            viewPager.f(this.M);
            F(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.I = null;
            E(null, false);
        }
        this.N = implicitSetup;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(a.u.a.a adapter) {
        E(adapter, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I == null) {
            ViewParent vp = getParent();
            if (vp instanceof ViewPager) {
                I((ViewPager) vp, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.N) {
            setupWithViewPager(null);
            this.N = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f2762e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public void E(a.u.a.a adapter, boolean addObserver) {
        DataSetObserver dataSetObserver;
        a.u.a.a aVar = this.J;
        if (!(aVar == null || (dataSetObserver = this.K) == null)) {
            aVar.unregisterDataSetObserver(dataSetObserver);
        }
        this.J = adapter;
        if (addObserver && adapter != null) {
            if (this.K == null) {
                this.K = new d();
            }
            adapter.registerDataSetObserver(this.K);
        }
        x();
    }

    public void x() {
        int curItem;
        z();
        a.u.a.a aVar = this.J;
        if (aVar != null) {
            int adapterCount = aVar.getCount();
            for (int i2 = 0; i2 < adapterCount; i2++) {
                f w2 = w();
                w2.o(this.J.getPageTitle(i2));
                e(w2, false);
            }
            ViewPager viewPager = this.I;
            if (viewPager != null && adapterCount > 0 && (curItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && curItem < getTabCount()) {
                C(v(curItem));
            }
        }
    }

    public final void J() {
        int z2 = this.f2759b.size();
        for (int i2 = 0; i2 < z2; i2++) {
            this.f2759b.get(i2).p();
        }
    }

    public final h p(f tab) {
        a.h.l.e<h> eVar = this.O;
        h tabView = eVar != null ? eVar.b() : null;
        if (tabView == null) {
            tabView = new h(getContext());
        }
        tabView.h(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f2784c)) {
            tabView.setContentDescription(tab.f2783b);
        } else {
            tabView.setContentDescription(tab.f2784c);
        }
        return tabView;
    }

    public final void l(f tab, int position) {
        tab.n(position);
        this.f2759b.add(position, tab);
        int count = this.f2759b.size();
        for (int i2 = position + 1; i2 < count; i2++) {
            this.f2759b.get(i2).n(i2);
        }
    }

    public final void g(f tab) {
        this.f2762e.addView(tab.f2788g, tab.e(), n());
    }

    public void addView(View child) {
        h(child);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View child, int index) {
        h(child);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View child, ViewGroup.LayoutParams params) {
        h(child);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        h(child);
    }

    public final void h(View child) {
        if (child instanceof b.d.a.a.y.a) {
            f((b.d.a.a.y.a) child);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final LinearLayout.LayoutParams n() {
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -1);
        K(lp);
        return lp;
    }

    public final void K(LinearLayout.LayoutParams lp) {
        if (this.A == 1 && this.x == 0) {
            lp.width = 0;
            lp.weight = 1.0f;
            return;
        }
        lp.width = -2;
        lp.weight = 0.0f;
    }

    public int t(int dps) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) dps));
    }

    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.f2762e.getChildCount(); i2++) {
            View tabView = this.f2762e.getChildAt(i2);
            if (tabView instanceof h) {
                ((h) tabView).e(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int idealHeight = t(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(idealHeight, View.MeasureSpec.getSize(heightMeasureSpec)), 1073741824);
        } else if (mode == 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(idealHeight, 1073741824);
        }
        int specWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        if (View.MeasureSpec.getMode(widthMeasureSpec) != 0) {
            int i2 = this.u;
            if (i2 <= 0) {
                i2 = specWidth - t(56);
            }
            this.s = i2;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        boolean z2 = true;
        if (getChildCount() == 1) {
            View child = getChildAt(0);
            boolean remeasure = false;
            int i3 = this.A;
            if (i3 == 0) {
                if (child.getMeasuredWidth() >= getMeasuredWidth()) {
                    z2 = false;
                }
                remeasure = z2;
            } else if (i3 == 1) {
                if (child.getMeasuredWidth() == getMeasuredWidth()) {
                    z2 = false;
                }
                remeasure = z2;
            }
            if (remeasure) {
                child.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(heightMeasureSpec, getPaddingTop() + getPaddingBottom(), child.getLayoutParams().height));
            }
        }
    }

    public final void B(int position) {
        h view = (h) this.f2762e.getChildAt(position);
        this.f2762e.removeViewAt(position);
        if (view != null) {
            view.g();
            this.O.a(view);
        }
        requestLayout();
    }

    public final void i(int newPosition) {
        if (newPosition != -1) {
            if (getWindowToken() == null || !s.K(this) || this.f2762e.c()) {
                F(newPosition, 0.0f, true);
                return;
            }
            int startScrollX = getScrollX();
            int targetScrollX = k(newPosition, 0.0f);
            if (startScrollX != targetScrollX) {
                u();
                this.H.setIntValues(startScrollX, targetScrollX);
                this.H.start();
            }
            this.f2762e.a(newPosition, this.y);
        }
    }

    public final void u() {
        if (this.H == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.H = valueAnimator;
            valueAnimator.setInterpolator(b.d.a.a.k.a.f2536a);
            this.H.setDuration((long) this.y);
            this.H.addUpdateListener(new a());
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            TabLayout.this.scrollTo(((Integer) animator.getAnimatedValue()).intValue(), 0);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener listener) {
        u();
        this.H.addListener(listener);
    }

    private void setSelectedTabView(int position) {
        int tabCount = this.f2762e.getChildCount();
        if (position < tabCount) {
            int i2 = 0;
            while (i2 < tabCount) {
                View child = this.f2762e.getChildAt(i2);
                boolean z2 = false;
                child.setSelected(i2 == position);
                if (i2 == position) {
                    z2 = true;
                }
                child.setActivated(z2);
                i2++;
            }
        }
    }

    public void C(f tab) {
        D(tab, true);
    }

    public void D(f tab, boolean updateIndicator) {
        f currentTab = this.f2760c;
        if (currentTab != tab) {
            int newPosition = tab != null ? tab.e() : -1;
            if (updateIndicator) {
                if ((currentTab == null || currentTab.e() == -1) && newPosition != -1) {
                    F(newPosition, 0.0f, true);
                } else {
                    i(newPosition);
                }
                if (newPosition != -1) {
                    setSelectedTabView(newPosition);
                }
            }
            this.f2760c = tab;
            if (currentTab != null) {
                s(currentTab);
            }
            if (tab != null) {
                r(tab);
            }
        } else if (currentTab != null) {
            q(tab);
            i(tab.e());
        }
    }

    public final void r(f tab) {
        for (int i2 = this.F.size() - 1; i2 >= 0; i2--) {
            this.F.get(i2).b(tab);
        }
    }

    public final void s(f tab) {
        for (int i2 = this.F.size() - 1; i2 >= 0; i2--) {
            this.F.get(i2).a(tab);
        }
    }

    public final void q(f tab) {
        for (int i2 = this.F.size() - 1; i2 >= 0; i2--) {
            this.F.get(i2).c(tab);
        }
    }

    public final int k(int position, float positionOffset) {
        int nextWidth = 0;
        if (this.A != 0) {
            return 0;
        }
        View selectedChild = this.f2762e.getChildAt(position);
        View nextChild = position + 1 < this.f2762e.getChildCount() ? this.f2762e.getChildAt(position + 1) : null;
        int selectedWidth = selectedChild != null ? selectedChild.getWidth() : 0;
        if (nextChild != null) {
            nextWidth = nextChild.getWidth();
        }
        int scrollBase = (selectedChild.getLeft() + (selectedWidth / 2)) - (getWidth() / 2);
        int scrollOffset = (int) (((float) (selectedWidth + nextWidth)) * 0.5f * positionOffset);
        return s.v(this) == 0 ? scrollBase + scrollOffset : scrollBase - scrollOffset;
    }

    public final void j() {
        int paddingStart = 0;
        if (this.A == 0) {
            paddingStart = Math.max(0, this.w - this.f2763f);
        }
        s.k0(this.f2762e, paddingStart, 0, 0, 0);
        int i2 = this.A;
        if (i2 == 0) {
            this.f2762e.setGravity(8388611);
        } else if (i2 == 1) {
            this.f2762e.setGravity(1);
        }
        L(true);
    }

    public void L(boolean requestLayout) {
        for (int i2 = 0; i2 < this.f2762e.getChildCount(); i2++) {
            View child = this.f2762e.getChildAt(i2);
            child.setMinimumWidth(getTabMinWidth());
            K((LinearLayout.LayoutParams) child.getLayoutParams());
            if (requestLayout) {
                child.requestLayout();
            }
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f2782a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f2783b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f2784c;

        /* renamed from: d  reason: collision with root package name */
        public int f2785d = -1;

        /* renamed from: e  reason: collision with root package name */
        public View f2786e;

        /* renamed from: f  reason: collision with root package name */
        public TabLayout f2787f;

        /* renamed from: g  reason: collision with root package name */
        public h f2788g;

        public View c() {
            return this.f2786e;
        }

        public f l(View view) {
            this.f2786e = view;
            p();
            return this;
        }

        public f k(int resId) {
            l(LayoutInflater.from(this.f2788g.getContext()).inflate(resId, (ViewGroup) this.f2788g, false));
            return this;
        }

        public Drawable d() {
            return this.f2782a;
        }

        public int e() {
            return this.f2785d;
        }

        public void n(int position) {
            this.f2785d = position;
        }

        public CharSequence f() {
            return this.f2783b;
        }

        public f m(Drawable icon) {
            this.f2782a = icon;
            p();
            return this;
        }

        public f o(CharSequence text) {
            if (TextUtils.isEmpty(this.f2784c) && !TextUtils.isEmpty(text)) {
                this.f2788g.setContentDescription(text);
            }
            this.f2783b = text;
            p();
            return this;
        }

        public void i() {
            TabLayout tabLayout = this.f2787f;
            if (tabLayout != null) {
                tabLayout.C(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public boolean g() {
            TabLayout tabLayout = this.f2787f;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f2785d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public f j(CharSequence contentDesc) {
            this.f2784c = contentDesc;
            p();
            return this;
        }

        public void p() {
            h hVar = this.f2788g;
            if (hVar != null) {
                hVar.i();
            }
        }

        public void h() {
            this.f2787f = null;
            this.f2788g = null;
            this.f2782a = null;
            this.f2783b = null;
            this.f2784c = null;
            this.f2785d = -1;
            this.f2786e = null;
        }
    }

    public class h extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        public f f2792b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f2793c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f2794d;

        /* renamed from: e  reason: collision with root package name */
        public View f2795e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f2796f;

        /* renamed from: g  reason: collision with root package name */
        public ImageView f2797g;
        public Drawable h;
        public int i = 2;

        public h(Context context) {
            super(context);
            j(context);
            s.k0(this, TabLayout.this.f2763f, TabLayout.this.f2764g, TabLayout.this.h, TabLayout.this.i);
            setGravity(17);
            setOrientation(!TabLayout.this.B ? 1 : 0);
            setClickable(true);
            s.l0(this, r.b(getContext(), 1002));
        }

        public final void j(Context context) {
            Drawable background;
            int i2 = TabLayout.this.r;
            GradientDrawable gradientDrawable = null;
            if (i2 != 0) {
                Drawable d2 = a.b.l.a.a.d(context, i2);
                this.h = d2;
                if (d2 != null && d2.isStateful()) {
                    this.h.setState(getDrawableState());
                }
            } else {
                this.h = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.m != null) {
                GradientDrawable maskDrawable = new GradientDrawable();
                maskDrawable.setCornerRadius(1.0E-5f);
                maskDrawable.setColor(-1);
                ColorStateList rippleColor = b.d.a.a.u.a.a(TabLayout.this.m);
                GradientDrawable gradientDrawable3 = TabLayout.this.D ? null : gradientDrawable2;
                if (!TabLayout.this.D) {
                    gradientDrawable = maskDrawable;
                }
                background = new RippleDrawable(rippleColor, gradientDrawable3, gradientDrawable);
            } else {
                background = gradientDrawable2;
            }
            s.a0(this, background);
            TabLayout.this.invalidate();
        }

        public final void e(Canvas canvas) {
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.h.draw(canvas);
            }
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            boolean changed = false;
            int[] state = getDrawableState();
            Drawable drawable = this.h;
            if (drawable != null && drawable.isStateful()) {
                changed = false | this.h.setState(state);
            }
            if (changed) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public boolean performClick() {
            boolean handled = super.performClick();
            if (this.f2792b == null) {
                return handled;
            }
            if (!handled) {
                playSoundEffect(0);
            }
            this.f2792b.i();
            return true;
        }

        public void setSelected(boolean selected) {
            boolean changed = isSelected() != selected;
            super.setSelected(selected);
            if (!changed || selected) {
            }
            TextView textView = this.f2793c;
            if (textView != null) {
                textView.setSelected(selected);
            }
            ImageView imageView = this.f2794d;
            if (imageView != null) {
                imageView.setSelected(selected);
            }
            View view = this.f2795e;
            if (view != null) {
                view.setSelected(selected);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(event);
            event.setClassName(a.c.class.getName());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            super.onInitializeAccessibilityNodeInfo(info);
            info.setClassName(a.c.class.getName());
        }

        public void onMeasure(int origWidthMeasureSpec, int origHeightMeasureSpec) {
            int widthMeasureSpec;
            Layout layout;
            int specWidthSize = View.MeasureSpec.getSize(origWidthMeasureSpec);
            int specWidthMode = View.MeasureSpec.getMode(origWidthMeasureSpec);
            int maxWidth = TabLayout.this.getTabMaxWidth();
            if (maxWidth <= 0 || (specWidthMode != 0 && specWidthSize <= maxWidth)) {
                widthMeasureSpec = origWidthMeasureSpec;
            } else {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(TabLayout.this.s, Integer.MIN_VALUE);
            }
            super.onMeasure(widthMeasureSpec, origHeightMeasureSpec);
            if (this.f2793c != null) {
                float textSize = TabLayout.this.p;
                int maxLines = this.i;
                ImageView imageView = this.f2794d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f2793c;
                    if (textView != null && textView.getLineCount() > 1) {
                        textSize = TabLayout.this.q;
                    }
                } else {
                    maxLines = 1;
                }
                float curTextSize = this.f2793c.getTextSize();
                int curLineCount = this.f2793c.getLineCount();
                int curMaxLines = a.h.n.i.c(this.f2793c);
                if (textSize != curTextSize || (curMaxLines >= 0 && maxLines != curMaxLines)) {
                    boolean updateTextView = true;
                    if (TabLayout.this.A == 1 && textSize > curTextSize && curLineCount == 1 && ((layout = this.f2793c.getLayout()) == null || d(layout, 0, textSize) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        updateTextView = false;
                    }
                    if (updateTextView) {
                        this.f2793c.setTextSize(0, textSize);
                        this.f2793c.setMaxLines(maxLines);
                        super.onMeasure(widthMeasureSpec, origHeightMeasureSpec);
                    }
                }
            }
        }

        public void h(f tab) {
            if (tab != this.f2792b) {
                this.f2792b = tab;
                i();
            }
        }

        public void g() {
            h(null);
            setSelected(false);
        }

        public final void i() {
            f tab = this.f2792b;
            Drawable icon = null;
            View custom = tab != null ? tab.c() : null;
            if (custom != null) {
                ViewParent customParent = custom.getParent();
                if (customParent != this) {
                    if (customParent != null) {
                        ((ViewGroup) customParent).removeView(custom);
                    }
                    addView(custom);
                }
                this.f2795e = custom;
                TextView textView = this.f2793c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2794d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2794d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) custom.findViewById(16908308);
                this.f2796f = textView2;
                if (textView2 != null) {
                    this.i = a.h.n.i.c(textView2);
                }
                this.f2797g = (ImageView) custom.findViewById(16908294);
            } else {
                View view = this.f2795e;
                if (view != null) {
                    removeView(view);
                    this.f2795e = null;
                }
                this.f2796f = null;
                this.f2797g = null;
            }
            boolean z = false;
            if (this.f2795e == null) {
                if (this.f2794d == null) {
                    ImageView iconView = (ImageView) LayoutInflater.from(getContext()).inflate(b.d.a.a.h.design_layout_tab_icon, (ViewGroup) this, false);
                    addView(iconView, 0);
                    this.f2794d = iconView;
                }
                if (!(tab == null || tab.d() == null)) {
                    icon = a.h.f.l.a.q(tab.d()).mutate();
                }
                if (icon != null) {
                    a.h.f.l.a.o(icon, TabLayout.this.l);
                    PorterDuff.Mode mode = TabLayout.this.o;
                    if (mode != null) {
                        a.h.f.l.a.p(icon, mode);
                    }
                }
                if (this.f2793c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(b.d.a.a.h.design_layout_tab_text, (ViewGroup) this, false);
                    addView(textView3);
                    this.f2793c = textView3;
                    this.i = a.h.n.i.c(textView3);
                }
                a.h.n.i.n(this.f2793c, TabLayout.this.j);
                ColorStateList colorStateList = TabLayout.this.k;
                if (colorStateList != null) {
                    this.f2793c.setTextColor(colorStateList);
                }
                l(this.f2793c, this.f2794d);
            } else if (!(this.f2796f == null && this.f2797g == null)) {
                l(this.f2796f, this.f2797g);
            }
            if (tab != null && !TextUtils.isEmpty(tab.f2784c)) {
                setContentDescription(tab.f2784c);
            }
            if (tab != null && tab.g()) {
                z = true;
            }
            setSelected(z);
        }

        public final void k() {
            setOrientation(!TabLayout.this.B ? 1 : 0);
            if (this.f2796f == null && this.f2797g == null) {
                l(this.f2793c, this.f2794d);
            } else {
                l(this.f2796f, this.f2797g);
            }
        }

        public final void l(TextView textView, ImageView iconView) {
            f fVar = this.f2792b;
            CharSequence charSequence = null;
            Drawable icon = (fVar == null || fVar.d() == null) ? null : a.h.f.l.a.q(this.f2792b.d()).mutate();
            f fVar2 = this.f2792b;
            CharSequence text = fVar2 != null ? fVar2.f() : null;
            if (iconView != null) {
                if (icon != null) {
                    iconView.setImageDrawable(icon);
                    iconView.setVisibility(0);
                    setVisibility(0);
                } else {
                    iconView.setVisibility(8);
                    iconView.setImageDrawable(null);
                }
            }
            boolean hasText = !TextUtils.isEmpty(text);
            if (textView != null) {
                if (hasText) {
                    textView.setText(text);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (iconView != null) {
                ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) iconView.getLayoutParams();
                int iconMargin = 0;
                if (hasText && iconView.getVisibility() == 0) {
                    iconMargin = TabLayout.this.t(8);
                }
                if (TabLayout.this.B) {
                    if (iconMargin != a.h.m.g.a(lp)) {
                        a.h.m.g.c(lp, iconMargin);
                        lp.bottomMargin = 0;
                        iconView.setLayoutParams(lp);
                        iconView.requestLayout();
                    }
                } else if (iconMargin != lp.bottomMargin) {
                    lp.bottomMargin = iconMargin;
                    a.h.m.g.c(lp, 0);
                    iconView.setLayoutParams(lp);
                    iconView.requestLayout();
                }
            }
            f fVar3 = this.f2792b;
            CharSequence contentDesc = fVar3 != null ? fVar3.f2784c : null;
            if (!hasText) {
                charSequence = contentDesc;
            }
            z0.a(this, charSequence);
        }

        public final int f() {
            boolean initialized = false;
            int left = 0;
            int right = 0;
            View[] viewArr = {this.f2793c, this.f2794d, this.f2795e};
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    int left2 = view.getLeft();
                    if (initialized) {
                        left2 = Math.min(left, left2);
                    }
                    left = left2;
                    int right2 = view.getRight();
                    if (initialized) {
                        right2 = Math.max(right, right2);
                    }
                    right = right2;
                    initialized = true;
                }
            }
            return right - left;
        }

        public final float d(Layout layout, int line, float textSize) {
            return layout.getLineWidth(line) * (textSize / layout.getPaint().getTextSize());
        }
    }

    public class e extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        public int f2769b;

        /* renamed from: c  reason: collision with root package name */
        public final Paint f2770c;

        /* renamed from: d  reason: collision with root package name */
        public final GradientDrawable f2771d;

        /* renamed from: e  reason: collision with root package name */
        public int f2772e = -1;

        /* renamed from: f  reason: collision with root package name */
        public float f2773f;

        /* renamed from: g  reason: collision with root package name */
        public int f2774g = -1;
        public int h = -1;
        public int i = -1;
        public ValueAnimator j;

        public e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f2770c = new Paint();
            this.f2771d = new GradientDrawable();
        }

        public void f(int color) {
            if (this.f2770c.getColor() != color) {
                this.f2770c.setColor(color);
                s.T(this);
            }
        }

        public void g(int height) {
            if (this.f2769b != height) {
                this.f2769b = height;
                s.T(this);
            }
        }

        public boolean c() {
            int z = getChildCount();
            for (int i2 = 0; i2 < z; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void e(int position, float positionOffset) {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.j.cancel();
            }
            this.f2772e = position;
            this.f2773f = positionOffset;
            h();
        }

        public void onRtlPropertiesChanged(int layoutDirection) {
            super.onRtlPropertiesChanged(layoutDirection);
            if (Build.VERSION.SDK_INT < 23 && this.f2774g != layoutDirection) {
                requestLayout();
                this.f2774g = layoutDirection;
            }
        }

        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                if (tabLayout.A == 1 && tabLayout.x == 1) {
                    int count = getChildCount();
                    int largestTabWidth = 0;
                    for (int i2 = 0; i2 < count; i2++) {
                        View child = getChildAt(i2);
                        if (child.getVisibility() == 0) {
                            largestTabWidth = Math.max(largestTabWidth, child.getMeasuredWidth());
                        }
                    }
                    if (largestTabWidth > 0) {
                        boolean remeasure = false;
                        if (largestTabWidth * count <= getMeasuredWidth() - (TabLayout.this.t(16) * 2)) {
                            for (int i3 = 0; i3 < count; i3++) {
                                LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                                if (lp.width != largestTabWidth || lp.weight != 0.0f) {
                                    lp.width = largestTabWidth;
                                    lp.weight = 0.0f;
                                    remeasure = true;
                                }
                            }
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.x = 0;
                            tabLayout2.L(false);
                            remeasure = true;
                        }
                        if (remeasure) {
                            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                        }
                    }
                }
            }
        }

        public void onLayout(boolean changed, int l, int t, int r, int b2) {
            super.onLayout(changed, l, t, r, b2);
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                h();
                return;
            }
            this.j.cancel();
            a(this.f2772e, Math.round((1.0f - this.j.getAnimatedFraction()) * ((float) this.j.getDuration())));
        }

        public final void h() {
            int right;
            int left;
            View selectedTitle = getChildAt(this.f2772e);
            if (selectedTitle == null || selectedTitle.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = selectedTitle.getLeft();
                right = selectedTitle.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.C && (selectedTitle instanceof h)) {
                    b((h) selectedTitle, tabLayout.f2761d);
                    left = (int) TabLayout.this.f2761d.left;
                    right = (int) TabLayout.this.f2761d.right;
                }
                if (this.f2773f > 0.0f && this.f2772e < getChildCount() - 1) {
                    View nextTitle = getChildAt(this.f2772e + 1);
                    int nextTitleLeft = nextTitle.getLeft();
                    int nextTitleRight = nextTitle.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.C && (nextTitle instanceof h)) {
                        b((h) nextTitle, tabLayout2.f2761d);
                        nextTitleLeft = (int) TabLayout.this.f2761d.left;
                        nextTitleRight = (int) TabLayout.this.f2761d.right;
                    }
                    float f2 = this.f2773f;
                    left = (int) ((((float) nextTitleLeft) * f2) + ((1.0f - f2) * ((float) left)));
                    right = (int) ((((float) nextTitleRight) * f2) + ((1.0f - f2) * ((float) right)));
                }
            }
            d(left, right);
        }

        public void d(int left, int right) {
            if (left != this.h || right != this.i) {
                this.h = left;
                this.i = right;
                s.T(this);
            }
        }

        public void a(int position, int duration) {
            int targetRight;
            int targetLeft;
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.j.cancel();
            }
            View targetView = getChildAt(position);
            if (targetView == null) {
                h();
                return;
            }
            int targetLeft2 = targetView.getLeft();
            int targetRight2 = targetView.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.C || !(targetView instanceof h)) {
                targetLeft = targetLeft2;
                targetRight = targetRight2;
            } else {
                b((h) targetView, tabLayout.f2761d);
                targetLeft = (int) TabLayout.this.f2761d.left;
                targetRight = (int) TabLayout.this.f2761d.right;
            }
            int startLeft = this.h;
            int startRight = this.i;
            if (startLeft != targetLeft || startRight != targetRight) {
                ValueAnimator animator = new ValueAnimator();
                this.j = animator;
                animator.setInterpolator(b.d.a.a.k.a.f2536a);
                animator.setDuration((long) duration);
                animator.setFloatValues(0.0f, 1.0f);
                animator.addUpdateListener(new a(startLeft, targetLeft, startRight, targetRight));
                animator.addListener(new b(position));
                animator.start();
            }
        }

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f2775a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f2776b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ int f2777c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f2778d;

            public a(int i, int i2, int i3, int i4) {
                this.f2775a = i;
                this.f2776b = i2;
                this.f2777c = i3;
                this.f2778d = i4;
            }

            public void onAnimationUpdate(ValueAnimator animator) {
                float fraction = animator.getAnimatedFraction();
                e.this.d(b.d.a.a.k.a.b(this.f2775a, this.f2776b, fraction), b.d.a.a.k.a.b(this.f2777c, this.f2778d, fraction));
            }
        }

        public class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f2780a;

            public b(int i) {
                this.f2780a = i;
            }

            public void onAnimationEnd(Animator animator) {
                e eVar = e.this;
                eVar.f2772e = this.f2780a;
                eVar.f2773f = 0.0f;
            }
        }

        public final void b(h tabView, RectF contentBounds) {
            int tabViewContentWidth = tabView.f();
            if (tabViewContentWidth < TabLayout.this.t(24)) {
                tabViewContentWidth = TabLayout.this.t(24);
            }
            int tabViewCenter = (tabView.getLeft() + tabView.getRight()) / 2;
            contentBounds.set((float) (tabViewCenter - (tabViewContentWidth / 2)), 0.0f, (float) ((tabViewContentWidth / 2) + tabViewCenter), 0.0f);
        }

        public void draw(Canvas canvas) {
            int indicatorHeight = 0;
            Drawable drawable = TabLayout.this.n;
            if (drawable != null) {
                indicatorHeight = drawable.getIntrinsicHeight();
            }
            if (this.f2769b >= 0) {
                indicatorHeight = this.f2769b;
            }
            int indicatorTop = 0;
            int indicatorBottom = 0;
            int i2 = TabLayout.this.z;
            if (i2 == 0) {
                indicatorTop = getHeight() - indicatorHeight;
                indicatorBottom = getHeight();
            } else if (i2 == 1) {
                indicatorTop = (getHeight() - indicatorHeight) / 2;
                indicatorBottom = (getHeight() + indicatorHeight) / 2;
            } else if (i2 == 2) {
                indicatorTop = 0;
                indicatorBottom = indicatorHeight;
            } else if (i2 == 3) {
                indicatorTop = 0;
                indicatorBottom = getHeight();
            }
            int i3 = this.h;
            if (i3 >= 0 && this.i > i3) {
                Drawable drawable2 = TabLayout.this.n;
                if (drawable2 == null) {
                    drawable2 = this.f2771d;
                }
                Drawable selectedIndicator = a.h.f.l.a.q(drawable2);
                selectedIndicator.setBounds(this.h, indicatorTop, this.i, indicatorBottom);
                Paint paint = this.f2770c;
                if (paint != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        selectedIndicator.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        a.h.f.l.a.n(selectedIndicator, paint.getColor());
                    }
                }
                selectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }
    }

    public static ColorStateList m(int defaultColor, int selectedColor) {
        int[][] states = new int[2][];
        int[] colors = new int[2];
        states[0] = HorizontalScrollView.SELECTED_STATE_SET;
        colors[0] = selectedColor;
        int i2 = 0 + 1;
        states[i2] = HorizontalScrollView.EMPTY_STATE_SET;
        colors[i2] = defaultColor;
        int i3 = i2 + 1;
        return new ColorStateList(states, colors);
    }

    private int getDefaultHeight() {
        boolean hasIconAndText = false;
        int i2 = 0;
        int count = this.f2759b.size();
        while (true) {
            if (i2 < count) {
                f tab = this.f2759b.get(i2);
                if (tab != null && tab.d() != null && !TextUtils.isEmpty(tab.f())) {
                    hasIconAndText = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!hasIconAndText || this.B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        if (this.A == 0) {
            return this.v;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return generateDefaultLayoutParams();
    }

    public int getTabMaxWidth() {
        return this.s;
    }

    public static class g implements ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f2789a;

        /* renamed from: b  reason: collision with root package name */
        public int f2790b;

        /* renamed from: c  reason: collision with root package name */
        public int f2791c;

        public g(TabLayout tabLayout) {
            this.f2789a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int state) {
            this.f2790b = this.f2791c;
            this.f2791c = state;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int position, float positionOffset, int positionOffsetPixels) {
            TabLayout tabLayout = this.f2789a.get();
            if (tabLayout != null) {
                boolean updateIndicator = false;
                boolean updateText = this.f2791c != 2 || this.f2790b == 1;
                if (!(this.f2791c == 2 && this.f2790b == 0)) {
                    updateIndicator = true;
                }
                tabLayout.G(position, positionOffset, updateText, updateIndicator);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int position) {
            TabLayout tabLayout = this.f2789a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != position && position < tabLayout.getTabCount()) {
                int i = this.f2791c;
                tabLayout.D(tabLayout.v(position), i == 0 || (i == 2 && this.f2790b == 0));
            }
        }

        public void d() {
            this.f2791c = 0;
            this.f2790b = 0;
        }
    }

    public static class i implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f2798a;

        public i(ViewPager viewPager) {
            this.f2798a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(f tab) {
            this.f2798a.setCurrentItem(tab.e());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(f tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(f tab) {
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        public void onChanged() {
            TabLayout.this.x();
        }

        public void onInvalidated() {
            TabLayout.this.x();
        }
    }

    public class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2766a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, a.u.a.a oldAdapter, a.u.a.a newAdapter) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.I == viewPager) {
                tabLayout.E(newAdapter, this.f2766a);
            }
        }

        public void b(boolean autoRefresh) {
            this.f2766a = autoRefresh;
        }
    }
}
