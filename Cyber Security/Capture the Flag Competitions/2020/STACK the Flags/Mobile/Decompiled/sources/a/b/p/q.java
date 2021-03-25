package a.b.p;

import a.b.j;
import a.h.n.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

public class q extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f399a = false;

    public q(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        a(context, attrs, defStyleAttr, defStyleRes);
    }

    public final void a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        w0 a2 = w0.u(context, attrs, j.PopupWindow, defStyleAttr, defStyleRes);
        if (a2.r(j.PopupWindow_overlapAnchor)) {
            b(a2.a(j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a2.f(j.PopupWindow_android_popupBackground));
        a2.v();
    }

    public void showAsDropDown(View anchor, int xoff, int yoff) {
        super.showAsDropDown(anchor, xoff, yoff);
    }

    public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) {
        super.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    @Override // android.widget.PopupWindow
    public void update(View anchor, int xoff, int yoff, int width, int height) {
        super.update(anchor, xoff, yoff, width, height);
    }

    public final void b(boolean overlapAnchor) {
        h.a(this, overlapAnchor);
    }
}
