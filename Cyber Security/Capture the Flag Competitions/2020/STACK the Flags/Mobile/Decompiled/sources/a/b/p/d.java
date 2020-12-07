package a.b.p;

import a.b.a;
import a.h.n.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

public class d extends AutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f293d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final e f294b;

    /* renamed from: c  reason: collision with root package name */
    public final y f295c;

    public d(Context context, AttributeSet attrs) {
        this(context, attrs, a.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        t0.b(context);
        r0.a(this, getContext());
        w0 a2 = w0.u(getContext(), attrs, f293d, defStyleAttr, 0);
        if (a2.r(0)) {
            setDropDownBackgroundDrawable(a2.f(0));
        }
        a2.v();
        e eVar = new e(this);
        this.f294b = eVar;
        eVar.e(attrs, defStyleAttr);
        y yVar = new y(this);
        this.f295c = yVar;
        yVar.m(attrs, defStyleAttr);
        this.f295c.b();
    }

    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(a.b.l.a.a.d(getContext(), resId));
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        e eVar = this.f294b;
        if (eVar != null) {
            eVar.g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        e eVar = this.f294b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        e eVar = this.f294b;
        if (eVar != null) {
            eVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f294b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        e eVar = this.f294b;
        if (eVar != null) {
            eVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f294b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f294b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f295c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        y yVar = this.f295c;
        if (yVar != null) {
            yVar.q(context, resId);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        l.a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(i.p(this, actionModeCallback));
    }
}
