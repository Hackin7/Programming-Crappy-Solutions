package b.a.a.s.b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import b.a.a.f;
import b.a.a.s.c.a;
import b.a.a.s.c.o;
import b.a.a.u.e;
import b.a.a.u.k.k;
import b.a.a.x.g;
import b.a.a.y.c;
import com.airbnb.lottie.animation.content.Content;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class p implements e, m, j, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f2014a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f2015b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final f f2016c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a.a.u.l.a f2017d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2018e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2019f;

    /* renamed from: g  reason: collision with root package name */
    public final a<Float, Float> f2020g;
    public final a<Float, Float> h;
    public final o i;
    public d j;

    public p(f lottieDrawable, b.a.a.u.l.a layer, k repeater) {
        this.f2016c = lottieDrawable;
        this.f2017d = layer;
        this.f2018e = repeater.c();
        this.f2019f = repeater.f();
        a<Float, Float> a2 = repeater.b().a();
        this.f2020g = a2;
        layer.k(a2);
        this.f2020g.a(this);
        a<Float, Float> a3 = repeater.d().a();
        this.h = a3;
        layer.k(a3);
        this.h.a(this);
        o b2 = repeater.e().b();
        this.i = b2;
        b2.a(layer);
        this.i.b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    @Override // b.a.a.s.b.j
    public void d(ListIterator<c> listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            List<Content> contents = new ArrayList<>();
            while (listIterator.hasPrevious()) {
                contents.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(contents);
            this.j = new d(this.f2016c, this.f2017d, "Repeater", this.f2019f, contents, null);
        }
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f2018e;
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        this.j.c(list, list2);
    }

    @Override // b.a.a.s.b.m
    public Path h() {
        Path contentPath = this.j.h();
        this.f2015b.reset();
        float copies = this.f2020g.h().floatValue();
        float offset = this.h.h().floatValue();
        for (int i2 = ((int) copies) - 1; i2 >= 0; i2--) {
            this.f2014a.set(this.i.g(((float) i2) + offset));
            this.f2015b.addPath(contentPath, this.f2014a);
        }
        return this.f2015b;
    }

    @Override // b.a.a.s.b.e
    public void g(Canvas canvas, Matrix parentMatrix, int alpha) {
        float copies = this.f2020g.h().floatValue();
        float offset = this.h.h().floatValue();
        float startOpacity = this.i.i().h().floatValue() / 100.0f;
        float endOpacity = this.i.e().h().floatValue() / 100.0f;
        for (int i2 = ((int) copies) - 1; i2 >= 0; i2--) {
            this.f2014a.set(parentMatrix);
            this.f2014a.preConcat(this.i.g(((float) i2) + offset));
            this.j.g(canvas, this.f2014a, (int) (((float) alpha) * g.j(startOpacity, endOpacity, ((float) i2) / copies)));
        }
    }

    @Override // b.a.a.s.b.e
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        this.j.a(outBounds, parentMatrix, applyParents);
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        this.f2016c.invalidateSelf();
    }

    @Override // b.a.a.u.f
    public void e(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        g.l(keyPath, depth, list, currentPartialKeyPath, this);
    }

    @Override // b.a.a.u.f
    public <T> void f(T property, c<T> cVar) {
        if (!this.i.c(property, cVar)) {
            if (property == b.a.a.k.q) {
                this.f2020g.m(cVar);
            } else if (property == b.a.a.k.r) {
                this.h.m(cVar);
            }
        }
    }
}
