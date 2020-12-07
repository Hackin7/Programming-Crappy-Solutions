package a.b.p;

import a.b.j;
import a.h.m.d;
import a.h.m.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class i0 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public boolean f334b;

    /* renamed from: c  reason: collision with root package name */
    public int f335c;

    /* renamed from: d  reason: collision with root package name */
    public int f336d;

    /* renamed from: e  reason: collision with root package name */
    public int f337e;

    /* renamed from: f  reason: collision with root package name */
    public int f338f;

    /* renamed from: g  reason: collision with root package name */
    public int f339g;
    public float h;
    public boolean i;
    public int[] j;
    public int[] k;
    public Drawable l;
    public int m;
    public int n;
    public int o;
    public int p;

    public i0(Context context) {
        this(context, null);
    }

    public i0(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public i0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f334b = true;
        this.f335c = -1;
        this.f336d = 0;
        this.f338f = 8388659;
        w0 a2 = w0.u(context, attrs, j.LinearLayoutCompat, defStyleAttr, 0);
        s.X(this, context, j.LinearLayoutCompat, attrs, a2.q(), defStyleAttr, 0);
        int index = a2.j(j.LinearLayoutCompat_android_orientation, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a2.j(j.LinearLayoutCompat_android_gravity, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a2.a(j.LinearLayoutCompat_android_baselineAligned, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.h = a2.h(j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f335c = a2.j(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.i = a2.a(j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.f(j.LinearLayoutCompat_divider));
        this.o = a2.j(j.LinearLayoutCompat_showDividers, 0);
        this.p = a2.e(j.LinearLayoutCompat_dividerPadding, 0);
        a2.v();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.o) {
            requestLayout();
        }
        this.o = showDividers;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.o;
    }

    public Drawable getDividerDrawable() {
        return this.l;
    }

    public void setDividerDrawable(Drawable divider) {
        if (divider != this.l) {
            this.l = divider;
            boolean z = false;
            if (divider != null) {
                this.m = divider.getIntrinsicWidth();
                this.n = divider.getIntrinsicHeight();
            } else {
                this.m = 0;
                this.n = 0;
            }
            if (divider == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int padding) {
        this.p = padding;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public void onDraw(Canvas canvas) {
        if (this.l != null) {
            if (this.f337e == 1) {
                h(canvas);
            } else {
                g(canvas);
            }
        }
    }

    public void h(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = s(i2);
            if (!(child == null || child.getVisibility() == 8 || !t(i2))) {
                i(canvas, (child.getTop() - ((ViewGroup.MarginLayoutParams) ((a) child.getLayoutParams())).topMargin) - this.n);
            }
        }
        if (t(count)) {
            View child2 = s(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.n;
            } else {
                bottom = child2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) child2.getLayoutParams())).bottomMargin;
            }
            i(canvas, bottom);
        }
    }

    public void g(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = d1.b(this);
        for (int i2 = 0; i2 < count; i2++) {
            View child = s(i2);
            if (!(child == null || child.getVisibility() == 8 || !t(i2))) {
                a lp = (a) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else {
                    position2 = (child.getLeft() - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - this.m;
                }
                j(canvas, position2);
            }
        }
        if (t(count)) {
            View child2 = s(count - 1);
            if (child2 != null) {
                a lp2 = (a) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - ((ViewGroup.MarginLayoutParams) lp2).leftMargin) - this.m;
                } else {
                    position = child2.getRight() + ((ViewGroup.MarginLayoutParams) lp2).rightMargin;
                }
            } else if (isLayoutRtl) {
                position = getPaddingLeft();
            } else {
                position = (getWidth() - getPaddingRight()) - this.m;
            }
            j(canvas, position);
        }
    }

    public void i(Canvas canvas, int top) {
        this.l.setBounds(getPaddingLeft() + this.p, top, (getWidth() - getPaddingRight()) - this.p, this.n + top);
        this.l.draw(canvas);
    }

    public void j(Canvas canvas, int left) {
        this.l.setBounds(left, getPaddingTop() + this.p, this.m + left, (getHeight() - getPaddingBottom()) - this.p);
        this.l.draw(canvas);
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.f334b = baselineAligned;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.i = enabled;
    }

    public int getBaseline() {
        int majorGravity;
        if (this.f335c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f335c;
        if (childCount > i2) {
            View child = getChildAt(i2);
            int childBaseline = child.getBaseline();
            if (childBaseline != -1) {
                int childTop = this.f336d;
                if (this.f337e == 1 && (majorGravity = this.f338f & 112) != 48) {
                    if (majorGravity == 16) {
                        childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f339g) / 2;
                    } else if (majorGravity == 80) {
                        childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.f339g;
                    }
                }
                return ((ViewGroup.MarginLayoutParams) ((a) child.getLayoutParams())).topMargin + childTop + childBaseline;
            } else if (this.f335c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f335c;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f335c = i2;
    }

    public View s(int index) {
        return getChildAt(index);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public void setWeightSum(float weightSum) {
        this.h = Math.max(0.0f, weightSum);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f337e == 1) {
            z(widthMeasureSpec, heightMeasureSpec);
        } else {
            x(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean t(int childIndex) {
        if (childIndex == 0) {
            if ((this.o & 1) != 0) {
                return true;
            }
            return false;
        } else if (childIndex == getChildCount()) {
            if ((this.o & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.o & 2) == 0) {
            return false;
        } else {
            for (int i2 = childIndex - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Multiple debug info for r12v2 int: [D('largestChildHeight' int), D('heightMode' int)] */
    /* JADX INFO: Multiple debug info for r10v20 'lp'  a.b.p.i0$a: [D('count' int), D('lp' a.b.p.i0$a)] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    public void z(int widthMeasureSpec, int heightMeasureSpec) {
        int count;
        int heightMode;
        int largestChildHeight;
        int childState;
        int childState2;
        float totalWeight;
        int heightMode2;
        int baselineChildIndex;
        int margin;
        boolean matchWidthLocally;
        boolean allFillParent;
        int childState3;
        int alternativeMaxWidth;
        int weightedMaxWidth;
        int childState4;
        int alternativeMaxWidth2;
        int i2;
        int i3;
        int heightMode3;
        int largestChildHeight2;
        int alternativeMaxWidth3;
        int weightedMaxWidth2;
        int childState5;
        int childState6;
        a lp;
        int i4;
        int weightedMaxWidth3;
        int oldHeight;
        this.f339g = 0;
        int count2 = getVirtualChildCount();
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode4 = View.MeasureSpec.getMode(heightMeasureSpec);
        int baselineChildIndex2 = this.f335c;
        boolean useLargestChild = this.i;
        boolean skippedMeasure = false;
        int childState7 = 0;
        int weightedMaxWidth4 = 0;
        float totalWeight2 = 0.0f;
        int childState8 = 0;
        int i5 = 0;
        boolean matchWidth = false;
        int maxWidth = 0;
        int largestChildHeight3 = 0;
        boolean allFillParent2 = true;
        while (true) {
            int i6 = 8;
            if (i5 < count2) {
                View child = s(i5);
                if (child == null) {
                    this.f339g += y();
                    heightMode3 = heightMode4;
                    largestChildHeight3 = largestChildHeight3;
                    largestChildHeight2 = count2;
                } else if (child.getVisibility() == 8) {
                    i5 += p();
                    heightMode3 = heightMode4;
                    largestChildHeight3 = largestChildHeight3;
                    largestChildHeight2 = count2;
                } else {
                    if (t(i5)) {
                        this.f339g += this.n;
                    }
                    a lp2 = (a) child.getLayoutParams();
                    float f2 = lp2.f340a;
                    float totalWeight3 = totalWeight2 + f2;
                    if (heightMode4 == 1073741824 && ((ViewGroup.MarginLayoutParams) lp2).height == 0 && f2 > 0.0f) {
                        int totalLength = this.f339g;
                        this.f339g = Math.max(totalLength, ((ViewGroup.MarginLayoutParams) lp2).topMargin + totalLength + ((ViewGroup.MarginLayoutParams) lp2).bottomMargin);
                        skippedMeasure = true;
                        weightedMaxWidth2 = maxWidth;
                        alternativeMaxWidth3 = childState8;
                        heightMode3 = heightMode4;
                        childState5 = childState7;
                        i4 = i5;
                        childState6 = 1073741824;
                        lp = lp2;
                        largestChildHeight3 = largestChildHeight3;
                        largestChildHeight2 = count2;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) lp2).height != 0 || lp2.f340a <= 0.0f) {
                            oldHeight = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) lp2).height = -2;
                            oldHeight = 0;
                        }
                        i4 = i5;
                        heightMode3 = heightMode4;
                        childState5 = childState7;
                        childState6 = 1073741824;
                        largestChildHeight2 = count2;
                        lp = lp2;
                        weightedMaxWidth2 = maxWidth;
                        alternativeMaxWidth3 = childState8;
                        w(child, widthMeasureSpec, 0, heightMeasureSpec, totalWeight3 == 0.0f ? this.f339g : 0);
                        if (oldHeight != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) lp).height = oldHeight;
                        }
                        int childHeight = child.getMeasuredHeight();
                        int totalLength2 = this.f339g;
                        this.f339g = Math.max(totalLength2, totalLength2 + childHeight + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + r());
                        if (useLargestChild) {
                            largestChildHeight3 = Math.max(childHeight, largestChildHeight3);
                        } else {
                            largestChildHeight3 = largestChildHeight3;
                        }
                    }
                    if (baselineChildIndex2 >= 0 && baselineChildIndex2 == i4 + 1) {
                        this.f336d = this.f339g;
                    }
                    if (i4 >= baselineChildIndex2 || lp.f340a <= 0.0f) {
                        boolean matchWidthLocally2 = false;
                        if (widthMode != childState6 && ((ViewGroup.MarginLayoutParams) lp).width == -1) {
                            matchWidth = true;
                            matchWidthLocally2 = true;
                        }
                        int margin2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                        int measuredWidth = child.getMeasuredWidth() + margin2;
                        int maxWidth2 = Math.max(weightedMaxWidth4, measuredWidth);
                        int childState9 = View.combineMeasuredStates(childState5, child.getMeasuredState());
                        boolean allFillParent3 = allFillParent2 && ((ViewGroup.MarginLayoutParams) lp).width == -1;
                        if (lp.f340a > 0.0f) {
                            weightedMaxWidth3 = Math.max(weightedMaxWidth2, matchWidthLocally2 ? margin2 : measuredWidth);
                        } else {
                            weightedMaxWidth3 = weightedMaxWidth2;
                            alternativeMaxWidth3 = Math.max(alternativeMaxWidth3, matchWidthLocally2 ? margin2 : measuredWidth);
                        }
                        childState7 = childState9;
                        i5 = i4 + p();
                        allFillParent2 = allFillParent3;
                        totalWeight2 = totalWeight3;
                        childState8 = alternativeMaxWidth3;
                        weightedMaxWidth4 = maxWidth2;
                        maxWidth = weightedMaxWidth3;
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i5++;
                count2 = largestChildHeight2;
                heightMode4 = heightMode3;
            } else {
                int weightedMaxWidth5 = maxWidth;
                int childState10 = childState7;
                int largestChildHeight4 = largestChildHeight3;
                if (this.f339g > 0) {
                    count = count2;
                    if (t(count)) {
                        this.f339g += this.n;
                    }
                } else {
                    count = count2;
                }
                if (useLargestChild) {
                    heightMode = heightMode4;
                    if (heightMode == Integer.MIN_VALUE || heightMode == 0) {
                        this.f339g = 0;
                        int i7 = 0;
                        while (i7 < count) {
                            View child2 = s(i7);
                            if (child2 == null) {
                                this.f339g += y();
                                i3 = i7;
                            } else if (child2.getVisibility() == i6) {
                                i2 = i7 + p();
                                i7 = i2 + 1;
                                i6 = 8;
                            } else {
                                a lp3 = (a) child2.getLayoutParams();
                                int totalLength3 = this.f339g;
                                i3 = i7;
                                this.f339g = Math.max(totalLength3, totalLength3 + largestChildHeight4 + ((ViewGroup.MarginLayoutParams) lp3).topMargin + ((ViewGroup.MarginLayoutParams) lp3).bottomMargin + r());
                            }
                            i2 = i3;
                            i7 = i2 + 1;
                            i6 = 8;
                        }
                    }
                } else {
                    heightMode = heightMode4;
                }
                this.f339g += getPaddingTop() + getPaddingBottom();
                int heightSizeAndState = View.resolveSizeAndState(Math.max(this.f339g, getSuggestedMinimumHeight()), heightMeasureSpec, 0);
                int heightSize = heightSizeAndState & 16777215;
                int delta = heightSize - this.f339g;
                if (skippedMeasure) {
                    totalWeight = totalWeight2;
                    childState2 = childState10;
                } else if (delta == 0 || totalWeight2 <= 0.0f) {
                    int alternativeMaxWidth4 = Math.max(childState8, weightedMaxWidth5);
                    if (!useLargestChild) {
                        alternativeMaxWidth = alternativeMaxWidth4;
                        childState3 = childState10;
                    } else if (heightMode != 1073741824) {
                        int i8 = 0;
                        while (i8 < count) {
                            View child3 = s(i8);
                            if (child3 != null) {
                                weightedMaxWidth = weightedMaxWidth5;
                                alternativeMaxWidth2 = alternativeMaxWidth4;
                                if (child3.getVisibility() == 8) {
                                    childState4 = childState10;
                                } else if (((a) child3.getLayoutParams()).f340a > 0.0f) {
                                    childState4 = childState10;
                                    child3.measure(View.MeasureSpec.makeMeasureSpec(child3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(largestChildHeight4, 1073741824));
                                } else {
                                    childState4 = childState10;
                                }
                            } else {
                                weightedMaxWidth = weightedMaxWidth5;
                                alternativeMaxWidth2 = alternativeMaxWidth4;
                                childState4 = childState10;
                            }
                            i8++;
                            alternativeMaxWidth4 = alternativeMaxWidth2;
                            heightSize = heightSize;
                            childState10 = childState4;
                            weightedMaxWidth5 = weightedMaxWidth;
                        }
                        alternativeMaxWidth = alternativeMaxWidth4;
                        childState3 = childState10;
                    } else {
                        alternativeMaxWidth = alternativeMaxWidth4;
                        childState3 = childState10;
                    }
                    childState8 = alternativeMaxWidth;
                    childState = childState3;
                    largestChildHeight = widthMeasureSpec;
                    if (!allFillParent2 && widthMode != 1073741824) {
                        weightedMaxWidth4 = childState8;
                    }
                    setMeasuredDimension(View.resolveSizeAndState(Math.max(weightedMaxWidth4 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), largestChildHeight, childState), heightSizeAndState);
                    if (!matchWidth) {
                        l(count, heightMeasureSpec);
                        return;
                    }
                    return;
                } else {
                    totalWeight = totalWeight2;
                    childState2 = childState10;
                }
                float weightSum = this.h;
                if (weightSum <= 0.0f) {
                    weightSum = totalWeight;
                }
                this.f339g = 0;
                int i9 = 0;
                childState = childState2;
                while (i9 < count) {
                    View child4 = s(i9);
                    if (child4.getVisibility() == 8) {
                        heightMode2 = heightMode;
                        baselineChildIndex = baselineChildIndex2;
                    } else {
                        a lp4 = (a) child4.getLayoutParams();
                        float childExtra = lp4.f340a;
                        if (childExtra > 0.0f) {
                            baselineChildIndex = baselineChildIndex2;
                            int share = (int) ((((float) delta) * childExtra) / weightSum);
                            float weightSum2 = weightSum - childExtra;
                            int delta2 = delta - share;
                            int childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) lp4).leftMargin + ((ViewGroup.MarginLayoutParams) lp4).rightMargin, ((ViewGroup.MarginLayoutParams) lp4).width);
                            if (((ViewGroup.MarginLayoutParams) lp4).height != 0) {
                                heightMode2 = heightMode;
                            } else if (heightMode != 1073741824) {
                                heightMode2 = heightMode;
                            } else {
                                heightMode2 = heightMode;
                                child4.measure(childWidthMeasureSpec, View.MeasureSpec.makeMeasureSpec(share > 0 ? share : 0, 1073741824));
                                childState = View.combineMeasuredStates(childState, child4.getMeasuredState() & -256);
                                delta = delta2;
                                weightSum = weightSum2;
                            }
                            int childHeight2 = child4.getMeasuredHeight() + share;
                            if (childHeight2 < 0) {
                                childHeight2 = 0;
                            }
                            child4.measure(childWidthMeasureSpec, View.MeasureSpec.makeMeasureSpec(childHeight2, 1073741824));
                            childState = View.combineMeasuredStates(childState, child4.getMeasuredState() & -256);
                            delta = delta2;
                            weightSum = weightSum2;
                        } else {
                            heightMode2 = heightMode;
                            baselineChildIndex = baselineChildIndex2;
                        }
                        int margin3 = ((ViewGroup.MarginLayoutParams) lp4).leftMargin + ((ViewGroup.MarginLayoutParams) lp4).rightMargin;
                        int measuredWidth2 = child4.getMeasuredWidth() + margin3;
                        weightedMaxWidth4 = Math.max(weightedMaxWidth4, measuredWidth2);
                        if (widthMode != 1073741824) {
                            margin = margin3;
                            if (((ViewGroup.MarginLayoutParams) lp4).width == -1) {
                                matchWidthLocally = true;
                                childState8 = Math.max(childState8, !matchWidthLocally ? margin : measuredWidth2);
                                if (!allFillParent2) {
                                    if (((ViewGroup.MarginLayoutParams) lp4).width == -1) {
                                        allFillParent = true;
                                        int totalLength4 = this.f339g;
                                        this.f339g = Math.max(totalLength4, totalLength4 + child4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp4).topMargin + ((ViewGroup.MarginLayoutParams) lp4).bottomMargin + r());
                                        allFillParent2 = allFillParent;
                                        weightSum = weightSum;
                                    }
                                }
                                allFillParent = false;
                                int totalLength42 = this.f339g;
                                this.f339g = Math.max(totalLength42, totalLength42 + child4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp4).topMargin + ((ViewGroup.MarginLayoutParams) lp4).bottomMargin + r());
                                allFillParent2 = allFillParent;
                                weightSum = weightSum;
                            }
                        } else {
                            margin = margin3;
                        }
                        matchWidthLocally = false;
                        childState8 = Math.max(childState8, !matchWidthLocally ? margin : measuredWidth2);
                        if (!allFillParent2) {
                        }
                        allFillParent = false;
                        int totalLength422 = this.f339g;
                        this.f339g = Math.max(totalLength422, totalLength422 + child4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp4).topMargin + ((ViewGroup.MarginLayoutParams) lp4).bottomMargin + r());
                        allFillParent2 = allFillParent;
                        weightSum = weightSum;
                    }
                    i9++;
                    useLargestChild = useLargestChild;
                    largestChildHeight4 = largestChildHeight4;
                    baselineChildIndex2 = baselineChildIndex;
                    heightMode = heightMode2;
                }
                largestChildHeight = widthMeasureSpec;
                this.f339g += getPaddingTop() + getPaddingBottom();
                weightedMaxWidth4 = childState8;
                setMeasuredDimension(View.resolveSizeAndState(Math.max(weightedMaxWidth4 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), largestChildHeight, childState), heightSizeAndState);
                if (!matchWidth) {
                }
            }
        }
    }

    public final void l(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i2 = 0; i2 < count; i2++) {
            View child = s(i2);
            if (child.getVisibility() != 8) {
                a lp = (a) child.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) lp).width == -1) {
                    int oldHeight = ((ViewGroup.MarginLayoutParams) lp).height;
                    ((ViewGroup.MarginLayoutParams) lp).height = child.getMeasuredHeight();
                    measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) lp).height = oldHeight;
                }
            }
        }
    }

    /* JADX INFO: Multiple debug info for r13v1 boolean: [D('matchHeight' boolean), D('useLargestChild' boolean)] */
    /* JADX INFO: Multiple debug info for r11v2 int: [D('widthMode' int), D('weightedMaxHeight' int)] */
    /* JADX INFO: Multiple debug info for r3v3 int: [D('childState' int), D('largestChildWidth' int)] */
    /* JADX INFO: Multiple debug info for r0v36 int: [D('weightSum' float), D('totalLength' int)] */
    /* JADX INFO: Multiple debug info for r4v34 int: [D('maxHeight' int), D('totalLength' int)] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021c  */
    public void x(int widthMeasureSpec, int heightMeasureSpec) {
        int childState;
        int descent;
        int maxHeight;
        int widthMode;
        int count;
        int delta;
        int childState2;
        int maxHeight2;
        float totalWeight;
        int widthMode2;
        int count2;
        boolean useLargestChild;
        int widthMode3;
        int widthMode4;
        float weightSum;
        int alternativeMaxHeight;
        boolean allFillParent;
        int delta2;
        int alternativeMaxHeight2;
        int largestChildWidth;
        int widthSize;
        int alternativeMaxHeight3;
        int maxHeight3;
        int weightedMaxHeight;
        boolean baselineAligned;
        int childState3;
        int alternativeMaxHeight4;
        int weightedMaxHeight2;
        int widthMode5;
        int maxHeight4;
        a lp;
        boolean matchHeightLocally;
        int childState4;
        int margin;
        int weightedMaxHeight3;
        int i2;
        int oldWidth;
        int childState5;
        this.f339g = 0;
        int maxHeight5 = 0;
        int count3 = getVirtualChildCount();
        int widthMode6 = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (this.j == null || this.k == null) {
            this.j = new int[4];
            this.k = new int[4];
        }
        int[] maxAscent = this.j;
        int[] maxDescent = this.k;
        maxAscent[3] = -1;
        maxAscent[2] = -1;
        maxAscent[1] = -1;
        maxAscent[0] = -1;
        maxDescent[3] = -1;
        maxDescent[2] = -1;
        maxDescent[1] = -1;
        maxDescent[0] = -1;
        boolean baselineAligned2 = this.f334b;
        boolean matchHeight = false;
        boolean useLargestChild2 = this.i;
        boolean skippedMeasure = false;
        boolean isExactly = widthMode6 == 1073741824;
        int largestChildWidth2 = 0;
        int i3 = 0;
        int maxHeight6 = 0;
        float totalWeight2 = 0.0f;
        boolean allFillParent2 = true;
        int childHeight = 0;
        int childState6 = 0;
        while (i3 < count3) {
            View child = s(i3);
            if (child == null) {
                this.f339g += y();
                baselineAligned = baselineAligned2;
                childState6 = childState6;
                weightedMaxHeight = widthMode6;
            } else if (child.getVisibility() == 8) {
                i3 += p();
                baselineAligned = baselineAligned2;
                childState6 = childState6;
                maxHeight5 = maxHeight5;
                weightedMaxHeight = widthMode6;
            } else {
                if (t(i3)) {
                    this.f339g += this.m;
                }
                a lp2 = (a) child.getLayoutParams();
                float f2 = lp2.f340a;
                float totalWeight3 = totalWeight2 + f2;
                if (widthMode6 == 1073741824 && ((ViewGroup.MarginLayoutParams) lp2).width == 0 && f2 > 0.0f) {
                    if (isExactly) {
                        childState5 = childHeight;
                        this.f339g += ((ViewGroup.MarginLayoutParams) lp2).leftMargin + ((ViewGroup.MarginLayoutParams) lp2).rightMargin;
                    } else {
                        childState5 = childHeight;
                        int totalLength = this.f339g;
                        this.f339g = Math.max(totalLength, ((ViewGroup.MarginLayoutParams) lp2).leftMargin + totalLength + ((ViewGroup.MarginLayoutParams) lp2).rightMargin);
                    }
                    if (baselineAligned2) {
                        int freeSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        child.measure(freeSpec, freeSpec);
                        lp = lp2;
                        maxHeight4 = maxHeight6;
                        baselineAligned = baselineAligned2;
                        i2 = largestChildWidth2;
                        weightedMaxHeight2 = childState6;
                        alternativeMaxHeight4 = maxHeight5;
                        childState3 = childState5;
                        weightedMaxHeight = widthMode6;
                        widthMode5 = -1;
                    } else {
                        skippedMeasure = true;
                        lp = lp2;
                        maxHeight4 = maxHeight6;
                        baselineAligned = baselineAligned2;
                        weightedMaxHeight2 = childState6;
                        alternativeMaxHeight4 = maxHeight5;
                        childState3 = childState5;
                        weightedMaxHeight = widthMode6;
                        widthMode5 = -1;
                        matchHeightLocally = false;
                        matchHeight = true;
                        matchHeightLocally = true;
                        int margin2 = ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                        int childHeight2 = child.getMeasuredHeight() + margin2;
                        int childState7 = View.combineMeasuredStates(childState3, child.getMeasuredState());
                        if (baselineAligned) {
                        }
                        int maxHeight7 = Math.max(maxHeight4, childHeight2);
                        if (!allFillParent2) {
                        }
                        if (lp.f340a > 0.0f) {
                        }
                        i3 += p();
                        allFillParent2 = allFillParent;
                        childState6 = weightedMaxHeight3;
                        totalWeight2 = totalWeight3;
                        childHeight = childState4;
                        maxHeight6 = maxHeight7;
                        maxHeight5 = alternativeMaxHeight4;
                    }
                } else {
                    if (((ViewGroup.MarginLayoutParams) lp2).width != 0 || lp2.f340a <= 0.0f) {
                        oldWidth = Integer.MIN_VALUE;
                    } else {
                        ((ViewGroup.MarginLayoutParams) lp2).width = -2;
                        oldWidth = 0;
                    }
                    weightedMaxHeight2 = childState6;
                    alternativeMaxHeight4 = maxHeight5;
                    childState3 = childHeight;
                    maxHeight4 = maxHeight6;
                    baselineAligned = baselineAligned2;
                    weightedMaxHeight = widthMode6;
                    widthMode5 = -1;
                    w(child, widthMeasureSpec, totalWeight3 == 0.0f ? this.f339g : 0, heightMeasureSpec, 0);
                    if (oldWidth != Integer.MIN_VALUE) {
                        lp = lp2;
                        ((ViewGroup.MarginLayoutParams) lp).width = oldWidth;
                    } else {
                        lp = lp2;
                    }
                    int childWidth = child.getMeasuredWidth();
                    if (isExactly) {
                        this.f339g += ((ViewGroup.MarginLayoutParams) lp).leftMargin + childWidth + ((ViewGroup.MarginLayoutParams) lp).rightMargin + r();
                    } else {
                        int totalLength2 = this.f339g;
                        this.f339g = Math.max(totalLength2, totalLength2 + childWidth + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin + r());
                    }
                    if (useLargestChild2) {
                        largestChildWidth2 = Math.max(childWidth, largestChildWidth2);
                        matchHeightLocally = false;
                        if (heightMode != 1073741824 && ((ViewGroup.MarginLayoutParams) lp).height == widthMode5) {
                            matchHeight = true;
                            matchHeightLocally = true;
                        }
                        int margin22 = ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                        int childHeight22 = child.getMeasuredHeight() + margin22;
                        int childState72 = View.combineMeasuredStates(childState3, child.getMeasuredState());
                        if (baselineAligned) {
                            int childBaseline = child.getBaseline();
                            if (childBaseline != widthMode5) {
                                int i4 = lp.f341b;
                                if (i4 < 0) {
                                    i4 = this.f338f;
                                }
                                int index = (((i4 & 112) >> 4) & -2) >> 1;
                                margin = margin22;
                                maxAscent[index] = Math.max(maxAscent[index], childBaseline);
                                childState4 = childState72;
                                maxDescent[index] = Math.max(maxDescent[index], childHeight22 - childBaseline);
                            } else {
                                margin = margin22;
                                childState4 = childState72;
                            }
                        } else {
                            margin = margin22;
                            childState4 = childState72;
                        }
                        int maxHeight72 = Math.max(maxHeight4, childHeight22);
                        boolean allFillParent3 = !allFillParent2 && ((ViewGroup.MarginLayoutParams) lp).height == -1;
                        if (lp.f340a > 0.0f) {
                            weightedMaxHeight3 = Math.max(weightedMaxHeight2, matchHeightLocally ? margin : childHeight22);
                        } else {
                            alternativeMaxHeight4 = Math.max(alternativeMaxHeight4, matchHeightLocally ? margin : childHeight22);
                            weightedMaxHeight3 = weightedMaxHeight2;
                        }
                        i3 += p();
                        allFillParent2 = allFillParent3;
                        childState6 = weightedMaxHeight3;
                        totalWeight2 = totalWeight3;
                        childHeight = childState4;
                        maxHeight6 = maxHeight72;
                        maxHeight5 = alternativeMaxHeight4;
                    } else {
                        i2 = largestChildWidth2;
                    }
                }
                largestChildWidth2 = i2;
                matchHeightLocally = false;
                matchHeight = true;
                matchHeightLocally = true;
                int margin222 = ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                int childHeight222 = child.getMeasuredHeight() + margin222;
                int childState722 = View.combineMeasuredStates(childState3, child.getMeasuredState());
                if (baselineAligned) {
                }
                int maxHeight722 = Math.max(maxHeight4, childHeight222);
                if (!allFillParent2) {
                }
                if (lp.f340a > 0.0f) {
                }
                i3 += p();
                allFillParent2 = allFillParent3;
                childState6 = weightedMaxHeight3;
                totalWeight2 = totalWeight3;
                childHeight = childState4;
                maxHeight6 = maxHeight722;
                maxHeight5 = alternativeMaxHeight4;
            }
            i3++;
            baselineAligned2 = baselineAligned;
            widthMode6 = weightedMaxHeight;
        }
        int weightedMaxHeight4 = childState6;
        int largestChildWidth3 = largestChildWidth2;
        if (this.f339g > 0 && t(count3)) {
            this.f339g += this.m;
        }
        if (maxAscent[1] == -1 && maxAscent[0] == -1 && maxAscent[2] == -1 && maxAscent[3] == -1) {
            childState = childHeight;
            descent = maxHeight6;
        } else {
            childState = childHeight;
            descent = Math.max(maxHeight6, Math.max(maxAscent[3], Math.max(maxAscent[0], Math.max(maxAscent[1], maxAscent[2]))) + Math.max(maxDescent[3], Math.max(maxDescent[0], Math.max(maxDescent[1], maxDescent[2]))));
        }
        if (useLargestChild2) {
            widthMode = widthMode6;
            if (widthMode == Integer.MIN_VALUE || widthMode == 0) {
                this.f339g = 0;
                int i5 = 0;
                while (i5 < count3) {
                    View child2 = s(i5);
                    if (child2 == null) {
                        this.f339g += y();
                        maxHeight3 = descent;
                    } else if (child2.getVisibility() == 8) {
                        i5 += p();
                        maxHeight3 = descent;
                    } else {
                        a lp3 = (a) child2.getLayoutParams();
                        if (isExactly) {
                            maxHeight3 = descent;
                            this.f339g += largestChildWidth3 + ((ViewGroup.MarginLayoutParams) lp3).leftMargin + ((ViewGroup.MarginLayoutParams) lp3).rightMargin + r();
                        } else {
                            maxHeight3 = descent;
                            int totalLength3 = this.f339g;
                            this.f339g = Math.max(totalLength3, totalLength3 + largestChildWidth3 + ((ViewGroup.MarginLayoutParams) lp3).leftMargin + ((ViewGroup.MarginLayoutParams) lp3).rightMargin + r());
                        }
                    }
                    i5++;
                    descent = maxHeight3;
                }
                maxHeight = descent;
            } else {
                maxHeight = descent;
            }
        } else {
            maxHeight = descent;
            widthMode = widthMode6;
        }
        this.f339g += getPaddingLeft() + getPaddingRight();
        int widthSizeAndState = View.resolveSizeAndState(Math.max(this.f339g, getSuggestedMinimumWidth()), widthMeasureSpec, 0);
        int widthSize2 = widthSizeAndState & 16777215;
        int delta3 = widthSize2 - this.f339g;
        if (skippedMeasure) {
            totalWeight = totalWeight2;
        } else if (delta3 == 0 || totalWeight2 <= 0.0f) {
            int alternativeMaxHeight5 = Math.max(maxHeight5, weightedMaxHeight4);
            if (!useLargestChild2 || widthMode == 1073741824) {
                alternativeMaxHeight2 = alternativeMaxHeight5;
            } else {
                int i6 = 0;
                while (i6 < count3) {
                    View child3 = s(i6);
                    if (child3 != null) {
                        alternativeMaxHeight3 = alternativeMaxHeight5;
                        widthSize = widthSize2;
                        if (child3.getVisibility() == 8) {
                            largestChildWidth = largestChildWidth3;
                        } else if (((a) child3.getLayoutParams()).f340a > 0.0f) {
                            largestChildWidth = largestChildWidth3;
                            child3.measure(View.MeasureSpec.makeMeasureSpec(largestChildWidth3, 1073741824), View.MeasureSpec.makeMeasureSpec(child3.getMeasuredHeight(), 1073741824));
                        } else {
                            largestChildWidth = largestChildWidth3;
                        }
                    } else {
                        alternativeMaxHeight3 = alternativeMaxHeight5;
                        largestChildWidth = largestChildWidth3;
                        widthSize = widthSize2;
                    }
                    i6++;
                    alternativeMaxHeight5 = alternativeMaxHeight3;
                    totalWeight2 = totalWeight2;
                    widthSize2 = widthSize;
                    largestChildWidth3 = largestChildWidth;
                }
                alternativeMaxHeight2 = alternativeMaxHeight5;
            }
            delta = heightMeasureSpec;
            count = count3;
            maxHeight5 = alternativeMaxHeight2;
            childState2 = maxHeight;
            maxHeight2 = childState;
            if (!allFillParent2 && heightMode != 1073741824) {
                childState2 = maxHeight5;
            }
            setMeasuredDimension((-16777216 & maxHeight2) | widthSizeAndState, View.resolveSizeAndState(Math.max(childState2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), delta, maxHeight2 << 16));
            if (!matchHeight) {
                k(count, widthMeasureSpec);
                return;
            }
            return;
        } else {
            totalWeight = totalWeight2;
        }
        float weightSum2 = this.h;
        if (weightSum2 <= 0.0f) {
            weightSum2 = totalWeight;
        }
        maxAscent[3] = -1;
        maxAscent[2] = -1;
        maxAscent[1] = -1;
        maxAscent[0] = -1;
        maxDescent[3] = -1;
        maxDescent[2] = -1;
        maxDescent[1] = -1;
        maxDescent[0] = -1;
        int maxHeight8 = -1;
        this.f339g = 0;
        int delta4 = delta3;
        int i7 = 0;
        int childState8 = childState;
        while (i7 < count3) {
            View child4 = s(i7);
            if (child4 != null) {
                useLargestChild = useLargestChild2;
                if (child4.getVisibility() == 8) {
                    widthMode2 = widthMode;
                    count2 = count3;
                    widthMode3 = delta4;
                } else {
                    a lp4 = (a) child4.getLayoutParams();
                    float childExtra = lp4.f340a;
                    if (childExtra > 0.0f) {
                        count2 = count3;
                        int share = (int) ((((float) delta4) * childExtra) / weightSum2);
                        float weightSum3 = weightSum2 - childExtra;
                        int delta5 = delta4 - share;
                        int childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(heightMeasureSpec, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) lp4).topMargin + ((ViewGroup.MarginLayoutParams) lp4).bottomMargin, ((ViewGroup.MarginLayoutParams) lp4).height);
                        if (((ViewGroup.MarginLayoutParams) lp4).width != 0) {
                            widthMode2 = widthMode;
                        } else if (widthMode != 1073741824) {
                            widthMode2 = widthMode;
                        } else {
                            widthMode2 = widthMode;
                            child4.measure(View.MeasureSpec.makeMeasureSpec(share > 0 ? share : 0, 1073741824), childHeightMeasureSpec);
                            childState8 = View.combineMeasuredStates(childState8, child4.getMeasuredState() & -16777216);
                            weightSum2 = weightSum3;
                            widthMode4 = delta5;
                        }
                        int childWidth2 = child4.getMeasuredWidth() + share;
                        if (childWidth2 < 0) {
                            childWidth2 = 0;
                        }
                        child4.measure(View.MeasureSpec.makeMeasureSpec(childWidth2, 1073741824), childHeightMeasureSpec);
                        childState8 = View.combineMeasuredStates(childState8, child4.getMeasuredState() & -16777216);
                        weightSum2 = weightSum3;
                        widthMode4 = delta5;
                    } else {
                        widthMode2 = widthMode;
                        count2 = count3;
                        widthMode4 = delta4;
                    }
                    if (isExactly) {
                        weightSum = weightSum2;
                        this.f339g += child4.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp4).leftMargin + ((ViewGroup.MarginLayoutParams) lp4).rightMargin + r();
                    } else {
                        weightSum = weightSum2;
                        int totalLength4 = this.f339g;
                        this.f339g = Math.max(totalLength4, child4.getMeasuredWidth() + totalLength4 + ((ViewGroup.MarginLayoutParams) lp4).leftMargin + ((ViewGroup.MarginLayoutParams) lp4).rightMargin + r());
                    }
                    boolean matchHeightLocally2 = heightMode != 1073741824 && ((ViewGroup.MarginLayoutParams) lp4).height == -1;
                    int margin3 = ((ViewGroup.MarginLayoutParams) lp4).topMargin + ((ViewGroup.MarginLayoutParams) lp4).bottomMargin;
                    int childHeight3 = child4.getMeasuredHeight() + margin3;
                    maxHeight8 = Math.max(maxHeight8, childHeight3);
                    int alternativeMaxHeight6 = Math.max(maxHeight5, matchHeightLocally2 ? margin3 : childHeight3);
                    if (allFillParent2) {
                        alternativeMaxHeight = alternativeMaxHeight6;
                        if (((ViewGroup.MarginLayoutParams) lp4).height == -1) {
                            allFillParent = true;
                            if (!baselineAligned2) {
                                int childBaseline2 = child4.getBaseline();
                                allFillParent2 = allFillParent;
                                if (childBaseline2 != -1) {
                                    int i8 = lp4.f341b;
                                    if (i8 < 0) {
                                        i8 = this.f338f;
                                    }
                                    int index2 = (((i8 & 112) >> 4) & -2) >> 1;
                                    maxAscent[index2] = Math.max(maxAscent[index2], childBaseline2);
                                    delta2 = widthMode4;
                                    maxDescent[index2] = Math.max(maxDescent[index2], childHeight3 - childBaseline2);
                                } else {
                                    delta2 = widthMode4;
                                }
                            } else {
                                allFillParent2 = allFillParent;
                                delta2 = widthMode4;
                            }
                            weightSum2 = weightSum;
                            maxHeight5 = alternativeMaxHeight;
                            widthMode3 = delta2;
                        }
                    } else {
                        alternativeMaxHeight = alternativeMaxHeight6;
                    }
                    allFillParent = false;
                    if (!baselineAligned2) {
                    }
                    weightSum2 = weightSum;
                    maxHeight5 = alternativeMaxHeight;
                    widthMode3 = delta2;
                }
            } else {
                widthMode2 = widthMode;
                count2 = count3;
                useLargestChild = useLargestChild2;
                widthMode3 = delta4;
            }
            i7++;
            delta4 = widthMode3;
            useLargestChild2 = useLargestChild;
            count3 = count2;
            weightedMaxHeight4 = weightedMaxHeight4;
            widthMode = widthMode2;
        }
        count = count3;
        delta = heightMeasureSpec;
        this.f339g += getPaddingLeft() + getPaddingRight();
        if (!(maxAscent[1] == -1 && maxAscent[0] == -1 && maxAscent[2] == -1 && maxAscent[3] == -1)) {
            maxHeight8 = Math.max(maxHeight8, Math.max(maxAscent[3], Math.max(maxAscent[0], Math.max(maxAscent[1], maxAscent[2]))) + Math.max(maxDescent[3], Math.max(maxDescent[0], Math.max(maxDescent[1], maxDescent[2]))));
        }
        childState2 = maxHeight8;
        maxHeight2 = childState8;
        childState2 = maxHeight5;
        setMeasuredDimension((-16777216 & maxHeight2) | widthSizeAndState, View.resolveSizeAndState(Math.max(childState2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), delta, maxHeight2 << 16));
        if (!matchHeight) {
        }
    }

    public final void k(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i2 = 0; i2 < count; i2++) {
            View child = s(i2);
            if (child.getVisibility() != 8) {
                a lp = (a) child.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) lp).height == -1) {
                    int oldWidth = ((ViewGroup.MarginLayoutParams) lp).width;
                    ((ViewGroup.MarginLayoutParams) lp).width = child.getMeasuredWidth();
                    measureChildWithMargins(child, widthMeasureSpec, 0, uniformMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) lp).width = oldWidth;
                }
            }
        }
    }

    public int p() {
        return 0;
    }

    public int y() {
        return 0;
    }

    public void w(View child, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    public int q() {
        return 0;
    }

    public int r() {
        return 0;
    }

    public void onLayout(boolean changed, int l2, int t, int r, int b2) {
        if (this.f337e == 1) {
            v(l2, t, r, b2);
        } else {
            u(l2, t, r, b2);
        }
    }

    public void v(int left, int top, int right, int bottom) {
        int childTop;
        int gravity;
        int childLeft;
        i0 i0Var = this;
        int paddingLeft = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft) - getPaddingRight();
        int count = getVirtualChildCount();
        int i2 = i0Var.f338f;
        int majorGravity = i2 & 112;
        int minorGravity = i2 & 8388615;
        if (majorGravity == 16) {
            childTop = getPaddingTop() + (((bottom - top) - i0Var.f339g) / 2);
        } else if (majorGravity != 80) {
            childTop = getPaddingTop();
        } else {
            childTop = ((getPaddingTop() + bottom) - top) - i0Var.f339g;
        }
        int i3 = 0;
        while (i3 < count) {
            View child = i0Var.s(i3);
            if (child == null) {
                childTop += y();
            } else if (child.getVisibility() != 8) {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                a lp = (a) child.getLayoutParams();
                int gravity2 = lp.f341b;
                if (gravity2 < 0) {
                    gravity = minorGravity;
                } else {
                    gravity = gravity2;
                }
                int b2 = d.b(gravity, s.v(this)) & 7;
                if (b2 == 1) {
                    childLeft = ((((childSpace - childWidth) / 2) + paddingLeft) + ((ViewGroup.MarginLayoutParams) lp).leftMargin) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else if (b2 != 5) {
                    childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + paddingLeft;
                } else {
                    childLeft = (childRight - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                }
                if (i0Var.t(i3)) {
                    childTop += i0Var.n;
                }
                int childTop2 = childTop + ((ViewGroup.MarginLayoutParams) lp).topMargin;
                A(child, childLeft, childTop2 + q(), childWidth, childHeight);
                int childTop3 = childTop2 + childHeight + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + r();
                i3 += p();
                childTop = childTop3;
            }
            i3++;
            i0Var = this;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    public void u(int left, int top, int right, int bottom) {
        int childLeft;
        int dir;
        int start;
        int[] maxAscent;
        int[] maxDescent;
        int height;
        boolean isLayoutRtl;
        int layoutDirection;
        int childBaseline;
        int gravity;
        int gravity2;
        int gravity3;
        int childTop;
        i0 i0Var = this;
        boolean isLayoutRtl2 = d1.b(this);
        int paddingTop = getPaddingTop();
        int height2 = bottom - top;
        int childBottom = height2 - getPaddingBottom();
        int childSpace = (height2 - paddingTop) - getPaddingBottom();
        int count = getVirtualChildCount();
        int i2 = i0Var.f338f;
        int minorGravity = i2 & 112;
        boolean baselineAligned = i0Var.f334b;
        int[] maxAscent2 = i0Var.j;
        int[] maxDescent2 = i0Var.k;
        int layoutDirection2 = s.v(this);
        int b2 = d.b(i2 & 8388615, layoutDirection2);
        if (b2 == 1) {
            childLeft = getPaddingLeft() + (((right - left) - i0Var.f339g) / 2);
        } else if (b2 != 5) {
            childLeft = getPaddingLeft();
        } else {
            childLeft = ((getPaddingLeft() + right) - left) - i0Var.f339g;
        }
        if (isLayoutRtl2) {
            start = count - 1;
            dir = -1;
        } else {
            start = 0;
            dir = 1;
        }
        int i3 = 0;
        while (i3 < count) {
            int childIndex = start + (dir * i3);
            View child = i0Var.s(childIndex);
            if (child == null) {
                childLeft += y();
                layoutDirection = layoutDirection2;
                maxDescent = maxDescent2;
                maxAscent = maxAscent2;
                isLayoutRtl = isLayoutRtl2;
                height = height2;
            } else {
                layoutDirection = layoutDirection2;
                if (child.getVisibility() != 8) {
                    int childWidth = child.getMeasuredWidth();
                    int childHeight = child.getMeasuredHeight();
                    a lp = (a) child.getLayoutParams();
                    if (baselineAligned) {
                        isLayoutRtl = isLayoutRtl2;
                        if (((ViewGroup.MarginLayoutParams) lp).height != -1) {
                            childBaseline = child.getBaseline();
                            gravity = lp.f341b;
                            if (gravity >= 0) {
                                gravity2 = minorGravity;
                            } else {
                                gravity2 = gravity;
                            }
                            gravity3 = gravity2 & 112;
                            height = height2;
                            if (gravity3 != 16) {
                                childTop = ((((childSpace - childHeight) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) lp).topMargin) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                            } else if (gravity3 == 48) {
                                int childTop2 = ((ViewGroup.MarginLayoutParams) lp).topMargin + paddingTop;
                                childTop = childBaseline != -1 ? childTop2 + (maxAscent2[1] - childBaseline) : childTop2;
                            } else if (gravity3 != 80) {
                                childTop = paddingTop;
                            } else {
                                int childTop3 = (childBottom - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                                if (childBaseline != -1) {
                                    childTop = childTop3 - (maxDescent2[2] - (child.getMeasuredHeight() - childBaseline));
                                } else {
                                    childTop = childTop3;
                                }
                            }
                            if (i0Var.t(childIndex)) {
                                childLeft += i0Var.m;
                            }
                            int childLeft2 = childLeft + ((ViewGroup.MarginLayoutParams) lp).leftMargin;
                            maxDescent = maxDescent2;
                            maxAscent = maxAscent2;
                            A(child, childLeft2 + q(), childTop, childWidth, childHeight);
                            int childLeft3 = childLeft2 + childWidth + ((ViewGroup.MarginLayoutParams) lp).rightMargin + r();
                            i3 += p();
                            childLeft = childLeft3;
                        }
                    } else {
                        isLayoutRtl = isLayoutRtl2;
                    }
                    childBaseline = -1;
                    gravity = lp.f341b;
                    if (gravity >= 0) {
                    }
                    gravity3 = gravity2 & 112;
                    height = height2;
                    if (gravity3 != 16) {
                    }
                    if (i0Var.t(childIndex)) {
                    }
                    int childLeft22 = childLeft + ((ViewGroup.MarginLayoutParams) lp).leftMargin;
                    maxDescent = maxDescent2;
                    maxAscent = maxAscent2;
                    A(child, childLeft22 + q(), childTop, childWidth, childHeight);
                    int childLeft32 = childLeft22 + childWidth + ((ViewGroup.MarginLayoutParams) lp).rightMargin + r();
                    i3 += p();
                    childLeft = childLeft32;
                } else {
                    maxDescent = maxDescent2;
                    maxAscent = maxAscent2;
                    isLayoutRtl = isLayoutRtl2;
                    height = height2;
                    i3 = i3;
                }
            }
            i3++;
            i0Var = this;
            layoutDirection2 = layoutDirection;
            isLayoutRtl2 = isLayoutRtl;
            height2 = height;
            maxDescent2 = maxDescent;
            maxAscent2 = maxAscent;
        }
    }

    public final void A(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }

    public void setOrientation(int orientation) {
        if (this.f337e != orientation) {
            this.f337e = orientation;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f337e;
    }

    public void setGravity(int gravity) {
        if (this.f338f != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= 8388611;
            }
            if ((gravity & 112) == 0) {
                gravity |= 48;
            }
            this.f338f = gravity;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f338f;
    }

    public void setHorizontalGravity(int horizontalGravity) {
        int gravity = horizontalGravity & 8388615;
        int i2 = this.f338f;
        if ((8388615 & i2) != gravity) {
            this.f338f = (-8388616 & i2) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & 112;
        int i2 = this.f338f;
        if ((i2 & 112) != gravity) {
            this.f338f = (i2 & -113) | gravity;
            requestLayout();
        }
    }

    /* renamed from: n */
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    /* renamed from: m */
    public a generateDefaultLayoutParams() {
        int i2 = this.f337e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: o */
    public a generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new a(p2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof a;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f340a;

        /* renamed from: b  reason: collision with root package name */
        public int f341b;

        public a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.f341b = -1;
            TypedArray a2 = c2.obtainStyledAttributes(attrs, j.LinearLayoutCompat_Layout);
            this.f340a = a2.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f341b = a2.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            a2.recycle();
        }

        public a(int width, int height) {
            super(width, height);
            this.f341b = -1;
            this.f340a = 0.0f;
        }

        public a(ViewGroup.LayoutParams p) {
            super(p);
            this.f341b = -1;
        }
    }
}
