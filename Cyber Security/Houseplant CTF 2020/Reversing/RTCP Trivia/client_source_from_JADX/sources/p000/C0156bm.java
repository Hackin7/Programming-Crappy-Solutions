package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: bm */
public final class C0156bm {

    /* renamed from: a */
    private final ImageView f850a;

    /* renamed from: b */
    private C0213cp f851b;

    /* renamed from: c */
    private C0213cp f852c;

    /* renamed from: d */
    private C0213cp f853d;

    public C0156bm(ImageView imageView) {
        this.f850a = imageView;
    }

    /* renamed from: a */
    public final void mo990a(int i) {
        if (i != 0) {
            Drawable b = C0785o.m2608b(this.f850a.getContext(), i);
            if (b != null) {
                C0181cb.m606a(b);
            }
            this.f850a.setImageDrawable(b);
        } else {
            this.f850a.setImageDrawable(null);
        }
        mo997d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo991a(ColorStateList colorStateList) {
        if (this.f852c == null) {
            this.f852c = new C0213cp();
        }
        this.f852c.f1081a = colorStateList;
        this.f852c.f1084d = true;
        mo997d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo992a(Mode mode) {
        if (this.f852c == null) {
            this.f852c = new C0213cp();
        }
        this.f852c.f1082b = mode;
        this.f852c.f1083c = true;
        mo997d();
    }

    /* renamed from: a */
    public final void mo993a(AttributeSet attributeSet, int i) {
        C0215cr a = C0215cr.m676a(this.f850a.getContext(), attributeSet, C0126j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f850a.getDrawable();
            if (drawable == null) {
                int g = a.mo1324g(C0126j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C0785o.m2608b(this.f850a.getContext(), g);
                    if (drawable != null) {
                        this.f850a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C0181cb.m606a(drawable);
            }
            boolean z = true;
            if (a.mo1323f(C0126j.AppCompatImageView_tint)) {
                ImageView imageView = this.f850a;
                ColorStateList e = a.mo1321e(C0126j.AppCompatImageView_tint);
                if (VERSION.SDK_INT >= 21) {
                    imageView.setImageTintList(e);
                    if (VERSION.SDK_INT == 21) {
                        Drawable drawable2 = imageView.getDrawable();
                        boolean z2 = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                        if (drawable2 != null && z2) {
                            if (drawable2.isStateful()) {
                                drawable2.setState(imageView.getDrawableState());
                            }
                            imageView.setImageDrawable(drawable2);
                        }
                    }
                } else if (imageView instanceof C0443hi) {
                    ((C0443hi) imageView).setSupportImageTintList(e);
                }
            }
            if (a.mo1323f(C0126j.AppCompatImageView_tintMode)) {
                ImageView imageView2 = this.f850a;
                Mode a2 = C0181cb.m605a(a.mo1311a(C0126j.AppCompatImageView_tintMode, -1), null);
                if (VERSION.SDK_INT >= 21) {
                    imageView2.setImageTintMode(a2);
                    if (VERSION.SDK_INT == 21) {
                        Drawable drawable3 = imageView2.getDrawable();
                        if (imageView2.getImageTintList() == null || imageView2.getImageTintMode() == null) {
                            z = false;
                        }
                        if (drawable3 != null && z) {
                            if (drawable3.isStateful()) {
                                drawable3.setState(imageView2.getDrawableState());
                            }
                            imageView2.setImageDrawable(drawable3);
                        }
                    }
                } else if (imageView2 instanceof C0443hi) {
                    ((C0443hi) imageView2).setSupportImageTintMode(a2);
                }
            }
        } finally {
            a.f1087b.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo994a() {
        return VERSION.SDK_INT < 21 || !(this.f850a.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ColorStateList mo995b() {
        if (this.f852c != null) {
            return this.f852c.f1081a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Mode mo996c() {
        if (this.f852c != null) {
            return this.f852c.f1082b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo997d() {
        Drawable drawable = this.f850a.getDrawable();
        if (drawable != null) {
            C0181cb.m606a(drawable);
        }
        if (drawable != null) {
            int i = VERSION.SDK_INT;
            boolean z = false;
            if (i <= 21 ? i == 21 : this.f851b != null) {
                if (this.f853d == null) {
                    this.f853d = new C0213cp();
                }
                C0213cp cpVar = this.f853d;
                cpVar.mo1310a();
                ImageView imageView = this.f850a;
                Mode mode = null;
                ColorStateList colorStateList = VERSION.SDK_INT >= 21 ? imageView.getImageTintList() : imageView instanceof C0443hi ? ((C0443hi) imageView).getSupportImageTintList() : null;
                if (colorStateList != null) {
                    cpVar.f1084d = true;
                    cpVar.f1081a = colorStateList;
                }
                ImageView imageView2 = this.f850a;
                if (VERSION.SDK_INT >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof C0443hi) {
                    mode = ((C0443hi) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    cpVar.f1083c = true;
                    cpVar.f1082b = mode;
                }
                if (cpVar.f1084d || cpVar.f1083c) {
                    C0147bi.m487a(drawable, cpVar, this.f850a.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            if (this.f852c != null) {
                C0147bi.m487a(drawable, this.f852c, this.f850a.getDrawableState());
            } else if (this.f851b != null) {
                C0147bi.m487a(drawable, this.f851b, this.f850a.getDrawableState());
            }
        }
    }
}
