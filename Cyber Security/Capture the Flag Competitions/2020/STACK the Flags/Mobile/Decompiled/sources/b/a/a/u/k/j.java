package b.a.a.u.k;

import android.graphics.PointF;
import b.a.a.s.b.c;
import b.a.a.s.b.o;
import b.a.a.u.j.b;
import b.a.a.u.j.f;
import b.a.a.u.j.m;
import b.a.a.u.l.a;

public class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2169a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f2170b;

    /* renamed from: c  reason: collision with root package name */
    public final f f2171c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2172d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2173e;

    public j(String name, m<PointF, PointF> mVar, f size, b cornerRadius, boolean hidden) {
        this.f2169a = name;
        this.f2170b = mVar;
        this.f2171c = size;
        this.f2172d = cornerRadius;
        this.f2173e = hidden;
    }

    public String c() {
        return this.f2169a;
    }

    public b b() {
        return this.f2172d;
    }

    public f e() {
        return this.f2171c;
    }

    public m<PointF, PointF> d() {
        return this.f2170b;
    }

    public boolean f() {
        return this.f2173e;
    }

    @Override // b.a.a.u.k.b
    public c a(b.a.a.f drawable, a layer) {
        return new o(drawable, layer, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.f2170b + ", size=" + this.f2171c + '}';
    }
}
