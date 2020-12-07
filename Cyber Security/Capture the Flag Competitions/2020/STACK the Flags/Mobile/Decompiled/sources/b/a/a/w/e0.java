package b.a.a.w;

import android.graphics.Path;
import b.a.a.d;
import b.a.a.u.j.a;
import b.a.a.u.k.m;
import b.a.a.w.k0.c;

public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2264a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static m a(c reader, d composition) {
        a color = null;
        boolean fillEnabled = false;
        b.a.a.u.j.d opacity = null;
        String name = null;
        int fillTypeInt = 1;
        boolean hidden = false;
        while (reader.l()) {
            int u = reader.u(f2264a);
            if (u == 0) {
                name = reader.q();
            } else if (u == 1) {
                color = d.c(reader, composition);
            } else if (u == 2) {
                opacity = d.h(reader, composition);
            } else if (u == 3) {
                fillEnabled = reader.m();
            } else if (u == 4) {
                fillTypeInt = reader.o();
            } else if (u != 5) {
                reader.v();
                reader.w();
            } else {
                hidden = reader.m();
            }
        }
        return new m(name, fillEnabled, fillTypeInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, color, opacity, hidden);
    }
}
