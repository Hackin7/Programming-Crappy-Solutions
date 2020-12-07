package b.a.a.u.l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b.a.a.f;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.s.c.p;
import b.a.a.y.c;

public class g extends a {
    public final Path A = new Path();
    public final d B;
    public a<ColorFilter, ColorFilter> C;
    public final RectF x = new RectF();
    public final Paint y = new b.a.a.s.a();
    public final float[] z = new float[8];

    public g(f lottieDrawable, d layerModel) {
        super(lottieDrawable, layerModel);
        this.B = layerModel;
        this.y.setAlpha(0);
        this.y.setStyle(Paint.Style.FILL);
        this.y.setColor(layerModel.m());
    }

    @Override // b.a.a.u.l.a
    public void v(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        int backgroundAlpha = Color.alpha(this.B.m());
        if (backgroundAlpha != 0) {
            int alpha = (int) ((((float) parentAlpha) / 255.0f) * (((((float) backgroundAlpha) / 255.0f) * ((float) (this.v.h() == null ? 100 : this.v.h().h().intValue()))) / 100.0f) * 255.0f);
            this.y.setAlpha(alpha);
            a<ColorFilter, ColorFilter> aVar = this.C;
            if (aVar != null) {
                this.y.setColorFilter(aVar.h());
            }
            if (alpha > 0) {
                float[] fArr = this.z;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.B.o();
                float[] fArr2 = this.z;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.B.o();
                this.z[5] = (float) this.B.n();
                float[] fArr3 = this.z;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.B.n();
                parentMatrix.mapPoints(this.z);
                this.A.reset();
                Path path = this.A;
                float[] fArr4 = this.z;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.A;
                float[] fArr5 = this.z;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.A;
                float[] fArr6 = this.z;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.A;
                float[] fArr7 = this.z;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.A;
                float[] fArr8 = this.z;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.A.close();
                canvas.drawPath(this.A, this.y);
            }
        }
    }

    @Override // b.a.a.s.b.e, b.a.a.u.l.a
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        super.a(outBounds, parentMatrix, applyParents);
        this.x.set(0.0f, 0.0f, (float) this.B.o(), (float) this.B.n());
        this.m.mapRect(this.x);
        outBounds.set(this.x);
    }

    @Override // b.a.a.u.l.a, b.a.a.u.f
    public <T> void f(T property, c<T> cVar) {
        super.f(property, cVar);
        if (property != k.C) {
            return;
        }
        if (cVar == null) {
            this.C = null;
        } else {
            this.C = new p(cVar);
        }
    }
}
