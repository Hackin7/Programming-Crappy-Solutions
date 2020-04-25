package p000;

/* renamed from: ck */
public final class C0204ck {

    /* renamed from: a */
    public int f1021a = 0;

    /* renamed from: b */
    public int f1022b = 0;

    /* renamed from: c */
    public int f1023c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1024d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1025e = 0;

    /* renamed from: f */
    public int f1026f = 0;

    /* renamed from: g */
    public boolean f1027g = false;

    /* renamed from: h */
    public boolean f1028h = false;

    /* renamed from: a */
    public final void mo1275a(int i, int i2) {
        this.f1023c = i;
        this.f1024d = i2;
        this.f1028h = true;
        if (this.f1027g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1021a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1022b = i;
            }
        } else {
            if (i != Integer.MIN_VALUE) {
                this.f1021a = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1022b = i2;
            }
        }
    }
}
