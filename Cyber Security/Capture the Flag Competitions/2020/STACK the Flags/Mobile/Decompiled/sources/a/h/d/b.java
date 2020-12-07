package a.h.d;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f768a = a();

    /* renamed from: b  reason: collision with root package name */
    public static final Field f769b = b();

    /* renamed from: c  reason: collision with root package name */
    public static final Field f770c = f();

    /* renamed from: d  reason: collision with root package name */
    public static final Method f771d = d(f768a);

    /* renamed from: e  reason: collision with root package name */
    public static final Method f772e = c(f768a);

    /* renamed from: f  reason: collision with root package name */
    public static final Method f773f = e(f768a);

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f774g = new Handler(Looper.getMainLooper());

    public static boolean i(Activity activity) {
        Object activityThread;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f773f == null) {
            return false;
        } else {
            if (f772e == null && f771d == null) {
                return false;
            }
            try {
                Object token = f770c.get(activity);
                if (token == null || (activityThread = f769b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d callbacks = new d(activity);
                application.registerActivityLifecycleCallbacks(callbacks);
                f774g.post(new a(callbacks, token));
                try {
                    if (g()) {
                        f773f.invoke(activityThread, token, null, null, 0, false, null, null, false, false);
                    } else {
                        activity.recreate();
                    }
                    return true;
                } finally {
                    f774g.post(new RunnableC0015b(application, callbacks));
                }
            } catch (Throwable th) {
                return false;
            }
        }
    }

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f775b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f776c;

        public a(d dVar, Object obj) {
            this.f775b = dVar;
            this.f776c = obj;
        }

        public void run() {
            this.f775b.f781a = this.f776c;
        }
    }

    /* renamed from: a.h.d.b$b  reason: collision with other inner class name */
    public class RunnableC0015b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Application f777b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f778c;

        public RunnableC0015b(Application application, d dVar) {
            this.f777b = application;
            this.f778c = dVar;
        }

        public void run() {
            this.f777b.unregisterActivityLifecycleCallbacks(this.f778c);
        }
    }

    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f781a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f782b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f783c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f784d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f785e = false;

        public d(Activity aboutToRecreate) {
            this.f782b = aboutToRecreate;
        }

        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f782b == activity) {
                this.f783c = true;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            if (this.f784d && !this.f785e && !this.f783c && b.h(this.f781a, activity)) {
                this.f785e = true;
                this.f781a = null;
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f782b == activity) {
                this.f782b = null;
                this.f784d = true;
            }
        }
    }

    public static boolean h(Object currentlyRecreatingToken, Activity activity) {
        try {
            Object token = f770c.get(activity);
            if (token != currentlyRecreatingToken) {
                return false;
            }
            f774g.postAtFrontOfQueue(new c(f769b.get(activity), token));
            return true;
        } catch (Throwable t) {
            Log.e("ActivityRecreator", "Exception while fetching field values", t);
            return false;
        }
    }

    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f779b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f780c;

        public c(Object obj, Object obj2) {
            this.f779b = obj;
            this.f780c = obj2;
        }

        public void run() {
            try {
                if (b.f771d != null) {
                    b.f771d.invoke(this.f779b, this.f780c, false, "AppCompat recreation");
                    return;
                }
                b.f772e.invoke(this.f779b, this.f780c, false);
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable t) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", t);
            }
        }
    }

    public static Method d(Class<?> activityThreadClass) {
        if (activityThreadClass == null) {
            return null;
        }
        try {
            Method performStop = activityThreadClass.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            performStop.setAccessible(true);
            return performStop;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Method c(Class<?> activityThreadClass) {
        if (activityThreadClass == null) {
            return null;
        }
        try {
            Method performStop = activityThreadClass.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            performStop.setAccessible(true);
            return performStop;
        } catch (Throwable th) {
            return null;
        }
    }

    public static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static Method e(Class<?> activityThreadClass) {
        if (!g() || activityThreadClass == null) {
            return null;
        }
        try {
            Method relaunch = activityThreadClass.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
            relaunch.setAccessible(true);
            return relaunch;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field mainThreadField = Activity.class.getDeclaredField("mMainThread");
            mainThreadField.setAccessible(true);
            return mainThreadField;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Field f() {
        try {
            Field tokenField = Activity.class.getDeclaredField("mToken");
            tokenField.setAccessible(true);
            return tokenField;
        } catch (Throwable th) {
            return null;
        }
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable th) {
            return null;
        }
    }
}
