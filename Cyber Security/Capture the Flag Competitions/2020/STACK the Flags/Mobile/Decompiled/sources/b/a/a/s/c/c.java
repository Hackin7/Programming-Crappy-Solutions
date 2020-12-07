package b.a.a.s.c;

import b.a.a.x.g;
import b.a.a.y.a;
import java.util.List;

public class c extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    /* renamed from: q */
    public Float i(a<Float> aVar, float keyframeProgress) {
        return Float.valueOf(p(aVar, keyframeProgress));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    public float p(a<Float> aVar, float keyframeProgress) {
        Float value;
        if (aVar.f2333b == null || aVar.f2334c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        b.a.a.y.c<A> cVar = this.f2039e;
        if (cVar == null || (value = cVar.b(aVar.f2336e, aVar.f2337f.floatValue(), aVar.f2333b, aVar.f2334c, keyframeProgress, e(), f())) == null) {
            return g.j(aVar.f(), aVar.c(), keyframeProgress);
        }
        return value.floatValue();
    }

    public float o() {
        return p(b(), d());
    }
}
