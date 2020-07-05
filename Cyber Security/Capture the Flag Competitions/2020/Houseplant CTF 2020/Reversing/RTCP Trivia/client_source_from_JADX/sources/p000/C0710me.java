package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: me */
public final class C0710me implements Closeable {

    /* renamed from: c */
    private static final Logger f3078c = Logger.getLogger(C0683lz.class.getName());

    /* renamed from: a */
    int f3079a = 16384;

    /* renamed from: b */
    final C0682b f3080b = new C0682b(this.f3083f);

    /* renamed from: d */
    private final C0760nd f3081d;

    /* renamed from: e */
    private final boolean f3082e;

    /* renamed from: f */
    private final C0758nc f3083f = new C0758nc();

    /* renamed from: g */
    private boolean f3084g;

    C0710me(C0760nd ndVar, boolean z) {
        this.f3081d = ndVar;
        this.f3082e = z;
    }

    /* renamed from: a */
    private void m2206a(int i, int i2, byte b, byte b2) {
        if (f3078c.isLoggable(Level.FINE)) {
            f3078c.fine(C0683lz.m2116a(false, i, i2, b, b2));
        }
        if (i2 > this.f3079a) {
            throw C0683lz.m2115a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f3079a), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) != 0) {
            throw C0683lz.m2115a("reserved bit set: %s", Integer.valueOf(i));
        } else {
            C0760nd ndVar = this.f3081d;
            ndVar.mo2646h((i2 >>> 16) & 255);
            ndVar.mo2646h((i2 >>> 8) & 255);
            ndVar.mo2646h(i2 & 255);
            this.f3081d.mo2646h(b & 255);
            this.f3081d.mo2646h(b2 & 255);
            this.f3081d.mo2639f(i & Integer.MAX_VALUE);
        }
    }

    /* renamed from: b */
    private void m2207b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f3079a, j);
            long j2 = (long) min;
            j -= j2;
            m2206a(i, min, 9, j == 0 ? (byte) 4 : 0);
            this.f3081d.mo2450a_(this.f3083f, j2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo2518a() {
        if (this.f3084g) {
            throw new IOException("closed");
        } else if (this.f3082e) {
            if (f3078c.isLoggable(Level.FINE)) {
                f3078c.fine(C0633kv.m1966a(">> CONNECTION %s", C0683lz.f2946a.mo2678e()));
            }
            this.f3081d.mo2627c(C0683lz.f2946a.mo2682h());
            this.f3081d.flush();
        }
    }

    /* renamed from: a */
    public final synchronized void mo2519a(int i, long j) {
        if (this.f3084g) {
            throw new IOException("closed");
        }
        if (j != 0) {
            if (j <= 2147483647L) {
                m2206a(i, 4, 8, 0);
                this.f3081d.mo2639f((int) j);
                this.f3081d.flush();
            }
        }
        throw C0683lz.m2115a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
    }

    /* renamed from: a */
    public final synchronized void mo2520a(int i, C0678lw lwVar) {
        if (this.f3084g) {
            throw new IOException("closed");
        } else if (lwVar.f2916l == -1) {
            throw new IllegalArgumentException();
        } else {
            m2206a(i, 4, 3, 0);
            this.f3081d.mo2639f(lwVar.f2916l);
            this.f3081d.flush();
        }
    }

    /* renamed from: a */
    public final synchronized void mo2521a(int i, C0678lw lwVar, byte[] bArr) {
        if (this.f3084g) {
            throw new IOException("closed");
        } else if (lwVar.f2916l == -1) {
            throw C0683lz.m2115a("errorCode.httpCode == -1", new Object[0]);
        } else {
            m2206a(0, 8 + bArr.length, 7, 0);
            this.f3081d.mo2639f(i);
            this.f3081d.mo2639f(lwVar.f2916l);
            if (bArr.length > 0) {
                this.f3081d.mo2627c(bArr);
            }
            this.f3081d.flush();
        }
    }

    /* renamed from: a */
    public final synchronized void mo2522a(C0715mh mhVar) {
        if (this.f3084g) {
            throw new IOException("closed");
        }
        int i = this.f3079a;
        if ((32 & mhVar.f3093a) != 0) {
            i = mhVar.f3094b[5];
        }
        this.f3079a = i;
        if (mhVar.mo2533a() != -1) {
            this.f3080b.mo2477a(mhVar.mo2533a());
        }
        m2206a(0, 0, 4, 1);
        this.f3081d.flush();
    }

    /* renamed from: a */
    public final synchronized void mo2523a(boolean z, int i, int i2) {
        if (this.f3084g) {
            throw new IOException("closed");
        }
        m2206a(0, 8, 6, z ? (byte) 1 : 0);
        this.f3081d.mo2639f(i);
        this.f3081d.mo2639f(i2);
        this.f3081d.flush();
    }

    /* renamed from: a */
    public final synchronized void mo2524a(boolean z, int i, List<C0679lx> list) {
        if (this.f3084g) {
            throw new IOException("closed");
        } else if (this.f3084g) {
            throw new IOException("closed");
        } else {
            this.f3080b.mo2478a(list);
            long j = this.f3083f.f3257b;
            int min = (int) Math.min((long) this.f3079a, j);
            long j2 = (long) min;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            byte b = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m2206a(i, min, 1, b);
            this.f3081d.mo2450a_(this.f3083f, j2);
            if (i2 > 0) {
                m2207b(i, j - j2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo2525a(boolean z, int i, C0758nc ncVar, int i2) {
        if (this.f3084g) {
            throw new IOException("closed");
        }
        m2206a(i, i2, 0, z ? (byte) 1 : 0);
        if (i2 > 0) {
            this.f3081d.mo2450a_(ncVar, (long) i2);
        }
    }

    /* renamed from: b */
    public final synchronized void mo2526b() {
        if (this.f3084g) {
            throw new IOException("closed");
        }
        this.f3081d.flush();
    }

    /* renamed from: b */
    public final synchronized void mo2527b(C0715mh mhVar) {
        if (this.f3084g) {
            throw new IOException("closed");
        }
        int i = 0;
        m2206a(0, Integer.bitCount(mhVar.f3093a) * 6, 4, 0);
        while (i < 10) {
            if (mhVar.mo2535a(i)) {
                int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                this.f3081d.mo2641g(i2);
                this.f3081d.mo2639f(mhVar.f3094b[i]);
            }
            i++;
        }
        this.f3081d.flush();
    }

    public final synchronized void close() {
        this.f3084g = true;
        this.f3081d.close();
    }
}
