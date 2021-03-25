package b.c.a.a.i;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import b.c.a.a.a.a;
import b.c.a.a.d.g;
import b.c.a.a.d.h;
import b.c.a.a.f.b;
import b.c.a.a.j.c;
import b.c.a.a.j.f;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import java.lang.ref.WeakReference;
import java.util.List;

public class g extends c {

    /* renamed from: f  reason: collision with root package name */
    public PieChart f2502f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f2503g;
    public Paint h;
    public Paint i;
    public TextPaint j;
    public Paint k;
    public StaticLayout l;
    public CharSequence m;
    public RectF n = new RectF();
    public RectF[] o = {new RectF(), new RectF(), new RectF()};
    public WeakReference<Bitmap> p;
    public Canvas q;
    public Path r = new Path();
    public RectF s = new RectF();
    public Path t = new Path();
    public Path u = new Path();
    public RectF v = new RectF();

    public g(PieChart chart, a animator, b.c.a.a.j.g viewPortHandler) {
        super(animator, viewPortHandler);
        this.f2502f = chart;
        Paint paint = new Paint(1);
        this.f2503g = paint;
        paint.setColor(-1);
        this.f2503g.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.h = paint2;
        paint2.setColor(-1);
        this.h.setStyle(Paint.Style.FILL);
        this.h.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.j = textPaint;
        textPaint.setColor(-16777216);
        this.j.setTextSize(f.e(12.0f));
        this.f2494e.setTextSize(f.e(13.0f));
        this.f2494e.setColor(-1);
        this.f2494e.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.k = paint3;
        paint3.setColor(-1);
        this.k.setTextAlign(Paint.Align.CENTER);
        this.k.setTextSize(f.e(13.0f));
        Paint paint4 = new Paint(1);
        this.i = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    public Paint n() {
        return this.f2503g;
    }

    public Paint o() {
        return this.h;
    }

    public TextPaint l() {
        return this.j;
    }

    public Paint m() {
        return this.k;
    }

    @Override // b.c.a.a.i.c
    public void b(Canvas c2) {
        int width = (int) this.f2505a.g();
        int height = (int) this.f2505a.f();
        WeakReference<Bitmap> weakReference = this.p;
        Bitmap drawBitmap = weakReference == null ? null : weakReference.get();
        if (!(drawBitmap != null && drawBitmap.getWidth() == width && drawBitmap.getHeight() == height)) {
            if (width > 0 && height > 0) {
                drawBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
                this.p = new WeakReference<>(drawBitmap);
                this.q = new Canvas(drawBitmap);
            } else {
                return;
            }
        }
        drawBitmap.eraseColor(0);
        for (b.c.a.a.g.a.g set : ((b.c.a.a.d.f) this.f2502f.getData()).f()) {
            if (set.isVisible() && set.E() > 0) {
                h(set);
            }
        }
    }

    public float f(c center, float radius, float angle, float arcStartPointX, float arcStartPointY, float startAngle, float sweepAngle) {
        float angleMiddle = startAngle + (sweepAngle / 2.0f);
        float arcEndPointX = center.f2511c + (((float) Math.cos((double) ((startAngle + sweepAngle) * 0.017453292f))) * radius);
        float arcEndPointY = center.f2512d + (((float) Math.sin((double) ((startAngle + sweepAngle) * 0.017453292f))) * radius);
        return (float) (((double) (radius - ((float) ((Math.sqrt(Math.pow((double) (arcEndPointX - arcStartPointX), 2.0d) + Math.pow((double) (arcEndPointY - arcStartPointY), 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) angle)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((double) ((center.f2511c + (((float) Math.cos((double) (angleMiddle * 0.017453292f))) * radius)) - ((arcEndPointX + arcStartPointX) / 2.0f)), 2.0d) + Math.pow((double) ((center.f2512d + (((float) Math.sin((double) (0.017453292f * angleMiddle))) * radius)) - ((arcEndPointY + arcStartPointY) / 2.0f)), 2.0d)));
    }

    public float p(b.c.a.a.g.a.g dataSet) {
        if (!dataSet.G()) {
            return dataSet.w();
        }
        if (dataSet.w() / this.f2505a.j() > (dataSet.n() / ((b.c.a.a.d.f) this.f2502f.getData()).s()) * 2.0f) {
            return 0.0f;
        }
        return dataSet.w();
    }

    /* JADX INFO: Multiple debug info for r10v11 'center'  b.c.a.a.j.c: [D('arcStartPointY' float), D('center' b.c.a.a.j.c)] */
    /* JADX INFO: Multiple debug info for r10v12 'center'  b.c.a.a.j.c: [D('arcStartPointY' float), D('center' b.c.a.a.j.c)] */
    /* JADX INFO: Multiple debug info for r6v14 'roundedCircleBox'  android.graphics.RectF: [D('y' float), D('roundedCircleBox' android.graphics.RectF)] */
    public void h(b.c.a.a.g.a.g dataSet) {
        float rotationAngle;
        int visibleAngleCount;
        float radius;
        float phaseX;
        float[] drawAngles;
        RectF circleBox;
        int entryCount;
        int j2;
        RectF roundedCircleBox;
        c center;
        int visibleAngleCount2;
        int j3;
        float arcStartPointX;
        float f2;
        float startAngleOuter;
        RectF roundedCircleBox2;
        c center2;
        RectF roundedCircleBox3;
        int i2;
        int visibleAngleCount3;
        c center3;
        RectF roundedCircleBox4;
        g gVar = this;
        b.c.a.a.g.a.g gVar2 = dataSet;
        float rotationAngle2 = gVar.f2502f.getRotationAngle();
        float phaseX2 = gVar.f2491b.a();
        float phaseY = gVar.f2491b.b();
        RectF circleBox2 = gVar.f2502f.getCircleBox();
        int entryCount2 = dataSet.E();
        float[] drawAngles2 = gVar.f2502f.getDrawAngles();
        c center4 = gVar.f2502f.getCenterCircleBox();
        float radius2 = gVar.f2502f.getRadius();
        boolean drawInnerArc = gVar.f2502f.B() && !gVar.f2502f.D();
        float userInnerRadius = drawInnerArc ? (gVar.f2502f.getHoleRadius() / 100.0f) * radius2 : 0.0f;
        float roundedRadius = (radius2 - ((gVar.f2502f.getHoleRadius() * radius2) / 100.0f)) / 2.0f;
        RectF roundedCircleBox5 = new RectF();
        boolean drawRoundedSlices = drawInnerArc && gVar.f2502f.C();
        int visibleAngleCount4 = 0;
        for (int j4 = 0; j4 < entryCount2; j4++) {
            if (Math.abs(((h) gVar2.Q(j4)).c()) > f.f2523b) {
                visibleAngleCount4++;
            }
        }
        float sliceSpace = visibleAngleCount4 <= 1 ? 0.0f : p(dataSet);
        float angle = 0.0f;
        int j5 = 0;
        while (j5 < entryCount2) {
            float sliceAngle = drawAngles2[j5];
            float innerRadius = userInnerRadius;
            if (Math.abs(gVar2.Q(j5).c()) <= f.f2523b) {
                angle += sliceAngle * phaseX2;
                j2 = j5;
                visibleAngleCount = visibleAngleCount4;
                radius = radius2;
                rotationAngle = rotationAngle2;
                phaseX = phaseX2;
                circleBox = circleBox2;
                entryCount = entryCount2;
                drawAngles = drawAngles2;
                roundedCircleBox = roundedCircleBox5;
                center = center4;
            } else if (!gVar.f2502f.F(j5) || drawRoundedSlices) {
                boolean accountForSliceSpacing = sliceSpace > 0.0f && sliceAngle <= 180.0f;
                gVar.f2492c.setColor(gVar2.g0(j5));
                float sliceSpaceAngleOuter = visibleAngleCount4 == 1 ? 0.0f : sliceSpace / (radius2 * 0.017453292f);
                float startAngleOuter2 = ((angle + (sliceSpaceAngleOuter / 2.0f)) * phaseY) + rotationAngle2;
                float sweepAngleOuter = (sliceAngle - sliceSpaceAngleOuter) * phaseY;
                float sweepAngleOuter2 = sweepAngleOuter < 0.0f ? 0.0f : sweepAngleOuter;
                gVar.r.reset();
                if (drawRoundedSlices) {
                    j3 = j5;
                    visibleAngleCount2 = visibleAngleCount4;
                    float x = center4.f2511c + ((radius2 - roundedRadius) * ((float) Math.cos((double) (startAngleOuter2 * 0.017453292f))));
                    entryCount = entryCount2;
                    drawAngles = drawAngles2;
                    float y = center4.f2512d + ((radius2 - roundedRadius) * ((float) Math.sin((double) (startAngleOuter2 * 0.017453292f))));
                    roundedCircleBox5.set(x - roundedRadius, y - roundedRadius, x + roundedRadius, y + roundedRadius);
                } else {
                    j3 = j5;
                    visibleAngleCount2 = visibleAngleCount4;
                    entryCount = entryCount2;
                    drawAngles = drawAngles2;
                }
                float arcStartPointX2 = center4.f2511c + (((float) Math.cos((double) (startAngleOuter2 * 0.017453292f))) * radius2);
                phaseX = phaseX2;
                float arcStartPointY = center4.f2512d + (((float) Math.sin((double) (startAngleOuter2 * 0.017453292f))) * radius2);
                if (sweepAngleOuter2 < 360.0f || sweepAngleOuter2 % 360.0f > f.f2523b) {
                    if (drawRoundedSlices) {
                        gVar.r.arcTo(roundedCircleBox5, startAngleOuter2 + 180.0f, -180.0f);
                    }
                    gVar.r.arcTo(circleBox2, startAngleOuter2, sweepAngleOuter2);
                } else {
                    gVar.r.addCircle(center4.f2511c, center4.f2512d, radius2, Path.Direction.CW);
                }
                RectF rectF = gVar.s;
                float f3 = center4.f2511c;
                float f4 = center4.f2512d;
                rectF.set(f3 - innerRadius, f4 - innerRadius, f3 + innerRadius, f4 + innerRadius);
                if (!drawInnerArc) {
                    rotationAngle = rotationAngle2;
                    j2 = j3;
                    visibleAngleCount = visibleAngleCount2;
                    startAngleOuter = startAngleOuter2;
                    radius = radius2;
                    circleBox = circleBox2;
                    arcStartPointX = arcStartPointX2;
                    f2 = innerRadius;
                    roundedCircleBox2 = roundedCircleBox5;
                } else if (innerRadius > 0.0f || accountForSliceSpacing) {
                    if (accountForSliceSpacing) {
                        j2 = j3;
                        circleBox = circleBox2;
                        visibleAngleCount3 = visibleAngleCount2;
                        roundedCircleBox3 = roundedCircleBox5;
                        i2 = 1;
                        radius = radius2;
                        center2 = center4;
                        float minSpacedRadius = f(center4, radius2, sliceAngle * phaseY, arcStartPointX2, arcStartPointY, startAngleOuter2, sweepAngleOuter2);
                        if (minSpacedRadius < 0.0f) {
                            minSpacedRadius = -minSpacedRadius;
                        }
                        innerRadius = Math.max(innerRadius, minSpacedRadius);
                    } else {
                        roundedCircleBox3 = roundedCircleBox5;
                        center2 = center4;
                        j2 = j3;
                        visibleAngleCount3 = visibleAngleCount2;
                        radius = radius2;
                        circleBox = circleBox2;
                        i2 = 1;
                    }
                    float sliceSpaceAngleInner = (visibleAngleCount3 == i2 || innerRadius == 0.0f) ? 0.0f : sliceSpace / (innerRadius * 0.017453292f);
                    float startAngleInner = ((angle + (sliceSpaceAngleInner / 2.0f)) * phaseY) + rotationAngle2;
                    float sweepAngleInner = (sliceAngle - sliceSpaceAngleInner) * phaseY;
                    if (sweepAngleInner < 0.0f) {
                        sweepAngleInner = 0.0f;
                    }
                    float endAngleInner = startAngleInner + sweepAngleInner;
                    if (sweepAngleOuter2 < 360.0f || sweepAngleOuter2 % 360.0f > f.f2523b) {
                        visibleAngleCount = visibleAngleCount3;
                        center3 = center2;
                        gVar = this;
                        if (drawRoundedSlices) {
                            float x2 = center3.f2511c + ((radius - roundedRadius) * ((float) Math.cos((double) (endAngleInner * 0.017453292f))));
                            rotationAngle = rotationAngle2;
                            float y2 = center3.f2512d + ((radius - roundedRadius) * ((float) Math.sin((double) (endAngleInner * 0.017453292f))));
                            float sliceSpaceAngleInner2 = y2 + roundedRadius;
                            roundedCircleBox4 = roundedCircleBox3;
                            roundedCircleBox4.set(x2 - roundedRadius, y2 - roundedRadius, x2 + roundedRadius, sliceSpaceAngleInner2);
                            gVar.r.arcTo(roundedCircleBox4, endAngleInner, 180.0f);
                        } else {
                            rotationAngle = rotationAngle2;
                            roundedCircleBox4 = roundedCircleBox3;
                            gVar.r.lineTo(center3.f2511c + (((float) Math.cos((double) (endAngleInner * 0.017453292f))) * innerRadius), center3.f2512d + (((float) Math.sin((double) (endAngleInner * 0.017453292f))) * innerRadius));
                        }
                        gVar.r.arcTo(gVar.s, endAngleInner, -sweepAngleInner);
                    } else {
                        visibleAngleCount = visibleAngleCount3;
                        gVar = this;
                        center3 = center2;
                        gVar.r.addCircle(center3.f2511c, center3.f2512d, innerRadius, Path.Direction.CCW);
                        rotationAngle = rotationAngle2;
                        roundedCircleBox4 = roundedCircleBox3;
                    }
                    roundedCircleBox = roundedCircleBox4;
                    center = center3;
                    gVar.r.close();
                    gVar.q.drawPath(gVar.r, gVar.f2492c);
                    angle += sliceAngle * phaseX;
                } else {
                    rotationAngle = rotationAngle2;
                    j2 = j3;
                    visibleAngleCount = visibleAngleCount2;
                    startAngleOuter = startAngleOuter2;
                    radius = radius2;
                    circleBox = circleBox2;
                    arcStartPointX = arcStartPointX2;
                    f2 = innerRadius;
                    roundedCircleBox2 = roundedCircleBox5;
                }
                if (sweepAngleOuter2 % 360.0f <= f.f2523b) {
                    roundedCircleBox = roundedCircleBox2;
                    center = center4;
                } else if (accountForSliceSpacing) {
                    float angleMiddle = startAngleOuter + (sweepAngleOuter2 / 2.0f);
                    roundedCircleBox = roundedCircleBox2;
                    center = center4;
                    float sliceSpaceOffset = f(center4, radius, sliceAngle * phaseY, arcStartPointX, arcStartPointY, startAngleOuter, sweepAngleOuter2);
                    gVar.r.lineTo(center.f2511c + (((float) Math.cos((double) (angleMiddle * 0.017453292f))) * sliceSpaceOffset), center.f2512d + (((float) Math.sin((double) (angleMiddle * 0.017453292f))) * sliceSpaceOffset));
                } else {
                    roundedCircleBox = roundedCircleBox2;
                    center = center4;
                    gVar.r.lineTo(center.f2511c, center.f2512d);
                }
                gVar.r.close();
                gVar.q.drawPath(gVar.r, gVar.f2492c);
                angle += sliceAngle * phaseX;
            } else {
                angle += sliceAngle * phaseX2;
                j2 = j5;
                visibleAngleCount = visibleAngleCount4;
                radius = radius2;
                rotationAngle = rotationAngle2;
                phaseX = phaseX2;
                circleBox = circleBox2;
                entryCount = entryCount2;
                drawAngles = drawAngles2;
                roundedCircleBox = roundedCircleBox5;
                center = center4;
            }
            j5 = j2 + 1;
            gVar2 = dataSet;
            center4 = center;
            roundedCircleBox5 = roundedCircleBox;
            entryCount2 = entryCount;
            circleBox2 = circleBox;
            drawAngles2 = drawAngles;
            phaseX2 = phaseX;
            radius2 = radius;
            visibleAngleCount4 = visibleAngleCount;
            rotationAngle2 = rotationAngle;
        }
        c.f(center4);
    }

    /* JADX INFO: Multiple debug info for r10v5 float: [D('transformedAngle' float), D('drawAngles' float[])] */
    @Override // b.c.a.a.i.c
    public void e(Canvas c2) {
        float labelRadiusOffset;
        float rotationAngle;
        float radius;
        float rotationAngle2;
        float phaseY;
        float phaseX;
        List<IPieDataSet> dataSets;
        float[] absoluteAngles;
        float[] drawAngles;
        float labelRadiusOffset2;
        int i2;
        Canvas canvas;
        float angle;
        float value;
        b.c.a.a.e.c formatter;
        float radius2;
        g.a yValuePosition;
        List<IPieDataSet> dataSets2;
        int entryCount;
        g.a xValuePosition;
        float sliceXBase;
        Canvas canvas2;
        c iconsOffset;
        b.c.a.a.g.a.g dataSet;
        float rotationAngle3;
        float line1Radius;
        float polyline2Width;
        float labelPty;
        float pt2y;
        float pt2x;
        float labelPtx;
        float labelPtx2;
        Canvas canvas3 = c2;
        c center = this.f2502f.getCenterCircleBox();
        float radius3 = this.f2502f.getRadius();
        float rotationAngle4 = this.f2502f.getRotationAngle();
        float[] drawAngles2 = this.f2502f.getDrawAngles();
        float[] absoluteAngles2 = this.f2502f.getAbsoluteAngles();
        float phaseX2 = this.f2491b.a();
        float phaseY2 = this.f2491b.b();
        float roundedRadius = (radius3 - ((this.f2502f.getHoleRadius() * radius3) / 100.0f)) / 2.0f;
        float holeRadiusPercent = this.f2502f.getHoleRadius() / 100.0f;
        float labelRadiusOffset3 = (radius3 / 10.0f) * 3.6f;
        if (this.f2502f.B()) {
            float labelRadiusOffset4 = (radius3 - (radius3 * holeRadiusPercent)) / 2.0f;
            if (this.f2502f.D() || !this.f2502f.C()) {
                rotationAngle = rotationAngle4;
                labelRadiusOffset = labelRadiusOffset4;
            } else {
                rotationAngle = (float) (((double) rotationAngle4) + (((double) (360.0f * roundedRadius)) / (((double) radius3) * 6.283185307179586d)));
                labelRadiusOffset = labelRadiusOffset4;
            }
        } else {
            rotationAngle = rotationAngle4;
            labelRadiusOffset = labelRadiusOffset3;
        }
        float labelRadius = radius3 - labelRadiusOffset;
        b.c.a.a.d.f data = (b.c.a.a.d.f) this.f2502f.getData();
        List<IPieDataSet> dataSets3 = data.f();
        float yValueSum = data.s();
        boolean drawEntryLabels = this.f2502f.A();
        int xIndex = 0;
        c2.save();
        float offset = f.e(5.0f);
        int i3 = 0;
        while (i3 < dataSets3.size()) {
            b.c.a.a.g.a.g dataSet2 = (b.c.a.a.g.a.g) dataSets3.get(i3);
            boolean drawValues = dataSet2.r();
            if (drawValues || drawEntryLabels) {
                g.a xValuePosition2 = dataSet2.e();
                g.a yValuePosition2 = dataSet2.O();
                a(dataSet2);
                int xIndex2 = xIndex;
                i2 = i3;
                float lineHeight = ((float) f.a(this.f2494e, "Q")) + f.e(4.0f);
                b.c.a.a.e.c formatter2 = dataSet2.D();
                int entryCount2 = dataSet2.E();
                List<IPieDataSet> dataSets4 = dataSets3;
                labelRadiusOffset2 = labelRadiusOffset;
                this.i.setColor(dataSet2.Z());
                this.i.setStrokeWidth(f.e(dataSet2.a()));
                float sliceSpace = p(dataSet2);
                c iconsOffset2 = c.d(dataSet2.F());
                iconsOffset2.f2511c = f.e(iconsOffset2.f2511c);
                iconsOffset2.f2512d = f.e(iconsOffset2.f2512d);
                int j2 = 0;
                while (j2 < entryCount2) {
                    h entry = (h) dataSet2.Q(j2);
                    if (xIndex2 == 0) {
                        angle = 0.0f;
                    } else {
                        angle = absoluteAngles2[xIndex2 - 1] * phaseX2;
                    }
                    float transformedAngle = rotationAngle + ((angle + ((drawAngles2[xIndex2] - ((sliceSpace / (labelRadius * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY2);
                    if (this.f2502f.E()) {
                        value = (entry.c() / yValueSum) * 100.0f;
                    } else {
                        value = entry.c();
                    }
                    String formattedValue = formatter2.c(value);
                    String entryLabel = entry.f();
                    float sliceXBase2 = (float) Math.cos((double) (transformedAngle * 0.017453292f));
                    float sliceYBase = (float) Math.sin((double) (transformedAngle * 0.017453292f));
                    boolean drawXOutside = drawEntryLabels && xValuePosition2 == g.a.OUTSIDE_SLICE;
                    boolean drawYOutside = drawValues && yValuePosition2 == g.a.OUTSIDE_SLICE;
                    boolean drawXInside = drawEntryLabels && xValuePosition2 == g.a.INSIDE_SLICE;
                    boolean drawYInside = drawValues && yValuePosition2 == g.a.INSIDE_SLICE;
                    if (drawXOutside || drawYOutside) {
                        float valueLineLength1 = dataSet2.b();
                        float valueLineLength2 = dataSet2.c0();
                        float valueLinePart1OffsetPercentage = dataSet2.p() / 100.0f;
                        if (this.f2502f.B()) {
                            line1Radius = ((radius3 - (radius3 * holeRadiusPercent)) * valueLinePart1OffsetPercentage) + (radius3 * holeRadiusPercent);
                        } else {
                            line1Radius = radius3 * valueLinePart1OffsetPercentage;
                        }
                        if (dataSet2.S()) {
                            yValuePosition = yValuePosition2;
                            xValuePosition = xValuePosition2;
                            polyline2Width = labelRadius * valueLineLength2 * ((float) Math.abs(Math.sin((double) (transformedAngle * 0.017453292f))));
                        } else {
                            yValuePosition = yValuePosition2;
                            xValuePosition = xValuePosition2;
                            polyline2Width = labelRadius * valueLineLength2;
                        }
                        float f2 = center.f2511c;
                        float pt0x = (line1Radius * sliceXBase2) + f2;
                        float f3 = center.f2512d;
                        float pt0y = (line1Radius * sliceYBase) + f3;
                        float pt1x = ((valueLineLength1 + 1.0f) * labelRadius * sliceXBase2) + f2;
                        float pt1y = ((valueLineLength1 + 1.0f) * labelRadius * sliceYBase) + f3;
                        if (((double) transformedAngle) % 360.0d < 90.0d || ((double) transformedAngle) % 360.0d > 270.0d) {
                            float pt2x2 = pt1x + polyline2Width;
                            this.f2494e.setTextAlign(Paint.Align.LEFT);
                            if (drawXOutside) {
                                this.k.setTextAlign(Paint.Align.LEFT);
                            }
                            pt2x = pt2x2;
                            pt2y = pt1y;
                            labelPty = pt1y;
                            labelPtx = pt2x2 + offset;
                        } else {
                            float pt2x3 = pt1x - polyline2Width;
                            this.f2494e.setTextAlign(Paint.Align.RIGHT);
                            if (drawXOutside) {
                                this.k.setTextAlign(Paint.Align.RIGHT);
                            }
                            pt2x = pt2x3;
                            pt2y = pt1y;
                            labelPty = pt1y;
                            labelPtx = pt2x3 - offset;
                        }
                        if (dataSet2.Z() != 1122867) {
                            if (dataSet2.d()) {
                                this.i.setColor(dataSet2.g0(j2));
                            }
                            entryCount = entryCount2;
                            radius2 = radius3;
                            dataSet = dataSet2;
                            formatter = formatter2;
                            labelPtx2 = labelPtx;
                            iconsOffset = iconsOffset2;
                            dataSets2 = dataSets4;
                            sliceXBase = sliceXBase2;
                            c2.drawLine(pt0x, pt0y, pt1x, pt1y, this.i);
                            c2.drawLine(pt1x, pt1y, pt2x, pt2y, this.i);
                        } else {
                            radius2 = radius3;
                            formatter = formatter2;
                            iconsOffset = iconsOffset2;
                            dataSet = dataSet2;
                            labelPtx2 = labelPtx;
                            dataSets2 = dataSets4;
                            sliceXBase = sliceXBase2;
                            entryCount = entryCount2;
                        }
                        if (drawXOutside && drawYOutside) {
                            k(c2, formattedValue, labelPtx2, labelPty, dataSet.J(j2));
                            if (j2 >= data.g() || entryLabel == null) {
                                canvas2 = c2;
                            } else {
                                i(c2, entryLabel, labelPtx2, labelPty + lineHeight);
                                canvas2 = c2;
                            }
                        } else if (drawXOutside) {
                            if (j2 >= data.g() || entryLabel == null) {
                                canvas2 = c2;
                            } else {
                                i(c2, entryLabel, labelPtx2, labelPty + (lineHeight / 2.0f));
                                canvas2 = c2;
                            }
                        } else if (drawYOutside) {
                            canvas2 = c2;
                            k(c2, formattedValue, labelPtx2, labelPty + (lineHeight / 2.0f), dataSet.J(j2));
                        } else {
                            canvas2 = c2;
                        }
                    } else {
                        yValuePosition = yValuePosition2;
                        xValuePosition = xValuePosition2;
                        radius2 = radius3;
                        formatter = formatter2;
                        iconsOffset = iconsOffset2;
                        dataSet = dataSet2;
                        dataSets2 = dataSets4;
                        canvas2 = c2;
                        sliceXBase = sliceXBase2;
                        entryCount = entryCount2;
                    }
                    if (drawXInside || drawYInside) {
                        float x = (labelRadius * sliceXBase) + center.f2511c;
                        float y = (labelRadius * sliceYBase) + center.f2512d;
                        this.f2494e.setTextAlign(Paint.Align.CENTER);
                        if (!drawXInside || !drawYInside) {
                            rotationAngle3 = rotationAngle;
                            if (drawXInside) {
                                if (j2 < data.g() && entryLabel != null) {
                                    i(canvas2, entryLabel, x, y + (lineHeight / 2.0f));
                                }
                            } else if (drawYInside) {
                                k(c2, formattedValue, x, y + (lineHeight / 2.0f), dataSet.J(j2));
                            }
                        } else {
                            rotationAngle3 = rotationAngle;
                            k(c2, formattedValue, x, y, dataSet.J(j2));
                            if (j2 < data.g() && entryLabel != null) {
                                i(canvas2, entryLabel, x, y + lineHeight);
                            }
                        }
                    } else {
                        rotationAngle3 = rotationAngle;
                    }
                    if (entry.b() != null && dataSet.f0()) {
                        Drawable icon = entry.b();
                        float f4 = iconsOffset.f2512d;
                        f.f(c2, icon, (int) (((labelRadius + f4) * sliceXBase) + center.f2511c), (int) (((labelRadius + f4) * sliceYBase) + center.f2512d + iconsOffset.f2511c), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    xIndex2++;
                    j2++;
                    dataSet2 = dataSet;
                    iconsOffset2 = iconsOffset;
                    xValuePosition2 = xValuePosition;
                    drawAngles2 = drawAngles2;
                    absoluteAngles2 = absoluteAngles2;
                    entryCount2 = entryCount;
                    dataSets4 = dataSets2;
                    phaseX2 = phaseX2;
                    phaseY2 = phaseY2;
                    rotationAngle = rotationAngle3;
                    yValuePosition2 = yValuePosition;
                    radius3 = radius2;
                    formatter2 = formatter;
                }
                radius = radius3;
                drawAngles = drawAngles2;
                absoluteAngles = absoluteAngles2;
                phaseX = phaseX2;
                phaseY = phaseY2;
                rotationAngle2 = rotationAngle;
                dataSets = dataSets4;
                canvas = c2;
                c.f(iconsOffset2);
                xIndex = xIndex2;
            } else {
                i2 = i3;
                dataSets = dataSets3;
                radius = radius3;
                drawAngles = drawAngles2;
                absoluteAngles = absoluteAngles2;
                phaseX = phaseX2;
                phaseY = phaseY2;
                rotationAngle2 = rotationAngle;
                labelRadiusOffset2 = labelRadiusOffset;
                canvas = canvas3;
            }
            i3 = i2 + 1;
            canvas3 = canvas;
            labelRadiusOffset = labelRadiusOffset2;
            drawAngles2 = drawAngles;
            absoluteAngles2 = absoluteAngles;
            dataSets3 = dataSets;
            phaseX2 = phaseX;
            phaseY2 = phaseY;
            rotationAngle = rotationAngle2;
            radius3 = radius;
        }
        c.f(center);
        c2.restore();
    }

    public void k(Canvas c2, String valueText, float x, float y, int color) {
        this.f2494e.setColor(color);
        c2.drawText(valueText, x, y, this.f2494e);
    }

    public void i(Canvas c2, String label, float x, float y) {
        c2.drawText(label, x, y, this.k);
    }

    @Override // b.c.a.a.i.c
    public void c(Canvas c2) {
        j();
        c2.drawBitmap(this.p.get(), 0.0f, 0.0f, (Paint) null);
        g(c2);
    }

    public void j() {
        if (this.f2502f.B() && this.q != null) {
            float radius = this.f2502f.getRadius();
            float holeRadius = (this.f2502f.getHoleRadius() / 100.0f) * radius;
            c center = this.f2502f.getCenterCircleBox();
            if (Color.alpha(this.f2503g.getColor()) > 0) {
                this.q.drawCircle(center.f2511c, center.f2512d, holeRadius, this.f2503g);
            }
            if (Color.alpha(this.h.getColor()) > 0 && this.f2502f.getTransparentCircleRadius() > this.f2502f.getHoleRadius()) {
                int alpha = this.h.getAlpha();
                this.h.setAlpha((int) (((float) alpha) * this.f2491b.a() * this.f2491b.b()));
                this.t.reset();
                this.t.addCircle(center.f2511c, center.f2512d, (this.f2502f.getTransparentCircleRadius() / 100.0f) * radius, Path.Direction.CW);
                this.t.addCircle(center.f2511c, center.f2512d, holeRadius, Path.Direction.CCW);
                this.q.drawPath(this.t, this.h);
                this.h.setAlpha(alpha);
            }
            c.f(center);
        }
    }

    public void g(Canvas c2) {
        float innerRadius;
        RectF boundingRect;
        RectF holeRect;
        CharSequence centerText = this.f2502f.getCenterText();
        if (this.f2502f.z() && centerText != null) {
            c center = this.f2502f.getCenterCircleBox();
            c offset = this.f2502f.getCenterTextOffset();
            float x = center.f2511c + offset.f2511c;
            float y = center.f2512d + offset.f2512d;
            if (!this.f2502f.B() || this.f2502f.D()) {
                innerRadius = this.f2502f.getRadius();
            } else {
                innerRadius = this.f2502f.getRadius() * (this.f2502f.getHoleRadius() / 100.0f);
            }
            RectF[] rectFArr = this.o;
            RectF holeRect2 = rectFArr[0];
            holeRect2.left = x - innerRadius;
            holeRect2.top = y - innerRadius;
            holeRect2.right = x + innerRadius;
            holeRect2.bottom = y + innerRadius;
            RectF boundingRect2 = rectFArr[1];
            boundingRect2.set(holeRect2);
            float radiusPercent = this.f2502f.getCenterTextRadiusPercent() / 100.0f;
            if (((double) radiusPercent) > 0.0d) {
                boundingRect2.inset((boundingRect2.width() - (boundingRect2.width() * radiusPercent)) / 2.0f, (boundingRect2.height() - (boundingRect2.height() * radiusPercent)) / 2.0f);
            }
            if (!centerText.equals(this.m) || !boundingRect2.equals(this.n)) {
                this.n.set(boundingRect2);
                this.m = centerText;
                boundingRect = boundingRect2;
                holeRect = holeRect2;
                this.l = new StaticLayout(centerText, 0, centerText.length(), this.j, (int) Math.max(Math.ceil((double) this.n.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            } else {
                boundingRect = boundingRect2;
                holeRect = holeRect2;
            }
            c2.save();
            Path path = this.u;
            path.reset();
            path.addOval(holeRect, Path.Direction.CW);
            c2.clipPath(path);
            c2.translate(boundingRect.left, boundingRect.top + ((boundingRect.height() - ((float) this.l.getHeight())) / 2.0f));
            this.l.draw(c2);
            c2.restore();
            c.f(center);
            c.f(offset);
        }
    }

    @Override // b.c.a.a.i.c
    public void d(Canvas c2, b[] indices) {
        RectF highlightedCircleBox;
        float[] drawAngles;
        int i2;
        c center;
        boolean drawInnerArc;
        int visibleAngleCount;
        float[] drawAngles2;
        float innerRadius;
        float innerRadius2;
        float innerRadius3;
        b[] bVarArr = indices;
        int i3 = 1;
        boolean drawInnerArc2 = this.f2502f.B() && !this.f2502f.D();
        if (!drawInnerArc2 || !this.f2502f.C()) {
            float phaseX = this.f2491b.a();
            float phaseY = this.f2491b.b();
            float rotationAngle = this.f2502f.getRotationAngle();
            float[] drawAngles3 = this.f2502f.getDrawAngles();
            float[] absoluteAngles = this.f2502f.getAbsoluteAngles();
            c center2 = this.f2502f.getCenterCircleBox();
            float radius = this.f2502f.getRadius();
            float userInnerRadius = drawInnerArc2 ? (this.f2502f.getHoleRadius() / 100.0f) * radius : 0.0f;
            RectF highlightedCircleBox2 = this.v;
            highlightedCircleBox2.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i4 = 0;
            while (i4 < bVarArr.length) {
                int index = (int) bVarArr[i4].e();
                if (index >= drawAngles3.length) {
                    i2 = i4;
                    highlightedCircleBox = highlightedCircleBox2;
                    center = center2;
                    drawAngles = drawAngles3;
                    drawInnerArc = drawInnerArc2;
                } else {
                    b.c.a.a.g.a.g set = ((b.c.a.a.d.f) this.f2502f.getData()).d(bVarArr[i4].b());
                    if (set == null) {
                        i2 = i4;
                        highlightedCircleBox = highlightedCircleBox2;
                        center = center2;
                        drawAngles = drawAngles3;
                        drawInnerArc = drawInnerArc2;
                    } else if (!set.K()) {
                        i2 = i4;
                        highlightedCircleBox = highlightedCircleBox2;
                        center = center2;
                        drawAngles = drawAngles3;
                        drawInnerArc = drawInnerArc2;
                    } else {
                        int entryCount = set.E();
                        int visibleAngleCount2 = 0;
                        for (int j2 = 0; j2 < entryCount; j2++) {
                            if (Math.abs(((h) set.Q(j2)).c()) > f.f2523b) {
                                visibleAngleCount2++;
                            }
                        }
                        float angle = index == 0 ? 0.0f : absoluteAngles[index - 1] * phaseX;
                        float sliceSpace = visibleAngleCount2 <= i3 ? 0.0f : set.w();
                        float sliceAngle = drawAngles3[index];
                        float shift = set.j();
                        float highlightedRadius = radius + shift;
                        highlightedCircleBox2.set(this.f2502f.getCircleBox());
                        i2 = i4;
                        highlightedCircleBox2.inset(-shift, -shift);
                        boolean accountForSliceSpacing = sliceSpace > 0.0f && sliceAngle <= 180.0f;
                        this.f2492c.setColor(set.g0(index));
                        float sliceSpaceAngleOuter = visibleAngleCount2 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                        float sliceSpaceAngleShifted = visibleAngleCount2 == 1 ? 0.0f : sliceSpace / (highlightedRadius * 0.017453292f);
                        float startAngleOuter = rotationAngle + ((angle + (sliceSpaceAngleOuter / 2.0f)) * phaseY);
                        float sweepAngleOuter = (sliceAngle - sliceSpaceAngleOuter) * phaseY;
                        float sweepAngleOuter2 = sweepAngleOuter < 0.0f ? 0.0f : sweepAngleOuter;
                        float startAngleShifted = rotationAngle + ((angle + (sliceSpaceAngleShifted / 2.0f)) * phaseY);
                        float sweepAngleShifted = (sliceAngle - sliceSpaceAngleShifted) * phaseY;
                        if (sweepAngleShifted < 0.0f) {
                            sweepAngleShifted = 0.0f;
                        }
                        this.r.reset();
                        if (sweepAngleOuter2 < 360.0f || sweepAngleOuter2 % 360.0f > f.f2523b) {
                            innerRadius = userInnerRadius;
                            drawAngles2 = drawAngles3;
                            visibleAngleCount = visibleAngleCount2;
                            this.r.moveTo(center2.f2511c + (((float) Math.cos((double) (startAngleShifted * 0.017453292f))) * highlightedRadius), center2.f2512d + (((float) Math.sin((double) (startAngleShifted * 0.017453292f))) * highlightedRadius));
                            this.r.arcTo(highlightedCircleBox2, startAngleShifted, sweepAngleShifted);
                        } else {
                            innerRadius = userInnerRadius;
                            drawAngles2 = drawAngles3;
                            this.r.addCircle(center2.f2511c, center2.f2512d, highlightedRadius, Path.Direction.CW);
                            visibleAngleCount = visibleAngleCount2;
                        }
                        float sliceSpaceRadius = 0.0f;
                        if (accountForSliceSpacing) {
                            highlightedCircleBox = highlightedCircleBox2;
                            innerRadius2 = innerRadius;
                            drawAngles = drawAngles2;
                            center = center2;
                            sliceSpaceRadius = f(center2, radius, sliceAngle * phaseY, center2.f2511c + (((float) Math.cos((double) (startAngleOuter * 0.017453292f))) * radius), center2.f2512d + (((float) Math.sin((double) (startAngleOuter * 0.017453292f))) * radius), startAngleOuter, sweepAngleOuter2);
                        } else {
                            highlightedCircleBox = highlightedCircleBox2;
                            innerRadius2 = innerRadius;
                            drawAngles = drawAngles2;
                            center = center2;
                        }
                        RectF rectF = this.s;
                        float f2 = center.f2511c;
                        float f3 = center.f2512d;
                        rectF.set(f2 - innerRadius2, f3 - innerRadius2, f2 + innerRadius2, f3 + innerRadius2);
                        if (!drawInnerArc2) {
                            drawInnerArc = drawInnerArc2;
                        } else if (innerRadius2 > 0.0f || accountForSliceSpacing) {
                            if (accountForSliceSpacing) {
                                float minSpacedRadius = sliceSpaceRadius;
                                if (minSpacedRadius < 0.0f) {
                                    minSpacedRadius = -minSpacedRadius;
                                }
                                innerRadius3 = Math.max(innerRadius2, minSpacedRadius);
                            } else {
                                innerRadius3 = innerRadius2;
                            }
                            float sliceSpaceAngleInner = (visibleAngleCount == 1 || innerRadius3 == 0.0f) ? 0.0f : sliceSpace / (innerRadius3 * 0.017453292f);
                            float startAngleInner = ((angle + (sliceSpaceAngleInner / 2.0f)) * phaseY) + rotationAngle;
                            float sweepAngleInner = (sliceAngle - sliceSpaceAngleInner) * phaseY;
                            if (sweepAngleInner < 0.0f) {
                                sweepAngleInner = 0.0f;
                            }
                            float endAngleInner = startAngleInner + sweepAngleInner;
                            if (sweepAngleOuter2 < 360.0f || sweepAngleOuter2 % 360.0f > f.f2523b) {
                                drawInnerArc = drawInnerArc2;
                                this.r.lineTo(center.f2511c + (((float) Math.cos((double) (endAngleInner * 0.017453292f))) * innerRadius3), center.f2512d + (((float) Math.sin((double) (endAngleInner * 0.017453292f))) * innerRadius3));
                                this.r.arcTo(this.s, endAngleInner, -sweepAngleInner);
                            } else {
                                this.r.addCircle(center.f2511c, center.f2512d, innerRadius3, Path.Direction.CCW);
                                drawInnerArc = drawInnerArc2;
                            }
                            this.r.close();
                            this.q.drawPath(this.r, this.f2492c);
                        } else {
                            drawInnerArc = drawInnerArc2;
                        }
                        if (sweepAngleOuter2 % 360.0f > f.f2523b) {
                            if (accountForSliceSpacing) {
                                float angleMiddle = startAngleOuter + (sweepAngleOuter2 / 2.0f);
                                this.r.lineTo(center.f2511c + (((float) Math.cos((double) (angleMiddle * 0.017453292f))) * sliceSpaceRadius), center.f2512d + (((float) Math.sin((double) (angleMiddle * 0.017453292f))) * sliceSpaceRadius));
                            } else {
                                this.r.lineTo(center.f2511c, center.f2512d);
                            }
                        }
                        this.r.close();
                        this.q.drawPath(this.r, this.f2492c);
                    }
                }
                i4 = i2 + 1;
                drawInnerArc2 = drawInnerArc;
                center2 = center;
                drawAngles3 = drawAngles;
                highlightedCircleBox2 = highlightedCircleBox;
                i3 = 1;
                bVarArr = indices;
            }
            c.f(center2);
        }
    }

    public void q() {
        Canvas canvas = this.q;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.q = null;
        }
        WeakReference<Bitmap> weakReference = this.p;
        if (weakReference != null) {
            Bitmap drawBitmap = weakReference.get();
            if (drawBitmap != null) {
                drawBitmap.recycle();
            }
            this.p.clear();
            this.p = null;
        }
    }
}
