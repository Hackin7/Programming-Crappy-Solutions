package a.l.a.a;

import android.view.animation.Interpolator;

public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f1169a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1170b;

    public d(float[] values) {
        this.f1169a = values;
        this.f1170b = 1.0f / ((float) (values.length - 1));
    }

    public float getInterpolation(float input) {
        if (input >= 1.0f) {
            return 1.0f;
        }
        if (input <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1169a;
        int position = Math.min((int) (((float) (fArr.length - 1)) * input), fArr.length - 2);
        float f2 = this.f1170b;
        float[] fArr2 = this.f1169a;
        return fArr2[position] + ((fArr2[position + 1] - fArr2[position]) * ((input - (((float) position) * f2)) / f2));
    }
}
