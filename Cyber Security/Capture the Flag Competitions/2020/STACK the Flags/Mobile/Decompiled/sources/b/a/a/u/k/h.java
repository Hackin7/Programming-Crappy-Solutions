package b.a.a.u.k;

import b.a.a.f;
import b.a.a.s.b.c;
import b.a.a.s.b.l;
import b.a.a.x.d;

public class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2149a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2150b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2151c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a a(int id) {
            if (id == 1) {
                return MERGE;
            }
            if (id == 2) {
                return ADD;
            }
            if (id == 3) {
                return SUBTRACT;
            }
            if (id == 4) {
                return INTERSECT;
            }
            if (id != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public h(String name, a mode, boolean hidden) {
        this.f2149a = name;
        this.f2150b = mode;
        this.f2151c = hidden;
    }

    public String c() {
        return this.f2149a;
    }

    public a b() {
        return this.f2150b;
    }

    public boolean d() {
        return this.f2151c;
    }

    @Override // b.a.a.u.k.b
    public c a(f drawable, b.a.a.u.l.a layer) {
        if (drawable.k()) {
            return new l(this);
        }
        d.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f2150b + '}';
    }
}
