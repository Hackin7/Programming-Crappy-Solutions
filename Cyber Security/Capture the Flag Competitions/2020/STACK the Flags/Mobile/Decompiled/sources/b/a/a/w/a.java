package b.a.a.w;

import android.graphics.PointF;
import b.a.a.d;
import b.a.a.u.j.b;
import b.a.a.u.j.e;
import b.a.a.u.j.i;
import b.a.a.u.j.m;
import b.a.a.w.k0.c;
import b.a.a.x.h;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2253a = c.a.a("k", "x", "y");

    public static e a(c reader, d composition) {
        List<Keyframe<PointF>> keyframes = new ArrayList<>();
        if (reader.s() == c.b.BEGIN_ARRAY) {
            reader.g();
            while (reader.l()) {
                keyframes.add(w.a(reader, composition));
            }
            reader.i();
            r.b(keyframes);
        } else {
            keyframes.add(new b.a.a.y.a<>(p.e(reader, h.e())));
        }
        return new e(keyframes);
    }

    public static m<PointF, PointF> b(c reader, d composition) {
        e pathAnimation = null;
        b xAnimation = null;
        b yAnimation = null;
        boolean hasExpressions = false;
        reader.h();
        while (reader.s() != c.b.END_OBJECT) {
            int u = reader.u(f2253a);
            if (u == 0) {
                pathAnimation = a(reader, composition);
            } else if (u != 1) {
                if (u != 2) {
                    reader.v();
                    reader.w();
                } else if (reader.s() == c.b.STRING) {
                    hasExpressions = true;
                    reader.w();
                } else {
                    yAnimation = d.e(reader, composition);
                }
            } else if (reader.s() == c.b.STRING) {
                hasExpressions = true;
                reader.w();
            } else {
                xAnimation = d.e(reader, composition);
            }
        }
        reader.j();
        if (hasExpressions) {
            composition.a("Lottie doesn't support expressions.");
        }
        if (pathAnimation != null) {
            return pathAnimation;
        }
        return new i(xAnimation, yAnimation);
    }
}
