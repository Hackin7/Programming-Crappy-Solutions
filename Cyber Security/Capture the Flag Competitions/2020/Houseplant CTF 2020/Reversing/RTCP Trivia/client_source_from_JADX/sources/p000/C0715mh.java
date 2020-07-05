package p000;

/* renamed from: mh */
public final class C0715mh {

    /* renamed from: a */
    int f3093a;

    /* renamed from: b */
    final int[] f3094b = new int[10];

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo2533a() {
        if ((this.f3093a & 2) != 0) {
            return this.f3094b[1];
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0715mh mo2534a(int i, int i2) {
        if (i < 0 || i >= this.f3094b.length) {
            return this;
        }
        this.f3093a = (1 << i) | this.f3093a;
        this.f3094b[i] = i2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2535a(int i) {
        return ((1 << i) & this.f3093a) != 0;
    }

    /* renamed from: b */
    public final int mo2536b() {
        if ((this.f3093a & 128) != 0) {
            return this.f3094b[7];
        }
        return 65535;
    }
}
