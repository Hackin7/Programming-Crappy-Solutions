package a.f.b.i.m;

import a.f.b.i.a;
import a.f.b.i.e;
import a.f.b.i.m.f;

public class k extends p {
    public k(e widget) {
        super(widget);
    }

    @Override // a.f.b.i.m.p
    public void f() {
        this.f676c = null;
        this.h.c();
    }

    @Override // a.f.b.i.m.p
    public boolean m() {
        return false;
    }

    public final void q(f node) {
        this.h.k.add(node);
        node.l.add(this.h);
    }

    @Override // a.f.b.i.m.p
    public void d() {
        e eVar = this.f675b;
        if (eVar instanceof a) {
            this.h.f652b = true;
            a barrier = (a) eVar;
            int type = barrier.e1();
            boolean allowsGoneWidget = barrier.d1();
            if (type == 0) {
                this.h.f655e = f.a.LEFT;
                for (int i = 0; i < barrier.r0; i++) {
                    e refwidget = barrier.q0[i];
                    if (allowsGoneWidget || refwidget.O() != 8) {
                        f target = refwidget.f624d.h;
                        target.k.add(this.h);
                        this.h.l.add(target);
                    }
                }
                q(this.f675b.f624d.h);
                q(this.f675b.f624d.i);
            } else if (type == 1) {
                this.h.f655e = f.a.RIGHT;
                for (int i2 = 0; i2 < barrier.r0; i2++) {
                    e refwidget2 = barrier.q0[i2];
                    if (allowsGoneWidget || refwidget2.O() != 8) {
                        f target2 = refwidget2.f624d.i;
                        target2.k.add(this.h);
                        this.h.l.add(target2);
                    }
                }
                q(this.f675b.f624d.h);
                q(this.f675b.f624d.i);
            } else if (type == 2) {
                this.h.f655e = f.a.TOP;
                for (int i3 = 0; i3 < barrier.r0; i3++) {
                    e refwidget3 = barrier.q0[i3];
                    if (allowsGoneWidget || refwidget3.O() != 8) {
                        f target3 = refwidget3.f625e.h;
                        target3.k.add(this.h);
                        this.h.l.add(target3);
                    }
                }
                q(this.f675b.f625e.h);
                q(this.f675b.f625e.i);
            } else if (type == 3) {
                this.h.f655e = f.a.BOTTOM;
                for (int i4 = 0; i4 < barrier.r0; i4++) {
                    e refwidget4 = barrier.q0[i4];
                    if (allowsGoneWidget || refwidget4.O() != 8) {
                        f target4 = refwidget4.f625e.i;
                        target4.k.add(this.h);
                        this.h.l.add(target4);
                    }
                }
                q(this.f675b.f625e.h);
                q(this.f675b.f625e.i);
            }
        }
    }

    @Override // a.f.b.i.m.d, a.f.b.i.m.p
    public void a(d dependency) {
        a barrier = (a) this.f675b;
        int type = barrier.e1();
        int min = -1;
        int max = 0;
        for (f node : this.h.l) {
            int value = node.f657g;
            if (min == -1 || value < min) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }
        if (type == 0 || type == 2) {
            this.h.d(barrier.f1() + min);
        } else {
            this.h.d(barrier.f1() + max);
        }
    }

    @Override // a.f.b.i.m.p
    public void e() {
        e eVar = this.f675b;
        if (eVar instanceof a) {
            int type = ((a) eVar).e1();
            if (type == 0 || type == 1) {
                this.f675b.T0(this.h.f657g);
            } else {
                this.f675b.U0(this.h.f657g);
            }
        }
    }
}
