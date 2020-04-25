package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: kf */
public final class C0607kf {

    /* renamed from: e */
    private static final char[] f2579e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f2580a;

    /* renamed from: b */
    public final String f2581b;

    /* renamed from: c */
    public final int f2582c;
    @Nullable

    /* renamed from: d */
    public final List<String> f2583d;

    /* renamed from: f */
    private final String f2584f;

    /* renamed from: g */
    private final String f2585g;

    /* renamed from: h */
    private final List<String> f2586h;
    @Nullable

    /* renamed from: i */
    private final String f2587i;

    /* renamed from: j */
    private final String f2588j;

    /* renamed from: kf$a */
    public static final class C0608a {
        @Nullable

        /* renamed from: a */
        String f2589a;

        /* renamed from: b */
        String f2590b = "";

        /* renamed from: c */
        String f2591c = "";
        @Nullable

        /* renamed from: d */
        String f2592d;

        /* renamed from: e */
        int f2593e = -1;

        /* renamed from: f */
        final List<String> f2594f = new ArrayList();
        @Nullable

        /* renamed from: g */
        List<String> f2595g;
        @Nullable

        /* renamed from: h */
        String f2596h;

        /* renamed from: kf$a$a */
        enum C0609a {
            ;
            

            /* renamed from: a */
            public static final int f2597a = 1;

            /* renamed from: b */
            public static final int f2598b = 2;

            /* renamed from: c */
            public static final int f2599c = 3;

            /* renamed from: d */
            public static final int f2600d = 4;

            /* renamed from: e */
            public static final int f2601e = 5;

            static {
                f2602f = new int[]{f2597a, f2598b, f2599c, f2600d, f2601e};
            }
        }

        public C0608a() {
            this.f2594f.add("");
        }

        /* renamed from: a */
        static String m1873a(String str, int i, int i2) {
            return C0633kv.m1965a(C0607kf.m1855a(str, i, i2, false));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00e4 A[SYNTHETIC] */
        /* renamed from: b */
        private void m1874b(java.lang.String r12, int r13, int r14) {
            /*
                r11 = this;
                if (r13 != r14) goto L_0x0003
                return
            L_0x0003:
                char r0 = r12.charAt(r13)
                r1 = 47
                r2 = 1
                if (r0 == r1) goto L_0x0020
                r1 = 92
                if (r0 != r1) goto L_0x0011
                goto L_0x0020
            L_0x0011:
                java.util.List<java.lang.String> r0 = r11.f2594f
                java.util.List<java.lang.String> r1 = r11.f2594f
                int r1 = r1.size()
                int r1 = r1 - r2
                java.lang.String r3 = ""
                r0.set(r1, r3)
                goto L_0x002e
            L_0x0020:
                java.util.List<java.lang.String> r0 = r11.f2594f
                r0.clear()
                java.util.List<java.lang.String> r0 = r11.f2594f
                java.lang.String r1 = ""
                r0.add(r1)
            L_0x002c:
                int r13 = r13 + 1
            L_0x002e:
                r4 = r13
                if (r4 >= r14) goto L_0x00e4
                java.lang.String r13 = "/\\"
                int r13 = p000.C0633kv.m1962a(r12, r4, r14, r13)
                r0 = 0
                if (r13 >= r14) goto L_0x003c
                r1 = r2
                goto L_0x003d
            L_0x003c:
                r1 = r0
            L_0x003d:
                java.lang.String r6 = " \"<>^`{}|/\\?#"
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 1
                r3 = r12
                r5 = r13
                java.lang.String r3 = p000.C0607kf.m1854a(r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r4 = "."
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x005c
                java.lang.String r4 = "%2e"
                boolean r4 = r3.equalsIgnoreCase(r4)
                if (r4 == 0) goto L_0x005a
                goto L_0x005c
            L_0x005a:
                r4 = r0
                goto L_0x005d
            L_0x005c:
                r4 = r2
            L_0x005d:
                if (r4 != 0) goto L_0x00e0
                java.lang.String r4 = ".."
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x007f
                java.lang.String r4 = "%2e."
                boolean r4 = r3.equalsIgnoreCase(r4)
                if (r4 != 0) goto L_0x007f
                java.lang.String r4 = ".%2e"
                boolean r4 = r3.equalsIgnoreCase(r4)
                if (r4 != 0) goto L_0x007f
                java.lang.String r4 = "%2e%2e"
                boolean r4 = r3.equalsIgnoreCase(r4)
                if (r4 == 0) goto L_0x0080
            L_0x007f:
                r0 = r2
            L_0x0080:
                if (r0 == 0) goto L_0x00b6
                java.util.List<java.lang.String> r0 = r11.f2594f
                java.util.List<java.lang.String> r3 = r11.f2594f
                int r3 = r3.size()
                int r3 = r3 - r2
                java.lang.Object r0 = r0.remove(r3)
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x00ae
                java.util.List<java.lang.String> r0 = r11.f2594f
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x00ae
                java.util.List<java.lang.String> r0 = r11.f2594f
                java.util.List<java.lang.String> r3 = r11.f2594f
                int r3 = r3.size()
                int r3 = r3 - r2
                java.lang.String r4 = ""
                r0.set(r3, r4)
                goto L_0x00e0
            L_0x00ae:
                java.util.List<java.lang.String> r0 = r11.f2594f
                java.lang.String r3 = ""
                r0.add(r3)
                goto L_0x00e0
            L_0x00b6:
                java.util.List<java.lang.String> r0 = r11.f2594f
                java.util.List<java.lang.String> r4 = r11.f2594f
                int r4 = r4.size()
                int r4 = r4 - r2
                java.lang.Object r0 = r0.get(r4)
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x00d8
                java.util.List<java.lang.String> r0 = r11.f2594f
                java.util.List<java.lang.String> r4 = r11.f2594f
                int r4 = r4.size()
                int r4 = r4 - r2
                r0.set(r4, r3)
                goto L_0x00dd
            L_0x00d8:
                java.util.List<java.lang.String> r0 = r11.f2594f
                r0.add(r3)
            L_0x00dd:
                if (r1 == 0) goto L_0x00e0
                goto L_0x00ae
            L_0x00e0:
                if (r1 == 0) goto L_0x002e
                goto L_0x002c
            L_0x00e4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0607kf.C0608a.m1874b(java.lang.String, int, int):void");
        }

        /* renamed from: c */
        private static int m1875c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: d */
        private static int m1876d(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C0607kf.m1854a(str, i, i2, "", false, false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo2344a() {
            return this.f2593e != -1 ? this.f2593e : C0607kf.m1853a(this.f2589a);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
            if (r7 == ':') goto L_0x005f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x00a7 A[EDGE_INSN: B:109:0x00a7->B:45:0x00a7 ?: BREAK  
        EDGE_INSN: B:109:0x00a7->B:45:0x00a7 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0193 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x00f2 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01c1  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo2345a(@javax.annotation.Nullable p000.C0607kf r23, java.lang.String r24) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                r9 = r24
                int r2 = r24.length()
                r8 = 0
                int r10 = p000.C0633kv.m1960a(r9, r8, r2)
                int r2 = r24.length()
                int r11 = p000.C0633kv.m1981b(r9, r10, r2)
                int r2 = r11 - r10
                r12 = 58
                r13 = 2
                r14 = -1
                if (r2 < r13) goto L_0x005e
                char r2 = r9.charAt(r10)
                r3 = 90
                r4 = 65
                r5 = 122(0x7a, float:1.71E-43)
                r6 = 97
                if (r2 < r6) goto L_0x002f
                if (r2 <= r5) goto L_0x0034
            L_0x002f:
                if (r2 < r4) goto L_0x005e
                if (r2 <= r3) goto L_0x0034
                goto L_0x005e
            L_0x0034:
                int r2 = r10 + 1
            L_0x0036:
                if (r2 >= r11) goto L_0x005e
                char r7 = r9.charAt(r2)
                if (r7 < r6) goto L_0x0040
                if (r7 <= r5) goto L_0x005b
            L_0x0040:
                if (r7 < r4) goto L_0x0044
                if (r7 <= r3) goto L_0x005b
            L_0x0044:
                r15 = 48
                if (r7 < r15) goto L_0x004c
                r15 = 57
                if (r7 <= r15) goto L_0x005b
            L_0x004c:
                r15 = 43
                if (r7 == r15) goto L_0x005b
                r15 = 45
                if (r7 == r15) goto L_0x005b
                r15 = 46
                if (r7 == r15) goto L_0x005b
                if (r7 != r12) goto L_0x005e
                goto L_0x005f
            L_0x005b:
                int r2 = r2 + 1
                goto L_0x0036
            L_0x005e:
                r2 = r14
            L_0x005f:
                if (r2 == r14) goto L_0x008c
                r3 = 1
                java.lang.String r5 = "https:"
                r6 = 0
                r7 = 6
                r2 = r9
                r4 = r10
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0075
                java.lang.String r2 = "https"
                r0.f2589a = r2
                int r10 = r10 + 6
                goto L_0x0092
            L_0x0075:
                r3 = 1
                java.lang.String r5 = "http:"
                r6 = 0
                r7 = 5
                r2 = r9
                r4 = r10
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0089
                java.lang.String r2 = "http"
                r0.f2589a = r2
                int r10 = r10 + 5
                goto L_0x0092
            L_0x0089:
                int r1 = p000.C0607kf.C0608a.C0609a.f2599c
                return r1
            L_0x008c:
                if (r1 == 0) goto L_0x020f
                java.lang.String r2 = r1.f2580a
                r0.f2589a = r2
            L_0x0092:
                r3 = r8
                r2 = r10
            L_0x0094:
                r15 = 47
                r7 = 92
                if (r2 >= r11) goto L_0x00a7
                char r4 = r9.charAt(r2)
                if (r4 == r7) goto L_0x00a2
                if (r4 != r15) goto L_0x00a7
            L_0x00a2:
                int r3 = r3 + 1
                int r2 = r2 + 1
                goto L_0x0094
            L_0x00a7:
                r6 = 35
                r16 = 1
                if (r3 >= r13) goto L_0x00ee
                if (r1 == 0) goto L_0x00ee
                java.lang.String r2 = r1.f2580a
                java.lang.String r4 = r0.f2589a
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x00ba
                goto L_0x00ee
            L_0x00ba:
                java.lang.String r2 = r23.mo2334c()
                r0.f2590b = r2
                java.lang.String r2 = r23.mo2336d()
                r0.f2591c = r2
                java.lang.String r2 = r1.f2581b
                r0.f2592d = r2
                int r2 = r1.f2582c
                r0.f2593e = r2
                java.util.List<java.lang.String> r2 = r0.f2594f
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f2594f
                java.util.List r3 = r23.mo2339f()
                r2.addAll(r3)
                if (r10 == r11) goto L_0x00e4
                char r2 = r9.charAt(r10)
                if (r2 != r6) goto L_0x00eb
            L_0x00e4:
                java.lang.String r1 = r23.mo2340g()
                r0.mo2346a(r1)
            L_0x00eb:
                r15 = r10
                goto L_0x01c4
            L_0x00ee:
                int r10 = r10 + r3
                r13 = r8
                r2 = r10
                r10 = r13
            L_0x00f2:
                java.lang.String r1 = "@/\\?#"
                int r8 = p000.C0633kv.m1962a(r9, r2, r11, r1)
                if (r8 == r11) goto L_0x00ff
                char r1 = r9.charAt(r8)
                goto L_0x0100
            L_0x00ff:
                r1 = r14
            L_0x0100:
                if (r1 == r14) goto L_0x0193
                if (r1 == r6) goto L_0x0193
                if (r1 == r15) goto L_0x0193
                if (r1 == r7) goto L_0x0193
                switch(r1) {
                    case 63: goto L_0x0193;
                    case 64: goto L_0x010c;
                    default: goto L_0x010b;
                }
            L_0x010b:
                goto L_0x00f2
            L_0x010c:
                if (r10 != 0) goto L_0x0160
                int r5 = p000.C0633kv.m1961a(r9, r2, r8, r12)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r17 = 1
                r18 = 0
                r19 = 0
                r20 = 1
                r1 = r9
                r3 = r5
                r12 = r5
                r5 = r17
                r15 = r6
                r6 = r18
                r17 = r7
                r7 = r19
                r15 = r8
                r8 = r20
                java.lang.String r1 = p000.C0607kf.m1854a(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r13 == 0) goto L_0x0147
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f2590b
                r2.append(r3)
                java.lang.String r3 = "%40"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x0147:
                r0.f2590b = r1
                if (r12 == r15) goto L_0x015d
                int r2 = r12 + 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r1 = r9
                r3 = r15
                java.lang.String r1 = p000.C0607kf.m1854a(r1, r2, r3, r4, r5, r6, r7, r8)
                r0.f2591c = r1
                r10 = r16
            L_0x015d:
                r13 = r16
                goto L_0x0187
            L_0x0160:
                r17 = r7
                r15 = r8
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r1 = r0.f2591c
                r12.append(r1)
                java.lang.String r1 = "%40"
                r12.append(r1)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r1 = r9
                r3 = r15
                java.lang.String r1 = p000.C0607kf.m1854a(r1, r2, r3, r4, r5, r6, r7, r8)
                r12.append(r1)
                java.lang.String r1 = r12.toString()
                r0.f2591c = r1
            L_0x0187:
                int r2 = r15 + 1
                r7 = r17
                r6 = 35
                r12 = 58
                r15 = 47
                goto L_0x00f2
            L_0x0193:
                r15 = r8
                int r1 = m1875c(r9, r2, r15)
                int r3 = r1 + 1
                if (r3 >= r15) goto L_0x01af
                java.lang.String r1 = m1873a(r9, r2, r1)
                r0.f2592d = r1
                int r1 = m1876d(r9, r3, r15)
                r0.f2593e = r1
                int r1 = r0.f2593e
                if (r1 != r14) goto L_0x01bd
                int r1 = p000.C0607kf.C0608a.C0609a.f2600d
                return r1
            L_0x01af:
                java.lang.String r1 = m1873a(r9, r2, r1)
                r0.f2592d = r1
                java.lang.String r1 = r0.f2589a
                int r1 = p000.C0607kf.m1853a(r1)
                r0.f2593e = r1
            L_0x01bd:
                java.lang.String r1 = r0.f2592d
                if (r1 != 0) goto L_0x01c4
                int r1 = p000.C0607kf.C0608a.C0609a.f2601e
                return r1
            L_0x01c4:
                java.lang.String r1 = "?#"
                int r1 = p000.C0633kv.m1962a(r9, r15, r11, r1)
                r0.m1874b(r9, r15, r1)
                if (r1 >= r11) goto L_0x01f2
                char r2 = r9.charAt(r1)
                r3 = 63
                if (r2 != r3) goto L_0x01f2
                r2 = 35
                int r10 = p000.C0633kv.m1961a(r9, r1, r11, r2)
                int r2 = r1 + 1
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 1
                r1 = r9
                r3 = r10
                java.lang.String r1 = p000.C0607kf.m1854a(r1, r2, r3, r4, r5, r6, r7, r8)
                java.util.List r1 = p000.C0607kf.m1861b(r1)
                r0.f2595g = r1
                r1 = r10
            L_0x01f2:
                if (r1 >= r11) goto L_0x020c
                char r2 = r9.charAt(r1)
                r3 = 35
                if (r2 != r3) goto L_0x020c
                int r2 = r1 + 1
                java.lang.String r4 = ""
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r9
                r3 = r11
                java.lang.String r1 = p000.C0607kf.m1854a(r1, r2, r3, r4, r5, r6, r7, r8)
                r0.f2596h = r1
            L_0x020c:
                int r1 = p000.C0607kf.C0608a.C0609a.f2597a
                return r1
            L_0x020f:
                int r1 = p000.C0607kf.C0608a.C0609a.f2598b
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0607kf.C0608a.mo2345a(kf, java.lang.String):int");
        }

        /* renamed from: a */
        public final C0608a mo2346a(@Nullable String str) {
            List<String> list;
            if (str != null) {
                list = C0607kf.m1861b(C0607kf.m1856a(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f2595g = list;
            return this;
        }

        /* renamed from: b */
        public final C0607kf mo2347b() {
            if (this.f2589a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f2592d != null) {
                return new C0607kf(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2589a);
            sb.append("://");
            if (!this.f2590b.isEmpty() || !this.f2591c.isEmpty()) {
                sb.append(this.f2590b);
                if (!this.f2591c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f2591c);
                }
                sb.append('@');
            }
            if (this.f2592d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f2592d);
                sb.append(']');
            } else {
                sb.append(this.f2592d);
            }
            int a = mo2344a();
            if (a != C0607kf.m1853a(this.f2589a)) {
                sb.append(':');
                sb.append(a);
            }
            C0607kf.m1859a(sb, this.f2594f);
            if (this.f2595g != null) {
                sb.append('?');
                C0607kf.m1862b(sb, this.f2595g);
            }
            if (this.f2596h != null) {
                sb.append('#');
                sb.append(this.f2596h);
            }
            return sb.toString();
        }
    }

    C0607kf(C0608a aVar) {
        this.f2580a = aVar.f2589a;
        this.f2584f = m1857a(aVar.f2590b, false);
        this.f2585g = m1857a(aVar.f2591c, false);
        this.f2581b = aVar.f2592d;
        this.f2582c = aVar.mo2344a();
        this.f2586h = m1858a(aVar.f2594f, false);
        String str = null;
        this.f2583d = aVar.f2595g != null ? m1858a(aVar.f2595g, true) : null;
        if (aVar.f2596h != null) {
            str = m1857a(aVar.f2596h, false);
        }
        this.f2587i = str;
        this.f2588j = aVar.toString();
    }

    /* renamed from: a */
    public static int m1853a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: a */
    static String m1854a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3 = str;
        int i3 = i2;
        String str4 = str2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str3.codePointAt(i4);
            int i5 = 43;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !m1860a(str3, i4, i3)))) || (codePointAt == 43 && z3)))) {
                C0758nc ncVar = new C0758nc();
                ncVar.mo2612a(str3, i, i4);
                C0758nc ncVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str3.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 != i5 || !z3) {
                            if (codePointAt2 >= 32 && codePointAt2 != 127 && (codePointAt2 < 128 || !z4)) {
                                if (str4.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || (z && (!z2 || m1860a(str3, i4, i3))))) {
                                    ncVar.mo2610a(codePointAt2);
                                    i4 += Character.charCount(codePointAt2);
                                    i5 = 43;
                                }
                            }
                            if (ncVar2 == null) {
                                ncVar2 = new C0758nc();
                            }
                            ncVar2.mo2610a(codePointAt2);
                            while (!ncVar2.mo2633d()) {
                                byte f = ncVar2.mo2638f() & 255;
                                ncVar.mo2646h(37);
                                ncVar.mo2646h((int) f2579e[(f >> 4) & 15]);
                                ncVar.mo2646h((int) f2579e[f & 15]);
                            }
                            i4 += Character.charCount(codePointAt2);
                            i5 = 43;
                        } else {
                            ncVar.mo2622b(z ? "+" : "%2B");
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = 43;
                }
                return ncVar.mo2657n();
            }
            i4 += Character.charCount(codePointAt);
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m1855a(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C0758nc ncVar = new C0758nc();
                ncVar.mo2612a(str, i, i3);
                while (i3 < i2) {
                    int codePointAt = str.codePointAt(i3);
                    if (codePointAt == 37) {
                        int i4 = i3 + 2;
                        if (i4 < i2) {
                            int a = C0633kv.m1959a(str.charAt(i3 + 1));
                            int a2 = C0633kv.m1959a(str.charAt(i4));
                            if (!(a == -1 || a2 == -1)) {
                                ncVar.mo2646h((a << 4) + a2);
                                i3 = i4;
                                i3 += Character.charCount(codePointAt);
                            }
                            ncVar.mo2610a(codePointAt);
                            i3 += Character.charCount(codePointAt);
                        }
                    }
                    if (codePointAt == 43 && z) {
                        ncVar.mo2646h(32);
                        i3 += Character.charCount(codePointAt);
                    }
                    ncVar.mo2610a(codePointAt);
                    i3 += Character.charCount(codePointAt);
                }
                return ncVar.mo2657n();
            }
            i3++;
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m1856a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m1854a(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    /* renamed from: a */
    private static String m1857a(String str, boolean z) {
        return m1855a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private static List<String> m1858a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? m1857a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static void m1859a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
    }

    /* renamed from: a */
    private static boolean m1860a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C0633kv.m1959a(str.charAt(i + 1)) != -1 && C0633kv.m1959a(str.charAt(i3)) != -1;
    }

    /* renamed from: b */
    static List<String> m1861b(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m1862b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    @Nullable
    /* renamed from: d */
    public static C0607kf m1863d(String str) {
        C0608a aVar = new C0608a();
        if (aVar.mo2345a(null, str) == C0609a.f2597a) {
            return aVar.mo2347b();
        }
        return null;
    }

    /* renamed from: a */
    public final URI mo2332a() {
        C0608a aVar = new C0608a();
        aVar.f2589a = this.f2580a;
        aVar.f2590b = mo2334c();
        aVar.f2591c = mo2336d();
        aVar.f2592d = this.f2581b;
        aVar.f2593e = this.f2582c != m1853a(this.f2580a) ? this.f2582c : -1;
        aVar.f2594f.clear();
        aVar.f2594f.addAll(mo2339f());
        aVar.mo2346a(mo2340g());
        aVar.f2596h = this.f2587i == null ? null : this.f2588j.substring(this.f2588j.indexOf(35) + 1);
        int size = aVar.f2594f.size();
        for (int i = 0; i < size; i++) {
            aVar.f2594f.set(i, m1856a((String) aVar.f2594f.get(i), "[]", true, true, false, true));
        }
        if (aVar.f2595g != null) {
            int size2 = aVar.f2595g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) aVar.f2595g.get(i2);
                if (str != null) {
                    aVar.f2595g.set(i2, m1856a(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (aVar.f2596h != null) {
            aVar.f2596h = m1856a(aVar.f2596h, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo2333b() {
        return this.f2580a.equals("https");
    }

    /* renamed from: c */
    public final String mo2334c() {
        if (this.f2584f.isEmpty()) {
            return "";
        }
        int length = this.f2580a.length() + 3;
        return this.f2588j.substring(length, C0633kv.m1962a(this.f2588j, length, this.f2588j.length(), ":@"));
    }

    @Nullable
    /* renamed from: c */
    public final C0608a mo2335c(String str) {
        C0608a aVar = new C0608a();
        if (aVar.mo2345a(this, str) == C0609a.f2597a) {
            return aVar;
        }
        return null;
    }

    /* renamed from: d */
    public final String mo2336d() {
        if (this.f2585g.isEmpty()) {
            return "";
        }
        return this.f2588j.substring(this.f2588j.indexOf(58, this.f2580a.length() + 3) + 1, this.f2588j.indexOf(64));
    }

    /* renamed from: e */
    public final String mo2337e() {
        int indexOf = this.f2588j.indexOf(47, this.f2580a.length() + 3);
        return this.f2588j.substring(indexOf, C0633kv.m1962a(this.f2588j, indexOf, this.f2588j.length(), "?#"));
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C0607kf) && ((C0607kf) obj).f2588j.equals(this.f2588j);
    }

    /* renamed from: f */
    public final List<String> mo2339f() {
        int indexOf = this.f2588j.indexOf(47, this.f2580a.length() + 3);
        int a = C0633kv.m1962a(this.f2588j, indexOf, this.f2588j.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C0633kv.m1961a(this.f2588j, i, a, '/');
            arrayList.add(this.f2588j.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: g */
    public final String mo2340g() {
        if (this.f2583d == null) {
            return null;
        }
        int indexOf = this.f2588j.indexOf(63) + 1;
        return this.f2588j.substring(indexOf, C0633kv.m1961a(this.f2588j, indexOf, this.f2588j.length(), '#'));
    }

    /* renamed from: h */
    public final String mo2341h() {
        C0608a c = mo2335c("/...");
        c.f2590b = m1856a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        c.f2591c = m1856a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return c.mo2347b().toString();
    }

    public final int hashCode() {
        return this.f2588j.hashCode();
    }

    public final String toString() {
        return this.f2588j;
    }
}
