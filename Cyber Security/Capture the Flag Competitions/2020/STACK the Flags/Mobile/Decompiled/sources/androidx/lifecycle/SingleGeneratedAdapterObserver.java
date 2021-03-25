package androidx.lifecycle;

import a.m.c;
import a.m.d;
import a.m.e;
import a.m.g;

public class SingleGeneratedAdapterObserver implements e {

    /* renamed from: a  reason: collision with root package name */
    public final c f1712a;

    public SingleGeneratedAdapterObserver(c generatedAdapter) {
        this.f1712a = generatedAdapter;
    }

    @Override // a.m.e
    public void d(g source, d.a event) {
        this.f1712a.a(source, event, false, null);
        this.f1712a.a(source, event, true, null);
    }
}
