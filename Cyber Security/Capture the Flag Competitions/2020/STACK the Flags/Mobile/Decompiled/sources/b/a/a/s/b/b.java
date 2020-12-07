package b.a.a.s.b;

import android.graphics.Path;
import b.a.a.x.h;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public List<s> f1965a = new ArrayList();

    public void a(s trimPath) {
        this.f1965a.add(trimPath);
    }

    public void b(Path path) {
        for (int i = this.f1965a.size() - 1; i >= 0; i--) {
            h.b(path, this.f1965a.get(i));
        }
    }
}
