package p000;

/* renamed from: dv */
final class C0271dv {
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0427 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m913a(p000.C0281dz r47, p000.C0262dq r48, int r49) {
        /*
            r0 = r47
            r10 = r48
            r11 = r49
            if (r11 != 0) goto L_0x0010
            int r1 = r0.f1433ap
            dw[] r2 = r0.f1436as
            r9 = r1
            r14 = r2
            r15 = 0
            goto L_0x0017
        L_0x0010:
            int r1 = r0.f1434aq
            dw[] r2 = r0.f1435ar
            r9 = r1
            r14 = r2
            r15 = 2
        L_0x0017:
            r8 = 0
        L_0x0018:
            if (r8 >= r9) goto L_0x0607
            r1 = r14[r8]
            boolean r2 = r1.f1323o
            if (r2 != 0) goto L_0x0023
            r1.mo1548a()
        L_0x0023:
            r2 = 1
            r1.f1323o = r2
            r7 = 4
            boolean r3 = r0.mo1601j(r7)
            if (r3 == 0) goto L_0x003e
            boolean r3 = p000.C0286ec.m995a(r10, r11, r15, r1)
            if (r3 != 0) goto L_0x0034
            goto L_0x003e
        L_0x0034:
            r40 = r8
            r17 = r9
            r31 = r14
            r16 = 0
            goto L_0x05fd
        L_0x003e:
            dy r6 = r1.f1309a
            dy r5 = r1.f1311c
            dy r4 = r1.f1310b
            dy r3 = r1.f1312d
            dy r7 = r1.f1313e
            float r13 = r1.f1319k
            int[] r12 = r0.f1360F
            r12 = r12[r11]
            int r2 = p000.C0278dy.C0280a.f1424b
            if (r12 != r2) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r11 != 0) goto L_0x007d
            int r12 = r7.f1383ac
            if (r12 != 0) goto L_0x005f
            r20 = r8
            r12 = 1
            goto L_0x0062
        L_0x005f:
            r20 = r8
            r12 = 0
        L_0x0062:
            int r8 = r7.f1383ac
            r21 = r9
            r9 = 1
            if (r8 != r9) goto L_0x006b
            r8 = 1
            goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            int r9 = r7.f1383ac
            r22 = r8
            r8 = 2
            if (r9 != r8) goto L_0x0075
            r8 = 1
            goto L_0x0076
        L_0x0075:
            r8 = 0
        L_0x0076:
            r9 = r6
            r18 = r8
            r23 = r12
            r8 = 0
            goto L_0x00a0
        L_0x007d:
            r20 = r8
            r21 = r9
            int r8 = r7.f1384ad
            if (r8 != 0) goto L_0x0087
            r12 = 1
            goto L_0x0088
        L_0x0087:
            r12 = 0
        L_0x0088:
            int r8 = r7.f1384ad
            r9 = 1
            if (r8 != r9) goto L_0x008f
            r8 = 1
            goto L_0x0090
        L_0x008f:
            r8 = 0
        L_0x0090:
            int r9 = r7.f1384ad
            r23 = r12
            r12 = 2
            if (r9 != r12) goto L_0x0099
            r9 = 1
            goto L_0x009a
        L_0x0099:
            r9 = 0
        L_0x009a:
            r22 = r8
            r18 = r9
            r8 = 0
            r9 = r6
        L_0x00a0:
            r25 = 0
            if (r8 != 0) goto L_0x0186
            dx[] r12 = r9.f1358D
            r12 = r12[r15]
            if (r2 != 0) goto L_0x00b0
            if (r18 == 0) goto L_0x00ad
            goto L_0x00b0
        L_0x00ad:
            r27 = 4
            goto L_0x00b2
        L_0x00b0:
            r27 = 1
        L_0x00b2:
            int r28 = r12.mo1551b()
            r29 = r8
            dx r8 = r12.f1329d
            if (r8 == 0) goto L_0x00c6
            if (r9 == r6) goto L_0x00c6
            dx r8 = r12.f1329d
            int r8 = r8.mo1551b()
            int r28 = r28 + r8
        L_0x00c6:
            r8 = r28
            if (r18 == 0) goto L_0x00d4
            if (r9 == r6) goto L_0x00d4
            if (r9 == r4) goto L_0x00d4
            r30 = r13
            r31 = r14
            r13 = 6
            goto L_0x00e4
        L_0x00d4:
            if (r23 == 0) goto L_0x00de
            if (r2 == 0) goto L_0x00de
            r30 = r13
            r31 = r14
            r13 = 4
            goto L_0x00e4
        L_0x00de:
            r30 = r13
            r31 = r14
            r13 = r27
        L_0x00e4:
            dx r14 = r12.f1329d
            if (r14 == 0) goto L_0x0111
            if (r9 != r4) goto L_0x00f9
            dt r14 = r12.f1334i
            r32 = r7
            dx r7 = r12.f1329d
            dt r7 = r7.f1334i
            r33 = r6
            r6 = 5
            r10.mo1526a(r14, r7, r8, r6)
            goto L_0x0107
        L_0x00f9:
            r33 = r6
            r32 = r7
            dt r6 = r12.f1334i
            dx r7 = r12.f1329d
            dt r7 = r7.f1334i
            r14 = 6
            r10.mo1526a(r6, r7, r8, r14)
        L_0x0107:
            dt r6 = r12.f1334i
            dx r7 = r12.f1329d
            dt r7 = r7.f1334i
            r10.mo1531c(r6, r7, r8, r13)
            goto L_0x0115
        L_0x0111:
            r33 = r6
            r32 = r7
        L_0x0115:
            if (r2 == 0) goto L_0x014a
            int r6 = r9.f1378Y
            r7 = 8
            if (r6 == r7) goto L_0x0139
            int[] r6 = r9.f1360F
            r6 = r6[r11]
            int r7 = p000.C0278dy.C0280a.f1425c
            if (r6 != r7) goto L_0x0139
            dx[] r6 = r9.f1358D
            int r7 = r15 + 1
            r6 = r6[r7]
            dt r6 = r6.f1334i
            dx[] r7 = r9.f1358D
            r7 = r7[r15]
            dt r7 = r7.f1334i
            r8 = 0
            r12 = 5
            r10.mo1526a(r6, r7, r8, r12)
            goto L_0x013a
        L_0x0139:
            r8 = 0
        L_0x013a:
            dx[] r6 = r9.f1358D
            r6 = r6[r15]
            dt r6 = r6.f1334i
            dx[] r7 = r0.f1358D
            r7 = r7[r15]
            dt r7 = r7.f1334i
            r12 = 6
            r10.mo1526a(r6, r7, r8, r12)
        L_0x014a:
            dx[] r6 = r9.f1358D
            int r7 = r15 + 1
            r6 = r6[r7]
            dx r6 = r6.f1329d
            if (r6 == 0) goto L_0x016b
            dy r6 = r6.f1327b
            dx[] r7 = r6.f1358D
            r7 = r7[r15]
            dx r7 = r7.f1329d
            if (r7 == 0) goto L_0x016b
            dx[] r7 = r6.f1358D
            r7 = r7[r15]
            dx r7 = r7.f1329d
            dy r7 = r7.f1327b
            if (r7 == r9) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r25 = r6
        L_0x016b:
            if (r25 == 0) goto L_0x017b
            r9 = r25
            r8 = r29
            r13 = r30
            r14 = r31
            r7 = r32
            r6 = r33
            goto L_0x00a0
        L_0x017b:
            r13 = r30
            r14 = r31
            r7 = r32
            r6 = r33
            r8 = 1
            goto L_0x00a0
        L_0x0186:
            r33 = r6
            r32 = r7
            r30 = r13
            r31 = r14
            if (r3 == 0) goto L_0x01b1
            dx[] r6 = r5.f1358D
            int r7 = r15 + 1
            r6 = r6[r7]
            dx r6 = r6.f1329d
            if (r6 == 0) goto L_0x01b1
            dx[] r6 = r3.f1358D
            r6 = r6[r7]
            dt r8 = r6.f1334i
            dx[] r9 = r5.f1358D
            r7 = r9[r7]
            dx r7 = r7.f1329d
            dt r7 = r7.f1334i
            int r6 = r6.mo1551b()
            int r6 = -r6
            r9 = 5
            r10.mo1529b(r8, r7, r6, r9)
        L_0x01b1:
            if (r2 == 0) goto L_0x01cd
            dx[] r2 = r0.f1358D
            int r6 = r15 + 1
            r2 = r2[r6]
            dt r2 = r2.f1334i
            dx[] r7 = r5.f1358D
            r7 = r7[r6]
            dt r7 = r7.f1334i
            dx[] r8 = r5.f1358D
            r6 = r8[r6]
            int r6 = r6.mo1551b()
            r8 = 6
            r10.mo1526a(r2, r7, r6, r8)
        L_0x01cd:
            java.util.ArrayList<dy> r2 = r1.f1316h
            if (r2 == 0) goto L_0x02fc
            int r6 = r2.size()
            r9 = 1
            if (r6 <= r9) goto L_0x02fc
            boolean r7 = r1.f1320l
            if (r7 == 0) goto L_0x01e4
            boolean r7 = r1.f1322n
            if (r7 != 0) goto L_0x01e4
            int r7 = r1.f1318j
            float r13 = (float) r7
            goto L_0x01e6
        L_0x01e4:
            r13 = r30
        L_0x01e6:
            r7 = 0
            r14 = r7
            r12 = r25
            r8 = 0
        L_0x01eb:
            if (r8 >= r6) goto L_0x02fc
            java.lang.Object r19 = r2.get(r8)
            r9 = r19
            dy r9 = (p000.C0278dy) r9
            float[] r0 = r9.f1387ag
            r0 = r0[r11]
            int r19 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r19 >= 0) goto L_0x021e
            boolean r0 = r1.f1322n
            if (r0 == 0) goto L_0x0218
            dx[] r0 = r9.f1358D
            int r7 = r15 + 1
            r0 = r0[r7]
            dt r0 = r0.f1334i
            dx[] r7 = r9.f1358D
            r7 = r7[r15]
            dt r7 = r7.f1334i
            r35 = r6
            r6 = 4
            r9 = 0
            r10.mo1531c(r0, r7, r9, r6)
            r6 = 6
            goto L_0x023a
        L_0x0218:
            r35 = r6
            r6 = 4
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0221
        L_0x021e:
            r35 = r6
            r6 = 4
        L_0x0221:
            r16 = 0
            int r19 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r19 != 0) goto L_0x0244
            dx[] r0 = r9.f1358D
            int r7 = r15 + 1
            r0 = r0[r7]
            dt r0 = r0.f1334i
            dx[] r7 = r9.f1358D
            r7 = r7[r15]
            dt r7 = r7.f1334i
            r6 = 6
            r9 = 0
            r10.mo1531c(r0, r7, r9, r6)
        L_0x023a:
            r38 = r1
            r36 = r2
            r16 = r9
            r17 = 0
            goto L_0x02ed
        L_0x0244:
            r6 = 6
            r16 = 0
            if (r12 == 0) goto L_0x02df
            dx[] r6 = r12.f1358D
            r6 = r6[r15]
            dt r6 = r6.f1334i
            dx[] r12 = r12.f1358D
            int r17 = r15 + 1
            r12 = r12[r17]
            dt r12 = r12.f1334i
            dx[] r7 = r9.f1358D
            r7 = r7[r15]
            dt r7 = r7.f1334i
            r36 = r2
            dx[] r2 = r9.f1358D
            r2 = r2[r17]
            dt r2 = r2.f1334i
            r37 = r9
            dn r9 = r48.mo1530c()
            r38 = r1
            r1 = 0
            r9.f1228b = r1
            int r17 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r17 == 0) goto L_0x02c0
            int r17 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r17 != 0) goto L_0x027b
            goto L_0x02c0
        L_0x027b:
            r17 = 0
            int r26 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r26 != 0) goto L_0x0290
            dm r2 = r9.f1230d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.mo1502a(r6, r7)
            dm r2 = r9.f1230d
            r2.mo1502a(r12, r1)
        L_0x028d:
            r39 = r0
            goto L_0x02db
        L_0x0290:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r19 != 0) goto L_0x02a1
            dm r6 = r9.f1230d
            r6.mo1502a(r7, r1)
            dm r1 = r9.f1230d
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mo1502a(r2, r6)
            goto L_0x028d
        L_0x02a1:
            float r14 = r14 / r13
            float r19 = r0 / r13
            float r14 = r14 / r19
            r39 = r0
            dm r0 = r9.f1230d
            r0.mo1502a(r6, r1)
            dm r0 = r9.f1230d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo1502a(r12, r1)
            dm r0 = r9.f1230d
            r0.mo1502a(r2, r14)
            dm r0 = r9.f1230d
            float r1 = -r14
            r0.mo1502a(r7, r1)
            goto L_0x02db
        L_0x02c0:
            r39 = r0
            r0 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            dm r14 = r9.f1230d
            r14.mo1502a(r6, r1)
            dm r6 = r9.f1230d
            r6.mo1502a(r12, r0)
            dm r6 = r9.f1230d
            r6.mo1502a(r2, r1)
            dm r1 = r9.f1230d
            r1.mo1502a(r7, r0)
        L_0x02db:
            r10.mo1521a(r9)
            goto L_0x02e9
        L_0x02df:
            r39 = r0
            r38 = r1
            r36 = r2
            r37 = r9
            r17 = 0
        L_0x02e9:
            r12 = r37
            r14 = r39
        L_0x02ed:
            int r8 = r8 + 1
            r7 = r17
            r6 = r35
            r2 = r36
            r1 = r38
            r0 = r47
            r9 = 1
            goto L_0x01eb
        L_0x02fc:
            r38 = r1
            r16 = 0
            if (r4 == 0) goto L_0x037d
            if (r4 == r3) goto L_0x0306
            if (r18 == 0) goto L_0x037d
        L_0x0306:
            r0 = r33
            dx[] r1 = r0.f1358D
            r1 = r1[r15]
            dx[] r2 = r5.f1358D
            int r6 = r15 + 1
            r2 = r2[r6]
            dx[] r7 = r0.f1358D
            r7 = r7[r15]
            dx r7 = r7.f1329d
            if (r7 == 0) goto L_0x0323
            dx[] r0 = r0.f1358D
            r0 = r0[r15]
            dx r0 = r0.f1329d
            dt r0 = r0.f1334i
            goto L_0x0325
        L_0x0323:
            r0 = r25
        L_0x0325:
            dx[] r7 = r5.f1358D
            r7 = r7[r6]
            dx r7 = r7.f1329d
            if (r7 == 0) goto L_0x0336
            dx[] r7 = r5.f1358D
            r7 = r7[r6]
            dx r7 = r7.f1329d
            dt r7 = r7.f1334i
            goto L_0x0338
        L_0x0336:
            r7 = r25
        L_0x0338:
            if (r4 != r3) goto L_0x0342
            dx[] r1 = r4.f1358D
            r1 = r1[r15]
            dx[] r2 = r4.f1358D
            r2 = r2[r6]
        L_0x0342:
            if (r0 == 0) goto L_0x0373
            if (r7 == 0) goto L_0x0373
            if (r11 != 0) goto L_0x034d
            r6 = r32
            float r6 = r6.f1375V
            goto L_0x0351
        L_0x034d:
            r6 = r32
            float r6 = r6.f1376W
        L_0x0351:
            int r8 = r1.mo1551b()
            int r9 = r2.mo1551b()
            dt r12 = r1.f1334i
            dt r13 = r2.f1334i
            r14 = 5
            r1 = r10
            r2 = r12
            r12 = r3
            r3 = r0
            r0 = r4
            r4 = r8
            r8 = r5
            r5 = r6
            r6 = r7
            r7 = r13
            r13 = r8
            r40 = r20
            r8 = r9
            r17 = r21
            r9 = r14
            r1.mo1525a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x037a
        L_0x0373:
            r12 = r3
            r0 = r4
            r13 = r5
            r40 = r20
            r17 = r21
        L_0x037a:
            r14 = r0
            goto L_0x059d
        L_0x037d:
            r12 = r3
            r14 = r4
            r13 = r5
            r40 = r20
            r17 = r21
            r0 = r33
            if (r23 == 0) goto L_0x0479
            if (r14 == 0) goto L_0x0479
            r1 = r38
            int r2 = r1.f1318j
            if (r2 <= 0) goto L_0x0399
            int r2 = r1.f1317i
            int r1 = r1.f1318j
            if (r2 != r1) goto L_0x0399
            r34 = 1
            goto L_0x039b
        L_0x0399:
            r34 = r16
        L_0x039b:
            r1 = r14
            r9 = r1
        L_0x039d:
            if (r9 == 0) goto L_0x059d
            dy[] r2 = r9.f1389ai
            r8 = r2[r11]
            if (r8 != 0) goto L_0x03b2
            if (r9 != r12) goto L_0x03a8
            goto L_0x03b2
        L_0x03a8:
            r24 = r8
            r18 = r9
        L_0x03ac:
            r20 = 6
            r21 = 4
            goto L_0x0473
        L_0x03b2:
            dx[] r2 = r9.f1358D
            r2 = r2[r15]
            dt r3 = r2.f1334i
            dx r4 = r2.f1329d
            if (r4 == 0) goto L_0x03c1
            dx r4 = r2.f1329d
            dt r4 = r4.f1334i
            goto L_0x03c3
        L_0x03c1:
            r4 = r25
        L_0x03c3:
            if (r1 == r9) goto L_0x03ce
            dx[] r4 = r1.f1358D
            int r5 = r15 + 1
            r4 = r4[r5]
        L_0x03cb:
            dt r4 = r4.f1334i
            goto L_0x03e3
        L_0x03ce:
            if (r9 != r14) goto L_0x03e3
            if (r1 != r9) goto L_0x03e3
            dx[] r4 = r0.f1358D
            r4 = r4[r15]
            dx r4 = r4.f1329d
            if (r4 == 0) goto L_0x03e1
            dx[] r4 = r0.f1358D
            r4 = r4[r15]
            dx r4 = r4.f1329d
            goto L_0x03cb
        L_0x03e1:
            r4 = r25
        L_0x03e3:
            int r2 = r2.mo1551b()
            dx[] r5 = r9.f1358D
            int r6 = r15 + 1
            r5 = r5[r6]
            int r5 = r5.mo1551b()
            if (r8 == 0) goto L_0x03fe
            dx[] r7 = r8.f1358D
            r7 = r7[r15]
            r41 = r0
        L_0x03f9:
            dt r0 = r7.f1334i
            r42 = r8
            goto L_0x040d
        L_0x03fe:
            r41 = r0
            dx[] r0 = r13.f1358D
            r0 = r0[r6]
            dx r7 = r0.f1329d
            if (r7 == 0) goto L_0x0409
            goto L_0x03f9
        L_0x0409:
            r42 = r8
            r0 = r25
        L_0x040d:
            dx[] r8 = r9.f1358D
            r8 = r8[r6]
            dt r8 = r8.f1334i
            if (r7 == 0) goto L_0x041a
            int r7 = r7.mo1551b()
            int r5 = r5 + r7
        L_0x041a:
            if (r1 == 0) goto L_0x0425
            dx[] r1 = r1.f1358D
            r1 = r1[r6]
            int r1 = r1.mo1551b()
            int r2 = r2 + r1
        L_0x0425:
            if (r3 == 0) goto L_0x046b
            if (r4 == 0) goto L_0x046b
            if (r0 == 0) goto L_0x046b
            if (r8 == 0) goto L_0x046b
            if (r9 != r14) goto L_0x0439
            dx[] r1 = r14.f1358D
            r1 = r1[r15]
            int r1 = r1.mo1551b()
            r7 = r1
            goto L_0x043a
        L_0x0439:
            r7 = r2
        L_0x043a:
            if (r9 != r12) goto L_0x0447
            dx[] r1 = r12.f1358D
            r1 = r1[r6]
            int r1 = r1.mo1551b()
            r18 = r1
            goto L_0x0449
        L_0x0447:
            r18 = r5
        L_0x0449:
            if (r34 == 0) goto L_0x044e
            r19 = 6
            goto L_0x0450
        L_0x044e:
            r19 = 4
        L_0x0450:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r41
            r20 = 6
            r21 = 4
            r6 = r0
            r0 = r7
            r7 = r8
            r24 = r42
            r8 = r18
            r18 = r9
            r9 = r19
            r1.mo1525a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0473
        L_0x046b:
            r18 = r9
            r0 = r41
            r24 = r42
            goto L_0x03ac
        L_0x0473:
            r1 = r18
            r9 = r24
            goto L_0x039d
        L_0x0479:
            r1 = r38
            r20 = 6
            r21 = 4
            if (r22 == 0) goto L_0x059d
            if (r14 == 0) goto L_0x059d
            int r2 = r1.f1318j
            if (r2 <= 0) goto L_0x0490
            int r2 = r1.f1317i
            int r1 = r1.f1318j
            if (r2 != r1) goto L_0x0490
            r34 = 1
            goto L_0x0492
        L_0x0490:
            r34 = r16
        L_0x0492:
            r1 = r14
            r9 = r1
        L_0x0494:
            if (r9 == 0) goto L_0x053e
            dy[] r2 = r9.f1389ai
            r2 = r2[r11]
            if (r9 == r14) goto L_0x0537
            if (r9 == r12) goto L_0x0537
            if (r2 == 0) goto L_0x0537
            if (r2 != r12) goto L_0x04a5
            r8 = r25
            goto L_0x04a6
        L_0x04a5:
            r8 = r2
        L_0x04a6:
            dx[] r2 = r9.f1358D
            r2 = r2[r15]
            dt r3 = r2.f1334i
            dx[] r4 = r1.f1358D
            int r5 = r15 + 1
            r4 = r4[r5]
            dt r4 = r4.f1334i
            int r2 = r2.mo1551b()
            dx[] r6 = r9.f1358D
            r6 = r6[r5]
            int r6 = r6.mo1551b()
            if (r8 == 0) goto L_0x04d8
            dx[] r7 = r8.f1358D
            r7 = r7[r15]
            r43 = r8
            dt r8 = r7.f1334i
            r44 = r8
            dx r8 = r7.f1329d
            if (r8 == 0) goto L_0x04d5
            dx r8 = r7.f1329d
            dt r8 = r8.f1334i
            goto L_0x04f6
        L_0x04d5:
            r8 = r25
            goto L_0x04f6
        L_0x04d8:
            r43 = r8
            dx[] r7 = r9.f1358D
            r7 = r7[r5]
            dx r7 = r7.f1329d
            if (r7 == 0) goto L_0x04e7
            dt r8 = r7.f1334i
            r45 = r7
            goto L_0x04eb
        L_0x04e7:
            r45 = r7
            r8 = r25
        L_0x04eb:
            dx[] r7 = r9.f1358D
            r7 = r7[r5]
            dt r7 = r7.f1334i
            r44 = r8
            r8 = r7
            r7 = r45
        L_0x04f6:
            if (r7 == 0) goto L_0x04fd
            int r7 = r7.mo1551b()
            int r6 = r6 + r7
        L_0x04fd:
            r18 = r6
            if (r1 == 0) goto L_0x050a
            dx[] r1 = r1.f1358D
            r1 = r1[r5]
            int r1 = r1.mo1551b()
            int r2 = r2 + r1
        L_0x050a:
            r5 = r2
            if (r34 == 0) goto L_0x0510
            r19 = r20
            goto L_0x0512
        L_0x0510:
            r19 = r21
        L_0x0512:
            if (r3 == 0) goto L_0x0530
            if (r4 == 0) goto L_0x0530
            if (r44 == 0) goto L_0x0530
            if (r8 == 0) goto L_0x0530
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r44
            r7 = r8
            r26 = r43
            r8 = r18
            r18 = r9
            r9 = r19
            r1.mo1525a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0534
        L_0x0530:
            r18 = r9
            r26 = r43
        L_0x0534:
            r9 = r26
            goto L_0x053a
        L_0x0537:
            r18 = r9
            r9 = r2
        L_0x053a:
            r1 = r18
            goto L_0x0494
        L_0x053e:
            dx[] r1 = r14.f1358D
            r1 = r1[r15]
            dx[] r0 = r0.f1358D
            r0 = r0[r15]
            dx r0 = r0.f1329d
            dx[] r2 = r12.f1358D
            int r3 = r15 + 1
            r9 = r2[r3]
            dx[] r2 = r13.f1358D
            r2 = r2[r3]
            dx r8 = r2.f1329d
            if (r0 == 0) goto L_0x058a
            if (r14 == r12) goto L_0x0567
            dt r2 = r1.f1334i
            dt r0 = r0.f1334i
            int r1 = r1.mo1551b()
            r3 = 5
            r10.mo1531c(r2, r0, r1, r3)
            r1 = r8
            r0 = r9
            goto L_0x058c
        L_0x0567:
            if (r8 == 0) goto L_0x058a
            dt r2 = r1.f1334i
            dt r3 = r0.f1334i
            int r4 = r1.mo1551b()
            r5 = 1056964608(0x3f000000, float:0.5)
            dt r6 = r9.f1334i
            dt r7 = r8.f1334i
            int r0 = r9.mo1551b()
            r18 = 5
            r1 = r10
            r46 = r8
            r8 = r0
            r0 = r9
            r9 = r18
            r1.mo1525a(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r46
            goto L_0x058c
        L_0x058a:
            r0 = r9
            r1 = r8
        L_0x058c:
            if (r1 == 0) goto L_0x059d
            if (r14 == r12) goto L_0x059d
            dt r2 = r0.f1334i
            dt r1 = r1.f1334i
            int r0 = r0.mo1551b()
            int r0 = -r0
            r3 = 5
            r10.mo1531c(r2, r1, r0, r3)
        L_0x059d:
            if (r23 != 0) goto L_0x05a1
            if (r22 == 0) goto L_0x05fd
        L_0x05a1:
            if (r14 == 0) goto L_0x05fd
            dx[] r0 = r14.f1358D
            r0 = r0[r15]
            dx[] r1 = r12.f1358D
            int r2 = r15 + 1
            r1 = r1[r2]
            dx r3 = r0.f1329d
            if (r3 == 0) goto L_0x05b6
            dx r3 = r0.f1329d
            dt r3 = r3.f1334i
            goto L_0x05b8
        L_0x05b6:
            r3 = r25
        L_0x05b8:
            dx r4 = r1.f1329d
            if (r4 == 0) goto L_0x05c1
            dx r4 = r1.f1329d
            dt r4 = r4.f1334i
            goto L_0x05c3
        L_0x05c1:
            r4 = r25
        L_0x05c3:
            if (r13 == r12) goto L_0x05d4
            dx[] r4 = r13.f1358D
            r4 = r4[r2]
            dx r5 = r4.f1329d
            if (r5 == 0) goto L_0x05d2
            dx r4 = r4.f1329d
            dt r4 = r4.f1334i
            goto L_0x05d4
        L_0x05d2:
            r4 = r25
        L_0x05d4:
            r6 = r4
            if (r14 != r12) goto L_0x05df
            dx[] r0 = r14.f1358D
            r0 = r0[r15]
            dx[] r1 = r14.f1358D
            r1 = r1[r2]
        L_0x05df:
            if (r3 == 0) goto L_0x05fd
            if (r6 == 0) goto L_0x05fd
            int r4 = r0.mo1551b()
            if (r12 != 0) goto L_0x05ea
            r12 = r13
        L_0x05ea:
            dx[] r5 = r12.f1358D
            r2 = r5[r2]
            int r8 = r2.mo1551b()
            dt r2 = r0.f1334i
            r5 = 1056964608(0x3f000000, float:0.5)
            dt r7 = r1.f1334i
            r9 = 5
            r1 = r10
            r1.mo1525a(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x05fd:
            int r8 = r40 + 1
            r9 = r17
            r14 = r31
            r0 = r47
            goto L_0x0018
        L_0x0607:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0271dv.m913a(dz, dq, int):void");
    }
}
