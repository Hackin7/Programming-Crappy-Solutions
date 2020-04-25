package p000;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: jr */
public final class C0578jr {

    /* renamed from: a */
    public static final C0578jr f2373a;

    /* renamed from: b */
    public static final C0578jr f2374b;

    /* renamed from: c */
    public final boolean f2375c;

    /* renamed from: d */
    public final boolean f2376d;

    /* renamed from: e */
    public final int f2377e;

    /* renamed from: f */
    public final boolean f2378f;

    /* renamed from: g */
    public final boolean f2379g;

    /* renamed from: h */
    public final boolean f2380h;

    /* renamed from: i */
    public final int f2381i;

    /* renamed from: j */
    public final int f2382j;

    /* renamed from: k */
    public final boolean f2383k;

    /* renamed from: l */
    public final boolean f2384l;
    @Nullable

    /* renamed from: m */
    String f2385m;

    /* renamed from: n */
    private final int f2386n;

    /* renamed from: o */
    private final boolean f2387o;

    /* renamed from: jr$a */
    public static final class C0579a {

        /* renamed from: a */
        boolean f2388a;

        /* renamed from: b */
        boolean f2389b;

        /* renamed from: c */
        int f2390c = -1;

        /* renamed from: d */
        int f2391d = -1;

        /* renamed from: e */
        int f2392e = -1;

        /* renamed from: f */
        boolean f2393f;

        /* renamed from: g */
        boolean f2394g;

        /* renamed from: h */
        boolean f2395h;

        /* renamed from: a */
        public final C0578jr mo2287a() {
            return new C0578jr(this);
        }
    }

    static {
        C0579a aVar = new C0579a();
        aVar.f2388a = true;
        f2373a = aVar.mo2287a();
        C0579a aVar2 = new C0579a();
        aVar2.f2393f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.f2391d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        f2374b = aVar2.mo2287a();
    }

    C0578jr(C0579a aVar) {
        this.f2375c = aVar.f2388a;
        this.f2376d = aVar.f2389b;
        this.f2377e = aVar.f2390c;
        this.f2386n = -1;
        this.f2378f = false;
        this.f2379g = false;
        this.f2380h = false;
        this.f2381i = aVar.f2391d;
        this.f2382j = aVar.f2392e;
        this.f2383k = aVar.f2393f;
        this.f2387o = aVar.f2394g;
        this.f2384l = aVar.f2395h;
    }

    private C0578jr(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f2375c = z;
        this.f2376d = z2;
        this.f2377e = i;
        this.f2386n = i2;
        this.f2378f = z3;
        this.f2379g = z4;
        this.f2380h = z5;
        this.f2381i = i3;
        this.f2382j = i4;
        this.f2383k = z6;
        this.f2387o = z7;
        this.f2384l = z8;
        this.f2385m = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0578jr m1769a(p000.C0605ke r24) {
        /*
            r0 = r24
            java.lang.String[] r1 = r0.f2577a
            int r1 = r1.length
            int r1 = r1 / 2
            r6 = 0
            r7 = 1
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = -1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x001c:
            if (r6 >= r1) goto L_0x014d
            java.lang.String r9 = r0.mo2322a(r6)
            java.lang.String r2 = r0.mo2325b(r6)
            java.lang.String r4 = "Cache-Control"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0034
            if (r8 == 0) goto L_0x0032
        L_0x0030:
            r7 = 0
            goto L_0x003d
        L_0x0032:
            r8 = r2
            goto L_0x003d
        L_0x0034:
            java.lang.String r4 = "Pragma"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0146
            goto L_0x0030
        L_0x003d:
            r4 = 0
        L_0x003e:
            int r9 = r2.length()
            if (r4 >= r9) goto L_0x0146
            java.lang.String r9 = "=,;"
            int r9 = p000.C0662lm.m2052a(r2, r4, r9)
            java.lang.String r4 = r2.substring(r4, r9)
            java.lang.String r4 = r4.trim()
            int r3 = r2.length()
            if (r9 == r3) goto L_0x009f
            char r3 = r2.charAt(r9)
            r5 = 44
            if (r3 == r5) goto L_0x009f
            char r3 = r2.charAt(r9)
            r5 = 59
            if (r3 != r5) goto L_0x0069
            goto L_0x009f
        L_0x0069:
            int r9 = r9 + 1
            int r3 = p000.C0662lm.m2051a(r2, r9)
            int r5 = r2.length()
            if (r3 >= r5) goto L_0x008e
            char r5 = r2.charAt(r3)
            r9 = 34
            if (r5 != r9) goto L_0x008e
            int r3 = r3 + 1
            java.lang.String r5 = "\""
            int r5 = p000.C0662lm.m2052a(r2, r3, r5)
            java.lang.String r3 = r2.substring(r3, r5)
            r22 = 1
            int r5 = r5 + 1
            goto L_0x00a5
        L_0x008e:
            r22 = 1
            java.lang.String r5 = ",;"
            int r5 = p000.C0662lm.m2052a(r2, r3, r5)
            java.lang.String r3 = r2.substring(r3, r5)
            java.lang.String r3 = r3.trim()
            goto L_0x00a5
        L_0x009f:
            r22 = 1
            int r9 = r9 + 1
            r5 = r9
            r3 = 0
        L_0x00a5:
            java.lang.String r9 = "no-cache"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00b1
            r4 = r5
            r10 = r22
            goto L_0x003e
        L_0x00b1:
            java.lang.String r9 = "no-store"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00bd
            r4 = r5
            r11 = r22
            goto L_0x003e
        L_0x00bd:
            java.lang.String r9 = "max-age"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00cd
            r9 = -1
            int r12 = p000.C0662lm.m2056b(r3, r9)
        L_0x00ca:
            r4 = r5
            goto L_0x003e
        L_0x00cd:
            java.lang.String r9 = "s-maxage"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00db
            r9 = -1
            int r13 = p000.C0662lm.m2056b(r3, r9)
            goto L_0x00ca
        L_0x00db:
            java.lang.String r9 = "private"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00e8
            r4 = r5
            r14 = r22
            goto L_0x003e
        L_0x00e8:
            java.lang.String r9 = "public"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00f5
            r4 = r5
            r15 = r22
            goto L_0x003e
        L_0x00f5:
            java.lang.String r9 = "must-revalidate"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0102
            r4 = r5
            r16 = r22
            goto L_0x003e
        L_0x0102:
            java.lang.String r9 = "max-stale"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0112
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r17 = p000.C0662lm.m2056b(r3, r4)
            goto L_0x00ca
        L_0x0112:
            java.lang.String r9 = "min-fresh"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0120
            r9 = -1
            int r18 = p000.C0662lm.m2056b(r3, r9)
            goto L_0x00ca
        L_0x0120:
            r9 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x012e
            r4 = r5
            r19 = r22
            goto L_0x003e
        L_0x012e:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x013b
            r4 = r5
            r20 = r22
            goto L_0x003e
        L_0x013b:
            java.lang.String r3 = "immutable"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x00ca
            r21 = r22
            goto L_0x00ca
        L_0x0146:
            r9 = -1
            r22 = 1
            int r6 = r6 + 1
            goto L_0x001c
        L_0x014d:
            if (r7 != 0) goto L_0x0152
            r22 = 0
            goto L_0x0154
        L_0x0152:
            r22 = r8
        L_0x0154:
            jr r0 = new jr
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0578jr.m1769a(ke):jr");
    }

    public final String toString() {
        String str;
        String str2 = this.f2385m;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2375c) {
            sb.append("no-cache, ");
        }
        if (this.f2376d) {
            sb.append("no-store, ");
        }
        if (this.f2377e != -1) {
            sb.append("max-age=");
            sb.append(this.f2377e);
            sb.append(", ");
        }
        if (this.f2386n != -1) {
            sb.append("s-maxage=");
            sb.append(this.f2386n);
            sb.append(", ");
        }
        if (this.f2378f) {
            sb.append("private, ");
        }
        if (this.f2379g) {
            sb.append("public, ");
        }
        if (this.f2380h) {
            sb.append("must-revalidate, ");
        }
        if (this.f2381i != -1) {
            sb.append("max-stale=");
            sb.append(this.f2381i);
            sb.append(", ");
        }
        if (this.f2382j != -1) {
            sb.append("min-fresh=");
            sb.append(this.f2382j);
            sb.append(", ");
        }
        if (this.f2383k) {
            sb.append("only-if-cached, ");
        }
        if (this.f2387o) {
            sb.append("no-transform, ");
        }
        if (this.f2384l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            str = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
        }
        this.f2385m = str;
        return str;
    }
}
