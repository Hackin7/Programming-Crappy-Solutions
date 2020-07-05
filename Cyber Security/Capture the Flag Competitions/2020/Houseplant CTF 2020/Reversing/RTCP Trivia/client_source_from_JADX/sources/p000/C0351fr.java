package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: fr */
final class C0351fr extends C0348fq {

    /* renamed from: d */
    private static Method f1649d;

    /* renamed from: fr$a */
    static class C0352a extends C0349a {
        C0352a(C0349a aVar) {
            super(aVar);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0351fr(this, resources);
        }
    }

    C0351fr(Drawable drawable) {
        super(drawable);
        m1165d();
    }

    C0351fr(C0349a aVar, Resources resources) {
        super(aVar, resources);
        m1165d();
    }

    /* renamed from: d */
    private static void m1165d() {
        if (f1649d == null) {
            try {
                f1649d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0349a mo1714b() {
        return new C0352a(this.f1639b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo1715c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1640c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final Rect getDirtyBounds() {
        return this.f1640c.getDirtyBounds();
    }

    public final void getOutline(Outline outline) {
        this.f1640c.getOutline(outline);
    }

    public final boolean isProjected() {
        if (!(this.f1640c == null || f1649d == null)) {
            try {
                return ((Boolean) f1649d.invoke(this.f1640c, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public final void setHotspot(float f, float f2) {
        this.f1640c.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f1640c.setHotspotBounds(i, i2, i3, i4);
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        if (mo1715c()) {
            super.setTint(i);
        } else {
            this.f1640c.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (mo1715c()) {
            super.setTintList(colorStateList);
        } else {
            this.f1640c.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (mo1715c()) {
            super.setTintMode(mode);
        } else {
            this.f1640c.setTintMode(mode);
        }
    }
}
