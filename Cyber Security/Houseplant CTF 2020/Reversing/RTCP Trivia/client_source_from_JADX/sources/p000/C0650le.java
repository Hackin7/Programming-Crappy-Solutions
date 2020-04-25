package p000;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: le */
public final class C0650le {

    /* renamed from: a */
    private final Set<C0627kp> f2820a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo2434a(C0627kp kpVar) {
        this.f2820a.add(kpVar);
    }

    /* renamed from: b */
    public final synchronized void mo2435b(C0627kp kpVar) {
        this.f2820a.remove(kpVar);
    }

    /* renamed from: c */
    public final synchronized boolean mo2436c(C0627kp kpVar) {
        return this.f2820a.contains(kpVar);
    }
}
