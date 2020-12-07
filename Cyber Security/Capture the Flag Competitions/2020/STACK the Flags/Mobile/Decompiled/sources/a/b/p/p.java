package a.b.p;

import a.b.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class p extends MultiAutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f388d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final e f389b;

    /* renamed from: c  reason: collision with root package name */
    public final y f390c;

    public p(Context context, AttributeSet attrs) {
        this(context, attrs, a.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        t0.b(context);
        r0.a(this, getContext());
        w0 a2 = w0.u(getContext(), attrs, f388d, defStyleAttr, 0);
        if (a2.r(0)) {
            setDropDownBackgroundDrawable(a2.f(0));
        }
        a2.v();
        e eVar = new e(this);
        this.f389b = eVar;
        eVar.e(attrs, defStyleAttr);
        y yVar = new y(this);
        this.f390c = yVar;
        yVar.m(attrs, defStyleAttr);
        this.f390c.b();
    }

    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(a.b.l.a.a.d(getContext(), resId));
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        e eVar = this.f389b;
        if (eVar != null) {
            eVar.g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        e eVar = this.f389b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        e eVar = this.f389b;
        if (eVar != null) {
            eVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f389b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        e eVar = this.f389b;
        if (eVar != null) {
            eVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f389b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f389b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f390c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        y yVar = this.f390c;
        if (yVar != null) {
            yVar.q(context, resId);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        l.a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }
}
