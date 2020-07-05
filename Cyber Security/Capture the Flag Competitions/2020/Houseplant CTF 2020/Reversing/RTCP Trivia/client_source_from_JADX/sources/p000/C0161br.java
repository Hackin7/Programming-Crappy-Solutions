package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: br */
public final class C0161br extends RadioButton implements C0442hh {

    /* renamed from: a */
    private final C0146bh f864a;

    /* renamed from: b */
    private final C0172bw f865b;

    public C0161br(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.radioButtonStyle);
    }

    private C0161br(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        this.f864a = new C0146bh(this);
        this.f864a.mo964a(attributeSet, i);
        this.f865b = new C0172bw(this);
        this.f865b.mo1070a(attributeSet, i);
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f864a != null ? this.f864a.mo960a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public final ColorStateList getSupportButtonTintList() {
        if (this.f864a != null) {
            return this.f864a.f825a;
        }
        return null;
    }

    public final Mode getSupportButtonTintMode() {
        if (this.f864a != null) {
            return this.f864a.f826b;
        }
        return null;
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(C0785o.m2608b(getContext(), i));
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f864a != null) {
            this.f864a.mo961a();
        }
    }

    public final void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f864a != null) {
            this.f864a.mo962a(colorStateList);
        }
    }

    public final void setSupportButtonTintMode(Mode mode) {
        if (this.f864a != null) {
            this.f864a.mo963a(mode);
        }
    }
}
