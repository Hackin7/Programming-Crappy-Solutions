package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: nc */
public final class C0758nc implements Cloneable, ByteChannel, C0760nd, C0761ne {

    /* renamed from: c */
    private static final byte[] f3255c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: a */
    C0774no f3256a;

    /* renamed from: b */
    public long f3257b;

    /* renamed from: nc$a */
    public static final class C0759a implements Closeable {

        /* renamed from: a */
        public C0758nc f3258a;

        /* renamed from: b */
        public boolean f3259b;

        /* renamed from: c */
        public long f3260c = -1;

        /* renamed from: d */
        public byte[] f3261d;

        /* renamed from: e */
        public int f3262e = -1;

        /* renamed from: f */
        public int f3263f = -1;

        /* renamed from: g */
        private C0774no f3264g;

        /* renamed from: a */
        public final int mo2666a(long j) {
            C0774no noVar;
            long j2;
            int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i < 0 || j > this.f3258a.f3257b) {
                throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.f3258a.f3257b)}));
            } else if (i == 0 || j == this.f3258a.f3257b) {
                this.f3264g = null;
                this.f3260c = j;
                this.f3261d = null;
                this.f3262e = -1;
                this.f3263f = -1;
                return -1;
            } else {
                long j3 = 0;
                long j4 = this.f3258a.f3257b;
                C0774no noVar2 = this.f3258a.f3256a;
                C0774no noVar3 = this.f3258a.f3256a;
                if (this.f3264g != null) {
                    long j5 = this.f3260c - ((long) (this.f3262e - this.f3264g.f3295b));
                    if (j5 > j) {
                        noVar3 = this.f3264g;
                        j4 = j5;
                    } else {
                        noVar2 = this.f3264g;
                        j3 = j5;
                    }
                }
                if (j4 - j > j - j3) {
                    while (j >= ((long) (noVar.f3296c - noVar.f3295b)) + j2) {
                        j3 = j2 + ((long) (noVar.f3296c - noVar.f3295b));
                        noVar2 = noVar.f3299f;
                    }
                } else {
                    j2 = j4;
                    noVar = noVar3;
                    while (j2 > j) {
                        noVar = noVar.f3300g;
                        j2 -= (long) (noVar.f3296c - noVar.f3295b);
                    }
                }
                if (this.f3259b && noVar.f3297d) {
                    C0774no b = noVar.mo2706b();
                    if (this.f3258a.f3256a == noVar) {
                        this.f3258a.f3256a = b;
                    }
                    noVar = noVar.mo2704a(b);
                    noVar.f3300g.mo2707c();
                }
                this.f3264g = noVar;
                this.f3260c = j;
                this.f3261d = noVar.f3294a;
                this.f3262e = noVar.f3295b + ((int) (j - j2));
                this.f3263f = noVar.f3296c;
                return this.f3263f - this.f3262e;
            }
        }

        public final void close() {
            if (this.f3258a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f3258a = null;
            this.f3264g = null;
            this.f3260c = -1;
            this.f3261d = null;
            this.f3262e = -1;
            this.f3263f = -1;
        }
    }

    /* renamed from: a */
    private String m2381a(long j, Charset charset) {
        C0781nu.m2596a(this.f3257b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            C0774no noVar = this.f3256a;
            if (((long) noVar.f3295b) + j > ((long) noVar.f3296c)) {
                return new String(mo2640f(j), charset);
            }
            String str = new String(noVar.f3294a, noVar.f3295b, (int) j, charset);
            noVar.f3295b = (int) (((long) noVar.f3295b) + j);
            this.f3257b -= j;
            if (noVar.f3295b == noVar.f3296c) {
                this.f3256a = noVar.mo2707c();
                C0775np.m2563a(noVar);
            }
            return str;
        }
    }

    /* renamed from: l */
    private String m2382l(long j) {
        return m2381a(j, C0781nu.f3309a);
    }

    /* renamed from: a */
    public final int mo2606a(byte[] bArr, int i, int i2) {
        C0781nu.m2596a((long) bArr.length, (long) i, (long) i2);
        C0774no noVar = this.f3256a;
        if (noVar == null) {
            return -1;
        }
        int min = Math.min(i2, noVar.f3296c - noVar.f3295b);
        System.arraycopy(noVar.f3294a, noVar.f3295b, bArr, i, min);
        noVar.f3295b += min;
        this.f3257b -= (long) min;
        if (noVar.f3295b == noVar.f3296c) {
            this.f3256a = noVar.mo2707c();
            C0775np.m2563a(noVar);
        }
        return min;
    }

    /* renamed from: a */
    public final long mo2607a(byte b, long j, long j2) {
        long j3;
        long j4 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f3257b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        if (j2 > this.f3257b) {
            j2 = this.f3257b;
        }
        if (j == j2) {
            return -1;
        }
        C0774no noVar = this.f3256a;
        if (noVar == null) {
            return -1;
        }
        if (this.f3257b - j >= j) {
            while (true) {
                long j5 = ((long) (noVar.f3296c - noVar.f3295b)) + j3;
                if (j5 >= j) {
                    break;
                }
                noVar = noVar.f3299f;
                j4 = j5;
            }
        } else {
            j3 = this.f3257b;
            while (j3 > j) {
                noVar = noVar.f3300g;
                j3 -= (long) (noVar.f3296c - noVar.f3295b);
            }
        }
        while (j3 < j2) {
            byte[] bArr = noVar.f3294a;
            int min = (int) Math.min((long) noVar.f3296c, (((long) noVar.f3295b) + j2) - j3);
            for (int i = (int) ((((long) noVar.f3295b) + j) - j3); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - noVar.f3295b)) + j3;
                }
            }
            j = ((long) (noVar.f3296c - noVar.f3295b)) + j3;
            noVar = noVar.f3299f;
            j3 = j;
        }
        return -1;
    }

    /* renamed from: a */
    public final long mo2414a(C0758nc ncVar, long j) {
        if (ncVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f3257b == 0) {
            return -1;
        } else {
            if (j > this.f3257b) {
                j = this.f3257b;
            }
            ncVar.mo2450a_(this, j);
            return j;
        }
    }

    /* renamed from: a */
    public final long mo2608a(C0778ns nsVar) {
        if (nsVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a = nsVar.mo2414a(this, 8192);
            if (a == -1) {
                return j;
            }
            j += a;
        }
    }

    /* renamed from: a */
    public final C0759a mo2609a(C0759a aVar) {
        if (aVar.f3258a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f3258a = this;
        aVar.f3259b = true;
        return aVar;
    }

    /* renamed from: a */
    public final C0758nc mo2610a(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        mo2646h(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    mo2646h((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected code point: ");
                    sb.append(Integer.toHexString(i));
                    throw new IllegalArgumentException(sb.toString());
                }
                mo2646h(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            mo2646h(i3);
            i = (i & 63) | 128;
        }
        mo2646h(i);
        return this;
    }

    /* renamed from: a */
    public final C0758nc mo2622b(String str) {
        return mo2612a(str, 0, str.length());
    }

    /* renamed from: a */
    public final C0758nc mo2612a(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 > str.length()) {
            StringBuilder sb3 = new StringBuilder("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        } else {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C0774no e = mo2636e(1);
                    byte[] bArr = e.f3294a;
                    int i4 = e.f3296c - i;
                    int min = Math.min(i2, 8192 - i4);
                    int i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (true) {
                        i = i5;
                        if (i >= min) {
                            break;
                        }
                        char charAt2 = str.charAt(i);
                        if (charAt2 >= 128) {
                            break;
                        }
                        i5 = i + 1;
                        bArr[i + i4] = (byte) charAt2;
                    }
                    int i6 = (i4 + i) - e.f3296c;
                    e.f3296c += i6;
                    this.f3257b += (long) i6;
                } else {
                    if (charAt < 2048) {
                        i3 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo2646h((charAt >> 12) | 224);
                        i3 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            mo2646h(63);
                            i = i7;
                        } else {
                            int i8 = 0 + (((charAt & 10239) << 10) | (9215 & charAt3));
                            mo2646h((i8 >> 18) | 240);
                            mo2646h(((i8 >> 12) & 63) | 128);
                            mo2646h(((i8 >> 6) & 63) | 128);
                            mo2646h((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    mo2646h(i3);
                    mo2646h((int) (charAt & '?') | 128);
                    i++;
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    public final C0758nc mo2613a(C0758nc ncVar, long j, long j2) {
        if (ncVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        C0781nu.m2596a(this.f3257b, j, j2);
        if (j2 == 0) {
            return this;
        }
        ncVar.f3257b += j2;
        C0774no noVar = this.f3256a;
        while (j >= ((long) (noVar.f3296c - noVar.f3295b))) {
            j -= (long) (noVar.f3296c - noVar.f3295b);
            noVar = noVar.f3299f;
        }
        while (j2 > 0) {
            C0774no a = noVar.mo2703a();
            a.f3295b = (int) (((long) a.f3295b) + j);
            a.f3296c = Math.min(a.f3295b + ((int) j2), a.f3296c);
            if (ncVar.f3256a == null) {
                a.f3300g = a;
                a.f3299f = a;
                ncVar.f3256a = a;
            } else {
                ncVar.f3256a.f3300g.mo2704a(a);
            }
            j2 -= (long) (a.f3296c - a.f3295b);
            noVar = noVar.f3299f;
            j = 0;
        }
        return this;
    }

    /* renamed from: a */
    public final C0758nc mo2623b(C0762nf nfVar) {
        if (nfVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        nfVar.mo2671a(this);
        return this;
    }

    /* renamed from: a */
    public final C0779nt mo2465a() {
        return C0779nt.f3305c;
    }

    /* renamed from: a */
    public final void mo2615a(long j) {
        if (this.f3257b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public final void mo2616a(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a = mo2606a(bArr, i, bArr.length - i);
            if (a == -1) {
                throw new EOFException();
            }
            i += a;
        }
    }

    /* renamed from: a_ */
    public final void mo2450a_(C0758nc ncVar, long j) {
        C0774no noVar;
        if (ncVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (ncVar == this) {
            throw new IllegalArgumentException("source == this");
        } else {
            C0781nu.m2596a(ncVar.f3257b, 0, j);
            while (j > 0) {
                int i = 0;
                if (j < ((long) (ncVar.f3256a.f3296c - ncVar.f3256a.f3295b))) {
                    C0774no noVar2 = this.f3256a != null ? this.f3256a.f3300g : null;
                    if (noVar2 != null && noVar2.f3298e) {
                        if ((((long) noVar2.f3296c) + j) - ((long) (noVar2.f3297d ? 0 : noVar2.f3295b)) <= 8192) {
                            ncVar.f3256a.mo2705a(noVar2, (int) j);
                            ncVar.f3257b -= j;
                            this.f3257b += j;
                            return;
                        }
                    }
                    C0774no noVar3 = ncVar.f3256a;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > noVar3.f3296c - noVar3.f3295b) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= 1024) {
                        noVar = noVar3.mo2703a();
                    } else {
                        noVar = C0775np.m2562a();
                        System.arraycopy(noVar3.f3294a, noVar3.f3295b, noVar.f3294a, 0, i2);
                    }
                    noVar.f3296c = noVar.f3295b + i2;
                    noVar3.f3295b += i2;
                    noVar3.f3300g.mo2704a(noVar);
                    ncVar.f3256a = noVar;
                }
                C0774no noVar4 = ncVar.f3256a;
                long j2 = (long) (noVar4.f3296c - noVar4.f3295b);
                ncVar.f3256a = noVar4.mo2707c();
                if (this.f3256a == null) {
                    this.f3256a = noVar4;
                    C0774no noVar5 = this.f3256a;
                    C0774no noVar6 = this.f3256a;
                    C0774no noVar7 = this.f3256a;
                    noVar6.f3300g = noVar7;
                    noVar5.f3299f = noVar7;
                } else {
                    C0774no a = this.f3256a.f3300g.mo2704a(noVar4);
                    if (a.f3300g == a) {
                        throw new IllegalStateException();
                    } else if (a.f3300g.f3298e) {
                        int i3 = a.f3296c - a.f3295b;
                        int i4 = 8192 - a.f3300g.f3296c;
                        if (!a.f3300g.f3297d) {
                            i = a.f3300g.f3295b;
                        }
                        if (i3 <= i4 + i) {
                            a.mo2705a(a.f3300g, i3);
                            a.mo2707c();
                            C0775np.m2563a(a);
                        }
                    }
                }
                ncVar.f3257b -= j2;
                this.f3257b += j2;
                j -= j2;
            }
        }
    }

    /* renamed from: b */
    public final byte mo2617b(long j) {
        C0781nu.m2596a(this.f3257b, j, 1);
        if (this.f3257b - j > j) {
            C0774no noVar = this.f3256a;
            while (true) {
                long j2 = (long) (noVar.f3296c - noVar.f3295b);
                if (j < j2) {
                    return noVar.f3294a[noVar.f3295b + ((int) j)];
                }
                j -= j2;
                noVar = noVar.f3299f;
            }
        } else {
            long j3 = j - this.f3257b;
            C0774no noVar2 = this.f3256a;
            do {
                noVar2 = noVar2.f3300g;
                j3 += (long) (noVar2.f3296c - noVar2.f3295b);
            } while (j3 < 0);
            return noVar2.f3294a[noVar2.f3295b + ((int) j3)];
        }
    }

    /* renamed from: b */
    public final C0758nc mo2618b() {
        return this;
    }

    /* renamed from: b */
    public final C0758nc mo2646h(int i) {
        C0774no e = mo2636e(1);
        byte[] bArr = e.f3294a;
        int i2 = e.f3296c;
        e.f3296c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f3257b++;
        return this;
    }

    /* renamed from: b */
    public final C0758nc mo2627c(byte[] bArr) {
        if (bArr != null) {
            return mo2628c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public final C0758nc mo2628c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = (long) i2;
        C0781nu.m2596a((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C0774no e = mo2636e(1);
            int min = Math.min(i3 - i, 8192 - e.f3296c);
            System.arraycopy(bArr, i, e.f3294a, e.f3296c, min);
            i += min;
            e.f3296c += min;
        }
        this.f3257b += j;
        return this;
    }

    /* renamed from: b */
    public final void mo2624b(C0758nc ncVar, long j) {
        if (this.f3257b < j) {
            ncVar.mo2450a_(this, this.f3257b);
            throw new EOFException();
        } else {
            ncVar.mo2450a_(this, j);
        }
    }

    /* renamed from: c */
    public final C0758nc mo2641g(int i) {
        C0774no e = mo2636e(2);
        byte[] bArr = e.f3294a;
        int i2 = e.f3296c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        e.f3296c = i4;
        this.f3257b += 2;
        return this;
    }

    /* renamed from: c */
    public final C0760nd mo2626c() {
        return this;
    }

    /* renamed from: c */
    public final C0762nf mo2629c(long j) {
        return new C0762nf(mo2640f(j));
    }

    public final /* synthetic */ Object clone() {
        C0758nc ncVar = new C0758nc();
        if (this.f3257b == 0) {
            return ncVar;
        }
        ncVar.f3256a = this.f3256a.mo2703a();
        C0774no noVar = ncVar.f3256a;
        C0774no noVar2 = ncVar.f3256a;
        C0774no noVar3 = ncVar.f3256a;
        noVar2.f3300g = noVar3;
        noVar.f3299f = noVar3;
        C0774no noVar4 = this.f3256a;
        while (true) {
            noVar4 = noVar4.f3299f;
            if (noVar4 != this.f3256a) {
                ncVar.f3256a.f3300g.mo2704a(noVar4.mo2703a());
            } else {
                ncVar.f3257b = this.f3257b;
                return ncVar;
            }
        }
    }

    public final void close() {
    }

    /* renamed from: d */
    public final String mo2631d(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("limit < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j + 1;
        }
        long a = mo2607a(10, 0, j2);
        if (a != -1) {
            return mo2635e(a);
        }
        if (j2 < this.f3257b && mo2617b(j2 - 1) == 13 && mo2617b(j2) == 10) {
            return mo2635e(j2);
        }
        C0758nc ncVar = new C0758nc();
        mo2613a(ncVar, 0, Math.min(32, this.f3257b));
        StringBuilder sb2 = new StringBuilder("\\n not found: limit=");
        sb2.append(Math.min(this.f3257b, j));
        sb2.append(" content=");
        sb2.append(ncVar.mo2656m().mo2678e());
        sb2.append(8230);
        throw new EOFException(sb2.toString());
    }

    /* renamed from: d */
    public final C0758nc mo2639f(int i) {
        C0774no e = mo2636e(4);
        byte[] bArr = e.f3294a;
        int i2 = e.f3296c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        e.f3296c = i6;
        this.f3257b += 4;
        return this;
    }

    /* renamed from: d */
    public final boolean mo2633d() {
        return this.f3257b == 0;
    }

    /* renamed from: e */
    public final long mo2634e() {
        long j = this.f3257b;
        if (j == 0) {
            return 0;
        }
        C0774no noVar = this.f3256a.f3300g;
        if (noVar.f3296c < 8192 && noVar.f3298e) {
            j -= (long) (noVar.f3296c - noVar.f3295b);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final String mo2635e(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (mo2617b(j2) == 13) {
                String l = m2382l(j2);
                mo2643g(2);
                return l;
            }
        }
        String l2 = m2382l(j);
        mo2643g(1);
        return l2;
    }

    /* renamed from: e */
    public final C0774no mo2636e(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        } else if (this.f3256a == null) {
            this.f3256a = C0775np.m2562a();
            C0774no noVar = this.f3256a;
            C0774no noVar2 = this.f3256a;
            C0774no noVar3 = this.f3256a;
            noVar2.f3300g = noVar3;
            noVar.f3299f = noVar3;
            return noVar3;
        } else {
            C0774no noVar4 = this.f3256a.f3300g;
            if (noVar4.f3296c + i > 8192 || !noVar4.f3298e) {
                noVar4 = noVar4.mo2704a(C0775np.m2562a());
            }
            return noVar4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0758nc)) {
            return false;
        }
        C0758nc ncVar = (C0758nc) obj;
        if (this.f3257b != ncVar.f3257b) {
            return false;
        }
        long j = 0;
        if (this.f3257b == 0) {
            return true;
        }
        C0774no noVar = this.f3256a;
        C0774no noVar2 = ncVar.f3256a;
        int i = noVar.f3295b;
        int i2 = noVar2.f3295b;
        while (j < this.f3257b) {
            long min = (long) Math.min(noVar.f3296c - i, noVar2.f3296c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (noVar.f3294a[i4] != noVar2.f3294a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == noVar.f3296c) {
                noVar = noVar.f3299f;
                i = noVar.f3295b;
            } else {
                i = i4;
            }
            if (i3 == noVar2.f3296c) {
                noVar2 = noVar2.f3299f;
                i2 = noVar2.f3295b;
            } else {
                i2 = i3;
            }
            j += min;
        }
        return true;
    }

    /* renamed from: f */
    public final byte mo2638f() {
        if (this.f3257b == 0) {
            throw new IllegalStateException("size == 0");
        }
        C0774no noVar = this.f3256a;
        int i = noVar.f3295b;
        int i2 = noVar.f3296c;
        int i3 = i + 1;
        byte b = noVar.f3294a[i];
        this.f3257b--;
        if (i3 == i2) {
            this.f3256a = noVar.mo2707c();
            C0775np.m2563a(noVar);
            return b;
        }
        noVar.f3295b = i3;
        return b;
    }

    /* renamed from: f */
    public final byte[] mo2640f(long j) {
        C0781nu.m2596a(this.f3257b, 0, j);
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byte[] bArr = new byte[((int) j)];
        mo2616a(bArr);
        return bArr;
    }

    public final void flush() {
    }

    /* renamed from: g */
    public final short mo2642g() {
        if (this.f3257b < 2) {
            StringBuilder sb = new StringBuilder("size < 2: ");
            sb.append(this.f3257b);
            throw new IllegalStateException(sb.toString());
        }
        C0774no noVar = this.f3256a;
        int i = noVar.f3295b;
        int i2 = noVar.f3296c;
        if (i2 - i < 2) {
            return (short) (((mo2638f() & 255) << 8) | (mo2638f() & 255));
        }
        byte[] bArr = noVar.f3294a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f3257b -= 2;
        if (i4 == i2) {
            this.f3256a = noVar.mo2707c();
            C0775np.m2563a(noVar);
        } else {
            noVar.f3295b = i4;
        }
        return (short) b;
    }

    /* renamed from: g */
    public final void mo2643g(long j) {
        while (j > 0) {
            if (this.f3256a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, (long) (this.f3256a.f3296c - this.f3256a.f3295b));
            long j2 = (long) min;
            this.f3257b -= j2;
            j -= j2;
            this.f3256a.f3295b += min;
            if (this.f3256a.f3295b == this.f3256a.f3296c) {
                C0774no noVar = this.f3256a;
                this.f3256a = noVar.mo2707c();
                C0775np.m2563a(noVar);
            }
        }
    }

    /* renamed from: h */
    public final int mo2644h() {
        if (this.f3257b < 4) {
            StringBuilder sb = new StringBuilder("size < 4: ");
            sb.append(this.f3257b);
            throw new IllegalStateException(sb.toString());
        }
        C0774no noVar = this.f3256a;
        int i = noVar.f3295b;
        int i2 = noVar.f3296c;
        if (i2 - i < 4) {
            return ((mo2638f() & 255) << 24) | ((mo2638f() & 255) << 16) | ((mo2638f() & 255) << 8) | (mo2638f() & 255);
        }
        byte[] bArr = noVar.f3294a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i5 = i4 + 1;
        byte b2 = b | ((bArr[i4] & 255) << 8);
        int i6 = i5 + 1;
        byte b3 = b2 | (bArr[i5] & 255);
        this.f3257b -= 4;
        if (i6 == i2) {
            this.f3256a = noVar.mo2707c();
            C0775np.m2563a(noVar);
            return b3;
        }
        noVar.f3295b = i6;
        return b3;
    }

    /* renamed from: h */
    public final C0758nc mo2654k(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return mo2646h(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo2622b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        C0774no e = mo2636e(i2);
        byte[] bArr = e.f3294a;
        int i3 = e.f3296c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f3255c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        e.f3296c += i2;
        this.f3257b += (long) i2;
        return this;
    }

    public final int hashCode() {
        C0774no noVar = this.f3256a;
        if (noVar == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = noVar.f3295b; i2 < noVar.f3296c; i2++) {
                i = noVar.f3294a[i2] + (31 * i);
            }
            noVar = noVar.f3299f;
        } while (noVar != this.f3256a);
        return i;
    }

    /* renamed from: i */
    public final long mo2648i() {
        if (this.f3257b < 8) {
            StringBuilder sb = new StringBuilder("size < 8: ");
            sb.append(this.f3257b);
            throw new IllegalStateException(sb.toString());
        }
        C0774no noVar = this.f3256a;
        int i = noVar.f3295b;
        int i2 = noVar.f3296c;
        if (i2 - i < 8) {
            return ((((long) mo2644h()) & 4294967295L) << 32) | (4294967295L & ((long) mo2644h()));
        }
        byte[] bArr = noVar.f3294a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        int i9 = i8 + 1;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i9 + 1;
        long j2 = (((long) bArr[i9]) & 255) | j;
        this.f3257b -= 8;
        if (i10 == i2) {
            this.f3256a = noVar.mo2707c();
            C0775np.m2563a(noVar);
            return j2;
        }
        noVar.f3295b = i10;
        return j2;
    }

    /* renamed from: i */
    public final C0758nc mo2651j(long j) {
        if (j == 0) {
            return mo2646h(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C0774no e = mo2636e(numberOfTrailingZeros);
        byte[] bArr = e.f3294a;
        int i = e.f3296c;
        for (int i2 = (e.f3296c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f3255c[(int) (15 & j)];
            j >>>= 4;
        }
        e.f3296c += numberOfTrailingZeros;
        this.f3257b += (long) numberOfTrailingZeros;
        return this;
    }

    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final short mo2652j() {
        return C0781nu.m2595a(mo2642g());
    }

    /* renamed from: k */
    public final int mo2653k() {
        return C0781nu.m2594a(mo2644h());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r8 != r9) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        r14.f3256a = r6.mo2707c();
        p000.C0775np.m2563a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r6.f3295b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if (r1 != false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0079 A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo2655l() {
        /*
            r14 = this;
            long r0 = r14.f3257b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        L_0x0010:
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x0013:
            no r6 = r14.f3256a
            byte[] r7 = r6.f3294a
            int r8 = r6.f3295b
            int r9 = r6.f3296c
        L_0x001b:
            if (r8 >= r9) goto L_0x0092
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x002a
            r11 = 57
            if (r10 > r11) goto L_0x002a
            int r11 = r10 + -48
            goto L_0x0042
        L_0x002a:
            r11 = 97
            if (r10 < r11) goto L_0x0037
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0037
            int r11 = r10 + -97
        L_0x0034:
            int r11 = r11 + 10
            goto L_0x0042
        L_0x0037:
            r11 = 65
            if (r10 < r11) goto L_0x0077
            r11 = 70
            if (r10 > r11) goto L_0x0077
            int r11 = r10 + -65
            goto L_0x0034
        L_0x0042:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x006e
            nc r0 = new nc
            r0.<init>()
            nc r0 = r0.mo2651j(r4)
            nc r0 = r0.mo2646h(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.mo2657n()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006e:
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x001b
        L_0x0077:
            if (r0 != 0) goto L_0x0091
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            r1 = 1
        L_0x0092:
            if (r8 != r9) goto L_0x009e
            no r7 = r6.mo2707c()
            r14.f3256a = r7
            p000.C0775np.m2563a(r6)
            goto L_0x00a0
        L_0x009e:
            r6.f3295b = r8
        L_0x00a0:
            if (r1 != 0) goto L_0x00a6
            no r6 = r14.f3256a
            if (r6 != 0) goto L_0x0013
        L_0x00a6:
            long r1 = r14.f3257b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f3257b = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0758nc.mo2655l():long");
    }

    /* renamed from: m */
    public final C0762nf mo2656m() {
        return new C0762nf(mo2659p());
    }

    /* renamed from: n */
    public final String mo2657n() {
        try {
            return m2381a(this.f3257b, C0781nu.f3309a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: o */
    public final String mo2658o() {
        return mo2631d(Long.MAX_VALUE);
    }

    /* renamed from: p */
    public final byte[] mo2659p() {
        try {
            return mo2640f(this.f3257b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: q */
    public final void mo2660q() {
        try {
            mo2643g(this.f3257b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: r */
    public final long mo2661r() {
        return mo2607a(0, 0, Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        C0774no noVar = this.f3256a;
        if (noVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), noVar.f3296c - noVar.f3295b);
        byteBuffer.put(noVar.f3294a, noVar.f3295b, min);
        noVar.f3295b += min;
        this.f3257b -= (long) min;
        if (noVar.f3295b == noVar.f3296c) {
            this.f3256a = noVar.mo2707c();
            C0775np.m2563a(noVar);
        }
        return min;
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C0760nd mo2663s() {
        return this;
    }

    public final String toString() {
        if (this.f3257b > 2147483647L) {
            StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
            sb.append(this.f3257b);
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) this.f3257b;
        return (i == 0 ? C0762nf.f3266b : new C0776nq(this, i)).toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C0774no e = mo2636e(1);
            int min = Math.min(i, 8192 - e.f3296c);
            byteBuffer.get(e.f3294a, e.f3296c, min);
            i -= min;
            e.f3296c += min;
        }
        this.f3257b += (long) remaining;
        return remaining;
    }
}
