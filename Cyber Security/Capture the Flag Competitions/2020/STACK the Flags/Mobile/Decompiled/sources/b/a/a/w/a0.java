package b.a.a.w;

import android.graphics.PointF;
import b.a.a.d;
import b.a.a.u.j.b;
import b.a.a.u.j.f;
import b.a.a.u.k.j;
import b.a.a.w.k0.c;
import com.airbnb.lottie.model.animatable.AnimatableValue;

public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2254a = c.a.a("nm", "p", "s", "r", "hd");

    public static j a(c reader, d composition) {
        String name = null;
        AnimatableValue<PointF, PointF> position = null;
        f size = null;
        b roundedness = null;
        boolean hidden = false;
        while (reader.l()) {
            int u = reader.u(f2254a);
            if (u == 0) {
                name = reader.q();
            } else if (u == 1) {
                position = a.b(reader, composition);
            } else if (u == 2) {
                size = d.i(reader, composition);
            } else if (u == 3) {
                roundedness = d.e(reader, composition);
            } else if (u != 4) {
                reader.w();
            } else {
                hidden = reader.m();
            }
        }
        return new j(name, position, size, roundedness, hidden);
    }
}
