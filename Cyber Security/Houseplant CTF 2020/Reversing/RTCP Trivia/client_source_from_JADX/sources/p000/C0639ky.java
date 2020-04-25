package p000;

import java.util.Date;
import javax.annotation.Nullable;

/* renamed from: ky */
public final class C0639ky {
    @Nullable

    /* renamed from: a */
    public final C0619kl f2758a;
    @Nullable

    /* renamed from: b */
    public final C0623kn f2759b;

    /* renamed from: ky$a */
    public static class C0640a {

        /* renamed from: a */
        final long f2760a;

        /* renamed from: b */
        final C0619kl f2761b;

        /* renamed from: c */
        final C0623kn f2762c;

        /* renamed from: d */
        Date f2763d;

        /* renamed from: e */
        String f2764e;

        /* renamed from: f */
        Date f2765f;

        /* renamed from: g */
        String f2766g;

        /* renamed from: h */
        Date f2767h;

        /* renamed from: i */
        long f2768i;

        /* renamed from: j */
        long f2769j;

        /* renamed from: k */
        String f2770k;

        /* renamed from: l */
        int f2771l = -1;

        public C0640a(long j, C0619kl klVar, C0623kn knVar) {
            this.f2760a = j;
            this.f2761b = klVar;
            this.f2762c = knVar;
            if (knVar != null) {
                this.f2768i = knVar.f2702k;
                this.f2769j = knVar.f2703l;
                C0605ke keVar = knVar.f2697f;
                int length = keVar.f2577a.length / 2;
                for (int i = 0; i < length; i++) {
                    String a = keVar.mo2322a(i);
                    String b = keVar.mo2325b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.f2763d = C0660ll.m2050a(b);
                        this.f2764e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.f2767h = C0660ll.m2050a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f2765f = C0660ll.m2050a(b);
                        this.f2766g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.f2770k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.f2771l = C0662lm.m2056b(b, -1);
                    }
                }
            }
        }
    }

    C0639ky(C0619kl klVar, C0623kn knVar) {
        this.f2758a = klVar;
        this.f2759b = knVar;
    }

    /* renamed from: a */
    public static boolean m1995a(C0623kn knVar, C0619kl klVar) {
        switch (knVar.f2694c) {
            case 200:
            case 203:
            case 204:
            case 300:
            case 301:
            case 308:
            case 404:
            case 405:
            case 410:
            case 414:
            case 501:
                break;
            case 302:
            case 307:
                if (knVar.mo2387a("Expires") == null && knVar.mo2389b().f2377e == -1 && !knVar.mo2389b().f2379g && !knVar.mo2389b().f2378f) {
                    return false;
                }
            default:
                return false;
        }
        return !knVar.mo2389b().f2376d && !klVar.mo2377b().f2376d;
    }
}
