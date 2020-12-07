package a.b.k;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static Field f47a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f48b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f49c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f50d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f51e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f52f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f53g;
    public static boolean h;

    public static void a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                d(resources);
            } else if (i >= 23) {
                c(resources);
            } else {
                b(resources);
            }
        }
    }

    public static void b(Resources resources) {
        if (!f48b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f47a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f48b = true;
        }
        Field field = f47a;
        if (field != null) {
            Map drawableCache = null;
            try {
                drawableCache = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (drawableCache != null) {
                drawableCache.clear();
            }
        }
    }

    public static void c(Resources resources) {
        if (!f48b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f47a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f48b = true;
        }
        Object drawableCache = null;
        Field field = f47a;
        if (field != null) {
            try {
                drawableCache = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (drawableCache != null) {
            e(drawableCache);
        }
    }

    public static void d(Resources resources) {
        if (!h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f53g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            h = true;
        }
        Field field = f53g;
        if (field != null) {
            Object resourcesImpl = null;
            try {
                resourcesImpl = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            }
            if (resourcesImpl != null) {
                if (!f48b) {
                    try {
                        Field declaredField2 = resourcesImpl.getClass().getDeclaredField("mDrawableCache");
                        f47a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                    }
                    f48b = true;
                }
                Object drawableCache = null;
                Field field2 = f47a;
                if (field2 != null) {
                    try {
                        drawableCache = field2.get(resourcesImpl);
                    } catch (IllegalAccessException e5) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                    }
                }
                if (drawableCache != null) {
                    e(drawableCache);
                }
            }
        }
    }

    public static void e(Object cache) {
        if (!f50d) {
            try {
                f49c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f50d = true;
        }
        Class<?> cls = f49c;
        if (cls != null) {
            if (!f52f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f51e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException ee) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ee);
                }
                f52f = true;
            }
            Field field = f51e;
            if (field != null) {
                LongSparseArray unthemedEntries = null;
                try {
                    unthemedEntries = (LongSparseArray) field.get(cache);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (unthemedEntries != null) {
                    unthemedEntries.clear();
                }
            }
        }
    }
}
