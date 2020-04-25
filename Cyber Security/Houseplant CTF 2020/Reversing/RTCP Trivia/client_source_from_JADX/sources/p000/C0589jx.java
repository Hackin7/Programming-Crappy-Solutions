package p000;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* renamed from: jx */
public final class C0589jx {

    /* renamed from: a */
    public static final C0589jx f2528a;

    /* renamed from: b */
    public static final C0589jx f2529b = new C0590a(f2528a).mo2308a(C0628kq.TLS_1_0).mo2306a().mo2310b();

    /* renamed from: c */
    public static final C0589jx f2530c = new C0590a(false).mo2310b();

    /* renamed from: h */
    private static final C0585jv[] f2531h = {C0585jv.f2454aX, C0585jv.f2485bb, C0585jv.f2455aY, C0585jv.f2486bc, C0585jv.f2492bi, C0585jv.f2491bh, C0585jv.f2439aI, C0585jv.f2440aJ, C0585jv.f2463ag, C0585jv.f2464ah, C0585jv.f2408E, C0585jv.f2412I, C0585jv.f2500i};

    /* renamed from: d */
    final boolean f2532d;

    /* renamed from: e */
    public final boolean f2533e;
    @Nullable

    /* renamed from: f */
    final String[] f2534f;
    @Nullable

    /* renamed from: g */
    final String[] f2535g;

    /* renamed from: jx$a */
    public static final class C0590a {

        /* renamed from: a */
        boolean f2536a;
        @Nullable

        /* renamed from: b */
        String[] f2537b;
        @Nullable

        /* renamed from: c */
        String[] f2538c;

        /* renamed from: d */
        boolean f2539d;

        public C0590a(C0589jx jxVar) {
            this.f2536a = jxVar.f2532d;
            this.f2537b = jxVar.f2534f;
            this.f2538c = jxVar.f2535g;
            this.f2539d = jxVar.f2533e;
        }

        C0590a(boolean z) {
            this.f2536a = z;
        }

        /* renamed from: a */
        public final C0590a mo2306a() {
            if (!this.f2536a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f2539d = true;
            return this;
        }

        /* renamed from: a */
        public final C0590a mo2307a(String... strArr) {
            if (!this.f2536a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            } else {
                this.f2537b = (String[]) strArr.clone();
                return this;
            }
        }

        /* renamed from: a */
        public final C0590a mo2308a(C0628kq... kqVarArr) {
            if (!this.f2536a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[kqVarArr.length];
            for (int i = 0; i < kqVarArr.length; i++) {
                strArr[i] = kqVarArr[i].f2729f;
            }
            return mo2309b(strArr);
        }

        /* renamed from: b */
        public final C0590a mo2309b(String... strArr) {
            if (!this.f2536a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            } else {
                this.f2538c = (String[]) strArr.clone();
                return this;
            }
        }

        /* renamed from: b */
        public final C0589jx mo2310b() {
            return new C0589jx(this);
        }
    }

    static {
        C0590a aVar = new C0590a(true);
        C0585jv[] jvVarArr = f2531h;
        if (!aVar.f2536a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[jvVarArr.length];
        for (int i = 0; i < jvVarArr.length; i++) {
            strArr[i] = jvVarArr[i].f2518bj;
        }
        f2528a = aVar.mo2307a(strArr).mo2308a(C0628kq.TLS_1_3, C0628kq.TLS_1_2, C0628kq.TLS_1_1, C0628kq.TLS_1_0).mo2306a().mo2310b();
    }

    C0589jx(C0590a aVar) {
        this.f2532d = aVar.f2536a;
        this.f2534f = aVar.f2537b;
        this.f2535g = aVar.f2538c;
        this.f2533e = aVar.f2539d;
    }

    /* renamed from: a */
    public final boolean mo2302a(SSLSocket sSLSocket) {
        if (!this.f2532d) {
            return false;
        }
        if (this.f2535g == null || C0633kv.m1982b(C0633kv.f2739h, this.f2535g, sSLSocket.getEnabledProtocols())) {
            return this.f2534f == null || C0633kv.m1982b(C0585jv.f2430a, this.f2534f, sSLSocket.getEnabledCipherSuites());
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0589jx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0589jx jxVar = (C0589jx) obj;
        if (this.f2532d != jxVar.f2532d) {
            return false;
        }
        return !this.f2532d || (Arrays.equals(this.f2534f, jxVar.f2534f) && Arrays.equals(this.f2535g, jxVar.f2535g) && this.f2533e == jxVar.f2533e);
    }

    public final int hashCode() {
        if (this.f2532d) {
            return (31 * (((527 + Arrays.hashCode(this.f2534f)) * 31) + Arrays.hashCode(this.f2535g))) + (this.f2533e ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        String str2;
        if (!this.f2532d) {
            return "ConnectionSpec()";
        }
        List list = null;
        if (this.f2534f != null) {
            str = (this.f2534f != null ? C0585jv.m1778a(this.f2534f) : null).toString();
        } else {
            str = "[all enabled]";
        }
        if (this.f2535g != null) {
            if (this.f2535g != null) {
                list = C0628kq.m1937a(this.f2535g);
            }
            str2 = list.toString();
        } else {
            str2 = "[all enabled]";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f2533e);
        sb.append(")");
        return sb.toString();
    }
}
