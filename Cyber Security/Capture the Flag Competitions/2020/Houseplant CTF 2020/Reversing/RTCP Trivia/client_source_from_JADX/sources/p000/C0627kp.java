package p000;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import javax.annotation.Nullable;

/* renamed from: kp */
public final class C0627kp {

    /* renamed from: a */
    public final C0574jo f2720a;

    /* renamed from: b */
    public final Proxy f2721b;

    /* renamed from: c */
    public final InetSocketAddress f2722c;

    public C0627kp(C0574jo joVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (joVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        } else {
            this.f2720a = joVar;
            this.f2721b = proxy;
            this.f2722c = inetSocketAddress;
        }
    }

    /* renamed from: a */
    public final boolean mo2400a() {
        return this.f2720a.f2367i != null && this.f2721b.type() == Type.HTTP;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C0627kp) {
            C0627kp kpVar = (C0627kp) obj;
            if (kpVar.f2720a.equals(this.f2720a) && kpVar.f2721b.equals(this.f2721b) && kpVar.f2722c.equals(this.f2722c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * (((527 + this.f2720a.hashCode()) * 31) + this.f2721b.hashCode())) + this.f2722c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.f2722c);
        sb.append("}");
        return sb.toString();
    }
}
