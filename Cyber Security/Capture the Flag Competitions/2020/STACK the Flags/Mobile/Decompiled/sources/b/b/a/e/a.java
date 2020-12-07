package b.b.a.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public float f2360a;

    /* renamed from: b  reason: collision with root package name */
    public float f2361b;

    /* renamed from: c  reason: collision with root package name */
    public float f2362c;

    /* renamed from: d  reason: collision with root package name */
    public float f2363d;

    /* renamed from: e  reason: collision with root package name */
    public float f2364e;

    /* renamed from: f  reason: collision with root package name */
    public float f2365f;

    /* renamed from: g  reason: collision with root package name */
    public float f2366g;
    public float h;

    public a(float viewWidth, float viewHeight, float density) {
        this.f2365f = viewWidth;
        this.f2366g = viewHeight;
        this.h = density;
        this.f2360a = 48.0f * density;
        this.f2361b = 0.8f * viewWidth;
        this.f2362c = 82.0f * density;
        this.f2363d = 0.9f * viewHeight;
        this.f2364e = 15.0f * density;
    }

    public final float a(float progress) {
        if (progress <= 0.1f) {
            return 1.0f;
        }
        if (progress >= 0.2f) {
            return 0.0f;
        }
        return 1.0f - ((progress - 0.1f) / (0.2f - 0.1f));
    }

    public final float c(float progress) {
        if (progress <= ((float) 0)) {
            return this.f2360a;
        }
        if (progress >= ((float) 1)) {
            return 0.0f;
        }
        if (progress <= 0.4f) {
            float f2 = this.f2360a;
            return f2 + ((progress / 0.4f) * (this.f2361b - f2));
        }
        double t = ((double) (progress - 0.4f)) / (1.0d - ((double) 0.4f));
        double d2 = (double) 2;
        double beta = 40.0d / (d2 * 9.8d);
        double omega = Math.pow((-Math.pow(beta, d2)) + Math.pow(50.0d / 9.8d, d2), 0.5d);
        return (float) (Math.exp((-beta) * t) * ((double) this.f2361b) * Math.cos(omega * t));
    }

    public final float d(float progress) {
        if (progress <= ((float) 0)) {
            return this.f2360a;
        }
        if (progress >= ((float) 1)) {
            return 0.0f;
        }
        if (progress <= 0.4f) {
            float f2 = this.f2360a;
            return f2 + ((progress / 0.4f) * f2);
        }
        double t = ((double) (progress - 0.4f)) / (1.0d - ((double) 0.4f));
        double beta = 40.0d / (9.8d * 2.0d);
        double omega = Math.pow((-Math.pow(beta, 2.0d)) + Math.pow(50.0d / 9.8d, 2.0d), 0.5d);
        return (float) (Math.exp((-beta) * t) * ((double) this.f2360a) * 2.0d * Math.cos(omega * t));
    }

    public final float e(float progress) {
        if (progress <= ((float) 0)) {
            return this.f2362c;
        }
        if (progress >= 0.4f) {
            return this.f2363d;
        }
        float f2 = this.f2362c;
        return f2 + (((this.f2363d - f2) * progress) / 0.4f);
    }

    public final float b(float progress) {
        if (progress <= 0.2f) {
            return this.f2364e;
        }
        if (progress >= 0.8f) {
            return this.f2365f;
        }
        float f2 = this.f2364e;
        return f2 + (((this.f2365f - f2) * (progress - 0.2f)) / (0.8f - 0.2f));
    }
}
