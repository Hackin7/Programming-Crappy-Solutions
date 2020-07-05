package p000;

import java.net.ProtocolException;

/* renamed from: lj */
public final class C0657lj implements C0610kg {

    /* renamed from: a */
    private final boolean f2850a;

    /* renamed from: lj$a */
    static final class C0658a extends C0763ng {

        /* renamed from: a */
        long f2851a;

        C0658a(C0777nr nrVar) {
            super(nrVar);
        }

        /* renamed from: a_ */
        public final void mo2450a_(C0758nc ncVar, long j) {
            super.mo2450a_(ncVar, j);
            this.f2851a += j;
        }
    }

    public C0657lj(boolean z) {
        this.f2850a = z;
    }

    /* renamed from: a */
    public final C0623kn mo2349a(C0611a aVar) {
        C0624a aVar2;
        C0625ko koVar;
        C0664lo loVar = (C0664lo) aVar;
        C0659lk lkVar = loVar.f2857b;
        C0654lh lhVar = loVar.f2856a;
        C0648ld ldVar = loVar.f2858c;
        C0619kl klVar = loVar.f2859d;
        long currentTimeMillis = System.currentTimeMillis();
        C0600kc.m1832k();
        lkVar.mo2455a(klVar);
        C0600kc.m1833l();
        C0624a aVar3 = null;
        if (C0663ln.m2058a(klVar.f2678b) && klVar.f2680d != null) {
            if ("100-continue".equalsIgnoreCase(klVar.mo2375a("Expect"))) {
                lkVar.mo2454a();
                C0600kc.m1836o();
                aVar3 = lkVar.mo2451a(true);
            }
            if (aVar3 == null) {
                C0600kc.m1834m();
                C0760nd a = C0768nl.m2507a((C0777nr) new C0658a(lkVar.mo2453a(klVar, klVar.f2680d.mo2386b())));
                klVar.f2680d.mo2385a(a);
                a.close();
                C0600kc.m1835n();
            } else if (!ldVar.mo2428a()) {
                lhVar.mo2448d();
            }
        }
        lkVar.mo2456b();
        if (aVar3 == null) {
            C0600kc.m1836o();
            aVar3 = lkVar.mo2451a(false);
        }
        aVar3.f2705a = klVar;
        aVar3.f2709e = lhVar.mo2446b().f2807d;
        aVar3.f2715k = currentTimeMillis;
        aVar3.f2716l = System.currentTimeMillis();
        C0623kn a2 = aVar3.mo2395a();
        int i = a2.f2694c;
        if (i == 100) {
            C0624a a3 = lkVar.mo2451a(false);
            a3.f2705a = klVar;
            a3.f2709e = lhVar.mo2446b().f2807d;
            a3.f2715k = currentTimeMillis;
            a3.f2716l = System.currentTimeMillis();
            a2 = a3.mo2395a();
            i = a2.f2694c;
        }
        C0600kc.m1837p();
        if (!this.f2850a || i != 101) {
            aVar2 = a2.mo2388a();
            koVar = lkVar.mo2452a(a2);
        } else {
            aVar2 = a2.mo2388a();
            koVar = C0633kv.f2734c;
        }
        aVar2.f2711g = koVar;
        C0623kn a4 = aVar2.mo2395a();
        if ("close".equalsIgnoreCase(a4.f2692a.mo2375a("Connection")) || "close".equalsIgnoreCase(a4.mo2387a("Connection"))) {
            lhVar.mo2448d();
        }
        if ((i != 204 && i != 205) || a4.f2698g.mo2397a() <= 0) {
            return a4;
        }
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(i);
        sb.append(" had non-zero Content-Length: ");
        sb.append(a4.f2698g.mo2397a());
        throw new ProtocolException(sb.toString());
    }
}
