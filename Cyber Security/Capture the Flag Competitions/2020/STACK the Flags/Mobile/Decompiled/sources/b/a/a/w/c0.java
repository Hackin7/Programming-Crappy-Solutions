package b.a.a.w;

import b.a.a.w.k0.c;
import b.a.a.y.d;

public class c0 implements j0<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f2260a = new c0();

    /* renamed from: b */
    public d a(c reader, float scale) {
        boolean isArray = reader.s() == c.b.BEGIN_ARRAY;
        if (isArray) {
            reader.g();
        }
        float sx = (float) reader.n();
        float sy = (float) reader.n();
        while (reader.l()) {
            reader.w();
        }
        if (isArray) {
            reader.i();
        }
        return new d((sx / 100.0f) * scale, (sy / 100.0f) * scale);
    }
}
