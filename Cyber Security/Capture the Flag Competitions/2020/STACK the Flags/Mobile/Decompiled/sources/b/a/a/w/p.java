package b.a.a.w;

import android.graphics.Color;
import android.graphics.PointF;
import b.a.a.w.k0.c;
import java.util.ArrayList;
import java.util.List;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2299a = c.a.a("x", "y");

    public static int d(c reader) {
        reader.g();
        int r = (int) (reader.n() * 255.0d);
        int g2 = (int) (reader.n() * 255.0d);
        int b2 = (int) (reader.n() * 255.0d);
        while (reader.l()) {
            reader.w();
        }
        reader.i();
        return Color.argb(255, r, g2, b2);
    }

    public static List<PointF> f(c reader, float scale) {
        List<PointF> points = new ArrayList<>();
        reader.g();
        while (reader.s() == c.b.BEGIN_ARRAY) {
            reader.g();
            points.add(e(reader, scale));
            reader.i();
        }
        reader.i();
        return points;
    }

    public static PointF e(c reader, float scale) {
        int ordinal = reader.s().ordinal();
        if (ordinal == 0) {
            return a(reader, scale);
        }
        if (ordinal == 2) {
            return c(reader, scale);
        }
        if (ordinal == 6) {
            return b(reader, scale);
        }
        throw new IllegalArgumentException("Unknown point starts with " + reader.s());
    }

    public static PointF b(c reader, float scale) {
        float x = (float) reader.n();
        float y = (float) reader.n();
        while (reader.l()) {
            reader.w();
        }
        return new PointF(x * scale, y * scale);
    }

    public static PointF a(c reader, float scale) {
        reader.g();
        float x = (float) reader.n();
        float y = (float) reader.n();
        while (reader.s() != c.b.END_ARRAY) {
            reader.w();
        }
        reader.i();
        return new PointF(x * scale, y * scale);
    }

    public static PointF c(c reader, float scale) {
        float x = 0.0f;
        float y = 0.0f;
        reader.h();
        while (reader.l()) {
            int u = reader.u(f2299a);
            if (u == 0) {
                x = g(reader);
            } else if (u != 1) {
                reader.v();
                reader.w();
            } else {
                y = g(reader);
            }
        }
        reader.j();
        return new PointF(x * scale, y * scale);
    }

    public static float g(c reader) {
        c.b token = reader.s();
        int ordinal = token.ordinal();
        if (ordinal == 0) {
            reader.g();
            float val = (float) reader.n();
            while (reader.l()) {
                reader.w();
            }
            reader.i();
            return val;
        } else if (ordinal == 6) {
            return (float) reader.n();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type " + token);
        }
    }
}
