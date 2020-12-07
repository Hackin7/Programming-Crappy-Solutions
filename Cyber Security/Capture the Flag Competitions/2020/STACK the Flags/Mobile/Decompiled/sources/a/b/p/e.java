package a.b.p;

import a.b.j;
import a.h.m.s;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f297a;

    /* renamed from: b  reason: collision with root package name */
    public final j f298b;

    /* renamed from: c  reason: collision with root package name */
    public int f299c = -1;

    /* renamed from: d  reason: collision with root package name */
    public u0 f300d;

    /* renamed from: e  reason: collision with root package name */
    public u0 f301e;

    /* renamed from: f  reason: collision with root package name */
    public u0 f302f;

    public e(View view) {
        this.f297a = view;
        this.f298b = j.b();
    }

    public void e(AttributeSet attrs, int defStyleAttr) {
        w0 a2 = w0.u(this.f297a.getContext(), attrs, j.ViewBackgroundHelper, defStyleAttr, 0);
        View view = this.f297a;
        s.X(view, view.getContext(), j.ViewBackgroundHelper, attrs, a2.q(), defStyleAttr, 0);
        try {
            if (a2.r(j.ViewBackgroundHelper_android_background)) {
                this.f299c = a2.m(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList tint = this.f298b.f(this.f297a.getContext(), this.f299c);
                if (tint != null) {
                    h(tint);
                }
            }
            if (a2.r(j.ViewBackgroundHelper_backgroundTint)) {
                s.b0(this.f297a, a2.c(j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.r(j.ViewBackgroundHelper_backgroundTintMode)) {
                s.c0(this.f297a, e0.d(a2.j(j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.v();
        }
    }

    public void g(int resId) {
        ColorStateList colorStateList;
        this.f299c = resId;
        j jVar = this.f298b;
        if (jVar != null) {
            colorStateList = jVar.f(this.f297a.getContext(), resId);
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    public void f() {
        this.f299c = -1;
        h(null);
        b();
    }

    public void i(ColorStateList tint) {
        if (this.f301e == null) {
            this.f301e = new u0();
        }
        u0 u0Var = this.f301e;
        u0Var.f421a = tint;
        u0Var.f424d = true;
        b();
    }

    public ColorStateList c() {
        u0 u0Var = this.f301e;
        if (u0Var != null) {
            return u0Var.f421a;
        }
        return null;
    }

    public void j(PorterDuff.Mode tintMode) {
        if (this.f301e == null) {
            this.f301e = new u0();
        }
        u0 u0Var = this.f301e;
        u0Var.f422b = tintMode;
        u0Var.f423c = true;
        b();
    }

    public PorterDuff.Mode d() {
        u0 u0Var = this.f301e;
        if (u0Var != null) {
            return u0Var.f422b;
        }
        return null;
    }

    public void b() {
        Drawable background = this.f297a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            u0 u0Var = this.f301e;
            if (u0Var != null) {
                j.i(background, u0Var, this.f297a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f300d;
            if (u0Var2 != null) {
                j.i(background, u0Var2, this.f297a.getDrawableState());
            }
        }
    }

    public void h(ColorStateList tint) {
        if (tint != null) {
            if (this.f300d == null) {
                this.f300d = new u0();
            }
            u0 u0Var = this.f300d;
            u0Var.f421a = tint;
            u0Var.f424d = true;
        } else {
            this.f300d = null;
        }
        b();
    }

    public final boolean k() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f300d != null) {
            return true;
        }
        return false;
    }

    public final boolean a(Drawable background) {
        if (this.f302f == null) {
            this.f302f = new u0();
        }
        u0 info = this.f302f;
        info.a();
        ColorStateList tintList = s.m(this.f297a);
        if (tintList != null) {
            info.f424d = true;
            info.f421a = tintList;
        }
        PorterDuff.Mode mode = s.n(this.f297a);
        if (mode != null) {
            info.f423c = true;
            info.f422b = mode;
        }
        if (!info.f424d && !info.f423c) {
            return false;
        }
        j.i(background, info, this.f297a.getDrawableState());
        return true;
    }
}
