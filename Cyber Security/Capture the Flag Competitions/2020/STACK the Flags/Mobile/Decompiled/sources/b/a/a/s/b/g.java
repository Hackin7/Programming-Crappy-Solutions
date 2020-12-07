package b.a.a.s.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b.a.a.c;
import b.a.a.f;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.s.c.b;
import b.a.a.s.c.p;
import b.a.a.u.e;
import b.a.a.u.k.m;
import java.util.ArrayList;
import java.util.List;

public class g implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f1980a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f1981b = new b.a.a.s.a(1);

    /* renamed from: c  reason: collision with root package name */
    public final b.a.a.u.l.a f1982c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1983d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1984e;

    /* renamed from: f  reason: collision with root package name */
    public final List<m> f1985f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final a<Integer, Integer> f1986g;
    public final a<Integer, Integer> h;
    public a<ColorFilter, ColorFilter> i;
    public final f j;

    public g(f lottieDrawable, b.a.a.u.l.a layer, m fill) {
        this.f1982c = layer;
        this.f1983d = fill.d();
        this.f1984e = fill.f();
        this.j = lottieDrawable;
        if (fill.b() == null || fill.e() == null) {
            this.f1986g = null;
            this.h = null;
            return;
        }
        this.f1980a.setFillType(fill.c());
        a<Integer, Integer> a2 = fill.b().a();
        this.f1986g = a2;
        a2.a(this);
        layer.k(this.f1986g);
        a<Integer, Integer> a3 = fill.e().a();
        this.h = a3;
        a3.a(this);
        layer.k(this.h);
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        this.j.invalidateSelf();
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            c content = list2.get(i2);
            if (content instanceof m) {
                this.f1985f.add((m) content);
            }
        }
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f1983d;
    }

    @Override // b.a.a.s.b.e
    public void g(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        if (!this.f1984e) {
            c.a("FillContent#draw");
            this.f1981b.setColor(((b) this.f1986g).o());
            this.f1981b.setAlpha(b.a.a.x.g.c((int) ((((((float) parentAlpha) / 255.0f) * ((float) this.h.h().intValue())) / 100.0f) * 255.0f), 0, 255));
            a<ColorFilter, ColorFilter> aVar = this.i;
            if (aVar != null) {
                this.f1981b.setColorFilter(aVar.h());
            }
            this.f1980a.reset();
            for (int i2 = 0; i2 < this.f1985f.size(); i2++) {
                this.f1980a.addPath(this.f1985f.get(i2).h(), parentMatrix);
            }
            canvas.drawPath(this.f1980a, this.f1981b);
            c.b("FillContent#draw");
        }
    }

    @Override // b.a.a.s.b.e
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        this.f1980a.reset();
        for (int i2 = 0; i2 < this.f1985f.size(); i2++) {
            this.f1980a.addPath(this.f1985f.get(i2).h(), parentMatrix);
        }
        this.f1980a.computeBounds(outBounds, false);
        outBounds.set(outBounds.left - 1.0f, outBounds.top - 1.0f, outBounds.right + 1.0f, outBounds.bottom + 1.0f);
    }

    @Override // b.a.a.u.f
    public void e(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        b.a.a.x.g.l(keyPath, depth, list, currentPartialKeyPath, this);
    }

    @Override // b.a.a.u.f
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        if (property == k.f1933a) {
            this.f1986g.m(cVar);
        } else if (property == k.f1936d) {
            this.h.m(cVar);
        } else if (property == k.C) {
            a<ColorFilter, ColorFilter> aVar = this.i;
            if (aVar != null) {
                this.f1982c.E(aVar);
            }
            if (cVar == null) {
                this.i = null;
                return;
            }
            p pVar = new p(cVar);
            this.i = pVar;
            pVar.a(this);
            this.f1982c.k(this.i);
        }
    }
}
