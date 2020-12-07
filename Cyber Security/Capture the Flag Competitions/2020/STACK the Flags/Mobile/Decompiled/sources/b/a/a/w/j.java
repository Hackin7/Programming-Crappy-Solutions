package b.a.a.w;

import b.a.a.u.d;
import b.a.a.u.k.n;
import b.a.a.w.k0.c;
import com.airbnb.lottie.model.content.ShapeGroup;
import java.util.ArrayList;
import java.util.List;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f2275a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f2276b = c.a.a("shapes");

    public static d a(c reader, b.a.a.d composition) {
        char character = 0;
        double size = 0.0d;
        double width = 0.0d;
        String style = null;
        String fontFamily = null;
        List<ShapeGroup> shapes = new ArrayList<>();
        reader.h();
        while (reader.l()) {
            int u = reader.u(f2275a);
            if (u == 0) {
                character = reader.q().charAt(0);
            } else if (u == 1) {
                size = reader.n();
            } else if (u == 2) {
                width = reader.n();
            } else if (u == 3) {
                style = reader.q();
            } else if (u == 4) {
                fontFamily = reader.q();
            } else if (u != 5) {
                reader.v();
                reader.w();
            } else {
                reader.h();
                while (reader.l()) {
                    if (reader.u(f2276b) != 0) {
                        reader.v();
                        reader.w();
                    } else {
                        reader.g();
                        while (reader.l()) {
                            shapes.add((n) g.a(reader, composition));
                        }
                        reader.i();
                    }
                }
                reader.j();
            }
        }
        reader.j();
        return new d(shapes, character, size, width, style, fontFamily);
    }
}
