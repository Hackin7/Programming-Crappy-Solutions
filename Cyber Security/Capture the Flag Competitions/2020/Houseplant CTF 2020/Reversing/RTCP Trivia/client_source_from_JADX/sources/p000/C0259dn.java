package p000;

/* renamed from: dn */
public class C0259dn implements C0263a {

    /* renamed from: a */
    C0268dt f1227a = null;

    /* renamed from: b */
    public float f1228b = 0.0f;

    /* renamed from: c */
    boolean f1229c = false;

    /* renamed from: d */
    public final C0258dm f1230d;

    /* renamed from: e */
    public boolean f1231e = false;

    public C0259dn(C0260do doVar) {
        this.f1230d = new C0258dm(this, doVar);
    }

    /* renamed from: a */
    public final C0259dn mo1507a(C0262dq dqVar, int i) {
        this.f1230d.mo1502a(dqVar.mo1519a(i), 1.0f);
        this.f1230d.mo1502a(dqVar.mo1519a(i), -1.0f);
        return this;
    }

    /* renamed from: a */
    public final C0259dn mo1508a(C0268dt dtVar, C0268dt dtVar2, C0268dt dtVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1228b = (float) i;
        }
        if (!z) {
            this.f1230d.mo1502a(dtVar, -1.0f);
            this.f1230d.mo1502a(dtVar2, 1.0f);
            this.f1230d.mo1502a(dtVar3, 1.0f);
            return this;
        }
        this.f1230d.mo1502a(dtVar, 1.0f);
        this.f1230d.mo1502a(dtVar2, -1.0f);
        this.f1230d.mo1502a(dtVar3, -1.0f);
        return this;
    }

    /* renamed from: a */
    public final C0259dn mo1509a(C0268dt dtVar, C0268dt dtVar2, C0268dt dtVar3, C0268dt dtVar4, float f) {
        this.f1230d.mo1502a(dtVar, -1.0f);
        this.f1230d.mo1502a(dtVar2, 1.0f);
        this.f1230d.mo1502a(dtVar3, f);
        this.f1230d.mo1502a(dtVar4, -f);
        return this;
    }

    /* renamed from: a */
    public final C0268dt mo1510a(boolean[] zArr) {
        return this.f1230d.mo1500a(zArr, (C0268dt) null);
    }

    /* renamed from: a */
    public final void mo1511a() {
        this.f1230d.mo1501a();
        this.f1227a = null;
        this.f1228b = 0.0f;
    }

    /* renamed from: a */
    public final void mo1512a(C0263a aVar) {
        if (aVar instanceof C0259dn) {
            C0259dn dnVar = (C0259dn) aVar;
            this.f1227a = null;
            this.f1230d.mo1501a();
            for (int i = 0; i < dnVar.f1230d.f1216a; i++) {
                this.f1230d.mo1503a(dnVar.f1230d.mo1499a(i), dnVar.f1230d.mo1504b(i), true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1513a(C0268dt dtVar) {
        if (this.f1227a != null) {
            this.f1230d.mo1502a(this.f1227a, -1.0f);
            this.f1227a = null;
        }
        float a = this.f1230d.mo1498a(dtVar, true) * -1.0f;
        this.f1227a = dtVar;
        if (a != 1.0f) {
            this.f1228b /= a;
            C0258dm dmVar = this.f1230d;
            int i = dmVar.f1222g;
            int i2 = 0;
            while (i != -1 && i2 < dmVar.f1216a) {
                float[] fArr = dmVar.f1221f;
                fArr[i] = fArr[i] / a;
                i = dmVar.f1220e[i];
                i2++;
            }
        }
    }

    /* renamed from: b */
    public final C0259dn mo1514b(C0268dt dtVar, C0268dt dtVar2, C0268dt dtVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1228b = (float) i;
        }
        if (!z) {
            this.f1230d.mo1502a(dtVar, -1.0f);
            this.f1230d.mo1502a(dtVar2, 1.0f);
            this.f1230d.mo1502a(dtVar3, -1.0f);
            return this;
        }
        this.f1230d.mo1502a(dtVar, 1.0f);
        this.f1230d.mo1502a(dtVar2, -1.0f);
        this.f1230d.mo1502a(dtVar3, 1.0f);
        return this;
    }

    /* renamed from: b */
    public final C0259dn mo1515b(C0268dt dtVar, C0268dt dtVar2, C0268dt dtVar3, C0268dt dtVar4, float f) {
        this.f1230d.mo1502a(dtVar3, 0.5f);
        this.f1230d.mo1502a(dtVar4, 0.5f);
        this.f1230d.mo1502a(dtVar, -0.5f);
        this.f1230d.mo1502a(dtVar2, -0.5f);
        this.f1228b = -f;
        return this;
    }

    /* renamed from: b */
    public final C0268dt mo1516b() {
        return this.f1227a;
    }

    /* renamed from: b */
    public void mo1517b(C0268dt dtVar) {
        float f = 1.0f;
        if (dtVar.f1292c != 1) {
            if (dtVar.f1292c == 2) {
                f = 1000.0f;
            } else if (dtVar.f1292c == 3) {
                f = 1000000.0f;
            } else if (dtVar.f1292c == 4) {
                f = 1.0E9f;
            } else if (dtVar.f1292c == 5) {
                f = 1.0E12f;
            }
        }
        this.f1230d.mo1502a(dtVar, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            java.lang.String r0 = ""
            dt r1 = r10.f1227a
            if (r1 != 0) goto L_0x0018
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
        L_0x0013:
            java.lang.String r0 = r1.toString()
            goto L_0x0026
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            dt r0 = r10.f1227a
            r1.append(r0)
            goto L_0x0013
        L_0x0026:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f1228b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0054
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f1228b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r0
            r0 = r4
            goto L_0x0056
        L_0x0054:
            r1 = r0
            r0 = r3
        L_0x0056:
            dm r5 = r10.f1230d
            int r5 = r5.f1216a
        L_0x005a:
            if (r3 >= r5) goto L_0x00d5
            dm r6 = r10.f1230d
            dt r6 = r6.mo1499a(r3)
            if (r6 == 0) goto L_0x00d2
            dm r7 = r10.f1230d
            float r7 = r7.mo1504b(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x00d2
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L_0x008d
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "- "
        L_0x0084:
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            float r7 = r7 * r9
            goto L_0x00ac
        L_0x008d:
            if (r8 <= 0) goto L_0x00a1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L_0x00ac
        L_0x00a1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " - "
            goto L_0x0084
        L_0x00ac:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x00b7:
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L_0x00d0
        L_0x00c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " "
            goto L_0x00b7
        L_0x00d0:
            r1 = r0
            r0 = r4
        L_0x00d2:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x00d5:
            if (r0 != 0) goto L_0x00e8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0.0"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L_0x00e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0259dn.toString():java.lang.String");
    }
}
