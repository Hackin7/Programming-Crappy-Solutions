package b.c.a.a.b;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import b.c.a.a.c.e;
import b.c.a.a.c.h;
import b.c.a.a.d.c;
import b.c.a.a.d.e;
import b.c.a.a.g.a.d;
import b.c.a.a.h.a;
import b.c.a.a.j.f;

public abstract class b<T extends c<? extends d<? extends e>>> extends a<T> {
    public float H = 270.0f;
    public float I = 270.0f;
    public boolean J = true;
    public float K = 0.0f;

    public abstract float getRadius();

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public abstract int t(float f2);

    public b(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // b.c.a.a.b.a
    public void i() {
        super.i();
        this.o = new b.c.a.a.h.d(this);
    }

    public void q() {
    }

    @Override // b.c.a.a.b.a
    public int getMaxVisibleCount() {
        return this.f2384c.g();
    }

    public boolean onTouchEvent(MotionEvent event) {
        a aVar;
        if (!this.k || (aVar = this.o) == null) {
            return super.onTouchEvent(event);
        }
        return aVar.onTouch(this, event);
    }

    public void computeScroll() {
        a aVar = this.o;
        if (aVar instanceof b.c.a.a.h.d) {
            ((b.c.a.a.h.d) aVar).g();
        }
    }

    @Override // b.c.a.a.b.a
    public void m() {
        if (this.f2384c != null) {
            q();
            if (this.m != null) {
                this.r.a(this.f2384c);
            }
            a();
        }
    }

    @Override // b.c.a.a.b.a
    public void a() {
        float legendBottom;
        float legendRight;
        float legendLeft;
        float legendBottom2;
        float yOffset;
        float legendRight2;
        float legendBottom3;
        float legendRight3;
        float legendLeft2;
        float legendBottom4;
        float legendRight4;
        float legendLeft3;
        float legendTop = 0.0f;
        b.c.a.a.c.e eVar = this.m;
        if (eVar == null || !eVar.f() || this.m.C()) {
            legendLeft = 0.0f;
            legendRight = 0.0f;
            legendBottom = 0.0f;
        } else {
            float fullLegendWidth = Math.min(this.m.w, this.u.g() * this.m.u());
            int ordinal = this.m.x().ordinal();
            if (ordinal == 0) {
                legendLeft2 = 0.0f;
                legendRight3 = 0.0f;
                legendBottom3 = 0.0f;
                if (this.m.z() == e.EnumC0051e.TOP || this.m.z() == e.EnumC0051e.BOTTOM) {
                    float yLegendOffset = Math.min(this.m.x + getRequiredLegendOffset(), this.u.f() * this.m.u());
                    int ordinal2 = this.m.z().ordinal();
                    if (ordinal2 == 0) {
                        legendTop = yLegendOffset;
                        legendRight2 = 0.0f;
                        yOffset = 0.0f;
                        legendBottom2 = 0.0f;
                    } else if (ordinal2 == 2) {
                        legendBottom2 = yLegendOffset;
                        legendRight2 = 0.0f;
                        yOffset = 0.0f;
                    }
                    legendLeft = legendRight2 + getRequiredBaseOffset();
                    legendRight = yOffset + getRequiredBaseOffset();
                    legendTop += getRequiredBaseOffset();
                    legendBottom = legendBottom2 + getRequiredBaseOffset();
                }
            } else if (ordinal != 1) {
                legendLeft2 = 0.0f;
                legendRight3 = 0.0f;
                legendBottom3 = 0.0f;
            } else {
                float xLegendOffset = 0.0f;
                if (this.m.t() != e.c.LEFT && this.m.t() != e.c.RIGHT) {
                    legendLeft3 = 0.0f;
                    legendRight4 = 0.0f;
                    legendBottom4 = 0.0f;
                } else if (this.m.z() == e.EnumC0051e.CENTER) {
                    xLegendOffset = fullLegendWidth + f.e(13.0f);
                    legendLeft3 = 0.0f;
                    legendRight4 = 0.0f;
                    legendBottom4 = 0.0f;
                } else {
                    float legendWidth = fullLegendWidth + f.e(8.0f);
                    b.c.a.a.c.e eVar2 = this.m;
                    float legendHeight = eVar2.x + eVar2.y;
                    b.c.a.a.j.c center = getCenter();
                    float bottomX = this.m.t() == e.c.RIGHT ? (((float) getWidth()) - legendWidth) + 15.0f : legendWidth - 15.0f;
                    float bottomY = 15.0f + legendHeight;
                    float distLegend = r(bottomX, bottomY);
                    b.c.a.a.j.c reference = u(center, getRadius(), s(bottomX, bottomY));
                    legendLeft3 = 0.0f;
                    float distReference = r(reference.f2511c, reference.f2512d);
                    float minOffset = f.e(5.0f);
                    legendRight4 = 0.0f;
                    if (bottomY >= center.f2512d) {
                        legendBottom4 = 0.0f;
                        if (((float) getHeight()) - legendWidth > ((float) getWidth())) {
                            xLegendOffset = legendWidth;
                            b.c.a.a.j.c.f(center);
                            b.c.a.a.j.c.f(reference);
                        }
                    } else {
                        legendBottom4 = 0.0f;
                    }
                    if (distLegend < distReference) {
                        xLegendOffset = minOffset + (distReference - distLegend);
                    }
                    b.c.a.a.j.c.f(center);
                    b.c.a.a.j.c.f(reference);
                }
                int ordinal3 = this.m.t().ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        int ordinal4 = this.m.z().ordinal();
                        if (ordinal4 == 0) {
                            legendTop = Math.min(this.m.x, this.u.f() * this.m.u());
                            legendRight2 = legendLeft3;
                            yOffset = legendRight4;
                            legendBottom2 = legendBottom4;
                        } else if (ordinal4 == 2) {
                            legendBottom2 = Math.min(this.m.x, this.u.f() * this.m.u());
                            legendRight2 = legendLeft3;
                            yOffset = legendRight4;
                        }
                    } else if (ordinal3 == 2) {
                        yOffset = xLegendOffset;
                        legendRight2 = legendLeft3;
                        legendBottom2 = legendBottom4;
                    }
                    legendRight2 = legendLeft3;
                    yOffset = legendRight4;
                    legendBottom2 = legendBottom4;
                } else {
                    legendRight2 = xLegendOffset;
                    yOffset = legendRight4;
                    legendBottom2 = legendBottom4;
                }
                legendLeft = legendRight2 + getRequiredBaseOffset();
                legendRight = yOffset + getRequiredBaseOffset();
                legendTop += getRequiredBaseOffset();
                legendBottom = legendBottom2 + getRequiredBaseOffset();
            }
            legendRight2 = legendLeft2;
            yOffset = legendRight3;
            legendBottom2 = legendBottom3;
            legendLeft = legendRight2 + getRequiredBaseOffset();
            legendRight = yOffset + getRequiredBaseOffset();
            legendTop += getRequiredBaseOffset();
            legendBottom = legendBottom2 + getRequiredBaseOffset();
        }
        float minOffset2 = f.e(this.K);
        if (this instanceof c) {
            h x = getXAxis();
            if (x.f() && x.p()) {
                minOffset2 = Math.max(minOffset2, (float) x.C);
            }
        }
        float legendTop2 = legendTop + getExtraTopOffset();
        float legendRight5 = legendRight + getExtraRightOffset();
        float legendBottom5 = legendBottom + getExtraBottomOffset();
        float offsetLeft = Math.max(minOffset2, legendLeft + getExtraLeftOffset());
        float offsetTop = Math.max(minOffset2, legendTop2);
        float offsetRight = Math.max(minOffset2, legendRight5);
        float offsetBottom = Math.max(minOffset2, Math.max(getRequiredBaseOffset(), legendBottom5));
        this.u.x(offsetLeft, offsetTop, offsetRight, offsetBottom);
        if (this.f2383b) {
            Log.i("MPAndroidChart", "offsetLeft: " + offsetLeft + ", offsetTop: " + offsetTop + ", offsetRight: " + offsetRight + ", offsetBottom: " + offsetBottom);
        }
    }

    public float s(float x, float y) {
        b.c.a.a.j.c c2 = getCenterOffsets();
        double tx = (double) (x - c2.f2511c);
        double ty = (double) (y - c2.f2512d);
        float angle = (float) Math.toDegrees(Math.acos(ty / Math.sqrt((tx * tx) + (ty * ty))));
        if (x > c2.f2511c) {
            angle = 360.0f - angle;
        }
        float angle2 = angle + 90.0f;
        if (angle2 > 360.0f) {
            angle2 -= 360.0f;
        }
        b.c.a.a.j.c.f(c2);
        return angle2;
    }

    public b.c.a.a.j.c u(b.c.a.a.j.c center, float dist, float angle) {
        b.c.a.a.j.c p = b.c.a.a.j.c.c(0.0f, 0.0f);
        v(center, dist, angle, p);
        return p;
    }

    public void v(b.c.a.a.j.c center, float dist, float angle, b.c.a.a.j.c outputPoint) {
        outputPoint.f2511c = (float) (((double) center.f2511c) + (((double) dist) * Math.cos(Math.toRadians((double) angle))));
        outputPoint.f2512d = (float) (((double) center.f2512d) + (((double) dist) * Math.sin(Math.toRadians((double) angle))));
    }

    public float r(float x, float y) {
        float xDist;
        float yDist;
        b.c.a.a.j.c c2 = getCenterOffsets();
        float f2 = c2.f2511c;
        if (x > f2) {
            xDist = x - f2;
        } else {
            xDist = f2 - x;
        }
        float f3 = c2.f2512d;
        if (y > f3) {
            yDist = y - f3;
        } else {
            yDist = f3 - y;
        }
        float dist = (float) Math.sqrt(Math.pow((double) xDist, 2.0d) + Math.pow((double) yDist, 2.0d));
        b.c.a.a.j.c.f(c2);
        return dist;
    }

    public void setRotationAngle(float angle) {
        this.I = angle;
        this.H = f.o(angle);
    }

    public float getRawRotationAngle() {
        return this.I;
    }

    public float getRotationAngle() {
        return this.H;
    }

    public void setRotationEnabled(boolean enabled) {
        this.J = enabled;
    }

    public boolean w() {
        return this.J;
    }

    public float getMinOffset() {
        return this.K;
    }

    public void setMinOffset(float minOffset) {
        this.K = minOffset;
    }

    public float getDiameter() {
        RectF content = this.u.i();
        content.left += getExtraLeftOffset();
        content.top += getExtraTopOffset();
        content.right -= getExtraRightOffset();
        content.bottom -= getExtraBottomOffset();
        return Math.min(content.width(), content.height());
    }

    @Override // b.c.a.a.b.a
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // b.c.a.a.b.a
    public float getYChartMin() {
        return 0.0f;
    }
}
