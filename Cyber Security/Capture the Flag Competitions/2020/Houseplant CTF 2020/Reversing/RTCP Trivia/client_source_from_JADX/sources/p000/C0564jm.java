package p000;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

/* renamed from: jm */
abstract class C0564jm extends Drawable implements C0346fo {

    /* renamed from: c */
    Drawable f2289c;

    C0564jm() {
    }

    public void applyTheme(Theme theme) {
        if (this.f2289c != null) {
            C0345fn.m1148a(this.f2289c, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f2289c != null) {
            this.f2289c.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f2289c != null) {
            Drawable drawable = this.f2289c;
            if (VERSION.SDK_INT >= 21) {
                return drawable.getColorFilter();
            }
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f2289c != null ? this.f2289c.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        return this.f2289c != null ? this.f2289c.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2289c != null ? this.f2289c.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f2289c != null ? this.f2289c.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f2289c != null ? this.f2289c.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f2289c != null ? this.f2289c.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f2289c != null) {
            this.f2289c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f2289c != null) {
            this.f2289c.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2289c != null ? this.f2289c.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f2289c != null) {
            this.f2289c.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f2289c != null) {
            this.f2289c.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f2289c != null) {
            this.f2289c.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f2289c != null) {
            C0345fn.m1144a(this.f2289c, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f2289c != null) {
            C0345fn.m1146a(this.f2289c, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f2289c != null ? this.f2289c.setState(iArr) : super.setState(iArr);
    }
}
