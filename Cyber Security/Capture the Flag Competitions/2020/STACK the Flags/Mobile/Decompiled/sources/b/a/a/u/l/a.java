package b.a.a.u.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import b.a.a.d;
import b.a.a.s.b.e;
import b.a.a.s.c.a;
import b.a.a.s.c.c;
import b.a.a.s.c.g;
import b.a.a.s.c.o;
import b.a.a.u.f;
import b.a.a.u.k.g;
import b.a.a.u.k.l;
import b.a.a.u.l.d;
import b.a.a.x.h;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class a implements e, a.b, f {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2219a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f2220b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final Paint f2221c = new b.a.a.s.a(1);

    /* renamed from: d  reason: collision with root package name */
    public final Paint f2222d = new b.a.a.s.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e  reason: collision with root package name */
    public final Paint f2223e = new b.a.a.s.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f  reason: collision with root package name */
    public final Paint f2224f = new b.a.a.s.a(1);

    /* renamed from: g  reason: collision with root package name */
    public final Paint f2225g = new b.a.a.s.a(PorterDuff.Mode.CLEAR);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final String l;
    public final Matrix m = new Matrix();
    public final b.a.a.f n;
    public final d o;
    public g p;
    public c q;
    public a r;
    public a s;
    public List<a> t;
    public final List<b.a.a.s.c.a<?, ?>> u = new ArrayList();
    public final o v;
    public boolean w = true;

    public abstract void v(Canvas canvas, Matrix matrix, int i2);

    public static a w(d layerModel, b.a.a.f drawable, d composition) {
        int ordinal = layerModel.d().ordinal();
        if (ordinal == 0) {
            return new b(drawable, layerModel, composition.n(layerModel.k()), composition);
        }
        if (ordinal == 1) {
            return new g(drawable, layerModel);
        }
        if (ordinal == 2) {
            return new c(drawable, layerModel);
        }
        if (ordinal == 3) {
            return new e(drawable, layerModel);
        }
        if (ordinal == 4) {
            return new f(drawable, layerModel);
        }
        if (ordinal == 5) {
            return new h(drawable, layerModel);
        }
        b.a.a.x.d.c("Unknown layer type " + layerModel.d());
        return null;
    }

    public a(b.a.a.f lottieDrawable, d layerModel) {
        this.n = lottieDrawable;
        this.o = layerModel;
        this.l = layerModel.g() + "#draw";
        if (layerModel.f() == d.b.INVERT) {
            this.f2224f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.f2224f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        o b2 = layerModel.u().b();
        this.v = b2;
        b2.b(this);
        if (layerModel.e() != null && !layerModel.e().isEmpty()) {
            g gVar = new g(layerModel.e());
            this.p = gVar;
            Iterator<b.a.a.s.c.a<l, Path>> it = gVar.a().iterator();
            while (it.hasNext()) {
                ((b.a.a.s.c.a) it.next()).a(this);
            }
            Iterator<b.a.a.s.c.a<Integer, Integer>> it2 = this.p.c().iterator();
            while (it2.hasNext()) {
                BaseKeyframeAnimation<Integer, Integer> animation = (b.a.a.s.c.a) it2.next();
                k(animation);
                animation.a(this);
            }
        }
        K();
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        C();
    }

    public d x() {
        return this.o;
    }

    public void G(a matteLayer) {
        this.r = matteLayer;
    }

    public boolean z() {
        return this.r != null;
    }

    public void H(a parentLayer) {
        this.s = parentLayer;
    }

    public final void K() {
        boolean z = true;
        if (!this.o.c().isEmpty()) {
            c cVar = new c(this.o.c());
            this.q = cVar;
            cVar.k();
            this.q.a(new C0047a());
            if (((Float) this.q.h()).floatValue() != 1.0f) {
                z = false;
            }
            J(z);
            k(this.q);
            return;
        }
        J(true);
    }

    /* renamed from: b.a.a.u.l.a$a  reason: collision with other inner class name */
    public class C0047a implements a.b {
        public C0047a() {
        }

        @Override // b.a.a.s.c.a.b
        public void b() {
            a aVar = a.this;
            aVar.J(aVar.q.o() == 1.0f);
        }
    }

    public final void C() {
        this.n.invalidateSelf();
    }

    public void k(b.a.a.s.c.a<?, ?> aVar) {
        if (aVar != null) {
            this.u.add(aVar);
        }
    }

    public void E(b.a.a.s.c.a<?, ?> aVar) {
        this.u.remove(aVar);
    }

    @Override // b.a.a.s.b.e
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        t();
        this.m.set(parentMatrix);
        if (applyParents) {
            List<a> list = this.t;
            if (list != null) {
                for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                    this.m.preConcat(this.t.get(i2).v.f());
                }
            } else {
                a aVar = this.s;
                if (aVar != null) {
                    this.m.preConcat(aVar.v.f());
                }
            }
        }
        this.m.preConcat(this.v.f());
    }

    @Override // b.a.a.s.b.e
    public void g(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        b.a.a.c.a(this.l);
        if (!this.w || this.o.v()) {
            b.a.a.c.b(this.l);
            return;
        }
        t();
        b.a.a.c.a("Layer#parentMatrix");
        this.f2220b.reset();
        this.f2220b.set(parentMatrix);
        for (int i2 = this.t.size() - 1; i2 >= 0; i2--) {
            this.f2220b.preConcat(this.t.get(i2).v.f());
        }
        b.a.a.c.b("Layer#parentMatrix");
        int alpha = (int) ((((((float) parentAlpha) / 255.0f) * ((float) (this.v.h() == null ? 100 : this.v.h().h().intValue()))) / 100.0f) * 255.0f);
        if (z() || y()) {
            b.a.a.c.a("Layer#computeBounds");
            a(this.h, this.f2220b, false);
            B(this.h, parentMatrix);
            this.f2220b.preConcat(this.v.f());
            A(this.h, this.f2220b);
            if (!this.h.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            b.a.a.c.b("Layer#computeBounds");
            if (!this.h.isEmpty()) {
                b.a.a.c.a("Layer#saveLayer");
                this.f2221c.setAlpha(255);
                h.m(canvas, this.h, this.f2221c);
                b.a.a.c.b("Layer#saveLayer");
                u(canvas);
                b.a.a.c.a("Layer#drawLayer");
                v(canvas, this.f2220b, alpha);
                b.a.a.c.b("Layer#drawLayer");
                if (y()) {
                    q(canvas, this.f2220b);
                }
                if (z()) {
                    b.a.a.c.a("Layer#drawMatte");
                    b.a.a.c.a("Layer#saveLayer");
                    h.n(canvas, this.h, this.f2224f, 19);
                    b.a.a.c.b("Layer#saveLayer");
                    u(canvas);
                    this.r.g(canvas, parentMatrix, alpha);
                    b.a.a.c.a("Layer#restoreLayer");
                    canvas.restore();
                    b.a.a.c.b("Layer#restoreLayer");
                    b.a.a.c.b("Layer#drawMatte");
                }
                b.a.a.c.a("Layer#restoreLayer");
                canvas.restore();
                b.a.a.c.b("Layer#restoreLayer");
            }
            b.a.a.c.b(this.l);
            D(0.0f);
            return;
        }
        this.f2220b.preConcat(this.v.f());
        b.a.a.c.a("Layer#drawLayer");
        v(canvas, this.f2220b, alpha);
        b.a.a.c.b("Layer#drawLayer");
        b.a.a.c.b(this.l);
        D(0.0f);
    }

    public final void D(float ms) {
        this.n.m().m().a(this.o.g(), ms);
    }

    public final void u(Canvas canvas) {
        b.a.a.c.a("Layer#clearLayer");
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f2225g);
        b.a.a.c.b("Layer#clearLayer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    public final void A(RectF rect, Matrix matrix) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (y()) {
            int size = this.p.b().size();
            for (int i2 = 0; i2 < size; i2++) {
                b.a.a.u.k.g mask = this.p.b().get(i2);
                this.f2219a.set(((b.a.a.s.c.a) this.p.a().get(i2)).h());
                this.f2219a.transform(matrix);
                int ordinal = mask.a().ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return;
                    }
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return;
                        }
                        this.f2219a.computeBounds(this.k, false);
                        if (i2 != 0) {
                            this.i.set(this.k);
                        } else {
                            RectF rectF = this.i;
                            rectF.set(Math.min(rectF.left, this.k.left), Math.min(this.i.top, this.k.top), Math.max(this.i.right, this.k.right), Math.max(this.i.bottom, this.k.bottom));
                        }
                    }
                }
                if (mask.d()) {
                    return;
                }
                this.f2219a.computeBounds(this.k, false);
                if (i2 != 0) {
                }
            }
            if (!rect.intersect(this.i)) {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    public final void B(RectF rect, Matrix matrix) {
        if (z() && this.o.f() != d.b.INVERT) {
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.r.a(this.j, matrix, true);
            if (!rect.intersect(this.j)) {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    public final void q(Canvas canvas, Matrix matrix) {
        b.a.a.c.a("Layer#saveLayer");
        h.n(canvas, this.h, this.f2222d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            u(canvas);
        }
        b.a.a.c.b("Layer#saveLayer");
        for (int i2 = 0; i2 < this.p.b().size(); i2++) {
            b.a.a.u.k.g mask = this.p.b().get(i2);
            BaseKeyframeAnimation<ShapeData, Path> maskAnimation = (b.a.a.s.c.a) this.p.a().get(i2);
            BaseKeyframeAnimation<Integer, Integer> opacityAnimation = (b.a.a.s.c.a) this.p.c().get(i2);
            int ordinal = mask.a().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    if (i2 == 0) {
                        this.f2221c.setColor(-16777216);
                        this.f2221c.setAlpha(255);
                        canvas.drawRect(this.h, this.f2221c);
                    }
                    if (mask.d()) {
                        p(canvas, matrix, maskAnimation, opacityAnimation);
                    } else {
                        r(canvas, matrix, maskAnimation);
                    }
                } else if (ordinal != 2) {
                    if (ordinal == 3 && s()) {
                        this.f2221c.setAlpha(255);
                        canvas.drawRect(this.h, this.f2221c);
                    }
                } else if (mask.d()) {
                    o(canvas, matrix, maskAnimation, opacityAnimation);
                } else {
                    m(canvas, matrix, maskAnimation, opacityAnimation);
                }
            } else if (mask.d()) {
                n(canvas, matrix, maskAnimation, opacityAnimation);
            } else {
                l(canvas, matrix, maskAnimation, opacityAnimation);
            }
        }
        b.a.a.c.a("Layer#restoreLayer");
        canvas.restore();
        b.a.a.c.b("Layer#restoreLayer");
    }

    public final boolean s() {
        if (this.p.a().isEmpty()) {
            return false;
        }
        for (int i2 = 0; i2 < this.p.b().size(); i2++) {
            if (this.p.b().get(i2).a() != g.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lb/a/a/u/k/g;Lb/a/a/s/c/a<Lb/a/a/u/k/l;Landroid/graphics/Path;>;Lb/a/a/s/c/a<Ljava/lang/Integer;Ljava/lang/Integer;>;)V */
    public final void l(Canvas canvas, Matrix matrix, b.a.a.s.c.a aVar, b.a.a.s.c.a aVar2) {
        this.f2219a.set((Path) aVar.h());
        this.f2219a.transform(matrix);
        this.f2221c.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        canvas.drawPath(this.f2219a, this.f2221c);
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lb/a/a/u/k/g;Lb/a/a/s/c/a<Lb/a/a/u/k/l;Landroid/graphics/Path;>;Lb/a/a/s/c/a<Ljava/lang/Integer;Ljava/lang/Integer;>;)V */
    public final void n(Canvas canvas, Matrix matrix, b.a.a.s.c.a aVar, b.a.a.s.c.a aVar2) {
        h.m(canvas, this.h, this.f2221c);
        canvas.drawRect(this.h, this.f2221c);
        this.f2219a.set((Path) aVar.h());
        this.f2219a.transform(matrix);
        this.f2221c.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        canvas.drawPath(this.f2219a, this.f2223e);
        canvas.restore();
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lb/a/a/u/k/g;Lb/a/a/s/c/a<Lb/a/a/u/k/l;Landroid/graphics/Path;>;Lb/a/a/s/c/a<Ljava/lang/Integer;Ljava/lang/Integer;>;)V */
    public final void r(Canvas canvas, Matrix matrix, b.a.a.s.c.a aVar) {
        this.f2219a.set((Path) aVar.h());
        this.f2219a.transform(matrix);
        canvas.drawPath(this.f2219a, this.f2223e);
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lb/a/a/u/k/g;Lb/a/a/s/c/a<Lb/a/a/u/k/l;Landroid/graphics/Path;>;Lb/a/a/s/c/a<Ljava/lang/Integer;Ljava/lang/Integer;>;)V */
    public final void p(Canvas canvas, Matrix matrix, b.a.a.s.c.a aVar, b.a.a.s.c.a aVar2) {
        h.m(canvas, this.h, this.f2223e);
        canvas.drawRect(this.h, this.f2221c);
        this.f2223e.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        this.f2219a.set((Path) aVar.h());
        this.f2219a.transform(matrix);
        canvas.drawPath(this.f2219a, this.f2223e);
        canvas.restore();
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lb/a/a/u/k/g;Lb/a/a/s/c/a<Lb/a/a/u/k/l;Landroid/graphics/Path;>;Lb/a/a/s/c/a<Ljava/lang/Integer;Ljava/lang/Integer;>;)V */
    public final void m(Canvas canvas, Matrix matrix, b.a.a.s.c.a aVar, b.a.a.s.c.a aVar2) {
        h.m(canvas, this.h, this.f2222d);
        this.f2219a.set((Path) aVar.h());
        this.f2219a.transform(matrix);
        this.f2221c.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        canvas.drawPath(this.f2219a, this.f2221c);
        canvas.restore();
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lb/a/a/u/k/g;Lb/a/a/s/c/a<Lb/a/a/u/k/l;Landroid/graphics/Path;>;Lb/a/a/s/c/a<Ljava/lang/Integer;Ljava/lang/Integer;>;)V */
    public final void o(Canvas canvas, Matrix matrix, b.a.a.s.c.a aVar, b.a.a.s.c.a aVar2) {
        h.m(canvas, this.h, this.f2222d);
        canvas.drawRect(this.h, this.f2221c);
        this.f2223e.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        this.f2219a.set((Path) aVar.h());
        this.f2219a.transform(matrix);
        canvas.drawPath(this.f2219a, this.f2223e);
        canvas.restore();
    }

    public boolean y() {
        b.a.a.s.c.g gVar = this.p;
        return gVar != null && !gVar.a().isEmpty();
    }

    public final void J(boolean visible) {
        if (visible != this.w) {
            this.w = visible;
            C();
        }
    }

    public void I(float progress) {
        this.v.j(progress);
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.a().size(); i2++) {
                this.p.a().get(i2).l(progress);
            }
        }
        if (this.o.t() != 0.0f) {
            progress /= this.o.t();
        }
        c cVar = this.q;
        if (cVar != null) {
            cVar.l(progress / this.o.t());
        }
        a aVar = this.r;
        if (aVar != null) {
            this.r.I(progress * aVar.o.t());
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            this.u.get(i3).l(progress);
        }
    }

    public final void t() {
        if (this.t == null) {
            if (this.s == null) {
                this.t = Collections.emptyList();
                return;
            }
            this.t = new ArrayList();
            for (a layer = this.s; layer != null; layer = layer.s) {
                this.t.add(layer);
            }
        }
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.o.g();
    }

    @Override // b.a.a.s.b.c
    public void c(List<b.a.a.s.b.c> list, List<b.a.a.s.b.c> list2) {
    }

    @Override // b.a.a.u.f
    public void e(b.a.a.u.e keyPath, int depth, List<b.a.a.u.e> list, b.a.a.u.e currentPartialKeyPath) {
        if (keyPath.g(i(), depth)) {
            if (!"__container".equals(i())) {
                currentPartialKeyPath = currentPartialKeyPath.a(i());
                if (keyPath.c(i(), depth)) {
                    list.add(currentPartialKeyPath.i(this));
                }
            }
            if (keyPath.h(i(), depth)) {
                F(keyPath, keyPath.e(i(), depth) + depth, list, currentPartialKeyPath);
            }
        }
    }

    public void F(b.a.a.u.e keyPath, int depth, List<b.a.a.u.e> list, b.a.a.u.e currentPartialKeyPath) {
    }

    @Override // b.a.a.u.f
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        this.v.c(property, cVar);
    }
}
