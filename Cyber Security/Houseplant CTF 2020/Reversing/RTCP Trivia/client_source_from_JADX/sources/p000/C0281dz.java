package p000;

import java.util.Arrays;

/* renamed from: dz */
public final class C0281dz extends C0293ei {

    /* renamed from: a */
    public boolean f1428a = false;

    /* renamed from: al */
    int f1429al;

    /* renamed from: am */
    int f1430am;

    /* renamed from: an */
    int f1431an;

    /* renamed from: ao */
    int f1432ao;

    /* renamed from: ap */
    int f1433ap = 0;

    /* renamed from: aq */
    int f1434aq = 0;

    /* renamed from: ar */
    C0272dw[] f1435ar = new C0272dw[4];

    /* renamed from: as */
    C0272dw[] f1436as = new C0272dw[4];

    /* renamed from: at */
    public int f1437at = 3;

    /* renamed from: au */
    public boolean f1438au = false;

    /* renamed from: av */
    public boolean f1439av = false;

    /* renamed from: aw */
    int f1440aw = 0;

    /* renamed from: ay */
    private C0291eh f1441ay;

    /* renamed from: b */
    protected C0262dq f1442b = new C0262dq();

    /* renamed from: F */
    private void m967F() {
        int size = this.f1485ax.size();
        mo1546b();
        for (int i = 0; i < size; i++) {
            ((C0278dy) this.f1485ax.get(i)).mo1546b();
        }
    }

    /* renamed from: a */
    private void m968a(boolean[] zArr) {
        zArr[2] = false;
        mo1595z();
        int size = this.f1485ax.size();
        for (int i = 0; i < size; i++) {
            C0278dy dyVar = (C0278dy) this.f1485ax.get(i);
            dyVar.mo1595z();
            if (dyVar.f1360F[0] == C0280a.f1425c && dyVar.mo1580l() < dyVar.f1373S) {
                zArr[2] = true;
            }
            if (dyVar.f1360F[1] == C0280a.f1425c && dyVar.mo1581m() < dyVar.f1374T) {
                zArr[2] = true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r14v1 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r20v1 */
    /* JADX WARNING: type inference failed for: r20v2 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r8v10, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r14v3 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r2v38 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r20v4 */
    /* JADX WARNING: type inference failed for: r19v0 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r20v5 */
    /* JADX WARNING: type inference failed for: r20v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r19v2 */
    /* JADX WARNING: type inference failed for: r20v7 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: type inference failed for: r20v8 */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: type inference failed for: r20v9 */
    /* JADX WARNING: type inference failed for: r19v4 */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: type inference failed for: r19v5 */
    /* JADX WARNING: type inference failed for: r20v10 */
    /* JADX WARNING: type inference failed for: r19v6 */
    /* JADX WARNING: type inference failed for: r20v11 */
    /* JADX WARNING: type inference failed for: r19v7 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r14v9 */
    /* JADX WARNING: type inference failed for: r19v8 */
    /* JADX WARNING: type inference failed for: r20v12 */
    /* JADX WARNING: type inference failed for: r19v9 */
    /* JADX WARNING: type inference failed for: r20v13 */
    /* JADX WARNING: type inference failed for: r20v14 */
    /* JADX WARNING: type inference failed for: r9v41 */
    /* JADX WARNING: type inference failed for: r9v42 */
    /* JADX WARNING: type inference failed for: r20v15 */
    /* JADX WARNING: type inference failed for: r14v16 */
    /* JADX WARNING: type inference failed for: r12v19 */
    /* JADX WARNING: type inference failed for: r20v16 */
    /* JADX WARNING: type inference failed for: r9v48 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* JADX WARNING: type inference failed for: r14v17 */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: type inference failed for: r14v18 */
    /* JADX WARNING: type inference failed for: r2v65 */
    /* JADX WARNING: type inference failed for: r8v42 */
    /* JADX WARNING: type inference failed for: r8v43 */
    /* JADX WARNING: type inference failed for: r2v66 */
    /* JADX WARNING: type inference failed for: r9v49 */
    /* JADX WARNING: type inference failed for: r2v67 */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: type inference failed for: r9v50 */
    /* JADX WARNING: type inference failed for: r2v69 */
    /* JADX WARNING: type inference failed for: r2v70 */
    /* JADX WARNING: type inference failed for: r9v51 */
    /* JADX WARNING: type inference failed for: r20v17 */
    /* JADX WARNING: type inference failed for: r9v52 */
    /* JADX WARNING: type inference failed for: r20v18 */
    /* JADX WARNING: type inference failed for: r20v19 */
    /* JADX WARNING: type inference failed for: r19v10 */
    /* JADX WARNING: type inference failed for: r19v11 */
    /* JADX WARNING: type inference failed for: r19v12 */
    /* JADX WARNING: type inference failed for: r19v13 */
    /* JADX WARNING: type inference failed for: r19v14 */
    /* JADX WARNING: type inference failed for: r20v20 */
    /* JADX WARNING: type inference failed for: r20v21 */
    /* JADX WARNING: type inference failed for: r20v22 */
    /* JADX WARNING: type inference failed for: r20v23 */
    /* JADX WARNING: type inference failed for: r20v24 */
    /* JADX WARNING: type inference failed for: r20v25 */
    /* JADX WARNING: type inference failed for: r20v26 */
    /* JADX WARNING: type inference failed for: r9v53 */
    /* JADX WARNING: type inference failed for: r9v54 */
    /* JADX WARNING: type inference failed for: r20v27 */
    /* JADX WARNING: type inference failed for: r19v15 */
    /* JADX WARNING: type inference failed for: r20v28 */
    /* JADX WARNING: type inference failed for: r19v16 */
    /* JADX WARNING: type inference failed for: r20v29 */
    /* JADX WARNING: type inference failed for: r19v17 */
    /* JADX WARNING: type inference failed for: r19v18 */
    /* JADX WARNING: type inference failed for: r19v19 */
    /* JADX WARNING: type inference failed for: r19v20 */
    /* JADX WARNING: type inference failed for: r19v21 */
    /* JADX WARNING: type inference failed for: r20v30 */
    /* JADX WARNING: type inference failed for: r20v31 */
    /* JADX WARNING: type inference failed for: r20v32 */
    /* JADX WARNING: type inference failed for: r20v33 */
    /* JADX WARNING: type inference failed for: r9v55 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v9
      assigns: []
      uses: []
      mth insns count: 479
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x032a  */
    /* JADX WARNING: Unknown variable types count: 43 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1596A() {
        /*
            r23 = this;
            r1 = r23
            int r2 = r1.f1366L
            int r3 = r1.f1367M
            int r4 = r23.mo1580l()
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            int r6 = r23.mo1581m()
            int r6 = java.lang.Math.max(r5, r6)
            r1.f1438au = r5
            r1.f1439av = r5
            dy r7 = r1.f1361G
            if (r7 == 0) goto L_0x00a1
            eh r7 = r1.f1441ay
            if (r7 != 0) goto L_0x002a
            eh r7 = new eh
            r7.<init>(r1)
            r1.f1441ay = r7
        L_0x002a:
            eh r7 = r1.f1441ay
            int r8 = r23.mo1578j()
            r7.f1475a = r8
            int r8 = r23.mo1579k()
            r7.f1476b = r8
            int r8 = r23.mo1580l()
            r7.f1477c = r8
            int r8 = r23.mo1581m()
            r7.f1478d = r8
            java.util.ArrayList<eh$a> r8 = r7.f1479e
            int r8 = r8.size()
            r9 = r5
        L_0x004b:
            if (r9 >= r8) goto L_0x008c
            java.util.ArrayList<eh$a> r10 = r7.f1479e
            java.lang.Object r10 = r10.get(r9)
            eh$a r10 = (p000.C0291eh.C0292a) r10
            dx r11 = r10.f1480a
            dx$c r11 = r11.f1328c
            dx r11 = r1.mo1555a(r11)
            r10.f1480a = r11
            dx r11 = r10.f1480a
            if (r11 == 0) goto L_0x007e
            dx r11 = r10.f1480a
            dx r11 = r11.f1329d
            r10.f1481b = r11
            dx r11 = r10.f1480a
            int r11 = r11.mo1551b()
            r10.f1482c = r11
            dx r11 = r10.f1480a
            int r11 = r11.f1332g
            r10.f1483d = r11
            dx r11 = r10.f1480a
            int r11 = r11.f1333h
            r10.f1484e = r11
            goto L_0x0089
        L_0x007e:
            r11 = 0
            r10.f1481b = r11
            r10.f1482c = r5
            int r11 = p000.C0273dx.C0276b.f1341b
            r10.f1483d = r11
            r10.f1484e = r5
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x004b
        L_0x008c:
            int r7 = r1.f1429al
            r1.mo1560b(r7)
            int r7 = r1.f1430am
            r1.mo1563c(r7)
            r23.mo1592w()
            dq r7 = r1.f1442b
            do r7 = r7.f1243g
            r1.mo1557a(r7)
            goto L_0x00a5
        L_0x00a1:
            r1.f1366L = r5
            r1.f1367M = r5
        L_0x00a5:
            int r7 = r1.f1437at
            r8 = 8
            r9 = 1
            if (r7 == 0) goto L_0x00c8
            boolean r7 = r1.mo1601j(r8)
            if (r7 != 0) goto L_0x00b5
            r23.m967F()
        L_0x00b5:
            boolean r7 = r1.mo1601j(r8)
            if (r7 != 0) goto L_0x00c0
            int r7 = r1.f1437at
            r1.mo1543a(r7)
        L_0x00c0:
            r23.mo1598C()
            dq r7 = r1.f1442b
            r7.f1240d = r9
            goto L_0x00cc
        L_0x00c8:
            dq r7 = r1.f1442b
            r7.f1240d = r5
        L_0x00cc:
            int[] r7 = r1.f1360F
            r7 = r7[r9]
            int[] r10 = r1.f1360F
            r10 = r10[r5]
            r1.f1433ap = r5
            r1.f1434aq = r5
            java.util.ArrayList r11 = r1.f1485ax
            int r11 = r11.size()
            r12 = r5
        L_0x00df:
            if (r12 >= r11) goto L_0x00f5
            java.util.ArrayList r13 = r1.f1485ax
            java.lang.Object r13 = r13.get(r12)
            dy r13 = (p000.C0278dy) r13
            boolean r14 = r13 instanceof p000.C0293ei
            if (r14 == 0) goto L_0x00f2
            ei r13 = (p000.C0293ei) r13
            r13.mo1596A()
        L_0x00f2:
            int r12 = r12 + 1
            goto L_0x00df
        L_0x00f5:
            r13 = r5
            r14 = r13
            r12 = r9
        L_0x00f8:
            if (r12 == 0) goto L_0x0371
            int r13 = r13 + r9
            dq r15 = r1.f1442b     // Catch:{ Exception -> 0x0215 }
            r15.mo1528b()     // Catch:{ Exception -> 0x0215 }
            dq r15 = r1.f1442b     // Catch:{ Exception -> 0x0215 }
            r1.mo1562b(r15)     // Catch:{ Exception -> 0x0215 }
            r15 = r5
        L_0x0106:
            if (r15 >= r11) goto L_0x0126
            java.util.ArrayList r8 = r1.f1485ax     // Catch:{ Exception -> 0x011b }
            java.lang.Object r8 = r8.get(r15)     // Catch:{ Exception -> 0x011b }
            dy r8 = (p000.C0278dy) r8     // Catch:{ Exception -> 0x011b }
            dq r9 = r1.f1442b     // Catch:{ Exception -> 0x011b }
            r8.mo1562b(r9)     // Catch:{ Exception -> 0x011b }
            int r15 = r15 + 1
            r8 = 8
            r9 = 1
            goto L_0x0106
        L_0x011b:
            r0 = move-exception
            r21 = r2
            r22 = r3
            r9 = r12
            r20 = r14
        L_0x0123:
            r2 = r0
            goto L_0x0221
        L_0x0126:
            dq r8 = r1.f1442b     // Catch:{ Exception -> 0x0215 }
            r1.mo1544a(r8)     // Catch:{ Exception -> 0x0215 }
            java.util.ArrayList r9 = r1.f1485ax     // Catch:{ Exception -> 0x0215 }
            int r9 = r9.size()     // Catch:{ Exception -> 0x0215 }
            r15 = r5
        L_0x0132:
            if (r15 >= r9) goto L_0x0198
            java.util.ArrayList r5 = r1.f1485ax     // Catch:{ Exception -> 0x018c }
            java.lang.Object r5 = r5.get(r15)     // Catch:{ Exception -> 0x018c }
            dy r5 = (p000.C0278dy) r5     // Catch:{ Exception -> 0x018c }
            r18 = r9
            boolean r9 = r5 instanceof p000.C0281dz     // Catch:{ Exception -> 0x018c }
            if (r9 == 0) goto L_0x0178
            int[] r9 = r5.f1360F     // Catch:{ Exception -> 0x018c }
            r17 = 0
            r9 = r9[r17]     // Catch:{ Exception -> 0x018c }
            r19 = r12
            int[] r12 = r5.f1360F     // Catch:{ Exception -> 0x0176 }
            r16 = 1
            r12 = r12[r16]     // Catch:{ Exception -> 0x0176 }
            r20 = r14
            int r14 = p000.C0278dy.C0280a.f1424b     // Catch:{ Exception -> 0x01a5 }
            if (r9 != r14) goto L_0x015b
            int r14 = p000.C0278dy.C0280a.f1423a     // Catch:{ Exception -> 0x01a5 }
            r5.mo1575h(r14)     // Catch:{ Exception -> 0x01a5 }
        L_0x015b:
            int r14 = p000.C0278dy.C0280a.f1424b     // Catch:{ Exception -> 0x01a5 }
            if (r12 != r14) goto L_0x0164
            int r14 = p000.C0278dy.C0280a.f1423a     // Catch:{ Exception -> 0x01a5 }
            r5.mo1577i(r14)     // Catch:{ Exception -> 0x01a5 }
        L_0x0164:
            r5.mo1544a(r8)     // Catch:{ Exception -> 0x01a5 }
            int r14 = p000.C0278dy.C0280a.f1424b     // Catch:{ Exception -> 0x01a5 }
            if (r9 != r14) goto L_0x016e
            r5.mo1575h(r9)     // Catch:{ Exception -> 0x01a5 }
        L_0x016e:
            int r9 = p000.C0278dy.C0280a.f1424b     // Catch:{ Exception -> 0x01a5 }
            if (r12 != r9) goto L_0x0182
            r5.mo1577i(r12)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x0182
        L_0x0176:
            r0 = move-exception
            goto L_0x018f
        L_0x0178:
            r19 = r12
            r20 = r14
            p000.C0286ec.m994a(r1, r8, r5)     // Catch:{ Exception -> 0x01a5 }
            r5.mo1544a(r8)     // Catch:{ Exception -> 0x01a5 }
        L_0x0182:
            int r15 = r15 + 1
            r9 = r18
            r12 = r19
            r14 = r20
            r5 = 0
            goto L_0x0132
        L_0x018c:
            r0 = move-exception
            r19 = r12
        L_0x018f:
            r20 = r14
        L_0x0191:
            r21 = r2
            r22 = r3
            r9 = r19
            goto L_0x0123
        L_0x0198:
            r19 = r12
            r20 = r14
            int r5 = r1.f1433ap     // Catch:{ Exception -> 0x020f }
            if (r5 <= 0) goto L_0x01a7
            r5 = 0
            p000.C0271dv.m913a(r1, r8, r5)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01a7
        L_0x01a5:
            r0 = move-exception
            goto L_0x0191
        L_0x01a7:
            int r5 = r1.f1434aq     // Catch:{ Exception -> 0x020f }
            if (r5 <= 0) goto L_0x01af
            r5 = 1
            p000.C0271dv.m913a(r1, r8, r5)     // Catch:{ Exception -> 0x01a5 }
        L_0x01af:
            dq r5 = r1.f1442b     // Catch:{ Exception -> 0x0207 }
            dr r8 = p000.C0262dq.f1235h     // Catch:{ Exception -> 0x0207 }
            r14 = 1
            if (r8 == 0) goto L_0x01c3
            dr r8 = p000.C0262dq.f1235h     // Catch:{ Exception -> 0x0207 }
            r21 = r2
            r22 = r3
            long r2 = r8.f1261e     // Catch:{ Exception -> 0x0205 }
            long r2 = r2 + r14
            r8.f1261e = r2     // Catch:{ Exception -> 0x0205 }
            goto L_0x01c7
        L_0x01c3:
            r21 = r2
            r22 = r3
        L_0x01c7:
            boolean r2 = r5.f1240d     // Catch:{ Exception -> 0x0205 }
            if (r2 == 0) goto L_0x0200
            dr r2 = p000.C0262dq.f1235h     // Catch:{ Exception -> 0x0205 }
            if (r2 == 0) goto L_0x01d6
            dr r2 = p000.C0262dq.f1235h     // Catch:{ Exception -> 0x0205 }
            long r8 = r2.f1274r     // Catch:{ Exception -> 0x0205 }
            long r8 = r8 + r14
            r2.f1274r = r8     // Catch:{ Exception -> 0x0205 }
        L_0x01d6:
            r2 = 0
        L_0x01d7:
            int r3 = r5.f1242f     // Catch:{ Exception -> 0x0205 }
            if (r2 >= r3) goto L_0x01e8
            dn[] r3 = r5.f1239c     // Catch:{ Exception -> 0x0205 }
            r3 = r3[r2]     // Catch:{ Exception -> 0x0205 }
            boolean r3 = r3.f1231e     // Catch:{ Exception -> 0x0205 }
            if (r3 != 0) goto L_0x01e5
            r2 = 0
            goto L_0x01e9
        L_0x01e5:
            int r2 = r2 + 1
            goto L_0x01d7
        L_0x01e8:
            r2 = 1
        L_0x01e9:
            if (r2 != 0) goto L_0x01f1
            dq$a r2 = r5.f1238b     // Catch:{ Exception -> 0x0205 }
        L_0x01ed:
            r5.mo1523a(r2)     // Catch:{ Exception -> 0x0205 }
            goto L_0x0203
        L_0x01f1:
            dr r2 = p000.C0262dq.f1235h     // Catch:{ Exception -> 0x0205 }
            if (r2 == 0) goto L_0x01fc
            dr r2 = p000.C0262dq.f1235h     // Catch:{ Exception -> 0x0205 }
            long r8 = r2.f1273q     // Catch:{ Exception -> 0x0205 }
            long r8 = r8 + r14
            r2.f1273q = r8     // Catch:{ Exception -> 0x0205 }
        L_0x01fc:
            r5.mo1533e()     // Catch:{ Exception -> 0x0205 }
            goto L_0x0203
        L_0x0200:
            dq$a r2 = r5.f1238b     // Catch:{ Exception -> 0x0205 }
            goto L_0x01ed
        L_0x0203:
            r9 = 1
            goto L_0x0237
        L_0x0205:
            r0 = move-exception
            goto L_0x020c
        L_0x0207:
            r0 = move-exception
            r21 = r2
            r22 = r3
        L_0x020c:
            r2 = r0
            r9 = 1
            goto L_0x0221
        L_0x020f:
            r0 = move-exception
            r21 = r2
            r22 = r3
            goto L_0x021e
        L_0x0215:
            r0 = move-exception
            r21 = r2
            r22 = r3
            r19 = r12
            r20 = r14
        L_0x021e:
            r2 = r0
            r9 = r19
        L_0x0221:
            r2.printStackTrace()
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "EXCEPTION : "
            r5.<init>(r8)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.println(r2)
        L_0x0237:
            r2 = 2
            if (r9 == 0) goto L_0x0242
            boolean[] r3 = p000.C0286ec.f1458a
            r1.m968a(r3)
        L_0x023f:
            r3 = 8
            goto L_0x0280
        L_0x0242:
            r23.mo1595z()
            r3 = 0
        L_0x0246:
            if (r3 >= r11) goto L_0x023f
            java.util.ArrayList r5 = r1.f1485ax
            java.lang.Object r5 = r5.get(r3)
            dy r5 = (p000.C0278dy) r5
            int[] r8 = r5.f1360F
            r9 = 0
            r8 = r8[r9]
            int r9 = p000.C0278dy.C0280a.f1425c
            if (r8 != r9) goto L_0x0267
            int r8 = r5.mo1580l()
            int r9 = r5.f1373S
            if (r8 >= r9) goto L_0x0267
            boolean[] r3 = p000.C0286ec.f1458a
            r8 = 1
            r3[r2] = r8
            goto L_0x023f
        L_0x0267:
            r8 = 1
            int[] r9 = r5.f1360F
            r9 = r9[r8]
            int r12 = p000.C0278dy.C0280a.f1425c
            if (r9 != r12) goto L_0x027d
            int r9 = r5.mo1581m()
            int r5 = r5.f1374T
            if (r9 >= r5) goto L_0x027d
            boolean[] r3 = p000.C0286ec.f1458a
            r3[r2] = r8
            goto L_0x023f
        L_0x027d:
            int r3 = r3 + 1
            goto L_0x0246
        L_0x0280:
            if (r13 >= r3) goto L_0x02eb
            boolean[] r5 = p000.C0286ec.f1458a
            boolean r2 = r5[r2]
            if (r2 == 0) goto L_0x02eb
            r2 = 0
            r5 = 0
            r8 = 0
        L_0x028b:
            if (r2 >= r11) goto L_0x02ae
            java.util.ArrayList r9 = r1.f1485ax
            java.lang.Object r9 = r9.get(r2)
            dy r9 = (p000.C0278dy) r9
            int r12 = r9.f1366L
            int r14 = r9.mo1580l()
            int r12 = r12 + r14
            int r5 = java.lang.Math.max(r5, r12)
            int r12 = r9.f1367M
            int r9 = r9.mo1581m()
            int r12 = r12 + r9
            int r8 = java.lang.Math.max(r8, r12)
            int r2 = r2 + 1
            goto L_0x028b
        L_0x02ae:
            int r2 = r1.f1371Q
            int r2 = java.lang.Math.max(r2, r5)
            int r5 = r1.f1372R
            int r5 = java.lang.Math.max(r5, r8)
            int r8 = p000.C0278dy.C0280a.f1424b
            if (r10 != r8) goto L_0x02d1
            int r8 = r23.mo1580l()
            if (r8 >= r2) goto L_0x02d1
            r1.mo1565d(r2)
            int[] r2 = r1.f1360F
            int r8 = p000.C0278dy.C0280a.f1424b
            r9 = 0
            r2[r9] = r8
            r2 = 1
            r9 = 1
            goto L_0x02d4
        L_0x02d1:
            r9 = r20
            r2 = 0
        L_0x02d4:
            int r8 = p000.C0278dy.C0280a.f1424b
            if (r7 != r8) goto L_0x02ee
            int r8 = r23.mo1581m()
            if (r8 >= r5) goto L_0x02ee
            r1.mo1568e(r5)
            int[] r2 = r1.f1360F
            int r5 = p000.C0278dy.C0280a.f1424b
            r8 = 1
            r2[r8] = r5
            r2 = 1
            r9 = 1
            goto L_0x02ee
        L_0x02eb:
            r9 = r20
            r2 = 0
        L_0x02ee:
            int r5 = r1.f1371Q
            int r8 = r23.mo1580l()
            int r5 = java.lang.Math.max(r5, r8)
            int r8 = r23.mo1580l()
            if (r5 <= r8) goto L_0x030a
            r1.mo1565d(r5)
            int[] r2 = r1.f1360F
            int r5 = p000.C0278dy.C0280a.f1423a
            r8 = 0
            r2[r8] = r5
            r2 = 1
            r9 = 1
        L_0x030a:
            int r5 = r1.f1372R
            int r8 = r23.mo1581m()
            int r5 = java.lang.Math.max(r5, r8)
            int r8 = r23.mo1581m()
            if (r5 <= r8) goto L_0x0327
            r1.mo1568e(r5)
            int[] r2 = r1.f1360F
            int r5 = p000.C0278dy.C0280a.f1423a
            r8 = 1
            r2[r8] = r5
            r2 = r8
            r9 = r2
            goto L_0x0328
        L_0x0327:
            r8 = 1
        L_0x0328:
            if (r9 != 0) goto L_0x0366
            int[] r5 = r1.f1360F
            r12 = 0
            r5 = r5[r12]
            int r14 = p000.C0278dy.C0280a.f1424b
            if (r5 != r14) goto L_0x0348
            if (r4 <= 0) goto L_0x0348
            int r5 = r23.mo1580l()
            if (r5 <= r4) goto L_0x0348
            r1.f1438au = r8
            int[] r2 = r1.f1360F
            int r5 = p000.C0278dy.C0280a.f1423a
            r2[r12] = r5
            r1.mo1565d(r4)
            r2 = r8
            r9 = r2
        L_0x0348:
            int[] r5 = r1.f1360F
            r5 = r5[r8]
            int r12 = p000.C0278dy.C0280a.f1424b
            if (r5 != r12) goto L_0x0366
            if (r6 <= 0) goto L_0x0366
            int r5 = r23.mo1581m()
            if (r5 <= r6) goto L_0x0366
            r1.f1439av = r8
            int[] r2 = r1.f1360F
            int r5 = p000.C0278dy.C0280a.f1423a
            r2[r8] = r5
            r1.mo1568e(r6)
            r12 = 1
            r14 = 1
            goto L_0x0368
        L_0x0366:
            r12 = r2
            r14 = r9
        L_0x0368:
            r8 = r3
            r2 = r21
            r3 = r22
            r5 = 0
            r9 = 1
            goto L_0x00f8
        L_0x0371:
            r21 = r2
            r22 = r3
            r20 = r14
            dy r2 = r1.f1361G
            if (r2 == 0) goto L_0x03a7
            int r2 = r1.f1371Q
            int r3 = r23.mo1580l()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.f1372R
            int r4 = r23.mo1581m()
            int r3 = java.lang.Math.max(r3, r4)
            eh r4 = r1.f1441ay
            r4.mo1651a(r1)
            int r4 = r1.f1429al
            int r2 = r2 + r4
            int r4 = r1.f1431an
            int r2 = r2 + r4
            r1.mo1565d(r2)
            int r2 = r1.f1430am
            int r3 = r3 + r2
            int r2 = r1.f1432ao
            int r3 = r3 + r2
            r1.mo1568e(r3)
            goto L_0x03af
        L_0x03a7:
            r2 = r21
            r1.f1366L = r2
            r2 = r22
            r1.f1367M = r2
        L_0x03af:
            if (r20 == 0) goto L_0x03bb
            int[] r2 = r1.f1360F
            r3 = 0
            r2[r3] = r10
            int[] r2 = r1.f1360F
            r3 = 1
            r2[r3] = r7
        L_0x03bb:
            dq r2 = r1.f1442b
            do r2 = r2.f1243g
            r1.mo1557a(r2)
            dz r2 = r23.mo1652D()
            if (r1 != r2) goto L_0x03cb
            r23.mo1591v()
        L_0x03cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0281dz.mo1596A():void");
    }

    /* renamed from: B */
    public final void mo1597B() {
        m967F();
        mo1543a(this.f1437at);
    }

    /* renamed from: C */
    public final void mo1598C() {
        C0288ee eeVar = mo1555a(C0277c.LEFT).f1326a;
        C0288ee eeVar2 = mo1555a(C0277c.TOP).f1326a;
        eeVar.mo1638a((C0288ee) null, 0.0f);
        eeVar2.mo1638a((C0288ee) null, 0.0f);
    }

    /* renamed from: a */
    public final void mo1543a(int i) {
        super.mo1543a(i);
        int size = this.f1485ax.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0278dy) this.f1485ax.get(i2)).mo1543a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1599a(C0278dy dyVar, int i) {
        if (i == 0) {
            if (this.f1433ap + 1 >= this.f1436as.length) {
                this.f1436as = (C0272dw[]) Arrays.copyOf(this.f1436as, this.f1436as.length * 2);
            }
            this.f1436as[this.f1433ap] = new C0272dw(dyVar, 0, this.f1428a);
            this.f1433ap++;
            return;
        }
        if (i == 1) {
            if (this.f1434aq + 1 >= this.f1435ar.length) {
                this.f1435ar = (C0272dw[]) Arrays.copyOf(this.f1435ar, this.f1435ar.length * 2);
            }
            this.f1435ar[this.f1434aq] = new C0272dw(dyVar, 1, this.f1428a);
            this.f1434aq++;
        }
    }

    /* renamed from: e */
    public final void mo1600e(int i, int i2) {
        if (!(this.f1360F[0] == C0280a.f1424b || this.f1399e == null)) {
            this.f1399e.mo1646a(i);
        }
        if (this.f1360F[1] != C0280a.f1424b && this.f1400f != null) {
            this.f1400f.mo1646a(i2);
        }
    }

    /* renamed from: f */
    public final void mo1570f() {
        this.f1442b.mo1528b();
        this.f1429al = 0;
        this.f1431an = 0;
        this.f1430am = 0;
        this.f1432ao = 0;
        super.mo1570f();
    }

    /* renamed from: j */
    public final boolean mo1601j(int i) {
        return (this.f1437at & i) == i;
    }
}
