package b.a.a.s.b;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b.a.a.f;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.s.c.c;
import b.a.a.u.e;
import b.a.a.u.k.j;
import b.a.a.u.k.q;
import b.a.a.x.g;
import java.util.List;

public class o implements a.b, k, m {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2007a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f2008b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final String f2009c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2010d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2011e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, PointF> f2012f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f2013g;
    public final a<?, Float> h;
    public b i = new b();
    public boolean j;

    public o(f lottieDrawable, b.a.a.u.l.a layer, j rectShape) {
        this.f2009c = rectShape.c();
        this.f2010d = rectShape.f();
        this.f2011e = lottieDrawable;
        this.f2012f = rectShape.d().a();
        this.f2013g = rectShape.e().a();
        this.h = rectShape.b().a();
        layer.k(this.f2012f);
        layer.k(this.f2013g);
        layer.k(this.h);
        this.f2012f.a(this);
        this.f2013g.a(this);
        this.h.a(this);
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f2009c;
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        d();
    }

    public final void d() {
        this.j = false;
        this.f2011e.invalidateSelf();
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c content = list.get(i2);
            if ((content instanceof s) && ((s) content).k() == q.a.SIMULTANEOUSLY) {
                s trimPath = (s) content;
                this.i.a(trimPath);
                trimPath.d(this);
            }
        }
    }

    @Override // b.a.a.s.b.m
    public Path h() {
        if (this.j) {
            return this.f2007a;
        }
        this.f2007a.reset();
        if (this.f2010d) {
            this.j = true;
            return this.f2007a;
        }
        PointF size = this.f2013g.h();
        float halfWidth = size.x / 2.0f;
        float halfHeight = size.y / 2.0f;
        a<?, Float> aVar = this.h;
        float radius = aVar == null ? 0.0f : ((c) aVar).o();
        float maxRadius = Math.min(halfWidth, halfHeight);
        if (radius > maxRadius) {
            radius = maxRadius;
        }
        PointF position = this.f2012f.h();
        this.f2007a.moveTo(position.x + halfWidth, (position.y - halfHeight) + radius);
        this.f2007a.lineTo(position.x + halfWidth, (position.y + halfHeight) - radius);
        if (radius > 0.0f) {
            RectF rectF = this.f2008b;
            float f2 = position.x;
            float f3 = position.y;
            rectF.set((f2 + halfWidth) - (radius * 2.0f), (f3 + halfHeight) - (radius * 2.0f), f2 + halfWidth, f3 + halfHeight);
            this.f2007a.arcTo(this.f2008b, 0.0f, 90.0f, false);
        }
        this.f2007a.lineTo((position.x - halfWidth) + radius, position.y + halfHeight);
        if (radius > 0.0f) {
            RectF rectF2 = this.f2008b;
            float f4 = position.x;
            float f5 = position.y;
            rectF2.set(f4 - halfWidth, (f5 + halfHeight) - (radius * 2.0f), (f4 - halfWidth) + (radius * 2.0f), f5 + halfHeight);
            this.f2007a.arcTo(this.f2008b, 90.0f, 90.0f, false);
        }
        this.f2007a.lineTo(position.x - halfWidth, (position.y - halfHeight) + radius);
        if (radius > 0.0f) {
            RectF rectF3 = this.f2008b;
            float f6 = position.x;
            float f7 = position.y;
            rectF3.set(f6 - halfWidth, f7 - halfHeight, (f6 - halfWidth) + (radius * 2.0f), (f7 - halfHeight) + (radius * 2.0f));
            this.f2007a.arcTo(this.f2008b, 180.0f, 90.0f, false);
        }
        this.f2007a.lineTo((position.x + halfWidth) - radius, position.y - halfHeight);
        if (radius > 0.0f) {
            RectF rectF4 = this.f2008b;
            float f8 = position.x;
            float f9 = position.y;
            rectF4.set((f8 + halfWidth) - (radius * 2.0f), f9 - halfHeight, f8 + halfWidth, (f9 - halfHeight) + (2.0f * radius));
            this.f2007a.arcTo(this.f2008b, 270.0f, 90.0f, false);
        }
        this.f2007a.close();
        this.i.b(this.f2007a);
        this.j = true;
        return this.f2007a;
    }

    @Override // b.a.a.u.f
    public void e(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        g.l(keyPath, depth, list, currentPartialKeyPath, this);
    }

    @Override // b.a.a.u.f
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        if (property == k.h) {
            this.f2013g.m(cVar);
        } else if (property == k.j) {
            this.f2012f.m(cVar);
        } else if (property == k.i) {
            this.h.m(cVar);
        }
    }
}
