package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: nj */
public final class C0766nj implements C0778ns {

    /* renamed from: a */
    private int f3273a = 0;

    /* renamed from: b */
    private final C0761ne f3274b;

    /* renamed from: c */
    private final Inflater f3275c;

    /* renamed from: d */
    private final C0767nk f3276d;

    /* renamed from: e */
    private final CRC32 f3277e = new CRC32();

    public C0766nj(C0778ns nsVar) {
        if (nsVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f3275c = new Inflater(true);
        this.f3274b = C0768nl.m2508a(nsVar);
        this.f3276d = new C0767nk(this.f3274b, this.f3275c);
    }

    /* renamed from: a */
    private static void m2500a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    private void m2501a(C0758nc ncVar, long j, long j2) {
        C0774no noVar = ncVar.f3256a;
        while (j >= ((long) (noVar.f3296c - noVar.f3295b))) {
            j -= (long) (noVar.f3296c - noVar.f3295b);
            noVar = noVar.f3299f;
        }
        while (j2 > 0) {
            int i = (int) (((long) noVar.f3295b) + j);
            int min = (int) Math.min((long) (noVar.f3296c - i), j2);
            this.f3277e.update(noVar.f3294a, i, min);
            j2 -= (long) min;
            noVar = noVar.f3299f;
            j = 0;
        }
    }

    /* renamed from: a */
    public final long mo2414a(C0758nc ncVar, long j) {
        long j2;
        C0758nc ncVar2 = ncVar;
        long j3 = j;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f3273a == 0) {
                this.f3274b.mo2615a(10);
                byte b = this.f3274b.mo2618b().mo2617b(3);
                boolean z = ((b >> 1) & 1) == 1;
                if (z) {
                    m2501a(this.f3274b.mo2618b(), 0, 10);
                }
                m2500a("ID1ID2", 8075, (int) this.f3274b.mo2642g());
                this.f3274b.mo2643g(8);
                if (((b >> 2) & 1) == 1) {
                    this.f3274b.mo2615a(2);
                    if (z) {
                        m2501a(this.f3274b.mo2618b(), 0, 2);
                    }
                    long j4 = (long) this.f3274b.mo2618b().mo2652j();
                    this.f3274b.mo2615a(j4);
                    if (z) {
                        j2 = j4;
                        m2501a(this.f3274b.mo2618b(), 0, j4);
                    } else {
                        j2 = j4;
                    }
                    this.f3274b.mo2643g(j2);
                }
                if (((b >> 3) & 1) == 1) {
                    long r = this.f3274b.mo2661r();
                    if (r == -1) {
                        throw new EOFException();
                    }
                    if (z) {
                        m2501a(this.f3274b.mo2618b(), 0, r + 1);
                    }
                    this.f3274b.mo2643g(r + 1);
                }
                if (((b >> 4) & 1) == 1) {
                    long r2 = this.f3274b.mo2661r();
                    if (r2 == -1) {
                        throw new EOFException();
                    }
                    if (z) {
                        m2501a(this.f3274b.mo2618b(), 0, r2 + 1);
                    }
                    this.f3274b.mo2643g(r2 + 1);
                }
                if (z) {
                    m2500a("FHCRC", (int) this.f3274b.mo2652j(), (int) (short) ((int) this.f3277e.getValue()));
                    this.f3277e.reset();
                }
                this.f3273a = 1;
            }
            if (this.f3273a == 1) {
                long j5 = ncVar2.f3257b;
                long a = this.f3276d.mo2414a(ncVar2, j3);
                if (a != -1) {
                    m2501a(ncVar2, j5, a);
                    return a;
                }
                this.f3273a = 2;
            }
            if (this.f3273a == 2) {
                m2500a("CRC", this.f3274b.mo2653k(), (int) this.f3277e.getValue());
                m2500a("ISIZE", this.f3274b.mo2653k(), (int) this.f3275c.getBytesWritten());
                this.f3273a = 3;
                if (!this.f3274b.mo2633d()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final C0779nt mo2415a() {
        return this.f3274b.mo2415a();
    }

    public final void close() {
        this.f3276d.close();
    }
}
