package b.a.a.w;

import b.a.a.d;
import b.a.a.u.j.a;
import b.a.a.u.j.k;
import b.a.a.w.k0.c;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2255a = c.a.a("a");

    /* renamed from: b  reason: collision with root package name */
    public static c.a f2256b = c.a.a("fc", "sc", "sw", "t");

    public static k a(c reader, d composition) {
        k anim = null;
        reader.h();
        while (reader.l()) {
            if (reader.u(f2255a) != 0) {
                reader.v();
                reader.w();
            } else {
                anim = b(reader, composition);
            }
        }
        reader.j();
        if (anim == null) {
            return new k(null, null, null, null);
        }
        return anim;
    }

    public static k b(c reader, d composition) {
        a color = null;
        a stroke = null;
        b.a.a.u.j.b strokeWidth = null;
        b.a.a.u.j.b tracking = null;
        reader.h();
        while (reader.l()) {
            int u = reader.u(f2256b);
            if (u == 0) {
                color = d.c(reader, composition);
            } else if (u == 1) {
                stroke = d.c(reader, composition);
            } else if (u == 2) {
                strokeWidth = d.e(reader, composition);
            } else if (u != 3) {
                reader.v();
                reader.w();
            } else {
                tracking = d.e(reader, composition);
            }
        }
        reader.j();
        return new k(color, stroke, strokeWidth, tracking);
    }
}
