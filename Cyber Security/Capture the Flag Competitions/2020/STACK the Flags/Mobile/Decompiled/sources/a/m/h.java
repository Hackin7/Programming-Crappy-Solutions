package a.m;

import a.c.a.b.b;
import a.m.d;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class h extends d {

    /* renamed from: a  reason: collision with root package name */
    public a.c.a.b.a<f, a> f1184a = new a.c.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    public d.b f1185b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<g> f1186c;

    /* renamed from: d  reason: collision with root package name */
    public int f1187d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1188e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1189f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<d.b> f1190g = new ArrayList<>();

    public h(g provider) {
        this.f1186c = new WeakReference<>(provider);
        this.f1185b = d.b.INITIALIZED;
    }

    @Deprecated
    public void k(d.b state) {
        p(state);
    }

    public void p(d.b state) {
        m(state);
    }

    public void i(d.a event) {
        m(h(event));
    }

    public final void m(d.b next) {
        if (this.f1185b != next) {
            this.f1185b = next;
            if (this.f1188e || this.f1187d != 0) {
                this.f1189f = true;
                return;
            }
            this.f1188e = true;
            q();
            this.f1188e = false;
        }
    }

    public final boolean j() {
        if (this.f1184a.size() == 0) {
            return true;
        }
        d.b eldestObserverState = ((a) ((b.c) this.f1184a.b()).getValue()).f1191a;
        d.b newestObserverState = ((a) ((b.c) this.f1184a.e()).getValue()).f1191a;
        if (eldestObserverState == newestObserverState && this.f1185b == newestObserverState) {
            return true;
        }
        return false;
    }

    public final d.b e(f observer) {
        Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> previous = this.f1184a.h(observer);
        d.b parentState = null;
        d.b siblingState = previous != null ? ((a) previous.getValue()).f1191a : null;
        if (!this.f1190g.isEmpty()) {
            ArrayList<d.b> arrayList = this.f1190g;
            parentState = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.f1185b, siblingState), parentState);
    }

    @Override // a.m.d
    public void a(f observer) {
        g lifecycleOwner;
        d.b bVar = this.f1185b;
        d.b initialState = d.b.DESTROYED;
        if (bVar != initialState) {
            initialState = d.b.INITIALIZED;
        }
        a statefulObserver = new a(observer, initialState);
        if (this.f1184a.i(observer, statefulObserver) == null && (lifecycleOwner = this.f1186c.get()) != null) {
            boolean isReentrance = this.f1187d != 0 || this.f1188e;
            d.b targetState = e(observer);
            this.f1187d++;
            while (statefulObserver.f1191a.compareTo((Enum) targetState) < 0 && this.f1184a.contains(observer)) {
                o(statefulObserver.f1191a);
                statefulObserver.a(lifecycleOwner, r(statefulObserver.f1191a));
                n();
                targetState = e(observer);
            }
            if (!isReentrance) {
                q();
            }
            this.f1187d--;
        }
    }

    public final void n() {
        ArrayList<d.b> arrayList = this.f1190g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void o(d.b state) {
        this.f1190g.add(state);
    }

    @Override // a.m.d
    public void c(f observer) {
        this.f1184a.g(observer);
    }

    @Override // a.m.d
    public d.b b() {
        return this.f1185b;
    }

    public static d.b h(d.a event) {
        int ordinal = event.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return d.b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return d.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + event);
                    }
                }
            }
            return d.b.STARTED;
        }
        return d.b.CREATED;
    }

    public static d.a f(d.b state) {
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException();
        } else if (ordinal == 1) {
            throw new IllegalArgumentException();
        } else if (ordinal == 2) {
            return d.a.ON_DESTROY;
        } else {
            if (ordinal == 3) {
                return d.a.ON_STOP;
            }
            if (ordinal == 4) {
                return d.a.ON_PAUSE;
            }
            throw new IllegalArgumentException("Unexpected state value " + state);
        }
    }

    public static d.a r(d.b state) {
        int ordinal = state.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return d.a.ON_CREATE;
        }
        if (ordinal == 2) {
            return d.a.ON_START;
        }
        if (ordinal == 3) {
            return d.a.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + state);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: a.c.a.b.a<a.m.f, a.m.h$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g(g lifecycleOwner) {
        b<K, V>.d d2 = this.f1184a.d();
        while (d2.hasNext() && !this.f1189f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = (Map.Entry) d2.next();
            a observer = (a) entry.getValue();
            while (observer.f1191a.compareTo((Enum) this.f1185b) < 0 && !this.f1189f && this.f1184a.contains(entry.getKey())) {
                o(observer.f1191a);
                observer.a(lifecycleOwner, r(observer.f1191a));
                n();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: a.c.a.b.a<a.m.f, a.m.h$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(g lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> descendingIterator = this.f1184a.a();
        while (((b.e) descendingIterator).hasNext() && !this.f1189f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = (Map.Entry) ((b.e) descendingIterator).next();
            a observer = (a) entry.getValue();
            while (observer.f1191a.compareTo((Enum) this.f1185b) > 0 && !this.f1189f && this.f1184a.contains(entry.getKey())) {
                d.a event = f(observer.f1191a);
                o(h(event));
                observer.a(lifecycleOwner, event);
                n();
            }
        }
    }

    public final void q() {
        g lifecycleOwner = this.f1186c.get();
        if (lifecycleOwner != null) {
            while (!j()) {
                this.f1189f = false;
                if (this.f1185b.compareTo((Enum) ((a) ((b.c) this.f1184a.b()).getValue()).f1191a) < 0) {
                    d(lifecycleOwner);
                }
                Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> newest = this.f1184a.e();
                if (!this.f1189f && newest != null && this.f1185b.compareTo((Enum) ((a) ((b.c) newest).getValue()).f1191a) > 0) {
                    g(lifecycleOwner);
                }
            }
            this.f1189f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public static d.b l(d.b state1, d.b state2) {
        return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public d.b f1191a;

        /* renamed from: b  reason: collision with root package name */
        public e f1192b;

        public a(f observer, d.b initialState) {
            this.f1192b = j.f(observer);
            this.f1191a = initialState;
        }

        public void a(g owner, d.a event) {
            d.b newState = h.h(event);
            this.f1191a = h.l(this.f1191a, newState);
            this.f1192b.d(owner, event);
            this.f1191a = newState;
        }
    }
}
