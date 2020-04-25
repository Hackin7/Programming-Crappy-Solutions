package p000;

import android.view.animation.Interpolator;

/* renamed from: ii */
abstract class C0515ii implements Interpolator {

    /* renamed from: a */
    private final float[] f2197a;

    /* renamed from: b */
    private final float f2198b = (1.0f / ((float) (this.f2197a.length - 1)));

    protected C0515ii(float[] fArr) {
        this.f2197a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f2197a.length - 1)) * f), this.f2197a.length - 2);
        return this.f2197a[min] + (((f - (((float) min) * this.f2198b)) / this.f2198b) * (this.f2197a[min + 1] - this.f2197a[min]));
    }
}
