package androidx.lifecycle;

import a.m.b;
import a.m.d;
import a.m.e;
import a.m.g;

public class FullLifecycleObserverAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    public final b f1694a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1695b;

    public FullLifecycleObserverAdapter(b fullLifecycleObserver, e lifecycleEventObserver) {
        this.f1694a = fullLifecycleObserver;
        this.f1695b = lifecycleEventObserver;
    }

    @Override // a.m.e
    public void d(g source, d.a event) {
        switch (event.ordinal()) {
            case 0:
                this.f1694a.c(source);
                break;
            case 1:
                this.f1694a.g(source);
                break;
            case 2:
                this.f1694a.a(source);
                break;
            case 3:
                this.f1694a.e(source);
                break;
            case 4:
                this.f1694a.f(source);
                break;
            case 5:
                this.f1694a.b(source);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.f1695b;
        if (eVar != null) {
            eVar.d(source, event);
        }
    }
}
