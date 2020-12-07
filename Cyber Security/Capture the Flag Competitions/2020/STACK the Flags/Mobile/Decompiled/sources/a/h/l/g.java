package a.h.l;

public class g<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f906c = new Object();

    public g(int maxPoolSize) {
        super(maxPoolSize);
    }

    @Override // a.h.l.f, a.h.l.e
    public T b() {
        T t;
        synchronized (this.f906c) {
            t = (T) super.b();
        }
        return t;
    }

    @Override // a.h.l.f, a.h.l.e
    public boolean a(T element) {
        boolean a2;
        synchronized (this.f906c) {
            a2 = super.a(element);
        }
        return a2;
    }
}
