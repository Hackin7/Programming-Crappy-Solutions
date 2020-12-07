package b.b.a.e;

import android.graphics.Path;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Path f2375a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public float f2376b;

    /* renamed from: c  reason: collision with root package name */
    public float f2377c;

    /* renamed from: d  reason: collision with root package name */
    public float f2378d;

    /* renamed from: e  reason: collision with root package name */
    public float f2379e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2380f;

    public e(float waveCenterY, float waveHorRadius, float waveVertRadius, float sideWidth, int swipeDirection) {
        this.f2376b = waveCenterY;
        this.f2377c = waveHorRadius;
        this.f2378d = waveVertRadius;
        this.f2379e = sideWidth;
        this.f2380f = swipeDirection;
    }

    public final Path a() {
        return this.f2375a;
    }

    public final void b(float width, float height) {
        Path path = new Path();
        this.f2375a = path;
        float f2 = this.f2379e;
        float maskWidth = width - f2;
        path.moveTo(maskWidth - f2, 0.0f);
        if (this.f2380f == b.f2369c.c()) {
            this.f2375a.lineTo(0.0f, 0.0f);
            this.f2375a.lineTo(0.0f, height);
        } else {
            this.f2375a.lineTo(width, 0.0f);
            this.f2375a.lineTo(width, height);
        }
        this.f2375a.lineTo(maskWidth, height);
        float curveStartY = this.f2376b + this.f2378d;
        this.f2375a.lineTo(maskWidth, curveStartY);
        Path path2 = this.f2375a;
        float f3 = this.f2378d;
        float f4 = this.f2377c;
        path2.cubicTo(maskWidth, curveStartY - (0.13461947f * f3), maskWidth - (0.053413395f * f4), curveStartY - (0.24127796f * f3), maskWidth - (f4 * 0.15615015f), curveStartY - (f3 * 0.33223742f));
        Path path3 = this.f2375a;
        float f5 = this.f2377c;
        float f6 = this.f2378d;
        path3.cubicTo(maskWidth - (0.23616591f * f5), curveStartY - (0.40308052f * f6), maskWidth - (0.33052856f * f5), curveStartY - (0.45611933f * f6), maskWidth - (f5 * 0.5012485f), curveStartY - (f6 * 0.5350577f));
        Path path4 = this.f2375a;
        float f7 = this.f2377c;
        float f8 = this.f2378d;
        path4.cubicTo(maskWidth - (0.51587814f * f7), curveStartY - (0.54182225f * f8), maskWidth - (0.56641346f * f7), curveStartY - (0.565035f * f8), maskWidth - (f7 * 0.5749349f), curveStartY - (f8 * 0.5689655f));
        Path path5 = this.f2375a;
        float f9 = this.f2377c;
        float f10 = this.f2378d;
        path5.cubicTo(maskWidth - (0.7283715f * f9), curveStartY - (0.63973874f * f10), maskWidth - (0.8086619f * f9), curveStartY - (0.6833457f * f10), maskWidth - (f9 * 0.8774032f), curveStartY - (f10 * 0.73990375f));
        Path path6 = this.f2375a;
        float f11 = this.f2377c;
        float f12 = this.f2378d;
        path6.cubicTo(maskWidth - (0.96534646f * f11), curveStartY - (0.8122605f * f12), maskWidth - f11, curveStartY - (0.89361835f * f12), maskWidth - f11, curveStartY - f12);
        Path path7 = this.f2375a;
        float f13 = this.f2377c;
        float f14 = this.f2378d;
        path7.cubicTo(maskWidth - f13, curveStartY - (1.1001428f * f14), maskWidth - (0.95957464f * f13), curveStartY - (1.1887991f * f14), maskWidth - (f13 * 0.86084116f), curveStartY - (f14 * 1.2704844f));
        Path path8 = this.f2375a;
        float f15 = this.f2377c;
        float f16 = this.f2378d;
        path8.cubicTo(maskWidth - (0.78521234f * f15), curveStartY - (1.3330544f * f16), maskWidth - (0.70338213f * f15), curveStartY - (1.3795848f * f16), maskWidth - (f15 * 0.5291126f), curveStartY - (f16 * 1.4665103f));
        Path path9 = this.f2375a;
        float f17 = this.f2377c;
        float f18 = this.f2378d;
        path9.cubicTo(maskWidth - (0.52418584f * f17), curveStartY - (1.4689677f * f18), maskWidth - (0.50573915f * f17), curveStartY - (1.4781625f * f18), maskWidth - (f17 * 0.5015305f), curveStartY - (f18 * 1.4802616f));
        Path path10 = this.f2375a;
        float f19 = this.f2377c;
        float f20 = this.f2378d;
        path10.cubicTo(maskWidth - (0.3187486f * f19), curveStartY - (1.5714239f * f20), maskWidth - (0.2332057f * f19), curveStartY - (1.6204116f * f20), maskWidth - (f19 * 0.15411654f), curveStartY - (f20 * 1.687403f));
        Path path11 = this.f2375a;
        float f21 = maskWidth - (this.f2377c * 0.050993312f);
        float f22 = this.f2378d;
        path11.cubicTo(f21, curveStartY - (1.774752f * f22), maskWidth, curveStartY - (1.8709257f * f22), maskWidth, curveStartY - (f22 * ((float) 2)));
        this.f2375a.lineTo(maskWidth, 0.0f);
        this.f2375a.lineTo(maskWidth - this.f2379e, 0.0f);
        this.f2375a.close();
    }
}
