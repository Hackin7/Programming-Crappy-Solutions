package p000;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: mu */
public final class C0733mu implements HostnameVerifier {

    /* renamed from: a */
    public static final C0733mu f3135a = new C0733mu();

    private C0733mu() {
    }

    /* renamed from: a */
    public static List<String> m2293a(X509Certificate x509Certificate) {
        List a = m2294a(x509Certificate, 7);
        List a2 = m2294a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a.size() + a2.size());
        arrayList.addAll(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m2294a(X509Certificate x509Certificate, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2) {
                    Integer num = (Integer) list.get(0);
                    if (num != null && num.intValue() == i) {
                        String str = (String) list.get(1);
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0103 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2295a(java.lang.String r8, java.security.cert.X509Certificate r9) {
        /*
            boolean r0 = p000.C0633kv.m1984c(r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0025
            r0 = 7
            java.util.List r9 = m2294a(r9, r0)
            int r0 = r9.size()
            r3 = r2
        L_0x0012:
            if (r3 >= r0) goto L_0x0024
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0021
            return r1
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0024:
            return r2
        L_0x0025:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r8 = r8.toLowerCase(r0)
            r0 = 2
            java.util.List r9 = m2294a(r9, r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x0034:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r8 == 0) goto L_0x0100
            int r3 = r8.length()
            if (r3 == 0) goto L_0x0100
            java.lang.String r3 = "."
            boolean r3 = r8.startsWith(r3)
            if (r3 != 0) goto L_0x0100
            java.lang.String r3 = ".."
            boolean r3 = r8.endsWith(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0100
        L_0x005a:
            if (r0 == 0) goto L_0x0100
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0100
            java.lang.String r3 = "."
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x0100
            java.lang.String r3 = ".."
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L_0x0074
            goto L_0x0100
        L_0x0074:
            java.lang.String r3 = "."
            boolean r3 = r8.endsWith(r3)
            r4 = 46
            if (r3 != 0) goto L_0x008e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x008f
        L_0x008e:
            r3 = r8
        L_0x008f:
            java.lang.String r5 = "."
            boolean r5 = r0.endsWith(r5)
            if (r5 != 0) goto L_0x00a6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L_0x00a6:
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r5)
            java.lang.String r5 = "*"
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L_0x00b9
            boolean r0 = r3.equals(r0)
            goto L_0x0101
        L_0x00b9:
            java.lang.String r5 = "*."
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L_0x0100
            r5 = 42
            int r5 = r0.indexOf(r5, r1)
            r6 = -1
            if (r5 == r6) goto L_0x00cb
            goto L_0x0100
        L_0x00cb:
            int r5 = r3.length()
            int r7 = r0.length()
            if (r5 >= r7) goto L_0x00d6
            goto L_0x0100
        L_0x00d6:
            java.lang.String r5 = "*."
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00df
            goto L_0x0100
        L_0x00df:
            java.lang.String r0 = r0.substring(r1)
            boolean r5 = r3.endsWith(r0)
            if (r5 != 0) goto L_0x00ea
            goto L_0x0100
        L_0x00ea:
            int r5 = r3.length()
            int r0 = r0.length()
            int r5 = r5 - r0
            if (r5 <= 0) goto L_0x00fe
            int r5 = r5 + -1
            int r0 = r3.lastIndexOf(r4, r5)
            if (r0 == r6) goto L_0x00fe
            goto L_0x0100
        L_0x00fe:
            r0 = r1
            goto L_0x0101
        L_0x0100:
            r0 = r2
        L_0x0101:
            if (r0 == 0) goto L_0x0034
            return r1
        L_0x0104:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0733mu.m2295a(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m2295a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
