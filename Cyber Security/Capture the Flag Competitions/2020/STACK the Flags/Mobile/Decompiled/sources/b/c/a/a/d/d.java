package b.c.a.a.d;

import b.c.a.a.d.e;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

public abstract class d<T extends e> extends a<T> {
    public List<T> p = null;
    public float q = -3.4028235E38f;
    public float r = Float.MAX_VALUE;
    public float s = -3.4028235E38f;
    public float t = Float.MAX_VALUE;

    public abstract void l0(T t2);

    public d(List<T> values, String label) {
        super(label);
        this.p = values;
        if (values == null) {
            this.p = new ArrayList();
        }
        k0();
    }

    public void k0() {
        List<T> list = this.p;
        if (!(list == null || list.isEmpty())) {
            this.q = -3.4028235E38f;
            this.r = Float.MAX_VALUE;
            this.s = -3.4028235E38f;
            this.t = Float.MAX_VALUE;
            for (T e2 : this.p) {
                l0(e2);
            }
        }
    }

    public void m0(T e2) {
        if (e2.c() < this.r) {
            this.r = e2.c();
        }
        if (e2.c() > this.q) {
            this.q = e2.c();
        }
    }

    @Override // b.c.a.a.g.a.d
    public int E() {
        return this.p.size();
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(n0());
        for (int i = 0; i < this.p.size(); i++) {
            buffer.append(this.p.get(i).toString() + " ");
        }
        return buffer.toString();
    }

    public String n0() {
        StringBuffer buffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("DataSet, label: ");
        sb.append(i() == null ? BuildConfig.FLAVOR : i());
        sb.append(", entries: ");
        sb.append(this.p.size());
        sb.append("\n");
        buffer.append(sb.toString());
        return buffer.toString();
    }

    @Override // b.c.a.a.g.a.d
    public float n() {
        return this.r;
    }

    @Override // b.c.a.a.g.a.d
    public float M() {
        return this.q;
    }

    @Override // b.c.a.a.g.a.d
    public float H() {
        return this.t;
    }

    @Override // b.c.a.a.g.a.d
    public float k() {
        return this.s;
    }

    @Override // b.c.a.a.g.a.d
    public int R(e e2) {
        return this.p.indexOf(e2);
    }

    @Override // b.c.a.a.g.a.d
    public T Q(int index) {
        return this.p.get(index);
    }
}
