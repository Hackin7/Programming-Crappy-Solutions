package p000;

import java.util.regex.Pattern;

/* renamed from: lm */
public final class C0662lm {

    /* renamed from: a */
    private static final Pattern f2855a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    /* renamed from: a */
    public static int m2051a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m2052a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static long m2053a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static long m2054a(C0623kn knVar) {
        return m2053a(knVar.f2697f.mo2323a("Content-Length"));
    }

    /* renamed from: a */
    public static void m2055a(C0592jz jzVar, C0607kf kfVar, C0605ke keVar) {
        if (jzVar != C0592jz.f2553a && !C0591jy.m1789a(kfVar, keVar).isEmpty()) {
            jzVar.mo2314a();
        }
    }

    /* renamed from: b */
    public static int m2056b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: b */
    public static boolean m2057b(C0623kn knVar) {
        if (knVar.f2692a.f2678b.equals("HEAD")) {
            return false;
        }
        int i = knVar.f2694c;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && m2054a(knVar) == -1 && !"chunked".equalsIgnoreCase(knVar.mo2387a("Transfer-Encoding"))) ? false : true;
    }
}
