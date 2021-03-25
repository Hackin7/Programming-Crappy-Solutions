package b.c.a.a.i;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import b.c.a.a.a.a;
import b.c.a.a.b.c;
import b.c.a.a.d.i;
import b.c.a.a.d.j;
import b.c.a.a.f.b;
import b.c.a.a.j.f;
import b.c.a.a.j.g;

public class h extends e {

    /* renamed from: g  reason: collision with root package name */
    public c f2504g;
    public Paint h;
    public Paint i;
    public Path j = new Path();
    public Path k = new Path();

    public h(c chart, a animator, g viewPortHandler) {
        super(animator, viewPortHandler);
        this.f2504g = chart;
        Paint paint = new Paint(1);
        this.f2493d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f2493d.setStrokeWidth(2.0f);
        this.f2493d.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.h = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.i = new Paint(1);
    }

    @Override // b.c.a.a.i.c
    public void b(Canvas c2) {
        i radarData = (i) this.f2504g.getData();
        int mostEntries = ((b.c.a.a.g.a.h) radarData.k()).E();
        for (b.c.a.a.g.a.h set : radarData.f()) {
            if (set.isVisible()) {
                l(c2, set, mostEntries);
            }
        }
    }

    public void l(Canvas c2, b.c.a.a.g.a.h dataSet, int mostEntries) {
        float phaseX = this.f2491b.a();
        float phaseY = this.f2491b.b();
        float sliceangle = this.f2504g.getSliceAngle();
        float factor = this.f2504g.getFactor();
        b.c.a.a.j.c center = this.f2504g.getCenterOffsets();
        b.c.a.a.j.c pOut = b.c.a.a.j.c.c(0.0f, 0.0f);
        Path surface = this.j;
        surface.reset();
        boolean hasMovedToPoint = false;
        for (int j2 = 0; j2 < dataSet.E(); j2++) {
            this.f2492c.setColor(dataSet.g0(j2));
            f.p(center, (((j) dataSet.Q(j2)).c() - this.f2504g.getYChartMin()) * factor * phaseY, (((float) j2) * sliceangle * phaseX) + this.f2504g.getRotationAngle(), pOut);
            if (!Float.isNaN(pOut.f2511c)) {
                if (!hasMovedToPoint) {
                    surface.moveTo(pOut.f2511c, pOut.f2512d);
                    hasMovedToPoint = true;
                } else {
                    surface.lineTo(pOut.f2511c, pOut.f2512d);
                }
            }
        }
        if (dataSet.E() > mostEntries) {
            surface.lineTo(center.f2511c, center.f2512d);
        }
        surface.close();
        if (dataSet.V()) {
            Drawable drawable = dataSet.y();
            if (drawable != null) {
                k(c2, surface, drawable);
            } else {
                j(c2, surface, dataSet.l(), dataSet.z());
            }
        }
        this.f2492c.setStrokeWidth(dataSet.X());
        this.f2492c.setStyle(Paint.Style.STROKE);
        if (!dataSet.V() || dataSet.z() < 255) {
            c2.drawPath(surface, this.f2492c);
        }
        b.c.a.a.j.c.f(center);
        b.c.a.a.j.c.f(pOut);
    }

    @Override // b.c.a.a.i.c
    public void e(Canvas c2) {
        b.c.a.a.j.c pOut;
        float yoffset;
        int i2;
        b.c.a.a.j.c pOut2;
        float yoffset2;
        j entry;
        b.c.a.a.g.a.h dataSet;
        b.c.a.a.e.c formatter;
        int j2;
        b.c.a.a.j.c pOut3;
        float phaseX = this.f2491b.a();
        float phaseY = this.f2491b.b();
        float sliceangle = this.f2504g.getSliceAngle();
        float factor = this.f2504g.getFactor();
        b.c.a.a.j.c center = this.f2504g.getCenterOffsets();
        b.c.a.a.j.c iconsOffset = b.c.a.a.j.c.c(0.0f, 0.0f);
        b.c.a.a.j.c pIcon = b.c.a.a.j.c.c(0.0f, 0.0f);
        float yoffset3 = f.e(5.0f);
        int i3 = 0;
        while (i3 < ((i) this.f2504g.getData()).e()) {
            b.c.a.a.g.a.h dataSet2 = (b.c.a.a.g.a.h) ((i) this.f2504g.getData()).d(i3);
            if (!g(dataSet2)) {
                pOut = iconsOffset;
                yoffset = yoffset3;
                i2 = i3;
            } else {
                a(dataSet2);
                b.c.a.a.e.c formatter2 = dataSet2.D();
                b.c.a.a.j.c iconsOffset2 = b.c.a.a.j.c.d(dataSet2.F());
                iconsOffset2.f2511c = f.e(iconsOffset2.f2511c);
                iconsOffset2.f2512d = f.e(iconsOffset2.f2512d);
                int j3 = 0;
                while (j3 < dataSet2.E()) {
                    j entry2 = (j) dataSet2.Q(j3);
                    f.p(center, (entry2.c() - this.f2504g.getYChartMin()) * factor * phaseY, (((float) j3) * sliceangle * phaseX) + this.f2504g.getRotationAngle(), iconsOffset);
                    if (dataSet2.r()) {
                        entry = entry2;
                        yoffset2 = yoffset3;
                        j2 = j3;
                        pOut2 = iconsOffset;
                        pOut3 = iconsOffset2;
                        formatter = formatter2;
                        dataSet = dataSet2;
                        n(c2, formatter2.d(entry2), iconsOffset.f2511c, iconsOffset.f2512d - yoffset3, dataSet2.J(j3));
                    } else {
                        entry = entry2;
                        formatter = formatter2;
                        pOut2 = iconsOffset;
                        yoffset2 = yoffset3;
                        pOut3 = iconsOffset2;
                        j2 = j3;
                        dataSet = dataSet2;
                    }
                    if (entry.b() != null && dataSet.f0()) {
                        Drawable icon = entry.b();
                        f.p(center, (entry.c() * factor * phaseY) + pOut3.f2512d, (((float) j2) * sliceangle * phaseX) + this.f2504g.getRotationAngle(), pIcon);
                        float f2 = pIcon.f2512d + pOut3.f2511c;
                        pIcon.f2512d = f2;
                        f.f(c2, icon, (int) pIcon.f2511c, (int) f2, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    j3 = j2 + 1;
                    iconsOffset2 = pOut3;
                    formatter2 = formatter;
                    dataSet2 = dataSet;
                    i3 = i3;
                    yoffset3 = yoffset2;
                    iconsOffset = pOut2;
                }
                pOut = iconsOffset;
                yoffset = yoffset3;
                i2 = i3;
                b.c.a.a.j.c.f(iconsOffset2);
            }
            i3 = i2 + 1;
            yoffset3 = yoffset;
            iconsOffset = pOut;
        }
        b.c.a.a.j.c.f(center);
        b.c.a.a.j.c.f(iconsOffset);
        b.c.a.a.j.c.f(pIcon);
    }

    public void n(Canvas c2, String valueText, float x, float y, int color) {
        this.f2494e.setColor(color);
        c2.drawText(valueText, x, y, this.f2494e);
    }

    @Override // b.c.a.a.i.c
    public void c(Canvas c2) {
        o(c2);
    }

    public void o(Canvas c2) {
        float sliceangle = this.f2504g.getSliceAngle();
        float factor = this.f2504g.getFactor();
        float rotationangle = this.f2504g.getRotationAngle();
        b.c.a.a.j.c center = this.f2504g.getCenterOffsets();
        this.h.setStrokeWidth(this.f2504g.getWebLineWidth());
        this.h.setColor(this.f2504g.getWebColor());
        this.h.setAlpha(this.f2504g.getWebAlpha());
        int xIncrements = this.f2504g.getSkipWebLineCount() + 1;
        int maxEntryCount = ((b.c.a.a.g.a.h) ((i) this.f2504g.getData()).k()).E();
        b.c.a.a.j.c p = b.c.a.a.j.c.c(0.0f, 0.0f);
        for (int i2 = 0; i2 < maxEntryCount; i2 += xIncrements) {
            f.p(center, this.f2504g.getYRange() * factor, (((float) i2) * sliceangle) + rotationangle, p);
            c2.drawLine(center.f2511c, center.f2512d, p.f2511c, p.f2512d, this.h);
        }
        b.c.a.a.j.c.f(p);
        this.h.setStrokeWidth(this.f2504g.getWebLineWidthInner());
        this.h.setColor(this.f2504g.getWebColorInner());
        this.h.setAlpha(this.f2504g.getWebAlpha());
        int labelCount = this.f2504g.getYAxis().j;
        b.c.a.a.j.c p1out = b.c.a.a.j.c.c(0.0f, 0.0f);
        b.c.a.a.j.c p2out = b.c.a.a.j.c.c(0.0f, 0.0f);
        for (int j2 = 0; j2 < labelCount; j2++) {
            int i3 = 0;
            while (i3 < ((i) this.f2504g.getData()).g()) {
                float r = (this.f2504g.getYAxis().h[j2] - this.f2504g.getYChartMin()) * factor;
                f.p(center, r, (((float) i3) * sliceangle) + rotationangle, p1out);
                f.p(center, r, (((float) (i3 + 1)) * sliceangle) + rotationangle, p2out);
                c2.drawLine(p1out.f2511c, p1out.f2512d, p2out.f2511c, p2out.f2512d, this.h);
                i3++;
                sliceangle = sliceangle;
                factor = factor;
                rotationangle = rotationangle;
            }
        }
        b.c.a.a.j.c.f(p1out);
        b.c.a.a.j.c.f(p2out);
    }

    @Override // b.c.a.a.i.c
    public void d(Canvas c2, b[] indices) {
        int i2;
        int strokeColor;
        float sliceangle = this.f2504g.getSliceAngle();
        float factor = this.f2504g.getFactor();
        b.c.a.a.j.c center = this.f2504g.getCenterOffsets();
        b.c.a.a.j.c pOut = b.c.a.a.j.c.c(0.0f, 0.0f);
        i radarData = (i) this.f2504g.getData();
        int length = indices.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            b high = indices[i4];
            b.c.a.a.g.a.h set = (b.c.a.a.g.a.h) radarData.d(high.b());
            if (set == null) {
                i2 = i4;
            } else if (!set.K()) {
                i2 = i4;
            } else {
                j e2 = (j) set.Q((int) high.e());
                if (!f(e2, set)) {
                    i2 = i4;
                } else {
                    f.p(center, (e2.c() - this.f2504g.getYChartMin()) * factor * this.f2491b.b(), (high.e() * sliceangle * this.f2491b.a()) + this.f2504g.getRotationAngle(), pOut);
                    high.g(pOut.f2511c, pOut.f2512d);
                    h(c2, pOut.f2511c, pOut.f2512d, set);
                    if (!set.d0()) {
                        i2 = i4;
                    } else if (Float.isNaN(pOut.f2511c) || Float.isNaN(pOut.f2512d)) {
                        i2 = i4;
                    } else {
                        int strokeColor2 = set.U();
                        if (strokeColor2 == 1122867) {
                            strokeColor2 = set.g0(i3);
                        }
                        if (set.C() < 255) {
                            strokeColor = b.c.a.a.j.a.a(strokeColor2, set.C());
                        } else {
                            strokeColor = strokeColor2;
                        }
                        i2 = i4;
                        m(c2, pOut, set.x(), set.o(), set.s(), strokeColor, set.f());
                    }
                }
            }
            i4 = i2 + 1;
            i3 = 0;
        }
        b.c.a.a.j.c.f(center);
        b.c.a.a.j.c.f(pOut);
    }

    public void m(Canvas c2, b.c.a.a.j.c point, float innerRadius, float outerRadius, int fillColor, int strokeColor, float strokeWidth) {
        c2.save();
        float outerRadius2 = f.e(outerRadius);
        float innerRadius2 = f.e(innerRadius);
        if (fillColor != 1122867) {
            Path p = this.k;
            p.reset();
            p.addCircle(point.f2511c, point.f2512d, outerRadius2, Path.Direction.CW);
            if (innerRadius2 > 0.0f) {
                p.addCircle(point.f2511c, point.f2512d, innerRadius2, Path.Direction.CCW);
            }
            this.i.setColor(fillColor);
            this.i.setStyle(Paint.Style.FILL);
            c2.drawPath(p, this.i);
        }
        if (strokeColor != 1122867) {
            this.i.setColor(strokeColor);
            this.i.setStyle(Paint.Style.STROKE);
            this.i.setStrokeWidth(f.e(strokeWidth));
            c2.drawCircle(point.f2511c, point.f2512d, outerRadius2, this.i);
        }
        c2.restore();
    }
}
