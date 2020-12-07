package androidx.lifecycle;

import a.m.d;
import a.m.g;
import a.m.m;
import java.util.Map;

public abstract class LiveData<T> {
    public static final Object i = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1696a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public a.c.a.b.b<m<? super T>, LiveData<T>.b> f1697b = new a.c.a.b.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f1698c = 0;

    /* renamed from: d  reason: collision with root package name */
    public volatile Object f1699d = i;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1700e = i;

    /* renamed from: f  reason: collision with root package name */
    public int f1701f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1702g;
    public boolean h;

    public LiveData() {
        new a();
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Throwable th;
            synchronized (LiveData.this.f1696a) {
                try {
                    Object newValue = LiveData.this.f1700e;
                    try {
                        LiveData.this.f1700e = LiveData.i;
                        LiveData.this.g(newValue);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
    }

    public final void b(LiveData<T>.b bVar) {
        if (bVar.f1707b) {
            if (!bVar.j()) {
                bVar.h(false);
                return;
            }
            int i2 = bVar.f1708c;
            int i3 = this.f1701f;
            if (i2 < i3) {
                bVar.f1708c = i3;
                bVar.f1706a.a((Object) this.f1699d);
            }
        }
    }

    public void c(LiveData<T>.b bVar) {
        if (this.f1702g) {
            this.h = true;
            return;
        }
        this.f1702g = true;
        do {
            this.h = false;
            if (bVar == null) {
                a.c.a.b.b<K, V>.d d2 = this.f1697b.d();
                while (d2.hasNext()) {
                    b((b) ((Map.Entry) d2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.h);
        this.f1702g = false;
    }

    public void f(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.ObserverWrapper removed = (b) this.f1697b.g(mVar);
        if (removed != null) {
            removed.i();
            removed.h(false);
        }
    }

    public void g(T value) {
        a("setValue");
        this.f1701f++;
        this.f1699d = value;
        c(null);
    }

    public void d() {
    }

    public void e() {
    }

    public class LifecycleBoundObserver extends LiveData<T>.b implements Object {

        /* renamed from: e  reason: collision with root package name */
        public final g f1703e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ LiveData f1704f;

        @Override // androidx.lifecycle.LiveData.b
        public boolean j() {
            return this.f1703e.getLifecycle().b().a(d.b.STARTED);
        }

        public void d(g source, d.a event) {
            if (this.f1703e.getLifecycle().b() == d.b.DESTROYED) {
                this.f1704f.f(this.f1706a);
            } else {
                h(j());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        public void i() {
            this.f1703e.getLifecycle().c(this);
        }
    }

    public abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final m<? super T> f1706a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1707b;

        /* renamed from: c  reason: collision with root package name */
        public int f1708c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f1709d;

        public abstract boolean j();

        public void i() {
        }

        public void h(boolean newActive) {
            if (newActive != this.f1707b) {
                this.f1707b = newActive;
                int i = 1;
                boolean wasInactive = this.f1709d.f1698c == 0;
                LiveData liveData = this.f1709d;
                int i2 = liveData.f1698c;
                if (!this.f1707b) {
                    i = -1;
                }
                liveData.f1698c = i2 + i;
                if (wasInactive && this.f1707b) {
                    this.f1709d.d();
                }
                LiveData liveData2 = this.f1709d;
                if (liveData2.f1698c == 0 && !this.f1707b) {
                    liveData2.e();
                }
                if (this.f1707b) {
                    this.f1709d.c(this);
                }
            }
        }
    }

    public static void a(String methodName) {
        if (!a.c.a.a.a.d().b()) {
            throw new IllegalStateException("Cannot invoke " + methodName + " on a background" + " thread");
        }
    }
}
