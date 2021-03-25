package b.a.a.s.b;

import android.graphics.Path;
import b.a.a.f;
import b.a.a.s.c.a;
import b.a.a.u.k.l;
import b.a.a.u.k.o;
import b.a.a.u.k.q;
import java.util.List;

public class q implements m, a.b {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2021a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f2022b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2023c;

    /* renamed from: d  reason: collision with root package name */
    public final f f2024d;

    /* renamed from: e  reason: collision with root package name */
    public final a<?, Path> f2025e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2026f;

    /* renamed from: g  reason: collision with root package name */
    public b f2027g = new b();

    public q(f lottieDrawable, b.a.a.u.l.a layer, o shape) {
        this.f2022b = shape.b();
        this.f2023c = shape.d();
        this.f2024d = lottieDrawable;
        a<l, Path> a2 = shape.c().a();
        this.f2025e = a2;
        layer.k(a2);
        this.f2025e.a(this);
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        d();
    }

    public final void d() {
        this.f2026f = false;
        this.f2024d.invalidateSelf();
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c content = list.get(i);
            if ((content instanceof s) && ((s) content).k() == q.a.SIMULTANEOUSLY) {
                s trimPath = (s) content;
                this.f2027g.a(trimPath);
                trimPath.d(this);
            }
        }
    }

    @Override // b.a.a.s.b.m
    public Path h() {
        if (this.f2026f) {
            return this.f2021a;
        }
        this.f2021a.reset();
        if (this.f2023c) {
            this.f2026f = true;
            return this.f2021a;
        }
        this.f2021a.set(this.f2025e.h());
        this.f2021a.setFillType(Path.FillType.EVEN_ODD);
        this.f2027g.b(this.f2021a);
        this.f2026f = true;
        return this.f2021a;
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f2022b;
    }
}
