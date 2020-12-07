package b.a.a.w;

import b.a.a.d;
import b.a.a.u.j.b;
import b.a.a.u.j.l;
import b.a.a.u.k.k;
import b.a.a.w.k0.c;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2257a = c.a.a("nm", "c", "o", "tr", "hd");

    public static k a(c reader, d composition) {
        String name = null;
        b copies = null;
        b offset = null;
        l transform = null;
        boolean hidden = false;
        while (reader.l()) {
            int u = reader.u(f2257a);
            if (u == 0) {
                name = reader.q();
            } else if (u == 1) {
                copies = d.f(reader, composition, false);
            } else if (u == 2) {
                offset = d.f(reader, composition, false);
            } else if (u == 3) {
                transform = c.g(reader, composition);
            } else if (u != 4) {
                reader.w();
            } else {
                hidden = reader.m();
            }
        }
        return new k(name, copies, offset, transform, hidden);
    }
}
