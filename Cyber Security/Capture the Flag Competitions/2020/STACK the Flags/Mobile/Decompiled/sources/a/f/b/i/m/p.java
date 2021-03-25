package a.f.b.i.m;

import a.f.b.i.d;
import a.f.b.i.e;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f674a;

    /* renamed from: b  reason: collision with root package name */
    public e f675b;

    /* renamed from: c  reason: collision with root package name */
    public m f676c;

    /* renamed from: d  reason: collision with root package name */
    public e.a f677d;

    /* renamed from: e  reason: collision with root package name */
    public g f678e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f679f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f680g = false;
    public f h = new f(this);
    public f i = new f(this);
    public a j = a.NONE;

    public enum a {
        NONE,
        START,
        END,
        CENTER
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean m();

    public p(e widget) {
        this.f675b = widget;
    }

    /* JADX INFO: Multiple debug info for r3v3 a.f.b.i.m.l: [D('run' a.f.b.i.m.n), D('run' a.f.b.i.m.l)] */
    public final f h(d anchor) {
        d dVar = anchor.f613f;
        if (dVar == null) {
            return null;
        }
        e targetWidget = dVar.f611d;
        int ordinal = dVar.f612e.ordinal();
        if (ordinal == 1) {
            return targetWidget.f624d.h;
        }
        if (ordinal == 2) {
            return targetWidget.f625e.h;
        }
        if (ordinal == 3) {
            return targetWidget.f624d.i;
        }
        if (ordinal == 4) {
            return targetWidget.f625e.i;
        }
        if (ordinal != 5) {
            return null;
        }
        return targetWidget.f625e.k;
    }

    public void n(d startAnchor, d endAnchor, int orientation) {
        float bias;
        f startTarget = h(startAnchor);
        f endTarget = h(endAnchor);
        if (startTarget.j && endTarget.j) {
            int startPos = startTarget.f657g + startAnchor.e();
            int endPos = endTarget.f657g - endAnchor.e();
            int distance = endPos - startPos;
            if (!this.f678e.j && this.f677d == e.a.MATCH_CONSTRAINT) {
                l(orientation, distance);
            }
            g gVar = this.f678e;
            if (gVar.j) {
                if (gVar.f657g == distance) {
                    this.h.d(startPos);
                    this.i.d(endPos);
                    return;
                }
                e eVar = this.f675b;
                if (orientation == 0) {
                    bias = eVar.u();
                } else {
                    bias = eVar.K();
                }
                if (startTarget == endTarget) {
                    startPos = startTarget.f657g;
                    endPos = endTarget.f657g;
                    bias = 0.5f;
                }
                this.h.d((int) (((float) startPos) + 0.5f + (((float) ((endPos - startPos) - this.f678e.f657g)) * bias)));
                this.i.d(this.h.f657g + this.f678e.f657g);
            }
        }
    }

    public final void l(int orientation, int distance) {
        int value;
        int i2 = this.f674a;
        if (i2 == 0) {
            this.f678e.d(g(distance, orientation));
        } else if (i2 == 1) {
            this.f678e.d(Math.min(g(this.f678e.m, orientation), distance));
        } else if (i2 == 2) {
            e parent = this.f675b.G();
            if (parent != null) {
                p run = orientation == 0 ? parent.f624d : parent.f625e;
                if (run.f678e.j) {
                    e eVar = this.f675b;
                    this.f678e.d(g((int) ((((float) run.f678e.f657g) * (orientation == 0 ? eVar.t : eVar.w)) + 0.5f), orientation));
                }
            }
        } else if (i2 == 3) {
            e eVar2 = this.f675b;
            l lVar = eVar2.f624d;
            e.a aVar = lVar.f677d;
            e.a aVar2 = e.a.MATCH_CONSTRAINT;
            if (aVar == aVar2 && lVar.f674a == 3) {
                n nVar = eVar2.f625e;
                if (nVar.f677d == aVar2 && nVar.f674a == 3) {
                    return;
                }
            }
            e eVar3 = this.f675b;
            p run2 = orientation == 0 ? eVar3.f625e : eVar3.f624d;
            if (run2.f678e.j) {
                float ratio = this.f675b.r();
                if (orientation == 1) {
                    value = (int) ((((float) run2.f678e.f657g) / ratio) + 0.5f);
                } else {
                    value = (int) ((((float) run2.f678e.f657g) * ratio) + 0.5f);
                }
                this.f678e.d(value);
            }
        }
    }

    public void p() {
    }

    public void o() {
    }

    @Override // a.f.b.i.m.d
    public void a(d dependency) {
    }

    public final int g(int dimension, int orientation) {
        if (orientation == 0) {
            e eVar = this.f675b;
            int max = eVar.s;
            int value = Math.max(eVar.r, dimension);
            if (max > 0) {
                value = Math.min(max, dimension);
            }
            return value != dimension ? value : dimension;
        }
        e eVar2 = this.f675b;
        int max2 = eVar2.v;
        int value2 = Math.max(eVar2.u, dimension);
        if (max2 > 0) {
            value2 = Math.min(max2, dimension);
        }
        return value2 != dimension ? value2 : dimension;
    }

    public final f i(d anchor, int orientation) {
        d dVar = anchor.f613f;
        if (dVar == null) {
            return null;
        }
        e targetWidget = dVar.f611d;
        p run = orientation == 0 ? targetWidget.f624d : targetWidget.f625e;
        int ordinal = anchor.f613f.f612e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return run.h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return run.i;
        }
        return null;
    }

    public final void b(f node, f target, int margin) {
        node.l.add(target);
        node.f656f = margin;
        target.k.add(node);
    }

    public final void c(f node, f target, int marginFactor, g dimensionDependency) {
        node.l.add(target);
        node.l.add(this.f678e);
        node.h = marginFactor;
        node.i = dimensionDependency;
        target.k.add(node);
        dimensionDependency.k.add(node);
    }

    public long j() {
        g gVar = this.f678e;
        if (gVar.j) {
            return (long) gVar.f657g;
        }
        return 0;
    }

    public boolean k() {
        return this.f680g;
    }
}
