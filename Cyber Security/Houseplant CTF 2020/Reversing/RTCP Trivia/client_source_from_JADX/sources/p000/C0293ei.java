package p000;

import java.util.ArrayList;

/* renamed from: ei */
public class C0293ei extends C0278dy {

    /* renamed from: ax */
    protected ArrayList<C0278dy> f1485ax = new ArrayList<>();

    /* renamed from: A */
    public void mo1596A() {
        mo1591v();
        if (this.f1485ax != null) {
            int size = this.f1485ax.size();
            for (int i = 0; i < size; i++) {
                C0278dy dyVar = (C0278dy) this.f1485ax.get(i);
                if (dyVar instanceof C0293ei) {
                    ((C0293ei) dyVar).mo1596A();
                }
            }
        }
    }

    /* renamed from: D */
    public final C0281dz mo1652D() {
        C0278dy dyVar = this.f1361G;
        C0281dz dzVar = this instanceof C0281dz ? (C0281dz) this : null;
        while (dyVar != null) {
            C0278dy dyVar2 = dyVar.f1361G;
            if (dyVar instanceof C0281dz) {
                dzVar = (C0281dz) dyVar;
            }
            dyVar = dyVar2;
        }
        return dzVar;
    }

    /* renamed from: E */
    public final void mo1653E() {
        this.f1485ax.clear();
    }

    /* renamed from: a */
    public final void mo1557a(C0260do doVar) {
        super.mo1557a(doVar);
        int size = this.f1485ax.size();
        for (int i = 0; i < size; i++) {
            ((C0278dy) this.f1485ax.get(i)).mo1557a(doVar);
        }
    }

    /* renamed from: a */
    public final void mo1654a(C0278dy dyVar) {
        this.f1485ax.add(dyVar);
        if (dyVar.f1361G != null) {
            ((C0293ei) dyVar.f1361G).mo1655b(dyVar);
        }
        dyVar.f1361G = this;
    }

    /* renamed from: b */
    public final void mo1561b(int i, int i2) {
        super.mo1561b(i, i2);
        int size = this.f1485ax.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0278dy) this.f1485ax.get(i3)).mo1561b(mo1584p(), mo1585q());
        }
    }

    /* renamed from: b */
    public final void mo1655b(C0278dy dyVar) {
        this.f1485ax.remove(dyVar);
        dyVar.f1361G = null;
    }

    /* renamed from: f */
    public void mo1570f() {
        this.f1485ax.clear();
        super.mo1570f();
    }

    /* renamed from: v */
    public final void mo1591v() {
        super.mo1591v();
        if (this.f1485ax != null) {
            int size = this.f1485ax.size();
            for (int i = 0; i < size; i++) {
                C0278dy dyVar = (C0278dy) this.f1485ax.get(i);
                dyVar.mo1561b(mo1582n(), mo1583o());
                if (!(dyVar instanceof C0281dz)) {
                    dyVar.mo1591v();
                }
            }
        }
    }
}
