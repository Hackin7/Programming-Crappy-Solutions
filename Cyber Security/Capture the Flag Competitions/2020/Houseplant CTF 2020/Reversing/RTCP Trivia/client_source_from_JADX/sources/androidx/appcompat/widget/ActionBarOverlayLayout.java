package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements C0176bz, C0391gl {

    /* renamed from: f */
    static final int[] f350f = {C0117a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f351A;

    /* renamed from: B */
    private final C0393gn f352B;

    /* renamed from: a */
    ActionBarContainer f353a;

    /* renamed from: b */
    public boolean f354b;

    /* renamed from: c */
    boolean f355c;

    /* renamed from: d */
    ViewPropertyAnimator f356d;

    /* renamed from: e */
    final AnimatorListenerAdapter f357e;

    /* renamed from: g */
    private int f358g;

    /* renamed from: h */
    private int f359h;

    /* renamed from: i */
    private ContentFrameLayout f360i;

    /* renamed from: j */
    private C0180ca f361j;

    /* renamed from: k */
    private Drawable f362k;

    /* renamed from: l */
    private boolean f363l;

    /* renamed from: m */
    private boolean f364m;

    /* renamed from: n */
    private boolean f365n;

    /* renamed from: o */
    private int f366o;

    /* renamed from: p */
    private int f367p;

    /* renamed from: q */
    private final Rect f368q;

    /* renamed from: r */
    private final Rect f369r;

    /* renamed from: s */
    private final Rect f370s;

    /* renamed from: t */
    private final Rect f371t;

    /* renamed from: u */
    private final Rect f372u;

    /* renamed from: v */
    private final Rect f373v;

    /* renamed from: w */
    private final Rect f374w;

    /* renamed from: x */
    private C0051a f375x;

    /* renamed from: y */
    private OverScroller f376y;

    /* renamed from: z */
    private final Runnable f377z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public interface C0051a {
        /* renamed from: a */
        void mo466a(int i);

        /* renamed from: d */
        void mo467d(boolean z);

        /* renamed from: h */
        void mo468h();

        /* renamed from: i */
        void mo469i();

        /* renamed from: j */
        void mo470j();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public static class C0052b extends MarginLayoutParams {
        public C0052b() {
            super(-1, -1);
        }

        public C0052b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0052b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f359h = 0;
        this.f368q = new Rect();
        this.f369r = new Rect();
        this.f370s = new Rect();
        this.f371t = new Rect();
        this.f372u = new Rect();
        this.f373v = new Rect();
        this.f374w = new Rect();
        this.f357e = new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f356d = null;
                ActionBarOverlayLayout.this.f355c = false;
            }

            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f356d = null;
                ActionBarOverlayLayout.this.f355c = false;
            }
        };
        this.f377z = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.mo417a();
                ActionBarOverlayLayout.this.f356d = ActionBarOverlayLayout.this.f353a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f357e);
            }
        };
        this.f351A = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.mo417a();
                ActionBarOverlayLayout.this.f356d = ActionBarOverlayLayout.this.f353a.animate().translationY((float) (-ActionBarOverlayLayout.this.f353a.getHeight())).setListener(ActionBarOverlayLayout.this.f357e);
            }
        };
        m167a(context);
        this.f352B = new C0393gn(this);
    }

    /* renamed from: a */
    private void m167a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f350f);
        boolean z = false;
        this.f358g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f362k = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f362k == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f363l = z;
        this.f376y = new OverScroller(context);
    }

    /* renamed from: a */
    private static boolean m168a(View view, Rect rect, boolean z) {
        boolean z2;
        C0052b bVar = (C0052b) view.getLayoutParams();
        if (bVar.leftMargin != rect.left) {
            bVar.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z2 = true;
        }
        if (bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || bVar.bottomMargin == rect.bottom) {
            return z2;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: i */
    private void m169i() {
        C0180ca caVar;
        if (this.f360i == null) {
            this.f360i = (ContentFrameLayout) findViewById(C0122f.action_bar_activity_content);
            this.f353a = (ActionBarContainer) findViewById(C0122f.action_bar_container);
            View findViewById = findViewById(C0122f.action_bar);
            if (findViewById instanceof C0180ca) {
                caVar = (C0180ca) findViewById;
            } else if (findViewById instanceof Toolbar) {
                caVar = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
                sb.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(sb.toString());
            }
            this.f361j = caVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo417a() {
        removeCallbacks(this.f377z);
        removeCallbacks(this.f351A);
        if (this.f356d != null) {
            this.f356d.cancel();
        }
    }

    /* renamed from: a */
    public final void mo418a(int i) {
        m169i();
        if (i == 2) {
            this.f361j.mo1145f();
        } else if (i == 5) {
            this.f361j.mo1146g();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public final void mo419a(Menu menu, C0102a aVar) {
        m169i();
        this.f361j.mo1132a(menu, aVar);
    }

    /* renamed from: b */
    public final boolean mo420b() {
        m169i();
        return this.f361j.mo1147h();
    }

    /* renamed from: c */
    public final boolean mo421c() {
        m169i();
        return this.f361j.mo1148i();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0052b;
    }

    /* renamed from: d */
    public final boolean mo423d() {
        m169i();
        return this.f361j.mo1149j();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f362k != null && !this.f363l) {
            int bottom = this.f353a.getVisibility() == 0 ? (int) (((float) this.f353a.getBottom()) + this.f353a.getTranslationY() + 0.5f) : 0;
            this.f362k.setBounds(0, bottom, getWidth(), this.f362k.getIntrinsicHeight() + bottom);
            this.f362k.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean mo425e() {
        m169i();
        return this.f361j.mo1150k();
    }

    /* renamed from: f */
    public final boolean mo426f() {
        m169i();
        return this.f361j.mo1151l();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        m169i();
        C0396gq.m1269f(this);
        boolean a = m168a(this.f353a, rect, false);
        this.f371t.set(rect);
        C0225cx.m738a(this, this.f371t, this.f368q);
        if (!this.f372u.equals(this.f371t)) {
            this.f372u.set(this.f371t);
            a = true;
        }
        if (!this.f369r.equals(this.f368q)) {
            this.f369r.set(this.f368q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public final void mo428g() {
        m169i();
        this.f361j.mo1152m();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0052b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0052b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0052b(layoutParams);
    }

    public int getActionBarHideOffset() {
        if (this.f353a != null) {
            return -((int) this.f353a.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f352B.f1732a;
    }

    public CharSequence getTitle() {
        m169i();
        return this.f361j.mo1144e();
    }

    /* renamed from: h */
    public final void mo435h() {
        m169i();
        this.f361j.mo1153n();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m167a(getContext());
        C0396gq.m1270g(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo417a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0052b bVar = (C0052b) childAt.getLayoutParams();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        Rect rect;
        m169i();
        measureChildWithMargins(this.f353a, i, 0, i2, 0);
        C0052b bVar = (C0052b) this.f353a.getLayoutParams();
        int max = Math.max(0, this.f353a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f353a.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f353a.getMeasuredState());
        boolean z = (C0396gq.m1269f(this) & 256) != 0;
        if (z) {
            i3 = this.f358g;
            if (this.f364m && this.f353a.getTabContainer() != null) {
                i3 += this.f358g;
            }
        } else {
            i3 = this.f353a.getVisibility() != 8 ? this.f353a.getMeasuredHeight() : 0;
        }
        this.f370s.set(this.f368q);
        this.f373v.set(this.f371t);
        if (this.f354b || z) {
            this.f373v.top += i3;
            rect = this.f373v;
        } else {
            this.f370s.top += i3;
            rect = this.f370s;
        }
        rect.bottom += 0;
        m168a(this.f360i, this.f370s, true);
        if (!this.f374w.equals(this.f373v)) {
            this.f374w.set(this.f373v);
            this.f360i.mo528a(this.f373v);
        }
        measureChildWithMargins(this.f360i, i, 0, i2, 0);
        C0052b bVar2 = (C0052b) this.f360i.getLayoutParams();
        int max3 = Math.max(max, this.f360i.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f360i.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f360i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        boolean z2 = false;
        if (!this.f365n || !z) {
            return false;
        }
        this.f376y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f376y.getFinalY() > this.f353a.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo417a();
            runnable = this.f351A;
        } else {
            mo417a();
            runnable = this.f377z;
        }
        runnable.run();
        this.f355c = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f366o += i2;
        setActionBarHideOffset(this.f366o);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f352B.f1732a = i;
        this.f366o = getActionBarHideOffset();
        mo417a();
        if (this.f375x != null) {
            this.f375x.mo470j();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f353a.getVisibility() != 0) {
            return false;
        }
        return this.f365n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f365n && !this.f355c) {
            if (this.f366o <= this.f353a.getHeight()) {
                mo417a();
                postDelayed(this.f377z, 600);
                return;
            }
            mo417a();
            postDelayed(this.f351A, 600);
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m169i();
        int i2 = this.f367p ^ i;
        this.f367p = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        if (this.f375x != null) {
            this.f375x.mo467d(!z);
            if (z2 || !z) {
                this.f375x.mo468h();
            } else {
                this.f375x.mo469i();
            }
        }
        if ((i2 & 256) != 0 && this.f375x != null) {
            C0396gq.m1270g(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f359h = i;
        if (this.f375x != null) {
            this.f375x.mo466a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo417a();
        this.f353a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f353a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0051a aVar) {
        this.f375x = aVar;
        if (getWindowToken() != null) {
            this.f375x.mo466a(this.f359h);
            if (this.f367p != 0) {
                onWindowSystemUiVisibilityChanged(this.f367p);
                C0396gq.m1270g(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f364m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f365n) {
            this.f365n = z;
            if (!z) {
                mo417a();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m169i();
        this.f361j.mo1130a(i);
    }

    public void setIcon(Drawable drawable) {
        m169i();
        this.f361j.mo1131a(drawable);
    }

    public void setLogo(int i) {
        m169i();
        this.f361j.mo1139b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f354b = z;
        this.f363l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        m169i();
        this.f361j.mo1133a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m169i();
        this.f361j.mo1136a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
