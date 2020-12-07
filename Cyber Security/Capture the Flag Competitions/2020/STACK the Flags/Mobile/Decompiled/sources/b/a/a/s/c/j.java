package b.a.a.s.c;

import android.graphics.PointF;
import b.a.a.y.a;
import b.a.a.y.c;
import java.util.List;

public class j extends f<PointF> {
    public final PointF i = new PointF();

    public j(List<a<PointF>> list) {
        super(list);
    }

    /* renamed from: o */
    public PointF i(a<PointF> aVar, float keyframeProgress) {
        T t;
        PointF value;
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
        PointF value2 = this.i;
        float f2 = ((PointF) t3).x;
        float f3 = f2 + ((((PointF) t4).x - f2) * keyframeProgress);
        float f4 = ((PointF) t3).y;
        value2.set(f3, f4 + ((((PointF) t4).y - f4) * keyframeProgress));
        return this.i;
    }
}
