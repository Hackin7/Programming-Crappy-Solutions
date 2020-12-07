package a.m;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sqlcipher.BuildConfig;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class, Integer> f1193a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class, List<Constructor<? extends c>>> f1194b = new HashMap();

    public static e f(Object object) {
        boolean isLifecycleEventObserver = object instanceof e;
        boolean isFullLifecycleObserver = object instanceof b;
        if (isLifecycleEventObserver && isFullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((b) object, (e) object);
        }
        if (isFullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((b) object, null);
        }
        if (isLifecycleEventObserver) {
            return (e) object;
        }
        Class<?> klass = object.getClass();
        if (d(klass) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> constructors = f1194b.get(klass);
        if (constructors.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(constructors.get(0), object));
        }
        c[] adapters = new c[constructors.size()];
        for (int i = 0; i < constructors.size(); i++) {
            adapters[i] = a(constructors.get(i), object);
        }
        return new CompositeGeneratedAdaptersObserver(adapters);
    }

    public static c a(Constructor<? extends c> constructor, Object object) {
        try {
            return (c) constructor.newInstance(object);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static Constructor<? extends c> b(Class<?> klass) {
        String str;
        String str2;
        try {
            Package aPackage = klass.getPackage();
            String name = klass.getCanonicalName();
            String fullPackage = aPackage != null ? aPackage.getName() : BuildConfig.FLAVOR;
            if (fullPackage.isEmpty()) {
                str = name;
            } else {
                str = name.substring(fullPackage.length() + 1);
            }
            String adapterName = c(str);
            if (fullPackage.isEmpty()) {
                str2 = adapterName;
            } else {
                str2 = fullPackage + "." + adapterName;
            }
            Constructor declaredConstructor = Class.forName(str2).getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e2) {
            return null;
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int d(Class<?> klass) {
        Integer callbackCache = f1193a.get(klass);
        if (callbackCache != null) {
            return callbackCache.intValue();
        }
        int type = g(klass);
        f1193a.put(klass, Integer.valueOf(type));
        return type;
    }

    public static int g(Class<?> klass) {
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> constructor = b(klass);
        if (constructor != null) {
            f1194b.put(klass, Collections.singletonList(constructor));
            return 2;
        } else if (a.f1171c.d(klass)) {
            return 1;
        } else {
            Class<?> superclass = klass.getSuperclass();
            List<Constructor<? extends GeneratedAdapter>> adapterConstructors = null;
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                adapterConstructors = new ArrayList<>(f1194b.get(superclass));
            }
            Class<?>[] interfaces = klass.getInterfaces();
            for (Class<?> intrface : interfaces) {
                if (e(intrface)) {
                    if (d(intrface) == 1) {
                        return 1;
                    }
                    if (adapterConstructors == null) {
                        adapterConstructors = new ArrayList<>();
                    }
                    adapterConstructors.addAll(f1194b.get(intrface));
                }
            }
            if (adapterConstructors == null) {
                return 1;
            }
            f1194b.put(klass, adapterConstructors);
            return 2;
        }
    }

    public static boolean e(Class<?> klass) {
        return klass != null && f.class.isAssignableFrom(klass);
    }

    public static String c(String className) {
        return className.replace(".", "_") + "_LifecycleAdapter";
    }
}
