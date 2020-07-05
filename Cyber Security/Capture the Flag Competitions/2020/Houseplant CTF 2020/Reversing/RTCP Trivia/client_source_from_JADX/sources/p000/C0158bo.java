package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: bo */
public final class C0158bo extends MultiAutoCompleteTextView implements C0395gp {

    /* renamed from: a */
    private static final int[] f856a = {16843126};

    /* renamed from: b */
    private final C0142bd f857b;

    /* renamed from: c */
    private final C0172bw f858c;

    public C0158bo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.autoCompleteTextViewStyle);
    }

    private C0158bo(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        C0215cr a = C0215cr.m676a(getContext(), attributeSet, f856a, i, 0);
        if (a.mo1323f(0)) {
            setDropDownBackgroundDrawable(a.mo1312a(0));
        }
        a.f1087b.recycle();
        this.f857b = new C0142bd(this);
        this.f857b.mo925a(attributeSet, i);
        this.f858c = new C0172bw(this);
        this.f858c.mo1070a(attributeSet, i);
        this.f858c.mo1065a();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f857b != null) {
            this.f857b.mo928d();
        }
        if (this.f858c != null) {
            this.f858c.mo1065a();
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        if (this.f857b != null) {
            return this.f857b.mo926b();
        }
        return null;
    }

    public final Mode getSupportBackgroundTintMode() {
        if (this.f857b != null) {
            return this.f857b.mo927c();
        }
        return null;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0154bk.m504a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f857b != null) {
            this.f857b.mo921a();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f857b != null) {
            this.f857b.mo922a(i);
        }
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0785o.m2608b(getContext(), i));
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f857b != null) {
            this.f857b.mo923a(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        if (this.f857b != null) {
            this.f857b.mo924a(mode);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f858c != null) {
            this.f858c.mo1069a(context, i);
        }
    }
}
