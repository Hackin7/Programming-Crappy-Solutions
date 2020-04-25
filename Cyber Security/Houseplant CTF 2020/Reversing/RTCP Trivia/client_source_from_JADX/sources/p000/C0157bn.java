package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: bn */
public class C0157bn extends ImageView implements C0395gp, C0443hi {

    /* renamed from: a */
    private final C0142bd f854a;

    /* renamed from: b */
    private final C0156bm f855b;

    public C0157bn(Context context) {
        this(context, null);
    }

    public C0157bn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0157bn(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        this.f854a = new C0142bd(this);
        this.f854a.mo925a(attributeSet, i);
        this.f855b = new C0156bm(this);
        this.f855b.mo993a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f854a != null) {
            this.f854a.mo928d();
        }
        if (this.f855b != null) {
            this.f855b.mo997d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f854a != null) {
            return this.f854a.mo926b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f854a != null) {
            return this.f854a.mo927c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        if (this.f855b != null) {
            return this.f855b.mo995b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        if (this.f855b != null) {
            return this.f855b.mo996c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f855b.mo994a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f854a != null) {
            this.f854a.mo921a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f854a != null) {
            this.f854a.mo922a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f855b != null) {
            this.f855b.mo997d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f855b != null) {
            this.f855b.mo997d();
        }
    }

    public void setImageResource(int i) {
        if (this.f855b != null) {
            this.f855b.mo990a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f855b != null) {
            this.f855b.mo997d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f854a != null) {
            this.f854a.mo923a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f854a != null) {
            this.f854a.mo924a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f855b != null) {
            this.f855b.mo991a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f855b != null) {
            this.f855b.mo992a(mode);
        }
    }
}
