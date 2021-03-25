package androidx.appcompat.widget;

import a.b.k.g;
import a.b.p.g0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public g0 f1569b;

    public FitWindowsFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setOnFitSystemWindowsListener(g0 listener) {
        this.f1569b = listener;
    }

    public boolean fitSystemWindows(Rect insets) {
        g0 g0Var = this.f1569b;
        if (g0Var != null) {
            ((g.d) g0Var).a(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
