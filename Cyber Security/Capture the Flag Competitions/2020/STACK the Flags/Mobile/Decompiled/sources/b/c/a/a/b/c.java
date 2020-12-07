package b.c.a.a.b;

import android.graphics.Canvas;
import android.graphics.RectF;
import b.c.a.a.c.e;
import b.c.a.a.c.i;
import b.c.a.a.d.i;
import b.c.a.a.i.h;
import b.c.a.a.i.k;
import b.c.a.a.i.m;
import b.c.a.a.j.f;

public class c extends b<i> {
    public float L;
    public float M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public b.c.a.a.c.i S;
    public m T;
    public k U;

    @Override // b.c.a.a.b.a, b.c.a.a.b.b
    public void i() {
        super.i();
        this.S = new b.c.a.a.c.i(i.a.LEFT);
        this.L = f.e(1.5f);
        this.M = f.e(0.75f);
        this.s = new h(this, this.v, this.u);
        this.T = new m(this.u, this.S, this);
        this.U = new k(this.u, this.j, this);
        this.t = new b.c.a.a.f.f(this);
    }

    @Override // b.c.a.a.b.b
    public void q() {
        super.q();
        this.S.h(((b.c.a.a.d.i) this.f2384c).o(i.a.LEFT), ((b.c.a.a.d.i) this.f2384c).m(i.a.LEFT));
        this.j.h(0.0f, (float) ((b.c.a.a.g.a.h) ((b.c.a.a.d.i) this.f2384c).k()).E());
    }

    @Override // b.c.a.a.b.a, b.c.a.a.b.b
    public void m() {
        if (this.f2384c != null) {
            q();
            m mVar = this.T;
            b.c.a.a.c.i iVar = this.S;
            mVar.a(iVar.y, iVar.x, iVar.x());
            k kVar = this.U;
            b.c.a.a.c.h hVar = this.j;
            kVar.a(hVar.y, hVar.x, false);
            e eVar = this.m;
            if (eVar != null && !eVar.D()) {
                this.r.a(this.f2384c);
            }
            a();
        }
    }

    @Override // b.c.a.a.b.a
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2384c != null) {
            if (this.j.f()) {
                k kVar = this.U;
                b.c.a.a.c.h hVar = this.j;
                kVar.a(hVar.y, hVar.x, false);
            }
            this.U.e(canvas);
            if (this.Q) {
                this.s.c(canvas);
            }
            if (this.S.f() && this.S.q()) {
                this.T.d(canvas);
            }
            this.s.b(canvas);
            if (p()) {
                this.s.d(canvas, this.B);
            }
            if (this.S.f() && !this.S.q()) {
                this.T.d(canvas);
            }
            this.T.c(canvas);
            this.s.e(canvas);
            this.r.e(canvas);
            c(canvas);
            d(canvas);
        }
    }

    public float getFactor() {
        RectF content = this.u.i();
        return Math.min(content.width() / 2.0f, content.height() / 2.0f) / this.S.z;
    }

    public float getSliceAngle() {
        return 360.0f / ((float) ((b.c.a.a.g.a.h) ((b.c.a.a.d.i) this.f2384c).k()).E());
    }

    @Override // b.c.a.a.b.b
    public int t(float angle) {
        float a2 = f.o(angle - getRotationAngle());
        float sliceangle = getSliceAngle();
        int max = ((b.c.a.a.g.a.h) ((b.c.a.a.d.i) this.f2384c).k()).E();
        for (int i = 0; i < max; i++) {
            if ((((float) (i + 1)) * sliceangle) - (sliceangle / 2.0f) > a2) {
                return i;
            }
        }
        return 0;
    }

    public b.c.a.a.c.i getYAxis() {
        return this.S;
    }

    public void setWebLineWidth(float width) {
        this.L = f.e(width);
    }

    public float getWebLineWidth() {
        return this.L;
    }

    public void setWebLineWidthInner(float width) {
        this.M = f.e(width);
    }

    public float getWebLineWidthInner() {
        return this.M;
    }

    public void setWebAlpha(int alpha) {
        this.P = alpha;
    }

    public int getWebAlpha() {
        return this.P;
    }

    public void setWebColor(int color) {
        this.N = color;
    }

    public int getWebColor() {
        return this.N;
    }

    public void setWebColorInner(int color) {
        this.O = color;
    }

    public int getWebColorInner() {
        return this.O;
    }

    public void setDrawWeb(boolean enabled) {
        this.Q = enabled;
    }

    public void setSkipWebLineCount(int count) {
        this.R = Math.max(0, count);
    }

    public int getSkipWebLineCount() {
        return this.R;
    }

    @Override // b.c.a.a.b.b
    public float getRequiredLegendOffset() {
        return this.r.d().getTextSize() * 4.0f;
    }

    @Override // b.c.a.a.b.b
    public float getRequiredBaseOffset() {
        if (!this.j.f() || !this.j.p()) {
            return f.e(10.0f);
        }
        return (float) this.j.C;
    }

    @Override // b.c.a.a.b.b
    public float getRadius() {
        RectF content = this.u.i();
        return Math.min(content.width() / 2.0f, content.height() / 2.0f);
    }

    @Override // b.c.a.a.b.a, b.c.a.a.b.b
    public float getYChartMax() {
        return this.S.x;
    }

    @Override // b.c.a.a.b.a, b.c.a.a.b.b
    public float getYChartMin() {
        return this.S.y;
    }

    public float getYRange() {
        return this.S.z;
    }
}
