package b.a.a.u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f2091a;

    /* renamed from: b  reason: collision with root package name */
    public f f2092b;

    public e(String... keys) {
        this.f2091a = Arrays.asList(keys);
    }

    public e(e keyPath) {
        this.f2091a = new ArrayList(keyPath.f2091a);
        this.f2092b = keyPath.f2092b;
    }

    public e a(String key) {
        e newKeyPath = new e(this);
        newKeyPath.f2091a.add(key);
        return newKeyPath;
    }

    public e i(f element) {
        e keyPath = new e(this);
        keyPath.f2092b = element;
        return keyPath;
    }

    public f d() {
        return this.f2092b;
    }

    public boolean g(String key, int depth) {
        if (f(key)) {
            return true;
        }
        if (depth >= this.f2091a.size()) {
            return false;
        }
        if (this.f2091a.get(depth).equals(key) || this.f2091a.get(depth).equals("**") || this.f2091a.get(depth).equals("*")) {
            return true;
        }
        return false;
    }

    public int e(String key, int depth) {
        if (f(key)) {
            return 0;
        }
        if (!this.f2091a.get(depth).equals("**")) {
            return 1;
        }
        if (depth != this.f2091a.size() - 1 && this.f2091a.get(depth + 1).equals(key)) {
            return 2;
        }
        return 0;
    }

    public boolean c(String key, int depth) {
        if (depth >= this.f2091a.size()) {
            return false;
        }
        boolean isLastDepth = depth == this.f2091a.size() - 1;
        String keyAtDepth = this.f2091a.get(depth);
        if (!keyAtDepth.equals("**")) {
            boolean matches = keyAtDepth.equals(key) || keyAtDepth.equals("*");
            if ((isLastDepth || (depth == this.f2091a.size() - 2 && b())) && matches) {
                return true;
            }
            return false;
        }
        if (!isLastDepth && this.f2091a.get(depth + 1).equals(key)) {
            if (depth == this.f2091a.size() - 2 || (depth == this.f2091a.size() - 3 && b())) {
                return true;
            }
            return false;
        } else if (isLastDepth) {
            return true;
        } else {
            if (depth + 1 < this.f2091a.size() - 1) {
                return false;
            }
            return this.f2091a.get(depth + 1).equals(key);
        }
    }

    public boolean h(String key, int depth) {
        if (!"__container".equals(key) && depth >= this.f2091a.size() - 1 && !this.f2091a.get(depth).equals("**")) {
            return false;
        }
        return true;
    }

    public final boolean f(String key) {
        return "__container".equals(key);
    }

    public final boolean b() {
        List<String> list = this.f2091a;
        return list.get(list.size() - 1).equals("**");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f2091a);
        sb.append(",resolved=");
        sb.append(this.f2092b != null);
        sb.append('}');
        return sb.toString();
    }
}
