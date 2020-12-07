package b.a.a.u.k;

import android.graphics.PointF;
import b.a.a.s.b.c;
import b.a.a.u.j.f;
import b.a.a.u.j.m;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2116a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f2117b;

    /* renamed from: c  reason: collision with root package name */
    public final f f2118c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2119d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2120e;

    public a(String name, m<PointF, PointF> mVar, f size, boolean isReversed, boolean hidden) {
        this.f2116a = name;
        this.f2117b = mVar;
        this.f2118c = size;
        this.f2119d = isReversed;
        this.f2120e = hidden;
    }

    @Override // b.a.a.u.k.b
    public c a(b.a.a.f drawable, b.a.a.u.l.a layer) {
        return new b.a.a.s.b.f(drawable, layer, this);
    }

    public String b() {
        return this.f2116a;
    }

    public m<PointF, PointF> c() {
        return this.f2117b;
    }

    public f d() {
        return this.f2118c;
    }

    public boolean f() {
        return this.f2119d;
    }

    public boolean e() {
        return this.f2120e;
    }
}
