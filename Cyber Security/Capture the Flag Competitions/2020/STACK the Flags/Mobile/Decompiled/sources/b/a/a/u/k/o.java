package b.a.a.u.k;

import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.b.q;
import b.a.a.u.j.h;
import b.a.a.u.l.a;

public class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2191a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2192b;

    /* renamed from: c  reason: collision with root package name */
    public final h f2193c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2194d;

    public o(String name, int index, h shapePath, boolean hidden) {
        this.f2191a = name;
        this.f2192b = index;
        this.f2193c = shapePath;
        this.f2194d = hidden;
    }

    public String b() {
        return this.f2191a;
    }

    public h c() {
        return this.f2193c;
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, a layer) {
        return new q(drawable, layer, this);
    }

    public boolean d() {
        return this.f2194d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f2191a + ", index=" + this.f2192b + '}';
    }
}
