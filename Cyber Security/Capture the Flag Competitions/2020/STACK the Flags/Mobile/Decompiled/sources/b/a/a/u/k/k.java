package b.a.a.u.k;

import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.b.p;
import b.a.a.u.j.b;
import b.a.a.u.j.l;
import b.a.a.u.l.a;

public class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2174a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2175b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2176c;

    /* renamed from: d  reason: collision with root package name */
    public final l f2177d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2178e;

    public k(String name, b copies, b offset, l transform, boolean hidden) {
        this.f2174a = name;
        this.f2175b = copies;
        this.f2176c = offset;
        this.f2177d = transform;
        this.f2178e = hidden;
    }

    public String c() {
        return this.f2174a;
    }

    public b b() {
        return this.f2175b;
    }

    public b d() {
        return this.f2176c;
    }

    public l e() {
        return this.f2177d;
    }

    public boolean f() {
        return this.f2178e;
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, a layer) {
        return new p(drawable, layer, this);
    }
}
