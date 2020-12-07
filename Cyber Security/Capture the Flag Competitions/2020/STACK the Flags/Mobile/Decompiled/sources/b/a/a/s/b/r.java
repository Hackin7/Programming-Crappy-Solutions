package b.a.a.s.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import b.a.a.f;
import b.a.a.k;
import b.a.a.s.c.b;
import b.a.a.u.k.p;
import b.a.a.u.l.a;
import b.a.a.y.c;

public class r extends a {
    public final a o;
    public final String p;
    public final boolean q;
    public final b.a.a.s.c.a<Integer, Integer> r;
    public b.a.a.s.c.a<ColorFilter, ColorFilter> s;

    public r(f lottieDrawable, a layer, p stroke) {
        super(lottieDrawable, layer, stroke.b().a(), stroke.e().a(), stroke.g(), stroke.i(), stroke.j(), stroke.f(), stroke.d());
        this.o = layer;
        this.p = stroke.h();
        this.q = stroke.k();
        b.a.a.s.c.a<Integer, Integer> a2 = stroke.c().a();
        this.r = a2;
        a2.a(this);
        layer.k(this.r);
    }

    @Override // b.a.a.s.b.e, b.a.a.s.b.a
    public void g(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        if (!this.q) {
            this.i.setColor(((b) this.r).o());
            b.a.a.s.c.a<ColorFilter, ColorFilter> aVar = this.s;
            if (aVar != null) {
                this.i.setColorFilter(aVar.h());
            }
            super.g(canvas, parentMatrix, parentAlpha);
        }
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.p;
    }

    @Override // b.a.a.u.f, b.a.a.s.b.a
    public <T> void f(T property, c<T> cVar) {
        super.f(property, cVar);
        if (property == k.f1934b) {
            this.r.m(cVar);
        } else if (property == k.C) {
            b.a.a.s.c.a<ColorFilter, ColorFilter> aVar = this.s;
            if (aVar != null) {
                this.o.E(aVar);
            }
            if (cVar == null) {
                this.s = null;
                return;
            }
            b.a.a.s.c.p pVar = new b.a.a.s.c.p(cVar);
            this.s = pVar;
            pVar.a(this);
            this.o.k(this.r);
        }
    }
}
