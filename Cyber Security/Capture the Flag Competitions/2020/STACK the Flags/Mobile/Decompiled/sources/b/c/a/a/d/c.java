package b.c.a.a.d;

import b.c.a.a.c.i;
import b.c.a.a.f.b;
import b.c.a.a.g.a.d;
import java.util.ArrayList;
import java.util.List;

public abstract class c<T extends d<? extends e>> {

    /* renamed from: a  reason: collision with root package name */
    public float f2447a;

    /* renamed from: b  reason: collision with root package name */
    public float f2448b;

    /* renamed from: c  reason: collision with root package name */
    public float f2449c;

    /* renamed from: d  reason: collision with root package name */
    public float f2450d;

    /* renamed from: e  reason: collision with root package name */
    public float f2451e;

    /* renamed from: f  reason: collision with root package name */
    public float f2452f;

    /* renamed from: g  reason: collision with root package name */
    public float f2453g;
    public float h;
    public List<T> i;

    public abstract e h(b bVar);

    public c() {
        this.f2447a = -3.4028235E38f;
        this.f2448b = Float.MAX_VALUE;
        this.f2449c = -3.4028235E38f;
        this.f2450d = Float.MAX_VALUE;
        this.f2451e = -3.4028235E38f;
        this.f2452f = Float.MAX_VALUE;
        this.f2453g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        this.i = new ArrayList();
    }

    public c(T... dataSets) {
        this.f2447a = -3.4028235E38f;
        this.f2448b = Float.MAX_VALUE;
        this.f2449c = -3.4028235E38f;
        this.f2450d = Float.MAX_VALUE;
        this.f2451e = -3.4028235E38f;
        this.f2452f = Float.MAX_VALUE;
        this.f2453g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        this.i = a(dataSets);
        p();
    }

    public final List<T> a(T[] array) {
        List<T> list = new ArrayList<>();
        for (T set : array) {
            list.add(set);
        }
        return list;
    }

    public void p() {
        b();
    }

    public void b() {
        List<T> list = this.i;
        if (list != null) {
            this.f2447a = -3.4028235E38f;
            this.f2448b = Float.MAX_VALUE;
            this.f2449c = -3.4028235E38f;
            this.f2450d = Float.MAX_VALUE;
            for (T set : list) {
                c(set);
            }
            this.f2451e = -3.4028235E38f;
            this.f2452f = Float.MAX_VALUE;
            this.f2453g = -3.4028235E38f;
            this.h = Float.MAX_VALUE;
            T firstLeft = i(this.i);
            if (firstLeft != null) {
                this.f2451e = firstLeft.M();
                this.f2452f = firstLeft.n();
                for (T dataSet : this.i) {
                    if (dataSet.A() == i.a.LEFT) {
                        if (dataSet.n() < this.f2452f) {
                            this.f2452f = dataSet.n();
                        }
                        if (dataSet.M() > this.f2451e) {
                            this.f2451e = dataSet.M();
                        }
                    }
                }
            }
            T firstRight = j(this.i);
            if (firstRight != null) {
                this.f2453g = firstRight.M();
                this.h = firstRight.n();
                for (T dataSet2 : this.i) {
                    if (dataSet2.A() == i.a.RIGHT) {
                        if (dataSet2.n() < this.h) {
                            this.h = dataSet2.n();
                        }
                        if (dataSet2.M() > this.f2453g) {
                            this.f2453g = dataSet2.M();
                        }
                    }
                }
            }
        }
    }

    public int e() {
        List<T> list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public float n() {
        return this.f2448b;
    }

    public float o(i.a axis) {
        if (axis == i.a.LEFT) {
            float f2 = this.f2452f;
            if (f2 == Float.MAX_VALUE) {
                return this.h;
            }
            return f2;
        }
        float f3 = this.h;
        if (f3 == Float.MAX_VALUE) {
            return this.f2452f;
        }
        return f3;
    }

    public float l() {
        return this.f2447a;
    }

    public float m(i.a axis) {
        if (axis == i.a.LEFT) {
            float f2 = this.f2451e;
            if (f2 == -3.4028235E38f) {
                return this.f2453g;
            }
            return f2;
        }
        float f3 = this.f2453g;
        if (f3 == -3.4028235E38f) {
            return this.f2451e;
        }
        return f3;
    }

    public List<T> f() {
        return this.i;
    }

    public T d(int index) {
        List<T> list = this.i;
        if (list == null || index < 0 || index >= list.size()) {
            return null;
        }
        return this.i.get(index);
    }

    public void c(T d2) {
        if (this.f2447a < d2.M()) {
            this.f2447a = d2.M();
        }
        if (this.f2448b > d2.n()) {
            this.f2448b = d2.n();
        }
        if (this.f2449c < d2.k()) {
            this.f2449c = d2.k();
        }
        if (this.f2450d > d2.H()) {
            this.f2450d = d2.H();
        }
        if (d2.A() == i.a.LEFT) {
            if (this.f2451e < d2.M()) {
                this.f2451e = d2.M();
            }
            if (this.f2452f > d2.n()) {
                this.f2452f = d2.n();
                return;
            }
            return;
        }
        if (this.f2453g < d2.M()) {
            this.f2453g = d2.M();
        }
        if (this.h > d2.n()) {
            this.h = d2.n();
        }
    }

    public T i(List<T> sets) {
        for (T dataSet : sets) {
            if (dataSet.A() == i.a.LEFT) {
                return dataSet;
            }
        }
        return null;
    }

    public T j(List<T> sets) {
        for (T dataSet : sets) {
            if (dataSet.A() == i.a.RIGHT) {
                return dataSet;
            }
        }
        return null;
    }

    public int g() {
        int count = 0;
        for (T set : this.i) {
            count += set.E();
        }
        return count;
    }

    public T k() {
        List<T> list = this.i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T max = this.i.get(0);
        for (T set : this.i) {
            if (set.E() > max.E()) {
                max = set;
            }
        }
        return max;
    }
}
