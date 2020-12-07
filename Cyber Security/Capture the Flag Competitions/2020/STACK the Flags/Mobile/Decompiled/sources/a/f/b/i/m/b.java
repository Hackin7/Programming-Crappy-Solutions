package a.f.b.i.m;

import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.f;
import a.f.b.i.g;
import a.f.b.i.h;
import a.f.b.i.j;
import a.f.b.i.k;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e> f634a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f635b = new a();

    /* renamed from: c  reason: collision with root package name */
    public f f636c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.a f637a;

        /* renamed from: b  reason: collision with root package name */
        public e.a f638b;

        /* renamed from: c  reason: collision with root package name */
        public int f639c;

        /* renamed from: d  reason: collision with root package name */
        public int f640d;

        /* renamed from: e  reason: collision with root package name */
        public int f641e;

        /* renamed from: f  reason: collision with root package name */
        public int f642f;

        /* renamed from: g  reason: collision with root package name */
        public int f643g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    /* renamed from: a.f.b.i.m.b$b  reason: collision with other inner class name */
    public interface AbstractC0011b {
    }

    public void e(f layout) {
        this.f634a.clear();
        int childCount = layout.q0.size();
        for (int i = 0; i < childCount; i++) {
            e widget = layout.q0.get(i);
            if (widget.w() == e.a.MATCH_CONSTRAINT || widget.M() == e.a.MATCH_CONSTRAINT) {
                this.f634a.add(widget);
            }
        }
        layout.t1();
    }

    public b(f constraintWidgetContainer) {
        this.f636c = constraintWidgetContainer;
    }

    public final void b(f layout) {
        l lVar;
        n nVar;
        int childCount = layout.q0.size();
        boolean optimize = layout.A1(64);
        AbstractC0011b measurer = layout.q1();
        for (int i = 0; i < childCount; i++) {
            e child = layout.q0.get(i);
            if (!(child instanceof g) && !(child instanceof a.f.b.i.a) && !child.a0() && (!optimize || (lVar = child.f624d) == null || (nVar = child.f625e) == null || !lVar.f678e.j || !nVar.f678e.j)) {
                e.a widthBehavior = child.q(0);
                e.a heightBehavior = child.q(1);
                e.a aVar = e.a.MATCH_CONSTRAINT;
                boolean skip = widthBehavior == aVar && child.o != 1 && heightBehavior == aVar && child.p != 1;
                if (!skip && layout.A1(1) && !(child instanceof k)) {
                    e.a aVar2 = e.a.MATCH_CONSTRAINT;
                    if (widthBehavior == aVar2 && child.o == 0 && heightBehavior != aVar2 && !child.X()) {
                        skip = true;
                    }
                    e.a aVar3 = e.a.MATCH_CONSTRAINT;
                    if (heightBehavior == aVar3 && child.p == 0 && widthBehavior != aVar3 && !child.X()) {
                        skip = true;
                    }
                }
                if (!skip) {
                    a(measurer, child, false);
                }
            }
        }
        ((ConstraintLayout.b) measurer).b();
    }

    public final void c(f layout, int w, int h) {
        int minWidth = layout.E();
        int minHeight = layout.D();
        layout.I0(0);
        layout.H0(0);
        layout.S0(w);
        layout.t0(h);
        layout.I0(minWidth);
        layout.H0(minHeight);
        this.f636c.a1();
    }

    public long d(f layout, int optimizationLevel, int widthMode, int widthSize, int heightMode, int heightSize) {
        boolean ratio;
        boolean allSolved;
        int widthSize2;
        int i;
        int optimizations;
        long layoutTime;
        boolean containerWrapWidth;
        boolean optimize;
        int sizeDependentWidgetsCount;
        int maxIterations;
        int optimizations2;
        int measuredWidth;
        int heightSize2;
        boolean allSolved2;
        boolean allSolved3;
        boolean optimize2;
        f fVar = layout;
        int lastMeasureWidth = 0;
        int lastMeasureHeight = 0;
        AbstractC0011b measurer = layout.q1();
        long layoutTime2 = 0;
        int childCount = fVar.q0.size();
        int startingWidth = layout.P();
        int startingHeight = layout.t();
        boolean optimizeWrap = j.b(optimizationLevel, 128);
        boolean optimize3 = optimizeWrap || j.b(optimizationLevel, 64);
        if (optimize3) {
            int i2 = 0;
            while (i2 < childCount) {
                e child = fVar.q0.get(i2);
                boolean ratio2 = (child.w() == e.a.MATCH_CONSTRAINT) && (child.M() == e.a.MATCH_CONSTRAINT) && child.r() > 0.0f;
                if (!child.X() || !ratio2) {
                    if (child.Z() && ratio2) {
                        ratio = false;
                        break;
                    } else if (child instanceof k) {
                        ratio = false;
                        break;
                    } else if (child.X() || child.Z()) {
                        ratio = false;
                        break;
                    } else {
                        i2++;
                        lastMeasureWidth = lastMeasureWidth;
                        lastMeasureHeight = lastMeasureHeight;
                        optimize3 = optimize3;
                    }
                } else {
                    ratio = false;
                    break;
                }
            }
            optimize2 = optimize3;
        } else {
            optimize2 = optimize3;
        }
        ratio = optimize2;
        if (ratio) {
        }
        boolean optimize4 = ((widthMode == 1073741824 && heightMode == 1073741824) || optimizeWrap) & ratio;
        int computations = 0;
        if (optimize4) {
            widthSize2 = Math.min(layout.C(), widthSize);
            int heightSize3 = Math.min(layout.B(), heightSize);
            if (widthMode == 1073741824 && layout.P() != widthSize2) {
                fVar.S0(widthSize2);
                layout.t1();
            }
            if (heightMode == 1073741824 && layout.t() != heightSize3) {
                fVar.t0(heightSize3);
                layout.t1();
            }
            if (widthMode == 1073741824 && heightMode == 1073741824) {
                computations = 2;
                heightSize2 = heightSize3;
                allSolved2 = fVar.n1(optimizeWrap);
            } else {
                boolean allSolved4 = fVar.o1(optimizeWrap);
                heightSize2 = heightSize3;
                if (widthMode == 1073741824) {
                    allSolved4 &= fVar.p1(optimizeWrap, 0);
                    computations = 0 + 1;
                }
                if (heightMode == 1073741824) {
                    allSolved2 = allSolved4 & fVar.p1(optimizeWrap, 1);
                    computations++;
                } else {
                    allSolved2 = allSolved4;
                }
            }
            if (allSolved2) {
                allSolved3 = allSolved2;
                fVar.W0(widthMode == 1073741824, heightMode == 1073741824);
            } else {
                allSolved3 = allSolved2;
            }
            i = heightSize2;
            allSolved = allSolved3;
        } else {
            widthSize2 = widthSize;
            allSolved = false;
            i = heightSize;
        }
        if (allSolved && computations == 2) {
            return 0;
        }
        int optimizations3 = layout.r1();
        if (childCount > 0) {
            b(layout);
        }
        int sizeDependentWidgetsCount2 = this.f634a.size();
        if (childCount > 0) {
            c(fVar, startingWidth, startingHeight);
        }
        if (sizeDependentWidgetsCount2 > 0) {
            boolean containerWrapWidth2 = layout.w() == e.a.WRAP_CONTENT;
            boolean containerWrapHeight = layout.M() == e.a.WRAP_CONTENT;
            int minWidth = Math.max(layout.P(), this.f636c.E());
            int minHeight = Math.max(layout.t(), this.f636c.D());
            int minWidth2 = minWidth;
            int measuredHeight = 0;
            int i3 = 0;
            while (i3 < sizeDependentWidgetsCount2) {
                e widget = this.f634a.get(i3);
                if (!(widget instanceof k)) {
                    optimizations2 = optimizations3;
                } else {
                    int preWidth = widget.P();
                    int preHeight = widget.t();
                    optimizations2 = optimizations3;
                    int needSolverPass = measuredHeight | a(measurer, widget, true);
                    int measuredWidth2 = widget.P();
                    int measuredHeight2 = widget.t();
                    if (measuredWidth2 != preWidth) {
                        widget.S0(measuredWidth2);
                        if (containerWrapWidth2) {
                            if (widget.I() > minWidth2) {
                                minWidth2 = Math.max(minWidth2, widget.I() + widget.k(d.a.RIGHT).e());
                            }
                        }
                        measuredWidth = 1;
                    } else {
                        measuredWidth = needSolverPass;
                    }
                    if (measuredHeight2 != preHeight) {
                        widget.t0(measuredHeight2);
                        if (containerWrapHeight && widget.n() > minHeight) {
                            minHeight = Math.max(minHeight, widget.n() + widget.k(d.a.BOTTOM).e());
                        }
                        measuredWidth = 1;
                    }
                    measuredHeight = ((k) widget).d1() | measuredWidth;
                }
                i3++;
                computations = computations;
                layoutTime2 = layoutTime2;
                optimizations3 = optimizations2;
            }
            layoutTime = layoutTime2;
            optimizations = optimizations3;
            int maxIterations2 = 2;
            int j = 0;
            while (true) {
                if (j >= maxIterations2) {
                    fVar = layout;
                    break;
                }
                int i4 = 0;
                while (i4 < sizeDependentWidgetsCount2) {
                    e widget2 = this.f634a.get(i4);
                    if ((!(widget2 instanceof h) || (widget2 instanceof k)) && !(widget2 instanceof g) && widget2.O() != 8 && ((!optimize4 || !widget2.f624d.f678e.j || !widget2.f625e.f678e.j) && !(widget2 instanceof k))) {
                        int preWidth2 = widget2.P();
                        int preHeight2 = widget2.t();
                        maxIterations = maxIterations2;
                        int preBaselineDistance = widget2.l();
                        sizeDependentWidgetsCount = sizeDependentWidgetsCount2;
                        measuredHeight |= a(measurer, widget2, true);
                        int measuredWidth3 = widget2.P();
                        optimize = optimize4;
                        int measuredHeight3 = widget2.t();
                        if (measuredWidth3 != preWidth2) {
                            widget2.S0(measuredWidth3);
                            if (!containerWrapWidth2) {
                                containerWrapWidth = containerWrapWidth2;
                            } else if (widget2.I() > minWidth2) {
                                containerWrapWidth = containerWrapWidth2;
                                minWidth2 = Math.max(minWidth2, widget2.I() + widget2.k(d.a.RIGHT).e());
                            } else {
                                containerWrapWidth = containerWrapWidth2;
                            }
                            measuredHeight = 1;
                        } else {
                            containerWrapWidth = containerWrapWidth2;
                        }
                        if (measuredHeight3 != preHeight2) {
                            widget2.t0(measuredHeight3);
                            if (containerWrapHeight && widget2.n() > minHeight) {
                                minHeight = Math.max(minHeight, widget2.n() + widget2.k(d.a.BOTTOM).e());
                            }
                            measuredHeight = 1;
                        }
                        if (widget2.S() && preBaselineDistance != widget2.l()) {
                            measuredHeight = 1;
                        }
                    } else {
                        maxIterations = maxIterations2;
                        sizeDependentWidgetsCount = sizeDependentWidgetsCount2;
                        containerWrapWidth = containerWrapWidth2;
                        optimize = optimize4;
                    }
                    i4++;
                    maxIterations2 = maxIterations;
                    sizeDependentWidgetsCount2 = sizeDependentWidgetsCount;
                    optimize4 = optimize;
                    containerWrapWidth2 = containerWrapWidth;
                }
                if (measuredHeight == 0) {
                    fVar = layout;
                    break;
                }
                c(layout, startingWidth, startingHeight);
                measuredHeight = 0;
                j++;
                maxIterations2 = maxIterations2;
                sizeDependentWidgetsCount2 = sizeDependentWidgetsCount2;
                optimize4 = optimize4;
                containerWrapWidth2 = containerWrapWidth2;
            }
            if (measuredHeight != 0) {
                c(fVar, startingWidth, startingHeight);
                boolean needSolverPass2 = false;
                if (layout.P() < minWidth2) {
                    fVar.S0(minWidth2);
                    needSolverPass2 = true;
                }
                if (layout.t() < minHeight) {
                    fVar.t0(minHeight);
                    needSolverPass2 = true;
                }
                if (needSolverPass2) {
                    c(fVar, startingWidth, startingHeight);
                }
            }
        } else {
            layoutTime = 0;
            optimizations = optimizations3;
        }
        fVar.D1(optimizations);
        return layoutTime;
    }

    public final boolean a(AbstractC0011b measurer, e widget, boolean useCurrentDimensions) {
        this.f635b.f637a = widget.w();
        this.f635b.f638b = widget.M();
        this.f635b.f639c = widget.P();
        this.f635b.f640d = widget.t();
        a aVar = this.f635b;
        aVar.i = false;
        aVar.j = useCurrentDimensions;
        boolean horizontalMatchConstraints = aVar.f637a == e.a.MATCH_CONSTRAINT;
        boolean verticalMatchConstraints = this.f635b.f638b == e.a.MATCH_CONSTRAINT;
        boolean horizontalUseRatio = horizontalMatchConstraints && widget.V > 0.0f;
        boolean verticalUseRatio = verticalMatchConstraints && widget.V > 0.0f;
        if (horizontalUseRatio && widget.q[0] == 4) {
            this.f635b.f637a = e.a.FIXED;
        }
        if (verticalUseRatio && widget.q[1] == 4) {
            this.f635b.f638b = e.a.FIXED;
        }
        ((ConstraintLayout.b) measurer).d(widget, this.f635b);
        widget.S0(this.f635b.f641e);
        widget.t0(this.f635b.f642f);
        widget.s0(this.f635b.h);
        widget.i0(this.f635b.f643g);
        a aVar2 = this.f635b;
        aVar2.j = false;
        return aVar2.i;
    }
}
