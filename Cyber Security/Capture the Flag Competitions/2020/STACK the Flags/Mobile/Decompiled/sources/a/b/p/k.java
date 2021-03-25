package a.b.p;

import a.b.a;
import a.h.n.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

public class k extends EditText {

    /* renamed from: b  reason: collision with root package name */
    public final e f364b;

    /* renamed from: c  reason: collision with root package name */
    public final y f365c;

    /* renamed from: d  reason: collision with root package name */
    public final x f366d;

    public k(Context context, AttributeSet attrs) {
        this(context, attrs, a.editTextStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        t0.b(context);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f364b = eVar;
        eVar.e(attrs, defStyleAttr);
        y yVar = new y(this);
        this.f365c = yVar;
        yVar.m(attrs, defStyleAttr);
        this.f365c.b();
        this.f366d = new x(this);
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        e eVar = this.f364b;
        if (eVar != null) {
            eVar.g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        e eVar = this.f364b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        e eVar = this.f364b;
        if (eVar != null) {
            eVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f364b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        e eVar = this.f364b;
        if (eVar != null) {
            eVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f364b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f364b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f365c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        y yVar = this.f365c;
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

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f366d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f366d) == null) {
            return super.getTextClassifier();
        }
        return xVar.a();
    }
}
