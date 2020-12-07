package a.b.p;

import android.os.Build;
import android.view.View;

public class z0 {
    public static void a(View view, CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        } else {
            a1.f(view, tooltipText);
        }
    }
}
