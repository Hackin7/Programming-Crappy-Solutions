package p000;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: nn */
final class C0773nn implements C0761ne {

    /* renamed from: a */
    public final C0758nc f3291a = new C0758nc();

    /* renamed from: b */
    public final C0778ns f3292b;

    /* renamed from: c */
    boolean f3293c;

    C0773nn(C0778ns nsVar) {
        if (nsVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f3292b = nsVar;
    }

    /* renamed from: a */
    private long m2535a(byte b, long j, long j2) {
        if (this.f3293c) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(0), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long a = this.f3291a.mo2607a(b, j, j2);
                if (a != -1) {
                    return a;
                }
                long j3 = this.f3291a.f3257b;
                if (j3 >= j2 || this.f3292b.mo2414a(this.f3291a, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j3);
            }
            return -1;
        }
    }

    /* renamed from: b */
    private boolean m2536b(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f3293c) {
            throw new IllegalStateException("closed");
        } else {
            while (this.f3291a.f3257b < j) {
                if (this.f3292b.mo2414a(this.f3291a, 8192) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final long mo2414a(C0758nc ncVar, long j) {
        if (ncVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f3293c) {
            throw new IllegalStateException("closed");
        } else if (this.f3291a.f3257b == 0 && this.f3292b.mo2414a(this.f3291a, 8192) == -1) {
            return -1;
        } else {
            return this.f3291a.mo2414a(ncVar, Math.min(j, this.f3291a.f3257b));
        }
    }

    /* renamed from: a */
    public final C0779nt mo2415a() {
        return this.f3292b.mo2415a();
    }

    /* renamed from: a */
    public final void mo2615a(long j) {
        if (!m2536b(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public final void mo2616a(byte[] bArr) {
        try {
            mo2615a((long) bArr.length);
            this.f3291a.mo2616a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f3291a.f3257b > 0) {
                int a = this.f3291a.mo2606a(bArr, i, (int) this.f3291a.f3257b);
                if (a == -1) {
                    throw new AssertionError();
                }
                i += a;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public final C0758nc mo2618b() {
        return this.f3291a;
    }

    /* renamed from: b */
    public final void mo2624b(C0758nc ncVar, long j) {
        try {
            mo2615a(j);
            this.f3291a.mo2624b(ncVar, j);
        } catch (EOFException e) {
            ncVar.mo2608a((C0778ns) this.f3291a);
            throw e;
        }
    }

    /* renamed from: c */
    public final C0762nf mo2629c(long j) {
        mo2615a(j);
        return this.f3291a.mo2629c(j);
    }

    public final void close() {
        if (!this.f3293c) {
            this.f3293c = true;
            this.f3292b.close();
            this.f3291a.mo2660q();
        }
    }

    /* renamed from: d */
    public final String mo2631d(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("limit < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a = m2535a(10, 0, j2);
        if (a != -1) {
            return this.f3291a.mo2635e(a);
        }
        if (j2 < Long.MAX_VALUE && m2536b(j2) && this.f3291a.mo2617b(j2 - 1) == 13 && m2536b(1 + j2) && this.f3291a.mo2617b(j2) == 10) {
            return this.f3291a.mo2635e(j2);
        }
        C0758nc ncVar = new C0758nc();
        this.f3291a.mo2613a(ncVar, 0, Math.min(32, this.f3291a.f3257b));
        StringBuilder sb2 = new StringBuilder("\\n not found: limit=");
        sb2.append(Math.min(this.f3291a.f3257b, j));
        sb2.append(" content=");
        sb2.append(ncVar.mo2656m().mo2678e());
        sb2.append(8230);
        throw new EOFException(sb2.toString());
    }

    /* renamed from: d */
    public final boolean mo2633d() {
        if (!this.f3293c) {
            return this.f3291a.mo2633d() && this.f3292b.mo2414a(this.f3291a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public final byte mo2638f() {
        mo2615a(1);
        return this.f3291a.mo2638f();
    }

    /* renamed from: f */
    public final byte[] mo2640f(long j) {
        mo2615a(j);
        return this.f3291a.mo2640f(j);
    }

    /* renamed from: g */
    public final short mo2642g() {
        mo2615a(2);
        return this.f3291a.mo2642g();
    }

    /* renamed from: g */
    public final void mo2643g(long j) {
        if (this.f3293c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f3291a.f3257b == 0 && this.f3292b.mo2414a(this.f3291a, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f3291a.f3257b);
            this.f3291a.mo2643g(min);
            j -= min;
        }
    }

    /* renamed from: h */
    public final int mo2644h() {
        mo2615a(4);
        return this.f3291a.mo2644h();
    }

    /* renamed from: i */
    public final long mo2648i() {
        mo2615a(8);
        return this.f3291a.mo2648i();
    }

    public final boolean isOpen() {
        return !this.f3293c;
    }

    /* renamed from: j */
    public final short mo2652j() {
        mo2615a(2);
        return C0781nu.m2595a(this.f3291a.mo2642g());
    }

    /* renamed from: k */
    public final int mo2653k() {
        mo2615a(4);
        return C0781nu.m2594a(this.f3291a.mo2644h());
    }

    /* renamed from: l */
    public final long mo2655l() {
        mo2615a(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!m2536b((long) i2)) {
                break;
            }
            byte b = this.f3291a.mo2617b((long) i);
            if ((b >= 48 && b <= 57) || ((b >= 97 && b <= 102) || (b >= 65 && b <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(b)}));
            }
        }
        return this.f3291a.mo2655l();
    }

    /* renamed from: o */
    public final String mo2658o() {
        return mo2631d(Long.MAX_VALUE);
    }

    /* renamed from: r */
    public final long mo2661r() {
        return m2535a(0, 0, Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        if (this.f3291a.f3257b == 0 && this.f3292b.mo2414a(this.f3291a, 8192) == -1) {
            return -1;
        }
        return this.f3291a.read(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.f3292b);
        sb.append(")");
        return sb.toString();
    }
}
