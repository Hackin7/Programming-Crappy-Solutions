package a.f.b.i;

import a.f.b.c;
import java.util.ArrayList;

public class l extends e {
    public ArrayList<e> q0 = new ArrayList<>();

    @Override // a.f.b.i.e
    public void f0() {
        this.q0.clear();
        super.f0();
    }

    public void Y0(e widget) {
        this.q0.add(widget);
        if (widget.G() != null) {
            ((l) widget.G()).b1(widget);
        }
        widget.K0(this);
    }

    public void b1(e widget) {
        this.q0.remove(widget);
        widget.K0(null);
    }

    public ArrayList<e> Z0() {
        return this.q0;
    }

    public void a1() {
        ArrayList<e> arrayList = this.q0;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                e widget = this.q0.get(i);
                if (widget instanceof l) {
                    ((l) widget).a1();
                }
            }
        }
    }

    @Override // a.f.b.i.e
    public void h0(c cache) {
        super.h0(cache);
        int count = this.q0.size();
        for (int i = 0; i < count; i++) {
            this.q0.get(i).h0(cache);
        }
    }

    public void c1() {
        this.q0.clear();
    }
}
