package b.a.a.u.j;

import b.a.a.y.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<V>> f2115a;

    public n(V value) {
        this(Collections.singletonList(new a(value)));
    }

    public n(List<a<V>> list) {
        this.f2115a = list;
    }

    @Override // b.a.a.u.j.m
    public List<a<V>> b() {
        return this.f2115a;
    }

    @Override // b.a.a.u.j.m
    public boolean c() {
        return this.f2115a.isEmpty() || (this.f2115a.size() == 1 && this.f2115a.get(0).h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f2115a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f2115a.toArray()));
        }
        return sb.toString();
    }
}
