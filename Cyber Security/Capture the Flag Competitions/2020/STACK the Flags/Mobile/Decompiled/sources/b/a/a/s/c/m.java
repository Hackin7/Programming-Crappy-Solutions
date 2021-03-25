package b.a.a.s.c;

import android.graphics.PointF;
import b.a.a.y.a;
import java.util.Collections;

public class m extends a<PointF, PointF> {
    public final PointF i = new PointF();
    public final a<Float, Float> j;
    public final a<Float, Float> k;

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.a.a.y.a, float] */
    @Override // b.a.a.s.c.a
    public /* bridge */ /* synthetic */ PointF i(a<PointF> aVar, float f2) {
        return p();
    }

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.j = aVar;
        this.k = aVar2;
        l(f());
    }

    @Override // b.a.a.s.c.a
    public void l(float progress) {
        this.j.l(progress);
        this.k.l(progress);
        this.i.set(this.j.h().floatValue(), this.k.h().floatValue());
        for (int i2 = 0; i2 < this.f2035a.size(); i2++) {
            this.f2035a.get(i2).b();
        }
    }

    /* renamed from: o */
    public PointF h() {
        return p();
    }

    /* JADX WARN: Incorrect args count in method signature: (Lb/a/a/y/a<Landroid/graphics/PointF;>;F)Landroid/graphics/PointF; */
    public PointF p() {
        return this.i;
    }
}
