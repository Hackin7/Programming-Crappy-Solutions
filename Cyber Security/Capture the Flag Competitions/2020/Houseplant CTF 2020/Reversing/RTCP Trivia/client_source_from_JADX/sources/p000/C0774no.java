package p000;

import javax.annotation.Nullable;

/* renamed from: no */
public final class C0774no {

    /* renamed from: a */
    public final byte[] f3294a;

    /* renamed from: b */
    int f3295b;

    /* renamed from: c */
    public int f3296c;

    /* renamed from: d */
    boolean f3297d;

    /* renamed from: e */
    boolean f3298e;

    /* renamed from: f */
    C0774no f3299f;

    /* renamed from: g */
    C0774no f3300g;

    C0774no() {
        this.f3294a = new byte[8192];
        this.f3298e = true;
        this.f3297d = false;
    }

    C0774no(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f3294a = bArr;
        this.f3295b = i;
        this.f3296c = i2;
        this.f3297d = z;
        this.f3298e = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0774no mo2703a() {
        this.f3297d = true;
        C0774no noVar = new C0774no(this.f3294a, this.f3295b, this.f3296c, true, false);
        return noVar;
    }

    /* renamed from: a */
    public final C0774no mo2704a(C0774no noVar) {
        noVar.f3300g = this;
        noVar.f3299f = this.f3299f;
        this.f3299f.f3300g = noVar;
        this.f3299f = noVar;
        return noVar;
    }

    /* renamed from: a */
    public final void mo2705a(C0774no noVar, int i) {
        if (!noVar.f3298e) {
            throw new IllegalArgumentException();
        }
        if (noVar.f3296c + i > 8192) {
            if (noVar.f3297d) {
                throw new IllegalArgumentException();
            } else if ((noVar.f3296c + i) - noVar.f3295b > 8192) {
                throw new IllegalArgumentException();
            } else {
                System.arraycopy(noVar.f3294a, noVar.f3295b, noVar.f3294a, 0, noVar.f3296c - noVar.f3295b);
                noVar.f3296c -= noVar.f3295b;
                noVar.f3295b = 0;
            }
        }
        System.arraycopy(this.f3294a, this.f3295b, noVar.f3294a, noVar.f3296c, i);
        noVar.f3296c += i;
        this.f3295b += i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0774no mo2706b() {
        C0774no noVar = new C0774no((byte[]) this.f3294a.clone(), this.f3295b, this.f3296c, false, true);
        return noVar;
    }

    @Nullable
    /* renamed from: c */
    public final C0774no mo2707c() {
        C0774no noVar = this.f3299f != this ? this.f3299f : null;
        this.f3300g.f3299f = this.f3299f;
        this.f3299f.f3300g = this.f3300g;
        this.f3299f = null;
        this.f3300g = null;
        return noVar;
    }
}
