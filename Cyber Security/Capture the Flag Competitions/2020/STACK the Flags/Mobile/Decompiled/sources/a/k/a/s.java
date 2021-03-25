package a.k.a;

import a.m.d;
import a.m.g;
import a.m.h;

public class s implements g {

    /* renamed from: b  reason: collision with root package name */
    public h f1165b = null;

    public void b() {
        if (this.f1165b == null) {
            this.f1165b = new h(this);
        }
    }

    public boolean c() {
        return this.f1165b != null;
    }

    @Override // a.m.g
    public d getLifecycle() {
        b();
        return this.f1165b;
    }

    public void a(d.a event) {
        this.f1165b.i(event);
    }
}
