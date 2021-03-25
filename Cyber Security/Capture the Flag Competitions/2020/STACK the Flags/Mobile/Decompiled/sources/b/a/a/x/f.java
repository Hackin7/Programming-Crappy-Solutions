package b.a.a.x;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public float f2323a;

    /* renamed from: b  reason: collision with root package name */
    public int f2324b;

    public void a(float number) {
        float f2 = this.f2323a + number;
        this.f2323a = f2;
        int i = this.f2324b + 1;
        this.f2324b = i;
        if (i == Integer.MAX_VALUE) {
            this.f2323a = f2 / 2.0f;
            this.f2324b = i / 2;
        }
    }
}
