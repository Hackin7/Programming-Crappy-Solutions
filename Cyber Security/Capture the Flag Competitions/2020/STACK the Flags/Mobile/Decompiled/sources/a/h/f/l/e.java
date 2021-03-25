package a.h.f.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public class e extends d {
    public static Method i;

    public e(Drawable drawable) {
        super(drawable);
        g();
    }

    public e(f state, Resources resources) {
        super(state, resources);
        g();
    }

    public void setHotspot(float x, float y) {
        this.f842g.setHotspot(x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        this.f842g.setHotspotBounds(left, top, right, bottom);
    }

    public void getOutline(Outline outline) {
        this.f842g.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.f842g.getDirtyBounds();
    }

    @Override // a.h.f.l.d
    public void setTintList(ColorStateList tint) {
        if (c()) {
            super.setTintList(tint);
        } else {
            this.f842g.setTintList(tint);
        }
    }

    @Override // a.h.f.l.d
    public void setTint(int tintColor) {
        if (c()) {
            super.setTint(tintColor);
        } else {
            this.f842g.setTint(tintColor);
        }
    }

    @Override // a.h.f.l.d
    public void setTintMode(PorterDuff.Mode tintMode) {
        if (c()) {
            super.setTintMode(tintMode);
        } else {
            this.f842g.setTintMode(tintMode);
        }
    }

    @Override // a.h.f.l.d
    public boolean setState(int[] stateSet) {
        if (!super.setState(stateSet)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // a.h.f.l.d
    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f842g;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f842g;
        if (!(drawable == null || (method = i) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", ex);
            }
        }
        return false;
    }

    public final void g() {
        if (i == null) {
            try {
                i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ex);
            }
        }
    }
}
