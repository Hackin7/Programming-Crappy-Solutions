package a.b.p;

import a.b.j;
import a.b.l.a.a;
import a.h.m.s;
import a.h.n.e;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f376a;

    /* renamed from: b  reason: collision with root package name */
    public u0 f377b;

    /* renamed from: c  reason: collision with root package name */
    public u0 f378c;

    public n(ImageView view) {
        this.f376a = view;
    }

    public void f(AttributeSet attrs, int defStyleAttr) {
        int id;
        w0 a2 = w0.u(this.f376a.getContext(), attrs, j.AppCompatImageView, defStyleAttr, 0);
        ImageView imageView = this.f376a;
        s.X(imageView, imageView.getContext(), j.AppCompatImageView, attrs, a2.q(), defStyleAttr, 0);
        try {
            Drawable drawable = this.f376a.getDrawable();
            if (!(drawable != null || (id = a2.m(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.d(this.f376a.getContext(), id)) == null)) {
                this.f376a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (a2.r(j.AppCompatImageView_tint)) {
                e.c(this.f376a, a2.c(j.AppCompatImageView_tint));
            }
            if (a2.r(j.AppCompatImageView_tintMode)) {
                e.d(this.f376a, e0.d(a2.j(j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.v();
        }
    }

    public void g(int resId) {
        if (resId != 0) {
            Drawable d2 = a.d(this.f376a.getContext(), resId);
            if (d2 != null) {
                e0.b(d2);
            }
            this.f376a.setImageDrawable(d2);
        } else {
            this.f376a.setImageDrawable(null);
        }
        b();
    }

    public boolean e() {
        if (this.f376a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public void h(ColorStateList tint) {
        if (this.f377b == null) {
            this.f377b = new u0();
        }
        u0 u0Var = this.f377b;
        u0Var.f421a = tint;
        u0Var.f424d = true;
        b();
    }

    public ColorStateList c() {
        u0 u0Var = this.f377b;
        if (u0Var != null) {
            return u0Var.f421a;
        }
        return null;
    }

    public void i(PorterDuff.Mode tintMode) {
        if (this.f377b == null) {
            this.f377b = new u0();
        }
        u0 u0Var = this.f377b;
        u0Var.f422b = tintMode;
        u0Var.f423c = true;
        b();
    }

    public PorterDuff.Mode d() {
        u0 u0Var = this.f377b;
        if (u0Var != null) {
            return u0Var.f422b;
        }
        return null;
    }

    public void b() {
        u0 u0Var;
        Drawable imageViewDrawable = this.f376a.getDrawable();
        if (imageViewDrawable != null) {
            e0.b(imageViewDrawable);
        }
        if (imageViewDrawable == null) {
            return;
        }
        if ((!j() || !a(imageViewDrawable)) && (u0Var = this.f377b) != null) {
            j.i(imageViewDrawable, u0Var, this.f376a.getDrawableState());
        }
    }

    public final boolean j() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21 && sdk == 21) {
            return true;
        }
        return false;
    }

    public final boolean a(Drawable imageSource) {
        if (this.f378c == null) {
            this.f378c = new u0();
        }
        u0 info = this.f378c;
        info.a();
        ColorStateList tintList = e.a(this.f376a);
        if (tintList != null) {
            info.f424d = true;
            info.f421a = tintList;
        }
        PorterDuff.Mode mode = e.b(this.f376a);
        if (mode != null) {
            info.f423c = true;
            info.f422b = mode;
        }
        if (!info.f424d && !info.f423c) {
            return false;
        }
        j.i(imageSource, info, this.f376a.getDrawableState());
        return true;
    }
}
