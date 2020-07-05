package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: bd */
final class C0142bd {

    /* renamed from: a */
    private final View f814a;

    /* renamed from: b */
    private final C0147bi f815b;

    /* renamed from: c */
    private int f816c = -1;

    /* renamed from: d */
    private C0213cp f817d;

    /* renamed from: e */
    private C0213cp f818e;

    /* renamed from: f */
    private C0213cp f819f;

    C0142bd(View view) {
        this.f814a = view;
        this.f815b = C0147bi.m485a();
    }

    /* renamed from: b */
    private void m466b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f817d == null) {
                this.f817d = new C0213cp();
            }
            this.f817d.f1081a = colorStateList;
            this.f817d.f1084d = true;
        } else {
            this.f817d = null;
        }
        mo928d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo921a() {
        this.f816c = -1;
        m466b(null);
        mo928d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo922a(int i) {
        this.f816c = i;
        m466b(this.f815b != null ? this.f815b.mo969b(this.f814a.getContext(), i) : null);
        mo928d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo923a(ColorStateList colorStateList) {
        if (this.f818e == null) {
            this.f818e = new C0213cp();
        }
        this.f818e.f1081a = colorStateList;
        this.f818e.f1084d = true;
        mo928d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo924a(Mode mode) {
        if (this.f818e == null) {
            this.f818e = new C0213cp();
        }
        this.f818e.f1082b = mode;
        this.f818e.f1083c = true;
        mo928d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo925a(AttributeSet attributeSet, int i) {
        C0215cr a = C0215cr.m676a(this.f814a.getContext(), attributeSet, C0126j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo1323f(C0126j.ViewBackgroundHelper_android_background)) {
                this.f816c = a.mo1324g(C0126j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f815b.mo969b(this.f814a.getContext(), this.f816c);
                if (b != null) {
                    m466b(b);
                }
            }
            if (a.mo1323f(C0126j.ViewBackgroundHelper_backgroundTint)) {
                C0396gq.m1255a(this.f814a, a.mo1321e(C0126j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo1323f(C0126j.ViewBackgroundHelper_backgroundTintMode)) {
                C0396gq.m1256a(this.f814a, C0181cb.m605a(a.mo1311a(C0126j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.f1087b.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ColorStateList mo926b() {
        if (this.f818e != null) {
            return this.f818e.f1081a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Mode mo927c() {
        if (this.f818e != null) {
            return this.f818e.f1082b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo928d() {
        Drawable background = this.f814a.getBackground();
        if (background != null) {
            int i = VERSION.SDK_INT;
            boolean z = false;
            if (i <= 21 ? i == 21 : this.f817d != null) {
                if (this.f819f == null) {
                    this.f819f = new C0213cp();
                }
                C0213cp cpVar = this.f819f;
                cpVar.mo1310a();
                ColorStateList i2 = C0396gq.m1272i(this.f814a);
                if (i2 != null) {
                    cpVar.f1084d = true;
                    cpVar.f1081a = i2;
                }
                Mode j = C0396gq.m1273j(this.f814a);
                if (j != null) {
                    cpVar.f1083c = true;
                    cpVar.f1082b = j;
                }
                if (cpVar.f1084d || cpVar.f1083c) {
                    C0147bi.m487a(background, cpVar, this.f814a.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            if (this.f818e != null) {
                C0147bi.m487a(background, this.f818e, this.f814a.getDrawableState());
            } else if (this.f817d != null) {
                C0147bi.m487a(background, this.f817d, this.f814a.getDrawableState());
            }
        }
    }
}
