package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: r */
public class C0798r extends Drawable implements Callback {

    /* renamed from: a */
    public Drawable f3386a;

    public C0798r(Drawable drawable) {
        if (this.f3386a != null) {
            this.f3386a.setCallback(null);
        }
        this.f3386a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f3386a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f3386a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f3386a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3386a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3386a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3386a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3386a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3386a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f3386a.getPadding(rect);
    }

    public int[] getState() {
        return this.f3386a.getState();
    }

    public Region getTransparentRegion() {
        return this.f3386a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0345fn.m1152a(this.f3386a);
    }

    public boolean isStateful() {
        return this.f3386a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f3386a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f3386a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f3386a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f3386a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0345fn.m1151a(this.f3386a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f3386a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3386a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3386a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3386a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0345fn.m1144a(this.f3386a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0345fn.m1146a(this.f3386a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f3386a.setState(iArr);
    }

    public void setTint(int i) {
        C0345fn.m1145a(this.f3386a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0345fn.m1147a(this.f3386a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0345fn.m1150a(this.f3386a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3386a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
