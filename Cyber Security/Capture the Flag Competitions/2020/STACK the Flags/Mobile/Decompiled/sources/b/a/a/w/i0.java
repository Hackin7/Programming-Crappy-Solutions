package b.a.a.w;

import b.a.a.d;
import b.a.a.u.j.b;
import b.a.a.u.k.q;
import b.a.a.w.k0.c;

public class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2274a = c.a.a("s", "e", "o", "nm", "m", "hd");

    public static q a(c reader, d composition) {
        String name = null;
        q.a type = null;
        b start = null;
        b end = null;
        b offset = null;
        boolean hidden = false;
        while (reader.l()) {
            int u = reader.u(f2274a);
            if (u == 0) {
                start = d.f(reader, composition, false);
            } else if (u == 1) {
                end = d.f(reader, composition, false);
            } else if (u == 2) {
                offset = d.f(reader, composition, false);
            } else if (u == 3) {
                name = reader.q();
            } else if (u == 4) {
                type = q.a.a(reader.o());
            } else if (u != 5) {
                reader.w();
            } else {
                hidden = reader.m();
            }
        }
        return new q(name, type, start, end, offset, hidden);
    }
}
