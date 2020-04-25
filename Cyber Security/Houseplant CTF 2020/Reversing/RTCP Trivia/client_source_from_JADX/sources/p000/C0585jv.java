package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: jv */
public final class C0585jv {

    /* renamed from: A */
    public static final C0585jv f2404A = m1779a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");

    /* renamed from: B */
    public static final C0585jv f2405B = m1779a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");

    /* renamed from: C */
    public static final C0585jv f2406C = m1779a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");

    /* renamed from: D */
    public static final C0585jv f2407D = m1779a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: E */
    public static final C0585jv f2408E = m1779a("TLS_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: F */
    public static final C0585jv f2409F = m1779a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");

    /* renamed from: G */
    public static final C0585jv f2410G = m1779a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: H */
    public static final C0585jv f2411H = m1779a("TLS_DH_anon_WITH_AES_128_CBC_SHA");

    /* renamed from: I */
    public static final C0585jv f2412I = m1779a("TLS_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: J */
    public static final C0585jv f2413J = m1779a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");

    /* renamed from: K */
    public static final C0585jv f2414K = m1779a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: L */
    public static final C0585jv f2415L = m1779a("TLS_DH_anon_WITH_AES_256_CBC_SHA");

    /* renamed from: M */
    public static final C0585jv f2416M = m1779a("TLS_RSA_WITH_NULL_SHA256");

    /* renamed from: N */
    public static final C0585jv f2417N = m1779a("TLS_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: O */
    public static final C0585jv f2418O = m1779a("TLS_RSA_WITH_AES_256_CBC_SHA256");

    /* renamed from: P */
    public static final C0585jv f2419P = m1779a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");

    /* renamed from: Q */
    public static final C0585jv f2420Q = m1779a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: R */
    public static final C0585jv f2421R = m1779a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: S */
    public static final C0585jv f2422S = m1779a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");

    /* renamed from: T */
    public static final C0585jv f2423T = m1779a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: U */
    public static final C0585jv f2424U = m1779a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");

    /* renamed from: V */
    public static final C0585jv f2425V = m1779a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");

    /* renamed from: W */
    public static final C0585jv f2426W = m1779a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");

    /* renamed from: X */
    public static final C0585jv f2427X = m1779a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");

    /* renamed from: Y */
    public static final C0585jv f2428Y = m1779a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");

    /* renamed from: Z */
    public static final C0585jv f2429Z = m1779a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");

    /* renamed from: a */
    static final Comparator<String> f2430a = new Comparator<String>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    };

    /* renamed from: aA */
    public static final C0585jv f2431aA = m1779a("TLS_ECDH_RSA_WITH_NULL_SHA");

    /* renamed from: aB */
    public static final C0585jv f2432aB = m1779a("TLS_ECDH_RSA_WITH_RC4_128_SHA");

    /* renamed from: aC */
    public static final C0585jv f2433aC = m1779a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: aD */
    public static final C0585jv f2434aD = m1779a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: aE */
    public static final C0585jv f2435aE = m1779a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: aF */
    public static final C0585jv f2436aF = m1779a("TLS_ECDHE_RSA_WITH_NULL_SHA");

    /* renamed from: aG */
    public static final C0585jv f2437aG = m1779a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");

    /* renamed from: aH */
    public static final C0585jv f2438aH = m1779a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: aI */
    public static final C0585jv f2439aI = m1779a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: aJ */
    public static final C0585jv f2440aJ = m1779a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: aK */
    public static final C0585jv f2441aK = m1779a("TLS_ECDH_anon_WITH_NULL_SHA");

    /* renamed from: aL */
    public static final C0585jv f2442aL = m1779a("TLS_ECDH_anon_WITH_RC4_128_SHA");

    /* renamed from: aM */
    public static final C0585jv f2443aM = m1779a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: aN */
    public static final C0585jv f2444aN = m1779a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");

    /* renamed from: aO */
    public static final C0585jv f2445aO = m1779a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");

    /* renamed from: aP */
    public static final C0585jv f2446aP = m1779a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: aQ */
    public static final C0585jv f2447aQ = m1779a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");

    /* renamed from: aR */
    public static final C0585jv f2448aR = m1779a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: aS */
    public static final C0585jv f2449aS = m1779a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");

    /* renamed from: aT */
    public static final C0585jv f2450aT = m1779a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: aU */
    public static final C0585jv f2451aU = m1779a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");

    /* renamed from: aV */
    public static final C0585jv f2452aV = m1779a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");

    /* renamed from: aW */
    public static final C0585jv f2453aW = m1779a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");

    /* renamed from: aX */
    public static final C0585jv f2454aX = m1779a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: aY */
    public static final C0585jv f2455aY = m1779a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: aZ */
    public static final C0585jv f2456aZ = m1779a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: aa */
    public static final C0585jv f2457aa = m1779a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");

    /* renamed from: ab */
    public static final C0585jv f2458ab = m1779a("TLS_PSK_WITH_RC4_128_SHA");

    /* renamed from: ac */
    public static final C0585jv f2459ac = m1779a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: ad */
    public static final C0585jv f2460ad = m1779a("TLS_PSK_WITH_AES_128_CBC_SHA");

    /* renamed from: ae */
    public static final C0585jv f2461ae = m1779a("TLS_PSK_WITH_AES_256_CBC_SHA");

    /* renamed from: af */
    public static final C0585jv f2462af = m1779a("TLS_RSA_WITH_SEED_CBC_SHA");

    /* renamed from: ag */
    public static final C0585jv f2463ag = m1779a("TLS_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: ah */
    public static final C0585jv f2464ah = m1779a("TLS_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: ai */
    public static final C0585jv f2465ai = m1779a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: aj */
    public static final C0585jv f2466aj = m1779a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: ak */
    public static final C0585jv f2467ak = m1779a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");

    /* renamed from: al */
    public static final C0585jv f2468al = m1779a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");

    /* renamed from: am */
    public static final C0585jv f2469am = m1779a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");

    /* renamed from: an */
    public static final C0585jv f2470an = m1779a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");

    /* renamed from: ao */
    public static final C0585jv f2471ao = m1779a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");

    /* renamed from: ap */
    public static final C0585jv f2472ap = m1779a("TLS_FALLBACK_SCSV");

    /* renamed from: aq */
    public static final C0585jv f2473aq = m1779a("TLS_ECDH_ECDSA_WITH_NULL_SHA");

    /* renamed from: ar */
    public static final C0585jv f2474ar = m1779a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");

    /* renamed from: as */
    public static final C0585jv f2475as = m1779a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: at */
    public static final C0585jv f2476at = m1779a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");

    /* renamed from: au */
    public static final C0585jv f2477au = m1779a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");

    /* renamed from: av */
    public static final C0585jv f2478av = m1779a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");

    /* renamed from: aw */
    public static final C0585jv f2479aw = m1779a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");

    /* renamed from: ax */
    public static final C0585jv f2480ax = m1779a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: ay */
    public static final C0585jv f2481ay = m1779a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");

    /* renamed from: az */
    public static final C0585jv f2482az = m1779a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");

    /* renamed from: b */
    public static final C0585jv f2483b = m1779a("SSL_RSA_WITH_NULL_MD5");

    /* renamed from: ba */
    public static final C0585jv f2484ba = m1779a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: bb */
    public static final C0585jv f2485bb = m1779a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: bc */
    public static final C0585jv f2486bc = m1779a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: bd */
    public static final C0585jv f2487bd = m1779a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: be */
    public static final C0585jv f2488be = m1779a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: bf */
    public static final C0585jv f2489bf = m1779a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");

    /* renamed from: bg */
    public static final C0585jv f2490bg = m1779a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");

    /* renamed from: bh */
    public static final C0585jv f2491bh = m1779a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: bi */
    public static final C0585jv f2492bi = m1779a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: bk */
    private static final Map<String, C0585jv> f2493bk = new TreeMap(f2430a);

    /* renamed from: c */
    public static final C0585jv f2494c = m1779a("SSL_RSA_WITH_NULL_SHA");

    /* renamed from: d */
    public static final C0585jv f2495d = m1779a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: e */
    public static final C0585jv f2496e = m1779a("SSL_RSA_WITH_RC4_128_MD5");

    /* renamed from: f */
    public static final C0585jv f2497f = m1779a("SSL_RSA_WITH_RC4_128_SHA");

    /* renamed from: g */
    public static final C0585jv f2498g = m1779a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: h */
    public static final C0585jv f2499h = m1779a("SSL_RSA_WITH_DES_CBC_SHA");

    /* renamed from: i */
    public static final C0585jv f2500i = m1779a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: j */
    public static final C0585jv f2501j = m1779a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: k */
    public static final C0585jv f2502k = m1779a("SSL_DHE_DSS_WITH_DES_CBC_SHA");

    /* renamed from: l */
    public static final C0585jv f2503l = m1779a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: m */
    public static final C0585jv f2504m = m1779a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: n */
    public static final C0585jv f2505n = m1779a("SSL_DHE_RSA_WITH_DES_CBC_SHA");

    /* renamed from: o */
    public static final C0585jv f2506o = m1779a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: p */
    public static final C0585jv f2507p = m1779a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");

    /* renamed from: q */
    public static final C0585jv f2508q = m1779a("SSL_DH_anon_WITH_RC4_128_MD5");

    /* renamed from: r */
    public static final C0585jv f2509r = m1779a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");

    /* renamed from: s */
    public static final C0585jv f2510s = m1779a("SSL_DH_anon_WITH_DES_CBC_SHA");

    /* renamed from: t */
    public static final C0585jv f2511t = m1779a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: u */
    public static final C0585jv f2512u = m1779a("TLS_KRB5_WITH_DES_CBC_SHA");

    /* renamed from: v */
    public static final C0585jv f2513v = m1779a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");

    /* renamed from: w */
    public static final C0585jv f2514w = m1779a("TLS_KRB5_WITH_RC4_128_SHA");

    /* renamed from: x */
    public static final C0585jv f2515x = m1779a("TLS_KRB5_WITH_DES_CBC_MD5");

    /* renamed from: y */
    public static final C0585jv f2516y = m1779a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");

    /* renamed from: z */
    public static final C0585jv f2517z = m1779a("TLS_KRB5_WITH_RC4_128_MD5");

    /* renamed from: bj */
    final String f2518bj;

    private C0585jv(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f2518bj = str;
    }

    /* renamed from: a */
    static List<C0585jv> m1778a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m1779a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static synchronized C0585jv m1779a(String str) {
        C0585jv jvVar;
        synchronized (C0585jv.class) {
            jvVar = (C0585jv) f2493bk.get(str);
            if (jvVar == null) {
                jvVar = new C0585jv(str);
                f2493bk.put(str, jvVar);
            }
        }
        return jvVar;
    }

    public final String toString() {
        return this.f2518bj;
    }
}
