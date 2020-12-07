package b.a.a.w;

import b.a.a.d;
import b.a.a.u.j.a;
import b.a.a.u.j.b;
import b.a.a.u.k.p;
import b.a.a.w.k0.c;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import java.util.ArrayList;
import java.util.List;

public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2271a = c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f2272b = c.a.a("n", "v");

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    public static p a(c reader, d composition) {
        char c2;
        String name = null;
        a color = null;
        b width = null;
        b.a.a.u.j.d opacity = null;
        p.a capType = null;
        p.b joinType = null;
        b offset = null;
        float miterLimit = 0.0f;
        boolean hidden = false;
        List<AnimatableFloatValue> lineDashPattern = new ArrayList<>();
        while (reader.l()) {
            int i = 1;
            switch (reader.u(f2271a)) {
                case 0:
                    name = reader.q();
                    break;
                case 1:
                    color = d.c(reader, composition);
                    break;
                case 2:
                    width = d.e(reader, composition);
                    break;
                case 3:
                    opacity = d.h(reader, composition);
                    break;
                case 4:
                    capType = p.a.values()[reader.o() - 1];
                    break;
                case 5:
                    joinType = p.b.values()[reader.o() - 1];
                    break;
                case 6:
                    miterLimit = (float) reader.n();
                    break;
                case 7:
                    hidden = reader.m();
                    break;
                case 8:
                    reader.g();
                    while (reader.l()) {
                        String n = null;
                        b val = null;
                        reader.h();
                        while (reader.l()) {
                            int u = reader.u(f2272b);
                            if (u == 0) {
                                n = reader.q();
                            } else if (u != i) {
                                reader.v();
                                reader.w();
                            } else {
                                val = d.e(reader, composition);
                            }
                        }
                        reader.j();
                        int hashCode = n.hashCode();
                        if (hashCode != 100) {
                            if (hashCode != 103) {
                                if (hashCode == 111 && n.equals("o")) {
                                    c2 = 0;
                                    if (c2 != 0) {
                                        offset = val;
                                    } else if (c2 == 1 || c2 == 2) {
                                        composition.t(true);
                                        lineDashPattern.add(val);
                                    }
                                    i = 1;
                                }
                            } else if (n.equals("g")) {
                                c2 = 2;
                                if (c2 != 0) {
                                }
                                i = 1;
                            }
                        } else if (n.equals("d")) {
                            c2 = 1;
                            if (c2 != 0) {
                            }
                            i = 1;
                        }
                        c2 = 65535;
                        if (c2 != 0) {
                        }
                        i = 1;
                    }
                    reader.i();
                    if (lineDashPattern.size() != 1) {
                        break;
                    } else {
                        lineDashPattern.add(lineDashPattern.get(0));
                        break;
                    }
                default:
                    reader.w();
                    break;
            }
        }
        return new p(name, offset, lineDashPattern, color, opacity, width, capType, joinType, miterLimit, hidden);
    }
}
