package p000;

import java.util.ArrayList;

/* renamed from: dy */
public class C0278dy {

    /* renamed from: U */
    public static float f1354U = 0.5f;

    /* renamed from: A */
    C0273dx f1355A = new C0273dx(this, C0277c.CENTER_X);

    /* renamed from: B */
    C0273dx f1356B = new C0273dx(this, C0277c.CENTER_Y);

    /* renamed from: C */
    C0273dx f1357C = new C0273dx(this, C0277c.CENTER);

    /* renamed from: D */
    protected C0273dx[] f1358D = {this.f1416v, this.f1418x, this.f1417w, this.f1419y, this.f1420z, this.f1357C};

    /* renamed from: E */
    protected ArrayList<C0273dx> f1359E = new ArrayList<>();

    /* renamed from: F */
    protected int[] f1360F = {C0280a.f1423a, C0280a.f1423a};

    /* renamed from: G */
    C0278dy f1361G = null;

    /* renamed from: H */
    int f1362H = 0;

    /* renamed from: I */
    int f1363I = 0;

    /* renamed from: J */
    protected float f1364J = 0.0f;

    /* renamed from: K */
    protected int f1365K = -1;

    /* renamed from: L */
    protected int f1366L = 0;

    /* renamed from: M */
    protected int f1367M = 0;

    /* renamed from: N */
    protected int f1368N = 0;

    /* renamed from: O */
    protected int f1369O = 0;

    /* renamed from: P */
    public int f1370P = 0;

    /* renamed from: Q */
    protected int f1371Q;

    /* renamed from: R */
    protected int f1372R;

    /* renamed from: S */
    public int f1373S;

    /* renamed from: T */
    public int f1374T;

    /* renamed from: V */
    public float f1375V = f1354U;

    /* renamed from: W */
    public float f1376W = f1354U;

    /* renamed from: X */
    public Object f1377X;

    /* renamed from: Y */
    public int f1378Y = 0;

    /* renamed from: Z */
    public String f1379Z = null;

    /* renamed from: a */
    private int f1380a = 0;

    /* renamed from: aa */
    boolean f1381aa;

    /* renamed from: ab */
    boolean f1382ab;

    /* renamed from: ac */
    public int f1383ac = 0;

    /* renamed from: ad */
    public int f1384ad = 0;

    /* renamed from: ae */
    boolean f1385ae;

    /* renamed from: af */
    boolean f1386af;

    /* renamed from: ag */
    public float[] f1387ag = {-1.0f, -1.0f};

    /* renamed from: ah */
    protected C0278dy[] f1388ah = {null, null};

    /* renamed from: ai */
    protected C0278dy[] f1389ai = {null, null};

    /* renamed from: aj */
    C0278dy f1390aj = null;

    /* renamed from: ak */
    C0278dy f1391ak = null;

    /* renamed from: al */
    private int f1392al = 0;

    /* renamed from: am */
    private int f1393am = 0;

    /* renamed from: an */
    private int f1394an = 0;

    /* renamed from: ao */
    private String f1395ao = null;

    /* renamed from: b */
    private int f1396b = 0;

    /* renamed from: c */
    public int f1397c = -1;

    /* renamed from: d */
    public int f1398d = -1;

    /* renamed from: e */
    C0289ef f1399e;

    /* renamed from: f */
    C0289ef f1400f;

    /* renamed from: g */
    public int f1401g = 0;

    /* renamed from: h */
    public int f1402h = 0;

    /* renamed from: i */
    int[] f1403i = new int[2];

    /* renamed from: j */
    public int f1404j = 0;

    /* renamed from: k */
    public int f1405k = 0;

    /* renamed from: l */
    public float f1406l = 1.0f;

    /* renamed from: m */
    public int f1407m = 0;

    /* renamed from: n */
    public int f1408n = 0;

    /* renamed from: o */
    public float f1409o = 1.0f;

    /* renamed from: p */
    public boolean f1410p;

    /* renamed from: q */
    public boolean f1411q;

    /* renamed from: r */
    int f1412r = -1;

    /* renamed from: s */
    float f1413s = 1.0f;

    /* renamed from: t */
    public int[] f1414t = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: u */
    public float f1415u = 0.0f;

    /* renamed from: v */
    C0273dx f1416v = new C0273dx(this, C0277c.LEFT);

    /* renamed from: w */
    C0273dx f1417w = new C0273dx(this, C0277c.TOP);

    /* renamed from: x */
    C0273dx f1418x = new C0273dx(this, C0277c.RIGHT);

    /* renamed from: y */
    C0273dx f1419y = new C0273dx(this, C0277c.BOTTOM);

    /* renamed from: z */
    C0273dx f1420z = new C0273dx(this, C0277c.BASELINE);

    /* renamed from: dy$1 */
    static /* synthetic */ class C02791 {

        /* renamed from: b */
        static final /* synthetic */ int[] f1422b = new int[C0280a.m966a().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        static {
            /*
                int[] r0 = p000.C0278dy.C0280a.m966a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1422b = r0
                r0 = 1
                int[] r1 = f1422b     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = p000.C0278dy.C0280a.f1423a     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2 - r0
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                r1 = 2
                int[] r2 = f1422b     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = p000.C0278dy.C0280a.f1424b     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3 - r0
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r2 = 3
                int[] r3 = f1422b     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r4 = p000.C0278dy.C0280a.f1426d     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r4 = r4 - r0
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                r3 = 4
                int[] r4 = f1422b     // Catch:{ NoSuchFieldError -> 0x0029 }
                int r5 = p000.C0278dy.C0280a.f1425c     // Catch:{ NoSuchFieldError -> 0x0029 }
                int r5 = r5 - r0
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                dx$c[] r4 = p000.C0273dx.C0277c.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f1421a = r4
                int[] r4 = f1421a     // Catch:{ NoSuchFieldError -> 0x003c }
                dx$c r5 = p000.C0273dx.C0277c.LEFT     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                int[] r0 = f1421a     // Catch:{ NoSuchFieldError -> 0x0046 }
                dx$c r4 = p000.C0273dx.C0277c.TOP     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                int[] r0 = f1421a     // Catch:{ NoSuchFieldError -> 0x0050 }
                dx$c r1 = p000.C0273dx.C0277c.RIGHT     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                int[] r0 = f1421a     // Catch:{ NoSuchFieldError -> 0x005a }
                dx$c r1 = p000.C0273dx.C0277c.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r0 = f1421a     // Catch:{ NoSuchFieldError -> 0x0065 }
                dx$c r1 = p000.C0273dx.C0277c.BASELINE     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r0 = f1421a     // Catch:{ NoSuchFieldError -> 0x0070 }
                dx$c r1 = p000.C0273dx.C0277c.CENTER     // Catch:{ NoSuchFieldError -> 0x0070 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0070 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                int[] r0 = f1421a     // Catch:{ NoSuchFieldError -> 0x007b }
                dx$c r1 = p000.C0273dx.C0277c.CENTER_X     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f1421a     // Catch:{ NoSuchFieldError -> 0x0087 }
                dx$c r1 = p000.C0273dx.C0277c.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f1421a     // Catch:{ NoSuchFieldError -> 0x0093 }
                dx$c r1 = p000.C0273dx.C0277c.NONE     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0278dy.C02791.<clinit>():void");
        }
    }

    /* renamed from: dy$a */
    public enum C0280a {
        ;
        

        /* renamed from: a */
        public static final int f1423a = 1;

        /* renamed from: b */
        public static final int f1424b = 2;

        /* renamed from: c */
        public static final int f1425c = 3;

        /* renamed from: d */
        public static final int f1426d = 4;

        static {
            f1427e = new int[]{f1423a, f1424b, f1425c, f1426d};
        }

        /* renamed from: a */
        public static int[] m966a() {
            return (int[]) f1427e.clone();
        }
    }

    public C0278dy() {
        this.f1359E.add(this.f1416v);
        this.f1359E.add(this.f1417w);
        this.f1359E.add(this.f1418x);
        this.f1359E.add(this.f1419y);
        this.f1359E.add(this.f1355A);
        this.f1359E.add(this.f1356B);
        this.f1359E.add(this.f1357C);
        this.f1359E.add(this.f1420z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e9, code lost:
        if (r34 != false) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m920a(p000.C0262dq r33, boolean r34, p000.C0268dt r35, p000.C0268dt r36, int r37, boolean r38, p000.C0273dx r39, p000.C0273dx r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, int r48, int r49, int r50, float r51, boolean r52) {
        /*
            r32 = this;
            r0 = r32
            r10 = r33
            r11 = r35
            r12 = r36
            r13 = r39
            r14 = r40
            r1 = r43
            r2 = r44
            dt r9 = r10.mo1520a(r13)
            dt r8 = r10.mo1520a(r14)
            dx r6 = r13.f1329d
            dt r7 = r10.mo1520a(r6)
            dx r6 = r14.f1329d
            dt r6 = r10.mo1520a(r6)
            boolean r11 = r10.f1240d
            r15 = 1
            r21 = r6
            if (r11 == 0) goto L_0x005c
            ee r11 = r13.f1326a
            int r11 = r11.f1474i
            r6 = 1
            if (r11 != r6) goto L_0x005c
            ee r11 = r14.f1326a
            int r11 = r11.f1474i
            if (r11 != r6) goto L_0x005c
            dr r1 = p000.C0262dq.m869a()
            if (r1 == 0) goto L_0x0048
            dr r1 = p000.C0262dq.m869a()
            long r2 = r1.f1275s
            long r2 = r2 + r15
            r1.f1275s = r2
        L_0x0048:
            ee r1 = r13.f1326a
            r1.mo1637a(r10)
            ee r1 = r14.f1326a
            r1.mo1637a(r10)
            if (r47 != 0) goto L_0x005b
            if (r34 == 0) goto L_0x005b
            r1 = 0
            r2 = 6
            r10.mo1526a(r12, r8, r1, r2)
        L_0x005b:
            return
        L_0x005c:
            dr r6 = p000.C0262dq.m869a()
            if (r6 == 0) goto L_0x006b
            dr r6 = p000.C0262dq.m869a()
            long r11 = r6.f1254B
            long r11 = r11 + r15
            r6.f1254B = r11
        L_0x006b:
            boolean r6 = r39.mo1553d()
            boolean r11 = r40.mo1553d()
            dx r12 = r0.f1357C
            boolean r12 = r12.mo1553d()
            if (r6 == 0) goto L_0x007d
            r15 = 1
            goto L_0x007e
        L_0x007d:
            r15 = 0
        L_0x007e:
            if (r11 == 0) goto L_0x0082
            int r15 = r15 + 1
        L_0x0082:
            if (r12 == 0) goto L_0x0086
            int r15 = r15 + 1
        L_0x0086:
            r23 = r15
            if (r46 == 0) goto L_0x008c
            r14 = 3
            goto L_0x008e
        L_0x008c:
            r14 = r48
        L_0x008e:
            int[] r15 = p000.C0278dy.C02791.f1422b
            r17 = 1
            int r16 = r37 + -1
            r15 = r15[r16]
            r3 = 4
            switch(r15) {
                case 1: goto L_0x009a;
                case 2: goto L_0x009a;
                case 3: goto L_0x009a;
                case 4: goto L_0x009c;
                default: goto L_0x009a;
            }
        L_0x009a:
            r15 = 0
            goto L_0x00a0
        L_0x009c:
            if (r14 != r3) goto L_0x009f
            goto L_0x009a
        L_0x009f:
            r15 = 1
        L_0x00a0:
            int r3 = r0.f1378Y
            r0 = 8
            if (r3 != r0) goto L_0x00a9
            r0 = 0
            r15 = 0
            goto L_0x00ab
        L_0x00a9:
            r0 = r42
        L_0x00ab:
            if (r52 == 0) goto L_0x00c8
            if (r6 != 0) goto L_0x00b9
            if (r11 != 0) goto L_0x00b9
            if (r12 != 0) goto L_0x00b9
            r3 = r41
            r10.mo1524a(r9, r3)
            goto L_0x00c8
        L_0x00b9:
            if (r6 == 0) goto L_0x00c8
            if (r11 != 0) goto L_0x00c8
            int r3 = r39.mo1551b()
            r24 = r12
            r12 = 6
            r10.mo1531c(r9, r7, r3, r12)
            goto L_0x00cb
        L_0x00c8:
            r24 = r12
            r12 = 6
        L_0x00cb:
            if (r15 != 0) goto L_0x00f7
            if (r38 == 0) goto L_0x00e5
            r3 = 0
            r12 = 3
            r10.mo1531c(r8, r9, r3, r12)
            if (r1 <= 0) goto L_0x00db
            r3 = 6
            r10.mo1526a(r8, r9, r1, r3)
            goto L_0x00dc
        L_0x00db:
            r3 = 6
        L_0x00dc:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r0) goto L_0x00e9
            r10.mo1529b(r8, r9, r2, r3)
            goto L_0x00e9
        L_0x00e5:
            r3 = r12
            r10.mo1531c(r8, r9, r0, r3)
        L_0x00e9:
            r3 = r49
            r12 = r50
            r25 = r7
            r28 = r23
            r7 = r32
        L_0x00f3:
            r16 = 4
            goto L_0x01c7
        L_0x00f7:
            r3 = r12
            r2 = -2
            r12 = r49
            if (r12 != r2) goto L_0x0101
            r12 = r50
            r3 = r0
            goto L_0x0104
        L_0x0101:
            r3 = r12
            r12 = r50
        L_0x0104:
            if (r12 != r2) goto L_0x0107
            r12 = r0
        L_0x0107:
            if (r3 <= 0) goto L_0x0112
            r2 = 6
            r10.mo1526a(r8, r9, r3, r2)
            int r0 = java.lang.Math.max(r0, r3)
            goto L_0x0113
        L_0x0112:
            r2 = 6
        L_0x0113:
            if (r12 <= 0) goto L_0x0124
            if (r34 == 0) goto L_0x011d
            r2 = 1
            r10.mo1529b(r8, r9, r12, r2)
            r2 = 6
            goto L_0x0120
        L_0x011d:
            r10.mo1529b(r8, r9, r12, r2)
        L_0x0120:
            int r0 = java.lang.Math.min(r0, r12)
        L_0x0124:
            r2 = 1
            if (r14 != r2) goto L_0x0135
            if (r34 == 0) goto L_0x012f
            r2 = 6
        L_0x012a:
            r10.mo1531c(r8, r9, r0, r2)
            goto L_0x019b
        L_0x012f:
            if (r47 == 0) goto L_0x0133
            r2 = 4
            goto L_0x012a
        L_0x0133:
            r2 = 1
            goto L_0x012a
        L_0x0135:
            r2 = 2
            if (r14 != r2) goto L_0x019b
            dx$c r2 = r13.f1328c
            r25 = r7
            dx$c r7 = p000.C0273dx.C0277c.TOP
            if (r2 == r7) goto L_0x0168
            dx$c r2 = r13.f1328c
            dx$c r7 = p000.C0273dx.C0277c.BOTTOM
            if (r2 != r7) goto L_0x0147
            goto L_0x0168
        L_0x0147:
            r7 = r32
            dy r2 = r7.f1361G
            dx$c r13 = p000.C0273dx.C0277c.LEFT
            dx r2 = r2.mo1555a(r13)
            dt r2 = r10.mo1520a(r2)
            dy r13 = r7.f1361G
            r26 = r2
            dx$c r2 = p000.C0273dx.C0277c.RIGHT
            dx r2 = r13.mo1555a(r2)
            dt r2 = r10.mo1520a(r2)
            r18 = r2
            r19 = r26
            goto L_0x0188
        L_0x0168:
            r7 = r32
            dy r2 = r7.f1361G
            dx$c r13 = p000.C0273dx.C0277c.TOP
            dx r2 = r2.mo1555a(r13)
            dt r2 = r10.mo1520a(r2)
            dy r13 = r7.f1361G
            r27 = r2
            dx$c r2 = p000.C0273dx.C0277c.BOTTOM
            dx r2 = r13.mo1555a(r2)
            dt r2 = r10.mo1520a(r2)
            r18 = r2
            r19 = r27
        L_0x0188:
            dn r15 = r33.mo1530c()
            r16 = r8
            r17 = r9
            r20 = r51
            dn r2 = r15.mo1509a(r16, r17, r18, r19, r20)
            r10.mo1521a(r2)
            r15 = 0
            goto L_0x019f
        L_0x019b:
            r25 = r7
            r7 = r32
        L_0x019f:
            if (r15 == 0) goto L_0x01c3
            r2 = r23
            r13 = 2
            if (r2 == r13) goto L_0x01bf
            r16 = 4
            if (r46 != 0) goto L_0x01bc
            int r0 = java.lang.Math.max(r3, r0)
            if (r12 <= 0) goto L_0x01b4
            int r0 = java.lang.Math.min(r12, r0)
        L_0x01b4:
            r28 = r2
            r2 = 6
            r10.mo1531c(r8, r9, r0, r2)
            r15 = 0
            goto L_0x01c7
        L_0x01bc:
            r28 = r2
            goto L_0x01c7
        L_0x01bf:
            r28 = r2
            goto L_0x00f3
        L_0x01c3:
            r28 = r23
            goto L_0x00f3
        L_0x01c7:
            if (r52 == 0) goto L_0x02d9
            if (r47 == 0) goto L_0x01cd
            goto L_0x02d9
        L_0x01cd:
            r0 = 5
            if (r6 != 0) goto L_0x01e2
            if (r11 != 0) goto L_0x01e2
            if (r24 != 0) goto L_0x01e2
            if (r34 == 0) goto L_0x01dd
            r4 = 0
            r5 = r36
        L_0x01d9:
            r10.mo1526a(r5, r8, r4, r0)
            goto L_0x01ec
        L_0x01dd:
            r13 = r8
            r1 = 6
        L_0x01df:
            r2 = 0
            goto L_0x02d0
        L_0x01e2:
            r4 = 0
            r5 = r36
            if (r6 == 0) goto L_0x01f1
            if (r11 != 0) goto L_0x01f1
            if (r34 == 0) goto L_0x01ec
            goto L_0x01d9
        L_0x01ec:
            r2 = r4
            r13 = r8
            r1 = 6
            goto L_0x02d0
        L_0x01f1:
            if (r6 != 0) goto L_0x0208
            if (r11 == 0) goto L_0x0208
            int r1 = r40.mo1551b()
            int r1 = -r1
            r2 = r21
            r3 = 6
            r10.mo1531c(r8, r2, r1, r3)
            if (r34 == 0) goto L_0x01ec
            r1 = r35
            r10.mo1526a(r9, r1, r4, r0)
            goto L_0x01ec
        L_0x0208:
            r2 = r21
            if (r6 == 0) goto L_0x01ec
            if (r11 == 0) goto L_0x01ec
            if (r15 == 0) goto L_0x0272
            if (r34 == 0) goto L_0x0219
            if (r1 != 0) goto L_0x0219
            r6 = 6
            r10.mo1526a(r8, r9, r4, r6)
            goto L_0x021a
        L_0x0219:
            r6 = 6
        L_0x021a:
            if (r14 != 0) goto L_0x0247
            if (r12 > 0) goto L_0x0224
            if (r3 <= 0) goto L_0x0221
            goto L_0x0224
        L_0x0221:
            r11 = r4
            r1 = r6
            goto L_0x0227
        L_0x0224:
            r1 = r16
            r11 = 1
        L_0x0227:
            int r13 = r39.mo1551b()
            r14 = r25
            r10.mo1531c(r9, r14, r13, r1)
            int r13 = r40.mo1551b()
            int r13 = -r13
            r10.mo1531c(r8, r2, r13, r1)
            if (r12 > 0) goto L_0x0240
            if (r3 <= 0) goto L_0x023d
            goto L_0x0240
        L_0x023d:
            r22 = r4
            goto L_0x0242
        L_0x0240:
            r22 = 1
        L_0x0242:
            r12 = r11
            r11 = r14
            r1 = r22
            goto L_0x0288
        L_0x0247:
            r11 = r25
            r1 = 1
            if (r14 != r1) goto L_0x024f
            r12 = r1
            r0 = r6
            goto L_0x0288
        L_0x024f:
            r3 = 3
            if (r14 != r3) goto L_0x026f
            if (r46 != 0) goto L_0x025d
            int r3 = r7.f1412r
            r13 = -1
            if (r3 == r13) goto L_0x025d
            if (r12 > 0) goto L_0x025d
            r3 = r6
            goto L_0x025f
        L_0x025d:
            r3 = r16
        L_0x025f:
            int r12 = r39.mo1551b()
            r10.mo1531c(r9, r11, r12, r3)
            int r12 = r40.mo1551b()
            int r12 = -r12
            r10.mo1531c(r8, r2, r12, r3)
            goto L_0x0270
        L_0x026f:
            r1 = r4
        L_0x0270:
            r12 = r1
            goto L_0x0288
        L_0x0272:
            r11 = r25
            r1 = 1
            r6 = 6
            if (r34 == 0) goto L_0x0287
            int r3 = r39.mo1551b()
            r10.mo1526a(r9, r11, r3, r0)
            int r3 = r40.mo1551b()
            int r3 = -r3
            r10.mo1529b(r8, r2, r3, r0)
        L_0x0287:
            r12 = r4
        L_0x0288:
            if (r1 == 0) goto L_0x02ae
            int r13 = r39.mo1551b()
            int r14 = r40.mo1551b()
            r1 = r10
            r15 = r2
            r2 = r9
            r3 = r11
            r16 = r4
            r4 = r13
            r13 = r5
            r5 = r45
            r30 = r11
            r29 = r15
            r11 = r6
            r6 = r29
            r11 = r30
            r7 = r8
            r13 = r8
            r8 = r14
            r14 = r9
            r9 = r0
            r1.mo1525a(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02b2
        L_0x02ae:
            r29 = r2
            r13 = r8
            r14 = r9
        L_0x02b2:
            if (r12 == 0) goto L_0x02c7
            int r0 = r39.mo1551b()
            r1 = 6
            r10.mo1526a(r14, r11, r0, r1)
            int r0 = r40.mo1551b()
            int r0 = -r0
            r2 = r29
            r10.mo1529b(r13, r2, r0, r1)
            goto L_0x02c8
        L_0x02c7:
            r1 = 6
        L_0x02c8:
            if (r34 == 0) goto L_0x01df
            r0 = r35
            r2 = 0
            r10.mo1526a(r14, r0, r2, r1)
        L_0x02d0:
            if (r34 == 0) goto L_0x02d8
            r4 = r13
            r3 = r36
            r10.mo1526a(r3, r4, r2, r1)
        L_0x02d8:
            return
        L_0x02d9:
            r4 = r8
            r14 = r9
            r5 = r28
            r0 = r35
            r1 = 6
            r2 = 0
            r3 = r36
            r6 = 2
            if (r5 >= r6) goto L_0x02ee
            if (r34 == 0) goto L_0x02ee
            r10.mo1526a(r14, r0, r2, r1)
            r10.mo1526a(r3, r4, r2, r1)
        L_0x02ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0278dy.m920a(dq, boolean, dt, dt, int, boolean, dx, dx, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* renamed from: a */
    public C0273dx mo1555a(C0277c cVar) {
        switch (cVar) {
            case LEFT:
                return this.f1416v;
            case TOP:
                return this.f1417w;
            case RIGHT:
                return this.f1418x;
            case BOTTOM:
                return this.f1419y;
            case BASELINE:
                return this.f1420z;
            case CENTER:
                return this.f1357C;
            case CENTER_X:
                return this.f1355A;
            case CENTER_Y:
                return this.f1356B;
            case NONE:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    /* renamed from: a */
    public void mo1543a(int i) {
        C0286ec.m993a(i, this);
    }

    /* renamed from: a */
    public final void mo1556a(int i, int i2) {
        this.f1366L = i;
        this.f1367M = i2;
    }

    /* renamed from: a */
    public void mo1557a(C0260do doVar) {
        this.f1416v.mo1549a();
        this.f1417w.mo1549a();
        this.f1418x.mo1549a();
        this.f1419y.mo1549a();
        this.f1420z.mo1549a();
        this.f1357C.mo1549a();
        this.f1355A.mo1549a();
        this.f1356B.mo1549a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0317, code lost:
        if (r15.f1412r == -1) goto L_0x031b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ab  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1544a(p000.C0262dq r42) {
        /*
            r41 = this;
            r15 = r41
            r14 = r42
            dx r0 = r15.f1416v
            dt r21 = r14.mo1520a(r0)
            dx r0 = r15.f1418x
            dt r13 = r14.mo1520a(r0)
            dx r0 = r15.f1417w
            dt r12 = r14.mo1520a(r0)
            dx r0 = r15.f1419y
            dt r11 = r14.mo1520a(r0)
            dx r0 = r15.f1420z
            dt r10 = r14.mo1520a(r0)
            dy r0 = r15.f1361G
            r1 = 8
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0126
            dy r0 = r15.f1361G
            if (r0 == 0) goto L_0x003a
            dy r0 = r15.f1361G
            int[] r0 = r0.f1360F
            r0 = r0[r8]
            int r2 = p000.C0278dy.C0280a.f1424b
            if (r0 != r2) goto L_0x003a
            r0 = r9
            goto L_0x003b
        L_0x003a:
            r0 = r8
        L_0x003b:
            dy r2 = r15.f1361G
            if (r2 == 0) goto L_0x004b
            dy r2 = r15.f1361G
            int[] r2 = r2.f1360F
            r2 = r2[r9]
            int r3 = p000.C0278dy.C0280a.f1424b
            if (r2 != r3) goto L_0x004b
            r2 = r9
            goto L_0x004c
        L_0x004b:
            r2 = r8
        L_0x004c:
            dx r3 = r15.f1416v
            dx r3 = r3.f1329d
            if (r3 == 0) goto L_0x0073
            dx r3 = r15.f1416v
            dx r3 = r3.f1329d
            dx r3 = r3.f1329d
            dx r4 = r15.f1416v
            if (r3 == r4) goto L_0x0073
            dx r3 = r15.f1418x
            dx r3 = r3.f1329d
            if (r3 == 0) goto L_0x0073
            dx r3 = r15.f1418x
            dx r3 = r3.f1329d
            dx r3 = r3.f1329d
            dx r4 = r15.f1418x
            if (r3 != r4) goto L_0x0073
            dy r3 = r15.f1361G
            dz r3 = (p000.C0281dz) r3
            r3.mo1599a(r15, r8)
        L_0x0073:
            dx r3 = r15.f1416v
            dx r3 = r3.f1329d
            if (r3 == 0) goto L_0x0083
            dx r3 = r15.f1416v
            dx r3 = r3.f1329d
            dx r3 = r3.f1329d
            dx r4 = r15.f1416v
            if (r3 == r4) goto L_0x0093
        L_0x0083:
            dx r3 = r15.f1418x
            dx r3 = r3.f1329d
            if (r3 == 0) goto L_0x0095
            dx r3 = r15.f1418x
            dx r3 = r3.f1329d
            dx r3 = r3.f1329d
            dx r4 = r15.f1418x
            if (r3 != r4) goto L_0x0095
        L_0x0093:
            r3 = r9
            goto L_0x0096
        L_0x0095:
            r3 = r8
        L_0x0096:
            dx r4 = r15.f1417w
            dx r4 = r4.f1329d
            if (r4 == 0) goto L_0x00bd
            dx r4 = r15.f1417w
            dx r4 = r4.f1329d
            dx r4 = r4.f1329d
            dx r5 = r15.f1417w
            if (r4 == r5) goto L_0x00bd
            dx r4 = r15.f1419y
            dx r4 = r4.f1329d
            if (r4 == 0) goto L_0x00bd
            dx r4 = r15.f1419y
            dx r4 = r4.f1329d
            dx r4 = r4.f1329d
            dx r5 = r15.f1419y
            if (r4 != r5) goto L_0x00bd
            dy r4 = r15.f1361G
            dz r4 = (p000.C0281dz) r4
            r4.mo1599a(r15, r9)
        L_0x00bd:
            dx r4 = r15.f1417w
            dx r4 = r4.f1329d
            if (r4 == 0) goto L_0x00cd
            dx r4 = r15.f1417w
            dx r4 = r4.f1329d
            dx r4 = r4.f1329d
            dx r5 = r15.f1417w
            if (r4 == r5) goto L_0x00dd
        L_0x00cd:
            dx r4 = r15.f1419y
            dx r4 = r4.f1329d
            if (r4 == 0) goto L_0x00df
            dx r4 = r15.f1419y
            dx r4 = r4.f1329d
            dx r4 = r4.f1329d
            dx r5 = r15.f1419y
            if (r4 != r5) goto L_0x00df
        L_0x00dd:
            r4 = r9
            goto L_0x00e0
        L_0x00df:
            r4 = r8
        L_0x00e0:
            if (r0 == 0) goto L_0x00fd
            int r5 = r15.f1378Y
            if (r5 == r1) goto L_0x00fd
            dx r5 = r15.f1416v
            dx r5 = r5.f1329d
            if (r5 != 0) goto L_0x00fd
            dx r5 = r15.f1418x
            dx r5 = r5.f1329d
            if (r5 != 0) goto L_0x00fd
            dy r5 = r15.f1361G
            dx r5 = r5.f1418x
            dt r5 = r14.mo1520a(r5)
            r14.mo1526a(r5, r13, r8, r9)
        L_0x00fd:
            if (r2 == 0) goto L_0x011e
            int r5 = r15.f1378Y
            if (r5 == r1) goto L_0x011e
            dx r5 = r15.f1417w
            dx r5 = r5.f1329d
            if (r5 != 0) goto L_0x011e
            dx r5 = r15.f1419y
            dx r5 = r5.f1329d
            if (r5 != 0) goto L_0x011e
            dx r5 = r15.f1420z
            if (r5 != 0) goto L_0x011e
            dy r5 = r15.f1361G
            dx r5 = r5.f1419y
            dt r5 = r14.mo1520a(r5)
            r14.mo1526a(r5, r11, r8, r9)
        L_0x011e:
            r22 = r2
            r16 = r3
            r23 = r4
            r2 = r0
            goto L_0x012d
        L_0x0126:
            r2 = r8
            r16 = r2
            r22 = r16
            r23 = r22
        L_0x012d:
            int r0 = r15.f1362H
            int r3 = r15.f1371Q
            if (r0 >= r3) goto L_0x0135
            int r0 = r15.f1371Q
        L_0x0135:
            int r3 = r15.f1363I
            int r4 = r15.f1372R
            if (r3 >= r4) goto L_0x013d
            int r3 = r15.f1372R
        L_0x013d:
            int[] r4 = r15.f1360F
            r4 = r4[r8]
            int r5 = p000.C0278dy.C0280a.f1425c
            if (r4 == r5) goto L_0x0147
            r4 = r9
            goto L_0x0148
        L_0x0147:
            r4 = r8
        L_0x0148:
            int[] r5 = r15.f1360F
            r5 = r5[r9]
            int r6 = p000.C0278dy.C0280a.f1425c
            if (r5 == r6) goto L_0x0152
            r5 = r9
            goto L_0x0153
        L_0x0152:
            r5 = r8
        L_0x0153:
            int r6 = r15.f1365K
            r15.f1412r = r6
            float r6 = r15.f1364J
            r15.f1413s = r6
            int r6 = r15.f1401g
            int r7 = r15.f1402h
            float r9 = r15.f1364J
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            r17 = 4
            if (r9 <= 0) goto L_0x02fa
            int r9 = r15.f1378Y
            if (r9 == r1) goto L_0x02fa
            int[] r1 = r15.f1360F
            r9 = 0
            r1 = r1[r9]
            int r9 = p000.C0278dy.C0280a.f1425c
            r8 = 3
            if (r1 != r9) goto L_0x017a
            if (r6 != 0) goto L_0x017a
            r6 = r8
        L_0x017a:
            int[] r1 = r15.f1360F
            r9 = 1
            r1 = r1[r9]
            int r9 = p000.C0278dy.C0280a.f1425c
            if (r1 != r9) goto L_0x0186
            if (r7 != 0) goto L_0x0186
            r7 = r8
        L_0x0186:
            int[] r1 = r15.f1360F
            r9 = 0
            r1 = r1[r9]
            int r9 = p000.C0278dy.C0280a.f1425c
            r18 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r9) goto L_0x028a
            int[] r1 = r15.f1360F
            r9 = 1
            r1 = r1[r9]
            int r9 = p000.C0278dy.C0280a.f1425c
            if (r1 != r9) goto L_0x028a
            if (r6 != r8) goto L_0x028a
            if (r7 != r8) goto L_0x028a
            int r1 = r15.f1412r
            r8 = -1
            if (r1 != r8) goto L_0x01bc
            if (r4 == 0) goto L_0x01ab
            if (r5 != 0) goto L_0x01ab
            r1 = 0
            r15.f1412r = r1
            goto L_0x01bc
        L_0x01ab:
            if (r4 != 0) goto L_0x01bc
            if (r5 == 0) goto L_0x01bc
            r1 = 1
            r15.f1412r = r1
            int r1 = r15.f1365K
            if (r1 != r8) goto L_0x01bc
            float r1 = r15.f1413s
            float r1 = r18 / r1
            r15.f1413s = r1
        L_0x01bc:
            int r1 = r15.f1412r
            if (r1 != 0) goto L_0x01d4
            dx r1 = r15.f1417w
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x01d0
            dx r1 = r15.f1419y
            boolean r1 = r1.mo1553d()
            if (r1 != 0) goto L_0x01d4
        L_0x01d0:
            r1 = 1
        L_0x01d1:
            r15.f1412r = r1
            goto L_0x01eb
        L_0x01d4:
            r1 = 1
            int r4 = r15.f1412r
            if (r4 != r1) goto L_0x01eb
            dx r1 = r15.f1416v
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x01e9
            dx r1 = r15.f1418x
            boolean r1 = r1.mo1553d()
            if (r1 != 0) goto L_0x01eb
        L_0x01e9:
            r1 = 0
            goto L_0x01d1
        L_0x01eb:
            int r1 = r15.f1412r
            r4 = -1
            if (r1 != r4) goto L_0x023c
            dx r1 = r15.f1417w
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x0210
            dx r1 = r15.f1419y
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x0210
            dx r1 = r15.f1416v
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x0210
            dx r1 = r15.f1418x
            boolean r1 = r1.mo1553d()
            if (r1 != 0) goto L_0x023c
        L_0x0210:
            dx r1 = r15.f1417w
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x0224
            dx r1 = r15.f1419y
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x0224
            r1 = 0
        L_0x0221:
            r15.f1412r = r1
            goto L_0x023c
        L_0x0224:
            dx r1 = r15.f1416v
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x023c
            dx r1 = r15.f1418x
            boolean r1 = r1.mo1553d()
            if (r1 == 0) goto L_0x023c
            float r1 = r15.f1413s
            float r1 = r18 / r1
            r15.f1413s = r1
            r1 = 1
            goto L_0x0221
        L_0x023c:
            int r1 = r15.f1412r
            r4 = -1
            if (r1 != r4) goto L_0x0255
            if (r2 == 0) goto L_0x0249
            if (r22 != 0) goto L_0x0249
            r1 = 0
        L_0x0246:
            r15.f1412r = r1
            goto L_0x0255
        L_0x0249:
            if (r2 != 0) goto L_0x0255
            if (r22 == 0) goto L_0x0255
            float r1 = r15.f1413s
            float r1 = r18 / r1
            r15.f1413s = r1
            r1 = 1
            goto L_0x0246
        L_0x0255:
            int r1 = r15.f1412r
            r4 = -1
            if (r1 != r4) goto L_0x0276
            int r1 = r15.f1404j
            if (r1 <= 0) goto L_0x0266
            int r1 = r15.f1407m
            if (r1 != 0) goto L_0x0266
            r1 = 0
        L_0x0263:
            r15.f1412r = r1
            goto L_0x0276
        L_0x0266:
            int r1 = r15.f1404j
            if (r1 != 0) goto L_0x0276
            int r1 = r15.f1407m
            if (r1 <= 0) goto L_0x0276
            float r1 = r15.f1413s
            float r1 = r18 / r1
            r15.f1413s = r1
            r1 = 1
            goto L_0x0263
        L_0x0276:
            int r1 = r15.f1412r
            r4 = -1
            if (r1 != r4) goto L_0x02ef
            if (r2 == 0) goto L_0x02ef
            if (r22 == 0) goto L_0x02ef
            float r1 = r15.f1413s
            float r1 = r18 / r1
            r15.f1413s = r1
            r1 = 1
            r15.f1412r = r1
            goto L_0x02ef
        L_0x028a:
            int[] r1 = r15.f1360F
            r4 = 0
            r1 = r1[r4]
            int r5 = p000.C0278dy.C0280a.f1425c
            if (r1 != r5) goto L_0x02b7
            if (r6 != r8) goto L_0x02b7
            r15.f1412r = r4
            float r0 = r15.f1413s
            int r1 = r15.f1363I
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            int[] r1 = r15.f1360F
            r4 = 1
            r1 = r1[r4]
            int r5 = p000.C0278dy.C0280a.f1425c
            if (r1 == r5) goto L_0x02ac
            r18 = r0
            r29 = r3
            goto L_0x0300
        L_0x02ac:
            r18 = r0
            r29 = r3
            r28 = r4
            r17 = r6
            r27 = r7
            goto L_0x0304
        L_0x02b7:
            r4 = 1
            int[] r1 = r15.f1360F
            r1 = r1[r4]
            int r5 = p000.C0278dy.C0280a.f1425c
            if (r1 != r5) goto L_0x02ef
            if (r7 != r8) goto L_0x02ef
            r15.f1412r = r4
            int r1 = r15.f1365K
            r3 = -1
            if (r1 != r3) goto L_0x02cf
            float r1 = r15.f1413s
            float r1 = r18 / r1
            r15.f1413s = r1
        L_0x02cf:
            float r1 = r15.f1413s
            int r3 = r15.f1362H
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            int[] r3 = r15.f1360F
            r4 = 0
            r3 = r3[r4]
            int r4 = p000.C0278dy.C0280a.f1425c
            if (r3 == r4) goto L_0x02ea
            r18 = r0
            r29 = r1
            r27 = r17
            r28 = 0
            r17 = r6
            goto L_0x0304
        L_0x02ea:
            r18 = r0
            r29 = r1
            goto L_0x02f3
        L_0x02ef:
            r18 = r0
            r29 = r3
        L_0x02f3:
            r17 = r6
            r27 = r7
            r28 = 1
            goto L_0x0304
        L_0x02fa:
            r18 = r0
            r29 = r3
            r17 = r6
        L_0x0300:
            r27 = r7
            r28 = 0
        L_0x0304:
            int[] r0 = r15.f1403i
            r1 = 0
            r0[r1] = r17
            int[] r0 = r15.f1403i
            r1 = 1
            r0[r1] = r27
            if (r28 == 0) goto L_0x031e
            int r0 = r15.f1412r
            if (r0 == 0) goto L_0x031a
            int r0 = r15.f1412r
            r8 = -1
            if (r0 != r8) goto L_0x031f
            goto L_0x031b
        L_0x031a:
            r8 = -1
        L_0x031b:
            r19 = 1
            goto L_0x0321
        L_0x031e:
            r8 = -1
        L_0x031f:
            r19 = 0
        L_0x0321:
            int[] r0 = r15.f1360F
            r1 = 0
            r0 = r0[r1]
            int r1 = p000.C0278dy.C0280a.f1424b
            if (r0 != r1) goto L_0x0330
            boolean r0 = r15 instanceof p000.C0281dz
            if (r0 == 0) goto L_0x0330
            r6 = 1
            goto L_0x0331
        L_0x0330:
            r6 = 0
        L_0x0331:
            dx r0 = r15.f1357C
            boolean r0 = r0.mo1553d()
            r9 = 1
            r24 = r0 ^ 1
            int r0 = r15.f1397c
            r7 = 2
            r26 = 0
            if (r0 == r7) goto L_0x03b7
            dy r0 = r15.f1361G
            if (r0 == 0) goto L_0x034f
            dy r0 = r15.f1361G
            dx r0 = r0.f1418x
            dt r0 = r14.mo1520a(r0)
            r4 = r0
            goto L_0x0351
        L_0x034f:
            r4 = r26
        L_0x0351:
            dy r0 = r15.f1361G
            if (r0 == 0) goto L_0x035f
            dy r0 = r15.f1361G
            dx r0 = r0.f1416v
            dt r0 = r14.mo1520a(r0)
            r3 = r0
            goto L_0x0361
        L_0x035f:
            r3 = r26
        L_0x0361:
            int[] r0 = r15.f1360F
            r20 = 0
            r5 = r0[r20]
            dx r1 = r15.f1416v
            dx r0 = r15.f1418x
            int r9 = r15.f1366L
            r31 = r11
            int r11 = r15.f1371Q
            int[] r7 = r15.f1414t
            r25 = r7[r20]
            float r7 = r15.f1375V
            r33 = r13
            int r13 = r15.f1404j
            r34 = r13
            int r13 = r15.f1405k
            r35 = r13
            float r13 = r15.f1406l
            r36 = r0
            r0 = r15
            r37 = r1
            r1 = r14
            r32 = r7
            r7 = r37
            r8 = r36
            r38 = r10
            r10 = r18
            r30 = r31
            r39 = r12
            r12 = r25
            r31 = r13
            r25 = r33
            r18 = r34
            r20 = r35
            r13 = r32
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            r19 = r31
            r20 = r24
            r0.m920a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r15 = r41
            goto L_0x03bf
        L_0x03b7:
            r38 = r10
            r30 = r11
            r39 = r12
            r25 = r13
        L_0x03bf:
            int r0 = r15.f1398d
            r1 = 2
            if (r0 != r1) goto L_0x03c5
            return
        L_0x03c5:
            int[] r0 = r15.f1360F
            r14 = 1
            r0 = r0[r14]
            int r1 = p000.C0278dy.C0280a.f1424b
            if (r0 != r1) goto L_0x03d4
            boolean r0 = r15 instanceof p000.C0281dz
            if (r0 == 0) goto L_0x03d4
            r6 = r14
            goto L_0x03d5
        L_0x03d4:
            r6 = 0
        L_0x03d5:
            if (r28 == 0) goto L_0x03e3
            int r0 = r15.f1412r
            if (r0 == r14) goto L_0x03e0
            int r0 = r15.f1412r
            r1 = -1
            if (r0 != r1) goto L_0x03e3
        L_0x03e0:
            r16 = r14
            goto L_0x03e5
        L_0x03e3:
            r16 = 0
        L_0x03e5:
            int r0 = r15.f1370P
            if (r0 <= 0) goto L_0x041e
            dx r0 = r15.f1420z
            ee r0 = r0.f1326a
            int r0 = r0.f1474i
            if (r0 != r14) goto L_0x03fd
            dx r0 = r15.f1420z
            ee r0 = r0.f1326a
            r13 = r42
            r0.mo1637a(r13)
            r12 = r39
            goto L_0x0422
        L_0x03fd:
            r13 = r42
            int r0 = r15.f1370P
            r1 = 6
            r2 = r38
            r12 = r39
            r13.mo1531c(r2, r12, r0, r1)
            dx r0 = r15.f1420z
            dx r0 = r0.f1329d
            if (r0 == 0) goto L_0x0422
            dx r0 = r15.f1420z
            dx r0 = r0.f1329d
            dt r0 = r13.mo1520a(r0)
            r3 = 0
            r13.mo1531c(r2, r0, r3, r1)
            r20 = r3
            goto L_0x0424
        L_0x041e:
            r12 = r39
            r13 = r42
        L_0x0422:
            r20 = r24
        L_0x0424:
            dy r0 = r15.f1361G
            if (r0 == 0) goto L_0x0432
            dy r0 = r15.f1361G
            dx r0 = r0.f1419y
            dt r0 = r13.mo1520a(r0)
            r4 = r0
            goto L_0x0434
        L_0x0432:
            r4 = r26
        L_0x0434:
            dy r0 = r15.f1361G
            if (r0 == 0) goto L_0x0442
            dy r0 = r15.f1361G
            dx r0 = r0.f1417w
            dt r0 = r13.mo1520a(r0)
            r3 = r0
            goto L_0x0444
        L_0x0442:
            r3 = r26
        L_0x0444:
            int[] r0 = r15.f1360F
            r5 = r0[r14]
            dx r7 = r15.f1417w
            dx r8 = r15.f1419y
            int r9 = r15.f1367M
            int r11 = r15.f1372R
            int[] r0 = r15.f1414t
            r17 = r0[r14]
            float r10 = r15.f1376W
            int r2 = r15.f1407m
            int r1 = r15.f1408n
            float r0 = r15.f1409o
            r19 = r0
            r0 = r15
            r18 = r1
            r1 = r13
            r24 = r2
            r2 = r22
            r22 = r10
            r10 = r29
            r26 = r12
            r12 = r17
            r13 = r22
            r14 = r16
            r15 = r23
            r16 = r27
            r17 = r24
            r0.m920a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r28 == 0) goto L_0x04a1
            r6 = r41
            int r0 = r6.f1412r
            r1 = 1
            if (r0 != r1) goto L_0x0494
            float r5 = r6.f1413s
            r0 = r42
            r1 = r30
            r2 = r26
            r3 = r25
            r4 = r21
        L_0x0490:
            r0.mo1527a(r1, r2, r3, r4, r5)
            goto L_0x04a3
        L_0x0494:
            float r5 = r6.f1413s
            r0 = r42
            r1 = r25
            r2 = r21
            r3 = r30
            r4 = r26
            goto L_0x0490
        L_0x04a1:
            r6 = r41
        L_0x04a3:
            dx r0 = r6.f1357C
            boolean r0 = r0.mo1553d()
            if (r0 == 0) goto L_0x053f
            dx r0 = r6.f1357C
            dx r0 = r0.f1329d
            dy r0 = r0.f1327b
            float r1 = r6.f1415u
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            dx r2 = r6.f1357C
            int r2 = r2.mo1551b()
            dx$c r3 = p000.C0273dx.C0277c.LEFT
            dx r3 = r6.mo1555a(r3)
            r4 = r42
            dt r8 = r4.mo1520a(r3)
            dx$c r3 = p000.C0273dx.C0277c.TOP
            dx r3 = r6.mo1555a(r3)
            dt r10 = r4.mo1520a(r3)
            dx$c r3 = p000.C0273dx.C0277c.RIGHT
            dx r3 = r6.mo1555a(r3)
            dt r3 = r4.mo1520a(r3)
            dx$c r5 = p000.C0273dx.C0277c.BOTTOM
            dx r5 = r6.mo1555a(r5)
            dt r11 = r4.mo1520a(r5)
            dx$c r5 = p000.C0273dx.C0277c.LEFT
            dx r5 = r0.mo1555a(r5)
            dt r5 = r4.mo1520a(r5)
            dx$c r7 = p000.C0273dx.C0277c.TOP
            dx r7 = r0.mo1555a(r7)
            dt r12 = r4.mo1520a(r7)
            dx$c r7 = p000.C0273dx.C0277c.RIGHT
            dx r7 = r0.mo1555a(r7)
            dt r15 = r4.mo1520a(r7)
            dx$c r7 = p000.C0273dx.C0277c.BOTTOM
            dx r0 = r0.mo1555a(r7)
            dt r13 = r4.mo1520a(r0)
            dn r0 = r42.mo1530c()
            double r6 = (double) r1
            double r16 = java.lang.Math.sin(r6)
            double r1 = (double) r2
            r40 = r15
            double r14 = r16 * r1
            float r14 = (float) r14
            r9 = r0
            r9.mo1515b(r10, r11, r12, r13, r14)
            r4.mo1521a(r0)
            dn r0 = r42.mo1530c()
            double r6 = java.lang.Math.cos(r6)
            double r6 = r6 * r1
            float r12 = (float) r6
            r7 = r0
            r9 = r3
            r10 = r5
            r11 = r40
            r7.mo1515b(r8, r9, r10, r11, r12)
            r4.mo1521a(r0)
        L_0x053f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0278dy.mo1544a(dq):void");
    }

    /* renamed from: a */
    public final void mo1558a(C0277c cVar, C0278dy dyVar, C0277c cVar2, int i, int i2) {
        mo1555a(cVar).mo1550a(dyVar.mo1555a(cVar2), i, i2, C0276b.f1341b, 0, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1559a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = r4
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = r5
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = r0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f1364J = r9
            r8.f1365K = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f1364J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0278dy.mo1559a(java.lang.String):void");
    }

    /* renamed from: a */
    public boolean mo1545a() {
        return this.f1378Y != 8;
    }

    /* renamed from: b */
    public void mo1546b() {
        for (int i = 0; i < 6; i++) {
            this.f1358D[i].f1326a.mo1641b();
        }
    }

    /* renamed from: b */
    public final void mo1560b(int i) {
        this.f1366L = i;
    }

    /* renamed from: b */
    public void mo1561b(int i, int i2) {
        this.f1368N = i;
        this.f1369O = i2;
    }

    /* renamed from: b */
    public final void mo1562b(C0262dq dqVar) {
        dqVar.mo1520a((Object) this.f1416v);
        dqVar.mo1520a((Object) this.f1417w);
        dqVar.mo1520a((Object) this.f1418x);
        dqVar.mo1520a((Object) this.f1419y);
        if (this.f1370P > 0) {
            dqVar.mo1520a((Object) this.f1420z);
        }
    }

    /* renamed from: c */
    public void mo1547c() {
    }

    /* renamed from: c */
    public final void mo1563c(int i) {
        this.f1367M = i;
    }

    /* renamed from: c */
    public final void mo1564c(int i, int i2) {
        this.f1366L = i;
        this.f1362H = i2 - i;
        if (this.f1362H < this.f1371Q) {
            this.f1362H = this.f1371Q;
        }
    }

    /* renamed from: d */
    public final void mo1565d(int i) {
        this.f1362H = i;
        if (this.f1362H < this.f1371Q) {
            this.f1362H = this.f1371Q;
        }
    }

    /* renamed from: d */
    public final void mo1566d(int i, int i2) {
        this.f1367M = i;
        this.f1363I = i2 - i;
        if (this.f1363I < this.f1372R) {
            this.f1363I = this.f1372R;
        }
    }

    /* renamed from: d */
    public final boolean mo1567d() {
        return this.f1401g == 0 && this.f1364J == 0.0f && this.f1404j == 0 && this.f1405k == 0 && this.f1360F[0] == C0280a.f1425c;
    }

    /* renamed from: e */
    public final void mo1568e(int i) {
        this.f1363I = i;
        if (this.f1363I < this.f1372R) {
            this.f1363I = this.f1372R;
        }
    }

    /* renamed from: e */
    public final boolean mo1569e() {
        return this.f1402h == 0 && this.f1364J == 0.0f && this.f1407m == 0 && this.f1408n == 0 && this.f1360F[1] == C0280a.f1425c;
    }

    /* renamed from: f */
    public void mo1570f() {
        this.f1416v.mo1552c();
        this.f1417w.mo1552c();
        this.f1418x.mo1552c();
        this.f1419y.mo1552c();
        this.f1420z.mo1552c();
        this.f1355A.mo1552c();
        this.f1356B.mo1552c();
        this.f1357C.mo1552c();
        this.f1361G = null;
        this.f1415u = 0.0f;
        this.f1362H = 0;
        this.f1363I = 0;
        this.f1364J = 0.0f;
        this.f1365K = -1;
        this.f1366L = 0;
        this.f1367M = 0;
        this.f1380a = 0;
        this.f1396b = 0;
        this.f1392al = 0;
        this.f1393am = 0;
        this.f1368N = 0;
        this.f1369O = 0;
        this.f1370P = 0;
        this.f1371Q = 0;
        this.f1372R = 0;
        this.f1373S = 0;
        this.f1374T = 0;
        this.f1375V = f1354U;
        this.f1376W = f1354U;
        this.f1360F[0] = C0280a.f1423a;
        this.f1360F[1] = C0280a.f1423a;
        this.f1377X = null;
        this.f1394an = 0;
        this.f1378Y = 0;
        this.f1395ao = null;
        this.f1381aa = false;
        this.f1382ab = false;
        this.f1383ac = 0;
        this.f1384ad = 0;
        this.f1385ae = false;
        this.f1386af = false;
        this.f1387ag[0] = -1.0f;
        this.f1387ag[1] = -1.0f;
        this.f1397c = -1;
        this.f1398d = -1;
        this.f1414t[0] = Integer.MAX_VALUE;
        this.f1414t[1] = Integer.MAX_VALUE;
        this.f1401g = 0;
        this.f1402h = 0;
        this.f1406l = 1.0f;
        this.f1409o = 1.0f;
        this.f1405k = Integer.MAX_VALUE;
        this.f1408n = Integer.MAX_VALUE;
        this.f1404j = 0;
        this.f1407m = 0;
        this.f1412r = -1;
        this.f1413s = 1.0f;
        if (this.f1399e != null) {
            this.f1399e.mo1641b();
        }
        if (this.f1400f != null) {
            this.f1400f.mo1641b();
        }
    }

    /* renamed from: f */
    public final void mo1571f(int i) {
        if (i < 0) {
            this.f1371Q = 0;
        } else {
            this.f1371Q = i;
        }
    }

    /* renamed from: g */
    public final void mo1572g() {
        for (int i = 0; i < 6; i++) {
            C0288ee eeVar = this.f1358D[i].f1326a;
            C0273dx dxVar = eeVar.f1459a.f1329d;
            if (dxVar != null) {
                if (dxVar.f1329d == eeVar.f1459a) {
                    eeVar.f1465g = 4;
                    dxVar.f1326a.f1465g = 4;
                }
                int b = eeVar.f1459a.mo1551b();
                if (eeVar.f1459a.f1328c == C0277c.RIGHT || eeVar.f1459a.f1328c == C0277c.BOTTOM) {
                    b = -b;
                }
                eeVar.mo1643b(dxVar.f1326a, b);
            }
        }
    }

    /* renamed from: g */
    public final void mo1573g(int i) {
        if (i < 0) {
            this.f1372R = 0;
        } else {
            this.f1372R = i;
        }
    }

    /* renamed from: h */
    public final C0289ef mo1574h() {
        if (this.f1399e == null) {
            this.f1399e = new C0289ef();
        }
        return this.f1399e;
    }

    /* renamed from: h */
    public final void mo1575h(int i) {
        this.f1360F[0] = i;
        if (i == C0280a.f1424b) {
            mo1565d(this.f1373S);
        }
    }

    /* renamed from: i */
    public final C0289ef mo1576i() {
        if (this.f1400f == null) {
            this.f1400f = new C0289ef();
        }
        return this.f1400f;
    }

    /* renamed from: i */
    public final void mo1577i(int i) {
        this.f1360F[1] = i;
        if (i == C0280a.f1424b) {
            mo1568e(this.f1374T);
        }
    }

    /* renamed from: j */
    public final int mo1578j() {
        return this.f1366L;
    }

    /* renamed from: k */
    public final int mo1579k() {
        return this.f1367M;
    }

    /* renamed from: l */
    public final int mo1580l() {
        if (this.f1378Y == 8) {
            return 0;
        }
        return this.f1362H;
    }

    /* renamed from: m */
    public final int mo1581m() {
        if (this.f1378Y == 8) {
            return 0;
        }
        return this.f1363I;
    }

    /* renamed from: n */
    public final int mo1582n() {
        return this.f1380a + this.f1368N;
    }

    /* renamed from: o */
    public final int mo1583o() {
        return this.f1396b + this.f1369O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo1584p() {
        return this.f1366L + this.f1368N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo1585q() {
        return this.f1367M + this.f1369O;
    }

    /* renamed from: r */
    public final int mo1586r() {
        return this.f1366L + this.f1362H;
    }

    /* renamed from: s */
    public final int mo1587s() {
        return this.f1367M + this.f1363I;
    }

    /* renamed from: t */
    public final boolean mo1588t() {
        return this.f1370P > 0;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f1395ao != null) {
            StringBuilder sb2 = new StringBuilder("type: ");
            sb2.append(this.f1395ao);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f1379Z != null) {
            StringBuilder sb3 = new StringBuilder("id: ");
            sb3.append(this.f1379Z);
            sb3.append(" ");
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f1366L);
        sb.append(", ");
        sb.append(this.f1367M);
        sb.append(") - (");
        sb.append(this.f1362H);
        sb.append(" x ");
        sb.append(this.f1363I);
        sb.append(") wrap: (");
        sb.append(this.f1373S);
        sb.append(" x ");
        sb.append(this.f1374T);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public ArrayList<C0273dx> mo1590u() {
        return this.f1359E;
    }

    /* renamed from: v */
    public void mo1591v() {
        int i = this.f1366L;
        int i2 = this.f1367M;
        int i3 = this.f1366L + this.f1362H;
        int i4 = this.f1367M + this.f1363I;
        this.f1380a = i;
        this.f1396b = i2;
        this.f1392al = i3 - i;
        this.f1393am = i4 - i2;
    }

    /* renamed from: w */
    public final void mo1592w() {
        int size = this.f1359E.size();
        for (int i = 0; i < size; i++) {
            ((C0273dx) this.f1359E.get(i)).mo1552c();
        }
    }

    /* renamed from: x */
    public final int mo1593x() {
        return this.f1360F[0];
    }

    /* renamed from: y */
    public final int mo1594y() {
        return this.f1360F[1];
    }

    /* renamed from: z */
    public void mo1595z() {
        int b = C0262dq.m871b((Object) this.f1416v);
        int b2 = C0262dq.m871b((Object) this.f1417w);
        int b3 = C0262dq.m871b((Object) this.f1418x);
        int b4 = C0262dq.m871b((Object) this.f1419y);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        int i2 = b3 - b;
        int i3 = b4 - b2;
        this.f1366L = b;
        this.f1367M = b2;
        if (this.f1378Y == 8) {
            this.f1362H = 0;
            this.f1363I = 0;
            return;
        }
        if (this.f1360F[0] == C0280a.f1423a && i2 < this.f1362H) {
            i2 = this.f1362H;
        }
        if (this.f1360F[1] == C0280a.f1423a && i3 < this.f1363I) {
            i3 = this.f1363I;
        }
        this.f1362H = i2;
        this.f1363I = i3;
        if (this.f1363I < this.f1372R) {
            this.f1363I = this.f1372R;
        }
        if (this.f1362H < this.f1371Q) {
            this.f1362H = this.f1371Q;
        }
    }
}
