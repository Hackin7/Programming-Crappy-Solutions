package b.a.a.u.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import b.a.a.f;

public class e extends a {
    public e(f lottieDrawable, d layerModel) {
        super(lottieDrawable, layerModel);
    }

    @Override // b.a.a.u.l.a
    public void v(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
    }

    @Override // b.a.a.s.b.e, b.a.a.u.l.a
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        super.a(outBounds, parentMatrix, applyParents);
        outBounds.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
