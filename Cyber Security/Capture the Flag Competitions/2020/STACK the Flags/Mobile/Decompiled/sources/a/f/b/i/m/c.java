package a.f.b.i.m;

import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.f;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends p {
    public ArrayList<p> k = new ArrayList<>();
    public int l;

    public c(e widget, int orientation) {
        super(widget);
        this.f679f = orientation;
        q();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f679f == 0 ? "horizontal : " : "vertical : ");
        String log = sb.toString();
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            log = ((log + "<") + it.next()) + "> ";
        }
        return log;
    }

    @Override // a.f.b.i.m.p
    public boolean m() {
        int count = this.k.size();
        for (int i = 0; i < count; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    @Override // a.f.b.i.m.p
    public long j() {
        int count = this.k.size();
        long wrapDimension = 0;
        for (int i = 0; i < count; i++) {
            p run = this.k.get(i);
            wrapDimension = wrapDimension + ((long) run.h.f656f) + run.j() + ((long) run.i.f656f);
        }
        return wrapDimension;
    }

    public final void q() {
        e current = this.f675b;
        e previous = current.H(this.f679f);
        while (previous != null) {
            current = previous;
            previous = current.H(this.f679f);
        }
        this.f675b = current;
        this.k.add(current.J(this.f679f));
        e next = current.F(this.f679f);
        while (next != null) {
            this.k.add(next.J(this.f679f));
            next = next.F(this.f679f);
        }
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            p run = it.next();
            int i = this.f679f;
            if (i == 0) {
                run.f675b.f622b = this;
            } else if (i == 1) {
                run.f675b.f623c = this;
            }
        }
        if ((this.f679f == 0 && ((f) this.f675b.G()).w1()) && this.k.size() > 1) {
            ArrayList<p> arrayList = this.k;
            this.f675b = arrayList.get(arrayList.size() - 1).f675b;
        }
        this.l = this.f679f == 0 ? this.f675b.v() : this.f675b.L();
    }

    @Override // a.f.b.i.m.p
    public void f() {
        this.f676c = null;
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    /* JADX INFO: Multiple debug info for r4v16 int: [D('max' int), D('size' int)] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    @Override // a.f.b.i.m.d, a.f.b.i.m.p
    public void a(d dependency) {
        int i;
        boolean isInRtl;
        int position;
        int i2;
        float bias;
        int position2;
        float bias2;
        int numVisibleWidgets;
        int gap;
        int position3;
        int gap2;
        int matchConstraintsDimension;
        float weights;
        boolean isInRtl2;
        int size;
        int value;
        e parent;
        boolean treatAsFixed;
        boolean treatAsFixed2;
        c cVar = this;
        if (cVar.h.j && cVar.i.j) {
            e parent2 = cVar.f675b.G();
            boolean isInRtl3 = false;
            if (parent2 != null && (parent2 instanceof f)) {
                isInRtl3 = ((f) parent2).w1();
            }
            int distance = cVar.i.f657g - cVar.h.f657g;
            int size2 = 0;
            int numMatchConstraints = 0;
            float weights2 = 0.0f;
            int numVisibleWidgets2 = 0;
            int count = cVar.k.size();
            int firstVisibleWidget = -1;
            int i3 = 0;
            while (true) {
                i = 8;
                if (i3 >= count) {
                    break;
                }
                if (cVar.k.get(i3).f675b.O() != 8) {
                    firstVisibleWidget = i3;
                    break;
                }
                i3++;
            }
            int lastVisibleWidget = -1;
            int i4 = count - 1;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                if (cVar.k.get(i4).f675b.O() != 8) {
                    lastVisibleWidget = i4;
                    break;
                }
                i4--;
            }
            int j = 0;
            while (true) {
                if (j >= 2) {
                    break;
                }
                int i5 = 0;
                while (i5 < count) {
                    p run = cVar.k.get(i5);
                    if (run.f675b.O() == i) {
                        parent = parent2;
                    } else {
                        numVisibleWidgets2++;
                        if (i5 > 0 && i5 >= firstVisibleWidget) {
                            size2 += run.h.f656f;
                        }
                        int dimension = run.f678e.f657g;
                        parent = parent2;
                        boolean treatAsFixed3 = run.f677d != e.a.MATCH_CONSTRAINT;
                        if (!treatAsFixed3) {
                            treatAsFixed2 = treatAsFixed3;
                            if (run.f674a == 1 && j == 0) {
                                treatAsFixed = true;
                                dimension = run.f678e.m;
                                numMatchConstraints++;
                                if (!treatAsFixed) {
                                }
                                size2 += -run.i.f656f;
                            } else if (run.f678e.j) {
                                treatAsFixed = true;
                                if (!treatAsFixed) {
                                    numMatchConstraints++;
                                    float weight = run.f675b.k0[cVar.f679f];
                                    if (weight >= 0.0f) {
                                        weights2 += weight;
                                    }
                                } else {
                                    size2 += dimension;
                                }
                                if (i5 < count - 1 && i5 < lastVisibleWidget) {
                                    size2 += -run.i.f656f;
                                }
                            }
                        } else if (cVar.f679f != 0 || run.f675b.f624d.f678e.j) {
                            treatAsFixed2 = treatAsFixed3;
                            if (cVar.f679f == 1 && !run.f675b.f625e.f678e.j) {
                                return;
                            }
                        } else {
                            return;
                        }
                        treatAsFixed = treatAsFixed2;
                        if (!treatAsFixed) {
                        }
                        size2 += -run.i.f656f;
                    }
                    i5++;
                    parent2 = parent;
                    i = 8;
                }
                if (size2 < distance || numMatchConstraints == 0) {
                    break;
                }
                numVisibleWidgets2 = 0;
                numMatchConstraints = 0;
                size2 = 0;
                weights2 = 0.0f;
                j++;
                parent2 = parent2;
                i = 8;
            }
            int position4 = cVar.h.f657g;
            if (isInRtl3) {
                position4 = cVar.i.f657g;
            }
            if (size2 > distance) {
                if (isInRtl3) {
                    position4 += (int) ((((float) (size2 - distance)) / 2.0f) + 0.5f);
                } else {
                    position4 -= (int) ((((float) (size2 - distance)) / 2.0f) + 0.5f);
                }
            }
            if (numMatchConstraints > 0) {
                int matchConstraintsDimension2 = (int) ((((float) (distance - size2)) / ((float) numMatchConstraints)) + 0.5f);
                int appliedLimits = 0;
                int i6 = 0;
                while (i6 < count) {
                    p run2 = cVar.k.get(i6);
                    if (run2.f675b.O() == 8) {
                        isInRtl2 = isInRtl3;
                        size = size2;
                        weights = weights2;
                        matchConstraintsDimension = matchConstraintsDimension2;
                    } else if (run2.f677d != e.a.MATCH_CONSTRAINT || run2.f678e.j) {
                        isInRtl2 = isInRtl3;
                        size = size2;
                        weights = weights2;
                        matchConstraintsDimension = matchConstraintsDimension2;
                    } else {
                        int dimension2 = matchConstraintsDimension2;
                        if (weights2 > 0.0f) {
                            dimension2 = (int) (((((float) (distance - size2)) * run2.f675b.k0[cVar.f679f]) / weights2) + 0.5f);
                        }
                        if (cVar.f679f == 0) {
                            e eVar = run2.f675b;
                            size = size2;
                            int size3 = eVar.s;
                            int min = eVar.r;
                            weights = weights2;
                            matchConstraintsDimension = matchConstraintsDimension2;
                            if (run2.f674a == 1) {
                                value = Math.min(dimension2, run2.f678e.m);
                            } else {
                                value = dimension2;
                            }
                            int value2 = Math.max(min, value);
                            if (size3 > 0) {
                                value2 = Math.min(size3, value2);
                            }
                            if (value2 != dimension2) {
                                appliedLimits++;
                                dimension2 = value2;
                            }
                            isInRtl2 = isInRtl3;
                        } else {
                            size = size2;
                            weights = weights2;
                            matchConstraintsDimension = matchConstraintsDimension2;
                            e eVar2 = run2.f675b;
                            int max = eVar2.v;
                            int min2 = eVar2.u;
                            int value3 = dimension2;
                            isInRtl2 = isInRtl3;
                            if (run2.f674a == 1) {
                                value3 = Math.min(value3, run2.f678e.m);
                            }
                            int value4 = Math.max(min2, value3);
                            if (max > 0) {
                                value4 = Math.min(max, value4);
                            }
                            if (value4 != dimension2) {
                                appliedLimits++;
                                dimension2 = value4;
                            }
                        }
                        run2.f678e.d(dimension2);
                    }
                    i6++;
                    position4 = position4;
                    size2 = size;
                    isInRtl3 = isInRtl2;
                    weights2 = weights;
                    matchConstraintsDimension2 = matchConstraintsDimension;
                }
                position = position4;
                isInRtl = isInRtl3;
                if (appliedLimits > 0) {
                    numMatchConstraints -= appliedLimits;
                    int size4 = 0;
                    for (int i7 = 0; i7 < count; i7++) {
                        p run3 = cVar.k.get(i7);
                        if (run3.f675b.O() != 8) {
                            if (i7 > 0 && i7 >= firstVisibleWidget) {
                                size4 += run3.h.f656f;
                            }
                            size4 += run3.f678e.f657g;
                            if (i7 < count - 1 && i7 < lastVisibleWidget) {
                                size4 += -run3.i.f656f;
                            }
                        }
                    }
                    size2 = size4;
                } else {
                    size2 = size2;
                }
                if (cVar.l == 2 && appliedLimits == 0) {
                    cVar.l = 0;
                }
            } else {
                position = position4;
                isInRtl = isInRtl3;
            }
            if (size2 > distance) {
                i2 = 2;
                cVar.l = 2;
            } else {
                i2 = 2;
            }
            if (numVisibleWidgets2 > 0 && numMatchConstraints == 0 && firstVisibleWidget == lastVisibleWidget) {
                cVar.l = i2;
            }
            int i8 = cVar.l;
            if (i8 == 1) {
                int gap3 = 0;
                if (numVisibleWidgets2 > 1) {
                    gap3 = (distance - size2) / (numVisibleWidgets2 - 1);
                } else if (numVisibleWidgets2 == 1) {
                    gap3 = (distance - size2) / 2;
                }
                if (numMatchConstraints > 0) {
                    gap3 = 0;
                }
                int i9 = 0;
                int position5 = position;
                while (i9 < count) {
                    int index = i9;
                    if (isInRtl) {
                        index = count - (i9 + 1);
                    }
                    p run4 = cVar.k.get(index);
                    if (run4.f675b.O() == 8) {
                        run4.h.d(position5);
                        run4.i.d(position5);
                        gap2 = gap3;
                    } else {
                        if (i9 > 0) {
                            if (isInRtl) {
                                position5 -= gap3;
                            } else {
                                position5 += gap3;
                            }
                        }
                        if (i9 > 0 && i9 >= firstVisibleWidget) {
                            if (isInRtl) {
                                position5 -= run4.h.f656f;
                            } else {
                                position5 += run4.h.f656f;
                            }
                        }
                        if (isInRtl) {
                            run4.i.d(position5);
                        } else {
                            run4.h.d(position5);
                        }
                        g gVar = run4.f678e;
                        int dimension3 = gVar.f657g;
                        gap2 = gap3;
                        if (run4.f677d == e.a.MATCH_CONSTRAINT && run4.f674a == 1) {
                            dimension3 = gVar.m;
                        }
                        if (isInRtl) {
                            position5 -= dimension3;
                        } else {
                            position5 += dimension3;
                        }
                        if (isInRtl) {
                            run4.h.d(position5);
                        } else {
                            run4.i.d(position5);
                        }
                        run4.f680g = true;
                        if (i9 < count - 1 && i9 < lastVisibleWidget) {
                            if (isInRtl) {
                                position5 -= -run4.i.f656f;
                            } else {
                                position5 += -run4.i.f656f;
                            }
                        }
                    }
                    i9++;
                    gap3 = gap2;
                }
            } else if (i8 == 0) {
                int gap4 = (distance - size2) / (numVisibleWidgets2 + 1);
                if (numMatchConstraints > 0) {
                    gap4 = 0;
                }
                int i10 = 0;
                int position6 = position;
                while (i10 < count) {
                    int index2 = i10;
                    if (isInRtl) {
                        index2 = count - (i10 + 1);
                    }
                    p run5 = cVar.k.get(index2);
                    if (run5.f675b.O() == 8) {
                        run5.h.d(position6);
                        run5.i.d(position6);
                        gap = gap4;
                        numVisibleWidgets = numVisibleWidgets2;
                    } else {
                        if (isInRtl) {
                            position3 = position6 - gap4;
                        } else {
                            position3 = position6 + gap4;
                        }
                        if (i10 > 0 && i10 >= firstVisibleWidget) {
                            if (isInRtl) {
                                position3 -= run5.h.f656f;
                            } else {
                                position3 += run5.h.f656f;
                            }
                        }
                        if (isInRtl) {
                            run5.i.d(position3);
                        } else {
                            run5.h.d(position3);
                        }
                        g gVar2 = run5.f678e;
                        int dimension4 = gVar2.f657g;
                        gap = gap4;
                        numVisibleWidgets = numVisibleWidgets2;
                        if (run5.f677d == e.a.MATCH_CONSTRAINT && run5.f674a == 1) {
                            dimension4 = Math.min(dimension4, gVar2.m);
                        }
                        if (isInRtl) {
                            position6 = position3 - dimension4;
                        } else {
                            position6 = position3 + dimension4;
                        }
                        if (isInRtl) {
                            run5.h.d(position6);
                        } else {
                            run5.i.d(position6);
                        }
                        if (i10 < count - 1 && i10 < lastVisibleWidget) {
                            if (isInRtl) {
                                position6 -= -run5.i.f656f;
                            } else {
                                position6 += -run5.i.f656f;
                            }
                        }
                    }
                    i10++;
                    gap4 = gap;
                    numVisibleWidgets2 = numVisibleWidgets;
                }
            } else if (i8 == 2) {
                if (cVar.f679f == 0) {
                    bias = cVar.f675b.u();
                } else {
                    bias = cVar.f675b.K();
                }
                if (isInRtl) {
                    bias = 1.0f - bias;
                }
                int gap5 = (int) ((((float) (distance - size2)) * bias) + 0.5f);
                if (gap5 < 0 || numMatchConstraints > 0) {
                    gap5 = 0;
                }
                if (isInRtl) {
                    position2 = position - gap5;
                } else {
                    position2 = position + gap5;
                }
                int i11 = 0;
                while (i11 < count) {
                    int index3 = i11;
                    if (isInRtl) {
                        index3 = count - (i11 + 1);
                    }
                    p run6 = cVar.k.get(index3);
                    if (run6.f675b.O() == 8) {
                        run6.h.d(position2);
                        run6.i.d(position2);
                        bias2 = bias;
                    } else {
                        if (i11 > 0 && i11 >= firstVisibleWidget) {
                            if (isInRtl) {
                                position2 -= run6.h.f656f;
                            } else {
                                position2 += run6.h.f656f;
                            }
                        }
                        if (isInRtl) {
                            run6.i.d(position2);
                        } else {
                            run6.h.d(position2);
                        }
                        g gVar3 = run6.f678e;
                        int dimension5 = gVar3.f657g;
                        bias2 = bias;
                        if (run6.f677d == e.a.MATCH_CONSTRAINT) {
                            if (run6.f674a == 1) {
                                dimension5 = gVar3.m;
                            }
                        }
                        if (isInRtl) {
                            position2 -= dimension5;
                        } else {
                            position2 += dimension5;
                        }
                        if (isInRtl) {
                            run6.h.d(position2);
                        } else {
                            run6.i.d(position2);
                        }
                        if (i11 < count - 1 && i11 < lastVisibleWidget) {
                            if (isInRtl) {
                                position2 -= -run6.i.f656f;
                            } else {
                                position2 += -run6.i.f656f;
                            }
                        }
                    }
                    i11++;
                    cVar = this;
                    bias = bias2;
                }
            }
        }
    }

    @Override // a.f.b.i.m.p
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    public final e r() {
        for (int i = 0; i < this.k.size(); i++) {
            p run = this.k.get(i);
            if (run.f675b.O() != 8) {
                return run.f675b;
            }
        }
        return null;
    }

    public final e s() {
        for (int i = this.k.size() - 1; i >= 0; i--) {
            p run = this.k.get(i);
            if (run.f675b.O() != 8) {
                return run.f675b;
            }
        }
        return null;
    }

    @Override // a.f.b.i.m.p
    public void d() {
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int count = this.k.size();
        if (count >= 1) {
            e firstWidget = this.k.get(0).f675b;
            e lastWidget = this.k.get(count - 1).f675b;
            if (this.f679f == 0) {
                d startAnchor = firstWidget.G;
                d endAnchor = lastWidget.I;
                f startTarget = i(startAnchor, 0);
                int startMargin = startAnchor.e();
                e firstVisibleWidget = r();
                if (firstVisibleWidget != null) {
                    startMargin = firstVisibleWidget.G.e();
                }
                if (startTarget != null) {
                    b(this.h, startTarget, startMargin);
                }
                f endTarget = i(endAnchor, 0);
                int endMargin = endAnchor.e();
                e lastVisibleWidget = s();
                if (lastVisibleWidget != null) {
                    endMargin = lastVisibleWidget.I.e();
                }
                if (endTarget != null) {
                    b(this.i, endTarget, -endMargin);
                }
            } else {
                d startAnchor2 = firstWidget.H;
                d endAnchor2 = lastWidget.J;
                f startTarget2 = i(startAnchor2, 1);
                int startMargin2 = startAnchor2.e();
                e firstVisibleWidget2 = r();
                if (firstVisibleWidget2 != null) {
                    startMargin2 = firstVisibleWidget2.H.e();
                }
                if (startTarget2 != null) {
                    b(this.h, startTarget2, startMargin2);
                }
                f endTarget2 = i(endAnchor2, 1);
                int endMargin2 = endAnchor2.e();
                e lastVisibleWidget2 = s();
                if (lastVisibleWidget2 != null) {
                    endMargin2 = lastVisibleWidget2.J.e();
                }
                if (endTarget2 != null) {
                    b(this.i, endTarget2, -endMargin2);
                }
            }
            this.h.f651a = this;
            this.i.f651a = this;
        }
    }
}
