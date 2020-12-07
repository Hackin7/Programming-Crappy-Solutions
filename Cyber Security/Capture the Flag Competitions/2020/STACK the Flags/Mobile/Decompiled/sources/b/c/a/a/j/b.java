package b.c.a.a.j;

import b.c.a.a.j.d;

public final class b extends d.a {

    /* renamed from: e  reason: collision with root package name */
    public static d<b> f2507e;

    /* renamed from: c  reason: collision with root package name */
    public float f2508c;

    /* renamed from: d  reason: collision with root package name */
    public float f2509d;

    static {
        d<b> a2 = d.a(256, new b(0.0f, 0.0f));
        f2507e = a2;
        a2.g(0.5f);
    }

    @Override // b.c.a.a.j.d.a
    public d.a a() {
        return new b(0.0f, 0.0f);
    }

    public static b b(float width, float height) {
        b result = f2507e.b();
        result.f2508c = width;
        result.f2509d = height;
        return result;
    }

    public static void c(b instance) {
        f2507e.c(instance);
    }

    public b() {
    }

    public b(float width, float height) {
        this.f2508c = width;
        this.f2509d = height;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b other = (b) obj;
        if (this.f2508c == other.f2508c && this.f2509d == other.f2509d) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f2508c + "x" + this.f2509d;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f2508c) ^ Float.floatToIntBits(this.f2509d);
    }
}
