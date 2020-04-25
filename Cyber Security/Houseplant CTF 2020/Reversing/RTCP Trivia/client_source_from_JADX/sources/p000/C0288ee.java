package p000;

/* renamed from: ee */
public final class C0288ee extends C0290eg {

    /* renamed from: a */
    C0273dx f1459a;

    /* renamed from: b */
    float f1460b;

    /* renamed from: c */
    C0288ee f1461c;

    /* renamed from: d */
    float f1462d;

    /* renamed from: e */
    C0288ee f1463e;

    /* renamed from: f */
    public float f1464f;

    /* renamed from: g */
    int f1465g = 0;

    /* renamed from: j */
    private C0288ee f1466j;

    /* renamed from: k */
    private float f1467k;

    /* renamed from: l */
    private C0289ef f1468l = null;

    /* renamed from: m */
    private int f1469m = 1;

    /* renamed from: n */
    private C0289ef f1470n = null;

    /* renamed from: o */
    private int f1471o = 1;

    public C0288ee(C0273dx dxVar) {
        this.f1459a = dxVar;
    }

    /* renamed from: a */
    private static String m997a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public final void mo1636a() {
        float f;
        C0288ee eeVar;
        float f2;
        float f3;
        float f4;
        boolean z = true;
        if (this.f1474i != 1 && this.f1465g != 4) {
            if (this.f1468l != null) {
                if (this.f1468l.f1474i == 1) {
                    this.f1462d = ((float) this.f1469m) * this.f1468l.f1472a;
                } else {
                    return;
                }
            }
            if (this.f1470n != null) {
                if (this.f1470n.f1474i == 1) {
                    this.f1467k = ((float) this.f1471o) * this.f1470n.f1472a;
                } else {
                    return;
                }
            }
            if (this.f1465g == 1 && (this.f1461c == null || this.f1461c.f1474i == 1)) {
                if (this.f1461c == null) {
                    this.f1463e = this;
                    f4 = this.f1462d;
                } else {
                    this.f1463e = this.f1461c.f1463e;
                    f4 = this.f1461c.f1464f + this.f1462d;
                }
                this.f1464f = f4;
                mo1649d();
                return;
            }
            if (this.f1465g == 2 && this.f1461c != null && this.f1461c.f1474i == 1 && this.f1466j != null && this.f1466j.f1461c != null && this.f1466j.f1461c.f1474i == 1) {
                if (C0262dq.m869a() != null) {
                    C0264dr a = C0262dq.m869a();
                    a.f1279w++;
                }
                this.f1463e = this.f1461c.f1463e;
                this.f1466j.f1463e = this.f1466j.f1461c.f1463e;
                int i = 0;
                if (!(this.f1459a.f1328c == C0277c.RIGHT || this.f1459a.f1328c == C0277c.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f = this.f1461c.f1464f;
                    eeVar = this.f1466j.f1461c;
                } else {
                    f = this.f1466j.f1461c.f1464f;
                    eeVar = this.f1461c;
                }
                float f5 = f - eeVar.f1464f;
                if (this.f1459a.f1328c == C0277c.LEFT || this.f1459a.f1328c == C0277c.RIGHT) {
                    f3 = f5 - ((float) this.f1459a.f1327b.mo1580l());
                    f2 = this.f1459a.f1327b.f1375V;
                } else {
                    f3 = f5 - ((float) this.f1459a.f1327b.mo1581m());
                    f2 = this.f1459a.f1327b.f1376W;
                }
                int b = this.f1459a.mo1551b();
                int b2 = this.f1466j.f1459a.mo1551b();
                if (this.f1459a.f1329d == this.f1466j.f1459a.f1329d) {
                    f2 = 0.5f;
                    b2 = 0;
                } else {
                    i = b;
                }
                float f6 = (float) i;
                float f7 = (float) b2;
                float f8 = (f3 - f6) - f7;
                if (z) {
                    this.f1466j.f1464f = this.f1466j.f1461c.f1464f + f7 + (f8 * f2);
                    this.f1464f = (this.f1461c.f1464f - f6) - (f8 * (1.0f - f2));
                } else {
                    this.f1464f = this.f1461c.f1464f + f6 + (f8 * f2);
                    this.f1466j.f1464f = (this.f1466j.f1461c.f1464f - f7) - (f8 * (1.0f - f2));
                }
            } else if (this.f1465g != 3 || this.f1461c == null || this.f1461c.f1474i != 1 || this.f1466j == null || this.f1466j.f1461c == null || this.f1466j.f1461c.f1474i != 1) {
                if (this.f1465g == 5) {
                    this.f1459a.f1327b.mo1547c();
                }
                return;
            } else {
                if (C0262dq.m869a() != null) {
                    C0264dr a2 = C0262dq.m869a();
                    a2.f1280x++;
                }
                this.f1463e = this.f1461c.f1463e;
                this.f1466j.f1463e = this.f1466j.f1461c.f1463e;
                this.f1464f = this.f1461c.f1464f + this.f1462d;
                this.f1466j.f1464f = this.f1466j.f1461c.f1464f + this.f1466j.f1462d;
            }
            mo1649d();
            this.f1466j.mo1649d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1637a(C0262dq dqVar) {
        C0268dt dtVar = this.f1459a.f1334i;
        if (this.f1463e == null) {
            dqVar.mo1524a(dtVar, (int) this.f1464f);
        } else {
            dqVar.mo1531c(dtVar, dqVar.mo1520a((Object) this.f1463e.f1459a), (int) this.f1464f, 6);
        }
    }

    /* renamed from: a */
    public final void mo1638a(C0288ee eeVar, float f) {
        if (this.f1474i == 0 || !(this.f1463e == eeVar || this.f1464f == f)) {
            this.f1463e = eeVar;
            this.f1464f = f;
            if (this.f1474i == 1) {
                mo1648c();
            }
            mo1649d();
        }
    }

    /* renamed from: a */
    public final void mo1639a(C0288ee eeVar, int i) {
        this.f1465g = 1;
        this.f1461c = eeVar;
        this.f1462d = (float) i;
        this.f1461c.mo1647a(this);
    }

    /* renamed from: a */
    public final void mo1640a(C0288ee eeVar, int i, C0289ef efVar) {
        this.f1461c = eeVar;
        this.f1461c.mo1647a(this);
        this.f1468l = efVar;
        this.f1469m = i;
        this.f1468l.mo1647a(this);
    }

    /* renamed from: b */
    public final void mo1641b() {
        super.mo1641b();
        this.f1461c = null;
        this.f1462d = 0.0f;
        this.f1468l = null;
        this.f1469m = 1;
        this.f1470n = null;
        this.f1471o = 1;
        this.f1463e = null;
        this.f1464f = 0.0f;
        this.f1460b = 0.0f;
        this.f1466j = null;
        this.f1467k = 0.0f;
        this.f1465g = 0;
    }

    /* renamed from: b */
    public final void mo1642b(C0288ee eeVar, float f) {
        this.f1466j = eeVar;
        this.f1467k = f;
    }

    /* renamed from: b */
    public final void mo1643b(C0288ee eeVar, int i) {
        this.f1461c = eeVar;
        this.f1462d = (float) i;
        this.f1461c.mo1647a(this);
    }

    /* renamed from: b */
    public final void mo1644b(C0288ee eeVar, int i, C0289ef efVar) {
        this.f1466j = eeVar;
        this.f1470n = efVar;
        this.f1471o = i;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.f1474i != 1) {
            sb = new StringBuilder("{ ");
            sb.append(this.f1459a);
            str = " UNRESOLVED} type: ";
        } else if (this.f1463e == this) {
            sb = new StringBuilder("[");
            sb.append(this.f1459a);
            sb.append(", RESOLVED: ");
            sb.append(this.f1464f);
            str = "]  type: ";
        } else {
            sb = new StringBuilder("[");
            sb.append(this.f1459a);
            sb.append(", RESOLVED: ");
            sb.append(this.f1463e);
            sb.append(":");
            sb.append(this.f1464f);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(m997a(this.f1465g));
        return sb.toString();
    }
}
