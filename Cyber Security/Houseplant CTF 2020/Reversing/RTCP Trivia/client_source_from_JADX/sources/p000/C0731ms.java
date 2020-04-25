package p000;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: ms */
public final class C0731ms implements C0734mv {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f3134a = new LinkedHashMap();

    public C0731ms(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f3134a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f3134a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public final X509Certificate mo2550a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f3134a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0731ms) && ((C0731ms) obj).f3134a.equals(this.f3134a);
    }

    public final int hashCode() {
        return this.f3134a.hashCode();
    }
}
