package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: nt */
public class C0779nt {

    /* renamed from: c */
    public static final C0779nt f3305c = new C0779nt() {
        /* renamed from: a */
        public final C0779nt mo2687a(long j) {
            return this;
        }

        /* renamed from: a */
        public final C0779nt mo2688a(long j, TimeUnit timeUnit) {
            return this;
        }

        /* renamed from: f */
        public final void mo2693f() {
        }
    };

    /* renamed from: a */
    private boolean f3306a;

    /* renamed from: b */
    private long f3307b;

    /* renamed from: d */
    private long f3308d;

    /* renamed from: a */
    public C0779nt mo2687a(long j) {
        this.f3306a = true;
        this.f3307b = j;
        return this;
    }

    /* renamed from: a */
    public C0779nt mo2688a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            this.f3308d = timeUnit.toNanos(j);
            return this;
        }
    }

    /* renamed from: c */
    public long mo2689c() {
        if (this.f3306a) {
            return this.f3307b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C0779nt mo2690d() {
        this.f3308d = 0;
        return this;
    }

    /* renamed from: d_ */
    public long mo2691d_() {
        return this.f3308d;
    }

    /* renamed from: e_ */
    public boolean mo2692e_() {
        return this.f3306a;
    }

    /* renamed from: f */
    public void mo2693f() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f3306a && this.f3307b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: f_ */
    public C0779nt mo2694f_() {
        this.f3306a = false;
        return this;
    }
}
