package b.a.a.s.c;

import b.a.a.x.g;
import b.a.a.y.a;
import b.a.a.y.c;
import java.util.List;

public class e extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    /* renamed from: q */
    public Integer i(a<Integer> aVar, float keyframeProgress) {
        return Integer.valueOf(p(aVar, keyframeProgress));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    public int p(a<Integer> aVar, float keyframeProgress) {
        Integer value;
        if (aVar.f2333b == null || aVar.f2334c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c<A> cVar = this.f2039e;
        if (cVar == null || (value = cVar.b(aVar.f2336e, aVar.f2337f.floatValue(), aVar.f2333b, aVar.f2334c, keyframeProgress, e(), f())) == null) {
            return g.k(aVar.g(), aVar.d(), keyframeProgress);
        }
        return value.intValue();
    }

    public int o() {
        return p(b(), d());
    }
}
