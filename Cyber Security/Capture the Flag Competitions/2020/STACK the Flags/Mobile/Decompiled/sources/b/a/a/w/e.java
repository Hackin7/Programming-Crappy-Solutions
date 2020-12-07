package b.a.a.w;

import android.graphics.PointF;
import b.a.a.d;
import b.a.a.u.j.f;
import b.a.a.u.k.a;
import b.a.a.w.k0.c;
import com.airbnb.lottie.model.animatable.AnimatableValue;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2263a = c.a.a("nm", "p", "s", "hd", "d");

    public static a a(c reader, d composition, int d2) {
        String name = null;
        AnimatableValue<PointF, PointF> position = null;
        f size = null;
        boolean reversed = d2 == 3;
        boolean hidden = false;
        while (reader.l()) {
            int u = reader.u(f2263a);
            if (u == 0) {
                name = reader.q();
            } else if (u == 1) {
                position = a.b(reader, composition);
            } else if (u == 2) {
                size = d.i(reader, composition);
            } else if (u == 3) {
                hidden = reader.m();
            } else if (u != 4) {
                reader.v();
                reader.w();
            } else {
                reversed = reader.o() == 3;
            }
        }
        return new a(name, position, size, reversed, hidden);
    }
}
