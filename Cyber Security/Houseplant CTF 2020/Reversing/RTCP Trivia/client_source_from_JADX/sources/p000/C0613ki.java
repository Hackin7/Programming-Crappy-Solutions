package p000;

import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: ki */
public class C0613ki implements Cloneable {

    /* renamed from: a */
    static final List<C0616kj> f2606a = C0633kv.m1969a((T[]) new C0616kj[]{C0616kj.HTTP_2, C0616kj.HTTP_1_1});

    /* renamed from: b */
    static final List<C0589jx> f2607b = C0633kv.m1969a((T[]) new C0589jx[]{C0589jx.f2528a, C0589jx.f2530c});

    /* renamed from: A */
    final int f2608A;

    /* renamed from: B */
    final int f2609B;

    /* renamed from: C */
    public final int f2610C;

    /* renamed from: c */
    final C0597ka f2611c;
    @Nullable

    /* renamed from: d */
    public final Proxy f2612d;

    /* renamed from: e */
    public final List<C0616kj> f2613e;

    /* renamed from: f */
    public final List<C0589jx> f2614f;

    /* renamed from: g */
    final List<C0610kg> f2615g;

    /* renamed from: h */
    final List<C0610kg> f2616h;

    /* renamed from: i */
    final C0603a f2617i;

    /* renamed from: j */
    public final ProxySelector f2618j;

    /* renamed from: k */
    public final C0592jz f2619k;
    @Nullable

    /* renamed from: l */
    final C0577jq f2620l;
    @Nullable

    /* renamed from: m */
    final C0645la f2621m;

    /* renamed from: n */
    public final SocketFactory f2622n;
    @Nullable

    /* renamed from: o */
    public final SSLSocketFactory f2623o;
    @Nullable

    /* renamed from: p */
    final C0732mt f2624p;

    /* renamed from: q */
    public final HostnameVerifier f2625q;

    /* renamed from: r */
    public final C0582ju f2626r;

    /* renamed from: s */
    public final C0575jp f2627s;

    /* renamed from: t */
    public final C0575jp f2628t;

    /* renamed from: u */
    public final C0587jw f2629u;

    /* renamed from: v */
    public final C0598kb f2630v;

    /* renamed from: w */
    public final boolean f2631w;

    /* renamed from: x */
    public final boolean f2632x;

    /* renamed from: y */
    public final boolean f2633y;

    /* renamed from: z */
    final int f2634z;

    /* renamed from: ki$a */
    public static final class C0615a {

        /* renamed from: A */
        int f2635A;

        /* renamed from: a */
        C0597ka f2636a;
        @Nullable

        /* renamed from: b */
        Proxy f2637b;

        /* renamed from: c */
        public List<C0616kj> f2638c;

        /* renamed from: d */
        List<C0589jx> f2639d;

        /* renamed from: e */
        final List<C0610kg> f2640e;

        /* renamed from: f */
        final List<C0610kg> f2641f;

        /* renamed from: g */
        public C0603a f2642g;

        /* renamed from: h */
        ProxySelector f2643h;

        /* renamed from: i */
        C0592jz f2644i;
        @Nullable

        /* renamed from: j */
        C0577jq f2645j;
        @Nullable

        /* renamed from: k */
        C0645la f2646k;

        /* renamed from: l */
        SocketFactory f2647l;
        @Nullable

        /* renamed from: m */
        SSLSocketFactory f2648m;
        @Nullable

        /* renamed from: n */
        C0732mt f2649n;

        /* renamed from: o */
        HostnameVerifier f2650o;

        /* renamed from: p */
        C0582ju f2651p;

        /* renamed from: q */
        C0575jp f2652q;

        /* renamed from: r */
        C0575jp f2653r;

        /* renamed from: s */
        C0587jw f2654s;

        /* renamed from: t */
        C0598kb f2655t;

        /* renamed from: u */
        boolean f2656u;

        /* renamed from: v */
        boolean f2657v;

        /* renamed from: w */
        boolean f2658w;

        /* renamed from: x */
        int f2659x;

        /* renamed from: y */
        int f2660y;

        /* renamed from: z */
        int f2661z;

        public C0615a() {
            this.f2640e = new ArrayList();
            this.f2641f = new ArrayList();
            this.f2636a = new C0597ka();
            this.f2638c = C0613ki.f2606a;
            this.f2639d = C0613ki.f2607b;
            this.f2642g = C0600kc.m1821a(C0600kc.f2571a);
            this.f2643h = ProxySelector.getDefault();
            this.f2644i = C0592jz.f2553a;
            this.f2647l = SocketFactory.getDefault();
            this.f2650o = C0733mu.f3135a;
            this.f2651p = C0582ju.f2396a;
            this.f2652q = C0575jp.f2370a;
            this.f2653r = C0575jp.f2370a;
            this.f2654s = new C0587jw();
            this.f2655t = C0598kb.f2570a;
            this.f2656u = true;
            this.f2657v = true;
            this.f2658w = true;
            this.f2659x = 10000;
            this.f2660y = 10000;
            this.f2661z = 10000;
            this.f2635A = 0;
        }

        public C0615a(C0613ki kiVar) {
            this.f2640e = new ArrayList();
            this.f2641f = new ArrayList();
            this.f2636a = kiVar.f2611c;
            this.f2637b = kiVar.f2612d;
            this.f2638c = kiVar.f2613e;
            this.f2639d = kiVar.f2614f;
            this.f2640e.addAll(kiVar.f2615g);
            this.f2641f.addAll(kiVar.f2616h);
            this.f2642g = kiVar.f2617i;
            this.f2643h = kiVar.f2618j;
            this.f2644i = kiVar.f2619k;
            this.f2646k = kiVar.f2621m;
            this.f2645j = kiVar.f2620l;
            this.f2647l = kiVar.f2622n;
            this.f2648m = kiVar.f2623o;
            this.f2649n = kiVar.f2624p;
            this.f2650o = kiVar.f2625q;
            this.f2651p = kiVar.f2626r;
            this.f2652q = kiVar.f2627s;
            this.f2653r = kiVar.f2628t;
            this.f2654s = kiVar.f2629u;
            this.f2655t = kiVar.f2630v;
            this.f2656u = kiVar.f2631w;
            this.f2657v = kiVar.f2632x;
            this.f2658w = kiVar.f2633y;
            this.f2659x = kiVar.f2634z;
            this.f2660y = kiVar.f2608A;
            this.f2661z = kiVar.f2609B;
            this.f2635A = kiVar.f2610C;
        }
    }

    static {
        C0631kt.f2730a = new C0631kt() {
            /* renamed from: a */
            public final int mo2358a(C0624a aVar) {
                return aVar.f2707c;
            }

            /* renamed from: a */
            public final Socket mo2359a(C0587jw jwVar, C0574jo joVar, C0654lh lhVar) {
                if (C0587jw.f2520g || Thread.holdsLock(jwVar)) {
                    for (C0648ld ldVar : jwVar.f2523d) {
                        if (ldVar.mo2429a(joVar, (C0627kp) null) && ldVar.mo2428a() && ldVar != lhVar.mo2446b()) {
                            if (!C0654lh.f2833k && !Thread.holdsLock(lhVar.f2837d)) {
                                throw new AssertionError();
                            } else if (lhVar.f2843j == null && lhVar.f2841h.f2814k.size() == 1) {
                                Reference reference = (Reference) lhVar.f2841h.f2814k.get(0);
                                Socket a = lhVar.mo2440a(true, false, false);
                                lhVar.f2841h = ldVar;
                                ldVar.f2814k.add(reference);
                                return a;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            /* renamed from: a */
            public final C0580js mo2360a(C0613ki kiVar, C0619kl klVar) {
                return C0617kk.m1902a(kiVar, klVar, true);
            }

            /* renamed from: a */
            public final C0648ld mo2361a(C0587jw jwVar, C0574jo joVar, C0654lh lhVar, C0627kp kpVar) {
                if (C0587jw.f2520g || Thread.holdsLock(jwVar)) {
                    for (C0648ld ldVar : jwVar.f2523d) {
                        if (ldVar.mo2429a(joVar, kpVar)) {
                            lhVar.mo2444a(ldVar, true);
                            return ldVar;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            /* renamed from: a */
            public final C0650le mo2362a(C0587jw jwVar) {
                return jwVar.f2524e;
            }

            /* renamed from: a */
            public final C0654lh mo2363a(C0580js jsVar) {
                return ((C0617kk) jsVar).f2670b.f2871a;
            }

            /* renamed from: a */
            public final void mo2364a(C0589jx jxVar, SSLSocket sSLSocket, boolean z) {
                String[] a = jxVar.f2534f != null ? C0633kv.m1978a(C0585jv.f2430a, sSLSocket.getEnabledCipherSuites(), jxVar.f2534f) : sSLSocket.getEnabledCipherSuites();
                String[] a2 = jxVar.f2535g != null ? C0633kv.m1978a(C0633kv.f2739h, sSLSocket.getEnabledProtocols(), jxVar.f2535g) : sSLSocket.getEnabledProtocols();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a3 = C0633kv.m1963a(C0585jv.f2430a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z && a3 != -1) {
                    a = C0633kv.m1979a(a, supportedCipherSuites[a3]);
                }
                C0589jx b = new C0590a(jxVar).mo2307a(a).mo2309b(a2).mo2310b();
                if (b.f2535g != null) {
                    sSLSocket.setEnabledProtocols(b.f2535g);
                }
                if (b.f2534f != null) {
                    sSLSocket.setEnabledCipherSuites(b.f2534f);
                }
            }

            /* renamed from: a */
            public final void mo2365a(C0606a aVar, String str) {
                int indexOf = str.indexOf(":", 1);
                if (indexOf != -1) {
                    aVar.mo2330a(str.substring(0, indexOf), str.substring(indexOf + 1));
                } else if (str.startsWith(":")) {
                    aVar.mo2330a("", str.substring(1));
                } else {
                    aVar.mo2330a("", str);
                }
            }

            /* renamed from: a */
            public final void mo2366a(C0606a aVar, String str, String str2) {
                aVar.mo2330a(str, str2);
            }

            /* renamed from: a */
            public final boolean mo2367a(C0574jo joVar, C0574jo joVar2) {
                return joVar.mo2279a(joVar2);
            }

            /* renamed from: a */
            public final boolean mo2368a(C0587jw jwVar, C0648ld ldVar) {
                if (!C0587jw.f2520g && !Thread.holdsLock(jwVar)) {
                    throw new AssertionError();
                } else if (ldVar.f2811h || jwVar.f2521b == 0) {
                    jwVar.f2523d.remove(ldVar);
                    return true;
                } else {
                    jwVar.notifyAll();
                    return false;
                }
            }

            /* renamed from: b */
            public final void mo2369b(C0587jw jwVar, C0648ld ldVar) {
                if (C0587jw.f2520g || Thread.holdsLock(jwVar)) {
                    if (!jwVar.f2525f) {
                        jwVar.f2525f = true;
                        C0587jw.f2519a.execute(jwVar.f2522c);
                    }
                    jwVar.f2523d.add(ldVar);
                    return;
                }
                throw new AssertionError();
            }
        };
    }

    public C0613ki() {
        this(new C0615a());
    }

    public C0613ki(C0615a aVar) {
        boolean z;
        C0732mt mtVar;
        this.f2611c = aVar.f2636a;
        this.f2612d = aVar.f2637b;
        this.f2613e = aVar.f2638c;
        this.f2614f = aVar.f2639d;
        this.f2615g = C0633kv.m1968a(aVar.f2640e);
        this.f2616h = C0633kv.m1968a(aVar.f2641f);
        this.f2617i = aVar.f2642g;
        this.f2618j = aVar.f2643h;
        this.f2619k = aVar.f2644i;
        this.f2620l = aVar.f2645j;
        this.f2621m = aVar.f2646k;
        this.f2622n = aVar.f2647l;
        Iterator it = this.f2614f.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C0589jx jxVar = (C0589jx) it.next();
                if (z || jxVar.f2532d) {
                    z = true;
                }
            }
        }
        if (aVar.f2648m != null || !z) {
            this.f2623o = aVar.f2648m;
            mtVar = aVar.f2649n;
        } else {
            X509TrustManager a = m1888a();
            this.f2623o = m1887a(a);
            mtVar = C0728mp.m2273c().mo2540a(a);
        }
        this.f2624p = mtVar;
        this.f2625q = aVar.f2650o;
        C0582ju juVar = aVar.f2651p;
        C0732mt mtVar2 = this.f2624p;
        if (!C0633kv.m1975a((Object) juVar.f2398c, (Object) mtVar2)) {
            juVar = new C0582ju(juVar.f2397b, mtVar2);
        }
        this.f2626r = juVar;
        this.f2627s = aVar.f2652q;
        this.f2628t = aVar.f2653r;
        this.f2629u = aVar.f2654s;
        this.f2630v = aVar.f2655t;
        this.f2631w = aVar.f2656u;
        this.f2632x = aVar.f2657v;
        this.f2633y = aVar.f2658w;
        this.f2634z = aVar.f2659x;
        this.f2608A = aVar.f2660y;
        this.f2609B = aVar.f2661z;
        this.f2610C = aVar.f2635A;
        if (this.f2615g.contains(null)) {
            StringBuilder sb = new StringBuilder("Null interceptor: ");
            sb.append(this.f2615g);
            throw new IllegalStateException(sb.toString());
        } else if (this.f2616h.contains(null)) {
            StringBuilder sb2 = new StringBuilder("Null network interceptor: ");
            sb2.append(this.f2616h);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static SSLSocketFactory m1887a(X509TrustManager x509TrustManager) {
        try {
            SSLContext g_ = C0728mp.m2273c().mo2555g_();
            g_.init(null, new TrustManager[]{x509TrustManager}, null);
            return g_.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C0633kv.m1964a("No System TLS", (Exception) e);
        }
    }

    /* renamed from: a */
    private static X509TrustManager m1888a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1) {
                if (trustManagers[0] instanceof X509TrustManager) {
                    return (X509TrustManager) trustManagers[0];
                }
            }
            StringBuilder sb = new StringBuilder("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e) {
            throw C0633kv.m1964a("No System TLS", (Exception) e);
        }
    }
}
