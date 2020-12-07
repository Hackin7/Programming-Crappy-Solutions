package a.k.a;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a.e.g<String, Class<?>> f1044a = new a.e.g<>();

    public static Class<?> c(ClassLoader classLoader, String className) {
        Class<?> clazz = f1044a.get(className);
        if (clazz != null) {
            return clazz;
        }
        Class<?> clazz2 = Class.forName(className, false, classLoader);
        f1044a.put(className, clazz2);
        return clazz2;
    }

    public static boolean b(ClassLoader classLoader, String className) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, className));
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v7. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.Fragment> */
    public static Class<? extends Fragment> d(ClassLoader classLoader, String className) {
        try {
            return c(classLoader, className);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.e("Unable to instantiate fragment " + className + ": make sure class name exists", e2);
        } catch (ClassCastException e3) {
            throw new Fragment.e("Unable to instantiate fragment " + className + ": make sure class is a valid subclass of Fragment", e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String className) {
        try {
            return (Fragment) d(classLoader, className).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e2) {
            throw new Fragment.e("Unable to instantiate fragment " + className + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new Fragment.e("Unable to instantiate fragment " + className + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new Fragment.e("Unable to instantiate fragment " + className + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new Fragment.e("Unable to instantiate fragment " + className + ": calling Fragment constructor caused an exception", e5);
        }
    }
}
