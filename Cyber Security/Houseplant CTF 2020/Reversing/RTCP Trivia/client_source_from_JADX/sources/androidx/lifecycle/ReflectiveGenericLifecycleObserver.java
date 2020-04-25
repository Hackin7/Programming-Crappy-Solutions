package androidx.lifecycle;

import java.util.List;

public class ReflectiveGenericLifecycleObserver implements C0521im {

    /* renamed from: a */
    private final Object f703a;

    /* renamed from: b */
    private final C0517a f704b = C0516ij.f2199a.mo2117b(this.f703a.getClass());

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f703a = obj;
    }

    /* renamed from: a */
    public final void mo807a(C0526ip ipVar, C0523a aVar) {
        C0517a aVar2 = this.f704b;
        Object obj = this.f703a;
        C0517a.m1676a((List) aVar2.f2202a.get(aVar), ipVar, aVar, obj);
        C0517a.m1676a((List) aVar2.f2202a.get(C0523a.ON_ANY), ipVar, aVar, obj);
    }
}
