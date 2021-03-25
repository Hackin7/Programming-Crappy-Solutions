package androidx.recyclerview.widget;

import a.o.c.e;
import a.o.c.h;
import a.o.c.j;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o {
    public int A = Integer.MIN_VALUE;
    public d B = null;
    public final a C = new a();
    public final b D = new b();
    public int E = 2;
    public int r = 1;
    public c s;
    public h t;
    public boolean u;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = true;
    public int z = -1;

    public LinearLayoutManager(int orientation, boolean reverseLayout) {
        u2(orientation);
        v2(reverseLayout);
    }

    public LinearLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        RecyclerView.o.d properties = RecyclerView.o.g0(context, attrs, defStyleAttr, defStyleRes);
        u2(properties.f1779a);
        v2(properties.f1781c);
        w2(properties.f1782d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p C() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G0(RecyclerView view, RecyclerView.u recycler) {
        super.G0(view, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(AccessibilityEvent event) {
        super.I0(event);
        if (I() > 0) {
            event.setFromIndex(S1());
            event.setToIndex(V1());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable b1() {
        if (this.B != null) {
            return new d(this.B);
        }
        d state = new d();
        if (I() > 0) {
            M1();
            boolean didLayoutFromEnd = this.u ^ this.w;
            state.f1735d = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = f2();
                state.f1734c = this.t.i() - this.t.d(refChild);
                state.f1733b = f0(refChild);
            } else {
                View refChild2 = g2();
                state.f1733b = f0(refChild2);
                state.f1734c = this.t.g(refChild2) - this.t.m();
            }
        } else {
            state.b();
        }
        return state;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(Parcelable state) {
        if (state instanceof d) {
            this.B = (d) state;
            q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j() {
        return this.r == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.r == 1;
    }

    public void w2(boolean stackFromEnd) {
        f(null);
        if (this.x != stackFromEnd) {
            this.x = stackFromEnd;
            q1();
        }
    }

    public int i2() {
        return this.r;
    }

    public void u2(int orientation) {
        if (orientation == 0 || orientation == 1) {
            f(null);
            if (orientation != this.r || this.t == null) {
                h b2 = h.b(this, orientation);
                this.t = b2;
                this.C.f1717a = b2;
                this.r = orientation;
                q1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + orientation);
    }

    public final void s2() {
        if (this.r == 1 || !j2()) {
            this.w = this.v;
        } else {
            this.w = !this.v;
        }
    }

    public void v2(boolean reverseLayout) {
        f(null);
        if (reverseLayout != this.v) {
            this.v = reverseLayout;
            q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View B(int position) {
        int childCount = I();
        if (childCount == 0) {
            return null;
        }
        int viewPosition = position - f0(H(0));
        if (viewPosition >= 0 && viewPosition < childCount) {
            View child = H(viewPosition);
            if (f0(child) == position) {
                return child;
            }
        }
        return super.B(position);
    }

    public int h2(RecyclerView.y state) {
        if (state.c()) {
            return this.t.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView.u recycler, RecyclerView.y state) {
        int extraForStart;
        int extraForEnd;
        int endOffset;
        int startOffset;
        int i;
        View existing;
        int upcomingOffset;
        int firstLayoutDirection = -1;
        if (!(this.B == null && this.z == -1) && state.b() == 0) {
            h1(recycler);
            return;
        }
        d dVar = this.B;
        if (dVar != null && dVar.a()) {
            this.z = this.B.f1733b;
        }
        M1();
        this.s.f1726a = false;
        s2();
        View focused = U();
        if (!this.C.f1721e || this.z != -1 || this.B != null) {
            this.C.e();
            a aVar = this.C;
            aVar.f1720d = this.w ^ this.x;
            z2(recycler, state, aVar);
            this.C.f1721e = true;
        } else if (focused != null && (this.t.g(focused) >= this.t.i() || this.t.d(focused) <= this.t.m())) {
            this.C.c(focused, f0(focused));
        }
        int extra = h2(state);
        if (this.s.j >= 0) {
            extraForEnd = extra;
            extraForStart = 0;
        } else {
            extraForStart = extra;
            extraForEnd = 0;
        }
        int extraForStart2 = extraForStart + this.t.m();
        int extraForEnd2 = extraForEnd + this.t.j();
        if (!(!state.d() || (i = this.z) == -1 || this.A == Integer.MIN_VALUE || (existing = B(i)) == null)) {
            if (this.w) {
                upcomingOffset = (this.t.i() - this.t.d(existing)) - this.A;
            } else {
                upcomingOffset = this.A - (this.t.g(existing) - this.t.m());
            }
            if (upcomingOffset > 0) {
                extraForStart2 += upcomingOffset;
            } else {
                extraForEnd2 -= upcomingOffset;
            }
        }
        if (this.C.f1720d) {
            if (this.w) {
                firstLayoutDirection = 1;
            }
        } else if (!this.w) {
            firstLayoutDirection = 1;
        }
        m2(recycler, state, this.C, firstLayoutDirection);
        v(recycler);
        this.s.l = r2();
        this.s.i = state.d();
        a aVar2 = this.C;
        if (aVar2.f1720d) {
            E2(aVar2);
            c cVar = this.s;
            cVar.h = extraForStart2;
            N1(recycler, cVar, state, false);
            c cVar2 = this.s;
            startOffset = cVar2.f1727b;
            int firstElement = cVar2.f1729d;
            int i2 = cVar2.f1728c;
            if (i2 > 0) {
                extraForEnd2 += i2;
            }
            C2(this.C);
            c cVar3 = this.s;
            cVar3.h = extraForEnd2;
            cVar3.f1729d += cVar3.f1730e;
            N1(recycler, cVar3, state, false);
            c cVar4 = this.s;
            endOffset = cVar4.f1727b;
            if (cVar4.f1728c > 0) {
                int extraForStart3 = cVar4.f1728c;
                D2(firstElement, startOffset);
                c cVar5 = this.s;
                cVar5.h = extraForStart3;
                N1(recycler, cVar5, state, false);
                startOffset = this.s.f1727b;
            }
        } else {
            C2(aVar2);
            c cVar6 = this.s;
            cVar6.h = extraForEnd2;
            N1(recycler, cVar6, state, false);
            c cVar7 = this.s;
            endOffset = cVar7.f1727b;
            int lastElement = cVar7.f1729d;
            int i3 = cVar7.f1728c;
            if (i3 > 0) {
                extraForStart2 += i3;
            }
            E2(this.C);
            c cVar8 = this.s;
            cVar8.h = extraForStart2;
            cVar8.f1729d += cVar8.f1730e;
            N1(recycler, cVar8, state, false);
            c cVar9 = this.s;
            int startOffset2 = cVar9.f1727b;
            if (cVar9.f1728c > 0) {
                int extraForEnd3 = cVar9.f1728c;
                B2(lastElement, endOffset);
                c cVar10 = this.s;
                cVar10.h = extraForEnd3;
                N1(recycler, cVar10, state, false);
                endOffset = this.s.f1727b;
                startOffset = startOffset2;
            } else {
                startOffset = startOffset2;
            }
        }
        if (I() > 0) {
            if (this.w ^ this.x) {
                int fixOffset = d2(endOffset, recycler, state, true);
                int startOffset3 = startOffset + fixOffset;
                int fixOffset2 = e2(startOffset3, recycler, state, false);
                startOffset = startOffset3 + fixOffset2;
                endOffset = endOffset + fixOffset + fixOffset2;
            } else {
                int fixOffset3 = e2(startOffset, recycler, state, true);
                int endOffset2 = endOffset + fixOffset3;
                int fixOffset4 = d2(endOffset2, recycler, state, false);
                startOffset = startOffset + fixOffset3 + fixOffset4;
                endOffset = endOffset2 + fixOffset4;
            }
        }
        l2(recycler, state, startOffset, endOffset);
        if (!state.d()) {
            this.t.s();
        } else {
            this.C.e();
        }
        this.u = this.x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView.y state) {
        super.W0(state);
        this.B = null;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.e();
    }

    public void m2(RecyclerView.u recycler, RecyclerView.y state, a anchorInfo, int firstLayoutItemDirection) {
    }

    public final void l2(RecyclerView.u recycler, RecyclerView.y state, int startOffset, int endOffset) {
        if (!(!state.f() || I() == 0 || state.d())) {
            if (F1()) {
                int scrapExtraStart = 0;
                int scrapExtraEnd = 0;
                List<RecyclerView.ViewHolder> scrapList = recycler.k();
                int scrapSize = scrapList.size();
                int firstChildPos = f0(H(0));
                for (int i = 0; i < scrapSize; i++) {
                    RecyclerView.b0 scrap = (RecyclerView.b0) scrapList.get(i);
                    if (!scrap.u()) {
                        int direction = 1;
                        if ((scrap.m() < firstChildPos) != this.w) {
                            direction = -1;
                        }
                        if (direction == -1) {
                            scrapExtraStart += this.t.e(scrap.f1750b);
                        } else {
                            scrapExtraEnd += this.t.e(scrap.f1750b);
                        }
                    }
                }
                this.s.k = scrapList;
                if (scrapExtraStart > 0) {
                    D2(f0(g2()), startOffset);
                    c cVar = this.s;
                    cVar.h = scrapExtraStart;
                    cVar.f1728c = 0;
                    cVar.a();
                    N1(recycler, this.s, state, false);
                }
                if (scrapExtraEnd > 0) {
                    B2(f0(f2()), endOffset);
                    c cVar2 = this.s;
                    cVar2.h = scrapExtraEnd;
                    cVar2.f1728c = 0;
                    cVar2.a();
                    N1(recycler, this.s, state, false);
                }
                this.s.k = null;
            }
        }
    }

    public final void z2(RecyclerView.u recycler, RecyclerView.y state, a anchorInfo) {
        if (!y2(state, anchorInfo) && !x2(recycler, state, anchorInfo)) {
            anchorInfo.a();
            anchorInfo.f1718b = this.x ? state.b() - 1 : 0;
        }
    }

    public final boolean x2(RecyclerView.u recycler, RecyclerView.y state, a anchorInfo) {
        View referenceChild;
        int i;
        boolean notVisible = false;
        if (I() == 0) {
            return false;
        }
        View focused = U();
        if (focused != null && anchorInfo.d(focused, state)) {
            anchorInfo.c(focused, f0(focused));
            return true;
        } else if (this.u != this.x) {
            return false;
        } else {
            if (anchorInfo.f1720d) {
                referenceChild = b2(recycler, state);
            } else {
                referenceChild = c2(recycler, state);
            }
            if (referenceChild == null) {
                return false;
            }
            anchorInfo.b(referenceChild, f0(referenceChild));
            if (!state.d() && F1()) {
                if (this.t.g(referenceChild) >= this.t.i() || this.t.d(referenceChild) < this.t.m()) {
                    notVisible = true;
                }
                if (notVisible) {
                    if (anchorInfo.f1720d) {
                        i = this.t.i();
                    } else {
                        i = this.t.m();
                    }
                    anchorInfo.f1719c = i;
                }
            }
            return true;
        }
    }

    public final boolean y2(RecyclerView.y state, a anchorInfo) {
        int i;
        int i2;
        boolean z2 = false;
        if (state.d() || (i = this.z) == -1) {
            return false;
        }
        if (i < 0 || i >= state.b()) {
            this.z = -1;
            this.A = Integer.MIN_VALUE;
            return false;
        }
        anchorInfo.f1718b = this.z;
        d dVar = this.B;
        if (dVar != null && dVar.a()) {
            boolean z3 = this.B.f1735d;
            anchorInfo.f1720d = z3;
            if (z3) {
                anchorInfo.f1719c = this.t.i() - this.B.f1734c;
            } else {
                anchorInfo.f1719c = this.t.m() + this.B.f1734c;
            }
            return true;
        } else if (this.A == Integer.MIN_VALUE) {
            View child = B(this.z);
            if (child == null) {
                if (I() > 0) {
                    if ((this.z < f0(H(0))) == this.w) {
                        z2 = true;
                    }
                    anchorInfo.f1720d = z2;
                }
                anchorInfo.a();
            } else if (this.t.e(child) > this.t.n()) {
                anchorInfo.a();
                return true;
            } else if (this.t.g(child) - this.t.m() < 0) {
                anchorInfo.f1719c = this.t.m();
                anchorInfo.f1720d = false;
                return true;
            } else if (this.t.i() - this.t.d(child) < 0) {
                anchorInfo.f1719c = this.t.i();
                anchorInfo.f1720d = true;
                return true;
            } else {
                if (anchorInfo.f1720d) {
                    i2 = this.t.d(child) + this.t.o();
                } else {
                    i2 = this.t.g(child);
                }
                anchorInfo.f1719c = i2;
            }
            return true;
        } else {
            boolean z4 = this.w;
            anchorInfo.f1720d = z4;
            if (z4) {
                anchorInfo.f1719c = this.t.i() - this.A;
            } else {
                anchorInfo.f1719c = this.t.m() + this.A;
            }
            return true;
        }
    }

    public final int d2(int endOffset, RecyclerView.u recycler, RecyclerView.y state, boolean canOffsetChildren) {
        int gap;
        int gap2 = this.t.i() - endOffset;
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -t2(-gap2, recycler, state);
        int endOffset2 = endOffset + fixOffset;
        if (!canOffsetChildren || (gap = this.t.i() - endOffset2) <= 0) {
            return fixOffset;
        }
        this.t.r(gap);
        return gap + fixOffset;
    }

    public final int e2(int startOffset, RecyclerView.u recycler, RecyclerView.y state, boolean canOffsetChildren) {
        int gap;
        int gap2 = startOffset - this.t.m();
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -t2(gap2, recycler, state);
        int startOffset2 = startOffset + fixOffset;
        if (!canOffsetChildren || (gap = startOffset2 - this.t.m()) <= 0) {
            return fixOffset;
        }
        this.t.r(-gap);
        return fixOffset - gap;
    }

    public final void C2(a anchorInfo) {
        B2(anchorInfo.f1718b, anchorInfo.f1719c);
    }

    public final void B2(int itemPosition, int offset) {
        this.s.f1728c = this.t.i() - offset;
        this.s.f1730e = this.w ? -1 : 1;
        c cVar = this.s;
        cVar.f1729d = itemPosition;
        cVar.f1731f = 1;
        cVar.f1727b = offset;
        cVar.f1732g = Integer.MIN_VALUE;
    }

    public final void E2(a anchorInfo) {
        D2(anchorInfo.f1718b, anchorInfo.f1719c);
    }

    public final void D2(int itemPosition, int offset) {
        this.s.f1728c = offset - this.t.m();
        c cVar = this.s;
        cVar.f1729d = itemPosition;
        cVar.f1730e = this.w ? 1 : -1;
        c cVar2 = this.s;
        cVar2.f1731f = -1;
        cVar2.f1727b = offset;
        cVar2.f1732g = Integer.MIN_VALUE;
    }

    public boolean j2() {
        return X() == 1;
    }

    public void M1() {
        if (this.s == null) {
            this.s = L1();
        }
    }

    public c L1() {
        return new c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t1(int dx, RecyclerView.u recycler, RecyclerView.y state) {
        if (this.r == 1) {
            return 0;
        }
        return t2(dx, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u1(int dy, RecyclerView.u recycler, RecyclerView.y state) {
        if (this.r == 0) {
            return 0;
        }
        return t2(dy, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.y state) {
        return I1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.y state) {
        return I1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int p(RecyclerView.y state) {
        return H1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.y state) {
        return H1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.y state) {
        return J1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.y state) {
        return J1(state);
    }

    public final int I1(RecyclerView.y state) {
        if (I() == 0) {
            return 0;
        }
        M1();
        return j.b(state, this.t, R1(!this.y, true), Q1(!this.y, true), this, this.y, this.w);
    }

    public final int H1(RecyclerView.y state) {
        if (I() == 0) {
            return 0;
        }
        M1();
        return j.a(state, this.t, R1(!this.y, true), Q1(!this.y, true), this, this.y);
    }

    public final int J1(RecyclerView.y state) {
        if (I() == 0) {
            return 0;
        }
        M1();
        return j.c(state, this.t, R1(!this.y, true), Q1(!this.y, true), this, this.y);
    }

    public final void A2(int layoutDirection, int requiredSpace, boolean canUseExistingSpace, RecyclerView.y state) {
        int scrollingOffset;
        this.s.l = r2();
        this.s.h = h2(state);
        c cVar = this.s;
        cVar.f1731f = layoutDirection;
        int i = -1;
        if (layoutDirection == 1) {
            cVar.h += this.t.j();
            View child = f2();
            c cVar2 = this.s;
            if (!this.w) {
                i = 1;
            }
            cVar2.f1730e = i;
            c cVar3 = this.s;
            int f0 = f0(child);
            c cVar4 = this.s;
            cVar3.f1729d = f0 + cVar4.f1730e;
            cVar4.f1727b = this.t.d(child);
            scrollingOffset = this.t.d(child) - this.t.i();
        } else {
            View child2 = g2();
            this.s.h += this.t.m();
            c cVar5 = this.s;
            if (this.w) {
                i = 1;
            }
            cVar5.f1730e = i;
            c cVar6 = this.s;
            int f02 = f0(child2);
            c cVar7 = this.s;
            cVar6.f1729d = f02 + cVar7.f1730e;
            cVar7.f1727b = this.t.g(child2);
            scrollingOffset = (-this.t.g(child2)) + this.t.m();
        }
        c cVar8 = this.s;
        cVar8.f1728c = requiredSpace;
        if (canUseExistingSpace) {
            cVar8.f1728c = requiredSpace - scrollingOffset;
        }
        this.s.f1732g = scrollingOffset;
    }

    public boolean r2() {
        return this.t.k() == 0 && this.t.h() == 0;
    }

    public void G1(RecyclerView.y state, c layoutState, RecyclerView.o.c layoutPrefetchRegistry) {
        int pos = layoutState.f1729d;
        if (pos >= 0 && pos < state.b()) {
            ((e.b) layoutPrefetchRegistry).a(pos, Math.max(0, layoutState.f1732g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int adapterItemCount, RecyclerView.o.c layoutPrefetchRegistry) {
        boolean fromEnd;
        int anchorPos;
        d dVar = this.B;
        int direction = -1;
        if (dVar == null || !dVar.a()) {
            s2();
            fromEnd = this.w;
            if (this.z == -1) {
                anchorPos = fromEnd ? adapterItemCount - 1 : 0;
            } else {
                anchorPos = this.z;
            }
        } else {
            d dVar2 = this.B;
            fromEnd = dVar2.f1735d;
            anchorPos = dVar2.f1733b;
        }
        if (!fromEnd) {
            direction = 1;
        }
        int targetPos = anchorPos;
        for (int i = 0; i < this.E && targetPos >= 0 && targetPos < adapterItemCount; i++) {
            ((e.b) layoutPrefetchRegistry).a(targetPos, 0);
            targetPos += direction;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n(int dx, int dy, RecyclerView.y state, RecyclerView.o.c layoutPrefetchRegistry) {
        int delta = this.r == 0 ? dx : dy;
        if (I() != 0 && delta != 0) {
            M1();
            A2(delta > 0 ? 1 : -1, Math.abs(delta), true, state);
            G1(state, this.s, layoutPrefetchRegistry);
        }
    }

    public int t2(int dy, RecyclerView.u recycler, RecyclerView.y state) {
        if (I() == 0 || dy == 0) {
            return 0;
        }
        this.s.f1726a = true;
        M1();
        int layoutDirection = dy > 0 ? 1 : -1;
        int absDy = Math.abs(dy);
        A2(layoutDirection, absDy, true, state);
        c cVar = this.s;
        int consumed = cVar.f1732g + N1(recycler, cVar, state, false);
        if (consumed < 0) {
            return 0;
        }
        int scrolled = absDy > consumed ? layoutDirection * consumed : dy;
        this.t.r(-scrolled);
        this.s.j = scrolled;
        return scrolled;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f(String message) {
        if (this.B == null) {
            super.f(message);
        }
    }

    public final void o2(RecyclerView.u recycler, int startIndex, int endIndex) {
        if (startIndex != endIndex) {
            if (endIndex > startIndex) {
                for (int i = endIndex - 1; i >= startIndex; i--) {
                    k1(i, recycler);
                }
                return;
            }
            for (int i2 = startIndex; i2 > endIndex; i2--) {
                k1(i2, recycler);
            }
        }
    }

    public final void q2(RecyclerView.u recycler, int dt) {
        if (dt >= 0) {
            int childCount = I();
            if (this.w) {
                for (int i = childCount - 1; i >= 0; i--) {
                    View child = H(i);
                    if (this.t.d(child) > dt || this.t.p(child) > dt) {
                        o2(recycler, childCount - 1, i);
                        return;
                    }
                }
                return;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View child2 = H(i2);
                if (this.t.d(child2) > dt || this.t.p(child2) > dt) {
                    o2(recycler, 0, i2);
                    return;
                }
            }
        }
    }

    public final void p2(RecyclerView.u recycler, int dt) {
        int childCount = I();
        if (dt >= 0) {
            int limit = this.t.h() - dt;
            if (this.w) {
                for (int i = 0; i < childCount; i++) {
                    View child = H(i);
                    if (this.t.g(child) < limit || this.t.q(child) < limit) {
                        o2(recycler, 0, i);
                        return;
                    }
                }
                return;
            }
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View child2 = H(i2);
                if (this.t.g(child2) < limit || this.t.q(child2) < limit) {
                    o2(recycler, childCount - 1, i2);
                    return;
                }
            }
        }
    }

    public final void n2(RecyclerView.u recycler, c layoutState) {
        if (layoutState.f1726a && !layoutState.l) {
            if (layoutState.f1731f == -1) {
                p2(recycler, layoutState.f1732g);
            } else {
                q2(recycler, layoutState.f1732g);
            }
        }
    }

    public int N1(RecyclerView.u recycler, c layoutState, RecyclerView.y state, boolean stopOnFocusable) {
        int start = layoutState.f1728c;
        int i = layoutState.f1732g;
        if (i != Integer.MIN_VALUE) {
            int i2 = layoutState.f1728c;
            if (i2 < 0) {
                layoutState.f1732g = i + i2;
            }
            n2(recycler, layoutState);
        }
        int remainingSpace = layoutState.f1728c + layoutState.h;
        b layoutChunkResult = this.D;
        while (true) {
            if ((!layoutState.l && remainingSpace <= 0) || !layoutState.c(state)) {
                break;
            }
            layoutChunkResult.a();
            k2(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f1723b) {
                layoutState.f1727b += layoutChunkResult.f1722a * layoutState.f1731f;
                if (!layoutChunkResult.f1724c || this.s.k != null || !state.d()) {
                    int i3 = layoutState.f1728c;
                    int i4 = layoutChunkResult.f1722a;
                    layoutState.f1728c = i3 - i4;
                    remainingSpace -= i4;
                }
                int i5 = layoutState.f1732g;
                if (i5 != Integer.MIN_VALUE) {
                    int i6 = i5 + layoutChunkResult.f1722a;
                    layoutState.f1732g = i6;
                    int i7 = layoutState.f1728c;
                    if (i7 < 0) {
                        layoutState.f1732g = i6 + i7;
                    }
                    n2(recycler, layoutState);
                }
                if (stopOnFocusable && layoutChunkResult.f1725d) {
                    break;
                }
            } else {
                break;
            }
        }
        return start - layoutState.f1728c;
    }

    public void k2(RecyclerView.u recycler, RecyclerView.y state, c layoutState, b result) {
        int top;
        int left;
        int bottom;
        int right;
        int left2;
        int right2;
        View view = layoutState.d(recycler);
        if (view == null) {
            result.f1723b = true;
            return;
        }
        RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
        if (layoutState.k == null) {
            if (this.w == (layoutState.f1731f == -1)) {
                c(view);
            } else {
                d(view, 0);
            }
        } else {
            if (this.w == (layoutState.f1731f == -1)) {
                a(view);
            } else {
                b(view, 0);
            }
        }
        y0(view, 0, 0);
        result.f1722a = this.t.e(view);
        if (this.r == 1) {
            if (j2()) {
                right2 = m0() - d0();
                left2 = right2 - this.t.f(view);
            } else {
                left2 = c0();
                right2 = this.t.f(view) + left2;
            }
            if (layoutState.f1731f == -1) {
                right = right2;
                bottom = layoutState.f1727b;
                left = left2;
                top = layoutState.f1727b - result.f1722a;
            } else {
                int top2 = layoutState.f1727b;
                right = right2;
                bottom = layoutState.f1727b + result.f1722a;
                left = left2;
                top = top2;
            }
        } else {
            int top3 = e0();
            int bottom2 = this.t.f(view) + top3;
            if (layoutState.f1731f == -1) {
                bottom = bottom2;
                right = layoutState.f1727b;
                left = layoutState.f1727b - result.f1722a;
                top = top3;
            } else {
                int left3 = layoutState.f1727b;
                bottom = bottom2;
                right = layoutState.f1727b + result.f1722a;
                left = left3;
                top = top3;
            }
        }
        x0(view, left, top, right, bottom);
        if (params.c() || params.b()) {
            result.f1724c = true;
        }
        result.f1725d = view.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean C1() {
        return (W() == 1073741824 || n0() == 1073741824 || !o0()) ? false : true;
    }

    public int K1(int focusDirection) {
        if (focusDirection != 1) {
            if (focusDirection != 2) {
                if (focusDirection != 17) {
                    if (focusDirection != 33) {
                        if (focusDirection != 66) {
                            if (focusDirection == 130 && this.r == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.r == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.r == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.r == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.r != 1 && j2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.r != 1 && j2()) {
            return 1;
        } else {
            return -1;
        }
    }

    public final View g2() {
        return H(this.w ? I() - 1 : 0);
    }

    public final View f2() {
        return H(this.w ? 0 : I() - 1);
    }

    public final View R1(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.w) {
            return X1(I() - 1, -1, completelyVisible, acceptPartiallyVisible);
        }
        return X1(0, I(), completelyVisible, acceptPartiallyVisible);
    }

    public final View Q1(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.w) {
            return X1(0, I(), completelyVisible, acceptPartiallyVisible);
        }
        return X1(I() - 1, -1, completelyVisible, acceptPartiallyVisible);
    }

    public final View b2(RecyclerView.u recycler, RecyclerView.y state) {
        if (this.w) {
            return P1(recycler, state);
        }
        return U1(recycler, state);
    }

    public final View c2(RecyclerView.u recycler, RecyclerView.y state) {
        if (this.w) {
            return U1(recycler, state);
        }
        return P1(recycler, state);
    }

    public final View P1(RecyclerView.u recycler, RecyclerView.y state) {
        return a2(recycler, state, 0, I(), state.b());
    }

    public final View U1(RecyclerView.u recycler, RecyclerView.y state) {
        return a2(recycler, state, I() - 1, -1, state.b());
    }

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
            if (position >= 0 && position < itemCount) {
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

    public final View Y1(RecyclerView.u recycler, RecyclerView.y state) {
        if (this.w) {
            return O1();
        }
        return T1();
    }

    public final View Z1(RecyclerView.u recycler, RecyclerView.y state) {
        if (this.w) {
            return T1();
        }
        return O1();
    }

    public final View O1() {
        return W1(0, I());
    }

    public final View T1() {
        return W1(I() - 1, -1);
    }

    public int S1() {
        View child = X1(0, I(), false, true);
        if (child == null) {
            return -1;
        }
        return f0(child);
    }

    public int V1() {
        View child = X1(I() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return f0(child);
    }

    public View X1(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptPartiallyVisible) {
        int preferredBoundsFlag;
        M1();
        int acceptableBoundsFlag = 0;
        if (completelyVisible) {
            preferredBoundsFlag = 24579;
        } else {
            preferredBoundsFlag = 320;
        }
        if (acceptPartiallyVisible) {
            acceptableBoundsFlag = 320;
        }
        if (this.r == 0) {
            return this.f1774e.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f1775f.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    public View W1(int fromIndex, int toIndex) {
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        M1();
        if ((toIndex > fromIndex ? 1 : toIndex < fromIndex ? -1 : 0) == 0) {
            return H(fromIndex);
        }
        if (this.t.g(H(fromIndex)) < this.t.m()) {
            preferredBoundsFlag = 16644;
            acceptableBoundsFlag = 16388;
        } else {
            preferredBoundsFlag = 4161;
            acceptableBoundsFlag = 4097;
        }
        if (this.r == 0) {
            return this.f1774e.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f1775f.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H0(View focused, int focusDirection, RecyclerView.u recycler, RecyclerView.y state) {
        int layoutDir;
        View nextCandidate;
        View nextFocus;
        s2();
        if (I() == 0 || (layoutDir = K1(focusDirection)) == Integer.MIN_VALUE) {
            return null;
        }
        M1();
        M1();
        A2(layoutDir, (int) (((float) this.t.n()) * 0.33333334f), false, state);
        c cVar = this.s;
        cVar.f1732g = Integer.MIN_VALUE;
        cVar.f1726a = false;
        N1(recycler, cVar, state, true);
        if (layoutDir == -1) {
            nextCandidate = Z1(recycler, state);
        } else {
            nextCandidate = Y1(recycler, state);
        }
        if (layoutDir == -1) {
            nextFocus = g2();
        } else {
            nextFocus = f2();
        }
        if (!nextFocus.hasFocusable()) {
            return nextCandidate;
        }
        if (nextCandidate == null) {
            return null;
        }
        return nextFocus;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F1() {
        return this.B == null && this.u == this.x;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1726a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1727b;

        /* renamed from: c  reason: collision with root package name */
        public int f1728c;

        /* renamed from: d  reason: collision with root package name */
        public int f1729d;

        /* renamed from: e  reason: collision with root package name */
        public int f1730e;

        /* renamed from: f  reason: collision with root package name */
        public int f1731f;

        /* renamed from: g  reason: collision with root package name */
        public int f1732g;
        public int h = 0;
        public boolean i;
        public int j;
        public List<RecyclerView.b0> k = null;
        public boolean l;

        public boolean c(RecyclerView.y state) {
            int i2 = this.f1729d;
            return i2 >= 0 && i2 < state.b();
        }

        public View d(RecyclerView.u recycler) {
            if (this.k != null) {
                return e();
            }
            View view = recycler.o(this.f1729d);
            this.f1729d += this.f1730e;
            return view;
        }

        public final View e() {
            int size = this.k.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.k.get(i2).f1750b;
                RecyclerView.p lp = (RecyclerView.p) view.getLayoutParams();
                if (!lp.c() && this.f1729d == lp.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View ignore) {
            View closest = f(ignore);
            if (closest == null) {
                this.f1729d = -1;
            } else {
                this.f1729d = ((RecyclerView.p) closest.getLayoutParams()).a();
            }
        }

        public View f(View ignore) {
            int distance;
            int size = this.k.size();
            View closest = null;
            int closestDistance = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.k.get(i2).f1750b;
                RecyclerView.p lp = (RecyclerView.p) view.getLayoutParams();
                if (view != ignore && !lp.c() && (distance = (lp.a() - this.f1729d) * this.f1730e) >= 0 && distance < closestDistance) {
                    closest = view;
                    closestDistance = distance;
                    if (distance == 0) {
                        break;
                    }
                }
            }
            return closest;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1733b;

        /* renamed from: c  reason: collision with root package name */
        public int f1734c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1735d;

        public d() {
        }

        public d(Parcel in) {
            this.f1733b = in.readInt();
            this.f1734c = in.readInt();
            this.f1735d = in.readInt() != 1 ? false : true;
        }

        public d(d other) {
            this.f1733b = other.f1733b;
            this.f1734c = other.f1734c;
            this.f1735d = other.f1735d;
        }

        public boolean a() {
            return this.f1733b >= 0;
        }

        public void b() {
            this.f1733b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f1733b);
            dest.writeInt(this.f1734c);
            dest.writeInt(this.f1735d ? 1 : 0);
        }

        public static class a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public d createFromParcel(Parcel in) {
                return new d(in);
            }

            /* renamed from: b */
            public d[] newArray(int size) {
                return new d[size];
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public h f1717a;

        /* renamed from: b  reason: collision with root package name */
        public int f1718b;

        /* renamed from: c  reason: collision with root package name */
        public int f1719c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1720d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1721e;

        public a() {
            e();
        }

        public void e() {
            this.f1718b = -1;
            this.f1719c = Integer.MIN_VALUE;
            this.f1720d = false;
            this.f1721e = false;
        }

        public void a() {
            int i;
            if (this.f1720d) {
                i = this.f1717a.i();
            } else {
                i = this.f1717a.m();
            }
            this.f1719c = i;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1718b + ", mCoordinate=" + this.f1719c + ", mLayoutFromEnd=" + this.f1720d + ", mValid=" + this.f1721e + '}';
        }

        public boolean d(View child, RecyclerView.y state) {
            RecyclerView.p lp = (RecyclerView.p) child.getLayoutParams();
            return !lp.c() && lp.a() >= 0 && lp.a() < state.b();
        }

        public void c(View child, int position) {
            int endMargin;
            int spaceChange = this.f1717a.o();
            if (spaceChange >= 0) {
                b(child, position);
                return;
            }
            this.f1718b = position;
            if (this.f1720d) {
                int previousEndMargin = (this.f1717a.i() - spaceChange) - this.f1717a.d(child);
                this.f1719c = this.f1717a.i() - previousEndMargin;
                if (previousEndMargin > 0) {
                    int childSize = this.f1717a.e(child);
                    int layoutStart = this.f1717a.m();
                    int startMargin = (this.f1719c - childSize) - (Math.min(this.f1717a.g(child) - layoutStart, 0) + layoutStart);
                    if (startMargin < 0) {
                        this.f1719c += Math.min(previousEndMargin, -startMargin);
                        return;
                    }
                    return;
                }
                return;
            }
            int childStart = this.f1717a.g(child);
            int startMargin2 = childStart - this.f1717a.m();
            this.f1719c = childStart;
            if (startMargin2 > 0 && (endMargin = (this.f1717a.i() - Math.min(0, (this.f1717a.i() - spaceChange) - this.f1717a.d(child))) - (this.f1717a.e(child) + childStart)) < 0) {
                this.f1719c -= Math.min(startMargin2, -endMargin);
            }
        }

        public void b(View child, int position) {
            if (this.f1720d) {
                this.f1719c = this.f1717a.d(child) + this.f1717a.o();
            } else {
                this.f1719c = this.f1717a.g(child);
            }
            this.f1718b = position;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1722a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1723b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1724c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1725d;

        public void a() {
            this.f1722a = 0;
            this.f1723b = false;
            this.f1724c = false;
            this.f1725d = false;
        }
    }
}
