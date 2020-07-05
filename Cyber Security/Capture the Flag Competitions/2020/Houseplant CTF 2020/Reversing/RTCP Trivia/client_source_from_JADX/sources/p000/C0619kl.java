package p000;

import javax.annotation.Nullable;

/* renamed from: kl */
public final class C0619kl {

    /* renamed from: a */
    public final C0607kf f2677a;

    /* renamed from: b */
    public final String f2678b;

    /* renamed from: c */
    public final C0605ke f2679c;
    @Nullable

    /* renamed from: d */
    public final C0621km f2680d;

    /* renamed from: e */
    final Object f2681e;

    /* renamed from: f */
    private volatile C0578jr f2682f;

    /* renamed from: kl$a */
    public static class C0620a {

        /* renamed from: a */
        C0607kf f2683a;

        /* renamed from: b */
        String f2684b;

        /* renamed from: c */
        public C0606a f2685c;

        /* renamed from: d */
        C0621km f2686d;

        /* renamed from: e */
        Object f2687e;

        public C0620a() {
            this.f2684b = "GET";
            this.f2685c = new C0606a();
        }

        C0620a(C0619kl klVar) {
            this.f2683a = klVar.f2677a;
            this.f2684b = klVar.f2678b;
            this.f2686d = klVar.f2680d;
            this.f2687e = klVar.f2681e;
            this.f2685c = klVar.f2679c.mo2324a();
        }

        /* renamed from: a */
        public final C0620a mo2379a(String str) {
            this.f2685c.mo2329a(str);
            return this;
        }

        /* renamed from: a */
        public final C0620a mo2380a(String str, String str2) {
            C0606a aVar = this.f2685c;
            C0606a.m1849b(str, str2);
            aVar.mo2329a(str);
            aVar.mo2330a(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C0620a mo2381a(String str, @Nullable C0621km kmVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (kmVar == null || C0663ln.m2058a(str)) {
                if (kmVar == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        StringBuilder sb = new StringBuilder("method ");
                        sb.append(str);
                        sb.append(" must have a request body.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                this.f2684b = str;
                this.f2686d = kmVar;
                return this;
            } else {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(str);
                sb2.append(" must not have a request body.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: a */
        public final C0620a mo2382a(C0607kf kfVar) {
            if (kfVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f2683a = kfVar;
            return this;
        }

        /* renamed from: a */
        public final C0619kl mo2383a() {
            if (this.f2683a != null) {
                return new C0619kl(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    C0619kl(C0620a aVar) {
        this.f2677a = aVar.f2683a;
        this.f2678b = aVar.f2684b;
        this.f2679c = aVar.f2685c.mo2331a();
        this.f2680d = aVar.f2686d;
        this.f2681e = aVar.f2687e != null ? aVar.f2687e : this;
    }

    @Nullable
    /* renamed from: a */
    public final String mo2375a(String str) {
        return this.f2679c.mo2323a(str);
    }

    /* renamed from: a */
    public final C0620a mo2376a() {
        return new C0620a(this);
    }

    /* renamed from: b */
    public final C0578jr mo2377b() {
        C0578jr jrVar = this.f2682f;
        if (jrVar != null) {
            return jrVar;
        }
        C0578jr a = C0578jr.m1769a(this.f2679c);
        this.f2682f = a;
        return a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f2678b);
        sb.append(", url=");
        sb.append(this.f2677a);
        sb.append(", tag=");
        sb.append(this.f2681e != this ? this.f2681e : null);
        sb.append('}');
        return sb.toString();
    }
}
