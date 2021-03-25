package b.a.a.s.c;

import b.a.a.x.g;
import b.a.a.y.a;
import b.a.a.y.c;
import java.util.List;

public class b extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    /* renamed from: q */
    public Integer i(a<Integer> aVar, float keyframeProgress) {
        return Integer.valueOf(p(aVar, keyframeProgress));
    }

    public int p(a<Integer> aVar, float keyframeProgress) {
        Integer value;
        T t = aVar.f2333b;
        if (t == null || aVar.f2334c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int startColor = t.intValue();
        int endColor = aVar.f2334c.intValue();
        c<A> cVar = this.f2039e;
        if (cVar == null || (value = cVar.b(aVar.f2336e, aVar.f2337f.floatValue(), (A) Integer.valueOf(startColor), (A) Integer.valueOf(endColor), keyframeProgress, e(), f())) == null) {
            return b.a.a.x.b.c(g.b(keyframeProgress, 0.0f, 1.0f), startColor, endColor);
        }
        return value.intValue();
    }

    public int o() {
        return p(b(), d());
    }
}
