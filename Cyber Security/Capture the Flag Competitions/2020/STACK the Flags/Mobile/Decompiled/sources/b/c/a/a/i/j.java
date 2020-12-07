package b.c.a.a.i;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b.c.a.a.c.h;
import b.c.a.a.j.b;
import b.c.a.a.j.c;
import b.c.a.a.j.f;
import b.c.a.a.j.g;

public class j extends a {
    public h h;

    public j(g viewPortHandler, h xAxis) {
        super(viewPortHandler, xAxis);
        new Path();
        new RectF();
        new RectF();
        new Path();
        this.h = xAxis;
        this.f2488e.setColor(-16777216);
        this.f2488e.setTextAlign(Paint.Align.CENTER);
        this.f2488e.setTextSize(f.e(10.0f));
    }

    @Override // b.c.a.a.i.a
    public void a(float min, float max, boolean inverted) {
        if (this.f2505a.e() <= 10.0f || this.f2505a.k()) {
            b(min, max);
            return;
        }
        this.f2505a.b();
        this.f2505a.d();
        throw null;
    }

    @Override // b.c.a.a.i.a
    public void b(float min, float max) {
        super.b(min, max);
        c();
    }

    public void c() {
        String longest = this.h.m();
        this.f2488e.setTypeface(this.h.c());
        this.f2488e.setTextSize(this.h.b());
        b labelSize = f.b(this.f2488e, longest);
        float labelWidth = labelSize.f2508c;
        float labelHeight = (float) f.a(this.f2488e, "Q");
        b labelRotatedSize = f.r(labelWidth, labelHeight, this.h.t());
        this.h.A = Math.round(labelWidth);
        this.h.B = Math.round(labelHeight);
        this.h.C = Math.round(labelRotatedSize.f2508c);
        this.h.D = Math.round(labelRotatedSize.f2509d);
        b.c(labelRotatedSize);
        b.c(labelSize);
    }

    public void d(Canvas c2, String formattedLabel, float x, float y, c anchor, float angleDegrees) {
        f.g(c2, formattedLabel, x, y, this.f2488e, anchor, angleDegrees);
    }
}
