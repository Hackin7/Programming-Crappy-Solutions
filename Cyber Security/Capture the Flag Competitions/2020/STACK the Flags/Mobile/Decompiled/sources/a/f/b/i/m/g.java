package a.f.b.i.m;

import a.f.b.i.m.f;

public class g extends f {
    public int m;

    public g(p run) {
        super(run);
        if (run instanceof l) {
            this.f655e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f655e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // a.f.b.i.m.f
    public void d(int value) {
        if (!this.j) {
            this.j = true;
            this.f657g = value;
            for (d node : this.k) {
                node.a(node);
            }
        }
    }
}
