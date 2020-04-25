package p000;

/* renamed from: ku */
public abstract class C0632ku implements Runnable {

    /* renamed from: b */
    protected final String f2731b;

    public C0632ku(String str, Object... objArr) {
        this.f2731b = C0633kv.m1966a(str, objArr);
    }

    /* renamed from: b */
    public abstract void mo2374b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f2731b);
        try {
            mo2374b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
