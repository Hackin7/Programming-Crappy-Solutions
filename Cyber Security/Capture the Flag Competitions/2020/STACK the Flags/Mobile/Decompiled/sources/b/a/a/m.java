package b.a.a;

import android.os.Handler;
import android.os.Looper;
import b.a.a.x.d;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieResult;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class m<T> {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f1942e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final Set<h<T>> f1943a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<h<Throwable>> f1944b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f1945c;

    /* renamed from: d  reason: collision with root package name */
    public volatile l<T> f1946d;

    public m(Callable<l<T>> callable) {
        this(callable, false);
    }

    public m(Callable<l<T>> callable, boolean runNow) {
        this.f1943a = new LinkedHashSet(1);
        this.f1944b = new LinkedHashSet(1);
        this.f1945c = new Handler(Looper.getMainLooper());
        this.f1946d = null;
        if (runNow) {
            try {
                l(callable.call());
            } catch (Throwable e2) {
                l(new l<>(e2));
            }
        } else {
            f1942e.execute(new b(callable));
        }
    }

    public final void l(l<T> lVar) {
        if (this.f1946d == null) {
            this.f1946d = lVar;
            h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized m<T> f(h<T> hVar) {
        if (!(this.f1946d == null || this.f1946d.b() == null)) {
            hVar.a(this.f1946d.b());
        }
        this.f1943a.add(hVar);
        return this;
    }

    public synchronized m<T> k(h<T> hVar) {
        this.f1943a.remove(hVar);
        return this;
    }

    public synchronized m<T> e(h<Throwable> hVar) {
        if (!(this.f1946d == null || this.f1946d.a() == null)) {
            hVar.a(this.f1946d.a());
        }
        this.f1944b.add(hVar);
        return this;
    }

    public synchronized m<T> j(h<Throwable> hVar) {
        this.f1944b.remove(hVar);
        return this;
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (m.this.f1946d != null) {
                LottieResult<T> result = m.this.f1946d;
                if (result.b() != null) {
                    m.this.i(result.b());
                } else {
                    m.this.g(result.a());
                }
            }
        }
    }

    public final void h() {
        this.f1945c.post(new a());
    }

    public final synchronized void i(T value) {
        for (LottieListener<T> l : new ArrayList<>(this.f1943a)) {
            l.a(value);
        }
    }

    public final synchronized void g(Throwable e2) {
        List<LottieListener<Throwable>> listenersCopy = new ArrayList<>(this.f1944b);
        if (listenersCopy.isEmpty()) {
            d.d("Lottie encountered an error but no failure listener was added:", e2);
            return;
        }
        for (LottieListener<Throwable> l : listenersCopy) {
            l.a(e2);
        }
    }

    public class b extends FutureTask<l<T>> {
        public b(Callable<l<T>> callable) {
            super(callable);
        }

        public void done() {
            if (!isCancelled()) {
                try {
                    m.this.l((l) get());
                } catch (InterruptedException | ExecutionException e2) {
                    m.this.l(new l((Throwable) e2));
                }
            }
        }
    }
}
