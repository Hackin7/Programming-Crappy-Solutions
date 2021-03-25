package b.a.a.w;

import b.a.a.d;
import b.a.a.u.k.b;
import b.a.a.u.k.n;
import b.a.a.w.k0.c;
import com.airbnb.lottie.model.content.ContentModel;
import java.util.ArrayList;
import java.util.List;

public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2266a = c.a.a("nm", "hd", "it");

    public static n a(c reader, d composition) {
        String name = null;
        boolean hidden = false;
        List<ContentModel> items = new ArrayList<>();
        while (reader.l()) {
            int u = reader.u(f2266a);
            if (u == 0) {
                name = reader.q();
            } else if (u == 1) {
                hidden = reader.m();
            } else if (u != 2) {
                reader.w();
            } else {
                reader.g();
                while (reader.l()) {
                    b newItem = g.a(reader, composition);
                    if (newItem != null) {
                        items.add(newItem);
                    }
                }
                reader.i();
            }
        }
        return new n(name, items, hidden);
    }
}
