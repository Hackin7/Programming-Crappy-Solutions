package a.b.p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f278a;

    public b(ActionBarContainer container) {
        this.f278a = container;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f278a;
        if (actionBarContainer.i) {
            Drawable drawable = actionBarContainer.h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1541f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f278a;
        Drawable drawable3 = actionBarContainer2.f1542g;
        if (drawable3 != null && actionBarContainer2.j) {
            drawable3.draw(canvas);
        }
    }

    public void setAlpha(int alpha) {
    }

    public void setColorFilter(ColorFilter cf) {
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f278a;
        if (actionBarContainer.i) {
            Drawable drawable = actionBarContainer.h;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1541f;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }
}
