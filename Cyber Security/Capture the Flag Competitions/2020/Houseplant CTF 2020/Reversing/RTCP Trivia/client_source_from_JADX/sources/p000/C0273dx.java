package p000;

/* renamed from: dx */
public final class C0273dx {

    /* renamed from: a */
    public C0288ee f1326a = new C0288ee(this);

    /* renamed from: b */
    final C0278dy f1327b;

    /* renamed from: c */
    final C0277c f1328c;

    /* renamed from: d */
    public C0273dx f1329d;

    /* renamed from: e */
    public int f1330e = 0;

    /* renamed from: f */
    int f1331f = -1;

    /* renamed from: g */
    int f1332g = C0276b.f1340a;

    /* renamed from: h */
    int f1333h = 0;

    /* renamed from: i */
    public C0268dt f1334i;

    /* renamed from: j */
    private int f1335j = C0275a.f1337a;

    /* renamed from: dx$a */
    public enum C0275a {
        ;
        

        /* renamed from: a */
        public static final int f1337a = 1;

        /* renamed from: b */
        public static final int f1338b = 2;

        static {
            f1339c = new int[]{f1337a, f1338b};
        }
    }

    /* renamed from: dx$b */
    public enum C0276b {
        ;
        

        /* renamed from: a */
        public static final int f1340a = 1;

        /* renamed from: b */
        public static final int f1341b = 2;

        /* renamed from: c */
        public static final int f1342c = 3;

        static {
            f1343d = new int[]{f1340a, f1341b, f1342c};
        }
    }

    /* renamed from: dx$c */
    public enum C0277c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0273dx(C0278dy dyVar, C0277c cVar) {
        this.f1327b = dyVar;
        this.f1328c = cVar;
    }

    /* renamed from: a */
    public final void mo1549a() {
        if (this.f1334i == null) {
            this.f1334i = new C0268dt(C0269a.f1300a);
        } else {
            this.f1334i.mo1539b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r4.f1327b.mo1588t() == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r10 != p000.C0273dx.C0277c.f1352i) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        if (r10 != p000.C0273dx.C0277c.f1351h) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0092, code lost:
        if (r10 != p000.C0273dx.C0277c.f1352i) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0097 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1550a(p000.C0273dx r5, int r6, int r7, int r8, int r9, boolean r10) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0014
            r5 = 0
            r4.f1329d = r5
            r4.f1330e = r1
            r5 = -1
            r4.f1331f = r5
            int r5 = p000.C0273dx.C0276b.f1340a
            r4.f1332g = r5
            r5 = 2
            r4.f1333h = r5
            return r0
        L_0x0014:
            if (r10 != 0) goto L_0x0098
            if (r5 != 0) goto L_0x001b
        L_0x0018:
            r10 = r1
            goto L_0x0095
        L_0x001b:
            dx$c r10 = r5.f1328c
            dx$c r2 = r4.f1328c
            if (r10 != r2) goto L_0x003b
            dx$c r10 = r4.f1328c
            dx$c r2 = p000.C0273dx.C0277c.BASELINE
            if (r10 != r2) goto L_0x0038
            dy r10 = r5.f1327b
            boolean r10 = r10.mo1588t()
            if (r10 == 0) goto L_0x0018
            dy r10 = r4.f1327b
            boolean r10 = r10.mo1588t()
            if (r10 != 0) goto L_0x0038
            goto L_0x0018
        L_0x0038:
            r10 = r0
            goto L_0x0095
        L_0x003b:
            int[] r2 = p000.C0273dx.C02741.f1336a
            dx$c r3 = r4.f1328c
            int r3 = r3.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L_0x0088;
                case 2: goto L_0x006f;
                case 3: goto L_0x006f;
                case 4: goto L_0x0054;
                case 5: goto L_0x0054;
                case 6: goto L_0x0018;
                case 7: goto L_0x0018;
                case 8: goto L_0x0018;
                case 9: goto L_0x0018;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            dx$c r6 = r4.f1328c
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L_0x0054:
            dx$c r2 = p000.C0273dx.C0277c.TOP
            if (r10 == r2) goto L_0x005f
            dx$c r2 = p000.C0273dx.C0277c.BOTTOM
            if (r10 != r2) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r2 = r1
            goto L_0x0060
        L_0x005f:
            r2 = r0
        L_0x0060:
            dy r3 = r5.f1327b
            boolean r3 = r3 instanceof p000.C0283ea
            if (r3 == 0) goto L_0x006d
            if (r2 != 0) goto L_0x0038
            dx$c r2 = p000.C0273dx.C0277c.CENTER_Y
            if (r10 != r2) goto L_0x0018
            goto L_0x0038
        L_0x006d:
            r10 = r2
            goto L_0x0095
        L_0x006f:
            dx$c r2 = p000.C0273dx.C0277c.LEFT
            if (r10 == r2) goto L_0x007a
            dx$c r2 = p000.C0273dx.C0277c.RIGHT
            if (r10 != r2) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r1
            goto L_0x007b
        L_0x007a:
            r2 = r0
        L_0x007b:
            dy r3 = r5.f1327b
            boolean r3 = r3 instanceof p000.C0283ea
            if (r3 == 0) goto L_0x006d
            if (r2 != 0) goto L_0x0038
            dx$c r2 = p000.C0273dx.C0277c.CENTER_X
            if (r10 != r2) goto L_0x0018
            goto L_0x0038
        L_0x0088:
            dx$c r2 = p000.C0273dx.C0277c.BASELINE
            if (r10 == r2) goto L_0x0018
            dx$c r2 = p000.C0273dx.C0277c.CENTER_X
            if (r10 == r2) goto L_0x0018
            dx$c r2 = p000.C0273dx.C0277c.CENTER_Y
            if (r10 == r2) goto L_0x0018
            goto L_0x0038
        L_0x0095:
            if (r10 != 0) goto L_0x0098
            return r1
        L_0x0098:
            r4.f1329d = r5
            if (r6 <= 0) goto L_0x009f
            r4.f1330e = r6
            goto L_0x00a1
        L_0x009f:
            r4.f1330e = r1
        L_0x00a1:
            r4.f1331f = r7
            r4.f1332g = r8
            r4.f1333h = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0273dx.mo1550a(dx, int, int, int, int, boolean):boolean");
    }

    /* renamed from: b */
    public final int mo1551b() {
        if (this.f1327b.f1378Y == 8) {
            return 0;
        }
        return (this.f1331f < 0 || this.f1329d == null || this.f1329d.f1327b.f1378Y != 8) ? this.f1330e : this.f1331f;
    }

    /* renamed from: c */
    public final void mo1552c() {
        this.f1329d = null;
        this.f1330e = 0;
        this.f1331f = -1;
        this.f1332g = C0276b.f1341b;
        this.f1333h = 0;
        this.f1335j = C0275a.f1337a;
        this.f1326a.mo1641b();
    }

    /* renamed from: d */
    public final boolean mo1553d() {
        return this.f1329d != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1327b.f1379Z);
        sb.append(":");
        sb.append(this.f1328c.toString());
        return sb.toString();
    }
}
