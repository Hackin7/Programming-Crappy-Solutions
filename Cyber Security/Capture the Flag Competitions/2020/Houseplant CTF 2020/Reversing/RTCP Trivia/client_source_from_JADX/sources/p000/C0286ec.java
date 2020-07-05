package p000;

/* renamed from: ec */
public final class C0286ec {

    /* renamed from: a */
    static boolean[] f1458a = new boolean[3];

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r6 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r6 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (r6 != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        if (r6 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        if (r6 != false) goto L_0x00d9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m993a(int r17, p000.C0278dy r18) {
        /*
            r0 = r18
            r18.mo1572g()
            dx r1 = r0.f1416v
            ee r1 = r1.f1326a
            dx r2 = r0.f1417w
            ee r2 = r2.f1326a
            dx r3 = r0.f1418x
            ee r3 = r3.f1326a
            dx r4 = r0.f1419y
            ee r4 = r4.f1326a
            r5 = 8
            r6 = r17 & 8
            r7 = 0
            r8 = 1
            if (r6 != r5) goto L_0x001f
            r6 = r8
            goto L_0x0020
        L_0x001f:
            r6 = r7
        L_0x0020:
            int[] r9 = r0.f1360F
            r9 = r9[r7]
            int r10 = p000.C0278dy.C0280a.f1425c
            if (r9 != r10) goto L_0x0030
            boolean r9 = m996a(r0, r7)
            if (r9 == 0) goto L_0x0030
            r9 = r8
            goto L_0x0031
        L_0x0030:
            r9 = r7
        L_0x0031:
            int r10 = r1.f1465g
            r11 = 3
            r12 = 4
            r13 = 0
            r14 = -1
            r15 = 2
            if (r10 == r12) goto L_0x0169
            int r10 = r3.f1465g
            if (r10 == r12) goto L_0x0169
            int[] r10 = r0.f1360F
            r10 = r10[r7]
            int r7 = p000.C0278dy.C0280a.f1423a
            if (r10 == r7) goto L_0x00c7
            if (r9 == 0) goto L_0x004e
            int r7 = r0.f1378Y
            if (r7 != r5) goto L_0x004e
            goto L_0x00c7
        L_0x004e:
            if (r9 == 0) goto L_0x0169
            int r7 = r18.mo1580l()
            r1.f1465g = r8
            r3.f1465g = r8
            dx r9 = r0.f1416v
            dx r9 = r9.f1329d
            if (r9 != 0) goto L_0x0068
            dx r9 = r0.f1418x
            dx r9 = r9.f1329d
            if (r9 != 0) goto L_0x0068
            if (r6 == 0) goto L_0x00e6
            goto L_0x00d9
        L_0x0068:
            dx r9 = r0.f1416v
            dx r9 = r9.f1329d
            if (r9 == 0) goto L_0x0077
            dx r9 = r0.f1418x
            dx r9 = r9.f1329d
            if (r9 != 0) goto L_0x0077
            if (r6 == 0) goto L_0x00e6
            goto L_0x00d9
        L_0x0077:
            dx r9 = r0.f1416v
            dx r9 = r9.f1329d
            if (r9 != 0) goto L_0x0087
            dx r9 = r0.f1418x
            dx r9 = r9.f1329d
            if (r9 == 0) goto L_0x0087
            if (r6 == 0) goto L_0x0124
            goto L_0x0118
        L_0x0087:
            dx r9 = r0.f1416v
            dx r9 = r9.f1329d
            if (r9 == 0) goto L_0x0169
            dx r9 = r0.f1418x
            dx r9 = r9.f1329d
            if (r9 == 0) goto L_0x0169
            if (r6 == 0) goto L_0x00a3
            ef r9 = r18.mo1574h()
            r9.mo1647a(r1)
            ef r9 = r18.mo1574h()
            r9.mo1647a(r3)
        L_0x00a3:
            float r9 = r0.f1364J
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00b5
            r1.f1465g = r11
            r3.f1465g = r11
            r1.mo1642b(r3, r13)
            r3.mo1642b(r1, r13)
            goto L_0x0169
        L_0x00b5:
            r1.f1465g = r15
            r3.f1465g = r15
            int r9 = -r7
            float r9 = (float) r9
            r1.mo1642b(r3, r9)
            float r9 = (float) r7
            r3.mo1642b(r1, r9)
            r0.mo1565d(r7)
            goto L_0x0169
        L_0x00c7:
            dx r7 = r0.f1416v
            dx r7 = r7.f1329d
            if (r7 != 0) goto L_0x00eb
            dx r7 = r0.f1418x
            dx r7 = r7.f1329d
            if (r7 != 0) goto L_0x00eb
            r1.f1465g = r8
            r3.f1465g = r8
            if (r6 == 0) goto L_0x00e2
        L_0x00d9:
            ef r7 = r18.mo1574h()
            r3.mo1640a(r1, r8, r7)
            goto L_0x0169
        L_0x00e2:
            int r7 = r18.mo1580l()
        L_0x00e6:
            r3.mo1643b(r1, r7)
            goto L_0x0169
        L_0x00eb:
            dx r7 = r0.f1416v
            dx r7 = r7.f1329d
            if (r7 == 0) goto L_0x00fe
            dx r7 = r0.f1418x
            dx r7 = r7.f1329d
            if (r7 != 0) goto L_0x00fe
            r1.f1465g = r8
            r3.f1465g = r8
            if (r6 == 0) goto L_0x00e2
            goto L_0x00d9
        L_0x00fe:
            dx r7 = r0.f1416v
            dx r7 = r7.f1329d
            if (r7 != 0) goto L_0x0129
            dx r7 = r0.f1418x
            dx r7 = r7.f1329d
            if (r7 == 0) goto L_0x0129
            r1.f1465g = r8
            r3.f1465g = r8
            int r7 = r18.mo1580l()
            int r7 = -r7
            r1.mo1643b(r3, r7)
            if (r6 == 0) goto L_0x0120
        L_0x0118:
            ef r7 = r18.mo1574h()
            r1.mo1640a(r3, r14, r7)
            goto L_0x0169
        L_0x0120:
            int r7 = r18.mo1580l()
        L_0x0124:
            int r7 = -r7
            r1.mo1643b(r3, r7)
            goto L_0x0169
        L_0x0129:
            dx r7 = r0.f1416v
            dx r7 = r7.f1329d
            if (r7 == 0) goto L_0x0169
            dx r7 = r0.f1418x
            dx r7 = r7.f1329d
            if (r7 == 0) goto L_0x0169
            r1.f1465g = r15
            r3.f1465g = r15
            if (r6 == 0) goto L_0x0158
            ef r7 = r18.mo1574h()
            r7.mo1647a(r1)
            ef r7 = r18.mo1574h()
            r7.mo1647a(r3)
            ef r7 = r18.mo1574h()
            r1.mo1644b(r3, r14, r7)
            ef r7 = r18.mo1574h()
            r3.mo1644b(r1, r8, r7)
            goto L_0x0169
        L_0x0158:
            int r7 = r18.mo1580l()
            int r7 = -r7
            float r7 = (float) r7
            r1.mo1642b(r3, r7)
            int r7 = r18.mo1580l()
            float r7 = (float) r7
            r3.mo1642b(r1, r7)
        L_0x0169:
            int[] r1 = r0.f1360F
            r1 = r1[r8]
            int r3 = p000.C0278dy.C0280a.f1425c
            if (r1 != r3) goto L_0x017a
            boolean r1 = m996a(r0, r8)
            if (r1 == 0) goto L_0x017a
            r16 = r8
            goto L_0x017c
        L_0x017a:
            r16 = 0
        L_0x017c:
            int r1 = r2.f1465g
            if (r1 == r12) goto L_0x031c
            int r1 = r4.f1465g
            if (r1 == r12) goto L_0x031c
            int[] r1 = r0.f1360F
            r1 = r1[r8]
            int r3 = p000.C0278dy.C0280a.f1423a
            if (r1 == r3) goto L_0x0238
            if (r16 == 0) goto L_0x0194
            int r1 = r0.f1378Y
            if (r1 != r5) goto L_0x0194
            goto L_0x0238
        L_0x0194:
            if (r16 == 0) goto L_0x031c
            int r1 = r18.mo1581m()
            r2.f1465g = r8
            r4.f1465g = r8
            dx r3 = r0.f1417w
            dx r3 = r3.f1329d
            if (r3 != 0) goto L_0x01b8
            dx r3 = r0.f1419y
            dx r3 = r3.f1329d
            if (r3 != 0) goto L_0x01b8
            if (r6 == 0) goto L_0x01b4
            ef r0 = r18.mo1576i()
            r4.mo1640a(r2, r8, r0)
            return
        L_0x01b4:
            r4.mo1643b(r2, r1)
            return
        L_0x01b8:
            dx r3 = r0.f1417w
            dx r3 = r3.f1329d
            if (r3 == 0) goto L_0x01d2
            dx r3 = r0.f1419y
            dx r3 = r3.f1329d
            if (r3 != 0) goto L_0x01d2
            if (r6 == 0) goto L_0x01ce
            ef r0 = r18.mo1576i()
            r4.mo1640a(r2, r8, r0)
            return
        L_0x01ce:
            r4.mo1643b(r2, r1)
            return
        L_0x01d2:
            dx r3 = r0.f1417w
            dx r3 = r3.f1329d
            if (r3 != 0) goto L_0x01ed
            dx r3 = r0.f1419y
            dx r3 = r3.f1329d
            if (r3 == 0) goto L_0x01ed
            if (r6 == 0) goto L_0x01e8
            ef r0 = r18.mo1576i()
            r2.mo1640a(r4, r14, r0)
            return
        L_0x01e8:
            int r0 = -r1
            r2.mo1643b(r4, r0)
            return
        L_0x01ed:
            dx r3 = r0.f1417w
            dx r3 = r3.f1329d
            if (r3 == 0) goto L_0x031c
            dx r3 = r0.f1419y
            dx r3 = r3.f1329d
            if (r3 == 0) goto L_0x031c
            if (r6 == 0) goto L_0x0209
            ef r3 = r18.mo1576i()
            r3.mo1647a(r2)
            ef r3 = r18.mo1574h()
            r3.mo1647a(r4)
        L_0x0209:
            float r3 = r0.f1364J
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x021a
            r2.f1465g = r11
            r4.f1465g = r11
            r2.mo1642b(r4, r13)
            r4.mo1642b(r2, r13)
            return
        L_0x021a:
            r2.f1465g = r15
            r4.f1465g = r15
            int r3 = -r1
            float r3 = (float) r3
            r2.mo1642b(r4, r3)
            float r3 = (float) r1
            r4.mo1642b(r2, r3)
            r0.mo1568e(r1)
            int r1 = r0.f1370P
            if (r1 <= 0) goto L_0x031c
            dx r1 = r0.f1420z
            ee r1 = r1.f1326a
            int r0 = r0.f1370P
            r1.mo1639a(r2, r0)
            return
        L_0x0238:
            dx r1 = r0.f1417w
            dx r1 = r1.f1329d
            if (r1 != 0) goto L_0x0270
            dx r1 = r0.f1419y
            dx r1 = r1.f1329d
            if (r1 != 0) goto L_0x0270
            r2.f1465g = r8
            r4.f1465g = r8
            if (r6 == 0) goto L_0x0252
            ef r1 = r18.mo1576i()
            r4.mo1640a(r2, r8, r1)
            goto L_0x0259
        L_0x0252:
            int r1 = r18.mo1581m()
            r4.mo1643b(r2, r1)
        L_0x0259:
            dx r1 = r0.f1420z
            dx r1 = r1.f1329d
            if (r1 == 0) goto L_0x031c
            dx r1 = r0.f1420z
            ee r1 = r1.f1326a
            r1.f1465g = r8
            dx r1 = r0.f1420z
            ee r1 = r1.f1326a
            int r0 = r0.f1370P
            int r0 = -r0
            r2.mo1639a(r1, r0)
            return
        L_0x0270:
            dx r1 = r0.f1417w
            dx r1 = r1.f1329d
            if (r1 == 0) goto L_0x029f
            dx r1 = r0.f1419y
            dx r1 = r1.f1329d
            if (r1 != 0) goto L_0x029f
            r2.f1465g = r8
            r4.f1465g = r8
            if (r6 == 0) goto L_0x028a
            ef r1 = r18.mo1576i()
            r4.mo1640a(r2, r8, r1)
            goto L_0x0291
        L_0x028a:
            int r1 = r18.mo1581m()
            r4.mo1643b(r2, r1)
        L_0x0291:
            int r1 = r0.f1370P
            if (r1 <= 0) goto L_0x031c
            dx r1 = r0.f1420z
            ee r1 = r1.f1326a
            int r0 = r0.f1370P
            r1.mo1639a(r2, r0)
            return
        L_0x029f:
            dx r1 = r0.f1417w
            dx r1 = r1.f1329d
            if (r1 != 0) goto L_0x02cf
            dx r1 = r0.f1419y
            dx r1 = r1.f1329d
            if (r1 == 0) goto L_0x02cf
            r2.f1465g = r8
            r4.f1465g = r8
            if (r6 == 0) goto L_0x02b9
            ef r1 = r18.mo1576i()
            r2.mo1640a(r4, r14, r1)
            goto L_0x02c1
        L_0x02b9:
            int r1 = r18.mo1581m()
            int r1 = -r1
            r2.mo1643b(r4, r1)
        L_0x02c1:
            int r1 = r0.f1370P
            if (r1 <= 0) goto L_0x031c
            dx r1 = r0.f1420z
            ee r1 = r1.f1326a
            int r0 = r0.f1370P
            r1.mo1639a(r2, r0)
            return
        L_0x02cf:
            dx r1 = r0.f1417w
            dx r1 = r1.f1329d
            if (r1 == 0) goto L_0x031c
            dx r1 = r0.f1419y
            dx r1 = r1.f1329d
            if (r1 == 0) goto L_0x031c
            r2.f1465g = r15
            r4.f1465g = r15
            if (r6 == 0) goto L_0x02fe
            ef r1 = r18.mo1576i()
            r2.mo1644b(r4, r14, r1)
            ef r1 = r18.mo1576i()
            r4.mo1644b(r2, r8, r1)
            ef r1 = r18.mo1576i()
            r1.mo1647a(r2)
            ef r1 = r18.mo1574h()
            r1.mo1647a(r4)
            goto L_0x030f
        L_0x02fe:
            int r1 = r18.mo1581m()
            int r1 = -r1
            float r1 = (float) r1
            r2.mo1642b(r4, r1)
            int r1 = r18.mo1581m()
            float r1 = (float) r1
            r4.mo1642b(r2, r1)
        L_0x030f:
            int r1 = r0.f1370P
            if (r1 <= 0) goto L_0x031c
            dx r1 = r0.f1420z
            ee r1 = r1.f1326a
            int r0 = r0.f1370P
            r1.mo1639a(r2, r0)
        L_0x031c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0286ec.m993a(int, dy):void");
    }

    /* renamed from: a */
    static void m994a(C0281dz dzVar, C0262dq dqVar, C0278dy dyVar) {
        if (dzVar.f1360F[0] != C0280a.f1424b && dyVar.f1360F[0] == C0280a.f1426d) {
            int i = dyVar.f1416v.f1330e;
            int l = dzVar.mo1580l() - dyVar.f1418x.f1330e;
            dyVar.f1416v.f1334i = dqVar.mo1520a((Object) dyVar.f1416v);
            dyVar.f1418x.f1334i = dqVar.mo1520a((Object) dyVar.f1418x);
            dqVar.mo1524a(dyVar.f1416v.f1334i, i);
            dqVar.mo1524a(dyVar.f1418x.f1334i, l);
            dyVar.f1397c = 2;
            dyVar.mo1564c(i, l);
        }
        if (dzVar.f1360F[1] != C0280a.f1424b && dyVar.f1360F[1] == C0280a.f1426d) {
            int i2 = dyVar.f1417w.f1330e;
            int m = dzVar.mo1581m() - dyVar.f1419y.f1330e;
            dyVar.f1417w.f1334i = dqVar.mo1520a((Object) dyVar.f1417w);
            dyVar.f1419y.f1334i = dqVar.mo1520a((Object) dyVar.f1419y);
            dqVar.mo1524a(dyVar.f1417w.f1334i, i2);
            dqVar.mo1524a(dyVar.f1419y.f1334i, m);
            if (dyVar.f1370P > 0 || dyVar.f1378Y == 8) {
                dyVar.f1420z.f1334i = dqVar.mo1520a((Object) dyVar.f1420z);
                dqVar.mo1524a(dyVar.f1420z.f1334i, dyVar.f1370P + i2);
            }
            dyVar.f1398d = 2;
            dyVar.mo1566d(i2, m);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r6.f1383ac == 2) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r6.f1384ad == 2) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m995a(p000.C0262dq r21, int r22, int r23, p000.C0272dw r24) {
        /*
            r0 = r21
            r1 = r24
            dy r2 = r1.f1309a
            dy r3 = r1.f1311c
            dy r4 = r1.f1310b
            dy r5 = r1.f1312d
            dy r6 = r1.f1313e
            float r1 = r1.f1319k
            int r7 = p000.C0278dy.C0280a.f1424b
            r7 = 2
            r9 = 1
            if (r22 != 0) goto L_0x002c
            int r10 = r6.f1383ac
            if (r10 != 0) goto L_0x001c
            r10 = r9
            goto L_0x001d
        L_0x001c:
            r10 = 0
        L_0x001d:
            int r11 = r6.f1383ac
            if (r11 != r9) goto L_0x0023
            r11 = r9
            goto L_0x0024
        L_0x0023:
            r11 = 0
        L_0x0024:
            int r6 = r6.f1383ac
            if (r6 != r7) goto L_0x002a
        L_0x0028:
            r6 = r9
            goto L_0x003f
        L_0x002a:
            r6 = 0
            goto L_0x003f
        L_0x002c:
            int r10 = r6.f1384ad
            if (r10 != 0) goto L_0x0032
            r10 = r9
            goto L_0x0033
        L_0x0032:
            r10 = 0
        L_0x0033:
            int r11 = r6.f1384ad
            if (r11 != r9) goto L_0x0039
            r11 = r9
            goto L_0x003a
        L_0x0039:
            r11 = 0
        L_0x003a:
            int r6 = r6.f1384ad
            if (r6 != r7) goto L_0x002a
            goto L_0x0028
        L_0x003f:
            r13 = r2
            r7 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x0045:
            if (r12 != 0) goto L_0x00df
            int r8 = r13.f1378Y
            r16 = r12
            r12 = 8
            if (r8 == r12) goto L_0x0081
            int r7 = r7 + 1
            if (r22 != 0) goto L_0x005a
            int r8 = r13.mo1580l()
        L_0x0057:
            float r8 = (float) r8
            float r14 = r14 + r8
            goto L_0x005f
        L_0x005a:
            int r8 = r13.mo1581m()
            goto L_0x0057
        L_0x005f:
            if (r13 == r4) goto L_0x006b
            dx[] r8 = r13.f1358D
            r8 = r8[r23]
            int r8 = r8.mo1551b()
            float r8 = (float) r8
            float r14 = r14 + r8
        L_0x006b:
            dx[] r8 = r13.f1358D
            r8 = r8[r23]
            int r8 = r8.mo1551b()
            float r8 = (float) r8
            float r15 = r15 + r8
            dx[] r8 = r13.f1358D
            int r17 = r23 + 1
            r8 = r8[r17]
            int r8 = r8.mo1551b()
            float r8 = (float) r8
            float r15 = r15 + r8
        L_0x0081:
            int r8 = r13.f1378Y
            if (r8 == r12) goto L_0x00b0
            int[] r8 = r13.f1360F
            r8 = r8[r22]
            int r12 = p000.C0278dy.C0280a.f1425c
            if (r8 != r12) goto L_0x00b0
            int r9 = r9 + 1
            if (r22 != 0) goto L_0x00a1
            int r8 = r13.f1401g
            if (r8 == 0) goto L_0x0097
            r8 = 0
            return r8
        L_0x0097:
            r8 = 0
            int r12 = r13.f1404j
            if (r12 != 0) goto L_0x00a0
            int r12 = r13.f1405k
            if (r12 == 0) goto L_0x00b0
        L_0x00a0:
            return r8
        L_0x00a1:
            r8 = 0
            int r12 = r13.f1402h
            if (r12 == 0) goto L_0x00a7
            return r8
        L_0x00a7:
            int r12 = r13.f1407m
            if (r12 != 0) goto L_0x00af
            int r12 = r13.f1408n
            if (r12 == 0) goto L_0x00b0
        L_0x00af:
            return r8
        L_0x00b0:
            dx[] r8 = r13.f1358D
            int r12 = r23 + 1
            r8 = r8[r12]
            dx r8 = r8.f1329d
            if (r8 == 0) goto L_0x00d2
            dy r8 = r8.f1327b
            dx[] r12 = r8.f1358D
            r12 = r12[r23]
            dx r12 = r12.f1329d
            if (r12 == 0) goto L_0x00d2
            dx[] r12 = r8.f1358D
            r12 = r12[r23]
            dx r12 = r12.f1329d
            dy r12 = r12.f1327b
            if (r12 == r13) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            r18 = r8
            goto L_0x00d4
        L_0x00d2:
            r18 = 0
        L_0x00d4:
            if (r18 == 0) goto L_0x00dc
            r12 = r16
            r13 = r18
            goto L_0x0045
        L_0x00dc:
            r12 = 1
            goto L_0x0045
        L_0x00df:
            dx[] r8 = r2.f1358D
            r8 = r8[r23]
            ee r8 = r8.f1326a
            dx[] r3 = r3.f1358D
            int r12 = r23 + 1
            r3 = r3[r12]
            ee r3 = r3.f1326a
            r19 = r2
            ee r2 = r8.f1461c
            if (r2 == 0) goto L_0x031a
            ee r2 = r3.f1461c
            if (r2 != 0) goto L_0x00f9
            goto L_0x031a
        L_0x00f9:
            ee r2 = r8.f1461c
            int r2 = r2.f1474i
            r0 = 1
            if (r2 == r0) goto L_0x0108
            ee r2 = r3.f1461c
            int r2 = r2.f1474i
            if (r2 == r0) goto L_0x0108
            r0 = 0
            return r0
        L_0x0108:
            r0 = 0
            if (r9 <= 0) goto L_0x010e
            if (r9 == r7) goto L_0x010e
            return r0
        L_0x010e:
            if (r6 != 0) goto L_0x0117
            if (r10 != 0) goto L_0x0117
            if (r11 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            r0 = 0
            goto L_0x0130
        L_0x0117:
            if (r4 == 0) goto L_0x0123
            dx[] r0 = r4.f1358D
            r0 = r0[r23]
            int r0 = r0.mo1551b()
            float r0 = (float) r0
            goto L_0x0124
        L_0x0123:
            r0 = 0
        L_0x0124:
            if (r5 == 0) goto L_0x0130
            dx[] r2 = r5.f1358D
            r2 = r2[r12]
            int r2 = r2.mo1551b()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x0130:
            ee r2 = r8.f1461c
            float r2 = r2.f1464f
            ee r3 = r3.f1461c
            float r3 = r3.f1464f
            int r16 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r16 >= 0) goto L_0x013f
            float r3 = r3 - r2
        L_0x013d:
            float r3 = r3 - r14
            goto L_0x0142
        L_0x013f:
            float r3 = r2 - r3
            goto L_0x013d
        L_0x0142:
            r16 = 1
            if (r9 <= 0) goto L_0x01f6
            if (r9 != r7) goto L_0x01f6
            dy r6 = r13.f1361G
            if (r6 == 0) goto L_0x0158
            dy r6 = r13.f1361G
            int[] r6 = r6.f1360F
            r6 = r6[r22]
            int r7 = p000.C0278dy.C0280a.f1424b
            if (r6 != r7) goto L_0x0158
            r6 = 0
            return r6
        L_0x0158:
            float r3 = r3 + r14
            float r3 = r3 - r15
            if (r10 == 0) goto L_0x015e
            float r15 = r15 - r0
            float r3 = r3 - r15
        L_0x015e:
            if (r10 == 0) goto L_0x017a
            dx[] r0 = r4.f1358D
            r0 = r0[r12]
            int r0 = r0.mo1551b()
            float r0 = (float) r0
            float r2 = r2 + r0
            dy[] r0 = r4.f1389ai
            r0 = r0[r22]
            if (r0 == 0) goto L_0x017a
            dx[] r0 = r0.f1358D
            r0 = r0[r23]
            int r0 = r0.mo1551b()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x017a:
            if (r4 == 0) goto L_0x01f4
            dr r0 = p000.C0262dq.f1235h
            if (r0 == 0) goto L_0x0198
            dr r0 = p000.C0262dq.f1235h
            long r6 = r0.f1254B
            long r6 = r6 - r16
            r0.f1254B = r6
            dr r0 = p000.C0262dq.f1235h
            long r6 = r0.f1275s
            long r6 = r6 + r16
            r0.f1275s = r6
            dr r0 = p000.C0262dq.f1235h
            long r6 = r0.f1281y
            long r6 = r6 + r16
            r0.f1281y = r6
        L_0x0198:
            dy[] r0 = r4.f1389ai
            r0 = r0[r22]
            if (r0 != 0) goto L_0x01a5
            if (r4 != r5) goto L_0x01a1
            goto L_0x01a5
        L_0x01a1:
            r7 = 0
            r13 = r21
            goto L_0x01f2
        L_0x01a5:
            float r6 = (float) r9
            float r6 = r3 / r6
            r7 = 0
            int r10 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b3
            float[] r6 = r4.f1387ag
            r6 = r6[r22]
            float r6 = r6 * r3
            float r6 = r6 / r1
        L_0x01b3:
            dx[] r10 = r4.f1358D
            r10 = r10[r23]
            int r10 = r10.mo1551b()
            float r10 = (float) r10
            float r2 = r2 + r10
            dx[] r10 = r4.f1358D
            r10 = r10[r23]
            ee r10 = r10.f1326a
            ee r11 = r8.f1463e
            r10.mo1638a(r11, r2)
            dx[] r10 = r4.f1358D
            r10 = r10[r12]
            ee r10 = r10.f1326a
            ee r11 = r8.f1463e
            float r2 = r2 + r6
            r10.mo1638a(r11, r2)
            dx[] r6 = r4.f1358D
            r6 = r6[r23]
            ee r6 = r6.f1326a
            r13 = r21
            r6.mo1637a(r13)
            dx[] r6 = r4.f1358D
            r6 = r6[r12]
            ee r6 = r6.f1326a
            r6.mo1637a(r13)
            dx[] r4 = r4.f1358D
            r4 = r4[r12]
            int r4 = r4.mo1551b()
            float r4 = (float) r4
            float r2 = r2 + r4
        L_0x01f2:
            r4 = r0
            goto L_0x017a
        L_0x01f4:
            r0 = 1
            return r0
        L_0x01f6:
            r13 = r21
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x01fe
            r1 = 0
            return r1
        L_0x01fe:
            if (r6 == 0) goto L_0x027b
            float r3 = r3 - r0
            r0 = r19
            float r0 = r0.f1375V
            float r3 = r3 * r0
            float r2 = r2 + r3
        L_0x0207:
            if (r4 == 0) goto L_0x0279
            dr r0 = p000.C0262dq.f1235h
            if (r0 == 0) goto L_0x0225
            dr r0 = p000.C0262dq.f1235h
            long r6 = r0.f1254B
            long r6 = r6 - r16
            r0.f1254B = r6
            dr r0 = p000.C0262dq.f1235h
            long r6 = r0.f1275s
            long r6 = r6 + r16
            r0.f1275s = r6
            dr r0 = p000.C0262dq.f1235h
            long r6 = r0.f1281y
            long r6 = r6 + r16
            r0.f1281y = r6
        L_0x0225:
            dy[] r0 = r4.f1389ai
            r0 = r0[r22]
            if (r0 != 0) goto L_0x022d
            if (r4 != r5) goto L_0x0277
        L_0x022d:
            if (r22 != 0) goto L_0x0235
            int r1 = r4.mo1580l()
        L_0x0233:
            float r1 = (float) r1
            goto L_0x023a
        L_0x0235:
            int r1 = r4.mo1581m()
            goto L_0x0233
        L_0x023a:
            dx[] r3 = r4.f1358D
            r3 = r3[r23]
            int r3 = r3.mo1551b()
            float r3 = (float) r3
            float r2 = r2 + r3
            dx[] r3 = r4.f1358D
            r3 = r3[r23]
            ee r3 = r3.f1326a
            ee r6 = r8.f1463e
            r3.mo1638a(r6, r2)
            dx[] r3 = r4.f1358D
            r3 = r3[r12]
            ee r3 = r3.f1326a
            ee r6 = r8.f1463e
            float r2 = r2 + r1
            r3.mo1638a(r6, r2)
            dx[] r1 = r4.f1358D
            r1 = r1[r23]
            ee r1 = r1.f1326a
            r1.mo1637a(r13)
            dx[] r1 = r4.f1358D
            r1 = r1[r12]
            ee r1 = r1.f1326a
            r1.mo1637a(r13)
            dx[] r1 = r4.f1358D
            r1 = r1[r12]
            int r1 = r1.mo1551b()
            float r1 = (float) r1
            float r2 = r2 + r1
        L_0x0277:
            r4 = r0
            goto L_0x0207
        L_0x0279:
            r0 = 1
            return r0
        L_0x027b:
            if (r10 != 0) goto L_0x027f
            if (r11 == 0) goto L_0x0279
        L_0x027f:
            if (r10 == 0) goto L_0x0283
        L_0x0281:
            float r3 = r3 - r0
            goto L_0x0286
        L_0x0283:
            if (r11 == 0) goto L_0x0286
            goto L_0x0281
        L_0x0286:
            int r0 = r7 + 1
            float r0 = (float) r0
            float r0 = r3 / r0
            if (r11 == 0) goto L_0x0299
            r1 = 1
            if (r7 <= r1) goto L_0x0296
            int r0 = r7 + -1
            float r0 = (float) r0
        L_0x0293:
            float r0 = r3 / r0
            goto L_0x0299
        L_0x0296:
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x0293
        L_0x0299:
            float r1 = r2 + r0
            if (r11 == 0) goto L_0x02aa
            r3 = 1
            if (r7 <= r3) goto L_0x02aa
            dx[] r1 = r4.f1358D
            r1 = r1[r23]
            int r1 = r1.mo1551b()
            float r1 = (float) r1
            float r1 = r1 + r2
        L_0x02aa:
            if (r10 == 0) goto L_0x02b8
            if (r4 == 0) goto L_0x02b8
            dx[] r2 = r4.f1358D
            r2 = r2[r23]
            int r2 = r2.mo1551b()
            float r2 = (float) r2
            float r1 = r1 + r2
        L_0x02b8:
            if (r4 == 0) goto L_0x0279
            dr r2 = p000.C0262dq.f1235h
            if (r2 == 0) goto L_0x02d6
            dr r2 = p000.C0262dq.f1235h
            long r6 = r2.f1254B
            long r6 = r6 - r16
            r2.f1254B = r6
            dr r2 = p000.C0262dq.f1235h
            long r6 = r2.f1275s
            long r6 = r6 + r16
            r2.f1275s = r6
            dr r2 = p000.C0262dq.f1235h
            long r6 = r2.f1281y
            long r6 = r6 + r16
            r2.f1281y = r6
        L_0x02d6:
            dy[] r2 = r4.f1389ai
            r2 = r2[r22]
            if (r2 != 0) goto L_0x02de
            if (r4 != r5) goto L_0x0317
        L_0x02de:
            if (r22 != 0) goto L_0x02e6
            int r3 = r4.mo1580l()
        L_0x02e4:
            float r3 = (float) r3
            goto L_0x02eb
        L_0x02e6:
            int r3 = r4.mo1581m()
            goto L_0x02e4
        L_0x02eb:
            dx[] r6 = r4.f1358D
            r6 = r6[r23]
            ee r6 = r6.f1326a
            ee r7 = r8.f1463e
            r6.mo1638a(r7, r1)
            dx[] r6 = r4.f1358D
            r6 = r6[r12]
            ee r6 = r6.f1326a
            ee r7 = r8.f1463e
            float r9 = r1 + r3
            r6.mo1638a(r7, r9)
            dx[] r6 = r4.f1358D
            r6 = r6[r23]
            ee r6 = r6.f1326a
            r6.mo1637a(r13)
            dx[] r4 = r4.f1358D
            r4 = r4[r12]
            ee r4 = r4.f1326a
            r4.mo1637a(r13)
            float r3 = r3 + r0
            float r1 = r1 + r3
        L_0x0317:
            r4 = r2
            goto L_0x02b8
            return r0
        L_0x031a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0286ec.m995a(dq, int, int, dw):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m996a(p000.C0278dy r3, int r4) {
        /*
            int[] r0 = r3.f1360F
            r0 = r0[r4]
            int r1 = p000.C0278dy.C0280a.f1425c
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            float r0 = r3.f1364J
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x001f
            int[] r3 = r3.f1360F
            if (r4 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            r3 = r3[r1]
            int r4 = p000.C0278dy.C0280a.f1425c
            if (r3 != r4) goto L_0x001e
        L_0x001e:
            return r2
        L_0x001f:
            if (r4 != 0) goto L_0x002f
            int r4 = r3.f1401g
            if (r4 == 0) goto L_0x0026
            return r2
        L_0x0026:
            int r4 = r3.f1404j
            if (r4 != 0) goto L_0x002e
            int r3 = r3.f1405k
            if (r3 == 0) goto L_0x003d
        L_0x002e:
            return r2
        L_0x002f:
            int r4 = r3.f1402h
            if (r4 == 0) goto L_0x0034
            return r2
        L_0x0034:
            int r4 = r3.f1407m
            if (r4 != 0) goto L_0x003e
            int r3 = r3.f1408n
            if (r3 == 0) goto L_0x003d
            return r2
        L_0x003d:
            return r1
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0286ec.m996a(dy, int):boolean");
    }
}
