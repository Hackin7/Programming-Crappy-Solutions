package b.a.a.u.k;

import b.a.a.s.b.i;
import b.a.a.u.j.b;
import b.a.a.u.j.c;
import b.a.a.u.j.d;
import b.a.a.u.j.f;
import b.a.a.u.k.p;
import b.a.a.u.l.a;
import java.util.List;

public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2130a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2131b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2132c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2133d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2134e;

    /* renamed from: f  reason: collision with root package name */
    public final f f2135f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2136g;
    public final p.a h;
    public final p.b i;
    public final float j;
    public final List<b> k;
    public final b l;
    public final boolean m;

    public e(String name, f gradientType, c gradientColor, d opacity, f startPoint, f endPoint, b width, p.a capType, p.b joinType, float miterLimit, List<b> list, b dashOffset, boolean hidden) {
        this.f2130a = name;
        this.f2131b = gradientType;
        this.f2132c = gradientColor;
        this.f2133d = opacity;
        this.f2134e = startPoint;
        this.f2135f = endPoint;
        this.f2136g = width;
        this.h = capType;
        this.i = joinType;
        this.j = miterLimit;
        this.k = list;
        this.l = dashOffset;
        this.m = hidden;
    }

    public String j() {
        return this.f2130a;
    }

    public f f() {
        return this.f2131b;
    }

    public c e() {
        return this.f2132c;
    }

    public d k() {
        return this.f2133d;
    }

    public f l() {
        return this.f2134e;
    }

    public f d() {
        return this.f2135f;
    }

    public b m() {
        return this.f2136g;
    }

    public p.a b() {
        return this.h;
    }

    public p.b g() {
        return this.i;
    }

    public List<b> h() {
        return this.k;
    }

    public b c() {
        return this.l;
    }

    public float i() {
        return this.j;
    }

    public boolean n() {
        return this.m;
    }

    @Override // b.a.a.u.k.b
    public b.a.a.s.b.c a(b.a.a.f drawable, a layer) {
        return new i(drawable, layer, this);
    }
}
