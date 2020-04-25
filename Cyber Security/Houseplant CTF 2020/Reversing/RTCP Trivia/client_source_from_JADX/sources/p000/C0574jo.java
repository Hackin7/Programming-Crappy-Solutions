package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: jo */
public final class C0574jo {

    /* renamed from: a */
    public final C0607kf f2359a;

    /* renamed from: b */
    public final C0598kb f2360b;

    /* renamed from: c */
    public final SocketFactory f2361c;

    /* renamed from: d */
    public final C0575jp f2362d;

    /* renamed from: e */
    public final List<C0616kj> f2363e;

    /* renamed from: f */
    public final List<C0589jx> f2364f;

    /* renamed from: g */
    public final ProxySelector f2365g;
    @Nullable

    /* renamed from: h */
    public final Proxy f2366h;
    @Nullable

    /* renamed from: i */
    public final SSLSocketFactory f2367i;
    @Nullable

    /* renamed from: j */
    public final HostnameVerifier f2368j;
    @Nullable

    /* renamed from: k */
    public final C0582ju f2369k;

    public C0574jo(String str, int i, C0598kb kbVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C0582ju juVar, C0575jp jpVar, @Nullable Proxy proxy, List<C0616kj> list, List<C0589jx> list2, ProxySelector proxySelector) {
        String str2;
        C0608a aVar = new C0608a();
        String str3 = sSLSocketFactory != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (str3.equalsIgnoreCase("https")) {
            str2 = "https";
        } else {
            StringBuilder sb = new StringBuilder("unexpected scheme: ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
        aVar.f2589a = str2;
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String a = C0608a.m1873a(str, 0, str.length());
        if (a == null) {
            StringBuilder sb2 = new StringBuilder("unexpected host: ");
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
        aVar.f2592d = a;
        if (i <= 0 || i > 65535) {
            StringBuilder sb3 = new StringBuilder("unexpected port: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString());
        }
        aVar.f2593e = i;
        this.f2359a = aVar.mo2347b();
        if (kbVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f2360b = kbVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f2361c = socketFactory;
        if (jpVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f2362d = jpVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f2363e = C0633kv.m1968a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f2364f = C0633kv.m1968a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f2365g = proxySelector;
        this.f2366h = proxy;
        this.f2367i = sSLSocketFactory;
        this.f2368j = hostnameVerifier;
        this.f2369k = juVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2279a(C0574jo joVar) {
        return this.f2360b.equals(joVar.f2360b) && this.f2362d.equals(joVar.f2362d) && this.f2363e.equals(joVar.f2363e) && this.f2364f.equals(joVar.f2364f) && this.f2365g.equals(joVar.f2365g) && C0633kv.m1975a((Object) this.f2366h, (Object) joVar.f2366h) && C0633kv.m1975a((Object) this.f2367i, (Object) joVar.f2367i) && C0633kv.m1975a((Object) this.f2368j, (Object) joVar.f2368j) && C0633kv.m1975a((Object) this.f2369k, (Object) joVar.f2369k) && this.f2359a.f2582c == joVar.f2359a.f2582c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C0574jo) {
            C0574jo joVar = (C0574jo) obj;
            if (this.f2359a.equals(joVar.f2359a) && mo2279a(joVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = 31 * (((((((((((((((((527 + this.f2359a.hashCode()) * 31) + this.f2360b.hashCode()) * 31) + this.f2362d.hashCode()) * 31) + this.f2363e.hashCode()) * 31) + this.f2364f.hashCode()) * 31) + this.f2365g.hashCode()) * 31) + (this.f2366h != null ? this.f2366h.hashCode() : 0)) * 31) + (this.f2367i != null ? this.f2367i.hashCode() : 0)) * 31) + (this.f2368j != null ? this.f2368j.hashCode() : 0));
        if (this.f2369k != null) {
            i = this.f2369k.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f2359a.f2581b);
        sb.append(":");
        sb.append(this.f2359a.f2582c);
        if (this.f2366h != null) {
            sb.append(", proxy=");
            obj = this.f2366h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f2365g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
