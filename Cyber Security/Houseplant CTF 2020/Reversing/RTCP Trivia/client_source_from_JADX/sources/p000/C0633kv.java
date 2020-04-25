package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: kv */
public final class C0633kv {

    /* renamed from: a */
    public static final byte[] f2732a = new byte[0];

    /* renamed from: b */
    public static final String[] f2733b = new String[0];

    /* renamed from: c */
    public static final C0625ko f2734c = C0625ko.m1931a(f2732a);

    /* renamed from: d */
    public static final C0621km f2735d;

    /* renamed from: e */
    public static final Charset f2736e = Charset.forName("UTF-8");

    /* renamed from: f */
    public static final Charset f2737f = Charset.forName("ISO-8859-1");

    /* renamed from: g */
    public static final TimeZone f2738g = TimeZone.getTimeZone("GMT");

    /* renamed from: h */
    public static final Comparator<String> f2739h = new Comparator<String>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    };

    /* renamed from: i */
    private static final C0762nf f2740i = C0762nf.m2473b("efbbbf");

    /* renamed from: j */
    private static final C0762nf f2741j = C0762nf.m2473b("feff");

    /* renamed from: k */
    private static final C0762nf f2742k = C0762nf.m2473b("fffe");

    /* renamed from: l */
    private static final C0762nf f2743l = C0762nf.m2473b("0000ffff");

    /* renamed from: m */
    private static final C0762nf f2744m = C0762nf.m2473b("ffff0000");

    /* renamed from: n */
    private static final Charset f2745n = Charset.forName("UTF-16BE");

    /* renamed from: o */
    private static final Charset f2746o = Charset.forName("UTF-16LE");

    /* renamed from: p */
    private static final Charset f2747p = Charset.forName("UTF-32BE");

    /* renamed from: q */
    private static final Charset f2748q = Charset.forName("UTF-32LE");

    /* renamed from: r */
    private static final Pattern f2749r = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        byte[] bArr = f2732a;
        int length = bArr.length;
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        m1971a((long) bArr.length, (long) length);
        f2735d = new C0621km(length, bArr) {

            /* renamed from: a */
            final /* synthetic */ C0612kh f2688a = null;

            /* renamed from: b */
            final /* synthetic */ int f2689b;

            /* renamed from: c */
            final /* synthetic */ byte[] f2690c;

            /* renamed from: d */
            final /* synthetic */ int f2691d;

            {
                this.f2689b = r2;
                this.f2690c = r3;
                this.f2691d = 0;
            }

            @Nullable
            /* renamed from: a */
            public final C0612kh mo2384a() {
                return this.f2688a;
            }

            /* renamed from: a */
            public final void mo2385a(C0760nd ndVar) {
                ndVar.mo2628c(this.f2690c, this.f2691d, this.f2689b);
            }

            /* renamed from: b */
            public final long mo2386b() {
                return (long) this.f2689b;
            }
        };
    }

    /* renamed from: a */
    public static int m1959a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static int m1960a(String str, int i, int i2) {
        while (i < i2) {
            switch (str.charAt(i)) {
                case 9:
                case 10:
                case 12:
                case 13:
                case ' ':
                    i++;
                default:
                    return i;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static int m1961a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m1962a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m1963a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static AssertionError m1964a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: a */
    public static String m1965a(String str) {
        if (str.contains(":")) {
            int i = 0;
            InetAddress d = (!str.startsWith("[") || !str.endsWith("]")) ? m1985d(str, 0, str.length()) : m1985d(str, 1, str.length() - 1);
            if (d == null) {
                return null;
            }
            byte[] address = d.getAddress();
            if (address.length == 16) {
                int i2 = -1;
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C0758nc ncVar = new C0758nc();
                while (i < address.length) {
                    if (i == i2) {
                        ncVar.mo2646h(58);
                        i += i4;
                        if (i == 16) {
                            ncVar.mo2646h(58);
                        }
                    } else {
                        if (i > 0) {
                            ncVar.mo2646h(58);
                        }
                        ncVar.mo2651j((long) (((address[i] & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return ncVar.mo2657n();
            }
            StringBuilder sb = new StringBuilder("Invalid IPv6 address: '");
            sb.append(str);
            sb.append("'");
            throw new AssertionError(sb.toString());
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m1986d(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m1966a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static String m1967a(C0607kf kfVar, boolean z) {
        String str;
        if (kfVar.f2581b.contains(":")) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(kfVar.f2581b);
            sb.append("]");
            str = sb.toString();
        } else {
            str = kfVar.f2581b;
        }
        if (!z && kfVar.f2582c == C0607kf.m1853a(kfVar.f2580a)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":");
        sb2.append(kfVar.f2582c);
        return sb2.toString();
    }

    /* renamed from: a */
    public static <T> List<T> m1968a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <T> List<T> m1969a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: a */
    public static ThreadFactory m1970a(final String str, final boolean z) {
        return new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* renamed from: a */
    public static void m1971a(long j, long j2) {
        if ((0 | j2) < 0 || 0 > j || j - 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static void m1972a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1973a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m1974a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1974a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static boolean m1975a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m1976a(C0778ns nsVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = nsVar.mo2415a().mo2692e_() ? nsVar.mo2415a().mo2689c() - nanoTime : Long.MAX_VALUE;
        nsVar.mo2415a().mo2687a(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C0758nc ncVar = new C0758nc();
            while (nsVar.mo2414a(ncVar, 8192) != -1) {
                ncVar.mo2660q();
            }
            if (c == Long.MAX_VALUE) {
                nsVar.mo2415a().mo2694f_();
            } else {
                nsVar.mo2415a().mo2687a(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                nsVar.mo2415a().mo2694f_();
            } else {
                nsVar.mo2415a().mo2687a(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                nsVar.mo2415a().mo2694f_();
            } else {
                nsVar.mo2415a().mo2687a(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m1977a(C0778ns nsVar, TimeUnit timeUnit) {
        try {
            return m1976a(nsVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String[] m1978a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static String[] m1979a(String[] strArr, String str) {
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    /* renamed from: b */
    public static int m1980b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static int m1981b(String str, int i, int i2) {
        int i3 = i2 - 1;
        while (i3 >= i) {
            switch (str.charAt(i3)) {
                case 9:
                case 10:
                case 12:
                case 13:
                case ' ':
                    i3--;
                default:
                    return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m1982b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        for (String str : strArr) {
            for (String compare : strArr2) {
                if (comparator.compare(str, compare) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static String m1983c(String str, int i, int i2) {
        int a = m1960a(str, i, i2);
        return str.substring(a, m1981b(str, a, i2));
    }

    /* renamed from: c */
    public static boolean m1984c(String str) {
        return f2749r.matcher(str).matches();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        r5 = 0;
     */
    @javax.annotation.Nullable
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.InetAddress m1985d(java.lang.String r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r18
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00d7
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 4
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r1) goto L_0x0034
            java.lang.String r14 = "::"
            r15 = 2
            boolean r14 = r0.regionMatches(r6, r14, r5, r15)
            if (r14 == 0) goto L_0x0034
            if (r8 == r4) goto L_0x0028
            return r10
        L_0x0028:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x0030
            r0 = r2
            r8 = r7
            goto L_0x00d8
        L_0x0030:
            r8 = r7
            r9 = r11
            goto L_0x00a5
        L_0x0034:
            if (r7 == 0) goto L_0x00a4
            java.lang.String r11 = ":"
            r14 = 1
            boolean r11 = r0.regionMatches(r6, r11, r5, r14)
            if (r11 == 0) goto L_0x0043
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x0043:
            java.lang.String r11 = "."
            boolean r6 = r0.regionMatches(r6, r11, r5, r14)
            if (r6 == 0) goto L_0x00a3
            int r6 = r7 + -2
            r11 = r6
        L_0x004e:
            if (r9 >= r1) goto L_0x0095
            if (r11 != r2) goto L_0x0053
            goto L_0x009b
        L_0x0053:
            if (r11 == r6) goto L_0x0060
            char r15 = r0.charAt(r9)
            r14 = 46
            if (r15 == r14) goto L_0x005e
            goto L_0x009b
        L_0x005e:
            int r9 = r9 + 1
        L_0x0060:
            r15 = r5
            r14 = r9
        L_0x0062:
            if (r14 >= r1) goto L_0x0083
            char r5 = r0.charAt(r14)
            r2 = 48
            if (r5 < r2) goto L_0x0083
            r4 = 57
            if (r5 > r4) goto L_0x0083
            if (r15 != 0) goto L_0x0075
            if (r9 == r14) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r13) goto L_0x007c
            goto L_0x0098
        L_0x007c:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0062
        L_0x0083:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0088
            goto L_0x0098
        L_0x0088:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            r14 = 1
            goto L_0x004e
        L_0x0095:
            int r6 = r6 + r12
            if (r11 == r6) goto L_0x009a
        L_0x0098:
            r5 = 0
            goto L_0x009b
        L_0x009a:
            r5 = 1
        L_0x009b:
            if (r5 != 0) goto L_0x009e
            return r10
        L_0x009e:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00d8
        L_0x00a3:
            return r10
        L_0x00a4:
            r9 = r6
        L_0x00a5:
            r6 = r9
            r2 = 0
        L_0x00a7:
            if (r6 >= r1) goto L_0x00ba
            char r4 = r0.charAt(r6)
            int r4 = m1959a(r4)
            r5 = -1
            if (r4 == r5) goto L_0x00ba
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a7
        L_0x00ba:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d6
            if (r4 <= r12) goto L_0x00c1
            return r10
        L_0x00c1:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r13
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d6:
            return r10
        L_0x00d7:
            r0 = r2
        L_0x00d8:
            if (r7 == r0) goto L_0x00ec
            r1 = -1
            if (r8 != r1) goto L_0x00de
            return r10
        L_0x00de:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00ec:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00f1 }
            return r0
        L_0x00f1:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0633kv.m1985d(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: d */
    private static boolean m1986d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }
}
