package p000;

/* renamed from: je */
public final class C0551je<D> {

    /* renamed from: a */
    public int f2253a;

    /* renamed from: b */
    public C0552a<D> f2254b;

    /* renamed from: c */
    public boolean f2255c;

    /* renamed from: d */
    public boolean f2256d;

    /* renamed from: e */
    public boolean f2257e;

    /* renamed from: f */
    public boolean f2258f;

    /* renamed from: g */
    public boolean f2259g;

    /* renamed from: je$a */
    public interface C0552a<D> {
    }

    /* renamed from: a */
    public static String m1728a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0374fz.m1183a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo2146a() {
        this.f2257e = true;
        this.f2255c = false;
        this.f2256d = false;
        this.f2258f = false;
        this.f2259g = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0374fz.m1183a(this, sb);
        sb.append(" id=");
        sb.append(this.f2253a);
        sb.append("}");
        return sb.toString();
    }
}
