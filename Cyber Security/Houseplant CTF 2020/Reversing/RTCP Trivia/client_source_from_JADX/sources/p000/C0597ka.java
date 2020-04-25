package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: ka */
public final class C0597ka {

    /* renamed from: a */
    private int f2563a = 64;

    /* renamed from: b */
    private int f2564b = 5;
    @Nullable

    /* renamed from: c */
    private Runnable f2565c;
    @Nullable

    /* renamed from: d */
    private ExecutorService f2566d;

    /* renamed from: e */
    private final Deque<C0618a> f2567e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C0618a> f2568f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C0617kk> f2569g = new ArrayDeque();

    /* renamed from: a */
    private synchronized ExecutorService m1813a() {
        if (this.f2566d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0633kv.m1970a("OkHttp Dispatcher", false));
            this.f2566d = threadPoolExecutor;
        }
        return this.f2566d;
    }

    /* renamed from: b */
    private void m1814b() {
        if (this.f2568f.size() < this.f2563a && !this.f2567e.isEmpty()) {
            Iterator it = this.f2567e.iterator();
            while (it.hasNext()) {
                C0618a aVar = (C0618a) it.next();
                if (m1816c(aVar) < this.f2564b) {
                    it.remove();
                    this.f2568f.add(aVar);
                    m1813a().execute(aVar);
                }
                if (this.f2568f.size() >= this.f2563a) {
                    break;
                }
            }
        }
    }

    /* renamed from: c */
    private synchronized int m1815c() {
        return this.f2568f.size() + this.f2569g.size();
    }

    /* renamed from: c */
    private int m1816c(C0618a aVar) {
        int i = 0;
        for (C0618a aVar2 : this.f2568f) {
            if (!C0617kk.this.f2673e && aVar2.mo2373a().equals(aVar.mo2373a())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo2316a(C0618a aVar) {
        if (this.f2568f.size() >= this.f2563a || m1816c(aVar) >= this.f2564b) {
            this.f2567e.add(aVar);
            return;
        }
        this.f2568f.add(aVar);
        m1813a().execute(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2317b(C0618a aVar) {
        int c;
        Runnable runnable;
        Deque<C0618a> deque = this.f2568f;
        synchronized (this) {
            if (!deque.remove(aVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            m1814b();
            c = m1815c();
            runnable = this.f2565c;
        }
        if (c == 0 && runnable != null) {
            runnable.run();
        }
    }
}
