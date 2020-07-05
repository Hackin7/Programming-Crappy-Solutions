package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: bh */
final class C0146bh {

    /* renamed from: a */
    ColorStateList f825a = null;

    /* renamed from: b */
    Mode f826b = null;

    /* renamed from: c */
    private final CompoundButton f827c;

    /* renamed from: d */
    private boolean f828d = false;

    /* renamed from: e */
    private boolean f829e = false;

    /* renamed from: f */
    private boolean f830f;

    C0146bh(CompoundButton compoundButton) {
        this.f827c = compoundButton;
    }

    /* renamed from: b */
    private void m475b() {
        Drawable a = C0436hc.m1384a(this.f827c);
        if (a == null) {
            return;
        }
        if (this.f828d || this.f829e) {
            Drawable mutate = C0345fn.m1156d(a).mutate();
            if (this.f828d) {
                C0345fn.m1147a(mutate, this.f825a);
            }
            if (this.f829e) {
                C0345fn.m1150a(mutate, this.f826b);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f827c.getDrawableState());
            }
            this.f827c.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo960a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0436hc.m1384a(this.f827c);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo961a() {
        if (this.f830f) {
            this.f830f = false;
            return;
        }
        this.f830f = true;
        m475b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo962a(ColorStateList colorStateList) {
        this.f825a = colorStateList;
        this.f828d = true;
        m475b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo963a(Mode mode) {
        this.f826b = mode;
        this.f829e = true;
        m475b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo964a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f827c.getContext().obtainStyledAttributes(attributeSet, C0126j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0126j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C0126j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.f827c.setButtonDrawable(C0785o.m2608b(this.f827c.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C0126j.CompoundButton_buttonTint)) {
                CompoundButton compoundButton = this.f827c;
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C0126j.CompoundButton_buttonTint);
                if (VERSION.SDK_INT >= 21) {
                    compoundButton.setButtonTintList(colorStateList);
                } else if (compoundButton instanceof C0442hh) {
                    ((C0442hh) compoundButton).setSupportButtonTintList(colorStateList);
                }
            }
            if (obtainStyledAttributes.hasValue(C0126j.CompoundButton_buttonTintMode)) {
                CompoundButton compoundButton2 = this.f827c;
                Mode a = C0181cb.m605a(obtainStyledAttributes.getInt(C0126j.CompoundButton_buttonTintMode, -1), null);
                if (VERSION.SDK_INT >= 21) {
                    compoundButton2.setButtonTintMode(a);
                } else if (compoundButton2 instanceof C0442hh) {
                    ((C0442hh) compoundButton2).setSupportButtonTintMode(a);
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
