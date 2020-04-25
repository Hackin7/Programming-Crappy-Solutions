package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: bf */
public final class C0144bf extends CheckBox implements C0442hh {

    /* renamed from: a */
    private final C0146bh f822a;

    public C0144bf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.checkboxStyle);
    }

    private C0144bf(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        this.f822a = new C0146bh(this);
        this.f822a.mo964a(attributeSet, i);
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f822a != null ? this.f822a.mo960a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public final ColorStateList getSupportButtonTintList() {
        if (this.f822a != null) {
            return this.f822a.f825a;
        }
        return null;
    }

    public final Mode getSupportButtonTintMode() {
        if (this.f822a != null) {
            return this.f822a.f826b;
        }
        return null;
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C0785o.m2608b(getContext(), i));
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f822a != null) {
            this.f822a.mo961a();
        }
    }

    public final void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f822a != null) {
            this.f822a.mo962a(colorStateList);
        }
    }

    public final void setSupportButtonTintMode(Mode mode) {
        if (this.f822a != null) {
            this.f822a.mo963a(mode);
        }
    }
}
