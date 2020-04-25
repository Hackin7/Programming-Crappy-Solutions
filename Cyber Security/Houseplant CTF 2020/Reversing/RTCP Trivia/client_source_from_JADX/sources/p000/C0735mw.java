package p000;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: mw */
public final class C0735mw implements C0629kr, C0745a {

    /* renamed from: a */
    public static final List<C0616kj> f3136a = Collections.singletonList(C0616kj.HTTP_1_1);

    /* renamed from: p */
    static final /* synthetic */ boolean f3137p = true;

    /* renamed from: b */
    public final C0619kl f3138b;

    /* renamed from: c */
    final C0630ks f3139c;

    /* renamed from: d */
    final Random f3140d;

    /* renamed from: e */
    final long f3141e;

    /* renamed from: f */
    public final String f3142f;

    /* renamed from: g */
    public C0580js f3143g;

    /* renamed from: h */
    C0744my f3144h;

    /* renamed from: i */
    C0746mz f3145i;

    /* renamed from: j */
    ScheduledExecutorService f3146j;

    /* renamed from: k */
    C0742e f3147k;

    /* renamed from: l */
    final ArrayDeque<Object> f3148l = new ArrayDeque<>();

    /* renamed from: m */
    boolean f3149m;

    /* renamed from: n */
    int f3150n;

    /* renamed from: o */
    boolean f3151o;

    /* renamed from: q */
    private final Runnable f3152q;

    /* renamed from: r */
    private final ArrayDeque<C0762nf> f3153r = new ArrayDeque<>();

    /* renamed from: s */
    private long f3154s;

    /* renamed from: t */
    private boolean f3155t;

    /* renamed from: u */
    private ScheduledFuture<?> f3156u;

    /* renamed from: v */
    private int f3157v = -1;

    /* renamed from: w */
    private String f3158w;

    /* renamed from: x */
    private int f3159x;

    /* renamed from: y */
    private int f3160y;

    /* renamed from: mw$a */
    final class C0738a implements Runnable {
        C0738a() {
        }

        public final void run() {
            C0735mw.this.f3143g.mo2288a();
        }
    }

    /* renamed from: mw$b */
    static final class C0739b {

        /* renamed from: a */
        final int f3165a = 1001;

        /* renamed from: b */
        final C0762nf f3166b;

        /* renamed from: c */
        final long f3167c;

        C0739b(C0762nf nfVar) {
            this.f3166b = nfVar;
            this.f3167c = 60000;
        }
    }

    /* renamed from: mw$c */
    static final class C0740c {

        /* renamed from: a */
        final int f3168a = 1;

        /* renamed from: b */
        final C0762nf f3169b;

        C0740c(C0762nf nfVar) {
            this.f3169b = nfVar;
        }
    }

    /* renamed from: mw$d */
    final class C0741d implements Runnable {
        C0741d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
            if (r2 == -1) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
            r3 = new java.lang.StringBuilder("sent ping but didn't receive pong within ");
            r3.append(r0.f3141e);
            r3.append("ms (after ");
            r3.append(r2 - 1);
            r3.append(" successful ping/pongs)");
            r0.mo2569a((java.lang.Exception) new java.net.SocketTimeoutException(r3.toString()), (p000.C0623kn) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r1.mo2582a(9, p000.C0762nf.f3266b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
            r0.mo2569a((java.lang.Exception) r1, (p000.C0623kn) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                mw r0 = p000.C0735mw.this
                monitor-enter(r0)
                boolean r1 = r0.f3149m     // Catch:{ all -> 0x0054 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0054 }
                return
            L_0x0009:
                mz r1 = r0.f3145i     // Catch:{ all -> 0x0054 }
                boolean r2 = r0.f3151o     // Catch:{ all -> 0x0054 }
                r3 = -1
                if (r2 == 0) goto L_0x0013
                int r2 = r0.f3150n     // Catch:{ all -> 0x0054 }
                goto L_0x0014
            L_0x0013:
                r2 = r3
            L_0x0014:
                int r4 = r0.f3150n     // Catch:{ all -> 0x0054 }
                r5 = 1
                int r4 = r4 + r5
                r0.f3150n = r4     // Catch:{ all -> 0x0054 }
                r0.f3151o = r5     // Catch:{ all -> 0x0054 }
                monitor-exit(r0)     // Catch:{ all -> 0x0054 }
                r4 = 0
                if (r2 == r3) goto L_0x0047
                java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r6 = "sent ping but didn't receive pong within "
                r3.<init>(r6)
                long r6 = r0.f3141e
                r3.append(r6)
                java.lang.String r6 = "ms (after "
                r3.append(r6)
                int r2 = r2 - r5
                r3.append(r2)
                java.lang.String r2 = " successful ping/pongs)"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                r0.mo2569a(r1, r4)
                return
            L_0x0047:
                nf r2 = p000.C0762nf.f3266b     // Catch:{ IOException -> 0x004f }
                r3 = 9
                r1.mo2582a(r3, r2)     // Catch:{ IOException -> 0x004f }
                return
            L_0x004f:
                r1 = move-exception
                r0.mo2569a(r1, r4)
                return
            L_0x0054:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0054 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0735mw.C0741d.run():void");
        }
    }

    /* renamed from: mw$e */
    public static abstract class C0742e implements Closeable {

        /* renamed from: c */
        public final boolean f3171c = true;

        /* renamed from: d */
        public final C0761ne f3172d;

        /* renamed from: e */
        public final C0760nd f3173e;

        public C0742e(C0761ne neVar, C0760nd ndVar) {
            this.f3172d = neVar;
            this.f3173e = ndVar;
        }
    }

    public C0735mw(C0619kl klVar, C0630ks ksVar, Random random, long j) {
        if (!"GET".equals(klVar.f2678b)) {
            StringBuilder sb = new StringBuilder("Request must be GET: ");
            sb.append(klVar.f2678b);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f3138b = klVar;
        this.f3139c = ksVar;
        this.f3140d = random;
        this.f3141e = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f3142f = C0762nf.m2472a(bArr).mo2674b();
        this.f3152q = new Runnable() {
            public final void run() {
                do {
                    try {
                    } catch (IOException e) {
                        C0735mw.this.mo2569a((Exception) e, (C0623kn) null);
                        return;
                    }
                } while (C0735mw.this.mo2574d());
            }
        };
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m2297b(p000.C0762nf r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f3149m     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 != 0) goto L_0x003a
            boolean r0 = r6.f3155t     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x000b
            goto L_0x003a
        L_0x000b:
            long r2 = r6.f3154s     // Catch:{ all -> 0x003c }
            int r0 = r7.mo2681g()     // Catch:{ all -> 0x003c }
            long r4 = (long) r0     // Catch:{ all -> 0x003c }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            r7 = 0
            r6.m2298d(r7)     // Catch:{ all -> 0x003c }
            monitor-exit(r6)
            return r1
        L_0x0020:
            long r0 = r6.f3154s     // Catch:{ all -> 0x003c }
            int r2 = r7.mo2681g()     // Catch:{ all -> 0x003c }
            long r2 = (long) r2     // Catch:{ all -> 0x003c }
            long r0 = r0 + r2
            r6.f3154s = r0     // Catch:{ all -> 0x003c }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f3148l     // Catch:{ all -> 0x003c }
            mw$c r1 = new mw$c     // Catch:{ all -> 0x003c }
            r1.<init>(r7)     // Catch:{ all -> 0x003c }
            r0.add(r1)     // Catch:{ all -> 0x003c }
            r6.mo2572c()     // Catch:{ all -> 0x003c }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003a:
            monitor-exit(r6)
            return r1
        L_0x003c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0735mw.m2297b(nf):boolean");
    }

    /* renamed from: d */
    private synchronized boolean m2298d(String str) {
        C0743mx.m2313b(1001);
        C0762nf nfVar = null;
        if (str != null) {
            nfVar = C0762nf.m2471a(str);
            if (((long) nfVar.mo2681g()) > 123) {
                StringBuilder sb = new StringBuilder("reason.size() > 123: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (!this.f3149m) {
            if (!this.f3155t) {
                this.f3155t = true;
                this.f3148l.add(new C0739b(nfVar));
                mo2572c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2567a() {
        while (this.f3157v == -1) {
            C0744my myVar = this.f3144h;
            myVar.mo2578a();
            if (myVar.f3181h) {
                myVar.mo2579b();
            } else {
                int i = myVar.f3178e;
                if (i == 1 || i == 2) {
                    myVar.mo2580c();
                    if (i == 1) {
                        myVar.f3176c.mo2573c(myVar.f3182i.mo2657n());
                    } else {
                        myVar.f3182i.mo2656m();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unknown opcode: ");
                    sb.append(Integer.toHexString(i));
                    throw new ProtocolException(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2568a(int i, String str) {
        Closeable closeable;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.f3157v != -1) {
                throw new IllegalStateException("already closed");
            }
            this.f3157v = i;
            this.f3158w = str;
            if (!this.f3155t || !this.f3148l.isEmpty()) {
                closeable = null;
            } else {
                closeable = this.f3147k;
                this.f3147k = null;
                if (this.f3156u != null) {
                    this.f3156u.cancel(false);
                }
                this.f3146j.shutdown();
            }
        }
        try {
            this.f3139c.mo2406a(i, str);
            if (closeable != null) {
                this.f3139c.mo2410b(i, str);
            }
        } finally {
            C0633kv.m1972a(closeable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.f3139c.mo2407a((java.lang.Throwable) r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        p000.C0633kv.m1972a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2569a(java.lang.Exception r4, @javax.annotation.Nullable p000.C0623kn r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f3149m     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0007:
            r0 = 1
            r3.f3149m = r0     // Catch:{ all -> 0x0031 }
            mw$e r0 = r3.f3147k     // Catch:{ all -> 0x0031 }
            r1 = 0
            r3.f3147k = r1     // Catch:{ all -> 0x0031 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f3156u     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f3156u     // Catch:{ all -> 0x0031 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0031 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.f3146j     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.f3146j     // Catch:{ all -> 0x0031 }
            r1.shutdown()     // Catch:{ all -> 0x0031 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            ks r1 = r3.f3139c     // Catch:{ all -> 0x002c }
            r1.mo2407a(r4, r5)     // Catch:{ all -> 0x002c }
            p000.C0633kv.m1972a(r0)
            return
        L_0x002c:
            r4 = move-exception
            p000.C0633kv.m1972a(r0)
            throw r4
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0735mw.mo2569a(java.lang.Exception, kn):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo2570a(p000.C0762nf r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f3149m     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.f3155t     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f3148l     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<nf> r0 = r1.f3153r     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.mo2572c()     // Catch:{ all -> 0x0024 }
            int r2 = r1.f3159x     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.f3159x = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0735mw.mo2570a(nf):void");
    }

    /* renamed from: a */
    public final boolean mo2404a(String str) {
        if (str != null) {
            return m2297b(C0762nf.m2471a(str));
        }
        throw new NullPointerException("text == null");
    }

    /* renamed from: b */
    public final synchronized void mo2571b() {
        this.f3160y++;
        this.f3151o = false;
    }

    /* renamed from: b */
    public final boolean mo2405b(String str) {
        return m2298d(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2572c() {
        if (!f3137p && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (this.f3146j != null) {
            this.f3146j.execute(this.f3152q);
        }
    }

    /* renamed from: c */
    public final void mo2573c(String str) {
        this.f3139c.mo2408a((C0629kr) this, str);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.mo2582a(10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if ((r4 instanceof p000.C0735mw.C0740c) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        r2 = ((p000.C0735mw.C0740c) r4).f3169b;
        r3 = ((p000.C0735mw.C0740c) r4).f3168a;
        r4 = (long) r2.mo2681g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r0.f3193h == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        throw new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r0.f3193h = true;
        r0.f3192g.f3196a = r3;
        r0.f3192g.f3197b = r4;
        r0.f3192g.f3198c = true;
        r0.f3192g.f3199d = false;
        r0 = p000.C0768nl.m2507a((p000.C0777nr) r0.f3192g);
        r0.mo2623b(r2);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r12.f3154s -= (long) r2.mo2681g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if ((r4 instanceof p000.C0735mw.C0739b) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r4 = (p000.C0735mw.C0739b) r4;
        r1 = r4.f3165a;
        r2 = r4.f3166b;
        r4 = p000.C0762nf.f3266b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r1 != 0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r2 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r1 == 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        p000.C0743mx.m2313b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        r4 = new p000.C0758nc();
        r4.mo2641g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
        if (r2 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ca, code lost:
        r4.mo2623b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cd, code lost:
        r4 = r4.mo2656m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r0.mo2582a(8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r0.f3190e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d8, code lost:
        if (r7 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00da, code lost:
        r12.f3139c.mo2410b(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
        p000.C0633kv.m1972a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r0.f3190e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ec, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ed, code lost:
        p000.C0633kv.m1972a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f0, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0057, B:56:0x00d3] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2574d() {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f3149m     // Catch:{ all -> 0x00f1 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)     // Catch:{ all -> 0x00f1 }
            return r1
        L_0x0008:
            mz r0 = r12.f3145i     // Catch:{ all -> 0x00f1 }
            java.util.ArrayDeque<nf> r2 = r12.f3153r     // Catch:{ all -> 0x00f1 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00f1 }
            nf r2 = (p000.C0762nf) r2     // Catch:{ all -> 0x00f1 }
            r3 = 0
            if (r2 != 0) goto L_0x004e
            java.util.ArrayDeque<java.lang.Object> r4 = r12.f3148l     // Catch:{ all -> 0x00f1 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00f1 }
            boolean r5 = r4 instanceof p000.C0735mw.C0739b     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x0047
            int r5 = r12.f3157v     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r12.f3158w     // Catch:{ all -> 0x00f1 }
            r7 = -1
            if (r5 == r7) goto L_0x0031
            mw$e r7 = r12.f3147k     // Catch:{ all -> 0x00f1 }
            r12.f3147k = r3     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.ScheduledExecutorService r3 = r12.f3146j     // Catch:{ all -> 0x00f1 }
            r3.shutdown()     // Catch:{ all -> 0x00f1 }
        L_0x002f:
            r3 = r6
            goto L_0x0051
        L_0x0031:
            java.util.concurrent.ScheduledExecutorService r7 = r12.f3146j     // Catch:{ all -> 0x00f1 }
            mw$a r8 = new mw$a     // Catch:{ all -> 0x00f1 }
            r8.<init>()     // Catch:{ all -> 0x00f1 }
            r9 = r4
            mw$b r9 = (p000.C0735mw.C0739b) r9     // Catch:{ all -> 0x00f1 }
            long r9 = r9.f3167c     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r8, r9, r11)     // Catch:{ all -> 0x00f1 }
            r12.f3156u = r7     // Catch:{ all -> 0x00f1 }
            r7 = r3
            goto L_0x002f
        L_0x0047:
            if (r4 != 0) goto L_0x004b
            monitor-exit(r12)     // Catch:{ all -> 0x00f1 }
            return r1
        L_0x004b:
            r5 = r1
            r7 = r3
            goto L_0x0051
        L_0x004e:
            r5 = r1
            r4 = r3
            r7 = r4
        L_0x0051:
            monitor-exit(r12)     // Catch:{ all -> 0x00f1 }
            r6 = 1
            if (r2 == 0) goto L_0x005f
            r1 = 10
            r0.mo2582a(r1, r2)     // Catch:{ all -> 0x005c }
            goto L_0x00df
        L_0x005c:
            r0 = move-exception
            goto L_0x00ed
        L_0x005f:
            boolean r2 = r4 instanceof p000.C0735mw.C0740c     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x00ab
            r2 = r4
            mw$c r2 = (p000.C0735mw.C0740c) r2     // Catch:{ all -> 0x005c }
            nf r2 = r2.f3169b     // Catch:{ all -> 0x005c }
            mw$c r4 = (p000.C0735mw.C0740c) r4     // Catch:{ all -> 0x005c }
            int r3 = r4.f3168a     // Catch:{ all -> 0x005c }
            int r4 = r2.mo2681g()     // Catch:{ all -> 0x005c }
            long r4 = (long) r4     // Catch:{ all -> 0x005c }
            boolean r8 = r0.f3193h     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x007d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "Another message writer is active. Did you call close()?"
            r0.<init>(r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x007d:
            r0.f3193h = r6     // Catch:{ all -> 0x005c }
            mz$a r8 = r0.f3192g     // Catch:{ all -> 0x005c }
            r8.f3196a = r3     // Catch:{ all -> 0x005c }
            mz$a r3 = r0.f3192g     // Catch:{ all -> 0x005c }
            r3.f3197b = r4     // Catch:{ all -> 0x005c }
            mz$a r3 = r0.f3192g     // Catch:{ all -> 0x005c }
            r3.f3198c = r6     // Catch:{ all -> 0x005c }
            mz$a r3 = r0.f3192g     // Catch:{ all -> 0x005c }
            r3.f3199d = r1     // Catch:{ all -> 0x005c }
            mz$a r0 = r0.f3192g     // Catch:{ all -> 0x005c }
            nd r0 = p000.C0768nl.m2507a(r0)     // Catch:{ all -> 0x005c }
            r0.mo2623b(r2)     // Catch:{ all -> 0x005c }
            r0.close()     // Catch:{ all -> 0x005c }
            monitor-enter(r12)     // Catch:{ all -> 0x005c }
            long r0 = r12.f3154s     // Catch:{ all -> 0x00a8 }
            int r2 = r2.mo2681g()     // Catch:{ all -> 0x00a8 }
            long r2 = (long) r2     // Catch:{ all -> 0x00a8 }
            long r0 = r0 - r2
            r12.f3154s = r0     // Catch:{ all -> 0x00a8 }
            monitor-exit(r12)     // Catch:{ all -> 0x00a8 }
            goto L_0x00df
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00a8 }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x00ab:
            boolean r1 = r4 instanceof p000.C0735mw.C0739b     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x00e7
            mw$b r4 = (p000.C0735mw.C0739b) r4     // Catch:{ all -> 0x005c }
            int r1 = r4.f3165a     // Catch:{ all -> 0x005c }
            nf r2 = r4.f3166b     // Catch:{ all -> 0x005c }
            nf r4 = p000.C0762nf.f3266b     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x00bb
            if (r2 == 0) goto L_0x00d1
        L_0x00bb:
            if (r1 == 0) goto L_0x00c0
            p000.C0743mx.m2313b(r1)     // Catch:{ all -> 0x005c }
        L_0x00c0:
            nc r4 = new nc     // Catch:{ all -> 0x005c }
            r4.<init>()     // Catch:{ all -> 0x005c }
            r4.mo2641g(r1)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x00cd
            r4.mo2623b(r2)     // Catch:{ all -> 0x005c }
        L_0x00cd:
            nf r4 = r4.mo2656m()     // Catch:{ all -> 0x005c }
        L_0x00d1:
            r1 = 8
            r0.mo2582a(r1, r4)     // Catch:{ all -> 0x00e3 }
            r0.f3190e = r6     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x00df
            ks r0 = r12.f3139c     // Catch:{ all -> 0x005c }
            r0.mo2410b(r5, r3)     // Catch:{ all -> 0x005c }
        L_0x00df:
            p000.C0633kv.m1972a(r7)
            return r6
        L_0x00e3:
            r1 = move-exception
            r0.f3190e = r6     // Catch:{ all -> 0x005c }
            throw r1     // Catch:{ all -> 0x005c }
        L_0x00e7:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x005c }
            r0.<init>()     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x00ed:
            p000.C0633kv.m1972a(r7)
            throw r0
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00f1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0735mw.mo2574d():boolean");
    }
}
