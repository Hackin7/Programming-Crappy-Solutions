package b.a.a.u.k;

import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.b.d;
import b.a.a.u.l.a;
import java.util.Arrays;
import java.util.List;

public class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2188a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f2189b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2190c;

    public n(String name, List<b> list, boolean hidden) {
        this.f2188a = name;
        this.f2189b = list;
        this.f2190c = hidden;
    }

    public String c() {
        return this.f2188a;
    }

    public List<b> b() {
        return this.f2189b;
    }

    public boolean d() {
        return this.f2190c;
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, a layer) {
        return new d(drawable, layer, this);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f2188a + "' Shapes: " + Arrays.toString(this.f2189b.toArray()) + '}';
    }
}
