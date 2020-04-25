package p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: fx */
public final class C0365fx {

    /* renamed from: a */
    final Object f1677a = new Object();

    /* renamed from: b */
    HandlerThread f1678b;

    /* renamed from: c */
    Handler f1679c;

    /* renamed from: d */
    final int f1680d;

    /* renamed from: e */
    private int f1681e;

    /* renamed from: f */
    private Callback f1682f = new Callback() {
        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0365fx fxVar = C0365fx.this;
                    synchronized (fxVar.f1677a) {
                        if (!fxVar.f1679c.hasMessages(1)) {
                            fxVar.f1678b.quit();
                            fxVar.f1678b = null;
                            fxVar.f1679c = null;
                        }
                    }
                    return true;
                case 1:
                    C0365fx fxVar2 = C0365fx.this;
                    ((Runnable) message.obj).run();
                    synchronized (fxVar2.f1677a) {
                        fxVar2.f1679c.removeMessages(0);
                        fxVar2.f1679c.sendMessageDelayed(fxVar2.f1679c.obtainMessage(0), (long) fxVar2.f1680d);
                    }
                    return true;
                default:
                    return true;
            }
        }
    };

    /* renamed from: g */
    private final int f1683g;

    /* renamed from: h */
    private final String f1684h;

    /* renamed from: fx$a */
    public interface C0370a<T> {
        /* renamed from: a */
        void mo1755a(T t);
    }

    public C0365fx(String str) {
        this.f1684h = str;
        this.f1683g = 10;
        this.f1680d = 10000;
        this.f1681e = 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(4:26|15|16|17)(1:18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo1757a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            fx$3 r11 = new fx$3
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.mo1758a(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r0 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x0040 }
            r13 = r0
        L_0x0040:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004e
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004e:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x003b
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0365fx.mo1757a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1758a(Runnable runnable) {
        synchronized (this.f1677a) {
            if (this.f1678b == null) {
                this.f1678b = new HandlerThread(this.f1684h, this.f1683g);
                this.f1678b.start();
                this.f1679c = new Handler(this.f1678b.getLooper(), this.f1682f);
                this.f1681e++;
            }
            this.f1679c.removeMessages(0);
            this.f1679c.sendMessage(this.f1679c.obtainMessage(1, runnable));
        }
    }
}
