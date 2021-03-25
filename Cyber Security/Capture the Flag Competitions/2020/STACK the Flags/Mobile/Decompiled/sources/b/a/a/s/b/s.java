package b.a.a.s.b;

import b.a.a.s.c.a;
import b.a.a.u.k.q;
import java.util.ArrayList;
import java.util.List;

public class s implements c, a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2028a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2029b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a.b> f2030c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final q.a f2031d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, Float> f2032e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f2033f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, Float> f2034g;

    public s(b.a.a.u.l.a layer, q trimPath) {
        this.f2028a = trimPath.c();
        this.f2029b = trimPath.g();
        this.f2031d = trimPath.f();
        this.f2032e = trimPath.e().a();
        this.f2033f = trimPath.b().a();
        this.f2034g = trimPath.d().a();
        layer.k(this.f2032e);
        layer.k(this.f2033f);
        layer.k(this.f2034g);
        this.f2032e.a(this);
        this.f2033f.a(this);
        this.f2034g.a(this);
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        for (int i = 0; i < this.f2030c.size(); i++) {
            this.f2030c.get(i).b();
        }
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f2028a;
    }

    public void d(a.b listener) {
        this.f2030c.add(listener);
    }

    public q.a k() {
        return this.f2031d;
    }

    public a<?, Float> j() {
        return this.f2032e;
    }

    public a<?, Float> e() {
        return this.f2033f;
    }

    public a<?, Float> f() {
        return this.f2034g;
    }

    public boolean l() {
        return this.f2029b;
    }
}
