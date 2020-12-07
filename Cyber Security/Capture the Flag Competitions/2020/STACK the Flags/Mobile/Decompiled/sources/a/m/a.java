package a.m;

import a.m.d;
import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f1171c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, C0031a> f1172a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class, Boolean> f1173b = new HashMap();

    public boolean d(Class klass) {
        Boolean hasLifecycleMethods = this.f1173b.get(klass);
        if (hasLifecycleMethods != null) {
            return hasLifecycleMethods.booleanValue();
        }
        Method[] methods = b(klass);
        for (Method method : methods) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(klass, methods);
                return true;
            }
        }
        this.f1173b.put(klass, false);
        return false;
    }

    public final Method[] b(Class klass) {
        try {
            return klass.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    public C0031a c(Class klass) {
        C0031a existing = this.f1172a.get(klass);
        if (existing != null) {
            return existing;
        }
        return a(klass, null);
    }

    public final void e(Map<b, d.a> map, b newHandler, d.a newEvent, Class klass) {
        d.a event = map.get(newHandler);
        if (event != null && newEvent != event) {
            Method method = newHandler.f1177b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + klass.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event + ", new value " + newEvent);
        } else if (event == null) {
            map.put(newHandler, newEvent);
        }
    }

    public final C0031a a(Class klass, Method[] declaredMethods) {
        C0031a superInfo;
        Class superclass = klass.getSuperclass();
        Map<ClassesInfoCache.MethodReference, Lifecycle.Event> handlerToEvent = new HashMap<>();
        if (!(superclass == null || (superInfo = c(superclass)) == null)) {
            handlerToEvent.putAll(superInfo.f1175b);
        }
        char c2 = 0;
        for (Class intrfc : klass.getInterfaces()) {
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : c(intrfc).f1175b.entrySet()) {
                e(handlerToEvent, (b) entry.getKey(), (d.a) entry.getValue(), klass);
            }
        }
        Method[] methods = declaredMethods != null ? declaredMethods : b(klass);
        boolean hasLifecycleMethods = false;
        int length = methods.length;
        int i = 0;
        while (i < length) {
            Method method = methods[i];
            n annotation = (n) method.getAnnotation(n.class);
            if (annotation != null) {
                hasLifecycleMethods = true;
                Class<?>[] params = method.getParameterTypes();
                int callType = 0;
                if (params.length > 0) {
                    callType = 1;
                    if (!params[c2].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                }
                d.a event = annotation.value();
                if (params.length > 1) {
                    callType = 2;
                    if (!params[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (event != d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (params.length <= 2) {
                    e(handlerToEvent, new b(callType, method), event, klass);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
            i++;
            c2 = 0;
        }
        C0031a info = new C0031a(handlerToEvent);
        this.f1172a.put(klass, info);
        this.f1173b.put(klass, Boolean.valueOf(hasLifecycleMethods));
        return info;
    }

    /* renamed from: a.m.a$a  reason: collision with other inner class name */
    public static class C0031a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<d.a, List<b>> f1174a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, d.a> f1175b;

        public C0031a(Map<b, d.a> map) {
            this.f1175b = map;
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : map.entrySet()) {
                d.a event = (d.a) entry.getValue();
                List<ClassesInfoCache.MethodReference> methodReferences = this.f1174a.get(event);
                if (methodReferences == null) {
                    methodReferences = new ArrayList<>();
                    this.f1174a.put(event, methodReferences);
                }
                methodReferences.add(entry.getKey());
            }
        }

        public void a(g source, d.a event, Object target) {
            b(this.f1174a.get(event), source, event, target);
            b(this.f1174a.get(d.a.ON_ANY), source, event, target);
        }

        public static void b(List<b> list, g source, d.a event, Object mWrapped) {
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    list.get(i).a(source, event, mWrapped);
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1176a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f1177b;

        public b(int callType, Method method) {
            this.f1176a = callType;
            this.f1177b = method;
            method.setAccessible(true);
        }

        public void a(g source, d.a event, Object target) {
            try {
                int i = this.f1176a;
                if (i == 0) {
                    this.f1177b.invoke(target, new Object[0]);
                } else if (i == 1) {
                    this.f1177b.invoke(target, source);
                } else if (i == 2) {
                    this.f1177b.invoke(target, source, event);
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            b that = (b) o;
            if (this.f1176a != that.f1176a || !this.f1177b.getName().equals(that.f1177b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f1176a * 31) + this.f1177b.getName().hashCode();
        }
    }
}
