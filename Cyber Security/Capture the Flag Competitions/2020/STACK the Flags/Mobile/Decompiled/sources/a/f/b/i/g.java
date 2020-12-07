package a.f.b.i;

import a.f.b.h;
import a.f.b.i.d;
import a.f.b.i.e;

public class g extends e {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public d t0 = this.H;
    public int u0 = 0;
    public boolean v0;

    public g() {
        this.P.clear();
        this.P.add(this.t0);
        int count = this.O.length;
        for (int i = 0; i < count; i++) {
            this.O[i] = this.t0;
        }
    }

    @Override // a.f.b.i.e
    public boolean f() {
        return true;
    }

    public void h1(int orientation) {
        if (this.u0 != orientation) {
            this.u0 = orientation;
            this.P.clear();
            if (this.u0 == 1) {
                this.t0 = this.G;
            } else {
                this.t0 = this.H;
            }
            this.P.add(this.t0);
            int count = this.O.length;
            for (int i = 0; i < count; i++) {
                this.O[i] = this.t0;
            }
        }
    }

    public d Y0() {
        return this.t0;
    }

    public int Z0() {
        return this.u0;
    }

    @Override // a.f.b.i.e
    public d k(d.a anchorType) {
        switch (anchorType.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.u0 == 1) {
                    return this.t0;
                }
                break;
            case 2:
            case 4:
                if (this.u0 == 0) {
                    return this.t0;
                }
                break;
        }
        throw new AssertionError(anchorType.name());
    }

    public void g1(float value) {
        if (value > -1.0f) {
            this.q0 = value;
            this.r0 = -1;
            this.s0 = -1;
        }
    }

    public void e1(int value) {
        if (value > -1) {
            this.q0 = -1.0f;
            this.r0 = value;
            this.s0 = -1;
        }
    }

    public void f1(int value) {
        if (value > -1) {
            this.q0 = -1.0f;
            this.r0 = -1;
            this.s0 = value;
        }
    }

    public float c1() {
        return this.q0;
    }

    public int a1() {
        return this.r0;
    }

    public int b1() {
        return this.s0;
    }

    public void d1(int position) {
        this.t0.s(position);
        this.v0 = true;
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
    public void e(a.f.b.d system, boolean optimize) {
        f parent = (f) G();
        if (parent != null) {
            d begin = parent.k(d.a.LEFT);
            d end = parent.k(d.a.RIGHT);
            e eVar = this.S;
            boolean z = true;
            boolean parentWrapContent = eVar != null && eVar.R[0] == e.a.WRAP_CONTENT;
            if (this.u0 == 0) {
                begin = parent.k(d.a.TOP);
                end = parent.k(d.a.BOTTOM);
                e eVar2 = this.S;
                if (eVar2 == null || eVar2.R[1] != e.a.WRAP_CONTENT) {
                    z = false;
                }
                parentWrapContent = z;
            }
            if (this.v0 && this.t0.m()) {
                h guide = system.q(this.t0);
                system.f(guide, this.t0.d());
                if (this.r0 != -1) {
                    if (parentWrapContent) {
                        system.h(system.q(end), guide, 0, 5);
                    }
                } else if (this.s0 != -1 && parentWrapContent) {
                    h parentRight = system.q(end);
                    system.h(guide, system.q(begin), 0, 5);
                    system.h(parentRight, guide, 0, 5);
                }
                this.v0 = false;
            } else if (this.r0 != -1) {
                h guide2 = system.q(this.t0);
                system.e(guide2, system.q(begin), this.r0, 8);
                if (parentWrapContent) {
                    system.h(system.q(end), guide2, 0, 5);
                }
            } else if (this.s0 != -1) {
                h guide3 = system.q(this.t0);
                h parentRight2 = system.q(end);
                system.e(guide3, parentRight2, -this.s0, 8);
                if (parentWrapContent) {
                    system.h(guide3, system.q(begin), 0, 5);
                    system.h(parentRight2, guide3, 0, 5);
                }
            } else if (this.q0 != -1.0f) {
                system.d(a.f.b.d.s(system, system.q(this.t0), system.q(end), this.q0));
            }
        }
    }

    @Override // a.f.b.i.e
    public void X0(a.f.b.d system, boolean optimize) {
        if (G() != null) {
            int value = system.x(this.t0);
            if (this.u0 == 1) {
                T0(value);
                U0(0);
                t0(G().t());
                S0(0);
                return;
            }
            T0(0);
            U0(value);
            S0(G().P());
            t0(0);
        }
    }
}
