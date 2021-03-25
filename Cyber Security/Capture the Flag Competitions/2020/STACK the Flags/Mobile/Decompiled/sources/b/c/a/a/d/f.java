package b.c.a.a.d;

import b.c.a.a.f.b;
import b.c.a.a.g.a.g;

public class f extends c<g> {
    public f() {
    }

    public f(g dataSet) {
        super(dataSet);
    }

    public g q() {
        return (g) this.i.get(0);
    }

    /* renamed from: r */
    public g d(int index) {
        if (index == 0) {
            return q();
        }
        return null;
    }

    @Override // b.c.a.a.d.c
    public e h(b highlight) {
        return q().Q((int) highlight.e());
    }

    public float s() {
        float sum = 0.0f;
        for (int i = 0; i < q().E(); i++) {
            sum += ((h) q().Q(i)).c();
        }
        return sum;
    }
}
