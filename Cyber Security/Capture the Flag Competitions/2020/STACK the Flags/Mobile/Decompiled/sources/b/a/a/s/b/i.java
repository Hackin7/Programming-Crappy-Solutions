package b.a.a.s.b;

import a.e.d;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.s.c.p;
import b.a.a.u.k.c;
import b.a.a.u.k.e;
import b.a.a.u.k.f;

public class i extends a {
    public final String o;
    public final boolean p;
    public final d<LinearGradient> q = new d<>();
    public final d<RadialGradient> r = new d<>();
    public final RectF s = new RectF();
    public final f t;
    public final int u;
    public final a<c, c> v;
    public final a<PointF, PointF> w;
    public final a<PointF, PointF> x;
    public p y;

    public i(b.a.a.f lottieDrawable, b.a.a.u.l.a layer, e stroke) {
        super(lottieDrawable, layer, stroke.b().a(), stroke.g().a(), stroke.i(), stroke.k(), stroke.m(), stroke.h(), stroke.c());
        this.o = stroke.j();
        this.t = stroke.f();
        this.p = stroke.n();
        this.u = (int) (lottieDrawable.m().d() / 32.0f);
        a<c, c> a2 = stroke.e().a();
        this.v = a2;
        a2.a(this);
        layer.k(this.v);
        a<PointF, PointF> a3 = stroke.l().a();
        this.w = a3;
        a3.a(this);
        layer.k(this.w);
        a<PointF, PointF> a4 = stroke.d().a();
        this.x = a4;
        a4.a(this);
        layer.k(this.x);
    }

    @Override // b.a.a.s.b.e, b.a.a.s.b.a
    public void g(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        Shader shader;
        if (!this.p) {
            a(this.s, parentMatrix, false);
            if (this.t == f.LINEAR) {
                shader = m();
            } else {
                shader = n();
            }
            shader.setLocalMatrix(parentMatrix);
            this.i.setShader(shader);
            super.g(canvas, parentMatrix, parentAlpha);
        }
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.o;
    }

    public final LinearGradient m() {
        int gradientHash = l();
        LinearGradient gradient = this.q.f((long) gradientHash);
        if (gradient != null) {
            return gradient;
        }
        PointF startPoint = this.w.h();
        PointF endPoint = this.x.h();
        c gradientColor = this.v.h();
        LinearGradient gradient2 = new LinearGradient(startPoint.x, startPoint.y, endPoint.x, endPoint.y, k(gradientColor.a()), gradientColor.b(), Shader.TileMode.CLAMP);
        this.q.j((long) gradientHash, gradient2);
        return gradient2;
    }

    public final RadialGradient n() {
        int gradientHash = l();
        RadialGradient gradient = this.r.f((long) gradientHash);
        if (gradient != null) {
            return gradient;
        }
        PointF startPoint = this.w.h();
        PointF endPoint = this.x.h();
        c gradientColor = this.v.h();
        int[] colors = k(gradientColor.a());
        float[] positions = gradientColor.b();
        float x0 = startPoint.x;
        float y0 = startPoint.y;
        RadialGradient gradient2 = new RadialGradient(x0, y0, (float) Math.hypot((double) (endPoint.x - x0), (double) (endPoint.y - y0)), colors, positions, Shader.TileMode.CLAMP);
        this.r.j((long) gradientHash, gradient2);
        return gradient2;
    }

    public final int l() {
        int startPointProgress = Math.round(this.w.f() * ((float) this.u));
        int endPointProgress = Math.round(this.x.f() * ((float) this.u));
        int colorProgress = Math.round(this.v.f() * ((float) this.u));
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

    public final int[] k(int[] colors) {
        p pVar = this.y;
        if (pVar != null) {
            Integer[] dynamicColors = (Integer[]) pVar.h();
            if (colors.length == dynamicColors.length) {
                for (int i = 0; i < colors.length; i++) {
                    colors[i] = dynamicColors[i].intValue();
                }
            } else {
                colors = new int[dynamicColors.length];
                for (int i2 = 0; i2 < dynamicColors.length; i2++) {
                    colors[i2] = dynamicColors[i2].intValue();
                }
            }
        }
        return colors;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.a.a.u.f, b.a.a.s.b.a
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        super.f(property, cVar);
        if (property == k.D) {
            p pVar = this.y;
            if (pVar != null) {
                this.f1961f.E(pVar);
            }
            if (cVar == null) {
                this.y = null;
                return;
            }
            p pVar2 = new p(cVar);
            this.y = pVar2;
            pVar2.a(this);
            this.f1961f.k(this.y);
        }
    }
}
