package b.a.a.w;

import android.graphics.PointF;
import b.a.a.d;
import b.a.a.u.j.b;
import b.a.a.u.j.e;
import b.a.a.u.j.g;
import b.a.a.u.j.i;
import b.a.a.u.j.l;
import b.a.a.u.j.m;
import b.a.a.w.k0.c;
import b.a.a.y.a;
import com.airbnb.lottie.model.animatable.AnimatableValue;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2258a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    public static c.a f2259b = c.a.a("k");

    public static l g(b.a.a.w.k0.c reader, d composition) {
        b skew;
        b skewAngle;
        d dVar = composition;
        b rotation = null;
        boolean z = false;
        boolean isObject = reader.s() == c.b.BEGIN_OBJECT;
        if (isObject) {
            reader.h();
        }
        g scale = null;
        b.a.a.u.j.d opacity = null;
        b startOpacity = null;
        b endOpacity = null;
        b skew2 = null;
        b skewAngle2 = null;
        e anchorPoint = null;
        AnimatableValue<PointF, PointF> position = null;
        while (reader.l()) {
            switch (reader.u(f2258a)) {
                case 0:
                    reader.h();
                    while (reader.l()) {
                        if (reader.u(f2259b) != 0) {
                            reader.v();
                            reader.w();
                        } else {
                            anchorPoint = a.a(reader, composition);
                        }
                    }
                    reader.j();
                    dVar = composition;
                    z = false;
                    continue;
                case 1:
                    position = a.b(reader, composition);
                    dVar = composition;
                    z = false;
                    continue;
                case 2:
                    scale = d.j(reader, composition);
                    dVar = composition;
                    z = false;
                    continue;
                case 3:
                    dVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    opacity = d.h(reader, composition);
                    continue;
                case 6:
                    startOpacity = d.f(reader, dVar, z);
                    continue;
                case 7:
                    endOpacity = d.f(reader, dVar, z);
                    continue;
                case 8:
                    skew2 = d.f(reader, dVar, z);
                    continue;
                case 9:
                    skewAngle2 = d.f(reader, dVar, z);
                    continue;
                default:
                    reader.v();
                    reader.w();
                    dVar = composition;
                    z = false;
                    continue;
            }
            b rotation2 = d.f(reader, dVar, z);
            if (rotation2.b().isEmpty()) {
                rotation2.b().add(new a(composition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(composition.f())));
            } else if (((a) rotation2.b().get(0)).f2333b == null) {
                rotation2.b().set(0, new a(composition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(composition.f())));
            }
            dVar = composition;
            rotation = rotation2;
            z = false;
        }
        if (isObject) {
            reader.j();
        }
        if (a(anchorPoint)) {
            anchorPoint = null;
        }
        if (b(position)) {
            position = null;
        }
        if (c(rotation)) {
            rotation = null;
        }
        if (d(scale)) {
            scale = null;
        }
        if (f(skew2)) {
            skew = null;
        } else {
            skew = skew2;
        }
        if (e(skewAngle2)) {
            skewAngle = null;
        } else {
            skewAngle = skewAngle2;
        }
        return new l(anchorPoint, position, scale, rotation, opacity, startOpacity, endOpacity, skew, skewAngle);
    }

    public static boolean a(e anchorPoint) {
        return anchorPoint == null || (anchorPoint.c() && anchorPoint.b().get(0).f2333b.equals(0.0f, 0.0f));
    }

    public static boolean b(m<PointF, PointF> mVar) {
        if (mVar == null || (!(mVar instanceof i) && mVar.c() && mVar.b().get(0).f2333b.equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    public static boolean c(b rotation) {
        return rotation == null || (rotation.c() && ((a) rotation.b().get(0)).f2333b.floatValue() == 0.0f);
    }

    public static boolean d(g scale) {
        return scale == null || (scale.c() && ((a) scale.b().get(0)).f2333b.a(1.0f, 1.0f));
    }

    public static boolean f(b skew) {
        return skew == null || (skew.c() && ((a) skew.b().get(0)).f2333b.floatValue() == 0.0f);
    }

    public static boolean e(b skewAngle) {
        return skewAngle == null || (skewAngle.c() && ((a) skewAngle.b().get(0)).f2333b.floatValue() == 0.0f);
    }
}
