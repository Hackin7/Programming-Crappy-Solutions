package b.a.a.s.b;

import android.graphics.Path;
import android.graphics.PointF;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.u.e;
import b.a.a.u.k.q;
import b.a.a.x.g;
import b.a.a.y.c;
import java.util.List;

public class f implements m, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f1973a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f1974b;

    /* renamed from: c  reason: collision with root package name */
    public final b.a.a.f f1975c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, PointF> f1976d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, PointF> f1977e;

    /* renamed from: f  reason: collision with root package name */
    public final b.a.a.u.k.a f1978f;

    /* renamed from: g  reason: collision with root package name */
    public b f1979g = new b();
    public boolean h;

    public f(b.a.a.f lottieDrawable, b.a.a.u.l.a layer, b.a.a.u.k.a circleShape) {
        this.f1974b = circleShape.b();
        this.f1975c = lottieDrawable;
        this.f1976d = circleShape.d().a();
        this.f1977e = circleShape.c().a();
        this.f1978f = circleShape;
        layer.k(this.f1976d);
        layer.k(this.f1977e);
        this.f1976d.a(this);
        this.f1977e.a(this);
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        d();
    }

    public final void d() {
        this.h = false;
        this.f1975c.invalidateSelf();
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c content = list.get(i);
            if ((content instanceof s) && ((s) content).k() == q.a.SIMULTANEOUSLY) {
                s trimPath = (s) content;
                this.f1979g.a(trimPath);
                trimPath.d(this);
            }
        }
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f1974b;
    }

    @Override // b.a.a.s.b.m
    public Path h() {
        if (this.h) {
            return this.f1973a;
        }
        this.f1973a.reset();
        if (this.f1978f.e()) {
            this.h = true;
            return this.f1973a;
        }
        PointF size = this.f1976d.h();
        float halfWidth = size.x / 2.0f;
        float halfHeight = size.y / 2.0f;
        float cpW = halfWidth * 0.55228f;
        float cpH = halfHeight * 0.55228f;
        this.f1973a.reset();
        if (this.f1978f.f()) {
            this.f1973a.moveTo(0.0f, -halfHeight);
            this.f1973a.cubicTo(0.0f - cpW, -halfHeight, -halfWidth, 0.0f - cpH, -halfWidth, 0.0f);
            this.f1973a.cubicTo(-halfWidth, cpH + 0.0f, 0.0f - cpW, halfHeight, 0.0f, halfHeight);
            this.f1973a.cubicTo(cpW + 0.0f, halfHeight, halfWidth, cpH + 0.0f, halfWidth, 0.0f);
            this.f1973a.cubicTo(halfWidth, 0.0f - cpH, cpW + 0.0f, -halfHeight, 0.0f, -halfHeight);
        } else {
            this.f1973a.moveTo(0.0f, -halfHeight);
            this.f1973a.cubicTo(cpW + 0.0f, -halfHeight, halfWidth, 0.0f - cpH, halfWidth, 0.0f);
            this.f1973a.cubicTo(halfWidth, cpH + 0.0f, cpW + 0.0f, halfHeight, 0.0f, halfHeight);
            this.f1973a.cubicTo(0.0f - cpW, halfHeight, -halfWidth, cpH + 0.0f, -halfWidth, 0.0f);
            this.f1973a.cubicTo(-halfWidth, 0.0f - cpH, 0.0f - cpW, -halfHeight, 0.0f, -halfHeight);
        }
        PointF position = this.f1977e.h();
        this.f1973a.offset(position.x, position.y);
        this.f1973a.close();
        this.f1979g.b(this.f1973a);
        this.h = true;
        return this.f1973a;
    }

    @Override // b.a.a.u.f
    public void e(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        g.l(keyPath, depth, list, currentPartialKeyPath, this);
    }

    @Override // b.a.a.u.f
    public <T> void f(T property, c<T> cVar) {
        if (property == k.f1939g) {
            this.f1976d.m(cVar);
        } else if (property == k.j) {
            this.f1977e.m(cVar);
        }
    }
}
