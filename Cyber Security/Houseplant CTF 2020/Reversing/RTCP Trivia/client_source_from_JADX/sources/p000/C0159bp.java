package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: bp */
final class C0159bp extends PopupWindow {

    /* renamed from: a */
    private static final boolean f859a = (VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f860b;

    public C0159bp(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C0215cr a = C0215cr.m676a(context, attributeSet, C0126j.PopupWindow, i, i2);
        if (a.mo1323f(C0126j.PopupWindow_overlapAnchor)) {
            boolean a2 = a.mo1313a(C0126j.PopupWindow_overlapAnchor, false);
            if (f859a) {
                this.f860b = a2;
            } else {
                C0439hf.m1389a((PopupWindow) this, a2);
            }
        }
        setBackgroundDrawable(a.mo1312a(C0126j.PopupWindow_android_popupBackground));
        a.f1087b.recycle();
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (f859a && this.f860b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (f859a && this.f860b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        if (f859a && this.f860b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
