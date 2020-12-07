package b.a.a.u.j;

import android.graphics.PointF;
import b.a.a.s.c.i;
import b.a.a.s.c.j;
import b.a.a.y.a;
import java.util.List;

public class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<PointF>> f2101a;

    public e(List<a<PointF>> list) {
        this.f2101a = list;
    }

    @Override // b.a.a.u.j.m
    public List<a<PointF>> b() {
        return this.f2101a;
    }

    @Override // b.a.a.u.j.m
    public boolean c() {
        return this.f2101a.size() == 1 && this.f2101a.get(0).h();
    }

    @Override // b.a.a.u.j.m
    public b.a.a.s.c.a<PointF, PointF> a() {
        if (this.f2101a.get(0).h()) {
            return new j(this.f2101a);
        }
        return new i(this.f2101a);
    }
}
