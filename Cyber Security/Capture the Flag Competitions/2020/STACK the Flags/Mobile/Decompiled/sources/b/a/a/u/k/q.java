package b.a.a.u.k;

import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.b.s;
import b.a.a.u.j.b;

public class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2210a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2211b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2212c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2213d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2214e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2215f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a a(int id) {
            if (id == 1) {
                return SIMULTANEOUSLY;
            }
            if (id == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + id);
        }
    }

    public q(String name, a type, b start, b end, b offset, boolean hidden) {
        this.f2210a = name;
        this.f2211b = type;
        this.f2212c = start;
        this.f2213d = end;
        this.f2214e = offset;
        this.f2215f = hidden;
    }

    public String c() {
        return this.f2210a;
    }

    public a f() {
        return this.f2211b;
    }

    public b b() {
        return this.f2213d;
    }

    public b e() {
        return this.f2212c;
    }

    public b d() {
        return this.f2214e;
    }

    public boolean g() {
        return this.f2215f;
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, b.a.a.u.l.a layer) {
        return new s(layer, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.f2212c + ", end: " + this.f2213d + ", offset: " + this.f2214e + "}";
    }
}
