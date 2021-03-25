package b.c.a.a.i;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import b.c.a.a.b.c;
import b.c.a.a.c.a;
import b.c.a.a.c.i;
import b.c.a.a.g.a.h;
import b.c.a.a.j.f;
import b.c.a.a.j.g;
import com.github.mikephil.charting.components.LimitLine;
import java.util.List;

public class m extends l {
    public c j;
    public Path k = new Path();

    public m(g viewPortHandler, i yAxis, c chart) {
        super(viewPortHandler, yAxis);
        this.j = chart;
    }

    @Override // b.c.a.a.i.a
    public void b(float min, float max) {
        int n;
        double last;
        int n2;
        float yMin = min;
        float yMax = max;
        int labelCount = this.f2485b.k();
        double range = (double) Math.abs(yMax - yMin);
        if (labelCount != 0 && range > 0.0d) {
            if (!Double.isInfinite(range)) {
                double interval = (double) f.w(range / ((double) labelCount));
                if (this.f2485b.s()) {
                    interval = interval < ((double) this.f2485b.j()) ? (double) this.f2485b.j() : interval;
                }
                double intervalMagnitude = (double) f.w(Math.pow(10.0d, (double) ((int) Math.log10(interval))));
                int intervalSigDigit = (int) (interval / intervalMagnitude);
                if (intervalSigDigit > 5) {
                    interval = Math.floor(10.0d * intervalMagnitude);
                }
                boolean centeringEnabled = this.f2485b.o();
                if (this.f2485b.r()) {
                    float step = ((float) range) / ((float) (labelCount - 1));
                    a aVar = this.f2485b;
                    aVar.j = labelCount;
                    if (aVar.h.length < labelCount) {
                        aVar.h = new float[labelCount];
                    }
                    float v = min;
                    int i = 0;
                    while (i < labelCount) {
                        this.f2485b.h[i] = v;
                        v += step;
                        i++;
                        intervalSigDigit = intervalSigDigit;
                    }
                    n = labelCount;
                } else {
                    double first = interval == 0.0d ? 0.0d : Math.ceil(((double) yMin) / interval) * interval;
                    if (centeringEnabled) {
                        first -= interval;
                    }
                    if (interval == 0.0d) {
                        n2 = centeringEnabled;
                        last = 0.0d;
                    } else {
                        n2 = centeringEnabled;
                        last = f.u(Math.floor(((double) yMax) / interval) * interval);
                    }
                    if (interval != 0.0d) {
                        for (double f2 = first; f2 <= last; f2 += interval) {
                            n2++;
                        }
                    }
                    int n3 = n2 + 1;
                    a aVar2 = this.f2485b;
                    aVar2.j = n3;
                    if (aVar2.h.length < n3) {
                        aVar2.h = new float[n3];
                    }
                    double f3 = first;
                    int i2 = 0;
                    while (i2 < n3) {
                        if (f3 == 0.0d) {
                            f3 = 0.0d;
                        }
                        this.f2485b.h[i2] = (float) f3;
                        f3 += interval;
                        i2++;
                        labelCount = labelCount;
                        yMin = yMin;
                        yMax = yMax;
                    }
                    n = n3;
                }
                if (interval < 1.0d) {
                    this.f2485b.k = (int) Math.ceil(-Math.log10(interval));
                } else {
                    this.f2485b.k = 0;
                }
                if (centeringEnabled) {
                    a aVar3 = this.f2485b;
                    if (aVar3.i.length < n) {
                        aVar3.i = new float[n];
                    }
                    float[] fArr = this.f2485b.h;
                    float offset = (fArr[1] - fArr[0]) / 2.0f;
                    for (int i3 = 0; i3 < n; i3++) {
                        a aVar4 = this.f2485b;
                        aVar4.i[i3] = aVar4.h[i3] + offset;
                    }
                }
                a aVar5 = this.f2485b;
                float[] fArr2 = aVar5.h;
                float f4 = fArr2[0];
                aVar5.y = f4;
                float f5 = fArr2[n - 1];
                aVar5.x = f5;
                aVar5.z = Math.abs(f5 - f4);
                return;
            }
        }
        a aVar6 = this.f2485b;
        aVar6.h = new float[0];
        aVar6.i = new float[0];
        aVar6.j = 0;
    }

    public void c(Canvas c2) {
        if (this.h.f() && this.h.p()) {
            this.f2488e.setTypeface(this.h.c());
            this.f2488e.setTextSize(this.h.b());
            this.f2488e.setColor(this.h.a());
            b.c.a.a.j.c center = this.j.getCenterOffsets();
            b.c.a.a.j.c pOut = b.c.a.a.j.c.c(0.0f, 0.0f);
            float factor = this.j.getFactor();
            int from = !this.h.v();
            int to = this.h.w() ? this.h.j : this.h.j - 1;
            for (int j2 = from; j2 < to; j2++) {
                i iVar = this.h;
                f.p(center, (iVar.h[j2] - iVar.y) * factor, this.j.getRotationAngle(), pOut);
                c2.drawText(this.h.i(j2), pOut.f2511c + 10.0f, pOut.f2512d, this.f2488e);
            }
            b.c.a.a.j.c.f(center);
            b.c.a.a.j.c.f(pOut);
        }
    }

    public void d(Canvas c2) {
        List<LimitLine> limitLines = this.h.l();
        if (limitLines != null) {
            float sliceangle = this.j.getSliceAngle();
            float factor = this.j.getFactor();
            b.c.a.a.j.c center = this.j.getCenterOffsets();
            b.c.a.a.j.c pOut = b.c.a.a.j.c.c(0.0f, 0.0f);
            for (int i = 0; i < limitLines.size(); i++) {
                b.c.a.a.c.g l = (b.c.a.a.c.g) limitLines.get(i);
                if (l.f()) {
                    Paint paint = this.f2490g;
                    l.j();
                    paint.setColor(0);
                    Paint paint2 = this.f2490g;
                    l.h();
                    paint2.setPathEffect(null);
                    Paint paint3 = this.f2490g;
                    l.k();
                    paint3.setStrokeWidth(0.0f);
                    l.i();
                    float r = (0.0f - this.j.getYChartMin()) * factor;
                    Path limitPath = this.k;
                    limitPath.reset();
                    for (int j2 = 0; j2 < ((h) ((b.c.a.a.d.i) this.j.getData()).k()).E(); j2++) {
                        f.p(center, r, (((float) j2) * sliceangle) + this.j.getRotationAngle(), pOut);
                        if (j2 == 0) {
                            limitPath.moveTo(pOut.f2511c, pOut.f2512d);
                        } else {
                            limitPath.lineTo(pOut.f2511c, pOut.f2512d);
                        }
                    }
                    limitPath.close();
                    c2.drawPath(limitPath, this.f2490g);
                }
            }
            b.c.a.a.j.c.f(center);
            b.c.a.a.j.c.f(pOut);
        }
    }
}
