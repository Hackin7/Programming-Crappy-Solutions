package a.b.p;

import a.b.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class m extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public final e f367b;

    /* renamed from: c  reason: collision with root package name */
    public final n f368c;

    public m(Context context, AttributeSet attrs) {
        this(context, attrs, a.imageButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        t0.b(context);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f367b = eVar;
        eVar.e(attrs, defStyleAttr);
        n nVar = new n(this);
        this.f368c = nVar;
        nVar.f(attrs, defStyleAttr);
    }

    public void setImageResource(int resId) {
        this.f368c.g(resId);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f368c;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        n nVar = this.f368c;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f368c;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        e eVar = this.f367b;
        if (eVar != null) {
            eVar.g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        e eVar = this.f367b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        e eVar = this.f367b;
        if (eVar != null) {
            eVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f367b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        e eVar = this.f367b;
        if (eVar != null) {
            eVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f367b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList tint) {
        n nVar = this.f368c;
        if (nVar != null) {
            nVar.h(tint);
        }
    }

    public ColorStateList getSupportImageTintList() {
        n nVar = this.f368c;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        n nVar = this.f368c;
        if (nVar != null) {
            nVar.i(tintMode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f368c;
        if (nVar != null) {
            return nVar.d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f367b;
        if (eVar != null) {
            eVar.b();
        }
        n nVar = this.f368c;
        if (nVar != null) {
            nVar.b();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f368c.e() && super.hasOverlappingRendering();
    }
}
