package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: fq */
class C0348fq extends Drawable implements Callback, C0346fo, C0347fp {

    /* renamed from: a */
    static final Mode f1638a = Mode.SRC_IN;

    /* renamed from: b */
    C0349a f1639b;

    /* renamed from: c */
    Drawable f1640c;

    /* renamed from: d */
    private int f1641d;

    /* renamed from: e */
    private Mode f1642e;

    /* renamed from: f */
    private boolean f1643f;

    /* renamed from: g */
    private boolean f1644g;

    /* renamed from: fq$a */
    public static abstract class C0349a extends ConstantState {

        /* renamed from: a */
        int f1645a;

        /* renamed from: b */
        ConstantState f1646b;

        /* renamed from: c */
        ColorStateList f1647c = null;

        /* renamed from: d */
        Mode f1648d = C0348fq.f1638a;

        C0349a(C0349a aVar) {
            if (aVar != null) {
                this.f1645a = aVar.f1645a;
                this.f1646b = aVar.f1646b;
                this.f1647c = aVar.f1647c;
                this.f1648d = aVar.f1648d;
            }
        }

        public int getChangingConfigurations() {
            return this.f1645a | (this.f1646b != null ? this.f1646b.getChangingConfigurations() : 0);
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: fq$b */
    static class C0350b extends C0349a {
        C0350b(C0349a aVar) {
            super(aVar);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0348fq(this, resources);
        }
    }

    C0348fq(Drawable drawable) {
        this.f1639b = mo1714b();
        mo1713a(drawable);
    }

    C0348fq(C0349a aVar, Resources resources) {
        this.f1639b = aVar;
        if (this.f1639b != null && this.f1639b.f1646b != null) {
            mo1713a(this.f1639b.f1646b.newDrawable(resources));
        }
    }

    /* renamed from: a */
    private boolean m1160a(int[] iArr) {
        if (!mo1715c()) {
            return false;
        }
        ColorStateList colorStateList = this.f1639b.f1647c;
        Mode mode = this.f1639b.f1648d;
        if (colorStateList == null || mode == null) {
            this.f1643f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1643f && colorForState == this.f1641d && mode == this.f1642e)) {
                setColorFilter(colorForState, mode);
                this.f1641d = colorForState;
                this.f1642e = mode;
                this.f1643f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo1712a() {
        return this.f1640c;
    }

    /* renamed from: a */
    public final void mo1713a(Drawable drawable) {
        if (this.f1640c != null) {
            this.f1640c.setCallback(null);
        }
        this.f1640c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f1639b != null) {
                this.f1639b.f1646b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0349a mo1714b() {
        return new C0350b(this.f1639b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1715c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f1640c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | (this.f1639b != null ? this.f1639b.getChangingConfigurations() : 0) | this.f1640c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        if (this.f1639b != null) {
            if (this.f1639b.f1646b != null) {
                this.f1639b.f1645a = getChangingConfigurations();
                return this.f1639b;
            }
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f1640c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1640c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1640c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1640c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1640c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1640c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1640c.getPadding(rect);
    }

    public int[] getState() {
        return this.f1640c.getState();
    }

    public Region getTransparentRegion() {
        return this.f1640c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f1640c.isAutoMirrored();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo1715c() || this.f1639b == null) ? null : this.f1639b.f1647c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1640c.isStateful();
    }

    public void jumpToCurrentState() {
        this.f1640c.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1644g && super.mutate() == this) {
            this.f1639b = mo1714b();
            if (this.f1640c != null) {
                this.f1640c.mutate();
            }
            if (this.f1639b != null) {
                this.f1639b.f1646b = this.f1640c != null ? this.f1640c.getConstantState() : null;
            }
            this.f1644g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f1640c != null) {
            this.f1640c.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1640c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1640c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f1640c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f1640c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1640c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1640c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1640c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1160a(iArr) || this.f1640c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1639b.f1647c = colorStateList;
        m1160a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f1639b.f1648d = mode;
        m1160a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1640c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
