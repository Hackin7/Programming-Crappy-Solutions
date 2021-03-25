package b.a.a.w;

import android.graphics.PointF;
import b.a.a.w.k0.c;

public class y implements j0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final y f2313a = new y();

    /* renamed from: b */
    public PointF a(c reader, float scale) {
        c.b token = reader.s();
        if (token == c.b.BEGIN_ARRAY) {
            return p.e(reader, scale);
        }
        if (token == c.b.BEGIN_OBJECT) {
            return p.e(reader, scale);
        }
        if (token == c.b.NUMBER) {
            PointF point = new PointF(((float) reader.n()) * scale, ((float) reader.n()) * scale);
            while (reader.l()) {
                reader.w();
            }
            return point;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + token);
    }
}
