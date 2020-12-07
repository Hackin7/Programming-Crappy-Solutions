package b.a.a.u.k;

import android.graphics.PointF;
import b.a.a.u.a;
import b.a.a.x.d;
import b.a.a.x.g;
import java.util.ArrayList;
import java.util.List;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f2179a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f2180b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2181c;

    public l(PointF initialPoint, boolean closed, List<a> list) {
        this.f2180b = initialPoint;
        this.f2181c = closed;
        this.f2179a = new ArrayList(list);
    }

    public l() {
        this.f2179a = new ArrayList();
    }

    public final void e(float x, float y) {
        if (this.f2180b == null) {
            this.f2180b = new PointF();
        }
        this.f2180b.set(x, y);
    }

    public PointF b() {
        return this.f2180b;
    }

    public boolean d() {
        return this.f2181c;
    }

    public List<a> a() {
        return this.f2179a;
    }

    public void c(l shapeData1, l shapeData2, float percentage) {
        if (this.f2180b == null) {
            this.f2180b = new PointF();
        }
        this.f2181c = shapeData1.d() || shapeData2.d();
        if (shapeData1.a().size() != shapeData2.a().size()) {
            d.c("Curves must have the same number of control points. Shape 1: " + shapeData1.a().size() + "\tShape 2: " + shapeData2.a().size());
        }
        int points = Math.min(shapeData1.a().size(), shapeData2.a().size());
        if (this.f2179a.size() < points) {
            for (int i = this.f2179a.size(); i < points; i++) {
                this.f2179a.add(new a());
            }
        } else if (this.f2179a.size() > points) {
            for (int i2 = this.f2179a.size() - 1; i2 >= points; i2--) {
                List<a> list = this.f2179a;
                list.remove(list.size() - 1);
            }
        }
        PointF initialPoint1 = shapeData1.b();
        PointF initialPoint2 = shapeData2.b();
        e(g.j(initialPoint1.x, initialPoint2.x, percentage), g.j(initialPoint1.y, initialPoint2.y, percentage));
        int i3 = this.f2179a.size() - 1;
        while (i3 >= 0) {
            a curve1 = shapeData1.a().get(i3);
            a curve2 = shapeData2.a().get(i3);
            PointF cp11 = curve1.a();
            PointF cp21 = curve1.b();
            PointF vertex1 = curve1.c();
            PointF cp12 = curve2.a();
            PointF cp22 = curve2.b();
            PointF vertex2 = curve2.c();
            this.f2179a.get(i3).d(g.j(cp11.x, cp12.x, percentage), g.j(cp11.y, cp12.y, percentage));
            this.f2179a.get(i3).e(g.j(cp21.x, cp22.x, percentage), g.j(cp21.y, cp22.y, percentage));
            this.f2179a.get(i3).f(g.j(vertex1.x, vertex2.x, percentage), g.j(vertex1.y, vertex2.y, percentage));
            i3--;
            points = points;
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f2179a.size() + "closed=" + this.f2181c + '}';
    }
}
