package p000;

import javax.annotation.Nullable;

/* renamed from: np */
final class C0775np {
    @Nullable

    /* renamed from: a */
    static C0774no f3301a;

    /* renamed from: b */
    static long f3302b;

    private C0775np() {
    }

    /* renamed from: a */
    static C0774no m2562a() {
        synchronized (C0775np.class) {
            if (f3301a == null) {
                return new C0774no();
            }
            C0774no noVar = f3301a;
            f3301a = noVar.f3299f;
            noVar.f3299f = null;
            f3302b -= 8192;
            return noVar;
        }
    }

    /* renamed from: a */
    static void m2563a(C0774no noVar) {
        if (noVar.f3299f != null || noVar.f3300g != null) {
            throw new IllegalArgumentException();
        } else if (!noVar.f3297d) {
            synchronized (C0775np.class) {
                if (f3302b + 8192 <= 65536) {
                    f3302b += 8192;
                    noVar.f3299f = f3301a;
                    noVar.f3296c = 0;
                    noVar.f3295b = 0;
                    f3301a = noVar;
                }
            }
        }
    }
}
