package b.a.a.s.c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import b.a.a.y.a;
import b.a.a.y.c;
import java.util.List;

public class i extends f<PointF> {
    public final PointF i = new PointF();
    public final float[] j = new float[2];
    public h k;
    public PathMeasure l = new PathMeasure();

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.Object] */
    /* renamed from: o */
    public PointF i(a<PointF> aVar, float keyframeProgress) {
        PointF value;
        h pathKeyframe = (h) aVar;
        Path path = pathKeyframe.j();
        if (path == null) {
            return aVar.f2333b;
        }
        c<A> cVar = this.f2039e;
        if (cVar != null && (value = cVar.b(pathKeyframe.f2336e, pathKeyframe.f2337f.floatValue(), pathKeyframe.f2333b, pathKeyframe.f2334c, e(), keyframeProgress, f())) != null) {
            return value;
        }
        if (this.k != pathKeyframe) {
            this.l.setPath(path, false);
            this.k = pathKeyframe;
        }
        PathMeasure pathMeasure = this.l;
        pathMeasure.getPosTan(pathMeasure.getLength() * keyframeProgress, this.j, null);
        PointF pointF = this.i;
        float[] fArr = this.j;
        pointF.set(fArr[0], fArr[1]);
        return this.i;
    }
}
