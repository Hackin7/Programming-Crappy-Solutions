package b.a.a.w;

import android.graphics.PointF;
import b.a.a.d;
import b.a.a.u.j.b;
import b.a.a.u.k.i;
import b.a.a.w.k0.c;
import com.airbnb.lottie.model.animatable.AnimatableValue;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2314a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    public static i a(c reader, d composition) {
        String name = null;
        i.a type = null;
        b points = null;
        AnimatableValue<PointF, PointF> position = null;
        b rotation = null;
        b outerRadius = null;
        b outerRoundedness = null;
        b innerRadius = null;
        b innerRoundedness = null;
        boolean hidden = false;
        while (reader.l()) {
            switch (reader.u(f2314a)) {
                case 0:
                    name = reader.q();
                    break;
                case 1:
                    type = i.a.a(reader.o());
                    break;
                case 2:
                    points = d.f(reader, composition, false);
                    break;
                case 3:
                    position = a.b(reader, composition);
                    break;
                case 4:
                    rotation = d.f(reader, composition, false);
                    break;
                case 5:
                    outerRadius = d.e(reader, composition);
                    break;
                case 6:
                    outerRoundedness = d.f(reader, composition, false);
                    break;
                case 7:
                    innerRadius = d.e(reader, composition);
                    break;
                case 8:
                    innerRoundedness = d.f(reader, composition, false);
                    break;
                case 9:
                    hidden = reader.m();
                    break;
                default:
                    reader.v();
                    reader.w();
                    break;
            }
        }
        return new i(name, type, points, position, rotation, innerRadius, outerRadius, innerRoundedness, outerRoundedness, hidden);
    }
}
