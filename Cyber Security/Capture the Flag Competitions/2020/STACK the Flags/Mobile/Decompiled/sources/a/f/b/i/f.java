package a.f.b.i;

import a.f.b.d;
import a.f.b.h;
import a.f.b.i.e;
import a.f.b.i.m.b;
import a.f.b.i.m.e;
import a.f.b.i.m.i;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class f extends l {
    public c[] A0 = new c[4];
    public c[] B0 = new c[4];
    public int C0 = 257;
    public boolean D0 = false;
    public boolean E0 = false;
    public WeakReference<d> F0 = null;
    public WeakReference<d> G0 = null;
    public WeakReference<d> H0 = null;
    public WeakReference<d> I0 = null;
    public b.a J0 = new b.a();
    public b r0 = new b(this);
    public e s0 = new e(this);
    public b.AbstractC0011b t0 = null;
    public boolean u0 = false;
    public d v0 = new d();
    public int w0;
    public int x0;
    public int y0 = 0;
    public int z0 = 0;

    public void t1() {
        this.s0.j();
    }

    public void u1() {
        this.s0.k();
    }

    public boolean n1(boolean optimizeWrap) {
        return this.s0.f(optimizeWrap);
    }

    public boolean o1(boolean optimizeWrap) {
        return this.s0.g();
    }

    public boolean p1(boolean optimizeWrap, int orientation) {
        return this.s0.h(optimizeWrap, orientation);
    }

    public long y1(int optimizationLevel, int widthMode, int widthSize, int heightMode, int heightSize, int lastMeasureWidth, int lastMeasureHeight, int paddingX, int paddingY) {
        this.w0 = paddingX;
        this.x0 = paddingY;
        this.r0.d(this, optimizationLevel, widthMode, widthSize, heightMode, heightSize);
        return 0;
    }

    public void G1() {
        this.r0.e(this);
    }

    public void C1(b.AbstractC0011b measurer) {
        this.t0 = measurer;
        this.s0.n(measurer);
    }

    public b.AbstractC0011b q1() {
        return this.t0;
    }

    public void D1(int value) {
        this.C0 = value;
        d.r = A1(512);
    }

    public int r1() {
        return this.C0;
    }

    public boolean A1(int feature) {
        return (this.C0 & feature) == feature;
    }

    @Override // a.f.b.i.e, a.f.b.i.l
    public void f0() {
        this.v0.D();
        this.w0 = 0;
        this.x0 = 0;
        super.f0();
    }

    public boolean x1() {
        return this.D0;
    }

    public boolean v1() {
        return this.E0;
    }

    public void m1(d top) {
        WeakReference<d> weakReference = this.F0;
        if (weakReference == null || weakReference.get() == null || top.d() > this.F0.get().d()) {
            this.F0 = new WeakReference<>(top);
        }
    }

    public void h1(d left) {
        WeakReference<d> weakReference = this.G0;
        if (weakReference == null || weakReference.get() == null || left.d() > this.G0.get().d()) {
            this.G0 = new WeakReference<>(left);
        }
    }

    public void l1(d bottom) {
        WeakReference<d> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || bottom.d() > this.H0.get().d()) {
            this.H0 = new WeakReference<>(bottom);
        }
    }

    public void g1(d right) {
        WeakReference<d> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || right.d() > this.I0.get().d()) {
            this.I0 = new WeakReference<>(right);
        }
    }

    public final void j1(d constraintAnchor, h parentMin) {
        this.v0.h(this.v0.q(constraintAnchor), parentMin, 0, 5);
    }

    public final void i1(d constraintAnchor, h parentMax) {
        this.v0.h(parentMax, this.v0.q(constraintAnchor), 0, 5);
    }

    public boolean e1(d system) {
        boolean optimize = A1(64);
        e(system, optimize);
        int count = this.q0.size();
        boolean hasBarriers = false;
        for (int i = 0; i < count; i++) {
            e widget = this.q0.get(i);
            widget.A0(0, false);
            widget.A0(1, false);
            if (widget instanceof a) {
                hasBarriers = true;
            }
        }
        if (hasBarriers) {
            for (int i2 = 0; i2 < count; i2++) {
                e widget2 = this.q0.get(i2);
                if (widget2 instanceof a) {
                    ((a) widget2).h1();
                }
            }
        }
        for (int i3 = 0; i3 < count; i3++) {
            e widget3 = this.q0.get(i3);
            if (widget3.d()) {
                widget3.e(system, optimize);
            }
        }
        if (d.r) {
            HashSet<ConstraintWidget> widgetsToAdd = new HashSet<>();
            for (int i4 = 0; i4 < count; i4++) {
                e widget4 = this.q0.get(i4);
                if (!widget4.d()) {
                    widgetsToAdd.add(widget4);
                }
            }
            c(this, system, widgetsToAdd, w() == e.a.WRAP_CONTENT ? 0 : 1, false);
            Iterator<ConstraintWidget> it = widgetsToAdd.iterator();
            while (it.hasNext()) {
                e widget5 = (e) it.next();
                j.a(this, system, widget5);
                widget5.e(system, optimize);
            }
        } else {
            for (int i5 = 0; i5 < count; i5++) {
                e widget6 = this.q0.get(i5);
                if (widget6 instanceof f) {
                    e.a[] aVarArr = widget6.R;
                    e.a horizontalBehaviour = aVarArr[0];
                    e.a verticalBehaviour = aVarArr[1];
                    if (horizontalBehaviour == e.a.WRAP_CONTENT) {
                        widget6.x0(e.a.FIXED);
                    }
                    if (verticalBehaviour == e.a.WRAP_CONTENT) {
                        widget6.O0(e.a.FIXED);
                    }
                    widget6.e(system, optimize);
                    if (horizontalBehaviour == e.a.WRAP_CONTENT) {
                        widget6.x0(horizontalBehaviour);
                    }
                    if (verticalBehaviour == e.a.WRAP_CONTENT) {
                        widget6.O0(verticalBehaviour);
                    }
                } else {
                    j.a(this, system, widget6);
                    if (!widget6.d()) {
                        widget6.e(system, optimize);
                    }
                }
            }
        }
        if (this.y0 > 0) {
            b.b(this, system, null, 0);
        }
        if (this.z0 > 0) {
            b.b(this, system, null, 1);
        }
        return true;
    }

    public void F1(d system, boolean[] flags) {
        flags[2] = false;
        boolean optimize = A1(64);
        X0(system, optimize);
        int count = this.q0.size();
        for (int i = 0; i < count; i++) {
            this.q0.get(i).X0(system, optimize);
        }
    }

    @Override // a.f.b.i.e
    public void W0(boolean updateHorizontal, boolean updateVertical) {
        super.W0(updateHorizontal, updateVertical);
        int count = this.q0.size();
        for (int i = 0; i < count; i++) {
            this.q0.get(i).W0(updateHorizontal, updateVertical);
        }
    }

    public void E1(boolean isRtl) {
        this.u0 = isRtl;
    }

    public boolean w1() {
        return this.u0;
    }

    public static boolean z1(e widget, b.AbstractC0011b measurer, b.a measure, boolean useCurrentDimensions) {
        int measuredWidth;
        int measuredHeight;
        if (measurer == null) {
            return false;
        }
        measure.f637a = widget.w();
        measure.f638b = widget.M();
        measure.f639c = widget.P();
        measure.f640d = widget.t();
        measure.i = false;
        measure.j = useCurrentDimensions;
        boolean horizontalMatchConstraints = measure.f637a == e.a.MATCH_CONSTRAINT;
        boolean verticalMatchConstraints = measure.f638b == e.a.MATCH_CONSTRAINT;
        boolean horizontalUseRatio = horizontalMatchConstraints && widget.V > 0.0f;
        boolean verticalUseRatio = verticalMatchConstraints && widget.V > 0.0f;
        if (horizontalMatchConstraints && widget.T(0) && widget.o == 0 && !horizontalUseRatio) {
            horizontalMatchConstraints = false;
            measure.f637a = e.a.WRAP_CONTENT;
            if (verticalMatchConstraints && widget.p == 0) {
                measure.f637a = e.a.FIXED;
            }
        }
        if (verticalMatchConstraints && widget.T(1) && widget.p == 0 && !verticalUseRatio) {
            verticalMatchConstraints = false;
            measure.f638b = e.a.WRAP_CONTENT;
            if (horizontalMatchConstraints && widget.o == 0) {
                measure.f638b = e.a.FIXED;
            }
        }
        if (widget.c0()) {
            horizontalMatchConstraints = false;
            measure.f637a = e.a.FIXED;
        }
        if (widget.d0()) {
            verticalMatchConstraints = false;
            measure.f638b = e.a.FIXED;
        }
        if (horizontalUseRatio) {
            if (widget.q[0] == 4) {
                measure.f637a = e.a.FIXED;
            } else if (!verticalMatchConstraints) {
                if (measure.f638b == e.a.FIXED) {
                    measuredHeight = measure.f640d;
                } else {
                    measure.f637a = e.a.WRAP_CONTENT;
                    ((ConstraintLayout.b) measurer).d(widget, measure);
                    measuredHeight = measure.f642f;
                }
                measure.f637a = e.a.FIXED;
                int i = widget.W;
                if (i == 0 || i == -1) {
                    measure.f639c = (int) (widget.r() * ((float) measuredHeight));
                } else {
                    measure.f639c = (int) (widget.r() / ((float) measuredHeight));
                }
            }
        }
        if (verticalUseRatio) {
            if (widget.q[1] == 4) {
                measure.f638b = e.a.FIXED;
            } else if (!horizontalMatchConstraints) {
                if (measure.f637a == e.a.FIXED) {
                    measuredWidth = measure.f639c;
                } else {
                    measure.f638b = e.a.WRAP_CONTENT;
                    ((ConstraintLayout.b) measurer).d(widget, measure);
                    measuredWidth = measure.f641e;
                }
                measure.f638b = e.a.FIXED;
                int i2 = widget.W;
                if (i2 == 0 || i2 == -1) {
                    measure.f640d = (int) (((float) measuredWidth) / widget.r());
                } else {
                    measure.f640d = (int) (((float) measuredWidth) * widget.r());
                }
            }
        }
        ((ConstraintLayout.b) measurer).d(widget, measure);
        widget.S0(measure.f641e);
        widget.t0(measure.f642f);
        widget.s0(measure.h);
        widget.i0(measure.f643g);
        measure.j = false;
        return measure.i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x033c A[SYNTHETIC] */
    @Override // a.f.b.i.l
    public void a1() {
        int preh;
        int preh2;
        int prew;
        boolean needsSolving;
        boolean optimize;
        boolean maxX;
        int width;
        int height;
        boolean needsSolving2;
        e.a aVar;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int count = this.q0.size();
        int prew2 = Math.max(0, P());
        int preh3 = Math.max(0, t());
        e.a[] aVarArr = this.R;
        e.a originalVerticalDimensionBehaviour = aVarArr[1];
        e.a originalHorizontalDimensionBehaviour = aVarArr[0];
        if (j.b(this.C0, 1)) {
            a.f.b.i.m.h.h(this, q1());
            for (int i = 0; i < count; i++) {
                e child = this.q0.get(i);
                if (child.b0() && !(child instanceof g) && !(child instanceof a) && !(child instanceof k) && !child.a0()) {
                    e.a widthBehavior = child.q(0);
                    e.a heightBehavior = child.q(1);
                    e.a aVar2 = e.a.MATCH_CONSTRAINT;
                    if (!(widthBehavior == aVar2 && child.o != 1 && heightBehavior == aVar2 && child.p != 1)) {
                        z1(child, this.t0, new b.a(), false);
                    }
                }
            }
        }
        if (count <= 2 || (!(originalHorizontalDimensionBehaviour == (aVar = e.a.WRAP_CONTENT) || originalVerticalDimensionBehaviour == aVar) || !j.b(this.C0, 1024) || !i.c(this, q1()))) {
            preh2 = prew2;
            prew = 0;
            preh = preh3;
        } else {
            if (originalHorizontalDimensionBehaviour == e.a.WRAP_CONTENT) {
                if (prew2 >= P() || prew2 <= 0) {
                    prew2 = P();
                } else {
                    S0(prew2);
                    this.D0 = true;
                }
            }
            if (originalVerticalDimensionBehaviour == e.a.WRAP_CONTENT) {
                if (preh3 >= t() || preh3 <= 0) {
                    preh3 = t();
                } else {
                    t0(preh3);
                    this.E0 = true;
                }
            }
            preh2 = prew2;
            prew = 1;
            preh = preh3;
        }
        boolean useGraphOptimizer = A1(64) || A1(128);
        d dVar = this.v0;
        dVar.h = false;
        dVar.i = false;
        if (this.C0 != 0 && useGraphOptimizer) {
            dVar.i = true;
        }
        ArrayList<e> arrayList = this.q0;
        boolean hasWrapContent = w() == e.a.WRAP_CONTENT || M() == e.a.WRAP_CONTENT;
        B1();
        int countSolve = 0;
        for (int i2 = 0; i2 < count; i2++) {
            e widget = this.q0.get(i2);
            if (widget instanceof l) {
                ((l) widget).a1();
            }
        }
        boolean optimize2 = A1(64);
        boolean needsSolving3 = true;
        int wrap_override = prew;
        while (needsSolving3) {
            countSolve++;
            try {
                this.v0.D();
                B1();
                i(this.v0);
                for (int i3 = 0; i3 < count; i3++) {
                    this.q0.get(i3).i(this.v0);
                }
                e1(this.v0);
                needsSolving = true;
                if (!(this.F0 == null || this.F0.get() == null)) {
                    j1(this.F0.get(), this.v0.q(this.H));
                    this.F0 = null;
                }
                if (!(this.H0 == null || this.H0.get() == null)) {
                    i1(this.H0.get(), this.v0.q(this.J));
                    this.H0 = null;
                }
                if (!(this.G0 == null || this.G0.get() == null)) {
                    j1(this.G0.get(), this.v0.q(this.G));
                    this.G0 = null;
                }
                if (!(this.I0 == null || this.I0.get() == null)) {
                    i1(this.I0.get(), this.v0.q(this.I));
                    this.I0 = null;
                }
                if (1 != 0) {
                    this.v0.z();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("EXCEPTION : " + e2);
                needsSolving = needsSolving3;
            }
            if (needsSolving) {
                F1(this.v0, j.f633a);
            } else {
                X0(this.v0, optimize2);
                for (int i4 = 0; i4 < count; i4++) {
                    this.q0.get(i4).X0(this.v0, optimize2);
                }
            }
            boolean needsSolving4 = false;
            if (!hasWrapContent || countSolve >= 8 || !j.f633a[2]) {
                needsSolving2 = false;
                optimize = optimize2;
            } else {
                int maxX2 = 0;
                int maxY = 0;
                int i5 = 0;
                while (i5 < count) {
                    e widget2 = this.q0.get(i5);
                    maxX2 = Math.max(maxX2, widget2.X + widget2.P());
                    maxY = Math.max(maxY, widget2.Y + widget2.t());
                    i5++;
                    needsSolving4 = needsSolving4;
                    optimize2 = optimize2;
                }
                needsSolving2 = needsSolving4;
                optimize = optimize2;
                int maxX3 = Math.max(this.a0, maxX2);
                int maxY2 = Math.max(this.b0, maxY);
                if (originalHorizontalDimensionBehaviour == e.a.WRAP_CONTENT && P() < maxX3) {
                    S0(maxX3);
                    this.R[0] = e.a.WRAP_CONTENT;
                    wrap_override = 1;
                    needsSolving2 = true;
                }
                if (originalVerticalDimensionBehaviour == e.a.WRAP_CONTENT && t() < maxY2) {
                    t0(maxY2);
                    this.R[1] = e.a.WRAP_CONTENT;
                    wrap_override = 1;
                    maxX = true;
                    width = Math.max(this.a0, P());
                    if (width > P()) {
                        S0(width);
                        this.R[0] = e.a.FIXED;
                        wrap_override = 1;
                        maxX = true;
                    }
                    height = Math.max(this.b0, t());
                    if (height > t()) {
                        t0(height);
                        this.R[1] = e.a.FIXED;
                        wrap_override = 1;
                        maxX = true;
                    }
                    if (wrap_override != 0) {
                        if (this.R[0] == e.a.WRAP_CONTENT && preh2 > 0 && P() > preh2) {
                            this.D0 = true;
                            wrap_override = 1;
                            this.R[0] = e.a.FIXED;
                            S0(preh2);
                            maxX = true;
                        }
                        if (this.R[1] == e.a.WRAP_CONTENT && preh > 0 && t() > preh) {
                            this.E0 = true;
                            wrap_override = 1;
                            this.R[1] = e.a.FIXED;
                            t0(preh);
                            maxX = true;
                        }
                    }
                    needsSolving3 = maxX;
                    optimize2 = optimize;
                }
            }
            maxX = needsSolving2;
            width = Math.max(this.a0, P());
            if (width > P()) {
            }
            height = Math.max(this.b0, t());
            if (height > t()) {
            }
            if (wrap_override != 0) {
            }
            needsSolving3 = maxX;
            optimize2 = optimize;
        }
        this.q0 = arrayList;
        if (wrap_override != 0) {
            e.a[] aVarArr2 = this.R;
            aVarArr2[0] = originalHorizontalDimensionBehaviour;
            aVarArr2[1] = originalVerticalDimensionBehaviour;
        }
        h0(this.v0.v());
    }

    public d s1() {
        return this.v0;
    }

    public final void B1() {
        this.y0 = 0;
        this.z0 = 0;
    }

    public void d1(e constraintWidget, int type) {
        if (type == 0) {
            f1(constraintWidget);
        } else if (type == 1) {
            k1(constraintWidget);
        }
    }

    public final void f1(e widget) {
        int i = this.y0 + 1;
        c[] cVarArr = this.B0;
        if (i >= cVarArr.length) {
            this.B0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.B0[this.y0] = new c(widget, 0, w1());
        this.y0++;
    }

    public final void k1(e widget) {
        int i = this.z0 + 1;
        c[] cVarArr = this.A0;
        if (i >= cVarArr.length) {
            this.A0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.A0[this.z0] = new c(widget, 1, w1());
        this.z0++;
    }
}
