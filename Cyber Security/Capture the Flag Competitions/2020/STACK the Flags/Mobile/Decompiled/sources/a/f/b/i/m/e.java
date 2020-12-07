package a.f.b.i.m;

import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.f;
import a.f.b.i.g;
import a.f.b.i.i;
import a.f.b.i.m.b;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public f f644a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f645b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f646c = true;

    /* renamed from: d  reason: collision with root package name */
    public f f647d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f648e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.AbstractC0011b f649f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f650g;
    public ArrayList<m> h;

    public e(f container) {
        new ArrayList();
        this.f649f = null;
        this.f650g = new b.a();
        this.h = new ArrayList<>();
        this.f644a = container;
        this.f647d = container;
    }

    public void n(b.AbstractC0011b measurer) {
        this.f649f = measurer;
    }

    public final int e(f container, int orientation) {
        int count = this.h.size();
        long wrapSize = 0;
        for (int i = 0; i < count; i++) {
            wrapSize = Math.max(wrapSize, this.h.get(i).b(container, orientation));
        }
        return (int) wrapSize;
    }

    public boolean f(boolean optimizeWrap) {
        boolean optimizeWrap2 = optimizeWrap & true;
        if (this.f645b || this.f646c) {
            Iterator<a.f.b.i.e> it = this.f644a.q0.iterator();
            while (it.hasNext()) {
                a.f.b.i.e widget = it.next();
                widget.j();
                widget.f621a = false;
                widget.f624d.r();
                widget.f625e.q();
            }
            this.f644a.j();
            f fVar = this.f644a;
            fVar.f621a = false;
            fVar.f624d.r();
            this.f644a.f625e.q();
            this.f646c = false;
        }
        b(this.f647d);
        if (0 != 0) {
            return false;
        }
        this.f644a.T0(0);
        this.f644a.U0(0);
        e.a originalHorizontalDimension = this.f644a.q(0);
        e.a originalVerticalDimension = this.f644a.q(1);
        if (this.f645b) {
            c();
        }
        int x1 = this.f644a.Q();
        int y1 = this.f644a.R();
        this.f644a.f624d.h.d(x1);
        this.f644a.f625e.h.d(y1);
        m();
        e.a aVar = e.a.WRAP_CONTENT;
        if (originalHorizontalDimension == aVar || originalVerticalDimension == aVar) {
            if (optimizeWrap2) {
                Iterator<p> it2 = this.f648e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().m()) {
                            optimizeWrap2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (optimizeWrap2 && originalHorizontalDimension == e.a.WRAP_CONTENT) {
                this.f644a.x0(e.a.FIXED);
                f fVar2 = this.f644a;
                fVar2.S0(e(fVar2, 0));
                f fVar3 = this.f644a;
                fVar3.f624d.f678e.d(fVar3.P());
            }
            if (optimizeWrap2 && originalVerticalDimension == e.a.WRAP_CONTENT) {
                this.f644a.O0(e.a.FIXED);
                f fVar4 = this.f644a;
                fVar4.t0(e(fVar4, 1));
                f fVar5 = this.f644a;
                fVar5.f625e.f678e.d(fVar5.t());
            }
        }
        boolean checkRoot = false;
        e.a[] aVarArr = this.f644a.R;
        if (aVarArr[0] == e.a.FIXED || aVarArr[0] == e.a.MATCH_PARENT) {
            int x2 = this.f644a.P() + x1;
            this.f644a.f624d.i.d(x2);
            this.f644a.f624d.f678e.d(x2 - x1);
            m();
            e.a[] aVarArr2 = this.f644a.R;
            if (aVarArr2[1] == e.a.FIXED || aVarArr2[1] == e.a.MATCH_PARENT) {
                int y2 = this.f644a.t() + y1;
                this.f644a.f625e.i.d(y2);
                this.f644a.f625e.f678e.d(y2 - y1);
            }
            m();
            checkRoot = true;
        }
        Iterator<p> it3 = this.f648e.iterator();
        while (it3.hasNext()) {
            p run = it3.next();
            if (run.f675b != this.f644a || run.f680g) {
                run.e();
            }
        }
        boolean allResolved = true;
        Iterator<p> it4 = this.f648e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            p run2 = it4.next();
            if (checkRoot || run2.f675b != this.f644a) {
                if (run2.h.j) {
                    if (run2.i.j || (run2 instanceof j)) {
                        if (!run2.f678e.j && !(run2 instanceof c) && !(run2 instanceof j)) {
                            allResolved = false;
                            break;
                        }
                    } else {
                        allResolved = false;
                        break;
                    }
                } else {
                    allResolved = false;
                    break;
                }
            }
        }
        this.f644a.x0(originalHorizontalDimension);
        this.f644a.O0(originalVerticalDimension);
        return allResolved;
    }

    public boolean g() {
        if (this.f645b) {
            Iterator<a.f.b.i.e> it = this.f644a.q0.iterator();
            while (it.hasNext()) {
                a.f.b.i.e widget = it.next();
                widget.j();
                widget.f621a = false;
                l lVar = widget.f624d;
                lVar.f678e.j = false;
                lVar.f680g = false;
                lVar.r();
                n nVar = widget.f625e;
                nVar.f678e.j = false;
                nVar.f680g = false;
                nVar.q();
            }
            this.f644a.j();
            f fVar = this.f644a;
            fVar.f621a = false;
            l lVar2 = fVar.f624d;
            lVar2.f678e.j = false;
            lVar2.f680g = false;
            lVar2.r();
            n nVar2 = this.f644a.f625e;
            nVar2.f678e.j = false;
            nVar2.f680g = false;
            nVar2.q();
            c();
        }
        b(this.f647d);
        if (0 != 0) {
            return false;
        }
        this.f644a.T0(0);
        this.f644a.U0(0);
        this.f644a.f624d.h.d(0);
        this.f644a.f625e.h.d(0);
        return true;
    }

    public boolean h(boolean optimizeWrap, int orientation) {
        e.a aVar;
        boolean optimizeWrap2 = optimizeWrap & true;
        e.a originalHorizontalDimension = this.f644a.q(0);
        e.a originalVerticalDimension = this.f644a.q(1);
        int x1 = this.f644a.Q();
        int y1 = this.f644a.R();
        if (optimizeWrap2 && (originalHorizontalDimension == (aVar = e.a.WRAP_CONTENT) || originalVerticalDimension == aVar)) {
            Iterator<p> it = this.f648e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p run = it.next();
                if (run.f679f == orientation && !run.m()) {
                    optimizeWrap2 = false;
                    break;
                }
            }
            if (orientation == 0) {
                if (optimizeWrap2 && originalHorizontalDimension == e.a.WRAP_CONTENT) {
                    this.f644a.x0(e.a.FIXED);
                    f fVar = this.f644a;
                    fVar.S0(e(fVar, 0));
                    f fVar2 = this.f644a;
                    fVar2.f624d.f678e.d(fVar2.P());
                }
            } else if (optimizeWrap2 && originalVerticalDimension == e.a.WRAP_CONTENT) {
                this.f644a.O0(e.a.FIXED);
                f fVar3 = this.f644a;
                fVar3.t0(e(fVar3, 1));
                f fVar4 = this.f644a;
                fVar4.f625e.f678e.d(fVar4.t());
            }
        }
        boolean checkRoot = false;
        if (orientation == 0) {
            e.a[] aVarArr = this.f644a.R;
            if (aVarArr[0] == e.a.FIXED || aVarArr[0] == e.a.MATCH_PARENT) {
                int x2 = this.f644a.P() + x1;
                this.f644a.f624d.i.d(x2);
                this.f644a.f624d.f678e.d(x2 - x1);
                checkRoot = true;
            }
        } else {
            e.a[] aVarArr2 = this.f644a.R;
            if (aVarArr2[1] == e.a.FIXED || aVarArr2[1] == e.a.MATCH_PARENT) {
                int y2 = this.f644a.t() + y1;
                this.f644a.f625e.i.d(y2);
                this.f644a.f625e.f678e.d(y2 - y1);
                checkRoot = true;
            }
        }
        m();
        Iterator<p> it2 = this.f648e.iterator();
        while (it2.hasNext()) {
            p run2 = it2.next();
            if (run2.f679f == orientation && (run2.f675b != this.f644a || run2.f680g)) {
                run2.e();
            }
        }
        boolean allResolved = true;
        Iterator<p> it3 = this.f648e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            p run3 = it3.next();
            if (run3.f679f == orientation && (checkRoot || run3.f675b != this.f644a)) {
                if (run3.h.j) {
                    if (run3.i.j) {
                        if (!(run3 instanceof c) && !run3.f678e.j) {
                            allResolved = false;
                            break;
                        }
                    } else {
                        allResolved = false;
                        break;
                    }
                } else {
                    allResolved = false;
                    break;
                }
            }
        }
        this.f644a.x0(originalHorizontalDimension);
        this.f644a.O0(originalVerticalDimension);
        return allResolved;
    }

    public final void l(a.f.b.i.e widget, e.a horizontalBehavior, int horizontalDimension, e.a verticalBehavior, int verticalDimension) {
        b.a aVar = this.f650g;
        aVar.f637a = horizontalBehavior;
        aVar.f638b = verticalBehavior;
        aVar.f639c = horizontalDimension;
        aVar.f640d = verticalDimension;
        ((ConstraintLayout.b) this.f649f).d(widget, aVar);
        widget.S0(this.f650g.f641e);
        widget.t0(this.f650g.f642f);
        widget.s0(this.f650g.h);
        widget.i0(this.f650g.f643g);
    }

    public final boolean b(f constraintWidgetContainer) {
        e.a horiz;
        e.a vert;
        int i;
        e.a[] aVarArr;
        e.a aVar;
        Iterator<a.f.b.i.e> it = constraintWidgetContainer.q0.iterator();
        while (it.hasNext()) {
            a.f.b.i.e widget = it.next();
            e.a[] aVarArr2 = widget.R;
            e.a horiz2 = aVarArr2[0];
            e.a vert2 = aVarArr2[1];
            if (widget.O() == 8) {
                widget.f621a = true;
            } else {
                if (widget.t < 1.0f && horiz2 == e.a.MATCH_CONSTRAINT) {
                    widget.o = 2;
                }
                if (widget.w < 1.0f && vert2 == e.a.MATCH_CONSTRAINT) {
                    widget.p = 2;
                }
                if (widget.r() > 0.0f) {
                    if (horiz2 == e.a.MATCH_CONSTRAINT && (vert2 == e.a.WRAP_CONTENT || vert2 == e.a.FIXED)) {
                        widget.o = 3;
                    } else if (vert2 == e.a.MATCH_CONSTRAINT && (horiz2 == e.a.WRAP_CONTENT || horiz2 == e.a.FIXED)) {
                        widget.p = 3;
                    } else {
                        e.a aVar2 = e.a.MATCH_CONSTRAINT;
                        if (horiz2 == aVar2 && vert2 == aVar2) {
                            if (widget.o == 0) {
                                widget.o = 3;
                            }
                            if (widget.p == 0) {
                                widget.p = 3;
                            }
                        }
                    }
                }
                if (horiz2 == e.a.MATCH_CONSTRAINT && widget.o == 1 && (widget.G.f613f == null || widget.I.f613f == null)) {
                    horiz = e.a.WRAP_CONTENT;
                } else {
                    horiz = horiz2;
                }
                if (vert2 == e.a.MATCH_CONSTRAINT && widget.p == 1 && (widget.H.f613f == null || widget.J.f613f == null)) {
                    vert = e.a.WRAP_CONTENT;
                } else {
                    vert = vert2;
                }
                l lVar = widget.f624d;
                lVar.f677d = horiz;
                lVar.f674a = widget.o;
                n nVar = widget.f625e;
                nVar.f677d = vert;
                nVar.f674a = widget.p;
                if ((horiz == e.a.MATCH_PARENT || horiz == e.a.FIXED || horiz == e.a.WRAP_CONTENT) && (vert == e.a.MATCH_PARENT || vert == e.a.FIXED || vert == e.a.WRAP_CONTENT)) {
                    int width = widget.P();
                    if (horiz == e.a.MATCH_PARENT) {
                        width = (constraintWidgetContainer.P() - widget.G.f614g) - widget.I.f614g;
                        horiz = e.a.FIXED;
                    }
                    int height = widget.t();
                    if (vert == e.a.MATCH_PARENT) {
                        height = (constraintWidgetContainer.t() - widget.H.f614g) - widget.J.f614g;
                        vert = e.a.FIXED;
                    }
                    l(widget, horiz, width, vert, height);
                    widget.f624d.f678e.d(widget.P());
                    widget.f625e.f678e.d(widget.t());
                    widget.f621a = true;
                } else {
                    if (horiz == e.a.MATCH_CONSTRAINT && (vert == e.a.WRAP_CONTENT || vert == e.a.FIXED)) {
                        int i2 = widget.o;
                        if (i2 == 3) {
                            e.a aVar3 = e.a.WRAP_CONTENT;
                            if (vert == aVar3) {
                                l(widget, aVar3, 0, aVar3, 0);
                            }
                            int height2 = widget.t();
                            e.a aVar4 = e.a.FIXED;
                            l(widget, aVar4, (int) ((((float) height2) * widget.V) + 0.5f), aVar4, height2);
                            widget.f624d.f678e.d(widget.P());
                            widget.f625e.f678e.d(widget.t());
                            widget.f621a = true;
                        } else if (i2 == 1) {
                            l(widget, e.a.WRAP_CONTENT, 0, vert, 0);
                            widget.f624d.f678e.m = widget.P();
                        } else if (i2 == 2) {
                            e.a[] aVarArr3 = constraintWidgetContainer.R;
                            if (aVarArr3[0] == e.a.FIXED || aVarArr3[0] == e.a.MATCH_PARENT) {
                                float percent = widget.t;
                                l(widget, e.a.FIXED, (int) ((((float) constraintWidgetContainer.P()) * percent) + 0.5f), vert, widget.t());
                                widget.f624d.f678e.d(widget.P());
                                widget.f625e.f678e.d(widget.t());
                                widget.f621a = true;
                            }
                        } else {
                            d[] dVarArr = widget.O;
                            if (dVarArr[0].f613f == null || dVarArr[1].f613f == null) {
                                l(widget, e.a.WRAP_CONTENT, 0, vert, 0);
                                widget.f624d.f678e.d(widget.P());
                                widget.f625e.f678e.d(widget.t());
                                widget.f621a = true;
                            }
                        }
                    }
                    if (vert == e.a.MATCH_CONSTRAINT && (horiz == e.a.WRAP_CONTENT || horiz == e.a.FIXED)) {
                        int i3 = widget.p;
                        if (i3 == 3) {
                            e.a aVar5 = e.a.WRAP_CONTENT;
                            if (horiz == aVar5) {
                                l(widget, aVar5, 0, aVar5, 0);
                            }
                            int width2 = widget.P();
                            float ratio = widget.V;
                            if (widget.s() == -1) {
                                ratio = 1.0f / ratio;
                            }
                            e.a aVar6 = e.a.FIXED;
                            l(widget, aVar6, width2, aVar6, (int) ((((float) width2) * ratio) + 0.5f));
                            widget.f624d.f678e.d(widget.P());
                            widget.f625e.f678e.d(widget.t());
                            widget.f621a = true;
                        } else if (i3 == 1) {
                            l(widget, horiz, 0, e.a.WRAP_CONTENT, 0);
                            widget.f625e.f678e.m = widget.t();
                        } else if (i3 == 2) {
                            e.a[] aVarArr4 = constraintWidgetContainer.R;
                            if (aVarArr4[1] == e.a.FIXED || aVarArr4[1] == e.a.MATCH_PARENT) {
                                l(widget, horiz, widget.P(), e.a.FIXED, (int) ((((float) constraintWidgetContainer.t()) * widget.w) + 0.5f));
                                widget.f624d.f678e.d(widget.P());
                                widget.f625e.f678e.d(widget.t());
                                widget.f621a = true;
                            }
                        } else {
                            d[] dVarArr2 = widget.O;
                            if (dVarArr2[2].f613f == null || dVarArr2[3].f613f == null) {
                                l(widget, e.a.WRAP_CONTENT, 0, vert, 0);
                                widget.f624d.f678e.d(widget.P());
                                widget.f625e.f678e.d(widget.t());
                                widget.f621a = true;
                            }
                        }
                    }
                    e.a aVar7 = e.a.MATCH_CONSTRAINT;
                    if (horiz == aVar7 && vert == aVar7) {
                        int i4 = widget.o;
                        if (i4 == 1 || (i = widget.p) == 1) {
                            e.a aVar8 = e.a.WRAP_CONTENT;
                            l(widget, aVar8, 0, aVar8, 0);
                            widget.f624d.f678e.m = widget.P();
                            widget.f625e.f678e.m = widget.t();
                        } else if (i == 2 && i4 == 2) {
                            e.a[] aVarArr5 = constraintWidgetContainer.R;
                            e.a aVar9 = aVarArr5[0];
                            e.a aVar10 = e.a.FIXED;
                            if ((aVar9 == aVar10 || aVarArr5[0] == aVar10) && ((aVarArr = constraintWidgetContainer.R)[1] == (aVar = e.a.FIXED) || aVarArr[1] == aVar)) {
                                float horizPercent = widget.t;
                                float vertPercent = widget.w;
                                e.a aVar11 = e.a.FIXED;
                                l(widget, aVar11, (int) ((((float) constraintWidgetContainer.P()) * horizPercent) + 0.5f), aVar11, (int) ((((float) constraintWidgetContainer.t()) * vertPercent) + 0.5f));
                                widget.f624d.f678e.d(widget.P());
                                widget.f625e.f678e.d(widget.t());
                                widget.f621a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void m() {
        g gVar;
        Iterator<a.f.b.i.e> it = this.f644a.q0.iterator();
        while (it.hasNext()) {
            a.f.b.i.e widget = it.next();
            if (!widget.f621a) {
                e.a[] aVarArr = widget.R;
                boolean vertWrap = false;
                e.a horiz = aVarArr[0];
                e.a vert = aVarArr[1];
                int horizMatchConstraintsType = widget.o;
                int vertMatchConstraintsType = widget.p;
                boolean horizWrap = horiz == e.a.WRAP_CONTENT || (horiz == e.a.MATCH_CONSTRAINT && horizMatchConstraintsType == 1);
                if (vert == e.a.WRAP_CONTENT || (vert == e.a.MATCH_CONSTRAINT && vertMatchConstraintsType == 1)) {
                    vertWrap = true;
                }
                g gVar2 = widget.f624d.f678e;
                boolean horizResolved = gVar2.j;
                g gVar3 = widget.f625e.f678e;
                boolean vertResolved = gVar3.j;
                if (horizResolved && vertResolved) {
                    e.a aVar = e.a.FIXED;
                    l(widget, aVar, gVar2.f657g, aVar, gVar3.f657g);
                    widget.f621a = true;
                } else if (horizResolved && vertWrap) {
                    l(widget, e.a.FIXED, widget.f624d.f678e.f657g, e.a.WRAP_CONTENT, widget.f625e.f678e.f657g);
                    if (vert == e.a.MATCH_CONSTRAINT) {
                        widget.f625e.f678e.m = widget.t();
                    } else {
                        widget.f625e.f678e.d(widget.t());
                        widget.f621a = true;
                    }
                } else if (vertResolved && horizWrap) {
                    l(widget, e.a.WRAP_CONTENT, widget.f624d.f678e.f657g, e.a.FIXED, widget.f625e.f678e.f657g);
                    if (horiz == e.a.MATCH_CONSTRAINT) {
                        widget.f624d.f678e.m = widget.P();
                    } else {
                        widget.f624d.f678e.d(widget.P());
                        widget.f621a = true;
                    }
                }
                if (widget.f621a && (gVar = widget.f625e.l) != null) {
                    gVar.d(widget.l());
                }
            }
        }
    }

    public void j() {
        this.f645b = true;
    }

    public void k() {
        this.f646c = true;
    }

    public void c() {
        d(this.f648e);
        this.h.clear();
        m.f665c = 0;
        i(this.f644a.f624d, 0, this.h);
        i(this.f644a.f625e, 1, this.h);
        this.f645b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f647d.f624d.f();
        this.f647d.f625e.f();
        arrayList.add(this.f647d.f624d);
        arrayList.add(this.f647d.f625e);
        HashSet<ChainRun> chainRuns = null;
        Iterator<a.f.b.i.e> it = this.f647d.q0.iterator();
        while (it.hasNext()) {
            a.f.b.i.e widget = it.next();
            if (widget instanceof g) {
                arrayList.add(new j(widget));
            } else {
                if (widget.X()) {
                    if (widget.f622b == null) {
                        widget.f622b = new c(widget, 0);
                    }
                    if (chainRuns == null) {
                        chainRuns = new HashSet<>();
                    }
                    chainRuns.add(widget.f622b);
                } else {
                    arrayList.add(widget.f624d);
                }
                if (widget.Z()) {
                    if (widget.f623c == null) {
                        widget.f623c = new c(widget, 1);
                    }
                    if (chainRuns == null) {
                        chainRuns = new HashSet<>();
                    }
                    chainRuns.add(widget.f623c);
                } else {
                    arrayList.add(widget.f625e);
                }
                if (widget instanceof i) {
                    arrayList.add(new k(widget));
                }
            }
        }
        if (chainRuns != null) {
            arrayList.addAll(chainRuns);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p run = it3.next();
            if (run.f675b != this.f647d) {
                run.d();
            }
        }
    }

    public final void a(f node, int orientation, int direction, f end, ArrayList<m> arrayList, m group) {
        m group2;
        p run = node.f654d;
        if (run.f676c == null) {
            f fVar = this.f644a;
            if (run != fVar.f624d) {
                if (run != fVar.f625e) {
                    if (group == null) {
                        m group3 = new m(run, direction);
                        arrayList.add(group3);
                        group2 = group3;
                    } else {
                        group2 = group;
                    }
                    run.f676c = group2;
                    group2.a(run);
                    for (d dependent : run.h.k) {
                        if (dependent instanceof f) {
                            a((f) dependent, orientation, 0, end, arrayList, group2);
                        }
                    }
                    for (d dependent2 : run.i.k) {
                        if (dependent2 instanceof f) {
                            a((f) dependent2, orientation, 1, end, arrayList, group2);
                        }
                    }
                    if (orientation == 1 && (run instanceof n)) {
                        for (d dependent3 : ((n) run).k.k) {
                            if (dependent3 instanceof f) {
                                a((f) dependent3, orientation, 2, end, arrayList, group2);
                            }
                        }
                    }
                    for (f target : run.h.l) {
                        if (target == end) {
                        }
                        a(target, orientation, 0, end, arrayList, group2);
                    }
                    for (f target2 : run.i.l) {
                        if (target2 == end) {
                        }
                        a(target2, orientation, 1, end, arrayList, group2);
                    }
                    if (orientation == 1 && (run instanceof n)) {
                        for (f target3 : ((n) run).k.l) {
                            a(target3, orientation, 2, end, arrayList, group2);
                        }
                    }
                }
            }
        }
    }

    public final void i(p run, int orientation, ArrayList<m> arrayList) {
        for (d dependent : run.h.k) {
            if (dependent instanceof f) {
                a((f) dependent, orientation, 0, run.i, arrayList, null);
            } else if (dependent instanceof p) {
                a(((p) dependent).h, orientation, 0, run.i, arrayList, null);
            }
        }
        for (d dependent2 : run.i.k) {
            if (dependent2 instanceof f) {
                a((f) dependent2, orientation, 1, run.h, arrayList, null);
            } else if (dependent2 instanceof p) {
                a(((p) dependent2).i, orientation, 1, run.h, arrayList, null);
            }
        }
        if (orientation == 1) {
            for (d dependent3 : ((n) run).k.k) {
                if (dependent3 instanceof f) {
                    a((f) dependent3, orientation, 2, null, arrayList, null);
                }
            }
        }
    }
}
