package p000;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: dq */
public final class C0262dq {

    /* renamed from: h */
    public static C0264dr f1235h = null;

    /* renamed from: i */
    private static int f1236i = 1000;

    /* renamed from: a */
    int f1237a;

    /* renamed from: b */
    public C0263a f1238b;

    /* renamed from: c */
    public C0259dn[] f1239c;

    /* renamed from: d */
    public boolean f1240d;

    /* renamed from: e */
    int f1241e;

    /* renamed from: f */
    public int f1242f;

    /* renamed from: g */
    public final C0260do f1243g;

    /* renamed from: j */
    private HashMap<String, C0268dt> f1244j;

    /* renamed from: k */
    private int f1245k;

    /* renamed from: l */
    private int f1246l;

    /* renamed from: m */
    private boolean[] f1247m;

    /* renamed from: n */
    private int f1248n;

    /* renamed from: o */
    private C0268dt[] f1249o;

    /* renamed from: p */
    private int f1250p;

    /* renamed from: q */
    private C0259dn[] f1251q;

    /* renamed from: r */
    private final C0263a f1252r;

    /* renamed from: dq$a */
    interface C0263a {
        /* renamed from: a */
        C0268dt mo1510a(boolean[] zArr);

        /* renamed from: a */
        void mo1511a();

        /* renamed from: a */
        void mo1512a(C0263a aVar);

        /* renamed from: b */
        C0268dt mo1516b();

        /* renamed from: b */
        void mo1517b(C0268dt dtVar);
    }

    public C0262dq() {
        this.f1237a = 0;
        this.f1244j = null;
        this.f1245k = 32;
        this.f1246l = this.f1245k;
        this.f1239c = null;
        this.f1240d = false;
        this.f1247m = new boolean[this.f1245k];
        this.f1241e = 1;
        this.f1242f = 0;
        this.f1248n = this.f1245k;
        this.f1249o = new C0268dt[f1236i];
        this.f1250p = 0;
        this.f1251q = new C0259dn[this.f1245k];
        this.f1239c = new C0259dn[this.f1245k];
        m876g();
        this.f1243g = new C0260do();
        this.f1238b = new C0261dp(this.f1243g);
        this.f1252r = new C0259dn(this.f1243g);
    }

    /* renamed from: a */
    public static C0259dn m868a(C0262dq dqVar, C0268dt dtVar, C0268dt dtVar2, C0268dt dtVar3, float f, boolean z) {
        C0259dn c = dqVar.mo1530c();
        if (z) {
            c.mo1507a(dqVar, 0);
        }
        c.f1230d.mo1502a(dtVar, -1.0f);
        c.f1230d.mo1502a(dtVar2, 1.0f - f);
        c.f1230d.mo1502a(dtVar3, f);
        return c;
    }

    /* renamed from: a */
    public static C0264dr m869a() {
        return f1235h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b5 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m870b(p000.C0262dq.C0263a r18) {
        /*
            r17 = this;
            r0 = r17
            dr r1 = f1235h
            r2 = 1
            if (r1 == 0) goto L_0x000f
            dr r1 = f1235h
            long r4 = r1.f1264h
            long r4 = r4 + r2
            r1.f1264h = r4
        L_0x000f:
            r1 = 0
            r4 = r1
        L_0x0011:
            int r5 = r0.f1241e
            if (r4 >= r5) goto L_0x001c
            boolean[] r5 = r0.f1247m
            r5[r4] = r1
            int r4 = r4 + 1
            goto L_0x0011
        L_0x001c:
            r4 = 1
            r5 = r1
            r6 = r5
        L_0x001f:
            if (r5 != 0) goto L_0x00ee
            dr r7 = f1235h
            if (r7 == 0) goto L_0x002c
            dr r7 = f1235h
            long r8 = r7.f1265i
            long r8 = r8 + r2
            r7.f1265i = r8
        L_0x002c:
            int r6 = r6 + 1
            r7 = 2
            int r8 = r0.f1241e
            int r7 = r7 * r8
            if (r6 < r7) goto L_0x0035
            return r6
        L_0x0035:
            dt r7 = r18.mo1516b()
            if (r7 == 0) goto L_0x0045
            boolean[] r7 = r0.f1247m
            dt r8 = r18.mo1516b()
            int r8 = r8.f1290a
            r7[r8] = r4
        L_0x0045:
            boolean[] r7 = r0.f1247m
            r8 = r18
            dt r7 = r8.mo1510a(r7)
            if (r7 == 0) goto L_0x005e
            boolean[] r9 = r0.f1247m
            int r10 = r7.f1290a
            boolean r9 = r9[r10]
            if (r9 == 0) goto L_0x0058
            return r6
        L_0x0058:
            boolean[] r9 = r0.f1247m
            int r10 = r7.f1290a
            r9[r10] = r4
        L_0x005e:
            if (r7 == 0) goto L_0x00ea
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r10 = -1
            r12 = r9
            r11 = r10
            r9 = r1
        L_0x0067:
            int r13 = r0.f1242f
            if (r9 >= r13) goto L_0x00bc
            dn[] r13 = r0.f1239c
            r13 = r13[r9]
            dt r14 = r13.f1227a
            int r14 = r14.f1295f
            int r15 = p000.C0268dt.C0269a.f1300a
            if (r14 == r15) goto L_0x00b5
            boolean r14 = r13.f1231e
            if (r14 != 0) goto L_0x00b5
            dm r14 = r13.f1230d
            int r15 = r14.f1222g
            if (r15 == r10) goto L_0x009d
            int r15 = r14.f1222g
        L_0x0083:
            if (r15 == r10) goto L_0x009d
            int r4 = r14.f1216a
            if (r1 >= r4) goto L_0x009d
            int[] r4 = r14.f1219d
            r4 = r4[r15]
            int r2 = r7.f1290a
            if (r4 != r2) goto L_0x0093
            r1 = 1
            goto L_0x009e
        L_0x0093:
            int[] r2 = r14.f1220e
            r15 = r2[r15]
            int r1 = r1 + 1
            r2 = 1
            r4 = 1
            goto L_0x0083
        L_0x009d:
            r1 = 0
        L_0x009e:
            if (r1 == 0) goto L_0x00b5
            dm r1 = r13.f1230d
            float r1 = r1.mo1505b(r7)
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b5
            float r2 = r13.f1228b
            float r2 = -r2
            float r2 = r2 / r1
            int r1 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b5
            r12 = r2
            r11 = r9
        L_0x00b5:
            int r9 = r9 + 1
            r1 = 0
            r2 = 1
            r4 = 1
            goto L_0x0067
        L_0x00bc:
            if (r11 < 0) goto L_0x00e7
            dn[] r1 = r0.f1239c
            r1 = r1[r11]
            dt r2 = r1.f1227a
            r2.f1291b = r10
            dr r2 = f1235h
            if (r2 == 0) goto L_0x00d4
            dr r2 = f1235h
            long r3 = r2.f1266j
            r9 = 1
            long r3 = r3 + r9
            r2.f1266j = r3
            goto L_0x00d6
        L_0x00d4:
            r9 = 1
        L_0x00d6:
            r1.mo1513a(r7)
            dt r2 = r1.f1227a
            r2.f1291b = r11
            dt r2 = r1.f1227a
            r2.mo1541c(r1)
            r2 = r9
            r1 = 0
            r4 = 1
            goto L_0x001f
        L_0x00e7:
            r1 = 0
            r2 = 1
        L_0x00ea:
            r4 = 1
            r5 = 1
            goto L_0x001f
        L_0x00ee:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0262dq.m870b(dq$a):int");
    }

    /* renamed from: b */
    public static int m871b(Object obj) {
        C0268dt dtVar = ((C0273dx) obj).f1334i;
        if (dtVar != null) {
            return (int) (dtVar.f1293d + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private C0268dt m872b(int i) {
        C0268dt dtVar = (C0268dt) this.f1243g.f1233b.mo1535a();
        if (dtVar == null) {
            dtVar = new C0268dt(i);
        } else {
            dtVar.mo1539b();
        }
        dtVar.f1295f = i;
        if (this.f1250p >= f1236i) {
            f1236i *= 2;
            this.f1249o = (C0268dt[]) Arrays.copyOf(this.f1249o, f1236i);
        }
        C0268dt[] dtVarArr = this.f1249o;
        int i2 = this.f1250p;
        this.f1250p = i2 + 1;
        dtVarArr[i2] = dtVar;
        return dtVar;
    }

    /* renamed from: b */
    private final void m873b(C0259dn dnVar) {
        if (this.f1242f > 0) {
            C0258dm dmVar = dnVar.f1230d;
            C0259dn[] dnVarArr = this.f1239c;
            int i = dmVar.f1222g;
            loop0:
            while (true) {
                int i2 = 0;
                while (i != -1 && i2 < dmVar.f1216a) {
                    C0268dt dtVar = dmVar.f1218c.f1234c[dmVar.f1219d[i]];
                    if (dtVar.f1291b != -1) {
                        float f = dmVar.f1221f[i];
                        dmVar.mo1498a(dtVar, true);
                        C0259dn dnVar2 = dnVarArr[dtVar.f1291b];
                        if (!dnVar2.f1231e) {
                            C0258dm dmVar2 = dnVar2.f1230d;
                            int i3 = dmVar2.f1222g;
                            int i4 = 0;
                            while (i3 != -1 && i4 < dmVar2.f1216a) {
                                dmVar.mo1503a(dmVar.f1218c.f1234c[dmVar2.f1219d[i3]], dmVar2.f1221f[i3] * f, true);
                                i3 = dmVar2.f1220e[i3];
                                i4++;
                            }
                        }
                        dnVar.f1228b += dnVar2.f1228b * f;
                        dnVar2.f1227a.mo1540b(dnVar);
                        i = dmVar.f1222g;
                    } else {
                        i = dmVar.f1220e[i];
                        i2++;
                    }
                }
            }
            if (dnVar.f1230d.f1216a == 0) {
                dnVar.f1231e = true;
            }
        }
    }

    /* renamed from: c */
    private final void m874c(C0259dn dnVar) {
        if (this.f1239c[this.f1242f] != null) {
            this.f1243g.f1232a.mo1537a(this.f1239c[this.f1242f]);
        }
        this.f1239c[this.f1242f] = dnVar;
        dnVar.f1227a.f1291b = this.f1242f;
        this.f1242f++;
        dnVar.f1227a.mo1541c(dnVar);
    }

    /* renamed from: f */
    private void m875f() {
        this.f1245k *= 2;
        this.f1239c = (C0259dn[]) Arrays.copyOf(this.f1239c, this.f1245k);
        this.f1243g.f1234c = (C0268dt[]) Arrays.copyOf(this.f1243g.f1234c, this.f1245k);
        this.f1247m = new boolean[this.f1245k];
        this.f1246l = this.f1245k;
        this.f1248n = this.f1245k;
        if (f1235h != null) {
            C0264dr drVar = f1235h;
            drVar.f1260d++;
            f1235h.f1272p = Math.max(f1235h.f1272p, (long) this.f1245k);
            f1235h.f1256D = f1235h.f1272p;
        }
    }

    /* renamed from: g */
    private void m876g() {
        for (int i = 0; i < this.f1239c.length; i++) {
            C0259dn dnVar = this.f1239c[i];
            if (dnVar != null) {
                this.f1243g.f1232a.mo1537a(dnVar);
            }
            this.f1239c[i] = null;
        }
    }

    /* renamed from: a */
    public final C0268dt mo1519a(int i) {
        if (f1235h != null) {
            C0264dr drVar = f1235h;
            drVar.f1269m++;
        }
        if (this.f1241e + 1 >= this.f1246l) {
            m875f();
        }
        C0268dt b = m872b(C0269a.f1303d);
        this.f1237a++;
        this.f1241e++;
        b.f1290a = this.f1237a;
        b.f1292c = i;
        this.f1243g.f1234c[this.f1237a] = b;
        this.f1238b.mo1517b(b);
        return b;
    }

    /* renamed from: a */
    public final C0268dt mo1520a(Object obj) {
        C0268dt dtVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1241e + 1 >= this.f1246l) {
            m875f();
        }
        if (obj instanceof C0273dx) {
            C0273dx dxVar = (C0273dx) obj;
            dtVar = dxVar.f1334i;
            if (dtVar == null) {
                dxVar.mo1549a();
                dtVar = dxVar.f1334i;
            }
            if (dtVar.f1290a == -1 || dtVar.f1290a > this.f1237a || this.f1243g.f1234c[dtVar.f1290a] == null) {
                if (dtVar.f1290a != -1) {
                    dtVar.mo1539b();
                }
                this.f1237a++;
                this.f1241e++;
                dtVar.f1290a = this.f1237a;
                dtVar.f1295f = C0269a.f1300a;
                this.f1243g.f1234c[this.f1237a] = dtVar;
            }
        }
        return dtVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x00fe A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1521a(p000.C0259dn r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            dr r2 = f1235h
            r3 = 1
            if (r2 == 0) goto L_0x001f
            dr r2 = f1235h
            long r5 = r2.f1262f
            long r5 = r5 + r3
            r2.f1262f = r5
            boolean r2 = r1.f1231e
            if (r2 == 0) goto L_0x001f
            dr r2 = f1235h
            long r5 = r2.f1263g
            long r5 = r5 + r3
            r2.f1263g = r5
        L_0x001f:
            int r2 = r0.f1242f
            r5 = 1
            int r2 = r2 + r5
            int r6 = r0.f1248n
            if (r2 >= r6) goto L_0x002e
            int r2 = r0.f1241e
            int r2 = r2 + r5
            int r6 = r0.f1246l
            if (r2 < r6) goto L_0x0031
        L_0x002e:
            r20.m875f()
        L_0x0031:
            boolean r2 = r1.f1231e
            if (r2 != 0) goto L_0x01b1
            r20.m873b(r21)
            dt r2 = r1.f1227a
            r7 = 0
            if (r2 != 0) goto L_0x004b
            float r2 = r1.f1228b
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x004b
            dm r2 = r1.f1230d
            int r2 = r2.f1216a
            if (r2 != 0) goto L_0x004b
            r2 = r5
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            if (r2 == 0) goto L_0x004f
            return
        L_0x004f:
            float r2 = r1.f1228b
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r8 = -1
            if (r2 >= 0) goto L_0x0076
            float r2 = r1.f1228b
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r9
            r1.f1228b = r2
            dm r2 = r1.f1230d
            int r10 = r2.f1222g
            r11 = 0
        L_0x0062:
            if (r10 == r8) goto L_0x0076
            int r12 = r2.f1216a
            if (r11 >= r12) goto L_0x0076
            float[] r12 = r2.f1221f
            r13 = r12[r10]
            float r13 = r13 * r9
            r12[r10] = r13
            int[] r12 = r2.f1220e
            r10 = r12[r10]
            int r11 = r11 + 1
            goto L_0x0062
        L_0x0076:
            dm r2 = r1.f1230d
            int r9 = r2.f1222g
            r14 = r7
            r16 = r14
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
        L_0x0083:
            if (r9 == r8) goto L_0x0109
            int r6 = r2.f1216a
            if (r11 >= r6) goto L_0x0109
            float[] r6 = r2.f1221f
            r6 = r6[r9]
            do r10 = r2.f1218c
            dt[] r10 = r10.f1234c
            int[] r8 = r2.f1219d
            r8 = r8[r9]
            r8 = r10[r8]
            int r10 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x00ad
            r10 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x00b9
            float[] r6 = r2.f1221f
            r6[r9] = r7
        L_0x00a6:
            dn r6 = r2.f1217b
            r8.mo1540b(r6)
            r6 = r7
            goto L_0x00b9
        L_0x00ad:
            r10 = 981668463(0x3a83126f, float:0.001)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x00b9
            float[] r6 = r2.f1221f
            r6[r9] = r7
            goto L_0x00a6
        L_0x00b9:
            int r10 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x00fe
            int r10 = r8.f1295f
            int r3 = p000.C0268dt.C0269a.f1300a
            if (r10 != r3) goto L_0x00dc
            if (r12 != 0) goto L_0x00cd
        L_0x00c5:
            boolean r3 = p000.C0258dm.m847a(r8)
            r15 = r3
        L_0x00ca:
            r14 = r6
            r12 = r8
            goto L_0x00fe
        L_0x00cd:
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d2
            goto L_0x00c5
        L_0x00d2:
            if (r15 != 0) goto L_0x00fe
            boolean r3 = p000.C0258dm.m847a(r8)
            if (r3 == 0) goto L_0x00fe
            r15 = r5
            goto L_0x00ca
        L_0x00dc:
            if (r12 != 0) goto L_0x00fe
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x00fe
            if (r13 != 0) goto L_0x00ee
        L_0x00e4:
            boolean r3 = p000.C0258dm.m847a(r8)
            r17 = r3
        L_0x00ea:
            r16 = r6
            r13 = r8
            goto L_0x00fe
        L_0x00ee:
            int r3 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f3
            goto L_0x00e4
        L_0x00f3:
            if (r17 != 0) goto L_0x00fe
            boolean r3 = p000.C0258dm.m847a(r8)
            if (r3 == 0) goto L_0x00fe
            r17 = r5
            goto L_0x00ea
        L_0x00fe:
            int[] r3 = r2.f1220e
            r9 = r3[r9]
            int r11 = r11 + 1
            r3 = 1
            r8 = -1
            goto L_0x0083
        L_0x0109:
            if (r12 == 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r12 = r13
        L_0x010d:
            if (r12 != 0) goto L_0x0111
            r2 = r5
            goto L_0x0115
        L_0x0111:
            r1.mo1513a(r12)
            r2 = 0
        L_0x0115:
            dm r3 = r1.f1230d
            int r3 = r3.f1216a
            if (r3 != 0) goto L_0x011d
            r1.f1231e = r5
        L_0x011d:
            if (r2 == 0) goto L_0x0193
            dr r2 = f1235h
            if (r2 == 0) goto L_0x012c
            dr r2 = f1235h
            long r3 = r2.f1271o
            r8 = 1
            long r3 = r3 + r8
            r2.f1271o = r3
        L_0x012c:
            int r2 = r0.f1241e
            int r2 = r2 + r5
            int r3 = r0.f1246l
            if (r2 < r3) goto L_0x0136
            r20.m875f()
        L_0x0136:
            int r2 = p000.C0268dt.C0269a.f1302c
            dt r2 = r0.m872b(r2)
            int r3 = r0.f1237a
            int r3 = r3 + r5
            r0.f1237a = r3
            int r3 = r0.f1241e
            int r3 = r3 + r5
            r0.f1241e = r3
            int r3 = r0.f1237a
            r2.f1290a = r3
            do r3 = r0.f1243g
            dt[] r3 = r3.f1234c
            int r4 = r0.f1237a
            r3[r4] = r2
            r1.f1227a = r2
            r20.m874c(r21)
            dq$a r3 = r0.f1252r
            r3.mo1512a(r1)
            dq$a r3 = r0.f1252r
            r0.m870b(r3)
            int r3 = r2.f1291b
            r4 = -1
            if (r3 != r4) goto L_0x0191
            dt r3 = r1.f1227a
            if (r3 != r2) goto L_0x0183
            dm r3 = r1.f1230d
            r4 = 0
            dt r2 = r3.mo1500a(r4, r2)
            if (r2 == 0) goto L_0x0183
            dr r3 = f1235h
            if (r3 == 0) goto L_0x0180
            dr r3 = f1235h
            long r8 = r3.f1266j
            r10 = 1
            long r8 = r8 + r10
            r3.f1266j = r8
        L_0x0180:
            r1.mo1513a(r2)
        L_0x0183:
            boolean r2 = r1.f1231e
            if (r2 != 0) goto L_0x018c
            dt r2 = r1.f1227a
            r2.mo1541c(r1)
        L_0x018c:
            int r2 = r0.f1242f
            int r2 = r2 - r5
            r0.f1242f = r2
        L_0x0191:
            r6 = r5
            goto L_0x0194
        L_0x0193:
            r6 = 0
        L_0x0194:
            dt r2 = r1.f1227a
            if (r2 == 0) goto L_0x01a9
            dt r2 = r1.f1227a
            int r2 = r2.f1295f
            int r3 = p000.C0268dt.C0269a.f1300a
            if (r2 == r3) goto L_0x01a6
            float r2 = r1.f1228b
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01a9
        L_0x01a6:
            r18 = r5
            goto L_0x01ab
        L_0x01a9:
            r18 = 0
        L_0x01ab:
            if (r18 != 0) goto L_0x01ae
            return
        L_0x01ae:
            r18 = r6
            goto L_0x01b3
        L_0x01b1:
            r18 = 0
        L_0x01b3:
            if (r18 != 0) goto L_0x01b8
            r20.m874c(r21)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0262dq.mo1521a(dn):void");
    }

    /* renamed from: a */
    public final void mo1522a(C0259dn dnVar, int i, int i2) {
        dnVar.f1230d.mo1502a(mo1519a(i2), (float) i);
    }

    /* renamed from: a */
    public final void mo1523a(C0263a aVar) {
        float f;
        int i;
        boolean z;
        long j;
        long j2 = 1;
        if (f1235h != null) {
            C0264dr drVar = f1235h;
            drVar.f1276t++;
            f1235h.f1277u = Math.max(f1235h.f1277u, (long) this.f1241e);
            f1235h.f1278v = Math.max(f1235h.f1278v, (long) this.f1242f);
        }
        m873b((C0259dn) aVar);
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 < this.f1242f) {
                if (this.f1239c[i2].f1227a.f1295f != C0269a.f1300a && this.f1239c[i2].f1228b < 0.0f) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                if (f1235h != null) {
                    C0264dr drVar2 = f1235h;
                    drVar2.f1267k += j2;
                }
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f1242f) {
                    C0259dn dnVar = this.f1239c[i6];
                    if (dnVar.f1227a.f1295f != C0269a.f1300a && !dnVar.f1231e && dnVar.f1228b < f) {
                        int i8 = 1;
                        while (i8 < this.f1241e) {
                            C0268dt dtVar = this.f1243g.f1234c[i8];
                            float b = dnVar.f1230d.mo1505b(dtVar);
                            if (b > f) {
                                for (int i9 = 0; i9 < 7; i9++) {
                                    float f3 = dtVar.f1294e[i9] / b;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        i5 = i8;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    C0259dn dnVar2 = this.f1239c[i4];
                    dnVar2.f1227a.f1291b = -1;
                    if (f1235h != null) {
                        C0264dr drVar3 = f1235h;
                        j = 1;
                        drVar3.f1266j++;
                    } else {
                        j = 1;
                    }
                    dnVar2.mo1513a(this.f1243g.f1234c[i5]);
                    dnVar2.f1227a.f1291b = i4;
                    dnVar2.f1227a.mo1541c(dnVar2);
                } else {
                    j = 1;
                    z2 = true;
                }
                if (i3 > this.f1241e / 2) {
                    z2 = true;
                }
                j2 = j;
                f = 0.0f;
                i = 1;
            }
        }
        m870b(aVar);
        mo1533e();
    }

    /* renamed from: a */
    public final void mo1524a(C0268dt dtVar, int i) {
        C0258dm dmVar;
        float f;
        int i2 = dtVar.f1291b;
        if (dtVar.f1291b != -1) {
            C0259dn dnVar = this.f1239c[i2];
            if (dnVar.f1231e) {
                dnVar.f1228b = (float) i;
            } else if (dnVar.f1230d.f1216a == 0) {
                dnVar.f1231e = true;
                dnVar.f1228b = (float) i;
            } else {
                C0259dn c = mo1530c();
                if (i < 0) {
                    c.f1228b = (float) (-1 * i);
                    dmVar = c.f1230d;
                    f = 1.0f;
                } else {
                    c.f1228b = (float) i;
                    dmVar = c.f1230d;
                    f = -1.0f;
                }
                dmVar.mo1502a(dtVar, f);
                mo1521a(c);
            }
        } else {
            C0259dn c2 = mo1530c();
            c2.f1227a = dtVar;
            float f2 = (float) i;
            dtVar.f1293d = f2;
            c2.f1228b = f2;
            c2.f1231e = true;
            mo1521a(c2);
        }
    }

    /* renamed from: a */
    public final void mo1525a(C0268dt dtVar, C0268dt dtVar2, int i, float f, C0268dt dtVar3, C0268dt dtVar4, int i2, int i3) {
        float f2;
        C0259dn c = mo1530c();
        if (dtVar2 == dtVar3) {
            c.f1230d.mo1502a(dtVar, 1.0f);
            c.f1230d.mo1502a(dtVar4, 1.0f);
            c.f1230d.mo1502a(dtVar2, -2.0f);
        } else {
            if (f == 0.5f) {
                c.f1230d.mo1502a(dtVar, 1.0f);
                c.f1230d.mo1502a(dtVar2, -1.0f);
                c.f1230d.mo1502a(dtVar3, -1.0f);
                c.f1230d.mo1502a(dtVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    f2 = (float) ((-i) + i2);
                }
            } else if (f <= 0.0f) {
                c.f1230d.mo1502a(dtVar, -1.0f);
                c.f1230d.mo1502a(dtVar2, 1.0f);
                f2 = (float) i;
            } else if (f >= 1.0f) {
                c.f1230d.mo1502a(dtVar3, -1.0f);
                c.f1230d.mo1502a(dtVar4, 1.0f);
                f2 = (float) i2;
            } else {
                float f3 = 1.0f - f;
                c.f1230d.mo1502a(dtVar, 1.0f * f3);
                c.f1230d.mo1502a(dtVar2, -1.0f * f3);
                c.f1230d.mo1502a(dtVar3, -1.0f * f);
                c.f1230d.mo1502a(dtVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = (((float) (-i)) * f3) + (((float) i2) * f);
                }
            }
            c.f1228b = f2;
        }
        if (i3 != 6) {
            c.mo1507a(this, i3);
        }
        mo1521a(c);
    }

    /* renamed from: a */
    public final void mo1526a(C0268dt dtVar, C0268dt dtVar2, int i, int i2) {
        C0259dn c = mo1530c();
        C0268dt d = mo1532d();
        d.f1292c = 0;
        c.mo1508a(dtVar, dtVar2, d, i);
        if (i2 != 6) {
            mo1522a(c, (int) (-1.0f * c.f1230d.mo1505b(d)), i2);
        }
        mo1521a(c);
    }

    /* renamed from: a */
    public final void mo1527a(C0268dt dtVar, C0268dt dtVar2, C0268dt dtVar3, C0268dt dtVar4, float f) {
        C0259dn c = mo1530c();
        c.mo1509a(dtVar, dtVar2, dtVar3, dtVar4, f);
        mo1521a(c);
    }

    /* renamed from: b */
    public final void mo1528b() {
        for (C0268dt dtVar : this.f1243g.f1234c) {
            if (dtVar != null) {
                dtVar.mo1539b();
            }
        }
        this.f1243g.f1233b.mo1536a(this.f1249o, this.f1250p);
        this.f1250p = 0;
        Arrays.fill(this.f1243g.f1234c, null);
        if (this.f1244j != null) {
            this.f1244j.clear();
        }
        this.f1237a = 0;
        this.f1238b.mo1511a();
        this.f1241e = 1;
        for (int i = 0; i < this.f1242f; i++) {
            this.f1239c[i].f1229c = false;
        }
        m876g();
        this.f1242f = 0;
    }

    /* renamed from: b */
    public final void mo1529b(C0268dt dtVar, C0268dt dtVar2, int i, int i2) {
        C0259dn c = mo1530c();
        C0268dt d = mo1532d();
        d.f1292c = 0;
        c.mo1514b(dtVar, dtVar2, d, i);
        if (i2 != 6) {
            mo1522a(c, (int) (-1.0f * c.f1230d.mo1505b(d)), i2);
        }
        mo1521a(c);
    }

    /* renamed from: c */
    public final C0259dn mo1530c() {
        C0259dn dnVar = (C0259dn) this.f1243g.f1232a.mo1535a();
        if (dnVar == null) {
            dnVar = new C0259dn(this.f1243g);
        } else {
            dnVar.f1227a = null;
            dnVar.f1230d.mo1501a();
            dnVar.f1228b = 0.0f;
            dnVar.f1231e = false;
        }
        C0268dt.m903a();
        return dnVar;
    }

    /* renamed from: c */
    public final C0259dn mo1531c(C0268dt dtVar, C0268dt dtVar2, int i, int i2) {
        C0259dn c = mo1530c();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c.f1228b = (float) i;
        }
        if (!z) {
            c.f1230d.mo1502a(dtVar, -1.0f);
            c.f1230d.mo1502a(dtVar2, 1.0f);
        } else {
            c.f1230d.mo1502a(dtVar, 1.0f);
            c.f1230d.mo1502a(dtVar2, -1.0f);
        }
        if (i2 != 6) {
            c.mo1507a(this, i2);
        }
        mo1521a(c);
        return c;
    }

    /* renamed from: d */
    public final C0268dt mo1532d() {
        if (f1235h != null) {
            C0264dr drVar = f1235h;
            drVar.f1270n++;
        }
        if (this.f1241e + 1 >= this.f1246l) {
            m875f();
        }
        C0268dt b = m872b(C0269a.f1302c);
        this.f1237a++;
        this.f1241e++;
        b.f1290a = this.f1237a;
        this.f1243g.f1234c[this.f1237a] = b;
        return b;
    }

    /* renamed from: e */
    public final void mo1533e() {
        for (int i = 0; i < this.f1242f; i++) {
            C0259dn dnVar = this.f1239c[i];
            dnVar.f1227a.f1293d = dnVar.f1228b;
        }
    }
}
