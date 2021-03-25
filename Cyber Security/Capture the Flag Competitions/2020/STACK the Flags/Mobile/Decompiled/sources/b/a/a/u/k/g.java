package b.a.a.u.k;

import b.a.a.u.j.d;
import b.a.a.u.j.h;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final a f2140a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2141b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2142c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2143d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public g(a maskMode, h maskPath, d opacity, boolean inverted) {
        this.f2140a = maskMode;
        this.f2141b = maskPath;
        this.f2142c = opacity;
        this.f2143d = inverted;
    }

    public a a() {
        return this.f2140a;
    }

    public h b() {
        return this.f2141b;
    }

    public d c() {
        return this.f2142c;
    }

    public boolean d() {
        return this.f2143d;
    }
}
