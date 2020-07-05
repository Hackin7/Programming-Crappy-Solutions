package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: cf */
public class C0190cf extends ViewGroup {

    /* renamed from: a */
    private boolean f954a;

    /* renamed from: b */
    private int f955b;

    /* renamed from: c */
    private int f956c;

    /* renamed from: d */
    private int f957d;

    /* renamed from: e */
    private int f958e;

    /* renamed from: f */
    private int f959f;

    /* renamed from: g */
    private float f960g;

    /* renamed from: h */
    private boolean f961h;

    /* renamed from: i */
    private int[] f962i;

    /* renamed from: j */
    private int[] f963j;

    /* renamed from: k */
    private Drawable f964k;

    /* renamed from: l */
    private int f965l;

    /* renamed from: m */
    private int f966m;

    /* renamed from: n */
    private int f967n;

    /* renamed from: o */
    private int f968o;

    /* renamed from: cf$a */
    public static class C0191a extends MarginLayoutParams {

        /* renamed from: g */
        public float f969g;

        /* renamed from: h */
        public int f970h;

        public C0191a(int i, int i2) {
            super(i, i2);
            this.f970h = -1;
            this.f969g = 0.0f;
        }

        public C0191a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f970h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126j.LinearLayoutCompat_Layout);
            this.f969g = obtainStyledAttributes.getFloat(C0126j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f970h = obtainStyledAttributes.getInt(C0126j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0191a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f970h = -1;
        }
    }

    public C0190cf(Context context) {
        this(context, null);
    }

    public C0190cf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0190cf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f954a = true;
        this.f955b = -1;
        this.f956c = 0;
        this.f958e = 8388659;
        C0215cr a = C0215cr.m676a(context, attributeSet, C0126j.LinearLayoutCompat, i, 0);
        int a2 = a.mo1311a(C0126j.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo1311a(C0126j.LinearLayoutCompat_android_gravity, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo1313a(C0126j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f960g = a.f1087b.getFloat(C0126j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f955b = a.mo1311a(C0126j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f961h = a.mo1313a(C0126j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo1312a(C0126j.LinearLayoutCompat_divider));
        this.f967n = a.mo1311a(C0126j.LinearLayoutCompat_showDividers, 0);
        this.f968o = a.mo1320e(C0126j.LinearLayoutCompat_dividerPadding, 0);
        a.f1087b.recycle();
    }

    /* renamed from: a */
    private void m616a(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0191a aVar = (C0191a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* renamed from: a */
    private void m617a(Canvas canvas, int i) {
        this.f964k.setBounds(getPaddingLeft() + this.f968o, i, (getWidth() - getPaddingRight()) - this.f968o, this.f966m + i);
        this.f964k.draw(canvas);
    }

    /* renamed from: a */
    private void m618a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0223, code lost:
        if (r13[3] != -1) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0396, code lost:
        if (r7 < 0) goto L_0x038f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m619b(int r40, int r41) {
        /*
            r39 = this;
            r6 = r39
            r7 = r41
            r8 = 0
            r6.f959f = r8
            int r9 = r39.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r40)
            int r11 = android.view.View.MeasureSpec.getMode(r41)
            int[] r0 = r6.f962i
            r12 = 4
            if (r0 == 0) goto L_0x001c
            int[] r0 = r6.f963j
            if (r0 != 0) goto L_0x0024
        L_0x001c:
            int[] r0 = new int[r12]
            r6.f962i = r0
            int[] r0 = new int[r12]
            r6.f963j = r0
        L_0x0024:
            int[] r13 = r6.f962i
            int[] r14 = r6.f963j
            r15 = 3
            r5 = -1
            r13[r15] = r5
            r16 = 2
            r13[r16] = r5
            r17 = 1
            r13[r17] = r5
            r13[r8] = r5
            r14[r15] = r5
            r14[r16] = r5
            r14[r17] = r5
            r14[r8] = r5
            boolean r4 = r6.f954a
            boolean r3 = r6.f961h
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 != r2) goto L_0x0049
            r18 = r17
            goto L_0x004b
        L_0x0049:
            r18 = r8
        L_0x004b:
            r19 = 0
            r1 = r8
            r12 = r1
            r15 = r12
            r20 = r15
            r21 = r20
            r22 = r21
            r23 = r22
            r25 = r23
            r24 = r17
            r0 = r19
        L_0x005e:
            r5 = 8
            if (r1 >= r9) goto L_0x01f4
            android.view.View r2 = r6.getChildAt(r1)
            if (r2 != 0) goto L_0x0078
            int r2 = r6.f959f
            int r2 = r2 + r8
            r6.f959f = r2
            r29 = r0
            r0 = r1
            r30 = r3
            r27 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e4
        L_0x0078:
            int r8 = r2.getVisibility()
            if (r8 == r5) goto L_0x01d0
            boolean r5 = r6.mo1183a(r1)
            if (r5 == 0) goto L_0x008b
            int r5 = r6.f959f
            int r8 = r6.f965l
            int r5 = r5 + r8
            r6.f959f = r5
        L_0x008b:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            r8 = r5
            cf$a r8 = (p000.C0190cf.C0191a) r8
            float r5 = r8.f969g
            float r29 = r0 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            if (r10 != r5) goto L_0x00e2
            int r0 = r8.width
            if (r0 != 0) goto L_0x00e2
            float r0 = r8.f969g
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e2
            if (r18 == 0) goto L_0x00b3
            int r0 = r6.f959f
            int r5 = r8.leftMargin
            r31 = r1
            int r1 = r8.rightMargin
            int r5 = r5 + r1
            int r0 = r0 + r5
        L_0x00b0:
            r6.f959f = r0
            goto L_0x00c2
        L_0x00b3:
            r31 = r1
            int r0 = r6.f959f
            int r1 = r8.leftMargin
            int r1 = r1 + r0
            int r5 = r8.rightMargin
            int r1 = r1 + r5
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x00b0
        L_0x00c2:
            if (r4 == 0) goto L_0x00d5
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r2.measure(r1, r1)
            r0 = r2
            r30 = r3
            r27 = r4
            r26 = -2
            goto L_0x014f
        L_0x00d5:
            r0 = r2
            r30 = r3
            r27 = r4
            r20 = r17
            r1 = 1073741824(0x40000000, float:2.0)
            r26 = -2
            goto L_0x0151
        L_0x00e2:
            r31 = r1
            int r0 = r8.width
            if (r0 != 0) goto L_0x00f3
            float r0 = r8.f969g
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f3
            r5 = -2
            r8.width = r5
            r1 = 0
            goto L_0x00f6
        L_0x00f3:
            r5 = -2
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00f6:
            int r0 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x00ff
            int r0 = r6.f959f
            r27 = r0
            goto L_0x0101
        L_0x00ff:
            r27 = 0
        L_0x0101:
            r28 = 0
            r0 = r6
            r32 = r1
            r1 = r2
            r33 = r2
            r2 = r40
            r30 = r3
            r3 = r27
            r27 = r4
            r4 = r7
            r26 = r5
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r28
            r0.m618a(r1, r2, r3, r4, r5)
            r0 = r32
            if (r0 == r7) goto L_0x0121
            r8.width = r0
        L_0x0121:
            r0 = r33
            int r1 = r0.getMeasuredWidth()
            if (r18 == 0) goto L_0x0137
            int r2 = r6.f959f
            int r3 = r8.leftMargin
            int r3 = r3 + r1
            int r4 = r8.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r2 = r2 + r3
        L_0x0134:
            r6.f959f = r2
            goto L_0x0148
        L_0x0137:
            r4 = 0
            int r2 = r6.f959f
            int r3 = r2 + r1
            int r5 = r8.leftMargin
            int r3 = r3 + r5
            int r5 = r8.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            goto L_0x0134
        L_0x0148:
            if (r30 == 0) goto L_0x014f
            int r1 = java.lang.Math.max(r1, r12)
            r12 = r1
        L_0x014f:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0151:
            if (r11 == r1) goto L_0x015d
            int r2 = r8.height
            r3 = -1
            if (r2 != r3) goto L_0x015d
            r2 = r17
            r25 = r2
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            int r3 = r8.topMargin
            int r4 = r8.bottomMargin
            int r3 = r3 + r4
            int r4 = r0.getMeasuredHeight()
            int r4 = r4 + r3
            int r5 = r0.getMeasuredState()
            r7 = r23
            int r23 = android.view.View.combineMeasuredStates(r7, r5)
            if (r27 == 0) goto L_0x019e
            int r0 = r0.getBaseline()
            r5 = -1
            if (r0 == r5) goto L_0x019e
            int r5 = r8.f970h
            if (r5 >= 0) goto L_0x0182
            int r5 = r6.f958e
            goto L_0x0184
        L_0x0182:
            int r5 = r8.f970h
        L_0x0184:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r7 = 4
            int r5 = r5 >> r7
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r0)
            r13[r5] = r7
            r7 = r14[r5]
            int r0 = r4 - r0
            int r0 = java.lang.Math.max(r7, r0)
            r14[r5] = r0
        L_0x019e:
            int r15 = java.lang.Math.max(r15, r4)
            if (r24 == 0) goto L_0x01ac
            int r0 = r8.height
            r5 = -1
            if (r0 != r5) goto L_0x01ac
            r24 = r17
            goto L_0x01ae
        L_0x01ac:
            r24 = 0
        L_0x01ae:
            float r0 = r8.f969g
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c2
            if (r2 == 0) goto L_0x01b9
        L_0x01b6:
            r8 = r22
            goto L_0x01bb
        L_0x01b9:
            r3 = r4
            goto L_0x01b6
        L_0x01bb:
            int r22 = java.lang.Math.max(r8, r3)
            r8 = r22
            goto L_0x01e0
        L_0x01c2:
            r8 = r22
            if (r2 == 0) goto L_0x01c9
        L_0x01c6:
            r2 = r21
            goto L_0x01cb
        L_0x01c9:
            r3 = r4
            goto L_0x01c6
        L_0x01cb:
            int r21 = java.lang.Math.max(r2, r3)
            goto L_0x01e0
        L_0x01d0:
            r31 = r1
            r30 = r3
            r27 = r4
            r2 = r21
            r8 = r22
            r7 = r23
            r1 = 1073741824(0x40000000, float:2.0)
            r29 = r0
        L_0x01e0:
            int r0 = r31 + 0
            r22 = r8
        L_0x01e4:
            int r0 = r0 + 1
            r2 = r1
            r4 = r27
            r3 = r30
            r5 = -1
            r7 = r41
            r8 = 0
            r1 = r0
            r0 = r29
            goto L_0x005e
        L_0x01f4:
            r1 = r2
            r30 = r3
            r27 = r4
            r2 = r21
            r8 = r22
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = -2
            int r3 = r6.f959f
            if (r3 <= 0) goto L_0x0212
            boolean r3 = r6.mo1183a(r9)
            if (r3 == 0) goto L_0x0212
            int r3 = r6.f959f
            int r4 = r6.f965l
            int r3 = r3 + r4
            r6.f959f = r3
        L_0x0212:
            r3 = r13[r17]
            r4 = -1
            if (r3 != r4) goto L_0x0226
            r3 = 0
            r1 = r13[r3]
            if (r1 != r4) goto L_0x0226
            r1 = r13[r16]
            if (r1 != r4) goto L_0x0226
            r1 = 3
            r3 = r13[r1]
            if (r3 == r4) goto L_0x0256
            goto L_0x0227
        L_0x0226:
            r1 = 3
        L_0x0227:
            r3 = r13[r1]
            r4 = 0
            r5 = r13[r4]
            r7 = r13[r17]
            r4 = r13[r16]
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r14[r1]
            r1 = 0
            r5 = r14[r1]
            r1 = r14[r17]
            r7 = r14[r16]
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = java.lang.Math.max(r5, r1)
            int r1 = java.lang.Math.max(r4, r1)
            int r3 = r3 + r1
            int r15 = java.lang.Math.max(r15, r3)
        L_0x0256:
            if (r30 == 0) goto L_0x02a6
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r1) goto L_0x025e
            if (r10 != 0) goto L_0x02a6
        L_0x025e:
            r1 = 0
            r6.f959f = r1
            r3 = r1
        L_0x0262:
            if (r3 >= r9) goto L_0x02a6
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 != 0) goto L_0x0270
            int r4 = r6.f959f
            int r4 = r4 + r1
        L_0x026d:
            r6.f959f = r4
            goto L_0x02a2
        L_0x0270:
            int r1 = r4.getVisibility()
            r5 = 8
            if (r1 != r5) goto L_0x027b
            int r3 = r3 + 0
            goto L_0x02a2
        L_0x027b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            cf$a r1 = (p000.C0190cf.C0191a) r1
            if (r18 == 0) goto L_0x028f
            int r4 = r6.f959f
            int r5 = r1.leftMargin
            int r5 = r5 + r12
            int r1 = r1.rightMargin
            int r5 = r5 + r1
            r7 = 0
            int r5 = r5 + r7
            int r4 = r4 + r5
            goto L_0x026d
        L_0x028f:
            r7 = 0
            int r4 = r6.f959f
            int r5 = r4 + r12
            int r7 = r1.leftMargin
            int r5 = r5 + r7
            int r1 = r1.rightMargin
            int r5 = r5 + r1
            r1 = 0
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r4, r5)
            r6.f959f = r1
        L_0x02a2:
            int r3 = r3 + 1
            r1 = 0
            goto L_0x0262
        L_0x02a6:
            int r1 = r6.f959f
            int r3 = r39.getPaddingLeft()
            int r4 = r39.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r6.f959f = r1
            int r1 = r6.f959f
            int r3 = r39.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r7 = r40
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r7, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r6.f959f
            int r3 = r3 - r4
            if (r20 != 0) goto L_0x031c
            if (r3 == 0) goto L_0x02d5
            int r5 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x02d5
            goto L_0x031c
        L_0x02d5:
            int r0 = java.lang.Math.max(r2, r8)
            if (r30 == 0) goto L_0x0310
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r2) goto L_0x0310
            r2 = 0
        L_0x02e0:
            if (r2 >= r9) goto L_0x0310
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L_0x030d
            int r5 = r3.getVisibility()
            r8 = 8
            if (r5 == r8) goto L_0x030d
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            cf$a r5 = (p000.C0190cf.C0191a) r5
            float r5 = r5.f969g
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x030d
            r5 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
            int r10 = r3.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            r3.measure(r8, r10)
        L_0x030d:
            int r2 = r2 + 1
            goto L_0x02e0
        L_0x0310:
            r12 = r0
            r37 = r1
            r34 = r9
            r8 = r23
            r2 = 0
            r3 = r41
            goto L_0x04b9
        L_0x031c:
            float r5 = r6.f960g
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x0324
            float r0 = r6.f960g
        L_0x0324:
            r5 = -1
            r8 = 3
            r13[r8] = r5
            r13[r16] = r5
            r13[r17] = r5
            r12 = 0
            r13[r12] = r5
            r14[r8] = r5
            r14[r16] = r5
            r14[r17] = r5
            r14[r12] = r5
            r6.f959f = r12
            r12 = r2
            r15 = r5
            r8 = r23
            r2 = r0
            r0 = 0
        L_0x033f:
            if (r0 >= r9) goto L_0x045f
            android.view.View r5 = r6.getChildAt(r0)
            if (r5 == 0) goto L_0x0447
            int r4 = r5.getVisibility()
            r7 = 8
            if (r4 == r7) goto L_0x0447
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            cf$a r4 = (p000.C0190cf.C0191a) r4
            float r7 = r4.f969g
            int r20 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r20 <= 0) goto L_0x03b0
            r34 = r9
            float r9 = (float) r3
            float r9 = r9 * r7
            float r9 = r9 / r2
            int r9 = (int) r9
            float r2 = r2 - r7
            int r3 = r3 - r9
            int r7 = r39.getPaddingTop()
            int r20 = r39.getPaddingBottom()
            int r7 = r7 + r20
            r35 = r2
            int r2 = r4.topMargin
            int r7 = r7 + r2
            int r2 = r4.bottomMargin
            int r7 = r7 + r2
            int r2 = r4.height
            r37 = r1
            r36 = r3
            r1 = -1
            r3 = r41
            int r2 = getChildMeasureSpec(r3, r7, r2)
            int r7 = r4.width
            if (r7 != 0) goto L_0x0391
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x038b
            goto L_0x0391
        L_0x038b:
            if (r9 <= 0) goto L_0x038f
            r7 = r9
            goto L_0x0399
        L_0x038f:
            r7 = 0
            goto L_0x0399
        L_0x0391:
            int r7 = r5.getMeasuredWidth()
            int r7 = r7 + r9
            if (r7 >= 0) goto L_0x0399
            goto L_0x038f
        L_0x0399:
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r5.measure(r7, r2)
            int r2 = r5.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r7
            int r8 = android.view.View.combineMeasuredStates(r8, r2)
            r2 = r35
            goto L_0x03ba
        L_0x03b0:
            r37 = r1
            r7 = r3
            r34 = r9
            r1 = -1
            r3 = r41
            r36 = r7
        L_0x03ba:
            if (r18 == 0) goto L_0x03d0
            int r7 = r6.f959f
            int r9 = r5.getMeasuredWidth()
            int r1 = r4.leftMargin
            int r9 = r9 + r1
            int r1 = r4.rightMargin
            int r9 = r9 + r1
            r1 = 0
            int r9 = r9 + r1
            int r7 = r7 + r9
            r6.f959f = r7
        L_0x03cd:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x03e7
        L_0x03d0:
            r1 = 0
            int r7 = r6.f959f
            int r9 = r5.getMeasuredWidth()
            int r9 = r9 + r7
            int r1 = r4.leftMargin
            int r9 = r9 + r1
            int r1 = r4.rightMargin
            int r9 = r9 + r1
            r1 = 0
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r7, r9)
            r6.f959f = r1
            goto L_0x03cd
        L_0x03e7:
            if (r11 == r1) goto L_0x03f1
            int r1 = r4.height
            r7 = -1
            if (r1 != r7) goto L_0x03f1
            r1 = r17
            goto L_0x03f2
        L_0x03f1:
            r1 = 0
        L_0x03f2:
            int r7 = r4.topMargin
            int r9 = r4.bottomMargin
            int r7 = r7 + r9
            int r9 = r5.getMeasuredHeight()
            int r9 = r9 + r7
            int r15 = java.lang.Math.max(r15, r9)
            if (r1 == 0) goto L_0x0403
            goto L_0x0404
        L_0x0403:
            r7 = r9
        L_0x0404:
            int r1 = java.lang.Math.max(r12, r7)
            if (r24 == 0) goto L_0x0412
            int r7 = r4.height
            r12 = -1
            if (r7 != r12) goto L_0x0413
            r7 = r17
            goto L_0x0414
        L_0x0412:
            r12 = -1
        L_0x0413:
            r7 = 0
        L_0x0414:
            if (r27 == 0) goto L_0x0441
            int r5 = r5.getBaseline()
            if (r5 == r12) goto L_0x0441
            int r12 = r4.f970h
            if (r12 >= 0) goto L_0x0423
            int r4 = r6.f958e
            goto L_0x0425
        L_0x0423:
            int r4 = r4.f970h
        L_0x0425:
            r4 = r4 & 112(0x70, float:1.57E-43)
            r20 = 4
            int r4 = r4 >> 4
            r4 = r4 & -2
            int r4 = r4 >> 1
            r12 = r13[r4]
            int r12 = java.lang.Math.max(r12, r5)
            r13[r4] = r12
            r12 = r14[r4]
            int r9 = r9 - r5
            int r5 = java.lang.Math.max(r12, r9)
            r14[r4] = r5
            goto L_0x0443
        L_0x0441:
            r20 = 4
        L_0x0443:
            r12 = r1
            r24 = r7
            goto L_0x0452
        L_0x0447:
            r37 = r1
            r7 = r3
            r34 = r9
            r3 = r41
            r20 = 4
            r36 = r7
        L_0x0452:
            int r0 = r0 + 1
            r9 = r34
            r3 = r36
            r1 = r37
            r5 = -1
            r7 = r40
            goto L_0x033f
        L_0x045f:
            r37 = r1
            r34 = r9
            r3 = r41
            int r0 = r6.f959f
            int r1 = r39.getPaddingLeft()
            int r2 = r39.getPaddingRight()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r6.f959f = r0
            r0 = r13[r17]
            r1 = -1
            if (r0 != r1) goto L_0x0489
            r0 = 0
            r2 = r13[r0]
            if (r2 != r1) goto L_0x0489
            r0 = r13[r16]
            if (r0 != r1) goto L_0x0489
            r0 = 3
            r2 = r13[r0]
            if (r2 == r1) goto L_0x0487
            goto L_0x048a
        L_0x0487:
            r2 = 0
            goto L_0x04b9
        L_0x0489:
            r0 = 3
        L_0x048a:
            r1 = r13[r0]
            r2 = 0
            r4 = r13[r2]
            r5 = r13[r17]
            r7 = r13[r16]
            int r5 = java.lang.Math.max(r5, r7)
            int r4 = java.lang.Math.max(r4, r5)
            int r1 = java.lang.Math.max(r1, r4)
            r0 = r14[r0]
            r4 = r14[r2]
            r5 = r14[r17]
            r7 = r14[r16]
            int r5 = java.lang.Math.max(r5, r7)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r15, r1)
            r15 = r0
        L_0x04b9:
            if (r24 != 0) goto L_0x04c0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 == r0) goto L_0x04c0
            goto L_0x04c1
        L_0x04c0:
            r12 = r15
        L_0x04c1:
            int r0 = r39.getPaddingTop()
            int r1 = r39.getPaddingBottom()
            int r0 = r0 + r1
            int r12 = r12 + r0
            int r0 = r39.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r12, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r8
            r1 = r37 | r1
            int r4 = r8 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r4)
            r6.setMeasuredDimension(r1, r0)
            if (r25 == 0) goto L_0x0529
            int r0 = r39.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r2
            r8 = r34
        L_0x04f0:
            if (r9 >= r8) goto L_0x0529
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r5 = 8
            if (r0 == r5) goto L_0x0524
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            cf$a r10 = (p000.C0190cf.C0191a) r10
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0521
            int r11 = r10.width
            int r0 = r1.getMeasuredWidth()
            r10.width = r0
            r3 = 0
            r12 = 0
            r0 = r6
            r13 = r2
            r2 = r40
            r4 = r7
            r14 = r5
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.width = r11
            goto L_0x0526
        L_0x0521:
            r13 = r2
            r14 = r5
            goto L_0x0526
        L_0x0524:
            r14 = r5
            r13 = -1
        L_0x0526:
            int r9 = r9 + 1
            goto L_0x04f0
        L_0x0529:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0190cf.m619b(int, int):void");
    }

    /* renamed from: b */
    private void m620b(Canvas canvas, int i) {
        this.f964k.setBounds(i, getPaddingTop() + this.f968o, this.f965l + i, (getHeight() - getPaddingBottom()) - this.f968o);
        this.f964k.draw(canvas);
    }

    /* renamed from: b */
    private static void m621b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private static int getChildrenSkipCount$5359dca7() {
        return 0;
    }

    private static int getLocationOffset$3c7ec8d0() {
        return 0;
    }

    private static int getNextLocationOffset$3c7ec8d0() {
        return 0;
    }

    /* renamed from: a */
    public C0191a generateLayoutParams(AttributeSet attributeSet) {
        return new C0191a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1183a(int i) {
        if (i == 0) {
            return (this.f967n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f967n & 4) != 0;
        }
        if ((this.f967n & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public C0191a generateLayoutParams(LayoutParams layoutParams) {
        return new C0191a(layoutParams);
    }

    /* renamed from: c */
    public C0191a generateDefaultLayoutParams() {
        if (this.f957d == 0) {
            return new C0191a(-2, -2);
        }
        if (this.f957d == 1) {
            return new C0191a(-1, -2);
        }
        return null;
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0191a;
    }

    public int getBaseline() {
        if (this.f955b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f955b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f955b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i = this.f956c;
            if (this.f957d == 1) {
                int i2 = this.f958e & C0126j.AppCompatTheme_windowActionBarOverlay;
                if (i2 != 48) {
                    if (i2 == 16) {
                        i += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f959f) / 2;
                    } else if (i2 == 80) {
                        i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f959f;
                    }
                }
            }
            return i + ((C0191a) childAt.getLayoutParams()).topMargin + baseline;
        } else if (this.f955b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f955b;
    }

    public Drawable getDividerDrawable() {
        return this.f964k;
    }

    public int getDividerPadding() {
        return this.f968o;
    }

    public int getDividerWidth() {
        return this.f965l;
    }

    public int getGravity() {
        return this.f958e;
    }

    public int getOrientation() {
        return this.f957d;
    }

    public int getShowDividers() {
        return this.f967n;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f960g;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int left;
        int i2;
        if (this.f964k != null) {
            int i3 = 0;
            if (this.f957d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i3 < virtualChildCount) {
                    View childAt = getChildAt(i3);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo1183a(i3))) {
                        m617a(canvas, (childAt.getTop() - ((C0191a) childAt.getLayoutParams()).topMargin) - this.f966m);
                    }
                    i3++;
                }
                if (mo1183a(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    m617a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f966m : childAt2.getBottom() + ((C0191a) childAt2.getLayoutParams()).bottomMargin);
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = C0225cx.m739a(this);
            while (i3 < virtualChildCount2) {
                View childAt3 = getChildAt(i3);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo1183a(i3))) {
                    C0191a aVar = (C0191a) childAt3.getLayoutParams();
                    m620b(canvas, a ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.f965l);
                }
                i3++;
            }
            if (mo1183a(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    C0191a aVar2 = (C0191a) childAt4.getLayoutParams();
                    if (a) {
                        left = childAt4.getLeft();
                        i2 = aVar2.leftMargin;
                    } else {
                        i = childAt4.getRight() + aVar2.rightMargin;
                        m620b(canvas, i);
                    }
                } else if (a) {
                    i = getPaddingLeft();
                    m620b(canvas, i);
                } else {
                    left = getWidth();
                    i2 = getPaddingRight();
                }
                i = (left - i2) - this.f965l;
                m620b(canvas, i);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0190cf.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0190cf.class.getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            r24 = this;
            r0 = r24
            int r5 = r0.f957d
            r6 = 5
            r7 = 8
            r8 = 80
            r9 = 16
            r10 = 8388615(0x800007, float:1.1754953E-38)
            r11 = 2
            r12 = 1
            if (r5 != r12) goto L_0x00b5
            int r5 = r24.getPaddingLeft()
            int r1 = r28 - r26
            int r3 = r24.getPaddingRight()
            int r3 = r1 - r3
            int r1 = r1 - r5
            int r14 = r24.getPaddingRight()
            int r1 = r1 - r14
            int r14 = r24.getVirtualChildCount()
            int r15 = r0.f958e
            r15 = r15 & 112(0x70, float:1.57E-43)
            int r13 = r0.f958e
            r10 = r10 & r13
            if (r15 == r9) goto L_0x0045
            if (r15 == r8) goto L_0x0038
            int r2 = r24.getPaddingTop()
            goto L_0x0050
        L_0x0038:
            int r8 = r24.getPaddingTop()
            int r8 = r8 + r29
            int r8 = r8 - r27
            int r2 = r0.f959f
            int r2 = r8 - r2
            goto L_0x0050
        L_0x0045:
            int r8 = r24.getPaddingTop()
            int r2 = r29 - r27
            int r4 = r0.f959f
            int r2 = r2 - r4
            int r2 = r2 / r11
            int r2 = r2 + r8
        L_0x0050:
            r4 = r2
            r2 = 0
        L_0x0052:
            if (r2 >= r14) goto L_0x00b4
            android.view.View r8 = r0.getChildAt(r2)
            if (r8 != 0) goto L_0x005d
            int r4 = r4 + 0
            goto L_0x00af
        L_0x005d:
            int r9 = r8.getVisibility()
            if (r9 == r7) goto L_0x00af
            int r9 = r8.getMeasuredWidth()
            int r13 = r8.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r8.getLayoutParams()
            cf$a r15 = (p000.C0190cf.C0191a) r15
            int r7 = r15.f970h
            if (r7 >= 0) goto L_0x0076
            r7 = r10
        L_0x0076:
            int r11 = p000.C0396gq.m1264b(r24)
            int r7 = p000.C0384gf.m1231a(r7, r11)
            r7 = r7 & 7
            if (r7 == r12) goto L_0x008b
            if (r7 == r6) goto L_0x0088
            int r7 = r15.leftMargin
            int r7 = r7 + r5
            goto L_0x0096
        L_0x0088:
            int r7 = r3 - r9
            goto L_0x0093
        L_0x008b:
            int r7 = r1 - r9
            r11 = 2
            int r7 = r7 / r11
            int r7 = r7 + r5
            int r11 = r15.leftMargin
            int r7 = r7 + r11
        L_0x0093:
            int r11 = r15.rightMargin
            int r7 = r7 - r11
        L_0x0096:
            boolean r11 = r0.mo1183a(r2)
            if (r11 == 0) goto L_0x009f
            int r11 = r0.f966m
            int r4 = r4 + r11
        L_0x009f:
            int r11 = r15.topMargin
            int r4 = r4 + r11
            int r11 = r4 + 0
            m621b(r8, r7, r11, r9, r13)
            int r7 = r15.bottomMargin
            int r13 = r13 + r7
            r7 = 0
            int r13 = r13 + r7
            int r4 = r4 + r13
            int r2 = r2 + 0
        L_0x00af:
            int r2 = r2 + r12
            r7 = 8
            r11 = 2
            goto L_0x0052
        L_0x00b4:
            return
        L_0x00b5:
            boolean r5 = p000.C0225cx.m739a(r24)
            int r7 = r24.getPaddingTop()
            int r2 = r29 - r27
            int r4 = r24.getPaddingBottom()
            int r4 = r2 - r4
            int r2 = r2 - r7
            int r11 = r24.getPaddingBottom()
            int r2 = r2 - r11
            int r11 = r24.getVirtualChildCount()
            int r13 = r0.f958e
            r10 = r10 & r13
            int r13 = r0.f958e
            r13 = r13 & 112(0x70, float:1.57E-43)
            boolean r14 = r0.f954a
            int[] r15 = r0.f962i
            int[] r8 = r0.f963j
            int r9 = p000.C0396gq.m1264b(r24)
            int r9 = p000.C0384gf.m1231a(r10, r9)
            if (r9 == r12) goto L_0x00fa
            if (r9 == r6) goto L_0x00ed
            int r1 = r24.getPaddingLeft()
            goto L_0x0106
        L_0x00ed:
            int r6 = r24.getPaddingLeft()
            int r6 = r6 + r28
            int r6 = r6 - r26
            int r1 = r0.f959f
            int r1 = r6 - r1
            goto L_0x0106
        L_0x00fa:
            int r6 = r24.getPaddingLeft()
            int r1 = r28 - r26
            int r3 = r0.f959f
            int r1 = r1 - r3
            r3 = 2
            int r1 = r1 / r3
            int r1 = r1 + r6
        L_0x0106:
            if (r5 == 0) goto L_0x010c
            int r5 = r11 + -1
            r6 = -1
            goto L_0x010e
        L_0x010c:
            r6 = r12
            r5 = 0
        L_0x010e:
            r9 = r1
            r1 = 0
        L_0x0110:
            if (r1 >= r11) goto L_0x01dc
            int r10 = r6 * r1
            int r10 = r10 + r5
            android.view.View r12 = r0.getChildAt(r10)
            if (r12 != 0) goto L_0x012c
            int r9 = r9 + 0
            r18 = r5
            r19 = r6
            r20 = r11
            r21 = r13
            r22 = r14
            r3 = 1
            r5 = 0
            r14 = -1
            goto L_0x01ce
        L_0x012c:
            int r3 = r12.getVisibility()
            r18 = r5
            r5 = 8
            if (r3 == r5) goto L_0x01c3
            int r3 = r12.getMeasuredWidth()
            int r5 = r12.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r12.getLayoutParams()
            r19 = r6
            r6 = r16
            cf$a r6 = (p000.C0190cf.C0191a) r6
            if (r14 == 0) goto L_0x0158
            r20 = r11
            int r11 = r6.height
            r21 = r13
            r13 = -1
            if (r11 == r13) goto L_0x015c
            int r11 = r12.getBaseline()
            goto L_0x015d
        L_0x0158:
            r20 = r11
            r21 = r13
        L_0x015c:
            r11 = -1
        L_0x015d:
            int r13 = r6.f970h
            if (r13 >= 0) goto L_0x0163
            r13 = r21
        L_0x0163:
            r13 = r13 & 112(0x70, float:1.57E-43)
            r22 = r14
            r14 = 16
            if (r13 == r14) goto L_0x019d
            r14 = 48
            if (r13 == r14) goto L_0x018c
            r14 = 80
            if (r13 == r14) goto L_0x0176
            r11 = r7
            r14 = -1
            goto L_0x01a9
        L_0x0176:
            int r13 = r4 - r5
            int r14 = r6.bottomMargin
            int r13 = r13 - r14
            r14 = -1
            if (r11 == r14) goto L_0x019b
            int r16 = r12.getMeasuredHeight()
            int r16 = r16 - r11
            r11 = 2
            r17 = r8[r11]
            int r17 = r17 - r16
            int r11 = r13 - r17
            goto L_0x01a9
        L_0x018c:
            r14 = -1
            int r13 = r6.topMargin
            int r13 = r13 + r7
            if (r11 == r14) goto L_0x019b
            r16 = 1
            r17 = r15[r16]
            int r17 = r17 - r11
            int r11 = r13 + r17
            goto L_0x01a9
        L_0x019b:
            r11 = r13
            goto L_0x01a9
        L_0x019d:
            r14 = -1
            int r11 = r2 - r5
            r13 = 2
            int r11 = r11 / r13
            int r11 = r11 + r7
            int r13 = r6.topMargin
            int r11 = r11 + r13
            int r13 = r6.bottomMargin
            int r11 = r11 - r13
        L_0x01a9:
            boolean r10 = r0.mo1183a(r10)
            if (r10 == 0) goto L_0x01b2
            int r10 = r0.f965l
            int r9 = r9 + r10
        L_0x01b2:
            int r10 = r6.leftMargin
            int r9 = r9 + r10
            int r10 = r9 + 0
            m621b(r12, r10, r11, r3, r5)
            int r5 = r6.rightMargin
            int r3 = r3 + r5
            r5 = 0
            int r3 = r3 + r5
            int r9 = r9 + r3
            int r1 = r1 + 0
            goto L_0x01cd
        L_0x01c3:
            r19 = r6
            r20 = r11
            r21 = r13
            r22 = r14
            r5 = 0
            r14 = -1
        L_0x01cd:
            r3 = 1
        L_0x01ce:
            int r1 = r1 + r3
            r12 = r3
            r5 = r18
            r6 = r19
            r11 = r20
            r13 = r21
            r14 = r22
            goto L_0x0110
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0190cf.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.f957d
            r9 = 1
            if (r0 != r9) goto L_0x0382
            r10 = 0
            r6.f959f = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int r14 = r6.f955b
            boolean r15 = r6.f961h
            r16 = 0
            r18 = r9
            r1 = r10
            r2 = r1
            r4 = r2
            r5 = r4
            r9 = r5
            r17 = r9
            r19 = r17
            r20 = r19
            r0 = r16
        L_0x002f:
            if (r5 >= r11) goto L_0x0195
            android.view.View r3 = r6.getChildAt(r5)
            if (r3 != 0) goto L_0x0043
            int r3 = r6.f959f
            int r3 = r3 + r10
            r6.f959f = r3
            r27 = r11
            r26 = r13
            r3 = 1
            goto L_0x018b
        L_0x0043:
            int r10 = r3.getVisibility()
            r23 = r1
            r1 = 8
            if (r10 == r1) goto L_0x0173
            boolean r1 = r6.mo1183a(r5)
            if (r1 == 0) goto L_0x005a
            int r1 = r6.f959f
            int r10 = r6.f966m
            int r1 = r1 + r10
            r6.f959f = r1
        L_0x005a:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            r10 = r1
            cf$a r10 = (p000.C0190cf.C0191a) r10
            float r1 = r10.f969g
            float r21 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x0098
            int r0 = r10.height
            if (r0 != 0) goto L_0x0098
            float r0 = r10.f969g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            int r0 = r6.f959f
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r24 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f959f = r0
            r7 = r3
            r31 = r4
            r32 = r5
            r28 = r9
            r27 = r11
            r26 = r13
            r29 = r20
            r30 = r23
            r2 = r24
            r17 = 1
            goto L_0x00fe
        L_0x0098:
            r24 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a9
            float r0 = r10.f969g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a9
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00ab
        L_0x00a9:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ab:
            r22 = 0
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00b6
            int r0 = r6.f959f
            r25 = r0
            goto L_0x00b8
        L_0x00b6:
            r25 = 0
        L_0x00b8:
            r0 = r6
            r26 = r13
            r13 = r23
            r23 = 1073741824(0x40000000, float:2.0)
            r1 = r3
            r28 = r9
            r27 = r11
            r9 = r24
            r11 = r2
            r2 = r7
            r7 = r3
            r30 = r13
            r29 = r20
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r22
            r31 = r4
            r4 = r8
            r32 = r5
            r5 = r25
            r0.m618a(r1, r2, r3, r4, r5)
            if (r11 == r13) goto L_0x00df
            r10.height = r11
        L_0x00df:
            int r0 = r7.getMeasuredHeight()
            int r1 = r6.f959f
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f959f = r1
            if (r15 == 0) goto L_0x00fd
            int r0 = java.lang.Math.max(r0, r9)
            r2 = r0
            goto L_0x00fe
        L_0x00fd:
            r2 = r9
        L_0x00fe:
            if (r14 < 0) goto L_0x010b
            r1 = r32
            int r5 = r1 + 1
            if (r14 != r5) goto L_0x010d
            int r0 = r6.f959f
            r6.f956c = r0
            goto L_0x010d
        L_0x010b:
            r1 = r32
        L_0x010d:
            if (r1 >= r14) goto L_0x011d
            float r0 = r10.f969g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x011d:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x012a
            int r0 = r10.width
            r3 = -1
            if (r0 != r3) goto L_0x012b
            r0 = 1
            r19 = 1
            goto L_0x012c
        L_0x012a:
            r3 = -1
        L_0x012b:
            r0 = 0
        L_0x012c:
            int r4 = r10.leftMargin
            int r5 = r10.rightMargin
            int r4 = r4 + r5
            int r5 = r7.getMeasuredWidth()
            int r5 = r5 + r4
            r11 = r30
            int r9 = java.lang.Math.max(r11, r5)
            int r7 = r7.getMeasuredState()
            r13 = r28
            int r7 = android.view.View.combineMeasuredStates(r13, r7)
            if (r18 == 0) goto L_0x014f
            int r11 = r10.width
            if (r11 != r3) goto L_0x014f
            r18 = 1
            goto L_0x0151
        L_0x014f:
            r18 = 0
        L_0x0151:
            float r3 = r10.f969g
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0167
            if (r0 == 0) goto L_0x015c
        L_0x0159:
            r10 = r29
            goto L_0x015e
        L_0x015c:
            r4 = r5
            goto L_0x0159
        L_0x015e:
            int r20 = java.lang.Math.max(r10, r4)
            r10 = r20
            r4 = r31
            goto L_0x0182
        L_0x0167:
            r10 = r29
            if (r0 == 0) goto L_0x016c
            r5 = r4
        L_0x016c:
            r4 = r31
            int r4 = java.lang.Math.max(r4, r5)
            goto L_0x0182
        L_0x0173:
            r1 = r5
            r27 = r11
            r26 = r13
            r10 = r20
            r11 = r23
            r13 = r9
            r9 = r2
            r21 = r0
            r9 = r11
            r7 = r13
        L_0x0182:
            int r5 = r1 + 0
            r1 = r9
            r20 = r10
            r0 = r21
            r3 = 1
            r9 = r7
        L_0x018b:
            int r5 = r5 + r3
            r13 = r26
            r11 = r27
            r7 = r39
            r10 = 0
            goto L_0x002f
        L_0x0195:
            r27 = r11
            r26 = r13
            r10 = r20
            r3 = -1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r1
            r1 = r9
            r9 = r2
            int r2 = r6.f959f
            if (r2 <= 0) goto L_0x01b5
            r2 = r27
            boolean r5 = r6.mo1183a(r2)
            if (r5 == 0) goto L_0x01b7
            int r5 = r6.f959f
            int r7 = r6.f966m
            int r5 = r5 + r7
            r6.f959f = r5
            goto L_0x01b7
        L_0x01b5:
            r2 = r27
        L_0x01b7:
            if (r15 == 0) goto L_0x0203
            r5 = r26
            if (r5 == r13) goto L_0x01c3
            if (r5 != 0) goto L_0x01c0
            goto L_0x01c3
        L_0x01c0:
            r33 = r1
            goto L_0x0207
        L_0x01c3:
            r7 = 0
            r6.f959f = r7
            r13 = r7
        L_0x01c7:
            if (r13 >= r2) goto L_0x01c0
            android.view.View r14 = r6.getChildAt(r13)
            if (r14 != 0) goto L_0x01d5
            int r14 = r6.f959f
            int r14 = r14 + r7
            r6.f959f = r14
            goto L_0x01df
        L_0x01d5:
            int r7 = r14.getVisibility()
            r3 = 8
            if (r7 != r3) goto L_0x01e2
            int r13 = r13 + 0
        L_0x01df:
            r33 = r1
            goto L_0x01fc
        L_0x01e2:
            android.view.ViewGroup$LayoutParams r3 = r14.getLayoutParams()
            cf$a r3 = (p000.C0190cf.C0191a) r3
            int r7 = r6.f959f
            int r14 = r7 + r9
            r33 = r1
            int r1 = r3.topMargin
            int r14 = r14 + r1
            int r1 = r3.bottomMargin
            int r14 = r14 + r1
            r1 = 0
            int r14 = r14 + r1
            int r1 = java.lang.Math.max(r7, r14)
            r6.f959f = r1
        L_0x01fc:
            r1 = 1
            int r13 = r13 + r1
            r1 = r33
            r3 = -1
            r7 = 0
            goto L_0x01c7
        L_0x0203:
            r33 = r1
            r5 = r26
        L_0x0207:
            r1 = 1
            int r3 = r6.f959f
            int r7 = r38.getPaddingTop()
            int r13 = r38.getPaddingBottom()
            int r7 = r7 + r13
            int r3 = r3 + r7
            r6.f959f = r3
            int r3 = r6.f959f
            int r7 = r38.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r3, r7)
            r7 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r7)
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            r7 = r7 & r3
            int r13 = r6.f959f
            int r7 = r7 - r13
            if (r17 != 0) goto L_0x0276
            if (r7 == 0) goto L_0x0235
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x0235
            goto L_0x0276
        L_0x0235:
            int r0 = java.lang.Math.max(r4, r10)
            if (r15 == 0) goto L_0x0270
            r1 = 1073741824(0x40000000, float:2.0)
            if (r5 == r1) goto L_0x0270
            r1 = 0
        L_0x0240:
            if (r1 >= r2) goto L_0x0270
            android.view.View r4 = r6.getChildAt(r1)
            if (r4 == 0) goto L_0x026d
            int r5 = r4.getVisibility()
            r7 = 8
            if (r5 == r7) goto L_0x026d
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            cf$a r5 = (p000.C0190cf.C0191a) r5
            float r5 = r5.f969g
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x026d
            int r5 = r4.getMeasuredWidth()
            r7 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r4.measure(r5, r10)
        L_0x026d:
            int r1 = r1 + 1
            goto L_0x0240
        L_0x0270:
            r9 = r33
            r10 = r39
            goto L_0x035c
        L_0x0276:
            float r9 = r6.f960g
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x027e
            float r0 = r6.f960g
        L_0x027e:
            r9 = 0
            r6.f959f = r9
            r10 = r0
            r9 = r33
            r0 = 0
        L_0x0285:
            if (r0 >= r2) goto L_0x034b
            android.view.View r13 = r6.getChildAt(r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 == r15) goto L_0x0341
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            cf$a r14 = (p000.C0190cf.C0191a) r14
            float r1 = r14.f969g
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 <= 0) goto L_0x02ee
            float r15 = (float) r7
            float r15 = r15 * r1
            float r15 = r15 / r10
            int r15 = (int) r15
            float r10 = r10 - r1
            int r7 = r7 - r15
            int r1 = r38.getPaddingLeft()
            int r17 = r38.getPaddingRight()
            int r1 = r1 + r17
            r34 = r7
            int r7 = r14.leftMargin
            int r1 = r1 + r7
            int r7 = r14.rightMargin
            int r1 = r1 + r7
            int r7 = r14.width
            r35 = r10
            r10 = r39
            int r1 = getChildMeasureSpec(r10, r1, r7)
            int r7 = r14.height
            if (r7 != 0) goto L_0x02d1
            r7 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x02ca
            goto L_0x02d1
        L_0x02ca:
            if (r15 <= 0) goto L_0x02cd
            goto L_0x02da
        L_0x02cd:
            r7 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            goto L_0x02dc
        L_0x02d1:
            int r7 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            if (r7 >= 0) goto L_0x02d9
            r7 = 0
        L_0x02d9:
            r15 = r7
        L_0x02da:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x02dc:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            r13.measure(r1, r15)
            int r1 = r13.getMeasuredState()
            r1 = r1 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r1)
            goto L_0x02f5
        L_0x02ee:
            r1 = r10
            r10 = r39
            r35 = r1
            r34 = r7
        L_0x02f5:
            int r1 = r14.leftMargin
            int r7 = r14.rightMargin
            int r1 = r1 + r7
            int r7 = r13.getMeasuredWidth()
            int r7 = r7 + r1
            int r11 = java.lang.Math.max(r11, r7)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x0310
            int r15 = r14.width
            r36 = r1
            r1 = -1
            if (r15 != r1) goto L_0x0313
            r15 = 1
            goto L_0x0314
        L_0x0310:
            r36 = r1
            r1 = -1
        L_0x0313:
            r15 = 0
        L_0x0314:
            if (r15 == 0) goto L_0x0318
            r7 = r36
        L_0x0318:
            int r4 = java.lang.Math.max(r4, r7)
            if (r18 == 0) goto L_0x0324
            int r7 = r14.width
            if (r7 != r1) goto L_0x0324
            r7 = 1
            goto L_0x0325
        L_0x0324:
            r7 = 0
        L_0x0325:
            int r15 = r6.f959f
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r15
            int r1 = r14.topMargin
            int r13 = r13 + r1
            int r1 = r14.bottomMargin
            int r13 = r13 + r1
            r1 = 0
            int r13 = r13 + r1
            int r13 = java.lang.Math.max(r15, r13)
            r6.f959f = r13
            r18 = r7
            r7 = r34
            r13 = r35
            goto L_0x0345
        L_0x0341:
            r13 = r10
            r1 = 0
            r10 = r39
        L_0x0345:
            int r0 = r0 + 1
            r10 = r13
            r1 = 1
            goto L_0x0285
        L_0x034b:
            r10 = r39
            int r0 = r6.f959f
            int r1 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r1 = r1 + r5
            int r0 = r0 + r1
            r6.f959f = r0
            r0 = r4
        L_0x035c:
            if (r18 != 0) goto L_0x0363
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0363
            r11 = r0
        L_0x0363:
            int r0 = r38.getPaddingLeft()
            int r1 = r38.getPaddingRight()
            int r0 = r0 + r1
            int r11 = r11 + r0
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r11, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r10, r9)
            r6.setMeasuredDimension(r0, r3)
            if (r19 == 0) goto L_0x0381
            r6.m616a(r2, r8)
        L_0x0381:
            return
        L_0x0382:
            r10 = r7
            r38.m619b(r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0190cf.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f954a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f955b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f964k) {
            this.f964k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f965l = drawable.getIntrinsicWidth();
                this.f966m = drawable.getIntrinsicHeight();
            } else {
                this.f965l = 0;
                this.f966m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f968o = i;
    }

    public void setGravity(int i) {
        if (this.f958e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & C0126j.AppCompatTheme_windowActionBarOverlay) == 0) {
                i |= 48;
            }
            this.f958e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((8388615 & this.f958e) != i2) {
            this.f958e = i2 | (this.f958e & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f961h = z;
    }

    public void setOrientation(int i) {
        if (this.f957d != i) {
            this.f957d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f967n) {
            requestLayout();
        }
        this.f967n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & C0126j.AppCompatTheme_windowActionBarOverlay;
        if ((this.f958e & C0126j.AppCompatTheme_windowActionBarOverlay) != i2) {
            this.f958e = i2 | (this.f958e & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f960g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
