package b.c.a.a.i;

import android.graphics.Paint;
import b.c.a.a.j.e;
import b.c.a.a.j.f;
import b.c.a.a.j.g;

public abstract class a extends i {

    /* renamed from: b  reason: collision with root package name */
    public b.c.a.a.c.a f2485b;

    /* renamed from: c  reason: collision with root package name */
    public e f2486c = null;

    /* renamed from: d  reason: collision with root package name */
    public Paint f2487d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f2488e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f2489f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f2490g;

    public a(g viewPortHandler, b.c.a.a.c.a axis) {
        super(viewPortHandler);
        this.f2485b = axis;
        if (this.f2505a != null) {
            this.f2488e = new Paint(1);
            Paint paint = new Paint();
            this.f2487d = paint;
            paint.setColor(-7829368);
            this.f2487d.setStrokeWidth(1.0f);
            this.f2487d.setStyle(Paint.Style.STROKE);
            this.f2487d.setAlpha(90);
            Paint paint2 = new Paint();
            this.f2489f = paint2;
            paint2.setColor(-16777216);
            this.f2489f.setStrokeWidth(1.0f);
            this.f2489f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.f2490g = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public void a(float min, float max, boolean inverted) {
        g gVar = this.f2505a;
        if (gVar == null || gVar.e() <= 10.0f || this.f2505a.l()) {
            b(min, max);
            return;
        }
        this.f2505a.b();
        this.f2505a.d();
        throw null;
    }

    public void b(float min, float max) {
        int n;
        int n2;
        double last;
        int labelCount = this.f2485b.k();
        double range = (double) Math.abs(max - min);
        if (labelCount != 0 && range > 0.0d) {
            if (!Double.isInfinite(range)) {
                double interval = (double) f.w(range / ((double) labelCount));
                if (this.f2485b.s()) {
                    interval = interval < ((double) this.f2485b.j()) ? (double) this.f2485b.j() : interval;
                }
                double intervalMagnitude = (double) f.w(Math.pow(10.0d, (double) ((int) Math.log10(interval))));
                if (((int) (interval / intervalMagnitude)) > 5) {
                    interval = Math.floor(10.0d * intervalMagnitude);
                }
                boolean o = this.f2485b.o();
                if (this.f2485b.r()) {
                    interval = (double) (((float) range) / ((float) (labelCount - 1)));
                    b.c.a.a.c.a aVar = this.f2485b;
                    aVar.j = labelCount;
                    if (aVar.h.length < labelCount) {
                        aVar.h = new float[labelCount];
                    }
                    float v = min;
                    int i = 0;
                    while (i < labelCount) {
                        this.f2485b.h[i] = v;
                        v = (float) (((double) v) + interval);
                        i++;
                        range = range;
                    }
                    n = labelCount;
                } else {
                    double first = interval == 0.0d ? 0.0d : Math.ceil(((double) min) / interval) * interval;
                    if (this.f2485b.o()) {
                        first -= interval;
                    }
                    if (interval == 0.0d) {
                        n2 = o;
                        last = 0.0d;
                    } else {
                        n2 = o;
                        last = f.u(Math.floor(((double) max) / interval) * interval);
                    }
                    if (interval != 0.0d) {
                        for (double f2 = first; f2 <= last; f2 += interval) {
                            n2++;
                        }
                    }
                    b.c.a.a.c.a aVar2 = this.f2485b;
                    aVar2.j = n2;
                    if (aVar2.h.length < n2) {
                        aVar2.h = new float[n2];
                    }
                    double f3 = first;
                    int i2 = 0;
                    while (i2 < n2) {
                        if (f3 == 0.0d) {
                            f3 = 0.0d;
                        }
                        this.f2485b.h[i2] = (float) f3;
                        f3 += interval;
                        i2++;
                        first = first;
                    }
                    n = n2;
                }
                if (interval < 1.0d) {
                    this.f2485b.k = (int) Math.ceil(-Math.log10(interval));
                } else {
                    this.f2485b.k = 0;
                }
                if (this.f2485b.o()) {
                    b.c.a.a.c.a aVar3 = this.f2485b;
                    if (aVar3.i.length < n) {
                        aVar3.i = new float[n];
                    }
                    float offset = ((float) interval) / 2.0f;
                    for (int i3 = 0; i3 < n; i3++) {
                        b.c.a.a.c.a aVar4 = this.f2485b;
                        aVar4.i[i3] = aVar4.h[i3] + offset;
                    }
                    return;
                }
                return;
            }
        }
        b.c.a.a.c.a aVar5 = this.f2485b;
        aVar5.h = new float[0];
        aVar5.i = new float[0];
        aVar5.j = 0;
    }
}
