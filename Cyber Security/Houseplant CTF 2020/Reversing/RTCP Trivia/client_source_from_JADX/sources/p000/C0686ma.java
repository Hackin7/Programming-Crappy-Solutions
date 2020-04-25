package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: ma */
public final class C0686ma implements C0659lk {

    /* renamed from: b */
    private static final C0762nf f2960b = C0762nf.m2471a("connection");

    /* renamed from: c */
    private static final C0762nf f2961c = C0762nf.m2471a("host");

    /* renamed from: d */
    private static final C0762nf f2962d = C0762nf.m2471a("keep-alive");

    /* renamed from: e */
    private static final C0762nf f2963e = C0762nf.m2471a("proxy-connection");

    /* renamed from: f */
    private static final C0762nf f2964f = C0762nf.m2471a("transfer-encoding");

    /* renamed from: g */
    private static final C0762nf f2965g = C0762nf.m2471a("te");

    /* renamed from: h */
    private static final C0762nf f2966h = C0762nf.m2471a("encoding");

    /* renamed from: i */
    private static final C0762nf f2967i = C0762nf.m2471a("upgrade");

    /* renamed from: j */
    private static final List<C0762nf> f2968j = C0633kv.m1969a((T[]) new C0762nf[]{f2960b, f2961c, f2962d, f2963e, f2965g, f2964f, f2966h, f2967i, C0679lx.f2919c, C0679lx.f2920d, C0679lx.f2921e, C0679lx.f2922f});

    /* renamed from: k */
    private static final List<C0762nf> f2969k = C0633kv.m1969a((T[]) new C0762nf[]{f2960b, f2961c, f2962d, f2963e, f2965g, f2964f, f2966h, f2967i});

    /* renamed from: a */
    final C0654lh f2970a;

    /* renamed from: l */
    private final C0613ki f2971l;

    /* renamed from: m */
    private final C0611a f2972m;

    /* renamed from: n */
    private final C0688mb f2973n;

    /* renamed from: o */
    private C0706md f2974o;

    /* renamed from: ma$a */
    class C0687a extends C0764nh {

        /* renamed from: a */
        boolean f2975a = false;

        /* renamed from: b */
        long f2976b = 0;

        C0687a(C0778ns nsVar) {
            super(nsVar);
        }

        /* renamed from: a */
        private void m2127a(IOException iOException) {
            if (!this.f2975a) {
                this.f2975a = true;
                C0686ma.this.f2970a.mo2445a(false, (C0659lk) C0686ma.this, iOException);
            }
        }

        /* renamed from: a */
        public final long mo2414a(C0758nc ncVar, long j) {
            try {
                long a = this.f3271d.mo2414a(ncVar, j);
                if (a > 0) {
                    this.f2976b += a;
                }
                return a;
            } catch (IOException e) {
                m2127a(e);
                throw e;
            }
        }

        public final void close() {
            super.close();
            m2127a(null);
        }
    }

    public C0686ma(C0613ki kiVar, C0611a aVar, C0654lh lhVar, C0688mb mbVar) {
        this.f2971l = kiVar;
        this.f2972m = aVar;
        this.f2970a = lhVar;
        this.f2973n = mbVar;
    }

    /* renamed from: a */
    public final C0624a mo2451a(boolean z) {
        List c = this.f2974o.mo2507c();
        C0606a aVar = new C0606a();
        int size = c.size();
        C0606a aVar2 = aVar;
        C0668ls lsVar = null;
        for (int i = 0; i < size; i++) {
            C0679lx lxVar = (C0679lx) c.get(i);
            if (lxVar != null) {
                C0762nf nfVar = lxVar.f2923g;
                String a = lxVar.f2924h.mo2669a();
                if (nfVar.equals(C0679lx.f2918b)) {
                    StringBuilder sb = new StringBuilder("HTTP/1.1 ");
                    sb.append(a);
                    lsVar = C0668ls.m2073a(sb.toString());
                } else if (!f2969k.contains(nfVar)) {
                    C0631kt.f2730a.mo2366a(aVar2, nfVar.mo2669a(), a);
                }
            } else if (lsVar != null && lsVar.f2877b == 100) {
                aVar2 = new C0606a();
                lsVar = null;
            }
        }
        if (lsVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0624a aVar3 = new C0624a();
        aVar3.f2706b = C0616kj.HTTP_2;
        aVar3.f2707c = lsVar.f2877b;
        aVar3.f2708d = lsVar.f2878c;
        C0624a a2 = aVar3.mo2393a(aVar2.mo2331a());
        if (!z || C0631kt.f2730a.mo2358a(a2) != 100) {
            return a2;
        }
        return null;
    }

    /* renamed from: a */
    public final C0625ko mo2452a(C0623kn knVar) {
        C0600kc kcVar = this.f2970a.f2839f;
        C0580js jsVar = this.f2970a.f2838e;
        C0600kc.m1838q();
        return new C0665lp(knVar.mo2387a("Content-Type"), C0662lm.m2054a(knVar), C0768nl.m2508a((C0778ns) new C0687a(this.f2974o.f3059g)));
    }

    /* renamed from: a */
    public final C0777nr mo2453a(C0619kl klVar, long j) {
        return this.f2974o.mo2509d();
    }

    /* renamed from: a */
    public final void mo2454a() {
        this.f2973n.f2996q.mo2526b();
    }

    /* renamed from: a */
    public final void mo2455a(C0619kl klVar) {
        if (this.f2974o == null) {
            boolean z = klVar.f2680d != null;
            C0605ke keVar = klVar.f2679c;
            ArrayList arrayList = new ArrayList((keVar.f2577a.length / 2) + 4);
            arrayList.add(new C0679lx(C0679lx.f2919c, klVar.f2678b));
            arrayList.add(new C0679lx(C0679lx.f2920d, C0666lq.m2067a(klVar.f2677a)));
            String a = klVar.mo2375a("Host");
            if (a != null) {
                arrayList.add(new C0679lx(C0679lx.f2922f, a));
            }
            arrayList.add(new C0679lx(C0679lx.f2921e, klVar.f2677a.f2580a));
            int length = keVar.f2577a.length / 2;
            for (int i = 0; i < length; i++) {
                C0762nf a2 = C0762nf.m2471a(keVar.mo2322a(i).toLowerCase(Locale.US));
                if (!f2968j.contains(a2)) {
                    arrayList.add(new C0679lx(a2, keVar.mo2325b(i)));
                }
            }
            this.f2974o = this.f2973n.mo2482a((List<C0679lx>) arrayList, z);
            this.f2974o.f3061i.mo2688a((long) this.f2972m.mo2353c(), TimeUnit.MILLISECONDS);
            this.f2974o.f3062j.mo2688a((long) this.f2972m.mo2354d(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    public final void mo2456b() {
        this.f2974o.mo2509d().close();
    }

    /* renamed from: c */
    public final void mo2457c() {
        if (this.f2974o != null) {
            this.f2974o.mo2505b(C0678lw.CANCEL);
        }
    }
}
