package a.b.m.a;

import a.h.f.l.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    public Drawable f118b;

    public c(Drawable drawable) {
        b(drawable);
    }

    public void draw(Canvas canvas) {
        this.f118b.draw(canvas);
    }

    public void onBoundsChange(Rect bounds) {
        this.f118b.setBounds(bounds);
    }

    public void setChangingConfigurations(int configs) {
        this.f118b.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        return this.f118b.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f118b.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f118b.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f118b.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f118b.setColorFilter(cf);
    }

    public boolean isStateful() {
        return this.f118b.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return this.f118b.setState(stateSet);
    }

    public int[] getState() {
        return this.f118b.getState();
    }

    public void jumpToCurrentState() {
        this.f118b.jumpToCurrentState();
    }

    public Drawable getCurrent() {
        return this.f118b.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f118b.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f118b.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f118b.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f118b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f118b.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f118b.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f118b.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f118b.getPadding(padding);
    }

    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }

    public boolean onLevelChange(int level) {
        return this.f118b.setLevel(level);
    }

    public void setAutoMirrored(boolean mirrored) {
        a.j(this.f118b, mirrored);
    }

    public boolean isAutoMirrored() {
        return a.h(this.f118b);
    }

    public void setTint(int tint) {
        a.n(this.f118b, tint);
    }

    public void setTintList(ColorStateList tint) {
        a.o(this.f118b, tint);
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        a.p(this.f118b, tintMode);
    }

    public void setHotspot(float x, float y) {
        a.k(this.f118b, x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        a.l(this.f118b, left, top, right, bottom);
    }

    public Drawable a() {
        return this.f118b;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f118b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f118b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
