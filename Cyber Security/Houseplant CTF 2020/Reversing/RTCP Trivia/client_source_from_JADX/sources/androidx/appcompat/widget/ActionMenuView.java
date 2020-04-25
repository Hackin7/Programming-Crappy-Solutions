package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;

public class ActionMenuView extends C0190cf implements C0021b, C0103ar {

    /* renamed from: a */
    public C0019aj f381a;

    /* renamed from: b */
    public boolean f382b;

    /* renamed from: c */
    public C0127ba f383c;

    /* renamed from: d */
    C0020a f384d;

    /* renamed from: e */
    C0057e f385e;

    /* renamed from: f */
    private Context f386f;

    /* renamed from: g */
    private int f387g;

    /* renamed from: h */
    private C0102a f388h;

    /* renamed from: i */
    private boolean f389i;

    /* renamed from: j */
    private int f390j;

    /* renamed from: k */
    private int f391k;

    /* renamed from: l */
    private int f392l;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0053a {
        /* renamed from: c */
        boolean mo343c();

        /* renamed from: d */
        boolean mo344d();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    static class C0054b implements C0102a {
        C0054b() {
        }

        /* renamed from: a */
        public final void mo196a(C0019aj ajVar, boolean z) {
        }

        /* renamed from: a */
        public final boolean mo197a(C0019aj ajVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0055c extends C0191a {
        @ExportedProperty

        /* renamed from: a */
        public boolean f393a;
        @ExportedProperty

        /* renamed from: b */
        public int f394b;
        @ExportedProperty

        /* renamed from: c */
        public int f395c;
        @ExportedProperty

        /* renamed from: d */
        public boolean f396d;
        @ExportedProperty

        /* renamed from: e */
        public boolean f397e;

        /* renamed from: f */
        boolean f398f;

        public C0055c() {
            super(-2, -2);
            this.f393a = false;
        }

        public C0055c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0055c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0055c(C0055c cVar) {
            super(cVar);
            this.f393a = cVar.f393a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    class C0056d implements C0020a {
        C0056d() {
        }

        /* renamed from: a */
        public final void mo193a(C0019aj ajVar) {
            if (ActionMenuView.this.f384d != null) {
                ActionMenuView.this.f384d.mo193a(ajVar);
            }
        }

        /* renamed from: a */
        public final boolean mo194a(C0019aj ajVar, MenuItem menuItem) {
            return ActionMenuView.this.f385e != null && ActionMenuView.this.f385e.mo495a();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0057e {
        /* renamed from: a */
        boolean mo495a();
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f391k = (int) (56.0f * f);
        this.f392l = (int) (4.0f * f);
        this.f386f = context;
        this.f387g = 0;
    }

    /* renamed from: a */
    public static int m185a(View view, int i, int i2, int i3, int i4) {
        C0055c cVar = (C0055c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo342b();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!cVar.f393a && z2) {
            z = true;
        }
        cVar.f396d = z;
        cVar.f394b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: a */
    public static C0055c m186a() {
        C0055c d = m190d();
        d.f393a = true;
        return d;
    }

    /* renamed from: a */
    public static C0055c m187a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m190d();
        }
        C0055c cVar = layoutParams instanceof C0055c ? new C0055c((C0055c) layoutParams) : new C0055c(layoutParams);
        if (cVar.f970h <= 0) {
            cVar.f970h = 16;
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C0055c generateLayoutParams(AttributeSet attributeSet) {
        return new C0055c(getContext(), attributeSet);
    }

    /* renamed from: b */
    private boolean m189b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0053a)) {
            z = false | ((C0053a) childAt).mo344d();
        }
        if (i > 0 && (childAt2 instanceof C0053a)) {
            z |= ((C0053a) childAt2).mo343c();
        }
        return z;
    }

    /* renamed from: d */
    private static C0055c m190d() {
        C0055c cVar = new C0055c();
        cVar.f970h = 16;
        return cVar;
    }

    /* renamed from: a */
    public final void mo362a(C0019aj ajVar) {
        this.f381a = ajVar;
    }

    /* renamed from: a */
    public final void mo472a(C0102a aVar, C0020a aVar2) {
        this.f388h = aVar;
        this.f384d = aVar2;
    }

    /* renamed from: a */
    public final boolean mo195a(C0023al alVar) {
        return this.f381a.mo151a((MenuItem) alVar, (C0101aq) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C0191a mo473b(LayoutParams layoutParams) {
        return m187a(layoutParams);
    }

    /* renamed from: b */
    public final void mo474b() {
        if (this.f383c != null) {
            this.f383c.mo888f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C0191a mo475c() {
        return m190d();
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0055c);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m190d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m187a(layoutParams);
    }

    public Menu getMenu() {
        if (this.f381a == null) {
            Context context = getContext();
            this.f381a = new C0019aj(context);
            this.f381a.mo144a((C0020a) new C0056d());
            this.f383c = new C0127ba(context);
            this.f383c.mo885c();
            this.f383c.f37f = this.f388h != null ? this.f388h : new C0054b();
            this.f381a.mo147a((C0101aq) this.f383c, this.f386f);
            this.f383c.mo882a(this);
        }
        return this.f381a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0127ba baVar = this.f383c;
        if (baVar.f761i != null) {
            return baVar.f761i.getDrawable();
        }
        if (baVar.f763k) {
            return baVar.f762j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f387g;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f383c != null) {
            this.f383c.mo98a(false);
            if (this.f383c.mo890h()) {
                this.f383c.mo887e();
                this.f383c.mo886d();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo474b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f389i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0225cx.m739a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0055c cVar = (C0055c) childAt.getLayoutParams();
                if (cVar.f393a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m189b(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    m189b(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0055c cVar2 = (C0055c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f393a) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            C0055c cVar3 = (C0055c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f393a) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
            i6++;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            boolean r1 = r0.f389i
            int r2 = android.view.View.MeasureSpec.getMode(r35)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0010
            r2 = r5
            goto L_0x0011
        L_0x0010:
            r2 = r4
        L_0x0011:
            r0.f389i = r2
            boolean r2 = r0.f389i
            if (r1 == r2) goto L_0x0019
            r0.f390j = r4
        L_0x0019:
            int r1 = android.view.View.MeasureSpec.getSize(r35)
            boolean r2 = r0.f389i
            if (r2 == 0) goto L_0x0030
            aj r2 = r0.f381a
            if (r2 == 0) goto L_0x0030
            int r2 = r0.f390j
            if (r1 == r2) goto L_0x0030
            r0.f390j = r1
            aj r1 = r0.f381a
            r1.mo163b(r5)
        L_0x0030:
            int r1 = r34.getChildCount()
            boolean r2 = r0.f389i
            if (r2 == 0) goto L_0x02b1
            if (r1 <= 0) goto L_0x02b1
            int r1 = android.view.View.MeasureSpec.getMode(r36)
            int r2 = android.view.View.MeasureSpec.getSize(r35)
            int r6 = android.view.View.MeasureSpec.getSize(r36)
            int r7 = r34.getPaddingLeft()
            int r8 = r34.getPaddingRight()
            int r7 = r7 + r8
            int r8 = r34.getPaddingTop()
            int r9 = r34.getPaddingBottom()
            int r8 = r8 + r9
            r9 = -2
            r10 = r36
            int r9 = getChildMeasureSpec(r10, r8, r9)
            int r2 = r2 - r7
            int r7 = r0.f391k
            int r7 = r2 / r7
            int r10 = r0.f391k
            int r10 = r2 % r10
            if (r7 != 0) goto L_0x006e
            r0.setMeasuredDimension(r2, r4)
            return
        L_0x006e:
            int r11 = r0.f391k
            int r10 = r10 / r7
            int r11 = r11 + r10
            int r10 = r34.getChildCount()
            r3 = r4
            r12 = r3
            r14 = r12
            r15 = r14
            r17 = r15
            r16 = r7
            r20 = 0
            r7 = r17
        L_0x0082:
            if (r7 >= r10) goto L_0x010b
            android.view.View r13 = r0.getChildAt(r7)
            int r5 = r13.getVisibility()
            r4 = 8
            if (r5 == r4) goto L_0x0101
            boolean r4 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r15 = r15 + 1
            if (r4 == 0) goto L_0x00a3
            int r5 = r0.f392l
            r22 = r6
            int r6 = r0.f392l
            r23 = r15
            r15 = 0
            r13.setPadding(r5, r15, r6, r15)
            goto L_0x00a8
        L_0x00a3:
            r22 = r6
            r23 = r15
            r15 = 0
        L_0x00a8:
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r5 = (androidx.appcompat.widget.ActionMenuView.C0055c) r5
            r5.f398f = r15
            r5.f395c = r15
            r5.f394b = r15
            r5.f396d = r15
            r5.leftMargin = r15
            r5.rightMargin = r15
            if (r4 == 0) goto L_0x00c7
            r4 = r13
            androidx.appcompat.view.menu.ActionMenuItemView r4 = (androidx.appcompat.view.menu.ActionMenuItemView) r4
            boolean r4 = r4.mo342b()
            if (r4 == 0) goto L_0x00c7
            r4 = 1
            goto L_0x00c8
        L_0x00c7:
            r4 = 0
        L_0x00c8:
            r5.f397e = r4
            boolean r4 = r5.f393a
            if (r4 == 0) goto L_0x00d0
            r4 = 1
            goto L_0x00d2
        L_0x00d0:
            r4 = r16
        L_0x00d2:
            int r4 = m185a(r13, r11, r4, r9, r8)
            int r3 = java.lang.Math.max(r3, r4)
            boolean r6 = r5.f396d
            if (r6 == 0) goto L_0x00e0
            int r17 = r17 + 1
        L_0x00e0:
            boolean r5 = r5.f393a
            if (r5 == 0) goto L_0x00e5
            r14 = 1
        L_0x00e5:
            int r16 = r16 - r4
            int r5 = r13.getMeasuredHeight()
            int r5 = java.lang.Math.max(r12, r5)
            r6 = 1
            if (r4 != r6) goto L_0x00fd
            int r4 = r6 << r7
            long r12 = (long) r4
            long r12 = r20 | r12
            r20 = r12
            r15 = r23
            r12 = r5
            goto L_0x0103
        L_0x00fd:
            r12 = r5
            r15 = r23
            goto L_0x0103
        L_0x0101:
            r22 = r6
        L_0x0103:
            int r7 = r7 + 1
            r6 = r22
            r4 = 0
            r5 = 1
            goto L_0x0082
        L_0x010b:
            r22 = r6
            r4 = 2
            if (r14 == 0) goto L_0x0114
            if (r15 != r4) goto L_0x0114
            r5 = 1
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            r6 = r16
            r7 = 0
        L_0x0118:
            r23 = 1
            if (r17 <= 0) goto L_0x01b5
            if (r6 <= 0) goto L_0x01b5
            r8 = 2147483647(0x7fffffff, float:NaN)
            r4 = r8
            r8 = 0
            r13 = 0
            r25 = 0
        L_0x0126:
            if (r8 >= r10) goto L_0x0157
            r27 = r7
            android.view.View r7 = r0.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r7 = (androidx.appcompat.widget.ActionMenuView.C0055c) r7
            r28 = r12
            boolean r12 = r7.f396d
            if (r12 == 0) goto L_0x0150
            int r12 = r7.f394b
            if (r12 >= r4) goto L_0x0146
            int r4 = r7.f394b
            long r12 = r23 << r8
            r25 = r12
            r13 = 1
            goto L_0x0150
        L_0x0146:
            int r7 = r7.f394b
            if (r7 != r4) goto L_0x0150
            long r29 = r23 << r8
            long r25 = r25 | r29
            int r13 = r13 + 1
        L_0x0150:
            int r8 = r8 + 1
            r7 = r27
            r12 = r28
            goto L_0x0126
        L_0x0157:
            r27 = r7
            r28 = r12
            long r20 = r20 | r25
            if (r13 > r6) goto L_0x01b0
            int r4 = r4 + 1
            r7 = r6
            r6 = 0
        L_0x0163:
            if (r6 >= r10) goto L_0x01a9
            android.view.View r8 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r12 = (androidx.appcompat.widget.ActionMenuView.C0055c) r12
            r31 = r2
            r13 = 1
            int r2 = r13 << r6
            r32 = r1
            long r1 = (long) r2
            long r23 = r25 & r1
            r18 = 0
            int r13 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x0186
            int r8 = r12.f394b
            if (r8 != r4) goto L_0x01a2
            long r20 = r20 | r1
            goto L_0x01a2
        L_0x0186:
            if (r5 == 0) goto L_0x0198
            boolean r1 = r12.f397e
            if (r1 == 0) goto L_0x0198
            r1 = 1
            if (r7 != r1) goto L_0x0198
            int r2 = r0.f392l
            int r2 = r2 + r11
            int r13 = r0.f392l
            r1 = 0
            r8.setPadding(r2, r1, r13, r1)
        L_0x0198:
            int r1 = r12.f394b
            r2 = 1
            int r1 = r1 + r2
            r12.f394b = r1
            r12.f398f = r2
            int r7 = r7 + -1
        L_0x01a2:
            int r6 = r6 + 1
            r2 = r31
            r1 = r32
            goto L_0x0163
        L_0x01a9:
            r6 = r7
            r12 = r28
            r4 = 2
            r7 = 1
            goto L_0x0118
        L_0x01b0:
            r32 = r1
            r31 = r2
            goto L_0x01bd
        L_0x01b5:
            r32 = r1
            r31 = r2
            r27 = r7
            r28 = r12
        L_0x01bd:
            r1 = r20
            if (r14 != 0) goto L_0x01c6
            r4 = 1
            if (r15 != r4) goto L_0x01c7
            r5 = r4
            goto L_0x01c8
        L_0x01c6:
            r4 = 1
        L_0x01c7:
            r5 = 0
        L_0x01c8:
            if (r6 <= 0) goto L_0x0278
            r7 = 0
            int r12 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0278
            int r15 = r15 - r4
            if (r6 < r15) goto L_0x01d7
            if (r5 != 0) goto L_0x01d7
            if (r3 <= r4) goto L_0x0278
        L_0x01d7:
            int r3 = java.lang.Long.bitCount(r1)
            float r3 = (float) r3
            if (r5 != 0) goto L_0x0214
            long r4 = r1 & r23
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L_0x01f8
            r4 = 0
            android.view.View r7 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r4 = (androidx.appcompat.widget.ActionMenuView.C0055c) r4
            boolean r4 = r4.f397e
            if (r4 != 0) goto L_0x01f8
            float r3 = r3 - r5
        L_0x01f8:
            int r4 = r10 + -1
            r7 = 1
            int r8 = r7 << r4
            long r7 = (long) r8
            long r7 = r7 & r1
            r12 = 0
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0214
            android.view.View r4 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r4 = (androidx.appcompat.widget.ActionMenuView.C0055c) r4
            boolean r4 = r4.f397e
            if (r4 != 0) goto L_0x0214
            float r3 = r3 - r5
        L_0x0214:
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x021e
            int r6 = r6 * r11
            float r4 = (float) r6
            float r4 = r4 / r3
            int r4 = (int) r4
            goto L_0x021f
        L_0x021e:
            r4 = 0
        L_0x021f:
            r5 = r27
            r3 = 0
        L_0x0222:
            if (r3 >= r10) goto L_0x0276
            r6 = 1
            int r7 = r6 << r3
            long r7 = (long) r7
            long r7 = r7 & r1
            r12 = 0
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0271
            android.view.View r7 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r8 = (androidx.appcompat.widget.ActionMenuView.C0055c) r8
            boolean r7 = r7 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r7 == 0) goto L_0x0251
            r8.f395c = r4
            r8.f398f = r6
            if (r3 != 0) goto L_0x024d
            boolean r5 = r8.f397e
            if (r5 != 0) goto L_0x024d
            int r5 = -r4
            r6 = 2
            int r5 = r5 / r6
            r8.leftMargin = r5
            goto L_0x024e
        L_0x024d:
            r6 = 2
        L_0x024e:
            r5 = 1
            r7 = 1
            goto L_0x0273
        L_0x0251:
            r6 = 2
            boolean r7 = r8.f393a
            if (r7 == 0) goto L_0x0261
            r8.f395c = r4
            r7 = 1
            r8.f398f = r7
            int r5 = -r4
            int r5 = r5 / r6
            r8.rightMargin = r5
            r5 = r7
            goto L_0x0273
        L_0x0261:
            r7 = 1
            if (r3 == 0) goto L_0x0268
            int r14 = r4 / 2
            r8.leftMargin = r14
        L_0x0268:
            int r14 = r10 + -1
            if (r3 == r14) goto L_0x0273
            int r14 = r4 / 2
            r8.rightMargin = r14
            goto L_0x0273
        L_0x0271:
            r7 = r6
            r6 = 2
        L_0x0273:
            int r3 = r3 + 1
            goto L_0x0222
        L_0x0276:
            r27 = r5
        L_0x0278:
            if (r27 == 0) goto L_0x02a0
            r1 = 0
        L_0x027b:
            if (r1 >= r10) goto L_0x02a0
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r3 = (androidx.appcompat.widget.ActionMenuView.C0055c) r3
            boolean r4 = r3.f398f
            if (r4 == 0) goto L_0x029b
            int r4 = r3.f394b
            int r4 = r4 * r11
            int r3 = r3.f395c
            int r4 = r4 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r2.measure(r4, r9)
            goto L_0x029d
        L_0x029b:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x029d:
            int r1 = r1 + 1
            goto L_0x027b
        L_0x02a0:
            r3 = 1073741824(0x40000000, float:2.0)
            r1 = r32
            if (r1 == r3) goto L_0x02a9
            r1 = r28
            goto L_0x02ab
        L_0x02a9:
            r1 = r22
        L_0x02ab:
            r2 = r31
            r0.setMeasuredDimension(r2, r1)
            return
        L_0x02b1:
            r10 = r36
            r2 = 0
        L_0x02b4:
            if (r2 >= r1) goto L_0x02c8
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r3 = (androidx.appcompat.widget.ActionMenuView.C0055c) r3
            r4 = 0
            r3.rightMargin = r4
            r3.leftMargin = r4
            int r2 = r2 + 1
            goto L_0x02b4
        L_0x02c8:
            super.onMeasure(r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f383c.f764l = z;
    }

    public void setOnMenuItemClickListener(C0057e eVar) {
        this.f385e = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0127ba baVar = this.f383c;
        if (baVar.f761i != null) {
            baVar.f761i.setImageDrawable(drawable);
            return;
        }
        baVar.f763k = true;
        baVar.f762j = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f382b = z;
    }

    public void setPopupTheme(int i) {
        if (this.f387g != i) {
            this.f387g = i;
            if (i == 0) {
                this.f386f = getContext();
                return;
            }
            this.f386f = new ContextThemeWrapper(getContext(), i);
        }
    }

    public void setPresenter(C0127ba baVar) {
        this.f383c = baVar;
        this.f383c.mo882a(this);
    }
}
