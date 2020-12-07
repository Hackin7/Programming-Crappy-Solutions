package b.c.a.a.j;

import android.graphics.Matrix;
import android.graphics.RectF;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public RectF f2529a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public float f2530b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f2531c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f2532d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f2533e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f2534f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f2535g = 1.0f;

    public g() {
        new Matrix();
        new Matrix();
    }

    public void y(float width, float height) {
        float offsetLeft = u();
        float offsetTop = w();
        float offsetRight = v();
        float offsetBottom = t();
        this.f2531c = height;
        this.f2530b = width;
        x(offsetLeft, offsetTop, offsetRight, offsetBottom);
    }

    public void x(float offsetLeft, float offsetTop, float offsetRight, float offsetBottom) {
        this.f2529a.set(offsetLeft, offsetTop, this.f2530b - offsetRight, this.f2531c - offsetBottom);
    }

    public float u() {
        return this.f2529a.left;
    }

    public float v() {
        return this.f2530b - this.f2529a.right;
    }

    public float w() {
        return this.f2529a.top;
    }

    public float t() {
        return this.f2531c - this.f2529a.bottom;
    }

    public float d() {
        return this.f2529a.top;
    }

    public float b() {
        return this.f2529a.left;
    }

    public float c() {
        return this.f2529a.right;
    }

    public float a() {
        return this.f2529a.bottom;
    }

    public float e() {
        return this.f2529a.width();
    }

    public RectF i() {
        return this.f2529a;
    }

    public c h() {
        return c.c(this.f2529a.centerX(), this.f2529a.centerY());
    }

    public float f() {
        return this.f2531c;
    }

    public float g() {
        return this.f2530b;
    }

    public float j() {
        return Math.min(this.f2529a.width(), this.f2529a.height());
    }

    public boolean r(float x) {
        return o(x) && p(x);
    }

    public boolean s(float y) {
        return q(y) && n(y);
    }

    public boolean m(float x, float y) {
        return r(x) && s(y);
    }

    public boolean o(float x) {
        return this.f2529a.left <= 1.0f + x;
    }

    public boolean p(float x) {
        return this.f2529a.right >= (((float) ((int) (x * 100.0f))) / 100.0f) - 1.0f;
    }

    public boolean q(float y) {
        return this.f2529a.top <= y;
    }

    public boolean n(float y) {
        return this.f2529a.bottom >= ((float) ((int) (y * 100.0f))) / 100.0f;
    }

    public boolean l() {
        float f2 = this.f2535g;
        float f3 = this.f2532d;
        return f2 <= f3 && f3 <= 1.0f;
    }

    public boolean k() {
        float f2 = this.f2534f;
        float f3 = this.f2533e;
        return f2 <= f3 && f3 <= 1.0f;
    }
}
