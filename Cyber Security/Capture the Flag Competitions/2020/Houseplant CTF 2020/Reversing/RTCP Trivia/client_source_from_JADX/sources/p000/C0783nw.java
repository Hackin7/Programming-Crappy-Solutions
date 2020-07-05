package p000;

/* renamed from: nw */
public final class C0783nw {

    /* renamed from: a */
    private static C0629kr f3311a;

    /* renamed from: b */
    private static C0782nv f3312b;

    /* renamed from: a */
    public static synchronized C0629kr m2599a() {
        C0629kr krVar;
        synchronized (C0783nw.class) {
            krVar = f3311a;
        }
        return krVar;
    }

    /* renamed from: a */
    public static synchronized void m2600a(C0629kr krVar) {
        synchronized (C0783nw.class) {
            f3311a = krVar;
        }
    }

    /* renamed from: a */
    public static synchronized void m2601a(C0782nv nvVar) {
        synchronized (C0783nw.class) {
            f3312b = nvVar;
        }
    }

    /* renamed from: b */
    public static synchronized C0782nv m2602b() {
        C0782nv nvVar;
        synchronized (C0783nw.class) {
            nvVar = f3312b;
        }
        return nvVar;
    }
}
