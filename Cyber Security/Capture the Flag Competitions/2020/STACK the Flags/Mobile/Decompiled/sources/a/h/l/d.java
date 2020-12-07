package a.h.l;

import androidx.core.util.Pair;

public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f902a;

    /* renamed from: b  reason: collision with root package name */
    public final S f903b;

    public d(F first, S second) {
        this.f902a = first;
        this.f903b = second;
    }

    public boolean equals(Object o) {
        if (!(o instanceof d)) {
            return false;
        }
        Pair<?, ?> p = (d) o;
        if (!c.a(p.f902a, this.f902a) || !c.a(p.f903b, this.f903b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f2 = this.f902a;
        int i = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f903b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f902a) + " " + String.valueOf(this.f903b) + "}";
    }
}
