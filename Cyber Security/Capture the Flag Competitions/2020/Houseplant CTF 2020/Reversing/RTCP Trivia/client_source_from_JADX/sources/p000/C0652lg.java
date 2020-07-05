package p000;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: lg */
public final class C0652lg {

    /* renamed from: a */
    final C0574jo f2823a;

    /* renamed from: b */
    final C0650le f2824b;

    /* renamed from: c */
    private final C0580js f2825c;

    /* renamed from: d */
    private final C0600kc f2826d;

    /* renamed from: e */
    private List<Proxy> f2827e = Collections.emptyList();

    /* renamed from: f */
    private int f2828f;

    /* renamed from: g */
    private List<InetSocketAddress> f2829g = Collections.emptyList();

    /* renamed from: h */
    private final List<C0627kp> f2830h = new ArrayList();

    /* renamed from: lg$a */
    public static final class C0653a {

        /* renamed from: a */
        final List<C0627kp> f2831a;

        /* renamed from: b */
        int f2832b = 0;

        C0653a(List<C0627kp> list) {
            this.f2831a = list;
        }

        /* renamed from: a */
        public final boolean mo2439a() {
            return this.f2832b < this.f2831a.size();
        }
    }

    public C0652lg(C0574jo joVar, C0650le leVar, C0580js jsVar, C0600kc kcVar) {
        List<Proxy> list;
        this.f2823a = joVar;
        this.f2824b = leVar;
        this.f2825c = jsVar;
        this.f2826d = kcVar;
        C0607kf kfVar = joVar.f2359a;
        Proxy proxy = joVar.f2366h;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List select = this.f2823a.f2365g.select(kfVar.mo2332a());
            if (select == null || select.isEmpty()) {
                list = C0633kv.m1969a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = C0633kv.m1968a(select);
            }
        }
        this.f2827e = list;
        this.f2828f = 0;
    }

    /* renamed from: a */
    private void m2021a(Proxy proxy) {
        String str;
        int i;
        this.f2829g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.f2823a.f2359a.f2581b;
            i = this.f2823a.f2359a.f2582c;
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                StringBuilder sb = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            InetAddress address2 = inetSocketAddress.getAddress();
            str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
            i = inetSocketAddress.getPort();
        }
        if (i <= 0 || i > 65535) {
            StringBuilder sb2 = new StringBuilder("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            this.f2829g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            C0600kc.m1823b();
            List a = this.f2823a.f2360b.mo2318a(str);
            if (a.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f2823a.f2360b);
                sb3.append(" returned no addresses for ");
                sb3.append(str);
                throw new UnknownHostException(sb3.toString());
            }
            C0600kc.m1824c();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2829g.add(new InetSocketAddress((InetAddress) a.get(i2), i));
            }
        }
    }

    /* renamed from: c */
    private boolean m2022c() {
        return this.f2828f < this.f2827e.size();
    }

    /* renamed from: a */
    public final boolean mo2437a() {
        return m2022c() || !this.f2830h.isEmpty();
    }

    /* renamed from: b */
    public final C0653a mo2438b() {
        if (!mo2437a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m2022c()) {
            if (m2022c()) {
                List<Proxy> list = this.f2827e;
                int i = this.f2828f;
                this.f2828f = i + 1;
                Proxy proxy = (Proxy) list.get(i);
                m2021a(proxy);
                int size = this.f2829g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0627kp kpVar = new C0627kp(this.f2823a, proxy, (InetSocketAddress) this.f2829g.get(i2));
                    if (this.f2824b.mo2436c(kpVar)) {
                        this.f2830h.add(kpVar);
                    } else {
                        arrayList.add(kpVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            } else {
                StringBuilder sb = new StringBuilder("No route to ");
                sb.append(this.f2823a.f2359a.f2581b);
                sb.append("; exhausted proxy configurations: ");
                sb.append(this.f2827e);
                throw new SocketException(sb.toString());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f2830h);
            this.f2830h.clear();
        }
        return new C0653a(arrayList);
    }
}
