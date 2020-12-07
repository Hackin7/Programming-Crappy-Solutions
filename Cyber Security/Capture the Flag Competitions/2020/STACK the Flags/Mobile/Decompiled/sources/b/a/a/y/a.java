package b.a.a.y;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import b.a.a.d;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d f2332a;

    /* renamed from: b  reason: collision with root package name */
    public final T f2333b;

    /* renamed from: c  reason: collision with root package name */
    public T f2334c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f2335d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2336e;

    /* renamed from: f  reason: collision with root package name */
    public Float f2337f;

    /* renamed from: g  reason: collision with root package name */
    public float f2338g;
    public float h;
    public int i;
    public int j;
    public float k;
    public float l;
    public PointF m;
    public PointF n;

    public a(d composition, T startValue, T endValue, Interpolator interpolator, float startFrame, Float endFrame) {
        this.f2338g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.k = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.f2332a = composition;
        this.f2333b = startValue;
        this.f2334c = endValue;
        this.f2335d = interpolator;
        this.f2336e = startFrame;
        this.f2337f = endFrame;
    }

    public a(T value) {
        this.f2338g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.k = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.f2332a = null;
        this.f2333b = value;
        this.f2334c = value;
        this.f2335d = null;
        this.f2336e = Float.MIN_VALUE;
        this.f2337f = Float.valueOf(Float.MAX_VALUE);
    }

    public float e() {
        d dVar = this.f2332a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.k == Float.MIN_VALUE) {
            this.k = (this.f2336e - dVar.o()) / this.f2332a.e();
        }
        return this.k;
    }

    public float b() {
        if (this.f2332a == null) {
            return 1.0f;
        }
        if (this.l == Float.MIN_VALUE) {
            if (this.f2337f == null) {
                this.l = 1.0f;
            } else {
                this.l = e() + ((this.f2337f.floatValue() - this.f2336e) / this.f2332a.e());
            }
        }
        return this.l;
    }

    public boolean h() {
        return this.f2335d == null;
    }

    public boolean a(float progress) {
        return progress >= e() && progress < b();
    }

    public float f() {
        if (this.f2338g == -3987645.8f) {
            this.f2338g = this.f2333b.floatValue();
        }
        return this.f2338g;
    }

    public float c() {
        if (this.h == -3987645.8f) {
            this.h = this.f2334c.floatValue();
        }
        return this.h;
    }

    public int g() {
        if (this.i == 784923401) {
            this.i = this.f2333b.intValue();
        }
        return this.i;
    }

    public int d() {
        if (this.j == 784923401) {
            this.j = this.f2334c.intValue();
        }
        return this.j;
    }

    public String toString() {
        return "Keyframe{startValue=" + ((Object) this.f2333b) + ", endValue=" + ((Object) this.f2334c) + ", startFrame=" + this.f2336e + ", endFrame=" + this.f2337f + ", interpolator=" + this.f2335d + '}';
    }
}
