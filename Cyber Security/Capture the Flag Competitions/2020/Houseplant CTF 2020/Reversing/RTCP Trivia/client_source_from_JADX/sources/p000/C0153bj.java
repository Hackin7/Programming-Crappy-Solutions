package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: bj */
public final class C0153bj extends EditText implements C0395gp {

    /* renamed from: a */
    private final C0142bd f846a;

    /* renamed from: b */
    private final C0172bw f847b;

    public C0153bj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.editTextStyle);
    }

    private C0153bj(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        this.f846a = new C0142bd(this);
        this.f846a.mo925a(attributeSet, i);
        this.f847b = new C0172bw(this);
        this.f847b.mo1070a(attributeSet, i);
        this.f847b.mo1065a();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f846a != null) {
            this.f846a.mo928d();
        }
        if (this.f847b != null) {
            this.f847b.mo1065a();
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        if (this.f846a != null) {
            return this.f846a.mo926b();
        }
        return null;
    }

    public final Mode getSupportBackgroundTintMode() {
        if (this.f846a != null) {
            return this.f846a.mo927c();
        }
        return null;
    }

    public final Editable getText() {
        return VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0154bk.m504a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f846a != null) {
            this.f846a.mo921a();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f846a != null) {
            this.f846a.mo922a(i);
        }
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0440hg.m1390a((TextView) this, callback));
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f846a != null) {
            this.f846a.mo923a(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        if (this.f846a != null) {
            this.f846a.mo924a(mode);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f847b != null) {
            this.f847b.mo1069a(context, i);
        }
    }
}
