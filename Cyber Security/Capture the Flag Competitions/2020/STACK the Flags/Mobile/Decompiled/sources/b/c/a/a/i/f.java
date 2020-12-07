package b.c.a.a.i;

import android.graphics.Canvas;
import android.graphics.Path;
import b.c.a.a.a.a;
import b.c.a.a.j.g;

public abstract class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public Path f2501f = new Path();

    public f(a animator, g viewPortHandler) {
        super(animator, viewPortHandler);
    }

    public void h(Canvas c2, float x, float y, b.c.a.a.g.a.f set) {
        this.f2493d.setColor(set.v());
        this.f2493d.setStrokeWidth(set.m());
        this.f2493d.setPathEffect(set.N());
        if (set.L()) {
            this.f2501f.reset();
            this.f2501f.moveTo(x, this.f2505a.d());
            this.f2501f.lineTo(x, this.f2505a.a());
            c2.drawPath(this.f2501f, this.f2493d);
        }
        if (set.Y()) {
            this.f2501f.reset();
            this.f2501f.moveTo(this.f2505a.b(), y);
            this.f2501f.lineTo(this.f2505a.c(), y);
            c2.drawPath(this.f2501f, this.f2493d);
        }
    }
}
