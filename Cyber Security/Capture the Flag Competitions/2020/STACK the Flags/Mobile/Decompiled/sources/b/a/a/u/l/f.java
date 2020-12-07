package b.a.a.u.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import b.a.a.s.b.d;
import b.a.a.u.e;
import b.a.a.u.k.n;
import java.util.Collections;
import java.util.List;

public class f extends a {
    public final d x;

    public f(b.a.a.f lottieDrawable, d layerModel) {
        super(lottieDrawable, layerModel);
        d dVar = new d(lottieDrawable, this, new n("__container", layerModel.l(), false));
        this.x = dVar;
        dVar.c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // b.a.a.u.l.a
    public void v(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        this.x.g(canvas, parentMatrix, parentAlpha);
    }

    @Override // b.a.a.s.b.e, b.a.a.u.l.a
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        super.a(outBounds, parentMatrix, applyParents);
        this.x.a(outBounds, this.m, applyParents);
    }

    @Override // b.a.a.u.l.a
    public void F(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        this.x.e(keyPath, depth, list, currentPartialKeyPath);
    }
}
