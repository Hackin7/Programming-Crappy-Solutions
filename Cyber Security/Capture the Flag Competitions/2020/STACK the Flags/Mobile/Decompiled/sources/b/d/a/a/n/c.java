package b.d.a.a.n;

import a.h.m.s;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import b.d.a.a.j;
import b.d.a.a.r.g;
import b.d.a.a.t.a;

public class c {
    public static final boolean s = true;

    /* renamed from: a  reason: collision with root package name */
    public final a f2587a;

    /* renamed from: b  reason: collision with root package name */
    public int f2588b;

    /* renamed from: c  reason: collision with root package name */
    public int f2589c;

    /* renamed from: d  reason: collision with root package name */
    public int f2590d;

    /* renamed from: e  reason: collision with root package name */
    public int f2591e;

    /* renamed from: f  reason: collision with root package name */
    public int f2592f;

    /* renamed from: g  reason: collision with root package name */
    public int f2593g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public ColorStateList j;
    public ColorStateList k;
    public final Paint l = new Paint(1);
    public final Rect m = new Rect();
    public final RectF n = new RectF();
    public GradientDrawable o;
    public GradientDrawable p;
    public GradientDrawable q;
    public boolean r = false;

    public c(a button) {
        this.f2587a = button;
    }

    public void i(TypedArray attributes) {
        int i2 = 0;
        this.f2588b = attributes.getDimensionPixelOffset(j.MaterialButton_android_insetLeft, 0);
        this.f2589c = attributes.getDimensionPixelOffset(j.MaterialButton_android_insetRight, 0);
        this.f2590d = attributes.getDimensionPixelOffset(j.MaterialButton_android_insetTop, 0);
        this.f2591e = attributes.getDimensionPixelOffset(j.MaterialButton_android_insetBottom, 0);
        this.f2592f = attributes.getDimensionPixelSize(j.MaterialButton_cornerRadius, 0);
        this.f2593g = attributes.getDimensionPixelSize(j.MaterialButton_strokeWidth, 0);
        this.h = g.a(attributes.getInt(j.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.i = a.a(this.f2587a.getContext(), attributes, j.MaterialButton_backgroundTint);
        this.j = a.a(this.f2587a.getContext(), attributes, j.MaterialButton_strokeColor);
        this.k = a.a(this.f2587a.getContext(), attributes, j.MaterialButton_rippleColor);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth((float) this.f2593g);
        Paint paint = this.l;
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(this.f2587a.getDrawableState(), 0);
        }
        paint.setColor(i2);
        int paddingStart = s.z(this.f2587a);
        int paddingTop = this.f2587a.getPaddingTop();
        int paddingEnd = s.y(this.f2587a);
        int paddingBottom = this.f2587a.getPaddingBottom();
        this.f2587a.setInternalBackground(a());
        s.k0(this.f2587a, this.f2588b + paddingStart, this.f2590d + paddingTop, this.f2589c + paddingEnd, this.f2591e + paddingBottom);
    }

    public void k() {
        this.r = true;
        this.f2587a.setSupportBackgroundTintList(this.i);
        this.f2587a.setSupportBackgroundTintMode(this.h);
    }

    public boolean h() {
        return this.r;
    }

    public final InsetDrawable w(Drawable drawable) {
        return new InsetDrawable(drawable, this.f2588b, this.f2590d, this.f2589c, this.f2591e);
    }

    public void p(ColorStateList tintList) {
        if (this.i != tintList) {
            this.i = tintList;
            v();
        }
    }

    public ColorStateList f() {
        return this.i;
    }

    public void q(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            v();
        }
    }

    public PorterDuff.Mode g() {
        return this.h;
    }

    public final void v() {
        GradientDrawable gradientDrawable = this.o;
        if (gradientDrawable != null) {
            a.h.f.l.a.o(gradientDrawable, this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                a.h.f.l.a.p(this.o, mode);
            }
        }
    }

    @TargetApi(21)
    public final Drawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.o = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f2592f) + 1.0E-5f);
        this.o.setColor(-1);
        v();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.p = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f2592f) + 1.0E-5f);
        this.p.setColor(0);
        this.p.setStroke(this.f2593g, this.j);
        InsetDrawable bgInsetDrawable = w(new LayerDrawable(new Drawable[]{this.o, this.p}));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.q = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.f2592f) + 1.0E-5f);
        this.q.setColor(-1);
        return new b(b.d.a.a.u.a.a(this.k), bgInsetDrawable, this.q);
    }

    public void t(int height, int width) {
        GradientDrawable gradientDrawable = this.q;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f2588b, this.f2590d, width - this.f2589c, height - this.f2591e);
        }
    }

    public void j(int color) {
        GradientDrawable gradientDrawable = this.o;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
    }

    public void m(ColorStateList rippleColor) {
        if (this.k != rippleColor) {
            this.k = rippleColor;
            if (this.f2587a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f2587a.getBackground()).setColor(rippleColor);
            }
        }
    }

    public ColorStateList c() {
        return this.k;
    }

    public void n(ColorStateList strokeColor) {
        if (this.j != strokeColor) {
            this.j = strokeColor;
            Paint paint = this.l;
            int i2 = 0;
            if (strokeColor != null) {
                i2 = strokeColor.getColorForState(this.f2587a.getDrawableState(), 0);
            }
            paint.setColor(i2);
            u();
        }
    }

    public ColorStateList d() {
        return this.j;
    }

    public void o(int strokeWidth) {
        if (this.f2593g != strokeWidth) {
            this.f2593g = strokeWidth;
            this.l.setStrokeWidth((float) strokeWidth);
            u();
        }
    }

    public int e() {
        return this.f2593g;
    }

    public final void u() {
        if (this.p != null) {
            this.f2587a.setInternalBackground(a());
        }
    }

    public void l(int cornerRadius) {
        if (this.f2592f != cornerRadius) {
            this.f2592f = cornerRadius;
            if (this.o != null && this.p != null && this.q != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    r().setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                    s().setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                }
                this.o.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.p.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.q.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
            }
        }
    }

    public int b() {
        return this.f2592f;
    }

    public final GradientDrawable s() {
        if (this.f2587a.getBackground() != null) {
            return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f2587a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
        }
        return null;
    }

    public final GradientDrawable r() {
        if (this.f2587a.getBackground() != null) {
            return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f2587a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
        }
        return null;
    }
}
