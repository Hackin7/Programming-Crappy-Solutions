package p000;

import java.util.ArrayList;

/* renamed from: du */
public final class C0270du extends C0285eb {

    /* renamed from: a */
    public int f1306a = 0;

    /* renamed from: an */
    private ArrayList<C0288ee> f1307an = new ArrayList<>(4);

    /* renamed from: b */
    public boolean f1308b = true;

    /* renamed from: a */
    public final void mo1543a(int i) {
        C0273dx dxVar;
        C0273dx dxVar2;
        C0288ee eeVar;
        C0273dx dxVar3;
        if (this.f1361G != null && ((C0281dz) this.f1361G).mo1601j(2)) {
            switch (this.f1306a) {
                case 0:
                    dxVar = this.f1416v;
                    break;
                case 1:
                    dxVar = this.f1418x;
                    break;
                case 2:
                    dxVar = this.f1417w;
                    break;
                case 3:
                    dxVar = this.f1419y;
                    break;
                default:
                    return;
            }
            C0288ee eeVar2 = dxVar.f1326a;
            eeVar2.f1465g = 5;
            if (this.f1306a == 0 || this.f1306a == 1) {
                this.f1417w.f1326a.mo1638a((C0288ee) null, 0.0f);
                dxVar2 = this.f1419y;
            } else {
                this.f1416v.f1326a.mo1638a((C0288ee) null, 0.0f);
                dxVar2 = this.f1418x;
            }
            dxVar2.f1326a.mo1638a((C0288ee) null, 0.0f);
            this.f1307an.clear();
            for (int i2 = 0; i2 < this.f1457am; i2++) {
                C0278dy dyVar = this.f1456al[i2];
                if (this.f1308b || dyVar.mo1545a()) {
                    switch (this.f1306a) {
                        case 0:
                            dxVar3 = dyVar.f1416v;
                            break;
                        case 1:
                            dxVar3 = dyVar.f1418x;
                            break;
                        case 2:
                            dxVar3 = dyVar.f1417w;
                            break;
                        case 3:
                            dxVar3 = dyVar.f1419y;
                            break;
                        default:
                            eeVar = null;
                            break;
                    }
                    eeVar = dxVar3.f1326a;
                    if (eeVar != null) {
                        this.f1307an.add(eeVar);
                        eeVar.mo1647a(eeVar2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00da, code lost:
        if (r1 != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (r1 != false) goto L_0x00ee;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1544a(p000.C0262dq r13) {
        /*
            r12 = this;
            dx[] r0 = r12.f1358D
            dx r1 = r12.f1416v
            r2 = 0
            r0[r2] = r1
            dx[] r0 = r12.f1358D
            dx r1 = r12.f1417w
            r3 = 2
            r0[r3] = r1
            dx[] r0 = r12.f1358D
            dx r1 = r12.f1418x
            r4 = 1
            r0[r4] = r1
            dx[] r0 = r12.f1358D
            dx r1 = r12.f1419y
            r5 = 3
            r0[r5] = r1
            r0 = r2
        L_0x001d:
            dx[] r1 = r12.f1358D
            int r1 = r1.length
            if (r0 >= r1) goto L_0x0033
            dx[] r1 = r12.f1358D
            r1 = r1[r0]
            dx[] r6 = r12.f1358D
            r6 = r6[r0]
            dt r6 = r13.mo1520a(r6)
            r1.f1334i = r6
            int r0 = r0 + 1
            goto L_0x001d
        L_0x0033:
            int r0 = r12.f1306a
            if (r0 < 0) goto L_0x0172
            int r0 = r12.f1306a
            r1 = 4
            if (r0 >= r1) goto L_0x0172
            dx[] r0 = r12.f1358D
            int r1 = r12.f1306a
            r0 = r0[r1]
            r1 = r2
        L_0x0043:
            int r6 = r12.f1457am
            if (r1 >= r6) goto L_0x007b
            dy[] r6 = r12.f1456al
            r6 = r6[r1]
            boolean r7 = r12.f1308b
            if (r7 != 0) goto L_0x0055
            boolean r7 = r6.mo1545a()
            if (r7 == 0) goto L_0x0078
        L_0x0055:
            int r7 = r12.f1306a
            if (r7 == 0) goto L_0x005d
            int r7 = r12.f1306a
            if (r7 != r4) goto L_0x0067
        L_0x005d:
            int r7 = r6.mo1593x()
            int r8 = p000.C0278dy.C0280a.f1425c
            if (r7 != r8) goto L_0x0067
        L_0x0065:
            r1 = r4
            goto L_0x007c
        L_0x0067:
            int r7 = r12.f1306a
            if (r7 == r3) goto L_0x006f
            int r7 = r12.f1306a
            if (r7 != r5) goto L_0x0078
        L_0x006f:
            int r6 = r6.mo1594y()
            int r7 = p000.C0278dy.C0280a.f1425c
            if (r6 != r7) goto L_0x0078
            goto L_0x0065
        L_0x0078:
            int r1 = r1 + 1
            goto L_0x0043
        L_0x007b:
            r1 = r2
        L_0x007c:
            int r6 = r12.f1306a
            if (r6 == 0) goto L_0x0090
            int r6 = r12.f1306a
            if (r6 != r4) goto L_0x0085
            goto L_0x0090
        L_0x0085:
            dy r6 = r12.f1361G
            int r6 = r6.mo1594y()
            int r7 = p000.C0278dy.C0280a.f1424b
            if (r6 != r7) goto L_0x009b
            goto L_0x009a
        L_0x0090:
            dy r6 = r12.f1361G
            int r6 = r6.mo1593x()
            int r7 = p000.C0278dy.C0280a.f1424b
            if (r6 != r7) goto L_0x009b
        L_0x009a:
            r1 = r2
        L_0x009b:
            r6 = r2
        L_0x009c:
            int r7 = r12.f1457am
            if (r6 >= r7) goto L_0x00ff
            dy[] r7 = r12.f1456al
            r7 = r7[r6]
            boolean r8 = r12.f1308b
            if (r8 != 0) goto L_0x00ae
            boolean r8 = r7.mo1545a()
            if (r8 == 0) goto L_0x00fc
        L_0x00ae:
            dx[] r8 = r7.f1358D
            int r9 = r12.f1306a
            r8 = r8[r9]
            dt r8 = r13.mo1520a(r8)
            dx[] r7 = r7.f1358D
            int r9 = r12.f1306a
            r7 = r7[r9]
            r7.f1334i = r8
            int r7 = r12.f1306a
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r7 == 0) goto L_0x00dd
            int r7 = r12.f1306a
            if (r7 != r3) goto L_0x00cb
            goto L_0x00dd
        L_0x00cb:
            dt r7 = r0.f1334i
            dn r10 = r13.mo1530c()
            dt r11 = r13.mo1532d()
            r11.f1292c = r2
            r10.mo1508a(r7, r8, r11, r2)
            if (r1 == 0) goto L_0x00f9
            goto L_0x00ee
        L_0x00dd:
            dt r7 = r0.f1334i
            dn r10 = r13.mo1530c()
            dt r11 = r13.mo1532d()
            r11.f1292c = r2
            r10.mo1514b(r7, r8, r11, r2)
            if (r1 == 0) goto L_0x00f9
        L_0x00ee:
            dm r7 = r10.f1230d
            float r7 = r7.mo1505b(r11)
            float r9 = r9 * r7
            int r7 = (int) r9
            r13.mo1522a(r10, r7, r4)
        L_0x00f9:
            r13.mo1521a(r10)
        L_0x00fc:
            int r6 = r6 + 1
            goto L_0x009c
        L_0x00ff:
            int r0 = r12.f1306a
            r6 = 5
            r7 = 6
            if (r0 != 0) goto L_0x0120
            dx r0 = r12.f1418x
            dt r0 = r0.f1334i
            dx r3 = r12.f1416v
            dt r3 = r3.f1334i
            r13.mo1531c(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x0172
            dx r0 = r12.f1416v
            dt r0 = r0.f1334i
            dy r1 = r12.f1361G
            dx r1 = r1.f1418x
        L_0x011a:
            dt r1 = r1.f1334i
            r13.mo1531c(r0, r1, r2, r6)
            return
        L_0x0120:
            int r0 = r12.f1306a
            if (r0 != r4) goto L_0x013a
            dx r0 = r12.f1416v
            dt r0 = r0.f1334i
            dx r3 = r12.f1418x
            dt r3 = r3.f1334i
            r13.mo1531c(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x0172
            dx r0 = r12.f1416v
            dt r0 = r0.f1334i
            dy r1 = r12.f1361G
            dx r1 = r1.f1416v
            goto L_0x011a
        L_0x013a:
            int r0 = r12.f1306a
            if (r0 != r3) goto L_0x0154
            dx r0 = r12.f1419y
            dt r0 = r0.f1334i
            dx r3 = r12.f1417w
            dt r3 = r3.f1334i
            r13.mo1531c(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x0172
            dx r0 = r12.f1417w
            dt r0 = r0.f1334i
            dy r1 = r12.f1361G
            dx r1 = r1.f1419y
            goto L_0x011a
        L_0x0154:
            int r0 = r12.f1306a
            if (r0 != r5) goto L_0x0172
            dx r0 = r12.f1417w
            dt r0 = r0.f1334i
            dx r3 = r12.f1419y
            dt r3 = r3.f1334i
            r13.mo1531c(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x0172
            dx r0 = r12.f1417w
            dt r0 = r0.f1334i
            dy r1 = r12.f1361G
            dx r1 = r1.f1417w
            dt r1 = r1.f1334i
            r13.mo1531c(r0, r1, r2, r6)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0270du.mo1544a(dq):void");
    }

    /* renamed from: a */
    public final boolean mo1545a() {
        return true;
    }

    /* renamed from: b */
    public final void mo1546b() {
        super.mo1546b();
        this.f1307an.clear();
    }

    /* JADX INFO: used method not loaded: ee.a(ee, float):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r4 >= r2) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r5 = (p000.C0288ee) r8.f1307an.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r5.f1474i == 1) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r8.f1306a == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r8.f1306a != 2) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r5.f1464f <= r1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r5.f1464f >= r1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r1 = r5.f1464f;
        r3 = r5.f1463e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (p000.C0262dq.m869a() == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r2 = p000.C0262dq.m869a();
        r2.f1282z++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r0.f1463e = r3;
        r0.f1464f = r1;
        r0.mo1649d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        switch(r8.f1306a) {
            case 0: goto L_0x007c;
            case 1: goto L_0x0079;
            case 2: goto L_0x0076;
            case 3: goto L_0x006e;
            default: goto L_0x006d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r0 = r8.f1417w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        r0.f1326a.mo1638a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        r0 = r8.f1419y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        r0 = r8.f1416v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        r0 = r8.f1418x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r0.f1326a;
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = r0.f1326a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = r8.f1307an.size();
        r3 = null;
        r4 = 0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1547c() {
        /*
            r8 = this;
            int r0 = r8.f1306a
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0010;
                case 2: goto L_0x000d;
                case 3: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            dx r0 = r8.f1419y
            goto L_0x0012
        L_0x000d:
            dx r0 = r8.f1417w
            goto L_0x0018
        L_0x0010:
            dx r0 = r8.f1418x
        L_0x0012:
            ee r0 = r0.f1326a
            r1 = r2
            goto L_0x001a
        L_0x0016:
            dx r0 = r8.f1416v
        L_0x0018:
            ee r0 = r0.f1326a
        L_0x001a:
            java.util.ArrayList<ee> r2 = r8.f1307an
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x0022:
            if (r4 >= r2) goto L_0x0050
            java.util.ArrayList<ee> r5 = r8.f1307an
            java.lang.Object r5 = r5.get(r4)
            ee r5 = (p000.C0288ee) r5
            int r6 = r5.f1474i
            r7 = 1
            if (r6 == r7) goto L_0x0032
            return
        L_0x0032:
            int r6 = r8.f1306a
            if (r6 == 0) goto L_0x0043
            int r6 = r8.f1306a
            r7 = 2
            if (r6 != r7) goto L_0x003c
            goto L_0x0043
        L_0x003c:
            float r6 = r5.f1464f
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x004d
            goto L_0x0049
        L_0x0043:
            float r6 = r5.f1464f
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x004d
        L_0x0049:
            float r1 = r5.f1464f
            ee r3 = r5.f1463e
        L_0x004d:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0050:
            dr r2 = p000.C0262dq.m869a()
            if (r2 == 0) goto L_0x0061
            dr r2 = p000.C0262dq.m869a()
            long r4 = r2.f1282z
            r6 = 1
            long r4 = r4 + r6
            r2.f1282z = r4
        L_0x0061:
            r0.f1463e = r3
            r0.f1464f = r1
            r0.mo1649d()
            int r0 = r8.f1306a
            switch(r0) {
                case 0: goto L_0x007c;
                case 1: goto L_0x0079;
                case 2: goto L_0x0076;
                case 3: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            return
        L_0x006e:
            dx r0 = r8.f1417w
        L_0x0070:
            ee r0 = r0.f1326a
            r0.mo1638a(r3, r1)
            return
        L_0x0076:
            dx r0 = r8.f1419y
            goto L_0x0070
        L_0x0079:
            dx r0 = r8.f1416v
            goto L_0x0070
        L_0x007c:
            dx r0 = r8.f1418x
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0270du.mo1547c():void");
    }
}
