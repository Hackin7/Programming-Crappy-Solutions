package a.b.p;

import a.b.j;
import a.h.f.l.a;
import a.h.m.s;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class v extends r {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f425d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f426e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f427f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f428g = null;
    public boolean h = false;
    public boolean i = false;

    public v(SeekBar view) {
        super(view);
        this.f425d = view;
    }

    @Override // a.b.p.r
    public void c(AttributeSet attrs, int defStyleAttr) {
        super.c(attrs, defStyleAttr);
        w0 a2 = w0.u(this.f425d.getContext(), attrs, j.AppCompatSeekBar, defStyleAttr, 0);
        SeekBar seekBar = this.f425d;
        s.X(seekBar, seekBar.getContext(), j.AppCompatSeekBar, attrs, a2.q(), defStyleAttr, 0);
        Drawable drawable = a2.g(j.AppCompatSeekBar_android_thumb);
        if (drawable != null) {
            this.f425d.setThumb(drawable);
        }
        j(a2.f(j.AppCompatSeekBar_tickMark));
        if (a2.r(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f428g = e0.d(a2.j(j.AppCompatSeekBar_tickMarkTintMode, -1), this.f428g);
            this.i = true;
        }
        if (a2.r(j.AppCompatSeekBar_tickMarkTint)) {
            this.f427f = a2.c(j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        a2.v();
        f();
    }

    public void j(Drawable tickMark) {
        Drawable drawable = this.f426e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f426e = tickMark;
        if (tickMark != null) {
            tickMark.setCallback(this.f425d);
            a.m(tickMark, s.v(this.f425d));
            if (tickMark.isStateful()) {
                tickMark.setState(this.f425d.getDrawableState());
            }
            f();
        }
        this.f425d.invalidate();
    }

    public final void f() {
        if (this.f426e == null) {
            return;
        }
        if (this.h || this.i) {
            Drawable q = a.q(this.f426e.mutate());
            this.f426e = q;
            if (this.h) {
                a.o(q, this.f427f);
            }
            if (this.i) {
                a.p(this.f426e, this.f428g);
            }
            if (this.f426e.isStateful()) {
                this.f426e.setState(this.f425d.getDrawableState());
            }
        }
    }

    public void i() {
        Drawable drawable = this.f426e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void h() {
        Drawable tickMark = this.f426e;
        if (tickMark != null && tickMark.isStateful() && tickMark.setState(this.f425d.getDrawableState())) {
            this.f425d.invalidateDrawable(tickMark);
        }
    }

    public void g(Canvas canvas) {
        if (this.f426e != null) {
            int count = this.f425d.getMax();
            int halfH = 1;
            if (count > 1) {
                int w = this.f426e.getIntrinsicWidth();
                int h2 = this.f426e.getIntrinsicHeight();
                int halfW = w >= 0 ? w / 2 : 1;
                if (h2 >= 0) {
                    halfH = h2 / 2;
                }
                this.f426e.setBounds(-halfW, -halfH, halfW, halfH);
                float spacing = ((float) ((this.f425d.getWidth() - this.f425d.getPaddingLeft()) - this.f425d.getPaddingRight())) / ((float) count);
                int saveCount = canvas.save();
                canvas.translate((float) this.f425d.getPaddingLeft(), (float) (this.f425d.getHeight() / 2));
                for (int i2 = 0; i2 <= count; i2++) {
                    this.f426e.draw(canvas);
                    canvas.translate(spacing, 0.0f);
                }
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
