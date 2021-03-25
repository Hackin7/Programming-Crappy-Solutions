package b.d.a.a.k;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2545a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f2546b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f2547c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
        startValue.getValues(this.f2545a);
        endValue.getValues(this.f2546b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f2546b;
            float f2 = fArr[i];
            float[] fArr2 = this.f2545a;
            fArr[i] = fArr2[i] + (fraction * (f2 - fArr2[i]));
        }
        this.f2547c.setValues(this.f2546b);
        return this.f2547c;
    }
}
