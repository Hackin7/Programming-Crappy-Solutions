package b.c.a.a.f;

import b.c.a.a.c.i;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public float f2462a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    public float f2463b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public int f2464c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2465d;

    /* renamed from: e  reason: collision with root package name */
    public int f2466e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f2467f;

    /* renamed from: g  reason: collision with root package name */
    public float f2468g;

    public b(float x, float y, float xPx, float yPx, int dataSetIndex, i.a axis) {
        this.f2462a = x;
        this.f2463b = y;
        this.f2465d = dataSetIndex;
    }

    public float e() {
        return this.f2462a;
    }

    public float f() {
        return this.f2463b;
    }

    public int b() {
        return this.f2465d;
    }

    public void g(float x, float y) {
        this.f2467f = x;
        this.f2468g = y;
    }

    public float c() {
        return this.f2467f;
    }

    public float d() {
        return this.f2468g;
    }

    public boolean a(b h) {
        if (h != null && this.f2465d == h.f2465d && this.f2462a == h.f2462a && this.f2466e == h.f2466e && this.f2464c == h.f2464c) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Highlight, x: " + this.f2462a + ", y: " + this.f2463b + ", dataSetIndex: " + this.f2465d + ", stackIndex (only stacked barentry): " + this.f2466e;
    }
}
