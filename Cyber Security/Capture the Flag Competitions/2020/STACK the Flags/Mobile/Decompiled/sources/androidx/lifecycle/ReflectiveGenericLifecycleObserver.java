package androidx.lifecycle;

import a.m.a;
import a.m.d;
import a.m.e;
import a.m.g;

public class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1710a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0031a f1711b;

    public ReflectiveGenericLifecycleObserver(Object wrapped) {
        this.f1710a = wrapped;
        this.f1711b = a.f1171c.c(wrapped.getClass());
    }

    @Override // a.m.e
    public void d(g source, d.a event) {
        this.f1711b.a(source, event, this.f1710a);
    }
}
