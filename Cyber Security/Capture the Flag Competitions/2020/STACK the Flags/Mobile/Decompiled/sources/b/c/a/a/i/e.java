package b.c.a.a.i;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import b.c.a.a.a.a;
import b.c.a.a.j.f;
import b.c.a.a.j.g;

public abstract class e extends f {
    public e(a animator, g viewPortHandler) {
        super(animator, viewPortHandler);
    }

    public void k(Canvas c2, Path filledPath, Drawable drawable) {
        if (i()) {
            int save = c2.save();
            c2.clipPath(filledPath);
            drawable.setBounds((int) this.f2505a.b(), (int) this.f2505a.d(), (int) this.f2505a.c(), (int) this.f2505a.a());
            drawable.draw(c2);
            c2.restoreToCount(save);
            return;
        }
        throw new RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + f.q() + ".");
    }

    public void j(Canvas c2, Path filledPath, int fillColor, int fillAlpha) {
        int color = (fillAlpha << 24) | (16777215 & fillColor);
        if (i()) {
            int save = c2.save();
            c2.clipPath(filledPath);
            c2.drawColor(color);
            c2.restoreToCount(save);
            return;
        }
        Paint.Style previous = this.f2492c.getStyle();
        int previousColor = this.f2492c.getColor();
        this.f2492c.setStyle(Paint.Style.FILL);
        this.f2492c.setColor(color);
        c2.drawPath(filledPath, this.f2492c);
        this.f2492c.setColor(previousColor);
        this.f2492c.setStyle(previous);
    }

    public final boolean i() {
        return f.q() >= 18;
    }
}
