package b.a.a.s.b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b.a.a.s.c.a;
import b.a.a.s.c.o;
import b.a.a.u.e;
import b.a.a.u.f;
import b.a.a.u.j.l;
import b.a.a.u.k.b;
import b.a.a.u.k.n;
import b.a.a.x.h;
import b.a.a.y.c;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GreedyContent;
import java.util.ArrayList;
import java.util.List;

public class d implements e, m, a.b, f {

    /* renamed from: a  reason: collision with root package name */
    public Paint f1966a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f1967b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f1968c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f1969d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f1970e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1971f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1972g;
    public final List<c> h;
    public final b.a.a.f i;
    public List<m> j;
    public o k;

    public static List<c> d(b.a.a.f drawable, b.a.a.u.l.a layer, List<b> list) {
        List<Content> contents = new ArrayList<>(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            c content = list.get(i2).a(drawable, layer);
            if (content != null) {
                contents.add(content);
            }
        }
        return contents;
    }

    public static l j(List<b> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b contentModel = list.get(i2);
            if (contentModel instanceof l) {
                return (l) contentModel;
            }
        }
        return null;
    }

    public d(b.a.a.f lottieDrawable, b.a.a.u.l.a layer, n shapeGroup) {
        this(lottieDrawable, layer, shapeGroup.c(), shapeGroup.d(), d(lottieDrawable, layer, shapeGroup.b()), j(shapeGroup.b()));
    }

    public d(b.a.a.f lottieDrawable, b.a.a.u.l.a layer, String name, boolean hidden, List<c> list, l transform) {
        this.f1966a = new b.a.a.s.a();
        this.f1967b = new RectF();
        this.f1968c = new Matrix();
        this.f1969d = new Path();
        this.f1970e = new RectF();
        this.f1971f = name;
        this.i = lottieDrawable;
        this.f1972g = hidden;
        this.h = list;
        if (transform != null) {
            o b2 = transform.b();
            this.k = b2;
            b2.a(layer);
            this.k.b(this);
        }
        List<GreedyContent> greedyContents = new ArrayList<>();
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            c content = list.get(i2);
            if (content instanceof j) {
                greedyContents.add((j) content);
            }
        }
        for (int i3 = greedyContents.size() - 1; i3 >= 0; i3--) {
            ((j) greedyContents.get(i3)).d(list.listIterator(list.size()));
        }
    }

    @Override // b.a.a.s.c.a.b
    public void b() {
        this.i.invalidateSelf();
    }

    @Override // b.a.a.s.b.c
    public String i() {
        return this.f1971f;
    }

    @Override // b.a.a.s.b.c
    public void c(List<c> list, List<c> list2) {
        List<c> myContentsBefore = new ArrayList<>(list.size() + this.h.size());
        myContentsBefore.addAll(list);
        for (int i2 = this.h.size() - 1; i2 >= 0; i2--) {
            c content = this.h.get(i2);
            content.c(myContentsBefore, this.h.subList(0, i2));
            myContentsBefore.add(content);
        }
    }

    public List<m> k() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                c content = this.h.get(i2);
                if (content instanceof m) {
                    this.j.add((m) content);
                }
            }
        }
        return this.j;
    }

    public Matrix l() {
        o oVar = this.k;
        if (oVar != null) {
            return oVar.f();
        }
        this.f1968c.reset();
        return this.f1968c;
    }

    @Override // b.a.a.s.b.m
    public Path h() {
        this.f1968c.reset();
        o oVar = this.k;
        if (oVar != null) {
            this.f1968c.set(oVar.f());
        }
        this.f1969d.reset();
        if (this.f1972g) {
            return this.f1969d;
        }
        for (int i2 = this.h.size() - 1; i2 >= 0; i2--) {
            c content = this.h.get(i2);
            if (content instanceof m) {
                this.f1969d.addPath(((m) content).h(), this.f1968c);
            }
        }
        return this.f1969d;
    }

    @Override // b.a.a.s.b.e
    public void g(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        int opacity;
        if (!this.f1972g) {
            this.f1968c.set(parentMatrix);
            o oVar = this.k;
            if (oVar != null) {
                this.f1968c.preConcat(oVar.f());
                opacity = (int) ((((((float) (this.k.h() == null ? 100 : this.k.h().h().intValue())) / 100.0f) * ((float) parentAlpha)) / 255.0f) * 255.0f);
            } else {
                opacity = parentAlpha;
            }
            int childAlpha = 255;
            boolean isRenderingWithOffScreen = this.i.F() && m() && opacity != 255;
            if (isRenderingWithOffScreen) {
                this.f1967b.set(0.0f, 0.0f, 0.0f, 0.0f);
                a(this.f1967b, this.f1968c, true);
                this.f1966a.setAlpha(opacity);
                h.m(canvas, this.f1967b, this.f1966a);
            }
            if (!isRenderingWithOffScreen) {
                childAlpha = opacity;
            }
            for (int i2 = this.h.size() - 1; i2 >= 0; i2--) {
                Object content = this.h.get(i2);
                if (content instanceof e) {
                    ((e) content).g(canvas, this.f1968c, childAlpha);
                }
            }
            if (isRenderingWithOffScreen) {
                canvas.restore();
            }
        }
    }

    public final boolean m() {
        int drawableContentCount = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof e) && (drawableContentCount = drawableContentCount + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // b.a.a.s.b.e
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        this.f1968c.set(parentMatrix);
        o oVar = this.k;
        if (oVar != null) {
            this.f1968c.preConcat(oVar.f());
        }
        this.f1970e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int i2 = this.h.size() - 1; i2 >= 0; i2--) {
            c content = this.h.get(i2);
            if (content instanceof e) {
                ((e) content).a(this.f1970e, this.f1968c, applyParents);
                outBounds.union(this.f1970e);
            }
        }
    }

    @Override // b.a.a.u.f
    public void e(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        if (keyPath.g(i(), depth)) {
            if (!"__container".equals(i())) {
                currentPartialKeyPath = currentPartialKeyPath.a(i());
                if (keyPath.c(i(), depth)) {
                    list.add(currentPartialKeyPath.i(this));
                }
            }
            if (keyPath.h(i(), depth)) {
                int newDepth = keyPath.e(i(), depth) + depth;
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    c content = this.h.get(i2);
                    if (content instanceof f) {
                        ((f) content).e(keyPath, newDepth, list, currentPartialKeyPath);
                    }
                }
            }
        }
    }

    @Override // b.a.a.u.f
    public <T> void f(T property, c<T> cVar) {
        o oVar = this.k;
        if (oVar != null) {
            oVar.c(property, cVar);
        }
    }
}
