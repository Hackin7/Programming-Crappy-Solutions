package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: da */
public final class C0232da extends C0234db {

    /* renamed from: a */
    private final Object f1142a = new Object();

    /* renamed from: b */
    private final ExecutorService f1143b = Executors.newFixedThreadPool(2, new ThreadFactory() {

        /* renamed from: b */
        private final AtomicInteger f1146b = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f1146b.getAndIncrement())}));
            return thread;
        }
    });

    /* renamed from: c */
    private volatile Handler f1144c;

    /* renamed from: a */
    public final void mo1339a(Runnable runnable) {
        this.f1143b.execute(runnable);
    }

    /* renamed from: b */
    public final void mo1340b(Runnable runnable) {
        if (this.f1144c == null) {
            synchronized (this.f1142a) {
                if (this.f1144c == null) {
                    this.f1144c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f1144c.post(runnable);
    }

    /* renamed from: b */
    public final boolean mo1341b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
