package androidx.recyclerview.widget;

import a.h.m.c0.d;
import a.o.c.e;
import a.o.c.h;
import a.o.c.j;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o {
    public BitSet A;
    public int B = -1;
    public int C = Integer.MIN_VALUE;
    public d D = new d();
    public int E = 2;
    public boolean F;
    public boolean G;
    public e H;
    public int I;
    public final Rect J = new Rect();
    public final b K = new b();
    public boolean L = false;
    public boolean M = true;
    public int[] N;
    public final Runnable O = new a();
    public int r = -1;
    public f[] s;
    public h t;
    public h u;
    public int v;
    public int w;
    public final a.o.c.f x;
    public boolean y = false;
    public boolean z = false;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.M1();
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        RecyclerView.o.d properties = RecyclerView.o.g0(context, attrs, defStyleAttr, defStyleRes);
        B2(properties.f1779a);
        D2(properties.f1780b);
        C2(properties.f1781c);
        this.x = new a.o.c.f();
        U1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q0() {
        return this.E != 0;
    }

    public final void U1() {
        this.t = h.b(this, this.v);
        this.u = h.b(this, 1 - this.v);
    }

    public boolean M1() {
        int maxPos;
        int minPos;
        if (I() == 0 || this.E == 0 || !p0()) {
            return false;
        }
        if (this.z) {
            minPos = e2();
            maxPos = d2();
        } else {
            minPos = d2();
            maxPos = e2();
        }
        if (minPos == 0 && l2() != null) {
            this.D.b();
            r1();
            q1();
            return true;
        } else if (!this.L) {
            return false;
        } else {
            int invalidGapDir = this.z ? -1 : 1;
            d.a invalidFsi = this.D.e(minPos, maxPos + 1, invalidGapDir, true);
            if (invalidFsi == null) {
                this.L = false;
                this.D.d(maxPos + 1);
                return false;
            }
            d.a validFsi = this.D.e(minPos, invalidFsi.f1820b, invalidGapDir * -1, true);
            if (validFsi == null) {
                this.D.d(invalidFsi.f1820b);
            } else {
                this.D.d(validFsi.f1820b + 1);
            }
            r1();
            q1();
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(int state) {
        if (state == 0) {
            M1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G0(RecyclerView view, RecyclerView.u recycler) {
        super.G0(view, recycler);
        l1(this.O);
        for (int i = 0; i < this.r; i++) {
            this.s[i].e();
        }
        view.requestLayout();
    }

    public View l2() {
        int childLimit;
        int firstChildIndex;
        int endChildIndex = I() - 1;
        BitSet mSpansToCheck = new BitSet(this.r);
        mSpansToCheck.set(0, this.r, true);
        int nextChildDiff = -1;
        int preferredSpanDir = (this.v != 1 || !n2()) ? -1 : 1;
        if (this.z) {
            firstChildIndex = endChildIndex;
            childLimit = 0 - 1;
        } else {
            firstChildIndex = 0;
            childLimit = endChildIndex + 1;
        }
        if (firstChildIndex < childLimit) {
            nextChildDiff = 1;
        }
        for (int i = firstChildIndex; i != childLimit; i += nextChildDiff) {
            View child = H(i);
            c lp = (c) child.getLayoutParams();
            if (mSpansToCheck.get(lp.f1816e.f1834e)) {
                if (N1(lp.f1816e)) {
                    return child;
                }
                mSpansToCheck.clear(lp.f1816e.f1834e);
            }
            if (!lp.f1817f && i + nextChildDiff != childLimit) {
                View nextChild = H(i + nextChildDiff);
                boolean compareSpans = false;
                if (this.z) {
                    int myEnd = this.t.d(child);
                    int nextEnd = this.t.d(nextChild);
                    if (myEnd < nextEnd) {
                        return child;
                    }
                    if (myEnd == nextEnd) {
                        compareSpans = true;
                    }
                } else {
                    int myStart = this.t.g(child);
                    int nextStart = this.t.g(nextChild);
                    if (myStart > nextStart) {
                        return child;
                    }
                    if (myStart == nextStart) {
                        compareSpans = true;
                    }
                }
                if (!compareSpans) {
                    continue;
                } else {
                    if ((lp.f1816e.f1834e - ((c) nextChild.getLayoutParams()).f1816e.f1834e < 0) != (preferredSpanDir < 0)) {
                        return child;
                    }
                }
            }
        }
        return null;
    }

    public final boolean N1(f span) {
        if (this.z) {
            if (span.k() < this.t.i()) {
                ArrayList<View> arrayList = span.f1830a;
                return !span.n(arrayList.get(arrayList.size() - 1)).f1817f;
            }
        } else if (span.o() > this.t.m()) {
            return !span.n(span.f1830a.get(0)).f1817f;
        }
        return false;
    }

    public void D2(int spanCount) {
        f(null);
        if (spanCount != this.r) {
            m2();
            this.r = spanCount;
            this.A = new BitSet(this.r);
            this.s = new f[this.r];
            for (int i = 0; i < this.r; i++) {
                this.s[i] = new f(i);
            }
            q1();
        }
    }

    public void B2(int orientation) {
        if (orientation == 0 || orientation == 1) {
            f(null);
            if (orientation != this.v) {
                this.v = orientation;
                h tmp = this.t;
                this.t = this.u;
                this.u = tmp;
                q1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void C2(boolean reverseLayout) {
        f(null);
        e eVar = this.H;
        if (!(eVar == null || eVar.i == reverseLayout)) {
            eVar.i = reverseLayout;
        }
        this.y = reverseLayout;
        q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f(String message) {
        if (this.H == null) {
            super.f(message);
        }
    }

    public void m2() {
        this.D.b();
        q1();
    }

    public final void y2() {
        if (this.v == 1 || !n2()) {
            this.z = this.y;
        } else {
            this.z = !this.y;
        }
    }

    public boolean n2() {
        return X() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        int horizontalPadding = c0() + d0();
        int verticalPadding = e0() + b0();
        if (this.v == 1) {
            width = RecyclerView.o.m(hSpec, childrenBounds.height() + verticalPadding, Z());
            usedHeight = RecyclerView.o.m(wSpec, (this.w * this.r) + horizontalPadding, a0());
        } else {
            usedHeight = RecyclerView.o.m(wSpec, childrenBounds.width() + horizontalPadding, a0());
            width = RecyclerView.o.m(hSpec, (this.w * this.r) + verticalPadding, Z());
        }
        x1(usedHeight, width);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView.u recycler, RecyclerView.y state) {
        q2(recycler, state, true);
    }

    public final void q2(RecyclerView.u recycler, RecyclerView.y state, boolean shouldCheckForGaps) {
        e eVar;
        b anchorInfo = this.K;
        if (!(this.H == null && this.B == -1) && state.b() == 0) {
            h1(recycler);
            anchorInfo.c();
            return;
        }
        boolean needToCheckForGaps = true;
        boolean recalculateAnchor = (anchorInfo.f1813e && this.B == -1 && this.H == null) ? false : true;
        if (recalculateAnchor) {
            anchorInfo.c();
            if (this.H != null) {
                H1(anchorInfo);
            } else {
                y2();
                anchorInfo.f1811c = this.z;
            }
            H2(state, anchorInfo);
            anchorInfo.f1813e = true;
        }
        if (this.H == null && this.B == -1 && !(anchorInfo.f1811c == this.F && n2() == this.G)) {
            this.D.b();
            anchorInfo.f1812d = true;
        }
        if (I() > 0 && ((eVar = this.H) == null || eVar.f1826d < 1)) {
            if (anchorInfo.f1812d) {
                for (int i = 0; i < this.r; i++) {
                    this.s[i].e();
                    int i2 = anchorInfo.f1810b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.s[i].v(i2);
                    }
                }
            } else if (recalculateAnchor || this.K.f1814f == null) {
                for (int i3 = 0; i3 < this.r; i3++) {
                    this.s[i3].b(this.z, anchorInfo.f1810b);
                }
                this.K.d(this.s);
            } else {
                for (int i4 = 0; i4 < this.r; i4++) {
                    f span = this.s[i4];
                    span.e();
                    span.v(this.K.f1814f[i4]);
                }
            }
        }
        v(recycler);
        this.x.f1287a = false;
        this.L = false;
        J2(this.u.n());
        I2(anchorInfo.f1809a, state);
        if (anchorInfo.f1811c) {
            A2(-1);
            V1(recycler, this.x, state);
            A2(1);
            a.o.c.f fVar = this.x;
            fVar.f1289c = anchorInfo.f1809a + fVar.f1290d;
            V1(recycler, fVar, state);
        } else {
            A2(1);
            V1(recycler, this.x, state);
            A2(-1);
            a.o.c.f fVar2 = this.x;
            fVar2.f1289c = anchorInfo.f1809a + fVar2.f1290d;
            V1(recycler, fVar2, state);
        }
        x2();
        if (I() > 0) {
            if (this.z) {
                b2(recycler, state, true);
                c2(recycler, state, false);
            } else {
                c2(recycler, state, true);
                b2(recycler, state, false);
            }
        }
        boolean hasGaps = false;
        if (shouldCheckForGaps && !state.d()) {
            if (this.E == 0 || I() <= 0 || (!this.L && l2() == null)) {
                needToCheckForGaps = false;
            }
            if (needToCheckForGaps) {
                l1(this.O);
                if (M1()) {
                    hasGaps = true;
                }
            }
        }
        if (state.d()) {
            this.K.c();
        }
        this.F = anchorInfo.f1811c;
        this.G = n2();
        if (hasGaps) {
            this.K.c();
            q2(recycler, state, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView.y state) {
        super.W0(state);
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.H = null;
        this.K.c();
    }

    /* JADX INFO: Multiple debug info for r2v2 int: [D('i' int), D('before' int)] */
    public final void x2() {
        if (this.u.k() != 1073741824) {
            float maxSize = 0.0f;
            int childCount = I();
            for (int i = 0; i < childCount; i++) {
                View child = H(i);
                float size = (float) this.u.e(child);
                if (size >= maxSize) {
                    ((c) child.getLayoutParams()).f();
                    maxSize = Math.max(maxSize, size);
                }
            }
            int before = this.w;
            int desired = Math.round(((float) this.r) * maxSize);
            if (this.u.k() == Integer.MIN_VALUE) {
                desired = Math.min(desired, this.u.n());
            }
            J2(desired);
            if (this.w != before) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child2 = H(i2);
                    c lp = (c) child2.getLayoutParams();
                    if (!lp.f1817f) {
                        if (!n2() || this.v != 1) {
                            int i3 = lp.f1816e.f1834e;
                            int newOffset = this.w * i3;
                            int prevOffset = i3 * before;
                            if (this.v == 1) {
                                child2.offsetLeftAndRight(newOffset - prevOffset);
                            } else {
                                child2.offsetTopAndBottom(newOffset - prevOffset);
                            }
                        } else {
                            int i4 = this.r;
                            int i5 = lp.f1816e.f1834e;
                            child2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.w) - ((-((i4 - 1) - i5)) * before));
                        }
                    }
                }
            }
        }
    }

    public final void H1(b anchorInfo) {
        e eVar = this.H;
        int i = eVar.f1826d;
        if (i > 0) {
            if (i == this.r) {
                for (int i2 = 0; i2 < this.r; i2++) {
                    this.s[i2].e();
                    e eVar2 = this.H;
                    int line = eVar2.f1827e[i2];
                    if (line != Integer.MIN_VALUE) {
                        if (eVar2.j) {
                            line += this.t.i();
                        } else {
                            line += this.t.m();
                        }
                    }
                    this.s[i2].v(line);
                }
            } else {
                eVar.a();
                e eVar3 = this.H;
                eVar3.f1824b = eVar3.f1825c;
            }
        }
        e eVar4 = this.H;
        this.G = eVar4.k;
        C2(eVar4.i);
        y2();
        e eVar5 = this.H;
        int i3 = eVar5.f1824b;
        if (i3 != -1) {
            this.B = i3;
            anchorInfo.f1811c = eVar5.j;
        } else {
            anchorInfo.f1811c = this.z;
        }
        e eVar6 = this.H;
        if (eVar6.f1828f > 1) {
            d dVar = this.D;
            dVar.f1818a = eVar6.f1829g;
            dVar.f1819b = eVar6.h;
        }
    }

    public void H2(RecyclerView.y state, b anchorInfo) {
        if (!G2(state, anchorInfo)) {
            F2(state, anchorInfo);
        }
    }

    public final boolean F2(RecyclerView.y state, b anchorInfo) {
        int i;
        if (this.F) {
            i = a2(state.b());
        } else {
            i = W1(state.b());
        }
        anchorInfo.f1809a = i;
        anchorInfo.f1810b = Integer.MIN_VALUE;
        return true;
    }

    public boolean G2(RecyclerView.y state, b anchorInfo) {
        int i;
        int i2;
        int i3;
        boolean z2 = false;
        if (state.d() || (i = this.B) == -1) {
            return false;
        }
        if (i < 0 || i >= state.b()) {
            this.B = -1;
            this.C = Integer.MIN_VALUE;
            return false;
        }
        e eVar = this.H;
        if (eVar == null || eVar.f1824b == -1 || eVar.f1826d < 1) {
            View child = B(this.B);
            if (child != null) {
                if (this.z) {
                    i2 = e2();
                } else {
                    i2 = d2();
                }
                anchorInfo.f1809a = i2;
                if (this.C != Integer.MIN_VALUE) {
                    if (anchorInfo.f1811c) {
                        anchorInfo.f1810b = (this.t.i() - this.C) - this.t.d(child);
                    } else {
                        anchorInfo.f1810b = (this.t.m() + this.C) - this.t.g(child);
                    }
                    return true;
                } else if (this.t.e(child) > this.t.n()) {
                    if (anchorInfo.f1811c) {
                        i3 = this.t.i();
                    } else {
                        i3 = this.t.m();
                    }
                    anchorInfo.f1810b = i3;
                    return true;
                } else {
                    int startGap = this.t.g(child) - this.t.m();
                    if (startGap < 0) {
                        anchorInfo.f1810b = -startGap;
                        return true;
                    }
                    int endGap = this.t.i() - this.t.d(child);
                    if (endGap < 0) {
                        anchorInfo.f1810b = endGap;
                        return true;
                    }
                    anchorInfo.f1810b = Integer.MIN_VALUE;
                }
            } else {
                int i4 = this.B;
                anchorInfo.f1809a = i4;
                int i5 = this.C;
                if (i5 == Integer.MIN_VALUE) {
                    if (L1(i4) == 1) {
                        z2 = true;
                    }
                    anchorInfo.f1811c = z2;
                    anchorInfo.a();
                } else {
                    anchorInfo.b(i5);
                }
                anchorInfo.f1812d = true;
            }
        } else {
            anchorInfo.f1810b = Integer.MIN_VALUE;
            anchorInfo.f1809a = this.B;
        }
        return true;
    }

    public void J2(int totalSpace) {
        this.w = totalSpace / this.r;
        this.I = View.MeasureSpec.makeMeasureSpec(totalSpace, this.u.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F1() {
        return this.H == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.y state) {
        return P1(state);
    }

    public final int P1(RecyclerView.y state) {
        if (I() == 0) {
            return 0;
        }
        return j.b(state, this.t, Y1(!this.M), X1(!this.M), this, this.M, this.z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.y state) {
        return P1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int p(RecyclerView.y state) {
        return O1(state);
    }

    public final int O1(RecyclerView.y state) {
        if (I() == 0) {
            return 0;
        }
        return j.a(state, this.t, Y1(!this.M), X1(!this.M), this, this.M);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.y state) {
        return O1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.y state) {
        return Q1(state);
    }

    public final int Q1(RecyclerView.y state) {
        if (I() == 0) {
            return 0;
        }
        return j.c(state, this.t, Y1(!this.M), X1(!this.M), this, this.M);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.y state) {
        return Q1(state);
    }

    public final void p2(View child, c lp, boolean alreadyMeasured) {
        if (lp.f1817f) {
            if (this.v == 1) {
                o2(child, this.I, RecyclerView.o.J(V(), W(), e0() + b0(), ((ViewGroup.MarginLayoutParams) lp).height, true), alreadyMeasured);
            } else {
                o2(child, RecyclerView.o.J(m0(), n0(), c0() + d0(), ((ViewGroup.MarginLayoutParams) lp).width, true), this.I, alreadyMeasured);
            }
        } else if (this.v == 1) {
            o2(child, RecyclerView.o.J(this.w, n0(), 0, ((ViewGroup.MarginLayoutParams) lp).width, false), RecyclerView.o.J(V(), W(), e0() + b0(), ((ViewGroup.MarginLayoutParams) lp).height, true), alreadyMeasured);
        } else {
            o2(child, RecyclerView.o.J(m0(), n0(), c0() + d0(), ((ViewGroup.MarginLayoutParams) lp).width, true), RecyclerView.o.J(this.w, W(), 0, ((ViewGroup.MarginLayoutParams) lp).height, false), alreadyMeasured);
        }
    }

    public final void o2(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        i(child, this.J);
        c lp = (c) child.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) lp).leftMargin;
        Rect rect = this.J;
        int widthSpec2 = L2(widthSpec, i + rect.left, ((ViewGroup.MarginLayoutParams) lp).rightMargin + rect.right);
        int i2 = ((ViewGroup.MarginLayoutParams) lp).topMargin;
        Rect rect2 = this.J;
        int heightSpec2 = L2(heightSpec, i2 + rect2.top, ((ViewGroup.MarginLayoutParams) lp).bottomMargin + rect2.bottom);
        if (alreadyMeasured) {
            measure = D1(child, widthSpec2, heightSpec2, lp);
        } else {
            measure = B1(child, widthSpec2, heightSpec2, lp);
        }
        if (measure) {
            child.measure(widthSpec2, heightSpec2);
        }
    }

    public final int L2(int spec, int startInset, int endInset) {
        if (startInset == 0 && endInset == 0) {
            return spec;
        }
        int mode = View.MeasureSpec.getMode(spec);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(spec) - startInset) - endInset), mode);
        }
        return spec;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(Parcelable state) {
        if (state instanceof e) {
            this.H = (e) state;
            q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable b1() {
        int i;
        int line;
        int[] iArr;
        if (this.H != null) {
            return new e(this.H);
        }
        e state = new e();
        state.i = this.y;
        state.j = this.F;
        state.k = this.G;
        d dVar = this.D;
        if (dVar == null || (iArr = dVar.f1818a) == null) {
            state.f1828f = 0;
        } else {
            state.f1829g = iArr;
            state.f1828f = iArr.length;
            state.h = dVar.f1819b;
        }
        if (I() > 0) {
            if (this.F) {
                i = e2();
            } else {
                i = d2();
            }
            state.f1824b = i;
            state.f1825c = Z1();
            int i2 = this.r;
            state.f1826d = i2;
            state.f1827e = new int[i2];
            for (int i3 = 0; i3 < this.r; i3++) {
                if (this.F) {
                    line = this.s[i3].l(Integer.MIN_VALUE);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.t.i();
                    }
                } else {
                    line = this.s[i3].p(Integer.MIN_VALUE);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.t.m();
                    }
                }
                state.f1827e[i3] = line;
            }
        } else {
            state.f1824b = -1;
            state.f1825c = -1;
            state.f1826d = 0;
        }
        return state;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void N0(RecyclerView.u recycler, RecyclerView.y state, View host, a.h.m.c0.d info) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof c)) {
            super.M0(host, info);
            return;
        }
        c sglp = (c) lp;
        if (this.v == 0) {
            info.M(d.c.a(sglp.e(), sglp.f1817f ? this.r : 1, -1, -1, sglp.f1817f, false));
        } else {
            info.M(d.c.a(-1, -1, sglp.e(), sglp.f1817f ? this.r : 1, sglp.f1817f, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(AccessibilityEvent event) {
        super.I0(event);
        if (I() > 0) {
            View start = Y1(false);
            View end = X1(false);
            if (start != null && end != null) {
                int startPos = f0(start);
                int endPos = f0(end);
                if (startPos < endPos) {
                    event.setFromIndex(startPos);
                    event.setToIndex(endPos);
                    return;
                }
                event.setFromIndex(endPos);
                event.setToIndex(startPos);
            }
        }
    }

    public int Z1() {
        View first;
        if (this.z) {
            first = X1(true);
        } else {
            first = Y1(true);
        }
        if (first == null) {
            return -1;
        }
        return f0(first);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int i0(RecyclerView.u recycler, RecyclerView.y state) {
        if (this.v == 0) {
            return this.r;
        }
        return super.i0(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int M(RecyclerView.u recycler, RecyclerView.y state) {
        if (this.v == 1) {
            return this.r;
        }
        return super.M(recycler, state);
    }

    public View Y1(boolean fullyVisible) {
        int boundsStart = this.t.m();
        int boundsEnd = this.t.i();
        int limit = I();
        View partiallyVisible = null;
        for (int i = 0; i < limit; i++) {
            View child = H(i);
            int childStart = this.t.g(child);
            if (this.t.d(child) > boundsStart && childStart < boundsEnd) {
                if (childStart >= boundsStart || !fullyVisible) {
                    return child;
                }
                if (partiallyVisible == null) {
                    partiallyVisible = child;
                }
            }
        }
        return partiallyVisible;
    }

    public View X1(boolean fullyVisible) {
        int boundsStart = this.t.m();
        int boundsEnd = this.t.i();
        View partiallyVisible = null;
        for (int i = I() - 1; i >= 0; i--) {
            View child = H(i);
            int childStart = this.t.g(child);
            int childEnd = this.t.d(child);
            if (childEnd > boundsStart && childStart < boundsEnd) {
                if (childEnd <= boundsEnd || !fullyVisible) {
                    return child;
                }
                if (partiallyVisible == null) {
                    partiallyVisible = child;
                }
            }
        }
        return partiallyVisible;
    }

    public final void b2(RecyclerView.u recycler, RecyclerView.y state, boolean canOffsetChildren) {
        int gap;
        int maxEndLine = f2(Integer.MIN_VALUE);
        if (maxEndLine != Integer.MIN_VALUE && (gap = this.t.i() - maxEndLine) > 0) {
            int gap2 = gap - (-z2(-gap, recycler, state));
            if (canOffsetChildren && gap2 > 0) {
                this.t.r(gap2);
            }
        }
    }

    public final void c2(RecyclerView.u recycler, RecyclerView.y state, boolean canOffsetChildren) {
        int gap;
        int minStartLine = i2(Integer.MAX_VALUE);
        if (minStartLine != Integer.MAX_VALUE && (gap = minStartLine - this.t.m()) > 0) {
            int gap2 = gap - z2(gap, recycler, state);
            if (canOffsetChildren && gap2 > 0) {
                this.t.r(-gap2);
            }
        }
    }

    public final void I2(int anchorPosition, RecyclerView.y state) {
        a.o.c.f fVar = this.x;
        boolean z2 = false;
        fVar.f1288b = 0;
        fVar.f1289c = anchorPosition;
        v0();
        if (L()) {
            this.x.f1292f = this.t.m() - 0;
            this.x.f1293g = this.t.i() + 0;
        } else {
            this.x.f1293g = this.t.h() + 0;
            this.x.f1292f = -0;
        }
        a.o.c.f fVar2 = this.x;
        fVar2.h = false;
        fVar2.f1287a = true;
        if (this.t.k() == 0 && this.t.h() == 0) {
            z2 = true;
        }
        fVar2.i = z2;
    }

    public final void A2(int direction) {
        a.o.c.f fVar = this.x;
        fVar.f1291e = direction;
        int i = 1;
        if (this.z != (direction == -1)) {
            i = -1;
        }
        fVar.f1290d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void A0(int dx) {
        super.A0(dx);
        for (int i = 0; i < this.r; i++) {
            this.s[i].r(dx);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B0(int dy) {
        super.B0(dy);
        for (int i = 0; i < this.r; i++) {
            this.s[i].r(dy);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView, int positionStart, int itemCount) {
        k2(positionStart, itemCount, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView recyclerView, int positionStart, int itemCount) {
        k2(positionStart, itemCount, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Q0(RecyclerView recyclerView) {
        this.D.b();
        q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int from, int to, int itemCount) {
        k2(from, to, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        k2(positionStart, itemCount, 4);
    }

    public final void k2(int positionStart, int itemCountOrToPosition, int cmd) {
        int affectedRangeStart;
        int affectedRangeEnd;
        int minPosition = this.z ? e2() : d2();
        if (cmd != 8) {
            affectedRangeStart = positionStart;
            affectedRangeEnd = positionStart + itemCountOrToPosition;
        } else if (positionStart < itemCountOrToPosition) {
            affectedRangeEnd = itemCountOrToPosition + 1;
            affectedRangeStart = positionStart;
        } else {
            affectedRangeEnd = positionStart + 1;
            affectedRangeStart = itemCountOrToPosition;
        }
        this.D.h(affectedRangeStart);
        if (cmd == 1) {
            this.D.j(positionStart, itemCountOrToPosition);
        } else if (cmd == 2) {
            this.D.k(positionStart, itemCountOrToPosition);
        } else if (cmd == 8) {
            this.D.k(positionStart, 1);
            this.D.j(itemCountOrToPosition, 1);
        }
        if (affectedRangeEnd > minPosition) {
            if (affectedRangeStart <= (this.z ? d2() : e2())) {
                q1();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final int V1(RecyclerView.u recycler, a.o.c.f layoutState, RecyclerView.y state) {
        int targetLine;
        int defaultNewViewLine;
        int diff;
        f currentSpan;
        int end;
        int start;
        int otherStart;
        int otherEnd;
        f currentSpan2;
        int otherStart2;
        int otherEnd2;
        boolean hasInvalidGap;
        int i;
        f currentSpan3;
        boolean z2 = false;
        ?? r10 = 1;
        this.A.set(0, this.r, true);
        if (this.x.i) {
            if (layoutState.f1291e == 1) {
                targetLine = Integer.MAX_VALUE;
            } else {
                targetLine = Integer.MIN_VALUE;
            }
        } else if (layoutState.f1291e == 1) {
            targetLine = layoutState.f1293g + layoutState.f1288b;
        } else {
            targetLine = layoutState.f1292f - layoutState.f1288b;
        }
        E2(layoutState.f1291e, targetLine);
        if (this.z) {
            defaultNewViewLine = this.t.i();
        } else {
            defaultNewViewLine = this.t.m();
        }
        boolean added = false;
        while (true) {
            if (layoutState.a(state)) {
                if (!this.x.i && this.A.isEmpty()) {
                    break;
                }
                View view = layoutState.b(recycler);
                c lp = (c) view.getLayoutParams();
                int position = lp.a();
                int spanIndex = this.D.g(position);
                boolean assignSpan = spanIndex == -1;
                if (assignSpan) {
                    if (lp.f1817f) {
                        f[] fVarArr = this.s;
                        char c2 = z2 ? 1 : 0;
                        char c3 = z2 ? 1 : 0;
                        char c4 = z2 ? 1 : 0;
                        currentSpan3 = fVarArr[c2];
                    } else {
                        currentSpan3 = j2(layoutState);
                    }
                    this.D.n(position, currentSpan3);
                    currentSpan = currentSpan3;
                } else {
                    currentSpan = this.s[spanIndex];
                }
                lp.f1816e = currentSpan;
                if (layoutState.f1291e == r10) {
                    c(view);
                } else {
                    int i2 = z2 ? 1 : 0;
                    int i3 = z2 ? 1 : 0;
                    int i4 = z2 ? 1 : 0;
                    d(view, i2);
                }
                p2(view, lp, z2);
                if (layoutState.f1291e == r10) {
                    if (lp.f1817f) {
                        start = f2(defaultNewViewLine);
                    } else {
                        start = currentSpan.l(defaultNewViewLine);
                    }
                    end = this.t.e(view) + start;
                    if (assignSpan && lp.f1817f) {
                        d.a fullSpanItem = S1(start);
                        fullSpanItem.f1821c = -1;
                        fullSpanItem.f1820b = position;
                        this.D.a(fullSpanItem);
                    }
                } else {
                    if (lp.f1817f) {
                        i = i2(defaultNewViewLine);
                    } else {
                        i = currentSpan.p(defaultNewViewLine);
                    }
                    end = i;
                    start = end - this.t.e(view);
                    if (assignSpan && lp.f1817f) {
                        d.a fullSpanItem2 = T1(end);
                        fullSpanItem2.f1821c = r10;
                        fullSpanItem2.f1820b = position;
                        this.D.a(fullSpanItem2);
                    }
                }
                if (lp.f1817f && layoutState.f1290d == -1) {
                    if (assignSpan) {
                        this.L = r10;
                    } else {
                        if (layoutState.f1291e == r10) {
                            hasInvalidGap = (I1() ? 1 : 0) ^ r10;
                        } else {
                            boolean hasInvalidGap2 = J1();
                            boolean z3 = r10 == true ? 1 : 0;
                            boolean z4 = r10 == true ? 1 : 0;
                            boolean z5 = r10 == true ? 1 : 0;
                            hasInvalidGap = (hasInvalidGap2 ? 1 : 0) ^ z3;
                        }
                        if (hasInvalidGap) {
                            d.a fullSpanItem3 = this.D.f(position);
                            if (fullSpanItem3 != null) {
                                fullSpanItem3.f1823e = r10;
                            }
                            this.L = r10;
                        }
                    }
                }
                K1(view, lp, layoutState);
                if (!n2() || this.v != r10) {
                    if (lp.f1817f) {
                        otherStart2 = this.u.m();
                    } else {
                        otherStart2 = (currentSpan.f1834e * this.w) + this.u.m();
                    }
                    otherEnd = this.u.e(view) + otherStart2;
                    otherStart = otherStart2;
                } else {
                    if (lp.f1817f) {
                        otherEnd2 = this.u.i();
                    } else {
                        int i5 = this.u.i();
                        int i6 = this.r;
                        int i7 = r10 == true ? 1 : 0;
                        int i8 = r10 == true ? 1 : 0;
                        int i9 = r10 == true ? 1 : 0;
                        otherEnd2 = i5 - (((i6 - i7) - currentSpan.f1834e) * this.w);
                    }
                    otherEnd = otherEnd2;
                    otherStart = otherEnd2 - this.u.e(view);
                }
                if (this.v == r10) {
                    currentSpan2 = currentSpan;
                    x0(view, otherStart, start, otherEnd, end);
                } else {
                    currentSpan2 = currentSpan;
                    x0(view, start, otherStart, end, otherEnd);
                }
                if (lp.f1817f) {
                    E2(this.x.f1291e, targetLine);
                } else {
                    K2(currentSpan2, this.x.f1291e, targetLine);
                }
                u2(recycler, this.x);
                if (this.x.h && view.hasFocusable()) {
                    if (lp.f1817f) {
                        this.A.clear();
                    } else {
                        this.A.set(currentSpan2.f1834e, false);
                    }
                }
                added = true;
                z2 = false;
                r10 = 1;
            } else {
                break;
            }
        }
        if (!added) {
            u2(recycler, this.x);
        }
        if (this.x.f1291e == -1) {
            diff = this.t.m() - i2(this.t.m());
        } else {
            diff = f2(this.t.i()) - this.t.i();
        }
        if (diff > 0) {
            return Math.min(layoutState.f1288b, diff);
        }
        return 0;
    }

    public final d.a S1(int newItemTop) {
        d.a fsi = new d.a();
        fsi.f1822d = new int[this.r];
        for (int i = 0; i < this.r; i++) {
            fsi.f1822d[i] = newItemTop - this.s[i].l(newItemTop);
        }
        return fsi;
    }

    public final d.a T1(int newItemBottom) {
        d.a fsi = new d.a();
        fsi.f1822d = new int[this.r];
        for (int i = 0; i < this.r; i++) {
            fsi.f1822d[i] = this.s[i].p(newItemBottom) - newItemBottom;
        }
        return fsi;
    }

    public final void K1(View view, c lp, a.o.c.f layoutState) {
        if (layoutState.f1291e == 1) {
            if (lp.f1817f) {
                G1(view);
            } else {
                lp.f1816e.a(view);
            }
        } else if (lp.f1817f) {
            t2(view);
        } else {
            lp.f1816e.u(view);
        }
    }

    public final void u2(RecyclerView.u recycler, a.o.c.f layoutState) {
        int line;
        int line2;
        if (layoutState.f1287a && !layoutState.i) {
            if (layoutState.f1288b == 0) {
                if (layoutState.f1291e == -1) {
                    v2(recycler, layoutState.f1293g);
                } else {
                    w2(recycler, layoutState.f1292f);
                }
            } else if (layoutState.f1291e == -1) {
                int i = layoutState.f1292f;
                int scrolled = i - g2(i);
                if (scrolled < 0) {
                    line2 = layoutState.f1293g;
                } else {
                    line2 = layoutState.f1293g - Math.min(scrolled, layoutState.f1288b);
                }
                v2(recycler, line2);
            } else {
                int scrolled2 = h2(layoutState.f1293g) - layoutState.f1293g;
                if (scrolled2 < 0) {
                    line = layoutState.f1292f;
                } else {
                    line = layoutState.f1292f + Math.min(scrolled2, layoutState.f1288b);
                }
                w2(recycler, line);
            }
        }
    }

    public final void G1(View view) {
        for (int i = this.r - 1; i >= 0; i--) {
            this.s[i].a(view);
        }
    }

    public final void t2(View view) {
        for (int i = this.r - 1; i >= 0; i--) {
            this.s[i].u(view);
        }
    }

    public final void E2(int layoutDir, int targetLine) {
        for (int i = 0; i < this.r; i++) {
            if (!this.s[i].f1830a.isEmpty()) {
                K2(this.s[i], layoutDir, targetLine);
            }
        }
    }

    public final void K2(f span, int layoutDir, int targetLine) {
        int deletedSize = span.j();
        if (layoutDir == -1) {
            if (span.o() + deletedSize <= targetLine) {
                this.A.set(span.f1834e, false);
            }
        } else if (span.k() - deletedSize >= targetLine) {
            this.A.set(span.f1834e, false);
        }
    }

    public final int g2(int def) {
        int maxStart = this.s[0].p(def);
        for (int i = 1; i < this.r; i++) {
            int spanStart = this.s[i].p(def);
            if (spanStart > maxStart) {
                maxStart = spanStart;
            }
        }
        return maxStart;
    }

    public final int i2(int def) {
        int minStart = this.s[0].p(def);
        for (int i = 1; i < this.r; i++) {
            int spanStart = this.s[i].p(def);
            if (spanStart < minStart) {
                minStart = spanStart;
            }
        }
        return minStart;
    }

    public boolean I1() {
        int end = this.s[0].l(Integer.MIN_VALUE);
        for (int i = 1; i < this.r; i++) {
            if (this.s[i].l(Integer.MIN_VALUE) != end) {
                return false;
            }
        }
        return true;
    }

    public boolean J1() {
        int start = this.s[0].p(Integer.MIN_VALUE);
        for (int i = 1; i < this.r; i++) {
            if (this.s[i].p(Integer.MIN_VALUE) != start) {
                return false;
            }
        }
        return true;
    }

    public final int f2(int def) {
        int maxEnd = this.s[0].l(def);
        for (int i = 1; i < this.r; i++) {
            int spanEnd = this.s[i].l(def);
            if (spanEnd > maxEnd) {
                maxEnd = spanEnd;
            }
        }
        return maxEnd;
    }

    public final int h2(int def) {
        int minEnd = this.s[0].l(def);
        for (int i = 1; i < this.r; i++) {
            int spanEnd = this.s[i].l(def);
            if (spanEnd < minEnd) {
                minEnd = spanEnd;
            }
        }
        return minEnd;
    }

    public final void w2(RecyclerView.u recycler, int line) {
        while (I() > 0) {
            View child = H(0);
            if (this.t.d(child) <= line && this.t.p(child) <= line) {
                c lp = (c) child.getLayoutParams();
                if (lp.f1817f) {
                    for (int j = 0; j < this.r; j++) {
                        if (this.s[j].f1830a.size() == 1) {
                            return;
                        }
                    }
                    for (int j2 = 0; j2 < this.r; j2++) {
                        this.s[j2].t();
                    }
                } else if (lp.f1816e.f1830a.size() != 1) {
                    lp.f1816e.t();
                } else {
                    return;
                }
                j1(child, recycler);
            } else {
                return;
            }
        }
    }

    public final void v2(RecyclerView.u recycler, int line) {
        for (int i = I() - 1; i >= 0; i--) {
            View child = H(i);
            if (this.t.g(child) >= line && this.t.q(child) >= line) {
                c lp = (c) child.getLayoutParams();
                if (lp.f1817f) {
                    for (int j = 0; j < this.r; j++) {
                        if (this.s[j].f1830a.size() == 1) {
                            return;
                        }
                    }
                    for (int j2 = 0; j2 < this.r; j2++) {
                        this.s[j2].s();
                    }
                } else if (lp.f1816e.f1830a.size() != 1) {
                    lp.f1816e.s();
                } else {
                    return;
                }
                j1(child, recycler);
            } else {
                return;
            }
        }
    }

    public final boolean r2(int layoutDir) {
        if (this.v == 0) {
            if ((layoutDir == -1) != this.z) {
                return true;
            }
            return false;
        }
        if (((layoutDir == -1) == this.z) == n2()) {
            return true;
        }
        return false;
    }

    public final f j2(a.o.c.f layoutState) {
        int diff;
        int endIndex;
        int startIndex;
        if (r2(layoutState.f1291e)) {
            startIndex = this.r - 1;
            endIndex = -1;
            diff = -1;
        } else {
            startIndex = 0;
            endIndex = this.r;
            diff = 1;
        }
        if (layoutState.f1291e == 1) {
            f min = null;
            int minLine = Integer.MAX_VALUE;
            int defaultLine = this.t.m();
            for (int i = startIndex; i != endIndex; i += diff) {
                f other = this.s[i];
                int otherLine = other.l(defaultLine);
                if (otherLine < minLine) {
                    min = other;
                    minLine = otherLine;
                }
            }
            return min;
        }
        f max = null;
        int maxLine = Integer.MIN_VALUE;
        int defaultLine2 = this.t.i();
        for (int i2 = startIndex; i2 != endIndex; i2 += diff) {
            f other2 = this.s[i2];
            int otherLine2 = other2.p(defaultLine2);
            if (otherLine2 > maxLine) {
                max = other2;
                maxLine = otherLine2;
            }
        }
        return max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.v == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j() {
        return this.v == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t1(int dx, RecyclerView.u recycler, RecyclerView.y state) {
        return z2(dx, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u1(int dy, RecyclerView.u recycler, RecyclerView.y state) {
        return z2(dy, recycler, state);
    }

    public final int L1(int position) {
        if (I() != 0) {
            if ((position < d2()) != this.z) {
                return -1;
            }
            return 1;
        } else if (this.z) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n(int dx, int dy, RecyclerView.y state, RecyclerView.o.c layoutPrefetchRegistry) {
        int distance;
        int delta = this.v == 0 ? dx : dy;
        if (!(I() == 0 || delta == 0)) {
            s2(delta, state);
            int[] iArr = this.N;
            if (iArr == null || iArr.length < this.r) {
                this.N = new int[this.r];
            }
            int itemPrefetchCount = 0;
            for (int i = 0; i < this.r; i++) {
                a.o.c.f fVar = this.x;
                if (fVar.f1290d == -1) {
                    int i2 = fVar.f1292f;
                    distance = i2 - this.s[i].p(i2);
                } else {
                    distance = this.s[i].l(fVar.f1293g) - this.x.f1293g;
                }
                if (distance >= 0) {
                    this.N[itemPrefetchCount] = distance;
                    itemPrefetchCount++;
                }
            }
            Arrays.sort(this.N, 0, itemPrefetchCount);
            for (int i3 = 0; i3 < itemPrefetchCount && this.x.a(state); i3++) {
                ((e.b) layoutPrefetchRegistry).a(this.x.f1289c, this.N[i3]);
                a.o.c.f fVar2 = this.x;
                fVar2.f1289c += fVar2.f1290d;
            }
        }
    }

    public void s2(int delta, RecyclerView.y state) {
        int referenceChildPosition;
        int layoutDir;
        if (delta > 0) {
            layoutDir = 1;
            referenceChildPosition = e2();
        } else {
            layoutDir = -1;
            referenceChildPosition = d2();
        }
        this.x.f1287a = true;
        I2(referenceChildPosition, state);
        A2(layoutDir);
        a.o.c.f fVar = this.x;
        fVar.f1289c = fVar.f1290d + referenceChildPosition;
        fVar.f1288b = Math.abs(delta);
    }

    public int z2(int dt, RecyclerView.u recycler, RecyclerView.y state) {
        int totalScroll;
        if (I() == 0 || dt == 0) {
            return 0;
        }
        s2(dt, state);
        int consumed = V1(recycler, this.x, state);
        if (this.x.f1288b < consumed) {
            totalScroll = dt;
        } else if (dt < 0) {
            totalScroll = -consumed;
        } else {
            totalScroll = consumed;
        }
        this.t.r(-totalScroll);
        this.F = this.z;
        a.o.c.f fVar = this.x;
        fVar.f1288b = 0;
        u2(recycler, fVar);
        return totalScroll;
    }

    public int e2() {
        int childCount = I();
        if (childCount == 0) {
            return 0;
        }
        return f0(H(childCount - 1));
    }

    public int d2() {
        if (I() == 0) {
            return 0;
        }
        return f0(H(0));
    }

    public final int W1(int itemCount) {
        int limit = I();
        for (int i = 0; i < limit; i++) {
            int position = f0(H(i));
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    public final int a2(int itemCount) {
        for (int i = I() - 1; i >= 0; i--) {
            int position = f0(H(i));
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p C() {
        if (this.v == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D(Context c2, AttributeSet attrs) {
        return new c(c2, attrs);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) lp);
        }
        return new c(lp);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l(RecyclerView.p lp) {
        return lp instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H0(View focused, int direction, RecyclerView.u recycler, RecyclerView.y state) {
        View directChild;
        int referenceChildPosition;
        int i;
        int i2;
        int i3;
        View view;
        if (I() == 0 || (directChild = A(focused)) == null) {
            return null;
        }
        y2();
        int layoutDir = R1(direction);
        if (layoutDir == Integer.MIN_VALUE) {
            return null;
        }
        c prevFocusLayoutParams = (c) directChild.getLayoutParams();
        boolean prevFocusFullSpan = prevFocusLayoutParams.f1817f;
        f prevFocusSpan = prevFocusLayoutParams.f1816e;
        if (layoutDir == 1) {
            referenceChildPosition = e2();
        } else {
            referenceChildPosition = d2();
        }
        I2(referenceChildPosition, state);
        A2(layoutDir);
        a.o.c.f fVar = this.x;
        fVar.f1289c = fVar.f1290d + referenceChildPosition;
        fVar.f1288b = (int) (((float) this.t.n()) * 0.33333334f);
        a.o.c.f fVar2 = this.x;
        fVar2.h = true;
        boolean shouldSearchFromStart = false;
        fVar2.f1287a = false;
        V1(recycler, fVar2, state);
        this.F = this.z;
        if (!(prevFocusFullSpan || (view = prevFocusSpan.m(referenceChildPosition, layoutDir)) == null || view == directChild)) {
            return view;
        }
        if (r2(layoutDir)) {
            for (int i4 = this.r - 1; i4 >= 0; i4--) {
                View view2 = this.s[i4].m(referenceChildPosition, layoutDir);
                if (!(view2 == null || view2 == directChild)) {
                    return view2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.r; i5++) {
                View view3 = this.s[i5].m(referenceChildPosition, layoutDir);
                if (!(view3 == null || view3 == directChild)) {
                    return view3;
                }
            }
        }
        if ((!this.y) == (layoutDir == -1)) {
            shouldSearchFromStart = true;
        }
        if (!prevFocusFullSpan) {
            if (shouldSearchFromStart) {
                i3 = prevFocusSpan.f();
            } else {
                i3 = prevFocusSpan.g();
            }
            View unfocusableCandidate = B(i3);
            if (!(unfocusableCandidate == null || unfocusableCandidate == directChild)) {
                return unfocusableCandidate;
            }
        }
        if (r2(layoutDir)) {
            for (int i6 = this.r - 1; i6 >= 0; i6--) {
                if (i6 != prevFocusSpan.f1834e) {
                    if (shouldSearchFromStart) {
                        i2 = this.s[i6].f();
                    } else {
                        i2 = this.s[i6].g();
                    }
                    View unfocusableCandidate2 = B(i2);
                    if (!(unfocusableCandidate2 == null || unfocusableCandidate2 == directChild)) {
                        return unfocusableCandidate2;
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < this.r; i7++) {
                if (shouldSearchFromStart) {
                    i = this.s[i7].f();
                } else {
                    i = this.s[i7].g();
                }
                View unfocusableCandidate3 = B(i);
                if (!(unfocusableCandidate3 == null || unfocusableCandidate3 == directChild)) {
                    return unfocusableCandidate3;
                }
            }
        }
        return null;
    }

    public final int R1(int focusDirection) {
        if (focusDirection != 1) {
            if (focusDirection != 2) {
                if (focusDirection != 17) {
                    if (focusDirection != 33) {
                        if (focusDirection != 66) {
                            if (focusDirection == 130 && this.v == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.v == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.v == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.v == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.v != 1 && n2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.v != 1 && n2()) {
            return 1;
        } else {
            return -1;
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        public f f1816e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1817f;

        public c(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public c(int width, int height) {
            super(width, height);
        }

        public c(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public c(ViewGroup.LayoutParams source) {
            super(source);
        }

        public boolean f() {
            return false;
        }

        public final int e() {
            f fVar = this.f1816e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f1834e;
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f1830a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1831b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f1832c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f1833d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f1834e;

        public f(int index) {
            this.f1834e = index;
        }

        public int p(int def) {
            int i = this.f1831b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.f1830a.size() == 0) {
                return def;
            }
            d();
            return this.f1831b;
        }

        public void d() {
            d.a fsi;
            View startView = this.f1830a.get(0);
            c lp = n(startView);
            this.f1831b = StaggeredGridLayoutManager.this.t.g(startView);
            if (lp.f1817f && (fsi = StaggeredGridLayoutManager.this.D.f(lp.a())) != null && fsi.f1821c == -1) {
                this.f1831b -= fsi.a(this.f1834e);
            }
        }

        public int o() {
            int i = this.f1831b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.f1831b;
        }

        public int l(int def) {
            int i = this.f1832c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.f1830a.size() == 0) {
                return def;
            }
            c();
            return this.f1832c;
        }

        public void c() {
            d.a fsi;
            ArrayList<View> arrayList = this.f1830a;
            View endView = arrayList.get(arrayList.size() - 1);
            c lp = n(endView);
            this.f1832c = StaggeredGridLayoutManager.this.t.d(endView);
            if (lp.f1817f && (fsi = StaggeredGridLayoutManager.this.D.f(lp.a())) != null && fsi.f1821c == 1) {
                this.f1832c += fsi.a(this.f1834e);
            }
        }

        public int k() {
            int i = this.f1832c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.f1832c;
        }

        public void u(View view) {
            c lp = n(view);
            lp.f1816e = this;
            this.f1830a.add(0, view);
            this.f1831b = Integer.MIN_VALUE;
            if (this.f1830a.size() == 1) {
                this.f1832c = Integer.MIN_VALUE;
            }
            if (lp.c() || lp.b()) {
                this.f1833d += StaggeredGridLayoutManager.this.t.e(view);
            }
        }

        public void a(View view) {
            c lp = n(view);
            lp.f1816e = this;
            this.f1830a.add(view);
            this.f1832c = Integer.MIN_VALUE;
            if (this.f1830a.size() == 1) {
                this.f1831b = Integer.MIN_VALUE;
            }
            if (lp.c() || lp.b()) {
                this.f1833d += StaggeredGridLayoutManager.this.t.e(view);
            }
        }

        public void b(boolean reverseLayout, int offset) {
            int reference;
            if (reverseLayout) {
                reference = l(Integer.MIN_VALUE);
            } else {
                reference = p(Integer.MIN_VALUE);
            }
            e();
            if (reference != Integer.MIN_VALUE) {
                if (reverseLayout && reference < StaggeredGridLayoutManager.this.t.i()) {
                    return;
                }
                if (reverseLayout || reference <= StaggeredGridLayoutManager.this.t.m()) {
                    if (offset != Integer.MIN_VALUE) {
                        reference += offset;
                    }
                    this.f1832c = reference;
                    this.f1831b = reference;
                }
            }
        }

        public void e() {
            this.f1830a.clear();
            q();
            this.f1833d = 0;
        }

        public void q() {
            this.f1831b = Integer.MIN_VALUE;
            this.f1832c = Integer.MIN_VALUE;
        }

        public void v(int line) {
            this.f1831b = line;
            this.f1832c = line;
        }

        public void s() {
            int size = this.f1830a.size();
            View end = this.f1830a.remove(size - 1);
            c lp = n(end);
            lp.f1816e = null;
            if (lp.c() || lp.b()) {
                this.f1833d -= StaggeredGridLayoutManager.this.t.e(end);
            }
            if (size == 1) {
                this.f1831b = Integer.MIN_VALUE;
            }
            this.f1832c = Integer.MIN_VALUE;
        }

        public void t() {
            View start = this.f1830a.remove(0);
            c lp = n(start);
            lp.f1816e = null;
            if (this.f1830a.size() == 0) {
                this.f1832c = Integer.MIN_VALUE;
            }
            if (lp.c() || lp.b()) {
                this.f1833d -= StaggeredGridLayoutManager.this.t.e(start);
            }
            this.f1831b = Integer.MIN_VALUE;
        }

        public int j() {
            return this.f1833d;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public void r(int dt) {
            int i = this.f1831b;
            if (i != Integer.MIN_VALUE) {
                this.f1831b = i + dt;
            }
            int i2 = this.f1832c;
            if (i2 != Integer.MIN_VALUE) {
                this.f1832c = i2 + dt;
            }
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.y) {
                return i(this.f1830a.size() - 1, -1, true);
            }
            return i(0, this.f1830a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.y) {
                return i(0, this.f1830a.size(), true);
            }
            return i(this.f1830a.size() - 1, -1, true);
        }

        public int h(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptCompletelyVisible, boolean acceptEndPointInclusion) {
            int start = StaggeredGridLayoutManager.this.t.m();
            int end = StaggeredGridLayoutManager.this.t.i();
            int next = toIndex > fromIndex ? 1 : -1;
            for (int i = fromIndex; i != toIndex; i += next) {
                View child = this.f1830a.get(i);
                int childStart = StaggeredGridLayoutManager.this.t.g(child);
                int childEnd = StaggeredGridLayoutManager.this.t.d(child);
                boolean childEndInclusion = false;
                boolean childStartInclusion = !acceptEndPointInclusion ? childStart < end : childStart <= end;
                if (!acceptEndPointInclusion ? childEnd > start : childEnd >= start) {
                    childEndInclusion = true;
                }
                if (childStartInclusion && childEndInclusion) {
                    if (!completelyVisible || !acceptCompletelyVisible) {
                        if (acceptCompletelyVisible) {
                            return StaggeredGridLayoutManager.this.f0(child);
                        }
                        if (childStart < start || childEnd > end) {
                            return StaggeredGridLayoutManager.this.f0(child);
                        }
                    } else if (childStart >= start && childEnd <= end) {
                        return StaggeredGridLayoutManager.this.f0(child);
                    }
                }
            }
            return -1;
        }

        public int i(int fromIndex, int toIndex, boolean acceptEndPointInclusion) {
            return h(fromIndex, toIndex, false, false, acceptEndPointInclusion);
        }

        public View m(int referenceChildPosition, int layoutDir) {
            View candidate = null;
            if (layoutDir != -1) {
                for (int i = this.f1830a.size() - 1; i >= 0; i--) {
                    View view = this.f1830a.get(i);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.y && staggeredGridLayoutManager.f0(view) >= referenceChildPosition) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.y && staggeredGridLayoutManager2.f0(view) <= referenceChildPosition) || !view.hasFocusable()) {
                        break;
                    }
                    candidate = view;
                }
            } else {
                int limit = this.f1830a.size();
                for (int i2 = 0; i2 < limit; i2++) {
                    View view2 = this.f1830a.get(i2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.y && staggeredGridLayoutManager3.f0(view2) <= referenceChildPosition) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.y && staggeredGridLayoutManager4.f0(view2) >= referenceChildPosition) || !view2.hasFocusable()) {
                        break;
                    }
                    candidate = view2;
                }
            }
            return candidate;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f1818a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f1819b;

        public int d(int position) {
            List<a> list = this.f1819b;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (this.f1819b.get(i).f1820b >= position) {
                        this.f1819b.remove(i);
                    }
                }
            }
            return h(position);
        }

        public int h(int position) {
            int[] iArr = this.f1818a;
            if (iArr == null || position >= iArr.length) {
                return -1;
            }
            int endPosition = i(position);
            if (endPosition == -1) {
                int[] iArr2 = this.f1818a;
                Arrays.fill(iArr2, position, iArr2.length, -1);
                return this.f1818a.length;
            }
            Arrays.fill(this.f1818a, position, endPosition + 1, -1);
            return endPosition + 1;
        }

        public int g(int position) {
            int[] iArr = this.f1818a;
            if (iArr == null || position >= iArr.length) {
                return -1;
            }
            return iArr[position];
        }

        public void n(int position, f span) {
            c(position);
            this.f1818a[position] = span.f1834e;
        }

        public int o(int position) {
            int len = this.f1818a.length;
            while (len <= position) {
                len *= 2;
            }
            return len;
        }

        public void c(int position) {
            int[] iArr = this.f1818a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(position, 10) + 1)];
                this.f1818a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (position >= iArr.length) {
                int[] old = this.f1818a;
                int[] iArr3 = new int[o(position)];
                this.f1818a = iArr3;
                System.arraycopy(old, 0, iArr3, 0, old.length);
                int[] iArr4 = this.f1818a;
                Arrays.fill(iArr4, old.length, iArr4.length, -1);
            }
        }

        public void b() {
            int[] iArr = this.f1818a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1819b = null;
        }

        public void k(int positionStart, int itemCount) {
            int[] iArr = this.f1818a;
            if (iArr != null && positionStart < iArr.length) {
                c(positionStart + itemCount);
                int[] iArr2 = this.f1818a;
                System.arraycopy(iArr2, positionStart + itemCount, iArr2, positionStart, (iArr2.length - positionStart) - itemCount);
                int[] iArr3 = this.f1818a;
                Arrays.fill(iArr3, iArr3.length - itemCount, iArr3.length, -1);
                m(positionStart, itemCount);
            }
        }

        public final void m(int positionStart, int itemCount) {
            List<a> list = this.f1819b;
            if (list != null) {
                int end = positionStart + itemCount;
                for (int i = list.size() - 1; i >= 0; i--) {
                    a fsi = this.f1819b.get(i);
                    int i2 = fsi.f1820b;
                    if (i2 >= positionStart) {
                        if (i2 < end) {
                            this.f1819b.remove(i);
                        } else {
                            fsi.f1820b = i2 - itemCount;
                        }
                    }
                }
            }
        }

        public void j(int positionStart, int itemCount) {
            int[] iArr = this.f1818a;
            if (iArr != null && positionStart < iArr.length) {
                c(positionStart + itemCount);
                int[] iArr2 = this.f1818a;
                System.arraycopy(iArr2, positionStart, iArr2, positionStart + itemCount, (iArr2.length - positionStart) - itemCount);
                Arrays.fill(this.f1818a, positionStart, positionStart + itemCount, -1);
                l(positionStart, itemCount);
            }
        }

        public final void l(int positionStart, int itemCount) {
            List<a> list = this.f1819b;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    a fsi = this.f1819b.get(i);
                    int i2 = fsi.f1820b;
                    if (i2 >= positionStart) {
                        fsi.f1820b = i2 + itemCount;
                    }
                }
            }
        }

        public final int i(int position) {
            if (this.f1819b == null) {
                return -1;
            }
            a item = f(position);
            if (item != null) {
                this.f1819b.remove(item);
            }
            int nextFsiIndex = -1;
            int count = this.f1819b.size();
            int i = 0;
            while (true) {
                if (i >= count) {
                    break;
                } else if (this.f1819b.get(i).f1820b >= position) {
                    nextFsiIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (nextFsiIndex == -1) {
                return -1;
            }
            this.f1819b.remove(nextFsiIndex);
            return this.f1819b.get(nextFsiIndex).f1820b;
        }

        public void a(a fullSpanItem) {
            if (this.f1819b == null) {
                this.f1819b = new ArrayList();
            }
            int size = this.f1819b.size();
            for (int i = 0; i < size; i++) {
                a other = this.f1819b.get(i);
                if (other.f1820b == fullSpanItem.f1820b) {
                    this.f1819b.remove(i);
                }
                if (other.f1820b >= fullSpanItem.f1820b) {
                    this.f1819b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f1819b.add(fullSpanItem);
        }

        public a f(int position) {
            List<a> list = this.f1819b;
            if (list == null) {
                return null;
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                a fsi = this.f1819b.get(i);
                if (fsi.f1820b == position) {
                    return fsi;
                }
            }
            return null;
        }

        public a e(int minPos, int maxPos, int gapDir, boolean hasUnwantedGapAfter) {
            List<a> list = this.f1819b;
            if (list == null) {
                return null;
            }
            int limit = list.size();
            for (int i = 0; i < limit; i++) {
                a fsi = this.f1819b.get(i);
                int i2 = fsi.f1820b;
                if (i2 >= maxPos) {
                    return null;
                }
                if (i2 >= minPos && (gapDir == 0 || fsi.f1821c == gapDir || (hasUnwantedGapAfter && fsi.f1823e))) {
                    return fsi;
                }
            }
            return null;
        }

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0042a();

            /* renamed from: b  reason: collision with root package name */
            public int f1820b;

            /* renamed from: c  reason: collision with root package name */
            public int f1821c;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1822d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f1823e;

            public a(Parcel in) {
                this.f1820b = in.readInt();
                this.f1821c = in.readInt();
                this.f1823e = in.readInt() != 1 ? false : true;
                int spanCount = in.readInt();
                if (spanCount > 0) {
                    int[] iArr = new int[spanCount];
                    this.f1822d = iArr;
                    in.readIntArray(iArr);
                }
            }

            public a() {
            }

            public int a(int spanIndex) {
                int[] iArr = this.f1822d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[spanIndex];
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.f1820b);
                dest.writeInt(this.f1821c);
                dest.writeInt(this.f1823e ? 1 : 0);
                int[] iArr = this.f1822d;
                if (iArr == null || iArr.length <= 0) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(iArr.length);
                dest.writeIntArray(this.f1822d);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f1820b + ", mGapDir=" + this.f1821c + ", mHasUnwantedGapAfter=" + this.f1823e + ", mGapPerSpan=" + Arrays.toString(this.f1822d) + '}';
            }

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public static class C0042a implements Parcelable.Creator<a> {
                /* renamed from: a */
                public a createFromParcel(Parcel in) {
                    return new a(in);
                }

                /* renamed from: b */
                public a[] newArray(int size) {
                    return new a[size];
                }
            }
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1824b;

        /* renamed from: c  reason: collision with root package name */
        public int f1825c;

        /* renamed from: d  reason: collision with root package name */
        public int f1826d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f1827e;

        /* renamed from: f  reason: collision with root package name */
        public int f1828f;

        /* renamed from: g  reason: collision with root package name */
        public int[] f1829g;
        public List<d.a> h;
        public boolean i;
        public boolean j;
        public boolean k;

        public e() {
        }

        public e(Parcel in) {
            this.f1824b = in.readInt();
            this.f1825c = in.readInt();
            int readInt = in.readInt();
            this.f1826d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1827e = iArr;
                in.readIntArray(iArr);
            }
            int readInt2 = in.readInt();
            this.f1828f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1829g = iArr2;
                in.readIntArray(iArr2);
            }
            boolean z = false;
            this.i = in.readInt() == 1;
            this.j = in.readInt() == 1;
            this.k = in.readInt() == 1 ? true : z;
            this.h = in.readArrayList(d.a.class.getClassLoader());
        }

        public e(e other) {
            this.f1826d = other.f1826d;
            this.f1824b = other.f1824b;
            this.f1825c = other.f1825c;
            this.f1827e = other.f1827e;
            this.f1828f = other.f1828f;
            this.f1829g = other.f1829g;
            this.i = other.i;
            this.j = other.j;
            this.k = other.k;
            this.h = other.h;
        }

        public void a() {
            this.f1827e = null;
            this.f1826d = 0;
            this.f1828f = 0;
            this.f1829g = null;
            this.h = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f1824b);
            dest.writeInt(this.f1825c);
            dest.writeInt(this.f1826d);
            if (this.f1826d > 0) {
                dest.writeIntArray(this.f1827e);
            }
            dest.writeInt(this.f1828f);
            if (this.f1828f > 0) {
                dest.writeIntArray(this.f1829g);
            }
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.j ? 1 : 0);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeList(this.h);
        }

        public static class a implements Parcelable.Creator<e> {
            /* renamed from: a */
            public e createFromParcel(Parcel in) {
                return new e(in);
            }

            /* renamed from: b */
            public e[] newArray(int size) {
                return new e[size];
            }
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1809a;

        /* renamed from: b  reason: collision with root package name */
        public int f1810b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1811c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1812d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1813e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f1814f;

        public b() {
            c();
        }

        public void c() {
            this.f1809a = -1;
            this.f1810b = Integer.MIN_VALUE;
            this.f1811c = false;
            this.f1812d = false;
            this.f1813e = false;
            int[] iArr = this.f1814f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] spans) {
            int spanCount = spans.length;
            int[] iArr = this.f1814f;
            if (iArr == null || iArr.length < spanCount) {
                this.f1814f = new int[StaggeredGridLayoutManager.this.s.length];
            }
            for (int i = 0; i < spanCount; i++) {
                this.f1814f[i] = spans[i].p(Integer.MIN_VALUE);
            }
        }

        public void a() {
            int i;
            if (this.f1811c) {
                i = StaggeredGridLayoutManager.this.t.i();
            } else {
                i = StaggeredGridLayoutManager.this.t.m();
            }
            this.f1810b = i;
        }

        public void b(int addedDistance) {
            if (this.f1811c) {
                this.f1810b = StaggeredGridLayoutManager.this.t.i() - addedDistance;
            } else {
                this.f1810b = StaggeredGridLayoutManager.this.t.m() + addedDistance;
            }
        }
    }
}
