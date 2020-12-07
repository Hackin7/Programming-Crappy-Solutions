package a.a;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f0a;

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<a> f1b = new CopyOnWriteArrayList<>();

    public abstract void b();

    public b(boolean enabled) {
        this.f0a = enabled;
    }

    public final void f(boolean enabled) {
        this.f0a = enabled;
    }

    public final boolean c() {
        return this.f0a;
    }

    public final void d() {
        Iterator<a> it = this.f1b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void a(a cancellable) {
        this.f1b.add(cancellable);
    }

    public void e(a cancellable) {
        this.f1b.remove(cancellable);
    }
}
