package a.h.f.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class d extends Drawable implements Drawable.Callback, c, b {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public int f837b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f838c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f839d;

    /* renamed from: e  reason: collision with root package name */
    public f f840e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f841f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f842g;

    public abstract boolean c();

    public d(f state, Resources res) {
        this.f840e = state;
        e(res);
    }

    public d(Drawable dr) {
        this.f840e = d();
        b(dr);
    }

    public final void e(Resources res) {
        Drawable.ConstantState constantState;
        f fVar = this.f840e;
        if (fVar != null && (constantState = fVar.f844b) != null) {
            b(constantState.newDrawable(res));
        }
    }

    public void jumpToCurrentState() {
        this.f842g.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f842g.draw(canvas);
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f842g;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public void setChangingConfigurations(int configs) {
        this.f842g.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f840e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f842g.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f842g.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f842g.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f842g.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f842g.setColorFilter(cf);
    }

    public boolean isStateful() {
        ColorStateList tintList;
        f fVar;
        if (!c() || (fVar = this.f840e) == null) {
            tintList = null;
        } else {
            tintList = fVar.f845c;
        }
        return (tintList != null && tintList.isStateful()) || this.f842g.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return f(stateSet) || this.f842g.setState(stateSet);
    }

    public int[] getState() {
        return this.f842g.getState();
    }

    public Drawable getCurrent() {
        return this.f842g.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f842g.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f842g.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f842g.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f842g.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f842g.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f842g.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f842g.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f842g.getPadding(padding);
    }

    public void setAutoMirrored(boolean mirrored) {
        this.f842g.setAutoMirrored(mirrored);
    }

    public boolean isAutoMirrored() {
        return this.f842g.isAutoMirrored();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f840e;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f840e.f843a = getChangingConfigurations();
        return this.f840e;
    }

    public Drawable mutate() {
        if (!this.f841f && super.mutate() == this) {
            this.f840e = d();
            Drawable drawable = this.f842g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f840e;
            if (fVar != null) {
                Drawable drawable2 = this.f842g;
                fVar.f844b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f841f = true;
        }
        return this;
    }

    public final f d() {
        return new f(this.f840e);
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
        return this.f842g.setLevel(level);
    }

    public void setTint(int tint) {
        setTintList(ColorStateList.valueOf(tint));
    }

    public void setTintList(ColorStateList tint) {
        this.f840e.f845c = tint;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f840e.f846d = tintMode;
        f(getState());
    }

    public final boolean f(int[] state) {
        if (!c()) {
            return false;
        }
        f fVar = this.f840e;
        ColorStateList tintList = fVar.f845c;
        PorterDuff.Mode tintMode = fVar.f846d;
        if (tintList == null || tintMode == null) {
            this.f839d = false;
            clearColorFilter();
        } else {
            int color = tintList.getColorForState(state, tintList.getDefaultColor());
            if (!(this.f839d && color == this.f837b && tintMode == this.f838c)) {
                setColorFilter(color, tintMode);
                this.f837b = color;
                this.f838c = tintMode;
                this.f839d = true;
                return true;
            }
        }
        return false;
    }

    @Override // a.h.f.l.c
    public final Drawable a() {
        return this.f842g;
    }

    @Override // a.h.f.l.c
    public final void b(Drawable dr) {
        Drawable drawable = this.f842g;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f842g = dr;
        if (dr != null) {
            dr.setCallback(this);
            setVisible(dr.isVisible(), true);
            setState(dr.getState());
            setLevel(dr.getLevel());
            setBounds(dr.getBounds());
            f fVar = this.f840e;
            if (fVar != null) {
                fVar.f844b = dr.getConstantState();
            }
        }
        invalidateSelf();
    }
}
