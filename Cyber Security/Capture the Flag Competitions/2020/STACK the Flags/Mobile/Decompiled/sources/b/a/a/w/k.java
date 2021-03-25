package b.a.a.w;

import b.a.a.w.k0.c;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2277a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static b.a.a.u.c a(c reader) {
        String family = null;
        String name = null;
        String style = null;
        float ascent = 0.0f;
        reader.h();
        while (reader.l()) {
            int u = reader.u(f2277a);
            if (u == 0) {
                family = reader.q();
            } else if (u == 1) {
                name = reader.q();
            } else if (u == 2) {
                style = reader.q();
            } else if (u != 3) {
                reader.v();
                reader.w();
            } else {
                ascent = (float) reader.n();
            }
        }
        reader.j();
        return new b.a.a.u.c(family, name, style, ascent);
    }
}
