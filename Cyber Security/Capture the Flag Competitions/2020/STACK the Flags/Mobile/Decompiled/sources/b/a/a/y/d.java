package b.a.a.y;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public float f2343a;

    /* renamed from: b  reason: collision with root package name */
    public float f2344b;

    public d(float sx, float sy) {
        this.f2343a = sx;
        this.f2344b = sy;
    }

    public d() {
        this(1.0f, 1.0f);
    }

    public float b() {
        return this.f2343a;
    }

    public float c() {
        return this.f2344b;
    }

    public void d(float scaleX, float scaleY) {
        this.f2343a = scaleX;
        this.f2344b = scaleY;
    }

    public boolean a(float scaleX, float scaleY) {
        return this.f2343a == scaleX && this.f2344b == scaleY;
    }

    public String toString() {
        return b() + "x" + c();
    }
}
