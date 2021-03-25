package b.a.a.s.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import b.a.a.c;
import b.a.a.f;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.s.c.e;
import b.a.a.s.c.p;
import b.a.a.u.j.d;
import b.a.a.u.k.q;
import b.a.a.x.g;
import b.a.a.x.h;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements a.b, k, e {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f1956a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f1957b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f1958c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f1959d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final f f1960e;

    /* renamed from: f  reason: collision with root package name */
    public final b.a.a.u.l.a f1961f;

    /* renamed from: g  reason: collision with root package name */
    public final List<b> f1962g = new ArrayList();
    public final float[] h;
    public final Paint i;
    public final b.a.a.s.c.a<?, Float> j;
    public final b.a.a.s.c.a<?, Integer> k;
    public final List<b.a.a.s.c.a<?, Float>> l;
    public final b.a.a.s.c.a<?, Float> m;
    public b.a.a.s.c.a<ColorFilter, ColorFilter> n;

    public a(f lottieDrawable, b.a.a.u.l.a layer, Paint.Cap cap, Paint.Join join, float miterLimit, d opacity, b.a.a.u.j.b width, List<b.a.a.u.j.b> list, b.a.a.u.j.b offset) {
        b.a.a.s.a aVar = new b.a.a.s.a(1);
        this.i = aVar;
        this.f1960e = lottieDrawable;
        this.f1961f = layer;
        aVar.setStyle(Paint.Style.STROKE);
        this.i.setStrokeCap(cap);
        this.i.setStrokeJoin(join);
        this.i.setStrokeMiter(miterLimit);
        this.k = opacity.a();
        this.j = width.a();
        if (offset == null) {
            this.m = null;
        } else {
            this.m = offset.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.l.add(list.get(i2).a());
        }
        layer.k(this.k);
        layer.k(this.j);
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            layer.k(this.l.get(i3));
        }
        b.a.a.s.c.a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            layer.k(aVar2);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.l.get(i4).a(this);
        }
        b.a.a.s.c.a<?, Float> aVar3 = this.m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        this.f1960e.invalidateSelf();
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        s trimPathContentBefore = null;
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            c content = list.get(i2);
            if ((content instanceof s) && ((s) content).k() == q.a.INDIVIDUALLY) {
                trimPathContentBefore = (s) content;
            }
        }
        if (trimPathContentBefore != null) {
            trimPathContentBefore.d(this);
        }
        b currentPathGroup = null;
        for (int i3 = list2.size() - 1; i3 >= 0; i3--) {
            c content2 = list2.get(i3);
            if ((content2 instanceof s) && ((s) content2).k() == q.a.INDIVIDUALLY) {
                if (currentPathGroup != null) {
                    this.f1962g.add(currentPathGroup);
                }
                currentPathGroup = new b((s) content2);
                ((s) content2).d(this);
            } else if (content2 instanceof m) {
                if (currentPathGroup == null) {
                    currentPathGroup = new b(trimPathContentBefore);
                }
                currentPathGroup.f1963a.add((m) content2);
            }
        }
        if (currentPathGroup != null) {
            this.f1962g.add(currentPathGroup);
        }
    }

    @Override // b.a.a.s.b.e
    public void g(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        c.a("StrokeContent#draw");
        if (h.h(parentMatrix)) {
            c.b("StrokeContent#draw");
            return;
        }
        this.i.setAlpha(g.c((int) ((((((float) parentAlpha) / 255.0f) * ((float) ((e) this.k).o())) / 100.0f) * 255.0f), 0, 255));
        this.i.setStrokeWidth(((b.a.a.s.c.c) this.j).o() * h.g(parentMatrix));
        if (this.i.getStrokeWidth() <= 0.0f) {
            c.b("StrokeContent#draw");
            return;
        }
        d(parentMatrix);
        b.a.a.s.c.a<ColorFilter, ColorFilter> aVar = this.n;
        if (aVar != null) {
            this.i.setColorFilter(aVar.h());
        }
        for (int i2 = 0; i2 < this.f1962g.size(); i2++) {
            b pathGroup = this.f1962g.get(i2);
            if (pathGroup.f1964b != null) {
                j(canvas, pathGroup, parentMatrix);
            } else {
                c.a("StrokeContent#buildPath");
                this.f1957b.reset();
                for (int j2 = pathGroup.f1963a.size() - 1; j2 >= 0; j2--) {
                    this.f1957b.addPath(((m) pathGroup.f1963a.get(j2)).h(), parentMatrix);
                }
                c.b("StrokeContent#buildPath");
                c.a("StrokeContent#drawPath");
                canvas.drawPath(this.f1957b, this.i);
                c.b("StrokeContent#drawPath");
            }
        }
        c.b("StrokeContent#draw");
    }

    public final void j(Canvas canvas, b pathGroup, Matrix parentMatrix) {
        float startValue;
        float endValue;
        float startValue2;
        c.a("StrokeContent#applyTrimPath");
        if (pathGroup.f1964b == null) {
            c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f1957b.reset();
        for (int j2 = pathGroup.f1963a.size() - 1; j2 >= 0; j2--) {
            this.f1957b.addPath(((m) pathGroup.f1963a.get(j2)).h(), parentMatrix);
        }
        this.f1956a.setPath(this.f1957b, false);
        float totalLength = this.f1956a.getLength();
        while (this.f1956a.nextContour()) {
            totalLength += this.f1956a.getLength();
        }
        float offsetLength = (pathGroup.f1964b.f().h().floatValue() * totalLength) / 360.0f;
        float startLength = ((pathGroup.f1964b.j().h().floatValue() * totalLength) / 100.0f) + offsetLength;
        float endLength = ((pathGroup.f1964b.e().h().floatValue() * totalLength) / 100.0f) + offsetLength;
        float currentLength = 0.0f;
        for (int j3 = pathGroup.f1963a.size() - 1; j3 >= 0; j3--) {
            this.f1958c.set(((m) pathGroup.f1963a.get(j3)).h());
            this.f1958c.transform(parentMatrix);
            this.f1956a.setPath(this.f1958c, false);
            float length = this.f1956a.getLength();
            if (endLength > totalLength && endLength - totalLength < currentLength + length && currentLength < endLength - totalLength) {
                if (startLength > totalLength) {
                    startValue2 = (startLength - totalLength) / length;
                } else {
                    startValue2 = 0.0f;
                }
                h.a(this.f1958c, startValue2, Math.min((endLength - totalLength) / length, 1.0f), 0.0f);
                canvas.drawPath(this.f1958c, this.i);
            } else if (currentLength + length >= startLength && currentLength <= endLength) {
                if (currentLength + length > endLength || startLength >= currentLength) {
                    if (startLength < currentLength) {
                        startValue = 0.0f;
                    } else {
                        startValue = (startLength - currentLength) / length;
                    }
                    if (endLength > currentLength + length) {
                        endValue = 1.0f;
                    } else {
                        endValue = (endLength - currentLength) / length;
                    }
                    h.a(this.f1958c, startValue, endValue, 0.0f);
                    canvas.drawPath(this.f1958c, this.i);
                } else {
                    canvas.drawPath(this.f1958c, this.i);
                }
            }
            currentLength += length;
        }
        c.b("StrokeContent#applyTrimPath");
    }

    @Override // b.a.a.s.b.e
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        c.a("StrokeContent#getBounds");
        this.f1957b.reset();
        for (int i2 = 0; i2 < this.f1962g.size(); i2++) {
            b pathGroup = this.f1962g.get(i2);
            for (int j2 = 0; j2 < pathGroup.f1963a.size(); j2++) {
                this.f1957b.addPath(((m) pathGroup.f1963a.get(j2)).h(), parentMatrix);
            }
        }
        this.f1957b.computeBounds(this.f1959d, false);
        float width = ((b.a.a.s.c.c) this.j).o();
        RectF rectF = this.f1959d;
        rectF.set(rectF.left - (width / 2.0f), rectF.top - (width / 2.0f), rectF.right + (width / 2.0f), rectF.bottom + (width / 2.0f));
        outBounds.set(this.f1959d);
        outBounds.set(outBounds.left - 1.0f, outBounds.top - 1.0f, outBounds.right + 1.0f, outBounds.bottom + 1.0f);
        c.b("StrokeContent#getBounds");
    }

    public final void d(Matrix parentMatrix) {
        c.a("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            c.b("StrokeContent#applyDashPattern");
            return;
        }
        float scale = h.g(parentMatrix);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.h[i2] = this.l.get(i2).h().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.h;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.h;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
            float[] fArr3 = this.h;
            fArr3[i2] = fArr3[i2] * scale;
        }
        b.a.a.s.c.a<?, Float> aVar = this.m;
        this.i.setPathEffect(new DashPathEffect(this.h, aVar == null ? 0.0f : aVar.h().floatValue() * scale));
        c.b("StrokeContent#applyDashPattern");
    }

    @Override // b.a.a.u.f
    public void e(b.a.a.u.e keyPath, int depth, List<b.a.a.u.e> list, b.a.a.u.e currentPartialKeyPath) {
        g.l(keyPath, depth, list, currentPartialKeyPath, this);
    }

    @Override // b.a.a.u.f
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        if (property == k.f1936d) {
            this.k.m(cVar);
        } else if (property == k.o) {
            this.j.m(cVar);
        } else if (property == k.C) {
            b.a.a.s.c.a<ColorFilter, ColorFilter> aVar = this.n;
            if (aVar != null) {
                this.f1961f.E(aVar);
            }
            if (cVar == null) {
                this.n = null;
                return;
            }
            p pVar = new p(cVar);
            this.n = pVar;
            pVar.a(this);
            this.f1961f.k(this.n);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<m> f1963a;

        /* renamed from: b  reason: collision with root package name */
        public final s f1964b;

        public b(s trimPath) {
            this.f1963a = new ArrayList();
            this.f1964b = trimPath;
        }
    }
}
