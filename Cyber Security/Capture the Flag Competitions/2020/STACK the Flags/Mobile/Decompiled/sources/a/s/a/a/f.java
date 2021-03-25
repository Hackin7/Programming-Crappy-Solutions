package a.s.a.a;

import a.h.f.l.a;
import a.h.f.l.b;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class f extends Drawable implements b {

    /* renamed from: b  reason: collision with root package name */
    public Drawable f1437b;

    public void setColorFilter(int color, PorterDuff.Mode mode) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setColorFilter(color, mode);
        } else {
            super.setColorFilter(color, mode);
        }
    }

    public boolean onLevelChange(int level) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return super.onLevelChange(level);
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.k(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.l(drawable, left, top, right, bottom);
        }
    }

    public void setFilterBitmap(boolean filter) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setFilterBitmap(filter);
        }
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.i(drawable);
        }
    }

    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.a(drawable, t);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getPadding(padding);
        }
        return super.getPadding(padding);
    }

    public int[] getState() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int configs) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setChangingConfigurations(configs);
        } else {
            super.setChangingConfigurations(configs);
        }
    }

    public boolean setState(int[] stateSet) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        return super.setState(stateSet);
    }
}
