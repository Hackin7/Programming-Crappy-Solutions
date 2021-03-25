package b.d.a.a.w;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class a {
    public a(SwipeDismissBehavior<?> behavior) {
        behavior.J(0.1f);
        behavior.I(0.6f);
        behavior.K(0);
    }

    public boolean a(View child) {
        return child instanceof d;
    }

    public void b(CoordinatorLayout parent, View child, MotionEvent event) {
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                e.b().f(null);
            }
        } else if (parent.B(child, (int) event.getX(), (int) event.getY())) {
            e.b().e(null);
        }
    }
}
