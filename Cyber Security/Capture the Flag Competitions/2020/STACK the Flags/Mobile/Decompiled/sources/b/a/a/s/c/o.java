package b.a.a.s.c;

import android.graphics.Matrix;
import android.graphics.PointF;
import b.a.a.k;
import b.a.a.s.c.a;
import b.a.a.u.j.l;
import b.a.a.u.l.a;
import b.a.a.y.c;
import b.a.a.y.d;
import java.util.Collections;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f2051a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f2052b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f2053c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f2054d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f2055e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f2056f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f2057g;
    public a<d, d> h;
    public a<Float, Float> i;
    public a<Integer, Integer> j;
    public c k;
    public c l;
    public a<?, Float> m;
    public a<?, Float> n;

    public o(l animatableTransform) {
        this.f2056f = animatableTransform.c() == null ? null : animatableTransform.c().a();
        this.f2057g = animatableTransform.f() == null ? null : animatableTransform.f().a();
        this.h = animatableTransform.h() == null ? null : animatableTransform.h().a();
        this.i = animatableTransform.g() == null ? null : animatableTransform.g().a();
        c cVar = animatableTransform.i() == null ? null : (c) animatableTransform.i().a();
        this.k = cVar;
        if (cVar != null) {
            this.f2052b = new Matrix();
            this.f2053c = new Matrix();
            this.f2054d = new Matrix();
            this.f2055e = new float[9];
        } else {
            this.f2052b = null;
            this.f2053c = null;
            this.f2054d = null;
            this.f2055e = null;
        }
        this.l = animatableTransform.j() == null ? null : (c) animatableTransform.j().a();
        if (animatableTransform.e() != null) {
            this.j = animatableTransform.e().a();
        }
        if (animatableTransform.k() != null) {
            this.m = animatableTransform.k().a();
        } else {
            this.m = null;
        }
        if (animatableTransform.d() != null) {
            this.n = animatableTransform.d().a();
        } else {
            this.n = null;
        }
    }

    public void a(a layer) {
        layer.k(this.j);
        layer.k(this.m);
        layer.k(this.n);
        layer.k(this.f2056f);
        layer.k(this.f2057g);
        layer.k(this.h);
        layer.k(this.i);
        layer.k(this.k);
        layer.k(this.l);
    }

    public void b(a.b listener) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.a(listener);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a(listener);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.a(listener);
        }
        a<PointF, PointF> aVar4 = this.f2056f;
        if (aVar4 != null) {
            aVar4.a(listener);
        }
        a<?, PointF> aVar5 = this.f2057g;
        if (aVar5 != null) {
            aVar5.a(listener);
        }
        a<d, d> aVar6 = this.h;
        if (aVar6 != null) {
            aVar6.a(listener);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.a(listener);
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a(listener);
        }
        c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.a(listener);
        }
    }

    public void j(float progress) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.l(progress);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.l(progress);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.l(progress);
        }
        a<PointF, PointF> aVar4 = this.f2056f;
        if (aVar4 != null) {
            aVar4.l(progress);
        }
        a<?, PointF> aVar5 = this.f2057g;
        if (aVar5 != null) {
            aVar5.l(progress);
        }
        a<d, d> aVar6 = this.h;
        if (aVar6 != null) {
            aVar6.l(progress);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.l(progress);
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.l(progress);
        }
        c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.l(progress);
        }
    }

    public a<?, Integer> h() {
        return this.j;
    }

    public a<?, Float> i() {
        return this.m;
    }

    public a<?, Float> e() {
        return this.n;
    }

    /* JADX INFO: Multiple debug info for r0v2 b.a.a.s.c.a<java.lang.Float, java.lang.Float>: [D('position' android.graphics.PointF), D('rotation' float)] */
    public Matrix f() {
        float rotation;
        this.f2051a.reset();
        a<?, PointF> aVar = this.f2057g;
        if (aVar != null) {
            PointF position = aVar.h();
            if (!(position.x == 0.0f && position.y == 0.0f)) {
                this.f2051a.preTranslate(position.x, position.y);
            }
        }
        a<Float, Float> aVar2 = this.i;
        if (aVar2 != null) {
            if (aVar2 instanceof p) {
                rotation = aVar2.h().floatValue();
            } else {
                rotation = ((c) aVar2).o();
            }
            if (rotation != 0.0f) {
                this.f2051a.preRotate(rotation);
            }
        }
        if (this.k != null) {
            c cVar = this.l;
            float mCos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.o()) + 90.0f)));
            c cVar2 = this.l;
            float mSin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.o()) + 90.0f)));
            d();
            float[] fArr = this.f2055e;
            fArr[0] = mCos;
            fArr[1] = mSin;
            fArr[3] = -mSin;
            fArr[4] = mCos;
            fArr[8] = 1.0f;
            this.f2052b.setValues(fArr);
            d();
            float[] fArr2 = this.f2055e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.k.o()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f2053c.setValues(fArr2);
            d();
            float[] fArr3 = this.f2055e;
            fArr3[0] = mCos;
            fArr3[1] = -mSin;
            fArr3[3] = mSin;
            fArr3[4] = mCos;
            fArr3[8] = 1.0f;
            this.f2054d.setValues(fArr3);
            this.f2053c.preConcat(this.f2052b);
            this.f2054d.preConcat(this.f2053c);
            this.f2051a.preConcat(this.f2054d);
        }
        a<d, d> aVar3 = this.h;
        if (aVar3 != null) {
            d scaleTransform = aVar3.h();
            if (!(scaleTransform.b() == 1.0f && scaleTransform.c() == 1.0f)) {
                this.f2051a.preScale(scaleTransform.b(), scaleTransform.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f2056f;
        if (aVar4 != null) {
            PointF anchorPoint = aVar4.h();
            if (!(anchorPoint.x == 0.0f && anchorPoint.y == 0.0f)) {
                this.f2051a.preTranslate(-anchorPoint.x, -anchorPoint.y);
            }
        }
        return this.f2051a;
    }

    public final void d() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.f2055e[i2] = 0.0f;
        }
    }

    public Matrix g(float amount) {
        a<?, PointF> aVar = this.f2057g;
        PointF anchorPoint = null;
        PointF position = aVar == null ? null : aVar.h();
        a<d, d> aVar2 = this.h;
        d scale = aVar2 == null ? null : aVar2.h();
        this.f2051a.reset();
        if (position != null) {
            this.f2051a.preTranslate(position.x * amount, position.y * amount);
        }
        if (scale != null) {
            this.f2051a.preScale((float) Math.pow((double) scale.b(), (double) amount), (float) Math.pow((double) scale.c(), (double) amount));
        }
        a<Float, Float> aVar3 = this.i;
        if (aVar3 != null) {
            float rotation = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f2056f;
            if (aVar4 != null) {
                anchorPoint = aVar4.h();
            }
            Matrix matrix = this.f2051a;
            float f2 = rotation * amount;
            float f3 = 0.0f;
            float f4 = anchorPoint == null ? 0.0f : anchorPoint.x;
            if (anchorPoint != null) {
                f3 = anchorPoint.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f2051a;
    }

    public <T> boolean c(T property, c<T> cVar) {
        c cVar2;
        c cVar3;
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (property == k.f1937e) {
            a<PointF, PointF> aVar3 = this.f2056f;
            if (aVar3 == null) {
                this.f2056f = new p(cVar, new PointF());
                return true;
            }
            aVar3.m(cVar);
            return true;
        } else if (property == k.f1938f) {
            a<?, PointF> aVar4 = this.f2057g;
            if (aVar4 == null) {
                this.f2057g = new p(cVar, new PointF());
                return true;
            }
            aVar4.m(cVar);
            return true;
        } else if (property == k.k) {
            a<d, d> aVar5 = this.h;
            if (aVar5 == null) {
                this.h = new p(cVar, new d());
                return true;
            }
            aVar5.m(cVar);
            return true;
        } else if (property == k.l) {
            a<Float, Float> aVar6 = this.i;
            if (aVar6 == null) {
                this.i = new p(cVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.m(cVar);
            return true;
        } else if (property == k.f1935c) {
            a<Integer, Integer> aVar7 = this.j;
            if (aVar7 == null) {
                this.j = new p(cVar, 100);
                return true;
            }
            aVar7.m(cVar);
            return true;
        } else if (property != k.y || (aVar2 = this.m) == null) {
            if (property != k.z || (aVar = this.n) == null) {
                if (property == k.m && (cVar3 = this.k) != null) {
                    if (cVar3 == null) {
                        this.k = new c(Collections.singletonList(new b.a.a.y.a(Float.valueOf(0.0f))));
                    }
                    this.k.m(cVar);
                    return true;
                } else if (property != k.n || (cVar2 = this.l) == null) {
                    return false;
                } else {
                    if (cVar2 == null) {
                        this.l = new c(Collections.singletonList(new b.a.a.y.a(Float.valueOf(0.0f))));
                    }
                    this.l.m(cVar);
                    return true;
                }
            } else if (aVar == null) {
                this.n = new p(cVar, 100);
                return true;
            } else {
                aVar.m(cVar);
                return true;
            }
        } else if (aVar2 == null) {
            this.m = new p(cVar, 100);
            return true;
        } else {
            aVar2.m(cVar);
            return true;
        }
    }
}
