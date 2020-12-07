package b.b.a.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;
import b.b.a.a;
import b.b.a.d;

public final class c extends a {
    public final float x = 0.05f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(int viewWidth, int viewHeight, float waveCenterY, float density, d view) {
        super(viewWidth, viewHeight, waveCenterY, density, view);
        d.c.a.a.b(view, "view");
        N(b.f2369c.c());
        K(false);
        G(null);
    }

    @Override // b.b.a.a
    public void D(int newPosition) {
        super.D(newPosition);
        H(newPosition);
        if (k() == 0) {
            K(false);
            G(null);
        } else {
            K(true);
            d y = y();
            b.f2369c.a();
            G(y.d(0));
        }
        M(false);
        Q(0.0f);
    }

    public boolean T(MotionEvent ev) {
        d.c.a.a.b(ev, "ev");
        I(ev.getX());
        J(ev.getY());
        if (!o() || ev.getX() >= ((float) A()) * this.x) {
            M(false);
            return false;
        }
        M(true);
        if (k() == 0) {
            return false;
        }
        P(ev.getY());
        return true;
    }

    public boolean V(MotionEvent ev) {
        d.c.a.a.b(ev, "ev");
        if (t()) {
            if (((double) (((float) 1) - (ev.getX() / ((float) A())))) > 0.7d) {
                O(false);
                c(ev.getX(), false);
            } else {
                O(true);
                d(ev.getX(), true, 700);
            }
        }
        return true;
    }

    public boolean U(MotionEvent ev) {
        d.c.a.a.b(ev, "ev");
        I(ev.getX());
        J(ev.getY());
        if (!t()) {
            return false;
        }
        if (!h()) {
            P(ev.getY());
            Q(ev.getX());
            y().b();
        }
        return true;
    }

    public void R(Canvas canvas) {
        if (o() && i() != null && t()) {
            S(canvas);
            if (canvas != null) {
                Bitmap i = i();
                if (i != null) {
                    canvas.drawBitmap(i, ((float) j()) * ((float) A()), 0.0f, u());
                } else {
                    d.c.a.a.f();
                    throw null;
                }
            }
        }
    }

    @Override // b.b.a.a
    public void Q(float rawX) {
        L((float) Math.min(1.0d, Math.max(0.0d, ((double) (((float) A()) - rawX)) / ((double) A()))));
    }

    public final void S(Canvas canvas) {
        e wl = new e(z(), r().d(s()), r().e(s()), r().b(s()), b.f2369c.c());
        wl.b((float) A(), (float) q());
        x().setTranslate(((float) A()) * ((float) j()), 0.0f);
        wl.a().transform(x());
        if (canvas != null) {
            canvas.drawPath(wl.a(), p());
        }
    }
}
