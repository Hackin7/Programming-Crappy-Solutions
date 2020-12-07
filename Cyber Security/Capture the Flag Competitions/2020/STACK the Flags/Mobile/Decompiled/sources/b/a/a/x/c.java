package b.a.a.x;

import android.util.Log;
import b.a.a.i;
import java.util.HashSet;
import java.util.Set;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f2317a = new HashSet();

    public void a(String message) {
        b(message, null);
    }

    public void b(String message, Throwable exception) {
    }

    public void d(String message) {
        e(message, null);
    }

    public void e(String message, Throwable exception) {
        if (!f2317a.contains(message)) {
            Log.w("LOTTIE", message, exception);
            f2317a.add(message);
        }
    }

    public void c(String message, Throwable exception) {
    }
}
