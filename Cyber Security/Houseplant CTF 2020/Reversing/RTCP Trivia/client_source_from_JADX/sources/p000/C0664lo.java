package p000;

import java.util.List;

/* renamed from: lo */
public final class C0664lo implements C0611a {

    /* renamed from: a */
    public final C0654lh f2856a;

    /* renamed from: b */
    final C0659lk f2857b;

    /* renamed from: c */
    final C0648ld f2858c;

    /* renamed from: d */
    public final C0619kl f2859d;

    /* renamed from: e */
    final C0580js f2860e;

    /* renamed from: f */
    final C0600kc f2861f;

    /* renamed from: g */
    private final List<C0610kg> f2862g;

    /* renamed from: h */
    private final int f2863h;

    /* renamed from: i */
    private final int f2864i;

    /* renamed from: j */
    private final int f2865j;

    /* renamed from: k */
    private final int f2866k;

    /* renamed from: l */
    private int f2867l;

    public C0664lo(List<C0610kg> list, C0654lh lhVar, C0659lk lkVar, C0648ld ldVar, int i, C0619kl klVar, C0580js jsVar, C0600kc kcVar, int i2, int i3, int i4) {
        this.f2862g = list;
        this.f2858c = ldVar;
        this.f2856a = lhVar;
        this.f2857b = lkVar;
        this.f2863h = i;
        this.f2859d = klVar;
        this.f2860e = jsVar;
        this.f2861f = kcVar;
        this.f2864i = i2;
        this.f2865j = i3;
        this.f2866k = i4;
    }

    /* renamed from: a */
    public final C0619kl mo2350a() {
        return this.f2859d;
    }

    /* renamed from: a */
    public final C0623kn mo2351a(C0619kl klVar) {
        return mo2459a(klVar, this.f2856a, this.f2857b, this.f2858c);
    }

    /* renamed from: a */
    public final C0623kn mo2459a(C0619kl klVar, C0654lh lhVar, C0659lk lkVar, C0648ld ldVar) {
        C0619kl klVar2;
        if (this.f2863h >= this.f2862g.size()) {
            throw new AssertionError();
        }
        this.f2867l++;
        if (this.f2857b != null) {
            klVar2 = klVar;
            if (!this.f2858c.mo2430a(klVar2.f2677a)) {
                StringBuilder sb = new StringBuilder("network interceptor ");
                sb.append(this.f2862g.get(this.f2863h - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            klVar2 = klVar;
        }
        if (this.f2857b == null || this.f2867l <= 1) {
            C0664lo loVar = new C0664lo(this.f2862g, lhVar, lkVar, ldVar, this.f2863h + 1, klVar2, this.f2860e, this.f2861f, this.f2864i, this.f2865j, this.f2866k);
            C0610kg kgVar = (C0610kg) this.f2862g.get(this.f2863h);
            C0623kn a = kgVar.mo2349a(loVar);
            if (lkVar != null && this.f2863h + 1 < this.f2862g.size() && loVar.f2867l != 1) {
                StringBuilder sb2 = new StringBuilder("network interceptor ");
                sb2.append(kgVar);
                sb2.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb2.toString());
            } else if (a == null) {
                StringBuilder sb3 = new StringBuilder("interceptor ");
                sb3.append(kgVar);
                sb3.append(" returned null");
                throw new NullPointerException(sb3.toString());
            } else if (a.f2698g != null) {
                return a;
            } else {
                StringBuilder sb4 = new StringBuilder("interceptor ");
                sb4.append(kgVar);
                sb4.append(" returned a response with no body");
                throw new IllegalStateException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder("network interceptor ");
            sb5.append(this.f2862g.get(this.f2863h - 1));
            sb5.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* renamed from: b */
    public final int mo2352b() {
        return this.f2864i;
    }

    /* renamed from: c */
    public final int mo2353c() {
        return this.f2865j;
    }

    /* renamed from: d */
    public final int mo2354d() {
        return this.f2866k;
    }
}
