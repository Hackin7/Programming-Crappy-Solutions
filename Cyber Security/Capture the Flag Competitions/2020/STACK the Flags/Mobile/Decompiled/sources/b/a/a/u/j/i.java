package b.a.a.u.j;

import android.graphics.PointF;
import b.a.a.s.c.m;
import b.a.a.y.a;
import java.util.List;

public class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f2102a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2103b;

    public i(b animatableXDimension, b animatableYDimension) {
        this.f2102a = animatableXDimension;
        this.f2103b = animatableYDimension;
    }

    @Override // b.a.a.u.j.m
    public List<a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // b.a.a.u.j.m
    public boolean c() {
        return this.f2102a.c() && this.f2103b.c();
    }

    @Override // b.a.a.u.j.m
    public b.a.a.s.c.a<PointF, PointF> a() {
        return new m(this.f2102a.a(), this.f2103b.a());
    }
}
