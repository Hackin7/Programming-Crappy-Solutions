package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ij */
public final class C0516ij {

    /* renamed from: a */
    public static C0516ij f2199a = new C0516ij();

    /* renamed from: b */
    final Map<Class, Boolean> f2200b = new HashMap();

    /* renamed from: c */
    private final Map<Class, C0517a> f2201c = new HashMap();

    /* renamed from: ij$a */
    public static class C0517a {

        /* renamed from: a */
        public final Map<C0523a, List<C0518b>> f2202a = new HashMap();

        /* renamed from: b */
        final Map<C0518b, C0523a> f2203b;

        C0517a(Map<C0518b, C0523a> map) {
            this.f2203b = map;
            for (Entry entry : map.entrySet()) {
                C0523a aVar = (C0523a) entry.getValue();
                List list = (List) this.f2202a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2202a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        public static void m1676a(List<C0518b> list, C0526ip ipVar, C0523a aVar, Object obj) {
            Method method;
            Object[] objArr;
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0518b bVar = (C0518b) list.get(size);
                    try {
                        switch (bVar.f2204a) {
                            case 0:
                                method = bVar.f2205b;
                                objArr = new Object[0];
                                break;
                            case 1:
                                method = bVar.f2205b;
                                objArr = new Object[]{ipVar};
                                break;
                            case 2:
                                method = bVar.f2205b;
                                objArr = new Object[]{ipVar, aVar};
                                break;
                            default:
                                continue;
                        }
                        method.invoke(obj, objArr);
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    /* renamed from: ij$b */
    static class C0518b {

        /* renamed from: a */
        final int f2204a;

        /* renamed from: b */
        final Method f2205b;

        C0518b(int i, Method method) {
            this.f2204a = i;
            this.f2205b = method;
            this.f2205b.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0518b bVar = (C0518b) obj;
            return this.f2204a == bVar.f2204a && this.f2205b.getName().equals(bVar.f2205b.getName());
        }

        public final int hashCode() {
            return (31 * this.f2204a) + this.f2205b.getName().hashCode();
        }
    }

    C0516ij() {
    }

    /* renamed from: a */
    private static void m1672a(Map<C0518b, C0523a> map, C0518b bVar, C0523a aVar, Class cls) {
        C0523a aVar2 = (C0523a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2205b;
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: a */
    static Method[] m1673a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0517a mo2116a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0517a b = mo2117b(superclass);
            if (b != null) {
                hashMap.putAll(b.f2203b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : mo2117b(b2).f2203b.entrySet()) {
                m1672a(hashMap, (C0518b) entry.getKey(), (C0523a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m1673a(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0535iw iwVar = (C0535iw) method.getAnnotation(C0535iw.class);
            if (iwVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(C0526ip.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                C0523a a = iwVar.mo2129a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0523a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a != C0523a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    } else {
                        i = 2;
                    }
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1672a(hashMap, new C0518b(i, method), a, cls);
                z = true;
            }
        }
        C0517a aVar = new C0517a(hashMap);
        this.f2201c.put(cls, aVar);
        this.f2200b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public final C0517a mo2117b(Class cls) {
        C0517a aVar = (C0517a) this.f2201c.get(cls);
        return aVar != null ? aVar : mo2116a(cls, null);
    }
}
