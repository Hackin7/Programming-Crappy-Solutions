package p000;

import java.util.Arrays;

/* renamed from: nq */
final class C0776nq extends C0762nf {

    /* renamed from: f */
    final transient byte[][] f3303f;

    /* renamed from: g */
    final transient int[] f3304g;

    C0776nq(C0758nc ncVar, int i) {
        super(null);
        C0781nu.m2596a(ncVar.f3257b, 0, (long) i);
        int i2 = 0;
        C0774no noVar = ncVar.f3256a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (noVar.f3296c == noVar.f3295b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += noVar.f3296c - noVar.f3295b;
            i4++;
            noVar = noVar.f3299f;
        }
        this.f3303f = new byte[i4][];
        this.f3304g = new int[(i4 * 2)];
        C0774no noVar2 = ncVar.f3256a;
        int i5 = 0;
        while (i2 < i) {
            this.f3303f[i5] = noVar2.f3294a;
            i2 += noVar2.f3296c - noVar2.f3295b;
            if (i2 > i) {
                i2 = i;
            }
            this.f3304g[i5] = i2;
            this.f3304g[this.f3303f.length + i5] = noVar2.f3295b;
            noVar2.f3297d = true;
            i5++;
            noVar2 = noVar2.f3299f;
        }
    }

    /* renamed from: b */
    private int m2564b(int i) {
        int binarySearch = Arrays.binarySearch(this.f3304g, 0, this.f3303f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: i */
    private C0762nf m2565i() {
        return new C0762nf(mo2682h());
    }

    /* renamed from: a */
    public final byte mo2668a(int i) {
        C0781nu.m2596a((long) this.f3304g[this.f3303f.length - 1], (long) i, 1);
        int b = m2564b(i);
        return this.f3303f[b][(i - (b == 0 ? 0 : this.f3304g[b - 1])) + this.f3304g[this.f3303f.length + b]];
    }

    /* renamed from: a */
    public final String mo2669a() {
        return m2565i().mo2669a();
    }

    /* renamed from: a */
    public final C0762nf mo2670a(int i, int i2) {
        return m2565i().mo2670a(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2671a(C0758nc ncVar) {
        int i = 0;
        int length = this.f3303f.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f3304g[length + i];
            int i4 = this.f3304g[i];
            C0774no noVar = new C0774no(this.f3303f[i], i3, (i3 + i4) - i2, true, false);
            if (ncVar.f3256a == null) {
                noVar.f3300g = noVar;
                noVar.f3299f = noVar;
                ncVar.f3256a = noVar;
            } else {
                ncVar.f3256a.f3300g.mo2704a(noVar);
            }
            i++;
            i2 = i4;
        }
        ncVar.f3257b += (long) i2;
    }

    /* renamed from: a */
    public final boolean mo2672a(int i, C0762nf nfVar, int i2, int i3) {
        if (mo2681g() - i3 < 0) {
            return false;
        }
        int b = m2564b(0);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f3304g[b - 1];
            int min = Math.min(i3, ((this.f3304g[b] - i4) + i4) - i);
            if (!nfVar.mo2673a(i2, this.f3303f[b], (i - i4) + this.f3304g[this.f3303f.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo2673a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo2681g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m2564b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f3304g[b - 1];
            int min = Math.min(i3, ((this.f3304g[b] - i4) + i4) - i);
            if (!C0781nu.m2598a(this.f3303f[b], (i - i4) + this.f3304g[this.f3303f.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo2674b() {
        return m2565i().mo2674b();
    }

    /* renamed from: c */
    public final C0762nf mo2675c() {
        return m2565i().mo2675c();
    }

    /* renamed from: d */
    public final C0762nf mo2677d() {
        return m2565i().mo2677d();
    }

    /* renamed from: e */
    public final String mo2678e() {
        return m2565i().mo2678e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0762nf) {
            C0762nf nfVar = (C0762nf) obj;
            return nfVar.mo2681g() == mo2681g() && mo2672a(0, nfVar, 0, mo2681g());
        }
    }

    /* renamed from: f */
    public final C0762nf mo2680f() {
        return m2565i().mo2680f();
    }

    /* renamed from: g */
    public final int mo2681g() {
        return this.f3304g[this.f3303f.length - 1];
    }

    /* renamed from: h */
    public final byte[] mo2682h() {
        int i = 0;
        byte[] bArr = new byte[this.f3304g[this.f3303f.length - 1]];
        int length = this.f3303f.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f3304g[length + i];
            int i4 = this.f3304g[i];
            System.arraycopy(this.f3303f[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    public final int hashCode() {
        int i = this.f3268d;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int length = this.f3303f.length;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f3303f[i2];
            int i5 = this.f3304g[length + i2];
            int i6 = this.f3304g[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = bArr[i5] + (31 * i3);
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f3268d = i3;
        return i3;
    }

    public final String toString() {
        return m2565i().toString();
    }
}
