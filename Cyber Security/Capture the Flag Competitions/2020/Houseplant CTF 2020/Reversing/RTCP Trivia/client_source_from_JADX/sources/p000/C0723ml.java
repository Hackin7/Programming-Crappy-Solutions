package p000;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/* renamed from: ml */
public final class C0723ml extends C0728mp {
    private C0723ml() {
    }

    /* renamed from: b */
    public static C0728mp m2254b() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new C0723ml();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final String mo2539a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo2539a(sSLSocket);
    }

    /* renamed from: a */
    public final void mo2544a(SSLSocket sSLSocket, String str, List<C0616kj> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C0728mp.m2272a(list).toArray(new String[0]));
            return;
        }
        super.mo2544a(sSLSocket, str, list);
    }

    /* renamed from: g_ */
    public final SSLContext mo2555g_() {
        try {
            return SSLContext.getInstance("TLS", new OpenSSLProvider());
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}
