package b.a.a.u.l;

import b.a.a.u.j.j;
import b.a.a.u.j.k;
import b.a.a.u.j.l;
import b.a.a.u.k.g;
import java.util.List;
import java.util.Locale;
import net.sqlcipher.BuildConfig;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<b.a.a.u.k.b> f2227a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a.a.d f2228b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2229c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2230d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2231e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2232f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2233g;
    public final List<g> h;
    public final l i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final int o;
    public final int p;
    public final j q;
    public final k r;
    public final b.a.a.u.j.b s;
    public final List<b.a.a.y.a<Float>> t;
    public final b u;
    public final boolean v;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public d(List<b.a.a.u.k.b> list, b.a.a.d composition, String layerName, long layerId, a layerType, long parentId, String refId, List<g> list2, l transform, int solidWidth, int solidHeight, int solidColor, float timeStretch, float startFrame, int preCompWidth, int preCompHeight, j text, k textProperties, List<b.a.a.y.a<Float>> list3, b matteType, b.a.a.u.j.b timeRemapping, boolean hidden) {
        this.f2227a = list;
        this.f2228b = composition;
        this.f2229c = layerName;
        this.f2230d = layerId;
        this.f2231e = layerType;
        this.f2232f = parentId;
        this.f2233g = refId;
        this.h = list2;
        this.i = transform;
        this.j = solidWidth;
        this.k = solidHeight;
        this.l = solidColor;
        this.m = timeStretch;
        this.n = startFrame;
        this.o = preCompWidth;
        this.p = preCompHeight;
        this.q = text;
        this.r = textProperties;
        this.t = list3;
        this.u = matteType;
        this.s = timeRemapping;
        this.v = hidden;
    }

    public b.a.a.d a() {
        return this.f2228b;
    }

    public float t() {
        return this.m;
    }

    public float p() {
        return this.n / this.f2228b.e();
    }

    public List<b.a.a.y.a<Float>> c() {
        return this.t;
    }

    public long b() {
        return this.f2230d;
    }

    public String g() {
        return this.f2229c;
    }

    public String k() {
        return this.f2233g;
    }

    public int j() {
        return this.o;
    }

    public int i() {
        return this.p;
    }

    public List<g> e() {
        return this.h;
    }

    public a d() {
        return this.f2231e;
    }

    public b f() {
        return this.u;
    }

    public long h() {
        return this.f2232f;
    }

    public List<b.a.a.u.k.b> l() {
        return this.f2227a;
    }

    public l u() {
        return this.i;
    }

    public int m() {
        return this.l;
    }

    public int n() {
        return this.k;
    }

    public int o() {
        return this.j;
    }

    public j q() {
        return this.q;
    }

    public k r() {
        return this.r;
    }

    public b.a.a.u.j.b s() {
        return this.s;
    }

    public String toString() {
        return w(BuildConfig.FLAVOR);
    }

    public boolean v() {
        return this.v;
    }

    public String w(String prefix) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        sb.append(g());
        sb.append("\n");
        d parent = this.f2228b.s(h());
        if (parent != null) {
            sb.append("\t\tParents: ");
            sb.append(parent.g());
            d parent2 = this.f2228b.s(parent.h());
            while (parent2 != null) {
                sb.append("->");
                sb.append(parent2.g());
                parent2 = this.f2228b.s(parent2.h());
            }
            sb.append(prefix);
            sb.append("\n");
        }
        if (!e().isEmpty()) {
            sb.append(prefix);
            sb.append("\tMasks: ");
            sb.append(e().size());
            sb.append("\n");
        }
        if (!(o() == 0 || n() == 0)) {
            sb.append(prefix);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(o()), Integer.valueOf(n()), Integer.valueOf(m())));
        }
        if (!this.f2227a.isEmpty()) {
            sb.append(prefix);
            sb.append("\tShapes:\n");
            for (Object shape : this.f2227a) {
                sb.append(prefix);
                sb.append("\t\t");
                sb.append(shape);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
