package a.f.b.i.m;

import a.f.b.i.e;
import a.f.b.i.g;

public class j extends p {
    public j(e widget) {
        super(widget);
        widget.f624d.f();
        widget.f625e.f();
        this.f679f = ((g) widget).Z0();
    }

    @Override // a.f.b.i.m.p
    public void f() {
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

    @Override // a.f.b.i.m.d, a.f.b.i.m.p
    public void a(d dependency) {
        f fVar = this.h;
        if (fVar.f653c && !fVar.j) {
            this.h.d((int) ((((float) fVar.l.get(0).f657g) * ((g) this.f675b).c1()) + 0.5f));
        }
    }

    @Override // a.f.b.i.m.p
    public void d() {
        g guideline = (g) this.f675b;
        int relativeBegin = guideline.a1();
        int relativeEnd = guideline.b1();
        guideline.c1();
        if (guideline.Z0() == 1) {
            if (relativeBegin != -1) {
                this.h.l.add(this.f675b.S.f624d.h);
                this.f675b.S.f624d.h.k.add(this.h);
                this.h.f656f = relativeBegin;
            } else if (relativeEnd != -1) {
                this.h.l.add(this.f675b.S.f624d.i);
                this.f675b.S.f624d.i.k.add(this.h);
                this.h.f656f = -relativeEnd;
            } else {
                f fVar = this.h;
                fVar.f652b = true;
                fVar.l.add(this.f675b.S.f624d.i);
                this.f675b.S.f624d.i.k.add(this.h);
            }
            q(this.f675b.f624d.h);
            q(this.f675b.f624d.i);
            return;
        }
        if (relativeBegin != -1) {
            this.h.l.add(this.f675b.S.f625e.h);
            this.f675b.S.f625e.h.k.add(this.h);
            this.h.f656f = relativeBegin;
        } else if (relativeEnd != -1) {
            this.h.l.add(this.f675b.S.f625e.i);
            this.f675b.S.f625e.i.k.add(this.h);
            this.h.f656f = -relativeEnd;
        } else {
            f fVar2 = this.h;
            fVar2.f652b = true;
            fVar2.l.add(this.f675b.S.f625e.i);
            this.f675b.S.f625e.i.k.add(this.h);
        }
        q(this.f675b.f625e.h);
        q(this.f675b.f625e.i);
    }

    @Override // a.f.b.i.m.p
    public void e() {
        if (((g) this.f675b).Z0() == 1) {
            this.f675b.T0(this.h.f657g);
        } else {
            this.f675b.U0(this.h.f657g);
        }
    }
}
