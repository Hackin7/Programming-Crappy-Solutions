package a.b.p;

import a.b.j;
import a.b.l.a.a;
import a.h.m.s;
import a.h.n.c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f328a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f329b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f330c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f331d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f332e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f333f;

    public i(CompoundButton view) {
        this.f328a = view;
    }

    public void e(AttributeSet attrs, int defStyleAttr) {
        int resourceId;
        int resourceId2;
        w0 a2 = w0.u(this.f328a.getContext(), attrs, j.CompoundButton, defStyleAttr, 0);
        CompoundButton compoundButton = this.f328a;
        s.X(compoundButton, compoundButton.getContext(), j.CompoundButton, attrs, a2.q(), defStyleAttr, 0);
        boolean buttonDrawableLoaded = false;
        try {
            if (a2.r(j.CompoundButton_buttonCompat) && (resourceId2 = a2.m(j.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    this.f328a.setButtonDrawable(a.d(this.f328a.getContext(), resourceId2));
                    buttonDrawableLoaded = true;
                } catch (Resources.NotFoundException e2) {
                }
            }
            if (!buttonDrawableLoaded && a2.r(j.CompoundButton_android_button) && (resourceId = a2.m(j.CompoundButton_android_button, 0)) != 0) {
                this.f328a.setButtonDrawable(a.d(this.f328a.getContext(), resourceId));
            }
            if (a2.r(j.CompoundButton_buttonTint)) {
                c.b(this.f328a, a2.c(j.CompoundButton_buttonTint));
            }
            if (a2.r(j.CompoundButton_buttonTintMode)) {
                c.c(this.f328a, e0.d(a2.j(j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            a2.v();
        }
    }

    public void g(ColorStateList tint) {
        this.f329b = tint;
        this.f331d = true;
        a();
    }

    public ColorStateList c() {
        return this.f329b;
    }

    public void h(PorterDuff.Mode tintMode) {
        this.f330c = tintMode;
        this.f332e = true;
        a();
    }

    public PorterDuff.Mode d() {
        return this.f330c;
    }

    public void f() {
        if (this.f333f) {
            this.f333f = false;
            return;
        }
        this.f333f = true;
        a();
    }

    public void a() {
        Drawable buttonDrawable = c.a(this.f328a);
        if (buttonDrawable == null) {
            return;
        }
        if (this.f331d || this.f332e) {
            Drawable buttonDrawable2 = a.h.f.l.a.q(buttonDrawable).mutate();
            if (this.f331d) {
                a.h.f.l.a.o(buttonDrawable2, this.f329b);
            }
            if (this.f332e) {
                a.h.f.l.a.p(buttonDrawable2, this.f330c);
            }
            if (buttonDrawable2.isStateful()) {
                buttonDrawable2.setState(this.f328a.getDrawableState());
            }
            this.f328a.setButtonDrawable(buttonDrawable2);
        }
    }

    public int b(int superValue) {
        return superValue;
    }
}
