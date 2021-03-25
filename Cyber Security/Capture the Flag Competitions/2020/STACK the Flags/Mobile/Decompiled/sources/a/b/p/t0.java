package a.b.p;

import android.content.Context;
import android.content.ContextWrapper;

public class t0 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f419a = new Object();

    public static Context b(Context context) {
        a(context);
        return context;
    }

    public static boolean a(Context context) {
        if ((context instanceof t0) || (context.getResources() instanceof v0) || (context.getResources() instanceof c1)) {
            return false;
        }
        c1.b();
        return false;
    }
}
