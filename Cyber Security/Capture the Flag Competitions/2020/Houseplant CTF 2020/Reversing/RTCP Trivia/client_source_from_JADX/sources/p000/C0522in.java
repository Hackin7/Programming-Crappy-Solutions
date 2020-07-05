package p000;

/* renamed from: in */
public abstract class C0522in {

    /* renamed from: in$a */
    public enum C0523a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: in$b */
    public enum C0524b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public final boolean mo2123a(C0524b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract C0524b mo2120a();

    /* renamed from: a */
    public abstract void mo2121a(C0525io ioVar);

    /* renamed from: b */
    public abstract void mo2122b(C0525io ioVar);
}
