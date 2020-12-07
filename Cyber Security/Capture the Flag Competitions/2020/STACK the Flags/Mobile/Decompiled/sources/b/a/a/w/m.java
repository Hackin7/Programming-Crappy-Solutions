package b.a.a.w;

import android.graphics.Path;
import b.a.a.u.k.d;
import b.a.a.u.k.f;
import b.a.a.w.k0.c;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2293a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f2294b = c.a.a("p", "k");

    public static d a(c reader, b.a.a.d composition) {
        String name = null;
        b.a.a.u.j.c color = null;
        b.a.a.u.j.d opacity = null;
        f gradientType = null;
        b.a.a.u.j.f startPoint = null;
        b.a.a.u.j.f endPoint = null;
        Path.FillType fillType = Path.FillType.WINDING;
        boolean hidden = false;
        while (reader.l()) {
            switch (reader.u(f2293a)) {
                case 0:
                    name = reader.q();
                    break;
                case 1:
                    int points = -1;
                    reader.h();
                    while (reader.l()) {
                        int u = reader.u(f2294b);
                        if (u == 0) {
                            points = reader.o();
                        } else if (u != 1) {
                            reader.v();
                            reader.w();
                        } else {
                            color = d.g(reader, composition, points);
                        }
                    }
                    reader.j();
                    break;
                case 2:
                    opacity = d.h(reader, composition);
                    break;
                case 3:
                    gradientType = reader.o() == 1 ? f.LINEAR : f.RADIAL;
                    break;
                case 4:
                    startPoint = d.i(reader, composition);
                    break;
                case 5:
                    endPoint = d.i(reader, composition);
                    break;
                case 6:
                    fillType = reader.o() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    hidden = reader.m();
                    break;
                default:
                    reader.v();
                    reader.w();
                    break;
            }
        }
        return new d(name, gradientType, fillType, color, opacity, startPoint, endPoint, null, null, hidden);
    }
}
