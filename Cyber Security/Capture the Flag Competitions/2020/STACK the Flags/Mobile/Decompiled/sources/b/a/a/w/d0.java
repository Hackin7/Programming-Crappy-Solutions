package b.a.a.w;

import android.graphics.PointF;
import b.a.a.u.a;
import b.a.a.u.k.l;
import b.a.a.w.k0.c;
import b.a.a.x.g;
import com.airbnb.lottie.model.CubicCurveData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class d0 implements j0<l> {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f2261a = new d0();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f2262b = c.a.a("c", "v", "i", "o");

    /* renamed from: b */
    public l a(c reader, float scale) {
        if (reader.s() == c.b.BEGIN_ARRAY) {
            reader.g();
        }
        boolean closed = false;
        List<PointF> pointsArray = null;
        List<PointF> inTangents = null;
        List<PointF> outTangents = null;
        reader.h();
        while (reader.l()) {
            int u = reader.u(f2262b);
            if (u == 0) {
                closed = reader.m();
            } else if (u == 1) {
                pointsArray = p.f(reader, scale);
            } else if (u == 2) {
                inTangents = p.f(reader, scale);
            } else if (u != 3) {
                reader.v();
                reader.w();
            } else {
                outTangents = p.f(reader, scale);
            }
        }
        reader.j();
        if (reader.s() == c.b.END_ARRAY) {
            reader.i();
        }
        if (pointsArray == null || inTangents == null || outTangents == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (pointsArray.isEmpty()) {
            return new l(new PointF(), false, Collections.emptyList());
        } else {
            int length = pointsArray.size();
            PointF vertex = pointsArray.get(0);
            List<CubicCurveData> curves = new ArrayList<>(length);
            for (int i = 1; i < length; i++) {
                PointF vertex2 = pointsArray.get(i);
                curves.add(new a(g.a(pointsArray.get(i - 1), outTangents.get(i - 1)), g.a(vertex2, inTangents.get(i)), vertex2));
            }
            if (closed) {
                PointF vertex3 = pointsArray.get(0);
                curves.add(new a(g.a(pointsArray.get(length - 1), outTangents.get(length - 1)), g.a(vertex3, inTangents.get(0)), vertex3));
            }
            return new l(vertex, closed, curves);
        }
    }
}
