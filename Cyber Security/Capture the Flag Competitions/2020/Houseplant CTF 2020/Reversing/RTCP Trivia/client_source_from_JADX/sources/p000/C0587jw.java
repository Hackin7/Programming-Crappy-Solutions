package p000;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: jw */
public final class C0587jw {

    /* renamed from: a */
    static final Executor f2519a;

    /* renamed from: g */
    static final /* synthetic */ boolean f2520g = true;

    /* renamed from: b */
    final int f2521b;

    /* renamed from: c */
    final Runnable f2522c;

    /* renamed from: d */
    final Deque<C0648ld> f2523d;

    /* renamed from: e */
    final C0650le f2524e;

    /* renamed from: f */
    boolean f2525f;

    /* renamed from: h */
    private final long f2526h;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0633kv.m1970a("OkHttp ConnectionPool", true));
        f2519a = threadPoolExecutor;
    }

    public C0587jw() {
        this(TimeUnit.MINUTES);
    }

    private C0587jw(TimeUnit timeUnit) {
        this.f2522c = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                L_0x0000:
                    jw r0 = p000.C0587jw.this
                    long r1 = java.lang.System.nanoTime()
                    long r0 = r0.mo2300a(r1)
                    r2 = -1
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 != 0) goto L_0x0011
                    return
                L_0x0011:
                    r2 = 0
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 <= 0) goto L_0x0000
                    r2 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r0 / r2
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    jw r2 = p000.C0587jw.this
                    monitor-enter(r2)
                    jw r3 = p000.C0587jw.this     // Catch:{ InterruptedException -> 0x002a }
                    int r0 = (int) r0     // Catch:{ InterruptedException -> 0x002a }
                    r3.wait(r4, r0)     // Catch:{ InterruptedException -> 0x002a }
                    goto L_0x002a
                L_0x0028:
                    r0 = move-exception
                    goto L_0x002c
                L_0x002a:
                    monitor-exit(r2)     // Catch:{ all -> 0x0028 }
                    goto L_0x0000
                L_0x002c:
                    monitor-exit(r2)     // Catch:{ all -> 0x0028 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C0587jw.C05881.run():void");
            }
        };
        this.f2523d = new ArrayDeque();
        this.f2524e = new C0650le();
        this.f2521b = 5;
        this.f2526h = timeUnit.toNanos(5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo2300a(long j) {
        int size;
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            int i = 0;
            C0648ld ldVar = null;
            int i2 = 0;
            for (C0648ld ldVar2 : this.f2523d) {
                List<Reference<C0654lh>> list = ldVar2.f2814k;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        size = list.size();
                        break;
                    }
                    Reference reference = (Reference) list.get(i3);
                    if (reference.get() != null) {
                        i3++;
                    } else {
                        C0655a aVar = (C0655a) reference;
                        StringBuilder sb = new StringBuilder("A connection to ");
                        sb.append(ldVar2.f2804a.f2720a.f2359a);
                        sb.append(" was leaked. Did you forget to close a response body?");
                        C0728mp.m2273c().mo2542a(sb.toString(), aVar.f2848a);
                        list.remove(i3);
                        ldVar2.f2811h = true;
                        if (list.isEmpty()) {
                            ldVar2.f2815l = j - this.f2526h;
                            size = 0;
                            break;
                        }
                    }
                }
                if (size > 0) {
                    i++;
                } else {
                    i2++;
                    long j3 = j - ldVar2.f2815l;
                    if (j3 > j2) {
                        ldVar = ldVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f2526h) {
                if (i2 <= this.f2521b) {
                    if (i2 > 0) {
                        long j4 = this.f2526h - j2;
                        return j4;
                    } else if (i > 0) {
                        long j5 = this.f2526h;
                        return j5;
                    } else {
                        this.f2525f = false;
                        return -1;
                    }
                }
            }
            this.f2523d.remove(ldVar);
            C0633kv.m1973a(ldVar.f2806c);
            return 0;
        }
    }
}
