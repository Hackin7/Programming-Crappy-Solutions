package p000;

import java.util.concurrent.Executor;

/* renamed from: cz */
public class C0227cz extends C0234db {

    /* renamed from: b */
    private static volatile C0227cz f1134b;

    /* renamed from: d */
    private static final Executor f1135d = new Executor() {
        public final void execute(Runnable runnable) {
            C0227cz.m742a().mo1340b(runnable);
        }
    };

    /* renamed from: e */
    private static final Executor f1136e = new Executor() {
        public final void execute(Runnable runnable) {
            C0227cz.m742a().mo1339a(runnable);
        }
    };

    /* renamed from: a */
    public C0234db f1137a = this.f1138c;

    /* renamed from: c */
    private C0234db f1138c = new C0232da();

    private C0227cz() {
    }

    /* renamed from: a */
    public static C0227cz m742a() {
        if (f1134b != null) {
            return f1134b;
        }
        synchronized (C0227cz.class) {
            if (f1134b == null) {
                f1134b = new C0227cz();
            }
        }
        return f1134b;
    }

    /* renamed from: a */
    public final void mo1339a(Runnable runnable) {
        this.f1137a.mo1339a(runnable);
    }

    /* renamed from: b */
    public final void mo1340b(Runnable runnable) {
        this.f1137a.mo1340b(runnable);
    }

    /* renamed from: b */
    public final boolean mo1341b() {
        return this.f1137a.mo1341b();
    }
}
