package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: bg */
public final class C0145bg extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f823a = {16843016};

    /* renamed from: b */
    private final C0172bw f824b;

    public C0145bg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C0145bg(Context context, AttributeSet attributeSet, byte b) {
        super(C0212co.m672a(context), attributeSet, 16843720);
        this.f824b = new C0172bw(this);
        this.f824b.mo1070a(attributeSet, 16843720);
        this.f824b.mo1065a();
        C0215cr a = C0215cr.m676a(getContext(), attributeSet, f823a, 16843720, 0);
        setCheckMarkDrawable(a.mo1312a(0));
        a.f1087b.recycle();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f824b != null) {
            this.f824b.mo1065a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0154bk.m504a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0785o.m2608b(getContext(), i));
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0440hg.m1390a((TextView) this, callback));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f824b != null) {
            this.f824b.mo1069a(context, i);
        }
    }
}
