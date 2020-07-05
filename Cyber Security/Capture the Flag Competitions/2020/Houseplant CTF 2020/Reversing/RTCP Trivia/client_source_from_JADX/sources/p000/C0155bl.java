package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: bl */
public final class C0155bl extends ImageButton implements C0395gp, C0443hi {

    /* renamed from: a */
    private final C0142bd f848a;

    /* renamed from: b */
    private final C0156bm f849b;

    public C0155bl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.imageButtonStyle);
    }

    public C0155bl(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        this.f848a = new C0142bd(this);
        this.f848a.mo925a(attributeSet, i);
        this.f849b = new C0156bm(this);
        this.f849b.mo993a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f848a != null) {
            this.f848a.mo928d();
        }
        if (this.f849b != null) {
            this.f849b.mo997d();
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        if (this.f848a != null) {
            return this.f848a.mo926b();
        }
        return null;
    }

    public final Mode getSupportBackgroundTintMode() {
        if (this.f848a != null) {
            return this.f848a.mo927c();
        }
        return null;
    }

    public final ColorStateList getSupportImageTintList() {
        if (this.f849b != null) {
            return this.f849b.mo995b();
        }
        return null;
    }

    public final Mode getSupportImageTintMode() {
        if (this.f849b != null) {
            return this.f849b.mo996c();
        }
        return null;
    }

    public final boolean hasOverlappingRendering() {
        return this.f849b.mo994a() && super.hasOverlappingRendering();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f848a != null) {
            this.f848a.mo921a();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f848a != null) {
            this.f848a.mo922a(i);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f849b != null) {
            this.f849b.mo997d();
        }
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f849b != null) {
            this.f849b.mo997d();
        }
    }

    public final void setImageResource(int i) {
        this.f849b.mo990a(i);
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f849b != null) {
            this.f849b.mo997d();
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f848a != null) {
            this.f848a.mo923a(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        if (this.f848a != null) {
            this.f848a.mo924a(mode);
        }
    }

    public final void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f849b != null) {
            this.f849b.mo991a(colorStateList);
        }
    }

    public final void setSupportImageTintMode(Mode mode) {
        if (this.f849b != null) {
            this.f849b.mo992a(mode);
        }
    }
}
