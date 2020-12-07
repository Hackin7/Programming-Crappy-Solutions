package b.c.a.a.d;

import java.util.List;

public class g extends d<h> implements b.c.a.a.g.a.g {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;
    public float u = 0.0f;
    public float v = 18.0f;
    public a w;
    public a x;
    public boolean y;
    public int z;

    public enum a {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public g(List<h> list, String label) {
        super(list, label);
        a aVar = a.INSIDE_SLICE;
        this.w = aVar;
        this.x = aVar;
        this.y = false;
        this.z = -16777216;
        this.A = 1.0f;
        this.B = 75.0f;
        this.C = 0.3f;
        this.D = 0.4f;
        this.E = true;
    }

    /* renamed from: o0 */
    public void l0(h e2) {
        if (e2 != null) {
            m0(e2);
        }
    }

    @Override // b.c.a.a.g.a.g
    public float w() {
        return this.u;
    }

    @Override // b.c.a.a.g.a.g
    public boolean G() {
        return false;
    }

    @Override // b.c.a.a.g.a.g
    public float j() {
        return this.v;
    }

    @Override // b.c.a.a.g.a.g
    public a e() {
        return this.w;
    }

    @Override // b.c.a.a.g.a.g
    public a O() {
        return this.x;
    }

    @Override // b.c.a.a.g.a.g
    public boolean d() {
        return this.y;
    }

    @Override // b.c.a.a.g.a.g
    public int Z() {
        return this.z;
    }

    @Override // b.c.a.a.g.a.g
    public float a() {
        return this.A;
    }

    @Override // b.c.a.a.g.a.g
    public float p() {
        return this.B;
    }

    @Override // b.c.a.a.g.a.g
    public float b() {
        return this.C;
    }

    @Override // b.c.a.a.g.a.g
    public float c0() {
        return this.D;
    }

    @Override // b.c.a.a.g.a.g
    public boolean S() {
        return this.E;
    }
}
