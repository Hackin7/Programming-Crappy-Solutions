package a.h.f.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f843a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f844b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f845c = null;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f846d = d.h;

    public f(f orig) {
        if (orig != null) {
            this.f843a = orig.f843a;
            this.f844b = orig.f844b;
            this.f845c = orig.f845c;
            this.f846d = orig.f846d;
        }
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources res) {
        return new e(this, res);
    }

    public int getChangingConfigurations() {
        int i = this.f843a;
        Drawable.ConstantState constantState = this.f844b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public boolean a() {
        return this.f844b != null;
    }
}
