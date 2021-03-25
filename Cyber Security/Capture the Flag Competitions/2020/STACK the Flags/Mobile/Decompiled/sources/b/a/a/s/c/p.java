package b.a.a.s.c;

import b.a.a.y.a;
import b.a.a.y.b;
import b.a.a.y.c;
import java.util.Collections;

public class p<K, A> extends a<K, A> {
    public final A i;

    public p(c<A> cVar) {
        this(cVar, null);
    }

    public p(c<A> cVar, A valueCallbackValue) {
        super(Collections.emptyList());
        new b();
        m(cVar);
        this.i = valueCallbackValue;
    }

    @Override // b.a.a.s.c.a
    public void l(float progress) {
        this.f2038d = progress;
    }

    @Override // b.a.a.s.c.a
    public float c() {
        return 1.0f;
    }

    @Override // b.a.a.s.c.a
    public void j() {
        if (this.f2039e != null) {
            super.j();
        }
    }

    @Override // b.a.a.s.c.a
    public A h() {
        c<A> cVar = this.f2039e;
        A a2 = this.i;
        return cVar.b(0.0f, 0.0f, a2, a2, f(), f(), f());
    }

    @Override // b.a.a.s.c.a
    public A i(a<K> aVar, float keyframeProgress) {
        return h();
    }
}
