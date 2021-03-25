package b.a.a.u.k;

import android.graphics.Path;
import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.b.g;
import b.a.a.u.j.a;
import b.a.a.u.j.d;

public class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2182a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f2183b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2184c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2185d;

    /* renamed from: e  reason: collision with root package name */
    public final d f2186e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2187f;

    public m(String name, boolean fillEnabled, Path.FillType fillType, a color, d opacity, boolean hidden) {
        this.f2184c = name;
        this.f2182a = fillEnabled;
        this.f2183b = fillType;
        this.f2185d = color;
        this.f2186e = opacity;
        this.f2187f = hidden;
    }

    public String d() {
        return this.f2184c;
    }

    public a b() {
        return this.f2185d;
    }

    public d e() {
        return this.f2186e;
    }

    public Path.FillType c() {
        return this.f2183b;
    }

    public boolean f() {
        return this.f2187f;
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, b.a.a.u.l.a layer) {
        return new g(drawable, layer, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f2182a + '}';
    }
}
