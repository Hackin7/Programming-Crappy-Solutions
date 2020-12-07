package b.a.a.w;

import b.a.a.u.j.a;
import b.a.a.u.j.b;
import b.a.a.u.j.f;
import b.a.a.u.j.g;
import b.a.a.u.j.j;
import b.a.a.w.k0.c;
import b.a.a.x.h;
import java.util.List;

public class d {
    public static b e(c reader, b.a.a.d composition) {
        return f(reader, composition, true);
    }

    public static b f(c reader, b.a.a.d composition, boolean isDp) {
        return new b(a(reader, isDp ? h.e() : 1.0f, composition, i.f2273a));
    }

    public static b.a.a.u.j.d h(c reader, b.a.a.d composition) {
        return new b.a.a.u.j.d(b(reader, composition, o.f2298a));
    }

    public static f i(c reader, b.a.a.d composition) {
        return new f(a(reader, h.e(), composition, y.f2313a));
    }

    public static g j(c reader, b.a.a.d composition) {
        return new g(b(reader, composition, c0.f2260a));
    }

    public static b.a.a.u.j.h k(c reader, b.a.a.d composition) {
        return new b.a.a.u.j.h(a(reader, h.e(), composition, d0.f2261a));
    }

    public static j d(c reader, b.a.a.d composition) {
        return new j(b(reader, composition, h.f2269a));
    }

    public static a c(c reader, b.a.a.d composition) {
        return new a(b(reader, composition, f.f2265a));
    }

    public static b.a.a.u.j.c g(c reader, b.a.a.d composition, int points) {
        return new b.a.a.u.j.c(b(reader, composition, new l(points)));
    }

    public static <T> List<b.a.a.y.a<T>> b(c reader, b.a.a.d composition, j0<T> j0Var) {
        return r.a(reader, composition, 1.0f, j0Var);
    }

    public static <T> List<b.a.a.y.a<T>> a(c reader, float scale, b.a.a.d composition, j0<T> j0Var) {
        return r.a(reader, composition, scale, j0Var);
    }
}
