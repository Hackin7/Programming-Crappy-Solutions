package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* renamed from: md */
public final class C0706md {

    /* renamed from: l */
    static final /* synthetic */ boolean f3052l = true;

    /* renamed from: a */
    long f3053a = 0;

    /* renamed from: b */
    long f3054b;

    /* renamed from: c */
    final int f3055c;

    /* renamed from: d */
    final C0688mb f3056d;

    /* renamed from: e */
    List<C0679lx> f3057e;

    /* renamed from: f */
    boolean f3058f;

    /* renamed from: g */
    final C0708b f3059g;

    /* renamed from: h */
    final C0707a f3060h;

    /* renamed from: i */
    final C0709c f3061i = new C0709c();

    /* renamed from: j */
    final C0709c f3062j = new C0709c();

    /* renamed from: k */
    C0678lw f3063k = null;

    /* renamed from: m */
    private final List<C0679lx> f3064m;

    /* renamed from: md$a */
    final class C0707a implements C0777nr {

        /* renamed from: c */
        static final /* synthetic */ boolean f3065c = true;

        /* renamed from: a */
        boolean f3066a;

        /* renamed from: b */
        boolean f3067b;

        /* renamed from: e */
        private final C0758nc f3069e = new C0758nc();

        static {
            Class<C0706md> cls = C0706md.class;
        }

        C0707a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m2196a(boolean z) {
            long min;
            synchronized (C0706md.this) {
                C0706md.this.f3062j.mo2601b_();
                while (C0706md.this.f3054b <= 0 && !this.f3067b && !this.f3066a && C0706md.this.f3063k == null) {
                    try {
                        C0706md.this.mo2513h();
                    } catch (Throwable th) {
                        C0706md.this.f3062j.mo2517b();
                        throw th;
                    }
                }
                C0706md.this.f3062j.mo2517b();
                C0706md.this.mo2512g();
                min = Math.min(C0706md.this.f3054b, this.f3069e.f3257b);
                C0706md.this.f3054b -= min;
            }
            C0706md.this.f3062j.mo2601b_();
            try {
                C0706md.this.f3056d.mo2485a(C0706md.this.f3055c, z && min == this.f3069e.f3257b, this.f3069e, min);
            } finally {
                C0706md.this.f3062j.mo2517b();
            }
        }

        /* renamed from: a */
        public final C0779nt mo2465a() {
            return C0706md.this.f3062j;
        }

        /* renamed from: a_ */
        public final void mo2450a_(C0758nc ncVar, long j) {
            if (f3065c || !Thread.holdsLock(C0706md.this)) {
                this.f3069e.mo2450a_(ncVar, j);
                while (this.f3069e.f3257b >= 16384) {
                    m2196a(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r8.f3068d.f3060h.f3067b != false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            if (r8.f3069e.f3257b <= 0) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
            if (r8.f3069e.f3257b <= 0) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
            m2196a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
            r8.f3068d.f3056d.mo2485a(r8.f3068d.f3055c, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
            r2 = r8.f3068d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.f3066a = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
            r8.f3068d.f3056d.f2996q.mo2526b();
            r8.f3068d.mo2511f();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r8 = this;
                boolean r0 = f3065c
                if (r0 != 0) goto L_0x0012
                md r0 = p000.C0706md.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                if (r0 == 0) goto L_0x0012
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0012:
                md r0 = p000.C0706md.this
                monitor-enter(r0)
                boolean r1 = r8.f3066a     // Catch:{ all -> 0x0062 }
                if (r1 == 0) goto L_0x001b
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                return
            L_0x001b:
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                md r0 = p000.C0706md.this
                md$a r0 = r0.f3060h
                boolean r0 = r0.f3067b
                r1 = 1
                if (r0 != 0) goto L_0x004a
                nc r0 = r8.f3069e
                long r2 = r0.f3257b
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003b
            L_0x002f:
                nc r0 = r8.f3069e
                long r2 = r0.f3257b
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x004a
                r8.m2196a(r1)
                goto L_0x002f
            L_0x003b:
                md r0 = p000.C0706md.this
                mb r2 = r0.f3056d
                md r0 = p000.C0706md.this
                int r3 = r0.f3055c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo2485a(r3, r4, r5, r6)
            L_0x004a:
                md r2 = p000.C0706md.this
                monitor-enter(r2)
                r8.f3066a = r1     // Catch:{ all -> 0x005f }
                monitor-exit(r2)     // Catch:{ all -> 0x005f }
                md r0 = p000.C0706md.this
                mb r0 = r0.f3056d
                me r0 = r0.f2996q
                r0.mo2526b()
                md r0 = p000.C0706md.this
                r0.mo2511f()
                return
            L_0x005f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x005f }
                throw r0
            L_0x0062:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0706md.C0707a.close():void");
        }

        public final void flush() {
            if (f3065c || !Thread.holdsLock(C0706md.this)) {
                synchronized (C0706md.this) {
                    C0706md.this.mo2512g();
                }
                while (this.f3069e.f3257b > 0) {
                    m2196a(false);
                    C0706md.this.f3056d.f2996q.mo2526b();
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: md$b */
    final class C0708b implements C0778ns {

        /* renamed from: c */
        static final /* synthetic */ boolean f3070c = true;

        /* renamed from: a */
        boolean f3071a;

        /* renamed from: b */
        boolean f3072b;

        /* renamed from: e */
        private final C0758nc f3074e = new C0758nc();

        /* renamed from: f */
        private final C0758nc f3075f = new C0758nc();

        /* renamed from: g */
        private final long f3076g;

        static {
            Class<C0706md> cls = C0706md.class;
        }

        C0708b(long j) {
            this.f3076g = j;
        }

        /* renamed from: b */
        private void m2199b() {
            C0706md.this.f3061i.mo2601b_();
            while (this.f3075f.f3257b == 0 && !this.f3072b && !this.f3071a && C0706md.this.f3063k == null) {
                try {
                    C0706md.this.mo2513h();
                } finally {
                    C0706md.this.f3061i.mo2517b();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
            r10 = r7.f3073d.f3056d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            r7.f3073d.f3056d.f2990k += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
            if (r7.f3073d.f3056d.f2990k < ((long) (r7.f3073d.f3056d.f2992m.mo2536b() / 2))) goto L_0x00bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
            r7.f3073d.f3056d.mo2483a(0, r7.f3073d.f3056d.f2990k);
            r7.f3073d.f3056d.f2990k = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bf, code lost:
            monitor-exit(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
            return r8;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo2414a(p000.C0758nc r8, long r9) {
            /*
                r7 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 >= 0) goto L_0x001a
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "byteCount < 0: "
                r0.<init>(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r8.<init>(r9)
                throw r8
            L_0x001a:
                md r2 = p000.C0706md.this
                monitor-enter(r2)
                r7.m2199b()     // Catch:{ all -> 0x00c4 }
                boolean r3 = r7.f3071a     // Catch:{ all -> 0x00c4 }
                if (r3 == 0) goto L_0x002c
                java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00c4 }
                java.lang.String r9 = "stream closed"
                r8.<init>(r9)     // Catch:{ all -> 0x00c4 }
                throw r8     // Catch:{ all -> 0x00c4 }
            L_0x002c:
                md r3 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                lw r3 = r3.f3063k     // Catch:{ all -> 0x00c4 }
                if (r3 == 0) goto L_0x003c
                mi r8 = new mi     // Catch:{ all -> 0x00c4 }
                md r9 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                lw r9 = r9.f3063k     // Catch:{ all -> 0x00c4 }
                r8.<init>(r9)     // Catch:{ all -> 0x00c4 }
                throw r8     // Catch:{ all -> 0x00c4 }
            L_0x003c:
                nc r3 = r7.f3075f     // Catch:{ all -> 0x00c4 }
                long r3 = r3.f3257b     // Catch:{ all -> 0x00c4 }
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto L_0x0048
                r8 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x00c4 }
                return r8
            L_0x0048:
                nc r3 = r7.f3075f     // Catch:{ all -> 0x00c4 }
                nc r4 = r7.f3075f     // Catch:{ all -> 0x00c4 }
                long r4 = r4.f3257b     // Catch:{ all -> 0x00c4 }
                long r9 = java.lang.Math.min(r9, r4)     // Catch:{ all -> 0x00c4 }
                long r8 = r3.mo2414a(r8, r9)     // Catch:{ all -> 0x00c4 }
                md r10 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                long r3 = r10.f3053a     // Catch:{ all -> 0x00c4 }
                long r3 = r3 + r8
                r10.f3053a = r3     // Catch:{ all -> 0x00c4 }
                md r10 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                long r3 = r10.f3053a     // Catch:{ all -> 0x00c4 }
                md r10 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                mb r10 = r10.f3056d     // Catch:{ all -> 0x00c4 }
                mh r10 = r10.f2992m     // Catch:{ all -> 0x00c4 }
                int r10 = r10.mo2536b()     // Catch:{ all -> 0x00c4 }
                int r10 = r10 / 2
                long r5 = (long) r10     // Catch:{ all -> 0x00c4 }
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 < 0) goto L_0x0085
                md r10 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                mb r10 = r10.f3056d     // Catch:{ all -> 0x00c4 }
                md r3 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                int r3 = r3.f3055c     // Catch:{ all -> 0x00c4 }
                md r4 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                long r4 = r4.f3053a     // Catch:{ all -> 0x00c4 }
                r10.mo2483a(r3, r4)     // Catch:{ all -> 0x00c4 }
                md r10 = p000.C0706md.this     // Catch:{ all -> 0x00c4 }
                r10.f3053a = r0     // Catch:{ all -> 0x00c4 }
            L_0x0085:
                monitor-exit(r2)     // Catch:{ all -> 0x00c4 }
                md r10 = p000.C0706md.this
                mb r10 = r10.f3056d
                monitor-enter(r10)
                md r2 = p000.C0706md.this     // Catch:{ all -> 0x00c1 }
                mb r2 = r2.f3056d     // Catch:{ all -> 0x00c1 }
                long r3 = r2.f2990k     // Catch:{ all -> 0x00c1 }
                long r3 = r3 + r8
                r2.f2990k = r3     // Catch:{ all -> 0x00c1 }
                md r2 = p000.C0706md.this     // Catch:{ all -> 0x00c1 }
                mb r2 = r2.f3056d     // Catch:{ all -> 0x00c1 }
                long r2 = r2.f2990k     // Catch:{ all -> 0x00c1 }
                md r4 = p000.C0706md.this     // Catch:{ all -> 0x00c1 }
                mb r4 = r4.f3056d     // Catch:{ all -> 0x00c1 }
                mh r4 = r4.f2992m     // Catch:{ all -> 0x00c1 }
                int r4 = r4.mo2536b()     // Catch:{ all -> 0x00c1 }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x00c1 }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x00bf
                md r2 = p000.C0706md.this     // Catch:{ all -> 0x00c1 }
                mb r2 = r2.f3056d     // Catch:{ all -> 0x00c1 }
                r3 = 0
                md r4 = p000.C0706md.this     // Catch:{ all -> 0x00c1 }
                mb r4 = r4.f3056d     // Catch:{ all -> 0x00c1 }
                long r4 = r4.f2990k     // Catch:{ all -> 0x00c1 }
                r2.mo2483a(r3, r4)     // Catch:{ all -> 0x00c1 }
                md r2 = p000.C0706md.this     // Catch:{ all -> 0x00c1 }
                mb r2 = r2.f3056d     // Catch:{ all -> 0x00c1 }
                r2.f2990k = r0     // Catch:{ all -> 0x00c1 }
            L_0x00bf:
                monitor-exit(r10)     // Catch:{ all -> 0x00c1 }
                return r8
            L_0x00c1:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00c1 }
                throw r8
            L_0x00c4:
                r8 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00c4 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0706md.C0708b.mo2414a(nc, long):long");
        }

        /* renamed from: a */
        public final C0779nt mo2415a() {
            return C0706md.this.f3061i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2514a(C0761ne neVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            if (f3070c || !Thread.holdsLock(C0706md.this)) {
                while (j > 0) {
                    synchronized (C0706md.this) {
                        z = this.f3072b;
                        z2 = false;
                        z3 = this.f3075f.f3257b + j > this.f3076g;
                    }
                    if (z3) {
                        neVar.mo2643g(j);
                        C0706md.this.mo2505b(C0678lw.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        neVar.mo2643g(j);
                        return;
                    } else {
                        long a = neVar.mo2414a(this.f3074e, j);
                        if (a == -1) {
                            throw new EOFException();
                        }
                        j -= a;
                        synchronized (C0706md.this) {
                            if (this.f3075f.f3257b == 0) {
                                z2 = true;
                            }
                            this.f3075f.mo2608a((C0778ns) this.f3074e);
                            if (z2) {
                                C0706md.this.notifyAll();
                            }
                        }
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        public final void close() {
            synchronized (C0706md.this) {
                this.f3071a = true;
                this.f3075f.mo2660q();
                C0706md.this.notifyAll();
            }
            C0706md.this.mo2511f();
        }
    }

    /* renamed from: md$c */
    class C0709c extends C0753na {
        C0709c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final IOException mo2515a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo2516a() {
            C0706md.this.mo2505b(C0678lw.CANCEL);
        }

        /* renamed from: b */
        public final void mo2517b() {
            if (mo2602c_()) {
                throw mo2515a(null);
            }
        }
    }

    C0706md(int i, C0688mb mbVar, boolean z, boolean z2, List<C0679lx> list) {
        if (mbVar == null) {
            throw new NullPointerException("connection == null");
        } else if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        } else {
            this.f3055c = i;
            this.f3056d = mbVar;
            this.f3054b = (long) mbVar.f2993n.mo2536b();
            this.f3059g = new C0708b((long) mbVar.f2992m.mo2536b());
            this.f3060h = new C0707a();
            this.f3059g.f3072b = z2;
            this.f3060h.f3067b = z;
            this.f3064m = list;
        }
    }

    /* renamed from: d */
    private boolean m2183d(C0678lw lwVar) {
        if (f3052l || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f3063k != null) {
                    return false;
                }
                if (this.f3059g.f3072b && this.f3060h.f3067b) {
                    return false;
                }
                this.f3063k = lwVar;
                notifyAll();
                this.f3056d.mo2487b(this.f3055c);
                return true;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2502a(long j) {
        this.f3054b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo2503a(C0678lw lwVar) {
        if (m2183d(lwVar)) {
            this.f3056d.mo2489b(this.f3055c, lwVar);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo2504a() {
        if (this.f3063k != null) {
            return false;
        }
        return (!this.f3059g.f3072b && !this.f3059g.f3071a) || (!this.f3060h.f3067b && !this.f3060h.f3066a) || !this.f3058f;
    }

    /* renamed from: b */
    public final void mo2505b(C0678lw lwVar) {
        if (m2183d(lwVar)) {
            this.f3056d.mo2484a(this.f3055c, lwVar);
        }
    }

    /* renamed from: b */
    public final boolean mo2506b() {
        return this.f3056d.f2980a == ((this.f3055c & 1) == 1);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final synchronized List<C0679lx> mo2507c() {
        List<C0679lx> list;
        if (!mo2506b()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.f3061i.mo2601b_();
        while (this.f3057e == null && this.f3063k == null) {
            try {
                mo2513h();
            } catch (Throwable th) {
                this.f3061i.mo2517b();
                throw th;
            }
        }
        this.f3061i.mo2517b();
        list = this.f3057e;
        if (list != null) {
            this.f3057e = null;
        } else {
            throw new C0716mi(this.f3063k);
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized void mo2508c(C0678lw lwVar) {
        if (this.f3063k == null) {
            this.f3063k = lwVar;
            notifyAll();
        }
    }

    /* renamed from: d */
    public final C0777nr mo2509d() {
        synchronized (this) {
            if (!this.f3058f && !mo2506b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f3060h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo2510e() {
        boolean a;
        if (f3052l || !Thread.holdsLock(this)) {
            synchronized (this) {
                this.f3059g.f3072b = true;
                a = mo2504a();
                notifyAll();
            }
            if (!a) {
                this.f3056d.mo2487b(this.f3055c);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo2511f() {
        boolean z;
        boolean a;
        if (f3052l || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.f3059g.f3072b && this.f3059g.f3071a && (this.f3060h.f3067b || this.f3060h.f3066a);
                a = mo2504a();
            }
            if (z) {
                mo2503a(C0678lw.CANCEL);
                return;
            }
            if (!a) {
                this.f3056d.mo2487b(this.f3055c);
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo2512g() {
        if (this.f3060h.f3066a) {
            throw new IOException("stream closed");
        } else if (this.f3060h.f3067b) {
            throw new IOException("stream finished");
        } else if (this.f3063k != null) {
            throw new C0716mi(this.f3063k);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo2513h() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }
}
