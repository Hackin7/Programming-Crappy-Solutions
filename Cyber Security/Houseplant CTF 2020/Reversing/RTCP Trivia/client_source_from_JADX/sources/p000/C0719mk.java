package p000;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: mk */
final class C0719mk extends C0728mp {

    /* renamed from: a */
    private final Class<?> f3097a;

    /* renamed from: b */
    private final C0727mo<Socket> f3098b;

    /* renamed from: d */
    private final C0727mo<Socket> f3099d;

    /* renamed from: e */
    private final C0727mo<Socket> f3100e;

    /* renamed from: f */
    private final C0727mo<Socket> f3101f;

    /* renamed from: g */
    private final C0722c f3102g = C0722c.m2251a();

    /* renamed from: mk$a */
    static final class C0720a extends C0732mt {

        /* renamed from: a */
        private final Object f3103a;

        /* renamed from: b */
        private final Method f3104b;

        C0720a(Object obj, Method method) {
            this.f3103a = obj;
            this.f3104b = method;
        }

        /* renamed from: a */
        public final List<Certificate> mo2547a(List<Certificate> list, String str) {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f3104b.invoke(this.f3103a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof C0720a;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* renamed from: mk$b */
    static final class C0721b implements C0734mv {

        /* renamed from: a */
        private final X509TrustManager f3105a;

        /* renamed from: b */
        private final Method f3106b;

        C0721b(X509TrustManager x509TrustManager, Method method) {
            this.f3106b = method;
            this.f3105a = x509TrustManager;
        }

        /* renamed from: a */
        public final X509Certificate mo2550a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f3106b.invoke(this.f3105a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw C0633kv.m1964a("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0721b)) {
                return false;
            }
            C0721b bVar = (C0721b) obj;
            return this.f3105a.equals(bVar.f3105a) && this.f3106b.equals(bVar.f3106b);
        }

        public final int hashCode() {
            return this.f3105a.hashCode() + (31 * this.f3106b.hashCode());
        }
    }

    /* renamed from: mk$c */
    static final class C0722c {

        /* renamed from: a */
        private final Method f3107a;

        /* renamed from: b */
        private final Method f3108b;

        /* renamed from: c */
        private final Method f3109c;

        private C0722c(Method method, Method method2, Method method3) {
            this.f3107a = method;
            this.f3108b = method2;
            this.f3109c = method3;
        }

        /* renamed from: a */
        static C0722c m2251a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C0722c(method3, method, method2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Object mo2553a(String str) {
            if (this.f3107a != null) {
                try {
                    Object invoke = this.f3107a.invoke(null, new Object[0]);
                    this.f3108b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo2554a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f3109c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    private C0719mk(Class<?> cls, C0727mo<Socket> moVar, C0727mo<Socket> moVar2, C0727mo<Socket> moVar3, C0727mo<Socket> moVar4) {
        this.f3097a = cls;
        this.f3098b = moVar;
        this.f3099d = moVar2;
        this.f3100e = moVar3;
        this.f3101f = moVar4;
    }

    /* renamed from: a */
    public static C0728mp m2236a() {
        Class cls;
        C0727mo moVar;
        C0727mo moVar2;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class cls2 = cls;
        C0727mo moVar3 = new C0727mo(null, "setUseSessionTickets", Boolean.TYPE);
        C0727mo moVar4 = new C0727mo(null, "setHostname", String.class);
        if (m2238b()) {
            C0727mo moVar5 = new C0727mo(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            moVar = new C0727mo(null, "setAlpnProtocols", byte[].class);
            moVar2 = moVar5;
        } else {
            moVar2 = null;
            moVar = null;
        }
        C0719mk mkVar = new C0719mk(cls2, moVar3, moVar4, moVar2, moVar);
        return mkVar;
    }

    /* renamed from: a */
    private boolean m2237a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m2239b(str, cls, obj);
        }
    }

    /* renamed from: b */
    private static boolean m2238b() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m2239b(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo2546b(str);
        }
    }

    /* renamed from: a */
    public final Object mo2538a(String str) {
        return this.f3102g.mo2553a(str);
    }

    @Nullable
    /* renamed from: a */
    public final String mo2539a(SSLSocket sSLSocket) {
        if (this.f3100e == null || !this.f3100e.mo2559a(sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f3100e.mo2560b(sSLSocket, new Object[0]);
        if (bArr != null) {
            return new String(bArr, C0633kv.f2736e);
        }
        return null;
    }

    /* renamed from: a */
    public final C0732mt mo2540a(X509TrustManager x509TrustManager) {
        try {
            Class cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0720a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.mo2540a(x509TrustManager);
        }
    }

    /* renamed from: a */
    public final void mo2541a(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(Log.getStackTraceString(th));
            str = sb.toString();
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: a */
    public final void mo2542a(String str, Object obj) {
        if (!this.f3102g.mo2554a(obj)) {
            mo2541a(5, str, (Throwable) null);
        }
    }

    /* renamed from: a */
    public final void mo2543a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C0633kv.m1974a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    /* renamed from: a */
    public final void mo2544a(SSLSocket sSLSocket, String str, List<C0616kj> list) {
        if (str != null) {
            this.f3098b.mo2558a(sSLSocket, Boolean.valueOf(true));
            this.f3099d.mo2558a(sSLSocket, str);
        }
        if (this.f3101f != null && this.f3101f.mo2559a(sSLSocket)) {
            Object[] objArr = new Object[1];
            C0758nc ncVar = new C0758nc();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0616kj kjVar = (C0616kj) list.get(i);
                if (kjVar != C0616kj.HTTP_1_0) {
                    ncVar.mo2646h(kjVar.toString().length());
                    ncVar.mo2622b(kjVar.toString());
                }
            }
            objArr[0] = ncVar.mo2659p();
            this.f3101f.mo2560b(sSLSocket, objArr);
        }
    }

    /* renamed from: b */
    public final C0734mv mo2545b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C0721b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo2545b(x509TrustManager);
        }
    }

    /* renamed from: b */
    public final boolean mo2546b(String str) {
        try {
            Class cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m2237a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo2546b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C0633kv.m1964a("unable to determine cleartext support", e);
        }
    }
}
