package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import b.c.a.a.b.b;
import b.c.a.a.d.f;
import b.c.a.a.d.h;
import b.c.a.a.f.d;
import b.c.a.a.i.g;
import b.c.a.a.j.c;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import java.util.List;
import net.sqlcipher.BuildConfig;

public class PieChart extends b<f> {
    public RectF L = new RectF();
    public boolean M = true;
    public float[] N = new float[1];
    public float[] O = new float[1];
    public boolean P = true;
    public boolean Q = false;
    public boolean R = false;
    public boolean S = false;
    public CharSequence T = BuildConfig.FLAVOR;
    public c U = c.c(0.0f, 0.0f);
    public float V = 50.0f;
    public float W = 55.0f;
    public boolean a0 = true;
    public float b0 = 100.0f;
    public float c0 = 360.0f;
    public float d0 = 0.0f;

    public PieChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // b.c.a.a.b.a, b.c.a.a.b.b
    public void i() {
        super.i();
        this.s = new g(this, this.v, this.u);
        this.j = null;
        this.t = new d(this);
    }

    @Override // b.c.a.a.b.a
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2384c != null) {
            this.s.b(canvas);
            if (p()) {
                this.s.d(canvas, this.B);
            }
            this.s.c(canvas);
            this.s.e(canvas);
            this.r.e(canvas);
            c(canvas);
            d(canvas);
        }
    }

    @Override // b.c.a.a.b.a, b.c.a.a.b.b
    public void a() {
        super.a();
        if (this.f2384c != null) {
            float radius = getDiameter() / 2.0f;
            c c2 = getCenterOffsets();
            float shift = ((f) this.f2384c).q().j();
            RectF rectF = this.L;
            float f2 = c2.f2511c;
            float f3 = c2.f2512d;
            rectF.set((f2 - radius) + shift, (f3 - radius) + shift, (f2 + radius) - shift, (f3 + radius) - shift);
            c.f(c2);
        }
    }

    @Override // b.c.a.a.b.b
    public void q() {
        y();
    }

    @Override // b.c.a.a.b.a
    public float[] g(b.c.a.a.f.b highlight) {
        c center = getCenterCircleBox();
        float r = getRadius();
        float off = (r / 10.0f) * 3.6f;
        if (B()) {
            off = (r - ((r / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float r2 = r - off;
        float rotationAngle = getRotationAngle();
        int entryIndex = (int) highlight.e();
        float offset = this.N[entryIndex] / 2.0f;
        float x = (float) ((((double) r2) * Math.cos(Math.toRadians((double) (((this.O[entryIndex] + rotationAngle) - offset) * this.v.b())))) + ((double) center.f2511c));
        c.f(center);
        return new float[]{x, (float) ((((double) r2) * Math.sin(Math.toRadians((double) (((this.O[entryIndex] + rotationAngle) - offset) * this.v.b())))) + ((double) center.f2512d))};
    }

    public final void y() {
        int entryCount = ((f) this.f2384c).g();
        if (this.N.length != entryCount) {
            this.N = new float[entryCount];
        } else {
            for (int i = 0; i < entryCount; i++) {
                this.N[i] = 0.0f;
            }
        }
        if (this.O.length != entryCount) {
            this.O = new float[entryCount];
        } else {
            for (int i2 = 0; i2 < entryCount; i2++) {
                this.O[i2] = 0.0f;
            }
        }
        float yValueSum = ((f) this.f2384c).s();
        List<IPieDataSet> dataSets = ((f) this.f2384c).f();
        float f2 = this.d0;
        boolean hasMinAngle = f2 != 0.0f && ((float) entryCount) * f2 <= this.c0;
        float[] minAngles = new float[entryCount];
        int cnt = 0;
        float offset = 0.0f;
        float diff = 0.0f;
        for (int i3 = 0; i3 < ((f) this.f2384c).e(); i3++) {
            b.c.a.a.g.a.g set = (b.c.a.a.g.a.g) dataSets.get(i3);
            for (int j = 0; j < set.E(); j++) {
                float drawAngle = x(Math.abs(((h) set.Q(j)).c()), yValueSum);
                if (hasMinAngle) {
                    float f3 = this.d0;
                    float temp = drawAngle - f3;
                    if (temp <= 0.0f) {
                        minAngles[cnt] = f3;
                        offset += -temp;
                    } else {
                        minAngles[cnt] = drawAngle;
                        diff += temp;
                    }
                }
                float[] fArr = this.N;
                fArr[cnt] = drawAngle;
                if (cnt == 0) {
                    this.O[cnt] = fArr[cnt];
                } else {
                    float[] fArr2 = this.O;
                    fArr2[cnt] = fArr2[cnt - 1] + fArr[cnt];
                }
                cnt++;
            }
        }
        if (hasMinAngle) {
            for (int i4 = 0; i4 < entryCount; i4++) {
                minAngles[i4] = minAngles[i4] - (((minAngles[i4] - this.d0) / diff) * offset);
                if (i4 == 0) {
                    this.O[0] = minAngles[0];
                } else {
                    float[] fArr3 = this.O;
                    fArr3[i4] = fArr3[i4 - 1] + minAngles[i4];
                }
            }
            this.N = minAngles;
        }
    }

    public boolean F(int index) {
        if (!p()) {
            return false;
        }
        int i = 0;
        while (true) {
            b.c.a.a.f.b[] bVarArr = this.B;
            if (i >= bVarArr.length) {
                return false;
            }
            if (((int) bVarArr[i].e()) == index) {
                return true;
            }
            i++;
        }
    }

    public final float x(float value, float yValueSum) {
        return (value / yValueSum) * this.c0;
    }

    @Override // b.c.a.a.b.a
    @Deprecated
    public b.c.a.a.c.h getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // b.c.a.a.b.b
    public int t(float angle) {
        float a2 = b.c.a.a.j.f.o(angle - getRotationAngle());
        int i = 0;
        while (true) {
            float[] fArr = this.O;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > a2) {
                return i;
            }
            i++;
        }
    }

    public float[] getDrawAngles() {
        return this.N;
    }

    public float[] getAbsoluteAngles() {
        return this.O;
    }

    public void setHoleColor(int color) {
        ((g) this.s).n().setColor(color);
    }

    public void setDrawSlicesUnderHole(boolean enable) {
        this.Q = enable;
    }

    public boolean D() {
        return this.Q;
    }

    public void setDrawHoleEnabled(boolean enabled) {
        this.P = enabled;
    }

    public boolean B() {
        return this.P;
    }

    public void setCenterText(CharSequence text) {
        if (text == null) {
            this.T = BuildConfig.FLAVOR;
        } else {
            this.T = text;
        }
    }

    public CharSequence getCenterText() {
        return this.T;
    }

    public void setDrawCenterText(boolean enabled) {
        this.a0 = enabled;
    }

    public boolean z() {
        return this.a0;
    }

    @Override // b.c.a.a.b.b
    public float getRequiredLegendOffset() {
        return this.r.d().getTextSize() * 2.0f;
    }

    @Override // b.c.a.a.b.b
    public float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override // b.c.a.a.b.b
    public float getRadius() {
        RectF rectF = this.L;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, this.L.height() / 2.0f);
    }

    public RectF getCircleBox() {
        return this.L;
    }

    public c getCenterCircleBox() {
        return c.c(this.L.centerX(), this.L.centerY());
    }

    public void setCenterTextTypeface(Typeface t) {
        ((g) this.s).l().setTypeface(t);
    }

    public void setCenterTextSize(float sizeDp) {
        ((g) this.s).l().setTextSize(b.c.a.a.j.f.e(sizeDp));
    }

    public void setCenterTextSizePixels(float sizePixels) {
        ((g) this.s).l().setTextSize(sizePixels);
    }

    public c getCenterTextOffset() {
        c cVar = this.U;
        return c.c(cVar.f2511c, cVar.f2512d);
    }

    public void setCenterTextColor(int color) {
        ((g) this.s).l().setColor(color);
    }

    public void setHoleRadius(float percent) {
        this.V = percent;
    }

    public float getHoleRadius() {
        return this.V;
    }

    public void setTransparentCircleColor(int color) {
        Paint p = ((g) this.s).o();
        int alpha = p.getAlpha();
        p.setColor(color);
        p.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float percent) {
        this.W = percent;
    }

    public float getTransparentCircleRadius() {
        return this.W;
    }

    public void setTransparentCircleAlpha(int alpha) {
        ((g) this.s).o().setAlpha(alpha);
    }

    @Deprecated
    public void setDrawSliceText(boolean enabled) {
        this.M = enabled;
    }

    public void setDrawEntryLabels(boolean enabled) {
        this.M = enabled;
    }

    public boolean A() {
        return this.M;
    }

    public void setEntryLabelColor(int color) {
        ((g) this.s).m().setColor(color);
    }

    public void setEntryLabelTypeface(Typeface tf) {
        ((g) this.s).m().setTypeface(tf);
    }

    public void setEntryLabelTextSize(float size) {
        ((g) this.s).m().setTextSize(b.c.a.a.j.f.e(size));
    }

    public void setDrawRoundedSlices(boolean enabled) {
        this.S = enabled;
    }

    public boolean C() {
        return this.S;
    }

    public void setUsePercentValues(boolean enabled) {
        this.R = enabled;
    }

    public boolean E() {
        return this.R;
    }

    public void setCenterTextRadiusPercent(float percent) {
        this.b0 = percent;
    }

    public float getCenterTextRadiusPercent() {
        return this.b0;
    }

    public float getMaxAngle() {
        return this.c0;
    }

    public void setMaxAngle(float maxangle) {
        if (maxangle > 360.0f) {
            maxangle = 360.0f;
        }
        if (maxangle < 90.0f) {
            maxangle = 90.0f;
        }
        this.c0 = maxangle;
    }

    public float getMinAngleForSlices() {
        return this.d0;
    }

    public void setMinAngleForSlices(float minAngle) {
        float f2 = this.c0;
        if (minAngle > f2 / 2.0f) {
            minAngle = f2 / 2.0f;
        } else if (minAngle < 0.0f) {
            minAngle = 0.0f;
        }
        this.d0 = minAngle;
    }

    @Override // b.c.a.a.b.a
    public void onDetachedFromWindow() {
        b.c.a.a.i.c cVar = this.s;
        if (cVar != null && (cVar instanceof g)) {
            ((g) cVar).q();
        }
        super.onDetachedFromWindow();
    }
}
