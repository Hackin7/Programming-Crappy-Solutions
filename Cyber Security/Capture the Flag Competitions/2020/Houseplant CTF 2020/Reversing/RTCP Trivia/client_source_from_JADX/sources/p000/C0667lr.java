package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: lr */
public final class C0667lr implements C0610kg {

    /* renamed from: a */
    public volatile C0654lh f2871a;

    /* renamed from: b */
    public Object f2872b;

    /* renamed from: c */
    public volatile boolean f2873c;

    /* renamed from: d */
    private final C0613ki f2874d;

    /* renamed from: e */
    private final boolean f2875e;

    public C0667lr(C0613ki kiVar, boolean z) {
        this.f2874d = kiVar;
        this.f2875e = z;
    }

    /* renamed from: a */
    private static int m2068a(C0623kn knVar, int i) {
        String a = knVar.mo2387a("Retry-After");
        if (a == null) {
            return i;
        }
        if (a.matches("\\d+")) {
            return Integer.valueOf(a).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    private C0574jo m2069a(C0607kf kfVar) {
        C0582ju juVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        C0607kf kfVar2 = kfVar;
        if (kfVar.mo2333b()) {
            SSLSocketFactory sSLSocketFactory2 = this.f2874d.f2623o;
            hostnameVerifier = this.f2874d.f2625q;
            sSLSocketFactory = sSLSocketFactory2;
            juVar = this.f2874d.f2626r;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            juVar = null;
        }
        C0574jo joVar = new C0574jo(kfVar2.f2581b, kfVar2.f2582c, this.f2874d.f2630v, this.f2874d.f2622n, sSLSocketFactory, hostnameVerifier, juVar, this.f2874d.f2627s, this.f2874d.f2612d, this.f2874d.f2613e, this.f2874d.f2614f, this.f2874d.f2618j);
        return joVar;
    }

    /* renamed from: a */
    private boolean m2070a(IOException iOException, C0654lh lhVar, boolean z, C0619kl klVar) {
        lhVar.mo2443a(iOException);
        if (!this.f2874d.f2633y) {
            return false;
        }
        if (z && (klVar.f2680d instanceof C0669lt)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        return lhVar.f2836c != null || ((lhVar.f2835b != null && lhVar.f2835b.mo2439a()) || lhVar.f2840g.mo2437a());
    }

    /* renamed from: a */
    private static boolean m2071a(C0623kn knVar, C0607kf kfVar) {
        C0607kf kfVar2 = knVar.f2692a.f2677a;
        return kfVar2.f2581b.equals(kfVar.f2581b) && kfVar2.f2582c == kfVar.f2582c && kfVar2.f2580a.equals(kfVar.f2580a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d1, code lost:
        r1 = new java.lang.StringBuilder("Closing the body of ");
        r1.append(r0);
        r1.append(" didn't close its backing stream. Bad interceptor?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e9, code lost:
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ea, code lost:
        r1 = r0;
        r0 = r12;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        if (r0.f2701j.f2694c == 503) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (m2068a(r0, Integer.MAX_VALUE) != 0) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        r1 = r0.f2692a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r0.f2701j.f2694c != 408) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (m2068a(r0, 0) <= 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        r1 = r1.mo2283a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e1, code lost:
        if (r5.equals("HEAD") == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0169, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016a, code lost:
        if (r12 != null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016e, code lost:
        if (r14.f2875e != false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0170, code lost:
        r9.mo2447c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0173, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0174, code lost:
        p000.C0633kv.m1972a((java.io.Closeable) r0.f2698g);
        r13 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017d, code lost:
        if (r13 <= 20) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017f, code lost:
        r9.mo2447c();
        r0 = new java.lang.StringBuilder("Too many follow-up requests: ");
        r0.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0195, code lost:
        throw new java.net.ProtocolException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019a, code lost:
        if ((r12.f2680d instanceof p000.C0669lt) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019c, code lost:
        r9.mo2447c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a8, code lost:
        throw new java.net.HttpRetryException("Cannot retry streamed HTTP body", r0.f2694c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01af, code lost:
        if (m2071a(r0, r12.f2677a) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b1, code lost:
        r9.mo2447c();
        r1 = new p000.C0654lh(r14.f2874d.f2629u, m2069a(r12.f2677a), r7, r8, r14.f2872b);
        r14.f2871a = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (r9.mo2441a() == null) goto L_0x01ea;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0623kn mo2349a(p000.C0610kg.C0611a r15) {
        /*
            r14 = this;
            kl r0 = r15.mo2350a()
            lo r15 = (p000.C0664lo) r15
            js r7 = r15.f2860e
            kc r8 = r15.f2861f
            lh r9 = new lh
            ki r1 = r14.f2874d
            jw r2 = r1.f2629u
            kf r1 = r0.f2677a
            jo r3 = r14.m2069a(r1)
            java.lang.Object r6 = r14.f2872b
            r1 = r9
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r14.f2871a = r9
            r10 = 0
            r11 = 0
            r2 = r10
            r1 = r11
        L_0x0024:
            boolean r3 = r14.f2873c
            if (r3 == 0) goto L_0x0033
            r9.mo2447c()
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r15.<init>(r0)
            throw r15
        L_0x0033:
            r3 = 1
            kn r4 = r15.mo2459a(r0, r9, r11, r11)     // Catch:{ lf -> 0x01ff, IOException -> 0x01f1 }
            if (r1 == 0) goto L_0x005b
            kn$a r0 = r4.mo2388a()
            kn$a r1 = r1.mo2388a()
            r1.f2711g = r11
            kn r1 = r1.mo2395a()
            ko r4 = r1.f2698g
            if (r4 == 0) goto L_0x0054
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "priorResponse.body != null"
            r15.<init>(r0)
            throw r15
        L_0x0054:
            r0.f2714j = r1
            kn r0 = r0.mo2395a()
            goto L_0x005c
        L_0x005b:
            r0 = r4
        L_0x005c:
            kp r1 = r9.f2836c
            if (r0 != 0) goto L_0x0066
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0066:
            int r4 = r0.f2694c
            kl r5 = r0.f2692a
            java.lang.String r5 = r5.f2678b
            switch(r4) {
                case 300: goto L_0x00e3;
                case 301: goto L_0x00e3;
                case 302: goto L_0x00e3;
                case 303: goto L_0x00e3;
                case 307: goto L_0x00d3;
                case 308: goto L_0x00d3;
                case 401: goto L_0x00c8;
                case 407: goto L_0x00aa;
                case 408: goto L_0x0089;
                case 503: goto L_0x0071;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0169
        L_0x0071:
            kn r1 = r0.f2701j
            if (r1 == 0) goto L_0x007d
            kn r1 = r0.f2701j
            int r1 = r1.f2694c
            r3 = 503(0x1f7, float:7.05E-43)
            if (r1 == r3) goto L_0x0169
        L_0x007d:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = m2068a(r0, r1)
            if (r1 != 0) goto L_0x0169
        L_0x0086:
            kl r1 = r0.f2692a
            goto L_0x00d0
        L_0x0089:
            ki r1 = r14.f2874d
            boolean r1 = r1.f2633y
            if (r1 == 0) goto L_0x0169
            kl r1 = r0.f2692a
            km r1 = r1.f2680d
            boolean r1 = r1 instanceof p000.C0669lt
            if (r1 != 0) goto L_0x0169
            kn r1 = r0.f2701j
            if (r1 == 0) goto L_0x00a3
            kn r1 = r0.f2701j
            int r1 = r1.f2694c
            r3 = 408(0x198, float:5.72E-43)
            if (r1 == r3) goto L_0x0169
        L_0x00a3:
            int r1 = m2068a(r0, r10)
            if (r1 > 0) goto L_0x0169
            goto L_0x0086
        L_0x00aa:
            if (r1 == 0) goto L_0x00af
            java.net.Proxy r1 = r1.f2721b
            goto L_0x00b3
        L_0x00af:
            ki r1 = r14.f2874d
            java.net.Proxy r1 = r1.f2612d
        L_0x00b3:
            java.net.Proxy$Type r1 = r1.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP
            if (r1 == r3) goto L_0x00c3
            java.net.ProtocolException r15 = new java.net.ProtocolException
            java.lang.String r0 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r15.<init>(r0)
            throw r15
        L_0x00c3:
            ki r1 = r14.f2874d
            jp r1 = r1.f2627s
            goto L_0x00cc
        L_0x00c8:
            ki r1 = r14.f2874d
            jp r1 = r1.f2628t
        L_0x00cc:
            kl r1 = r1.mo2283a()
        L_0x00d0:
            r12 = r1
            goto L_0x016a
        L_0x00d3:
            java.lang.String r1 = "GET"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x00e3
            java.lang.String r1 = "HEAD"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0169
        L_0x00e3:
            ki r1 = r14.f2874d
            boolean r1 = r1.f2632x
            if (r1 == 0) goto L_0x0169
            java.lang.String r1 = "Location"
            java.lang.String r1 = r0.mo2387a(r1)
            if (r1 == 0) goto L_0x0169
            kl r4 = r0.f2692a
            kf r4 = r4.f2677a
            kf$a r1 = r4.mo2335c(r1)
            if (r1 == 0) goto L_0x0100
            kf r1 = r1.mo2347b()
            goto L_0x0101
        L_0x0100:
            r1 = r11
        L_0x0101:
            if (r1 == 0) goto L_0x0169
            java.lang.String r4 = r1.f2580a
            kl r6 = r0.f2692a
            kf r6 = r6.f2677a
            java.lang.String r6 = r6.f2580a
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0117
            ki r4 = r14.f2874d
            boolean r4 = r4.f2631w
            if (r4 == 0) goto L_0x0169
        L_0x0117:
            kl r4 = r0.f2692a
            kl$a r4 = r4.mo2376a()
            boolean r6 = p000.C0663ln.m2058a(r5)
            if (r6 == 0) goto L_0x0154
            java.lang.String r6 = "PROPFIND"
            boolean r6 = r5.equals(r6)
            java.lang.String r12 = "PROPFIND"
            boolean r12 = r5.equals(r12)
            r3 = r3 ^ r12
            if (r3 == 0) goto L_0x0138
            java.lang.String r3 = "GET"
            r4.mo2381a(r3, r11)
            goto L_0x0143
        L_0x0138:
            if (r6 == 0) goto L_0x013f
            kl r3 = r0.f2692a
            km r3 = r3.f2680d
            goto L_0x0140
        L_0x013f:
            r3 = r11
        L_0x0140:
            r4.mo2381a(r5, r3)
        L_0x0143:
            if (r6 != 0) goto L_0x0154
            java.lang.String r3 = "Transfer-Encoding"
            r4.mo2379a(r3)
            java.lang.String r3 = "Content-Length"
            r4.mo2379a(r3)
            java.lang.String r3 = "Content-Type"
            r4.mo2379a(r3)
        L_0x0154:
            boolean r3 = m2071a(r0, r1)
            if (r3 != 0) goto L_0x015f
            java.lang.String r3 = "Authorization"
            r4.mo2379a(r3)
        L_0x015f:
            kl$a r1 = r4.mo2382a(r1)
            kl r1 = r1.mo2383a()
            goto L_0x00d0
        L_0x0169:
            r12 = r11
        L_0x016a:
            if (r12 != 0) goto L_0x0174
            boolean r15 = r14.f2875e
            if (r15 != 0) goto L_0x0173
            r9.mo2447c()
        L_0x0173:
            return r0
        L_0x0174:
            ko r1 = r0.f2698g
            p000.C0633kv.m1972a(r1)
            int r13 = r2 + 1
            r1 = 20
            if (r13 <= r1) goto L_0x0196
            r9.mo2447c()
            java.net.ProtocolException r15 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Too many follow-up requests: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0196:
            km r1 = r12.f2680d
            boolean r1 = r1 instanceof p000.C0669lt
            if (r1 == 0) goto L_0x01a9
            r9.mo2447c()
            java.net.HttpRetryException r15 = new java.net.HttpRetryException
            java.lang.String r1 = "Cannot retry streamed HTTP body"
            int r0 = r0.f2694c
            r15.<init>(r1, r0)
            throw r15
        L_0x01a9:
            kf r1 = r12.f2677a
            boolean r1 = m2071a(r0, r1)
            if (r1 != 0) goto L_0x01cb
            r9.mo2447c()
            lh r9 = new lh
            ki r1 = r14.f2874d
            jw r2 = r1.f2629u
            kf r1 = r12.f2677a
            jo r3 = r14.m2069a(r1)
            java.lang.Object r6 = r14.f2872b
            r1 = r9
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r14.f2871a = r9
            goto L_0x01ea
        L_0x01cb:
            lk r1 = r9.mo2441a()
            if (r1 == 0) goto L_0x01ea
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Closing the body of "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " didn't close its backing stream. Bad interceptor?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x01ea:
            r1 = r0
            r0 = r12
            r2 = r13
            goto L_0x0024
        L_0x01ef:
            r15 = move-exception
            goto L_0x020b
        L_0x01f1:
            r4 = move-exception
            boolean r5 = r4 instanceof p000.C0677lv     // Catch:{ all -> 0x01ef }
            if (r5 != 0) goto L_0x01f7
            goto L_0x01f8
        L_0x01f7:
            r3 = r10
        L_0x01f8:
            boolean r3 = r14.m2070a(r4, r9, r3, r0)     // Catch:{ all -> 0x01ef }
            if (r3 != 0) goto L_0x0024
            throw r4     // Catch:{ all -> 0x01ef }
        L_0x01ff:
            r3 = move-exception
            java.io.IOException r4 = r3.f2822a     // Catch:{ all -> 0x01ef }
            boolean r4 = r14.m2070a(r4, r9, r10, r0)     // Catch:{ all -> 0x01ef }
            if (r4 != 0) goto L_0x0024
            java.io.IOException r15 = r3.f2822a     // Catch:{ all -> 0x01ef }
            throw r15     // Catch:{ all -> 0x01ef }
        L_0x020b:
            r9.mo2443a(r11)
            r9.mo2447c()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0667lr.mo2349a(kg$a):kn");
    }
}
