package a.b.p;

import a.b.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class g extends CheckBox {

    /* renamed from: b  reason: collision with root package name */
    public final i f315b;

    /* renamed from: c  reason: collision with root package name */
    public final e f316c;

    /* renamed from: d  reason: collision with root package name */
    public final y f317d;

    public g(Context context, AttributeSet attrs) {
        this(context, attrs, a.checkboxStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        t0.b(context);
        r0.a(this, getContext());
        i iVar = new i(this);
        this.f315b = iVar;
        iVar.e(attrs, defStyleAttr);
        e eVar = new e(this);
        this.f316c = eVar;
        eVar.e(attrs, defStyleAttr);
        y yVar = new y(this);
        this.f317d = yVar;
        yVar.m(attrs, defStyleAttr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        i iVar = this.f315b;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int resId) {
        setButtonDrawable(a.b.l.a.a.d(getContext(), resId));
    }

    public int getCompoundPaddingLeft() {
        int value = super.getCompoundPaddingLeft();
        i iVar = this.f315b;
        if (iVar != null) {
            iVar.b(value);
        }
        return value;
    }

    public void setSupportButtonTintList(ColorStateList tint) {
        i iVar = this.f315b;
        if (iVar != null) {
            iVar.g(tint);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f315b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode tintMode) {
        i iVar = this.f315b;
        if (iVar != null) {
            iVar.h(tintMode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f315b;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        e eVar = this.f316c;
        if (eVar != null) {
            eVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f316c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        e eVar = this.f316c;
        if (eVar != null) {
            eVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f316c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        e eVar = this.f316c;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        e eVar = this.f316c;
        if (eVar != null) {
            eVar.g(resId);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f316c;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f317d;
        if (yVar != null) {
            yVar.b();
        }
    }
}
