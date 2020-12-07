package b.a.a.s.c;

import android.graphics.Path;
import android.graphics.PointF;
import b.a.a.d;
import b.a.a.y.a;

public class h extends a<PointF> {
    public Path o;
    public final a<PointF> p;

    public h(d composition, a<PointF> aVar) {
        super(composition, aVar.f2333b, aVar.f2334c, aVar.f2335d, aVar.f2336e, aVar.f2337f);
        this.p = aVar;
        i();
    }

    public void i() {
        T t;
        T t2 = this.f2334c;
        boolean equals = (t2 == null || (t = this.f2333b) == null || !t.equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.f2334c;
        if (t3 != null && !equals) {
            a<PointF> aVar = this.p;
            this.o = b.a.a.x.h.d(this.f2333b, t3, aVar.m, aVar.n);
        }
    }

    public Path j() {
        return this.o;
    }
}
