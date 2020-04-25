package p000;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: kd */
public final class C0604kd {

    /* renamed from: a */
    public final C0585jv f2573a;

    /* renamed from: b */
    public final List<Certificate> f2574b;

    /* renamed from: c */
    private final C0628kq f2575c;

    /* renamed from: d */
    private final List<Certificate> f2576d;

    private C0604kd(C0628kq kqVar, C0585jv jvVar, List<Certificate> list, List<Certificate> list2) {
        this.f2575c = kqVar;
        this.f2573a = jvVar;
        this.f2574b = list;
        this.f2576d = list2;
    }

    /* renamed from: a */
    public static C0604kd m1844a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        C0585jv a = C0585jv.m1779a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        C0628kq a2 = C0628kq.m1938a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List a3 = certificateArr != null ? C0633kv.m1969a((T[]) certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C0604kd(a2, a, a3, localCertificates != null ? C0633kv.m1969a((T[]) localCertificates) : Collections.emptyList());
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0604kd)) {
            return false;
        }
        C0604kd kdVar = (C0604kd) obj;
        return this.f2575c.equals(kdVar.f2575c) && this.f2573a.equals(kdVar.f2573a) && this.f2574b.equals(kdVar.f2574b) && this.f2576d.equals(kdVar.f2576d);
    }

    public final int hashCode() {
        return (31 * (((((527 + this.f2575c.hashCode()) * 31) + this.f2573a.hashCode()) * 31) + this.f2574b.hashCode())) + this.f2576d.hashCode();
    }
}
