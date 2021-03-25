package b.a.a.u;

import android.graphics.PointF;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f2069a;

    /* renamed from: b  reason: collision with root package name */
    public final PointF f2070b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f2071c;

    public a() {
        this.f2069a = new PointF();
        this.f2070b = new PointF();
        this.f2071c = new PointF();
    }

    public a(PointF controlPoint1, PointF controlPoint2, PointF vertex) {
        this.f2069a = controlPoint1;
        this.f2070b = controlPoint2;
        this.f2071c = vertex;
    }

    public void d(float x, float y) {
        this.f2069a.set(x, y);
    }

    public PointF a() {
        return this.f2069a;
    }

    public void e(float x, float y) {
        this.f2070b.set(x, y);
    }

    public PointF b() {
        return this.f2070b;
    }

    public void f(float x, float y) {
        this.f2071c.set(x, y);
    }

    public PointF c() {
        return this.f2071c;
    }
}
