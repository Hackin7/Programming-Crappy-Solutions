package a.d.e;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f500a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f501b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f502c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f503d;

    /* renamed from: e  reason: collision with root package name */
    public float f504e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f505f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f506g = true;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public d(ColorStateList backgroundColor, float radius) {
        this.f500a = radius;
        this.f501b = new Paint(5);
        e(backgroundColor);
        this.f502c = new RectF();
        this.f503d = new Rect();
    }

    public final void e(ColorStateList color) {
        ColorStateList valueOf = color == null ? ColorStateList.valueOf(0) : color;
        this.h = valueOf;
        this.f501b.setColor(valueOf.getColorForState(getState(), this.h.getDefaultColor()));
    }

    public void g(float padding, boolean insetForPadding, boolean insetForRadius) {
        if (padding != this.f504e || this.f505f != insetForPadding || this.f506g != insetForRadius) {
            this.f504e = padding;
            this.f505f = insetForPadding;
            this.f506g = insetForRadius;
            i(null);
            invalidateSelf();
        }
    }

    public float c() {
        return this.f504e;
    }

    public void draw(Canvas canvas) {
        boolean clearColorFilter;
        Paint paint = this.f501b;
        if (this.i == null || paint.getColorFilter() != null) {
            clearColorFilter = false;
        } else {
            paint.setColorFilter(this.i);
            clearColorFilter = true;
        }
        RectF rectF = this.f502c;
        float f2 = this.f500a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (clearColorFilter) {
            paint.setColorFilter(null);
        }
    }

    public final void i(Rect bounds) {
        if (bounds == null) {
            bounds = getBounds();
        }
        this.f502c.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        this.f503d.set(bounds);
        if (this.f505f) {
            float vInset = e.b(this.f504e, this.f500a, this.f506g);
            this.f503d.inset((int) Math.ceil((double) e.a(this.f504e, this.f500a, this.f506g)), (int) Math.ceil((double) vInset));
            this.f502c.set(this.f503d);
        }
    }

    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        i(bounds);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f503d, this.f500a);
    }

    public void h(float radius) {
        if (radius != this.f500a) {
            this.f500a = radius;
            i(null);
            invalidateSelf();
        }
    }

    public void setAlpha(int alpha) {
        this.f501b.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f501b.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    public float d() {
        return this.f500a;
    }

    public void f(ColorStateList color) {
        e(color);
        invalidateSelf();
    }

    public ColorStateList b() {
        return this.h;
    }

    public void setTintList(ColorStateList tint) {
        this.j = tint;
        this.i = a(tint, this.k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        this.k = tintMode;
        this.i = a(this.j, tintMode);
        invalidateSelf();
    }

    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int newColor = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        boolean colorChanged = newColor != this.f501b.getColor();
        if (colorChanged) {
            this.f501b.setColor(newColor);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return colorChanged;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final PorterDuffColorFilter a(ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }
}
