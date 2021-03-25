package b.d.a.a.n;

import a.b.p.f;
import a.h.m.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import b.d.a.a.b;
import b.d.a.a.i;
import b.d.a.a.j;
import b.d.a.a.r.g;

public class a extends f {

    /* renamed from: d  reason: collision with root package name */
    public final c f2583d;

    /* renamed from: e  reason: collision with root package name */
    public int f2584e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f2585f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2586g;
    public Drawable h;
    public int i;
    public int j;
    public int k;

    public a(Context context, AttributeSet attrs) {
        this(context, attrs, b.materialButtonStyle);
    }

    public a(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray attributes = b.d.a.a.r.f.h(context, attrs, j.MaterialButton, defStyleAttr, i.Widget_MaterialComponents_Button, new int[0]);
        this.f2584e = attributes.getDimensionPixelSize(j.MaterialButton_iconPadding, 0);
        this.f2585f = g.a(attributes.getInt(j.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f2586g = b.d.a.a.t.a.a(getContext(), attributes, j.MaterialButton_iconTint);
        this.h = b.d.a.a.t.a.b(getContext(), attributes, j.MaterialButton_icon);
        this.k = attributes.getInteger(j.MaterialButton_iconGravity, 1);
        this.i = attributes.getDimensionPixelSize(j.MaterialButton_iconSize, 0);
        c cVar = new c(this);
        this.f2583d = cVar;
        cVar.i(attributes);
        attributes.recycle();
        setCompoundDrawablePadding(this.f2584e);
        c();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // a.b.p.f
    public void setSupportBackgroundTintList(ColorStateList tint) {
        if (b()) {
            this.f2583d.p(tint);
        } else if (this.f2583d != null) {
            super.setSupportBackgroundTintList(tint);
        }
    }

    @Override // a.b.p.f
    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f2583d.f();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // a.b.p.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (b()) {
            this.f2583d.q(tintMode);
        } else if (this.f2583d != null) {
            super.setSupportBackgroundTintMode(tintMode);
        }
    }

    @Override // a.b.p.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f2583d.g();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void setBackgroundTintList(ColorStateList tintList) {
        setSupportBackgroundTintList(tintList);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        setSupportBackgroundTintMode(tintMode);
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public void setBackgroundColor(int color) {
        if (b()) {
            this.f2583d.j(color);
        } else {
            super.setBackgroundColor(color);
        }
    }

    public void setBackground(Drawable background) {
        setBackgroundDrawable(background);
    }

    @Override // a.b.p.f
    public void setBackgroundResource(int backgroundResourceId) {
        Drawable background = null;
        if (backgroundResourceId != 0) {
            background = a.b.l.a.a.d(getContext(), backgroundResourceId);
        }
        setBackgroundDrawable(background);
    }

    @Override // a.b.p.f
    public void setBackgroundDrawable(Drawable background) {
        if (!b()) {
            super.setBackgroundDrawable(background);
        } else if (background != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.f2583d.k();
            super.setBackgroundDrawable(background);
        } else {
            getBackground().setState(background.getState());
        }
    }

    @Override // a.b.p.f
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        c cVar;
        super.onLayout(changed, left, top, right, bottom);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f2583d) != null) {
            cVar.t(bottom - top, right - left);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.h != null && this.k == 2) {
            int textWidth = (int) getPaint().measureText(getText().toString());
            int localIconSize = this.i;
            if (localIconSize == 0) {
                localIconSize = this.h.getIntrinsicWidth();
            }
            int newIconLeft = (((((getMeasuredWidth() - textWidth) - s.y(this)) - localIconSize) - this.f2584e) - s.z(this)) / 2;
            if (a()) {
                newIconLeft = -newIconLeft;
            }
            if (this.j != newIconLeft) {
                this.j = newIconLeft;
                c();
            }
        }
    }

    public final boolean a() {
        return s.v(this) == 1;
    }

    public void setInternalBackground(Drawable background) {
        super.setBackgroundDrawable(background);
    }

    public void setIconPadding(int iconPadding) {
        if (this.f2584e != iconPadding) {
            this.f2584e = iconPadding;
            setCompoundDrawablePadding(iconPadding);
        }
    }

    public int getIconPadding() {
        return this.f2584e;
    }

    public void setIconSize(int iconSize) {
        if (iconSize < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.i != iconSize) {
            this.i = iconSize;
            c();
        }
    }

    public int getIconSize() {
        return this.i;
    }

    public void setIcon(Drawable icon) {
        if (this.h != icon) {
            this.h = icon;
            c();
        }
    }

    public void setIconResource(int iconResourceId) {
        Drawable icon = null;
        if (iconResourceId != 0) {
            icon = a.b.l.a.a.d(getContext(), iconResourceId);
        }
        setIcon(icon);
    }

    public Drawable getIcon() {
        return this.h;
    }

    public void setIconTint(ColorStateList iconTint) {
        if (this.f2586g != iconTint) {
            this.f2586g = iconTint;
            c();
        }
    }

    public void setIconTintResource(int iconTintResourceId) {
        setIconTint(a.b.l.a.a.c(getContext(), iconTintResourceId));
    }

    public ColorStateList getIconTint() {
        return this.f2586g;
    }

    public void setIconTintMode(PorterDuff.Mode iconTintMode) {
        if (this.f2585f != iconTintMode) {
            this.f2585f = iconTintMode;
            c();
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2585f;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.h = mutate;
            a.h.f.l.a.o(mutate, this.f2586g);
            PorterDuff.Mode mode = this.f2585f;
            if (mode != null) {
                a.h.f.l.a.p(this.h, mode);
            }
            int width = this.i;
            if (width == 0) {
                width = this.h.getIntrinsicWidth();
            }
            int height = this.i;
            if (height == 0) {
                height = this.h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h;
            int i2 = this.j;
            drawable2.setBounds(i2, 0, i2 + width, height);
        }
        a.h.n.i.i(this, this.h, null, null, null);
    }

    public void setRippleColor(ColorStateList rippleColor) {
        if (b()) {
            this.f2583d.m(rippleColor);
        }
    }

    public void setRippleColorResource(int rippleColorResourceId) {
        if (b()) {
            setRippleColor(a.b.l.a.a.c(getContext(), rippleColorResourceId));
        }
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f2583d.c();
        }
        return null;
    }

    public void setStrokeColor(ColorStateList strokeColor) {
        if (b()) {
            this.f2583d.n(strokeColor);
        }
    }

    public void setStrokeColorResource(int strokeColorResourceId) {
        if (b()) {
            setStrokeColor(a.b.l.a.a.c(getContext(), strokeColorResourceId));
        }
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f2583d.d();
        }
        return null;
    }

    public void setStrokeWidth(int strokeWidth) {
        if (b()) {
            this.f2583d.o(strokeWidth);
        }
    }

    public void setStrokeWidthResource(int strokeWidthResourceId) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(strokeWidthResourceId));
        }
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f2583d.e();
        }
        return 0;
    }

    public void setCornerRadius(int cornerRadius) {
        if (b()) {
            this.f2583d.l(cornerRadius);
        }
    }

    public void setCornerRadiusResource(int cornerRadiusResourceId) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(cornerRadiusResourceId));
        }
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f2583d.b();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.k;
    }

    public void setIconGravity(int iconGravity) {
        this.k = iconGravity;
    }

    public final boolean b() {
        c cVar = this.f2583d;
        return cVar != null && !cVar.h();
    }
}
