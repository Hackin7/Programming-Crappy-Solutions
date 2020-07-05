package p000;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: ld */
public final class C0648ld extends C0696b {

    /* renamed from: a */
    public final C0627kp f2804a;

    /* renamed from: b */
    public Socket f2805b;

    /* renamed from: c */
    public Socket f2806c;

    /* renamed from: d */
    public C0604kd f2807d;

    /* renamed from: e */
    C0688mb f2808e;

    /* renamed from: f */
    public C0761ne f2809f;

    /* renamed from: g */
    public C0760nd f2810g;

    /* renamed from: h */
    public boolean f2811h;

    /* renamed from: i */
    public int f2812i;

    /* renamed from: j */
    public int f2813j = 1;

    /* renamed from: k */
    public final List<Reference<C0654lh>> f2814k = new ArrayList();

    /* renamed from: l */
    public long f2815l = Long.MAX_VALUE;

    /* renamed from: n */
    private final C0587jw f2816n;

    /* renamed from: o */
    private C0616kj f2817o;

    public C0648ld(C0587jw jwVar, C0627kp kpVar) {
        this.f2816n = jwVar;
        this.f2804a = kpVar;
    }

    /* renamed from: a */
    private void m2008a(int i, int i2) {
        Proxy proxy = this.f2804a.f2721b;
        this.f2805b = (proxy.type() == Type.DIRECT || proxy.type() == Type.HTTP) ? this.f2804a.f2720a.f2361c.createSocket() : new Socket(proxy);
        C0600kc.m1825d();
        this.f2805b.setSoTimeout(i2);
        try {
            C0728mp.m2273c().mo2543a(this.f2805b, this.f2804a.f2722c, i);
            try {
                this.f2809f = C0768nl.m2508a(C0768nl.m2513b(this.f2805b));
                this.f2810g = C0768nl.m2507a(C0768nl.m2509a(this.f2805b));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.f2804a.f2722c);
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0163 A[Catch:{ all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0169 A[Catch:{ all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2009a(p000.C0647lc r9) {
        /*
            r8 = this;
            kp r0 = r8.f2804a
            jo r0 = r0.f2720a
            javax.net.ssl.SSLSocketFactory r1 = r0.f2367i
            r2 = 0
            java.net.Socket r3 = r8.f2805b     // Catch:{ AssertionError -> 0x015c }
            kf r4 = r0.f2359a     // Catch:{ AssertionError -> 0x015c }
            java.lang.String r4 = r4.f2581b     // Catch:{ AssertionError -> 0x015c }
            kf r5 = r0.f2359a     // Catch:{ AssertionError -> 0x015c }
            int r5 = r5.f2582c     // Catch:{ AssertionError -> 0x015c }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x015c }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x015c }
            int r3 = r9.f2801b     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.util.List<jx> r4 = r9.f2800a     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            int r4 = r4.size()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
        L_0x0020:
            if (r3 >= r4) goto L_0x0037
            java.util.List<jx> r5 = r9.f2800a     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            jx r5 = (p000.C0589jx) r5     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            boolean r7 = r5.mo2302a(r1)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            if (r7 == 0) goto L_0x0034
            int r3 = r3 + r6
            r9.f2801b = r3     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            goto L_0x0038
        L_0x0034:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0037:
            r5 = r2
        L_0x0038:
            if (r5 != 0) goto L_0x006a
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r3 = "Unable to find acceptable protocols. isFallback="
            r2.<init>(r3)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            boolean r3 = r9.f2803d     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r3 = ", modes="
            r2.append(r3)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.util.List<jx> r9 = r9.f2800a     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r2.append(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r9 = ", supported protocols="
            r2.append(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String[] r9 = r1.getEnabledProtocols()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r9 = java.util.Arrays.toString(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r2.append(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r9 = r2.toString()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r0.<init>(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            throw r0     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
        L_0x006a:
            boolean r3 = r9.mo2424a(r1)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r9.f2802c = r3     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            kt r3 = p000.C0631kt.f2730a     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            boolean r9 = r9.f2803d     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r3.mo2364a(r5, r1, r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            boolean r9 = r5.f2533e     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            if (r9 == 0) goto L_0x0088
            mp r9 = p000.C0728mp.m2273c()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            kf r3 = r0.f2359a     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r3 = r3.f2581b     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.util.List<kj> r4 = r0.f2363e     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r9.mo2544a(r1, r3, r4)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
        L_0x0088:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            javax.net.ssl.SSLSession r9 = r1.getSession()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r3 = "NONE"
            java.lang.String r4 = r9.getProtocol()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            boolean r3 = r3.equals(r4)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r4 = 0
            if (r3 != 0) goto L_0x00a9
            java.lang.String r3 = "SSL_NULL_WITH_NULL_NULL"
            java.lang.String r7 = r9.getCipherSuite()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            boolean r3 = r3.equals(r7)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            if (r3 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r6 = r4
        L_0x00aa:
            if (r6 != 0) goto L_0x00b4
            java.io.IOException r9 = new java.io.IOException     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r0 = "a valid ssl session was not established"
            r9.<init>(r0)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            throw r9     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
        L_0x00b4:
            kd r3 = p000.C0604kd.m1844a(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            javax.net.ssl.HostnameVerifier r6 = r0.f2368j     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            kf r7 = r0.f2359a     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r7 = r7.f2581b     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            boolean r9 = r6.verify(r7, r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            if (r9 != 0) goto L_0x010c
            java.util.List<java.security.cert.Certificate> r9 = r3.f2574b     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.Object r9 = r9.get(r4)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r4 = "Hostname "
            r3.<init>(r4)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            kf r0 = r0.f2359a     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r0 = r0.f2581b     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r0 = p000.C0582ju.m1775a(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.security.Principal r0 = r9.getSubjectDN()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.util.List r9 = p000.C0733mu.m2293a(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r3.append(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r9 = r3.toString()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r2.<init>(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            throw r2     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
        L_0x010c:
            ju r9 = r0.f2369k     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            kf r0 = r0.f2359a     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r0 = r0.f2581b     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.util.List<java.security.cert.Certificate> r4 = r3.f2574b     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r9.mo2292a(r0, r4)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            boolean r9 = r5.f2533e     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            if (r9 == 0) goto L_0x0123
            mp r9 = p000.C0728mp.m2273c()     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.lang.String r2 = r9.mo2539a(r1)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
        L_0x0123:
            r8.f2806c = r1     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.net.Socket r9 = r8.f2806c     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            ns r9 = p000.C0768nl.m2513b(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            ne r9 = p000.C0768nl.m2508a(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r8.f2809f = r9     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            java.net.Socket r9 = r8.f2806c     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            nr r9 = p000.C0768nl.m2509a(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            nd r9 = p000.C0768nl.m2507a(r9)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r8.f2810g = r9     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            r8.f2807d = r3     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            if (r2 == 0) goto L_0x0146
            kj r9 = p000.C0616kj.m1901a(r2)     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            goto L_0x0148
        L_0x0146:
            kj r9 = p000.C0616kj.HTTP_1_1     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
        L_0x0148:
            r8.f2817o = r9     // Catch:{ AssertionError -> 0x0156, all -> 0x0154 }
            if (r1 == 0) goto L_0x0153
            mp r9 = p000.C0728mp.m2273c()
            r9.mo2556b(r1)
        L_0x0153:
            return
        L_0x0154:
            r9 = move-exception
            goto L_0x016a
        L_0x0156:
            r9 = move-exception
            r2 = r1
            goto L_0x015d
        L_0x0159:
            r9 = move-exception
            r1 = r2
            goto L_0x016a
        L_0x015c:
            r9 = move-exception
        L_0x015d:
            boolean r0 = p000.C0633kv.m1974a(r9)     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x0169
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0159 }
            r0.<init>(r9)     // Catch:{ all -> 0x0159 }
            throw r0     // Catch:{ all -> 0x0159 }
        L_0x0169:
            throw r9     // Catch:{ all -> 0x0159 }
        L_0x016a:
            if (r1 == 0) goto L_0x0173
            mp r0 = p000.C0728mp.m2273c()
            r0.mo2556b(r1)
        L_0x0173:
            p000.C0633kv.m1973a(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0648ld.m2009a(lc):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016a, code lost:
        throw new java.io.IOException("TLS tunnel buffered too many bytes!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0185, code lost:
        r8 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ee, code lost:
        p000.C0600kc.m1828g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f7, code lost:
        if (r1.f2804a.mo2400a() == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01fb, code lost:
        if (r1.f2805b != null) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0209, code lost:
        throw new p000.C0651lf(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020c, code lost:
        if (r1.f2808e == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020e, code lost:
        r2 = r1.f2816n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0210, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r1.f2813j = r1.f2808e.mo2480a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0219, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x021e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021f, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0285 A[EDGE_INSN: B:116:0x0285->B:112:0x0285 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2425a(int r18, int r19, int r20, int r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            kj r2 = r1.f2817o
            if (r2 == 0) goto L_0x000e
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "already connected"
            r2.<init>(r3)
            throw r2
        L_0x000e:
            kp r2 = r1.f2804a
            jo r2 = r2.f2720a
            java.util.List<jx> r2 = r2.f2364f
            lc r3 = new lc
            r3.<init>(r2)
            kp r4 = r1.f2804a
            jo r4 = r4.f2720a
            javax.net.ssl.SSLSocketFactory r4 = r4.f2367i
            if (r4 != 0) goto L_0x0066
            jx r4 = p000.C0589jx.f2530c
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x0036
            lf r2 = new lf
            java.net.UnknownServiceException r3 = new java.net.UnknownServiceException
            java.lang.String r4 = "CLEARTEXT communication not enabled for client"
            r3.<init>(r4)
            r2.<init>(r3)
            throw r2
        L_0x0036:
            kp r2 = r1.f2804a
            jo r2 = r2.f2720a
            kf r2 = r2.f2359a
            java.lang.String r2 = r2.f2581b
            mp r4 = p000.C0728mp.m2273c()
            boolean r4 = r4.mo2546b(r2)
            if (r4 != 0) goto L_0x0066
            lf r3 = new lf
            java.net.UnknownServiceException r4 = new java.net.UnknownServiceException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "CLEARTEXT communication to "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " not permitted by network security policy"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            r3.<init>(r4)
            throw r3
        L_0x0066:
            r2 = 0
            r4 = r2
        L_0x0068:
            r5 = 0
            r6 = 1
            kp r7 = r1.f2804a     // Catch:{ IOException -> 0x0224 }
            boolean r7 = r7.mo2400a()     // Catch:{ IOException -> 0x0224 }
            if (r7 == 0) goto L_0x016e
            kl$a r7 = new kl$a     // Catch:{ IOException -> 0x0224 }
            r7.<init>()     // Catch:{ IOException -> 0x0224 }
            kp r8 = r1.f2804a     // Catch:{ IOException -> 0x0224 }
            jo r8 = r8.f2720a     // Catch:{ IOException -> 0x0224 }
            kf r8 = r8.f2359a     // Catch:{ IOException -> 0x0224 }
            kl$a r7 = r7.mo2382a(r8)     // Catch:{ IOException -> 0x0224 }
            java.lang.String r8 = "Host"
            kp r9 = r1.f2804a     // Catch:{ IOException -> 0x0224 }
            jo r9 = r9.f2720a     // Catch:{ IOException -> 0x0224 }
            kf r9 = r9.f2359a     // Catch:{ IOException -> 0x0224 }
            java.lang.String r9 = p000.C0633kv.m1967a(r9, r6)     // Catch:{ IOException -> 0x0224 }
            kl$a r7 = r7.mo2380a(r8, r9)     // Catch:{ IOException -> 0x0224 }
            java.lang.String r8 = "Proxy-Connection"
            java.lang.String r9 = "Keep-Alive"
            kl$a r7 = r7.mo2380a(r8, r9)     // Catch:{ IOException -> 0x0224 }
            java.lang.String r8 = "User-Agent"
            java.lang.String r9 = "okhttp/3.10.0"
            kl$a r7 = r7.mo2380a(r8, r9)     // Catch:{ IOException -> 0x0224 }
            kl r7 = r7.mo2383a()     // Catch:{ IOException -> 0x0224 }
            kf r8 = r7.f2677a     // Catch:{ IOException -> 0x0224 }
            r17.m2008a(r18, r19)     // Catch:{ IOException -> 0x0224 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0224 }
            java.lang.String r10 = "CONNECT "
            r9.<init>(r10)     // Catch:{ IOException -> 0x0224 }
            java.lang.String r8 = p000.C0633kv.m1967a(r8, r6)     // Catch:{ IOException -> 0x0224 }
            r9.append(r8)     // Catch:{ IOException -> 0x0224 }
            java.lang.String r8 = " HTTP/1.1"
            r9.append(r8)     // Catch:{ IOException -> 0x0224 }
            java.lang.String r8 = r9.toString()     // Catch:{ IOException -> 0x0224 }
            lu r9 = new lu     // Catch:{ IOException -> 0x0224 }
            ne r10 = r1.f2809f     // Catch:{ IOException -> 0x0224 }
            nd r11 = r1.f2810g     // Catch:{ IOException -> 0x0224 }
            r9.<init>(r2, r2, r10, r11)     // Catch:{ IOException -> 0x0224 }
            ne r10 = r1.f2809f     // Catch:{ IOException -> 0x0224 }
            nt r10 = r10.mo2415a()     // Catch:{ IOException -> 0x0224 }
            r11 = r19
            long r12 = (long) r11
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x016b }
            r10.mo2688a(r12, r14)     // Catch:{ IOException -> 0x016b }
            nd r10 = r1.f2810g     // Catch:{ IOException -> 0x016b }
            nt r10 = r10.mo2465a()     // Catch:{ IOException -> 0x016b }
            r12 = r20
            long r13 = (long) r12
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0222 }
            r10.mo2688a(r13, r15)     // Catch:{ IOException -> 0x0222 }
            ke r10 = r7.f2679c     // Catch:{ IOException -> 0x0222 }
            r9.mo2462a(r10, r8)     // Catch:{ IOException -> 0x0222 }
            r9.mo2456b()     // Catch:{ IOException -> 0x0222 }
            kn$a r8 = r9.mo2451a(r5)     // Catch:{ IOException -> 0x0222 }
            r8.f2705a = r7     // Catch:{ IOException -> 0x0222 }
            kn r7 = r8.mo2395a()     // Catch:{ IOException -> 0x0222 }
            long r13 = p000.C0662lm.m2054a(r7)     // Catch:{ IOException -> 0x0222 }
            r15 = -1
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 != 0) goto L_0x0104
            r13 = 0
        L_0x0104:
            ns r8 = r9.mo2461a(r13)     // Catch:{ IOException -> 0x0222 }
            r9 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0222 }
            p000.C0633kv.m1976a(r8, r9, r10)     // Catch:{ IOException -> 0x0222 }
            r8.close()     // Catch:{ IOException -> 0x0222 }
            int r8 = r7.f2694c     // Catch:{ IOException -> 0x0222 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 == r9) goto L_0x0144
            r9 = 407(0x197, float:5.7E-43)
            if (r8 == r9) goto L_0x0133
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x0222 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0222 }
            java.lang.String r10 = "Unexpected response code for CONNECT: "
            r9.<init>(r10)     // Catch:{ IOException -> 0x0222 }
            int r7 = r7.f2694c     // Catch:{ IOException -> 0x0222 }
            r9.append(r7)     // Catch:{ IOException -> 0x0222 }
            java.lang.String r7 = r9.toString()     // Catch:{ IOException -> 0x0222 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x0222 }
            throw r8     // Catch:{ IOException -> 0x0222 }
        L_0x0133:
            kp r7 = r1.f2804a     // Catch:{ IOException -> 0x0222 }
            jo r7 = r7.f2720a     // Catch:{ IOException -> 0x0222 }
            jp r7 = r7.f2362d     // Catch:{ IOException -> 0x0222 }
            r7.mo2283a()     // Catch:{ IOException -> 0x0222 }
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0222 }
            java.lang.String r8 = "Failed to authenticate with proxy"
            r7.<init>(r8)     // Catch:{ IOException -> 0x0222 }
            throw r7     // Catch:{ IOException -> 0x0222 }
        L_0x0144:
            ne r7 = r1.f2809f     // Catch:{ IOException -> 0x0222 }
            nc r7 = r7.mo2618b()     // Catch:{ IOException -> 0x0222 }
            boolean r7 = r7.mo2633d()     // Catch:{ IOException -> 0x0222 }
            if (r7 == 0) goto L_0x0163
            nd r7 = r1.f2810g     // Catch:{ IOException -> 0x0222 }
            nc r7 = r7.mo2618b()     // Catch:{ IOException -> 0x0222 }
            boolean r7 = r7.mo2633d()     // Catch:{ IOException -> 0x0222 }
            if (r7 != 0) goto L_0x015d
            goto L_0x0163
        L_0x015d:
            java.net.Socket r7 = r1.f2805b     // Catch:{ IOException -> 0x0222 }
            if (r7 != 0) goto L_0x0175
            goto L_0x01f1
        L_0x0163:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0222 }
            java.lang.String r8 = "TLS tunnel buffered too many bytes!"
            r7.<init>(r8)     // Catch:{ IOException -> 0x0222 }
            throw r7     // Catch:{ IOException -> 0x0222 }
        L_0x016b:
            r0 = move-exception
            goto L_0x0227
        L_0x016e:
            r11 = r19
            r12 = r20
            r17.m2008a(r18, r19)     // Catch:{ IOException -> 0x0222 }
        L_0x0175:
            kp r7 = r1.f2804a     // Catch:{ IOException -> 0x0222 }
            jo r7 = r7.f2720a     // Catch:{ IOException -> 0x0222 }
            javax.net.ssl.SSLSocketFactory r7 = r7.f2367i     // Catch:{ IOException -> 0x0222 }
            if (r7 != 0) goto L_0x0188
            kj r7 = p000.C0616kj.HTTP_1_1     // Catch:{ IOException -> 0x0222 }
            r1.f2817o = r7     // Catch:{ IOException -> 0x0222 }
            java.net.Socket r7 = r1.f2805b     // Catch:{ IOException -> 0x0222 }
            r1.f2806c = r7     // Catch:{ IOException -> 0x0222 }
        L_0x0185:
            r8 = r21
            goto L_0x01ee
        L_0x0188:
            p000.C0600kc.m1826e()     // Catch:{ IOException -> 0x0222 }
            r1.m2009a(r3)     // Catch:{ IOException -> 0x0222 }
            p000.C0600kc.m1827f()     // Catch:{ IOException -> 0x0222 }
            kj r7 = r1.f2817o     // Catch:{ IOException -> 0x0222 }
            kj r8 = p000.C0616kj.HTTP_2     // Catch:{ IOException -> 0x0222 }
            if (r7 != r8) goto L_0x0185
            java.net.Socket r7 = r1.f2806c     // Catch:{ IOException -> 0x0222 }
            r7.setSoTimeout(r5)     // Catch:{ IOException -> 0x0222 }
            mb$a r7 = new mb$a     // Catch:{ IOException -> 0x0222 }
            r7.<init>()     // Catch:{ IOException -> 0x0222 }
            java.net.Socket r8 = r1.f2806c     // Catch:{ IOException -> 0x0222 }
            kp r9 = r1.f2804a     // Catch:{ IOException -> 0x0222 }
            jo r9 = r9.f2720a     // Catch:{ IOException -> 0x0222 }
            kf r9 = r9.f2359a     // Catch:{ IOException -> 0x0222 }
            java.lang.String r9 = r9.f2581b     // Catch:{ IOException -> 0x0222 }
            ne r10 = r1.f2809f     // Catch:{ IOException -> 0x0222 }
            nd r13 = r1.f2810g     // Catch:{ IOException -> 0x0222 }
            r7.f3021a = r8     // Catch:{ IOException -> 0x0222 }
            r7.f3022b = r9     // Catch:{ IOException -> 0x0222 }
            r7.f3023c = r10     // Catch:{ IOException -> 0x0222 }
            r7.f3024d = r13     // Catch:{ IOException -> 0x0222 }
            r7.f3025e = r1     // Catch:{ IOException -> 0x0222 }
            r8 = r21
            r7.f3028h = r8     // Catch:{ IOException -> 0x0220 }
            mb r9 = new mb     // Catch:{ IOException -> 0x0220 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0220 }
            r1.f2808e = r9     // Catch:{ IOException -> 0x0220 }
            mb r7 = r1.f2808e     // Catch:{ IOException -> 0x0220 }
            me r9 = r7.f2996q     // Catch:{ IOException -> 0x0220 }
            r9.mo2518a()     // Catch:{ IOException -> 0x0220 }
            me r9 = r7.f2996q     // Catch:{ IOException -> 0x0220 }
            mh r10 = r7.f2992m     // Catch:{ IOException -> 0x0220 }
            r9.mo2527b(r10)     // Catch:{ IOException -> 0x0220 }
            mh r9 = r7.f2992m     // Catch:{ IOException -> 0x0220 }
            int r9 = r9.mo2536b()     // Catch:{ IOException -> 0x0220 }
            r10 = 65535(0xffff, float:9.1834E-41)
            if (r9 == r10) goto L_0x01e4
            me r13 = r7.f2996q     // Catch:{ IOException -> 0x0220 }
            int r9 = r9 - r10
            long r9 = (long) r9     // Catch:{ IOException -> 0x0220 }
            r13.mo2519a(r5, r9)     // Catch:{ IOException -> 0x0220 }
        L_0x01e4:
            java.lang.Thread r9 = new java.lang.Thread     // Catch:{ IOException -> 0x0220 }
            mb$d r7 = r7.f2997r     // Catch:{ IOException -> 0x0220 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0220 }
            r9.start()     // Catch:{ IOException -> 0x0220 }
        L_0x01ee:
            p000.C0600kc.m1828g()     // Catch:{ IOException -> 0x0220 }
        L_0x01f1:
            kp r2 = r1.f2804a
            boolean r2 = r2.mo2400a()
            if (r2 == 0) goto L_0x020a
            java.net.Socket r2 = r1.f2805b
            if (r2 != 0) goto L_0x020a
            java.net.ProtocolException r2 = new java.net.ProtocolException
            java.lang.String r3 = "Too many tunnel connections attempted: 21"
            r2.<init>(r3)
            lf r3 = new lf
            r3.<init>(r2)
            throw r3
        L_0x020a:
            mb r2 = r1.f2808e
            if (r2 == 0) goto L_0x021f
            jw r2 = r1.f2816n
            monitor-enter(r2)
            mb r3 = r1.f2808e     // Catch:{ all -> 0x021b }
            int r3 = r3.mo2480a()     // Catch:{ all -> 0x021b }
            r1.f2813j = r3     // Catch:{ all -> 0x021b }
            monitor-exit(r2)     // Catch:{ all -> 0x021b }
            return
        L_0x021b:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x021b }
            throw r3
        L_0x021f:
            return
        L_0x0220:
            r0 = move-exception
            goto L_0x022b
        L_0x0222:
            r0 = move-exception
            goto L_0x0229
        L_0x0224:
            r0 = move-exception
            r11 = r19
        L_0x0227:
            r12 = r20
        L_0x0229:
            r8 = r21
        L_0x022b:
            r7 = r0
            java.net.Socket r9 = r1.f2806c
            p000.C0633kv.m1973a(r9)
            java.net.Socket r9 = r1.f2805b
            p000.C0633kv.m1973a(r9)
            r1.f2806c = r2
            r1.f2805b = r2
            r1.f2809f = r2
            r1.f2810g = r2
            r1.f2807d = r2
            r1.f2817o = r2
            r1.f2808e = r2
            p000.C0600kc.m1829h()
            if (r4 != 0) goto L_0x0250
            lf r4 = new lf
            r4.<init>(r7)
        L_0x024e:
            r9 = r4
            goto L_0x0258
        L_0x0250:
            java.io.IOException r9 = r4.f2822a
            p000.C0651lf.m2020a(r7, r9)
            r4.f2822a = r7
            goto L_0x024e
        L_0x0258:
            if (r22 == 0) goto L_0x0285
            r3.f2803d = r6
            boolean r10 = r3.f2802c
            if (r10 == 0) goto L_0x027f
            boolean r10 = r7 instanceof java.net.ProtocolException
            if (r10 != 0) goto L_0x027f
            boolean r10 = r7 instanceof java.io.InterruptedIOException
            if (r10 != 0) goto L_0x027f
            boolean r10 = r7 instanceof javax.net.ssl.SSLHandshakeException
            if (r10 == 0) goto L_0x0274
            java.lang.Throwable r13 = r7.getCause()
            boolean r13 = r13 instanceof java.security.cert.CertificateException
            if (r13 != 0) goto L_0x027f
        L_0x0274:
            boolean r13 = r7 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r13 != 0) goto L_0x027f
            if (r10 != 0) goto L_0x027e
            boolean r7 = r7 instanceof javax.net.ssl.SSLProtocolException
            if (r7 == 0) goto L_0x027f
        L_0x027e:
            r5 = r6
        L_0x027f:
            if (r5 != 0) goto L_0x0282
            goto L_0x0285
        L_0x0282:
            r4 = r9
            goto L_0x0068
        L_0x0285:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0648ld.mo2425a(int, int, int, int, boolean):void");
    }

    /* renamed from: a */
    public final void mo2426a(C0688mb mbVar) {
        synchronized (this.f2816n) {
            this.f2813j = mbVar.mo2480a();
        }
    }

    /* renamed from: a */
    public final void mo2427a(C0706md mdVar) {
        mdVar.mo2503a(C0678lw.REFUSED_STREAM);
    }

    /* renamed from: a */
    public final boolean mo2428a() {
        return this.f2808e != null;
    }

    /* renamed from: a */
    public final boolean mo2429a(C0574jo joVar, @Nullable C0627kp kpVar) {
        if (this.f2814k.size() >= this.f2813j || this.f2811h || !C0631kt.f2730a.mo2367a(this.f2804a.f2720a, joVar)) {
            return false;
        }
        if (joVar.f2359a.f2581b.equals(this.f2804a.f2720a.f2359a.f2581b)) {
            return true;
        }
        if (this.f2808e == null || kpVar == null || kpVar.f2721b.type() != Type.DIRECT || this.f2804a.f2721b.type() != Type.DIRECT || !this.f2804a.f2722c.equals(kpVar.f2722c) || kpVar.f2720a.f2368j != C0733mu.f3135a || !mo2430a(joVar.f2359a)) {
            return false;
        }
        try {
            joVar.f2369k.mo2292a(joVar.f2359a.f2581b, this.f2807d.f2574b);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo2430a(C0607kf kfVar) {
        if (kfVar.f2582c != this.f2804a.f2720a.f2359a.f2582c) {
            return false;
        }
        if (kfVar.f2581b.equals(this.f2804a.f2720a.f2359a.f2581b)) {
            return true;
        }
        if (this.f2807d != null) {
            C0733mu muVar = C0733mu.f3135a;
            if (C0733mu.m2295a(kfVar.f2581b, (X509Certificate) this.f2807d.f2574b.get(0))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo2431a(boolean z) {
        int soTimeout;
        if (this.f2806c.isClosed() || this.f2806c.isInputShutdown() || this.f2806c.isOutputShutdown()) {
            return false;
        }
        if (this.f2808e != null) {
            return !this.f2808e.mo2490c();
        }
        if (z) {
            try {
                soTimeout = this.f2806c.getSoTimeout();
                this.f2806c.setSoTimeout(1);
                if (this.f2809f.mo2633d()) {
                    this.f2806c.setSoTimeout(soTimeout);
                    return false;
                }
                this.f2806c.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f2806c.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f2804a.f2720a.f2359a.f2581b);
        sb.append(":");
        sb.append(this.f2804a.f2720a.f2359a.f2582c);
        sb.append(", proxy=");
        sb.append(this.f2804a.f2721b);
        sb.append(" hostAddress=");
        sb.append(this.f2804a.f2722c);
        sb.append(" cipherSuite=");
        sb.append(this.f2807d != null ? this.f2807d.f2573a : "none");
        sb.append(" protocol=");
        sb.append(this.f2817o);
        sb.append('}');
        return sb.toString();
    }
}
