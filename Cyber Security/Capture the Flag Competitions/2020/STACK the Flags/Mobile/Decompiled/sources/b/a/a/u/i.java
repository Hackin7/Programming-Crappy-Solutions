package b.a.a.u;

import a.h.l.d;
import androidx.core.util.Pair;

public class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f2099a;

    /* renamed from: b  reason: collision with root package name */
    public T f2100b;

    public void b(T first, T second) {
        this.f2099a = first;
        this.f2100b = second;
    }

    public boolean equals(Object o) {
        if (!(o instanceof d)) {
            return false;
        }
        Pair<?, ?> p = (d) o;
        if (!a(p.f902a, this.f2099a) || !a(p.f903b, this.f2100b)) {
            return false;
        }
        return true;
    }

    public static boolean a(Object a2, Object b2) {
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    public int hashCode() {
        T t = this.f2099a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f2100b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f2099a) + " " + String.valueOf(this.f2100b) + "}";
    }
}
