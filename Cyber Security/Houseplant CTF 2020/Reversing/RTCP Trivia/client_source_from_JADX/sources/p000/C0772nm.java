package p000;

import java.nio.ByteBuffer;

/* renamed from: nm */
final class C0772nm implements C0760nd {

    /* renamed from: a */
    public final C0758nc f3288a = new C0758nc();

    /* renamed from: b */
    public final C0777nr f3289b;

    /* renamed from: c */
    boolean f3290c;

    C0772nm(C0777nr nrVar) {
        if (nrVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f3289b = nrVar;
    }

    /* renamed from: a */
    public final C0779nt mo2465a() {
        return this.f3289b.mo2465a();
    }

    /* renamed from: a_ */
    public final void mo2450a_(C0758nc ncVar, long j) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2450a_(ncVar, j);
        mo2663s();
    }

    /* renamed from: b */
    public final C0758nc mo2618b() {
        return this.f3288a;
    }

    /* renamed from: b */
    public final C0760nd mo2622b(String str) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2622b(str);
        return mo2663s();
    }

    /* renamed from: b */
    public final C0760nd mo2623b(C0762nf nfVar) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2623b(nfVar);
        return mo2663s();
    }

    /* renamed from: c */
    public final C0760nd mo2626c() {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        long j = this.f3288a.f3257b;
        if (j > 0) {
            this.f3289b.mo2450a_(this.f3288a, j);
        }
        return this;
    }

    /* renamed from: c */
    public final C0760nd mo2627c(byte[] bArr) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2627c(bArr);
        return mo2663s();
    }

    /* renamed from: c */
    public final C0760nd mo2628c(byte[] bArr, int i, int i2) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2628c(bArr, i, i2);
        return mo2663s();
    }

    public final void close() {
        if (!this.f3290c) {
            Throwable th = null;
            try {
                if (this.f3288a.f3257b > 0) {
                    this.f3289b.mo2450a_(this.f3288a, this.f3288a.f3257b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f3289b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f3290c = true;
            if (th != null) {
                C0781nu.m2597a(th);
            }
        }
    }

    /* renamed from: f */
    public final C0760nd mo2639f(int i) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2639f(i);
        return mo2663s();
    }

    public final void flush() {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        if (this.f3288a.f3257b > 0) {
            this.f3289b.mo2450a_(this.f3288a, this.f3288a.f3257b);
        }
        this.f3289b.flush();
    }

    /* renamed from: g */
    public final C0760nd mo2641g(int i) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2641g(i);
        return mo2663s();
    }

    /* renamed from: h */
    public final C0760nd mo2646h(int i) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2646h(i);
        return mo2663s();
    }

    public final boolean isOpen() {
        return !this.f3290c;
    }

    /* renamed from: j */
    public final C0760nd mo2651j(long j) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2651j(j);
        return mo2663s();
    }

    /* renamed from: k */
    public final C0760nd mo2654k(long j) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        this.f3288a.mo2654k(j);
        return mo2663s();
    }

    /* renamed from: s */
    public final C0760nd mo2663s() {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        long e = this.f3288a.mo2634e();
        if (e > 0) {
            this.f3289b.mo2450a_(this.f3288a, e);
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.f3289b);
        sb.append(")");
        return sb.toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (this.f3290c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f3288a.write(byteBuffer);
        mo2663s();
        return write;
    }
}
