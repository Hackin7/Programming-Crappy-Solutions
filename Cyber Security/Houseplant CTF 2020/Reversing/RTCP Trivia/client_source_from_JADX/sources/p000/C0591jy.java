package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: jy */
public final class C0591jy {

    /* renamed from: c */
    private static final Pattern f2540c = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: d */
    private static final Pattern f2541d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: e */
    private static final Pattern f2542e = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: f */
    private static final Pattern f2543f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f2544a;

    /* renamed from: b */
    public final String f2545b;

    /* renamed from: g */
    private final long f2546g;

    /* renamed from: h */
    private final String f2547h;

    /* renamed from: i */
    private final String f2548i;

    /* renamed from: j */
    private final boolean f2549j;

    /* renamed from: k */
    private final boolean f2550k;

    /* renamed from: l */
    private final boolean f2551l;

    /* renamed from: m */
    private final boolean f2552m;

    private C0591jy(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f2544a = str;
        this.f2545b = str2;
        this.f2546g = j;
        this.f2547h = str3;
        this.f2548i = str4;
        this.f2549j = z;
        this.f2550k = z2;
        this.f2552m = z3;
        this.f2551l = z4;
    }

    /* renamed from: a */
    private static int m1787a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static long m1788a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static List<C0591jy> m1789a(C0607kf kfVar, C0605ke keVar) {
        String str = "Set-Cookie";
        ArrayList arrayList = null;
        int length = keVar.f2577a.length / 2;
        List list = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(keVar.mo2322a(i))) {
                if (list == null) {
                    list = new ArrayList(2);
                }
                list.add(keVar.mo2325b(i));
            }
        }
        List unmodifiableList = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        int size = unmodifiableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0591jy a = m1790a(System.currentTimeMillis(), kfVar, (String) unmodifiableList.get(i2));
            if (a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0275, code lost:
        if (r2 > 253402300799999L) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02b1, code lost:
        if (p000.C0633kv.m1984c(r1) == false) goto L_0x02b5;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5 A[Catch:{ IllegalArgumentException -> 0x0134 }] */
    @javax.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p000.C0591jy m1790a(long r31, p000.C0607kf r33, java.lang.String r34) {
        /*
            r2 = r34
            int r3 = r34.length()
            r4 = 59
            r5 = 0
            int r6 = p000.C0633kv.m1961a(r2, r5, r3, r4)
            r7 = 61
            int r8 = p000.C0633kv.m1961a(r2, r5, r6, r7)
            r9 = 0
            if (r8 != r6) goto L_0x0017
            return r9
        L_0x0017:
            java.lang.String r11 = p000.C0633kv.m1983c(r2, r5, r8)
            boolean r10 = r11.isEmpty()
            if (r10 != 0) goto L_0x0306
            int r10 = p000.C0633kv.m1980b(r11)
            r12 = -1
            if (r10 == r12) goto L_0x002a
            goto L_0x0306
        L_0x002a:
            r10 = 1
            int r8 = r8 + r10
            java.lang.String r8 = p000.C0633kv.m1983c(r2, r8, r6)
            int r13 = p000.C0633kv.m1980b(r8)
            if (r13 == r12) goto L_0x0037
            return r9
        L_0x0037:
            int r6 = r6 + r10
            r22 = r5
            r23 = r22
            r25 = r23
            r21 = r9
            r24 = r10
            r17 = -1
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x0049:
            if (r6 >= r3) goto L_0x0245
            int r15 = p000.C0633kv.m1961a(r2, r6, r3, r4)
            int r13 = p000.C0633kv.m1961a(r2, r6, r15, r7)
            java.lang.String r6 = p000.C0633kv.m1983c(r2, r6, r13)
            if (r13 >= r15) goto L_0x0060
            int r13 = r13 + 1
            java.lang.String r13 = p000.C0633kv.m1983c(r2, r13, r15)
            goto L_0x0062
        L_0x0060:
            java.lang.String r13 = ""
        L_0x0062:
            java.lang.String r14 = "expires"
            boolean r14 = r6.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x01d4
            int r6 = r13.length()     // Catch:{ IllegalArgumentException -> 0x01d2 }
            int r14 = m1787a(r13, r5, r6, r5)     // Catch:{ IllegalArgumentException -> 0x01d2 }
            java.util.regex.Pattern r7 = f2543f     // Catch:{ IllegalArgumentException -> 0x01d2 }
            java.util.regex.Matcher r7 = r7.matcher(r13)     // Catch:{ IllegalArgumentException -> 0x01d2 }
            r4 = r12
            r5 = r4
            r26 = r5
            r27 = r26
            r28 = r27
            r29 = r28
        L_0x0082:
            if (r14 >= r6) goto L_0x0138
            int r12 = r14 + 1
            int r12 = m1787a(r13, r12, r6, r10)     // Catch:{ IllegalArgumentException -> 0x0134 }
            r7.region(r14, r12)     // Catch:{ IllegalArgumentException -> 0x0134 }
            r14 = -1
            if (r5 != r14) goto L_0x00c0
            java.util.regex.Pattern r14 = f2543f     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.util.regex.Matcher r14 = r7.usePattern(r14)     // Catch:{ IllegalArgumentException -> 0x0134 }
            boolean r14 = r14.matches()     // Catch:{ IllegalArgumentException -> 0x0134 }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r5 = r7.group(r10)     // Catch:{ IllegalArgumentException -> 0x0134 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ IllegalArgumentException -> 0x0134 }
            r14 = 2
            java.lang.String r14 = r7.group(r14)     // Catch:{ IllegalArgumentException -> 0x0134 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ IllegalArgumentException -> 0x0134 }
            r10 = 3
            java.lang.String r10 = r7.group(r10)     // Catch:{ IllegalArgumentException -> 0x0134 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ IllegalArgumentException -> 0x0134 }
            r29 = r10
            r28 = r14
            goto L_0x0128
        L_0x00bc:
            r10 = r27
            r14 = -1
            goto L_0x00c2
        L_0x00c0:
            r10 = r27
        L_0x00c2:
            if (r10 != r14) goto L_0x00e0
            java.util.regex.Pattern r14 = f2542e     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.util.regex.Matcher r14 = r7.usePattern(r14)     // Catch:{ IllegalArgumentException -> 0x0134 }
            boolean r14 = r14.matches()     // Catch:{ IllegalArgumentException -> 0x0134 }
            if (r14 == 0) goto L_0x00dc
            r14 = 1
            java.lang.String r10 = r7.group(r14)     // Catch:{ IllegalArgumentException -> 0x0134 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ IllegalArgumentException -> 0x0134 }
        L_0x00d9:
            r27 = r10
            goto L_0x0128
        L_0x00dc:
            r14 = r26
            r2 = -1
            goto L_0x00e3
        L_0x00e0:
            r2 = r14
            r14 = r26
        L_0x00e3:
            if (r14 != r2) goto L_0x010c
            java.util.regex.Pattern r2 = f2541d     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.util.regex.Matcher r2 = r7.usePattern(r2)     // Catch:{ IllegalArgumentException -> 0x0134 }
            boolean r2 = r2.matches()     // Catch:{ IllegalArgumentException -> 0x0134 }
            if (r2 == 0) goto L_0x010b
            r2 = 1
            java.lang.String r14 = r7.group(r2)     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.lang.String r2 = r14.toLowerCase(r2)     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.util.regex.Pattern r14 = f2541d     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.lang.String r14 = r14.pattern()     // Catch:{ IllegalArgumentException -> 0x0134 }
            int r2 = r14.indexOf(r2)     // Catch:{ IllegalArgumentException -> 0x0134 }
            int r2 = r2 / 4
            r26 = r2
            goto L_0x00d9
        L_0x010b:
            r2 = -1
        L_0x010c:
            if (r4 != r2) goto L_0x0124
            java.util.regex.Pattern r2 = f2540c     // Catch:{ IllegalArgumentException -> 0x0134 }
            java.util.regex.Matcher r2 = r7.usePattern(r2)     // Catch:{ IllegalArgumentException -> 0x0134 }
            boolean r2 = r2.matches()     // Catch:{ IllegalArgumentException -> 0x0134 }
            if (r2 == 0) goto L_0x0124
            r2 = 1
            java.lang.String r4 = r7.group(r2)     // Catch:{ IllegalArgumentException -> 0x0134 }
            int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ IllegalArgumentException -> 0x0134 }
            r4 = r2
        L_0x0124:
            r27 = r10
            r26 = r14
        L_0x0128:
            int r12 = r12 + 1
            r2 = 0
            int r14 = m1787a(r13, r12, r6, r2)     // Catch:{ IllegalArgumentException -> 0x0134 }
            r2 = r34
            r10 = 1
            goto L_0x0082
        L_0x0134:
            r7 = 59
            goto L_0x0239
        L_0x0138:
            r14 = r26
            r10 = r27
            r2 = 70
            if (r4 < r2) goto L_0x0146
            r2 = 99
            if (r4 > r2) goto L_0x0146
            int r4 = r4 + 1900
        L_0x0146:
            if (r4 < 0) goto L_0x014e
            r2 = 69
            if (r4 > r2) goto L_0x014e
            int r4 = r4 + 2000
        L_0x014e:
            r2 = 1601(0x641, float:2.243E-42)
            if (r4 >= r2) goto L_0x0158
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0134 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0134 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0134 }
        L_0x0158:
            r2 = -1
            if (r14 != r2) goto L_0x0161
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0134 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0134 }
            throw r4     // Catch:{ IllegalArgumentException -> 0x0134 }
        L_0x0161:
            if (r10 <= 0) goto L_0x01ca
            r6 = 31
            if (r10 <= r6) goto L_0x0168
            goto L_0x01ca
        L_0x0168:
            if (r5 < 0) goto L_0x01c2
            r6 = 23
            if (r5 <= r6) goto L_0x016f
            goto L_0x01c2
        L_0x016f:
            r12 = r28
            if (r12 < 0) goto L_0x01ba
            r7 = 59
            if (r12 <= r7) goto L_0x0178
            goto L_0x01bc
        L_0x0178:
            r6 = r29
            if (r6 < 0) goto L_0x01b4
            if (r6 <= r7) goto L_0x017f
            goto L_0x01b4
        L_0x017f:
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException -> 0x0239 }
            java.util.TimeZone r2 = p000.C0633kv.f2738g     // Catch:{ IllegalArgumentException -> 0x0239 }
            r13.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2 = 0
            r13.setLenient(r2)     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2 = 1
            r13.set(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0239 }
            int r2 = r14 + -1
            r4 = 2
            r13.set(r4, r2)     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2 = 5
            r13.set(r2, r10)     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2 = 11
            r13.set(r2, r5)     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2 = 12
            r13.set(r2, r12)     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2 = 13
            r13.set(r2, r6)     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2 = 14
            r4 = 0
            r13.set(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0239 }
            long r4 = r13.getTimeInMillis()     // Catch:{ IllegalArgumentException -> 0x0239 }
            r19 = r4
            goto L_0x01e3
        L_0x01b4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0239 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0239 }
        L_0x01ba:
            r7 = 59
        L_0x01bc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0239 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0239 }
        L_0x01c2:
            r7 = 59
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0239 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0239 }
        L_0x01ca:
            r7 = 59
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0239 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0239 }
        L_0x01d2:
            r7 = r4
            goto L_0x0239
        L_0x01d4:
            r7 = r4
            java.lang.String r2 = "max-age"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01e6
            long r4 = m1788a(r13)     // Catch:{  }
            r17 = r4
        L_0x01e3:
            r25 = 1
            goto L_0x0239
        L_0x01e6:
            java.lang.String r2 = "domain"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0219
            java.lang.String r2 = "."
            boolean r2 = r13.endsWith(r2)     // Catch:{ IllegalArgumentException -> 0x0239 }
            if (r2 == 0) goto L_0x01fc
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0239 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0239 }
        L_0x01fc:
            java.lang.String r2 = "."
            boolean r2 = r13.startsWith(r2)     // Catch:{ IllegalArgumentException -> 0x0239 }
            if (r2 == 0) goto L_0x0209
            r2 = 1
            java.lang.String r13 = r13.substring(r2)     // Catch:{ IllegalArgumentException -> 0x0239 }
        L_0x0209:
            java.lang.String r2 = p000.C0633kv.m1965a(r13)     // Catch:{ IllegalArgumentException -> 0x0239 }
            if (r2 != 0) goto L_0x0215
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0239 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0239 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0239 }
        L_0x0215:
            r9 = r2
            r24 = 0
            goto L_0x0239
        L_0x0219:
            java.lang.String r2 = "path"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0224
            r21 = r13
            goto L_0x0239
        L_0x0224:
            java.lang.String r2 = "secure"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x022f
            r22 = 1
            goto L_0x0239
        L_0x022f:
            java.lang.String r2 = "httponly"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0239
            r23 = 1
        L_0x0239:
            int r6 = r15 + 1
            r4 = r7
            r2 = r34
            r5 = 0
            r7 = 61
            r10 = 1
            r12 = -1
            goto L_0x0049
        L_0x0245:
            r2 = -9223372036854775808
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x024f
        L_0x024b:
            r0 = r33
            r13 = r2
            goto L_0x0285
        L_0x024f:
            r2 = -1
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0281
            r2 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0263
            r2 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r2
            goto L_0x0268
        L_0x0263:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0268:
            long r2 = r31 + r17
            int r0 = (r2 > r31 ? 1 : (r2 == r31 ? 0 : -1))
            if (r0 < 0) goto L_0x0278
            r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x024b
            goto L_0x027d
        L_0x0278:
            r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x027d:
            r13 = r0
            r0 = r33
            goto L_0x0285
        L_0x0281:
            r0 = r33
            r13 = r19
        L_0x0285:
            java.lang.String r1 = r0.f2581b
            if (r9 != 0) goto L_0x028c
            r15 = r1
            r2 = 0
            goto L_0x02bb
        L_0x028c:
            boolean r2 = r1.equals(r9)
            if (r2 == 0) goto L_0x0294
            r3 = 1
            goto L_0x02b5
        L_0x0294:
            boolean r2 = r1.endsWith(r9)
            if (r2 == 0) goto L_0x02b4
            int r2 = r1.length()
            int r3 = r9.length()
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 - r3
            char r2 = r1.charAt(r2)
            r4 = 46
            if (r2 != r4) goto L_0x02b4
            boolean r2 = p000.C0633kv.m1984c(r1)
            if (r2 != 0) goto L_0x02b4
            goto L_0x02b5
        L_0x02b4:
            r3 = 0
        L_0x02b5:
            if (r3 != 0) goto L_0x02b9
            r2 = 0
            return r2
        L_0x02b9:
            r2 = 0
            r15 = r9
        L_0x02bb:
            int r1 = r1.length()
            int r3 = r15.length()
            if (r1 == r3) goto L_0x02d0
            mq r1 = p000.C0729mq.m2286a()
            java.lang.String r1 = r1.mo2561a(r15)
            if (r1 != 0) goto L_0x02d0
            return r2
        L_0x02d0:
            r9 = r21
            if (r9 == 0) goto L_0x02e0
            java.lang.String r1 = "/"
            boolean r1 = r9.startsWith(r1)
            if (r1 != 0) goto L_0x02dd
            goto L_0x02e0
        L_0x02dd:
            r16 = r9
            goto L_0x02f6
        L_0x02e0:
            java.lang.String r0 = r33.mo2337e()
            r1 = 47
            int r1 = r0.lastIndexOf(r1)
            if (r1 == 0) goto L_0x02f2
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            goto L_0x02f4
        L_0x02f2:
            java.lang.String r0 = "/"
        L_0x02f4:
            r16 = r0
        L_0x02f6:
            jy r0 = new jy
            r10 = r0
            r12 = r8
            r17 = r22
            r18 = r23
            r19 = r24
            r20 = r25
            r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x0306:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0591jy.m1790a(long, kf, java.lang.String):jy");
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0591jy)) {
            return false;
        }
        C0591jy jyVar = (C0591jy) obj;
        return jyVar.f2544a.equals(this.f2544a) && jyVar.f2545b.equals(this.f2545b) && jyVar.f2547h.equals(this.f2547h) && jyVar.f2548i.equals(this.f2548i) && jyVar.f2546g == this.f2546g && jyVar.f2549j == this.f2549j && jyVar.f2550k == this.f2550k && jyVar.f2551l == this.f2551l && jyVar.f2552m == this.f2552m;
    }

    public final int hashCode() {
        return (31 * (((((((((((((((527 + this.f2544a.hashCode()) * 31) + this.f2545b.hashCode()) * 31) + this.f2547h.hashCode()) * 31) + this.f2548i.hashCode()) * 31) + ((int) (this.f2546g ^ (this.f2546g >>> 32)))) * 31) + (this.f2549j ^ true ? 1 : 0)) * 31) + (this.f2550k ^ true ? 1 : 0)) * 31) + (this.f2551l ^ true ? 1 : 0))) + (this.f2552m ^ true ? 1 : 0);
    }

    public final String toString() {
        String a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2544a);
        sb.append('=');
        sb.append(this.f2545b);
        if (this.f2551l) {
            if (this.f2546g == Long.MIN_VALUE) {
                a = "; max-age=0";
            } else {
                sb.append("; expires=");
                a = C0660ll.m2049a(new Date(this.f2546g));
            }
            sb.append(a);
        }
        if (!this.f2552m) {
            sb.append("; domain=");
            sb.append(this.f2547h);
        }
        sb.append("; path=");
        sb.append(this.f2548i);
        if (this.f2549j) {
            sb.append("; secure");
        }
        if (this.f2550k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
