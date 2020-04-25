package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: na */
public class C0753na extends C0779nt {

    /* renamed from: a */
    private static final long f3243a = TimeUnit.SECONDS.toMillis(60);
    @Nullable

    /* renamed from: b */
    static C0753na f3244b;

    /* renamed from: d */
    private static final long f3245d = TimeUnit.MILLISECONDS.toNanos(f3243a);

    /* renamed from: e */
    private boolean f3246e;
    @Nullable

    /* renamed from: f */
    private C0753na f3247f;

    /* renamed from: g */
    private long f3248g;

    /* renamed from: na$a */
    static final class C0756a extends Thread {
        C0756a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo2516a();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<na> r0 = p000.C0753na.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                na r1 = p000.C0753na.m2368e()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                na r2 = p000.C0753na.f3244b     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                p000.C0753na.f3244b = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo2516a()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0753na.C0756a.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0050 A[EDGE_INSN: B:35:0x0050->B:22:0x0050 ?: BREAK  
    EDGE_INSN: B:35:0x0050->B:22:0x0050 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m2366a(p000.C0753na r5, long r6, boolean r8) {
        /*
            java.lang.Class<na> r0 = p000.C0753na.class
            monitor-enter(r0)
            na r1 = f3244b     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0016
            na r1 = new na     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            f3244b = r1     // Catch:{ all -> 0x0069 }
            na$a r1 = new na$a     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            r1.start()     // Catch:{ all -> 0x0069 }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0069 }
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002f
            long r3 = r5.mo2689c()     // Catch:{ all -> 0x0069 }
            long r3 = r3 - r1
            long r6 = java.lang.Math.min(r6, r3)     // Catch:{ all -> 0x0069 }
        L_0x002b:
            long r6 = r6 + r1
            r5.f3248g = r6     // Catch:{ all -> 0x0069 }
            goto L_0x003a
        L_0x002f:
            if (r3 == 0) goto L_0x0032
            goto L_0x002b
        L_0x0032:
            if (r8 == 0) goto L_0x0063
            long r6 = r5.mo2689c()     // Catch:{ all -> 0x0069 }
            r5.f3248g = r6     // Catch:{ all -> 0x0069 }
        L_0x003a:
            long r6 = r5.f3248g     // Catch:{ all -> 0x0069 }
            long r6 = r6 - r1
            na r8 = f3244b     // Catch:{ all -> 0x0069 }
        L_0x003f:
            na r3 = r8.f3247f     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0050
            na r3 = r8.f3247f     // Catch:{ all -> 0x0069 }
            long r3 = r3.f3248g     // Catch:{ all -> 0x0069 }
            long r3 = r3 - r1
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            na r8 = r8.f3247f     // Catch:{ all -> 0x0069 }
            goto L_0x003f
        L_0x0050:
            na r6 = r8.f3247f     // Catch:{ all -> 0x0069 }
            r5.f3247f = r6     // Catch:{ all -> 0x0069 }
            r8.f3247f = r5     // Catch:{ all -> 0x0069 }
            na r5 = f3244b     // Catch:{ all -> 0x0069 }
            if (r8 != r5) goto L_0x0061
            java.lang.Class<na> r5 = p000.C0753na.class
            r5.notify()     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)
            return
        L_0x0061:
            monitor-exit(r0)
            return
        L_0x0063:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch:{ all -> 0x0069 }
            r5.<init>()     // Catch:{ all -> 0x0069 }
            throw r5     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0753na.m2366a(na, long, boolean):void");
    }

    /* renamed from: a */
    private static synchronized boolean m2367a(C0753na naVar) {
        boolean z;
        synchronized (C0753na.class) {
            C0753na naVar2 = f3244b;
            while (true) {
                if (naVar2 == null) {
                    z = true;
                    break;
                } else if (naVar2.f3247f == naVar) {
                    naVar2.f3247f = naVar.f3247f;
                    naVar.f3247f = null;
                    z = false;
                    break;
                } else {
                    naVar2 = naVar2.f3247f;
                }
            }
        }
        return z;
    }

    @Nullable
    /* renamed from: e */
    static C0753na m2368e() {
        C0753na naVar = f3244b.f3247f;
        if (naVar == null) {
            long nanoTime = System.nanoTime();
            C0753na.class.wait(f3243a);
            if (f3244b.f3247f != null || System.nanoTime() - nanoTime < f3245d) {
                return null;
            }
            return f3244b;
        }
        long nanoTime2 = naVar.f3248g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            C0753na.class.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        f3244b.f3247f = naVar.f3247f;
        naVar.f3247f = null;
        return naVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IOException mo2515a(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2516a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2599a(boolean z) {
        if (mo2602c_() && z) {
            throw mo2515a((IOException) null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final IOException mo2600b(IOException iOException) {
        return !mo2602c_() ? iOException : mo2515a(iOException);
    }

    /* renamed from: b_ */
    public final void mo2601b_() {
        if (this.f3246e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long d_ = mo2691d_();
        boolean e_ = mo2692e_();
        if (d_ != 0 || e_) {
            this.f3246e = true;
            m2366a(this, d_, e_);
        }
    }

    /* renamed from: c_ */
    public final boolean mo2602c_() {
        if (!this.f3246e) {
            return false;
        }
        this.f3246e = false;
        return m2367a(this);
    }
}
