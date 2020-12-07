package b.a.a.u.k;

import android.graphics.PointF;
import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.b.n;
import b.a.a.u.j.b;
import b.a.a.u.j.m;

public class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2158a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2159b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2160c;

    /* renamed from: d  reason: collision with root package name */
    public final m<PointF, PointF> f2161d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2162e;

    /* renamed from: f  reason: collision with root package name */
    public final b f2163f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2164g;
    public final b h;
    public final b i;
    public final boolean j;

    public enum a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: b  reason: collision with root package name */
        public final int f2168b;

        /* access modifiers changed from: public */
        a(int value) {
            this.f2168b = value;
        }

        public static a a(int value) {
            a[] values = values();
            for (a type : values) {
                if (type.f2168b == value) {
                    return type;
                }
            }
            return null;
        }
    }

    public i(String name, a type, b points, m<PointF, PointF> mVar, b rotation, b innerRadius, b outerRadius, b innerRoundedness, b outerRoundedness, boolean hidden) {
        this.f2158a = name;
        this.f2159b = type;
        this.f2160c = points;
        this.f2161d = mVar;
        this.f2162e = rotation;
        this.f2163f = innerRadius;
        this.f2164g = outerRadius;
        this.h = innerRoundedness;
        this.i = outerRoundedness;
        this.j = hidden;
    }

    public String d() {
        return this.f2158a;
    }

    public a j() {
        return this.f2159b;
    }

    public b g() {
        return this.f2160c;
    }

    public m<PointF, PointF> h() {
        return this.f2161d;
    }

    public b i() {
        return this.f2162e;
    }

    public b b() {
        return this.f2163f;
    }

    public b e() {
        return this.f2164g;
    }

    public b c() {
        return this.h;
    }

    public b f() {
        return this.i;
    }

    public boolean k() {
        return this.j;
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, b.a.a.u.l.a layer) {
        return new n(drawable, layer, this);
    }
}
