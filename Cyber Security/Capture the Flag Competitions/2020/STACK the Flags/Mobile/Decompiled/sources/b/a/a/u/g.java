package b.a.a.u;

import a.e.e;
import b.a.a.d;

public class g {

    /* renamed from: b  reason: collision with root package name */
    public static final g f2093b = new g();

    /* renamed from: a  reason: collision with root package name */
    public final e<String, d> f2094a = new e<>(20);

    public static g b() {
        return f2093b;
    }

    public d a(String cacheKey) {
        if (cacheKey == null) {
            return null;
        }
        return this.f2094a.c(cacheKey);
    }

    public void c(String cacheKey, d composition) {
        if (cacheKey != null) {
            this.f2094a.d(cacheKey, composition);
        }
    }
}
