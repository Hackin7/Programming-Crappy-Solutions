package b.a.a.u.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import b.a.a.c;
import b.a.a.d;
import b.a.a.f;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.s.c.p;
import b.a.a.u.e;
import b.a.a.x.h;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

public class b extends a {
    public final RectF A = new RectF();
    public Paint B = new Paint();
    public a<Float, Float> x;
    public final List<a> y = new ArrayList();
    public final RectF z = new RectF();

    public b(f lottieDrawable, d layerModel, List<d> list, d composition) {
        super(lottieDrawable, layerModel);
        a parentLayer;
        b.a.a.u.j.b timeRemapping = layerModel.s();
        if (timeRemapping != null) {
            a<Float, Float> a2 = timeRemapping.a();
            this.x = a2;
            k(a2);
            this.x.a(this);
        } else {
            this.x = null;
        }
        LongSparseArray<BaseLayer> layerMap = new a.e.d<>(composition.j().size());
        a mattedLayer = null;
        for (int i = list.size() - 1; i >= 0; i--) {
            d lm = list.get(i);
            a layer = a.w(lm, lottieDrawable, composition);
            if (layer != null) {
                layerMap.j(layer.x().b(), layer);
                if (mattedLayer != null) {
                    mattedLayer.G(layer);
                    mattedLayer = null;
                } else {
                    this.y.add(0, layer);
                    int ordinal = lm.f().ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        mattedLayer = layer;
                    }
                }
            }
        }
        for (int i2 = 0; i2 < layerMap.m(); i2++) {
            a layerView = (a) layerMap.f(layerMap.i(i2));
            if (!(layerView == null || (parentLayer = (a) layerMap.f(layerView.x().h())) == null)) {
                layerView.H(parentLayer);
            }
        }
    }

    @Override // b.a.a.u.l.a
    public void v(Canvas canvas, Matrix parentMatrix, int parentAlpha) {
        c.a("CompositionLayer#draw");
        this.A.set(0.0f, 0.0f, (float) this.o.j(), (float) this.o.i());
        parentMatrix.mapRect(this.A);
        int childAlpha = 255;
        boolean isDrawingWithOffScreen = this.n.F() && this.y.size() > 1 && parentAlpha != 255;
        if (isDrawingWithOffScreen) {
            this.B.setAlpha(parentAlpha);
            h.m(canvas, this.A, this.B);
        } else {
            canvas.save();
        }
        if (!isDrawingWithOffScreen) {
            childAlpha = parentAlpha;
        }
        for (int i = this.y.size() - 1; i >= 0; i--) {
            boolean nonEmptyClip = true;
            if (!this.A.isEmpty()) {
                nonEmptyClip = canvas.clipRect(this.A);
            }
            if (nonEmptyClip) {
                this.y.get(i).g(canvas, parentMatrix, childAlpha);
            }
        }
        canvas.restore();
        c.b("CompositionLayer#draw");
    }

    @Override // b.a.a.s.b.e, b.a.a.u.l.a
    public void a(RectF outBounds, Matrix parentMatrix, boolean applyParents) {
        super.a(outBounds, parentMatrix, applyParents);
        for (int i = this.y.size() - 1; i >= 0; i--) {
            this.z.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.y.get(i).a(this.z, this.m, true);
            outBounds.union(this.z);
        }
    }

    @Override // b.a.a.u.l.a
    public void I(float progress) {
        super.I(progress);
        if (this.x != null) {
            progress = ((this.x.h().floatValue() * this.o.a().h()) - this.o.a().o()) / (this.n.m().e() + 0.01f);
        }
        if (this.x == null) {
            progress -= this.o.p();
        }
        if (this.o.t() != 0.0f) {
            progress /= this.o.t();
        }
        for (int i = this.y.size() - 1; i >= 0; i--) {
            this.y.get(i).I(progress);
        }
    }

    @Override // b.a.a.u.l.a
    public void F(e keyPath, int depth, List<e> list, e currentPartialKeyPath) {
        for (int i = 0; i < this.y.size(); i++) {
            this.y.get(i).e(keyPath, depth, list, currentPartialKeyPath);
        }
    }

    @Override // b.a.a.u.l.a, b.a.a.u.f
    public <T> void f(T property, b.a.a.y.c<T> cVar) {
        super.f(property, cVar);
        if (property != k.A) {
            return;
        }
        if (cVar == null) {
            a<Float, Float> aVar = this.x;
            if (aVar != null) {
                aVar.m(null);
                return;
            }
            return;
        }
        p pVar = new p(cVar);
        this.x = pVar;
        pVar.a(this);
        k(this.x);
    }
}
