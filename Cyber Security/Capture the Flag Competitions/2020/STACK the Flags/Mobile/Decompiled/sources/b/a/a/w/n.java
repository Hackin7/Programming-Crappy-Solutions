package b.a.a.w;

import b.a.a.d;
import b.a.a.u.j.b;
import b.a.a.u.k.e;
import b.a.a.u.k.f;
import b.a.a.u.k.p;
import b.a.a.w.k0.c;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import java.util.ArrayList;
import java.util.List;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2295a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f2296b = c.a.a("p", "k");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f2297c = c.a.a("n", "v");

    public static e a(c reader, d composition) {
        String name = null;
        b.a.a.u.j.c color = null;
        b.a.a.u.j.d opacity = null;
        f gradientType = null;
        b.a.a.u.j.f startPoint = null;
        b.a.a.u.j.f endPoint = null;
        b width = null;
        p.a capType = null;
        p.b joinType = null;
        b offset = null;
        float miterLimit = 0.0f;
        boolean hidden = false;
        List<AnimatableFloatValue> lineDashPattern = new ArrayList<>();
        while (reader.l()) {
            switch (reader.u(f2295a)) {
                case 0:
                    name = reader.q();
                    hidden = hidden;
                    break;
                case 1:
                    int points = -1;
                    reader.h();
                    while (reader.l()) {
                        int u = reader.u(f2296b);
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
                    hidden = hidden;
                    lineDashPattern = lineDashPattern;
                    break;
                case 2:
                    opacity = d.h(reader, composition);
                    hidden = hidden;
                    break;
                case 3:
                    gradientType = reader.o() == 1 ? f.LINEAR : f.RADIAL;
                    hidden = hidden;
                    lineDashPattern = lineDashPattern;
                    break;
                case 4:
                    startPoint = d.i(reader, composition);
                    hidden = hidden;
                    break;
                case 5:
                    endPoint = d.i(reader, composition);
                    hidden = hidden;
                    break;
                case 6:
                    width = d.e(reader, composition);
                    hidden = hidden;
                    break;
                case 7:
                    capType = p.a.values()[reader.o() - 1];
                    hidden = hidden;
                    lineDashPattern = lineDashPattern;
                    break;
                case 8:
                    joinType = p.b.values()[reader.o() - 1];
                    hidden = hidden;
                    lineDashPattern = lineDashPattern;
                    break;
                case 9:
                    miterLimit = (float) reader.n();
                    hidden = hidden;
                    lineDashPattern = lineDashPattern;
                    break;
                case 10:
                    hidden = reader.m();
                    break;
                case 11:
                    reader.g();
                    while (reader.l()) {
                        String n = null;
                        b val = null;
                        reader.h();
                        while (reader.l()) {
                            int u2 = reader.u(f2297c);
                            if (u2 == 0) {
                                n = reader.q();
                            } else if (u2 != 1) {
                                reader.v();
                                reader.w();
                                offset = offset;
                            } else {
                                val = d.e(reader, composition);
                                offset = offset;
                            }
                        }
                        b offset2 = offset;
                        reader.j();
                        if (n.equals("o")) {
                            offset2 = val;
                        } else if (n.equals("d") || n.equals("g")) {
                            composition.t(true);
                            lineDashPattern.add(val);
                        }
                        offset = offset2;
                    }
                    reader.i();
                    if (lineDashPattern.size() == 1) {
                        lineDashPattern.add(lineDashPattern.get(0));
                    }
                    offset = offset;
                    hidden = hidden;
                    break;
                default:
                    reader.v();
                    reader.w();
                    hidden = hidden;
                    break;
            }
        }
        return new e(name, gradientType, color, opacity, startPoint, endPoint, width, capType, joinType, miterLimit, lineDashPattern, offset, hidden);
    }
}
