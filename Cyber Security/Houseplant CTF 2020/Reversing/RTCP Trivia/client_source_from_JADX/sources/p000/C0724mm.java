package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: mm */
final class C0724mm extends C0728mp {

    /* renamed from: a */
    final Method f3110a;

    /* renamed from: b */
    final Method f3111b;

    private C0724mm(Method method, Method method2) {
        this.f3110a = method;
        this.f3111b = method2;
    }

    /* renamed from: b */
    public static C0724mm m2258b() {
        try {
            return new C0724mm(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final String mo2539a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f3111b.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0633kv.m1964a("unable to get selected protocols", (Exception) e);
        }
    }

    /* renamed from: a */
    public final void mo2544a(SSLSocket sSLSocket, String str, List<C0616kj> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List a = m2272a(list);
            this.f3110a.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0633kv.m1964a("unable to set ssl parameters", (Exception) e);
        }
    }
}
