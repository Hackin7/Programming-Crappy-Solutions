package androidx.recyclerview.widget;

import a.h.m.c0.d;
import a.o.c.e;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean F = false;
    public int G = -1;
    public int[] H;
    public View[] I;
    public final SparseIntArray J = new SparseIntArray();
    public final SparseIntArray K = new SparseIntArray();
    public c L = new a();
    public final Rect M = new Rect();

    public GridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        T2(RecyclerView.o.g0(context, attrs, defStyleAttr, defStyleRes).f1780b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void w2(boolean stackFromEnd) {
        if (!stackFromEnd) {
            super.w2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int i0(RecyclerView.u recycler, RecyclerView.y state) {
        if (this.r == 0) {
            return this.G;
        }
        if (state.b() < 1) {
            return 0;
        }
        return N2(recycler, state, state.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int M(RecyclerView.u recycler, RecyclerView.y state) {
        if (this.r == 1) {
            return this.G;
        }
        if (state.b() < 1) {
            return 0;
        }
        return N2(recycler, state, state.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void N0(RecyclerView.u recycler, RecyclerView.y state, View host, d info) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof b)) {
            super.M0(host, info);
            return;
        }
        b glp = (b) lp;
        int spanGroupIndex = N2(recycler, state, glp.a());
        if (this.r == 0) {
            info.M(d.c.a(glp.e(), glp.f(), spanGroupIndex, 1, this.G > 1 && glp.f() == this.G, false));
        } else {
            info.M(d.c.a(spanGroupIndex, 1, glp.e(), glp.f(), this.G > 1 && glp.f() == this.G, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void V0(RecyclerView.u recycler, RecyclerView.y state) {
        if (state.d()) {
            G2();
        }
        super.V0(recycler, state);
        J2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void W0(RecyclerView.y state) {
        super.W0(state);
        this.F = false;
    }

    public final void J2() {
        this.J.clear();
        this.K.clear();
    }

    public final void G2() {
        int childCount = I();
        for (int i = 0; i < childCount; i++) {
            b lp = (b) H(i).getLayoutParams();
            int viewPosition = lp.a();
            this.J.put(viewPosition, lp.f());
            this.K.put(viewPosition, lp.e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.L.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Q0(RecyclerView recyclerView) {
        this.L.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.L.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        this.L.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int from, int to, int itemCount) {
        this.L.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.p C() {
        if (this.r == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D(Context c2, AttributeSet attrs) {
        return new b(c2, attrs);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) lp);
        }
        return new b(lp);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l(RecyclerView.p lp) {
        return lp instanceof b;
    }

    public final void U2() {
        int totalSpace;
        if (i2() == 1) {
            totalSpace = (m0() - d0()) - c0();
        } else {
            totalSpace = (V() - b0()) - e0();
        }
        H2(totalSpace);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        if (this.H == null) {
            super.y1(childrenBounds, wSpec, hSpec);
        }
        int horizontalPadding = c0() + d0();
        int verticalPadding = e0() + b0();
        if (this.r == 1) {
            width = RecyclerView.o.m(hSpec, childrenBounds.height() + verticalPadding, Z());
            int[] iArr = this.H;
            usedHeight = RecyclerView.o.m(wSpec, iArr[iArr.length - 1] + horizontalPadding, a0());
        } else {
            int width2 = RecyclerView.o.m(wSpec, childrenBounds.width() + horizontalPadding, a0());
            int[] iArr2 = this.H;
            usedHeight = width2;
            width = RecyclerView.o.m(hSpec, iArr2[iArr2.length - 1] + verticalPadding, Z());
        }
        x1(usedHeight, width);
    }

    public final void H2(int totalSpace) {
        this.H = I2(this.H, this.G, totalSpace);
    }

    public static int[] I2(int[] cachedBorders, int spanCount, int totalSpace) {
        if (!(cachedBorders != null && cachedBorders.length == spanCount + 1 && cachedBorders[cachedBorders.length - 1] == totalSpace)) {
            cachedBorders = new int[(spanCount + 1)];
        }
        cachedBorders[0] = 0;
        int sizePerSpan = totalSpace / spanCount;
        int sizePerSpanRemainder = totalSpace % spanCount;
        int consumedPixels = 0;
        int additionalSize = 0;
        for (int i = 1; i <= spanCount; i++) {
            int itemSize = sizePerSpan;
            additionalSize += sizePerSpanRemainder;
            if (additionalSize > 0 && spanCount - additionalSize < sizePerSpanRemainder) {
                itemSize++;
                additionalSize -= spanCount;
            }
            consumedPixels += itemSize;
            cachedBorders[i] = consumedPixels;
        }
        return cachedBorders;
    }

    public int M2(int startSpan, int spanSize) {
        if (this.r != 1 || !j2()) {
            int[] iArr = this.H;
            return iArr[startSpan + spanSize] - iArr[startSpan];
        }
        int[] iArr2 = this.H;
        int i = this.G;
        return iArr2[i - startSpan] - iArr2[(i - startSpan) - spanSize];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void m2(RecyclerView.u recycler, RecyclerView.y state, LinearLayoutManager.a anchorInfo, int itemDirection) {
        super.m2(recycler, state, anchorInfo, itemDirection);
        U2();
        if (state.b() > 0 && !state.d()) {
            K2(recycler, state, anchorInfo, itemDirection);
        }
        L2();
    }

    public final void L2() {
        View[] viewArr = this.I;
        if (viewArr == null || viewArr.length != this.G) {
            this.I = new View[this.G];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int t1(int dx, RecyclerView.u recycler, RecyclerView.y state) {
        U2();
        L2();
        return super.t1(dx, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int u1(int dy, RecyclerView.u recycler, RecyclerView.y state) {
        U2();
        L2();
        return super.u1(dy, recycler, state);
    }

    public final void K2(RecyclerView.u recycler, RecyclerView.y state, LinearLayoutManager.a anchorInfo, int itemDirection) {
        boolean layingOutInPrimaryDirection = itemDirection == 1;
        int span = O2(recycler, state, anchorInfo.f1718b);
        if (layingOutInPrimaryDirection) {
            while (span > 0) {
                int i = anchorInfo.f1718b;
                if (i > 0) {
                    int i2 = i - 1;
                    anchorInfo.f1718b = i2;
                    span = O2(recycler, state, i2);
                } else {
                    return;
                }
            }
            return;
        }
        int indexLimit = state.b() - 1;
        int pos = anchorInfo.f1718b;
        int bestSpan = span;
        while (pos < indexLimit) {
            int next = O2(recycler, state, pos + 1);
            if (next <= bestSpan) {
                break;
            }
            pos++;
            bestSpan = next;
        }
        anchorInfo.f1718b = pos;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View a2(RecyclerView.u recycler, RecyclerView.y state, int start, int end, int itemCount) {
        M1();
        View invalidMatch = null;
        View outOfBoundsMatch = null;
        int boundsStart = this.t.m();
        int boundsEnd = this.t.i();
        int diff = end > start ? 1 : -1;
        for (int i = start; i != end; i += diff) {
            View view = H(i);
            int position = f0(view);
            if (position >= 0 && position < itemCount && O2(recycler, state, position) == 0) {
                if (((RecyclerView.p) view.getLayoutParams()).c()) {
                    if (invalidMatch == null) {
                        invalidMatch = view;
                    }
                } else if (this.t.g(view) < boundsEnd && this.t.d(view) >= boundsStart) {
                    return view;
                } else {
                    if (outOfBoundsMatch == null) {
                        outOfBoundsMatch = view;
                    }
                }
            }
        }
        return outOfBoundsMatch != null ? outOfBoundsMatch : invalidMatch;
    }

    public final int N2(RecyclerView.u recycler, RecyclerView.y state, int viewPosition) {
        if (!state.d()) {
            return this.L.b(viewPosition, this.G);
        }
        int adapterPosition = recycler.f(viewPosition);
        if (adapterPosition != -1) {
            return this.L.b(adapterPosition, this.G);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + viewPosition);
        return 0;
    }

    public final int O2(RecyclerView.u recycler, RecyclerView.y state, int pos) {
        if (!state.d()) {
            return this.L.a(pos, this.G);
        }
        int cached = this.K.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.f(pos);
        if (adapterPosition != -1) {
            return this.L.a(adapterPosition, this.G);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
        return 0;
    }

    public final int P2(RecyclerView.u recycler, RecyclerView.y state, int pos) {
        if (!state.d()) {
            this.L.d(pos);
            return 1;
        }
        int cached = this.J.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.f(pos);
        if (adapterPosition == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
            return 1;
        }
        this.L.d(adapterPosition);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void G1(RecyclerView.y state, LinearLayoutManager.c layoutState, RecyclerView.o.c layoutPrefetchRegistry) {
        int remainingSpan = this.G;
        for (int count = 0; count < this.G && layoutState.c(state) && remainingSpan > 0; count++) {
            int pos = layoutState.f1729d;
            ((e.b) layoutPrefetchRegistry).a(pos, Math.max(0, layoutState.f1732g));
            this.L.d(pos);
            remainingSpan--;
            layoutState.f1729d += layoutState.f1730e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void k2(RecyclerView.u recycler, RecyclerView.y state, LinearLayoutManager.c layoutState, LinearLayoutManager.b result) {
        int consumedSpanCount;
        int itemSpanIndex;
        int maxSize;
        int bottom;
        int right;
        int left;
        int top;
        int otherDirSpecMode;
        float maxSizeInOther;
        boolean flexibleInOtherDir;
        int hSpec;
        int wSpec;
        boolean z;
        View view;
        int otherDirSpecMode2 = this.t.l();
        boolean flexibleInOtherDir2 = otherDirSpecMode2 != 1073741824;
        int currentOtherDirSize = I() > 0 ? this.H[this.G] : 0;
        if (flexibleInOtherDir2) {
            U2();
        }
        boolean layingOutInPrimaryDirection = layoutState.f1730e == 1;
        int remainingSpan = this.G;
        if (!layingOutInPrimaryDirection) {
            remainingSpan = O2(recycler, state, layoutState.f1729d) + P2(recycler, state, layoutState.f1729d);
            itemSpanIndex = 0;
            consumedSpanCount = 0;
        } else {
            itemSpanIndex = 0;
            consumedSpanCount = 0;
        }
        while (itemSpanIndex < this.G && layoutState.c(state) && remainingSpan > 0) {
            int pos = layoutState.f1729d;
            int spanSize = P2(recycler, state, pos);
            if (spanSize <= this.G) {
                remainingSpan -= spanSize;
                if (remainingSpan < 0 || (view = layoutState.d(recycler)) == null) {
                    break;
                }
                consumedSpanCount += spanSize;
                this.I[itemSpanIndex] = view;
                itemSpanIndex++;
            } else {
                throw new IllegalArgumentException("Item at position " + pos + " requires " + spanSize + " spans but GridLayoutManager has only " + this.G + " spans.");
            }
        }
        if (itemSpanIndex == 0) {
            result.f1723b = true;
            return;
        }
        int maxSize2 = 0;
        F2(recycler, state, itemSpanIndex, layingOutInPrimaryDirection);
        int i = 0;
        float maxSizeInOther2 = 0.0f;
        while (i < itemSpanIndex) {
            View view2 = this.I[i];
            if (layoutState.k != null) {
                z = false;
                if (layingOutInPrimaryDirection) {
                    a(view2);
                } else {
                    b(view2, 0);
                }
            } else if (layingOutInPrimaryDirection) {
                c(view2);
                z = false;
            } else {
                z = false;
                d(view2, 0);
            }
            i(view2, this.M);
            R2(view2, otherDirSpecMode2, z);
            int size = this.t.e(view2);
            if (size > maxSize2) {
                maxSize2 = size;
            }
            float otherSize = (((float) this.t.f(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f1714f);
            if (otherSize > maxSizeInOther2) {
                maxSizeInOther2 = otherSize;
            }
            i++;
            maxSize2 = maxSize2;
        }
        if (flexibleInOtherDir2) {
            Q2(maxSizeInOther2, currentOtherDirSize);
            int maxSize3 = 0;
            for (int i2 = 0; i2 < itemSpanIndex; i2++) {
                View view3 = this.I[i2];
                R2(view3, 1073741824, true);
                int size2 = this.t.e(view3);
                if (size2 > maxSize3) {
                    maxSize3 = size2;
                }
            }
            maxSize = maxSize3;
        } else {
            maxSize = maxSize2;
        }
        int i3 = 0;
        while (i3 < itemSpanIndex) {
            View view4 = this.I[i3];
            if (this.t.e(view4) != maxSize) {
                b lp = (b) view4.getLayoutParams();
                Rect decorInsets = lp.f1784b;
                maxSizeInOther = maxSizeInOther2;
                int verticalInsets = decorInsets.top + decorInsets.bottom + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                int horizontalInsets = decorInsets.left + decorInsets.right + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                int totalSpaceInOther = M2(lp.f1713e, lp.f1714f);
                otherDirSpecMode = otherDirSpecMode2;
                if (this.r == 1) {
                    flexibleInOtherDir = flexibleInOtherDir2;
                    wSpec = RecyclerView.o.J(totalSpaceInOther, 1073741824, horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, false);
                    hSpec = View.MeasureSpec.makeMeasureSpec(maxSize - verticalInsets, 1073741824);
                } else {
                    flexibleInOtherDir = flexibleInOtherDir2;
                    wSpec = View.MeasureSpec.makeMeasureSpec(maxSize - horizontalInsets, 1073741824);
                    hSpec = RecyclerView.o.J(totalSpaceInOther, 1073741824, verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, false);
                }
                S2(view4, wSpec, hSpec, true);
            } else {
                maxSizeInOther = maxSizeInOther2;
                otherDirSpecMode = otherDirSpecMode2;
                flexibleInOtherDir = flexibleInOtherDir2;
            }
            i3++;
            flexibleInOtherDir2 = flexibleInOtherDir;
            maxSizeInOther2 = maxSizeInOther;
            otherDirSpecMode2 = otherDirSpecMode;
        }
        result.f1722a = maxSize;
        int left2 = 0;
        int right2 = 0;
        int top2 = 0;
        int bottom2 = 0;
        if (this.r == 1) {
            if (layoutState.f1731f == -1) {
                bottom2 = layoutState.f1727b;
                top2 = bottom2 - maxSize;
            } else {
                top2 = layoutState.f1727b;
                bottom2 = top2 + maxSize;
            }
        } else if (layoutState.f1731f == -1) {
            right2 = layoutState.f1727b;
            left2 = right2 - maxSize;
        } else {
            left2 = layoutState.f1727b;
            right2 = left2 + maxSize;
        }
        int i4 = 0;
        while (i4 < itemSpanIndex) {
            View view5 = this.I[i4];
            b params = (b) view5.getLayoutParams();
            if (this.r != 1) {
                left = left2;
                right = right2;
                int top3 = e0() + this.H[params.f1713e];
                top = top3;
                bottom = this.t.f(view5) + top3;
            } else if (j2()) {
                int right3 = c0() + this.H[this.G - params.f1713e];
                left = right3 - this.t.f(view5);
                top = top2;
                bottom = bottom2;
                right = right3;
            } else {
                int left3 = c0() + this.H[params.f1713e];
                left = left3;
                right = this.t.f(view5) + left3;
                top = top2;
                bottom = bottom2;
            }
            x0(view5, left, top, right, bottom);
            if (params.c() || params.b()) {
                result.f1724c = true;
            }
            result.f1725d |= view5.hasFocusable();
            i4++;
            top2 = top;
            left2 = left;
            right2 = right;
            bottom2 = bottom;
            itemSpanIndex = itemSpanIndex;
        }
        Arrays.fill(this.I, (Object) null);
    }

    public final void R2(View view, int otherDirParentSpecMode, boolean alreadyMeasured) {
        int hSpec;
        int wSpec;
        b lp = (b) view.getLayoutParams();
        Rect decorInsets = lp.f1784b;
        int verticalInsets = decorInsets.top + decorInsets.bottom + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
        int horizontalInsets = decorInsets.left + decorInsets.right + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
        int availableSpaceInOther = M2(lp.f1713e, lp.f1714f);
        if (this.r == 1) {
            wSpec = RecyclerView.o.J(availableSpaceInOther, otherDirParentSpecMode, horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, false);
            hSpec = RecyclerView.o.J(this.t.n(), W(), verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, true);
        } else {
            hSpec = RecyclerView.o.J(availableSpaceInOther, otherDirParentSpecMode, verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, false);
            wSpec = RecyclerView.o.J(this.t.n(), n0(), horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, true);
        }
        S2(view, wSpec, hSpec, alreadyMeasured);
    }

    public final void Q2(float maxSizeInOther, int currentOtherDirSize) {
        H2(Math.max(Math.round(((float) this.G) * maxSizeInOther), currentOtherDirSize));
    }

    public final void S2(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        RecyclerView.p lp = (RecyclerView.p) child.getLayoutParams();
        if (alreadyMeasured) {
            measure = D1(child, widthSpec, heightSpec, lp);
        } else {
            measure = B1(child, widthSpec, heightSpec, lp);
        }
        if (measure) {
            child.measure(widthSpec, heightSpec);
        }
    }

    public final void F2(RecyclerView.u recycler, RecyclerView.y state, int count, boolean layingOutInPrimaryDirection) {
        int diff;
        int end;
        int start;
        if (layingOutInPrimaryDirection) {
            start = 0;
            end = count;
            diff = 1;
        } else {
            start = count - 1;
            end = -1;
            diff = -1;
        }
        int span = 0;
        for (int i = start; i != end; i += diff) {
            View view = this.I[i];
            b params = (b) view.getLayoutParams();
            int P2 = P2(recycler, state, f0(view));
            params.f1714f = P2;
            params.f1713e = span;
            span += P2;
        }
    }

    public void T2(int spanCount) {
        if (spanCount != this.G) {
            this.F = true;
            if (spanCount >= 1) {
                this.G = spanCount;
                this.L.e();
                q1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + spanCount);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f1715a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public boolean f1716b = false;

        public abstract int c(int i, int i2);

        public abstract int d(int i);

        public void e() {
            this.f1715a.clear();
        }

        public int a(int position, int spanCount) {
            if (!this.f1716b) {
                return c(position, spanCount);
            }
            int existing = this.f1715a.get(position, -1);
            if (existing != -1) {
                return existing;
            }
            int value = c(position, spanCount);
            this.f1715a.put(position, value);
            return value;
        }

        public int b(int adapterPosition, int spanCount) {
            int span = 0;
            int group = 0;
            d(adapterPosition);
            for (int i = 0; i < adapterPosition; i++) {
                d(i);
                span++;
                if (span == spanCount) {
                    span = 0;
                    group++;
                } else if (span > spanCount) {
                    span = 1;
                    group++;
                }
            }
            if (span + 1 > spanCount) {
                return group + 1;
            }
            return group;
        }
    }

    /* JADX INFO: Multiple debug info for r3v3 int: [D('candidateStart' int), D('prevFocusedChild' android.view.View)] */
    /* JADX INFO: Multiple debug info for r13v10 int: [D('assignAsWeek' boolean), D('overlap' int)] */
    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public View H0(View focused, int focusDirection, RecyclerView.u recycler, RecyclerView.y state) {
        int limit;
        int inc;
        int start;
        int focusableSpanGroupIndex;
        View prevFocusedChild;
        int focusableWeakCandidateSpanIndex;
        int overlap;
        GridLayoutManager gridLayoutManager = this;
        RecyclerView.u uVar = recycler;
        RecyclerView.y yVar = state;
        View prevFocusedChild2 = A(focused);
        if (prevFocusedChild2 == null) {
            return null;
        }
        b lp = (b) prevFocusedChild2.getLayoutParams();
        int prevSpanStart = lp.f1713e;
        int prevSpanEnd = lp.f1713e + lp.f1714f;
        if (super.H0(focused, focusDirection, recycler, state) == null) {
            return null;
        }
        if ((gridLayoutManager.K1(focusDirection) == 1) != gridLayoutManager.w) {
            start = I() - 1;
            inc = -1;
            limit = -1;
        } else {
            start = 0;
            inc = 1;
            limit = I();
        }
        boolean preferLastSpan = gridLayoutManager.r == 1 && j2();
        View focusableWeakCandidate = null;
        View unfocusableWeakCandidate = null;
        int focusableSpanGroupIndex2 = gridLayoutManager.N2(uVar, yVar, start);
        int unfocusableWeakCandidateSpanIndex = -1;
        int focusableWeakCandidateOverlap = 0;
        int unfocusableWeakCandidateSpanIndex2 = -1;
        int unfocusableWeakCandidateOverlap = 0;
        int i = start;
        while (true) {
            if (i == limit) {
                break;
            }
            int spanGroupIndex = gridLayoutManager.N2(uVar, yVar, i);
            View candidate = gridLayoutManager.H(i);
            if (candidate == prevFocusedChild2) {
                break;
            }
            if (!candidate.hasFocusable() || spanGroupIndex == focusableSpanGroupIndex2) {
                b candidateLp = (b) candidate.getLayoutParams();
                prevFocusedChild = prevFocusedChild2;
                int candidateStart = candidateLp.f1713e;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
                int candidateEnd = candidateLp.f1713e + candidateLp.f1714f;
                if (candidate.hasFocusable() && candidateStart == prevSpanStart && candidateEnd == prevSpanEnd) {
                    return candidate;
                }
                if ((!candidate.hasFocusable() || focusableWeakCandidate != null) && (candidate.hasFocusable() || unfocusableWeakCandidate != null)) {
                    int overlap2 = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                    if (!candidate.hasFocusable()) {
                        focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                        if (focusableWeakCandidate == null) {
                            boolean z = false;
                            if (gridLayoutManager.w0(candidate, false)) {
                                if (overlap2 > unfocusableWeakCandidateOverlap) {
                                    overlap = 1;
                                } else if (overlap2 == unfocusableWeakCandidateOverlap) {
                                    if (candidateStart > unfocusableWeakCandidateSpanIndex2) {
                                        z = true;
                                    }
                                    if (preferLastSpan == z) {
                                        overlap = 1;
                                    }
                                }
                            }
                        }
                    } else if (overlap2 > focusableWeakCandidateOverlap) {
                        focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                        overlap = 1;
                    } else if (overlap2 == focusableWeakCandidateOverlap) {
                        focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                        if (preferLastSpan == (candidateStart > unfocusableWeakCandidateSpanIndex)) {
                            overlap = 1;
                        }
                    } else {
                        focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                    }
                    overlap = 0;
                } else {
                    overlap = 1;
                    focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                }
                if (overlap != 0) {
                    if (candidate.hasFocusable()) {
                        int focusableWeakCandidateSpanIndex2 = candidateLp.f1713e;
                        focusableWeakCandidateOverlap = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                        focusableWeakCandidate = candidate;
                        unfocusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                    } else {
                        int unfocusableWeakCandidateSpanIndex3 = candidateLp.f1713e;
                        unfocusableWeakCandidate = candidate;
                        unfocusableWeakCandidateOverlap = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                        unfocusableWeakCandidateSpanIndex2 = unfocusableWeakCandidateSpanIndex3;
                        unfocusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex;
                    }
                    i += inc;
                    gridLayoutManager = this;
                    uVar = recycler;
                    yVar = state;
                    start = start;
                    prevFocusedChild2 = prevFocusedChild;
                    focusableSpanGroupIndex2 = focusableSpanGroupIndex;
                }
            } else if (focusableWeakCandidate != null) {
                break;
            } else {
                prevFocusedChild = prevFocusedChild2;
                focusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
            }
            unfocusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex;
            i += inc;
            gridLayoutManager = this;
            uVar = recycler;
            yVar = state;
            start = start;
            prevFocusedChild2 = prevFocusedChild;
            focusableSpanGroupIndex2 = focusableSpanGroupIndex;
        }
        return focusableWeakCandidate != null ? focusableWeakCandidate : unfocusableWeakCandidate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public boolean F1() {
        return this.B == null && !this.F;
    }

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int d(int position) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int c(int position, int spanCount) {
            return position % spanCount;
        }
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        public int f1713e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1714f = 0;

        public b(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public b(int width, int height) {
            super(width, height);
        }

        public b(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public b(ViewGroup.LayoutParams source) {
            super(source);
        }

        public int e() {
            return this.f1713e;
        }

        public int f() {
            return this.f1714f;
        }
    }
}
