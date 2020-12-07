package b.d.a.a.r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f2627a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f2628b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2629c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final b f2630d = new b();

    /* renamed from: e  reason: collision with root package name */
    public float f2631e;

    /* renamed from: f  reason: collision with root package name */
    public int f2632f;

    /* renamed from: g  reason: collision with root package name */
    public int f2633g;
    public int h;
    public int i;
    public ColorStateList j;
    public int k;
    public boolean l = true;
    public float m;

    public a() {
        Paint paint = new Paint(1);
        this.f2627a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f2630d;
    }

    public void d(int topOuterStrokeColor, int topInnerStrokeColor, int bottomOuterStrokeColor, int bottomInnerStrokeColor) {
        this.f2632f = topOuterStrokeColor;
        this.f2633g = topInnerStrokeColor;
        this.h = bottomOuterStrokeColor;
        this.i = bottomInnerStrokeColor;
    }

    public void c(float width) {
        if (this.f2631e != width) {
            this.f2631e = width;
            this.f2627a.setStrokeWidth(1.3333f * width);
            this.l = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.l) {
            this.f2627a.setShader(a());
            this.l = false;
        }
        float halfBorderWidth = this.f2627a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f2629c;
        copyBounds(this.f2628b);
        rectF.set(this.f2628b);
        rectF.left += halfBorderWidth;
        rectF.top += halfBorderWidth;
        rectF.right -= halfBorderWidth;
        rectF.bottom -= halfBorderWidth;
        canvas.save();
        canvas.rotate(this.m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f2627a);
        canvas.restore();
    }

    public boolean getPadding(Rect padding) {
        int borderWidth = Math.round(this.f2631e);
        padding.set(borderWidth, borderWidth, borderWidth, borderWidth);
        return true;
    }

    public void setAlpha(int alpha) {
        this.f2627a.setAlpha(alpha);
        invalidateSelf();
    }

    public void b(ColorStateList tint) {
        if (tint != null) {
            this.k = tint.getColorForState(getState(), this.k);
        }
        this.j = tint;
        this.l = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2627a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f2631e > 0.0f ? -3 : -2;
    }

    public final void e(float rotation) {
        if (rotation != this.m) {
            this.m = rotation;
            invalidateSelf();
        }
    }

    public void onBoundsChange(Rect bounds) {
        this.l = true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public boolean onStateChange(int[] state) {
        int newColor;
        ColorStateList colorStateList = this.j;
        if (!(colorStateList == null || (newColor = colorStateList.getColorForState(state, this.k)) == this.k)) {
            this.l = true;
            this.k = newColor;
        }
        if (this.l) {
            invalidateSelf();
        }
        return this.l;
    }

    public final Shader a() {
        Rect rect = this.f2628b;
        copyBounds(rect);
        float borderRatio = this.f2631e / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{a.h.f.a.b(this.f2632f, this.k), a.h.f.a.b(this.f2633g, this.k), a.h.f.a.b(a.h.f.a.d(this.f2633g, 0), this.k), a.h.f.a.b(a.h.f.a.d(this.i, 0), this.k), a.h.f.a.b(this.i, this.k), a.h.f.a.b(this.h, this.k)}, new float[]{0.0f, borderRatio, 0.5f, 0.5f, 1.0f - borderRatio, 1.0f}, Shader.TileMode.CLAMP);
    }

    public class b extends Drawable.ConstantState {
        public b() {
        }

        public Drawable newDrawable() {
            return a.this;
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }
}
