package a.h.j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f874a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f875b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f876c;

    /* renamed from: d  reason: collision with root package name */
    public int f877d;

    /* renamed from: e  reason: collision with root package name */
    public Handler.Callback f878e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f879f;

    /* renamed from: g  reason: collision with root package name */
    public final int f880g;
    public final String h;

    public interface d<T> {
        void a(T t);
    }

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                c.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                c.this.b((Runnable) msg.obj);
                return true;
            }
        }
    }

    public c(String threadName, int priority, int destructAfterMillisec) {
        this.h = threadName;
        this.f880g = priority;
        this.f879f = destructAfterMillisec;
        this.f877d = 0;
    }

    public final void c(Runnable runnable) {
        synchronized (this.f874a) {
            if (this.f875b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.f880g);
                this.f875b = handlerThread;
                handlerThread.start();
                this.f876c = new Handler(this.f875b.getLooper(), this.f878e);
                this.f877d++;
            }
            this.f876c.removeMessages(0);
            this.f876c.sendMessage(this.f876c.obtainMessage(1, runnable));
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Callable f882b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Handler f883c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f884d;

        public b(c this$0, Callable callable, Handler handler, d dVar) {
            this.f882b = callable;
            this.f883c = handler;
            this.f884d = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f882b.call();
            } catch (Exception e2) {
                obj = null;
            }
            this.f883c.post(new a(obj));
        }

        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Object f885b;

            public a(Object obj) {
                this.f885b = obj;
            }

            public void run() {
                b.this.f884d.a(this.f885b);
            }
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int timeoutMillis) {
        ReentrantLock lock = new ReentrantLock();
        Condition cond = lock.newCondition();
        AtomicReference<T> holder = new AtomicReference<>();
        AtomicBoolean running = new AtomicBoolean(true);
        c(new RunnableC0020c(this, holder, callable, lock, running, cond));
        lock.lock();
        try {
            if (!running.get()) {
                return holder.get();
            }
            long remaining = TimeUnit.MILLISECONDS.toNanos((long) timeoutMillis);
            do {
                try {
                    remaining = cond.awaitNanos(remaining);
                } catch (InterruptedException e2) {
                }
                if (!running.get()) {
                    T t = holder.get();
                    lock.unlock();
                    return t;
                }
            } while (remaining > 0);
            throw new InterruptedException("timeout");
        } finally {
            lock.unlock();
        }
    }

    /* renamed from: a.h.j.c$c  reason: collision with other inner class name */
    public class RunnableC0020c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f887b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Callable f888c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f889d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f890e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Condition f891f;

        public RunnableC0020c(c this$0, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f887b = atomicReference;
            this.f888c = callable;
            this.f889d = reentrantLock;
            this.f890e = atomicBoolean;
            this.f891f = condition;
        }

        public void run() {
            try {
                this.f887b.set(this.f888c.call());
            } catch (Exception e2) {
            }
            this.f889d.lock();
            try {
                this.f890e.set(false);
                this.f891f.signal();
            } finally {
                this.f889d.unlock();
            }
        }
    }

    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f874a) {
            this.f876c.removeMessages(0);
            this.f876c.sendMessageDelayed(this.f876c.obtainMessage(0), (long) this.f879f);
        }
    }

    public void a() {
        synchronized (this.f874a) {
            if (!this.f876c.hasMessages(1)) {
                this.f875b.quit();
                this.f875b = null;
                this.f876c = null;
            }
        }
    }
}
