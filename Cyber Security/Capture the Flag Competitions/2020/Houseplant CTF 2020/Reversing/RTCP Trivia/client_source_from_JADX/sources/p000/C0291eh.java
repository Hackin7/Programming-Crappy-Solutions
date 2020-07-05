package p000;

import java.util.ArrayList;

/* renamed from: eh */
public final class C0291eh {

    /* renamed from: a */
    int f1475a;

    /* renamed from: b */
    int f1476b;

    /* renamed from: c */
    int f1477c;

    /* renamed from: d */
    int f1478d;

    /* renamed from: e */
    ArrayList<C0292a> f1479e = new ArrayList<>();

    /* renamed from: eh$a */
    static class C0292a {

        /* renamed from: a */
        C0273dx f1480a;

        /* renamed from: b */
        C0273dx f1481b;

        /* renamed from: c */
        int f1482c;

        /* renamed from: d */
        int f1483d;

        /* renamed from: e */
        int f1484e;

        public C0292a(C0273dx dxVar) {
            this.f1480a = dxVar;
            this.f1481b = dxVar.f1329d;
            this.f1482c = dxVar.mo1551b();
            this.f1483d = dxVar.f1332g;
            this.f1484e = dxVar.f1333h;
        }
    }

    public C0291eh(C0278dy dyVar) {
        this.f1475a = dyVar.mo1578j();
        this.f1476b = dyVar.mo1579k();
        this.f1477c = dyVar.mo1580l();
        this.f1478d = dyVar.mo1581m();
        ArrayList u = dyVar.mo1590u();
        int size = u.size();
        for (int i = 0; i < size; i++) {
            this.f1479e.add(new C0292a((C0273dx) u.get(i)));
        }
    }

    /* renamed from: a */
    public final void mo1651a(C0278dy dyVar) {
        dyVar.mo1560b(this.f1475a);
        dyVar.mo1563c(this.f1476b);
        dyVar.mo1565d(this.f1477c);
        dyVar.mo1568e(this.f1478d);
        int size = this.f1479e.size();
        for (int i = 0; i < size; i++) {
            C0292a aVar = (C0292a) this.f1479e.get(i);
            dyVar.mo1555a(aVar.f1480a.f1328c).mo1550a(aVar.f1481b, aVar.f1482c, -1, aVar.f1483d, aVar.f1484e, false);
        }
    }
}
