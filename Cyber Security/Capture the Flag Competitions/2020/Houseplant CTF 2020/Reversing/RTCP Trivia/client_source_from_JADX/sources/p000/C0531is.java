package p000;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: is */
public final class C0531is {

    /* renamed from: a */
    private static Map<Class, Integer> f2223a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0520il>>> f2224b = new HashMap();

    /* renamed from: a */
    private static C0520il m1698a(Constructor<? extends C0520il> constructor, Object obj) {
        try {
            return (C0520il) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    static C0521im m1699a(Object obj) {
        if (obj instanceof C0519ik) {
            return new FullLifecycleObserverAdapter((C0519ik) obj);
        }
        if (obj instanceof C0521im) {
            return (C0521im) obj;
        }
        Class cls = obj.getClass();
        if (m1701b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f2224b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m1698a((Constructor) list.get(0), obj));
        }
        C0520il[] ilVarArr = new C0520il[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ilVarArr[i] = m1698a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(ilVarArr);
    }

    /* renamed from: a */
    private static Constructor<? extends C0520il> m1700a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName.replace(".", "_"));
            sb.append("_LifecycleAdapter");
            String sb2 = sb.toString();
            if (!name.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(name);
                sb3.append(".");
                sb3.append(sb2);
                sb2 = sb3.toString();
            }
            Constructor<? extends C0520il> declaredConstructor = Class.forName(sb2).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m1701b(Class<?> cls) {
        boolean z;
        if (f2223a.containsKey(cls)) {
            return ((Integer) f2223a.get(cls)).intValue();
        }
        int i = 2;
        if (cls.getCanonicalName() != null) {
            Constructor a = m1700a(cls);
            if (a != null) {
                f2224b.put(cls, Collections.singletonList(a));
            } else {
                C0516ij ijVar = C0516ij.f2199a;
                int i2 = 0;
                if (!ijVar.f2200b.containsKey(cls)) {
                    Method[] a2 = C0516ij.m1673a(cls);
                    int length = a2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            ijVar.f2200b.put(cls, Boolean.valueOf(false));
                            z = false;
                            break;
                        } else if (((C0535iw) a2[i3].getAnnotation(C0535iw.class)) != null) {
                            ijVar.mo2116a(cls, a2);
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    z = ((Boolean) ijVar.f2200b.get(cls)).booleanValue();
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    ArrayList arrayList = null;
                    if (m1702c(superclass)) {
                        if (m1701b(superclass) != 1) {
                            arrayList = new ArrayList((Collection) f2224b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    while (true) {
                        if (i2 < length2) {
                            Class cls2 = interfaces[i2];
                            if (m1702c(cls2)) {
                                if (m1701b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) f2224b.get(cls2));
                            }
                            i2++;
                        } else if (arrayList != null) {
                            f2224b.put(cls, arrayList);
                        }
                    }
                }
            }
            f2223a.put(cls, Integer.valueOf(i));
            return i;
        }
        i = 1;
        f2223a.put(cls, Integer.valueOf(i));
        return i;
    }

    /* renamed from: c */
    private static boolean m1702c(Class<?> cls) {
        return cls != null && C0525io.class.isAssignableFrom(cls);
    }
}
