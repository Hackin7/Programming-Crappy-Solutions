package a.f.b.i.m;

import a.f.b.i.a;
import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.f;
import a.f.b.i.g;
import a.f.b.i.m.b;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static b.a f664a = new b.a();

    public static void h(f layout, b.AbstractC0011b measurer) {
        int i;
        e.a horizontal = layout.w();
        e.a vertical = layout.M();
        layout.g0();
        ArrayList<ConstraintWidget> children = layout.Z0();
        int count = children.size();
        for (int i2 = 0; i2 < count; i2++) {
            ((e) children.get(i2)).g0();
        }
        if (horizontal == e.a.FIXED) {
            layout.n0(0, layout.P());
        } else {
            layout.o0(0);
        }
        boolean hasGuideline = false;
        boolean hasBarrier = false;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= count) {
                break;
            }
            e child = (e) children.get(i3);
            if (child instanceof g) {
                g guideline = (g) child;
                if (guideline.Z0() == 1) {
                    if (guideline.a1() != -1) {
                        guideline.d1(guideline.a1());
                    } else if (guideline.b1() != -1 && layout.c0()) {
                        guideline.d1(layout.P() - guideline.b1());
                    } else if (layout.c0()) {
                        guideline.d1((int) ((guideline.c1() * ((float) layout.P())) + 0.5f));
                    }
                    hasGuideline = true;
                }
            } else if ((child instanceof a) && ((a) child).g1() == 0) {
                hasBarrier = true;
            }
            i3++;
        }
        if (hasGuideline) {
            for (int i4 = 0; i4 < count; i4++) {
                e child2 = (e) children.get(i4);
                if (child2 instanceof g) {
                    g guideline2 = (g) child2;
                    if (guideline2.Z0() == 1) {
                        b(guideline2, measurer);
                    }
                }
            }
        }
        b(layout, measurer);
        if (hasBarrier) {
            for (int i5 = 0; i5 < count; i5++) {
                e child3 = (e) children.get(i5);
                if (child3 instanceof a) {
                    a barrier = (a) child3;
                    if (barrier.g1() == 0) {
                        c(barrier, measurer, 0);
                    }
                }
            }
        }
        if (vertical == e.a.FIXED) {
            layout.q0(0, layout.t());
        } else {
            layout.p0(0);
        }
        boolean hasGuideline2 = false;
        boolean hasBarrier2 = false;
        int i6 = 0;
        while (i6 < count) {
            e child4 = (e) children.get(i6);
            if (child4 instanceof g) {
                g guideline3 = (g) child4;
                if (guideline3.Z0() == 0) {
                    if (guideline3.a1() != i) {
                        guideline3.d1(guideline3.a1());
                    } else if (guideline3.b1() != i && layout.d0()) {
                        guideline3.d1(layout.t() - guideline3.b1());
                    } else if (layout.d0()) {
                        guideline3.d1((int) ((guideline3.c1() * ((float) layout.t())) + 0.5f));
                    }
                    hasGuideline2 = true;
                }
            } else if ((child4 instanceof a) && ((a) child4).g1() == 1) {
                hasBarrier2 = true;
            }
            i6++;
            i = -1;
        }
        if (hasGuideline2) {
            for (int i7 = 0; i7 < count; i7++) {
                e child5 = (e) children.get(i7);
                if (child5 instanceof g) {
                    g guideline4 = (g) child5;
                    if (guideline4.Z0() == 0) {
                        i(guideline4, measurer);
                    }
                }
            }
        }
        i(layout, measurer);
        if (hasBarrier2) {
            for (int i8 = 0; i8 < count; i8++) {
                e child6 = (e) children.get(i8);
                if (child6 instanceof a) {
                    a barrier2 = (a) child6;
                    if (barrier2.g1() == 1) {
                        c(barrier2, measurer, 1);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < count; i9++) {
            e child7 = (e) children.get(i9);
            if (child7.b0() && a(child7)) {
                f.z1(child7, measurer, f664a, false);
                b(child7, measurer);
                i(child7, measurer);
            }
        }
    }

    public static void c(a barrier, b.AbstractC0011b measurer, int orientation) {
        if (!barrier.c1()) {
            return;
        }
        if (orientation == 0) {
            b(barrier, measurer);
        } else {
            i(barrier, measurer);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b5, code lost:
        if (r9.r() == 0.0f) goto L_0x01bb;
     */
    public static void b(e layout, b.AbstractC0011b measurer) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        d dVar5;
        boolean z = false;
        if (!(layout instanceof f) && layout.b0() && a(layout)) {
            f.z1(layout, measurer, new b.a(), false);
        }
        d left = layout.k(d.a.LEFT);
        d right = layout.k(d.a.RIGHT);
        int l = left.d();
        int r = right.d();
        int i = 8;
        if (left.c() != null && left.m()) {
            Iterator<d> it = left.c().iterator();
            while (it.hasNext()) {
                d first = it.next();
                e widget = first.f611d;
                boolean canMeasure = a(widget);
                if (widget.b0() && canMeasure) {
                    f.z1(widget, measurer, new b.a(), z);
                }
                if (widget.w() != e.a.MATCH_CONSTRAINT || canMeasure) {
                    if (widget.b0()) {
                        z = false;
                    } else {
                        d dVar6 = widget.G;
                        if (first == dVar6 && widget.I.f613f == null) {
                            int x1 = dVar6.e() + l;
                            widget.n0(x1, widget.P() + x1);
                            b(widget, measurer);
                        } else {
                            d dVar7 = widget.I;
                            if (first == dVar7 && widget.G.f613f == null) {
                                int x2 = l - dVar7.e();
                                widget.n0(x2 - widget.P(), x2);
                                b(widget, measurer);
                            } else if (first == widget.G && (dVar3 = widget.I.f613f) != null && dVar3.m() && !widget.X()) {
                                d(measurer, widget);
                            }
                        }
                    }
                } else if (widget.w() == e.a.MATCH_CONSTRAINT && ((widget.O() == 8 || (widget.o == 0 && widget.r() == 0.0f)) && !widget.X() && !widget.a0())) {
                    if (((first == widget.G && (dVar5 = widget.I.f613f) != null && dVar5.m()) || (first == widget.I && (dVar4 = widget.G.f613f) != null && dVar4.m())) && !widget.X()) {
                        e(layout, measurer, widget);
                    }
                }
                z = false;
            }
        }
        if (!(layout instanceof g) && right.c() != null && right.m()) {
            Iterator<d> it2 = right.c().iterator();
            while (it2.hasNext()) {
                d first2 = it2.next();
                e widget2 = first2.f611d;
                boolean canMeasure2 = a(widget2);
                if (widget2.b0() && canMeasure2) {
                    f.z1(widget2, measurer, new b.a(), false);
                }
                boolean bothConnected = (first2 == widget2.G && (dVar2 = widget2.I.f613f) != null && dVar2.m()) || (first2 == widget2.I && (dVar = widget2.G.f613f) != null && dVar.m());
                if (widget2.w() == e.a.MATCH_CONSTRAINT) {
                    if (!canMeasure2) {
                        if (widget2.w() == e.a.MATCH_CONSTRAINT) {
                            if (widget2.O() != i) {
                                if (widget2.o == 0) {
                                }
                            }
                            if (!widget2.X() && !widget2.a0() && bothConnected && !widget2.X()) {
                                e(layout, measurer, widget2);
                            }
                        }
                        i = 8;
                    }
                }
                if (!widget2.b0()) {
                    d dVar8 = widget2.G;
                    if (first2 == dVar8 && widget2.I.f613f == null) {
                        int x12 = dVar8.e() + r;
                        widget2.n0(x12, widget2.P() + x12);
                        b(widget2, measurer);
                        i = 8;
                    } else {
                        d dVar9 = widget2.I;
                        if (first2 == dVar9 && widget2.G.f613f == null) {
                            int x22 = r - dVar9.e();
                            widget2.n0(x22 - widget2.P(), x22);
                            b(widget2, measurer);
                            i = 8;
                        } else {
                            if (bothConnected && !widget2.X()) {
                                d(measurer, widget2);
                            }
                            i = 8;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ab, code lost:
        if (r9.r() == 0.0f) goto L_0x01b1;
     */
    public static void i(e layout, b.AbstractC0011b measurer) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        d dVar5;
        boolean z = false;
        if (!(layout instanceof f) && layout.b0() && a(layout)) {
            f.z1(layout, measurer, new b.a(), false);
        }
        d top = layout.k(d.a.TOP);
        d bottom = layout.k(d.a.BOTTOM);
        int t = top.d();
        int b2 = bottom.d();
        int i = 8;
        if (top.c() != null && top.m()) {
            Iterator<d> it = top.c().iterator();
            while (it.hasNext()) {
                d first = it.next();
                e widget = first.f611d;
                boolean canMeasure = a(widget);
                if (widget.b0() && canMeasure) {
                    f.z1(widget, measurer, new b.a(), z);
                }
                if (widget.M() != e.a.MATCH_CONSTRAINT || canMeasure) {
                    if (widget.b0()) {
                        z = false;
                    } else {
                        d dVar6 = widget.H;
                        if (first == dVar6 && widget.J.f613f == null) {
                            int y1 = dVar6.e() + t;
                            widget.q0(y1, widget.t() + y1);
                            i(widget, measurer);
                        } else {
                            d dVar7 = widget.J;
                            if (first == dVar7 && dVar7.f613f == null) {
                                int y2 = t - dVar7.e();
                                widget.q0(y2 - widget.t(), y2);
                                i(widget, measurer);
                            } else if (first == widget.H && (dVar3 = widget.J.f613f) != null && dVar3.m()) {
                                f(measurer, widget);
                            }
                        }
                    }
                } else if (widget.M() == e.a.MATCH_CONSTRAINT && ((widget.O() == 8 || (widget.p == 0 && widget.r() == 0.0f)) && !widget.Z() && !widget.a0())) {
                    if (((first == widget.H && (dVar5 = widget.J.f613f) != null && dVar5.m()) || (first == widget.J && (dVar4 = widget.H.f613f) != null && dVar4.m())) && !widget.Z()) {
                        g(layout, measurer, widget);
                    }
                }
                z = false;
            }
        }
        if (!(layout instanceof g)) {
            if (bottom.c() != null && bottom.m()) {
                Iterator<d> it2 = bottom.c().iterator();
                while (it2.hasNext()) {
                    d first2 = it2.next();
                    e widget2 = first2.f611d;
                    boolean canMeasure2 = a(widget2);
                    if (widget2.b0() && canMeasure2) {
                        f.z1(widget2, measurer, new b.a(), false);
                    }
                    boolean bothConnected = (first2 == widget2.H && (dVar2 = widget2.J.f613f) != null && dVar2.m()) || (first2 == widget2.J && (dVar = widget2.H.f613f) != null && dVar.m());
                    if (widget2.M() == e.a.MATCH_CONSTRAINT) {
                        if (!canMeasure2) {
                            if (widget2.M() == e.a.MATCH_CONSTRAINT) {
                                if (widget2.O() != i) {
                                    if (widget2.p == 0) {
                                    }
                                }
                                if (!widget2.Z() && !widget2.a0() && bothConnected && !widget2.Z()) {
                                    g(layout, measurer, widget2);
                                }
                            }
                            i = 8;
                        }
                    }
                    if (!widget2.b0()) {
                        d dVar8 = widget2.H;
                        if (first2 == dVar8 && widget2.J.f613f == null) {
                            int y12 = dVar8.e() + b2;
                            widget2.q0(y12, widget2.t() + y12);
                            i(widget2, measurer);
                            i = 8;
                        } else {
                            d dVar9 = widget2.J;
                            if (first2 == dVar9 && widget2.H.f613f == null) {
                                int y22 = b2 - dVar9.e();
                                widget2.q0(y22 - widget2.t(), y22);
                                i(widget2, measurer);
                                i = 8;
                            } else {
                                if (bothConnected && !widget2.Z()) {
                                    f(measurer, widget2);
                                }
                                i = 8;
                            }
                        }
                    }
                }
            }
            d baseline = layout.k(d.a.BASELINE);
            if (baseline.c() != null && baseline.m()) {
                int baselineValue = baseline.d();
                Iterator<d> it3 = baseline.c().iterator();
                while (it3.hasNext()) {
                    d first3 = it3.next();
                    e widget3 = first3.f611d;
                    boolean canMeasure3 = a(widget3);
                    if (widget3.b0() && canMeasure3) {
                        f.z1(widget3, measurer, new b.a(), false);
                    }
                    if ((widget3.M() != e.a.MATCH_CONSTRAINT || canMeasure3) && !widget3.b0() && first3 == widget3.K) {
                        widget3.m0(baselineValue);
                        i(widget3, measurer);
                    }
                }
            }
        }
    }

    public static void d(b.AbstractC0011b measurer, e widget) {
        float bias = widget.u();
        int start = widget.G.f613f.d();
        int end = widget.I.f613f.d();
        int s1 = widget.G.e() + start;
        int s2 = end - widget.I.e();
        if (start == end) {
            bias = 0.5f;
            s1 = start;
            s2 = end;
        }
        int width = widget.P();
        int distance = (s2 - s1) - width;
        if (s1 > s2) {
            distance = (s1 - s2) - width;
        }
        if (((f) widget.G()).w1()) {
            bias = 1.0f - bias;
        }
        int d1 = (int) ((((float) distance) * bias) + 0.5f);
        int x1 = s1 + d1;
        int x2 = x1 + width;
        if (s1 > s2) {
            x1 = s1 + d1;
            x2 = x1 - width;
        }
        widget.n0(x1, x2);
        b(widget, measurer);
    }

    public static void f(b.AbstractC0011b measurer, e widget) {
        float bias = widget.K();
        int start = widget.H.f613f.d();
        int end = widget.J.f613f.d();
        int s1 = widget.H.e() + start;
        int s2 = end - widget.J.e();
        if (start == end) {
            bias = 0.5f;
            s1 = start;
            s2 = end;
        }
        int height = widget.t();
        int distance = (s2 - s1) - height;
        if (s1 > s2) {
            distance = (s1 - s2) - height;
        }
        int d1 = (int) ((((float) distance) * bias) + 0.5f);
        int y1 = s1 + d1;
        int y2 = y1 + height;
        if (s1 > s2) {
            y1 = s1 - d1;
            y2 = y1 - height;
        }
        widget.q0(y1, y2);
        i(widget, measurer);
    }

    public static void e(e layout, b.AbstractC0011b measurer, e widget) {
        int parentWidth;
        float bias = widget.u();
        int s1 = widget.G.f613f.d() + widget.G.e();
        int s2 = widget.I.f613f.d() - widget.I.e();
        if (s2 >= s1) {
            int width = widget.P();
            if (widget.O() != 8) {
                int i = widget.o;
                if (i == 2) {
                    if (layout instanceof f) {
                        parentWidth = layout.P();
                    } else {
                        parentWidth = layout.G().P();
                    }
                    width = (int) (widget.u() * 0.5f * ((float) parentWidth));
                } else if (i == 0) {
                    width = s2 - s1;
                }
                width = Math.max(widget.r, width);
                int i2 = widget.s;
                if (i2 > 0) {
                    width = Math.min(i2, width);
                }
            }
            int x1 = s1 + ((int) ((((float) ((s2 - s1) - width)) * bias) + 0.5f));
            widget.n0(x1, x1 + width);
            b(widget, measurer);
        }
    }

    public static void g(e layout, b.AbstractC0011b measurer, e widget) {
        int parentHeight;
        float bias = widget.K();
        int s1 = widget.H.f613f.d() + widget.H.e();
        int s2 = widget.J.f613f.d() - widget.J.e();
        if (s2 >= s1) {
            int height = widget.t();
            if (widget.O() != 8) {
                int i = widget.p;
                if (i == 2) {
                    if (layout instanceof f) {
                        parentHeight = layout.t();
                    } else {
                        parentHeight = layout.G().t();
                    }
                    height = (int) (bias * 0.5f * ((float) parentHeight));
                } else if (i == 0) {
                    height = s2 - s1;
                }
                height = Math.max(widget.u, height);
                int i2 = widget.v;
                if (i2 > 0) {
                    height = Math.min(i2, height);
                }
            }
            int y1 = s1 + ((int) ((((float) ((s2 - s1) - height)) * bias) + 0.5f));
            widget.q0(y1, y1 + height);
            i(widget, measurer);
        }
    }

    public static boolean a(e layout) {
        e.a horizontalBehaviour = layout.w();
        e.a verticalBehaviour = layout.M();
        f parent = layout.G() != null ? (f) layout.G() : null;
        if (parent == null || parent.w() != e.a.FIXED) {
        }
        if (parent == null || parent.M() != e.a.FIXED) {
        }
        boolean isHorizontalFixed = horizontalBehaviour == e.a.FIXED || horizontalBehaviour == e.a.WRAP_CONTENT || (horizontalBehaviour == e.a.MATCH_CONSTRAINT && layout.o == 0 && layout.V == 0.0f && layout.T(0)) || layout.c0();
        boolean isVerticalFixed = verticalBehaviour == e.a.FIXED || verticalBehaviour == e.a.WRAP_CONTENT || (verticalBehaviour == e.a.MATCH_CONSTRAINT && layout.p == 0 && layout.V == 0.0f && layout.T(1)) || layout.d0();
        if (layout.V > 0.0f && (isHorizontalFixed || isVerticalFixed)) {
            return true;
        }
        if (!isHorizontalFixed || !isVerticalFixed) {
            return false;
        }
        return true;
    }
}
