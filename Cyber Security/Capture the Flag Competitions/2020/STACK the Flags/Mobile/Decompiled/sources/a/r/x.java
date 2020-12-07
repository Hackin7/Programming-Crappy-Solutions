package a.r;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

public class x implements y {

    /* renamed from: a  reason: collision with root package name */
    public final ViewOverlay f1412a;

    public x(View view) {
        this.f1412a = view.getOverlay();
    }

    public void b(Drawable drawable) {
        this.f1412a.add(drawable);
    }

    public void c(Drawable drawable) {
        this.f1412a.remove(drawable);
    }
}
