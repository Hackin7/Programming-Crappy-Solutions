package a.b.p;

import a.b.l.a.a;
import a.h.n.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class h extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f318c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    public final y f319b;

    public h(Context context, AttributeSet attrs) {
        this(context, attrs, 16843720);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        t0.b(context);
        r0.a(this, getContext());
        y yVar = new y(this);
        this.f319b = yVar;
        yVar.m(attrs, defStyleAttr);
        this.f319b.b();
        w0 a2 = w0.u(getContext(), attrs, f318c, defStyleAttr, 0);
        setCheckMarkDrawable(a2.f(0));
        a2.v();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int resId) {
        setCheckMarkDrawable(a.d(getContext(), resId));
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        y yVar = this.f319b;
        if (yVar != null) {
            yVar.q(context, resId);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f319b;
        if (yVar != null) {
            yVar.b();
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
