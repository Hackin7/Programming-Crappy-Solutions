package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: lc */
public final class C0647lc {

    /* renamed from: a */
    final List<C0589jx> f2800a;

    /* renamed from: b */
    int f2801b = 0;

    /* renamed from: c */
    boolean f2802c;

    /* renamed from: d */
    boolean f2803d;

    public C0647lc(List<C0589jx> list) {
        this.f2800a = list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2424a(SSLSocket sSLSocket) {
        for (int i = this.f2801b; i < this.f2800a.size(); i++) {
            if (((C0589jx) this.f2800a.get(i)).mo2302a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
