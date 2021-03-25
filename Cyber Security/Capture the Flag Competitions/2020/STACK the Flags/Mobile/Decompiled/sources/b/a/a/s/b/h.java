package b.a.a.s.b;

import a.e.d;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.s.c.p;
import b.a.a.u.e;
import b.a.a.u.k.c;
import b.a.a.u.k.f;
import b.a.a.x.g;
import java.util.ArrayList;
import java.util.List;

public class h implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f1987a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1988b;

    /* renamed from: c  reason: collision with root package name */
    public final b.a.a.u.l.a f1989c;

    /* renamed from: d  reason: collision with root package name */
    public final d<LinearGradient> f1990d = new d<>();

    /* renamed from: e  reason: collision with root package name */
    public final d<RadialGradient> f1991e = new d<>();

    /* renamed from: f  reason: collision with root package name */
    public final Path f1992f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final Paint f1993g = new b.a.a.s.a(1);
    public final RectF h = new RectF();
    public final List<m> i = new ArrayList();
    public final f j;
    public final a<c, c> k;
    public final a<Integer, Integer> l;
    public final a<PointF, PointF> m;
    public final a<PointF, PointF> n;
    public a<ColorFilter, ColorFilter> o;
    public p p;
    public final b.a.a.f q;
    public final int r;

    public h(b.a.a.f lottieDrawable, b.a.a.u.l.a layer, b.a.a.u.k.d fill) {
        this.f1989c = layer;
        this.f1987a = fill.f();
        this.f1988b = fill.i();
        this.q = lottieDrawable;
        this.j = fill.e();
        this.f1992f.setFillType(fill.c());
        this.r = (int) (lottieDrawable.m().d() / 32.0f);
        a<c, c> a2 = fill.d().a();
        this.k = a2;
        a2.a(this);
        layer.k(this.k);
        a<Integer, Integer> a3 = fill.g().a();
        this.l = a3;
        a3.a(this);
        layer.k(this.l);
        a<PointF, PointF> a4 = fill.h().a();
        this.m = a4;
        a4.a(this);
        layer.k(this.m);
        a<PointF, PointF> a5 = fill.b().a();
        this.n = a5;
        a5.a(this);
        layer.k(this.n);
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        this.q.invalidateSelf();
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            c content = list2.get(i2);
            if (content instanceof m) {
                this.i.add((m) content);
            }
        }
    }

    @Override // b.a.a.s.b.e
    public void g(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        Shader shader;
        if (!this.f1988b) {
            b.a.a.c.a("GradientFillContent#draw");
            this.f1992f.reset();
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                this.f1992f.addPath(this.i.get(i2).h(), parentMatrix);
            }
            this.f1992f.computeBounds(this.h, false);
            if (this.j == f.LINEAR) {
                shader = k();
            } else {
                shader = l();
            }
            shader.setLocalMatrix(parentMatrix);
            this.f1993g.setShader(shader);
            a<ColorFilter, ColorFilter> aVar = this.o;
            if (aVar != null) {
                this.f1993g.setColorFilter(aVar.h());
            }
            this.f1993g.setAlpha(g.c((int) ((((((float) parentAlpha) / 255.0f) * ((float) this.l.h().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f1992f, this.f1993g);
            b.a.a.c.b("GradientFillContent#draw");
        }
    }

    @Override // b.a.a.s.b.e
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        this.f1992f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f1992f.addPath(this.i.get(i2).h(), parentMatrix);
        }
        this.f1992f.computeBounds(outBounds, false);
        outBounds.set(outBounds.left - 1.0f, outBounds.top - 1.0f, outBounds.right + 1.0f, outBounds.bottom + 1.0f);
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f1987a;
    }

    public final LinearGradient k() {
        int gradientHash = j();
        LinearGradient gradient = this.f1990d.f((long) gradientHash);
        if (gradient != null) {
            return gradient;
        }
        PointF startPoint = this.m.h();
        PointF endPoint = this.n.h();
        c gradientColor = this.k.h();
        LinearGradient gradient2 = new LinearGradient(startPoint.x, startPoint.y, endPoint.x, endPoint.y, d(gradientColor.a()), gradientColor.b(), Shader.TileMode.CLAMP);
        this.f1990d.j((long) gradientHash, gradient2);
        return gradient2;
    }

    public final RadialGradient l() {
        float r2;
        int gradientHash = j();
        RadialGradient gradient = this.f1991e.f((long) gradientHash);
        if (gradient != null) {
            return gradient;
        }
        PointF startPoint = this.m.h();
        PointF endPoint = this.n.h();
        c gradientColor = this.k.h();
        int[] colors = d(gradientColor.a());
        float[] positions = gradientColor.b();
        float x0 = startPoint.x;
        float y0 = startPoint.y;
        float r3 = (float) Math.hypot((double) (endPoint.x - x0), (double) (endPoint.y - y0));
        if (r3 <= 0.0f) {
            r2 = 0.001f;
        } else {
            r2 = r3;
        }
        RadialGradient gradient2 = new RadialGradient(x0, y0, r2, colors, positions, Shader.TileMode.CLAMP);
        this.f1991e.j((long) gradientHash, gradient2);
        return gradient2;
    }

    public final int j() {
        int startPointProgress = Math.round(this.m.f() * ((float) this.r));
        int endPointProgress = Math.round(this.n.f() * ((float) this.r));
        int colorProgress = Math.round(this.k.f() * ((float) this.r));
        int hash = 17;
        if (startPointProgress != 0) {
            hash = 17 * 31 * startPointProgress;
        }
        if (endPointProgress != 0) {
            hash = hash * 31 * endPointProgress;
        }
        if (colorProgress != 0) {
            return hash * 31 * colorProgress;
        }
        return hash;
    }

    public final int[] d(int[] colors) {
        p pVar = this.p;
        if (pVar != null) {
            Integer[] dynamicColors = (Integer[]) pVar.h();
            if (colors.length == dynamicColors.length) {
                for (int i2 = 0; i2 < colors.length; i2++) {
                    colors[i2] = dynamicColors[i2].intValue();
                }
            } else {
                colors = new int[dynamicColors.length];
                for (int i3 = 0; i3 < dynamicColors.length; i3++) {
                    colors[i3] = dynamicColors[i3].intValue();
                }
            }
        }
        return colors;
    }

    @Override // b.a.a.u.f
    public void e(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        g.l(keyPath, depth, list, currentPartialKeyPath, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.a.a.u.f
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        if (property == k.f1936d) {
            this.l.m(cVar);
        } else if (property == k.C) {
            a<ColorFilter, ColorFilter> aVar = this.o;
            if (aVar != null) {
                this.f1989c.E(aVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            p pVar = new p(cVar);
            this.o = pVar;
            pVar.a(this);
            this.f1989c.k(this.o);
        } else if (property == k.D) {
            p pVar2 = this.p;
            if (pVar2 != null) {
                this.f1989c.E(pVar2);
            }
            if (cVar == null) {
                this.p = null;
                return;
            }
            p pVar3 = new p(cVar);
            this.p = pVar3;
            pVar3.a(this);
            this.f1989c.k(this.p);
        }
    }
}
