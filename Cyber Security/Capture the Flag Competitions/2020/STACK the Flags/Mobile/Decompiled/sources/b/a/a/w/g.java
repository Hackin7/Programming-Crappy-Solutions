package b.a.a.w;

import b.a.a.d;
import b.a.a.u.k.b;
import b.a.a.w.k0.c;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2267a = c.a.a("ty", "d");

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r0.equals("st") != false) goto L_0x00bf;
     */
    public static b a(c reader, d composition) {
        char c2;
        String type = null;
        reader.h();
        int d2 = 2;
        while (true) {
            c2 = 1;
            if (reader.l()) {
                int u = reader.u(f2267a);
                if (u == 0) {
                    type = reader.q();
                    break;
                } else if (u != 1) {
                    reader.v();
                    reader.w();
                } else {
                    d2 = reader.o();
                }
            } else {
                break;
            }
        }
        if (type == null) {
            return null;
        }
        b model = null;
        switch (type.hashCode()) {
            case 3239:
                if (type.equals("el")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 3270:
                if (type.equals("fl")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3295:
                if (type.equals("gf")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3307:
                if (type.equals("gr")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3308:
                if (type.equals("gs")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3488:
                if (type.equals("mm")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 3633:
                if (type.equals("rc")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3646:
                if (type.equals("rp")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 3669:
                if (type.equals("sh")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3679:
                if (type.equals("sr")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3681:
                break;
            case 3705:
                if (type.equals("tm")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 3710:
                if (type.equals("tr")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                model = f0.a(reader, composition);
                break;
            case 1:
                model = h0.a(reader, composition);
                break;
            case 2:
                model = n.a(reader, composition);
                break;
            case 3:
                model = e0.a(reader, composition);
                break;
            case 4:
                model = m.a(reader, composition);
                break;
            case 5:
                model = c.g(reader, composition);
                break;
            case 6:
                model = g0.a(reader, composition);
                break;
            case 7:
                model = e.a(reader, composition, d2);
                break;
            case '\b':
                model = a0.a(reader, composition);
                break;
            case '\t':
                model = i0.a(reader, composition);
                break;
            case '\n':
                model = z.a(reader, composition);
                break;
            case 11:
                model = v.a(reader);
                composition.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case '\f':
                model = b0.a(reader, composition);
                break;
            default:
                b.a.a.x.d.c("Unknown shape type " + type);
                break;
        }
        while (reader.l()) {
            reader.w();
        }
        reader.j();
        return model;
    }
}
