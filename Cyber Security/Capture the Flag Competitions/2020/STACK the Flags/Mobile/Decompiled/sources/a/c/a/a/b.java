package a.c.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f482a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f483b = Executors.newFixedThreadPool(2, new a(this));

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f484c;

    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f485a = new AtomicInteger(0);

        public a(b this$0) {
        }

        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f485a.getAndIncrement())));
            return t;
        }
    }

    @Override // a.c.a.a.c
    public void a(Runnable runnable) {
        this.f483b.execute(runnable);
    }

    @Override // a.c.a.a.c
    public void c(Runnable runnable) {
        if (this.f484c == null) {
            synchronized (this.f482a) {
                if (this.f484c == null) {
                    this.f484c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f484c.post(runnable);
    }

    @Override // a.c.a.a.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
