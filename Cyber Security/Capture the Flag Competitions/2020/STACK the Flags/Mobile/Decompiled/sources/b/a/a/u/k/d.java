package b.a.a.u.k;

import android.graphics.Path;
import b.a.a.s.b.h;
import b.a.a.u.j.b;
import b.a.a.u.j.c;
import b.a.a.u.j.f;
import b.a.a.u.l.a;

public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f f2123a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f2124b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2125c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a.a.u.j.d f2126d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2127e;

    /* renamed from: f  reason: collision with root package name */
    public final f f2128f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2129g;
    public final boolean h;

    public d(String name, f gradientType, Path.FillType fillType, c gradientColor, b.a.a.u.j.d opacity, f startPoint, f endPoint, b highlightLength, b highlightAngle, boolean hidden) {
        this.f2123a = gradientType;
        this.f2124b = fillType;
        this.f2125c = gradientColor;
        this.f2126d = opacity;
        this.f2127e = startPoint;
        this.f2128f = endPoint;
        this.f2129g = name;
        this.h = hidden;
    }

    public String f() {
        return this.f2129g;
    }

    public f e() {
        return this.f2123a;
    }

    public Path.FillType c() {
        return this.f2124b;
    }

    public c d() {
        return this.f2125c;
    }

    public b.a.a.u.j.d g() {
        return this.f2126d;
    }

    public f h() {
        return this.f2127e;
    }

    public f b() {
        return this.f2128f;
    }

    public boolean i() {
        return this.h;
    }

    @Override // b.a.a.u.k.b
    public b.a.a.s.b.c a(b.a.a.f drawable, a layer) {
        return new h(drawable, layer, this);
    }
}
