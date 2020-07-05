package p000;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: mb */
public final class C0688mb implements Closeable {

    /* renamed from: t */
    static final /* synthetic */ boolean f2978t = true;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final ExecutorService f2979u;

    /* renamed from: a */
    final boolean f2980a;

    /* renamed from: b */
    final C0696b f2981b;

    /* renamed from: c */
    final Map<Integer, C0706md> f2982c = new LinkedHashMap();

    /* renamed from: d */
    final String f2983d;

    /* renamed from: e */
    int f2984e;

    /* renamed from: f */
    int f2985f;

    /* renamed from: g */
    boolean f2986g;

    /* renamed from: h */
    final ExecutorService f2987h;

    /* renamed from: i */
    final C0713mg f2988i;
    /* access modifiers changed from: 0000 */

    /* renamed from: j */
    public boolean f2989j;

    /* renamed from: k */
    long f2990k = 0;

    /* renamed from: l */
    long f2991l;

    /* renamed from: m */
    public C0715mh f2992m = new C0715mh();

    /* renamed from: n */
    final C0715mh f2993n = new C0715mh();

    /* renamed from: o */
    boolean f2994o = false;

    /* renamed from: p */
    final Socket f2995p;

    /* renamed from: q */
    public final C0710me f2996q;

    /* renamed from: r */
    public final C0699d f2997r;

    /* renamed from: s */
    final Set<Integer> f2998s = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final ScheduledExecutorService f2999v;

    /* renamed from: mb$a */
    public static class C0695a {

        /* renamed from: a */
        public Socket f3021a;

        /* renamed from: b */
        public String f3022b;

        /* renamed from: c */
        public C0761ne f3023c;

        /* renamed from: d */
        public C0760nd f3024d;

        /* renamed from: e */
        public C0696b f3025e = C0696b.f3029m;

        /* renamed from: f */
        C0713mg f3026f = C0713mg.f3092a;

        /* renamed from: g */
        boolean f3027g = true;

        /* renamed from: h */
        public int f3028h;
    }

    /* renamed from: mb$b */
    public static abstract class C0696b {

        /* renamed from: m */
        public static final C0696b f3029m = new C0696b() {
            /* renamed from: a */
            public final void mo2427a(C0706md mdVar) {
                mdVar.mo2503a(C0678lw.REFUSED_STREAM);
            }
        };

        /* renamed from: a */
        public void mo2426a(C0688mb mbVar) {
        }

        /* renamed from: a */
        public abstract void mo2427a(C0706md mdVar);
    }

    /* renamed from: mb$c */
    final class C0698c extends C0632ku {

        /* renamed from: a */
        final boolean f3030a;

        /* renamed from: c */
        final int f3031c;

        /* renamed from: d */
        final int f3032d;

        C0698c(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C0688mb.this.f2983d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f3030a = z;
            this.f3031c = i;
            this.f3032d = i2;
        }

        /* renamed from: b */
        public final void mo2374b() {
            boolean z;
            C0688mb mbVar = C0688mb.this;
            boolean z2 = this.f3030a;
            int i = this.f3031c;
            int i2 = this.f3032d;
            if (!z2) {
                synchronized (mbVar) {
                    z = mbVar.f2989j;
                    mbVar.f2989j = true;
                }
                if (z) {
                    mbVar.mo2488b();
                    return;
                }
            }
            try {
                mbVar.f2996q.mo2523a(z2, i, i2);
            } catch (IOException unused) {
                mbVar.mo2488b();
            }
        }
    }

    /* renamed from: mb$d */
    class C0699d extends C0632ku implements C0705b {

        /* renamed from: a */
        final C0703mc f3034a;

        C0699d(C0703mc mcVar) {
            super("OkHttp %s", C0688mb.this.f2983d);
            this.f3034a = mcVar;
        }

        /* renamed from: a */
        public final void mo2492a(int i, long j) {
            if (i == 0) {
                synchronized (C0688mb.this) {
                    C0688mb.this.f2991l += j;
                    C0688mb.this.notifyAll();
                }
                return;
            }
            C0706md a = C0688mb.this.mo2481a(i);
            if (a != null) {
                synchronized (a) {
                    a.mo2502a(j);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r6 = r1.f2987h;
            r0 = new p000.C0688mb.C06913(r1, "OkHttp %s Push Request[%s]", new java.lang.Object[]{r1.f2983d, java.lang.Integer.valueOf(r9)}, r9, r10);
            r6.execute(r0);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2493a(int r9, java.util.List<p000.C0679lx> r10) {
            /*
                r8 = this;
                mb r1 = p000.C0688mb.this
                monitor-enter(r1)
                java.util.Set<java.lang.Integer> r0 = r1.f2998s     // Catch:{ all -> 0x003f }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003f }
                boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x003f }
                if (r0 == 0) goto L_0x0016
                lw r10 = p000.C0678lw.PROTOCOL_ERROR     // Catch:{ all -> 0x003f }
                r1.mo2484a(r9, r10)     // Catch:{ all -> 0x003f }
                monitor-exit(r1)     // Catch:{ all -> 0x003f }
                return
            L_0x0016:
                java.util.Set<java.lang.Integer> r0 = r1.f2998s     // Catch:{ all -> 0x003f }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003f }
                r0.add(r2)     // Catch:{ all -> 0x003f }
                monitor-exit(r1)     // Catch:{ all -> 0x003f }
                java.util.concurrent.ExecutorService r6 = r1.f2987h     // Catch:{ RejectedExecutionException -> 0x003e }
                mb$3 r7 = new mb$3     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r2 = "OkHttp %s Push Request[%s]"
                r0 = 2
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RejectedExecutionException -> 0x003e }
                r0 = 0
                java.lang.String r4 = r1.f2983d     // Catch:{ RejectedExecutionException -> 0x003e }
                r3[r0] = r4     // Catch:{ RejectedExecutionException -> 0x003e }
                r0 = 1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ RejectedExecutionException -> 0x003e }
                r3[r0] = r4     // Catch:{ RejectedExecutionException -> 0x003e }
                r0 = r7
                r4 = r9
                r5 = r10
                r0.<init>(r2, r3, r4, r5)     // Catch:{ RejectedExecutionException -> 0x003e }
                r6.execute(r7)     // Catch:{ RejectedExecutionException -> 0x003e }
            L_0x003e:
                return
            L_0x003f:
                r9 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x003f }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0688mb.C0699d.mo2493a(int, java.util.List):void");
        }

        /* renamed from: a */
        public final void mo2494a(int i, C0678lw lwVar) {
            if (C0688mb.m2132c(i)) {
                C0688mb mbVar = C0688mb.this;
                ExecutorService executorService = mbVar.f2987h;
                C06946 r1 = new C0632ku("OkHttp %s Push Reset[%s]", new Object[]{mbVar.f2983d, Integer.valueOf(i)}, i, lwVar) {

                    /* renamed from: a */
                    final /* synthetic */ int f3018a;

                    /* renamed from: c */
                    final /* synthetic */ C0678lw f3019c;

                    {
                        this.f3018a = r4;
                        this.f3019c = r5;
                    }

                    /* renamed from: b */
                    public final void mo2374b() {
                        C0688mb.this.f2988i.mo2532c();
                        synchronized (C0688mb.this) {
                            C0688mb.this.f2998s.remove(Integer.valueOf(this.f3018a));
                        }
                    }
                };
                executorService.execute(r1);
                return;
            }
            C0706md b = C0688mb.this.mo2487b(i);
            if (b != null) {
                b.mo2508c(lwVar);
            }
        }

        /* renamed from: a */
        public final void mo2495a(int i, C0762nf nfVar) {
            C0706md[] mdVarArr;
            nfVar.mo2681g();
            synchronized (C0688mb.this) {
                mdVarArr = (C0706md[]) C0688mb.this.f2982c.values().toArray(new C0706md[C0688mb.this.f2982c.size()]);
                C0688mb.this.f2986g = true;
            }
            for (C0706md mdVar : mdVarArr) {
                if (mdVar.f3055c > i && mdVar.mo2506b()) {
                    mdVar.mo2508c(C0678lw.REFUSED_STREAM);
                    C0688mb.this.mo2487b(mdVar.f3055c);
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|(4:6|(2:8|48)(1:49)|9|4)|47|10|11|12|13|14|(1:26)(4:17|(3:19|(1:21)|22)|23|(1:25))|27|28) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2496a(final p000.C0715mh r13) {
            /*
                r12 = this;
                mb r0 = p000.C0688mb.this
                monitor-enter(r0)
                mb r1 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                mh r1 = r1.f2993n     // Catch:{ all -> 0x00bb }
                int r1 = r1.mo2536b()     // Catch:{ all -> 0x00bb }
                mb r2 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                mh r2 = r2.f2993n     // Catch:{ all -> 0x00bb }
                r3 = 0
                r4 = r3
            L_0x0011:
                r5 = 10
                if (r4 >= r5) goto L_0x0025
                boolean r5 = r13.mo2535a(r4)     // Catch:{ all -> 0x00bb }
                if (r5 == 0) goto L_0x0022
                int[] r5 = r13.f3094b     // Catch:{ all -> 0x00bb }
                r5 = r5[r4]     // Catch:{ all -> 0x00bb }
                r2.mo2534a(r4, r5)     // Catch:{ all -> 0x00bb }
            L_0x0022:
                int r4 = r4 + 1
                goto L_0x0011
            L_0x0025:
                r2 = 1
                mb r4 = p000.C0688mb.this     // Catch:{ RejectedExecutionException -> 0x003e }
                java.util.concurrent.ScheduledExecutorService r4 = r4.f2999v     // Catch:{ RejectedExecutionException -> 0x003e }
                mb$d$3 r5 = new mb$d$3     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r6 = "OkHttp %s ACK Settings"
                java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ RejectedExecutionException -> 0x003e }
                mb r8 = p000.C0688mb.this     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r8 = r8.f2983d     // Catch:{ RejectedExecutionException -> 0x003e }
                r7[r3] = r8     // Catch:{ RejectedExecutionException -> 0x003e }
                r5.<init>(r6, r7, r13)     // Catch:{ RejectedExecutionException -> 0x003e }
                r4.execute(r5)     // Catch:{ RejectedExecutionException -> 0x003e }
            L_0x003e:
                mb r13 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                mh r13 = r13.f2993n     // Catch:{ all -> 0x00bb }
                int r13 = r13.mo2536b()     // Catch:{ all -> 0x00bb }
                r4 = -1
                r5 = 0
                r7 = 0
                if (r13 == r4) goto L_0x008c
                if (r13 == r1) goto L_0x008c
                int r13 = r13 - r1
                long r8 = (long) r13     // Catch:{ all -> 0x00bb }
                mb r13 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                boolean r13 = r13.f2994o     // Catch:{ all -> 0x00bb }
                if (r13 != 0) goto L_0x0068
                mb r13 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                long r10 = r13.f2991l     // Catch:{ all -> 0x00bb }
                long r10 = r10 + r8
                r13.f2991l = r10     // Catch:{ all -> 0x00bb }
                int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0064
                r13.notifyAll()     // Catch:{ all -> 0x00bb }
            L_0x0064:
                mb r13 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                r13.f2994o = r2     // Catch:{ all -> 0x00bb }
            L_0x0068:
                mb r13 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                java.util.Map<java.lang.Integer, md> r13 = r13.f2982c     // Catch:{ all -> 0x00bb }
                boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x00bb }
                if (r13 != 0) goto L_0x008d
                mb r13 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                java.util.Map<java.lang.Integer, md> r13 = r13.f2982c     // Catch:{ all -> 0x00bb }
                java.util.Collection r13 = r13.values()     // Catch:{ all -> 0x00bb }
                mb r1 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                java.util.Map<java.lang.Integer, md> r1 = r1.f2982c     // Catch:{ all -> 0x00bb }
                int r1 = r1.size()     // Catch:{ all -> 0x00bb }
                md[] r1 = new p000.C0706md[r1]     // Catch:{ all -> 0x00bb }
                java.lang.Object[] r13 = r13.toArray(r1)     // Catch:{ all -> 0x00bb }
                r7 = r13
                md[] r7 = (p000.C0706md[]) r7     // Catch:{ all -> 0x00bb }
                goto L_0x008d
            L_0x008c:
                r8 = r5
            L_0x008d:
                java.util.concurrent.ExecutorService r13 = p000.C0688mb.f2979u     // Catch:{ all -> 0x00bb }
                mb$d$2 r1 = new mb$d$2     // Catch:{ all -> 0x00bb }
                java.lang.String r4 = "OkHttp %s settings"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00bb }
                mb r10 = p000.C0688mb.this     // Catch:{ all -> 0x00bb }
                java.lang.String r10 = r10.f2983d     // Catch:{ all -> 0x00bb }
                r2[r3] = r10     // Catch:{ all -> 0x00bb }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x00bb }
                r13.execute(r1)     // Catch:{ all -> 0x00bb }
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                if (r7 == 0) goto L_0x00ba
                int r13 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r13 == 0) goto L_0x00ba
                int r13 = r7.length
            L_0x00ab:
                if (r3 >= r13) goto L_0x00ba
                r0 = r7[r3]
                monitor-enter(r0)
                r0.mo2502a(r8)     // Catch:{ all -> 0x00b7 }
                monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
                int r3 = r3 + 1
                goto L_0x00ab
            L_0x00b7:
                r13 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
                throw r13
            L_0x00ba:
                return
            L_0x00bb:
                r13 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0688mb.C0699d.mo2496a(mh):void");
        }

        /* renamed from: a */
        public final void mo2497a(boolean z, int i, int i2) {
            if (z) {
                synchronized (C0688mb.this) {
                    C0688mb.this.f2989j = false;
                    C0688mb.this.notifyAll();
                }
                return;
            }
            try {
                C0688mb.this.f2999v.execute(new C0698c(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
            if (p000.C0706md.f3052l != false) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
            if (java.lang.Thread.holdsLock(r4) == false) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r4.f3058f = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
            if (r4.f3057e != null) goto L_0x00a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
            r4.f3057e = r15;
            r2 = r4.mo2504a();
            r4.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
            r14 = new java.util.ArrayList();
            r14.addAll(r4.f3057e);
            r14.add(null);
            r14.addAll(r15);
            r4.f3057e = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
            if (r2 != false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
            r4.f3056d.mo2487b(r4.f3055c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
            if (r13 == false) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
            r4.mo2510e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2498a(boolean r13, int r14, java.util.List<p000.C0679lx> r15) {
            /*
                r12 = this;
                boolean r0 = p000.C0688mb.m2132c(r14)
                r1 = 0
                r2 = 1
                r3 = 2
                if (r0 == 0) goto L_0x0028
                mb r5 = p000.C0688mb.this
                java.util.concurrent.ExecutorService r0 = r5.f2987h     // Catch:{ RejectedExecutionException -> 0x0027 }
                mb$4 r11 = new mb$4     // Catch:{ RejectedExecutionException -> 0x0027 }
                java.lang.String r6 = "OkHttp %s Push Headers[%s]"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ RejectedExecutionException -> 0x0027 }
                java.lang.String r3 = r5.f2983d     // Catch:{ RejectedExecutionException -> 0x0027 }
                r7[r1] = r3     // Catch:{ RejectedExecutionException -> 0x0027 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ RejectedExecutionException -> 0x0027 }
                r7[r2] = r1     // Catch:{ RejectedExecutionException -> 0x0027 }
                r4 = r11
                r8 = r14
                r9 = r15
                r10 = r13
                r4.<init>(r6, r7, r8, r9, r10)     // Catch:{ RejectedExecutionException -> 0x0027 }
                r0.execute(r11)     // Catch:{ RejectedExecutionException -> 0x0027 }
            L_0x0027:
                return
            L_0x0028:
                mb r0 = p000.C0688mb.this
                monitor-enter(r0)
                mb r4 = p000.C0688mb.this     // Catch:{ all -> 0x00cf }
                md r4 = r4.mo2481a(r14)     // Catch:{ all -> 0x00cf }
                if (r4 != 0) goto L_0x0087
                mb r4 = p000.C0688mb.this     // Catch:{ all -> 0x00cf }
                boolean r4 = r4.f2986g     // Catch:{ all -> 0x00cf }
                if (r4 == 0) goto L_0x003b
                monitor-exit(r0)     // Catch:{ all -> 0x00cf }
                return
            L_0x003b:
                mb r4 = p000.C0688mb.this     // Catch:{ all -> 0x00cf }
                int r4 = r4.f2984e     // Catch:{ all -> 0x00cf }
                if (r14 > r4) goto L_0x0043
                monitor-exit(r0)     // Catch:{ all -> 0x00cf }
                return
            L_0x0043:
                int r4 = r14 % 2
                mb r5 = p000.C0688mb.this     // Catch:{ all -> 0x00cf }
                int r5 = r5.f2985f     // Catch:{ all -> 0x00cf }
                int r5 = r5 % r3
                if (r4 != r5) goto L_0x004e
                monitor-exit(r0)     // Catch:{ all -> 0x00cf }
                return
            L_0x004e:
                md r10 = new md     // Catch:{ all -> 0x00cf }
                mb r6 = p000.C0688mb.this     // Catch:{ all -> 0x00cf }
                r7 = 0
                r4 = r10
                r5 = r14
                r8 = r13
                r9 = r15
                r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00cf }
                mb r13 = p000.C0688mb.this     // Catch:{ all -> 0x00cf }
                r13.f2984e = r14     // Catch:{ all -> 0x00cf }
                mb r13 = p000.C0688mb.this     // Catch:{ all -> 0x00cf }
                java.util.Map<java.lang.Integer, md> r13 = r13.f2982c     // Catch:{ all -> 0x00cf }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00cf }
                r13.put(r15, r10)     // Catch:{ all -> 0x00cf }
                java.util.concurrent.ExecutorService r13 = p000.C0688mb.f2979u     // Catch:{ all -> 0x00cf }
                mb$d$1 r15 = new mb$d$1     // Catch:{ all -> 0x00cf }
                java.lang.String r4 = "OkHttp %s stream %d"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00cf }
                mb r5 = p000.C0688mb.this     // Catch:{ all -> 0x00cf }
                java.lang.String r5 = r5.f2983d     // Catch:{ all -> 0x00cf }
                r3[r1] = r5     // Catch:{ all -> 0x00cf }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00cf }
                r3[r2] = r14     // Catch:{ all -> 0x00cf }
                r15.<init>(r4, r3, r10)     // Catch:{ all -> 0x00cf }
                r13.execute(r15)     // Catch:{ all -> 0x00cf }
                monitor-exit(r0)     // Catch:{ all -> 0x00cf }
                return
            L_0x0087:
                monitor-exit(r0)     // Catch:{ all -> 0x00cf }
                boolean r14 = p000.C0706md.f3052l
                if (r14 != 0) goto L_0x0098
                boolean r14 = java.lang.Thread.holdsLock(r4)
                if (r14 == 0) goto L_0x0098
                java.lang.AssertionError r13 = new java.lang.AssertionError
                r13.<init>()
                throw r13
            L_0x0098:
                monitor-enter(r4)
                r4.f3058f = r2     // Catch:{ all -> 0x00cc }
                java.util.List<lx> r14 = r4.f3057e     // Catch:{ all -> 0x00cc }
                if (r14 != 0) goto L_0x00a9
                r4.f3057e = r15     // Catch:{ all -> 0x00cc }
                boolean r2 = r4.mo2504a()     // Catch:{ all -> 0x00cc }
                r4.notifyAll()     // Catch:{ all -> 0x00cc }
                goto L_0x00bc
            L_0x00a9:
                java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x00cc }
                r14.<init>()     // Catch:{ all -> 0x00cc }
                java.util.List<lx> r0 = r4.f3057e     // Catch:{ all -> 0x00cc }
                r14.addAll(r0)     // Catch:{ all -> 0x00cc }
                r0 = 0
                r14.add(r0)     // Catch:{ all -> 0x00cc }
                r14.addAll(r15)     // Catch:{ all -> 0x00cc }
                r4.f3057e = r14     // Catch:{ all -> 0x00cc }
            L_0x00bc:
                monitor-exit(r4)     // Catch:{ all -> 0x00cc }
                if (r2 != 0) goto L_0x00c6
                mb r14 = r4.f3056d
                int r15 = r4.f3055c
                r14.mo2487b(r15)
            L_0x00c6:
                if (r13 == 0) goto L_0x00cb
                r4.mo2510e()
            L_0x00cb:
                return
            L_0x00cc:
                r13 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00cc }
                throw r13
            L_0x00cf:
                r13 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00cf }
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0688mb.C0699d.mo2498a(boolean, int, java.util.List):void");
        }

        /* renamed from: a */
        public final void mo2499a(boolean z, int i, C0761ne neVar, int i2) {
            if (C0688mb.m2132c(i)) {
                C0688mb mbVar = C0688mb.this;
                C0758nc ncVar = new C0758nc();
                long j = (long) i2;
                neVar.mo2615a(j);
                neVar.mo2414a(ncVar, j);
                if (ncVar.f3257b != j) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ncVar.f3257b);
                    sb.append(" != ");
                    sb.append(i2);
                    throw new IOException(sb.toString());
                }
                ExecutorService executorService = mbVar.f2987h;
                C06935 r1 = new C0632ku("OkHttp %s Push Data[%s]", new Object[]{mbVar.f2983d, Integer.valueOf(i)}, i, ncVar, i2, z) {

                    /* renamed from: a */
                    final /* synthetic */ int f3013a;

                    /* renamed from: c */
                    final /* synthetic */ C0758nc f3014c;

                    /* renamed from: d */
                    final /* synthetic */ int f3015d;

                    /* renamed from: e */
                    final /* synthetic */ boolean f3016e;

                    {
                        this.f3013a = r4;
                        this.f3014c = r5;
                        this.f3015d = r6;
                        this.f3016e = r7;
                    }

                    /* renamed from: b */
                    public final void mo2374b() {
                        try {
                            C0688mb.this.f2988i.mo2530a(this.f3014c, this.f3015d);
                            C0688mb.this.f2996q.mo2520a(this.f3013a, C0678lw.CANCEL);
                            synchronized (C0688mb.this) {
                                C0688mb.this.f2998s.remove(Integer.valueOf(this.f3013a));
                            }
                        } catch (IOException unused) {
                        }
                    }
                };
                executorService.execute(r1);
                return;
            }
            C0706md a = C0688mb.this.mo2481a(i);
            if (a == null) {
                C0688mb.this.mo2484a(i, C0678lw.PROTOCOL_ERROR);
                neVar.mo2643g((long) i2);
            } else if (C0706md.f3052l || !Thread.holdsLock(a)) {
                a.f3059g.mo2514a(neVar, (long) i2);
                if (z) {
                    a.mo2510e();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0077 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2374b() {
            /*
                r10 = this;
                lw r0 = p000.C0678lw.INTERNAL_ERROR
                lw r1 = p000.C0678lw.INTERNAL_ERROR
                mc r2 = r10.f3034a     // Catch:{ IOException -> 0x0077 }
                boolean r3 = r2.f3043c     // Catch:{ IOException -> 0x0077 }
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x001b
                boolean r2 = r2.mo2500a(r4, r10)     // Catch:{ IOException -> 0x0077 }
                if (r2 != 0) goto L_0x005c
                java.lang.String r2 = "Required SETTINGS preface not received"
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0077 }
                java.io.IOException r2 = p000.C0683lz.m2117b(r2, r3)     // Catch:{ IOException -> 0x0077 }
                throw r2     // Catch:{ IOException -> 0x0077 }
            L_0x001b:
                ne r2 = r2.f3042b     // Catch:{ IOException -> 0x0077 }
                nf r3 = p000.C0683lz.f2946a     // Catch:{ IOException -> 0x0077 }
                int r3 = r3.mo2681g()     // Catch:{ IOException -> 0x0077 }
                long r6 = (long) r3     // Catch:{ IOException -> 0x0077 }
                nf r2 = r2.mo2629c(r6)     // Catch:{ IOException -> 0x0077 }
                java.util.logging.Logger r3 = p000.C0703mc.f3041a     // Catch:{ IOException -> 0x0077 }
                java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x0077 }
                boolean r3 = r3.isLoggable(r6)     // Catch:{ IOException -> 0x0077 }
                if (r3 == 0) goto L_0x0045
                java.util.logging.Logger r3 = p000.C0703mc.f3041a     // Catch:{ IOException -> 0x0077 }
                java.lang.String r6 = "<< CONNECTION %s"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0077 }
                java.lang.String r8 = r2.mo2678e()     // Catch:{ IOException -> 0x0077 }
                r7[r5] = r8     // Catch:{ IOException -> 0x0077 }
                java.lang.String r6 = p000.C0633kv.m1966a(r6, r7)     // Catch:{ IOException -> 0x0077 }
                r3.fine(r6)     // Catch:{ IOException -> 0x0077 }
            L_0x0045:
                nf r3 = p000.C0683lz.f2946a     // Catch:{ IOException -> 0x0077 }
                boolean r3 = r3.equals(r2)     // Catch:{ IOException -> 0x0077 }
                if (r3 != 0) goto L_0x005c
                java.lang.String r3 = "Expected a connection header but was %s"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0077 }
                java.lang.String r2 = r2.mo2669a()     // Catch:{ IOException -> 0x0077 }
                r4[r5] = r2     // Catch:{ IOException -> 0x0077 }
                java.io.IOException r2 = p000.C0683lz.m2117b(r3, r4)     // Catch:{ IOException -> 0x0077 }
                throw r2     // Catch:{ IOException -> 0x0077 }
            L_0x005c:
                mc r2 = r10.f3034a     // Catch:{ IOException -> 0x0077 }
                boolean r2 = r2.mo2500a(r5, r10)     // Catch:{ IOException -> 0x0077 }
                if (r2 != 0) goto L_0x005c
                lw r2 = p000.C0678lw.NO_ERROR     // Catch:{ IOException -> 0x0077 }
                lw r0 = p000.C0678lw.CANCEL     // Catch:{ IOException -> 0x0073 }
                mb r1 = p000.C0688mb.this     // Catch:{ IOException -> 0x006d }
            L_0x006a:
                r1.mo2486a(r2, r0)     // Catch:{ IOException -> 0x006d }
            L_0x006d:
                mc r0 = r10.f3034a
                p000.C0633kv.m1972a(r0)
                return
            L_0x0073:
                r0 = r2
                goto L_0x0077
            L_0x0075:
                r2 = move-exception
                goto L_0x0082
            L_0x0077:
                lw r2 = p000.C0678lw.PROTOCOL_ERROR     // Catch:{ all -> 0x0075 }
                lw r0 = p000.C0678lw.PROTOCOL_ERROR     // Catch:{ all -> 0x007e }
                mb r1 = p000.C0688mb.this     // Catch:{ IOException -> 0x006d }
                goto L_0x006a
            L_0x007e:
                r0 = move-exception
                r9 = r2
                r2 = r0
                r0 = r9
            L_0x0082:
                mb r3 = p000.C0688mb.this     // Catch:{ IOException -> 0x0087 }
                r3.mo2486a(r0, r1)     // Catch:{ IOException -> 0x0087 }
            L_0x0087:
                mc r0 = r10.f3034a
                p000.C0633kv.m1972a(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0688mb.C0699d.mo2374b():void");
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0633kv.m1970a("OkHttp Http2Connection", true));
        f2979u = threadPoolExecutor;
    }

    public C0688mb(C0695a aVar) {
        C0695a aVar2 = aVar;
        this.f2988i = aVar2.f3026f;
        this.f2980a = aVar2.f3027g;
        this.f2981b = aVar2.f3025e;
        this.f2985f = aVar2.f3027g ? 1 : 2;
        if (aVar2.f3027g) {
            this.f2985f += 2;
        }
        if (aVar2.f3027g) {
            this.f2992m.mo2534a(7, 16777216);
        }
        this.f2983d = aVar2.f3022b;
        this.f2999v = new ScheduledThreadPoolExecutor(1, C0633kv.m1970a(C0633kv.m1966a("OkHttp %s Writer", this.f2983d), false));
        if (aVar2.f3028h != 0) {
            this.f2999v.scheduleAtFixedRate(new C0698c(false, 0, 0), (long) aVar2.f3028h, (long) aVar2.f3028h, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C0633kv.m1970a(C0633kv.m1966a("OkHttp %s Push Observer", this.f2983d), true));
        this.f2987h = threadPoolExecutor;
        this.f2993n.mo2534a(7, 65535);
        this.f2993n.mo2534a(5, 16384);
        this.f2991l = (long) this.f2993n.mo2536b();
        this.f2995p = aVar2.f3021a;
        this.f2996q = new C0710me(aVar2.f3024d, this.f2980a);
        this.f2997r = new C0699d(new C0703mc(aVar2.f3023c, this.f2980a));
    }

    /* renamed from: a */
    private void m2129a(C0678lw lwVar) {
        synchronized (this.f2996q) {
            synchronized (this) {
                if (!this.f2986g) {
                    this.f2986g = true;
                    int i = this.f2984e;
                    this.f2996q.mo2521a(i, lwVar, C0633kv.f2732a);
                }
            }
        }
    }

    /* renamed from: c */
    static boolean m2132c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: a */
    public final synchronized int mo2480a() {
        C0715mh mhVar = this.f2993n;
        if ((16 & mhVar.f3093a) == 0) {
            return Integer.MAX_VALUE;
        }
        return mhVar.f3094b[4];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C0706md mo2481a(int i) {
        return (C0706md) this.f2982c.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0706md mo2482a(java.util.List<p000.C0679lx> r11, boolean r12) {
        /*
            r10 = this;
            r6 = r12 ^ 1
            me r7 = r10.f2996q
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0064 }
            int r0 = r10.f2985f     // Catch:{ all -> 0x0061 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0012
            lw r0 = p000.C0678lw.REFUSED_STREAM     // Catch:{ all -> 0x0061 }
            r10.m2129a(r0)     // Catch:{ all -> 0x0061 }
        L_0x0012:
            boolean r0 = r10.f2986g     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x001c
            lv r11 = new lv     // Catch:{ all -> 0x0061 }
            r11.<init>()     // Catch:{ all -> 0x0061 }
            throw r11     // Catch:{ all -> 0x0061 }
        L_0x001c:
            int r8 = r10.f2985f     // Catch:{ all -> 0x0061 }
            int r0 = r10.f2985f     // Catch:{ all -> 0x0061 }
            int r0 = r0 + 2
            r10.f2985f = r0     // Catch:{ all -> 0x0061 }
            md r9 = new md     // Catch:{ all -> 0x0061 }
            r4 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0061 }
            if (r12 == 0) goto L_0x0042
            long r0 = r10.f2991l     // Catch:{ all -> 0x0061 }
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x0042
            long r0 = r9.f3054b     // Catch:{ all -> 0x0061 }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r12 = 0
            goto L_0x0043
        L_0x0042:
            r12 = 1
        L_0x0043:
            boolean r0 = r9.mo2504a()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0052
            java.util.Map<java.lang.Integer, md> r0 = r10.f2982c     // Catch:{ all -> 0x0061 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0061 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0061 }
        L_0x0052:
            monitor-exit(r10)     // Catch:{ all -> 0x0061 }
            me r0 = r10.f2996q     // Catch:{ all -> 0x0064 }
            r0.mo2524a(r6, r8, r11)     // Catch:{ all -> 0x0064 }
            monitor-exit(r7)     // Catch:{ all -> 0x0064 }
            if (r12 == 0) goto L_0x0060
            me r11 = r10.f2996q
            r11.mo2526b()
        L_0x0060:
            return r9
        L_0x0061:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0061 }
            throw r11     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0064 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0688mb.mo2482a(java.util.List, boolean):md");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2483a(int i, long j) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f2999v;
            final int i2 = i;
            final long j2 = j;
            C06902 r1 = new C0632ku("OkHttp Window Update %s stream %d", new Object[]{this.f2983d, Integer.valueOf(i)}) {
                /* renamed from: b */
                public final void mo2374b() {
                    try {
                        C0688mb.this.f2996q.mo2519a(i2, j2);
                    } catch (IOException unused) {
                        C0688mb.this.mo2488b();
                    }
                }
            };
            scheduledExecutorService.execute(r1);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2484a(int i, C0678lw lwVar) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f2999v;
            final int i2 = i;
            final C0678lw lwVar2 = lwVar;
            C06891 r1 = new C0632ku("OkHttp %s stream %d", new Object[]{this.f2983d, Integer.valueOf(i)}) {
                /* renamed from: b */
                public final void mo2374b() {
                    try {
                        C0688mb.this.mo2489b(i2, lwVar2);
                    } catch (IOException unused) {
                        C0688mb.this.mo2488b();
                    }
                }
            };
            scheduledExecutorService.execute(r1);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f2991l), r8.f2996q.f3079a);
        r6 = (long) r2;
        r8.f2991l -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2485a(int r9, boolean r10, p000.C0758nc r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            me r12 = r8.f2996q
            r12.mo2525a(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0060
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f2991l     // Catch:{ InterruptedException -> 0x0058 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, md> r2 = r8.f2982c     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r2 != 0) goto L_0x002c
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x002c:
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0030:
            long r4 = r8.f2991l     // Catch:{ all -> 0x0056 }
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0056 }
            int r2 = (int) r4     // Catch:{ all -> 0x0056 }
            me r4 = r8.f2996q     // Catch:{ all -> 0x0056 }
            int r4 = r4.f3079a     // Catch:{ all -> 0x0056 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f2991l     // Catch:{ all -> 0x0056 }
            long r6 = (long) r2     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f2991l = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            me r4 = r8.f2996q
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            r4.mo2525a(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x005e
        L_0x0058:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x005e:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0688mb.mo2485a(int, boolean, nc, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2486a(C0678lw lwVar, C0678lw lwVar2) {
        if (f2978t || !Thread.holdsLock(this)) {
            C0706md[] mdVarArr = null;
            try {
                m2129a(lwVar);
                e = null;
            } catch (IOException e) {
                e = e;
            }
            synchronized (this) {
                if (!this.f2982c.isEmpty()) {
                    mdVarArr = (C0706md[]) this.f2982c.values().toArray(new C0706md[this.f2982c.size()]);
                    this.f2982c.clear();
                }
            }
            if (mdVarArr != null) {
                for (C0706md a : mdVarArr) {
                    try {
                        a.mo2503a(lwVar2);
                    } catch (IOException e2) {
                        if (e != null) {
                            e = e2;
                        }
                    }
                }
            }
            try {
                this.f2996q.close();
            } catch (IOException e3) {
                if (e == null) {
                    e = e3;
                }
            }
            try {
                this.f2995p.close();
            } catch (IOException e4) {
                e = e4;
            }
            this.f2999v.shutdown();
            this.f2987h.shutdown();
            if (e != null) {
                throw e;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized C0706md mo2487b(int i) {
        C0706md mdVar;
        mdVar = (C0706md) this.f2982c.remove(Integer.valueOf(i));
        notifyAll();
        return mdVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2488b() {
        try {
            mo2486a(C0678lw.PROTOCOL_ERROR, C0678lw.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2489b(int i, C0678lw lwVar) {
        this.f2996q.mo2520a(i, lwVar);
    }

    /* renamed from: c */
    public final synchronized boolean mo2490c() {
        return this.f2986g;
    }

    public final void close() {
        mo2486a(C0678lw.NO_ERROR, C0678lw.CANCEL);
    }
}
