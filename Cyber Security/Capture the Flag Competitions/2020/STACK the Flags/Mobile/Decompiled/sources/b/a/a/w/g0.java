package b.a.a.w;

import b.a.a.d;
import b.a.a.u.j.h;
import b.a.a.u.k.o;
import b.a.a.w.k0.c;

public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2268a = c.a.a("nm", "ind", "ks", "hd");

    public static o a(c reader, d composition) {
        String name = null;
        int ind = 0;
        h shape = null;
        boolean hidden = false;
        while (reader.l()) {
            int u = reader.u(f2268a);
            if (u == 0) {
                name = reader.q();
            } else if (u == 1) {
                ind = reader.o();
            } else if (u == 2) {
                shape = d.k(reader, composition);
            } else if (u != 3) {
                reader.w();
            } else {
                hidden = reader.m();
            }
        }
        return new o(name, ind, shape, hidden);
    }
}
