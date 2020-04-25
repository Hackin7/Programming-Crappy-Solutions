package p000;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: mp */
public class C0728mp {

    /* renamed from: a */
    private static final Logger f3123a = Logger.getLogger(C0613ki.class.getName());

    /* renamed from: c */
    static final C0728mp f3124c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 != null) goto L_0x0044;
     */
    static {
        /*
            mp r0 = p000.C0719mk.m2236a()
            if (r0 == 0) goto L_0x0007
            goto L_0x0044
        L_0x0007:
            java.lang.String r0 = "conscrypt"
            java.lang.String r1 = "okhttp.platform"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0028
        L_0x0017:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Conscrypt"
            boolean r0 = r1.equals(r0)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            mp r0 = p000.C0723ml.m2254b()
            if (r0 == 0) goto L_0x0031
            goto L_0x0044
        L_0x0031:
            mm r0 = p000.C0724mm.m2258b()
            if (r0 == 0) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            mp r0 = p000.C0725mn.m2261b()
            if (r0 == 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            mp r0 = new mp
            r0.<init>()
        L_0x0044:
            f3124c = r0
            java.lang.Class<ki> r0 = p000.C0613ki.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f3123a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0728mp.<clinit>():void");
    }

    /* renamed from: a */
    public static List<String> m2272a(List<C0616kj> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0616kj kjVar = (C0616kj) list.get(i);
            if (kjVar != C0616kj.HTTP_1_0) {
                arrayList.add(kjVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static C0728mp m2273c() {
        return f3124c;
    }

    /* renamed from: a */
    public Object mo2538a(String str) {
        if (f3123a.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public String mo2539a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: a */
    public C0732mt mo2540a(X509TrustManager x509TrustManager) {
        return new C0730mr(mo2545b(x509TrustManager));
    }

    /* renamed from: a */
    public void mo2541a(int i, String str, Throwable th) {
        f3123a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public void mo2542a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        mo2541a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public void mo2543a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo2544a(SSLSocket sSLSocket, String str, List<C0616kj> list) {
    }

    /* renamed from: b */
    public C0734mv mo2545b(X509TrustManager x509TrustManager) {
        return new C0731ms(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: b */
    public void mo2556b(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public boolean mo2546b(String str) {
        return true;
    }

    /* renamed from: g_ */
    public SSLContext mo2555g_() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}
