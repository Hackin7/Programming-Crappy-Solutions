package a.f.b.i.m;

import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.h;
import a.f.b.i.m.f;
import a.f.b.i.m.p;

public class n extends p {
    public f k;
    public g l = null;

    public n(e widget) {
        super(widget);
        f fVar = new f(this);
        this.k = fVar;
        this.h.f655e = f.a.TOP;
        this.i.f655e = f.a.BOTTOM;
        fVar.f655e = f.a.BASELINE;
        this.f679f = 1;
    }

    public String toString() {
        return "VerticalRun " + this.f675b.p();
    }

    @Override // a.f.b.i.m.p
    public void f() {
        this.f676c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.f678e.c();
        this.f680g = false;
    }

    public void q() {
        this.f680g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.f678e.j = false;
    }

    @Override // a.f.b.i.m.p
    public boolean m() {
        if (this.f677d != e.a.MATCH_CONSTRAINT || this.f675b.p == 0) {
            return true;
        }
        return false;
    }

    @Override // a.f.b.i.m.d, a.f.b.i.m.p
    public void a(d dependency) {
        int ordinal = this.j.ordinal();
        if (ordinal == 1) {
            p();
        } else if (ordinal == 2) {
            o();
        } else if (ordinal == 3) {
            e eVar = this.f675b;
            n(eVar.H, eVar.J, 1);
            return;
        }
        g gVar = this.f678e;
        if (gVar.f653c && !gVar.j && this.f677d == e.a.MATCH_CONSTRAINT) {
            e eVar2 = this.f675b;
            int i = eVar2.p;
            if (i == 2) {
                e parent = eVar2.G();
                if (parent != null) {
                    g gVar2 = parent.f625e.f678e;
                    if (gVar2.j) {
                        float percent = this.f675b.w;
                        this.f678e.d((int) ((((float) gVar2.f657g) * percent) + 0.5f));
                    }
                }
            } else if (i == 3 && eVar2.f624d.f678e.j) {
                int size = 0;
                int ratioSide = eVar2.s();
                if (ratioSide == -1) {
                    e eVar3 = this.f675b;
                    size = (int) ((((float) eVar3.f624d.f678e.f657g) / eVar3.r()) + 0.5f);
                } else if (ratioSide == 0) {
                    e eVar4 = this.f675b;
                    size = (int) ((((float) eVar4.f624d.f678e.f657g) * eVar4.r()) + 0.5f);
                } else if (ratioSide == 1) {
                    e eVar5 = this.f675b;
                    size = (int) ((((float) eVar5.f624d.f678e.f657g) / eVar5.r()) + 0.5f);
                }
                this.f678e.d(size);
            }
        }
        f fVar = this.h;
        if (fVar.f653c) {
            f fVar2 = this.i;
            if (fVar2.f653c) {
                if (!fVar.j || !fVar2.j || !this.f678e.j) {
                    if (!this.f678e.j && this.f677d == e.a.MATCH_CONSTRAINT) {
                        e eVar6 = this.f675b;
                        if (eVar6.o == 0 && !eVar6.Z()) {
                            int i2 = this.h.l.get(0).f657g;
                            f fVar3 = this.h;
                            int startPos = i2 + fVar3.f656f;
                            int endPos = this.i.l.get(0).f657g + this.i.f656f;
                            fVar3.d(startPos);
                            this.i.d(endPos);
                            this.f678e.d(endPos - startPos);
                            return;
                        }
                    }
                    if (!this.f678e.j && this.f677d == e.a.MATCH_CONSTRAINT && this.f674a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                        int availableSpace = (this.i.l.get(0).f657g + this.i.f656f) - (this.h.l.get(0).f657g + this.h.f656f);
                        g gVar3 = this.f678e;
                        int i3 = gVar3.m;
                        if (availableSpace < i3) {
                            gVar3.d(availableSpace);
                        } else {
                            gVar3.d(i3);
                        }
                    }
                    if (this.f678e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                        f startTarget = this.h.l.get(0);
                        f endTarget = this.i.l.get(0);
                        int startPos2 = startTarget.f657g + this.h.f656f;
                        int endPos2 = endTarget.f657g + this.i.f656f;
                        float bias = this.f675b.K();
                        if (startTarget == endTarget) {
                            startPos2 = startTarget.f657g;
                            endPos2 = endTarget.f657g;
                            bias = 0.5f;
                        }
                        this.h.d((int) (((float) startPos2) + 0.5f + (((float) ((endPos2 - startPos2) - this.f678e.f657g)) * bias)));
                        this.i.d(this.h.f657g + this.f678e.f657g);
                    }
                }
            }
        }
    }

    @Override // a.f.b.i.m.p
    public void d() {
        e parent;
        e parent2;
        e eVar = this.f675b;
        if (eVar.f621a) {
            this.f678e.d(eVar.t());
        }
        if (!this.f678e.j) {
            this.f677d = this.f675b.M();
            if (this.f675b.S()) {
                this.l = new a(this);
            }
            e.a aVar = this.f677d;
            if (aVar != e.a.MATCH_CONSTRAINT) {
                if (aVar == e.a.MATCH_PARENT && (parent2 = this.f675b.G()) != null && parent2.M() == e.a.FIXED) {
                    int resolvedDimension = (parent2.t() - this.f675b.H.e()) - this.f675b.J.e();
                    b(this.h, parent2.f625e.h, this.f675b.H.e());
                    b(this.i, parent2.f625e.i, -this.f675b.J.e());
                    this.f678e.d(resolvedDimension);
                    return;
                } else if (this.f677d == e.a.FIXED) {
                    this.f678e.d(this.f675b.t());
                }
            }
        } else if (this.f677d == e.a.MATCH_PARENT && (parent = this.f675b.G()) != null && parent.M() == e.a.FIXED) {
            b(this.h, parent.f625e.h, this.f675b.H.e());
            b(this.i, parent.f625e.i, -this.f675b.J.e());
            return;
        }
        if (this.f678e.j) {
            e eVar2 = this.f675b;
            if (eVar2.f621a) {
                d[] dVarArr = eVar2.O;
                if (dVarArr[2].f613f == null || dVarArr[3].f613f == null) {
                    e eVar3 = this.f675b;
                    d[] dVarArr2 = eVar3.O;
                    if (dVarArr2[2].f613f != null) {
                        f target = h(dVarArr2[2]);
                        if (target != null) {
                            b(this.h, target, this.f675b.O[2].e());
                            b(this.i, this.h, this.f678e.f657g);
                            if (this.f675b.S()) {
                                b(this.k, this.h, this.f675b.l());
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (dVarArr2[3].f613f != null) {
                        f target2 = h(dVarArr2[3]);
                        if (target2 != null) {
                            b(this.i, target2, -this.f675b.O[3].e());
                            b(this.h, this.i, -this.f678e.f657g);
                        }
                        if (this.f675b.S()) {
                            b(this.k, this.h, this.f675b.l());
                            return;
                        }
                        return;
                    } else if (dVarArr2[4].f613f != null) {
                        f target3 = h(dVarArr2[4]);
                        if (target3 != null) {
                            b(this.k, target3, 0);
                            b(this.h, this.k, -this.f675b.l());
                            b(this.i, this.h, this.f678e.f657g);
                            return;
                        }
                        return;
                    } else if (!(eVar3 instanceof h) && eVar3.G() != null && this.f675b.k(d.a.CENTER).f613f == null) {
                        b(this.h, this.f675b.G().f625e.h, this.f675b.R());
                        b(this.i, this.h, this.f678e.f657g);
                        if (this.f675b.S()) {
                            b(this.k, this.h, this.f675b.l());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    if (eVar2.Z()) {
                        this.h.f656f = this.f675b.O[2].e();
                        this.i.f656f = -this.f675b.O[3].e();
                    } else {
                        f startTarget = h(this.f675b.O[2]);
                        if (startTarget != null) {
                            b(this.h, startTarget, this.f675b.O[2].e());
                        }
                        f endTarget = h(this.f675b.O[3]);
                        if (endTarget != null) {
                            b(this.i, endTarget, -this.f675b.O[3].e());
                        }
                        this.h.f652b = true;
                        this.i.f652b = true;
                    }
                    if (this.f675b.S()) {
                        b(this.k, this.h, this.f675b.l());
                        return;
                    }
                    return;
                }
            }
        }
        if (this.f678e.j || this.f677d != e.a.MATCH_CONSTRAINT) {
            this.f678e.b(this);
        } else {
            e eVar4 = this.f675b;
            int i = eVar4.p;
            if (i == 2) {
                e parent3 = eVar4.G();
                if (parent3 != null) {
                    f targetDimension = parent3.f625e.f678e;
                    this.f678e.l.add(targetDimension);
                    targetDimension.k.add(this.f678e);
                    g gVar = this.f678e;
                    gVar.f652b = true;
                    gVar.k.add(this.h);
                    this.f678e.k.add(this.i);
                }
            } else if (i == 3 && !eVar4.Z()) {
                e eVar5 = this.f675b;
                if (eVar5.o != 3) {
                    f targetDimension2 = eVar5.f624d.f678e;
                    this.f678e.l.add(targetDimension2);
                    targetDimension2.k.add(this.f678e);
                    g gVar2 = this.f678e;
                    gVar2.f652b = true;
                    gVar2.k.add(this.h);
                    this.f678e.k.add(this.i);
                }
            }
        }
        e eVar6 = this.f675b;
        d[] dVarArr3 = eVar6.O;
        if (dVarArr3[2].f613f == null || dVarArr3[3].f613f == null) {
            e eVar7 = this.f675b;
            d[] dVarArr4 = eVar7.O;
            if (dVarArr4[2].f613f != null) {
                f target4 = h(dVarArr4[2]);
                if (target4 != null) {
                    b(this.h, target4, this.f675b.O[2].e());
                    c(this.i, this.h, 1, this.f678e);
                    if (this.f675b.S()) {
                        c(this.k, this.h, 1, this.l);
                    }
                    if (this.f677d == e.a.MATCH_CONSTRAINT && this.f675b.r() > 0.0f) {
                        l lVar = this.f675b.f624d;
                        if (lVar.f677d == e.a.MATCH_CONSTRAINT) {
                            lVar.f678e.k.add(this.f678e);
                            this.f678e.l.add(this.f675b.f624d.f678e);
                            this.f678e.f651a = this;
                        }
                    }
                }
            } else if (dVarArr4[3].f613f != null) {
                f target5 = h(dVarArr4[3]);
                if (target5 != null) {
                    b(this.i, target5, -this.f675b.O[3].e());
                    c(this.h, this.i, -1, this.f678e);
                    if (this.f675b.S()) {
                        c(this.k, this.h, 1, this.l);
                    }
                }
            } else if (dVarArr4[4].f613f != null) {
                f target6 = h(dVarArr4[4]);
                if (target6 != null) {
                    b(this.k, target6, 0);
                    c(this.h, this.k, -1, this.l);
                    c(this.i, this.h, 1, this.f678e);
                }
            } else if (!(eVar7 instanceof h) && eVar7.G() != null) {
                b(this.h, this.f675b.G().f625e.h, this.f675b.R());
                c(this.i, this.h, 1, this.f678e);
                if (this.f675b.S()) {
                    c(this.k, this.h, 1, this.l);
                }
                if (this.f677d == e.a.MATCH_CONSTRAINT && this.f675b.r() > 0.0f) {
                    l lVar2 = this.f675b.f624d;
                    if (lVar2.f677d == e.a.MATCH_CONSTRAINT) {
                        lVar2.f678e.k.add(this.f678e);
                        this.f678e.l.add(this.f675b.f624d.f678e);
                        this.f678e.f651a = this;
                    }
                }
            }
        } else {
            if (eVar6.Z()) {
                this.h.f656f = this.f675b.O[2].e();
                this.i.f656f = -this.f675b.O[3].e();
            } else {
                f startTarget2 = h(this.f675b.O[2]);
                f endTarget2 = h(this.f675b.O[3]);
                startTarget2.b(this);
                endTarget2.b(this);
                this.j = p.a.CENTER;
            }
            if (this.f675b.S()) {
                c(this.k, this.h, 1, this.l);
            }
        }
        if (this.f678e.l.size() == 0) {
            this.f678e.f653c = true;
        }
    }

    @Override // a.f.b.i.m.p
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f675b.U0(fVar.f657g);
        }
    }
}
