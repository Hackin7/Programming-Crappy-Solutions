package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: az */
public final class C0115az extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f756a;

    public C0115az(ActionBarContainer actionBarContainer) {
        this.f756a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.f756a.f330d) {
            if (this.f756a.f327a != null) {
                this.f756a.f327a.draw(canvas);
            }
            if (this.f756a.f328b != null && this.f756a.f331e) {
                this.f756a.f328b.draw(canvas);
            }
        } else if (this.f756a.f329c != null) {
            this.f756a.f329c.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        if (this.f756a.f330d) {
            if (this.f756a.f329c != null) {
                this.f756a.f329c.getOutline(outline);
            }
        } else if (this.f756a.f327a != null) {
            this.f756a.f327a.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
