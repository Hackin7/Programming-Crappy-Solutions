package b.a.a.w;

import b.a.a.u.k.h;
import b.a.a.w.k0.c;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2311a = c.a.a("nm", "mm", "hd");

    public static h a(c reader) {
        String name = null;
        h.a mode = null;
        boolean hidden = false;
        while (reader.l()) {
            int u = reader.u(f2311a);
            if (u == 0) {
                name = reader.q();
            } else if (u == 1) {
                mode = h.a.a(reader.o());
            } else if (u != 2) {
                reader.v();
                reader.w();
            } else {
                hidden = reader.m();
            }
        }
        return new h(name, mode, hidden);
    }
}
