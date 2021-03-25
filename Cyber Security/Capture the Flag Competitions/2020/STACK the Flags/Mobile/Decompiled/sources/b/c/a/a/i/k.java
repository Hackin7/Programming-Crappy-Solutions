package b.c.a.a.i;

import android.graphics.Canvas;
import b.c.a.a.b.c;
import b.c.a.a.c.h;
import b.c.a.a.d.i;
import b.c.a.a.j.f;
import b.c.a.a.j.g;

public class k extends j {
    public c i;

    public k(g viewPortHandler, h xAxis, c chart) {
        super(viewPortHandler, xAxis);
        this.i = chart;
    }

    public void e(Canvas c2) {
        if (this.h.f() && this.h.p()) {
            float labelRotationAngleDegrees = this.h.t();
            b.c.a.a.j.c drawLabelAnchor = b.c.a.a.j.c.c(0.5f, 0.25f);
            this.f2488e.setTypeface(this.h.c());
            this.f2488e.setTextSize(this.h.b());
            this.f2488e.setColor(this.h.a());
            float sliceangle = this.i.getSliceAngle();
            float factor = this.i.getFactor();
            b.c.a.a.j.c center = this.i.getCenterOffsets();
            b.c.a.a.j.c pOut = b.c.a.a.j.c.c(0.0f, 0.0f);
            for (int i2 = 0; i2 < ((b.c.a.a.g.a.h) ((i) this.i.getData()).k()).E(); i2++) {
                String label = this.h.n().a((float) i2);
                f.p(center, (this.i.getYRange() * factor) + (((float) this.h.C) / 2.0f), ((((float) i2) * sliceangle) + this.i.getRotationAngle()) % 360.0f, pOut);
                d(c2, label, pOut.f2511c, pOut.f2512d - (((float) this.h.D) / 2.0f), drawLabelAnchor, labelRotationAngleDegrees);
            }
            b.c.a.a.j.c.f(center);
            b.c.a.a.j.c.f(pOut);
            b.c.a.a.j.c.f(drawLabelAnchor);
        }
    }
}
