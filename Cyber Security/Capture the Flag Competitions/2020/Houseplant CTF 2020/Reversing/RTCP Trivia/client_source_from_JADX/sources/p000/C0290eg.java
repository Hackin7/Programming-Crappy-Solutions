package p000;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: eg */
public class C0290eg {

    /* renamed from: h */
    HashSet<C0290eg> f1473h = new HashSet<>(2);

    /* renamed from: i */
    public int f1474i = 0;

    /* renamed from: a */
    public void mo1636a() {
    }

    /* renamed from: a */
    public final void mo1647a(C0290eg egVar) {
        this.f1473h.add(egVar);
    }

    /* renamed from: b */
    public void mo1641b() {
        this.f1474i = 0;
        this.f1473h.clear();
    }

    /* renamed from: c */
    public final void mo1648c() {
        this.f1474i = 0;
        Iterator it = this.f1473h.iterator();
        while (it.hasNext()) {
            ((C0290eg) it.next()).mo1648c();
        }
    }

    /* renamed from: d */
    public final void mo1649d() {
        this.f1474i = 1;
        Iterator it = this.f1473h.iterator();
        while (it.hasNext()) {
            ((C0290eg) it.next()).mo1636a();
        }
    }

    /* renamed from: e */
    public final boolean mo1650e() {
        return this.f1474i == 1;
    }
}
