package p000;

import java.io.Closeable;
import javax.annotation.Nullable;

/* renamed from: kn */
public final class C0623kn implements Closeable {

    /* renamed from: a */
    public final C0619kl f2692a;

    /* renamed from: b */
    final C0616kj f2693b;

    /* renamed from: c */
    public final int f2694c;

    /* renamed from: d */
    public final String f2695d;
    @Nullable

    /* renamed from: e */
    public final C0604kd f2696e;

    /* renamed from: f */
    public final C0605ke f2697f;
    @Nullable

    /* renamed from: g */
    public final C0625ko f2698g;
    @Nullable

    /* renamed from: h */
    final C0623kn f2699h;
    @Nullable

    /* renamed from: i */
    final C0623kn f2700i;
    @Nullable

    /* renamed from: j */
    public final C0623kn f2701j;

    /* renamed from: k */
    public final long f2702k;

    /* renamed from: l */
    public final long f2703l;

    /* renamed from: m */
    private volatile C0578jr f2704m;

    /* renamed from: kn$a */
    public static class C0624a {

        /* renamed from: a */
        public C0619kl f2705a;

        /* renamed from: b */
        public C0616kj f2706b;

        /* renamed from: c */
        public int f2707c;

        /* renamed from: d */
        public String f2708d;
        @Nullable

        /* renamed from: e */
        public C0604kd f2709e;

        /* renamed from: f */
        C0606a f2710f;

        /* renamed from: g */
        public C0625ko f2711g;

        /* renamed from: h */
        C0623kn f2712h;

        /* renamed from: i */
        C0623kn f2713i;

        /* renamed from: j */
        public C0623kn f2714j;

        /* renamed from: k */
        public long f2715k;

        /* renamed from: l */
        public long f2716l;

        public C0624a() {
            this.f2707c = -1;
            this.f2710f = new C0606a();
        }

        C0624a(C0623kn knVar) {
            this.f2707c = -1;
            this.f2705a = knVar.f2692a;
            this.f2706b = knVar.f2693b;
            this.f2707c = knVar.f2694c;
            this.f2708d = knVar.f2695d;
            this.f2709e = knVar.f2696e;
            this.f2710f = knVar.f2697f.mo2324a();
            this.f2711g = knVar.f2698g;
            this.f2712h = knVar.f2699h;
            this.f2713i = knVar.f2700i;
            this.f2714j = knVar.f2701j;
            this.f2715k = knVar.f2702k;
            this.f2716l = knVar.f2703l;
        }

        /* renamed from: a */
        private static void m1925a(String str, C0623kn knVar) {
            if (knVar.f2698g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (knVar.f2699h != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (knVar.f2700i != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (knVar.f2701j != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* renamed from: a */
        public final C0624a mo2392a(String str, String str2) {
            C0606a aVar = this.f2710f;
            C0606a.m1849b(str, str2);
            aVar.mo2330a(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C0624a mo2393a(C0605ke keVar) {
            this.f2710f = keVar.mo2324a();
            return this;
        }

        /* renamed from: a */
        public final C0624a mo2394a(@Nullable C0623kn knVar) {
            if (knVar != null) {
                m1925a("networkResponse", knVar);
            }
            this.f2712h = knVar;
            return this;
        }

        /* renamed from: a */
        public final C0623kn mo2395a() {
            if (this.f2705a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f2706b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f2707c < 0) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.f2707c);
                throw new IllegalStateException(sb.toString());
            } else if (this.f2708d != null) {
                return new C0623kn(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: b */
        public final C0624a mo2396b(@Nullable C0623kn knVar) {
            if (knVar != null) {
                m1925a("cacheResponse", knVar);
            }
            this.f2713i = knVar;
            return this;
        }
    }

    C0623kn(C0624a aVar) {
        this.f2692a = aVar.f2705a;
        this.f2693b = aVar.f2706b;
        this.f2694c = aVar.f2707c;
        this.f2695d = aVar.f2708d;
        this.f2696e = aVar.f2709e;
        this.f2697f = aVar.f2710f.mo2331a();
        this.f2698g = aVar.f2711g;
        this.f2699h = aVar.f2712h;
        this.f2700i = aVar.f2713i;
        this.f2701j = aVar.f2714j;
        this.f2702k = aVar.f2715k;
        this.f2703l = aVar.f2716l;
    }

    @Nullable
    /* renamed from: a */
    public final String mo2387a(String str) {
        String a = this.f2697f.mo2323a(str);
        if (a != null) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public final C0624a mo2388a() {
        return new C0624a(this);
    }

    /* renamed from: b */
    public final C0578jr mo2389b() {
        C0578jr jrVar = this.f2704m;
        if (jrVar != null) {
            return jrVar;
        }
        C0578jr a = C0578jr.m1769a(this.f2697f);
        this.f2704m = a;
        return a;
    }

    public final void close() {
        if (this.f2698g == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        this.f2698g.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.f2693b);
        sb.append(", code=");
        sb.append(this.f2694c);
        sb.append(", message=");
        sb.append(this.f2695d);
        sb.append(", url=");
        sb.append(this.f2692a.f2677a);
        sb.append('}');
        return sb.toString();
    }
}
