package b.a.a.u.j;

import android.graphics.PointF;
import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.c.o;
import b.a.a.u.k.b;
import b.a.a.u.l.a;

public class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public final e f2108a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f2109b;

    /* renamed from: c  reason: collision with root package name */
    public final g f2110c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2111d;

    /* renamed from: e  reason: collision with root package name */
    public final d f2112e;

    /* renamed from: f  reason: collision with root package name */
    public final b f2113f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2114g;
    public final b h;
    public final b i;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public l(e anchorPoint, m<PointF, PointF> mVar, g scale, b rotation, d opacity, b startOpacity, b endOpacity, b skew, b skewAngle) {
        this.f2108a = anchorPoint;
        this.f2109b = mVar;
        this.f2110c = scale;
        this.f2111d = rotation;
        this.f2112e = opacity;
        this.h = startOpacity;
        this.i = endOpacity;
        this.f2113f = skew;
        this.f2114g = skewAngle;
    }

    public e c() {
        return this.f2108a;
    }

    public m<PointF, PointF> f() {
        return this.f2109b;
    }

    public g h() {
        return this.f2110c;
    }

    public b g() {
        return this.f2111d;
    }

    public d e() {
        return this.f2112e;
    }

    public b k() {
        return this.h;
    }

    public b d() {
        return this.i;
    }

    public b i() {
        return this.f2113f;
    }

    public b j() {
        return this.f2114g;
    }

    public o b() {
        return new o(this);
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, a layer) {
        return null;
    }
}
