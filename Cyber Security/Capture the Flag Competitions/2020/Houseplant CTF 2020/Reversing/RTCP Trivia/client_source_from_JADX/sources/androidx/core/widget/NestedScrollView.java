package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;

public class NestedScrollView extends FrameLayout implements C0389gj, C0392gm {

    /* renamed from: w */
    private static final C0091a f654w = new C0091a();

    /* renamed from: x */
    private static final int[] f655x = {16843130};

    /* renamed from: A */
    private float f656A;

    /* renamed from: B */
    private C0092b f657B;

    /* renamed from: a */
    private long f658a;

    /* renamed from: b */
    private final Rect f659b;

    /* renamed from: c */
    private OverScroller f660c;

    /* renamed from: d */
    private EdgeEffect f661d;

    /* renamed from: e */
    private EdgeEffect f662e;

    /* renamed from: f */
    private int f663f;

    /* renamed from: g */
    private boolean f664g;

    /* renamed from: h */
    private boolean f665h;

    /* renamed from: i */
    private View f666i;

    /* renamed from: j */
    private boolean f667j;

    /* renamed from: k */
    private VelocityTracker f668k;

    /* renamed from: l */
    private boolean f669l;

    /* renamed from: m */
    private boolean f670m;

    /* renamed from: n */
    private int f671n;

    /* renamed from: o */
    private int f672o;

    /* renamed from: p */
    private int f673p;

    /* renamed from: q */
    private int f674q;

    /* renamed from: r */
    private final int[] f675r;

    /* renamed from: s */
    private final int[] f676s;

    /* renamed from: t */
    private int f677t;

    /* renamed from: u */
    private int f678u;

    /* renamed from: v */
    private C0093c f679v;

    /* renamed from: y */
    private final C0393gn f680y;

    /* renamed from: z */
    private final C0390gk f681z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0091a extends C0379gd {
        C0091a() {
        }

        /* renamed from: a */
        public final void mo800a(View view, C0410gy gyVar) {
            super.mo800a(view, gyVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            gyVar.f1759a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    gyVar.f1759a.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        gyVar.mo1834a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        gyVar.mo1834a(4096);
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo801a(View view, int i, Bundle bundle) {
            if (super.mo801a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo753c(min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo753c(max);
                return true;
            }
        }

        /* renamed from: d */
        public final void mo802d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo802d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            int scrollX = nestedScrollView.getScrollX();
            if (VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollX(scrollX);
            }
            int scrollRange = nestedScrollView.getScrollRange();
            if (VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollY(scrollRange);
            }
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0092b {
        /* renamed from: a */
        void mo325a(NestedScrollView nestedScrollView);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    static class C0093c extends BaseSavedState {
        public static final Creator<C0093c> CREATOR = new Creator<C0093c>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0093c(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0093c[i];
            }
        };

        /* renamed from: a */
        public int f682a;

        C0093c(Parcel parcel) {
            super(parcel);
            this.f682a = parcel.readInt();
        }

        C0093c(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f682a);
            sb.append("}");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f682a);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f659b = new Rect();
        this.f664g = true;
        this.f665h = false;
        this.f666i = null;
        this.f667j = false;
        this.f670m = true;
        this.f674q = -1;
        this.f675r = new int[2];
        this.f676s = new int[2];
        this.f660c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f671n = viewConfiguration.getScaledTouchSlop();
        this.f672o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f673p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f655x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f680y = new C0393gn(this);
        this.f681z = new C0390gk(this);
        setNestedScrollingEnabled(true);
        C0396gq.m1258a((View) this, (C0379gd) f654w);
    }

    /* renamed from: a */
    private int m287a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom <= i3 || rect.top <= scrollY) {
            if (rect.top < scrollY && rect.bottom < i3) {
                i = Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
            }
            return i;
        }
        return Math.min(0 + (rect.height() > height ? rect.top - scrollY : rect.bottom - i3), (childAt.getBottom() + layoutParams.bottomMargin) - i2);
    }

    /* renamed from: a */
    private void m288a() {
        if (this.f668k == null) {
            this.f668k = VelocityTracker.obtain();
        }
    }

    /* renamed from: a */
    private void m289a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f674q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f663f = (int) motionEvent.getY(i);
            this.f674q = motionEvent.getPointerId(i);
            if (this.f668k != null) {
                this.f668k.clear();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m290a(int r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            int r4 = r19.getHeight()
            int r5 = r19.getScrollY()
            int r4 = r4 + r5
            r8 = 33
            if (r1 != r8) goto L_0x0017
            r8 = 1
            goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            r10 = 0
            int r11 = r9.size()
            r12 = r10
            r10 = 0
            r13 = 0
        L_0x0025:
            if (r10 >= r11) goto L_0x006d
            java.lang.Object r14 = r9.get(r10)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r2 >= r6) goto L_0x006a
            if (r15 >= r3) goto L_0x006a
            if (r2 >= r15) goto L_0x0040
            if (r6 >= r3) goto L_0x0040
            r17 = 1
            goto L_0x0042
        L_0x0040:
            r17 = 0
        L_0x0042:
            if (r12 != 0) goto L_0x0048
            r12 = r14
            r13 = r17
            goto L_0x006a
        L_0x0048:
            if (r8 == 0) goto L_0x0050
            int r7 = r12.getTop()
            if (r15 < r7) goto L_0x0058
        L_0x0050:
            if (r8 != 0) goto L_0x005a
            int r7 = r12.getBottom()
            if (r6 <= r7) goto L_0x005a
        L_0x0058:
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r13 == 0) goto L_0x0062
            if (r17 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            goto L_0x0069
        L_0x0062:
            if (r17 == 0) goto L_0x0067
            r12 = r14
            r13 = 1
            goto L_0x006a
        L_0x0067:
            if (r6 == 0) goto L_0x006a
        L_0x0069:
            r12 = r14
        L_0x006a:
            int r10 = r10 + 1
            goto L_0x0025
        L_0x006d:
            if (r12 != 0) goto L_0x0070
            r12 = r0
        L_0x0070:
            if (r2 < r5) goto L_0x0077
            if (r3 > r4) goto L_0x0077
            r16 = 0
            goto L_0x0082
        L_0x0077:
            if (r8 == 0) goto L_0x007b
            int r2 = r2 - r5
            goto L_0x007d
        L_0x007b:
            int r2 = r3 - r4
        L_0x007d:
            r0.m308h(r2)
            r16 = 1
        L_0x0082:
            android.view.View r2 = r19.findFocus()
            if (r12 == r2) goto L_0x008b
            r12.requestFocus(r1)
        L_0x008b:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m290a(int, int, int):boolean");
    }

    /* renamed from: a */
    private boolean m291a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i2 + 0;
        int i6 = i + i3;
        int i7 = 0 + i4;
        if (i5 <= 0 && i5 >= 0) {
            z = false;
        } else {
            z = true;
            i5 = 0;
        }
        if (i6 > i7) {
            z2 = true;
        } else if (i6 < 0) {
            z2 = true;
            i7 = 0;
        } else {
            i7 = i6;
            z2 = false;
        }
        if (z2 && !m305e(1)) {
            this.f660c.springBack(i5, i7, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i7, z, z2);
        return z || z2;
    }

    /* renamed from: a */
    private boolean m292a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f681z.mo1813a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    private boolean m293a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f681z.mo1814a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    private boolean m294a(View view) {
        return !m295a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m295a(View view, int i, int i2) {
        view.getDrawingRect(this.f659b);
        offsetDescendantRectToMyCoords(view, this.f659b);
        return this.f659b.bottom + i >= getScrollY() && this.f659b.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m296a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m296a((View) parent, view2);
    }

    /* renamed from: b */
    private static int m297b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: b */
    private void m298b() {
        if (this.f668k != null) {
            this.f668k.recycle();
            this.f668k = null;
        }
    }

    /* renamed from: b */
    private void m299b(View view) {
        view.getDrawingRect(this.f659b);
        offsetDescendantRectToMyCoords(view, this.f659b);
        int a = m287a(this.f659b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: c */
    private void m300c() {
        this.f667j = false;
        m298b();
        m303d(0);
        if (this.f661d != null) {
            this.f661d.onRelease();
            this.f662e.onRelease();
        }
    }

    /* renamed from: c */
    private boolean m301c(int i, int i2) {
        return this.f681z.mo1812a(i, i2);
    }

    /* renamed from: d */
    private void m302d() {
        if (getOverScrollMode() == 2) {
            this.f661d = null;
            this.f662e = null;
        } else if (this.f661d == null) {
            Context context = getContext();
            this.f661d = new EdgeEffect(context);
            this.f662e = new EdgeEffect(context);
        }
    }

    /* renamed from: d */
    private void m303d(int i) {
        C0390gk gkVar = this.f681z;
        ViewParent b = gkVar.mo1815b(i);
        if (b != null) {
            View view = gkVar.f1727a;
            if (b instanceof C0392gm) {
                ((C0392gm) b).mo751b(i);
            } else if (i == 0) {
                if (VERSION.SDK_INT >= 21) {
                    try {
                        b.onStopNestedScroll(view);
                    } catch (AbstractMethodError e) {
                        StringBuilder sb = new StringBuilder("ViewParent ");
                        sb.append(b);
                        sb.append(" does not implement interface method onStopNestedScroll");
                        Log.e("ViewParentCompat", sb.toString(), e);
                    }
                } else if (b instanceof C0391gl) {
                    ((C0391gl) b).onStopNestedScroll(view);
                }
            }
            gkVar.mo1810a(i, (ViewParent) null);
        }
    }

    /* renamed from: d */
    private void m304d(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f658a > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
                this.f678u = getScrollY();
                this.f660c.startScroll(getScrollX(), scrollY, 0, max);
                C0396gq.m1252a(this);
            } else {
                if (!this.f660c.isFinished()) {
                    this.f660c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f658a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: e */
    private boolean m305e(int i) {
        return this.f681z.mo1811a(i);
    }

    /* renamed from: f */
    private boolean m306f(int i) {
        boolean z = i == 130;
        int height = getHeight();
        this.f659b.top = 0;
        this.f659b.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f659b.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                this.f659b.top = this.f659b.bottom - height;
            }
        }
        return m290a(i, this.f659b.top, this.f659b.bottom);
    }

    /* renamed from: g */
    private boolean m307g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m295a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m308h(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f659b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f659b);
            m308h(m287a(this.f659b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m294a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f656A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f656A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f656A;
    }

    /* renamed from: h */
    private void m308h(int i) {
        if (i != 0) {
            if (this.f670m) {
                m304d(0, i);
                return;
            }
            scrollBy(0, i);
        }
    }

    /* renamed from: i */
    private void m309i(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            if (getChildCount() > 0) {
                m301c(2, 1);
                this.f660c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
                this.f678u = getScrollY();
                C0396gq.m1252a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo743a(int i, int i2) {
        this.f680y.f1732a = i;
        m301c(2, i2);
    }

    /* renamed from: a */
    public final void mo744a(int i, int i2, int[] iArr, int i3) {
        m293a(i, i2, iArr, null, i3);
    }

    /* renamed from: a */
    public final boolean mo745a(int i) {
        return (i & 2) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo746a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f659b
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0060
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x005f
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x005f
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            return r1
        L_0x005f:
            return r2
        L_0x0060:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0101
            int r0 = r7.getKeyCode()
            r4 = 62
            r5 = 33
            if (r0 == r4) goto L_0x0094
            switch(r0) {
                case 19: goto L_0x0084;
                case 20: goto L_0x0074;
                default: goto L_0x0073;
            }
        L_0x0073:
            return r2
        L_0x0074:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x007f
            boolean r2 = r6.m307g(r3)
            return r2
        L_0x007f:
            boolean r2 = r6.m306f(r3)
            return r2
        L_0x0084:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x008f
            boolean r2 = r6.m307g(r5)
            return r2
        L_0x008f:
            boolean r2 = r6.m306f(r5)
            return r2
        L_0x0094:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r5 = r3
        L_0x009c:
            if (r5 != r3) goto L_0x00a0
            r7 = r1
            goto L_0x00a1
        L_0x00a0:
            r7 = r2
        L_0x00a1:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00da
            android.graphics.Rect r7 = r6.f659b
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00ed
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r7 = r7 + r1
            android.graphics.Rect r1 = r6.f659b
            int r1 = r1.top
            int r1 = r1 + r0
            if (r1 <= r7) goto L_0x00ed
            android.graphics.Rect r1 = r6.f659b
            int r7 = r7 - r0
            r1.top = r7
            goto L_0x00ed
        L_0x00da:
            android.graphics.Rect r7 = r6.f659b
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f659b
            int r7 = r7.top
            if (r7 >= 0) goto L_0x00ed
            android.graphics.Rect r7 = r6.f659b
            r7.top = r2
        L_0x00ed:
            android.graphics.Rect r7 = r6.f659b
            android.graphics.Rect r1 = r6.f659b
            int r1 = r1.top
            int r1 = r1 + r0
            r7.bottom = r1
            android.graphics.Rect r7 = r6.f659b
            int r7 = r7.top
            android.graphics.Rect r0 = r6.f659b
            int r0 = r0.bottom
            r6.m290a(r5, r7, r0)
        L_0x0101:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo746a(android.view.KeyEvent):boolean");
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public final void mo751b(int i) {
        this.f680y.f1732a = 0;
        m303d(i);
    }

    /* renamed from: b */
    public final void mo752b(int i, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        m292a(0, scrollY2, 0, i - scrollY2, null, i2);
    }

    /* renamed from: c */
    public final void mo753c(int i) {
        m304d(0 - getScrollX(), i - getScrollY());
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        boolean z = false;
        if (this.f660c.computeScrollOffset()) {
            this.f660c.getCurrX();
            int currY = this.f660c.getCurrY();
            int i = currY - this.f678u;
            if (m293a(0, i, this.f676s, null, 1)) {
                i -= this.f676s[1];
            }
            if (i != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                m291a(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                if (!m292a(0, scrollY2, 0, i - scrollY2, null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        z = true;
                    }
                    if (z) {
                        m302d();
                        if (currY <= 0 && scrollY > 0) {
                            edgeEffect = this.f661d;
                        } else if (currY >= scrollRange && scrollY < scrollRange) {
                            edgeEffect = this.f662e;
                        }
                        edgeEffect.onAbsorb((int) this.f660c.getCurrVelocity());
                    }
                }
            }
            this.f678u = currY;
            C0396gq.m1252a(this);
            return;
        }
        if (m305e(1)) {
            m303d(1);
        }
        this.f678u = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo746a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        C0390gk gkVar = this.f681z;
        if (gkVar.f1728b) {
            ViewParent b = gkVar.mo1815b(0);
            if (b != null) {
                return C0401gs.m1286a(b, gkVar.f1727a, f, f2, z);
            }
        }
        return false;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        C0390gk gkVar = this.f681z;
        if (gkVar.f1728b) {
            ViewParent b = gkVar.mo1815b(0);
            if (b != null) {
                return C0401gs.m1285a(b, gkVar.f1727a, f, f2);
            }
        }
        return false;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m293a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m292a(i, i2, i3, i4, iArr, 0);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f661d != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f661d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f661d.setSize(width, height);
                if (this.f661d.draw(canvas)) {
                    C0396gq.m1252a(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f662e.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f662e.setSize(width2, height2);
                if (this.f662e.draw(canvas)) {
                    C0396gq.m1252a(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * ((float) getHeight()));
    }

    public int getNestedScrollAxes() {
        return this.f680y.f1732a;
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return m305e(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f681z.f1728b;
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f665h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f667j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r12.f667j
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 6
            if (r0 == r3) goto L_0x0100
            r3 = -1
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x006e;
                case 2: goto L_0x0019;
                case 3: goto L_0x006e;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0103
        L_0x0019:
            int r0 = r12.f674q
            if (r0 == r3) goto L_0x0103
            int r5 = r13.findPointerIndex(r0)
            if (r5 != r3) goto L_0x003d
            java.lang.String r13 = "NestedScrollView"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r13, r0)
            goto L_0x0103
        L_0x003d:
            float r0 = r13.getY(r5)
            int r0 = (int) r0
            int r3 = r12.f663f
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f671n
            if (r3 <= r5) goto L_0x0103
            int r3 = r12.getNestedScrollAxes()
            r1 = r1 & r3
            if (r1 != 0) goto L_0x0103
            r12.f667j = r2
            r12.f663f = r0
            r12.m288a()
            android.view.VelocityTracker r0 = r12.f668k
            r0.addMovement(r13)
            r12.f677t = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0103
            r13.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0103
        L_0x006e:
            r12.f667j = r4
            r12.f674q = r3
            r12.m298b()
            android.widget.OverScroller r5 = r12.f660c
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x008f
            p000.C0396gq.m1252a(r12)
        L_0x008f:
            r12.m303d(r4)
            goto L_0x0103
        L_0x0094:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r3 = r13.getX()
            int r3 = (int) r3
            int r5 = r12.getChildCount()
            if (r5 <= 0) goto L_0x00c8
            int r5 = r12.getScrollY()
            android.view.View r6 = r12.getChildAt(r4)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00c8
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00c8
            int r5 = r6.getLeft()
            if (r3 < r5) goto L_0x00c8
            int r5 = r6.getRight()
            if (r3 >= r5) goto L_0x00c8
            r3 = r2
            goto L_0x00c9
        L_0x00c8:
            r3 = r4
        L_0x00c9:
            if (r3 != 0) goto L_0x00d1
            r12.f667j = r4
            r12.m298b()
            goto L_0x0103
        L_0x00d1:
            r12.f663f = r0
            int r0 = r13.getPointerId(r4)
            r12.f674q = r0
            android.view.VelocityTracker r0 = r12.f668k
            if (r0 != 0) goto L_0x00e4
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f668k = r0
            goto L_0x00e9
        L_0x00e4:
            android.view.VelocityTracker r0 = r12.f668k
            r0.clear()
        L_0x00e9:
            android.view.VelocityTracker r0 = r12.f668k
            r0.addMovement(r13)
            android.widget.OverScroller r13 = r12.f660c
            r13.computeScrollOffset()
            android.widget.OverScroller r13 = r12.f660c
            boolean r13 = r13.isFinished()
            r13 = r13 ^ r2
            r12.f667j = r13
            r12.m301c(r1, r4)
            goto L_0x0103
        L_0x0100:
            r12.m289a(r13)
        L_0x0103:
            boolean r13 = r12.f667j
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f664g = false;
        if (this.f666i != null && m296a(this.f666i, (View) this)) {
            m299b(this.f666i);
        }
        this.f666i = null;
        if (!this.f665h) {
            if (this.f679v != null) {
                scrollTo(getScrollX(), this.f679v.f682a);
                this.f679v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = m297b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f665h = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f669l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m309i((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo744a(i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo752b(i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo743a(i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m294a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0093c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0093c cVar = (C0093c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f679v = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0093c cVar = new C0093c(super.onSaveInstanceState());
        cVar.f682a = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f657B != null) {
            this.f657B.mo325a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (!(findFocus == null || this == findFocus || !m295a(findFocus, 0, i4))) {
            findFocus.getDrawingRect(this.f659b);
            offsetDescendantRectToMyCoords(findFocus, this.f659b);
            m308h(m287a(this.f659b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo745a(i);
    }

    public void onStopNestedScroll(View view) {
        mo751b(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (r7.f660c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        p000.C0396gq.m1252a(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ed, code lost:
        if (r7.f660c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r19.m288a()
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r20)
            int r0 = r20.getActionMasked()
            r6 = 0
            if (r0 != 0) goto L_0x0014
            r7.f677t = r6
        L_0x0014:
            int r1 = r7.f677t
            float r1 = (float) r1
            r10 = 0
            r9.offsetLocation(r10, r1)
            r1 = -1
            r11 = 1
            switch(r0) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01b7;
                case 2: goto L_0x0074;
                case 3: goto L_0x0047;
                case 4: goto L_0x0020;
                case 5: goto L_0x0034;
                case 6: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x022a
        L_0x0022:
            r19.m289a(r20)
            int r0 = r7.f674q
            int r0 = r8.findPointerIndex(r0)
            float r0 = r8.getY(r0)
            int r0 = (int) r0
            r7.f663f = r0
            goto L_0x022a
        L_0x0034:
            int r0 = r20.getActionIndex()
            float r1 = r8.getY(r0)
            int r1 = (int) r1
            r7.f663f = r1
            int r0 = r8.getPointerId(r0)
            r7.f674q = r0
            goto L_0x022a
        L_0x0047:
            boolean r0 = r7.f667j
            if (r0 == 0) goto L_0x006d
            int r0 = r19.getChildCount()
            if (r0 <= 0) goto L_0x006d
            android.widget.OverScroller r12 = r7.f660c
            int r13 = r19.getScrollX()
            int r14 = r19.getScrollY()
            r15 = 0
            r16 = 0
            r17 = 0
            int r18 = r19.getScrollRange()
            boolean r0 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x006d
        L_0x006a:
            p000.C0396gq.m1252a(r19)
        L_0x006d:
            r7.f674q = r1
            r19.m300c()
            goto L_0x022a
        L_0x0074:
            int r0 = r7.f674q
            int r12 = r8.findPointerIndex(r0)
            if (r12 != r1) goto L_0x0098
            java.lang.String r0 = "NestedScrollView"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r7.f674q
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            goto L_0x022a
        L_0x0098:
            float r0 = r8.getY(r12)
            int r13 = (int) r0
            int r0 = r7.f663f
            int r14 = r0 - r13
            r1 = 0
            int[] r3 = r7.f676s
            int[] r4 = r7.f675r
            r5 = 0
            r0 = r7
            r2 = r14
            boolean r0 = r0.m293a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c5
            int[] r0 = r7.f676s
            r0 = r0[r11]
            int r14 = r14 - r0
            int[] r0 = r7.f675r
            r0 = r0[r11]
            float r0 = (float) r0
            r9.offsetLocation(r10, r0)
            int r0 = r7.f677t
            int[] r1 = r7.f675r
            r1 = r1[r11]
            int r0 = r0 + r1
            r7.f677t = r0
        L_0x00c5:
            boolean r0 = r7.f667j
            if (r0 != 0) goto L_0x00e5
            int r0 = java.lang.Math.abs(r14)
            int r1 = r7.f671n
            if (r0 <= r1) goto L_0x00e5
            android.view.ViewParent r0 = r19.getParent()
            if (r0 == 0) goto L_0x00da
            r0.requestDisallowInterceptTouchEvent(r11)
        L_0x00da:
            r7.f667j = r11
            if (r14 <= 0) goto L_0x00e2
            int r0 = r7.f671n
            int r14 = r14 - r0
            goto L_0x00e5
        L_0x00e2:
            int r0 = r7.f671n
            int r14 = r14 + r0
        L_0x00e5:
            boolean r0 = r7.f667j
            if (r0 == 0) goto L_0x022a
            int[] r0 = r7.f675r
            r0 = r0[r11]
            int r13 = r13 - r0
            r7.f663f = r13
            int r13 = r19.getScrollY()
            int r15 = r19.getScrollRange()
            int r0 = r19.getOverScrollMode()
            if (r0 == 0) goto L_0x0106
            if (r0 != r11) goto L_0x0103
            if (r15 <= 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r16 = r6
            goto L_0x0108
        L_0x0106:
            r16 = r11
        L_0x0108:
            int r0 = r19.getScrollY()
            boolean r0 = r7.m291a(r14, r6, r0, r15)
            if (r0 == 0) goto L_0x011d
            boolean r0 = r7.m305e(r6)
            if (r0 != 0) goto L_0x011d
            android.view.VelocityTracker r0 = r7.f668k
            r0.clear()
        L_0x011d:
            int r0 = r19.getScrollY()
            int r2 = r0 - r13
            int r4 = r14 - r2
            r1 = 0
            r3 = 0
            int[] r5 = r7.f675r
            r6 = 0
            r0 = r7
            boolean r0 = r0.m292a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x014d
            int r0 = r7.f663f
            int[] r1 = r7.f675r
            r1 = r1[r11]
            int r0 = r0 - r1
            r7.f663f = r0
            int[] r0 = r7.f675r
            r0 = r0[r11]
            float r0 = (float) r0
            r9.offsetLocation(r10, r0)
            int r0 = r7.f677t
            int[] r1 = r7.f675r
            r1 = r1[r11]
            int r0 = r0 + r1
            r7.f677t = r0
            goto L_0x022a
        L_0x014d:
            if (r16 == 0) goto L_0x022a
            r19.m302d()
            int r13 = r13 + r14
            if (r13 >= 0) goto L_0x0179
            android.widget.EdgeEffect r0 = r7.f661d
            float r1 = (float) r14
            int r2 = r19.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r8.getX(r12)
            int r3 = r19.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            p000.C0437hd.m1385a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r7.f662e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x019f
            android.widget.EdgeEffect r0 = r7.f662e
        L_0x0175:
            r0.onRelease()
            goto L_0x019f
        L_0x0179:
            if (r13 <= r15) goto L_0x019f
            android.widget.EdgeEffect r0 = r7.f662e
            float r1 = (float) r14
            int r2 = r19.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r8.getX(r12)
            int r4 = r19.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            p000.C0437hd.m1385a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r7.f661d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x019f
            android.widget.EdgeEffect r0 = r7.f661d
            goto L_0x0175
        L_0x019f:
            android.widget.EdgeEffect r0 = r7.f661d
            if (r0 == 0) goto L_0x022a
            android.widget.EdgeEffect r0 = r7.f661d
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01b3
            android.widget.EdgeEffect r0 = r7.f662e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x022a
        L_0x01b3:
            p000.C0396gq.m1252a(r19)
            goto L_0x022a
        L_0x01b7:
            android.view.VelocityTracker r0 = r7.f668k
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.f673p
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f674q
            float r0 = r0.getYVelocity(r2)
            int r0 = (int) r0
            int r2 = java.lang.Math.abs(r0)
            int r3 = r7.f672o
            if (r2 <= r3) goto L_0x01d6
            int r0 = -r0
            r7.m309i(r0)
            goto L_0x006d
        L_0x01d6:
            android.widget.OverScroller r12 = r7.f660c
            int r13 = r19.getScrollX()
            int r14 = r19.getScrollY()
            r15 = 0
            r16 = 0
            r17 = 0
            int r18 = r19.getScrollRange()
            boolean r0 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x006d
            goto L_0x006a
        L_0x01f1:
            int r0 = r19.getChildCount()
            if (r0 != 0) goto L_0x01f8
            return r6
        L_0x01f8:
            android.widget.OverScroller r0 = r7.f660c
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r11
            r7.f667j = r0
            if (r0 == 0) goto L_0x020c
            android.view.ViewParent r0 = r19.getParent()
            if (r0 == 0) goto L_0x020c
            r0.requestDisallowInterceptTouchEvent(r11)
        L_0x020c:
            android.widget.OverScroller r0 = r7.f660c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0219
            android.widget.OverScroller r0 = r7.f660c
            r0.abortAnimation()
        L_0x0219:
            float r0 = r20.getY()
            int r0 = (int) r0
            r7.f663f = r0
            int r0 = r8.getPointerId(r6)
            r7.f674q = r0
            r0 = 2
            r7.m301c(r0, r6)
        L_0x022a:
            android.view.VelocityTracker r0 = r7.f668k
            if (r0 == 0) goto L_0x0233
            android.view.VelocityTracker r0 = r7.f668k
            r0.addMovement(r9)
        L_0x0233:
            r9.recycle()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f664g) {
            m299b(view2);
        } else {
            this.f666i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m287a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
                return z2;
            }
            m304d(0, a);
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m298b();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f664g = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int b = m297b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int b2 = m297b(i2, height, height2);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f669l) {
            this.f669l = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C0390gk gkVar = this.f681z;
        if (gkVar.f1728b) {
            C0396gq.m1274k(gkVar.f1727a);
        }
        gkVar.f1728b = z;
    }

    public void setOnScrollChangeListener(C0092b bVar) {
        this.f657B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f670m = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return m301c(i, 0);
    }

    public void stopNestedScroll() {
        m303d(0);
    }
}
