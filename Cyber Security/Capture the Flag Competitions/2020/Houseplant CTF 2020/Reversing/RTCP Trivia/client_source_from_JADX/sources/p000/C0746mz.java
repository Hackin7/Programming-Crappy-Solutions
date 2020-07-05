package p000;

import java.io.IOException;
import java.util.Random;

/* renamed from: mz */
final class C0746mz {

    /* renamed from: a */
    final boolean f3186a;

    /* renamed from: b */
    final Random f3187b;

    /* renamed from: c */
    final C0760nd f3188c;

    /* renamed from: d */
    final C0758nc f3189d;

    /* renamed from: e */
    boolean f3190e;

    /* renamed from: f */
    final C0758nc f3191f = new C0758nc();

    /* renamed from: g */
    final C0747a f3192g = new C0747a();

    /* renamed from: h */
    boolean f3193h;

    /* renamed from: i */
    private final byte[] f3194i;

    /* renamed from: j */
    private final C0759a f3195j;

    /* renamed from: mz$a */
    final class C0747a implements C0777nr {

        /* renamed from: a */
        int f3196a;

        /* renamed from: b */
        long f3197b;

        /* renamed from: c */
        boolean f3198c;

        /* renamed from: d */
        boolean f3199d;

        C0747a() {
        }

        /* renamed from: a */
        public final C0779nt mo2465a() {
            return C0746mz.this.f3188c.mo2465a();
        }

        /* renamed from: a_ */
        public final void mo2450a_(C0758nc ncVar, long j) {
            if (this.f3199d) {
                throw new IOException("closed");
            }
            C0746mz.this.f3191f.mo2450a_(ncVar, j);
            boolean z = this.f3198c && this.f3197b != -1 && C0746mz.this.f3191f.f3257b > this.f3197b - 8192;
            long e = C0746mz.this.f3191f.mo2634e();
            if (e > 0 && !z) {
                C0746mz.this.mo2581a(this.f3196a, e, this.f3198c, false);
                this.f3198c = false;
            }
        }

        public final void close() {
            if (this.f3199d) {
                throw new IOException("closed");
            }
            C0746mz.this.mo2581a(this.f3196a, C0746mz.this.f3191f.f3257b, this.f3198c, true);
            this.f3199d = true;
            C0746mz.this.f3193h = false;
        }

        public final void flush() {
            if (this.f3199d) {
                throw new IOException("closed");
            }
            C0746mz.this.mo2581a(this.f3196a, C0746mz.this.f3191f.f3257b, this.f3198c, false);
            this.f3198c = false;
        }
    }

    C0746mz(boolean z, C0760nd ndVar, Random random) {
        if (ndVar == null) {
            throw new NullPointerException("sink == null");
        } else if (random == null) {
            throw new NullPointerException("random == null");
        } else {
            this.f3186a = z;
            this.f3188c = ndVar;
            this.f3189d = ndVar.mo2618b();
            this.f3187b = random;
            C0759a aVar = null;
            this.f3194i = z ? new byte[4] : null;
            if (z) {
                aVar = new C0759a();
            }
            this.f3195j = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2581a(int i, long j, boolean z, boolean z2) {
        if (this.f3190e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f3189d.mo2646h(i);
        if (this.f3186a) {
            i2 = 128;
        }
        if (j <= 125) {
            this.f3189d.mo2646h(((int) j) | i2);
        } else if (j <= 65535) {
            this.f3189d.mo2646h(i2 | 126);
            this.f3189d.mo2641g((int) j);
        } else {
            this.f3189d.mo2646h(i2 | 127);
            C0758nc ncVar = this.f3189d;
            C0774no e = ncVar.mo2636e(8);
            byte[] bArr = e.f3294a;
            int i3 = e.f3296c;
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >>> 56) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) ((j >>> 48) & 255));
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((int) ((j >>> 40) & 255));
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((int) ((j >>> 32) & 255));
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((int) ((j >>> 24) & 255));
            int i9 = i8 + 1;
            bArr[i8] = (byte) ((int) ((j >>> 16) & 255));
            int i10 = i9 + 1;
            bArr[i9] = (byte) ((int) ((j >>> 8) & 255));
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((int) (j & 255));
            e.f3296c = i11;
            ncVar.f3257b += 8;
        }
        if (this.f3186a) {
            this.f3187b.nextBytes(this.f3194i);
            this.f3189d.mo2627c(this.f3194i);
            if (j > 0) {
                long j2 = this.f3189d.f3257b;
                this.f3189d.mo2450a_(this.f3191f, j);
                this.f3189d.mo2609a(this.f3195j);
                this.f3195j.mo2666a(j2);
                C0743mx.m2312a(this.f3195j, this.f3194i);
                this.f3195j.close();
            }
        } else {
            this.f3189d.mo2450a_(this.f3191f, j);
        }
        this.f3188c.mo2626c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2582a(int i, C0762nf nfVar) {
        if (this.f3190e) {
            throw new IOException("closed");
        }
        int g = nfVar.mo2681g();
        if (((long) g) > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f3189d.mo2646h(i | 128);
        if (this.f3186a) {
            this.f3189d.mo2646h(g | 128);
            this.f3187b.nextBytes(this.f3194i);
            this.f3189d.mo2627c(this.f3194i);
            if (g > 0) {
                long j = this.f3189d.f3257b;
                this.f3189d.mo2623b(nfVar);
                this.f3189d.mo2609a(this.f3195j);
                this.f3195j.mo2666a(j);
                C0743mx.m2312a(this.f3195j, this.f3194i);
                this.f3195j.close();
            }
        } else {
            this.f3189d.mo2646h(g);
            this.f3189d.mo2623b(nfVar);
        }
        this.f3188c.flush();
    }
}
