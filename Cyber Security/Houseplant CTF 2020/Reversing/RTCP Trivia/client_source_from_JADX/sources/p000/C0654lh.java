package p000;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy.Type;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: lh */
public final class C0654lh {

    /* renamed from: k */
    public static final /* synthetic */ boolean f2833k = true;

    /* renamed from: a */
    public final C0574jo f2834a;

    /* renamed from: b */
    public C0653a f2835b;

    /* renamed from: c */
    public C0627kp f2836c;

    /* renamed from: d */
    public final C0587jw f2837d;

    /* renamed from: e */
    public final C0580js f2838e;

    /* renamed from: f */
    public final C0600kc f2839f;

    /* renamed from: g */
    public final C0652lg f2840g;

    /* renamed from: h */
    public C0648ld f2841h;

    /* renamed from: i */
    public boolean f2842i;

    /* renamed from: j */
    public C0659lk f2843j;

    /* renamed from: l */
    private final Object f2844l;

    /* renamed from: m */
    private int f2845m;

    /* renamed from: n */
    private boolean f2846n;

    /* renamed from: o */
    private boolean f2847o;

    /* renamed from: lh$a */
    public static final class C0655a extends WeakReference<C0654lh> {

        /* renamed from: a */
        public final Object f2848a;

        C0655a(C0654lh lhVar, Object obj) {
            super(lhVar);
            this.f2848a = obj;
        }
    }

    public C0654lh(C0587jw jwVar, C0574jo joVar, C0580js jsVar, C0600kc kcVar, Object obj) {
        this.f2837d = jwVar;
        this.f2834a = joVar;
        this.f2838e = jsVar;
        this.f2839f = kcVar;
        this.f2840g = new C0652lg(joVar, m2029e(), jsVar, kcVar);
        this.f2844l = obj;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p000.C0648ld m2026a(int r18, int r19, int r20, int r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            jw r2 = r1.f2837d
            monitor-enter(r2)
            boolean r3 = r1.f2847o     // Catch:{ all -> 0x015c }
            if (r3 == 0) goto L_0x0011
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x015c }
            java.lang.String r4 = "released"
            r3.<init>(r4)     // Catch:{ all -> 0x015c }
            throw r3     // Catch:{ all -> 0x015c }
        L_0x0011:
            lk r3 = r1.f2843j     // Catch:{ all -> 0x015c }
            if (r3 == 0) goto L_0x001d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x015c }
            java.lang.String r4 = "codec != null"
            r3.<init>(r4)     // Catch:{ all -> 0x015c }
            throw r3     // Catch:{ all -> 0x015c }
        L_0x001d:
            boolean r3 = r1.f2842i     // Catch:{ all -> 0x015c }
            if (r3 == 0) goto L_0x0029
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x015c }
            java.lang.String r4 = "Canceled"
            r3.<init>(r4)     // Catch:{ all -> 0x015c }
            throw r3     // Catch:{ all -> 0x015c }
        L_0x0029:
            ld r3 = r1.f2841h     // Catch:{ all -> 0x015c }
            boolean r4 = f2833k     // Catch:{ all -> 0x015c }
            if (r4 != 0) goto L_0x003d
            jw r4 = r1.f2837d     // Catch:{ all -> 0x015c }
            boolean r4 = java.lang.Thread.holdsLock(r4)     // Catch:{ all -> 0x015c }
            if (r4 != 0) goto L_0x003d
            java.lang.AssertionError r3 = new java.lang.AssertionError     // Catch:{ all -> 0x015c }
            r3.<init>()     // Catch:{ all -> 0x015c }
            throw r3     // Catch:{ all -> 0x015c }
        L_0x003d:
            ld r4 = r1.f2841h     // Catch:{ all -> 0x015c }
            r5 = 1
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L_0x004d
            boolean r4 = r4.f2811h     // Catch:{ all -> 0x015c }
            if (r4 == 0) goto L_0x004d
            java.net.Socket r4 = r1.mo2440a(r7, r7, r5)     // Catch:{ all -> 0x015c }
            goto L_0x004e
        L_0x004d:
            r4 = r6
        L_0x004e:
            ld r8 = r1.f2841h     // Catch:{ all -> 0x015c }
            if (r8 == 0) goto L_0x0056
            ld r3 = r1.f2841h     // Catch:{ all -> 0x015c }
            r8 = r6
            goto L_0x0058
        L_0x0056:
            r8 = r3
            r3 = r6
        L_0x0058:
            boolean r9 = r1.f2846n     // Catch:{ all -> 0x015c }
            if (r9 != 0) goto L_0x005d
            r8 = r6
        L_0x005d:
            if (r3 != 0) goto L_0x0077
            kt r9 = p000.C0631kt.f2730a     // Catch:{ all -> 0x015c }
            jw r10 = r1.f2837d     // Catch:{ all -> 0x015c }
            jo r11 = r1.f2834a     // Catch:{ all -> 0x015c }
            r9.mo2361a(r10, r11, r1, r6)     // Catch:{ all -> 0x015c }
            ld r9 = r1.f2841h     // Catch:{ all -> 0x015c }
            if (r9 == 0) goto L_0x0072
            ld r3 = r1.f2841h     // Catch:{ all -> 0x015c }
            r9 = r3
            r3 = r5
            r10 = r6
            goto L_0x007a
        L_0x0072:
            kp r9 = r1.f2836c     // Catch:{ all -> 0x015c }
            r10 = r9
            r9 = r3
            goto L_0x0079
        L_0x0077:
            r9 = r3
            r10 = r6
        L_0x0079:
            r3 = r7
        L_0x007a:
            monitor-exit(r2)     // Catch:{ all -> 0x015c }
            p000.C0633kv.m1973a(r4)
            if (r8 == 0) goto L_0x0083
            p000.C0600kc.m1831j()
        L_0x0083:
            if (r3 == 0) goto L_0x0088
            p000.C0600kc.m1830i()
        L_0x0088:
            if (r9 == 0) goto L_0x008b
            return r9
        L_0x008b:
            if (r10 != 0) goto L_0x00a3
            lg$a r2 = r1.f2835b
            if (r2 == 0) goto L_0x0099
            lg$a r2 = r1.f2835b
            boolean r2 = r2.mo2439a()
            if (r2 != 0) goto L_0x00a3
        L_0x0099:
            lg r2 = r1.f2840g
            lg$a r2 = r2.mo2438b()
            r1.f2835b = r2
            r2 = r5
            goto L_0x00a4
        L_0x00a3:
            r2 = r7
        L_0x00a4:
            jw r4 = r1.f2837d
            monitor-enter(r4)
            boolean r8 = r1.f2842i     // Catch:{ all -> 0x0158 }
            if (r8 == 0) goto L_0x00b3
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0158 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ all -> 0x0158 }
            throw r2     // Catch:{ all -> 0x0158 }
        L_0x00b3:
            if (r2 == 0) goto L_0x00e1
            lg$a r2 = r1.f2835b     // Catch:{ all -> 0x0158 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0158 }
            java.util.List<kp> r2 = r2.f2831a     // Catch:{ all -> 0x0158 }
            r8.<init>(r2)     // Catch:{ all -> 0x0158 }
            int r2 = r8.size()     // Catch:{ all -> 0x0158 }
            r11 = r7
        L_0x00c3:
            if (r11 >= r2) goto L_0x00e1
            java.lang.Object r12 = r8.get(r11)     // Catch:{ all -> 0x0158 }
            kp r12 = (p000.C0627kp) r12     // Catch:{ all -> 0x0158 }
            kt r13 = p000.C0631kt.f2730a     // Catch:{ all -> 0x0158 }
            jw r14 = r1.f2837d     // Catch:{ all -> 0x0158 }
            jo r15 = r1.f2834a     // Catch:{ all -> 0x0158 }
            r13.mo2361a(r14, r15, r1, r12)     // Catch:{ all -> 0x0158 }
            ld r13 = r1.f2841h     // Catch:{ all -> 0x0158 }
            if (r13 == 0) goto L_0x00de
            ld r9 = r1.f2841h     // Catch:{ all -> 0x0158 }
            r1.f2836c = r12     // Catch:{ all -> 0x0158 }
            r3 = r5
            goto L_0x00e1
        L_0x00de:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00e1:
            if (r3 != 0) goto L_0x0110
            if (r10 != 0) goto L_0x0102
            lg$a r2 = r1.f2835b     // Catch:{ all -> 0x0158 }
            boolean r8 = r2.mo2439a()     // Catch:{ all -> 0x0158 }
            if (r8 != 0) goto L_0x00f3
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0158 }
            r2.<init>()     // Catch:{ all -> 0x0158 }
            throw r2     // Catch:{ all -> 0x0158 }
        L_0x00f3:
            java.util.List<kp> r8 = r2.f2831a     // Catch:{ all -> 0x0158 }
            int r9 = r2.f2832b     // Catch:{ all -> 0x0158 }
            int r10 = r9 + 1
            r2.f2832b = r10     // Catch:{ all -> 0x0158 }
            java.lang.Object r2 = r8.get(r9)     // Catch:{ all -> 0x0158 }
            r10 = r2
            kp r10 = (p000.C0627kp) r10     // Catch:{ all -> 0x0158 }
        L_0x0102:
            r1.f2836c = r10     // Catch:{ all -> 0x0158 }
            r1.f2845m = r7     // Catch:{ all -> 0x0158 }
            ld r9 = new ld     // Catch:{ all -> 0x0158 }
            jw r2 = r1.f2837d     // Catch:{ all -> 0x0158 }
            r9.<init>(r2, r10)     // Catch:{ all -> 0x0158 }
            r1.mo2444a(r9, r7)     // Catch:{ all -> 0x0158 }
        L_0x0110:
            monitor-exit(r4)     // Catch:{ all -> 0x0158 }
            if (r3 == 0) goto L_0x0117
            p000.C0600kc.m1830i()
            return r9
        L_0x0117:
            r11 = r9
            r12 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            r16 = r22
            r11.mo2425a(r12, r13, r14, r15, r16)
            le r2 = r17.m2029e()
            kp r3 = r9.f2804a
            r2.mo2435b(r3)
            jw r2 = r1.f2837d
            monitor-enter(r2)
            r1.f2846n = r5     // Catch:{ all -> 0x0154 }
            kt r3 = p000.C0631kt.f2730a     // Catch:{ all -> 0x0154 }
            jw r4 = r1.f2837d     // Catch:{ all -> 0x0154 }
            r3.mo2369b(r4, r9)     // Catch:{ all -> 0x0154 }
            boolean r3 = r9.mo2428a()     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x014c
            kt r3 = p000.C0631kt.f2730a     // Catch:{ all -> 0x0154 }
            jw r4 = r1.f2837d     // Catch:{ all -> 0x0154 }
            jo r5 = r1.f2834a     // Catch:{ all -> 0x0154 }
            java.net.Socket r6 = r3.mo2359a(r4, r5, r1)     // Catch:{ all -> 0x0154 }
            ld r9 = r1.f2841h     // Catch:{ all -> 0x0154 }
        L_0x014c:
            monitor-exit(r2)     // Catch:{ all -> 0x0154 }
            p000.C0633kv.m1973a(r6)
            p000.C0600kc.m1830i()
            return r9
        L_0x0154:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0154 }
            throw r3
        L_0x0158:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0158 }
            throw r2
        L_0x015c:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x015c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0654lh.m2026a(int, int, int, int, boolean):ld");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo2431a(r9) != false) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p000.C0648ld m2027a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            ld r0 = r3.m2026a(r4, r5, r6, r7, r8)
            jw r1 = r3.f2837d
            monitor-enter(r1)
            int r2 = r0.f2812i     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.mo2431a(r9)
            if (r1 != 0) goto L_0x0018
            r3.mo2448d()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0654lh.m2027a(int, int, int, int, boolean, boolean):ld");
    }

    /* renamed from: a */
    private void m2028a(C0648ld ldVar) {
        int size = ldVar.f2814k.size();
        for (int i = 0; i < size; i++) {
            if (((Reference) ldVar.f2814k.get(i)).get() == this) {
                ldVar.f2814k.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    private C0650le m2029e() {
        return C0631kt.f2730a.mo2362a(this.f2837d);
    }

    /* renamed from: a */
    public final Socket mo2440a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (f2833k || Thread.holdsLock(this.f2837d)) {
            if (z3) {
                this.f2843j = null;
            }
            if (z2) {
                this.f2847o = true;
            }
            if (this.f2841h != null) {
                if (z) {
                    this.f2841h.f2811h = true;
                }
                if (this.f2843j == null && (this.f2847o || this.f2841h.f2811h)) {
                    m2028a(this.f2841h);
                    if (this.f2841h.f2814k.isEmpty()) {
                        this.f2841h.f2815l = System.nanoTime();
                        if (C0631kt.f2730a.mo2368a(this.f2837d, this.f2841h)) {
                            socket = this.f2841h.f2806c;
                            this.f2841h = null;
                            return socket;
                        }
                    }
                    socket = null;
                    this.f2841h = null;
                    return socket;
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final C0659lk mo2441a() {
        C0659lk lkVar;
        synchronized (this.f2837d) {
            lkVar = this.f2843j;
        }
        return lkVar;
    }

    /* renamed from: a */
    public final C0659lk mo2442a(C0613ki kiVar, C0611a aVar, boolean z) {
        C0659lk lkVar;
        try {
            C0648ld a = m2027a(aVar.mo2352b(), aVar.mo2353c(), aVar.mo2354d(), kiVar.f2610C, kiVar.f2633y, z);
            if (a.f2808e != null) {
                lkVar = new C0686ma(kiVar, aVar, this, a.f2808e);
            } else {
                a.f2806c.setSoTimeout(aVar.mo2353c());
                a.f2809f.mo2415a().mo2688a((long) aVar.mo2353c(), TimeUnit.MILLISECONDS);
                a.f2810g.mo2465a().mo2688a((long) aVar.mo2354d(), TimeUnit.MILLISECONDS);
                lkVar = new C0670lu(kiVar, this, a.f2809f, a.f2810g);
            }
            synchronized (this.f2837d) {
                this.f2843j = lkVar;
            }
            return lkVar;
        } catch (IOException e) {
            throw new C0651lf(e);
        }
    }

    /* renamed from: a */
    public final void mo2443a(IOException iOException) {
        boolean z;
        C0648ld ldVar;
        Socket a;
        synchronized (this.f2837d) {
            if (iOException instanceof C0716mi) {
                C0716mi miVar = (C0716mi) iOException;
                if (miVar.f3095a == C0678lw.REFUSED_STREAM) {
                    this.f2845m++;
                }
                if (miVar.f3095a == C0678lw.REFUSED_STREAM) {
                    if (this.f2845m > 1) {
                    }
                    z = false;
                    ldVar = this.f2841h;
                    a = mo2440a(z, false, true);
                    if (this.f2841h != null || !this.f2846n) {
                        ldVar = null;
                    }
                }
            } else {
                if (this.f2841h != null && (!this.f2841h.mo2428a() || (iOException instanceof C0677lv))) {
                    if (this.f2841h.f2812i == 0) {
                        if (!(this.f2836c == null || iOException == null)) {
                            C0652lg lgVar = this.f2840g;
                            C0627kp kpVar = this.f2836c;
                            if (!(kpVar.f2721b.type() == Type.DIRECT || lgVar.f2823a.f2365g == null)) {
                                lgVar.f2823a.f2365g.connectFailed(lgVar.f2823a.f2359a.mo2332a(), kpVar.f2721b.address(), iOException);
                            }
                            lgVar.f2824b.mo2434a(kpVar);
                        }
                    }
                    z = true;
                    ldVar = this.f2841h;
                    a = mo2440a(z, false, true);
                    ldVar = null;
                }
                z = false;
                ldVar = this.f2841h;
                a = mo2440a(z, false, true);
                ldVar = null;
            }
            this.f2836c = null;
            z = true;
            ldVar = this.f2841h;
            a = mo2440a(z, false, true);
            ldVar = null;
        }
        C0633kv.m1973a(a);
        if (ldVar != null) {
            C0600kc.m1831j();
        }
    }

    /* renamed from: a */
    public final void mo2444a(C0648ld ldVar, boolean z) {
        if (!f2833k && !Thread.holdsLock(this.f2837d)) {
            throw new AssertionError();
        } else if (this.f2841h != null) {
            throw new IllegalStateException();
        } else {
            this.f2841h = ldVar;
            this.f2846n = z;
            ldVar.f2814k.add(new C0655a(this, this.f2844l));
        }
    }

    /* renamed from: a */
    public final void mo2445a(boolean z, C0659lk lkVar, IOException iOException) {
        C0648ld ldVar;
        Socket a;
        boolean z2;
        C0600kc.m1839r();
        synchronized (this.f2837d) {
            if (lkVar != null) {
                if (lkVar == this.f2843j) {
                    if (!z) {
                        this.f2841h.f2812i++;
                    }
                    ldVar = this.f2841h;
                    a = mo2440a(z, false, true);
                    if (this.f2841h != null) {
                        ldVar = null;
                    }
                    z2 = this.f2847o;
                }
            }
            StringBuilder sb = new StringBuilder("expected ");
            sb.append(this.f2843j);
            sb.append(" but was ");
            sb.append(lkVar);
            throw new IllegalStateException(sb.toString());
        }
        C0633kv.m1973a(a);
        if (ldVar != null) {
            C0600kc.m1831j();
        }
        if (iOException != null) {
            C0600kc.m1841t();
            return;
        }
        if (z2) {
            C0600kc.m1840s();
        }
    }

    /* renamed from: b */
    public final synchronized C0648ld mo2446b() {
        return this.f2841h;
    }

    /* renamed from: c */
    public final void mo2447c() {
        C0648ld ldVar;
        Socket a;
        synchronized (this.f2837d) {
            ldVar = this.f2841h;
            a = mo2440a(false, true, false);
            if (this.f2841h != null) {
                ldVar = null;
            }
        }
        C0633kv.m1973a(a);
        if (ldVar != null) {
            C0600kc.m1831j();
        }
    }

    /* renamed from: d */
    public final void mo2448d() {
        C0648ld ldVar;
        Socket a;
        synchronized (this.f2837d) {
            ldVar = this.f2841h;
            a = mo2440a(true, false, false);
            if (this.f2841h != null) {
                ldVar = null;
            }
        }
        C0633kv.m1973a(a);
        if (ldVar != null) {
            C0600kc.m1831j();
        }
    }

    public final String toString() {
        C0648ld b = mo2446b();
        return b != null ? b.toString() : this.f2834a.toString();
    }
}
