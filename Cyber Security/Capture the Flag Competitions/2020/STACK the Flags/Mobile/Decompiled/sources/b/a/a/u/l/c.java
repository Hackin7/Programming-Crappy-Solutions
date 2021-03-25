package b.a.a.u.l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import b.a.a.f;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.s.c.p;
import b.a.a.x.h;

public class c extends a {
    public a<ColorFilter, ColorFilter> A;
    public final Paint x = new b.a.a.s.a(3);
    public final Rect y = new Rect();
    public final Rect z = new Rect();

    public c(f lottieDrawable, d layerModel) {
        super(lottieDrawable, layerModel);
    }

    @Override // b.a.a.u.l.a
    public void v(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        Bitmap bitmap = L();
        if (bitmap != null && !bitmap.isRecycled()) {
            float density = h.e();
            this.x.setAlpha(parentAlpha);
            a<ColorFilter, ColorFilter> aVar = this.A;
            if (aVar != null) {
                this.x.setColorFilter(aVar.h());
            }
            canvas.save();
            canvas.concat(parentMatrix);
            this.y.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.z.set(0, 0, (int) (((float) bitmap.getWidth()) * density), (int) (((float) bitmap.getHeight()) * density));
            canvas.drawBitmap(bitmap, this.y, this.z, this.x);
            canvas.restore();
        }
    }

    @Override // b.a.a.s.b.e, b.a.a.u.l.a
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        super.a(outBounds, parentMatrix, applyParents);
        Bitmap bitmap = L();
        if (bitmap != null) {
            outBounds.set(0.0f, 0.0f, ((float) bitmap.getWidth()) * h.e(), ((float) bitmap.getHeight()) * h.e());
            this.m.mapRect(outBounds);
        }
    }

    public final Bitmap L() {
        return this.n.q(this.o.k());
    }

    @Override // b.a.a.u.l.a, b.a.a.u.f
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        super.f(property, cVar);
        if (property != k.C) {
            return;
        }
        if (cVar == null) {
            this.A = null;
        } else {
            this.A = new p(cVar);
        }
    }
}
