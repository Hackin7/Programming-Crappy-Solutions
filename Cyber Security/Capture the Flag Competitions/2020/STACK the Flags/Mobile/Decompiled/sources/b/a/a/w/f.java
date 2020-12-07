package b.a.a.w;

import android.graphics.Color;
import b.a.a.w.k0.c;

public class f implements j0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f2265a = new f();

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // b.a.a.w.j0
    public /* bridge */ /* synthetic */ Integer a(c cVar, float f2) {
        return b(cVar);
    }

    public Integer b(c reader) {
        boolean isArray = reader.s() == c.b.BEGIN_ARRAY;
        if (isArray) {
            reader.g();
        }
        double r = reader.n();
        double g2 = reader.n();
        double b2 = reader.n();
        double a2 = reader.n();
        if (isArray) {
            reader.i();
        }
        if (r <= 1.0d && g2 <= 1.0d && b2 <= 1.0d) {
            r *= 255.0d;
            g2 *= 255.0d;
            b2 *= 255.0d;
            if (a2 <= 1.0d) {
                a2 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) a2, (int) r, (int) g2, (int) b2));
    }
}
