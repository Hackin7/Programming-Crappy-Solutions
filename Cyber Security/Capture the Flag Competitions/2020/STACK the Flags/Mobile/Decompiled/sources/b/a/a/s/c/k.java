package b.a.a.s.c;

import b.a.a.x.g;
import b.a.a.y.a;
import b.a.a.y.c;
import b.a.a.y.d;
import java.util.List;

public class k extends f<d> {
    public final d i = new d();

    public k(List<a<d>> list) {
        super(list);
    }

    /* renamed from: o */
    public d i(a<d> aVar, float keyframeProgress) {
        T t;
        d value;
        T t2 = aVar.f2333b;
        if (t2 == null || (t = aVar.f2334c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t3 = t2;
        T t4 = t;
        c<A> cVar = this.f2039e;
        if (cVar != null && (value = cVar.b(aVar.f2336e, aVar.f2337f.floatValue(), t3, t4, keyframeProgress, e(), f())) != null) {
            return value;
        }
        this.i.d(g.j(t3.b(), t4.b(), keyframeProgress), g.j(t3.c(), t4.c(), keyframeProgress));
        return this.i;
    }
}
