package a.f.b.i;

import a.f.b.d;
import a.f.b.h;
import a.f.b.i.d;
import a.f.b.i.e;

public class a extends i {
    public int s0 = 0;
    public boolean t0 = true;
    public int u0 = 0;
    public boolean v0 = false;

    @Override // a.f.b.i.e
    public boolean f() {
        return true;
    }

    public int e1() {
        return this.s0;
    }

    public void j1(int barrierType) {
        this.s0 = barrierType;
    }

    public void i1(boolean allowsGoneWidget) {
        this.t0 = allowsGoneWidget;
    }

    public boolean d1() {
        return this.t0;
    }

    @Override // a.f.b.i.e
    public boolean c0() {
        return this.v0;
    }

    @Override // a.f.b.i.e
    public boolean d0() {
        return this.v0;
    }

    @Override // a.f.b.i.e
    public String toString() {
        String debug = "[Barrier] " + p() + " {";
        for (int i = 0; i < this.r0; i++) {
            e widget = this.q0[i];
            if (i > 0) {
                debug = debug + ", ";
            }
            debug = debug + widget.p();
        }
        return debug + "}";
    }

    public void h1() {
        for (int i = 0; i < this.r0; i++) {
            e widget = this.q0[i];
            int i2 = this.s0;
            if (i2 == 0 || i2 == 1) {
                widget.A0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                widget.A0(1, true);
            }
        }
    }

    @Override // a.f.b.i.e
    public void e(d system, boolean optimize) {
        Object[] objArr;
        d[] dVarArr = this.O;
        dVarArr[0] = this.G;
        dVarArr[2] = this.H;
        dVarArr[1] = this.I;
        dVarArr[3] = this.J;
        int i = 0;
        while (true) {
            objArr = this.O;
            if (i >= objArr.length) {
                break;
            }
            objArr[i].i = system.q(objArr[i]);
            i++;
        }
        int i2 = this.s0;
        if (i2 >= 0 && i2 < 4) {
            d position = objArr[i2];
            if (!this.v0) {
                c1();
            }
            if (this.v0) {
                this.v0 = false;
                int i3 = this.s0;
                if (i3 == 0 || i3 == 1) {
                    system.f(this.G.i, this.X);
                    system.f(this.I.i, this.X);
                } else if (i3 == 2 || i3 == 3) {
                    system.f(this.H.i, this.Y);
                    system.f(this.J.i, this.Y);
                }
            } else {
                boolean hasMatchConstraintWidgets = false;
                int i4 = 0;
                while (true) {
                    if (i4 >= this.r0) {
                        break;
                    }
                    e widget = this.q0[i4];
                    if (this.t0 || widget.f()) {
                        int i5 = this.s0;
                        if ((i5 == 0 || i5 == 1) && widget.w() == e.a.MATCH_CONSTRAINT && widget.G.f613f != null && widget.I.f613f != null) {
                            hasMatchConstraintWidgets = true;
                            break;
                        }
                        int i6 = this.s0;
                        if ((i6 == 2 || i6 == 3) && widget.M() == e.a.MATCH_CONSTRAINT && widget.H.f613f != null && widget.J.f613f != null) {
                            hasMatchConstraintWidgets = true;
                            break;
                        }
                    }
                    i4++;
                }
                boolean mHasHorizontalCenteredDependents = this.G.k() || this.I.k();
                boolean mHasVerticalCenteredDependents = this.H.k() || this.J.k();
                int equalityOnReferencesStrength = 5;
                if (!(!hasMatchConstraintWidgets && ((this.s0 == 0 && mHasHorizontalCenteredDependents) || ((this.s0 == 2 && mHasVerticalCenteredDependents) || ((this.s0 == 1 && mHasHorizontalCenteredDependents) || (this.s0 == 3 && mHasVerticalCenteredDependents)))))) {
                    equalityOnReferencesStrength = 4;
                }
                for (int i7 = 0; i7 < this.r0; i7++) {
                    e widget2 = this.q0[i7];
                    if (this.t0 || widget2.f()) {
                        h target = system.q(widget2.O[this.s0]);
                        d[] dVarArr2 = widget2.O;
                        int i8 = this.s0;
                        dVarArr2[i8].i = target;
                        int margin = 0;
                        if (dVarArr2[i8].f613f != null && dVarArr2[i8].f613f.f611d == this) {
                            margin = 0 + dVarArr2[i8].f614g;
                        }
                        int i9 = this.s0;
                        if (i9 == 0 || i9 == 2) {
                            system.i(position.i, target, this.u0 - margin);
                        } else {
                            system.g(position.i, target, this.u0 + margin);
                        }
                        system.e(position.i, target, this.u0 + margin, equalityOnReferencesStrength);
                    }
                }
                int i10 = this.s0;
                if (i10 == 0) {
                    system.e(this.I.i, this.G.i, 0, 8);
                    system.e(this.G.i, this.S.I.i, 0, 4);
                    system.e(this.G.i, this.S.G.i, 0, 0);
                } else if (i10 == 1) {
                    system.e(this.G.i, this.I.i, 0, 8);
                    system.e(this.G.i, this.S.G.i, 0, 4);
                    system.e(this.G.i, this.S.I.i, 0, 0);
                } else if (i10 == 2) {
                    system.e(this.J.i, this.H.i, 0, 8);
                    system.e(this.H.i, this.S.J.i, 0, 4);
                    system.e(this.H.i, this.S.H.i, 0, 0);
                } else if (i10 == 3) {
                    system.e(this.H.i, this.J.i, 0, 8);
                    system.e(this.H.i, this.S.H.i, 0, 4);
                    system.e(this.H.i, this.S.J.i, 0, 0);
                }
            }
        }
    }

    public void k1(int margin) {
        this.u0 = margin;
    }

    public int f1() {
        return this.u0;
    }

    public int g1() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        return -1;
    }

    public boolean c1() {
        int i;
        boolean hasAllWidgetsResolved = true;
        int i2 = 0;
        while (true) {
            i = this.r0;
            if (i2 >= i) {
                break;
            }
            e widget = this.q0[i2];
            if (this.t0 || widget.f()) {
                int i3 = this.s0;
                if ((i3 == 0 || i3 == 1) && !widget.c0()) {
                    hasAllWidgetsResolved = false;
                } else {
                    int i4 = this.s0;
                    if ((i4 == 2 || i4 == 3) && !widget.d0()) {
                        hasAllWidgetsResolved = false;
                    }
                }
            }
            i2++;
        }
        if (!hasAllWidgetsResolved || i <= 0) {
            return false;
        }
        int barrierPosition = 0;
        boolean initialized = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            e widget2 = this.q0[i5];
            if (this.t0 || widget2.f()) {
                if (!initialized) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        barrierPosition = widget2.k(d.a.LEFT).d();
                    } else if (i6 == 1) {
                        barrierPosition = widget2.k(d.a.RIGHT).d();
                    } else if (i6 == 2) {
                        barrierPosition = widget2.k(d.a.TOP).d();
                    } else if (i6 == 3) {
                        barrierPosition = widget2.k(d.a.BOTTOM).d();
                    }
                    initialized = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    barrierPosition = Math.min(barrierPosition, widget2.k(d.a.LEFT).d());
                } else if (i7 == 1) {
                    barrierPosition = Math.max(barrierPosition, widget2.k(d.a.RIGHT).d());
                } else if (i7 == 2) {
                    barrierPosition = Math.min(barrierPosition, widget2.k(d.a.TOP).d());
                } else if (i7 == 3) {
                    barrierPosition = Math.max(barrierPosition, widget2.k(d.a.BOTTOM).d());
                }
            }
        }
        int barrierPosition2 = barrierPosition + this.u0;
        int i8 = this.s0;
        if (i8 == 0 || i8 == 1) {
            n0(barrierPosition2, barrierPosition2);
        } else {
            q0(barrierPosition2, barrierPosition2);
        }
        this.v0 = true;
        return true;
    }
}
