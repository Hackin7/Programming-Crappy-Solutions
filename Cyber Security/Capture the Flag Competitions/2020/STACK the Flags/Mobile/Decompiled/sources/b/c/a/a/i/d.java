package b.c.a.a.i;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import b.c.a.a.c.e;
import b.c.a.a.c.f;
import b.c.a.a.d.c;
import b.c.a.a.d.h;
import b.c.a.a.g.a.a;
import b.c.a.a.j.b;
import b.c.a.a.j.g;
import com.github.mikephil.charting.utils.FSize;
import java.util.ArrayList;
import java.util.List;

public class d extends i {

    /* renamed from: b  reason: collision with root package name */
    public Paint f2495b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f2496c;

    /* renamed from: d  reason: collision with root package name */
    public e f2497d;

    /* renamed from: e  reason: collision with root package name */
    public List<f> f2498e = new ArrayList(16);

    /* renamed from: f  reason: collision with root package name */
    public Paint.FontMetrics f2499f = new Paint.FontMetrics();

    /* renamed from: g  reason: collision with root package name */
    public Path f2500g = new Path();

    public d(g viewPortHandler, e legend) {
        super(viewPortHandler);
        this.f2497d = legend;
        Paint paint = new Paint(1);
        this.f2495b = paint;
        paint.setTextSize(b.c.a.a.j.f.e(9.0f));
        this.f2495b.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f2496c = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    public Paint d() {
        return this.f2495b;
    }

    public void a(c<?> cVar) {
        c<?> cVar2;
        String label;
        c<?> cVar3 = cVar;
        if (!this.f2497d.D()) {
            this.f2498e.clear();
            int i = 0;
            while (i < cVar.e()) {
                b.c.a.a.g.a.d dataSet = cVar3.d(i);
                List<Integer> clrs = dataSet.T();
                int entryCount = dataSet.E();
                if ((dataSet instanceof a) && ((a) dataSet).q()) {
                    a bds = (a) dataSet;
                    String[] sLabels = bds.t();
                    int j = 0;
                    while (j < clrs.size() && j < bds.W()) {
                        this.f2498e.add(new f(sLabels[j % sLabels.length], dataSet.c(), dataSet.a0(), dataSet.P(), dataSet.b0(), clrs.get(j).intValue()));
                        j++;
                        sLabels = sLabels;
                    }
                    if (bds.i() != null) {
                        this.f2498e.add(new f(dataSet.i(), e.b.NONE, Float.NaN, Float.NaN, null, 1122867));
                    }
                    cVar2 = cVar3;
                } else if (dataSet instanceof b.c.a.a.g.a.g) {
                    b.c.a.a.g.a.g pds = (b.c.a.a.g.a.g) dataSet;
                    int j2 = 0;
                    while (j2 < clrs.size() && j2 < entryCount) {
                        this.f2498e.add(new f(((h) pds.Q(j2)).f(), dataSet.c(), dataSet.a0(), dataSet.P(), dataSet.b0(), clrs.get(j2).intValue()));
                        j2++;
                    }
                    if (pds.i() != null) {
                        this.f2498e.add(new f(dataSet.i(), e.b.NONE, Float.NaN, Float.NaN, null, 1122867));
                    }
                    cVar2 = cVar;
                } else if (!(dataSet instanceof b.c.a.a.g.a.c) || ((b.c.a.a.g.a.c) dataSet).e0() == 1122867) {
                    int j3 = 0;
                    while (j3 < clrs.size() && j3 < entryCount) {
                        if (j3 >= clrs.size() - 1 || j3 >= entryCount - 1) {
                            label = cVar.d(i).i();
                        } else {
                            label = null;
                        }
                        this.f2498e.add(new f(label, dataSet.c(), dataSet.a0(), dataSet.P(), dataSet.b0(), clrs.get(j3).intValue()));
                        j3++;
                        dataSet = dataSet;
                    }
                    cVar2 = cVar;
                } else {
                    int decreasingColor = ((b.c.a.a.g.a.c) dataSet).e0();
                    int increasingColor = ((b.c.a.a.g.a.c) dataSet).u();
                    this.f2498e.add(new f(null, dataSet.c(), dataSet.a0(), dataSet.P(), dataSet.b0(), decreasingColor));
                    this.f2498e.add(new f(dataSet.i(), dataSet.c(), dataSet.a0(), dataSet.P(), dataSet.b0(), increasingColor));
                    cVar2 = cVar;
                }
                i++;
                cVar3 = cVar2;
            }
            this.f2497d.n();
            this.f2497d.E(this.f2498e);
        }
        Typeface tf = this.f2497d.c();
        if (tf != null) {
            this.f2495b.setTypeface(tf);
        }
        this.f2495b.setTextSize(this.f2497d.b());
        this.f2495b.setColor(this.f2497d.a());
        this.f2497d.h(this.f2495b, this.f2505a);
    }

    /* JADX INFO: Multiple debug info for r13v7 'direction'  b.c.a.a.c.e$a: [D('entries' b.c.a.a.c.f[]), D('direction' b.c.a.a.c.e$a)] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x043b  */
    public void e(Canvas c2) {
        float xEntrySpace;
        float formToTextSpace;
        float labelLineSpacing;
        float posX;
        float posX2;
        int lineIndex;
        e.c horizontalAlignment;
        boolean isStacked;
        f[] entries;
        e.c horizontalAlignment2;
        List<FSize> calculatedLineSizes;
        List<Boolean> calculatedLabelBreakPoints;
        float formToTextSpace2;
        Canvas canvas;
        int i;
        float xEntrySpace2;
        float f2;
        float posX3;
        float f3;
        e.c horizontalAlignment3;
        f[] entries2;
        float formYOffset;
        e.d orientation;
        float xoffset;
        e.a direction;
        float formYOffset2;
        float formToTextSpace3;
        float f4;
        float posX4;
        float posY;
        float posY2;
        float originPosX;
        float originPosX2;
        double d2;
        float originPosX3;
        if (this.f2497d.f()) {
            Typeface tf = this.f2497d.c();
            if (tf != null) {
                this.f2495b.setTypeface(tf);
            }
            this.f2495b.setTextSize(this.f2497d.b());
            this.f2495b.setColor(this.f2497d.a());
            float labelLineHeight = b.c.a.a.j.f.l(this.f2495b, this.f2499f);
            float labelLineSpacing2 = b.c.a.a.j.f.n(this.f2495b, this.f2499f) + b.c.a.a.j.f.e(this.f2497d.B());
            float stackSpace = labelLineHeight - (((float) b.c.a.a.j.f.a(this.f2495b, "ABC")) / 2.0f);
            f[] entries3 = this.f2497d.m();
            float formToTextSpace4 = b.c.a.a.j.f.e(this.f2497d.s());
            float xEntrySpace3 = b.c.a.a.j.f.e(this.f2497d.A());
            e.d orientation2 = this.f2497d.x();
            e.c horizontalAlignment4 = this.f2497d.t();
            e.EnumC0051e verticalAlignment = this.f2497d.z();
            e.a direction2 = this.f2497d.l();
            float defaultFormSize = b.c.a.a.j.f.e(this.f2497d.r());
            float stackSpace2 = b.c.a.a.j.f.e(this.f2497d.y());
            float yoffset = this.f2497d.e();
            float xoffset2 = this.f2497d.d();
            int ordinal = horizontalAlignment4.ordinal();
            float originPosX4 = 0.0f;
            if (ordinal == 0) {
                labelLineSpacing = labelLineSpacing2;
                formToTextSpace = formToTextSpace4;
                xEntrySpace = xEntrySpace3;
                if (orientation2 == e.d.VERTICAL) {
                    originPosX = xoffset2;
                } else {
                    originPosX = this.f2505a.b() + xoffset2;
                }
                if (direction2 == e.a.RIGHT_TO_LEFT) {
                    originPosX4 = originPosX + this.f2497d.w;
                } else {
                    originPosX4 = originPosX;
                }
            } else if (ordinal == 1) {
                if (orientation2 == e.d.VERTICAL) {
                    originPosX2 = this.f2505a.g() / 2.0f;
                } else {
                    originPosX2 = this.f2505a.b() + (this.f2505a.e() / 2.0f);
                }
                float originPosX5 = originPosX2 + (direction2 == e.a.LEFT_TO_RIGHT ? xoffset2 : -xoffset2);
                if (orientation2 == e.d.VERTICAL) {
                    labelLineSpacing = labelLineSpacing2;
                    double d3 = (double) originPosX5;
                    if (direction2 == e.a.LEFT_TO_RIGHT) {
                        formToTextSpace = formToTextSpace4;
                        xEntrySpace = xEntrySpace3;
                        d2 = (((double) (-this.f2497d.w)) / 2.0d) + ((double) xoffset2);
                    } else {
                        formToTextSpace = formToTextSpace4;
                        xEntrySpace = xEntrySpace3;
                        d2 = (((double) this.f2497d.w) / 2.0d) - ((double) xoffset2);
                    }
                    originPosX4 = (float) (d3 + d2);
                } else {
                    originPosX4 = originPosX5;
                    labelLineSpacing = labelLineSpacing2;
                    formToTextSpace = formToTextSpace4;
                    xEntrySpace = xEntrySpace3;
                }
            } else if (ordinal != 2) {
                labelLineSpacing = labelLineSpacing2;
                formToTextSpace = formToTextSpace4;
                xEntrySpace = xEntrySpace3;
            } else {
                if (orientation2 == e.d.VERTICAL) {
                    originPosX3 = this.f2505a.g() - xoffset2;
                } else {
                    originPosX3 = this.f2505a.c() - xoffset2;
                }
                if (direction2 == e.a.LEFT_TO_RIGHT) {
                    originPosX4 = originPosX3 - this.f2497d.w;
                    labelLineSpacing = labelLineSpacing2;
                    formToTextSpace = formToTextSpace4;
                    xEntrySpace = xEntrySpace3;
                } else {
                    originPosX4 = originPosX3;
                    labelLineSpacing = labelLineSpacing2;
                    formToTextSpace = formToTextSpace4;
                    xEntrySpace = xEntrySpace3;
                }
            }
            int ordinal2 = orientation2.ordinal();
            if (ordinal2 == 0) {
                e.c horizontalAlignment5 = horizontalAlignment4;
                float formToTextSpace5 = formToTextSpace;
                Canvas canvas2 = c2;
                List<FSize> calculatedLineSizes2 = this.f2497d.k();
                List<FSize> calculatedLabelSizes = this.f2497d.j();
                List<Boolean> calculatedLabelBreakPoints2 = this.f2497d.i();
                float posX5 = originPosX4;
                float posY3 = 0.0f;
                int ordinal3 = verticalAlignment.ordinal();
                if (ordinal3 == 0) {
                    posY3 = yoffset;
                } else if (ordinal3 == 1) {
                    posY3 = ((this.f2505a.f() - this.f2497d.x) / 2.0f) + yoffset;
                } else if (ordinal3 == 2) {
                    posY3 = (this.f2505a.f() - yoffset) - this.f2497d.x;
                }
                int lineIndex2 = 0;
                int i2 = 0;
                f[] entries4 = entries3;
                int count = entries4.length;
                while (i2 < count) {
                    f e2 = entries4[i2];
                    boolean drawingForm = e2.f2420b != e.b.NONE;
                    float formSize = Float.isNaN(e2.f2421c) ? defaultFormSize : b.c.a.a.j.f.e(e2.f2421c);
                    if (i2 >= calculatedLabelBreakPoints2.size() || !calculatedLabelBreakPoints2.get(i2).booleanValue()) {
                        posX2 = posX5;
                        posX = posY3;
                    } else {
                        posX2 = originPosX4;
                        posX = posY3 + labelLineHeight + labelLineSpacing;
                    }
                    if (posX2 == originPosX4) {
                        horizontalAlignment = horizontalAlignment5;
                        if (horizontalAlignment == e.c.CENTER) {
                            if (lineIndex2 < calculatedLineSizes2.size()) {
                                if (direction2 == e.a.RIGHT_TO_LEFT) {
                                    f3 = ((b) calculatedLineSizes2.get(lineIndex2)).f2508c;
                                } else {
                                    f3 = -((b) calculatedLineSizes2.get(lineIndex2)).f2508c;
                                }
                                posX2 += f3 / 2.0f;
                                lineIndex = lineIndex2 + 1;
                                isStacked = e2.f2419a != null;
                                if (!drawingForm) {
                                    if (direction2 == e.a.RIGHT_TO_LEFT) {
                                        posX3 = posX2 - formSize;
                                    } else {
                                        posX3 = posX2;
                                    }
                                    calculatedLineSizes = calculatedLineSizes2;
                                    i = i2;
                                    horizontalAlignment2 = horizontalAlignment;
                                    calculatedLabelBreakPoints = calculatedLabelBreakPoints2;
                                    canvas = c2;
                                    entries = entries4;
                                    formToTextSpace2 = formToTextSpace5;
                                    b(c2, posX3, posX + stackSpace, e2, this.f2497d);
                                    if (direction2 == e.a.LEFT_TO_RIGHT) {
                                        posX2 = posX3 + formSize;
                                    } else {
                                        posX2 = posX3;
                                    }
                                } else {
                                    horizontalAlignment2 = horizontalAlignment;
                                    calculatedLineSizes = calculatedLineSizes2;
                                    calculatedLabelBreakPoints = calculatedLabelBreakPoints2;
                                    entries = entries4;
                                    canvas = c2;
                                    i = i2;
                                    formToTextSpace2 = formToTextSpace5;
                                }
                                if (isStacked) {
                                    if (drawingForm) {
                                        posX2 += direction2 == e.a.RIGHT_TO_LEFT ? -formToTextSpace2 : formToTextSpace2;
                                    }
                                    if (direction2 == e.a.RIGHT_TO_LEFT) {
                                        posX2 -= ((b) calculatedLabelSizes.get(i)).f2508c;
                                    }
                                    c(canvas, posX2, posX + labelLineHeight, e2.f2419a);
                                    if (direction2 == e.a.LEFT_TO_RIGHT) {
                                        posX2 += ((b) calculatedLabelSizes.get(i)).f2508c;
                                    }
                                    if (direction2 == e.a.RIGHT_TO_LEFT) {
                                        xEntrySpace2 = xEntrySpace;
                                        f2 = -xEntrySpace2;
                                    } else {
                                        xEntrySpace2 = xEntrySpace;
                                        f2 = xEntrySpace2;
                                    }
                                    posX5 = posX2 + f2;
                                } else {
                                    xEntrySpace2 = xEntrySpace;
                                    posX5 = posX2 + (direction2 == e.a.RIGHT_TO_LEFT ? -stackSpace2 : stackSpace2);
                                }
                                int i3 = i + 1;
                                xEntrySpace = xEntrySpace2;
                                canvas2 = canvas;
                                formToTextSpace5 = formToTextSpace2;
                                lineIndex2 = lineIndex;
                                calculatedLabelBreakPoints2 = calculatedLabelBreakPoints;
                                calculatedLineSizes2 = calculatedLineSizes;
                                horizontalAlignment5 = horizontalAlignment2;
                                entries4 = entries;
                                i2 = i3;
                                posY3 = posX;
                            }
                        }
                    } else {
                        horizontalAlignment = horizontalAlignment5;
                    }
                    lineIndex = lineIndex2;
                    if (e2.f2419a != null) {
                    }
                    if (!drawingForm) {
                    }
                    if (isStacked) {
                    }
                    int i32 = i + 1;
                    xEntrySpace = xEntrySpace2;
                    canvas2 = canvas;
                    formToTextSpace5 = formToTextSpace2;
                    lineIndex2 = lineIndex;
                    calculatedLabelBreakPoints2 = calculatedLabelBreakPoints;
                    calculatedLineSizes2 = calculatedLineSizes;
                    horizontalAlignment5 = horizontalAlignment2;
                    entries4 = entries;
                    i2 = i32;
                    posY3 = posX;
                }
            } else if (ordinal2 == 1) {
                float posY4 = 0.0f;
                int ordinal4 = verticalAlignment.ordinal();
                if (ordinal4 == 0) {
                    if (horizontalAlignment4 == e.c.CENTER) {
                        posY = 0.0f;
                    } else {
                        posY = this.f2505a.d();
                    }
                    posY4 = posY + yoffset;
                } else if (ordinal4 == 1) {
                    e eVar = this.f2497d;
                    posY4 = ((this.f2505a.f() / 2.0f) - (eVar.x / 2.0f)) + eVar.e();
                } else if (ordinal4 == 2) {
                    if (horizontalAlignment4 == e.c.CENTER) {
                        posY2 = this.f2505a.f();
                    } else {
                        posY2 = this.f2505a.a();
                    }
                    posY4 = posY2 - (this.f2497d.x + yoffset);
                }
                float posY5 = posY4;
                boolean wasStacked = false;
                int i4 = 0;
                float stack = 0.0f;
                while (i4 < entries3.length) {
                    f e3 = entries3[i4];
                    boolean drawingForm2 = e3.f2420b != e.b.NONE;
                    float formSize2 = Float.isNaN(e3.f2421c) ? defaultFormSize : b.c.a.a.j.f.e(e3.f2421c);
                    float posX6 = originPosX4;
                    if (drawingForm2) {
                        xoffset = xoffset2;
                        if (direction2 == e.a.LEFT_TO_RIGHT) {
                            posX4 = posX6 + stack;
                        } else {
                            posX4 = posX6 - (formSize2 - stack);
                        }
                        formYOffset = stackSpace;
                        formYOffset2 = stackSpace2;
                        entries2 = entries3;
                        direction = direction2;
                        horizontalAlignment3 = horizontalAlignment4;
                        orientation = orientation2;
                        b(c2, posX4, posY5 + stackSpace, e3, this.f2497d);
                        if (direction == e.a.LEFT_TO_RIGHT) {
                            posX6 = posX4 + formSize2;
                        } else {
                            posX6 = posX4;
                        }
                    } else {
                        xoffset = xoffset2;
                        horizontalAlignment3 = horizontalAlignment4;
                        orientation = orientation2;
                        formYOffset = stackSpace;
                        entries2 = entries3;
                        formYOffset2 = stackSpace2;
                        direction = direction2;
                    }
                    if (e3.f2419a != null) {
                        if (!drawingForm2 || wasStacked) {
                            formToTextSpace3 = formToTextSpace;
                            if (wasStacked) {
                                posX6 = originPosX4;
                            }
                        } else {
                            if (direction == e.a.LEFT_TO_RIGHT) {
                                f4 = formToTextSpace;
                                formToTextSpace3 = f4;
                            } else {
                                formToTextSpace3 = formToTextSpace;
                                f4 = -formToTextSpace3;
                            }
                            posX6 += f4;
                        }
                        if (direction == e.a.RIGHT_TO_LEFT) {
                            posX6 -= (float) b.c.a.a.j.f.d(this.f2495b, e3.f2419a);
                        }
                        if (!wasStacked) {
                            c(c2, posX6, posY5 + labelLineHeight, e3.f2419a);
                        } else {
                            posY5 += labelLineHeight + labelLineSpacing;
                            c(c2, posX6, posY5 + labelLineHeight, e3.f2419a);
                        }
                        posY5 += labelLineHeight + labelLineSpacing;
                        stack = 0.0f;
                    } else {
                        formToTextSpace3 = formToTextSpace;
                        stack += formSize2 + formYOffset2;
                        wasStacked = true;
                    }
                    i4++;
                    formToTextSpace = formToTextSpace3;
                    stackSpace2 = formYOffset2;
                    direction2 = direction;
                    xoffset2 = xoffset;
                    orientation2 = orientation;
                    stackSpace = formYOffset;
                    entries3 = entries2;
                    horizontalAlignment4 = horizontalAlignment3;
                }
            }
        }
    }

    public void b(Canvas c2, float x, float y, f entry, e legend) {
        e.b form;
        int i = entry.f2424f;
        if (i != 1122868 && i != 1122867 && i != 0) {
            int restoreCount = c2.save();
            e.b form2 = entry.f2420b;
            if (form2 == e.b.DEFAULT) {
                form = legend.o();
            } else {
                form = form2;
            }
            this.f2496c.setColor(entry.f2424f);
            float formSize = b.c.a.a.j.f.e(Float.isNaN(entry.f2421c) ? legend.r() : entry.f2421c);
            float half = formSize / 2.0f;
            int ordinal = form.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    this.f2496c.setStyle(Paint.Style.FILL);
                    c2.drawRect(x, y - half, x + formSize, y + half, this.f2496c);
                } else if (ordinal != 4) {
                    if (ordinal == 5) {
                        float formLineWidth = b.c.a.a.j.f.e(Float.isNaN(entry.f2422d) ? legend.q() : entry.f2422d);
                        DashPathEffect formLineDashEffect = entry.f2423e;
                        if (formLineDashEffect == null) {
                            formLineDashEffect = legend.p();
                        }
                        this.f2496c.setStyle(Paint.Style.STROKE);
                        this.f2496c.setStrokeWidth(formLineWidth);
                        this.f2496c.setPathEffect(formLineDashEffect);
                        this.f2500g.reset();
                        this.f2500g.moveTo(x, y);
                        this.f2500g.lineTo(x + formSize, y);
                        c2.drawPath(this.f2500g, this.f2496c);
                    }
                }
                c2.restoreToCount(restoreCount);
            }
            this.f2496c.setStyle(Paint.Style.FILL);
            c2.drawCircle(x + half, y, half, this.f2496c);
            c2.restoreToCount(restoreCount);
        }
    }

    public void c(Canvas c2, float x, float y, String label) {
        c2.drawText(label, x, y, this.f2495b);
    }
}
