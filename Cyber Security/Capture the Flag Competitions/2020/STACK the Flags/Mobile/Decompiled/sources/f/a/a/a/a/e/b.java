package f.a.a.a.a.e;

public class b {

    /* renamed from: c  reason: collision with root package name */
    public static b f2895c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2896a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2897b;

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f2895c == null) {
                f2895c = new b();
            }
            bVar = f2895c;
        }
        return bVar;
    }

    public void d(Boolean bool) {
        this.f2896a = bool.booleanValue();
    }

    public void e(Boolean bool) {
        this.f2897b = bool.booleanValue();
    }

    public Boolean b() {
        return Boolean.valueOf(this.f2896a);
    }

    public Boolean c() {
        return Boolean.valueOf(this.f2897b);
    }
}
