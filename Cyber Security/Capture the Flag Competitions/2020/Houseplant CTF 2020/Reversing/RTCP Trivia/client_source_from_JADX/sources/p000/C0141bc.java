package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* renamed from: bc */
public class C0141bc extends AutoCompleteTextView implements C0395gp {

    /* renamed from: a */
    private static final int[] f811a = {16843126};

    /* renamed from: b */
    private final C0142bd f812b;

    /* renamed from: c */
    private final C0172bw f813c;

    public C0141bc(Context context) {
        this(context, null);
    }

    public C0141bc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.autoCompleteTextViewStyle);
    }

    public C0141bc(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        C0215cr a = C0215cr.m676a(getContext(), attributeSet, f811a, i, 0);
        if (a.mo1323f(0)) {
            setDropDownBackgroundDrawable(a.mo1312a(0));
        }
        a.f1087b.recycle();
        this.f812b = new C0142bd(this);
        this.f812b.mo925a(attributeSet, i);
        this.f813c = new C0172bw(this);
        this.f813c.mo1070a(attributeSet, i);
        this.f813c.mo1065a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f812b != null) {
            this.f812b.mo928d();
        }
        if (this.f813c != null) {
            this.f813c.mo1065a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f812b != null) {
            return this.f812b.mo926b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f812b != null) {
            return this.f812b.mo927c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0154bk.m504a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f812b != null) {
            this.f812b.mo921a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f812b != null) {
            this.f812b.mo922a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0440hg.m1390a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0785o.m2608b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f812b != null) {
            this.f812b.mo923a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f812b != null) {
            this.f812b.mo924a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f813c != null) {
            this.f813c.mo1069a(context, i);
        }
    }
}
