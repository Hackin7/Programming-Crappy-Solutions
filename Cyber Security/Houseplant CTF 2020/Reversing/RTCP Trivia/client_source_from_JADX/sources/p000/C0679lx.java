package p000;

/* renamed from: lx */
public final class C0679lx {

    /* renamed from: a */
    public static final C0762nf f2917a = C0762nf.m2471a(":");

    /* renamed from: b */
    public static final C0762nf f2918b = C0762nf.m2471a(":status");

    /* renamed from: c */
    public static final C0762nf f2919c = C0762nf.m2471a(":method");

    /* renamed from: d */
    public static final C0762nf f2920d = C0762nf.m2471a(":path");

    /* renamed from: e */
    public static final C0762nf f2921e = C0762nf.m2471a(":scheme");

    /* renamed from: f */
    public static final C0762nf f2922f = C0762nf.m2471a(":authority");

    /* renamed from: g */
    public final C0762nf f2923g;

    /* renamed from: h */
    public final C0762nf f2924h;

    /* renamed from: i */
    final int f2925i;

    public C0679lx(String str, String str2) {
        this(C0762nf.m2471a(str), C0762nf.m2471a(str2));
    }

    public C0679lx(C0762nf nfVar, String str) {
        this(nfVar, C0762nf.m2471a(str));
    }

    public C0679lx(C0762nf nfVar, C0762nf nfVar2) {
        this.f2923g = nfVar;
        this.f2924h = nfVar2;
        this.f2925i = 32 + nfVar.mo2681g() + nfVar2.mo2681g();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0679lx) {
            C0679lx lxVar = (C0679lx) obj;
            if (this.f2923g.equals(lxVar.f2923g) && this.f2924h.equals(lxVar.f2924h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * (527 + this.f2923g.hashCode())) + this.f2924h.hashCode();
    }

    public final String toString() {
        return C0633kv.m1966a("%s: %s", this.f2923g.mo2669a(), this.f2924h.mo2669a());
    }
}
