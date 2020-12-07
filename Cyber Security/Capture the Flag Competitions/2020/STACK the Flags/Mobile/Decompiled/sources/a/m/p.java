package a.m;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f1196a = new HashMap();

    public void c() {
    }

    public final void a() {
        Map<String, Object> map = this.f1196a;
        if (map != null) {
            synchronized (map) {
                for (Object value : this.f1196a.values()) {
                    b(value);
                }
            }
        }
        c();
    }

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
