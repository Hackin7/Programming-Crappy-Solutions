package e;

import javax.annotation.Nullable;

public final class i {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static h f2846a;

    /* renamed from: b  reason: collision with root package name */
    public static long f2847b;

    public static h b() {
        synchronized (i.class) {
            if (f2846a == null) {
                return new h();
            }
            h result = f2846a;
            f2846a = result.f2844f;
            result.f2844f = null;
            f2847b -= 8192;
            return result;
        }
    }

    public static void a(h segment) {
        if (segment.f2844f != null || segment.f2845g != null) {
            throw new IllegalArgumentException();
        } else if (!segment.f2842d) {
            synchronized (i.class) {
                if (f2847b + 8192 <= 65536) {
                    f2847b += 8192;
                    segment.f2844f = f2846a;
                    segment.f2841c = 0;
                    segment.f2840b = 0;
                    f2846a = segment;
                }
            }
        }
    }
}
