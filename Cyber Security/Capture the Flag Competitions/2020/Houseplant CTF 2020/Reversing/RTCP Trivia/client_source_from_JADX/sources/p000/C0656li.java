package p000;

import java.util.List;

/* renamed from: li */
public final class C0656li implements C0610kg {

    /* renamed from: a */
    private final C0592jz f2849a;

    public C0656li(C0592jz jzVar) {
        this.f2849a = jzVar;
    }

    /* renamed from: a */
    public final C0623kn mo2349a(C0611a aVar) {
        boolean z;
        String str;
        C0619kl a = aVar.mo2350a();
        C0620a a2 = a.mo2376a();
        C0621km kmVar = a.f2680d;
        if (kmVar != null) {
            C0612kh a3 = kmVar.mo2384a();
            if (a3 != null) {
                a2.mo2380a("Content-Type", a3.toString());
            }
            long b = kmVar.mo2386b();
            if (b != -1) {
                a2.mo2380a("Content-Length", Long.toString(b));
                str = "Transfer-Encoding";
            } else {
                a2.mo2380a("Transfer-Encoding", "chunked");
                str = "Content-Length";
            }
            a2.mo2379a(str);
        }
        if (a.mo2375a("Host") == null) {
            a2.mo2380a("Host", C0633kv.m1967a(a.f2677a, false));
        }
        if (a.mo2375a("Connection") == null) {
            a2.mo2380a("Connection", "Keep-Alive");
        }
        if (a.mo2375a("Accept-Encoding") == null && a.mo2375a("Range") == null) {
            a2.mo2380a("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List b2 = this.f2849a.mo2315b();
        if (!b2.isEmpty()) {
            String str2 = "Cookie";
            StringBuilder sb = new StringBuilder();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C0591jy jyVar = (C0591jy) b2.get(i);
                sb.append(jyVar.f2544a);
                sb.append('=');
                sb.append(jyVar.f2545b);
            }
            a2.mo2380a(str2, sb.toString());
        }
        if (a.mo2375a("User-Agent") == null) {
            a2.mo2380a("User-Agent", "okhttp/3.10.0");
        }
        C0623kn a4 = aVar.mo2351a(a2.mo2383a());
        C0662lm.m2055a(this.f2849a, a.f2677a, a4.f2697f);
        C0624a a5 = a4.mo2388a();
        a5.f2705a = a;
        if (z && "gzip".equalsIgnoreCase(a4.mo2387a("Content-Encoding")) && C0662lm.m2057b(a4)) {
            C0766nj njVar = new C0766nj(a4.f2698g.mo2398b());
            a5.mo2393a(a4.f2697f.mo2324a().mo2329a("Content-Encoding").mo2329a("Content-Length").mo2331a());
            a5.f2711g = new C0665lp(a4.mo2387a("Content-Type"), -1, C0768nl.m2508a((C0778ns) njVar));
        }
        return a5.mo2395a();
    }
}
