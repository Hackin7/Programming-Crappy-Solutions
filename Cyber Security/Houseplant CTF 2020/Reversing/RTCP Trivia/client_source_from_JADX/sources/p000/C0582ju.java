package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: ju */
public final class C0582ju {

    /* renamed from: a */
    public static final C0582ju f2396a = new C0582ju(new LinkedHashSet(new C0583a().f2399a), null);

    /* renamed from: b */
    final Set<C0584b> f2397b;
    @Nullable

    /* renamed from: c */
    final C0732mt f2398c;

    /* renamed from: ju$a */
    public static final class C0583a {

        /* renamed from: a */
        final List<C0584b> f2399a = new ArrayList();
    }

    /* renamed from: ju$b */
    static final class C0584b {

        /* renamed from: a */
        final String f2400a;

        /* renamed from: b */
        final String f2401b;

        /* renamed from: c */
        final String f2402c;

        /* renamed from: d */
        final C0762nf f2403d;

        public final boolean equals(Object obj) {
            if (obj instanceof C0584b) {
                C0584b bVar = (C0584b) obj;
                if (this.f2400a.equals(bVar.f2400a) && this.f2402c.equals(bVar.f2402c) && this.f2403d.equals(bVar.f2403d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (31 * (((527 + this.f2400a.hashCode()) * 31) + this.f2402c.hashCode())) + this.f2403d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2402c);
            sb.append(this.f2403d.mo2674b());
            return sb.toString();
        }
    }

    C0582ju(Set<C0584b> set, @Nullable C0732mt mtVar) {
        this.f2397b = set;
        this.f2398c = mtVar;
    }

    /* renamed from: a */
    public static String m1775a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb = new StringBuilder("sha256/");
        sb.append(m1776a((X509Certificate) certificate).mo2674b());
        return sb.toString();
    }

    /* renamed from: a */
    private static C0762nf m1776a(X509Certificate x509Certificate) {
        return C0762nf.m2472a(x509Certificate.getPublicKey().getEncoded()).mo2677d();
    }

    /* renamed from: a */
    public final void mo2292a(String str, List<Certificate> list) {
        int i;
        String str2 = str;
        List emptyList = Collections.emptyList();
        Iterator it = this.f2397b.iterator();
        List list2 = emptyList;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C0584b bVar = (C0584b) it.next();
            if (bVar.f2400a.startsWith("*.")) {
                int indexOf = str2.indexOf(46);
                if ((str.length() - indexOf) - 1 == bVar.f2401b.length()) {
                    if (str2.regionMatches(false, indexOf + 1, bVar.f2401b, 0, bVar.f2401b.length())) {
                        i = 1;
                    }
                }
            } else {
                i = str2.equals(bVar.f2401b);
            }
            if (i != 0) {
                if (list2.isEmpty()) {
                    list2 = new ArrayList();
                }
                list2.add(bVar);
            }
        }
        if (!list2.isEmpty()) {
            List<Certificate> a = this.f2398c != null ? this.f2398c.mo2547a(list, str2) : list;
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) a.get(i2);
                int size2 = list2.size();
                C0762nf nfVar = null;
                C0762nf nfVar2 = null;
                for (int i3 = 0; i3 < size2; i3++) {
                    C0584b bVar2 = (C0584b) list2.get(i3);
                    if (bVar2.f2402c.equals("sha256/")) {
                        if (nfVar == null) {
                            nfVar = m1776a(x509Certificate);
                        }
                        if (bVar2.f2403d.equals(nfVar)) {
                            return;
                        }
                    } else if (bVar2.f2402c.equals("sha1/")) {
                        if (nfVar2 == null) {
                            nfVar2 = C0762nf.m2472a(x509Certificate.getPublicKey().getEncoded()).mo2675c();
                        }
                        if (bVar2.f2403d.equals(nfVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("unsupported hashAlgorithm: ");
                        sb.append(bVar2.f2402c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = a.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X509Certificate x509Certificate2 = (X509Certificate) a.get(i4);
                sb2.append("\n    ");
                sb2.append(m1775a((Certificate) x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str2);
            sb2.append(":");
            int size4 = list2.size();
            while (i < size4) {
                C0584b bVar3 = (C0584b) list2.get(i);
                sb2.append("\n    ");
                sb2.append(bVar3);
                i++;
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0582ju) {
            C0582ju juVar = (C0582ju) obj;
            if (C0633kv.m1975a((Object) this.f2398c, (Object) juVar.f2398c) && this.f2397b.equals(juVar.f2397b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * (this.f2398c != null ? this.f2398c.hashCode() : 0)) + this.f2397b.hashCode();
    }
}
