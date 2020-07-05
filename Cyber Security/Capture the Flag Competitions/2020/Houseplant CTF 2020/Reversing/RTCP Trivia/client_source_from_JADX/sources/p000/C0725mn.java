package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* renamed from: mn */
final class C0725mn extends C0728mp {

    /* renamed from: a */
    private final Method f3112a;

    /* renamed from: b */
    private final Method f3113b;

    /* renamed from: d */
    private final Method f3114d;

    /* renamed from: e */
    private final Class<?> f3115e;

    /* renamed from: f */
    private final Class<?> f3116f;

    /* renamed from: mn$a */
    static class C0726a implements InvocationHandler {

        /* renamed from: a */
        boolean f3117a;

        /* renamed from: b */
        String f3118b;

        /* renamed from: c */
        private final List<String> f3119c;

        C0726a(List<String> list) {
            this.f3119c = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<String> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C0633kv.f2733b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.valueOf(true);
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f3117a = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f3119c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj2 = this.f3119c.get(0);
                            break;
                        } else if (this.f3119c.contains(list.get(i))) {
                            obj2 = list.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = (String) obj2;
                    this.f3118b = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f3118b = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    private C0725mn(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f3112a = method;
        this.f3113b = method2;
        this.f3114d = method3;
        this.f3115e = cls;
        this.f3116f = cls2;
    }

    /* renamed from: b */
    public static C0728mp m2261b() {
        String str = "org.eclipse.jetty.alpn.ALPN";
        try {
            Class cls = Class.forName(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("$Provider");
            Class cls2 = Class.forName(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$ClientProvider");
            Class cls3 = Class.forName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$ServerProvider");
            Class cls4 = Class.forName(sb3.toString());
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            Method method2 = method;
            C0725mn mnVar = new C0725mn(method2, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
            return mnVar;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final String mo2539a(SSLSocket sSLSocket) {
        try {
            C0726a aVar = (C0726a) Proxy.getInvocationHandler(this.f3113b.invoke(null, new Object[]{sSLSocket}));
            if (!aVar.f3117a && aVar.f3118b == null) {
                C0728mp.f3124c.mo2541a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f3117a) {
                return null;
            } else {
                return aVar.f3118b;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0633kv.m1964a("unable to get selected protocol", (Exception) e);
        }
    }

    /* renamed from: a */
    public final void mo2544a(SSLSocket sSLSocket, String str, List<C0616kj> list) {
        List a = m2272a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C0728mp.class.getClassLoader(), new Class[]{this.f3115e, this.f3116f}, new C0726a(a));
            this.f3112a.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0633kv.m1964a("unable to set alpn", (Exception) e);
        }
    }

    /* renamed from: b */
    public final void mo2556b(SSLSocket sSLSocket) {
        try {
            this.f3114d.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C0633kv.m1964a("unable to remove alpn", (Exception) e);
        }
    }
}
