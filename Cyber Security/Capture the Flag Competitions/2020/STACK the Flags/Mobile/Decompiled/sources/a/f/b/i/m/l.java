package a.f.b.i.m;

import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.h;
import a.f.b.i.m.f;
import a.f.b.i.m.p;

public class l extends p {
    public static int[] k = new int[2];

    public l(e widget) {
        super(widget);
        this.h.f655e = f.a.LEFT;
        this.i.f655e = f.a.RIGHT;
        this.f679f = 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f675b.p();
    }

    @Override // a.f.b.i.m.p
    public void f() {
        this.f676c = null;
        this.h.c();
        this.i.c();
        this.f678e.c();
        this.f680g = false;
    }

    public void r() {
        this.f680g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.f678e.j = false;
    }

    @Override // a.f.b.i.m.p
    public boolean m() {
        if (this.f677d != e.a.MATCH_CONSTRAINT || this.f675b.o == 0) {
            return true;
        }
        return false;
    }

    @Override // a.f.b.i.m.p
    public void d() {
        e parent;
        e parent2;
        e eVar = this.f675b;
        if (eVar.f621a) {
            this.f678e.d(eVar.P());
        }
        if (!this.f678e.j) {
            e.a w = this.f675b.w();
            this.f677d = w;
            if (w != e.a.MATCH_CONSTRAINT) {
                if (w == e.a.MATCH_PARENT && (((parent2 = this.f675b.G()) != null && parent2.w() == e.a.FIXED) || parent2.w() == e.a.MATCH_PARENT)) {
                    int resolvedDimension = (parent2.P() - this.f675b.G.e()) - this.f675b.I.e();
                    b(this.h, parent2.f624d.h, this.f675b.G.e());
                    b(this.i, parent2.f624d.i, -this.f675b.I.e());
                    this.f678e.d(resolvedDimension);
                    return;
                } else if (this.f677d == e.a.FIXED) {
                    this.f678e.d(this.f675b.P());
                }
            }
        } else if (this.f677d == e.a.MATCH_PARENT && (((parent = this.f675b.G()) != null && parent.w() == e.a.FIXED) || parent.w() == e.a.MATCH_PARENT)) {
            b(this.h, parent.f624d.h, this.f675b.G.e());
            b(this.i, parent.f624d.i, -this.f675b.I.e());
            return;
        }
        if (this.f678e.j) {
            e eVar2 = this.f675b;
            if (eVar2.f621a) {
                d[] dVarArr = eVar2.O;
                if (dVarArr[0].f613f == null || dVarArr[1].f613f == null) {
                    e eVar3 = this.f675b;
                    d[] dVarArr2 = eVar3.O;
                    if (dVarArr2[0].f613f != null) {
                        f target = h(dVarArr2[0]);
                        if (target != null) {
                            b(this.h, target, this.f675b.O[0].e());
                            b(this.i, this.h, this.f678e.f657g);
                            return;
                        }
                        return;
                    } else if (dVarArr2[1].f613f != null) {
                        f target2 = h(dVarArr2[1]);
                        if (target2 != null) {
                            b(this.i, target2, -this.f675b.O[1].e());
                            b(this.h, this.i, -this.f678e.f657g);
                            return;
                        }
                        return;
                    } else if (!(eVar3 instanceof h) && eVar3.G() != null && this.f675b.k(d.a.CENTER).f613f == null) {
                        b(this.h, this.f675b.G().f624d.h, this.f675b.Q());
                        b(this.i, this.h, this.f678e.f657g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.X()) {
                    this.h.f656f = this.f675b.O[0].e();
                    this.i.f656f = -this.f675b.O[1].e();
                    return;
                } else {
                    f startTarget = h(this.f675b.O[0]);
                    if (startTarget != null) {
                        b(this.h, startTarget, this.f675b.O[0].e());
                    }
                    f endTarget = h(this.f675b.O[1]);
                    if (endTarget != null) {
                        b(this.i, endTarget, -this.f675b.O[1].e());
                    }
                    this.h.f652b = true;
                    this.i.f652b = true;
                    return;
                }
            }
        }
        if (this.f677d == e.a.MATCH_CONSTRAINT) {
            e eVar4 = this.f675b;
            int i = eVar4.o;
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
            } else if (i == 3) {
                if (eVar4.p == 3) {
                    this.h.f651a = this;
                    this.i.f651a = this;
                    n nVar = eVar4.f625e;
                    nVar.h.f651a = this;
                    nVar.i.f651a = this;
                    this.f678e.f651a = this;
                    if (eVar4.Z()) {
                        this.f678e.l.add(this.f675b.f625e.f678e);
                        this.f675b.f625e.f678e.k.add(this.f678e);
                        n nVar2 = this.f675b.f625e;
                        nVar2.f678e.f651a = this;
                        this.f678e.l.add(nVar2.h);
                        this.f678e.l.add(this.f675b.f625e.i);
                        this.f675b.f625e.h.k.add(this.f678e);
                        this.f675b.f625e.i.k.add(this.f678e);
                    } else if (this.f675b.X()) {
                        this.f675b.f625e.f678e.l.add(this.f678e);
                        this.f678e.k.add(this.f675b.f625e.f678e);
                    } else {
                        this.f675b.f625e.f678e.l.add(this.f678e);
                    }
                } else {
                    f targetDimension2 = eVar4.f625e.f678e;
                    this.f678e.l.add(targetDimension2);
                    targetDimension2.k.add(this.f678e);
                    this.f675b.f625e.h.k.add(this.f678e);
                    this.f675b.f625e.i.k.add(this.f678e);
                    g gVar2 = this.f678e;
                    gVar2.f652b = true;
                    gVar2.k.add(this.h);
                    this.f678e.k.add(this.i);
                    this.h.l.add(this.f678e);
                    this.i.l.add(this.f678e);
                }
            }
        }
        e parent4 = this.f675b;
        d[] dVarArr3 = parent4.O;
        if (dVarArr3[0].f613f == null || dVarArr3[1].f613f == null) {
            e eVar5 = this.f675b;
            d[] dVarArr4 = eVar5.O;
            if (dVarArr4[0].f613f != null) {
                f target3 = h(dVarArr4[0]);
                if (target3 != null) {
                    b(this.h, target3, this.f675b.O[0].e());
                    c(this.i, this.h, 1, this.f678e);
                }
            } else if (dVarArr4[1].f613f != null) {
                f target4 = h(dVarArr4[1]);
                if (target4 != null) {
                    b(this.i, target4, -this.f675b.O[1].e());
                    c(this.h, this.i, -1, this.f678e);
                }
            } else if (!(eVar5 instanceof h) && eVar5.G() != null) {
                b(this.h, this.f675b.G().f624d.h, this.f675b.Q());
                c(this.i, this.h, 1, this.f678e);
            }
        } else if (parent4.X()) {
            this.h.f656f = this.f675b.O[0].e();
            this.i.f656f = -this.f675b.O[1].e();
        } else {
            f startTarget2 = h(this.f675b.O[0]);
            f endTarget2 = h(this.f675b.O[1]);
            startTarget2.b(this);
            endTarget2.b(this);
            this.j = p.a.CENTER;
        }
    }

    public final void q(int[] dimensions, int x1, int x2, int y1, int y2, float ratio, int side) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        if (side == -1) {
            int candidateX1 = (int) ((((float) dy) * ratio) + 0.5f);
            int candidateY2 = (int) ((((float) dx) / ratio) + 0.5f);
            if (candidateX1 <= dx && dy <= dy) {
                dimensions[0] = candidateX1;
                dimensions[1] = dy;
            } else if (dx <= dx && candidateY2 <= dy) {
                dimensions[0] = dx;
                dimensions[1] = candidateY2;
            }
        } else if (side == 0) {
            dimensions[0] = (int) ((((float) dy) * ratio) + 0.5f);
            dimensions[1] = dy;
        } else if (side == 1) {
            dimensions[0] = dx;
            dimensions[1] = (int) ((((float) dx) * ratio) + 0.5f);
        }
    }

    /* JADX INFO: Multiple debug info for r3v20 int: [D('dy' int), D('dx' int)] */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02fd, code lost:
        if (r7 != 1) goto L_0x036b;
     */
    @Override // a.f.b.i.m.d, a.f.b.i.m.p
    public void a(d dependency) {
        int ordinal = this.j.ordinal();
        if (ordinal == 1) {
            p();
        } else if (ordinal == 2) {
            o();
        } else if (ordinal == 3) {
            e eVar = this.f675b;
            n(eVar.G, eVar.I, 0);
            return;
        }
        if (!this.f678e.j && this.f677d == e.a.MATCH_CONSTRAINT) {
            e eVar2 = this.f675b;
            int i = eVar2.o;
            if (i == 2) {
                e parent = eVar2.G();
                if (parent != null) {
                    g gVar = parent.f624d.f678e;
                    if (gVar.j) {
                        this.f678e.d((int) ((((float) gVar.f657g) * this.f675b.t) + 0.5f));
                    }
                }
            } else if (i == 3) {
                int i2 = eVar2.p;
                if (i2 == 0 || i2 == 3) {
                    e eVar3 = this.f675b;
                    n nVar = eVar3.f625e;
                    f secondStart = nVar.h;
                    f secondEnd = nVar.i;
                    boolean s1 = eVar3.G.f613f != null;
                    boolean s2 = this.f675b.H.f613f != null;
                    boolean e1 = this.f675b.I.f613f != null;
                    boolean e2 = this.f675b.J.f613f != null;
                    int definedSide = this.f675b.s();
                    if (s1 && s2 && e1 && e2) {
                        float ratio = this.f675b.r();
                        if (!secondStart.j || !secondEnd.j) {
                            f fVar = this.h;
                            if (fVar.j) {
                                f fVar2 = this.i;
                                if (fVar2.j) {
                                    if (secondStart.f653c && secondEnd.f653c) {
                                        q(k, fVar.f657g + fVar.f656f, fVar2.f657g - fVar2.f656f, secondStart.l.get(0).f657g + secondStart.f656f, secondEnd.l.get(0).f657g - secondEnd.f656f, ratio, definedSide);
                                        this.f678e.d(k[0]);
                                        this.f675b.f625e.f678e.d(k[1]);
                                    } else {
                                        return;
                                    }
                                }
                            }
                            f fVar3 = this.h;
                            if (fVar3.f653c && this.i.f653c && secondStart.f653c && secondEnd.f653c) {
                                q(k, fVar3.l.get(0).f657g + this.h.f656f, this.i.l.get(0).f657g - this.i.f656f, secondStart.l.get(0).f657g + secondStart.f656f, secondEnd.l.get(0).f657g - secondEnd.f656f, ratio, definedSide);
                                this.f678e.d(k[0]);
                                this.f675b.f625e.f678e.d(k[1]);
                            } else {
                                return;
                            }
                        } else {
                            f fVar4 = this.h;
                            if (!fVar4.f653c) {
                                return;
                            }
                            if (this.i.f653c) {
                                q(k, fVar4.l.get(0).f657g + this.h.f656f, this.i.l.get(0).f657g - this.i.f656f, secondStart.f657g + secondStart.f656f, secondEnd.f657g - secondEnd.f656f, ratio, definedSide);
                                this.f678e.d(k[0]);
                                this.f675b.f625e.f678e.d(k[1]);
                                return;
                            }
                            return;
                        }
                    } else if (!s1 || !e1) {
                        if (s2 && e2) {
                            if (secondStart.f653c && secondEnd.f653c) {
                                float ratio2 = this.f675b.r();
                                int y1 = secondStart.l.get(0).f657g + secondStart.f656f;
                                int y2 = secondEnd.l.get(0).f657g - secondEnd.f656f;
                                if (definedSide != -1) {
                                    if (definedSide == 0) {
                                        int ldy = g(y2 - y1, 1);
                                        int dx = (int) ((((float) ldy) * ratio2) + 0.5f);
                                        int ldx = g(dx, 0);
                                        if (dx != ldx) {
                                            ldy = (int) ((((float) ldx) / ratio2) + 0.5f);
                                        }
                                        this.f678e.d(ldx);
                                        this.f675b.f625e.f678e.d(ldy);
                                    }
                                }
                                int ldy2 = g(y2 - y1, 1);
                                int dx2 = (int) ((((float) ldy2) / ratio2) + 0.5f);
                                int ldx2 = g(dx2, 0);
                                if (dx2 != ldx2) {
                                    ldy2 = (int) ((((float) ldx2) * ratio2) + 0.5f);
                                }
                                this.f678e.d(ldx2);
                                this.f675b.f625e.f678e.d(ldy2);
                            } else {
                                return;
                            }
                        }
                    } else if (!this.h.f653c) {
                        return;
                    } else {
                        if (this.i.f653c) {
                            float ratio3 = this.f675b.r();
                            int x1 = this.h.l.get(0).f657g + this.h.f656f;
                            int x2 = this.i.l.get(0).f657g - this.i.f656f;
                            if (definedSide == -1 || definedSide == 0) {
                                int ldx3 = g(x2 - x1, 0);
                                int dy = (int) ((((float) ldx3) * ratio3) + 0.5f);
                                int ldy3 = g(dy, 1);
                                if (dy != ldy3) {
                                    ldx3 = (int) ((((float) ldy3) / ratio3) + 0.5f);
                                }
                                this.f678e.d(ldx3);
                                this.f675b.f625e.f678e.d(ldy3);
                            } else if (definedSide == 1) {
                                int ldx4 = g(x2 - x1, 0);
                                int dy2 = (int) ((((float) ldx4) / ratio3) + 0.5f);
                                int ldy4 = g(dy2, 1);
                                if (dy2 != ldy4) {
                                    ldx4 = (int) ((((float) ldy4) * ratio3) + 0.5f);
                                }
                                this.f678e.d(ldx4);
                                this.f675b.f625e.f678e.d(ldy4);
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    int size = 0;
                    int ratioSide = eVar2.s();
                    if (ratioSide == -1) {
                        e eVar4 = this.f675b;
                        size = (int) ((((float) eVar4.f625e.f678e.f657g) * eVar4.r()) + 0.5f);
                    } else if (ratioSide == 0) {
                        e eVar5 = this.f675b;
                        size = (int) ((((float) eVar5.f625e.f678e.f657g) / eVar5.r()) + 0.5f);
                    } else if (ratioSide == 1) {
                        e eVar6 = this.f675b;
                        size = (int) ((((float) eVar6.f625e.f678e.f657g) * eVar6.r()) + 0.5f);
                    }
                    this.f678e.d(size);
                }
            }
        }
        f fVar5 = this.h;
        if (fVar5.f653c) {
            f fVar6 = this.i;
            if (fVar6.f653c) {
                if (!fVar5.j || !fVar6.j || !this.f678e.j) {
                    if (!this.f678e.j && this.f677d == e.a.MATCH_CONSTRAINT) {
                        e eVar7 = this.f675b;
                        if (eVar7.o == 0 && !eVar7.X()) {
                            int i3 = this.h.l.get(0).f657g;
                            f fVar7 = this.h;
                            int startPos = i3 + fVar7.f656f;
                            int endPos = this.i.l.get(0).f657g + this.i.f656f;
                            fVar7.d(startPos);
                            this.i.d(endPos);
                            this.f678e.d(endPos - startPos);
                            return;
                        }
                    }
                    if (!this.f678e.j && this.f677d == e.a.MATCH_CONSTRAINT && this.f674a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                        int value = Math.min((this.i.l.get(0).f657g + this.i.f656f) - (this.h.l.get(0).f657g + this.h.f656f), this.f678e.m);
                        e eVar8 = this.f675b;
                        int max = eVar8.s;
                        int value2 = Math.max(eVar8.r, value);
                        if (max > 0) {
                            value2 = Math.min(max, value2);
                        }
                        this.f678e.d(value2);
                    }
                    if (this.f678e.j) {
                        f startTarget = this.h.l.get(0);
                        f endTarget = this.i.l.get(0);
                        int startPos2 = startTarget.f657g + this.h.f656f;
                        int endPos2 = endTarget.f657g + this.i.f656f;
                        float bias = this.f675b.u();
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
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f675b.T0(fVar.f657g);
        }
    }
}
