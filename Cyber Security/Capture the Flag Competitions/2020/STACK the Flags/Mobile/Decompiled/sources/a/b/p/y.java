package a.b.p;

import a.b.j;
import a.h.e.c.f;
import a.h.m.s;
import a.h.n.b;
import a.h.n.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f454a;

    /* renamed from: b  reason: collision with root package name */
    public u0 f455b;

    /* renamed from: c  reason: collision with root package name */
    public u0 f456c;

    /* renamed from: d  reason: collision with root package name */
    public u0 f457d;

    /* renamed from: e  reason: collision with root package name */
    public u0 f458e;

    /* renamed from: f  reason: collision with root package name */
    public u0 f459f;

    /* renamed from: g  reason: collision with root package name */
    public u0 f460g;
    public u0 h;
    public final a0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public y(TextView view) {
        this.f454a = view;
        this.i = new a0(this.f454a);
    }

    @SuppressLint({"NewApi"})
    public void m(AttributeSet attrs, int defStyleAttr) {
        boolean allCapsSet;
        boolean allCaps;
        ColorStateList textColorLink;
        ColorStateList textColor;
        String localeListString;
        String fontVariation;
        j drawableManager;
        String localeListString2;
        j drawableManager2;
        Drawable drawableBottom;
        Context context = this.f454a.getContext();
        j drawableManager3 = j.b();
        w0 a2 = w0.u(context, attrs, j.AppCompatTextHelper, defStyleAttr, 0);
        TextView textView = this.f454a;
        s.X(textView, textView.getContext(), j.AppCompatTextHelper, attrs, a2.q(), defStyleAttr, 0);
        int ap = a2.m(j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.r(j.AppCompatTextHelper_android_drawableLeft)) {
            this.f455b = d(context, drawableManager3, a2.m(j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.r(j.AppCompatTextHelper_android_drawableTop)) {
            this.f456c = d(context, drawableManager3, a2.m(j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.r(j.AppCompatTextHelper_android_drawableRight)) {
            this.f457d = d(context, drawableManager3, a2.m(j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.r(j.AppCompatTextHelper_android_drawableBottom)) {
            this.f458e = d(context, drawableManager3, a2.m(j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (a2.r(j.AppCompatTextHelper_android_drawableStart)) {
            this.f459f = d(context, drawableManager3, a2.m(j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (a2.r(j.AppCompatTextHelper_android_drawableEnd)) {
            this.f460g = d(context, drawableManager3, a2.m(j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        a2.v();
        boolean hasPwdTm = this.f454a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean allCaps2 = false;
        boolean allCapsSet2 = false;
        ColorStateList textColor2 = null;
        ColorStateList textColorHint = null;
        ColorStateList textColorLink2 = null;
        String fontVariation2 = null;
        String localeListString3 = null;
        if (ap != -1) {
            w0 a3 = w0.s(context, ap, j.TextAppearance);
            if (!hasPwdTm && a3.r(j.TextAppearance_textAllCaps)) {
                allCapsSet2 = true;
                allCaps2 = a3.a(j.TextAppearance_textAllCaps, false);
            }
            B(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                if (a3.r(j.TextAppearance_android_textColor)) {
                    textColor2 = a3.c(j.TextAppearance_android_textColor);
                }
                if (a3.r(j.TextAppearance_android_textColorHint)) {
                    textColorHint = a3.c(j.TextAppearance_android_textColorHint);
                }
                if (a3.r(j.TextAppearance_android_textColorLink)) {
                    textColorLink2 = a3.c(j.TextAppearance_android_textColorLink);
                }
            }
            if (a3.r(j.TextAppearance_textLocale)) {
                localeListString3 = a3.n(j.TextAppearance_textLocale);
            }
            if (Build.VERSION.SDK_INT >= 26 && a3.r(j.TextAppearance_fontVariationSettings)) {
                fontVariation2 = a3.n(j.TextAppearance_fontVariationSettings);
            }
            a3.v();
        }
        w0 a4 = w0.u(context, attrs, j.TextAppearance, defStyleAttr, 0);
        if (hasPwdTm || !a4.r(j.TextAppearance_textAllCaps)) {
            allCaps = allCaps2;
            allCapsSet = allCapsSet2;
        } else {
            allCaps = a4.a(j.TextAppearance_textAllCaps, false);
            allCapsSet = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.r(j.TextAppearance_android_textColor)) {
                textColor2 = a4.c(j.TextAppearance_android_textColor);
            }
            if (a4.r(j.TextAppearance_android_textColorHint)) {
                textColorHint = a4.c(j.TextAppearance_android_textColorHint);
            }
            if (a4.r(j.TextAppearance_android_textColorLink)) {
                textColorLink = textColor2;
                textColor = a4.c(j.TextAppearance_android_textColorLink);
            } else {
                textColorLink = textColor2;
                textColor = textColorLink2;
            }
        } else {
            textColorLink = textColor2;
            textColor = textColorLink2;
        }
        if (a4.r(j.TextAppearance_textLocale)) {
            localeListString = a4.n(j.TextAppearance_textLocale);
        } else {
            localeListString = localeListString3;
        }
        if (Build.VERSION.SDK_INT < 26 || !a4.r(j.TextAppearance_fontVariationSettings)) {
            fontVariation = fontVariation2;
        } else {
            fontVariation = a4.n(j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT < 28) {
            drawableManager = drawableManager3;
        } else if (!a4.r(j.TextAppearance_android_textSize)) {
            drawableManager = drawableManager3;
        } else if (a4.e(j.TextAppearance_android_textSize, -1) == 0) {
            drawableManager = drawableManager3;
            this.f454a.setTextSize(0, 0.0f);
        } else {
            drawableManager = drawableManager3;
        }
        B(context, a4);
        a4.v();
        if (textColorLink != null) {
            this.f454a.setTextColor(textColorLink);
        }
        if (textColorHint != null) {
            this.f454a.setHintTextColor(textColorHint);
        }
        if (textColor != null) {
            this.f454a.setLinkTextColor(textColor);
        }
        if (!hasPwdTm && allCapsSet) {
            r(allCaps);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f454a.setTypeface(typeface, this.j);
            } else {
                this.f454a.setTypeface(typeface);
            }
        }
        if (fontVariation != null) {
            this.f454a.setFontVariationSettings(fontVariation);
        }
        if (localeListString != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f454a.setTextLocales(LocaleList.forLanguageTags(localeListString));
            } else {
                this.f454a.setTextLocale(Locale.forLanguageTag(localeListString.substring(0, localeListString.indexOf(44))));
            }
        }
        this.i.q(attrs, defStyleAttr);
        if (!b.f997a) {
            localeListString2 = localeListString;
        } else if (this.i.l() != 0) {
            int[] autoSizeTextSizesInPx = this.i.k();
            if (autoSizeTextSizesInPx.length <= 0) {
                localeListString2 = localeListString;
            } else if (((float) this.f454a.getAutoSizeStepGranularity()) != -1.0f) {
                localeListString2 = localeListString;
                this.f454a.setAutoSizeTextTypeUniformWithConfiguration(this.i.i(), this.i.h(), this.i.j(), 0);
            } else {
                localeListString2 = localeListString;
                this.f454a.setAutoSizeTextTypeUniformWithPresetSizes(autoSizeTextSizesInPx, 0);
            }
        } else {
            localeListString2 = localeListString;
        }
        w0 a5 = w0.t(context, attrs, j.AppCompatTextView);
        Drawable drawableStart = null;
        Drawable drawableEnd = null;
        Drawable drawableLeft = null;
        Drawable drawableTop = null;
        int drawableLeftId = a5.m(j.AppCompatTextView_drawableLeftCompat, -1);
        if (drawableLeftId != -1) {
            drawableManager2 = drawableManager;
            drawableLeft = drawableManager2.c(context, drawableLeftId);
        } else {
            drawableManager2 = drawableManager;
        }
        Drawable drawableRight = null;
        int drawableTopId = a5.m(j.AppCompatTextView_drawableTopCompat, -1);
        if (drawableTopId != -1) {
            drawableTop = drawableManager2.c(context, drawableTopId);
        }
        int drawableRightId = a5.m(j.AppCompatTextView_drawableRightCompat, -1);
        if (drawableRightId != -1) {
            drawableRight = drawableManager2.c(context, drawableRightId);
        }
        int drawableBottomId = a5.m(j.AppCompatTextView_drawableBottomCompat, -1);
        if (drawableBottomId != -1) {
            drawableBottom = drawableManager2.c(context, drawableBottomId);
        } else {
            drawableBottom = null;
        }
        int drawableStartId = a5.m(j.AppCompatTextView_drawableStartCompat, -1);
        if (drawableStartId != -1) {
            drawableStart = drawableManager2.c(context, drawableStartId);
        }
        int drawableEndId = a5.m(j.AppCompatTextView_drawableEndCompat, -1);
        if (drawableEndId != -1) {
            drawableEnd = drawableManager2.c(context, drawableEndId);
        }
        x(drawableLeft, drawableTop, drawableRight, drawableBottom, drawableStart, drawableEnd);
        if (a5.r(j.AppCompatTextView_drawableTint)) {
            i.g(this.f454a, a5.c(j.AppCompatTextView_drawableTint));
        }
        if (a5.r(j.AppCompatTextView_drawableTintMode)) {
            i.h(this.f454a, e0.d(a5.j(j.AppCompatTextView_drawableTintMode, -1), null));
        }
        int firstBaselineToTopHeight = a5.e(j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int lastBaselineToBottomHeight = a5.e(j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int lineHeight = a5.e(j.AppCompatTextView_lineHeight, -1);
        a5.v();
        if (firstBaselineToTopHeight != -1) {
            i.j(this.f454a, firstBaselineToTopHeight);
        }
        if (lastBaselineToBottomHeight != -1) {
            i.k(this.f454a, lastBaselineToBottomHeight);
        }
        if (lineHeight != -1) {
            i.l(this.f454a, lineHeight);
        }
    }

    public final void B(Context context, w0 a2) {
        int fontFamilyId;
        String fontFamilyName;
        this.j = a2.j(j.TextAppearance_android_textStyle, this.j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int j2 = a2.j(j.TextAppearance_android_textFontWeight, -1);
            this.k = j2;
            if (j2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (a2.r(j.TextAppearance_android_fontFamily) || a2.r(j.TextAppearance_fontFamily)) {
            this.l = null;
            if (a2.r(j.TextAppearance_fontFamily)) {
                fontFamilyId = j.TextAppearance_fontFamily;
            } else {
                fontFamilyId = j.TextAppearance_android_fontFamily;
            }
            int fontWeight = this.k;
            int style = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface typeface = a2.i(fontFamilyId, this.j, new a(fontWeight, style, new WeakReference<>(this.f454a)));
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                            this.l = typeface;
                        } else {
                            this.l = Typeface.create(Typeface.create(typeface, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException e2) {
                }
            }
            if (this.l == null && (fontFamilyName = a2.n(fontFamilyId)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(fontFamilyName, this.j);
                    return;
                }
                Typeface create = Typeface.create(fontFamilyName, 0);
                int i2 = this.k;
                if ((2 & this.j) != 0) {
                    z = true;
                }
                this.l = Typeface.create(create, i2, z);
            }
        } else if (a2.r(j.TextAppearance_android_typeface)) {
            this.m = false;
            int typefaceIndex = a2.j(j.TextAppearance_android_typeface, 1);
            if (typefaceIndex == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (typefaceIndex == 2) {
                this.l = Typeface.SERIF;
            } else if (typefaceIndex == 3) {
                this.l = Typeface.MONOSPACE;
            }
        }
    }

    public class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f461a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f462b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f463c;

        public a(int i, int i2, WeakReference weakReference) {
            this.f461a = i;
            this.f462b = i2;
            this.f463c = weakReference;
        }

        @Override // a.h.e.c.f.a
        public void d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f461a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f462b & 2) != 0);
            }
            y.this.n(this.f463c, typeface);
        }

        @Override // a.h.e.c.f.a
        public void c(int reason) {
        }
    }

    public void n(WeakReference<TextView> textViewWeak, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = textViewWeak.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.j);
            }
        }
    }

    public void q(Context context, int resId) {
        String fontVariation;
        ColorStateList textColor;
        w0 a2 = w0.s(context, resId, j.TextAppearance);
        if (a2.r(j.TextAppearance_textAllCaps)) {
            r(a2.a(j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.r(j.TextAppearance_android_textColor) && (textColor = a2.c(j.TextAppearance_android_textColor)) != null) {
            this.f454a.setTextColor(textColor);
        }
        if (a2.r(j.TextAppearance_android_textSize) && a2.e(j.TextAppearance_android_textSize, -1) == 0) {
            this.f454a.setTextSize(0, 0.0f);
        }
        B(context, a2);
        if (Build.VERSION.SDK_INT >= 26 && a2.r(j.TextAppearance_fontVariationSettings) && (fontVariation = a2.n(j.TextAppearance_fontVariationSettings)) != null) {
            this.f454a.setFontVariationSettings(fontVariation);
        }
        a2.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f454a.setTypeface(typeface, this.j);
        }
    }

    public void r(boolean allCaps) {
        this.f454a.setAllCaps(allCaps);
    }

    public void p() {
        b();
    }

    public void b() {
        if (!(this.f455b == null && this.f456c == null && this.f457d == null && this.f458e == null)) {
            Drawable[] compoundDrawables = this.f454a.getCompoundDrawables();
            a(compoundDrawables[0], this.f455b);
            a(compoundDrawables[1], this.f456c);
            a(compoundDrawables[2], this.f457d);
            a(compoundDrawables[3], this.f458e);
        }
        if (this.f459f != null || this.f460g != null) {
            Drawable[] compoundDrawables2 = this.f454a.getCompoundDrawablesRelative();
            a(compoundDrawables2[0], this.f459f);
            a(compoundDrawables2[2], this.f460g);
        }
    }

    public final void a(Drawable drawable, u0 info) {
        if (drawable != null && info != null) {
            j.i(drawable, info, this.f454a.getDrawableState());
        }
    }

    public static u0 d(Context context, j drawableManager, int drawableId) {
        ColorStateList tintList = drawableManager.f(context, drawableId);
        if (tintList == null) {
            return null;
        }
        u0 tintInfo = new u0();
        tintInfo.f424d = true;
        tintInfo.f421a = tintList;
        return tintInfo;
    }

    public void o() {
        if (!b.f997a) {
            c();
        }
    }

    public void z(int unit, float size) {
        if (!b.f997a && !l()) {
            A(unit, size);
        }
    }

    public void c() {
        this.i.a();
    }

    public boolean l() {
        return this.i.p();
    }

    public final void A(int unit, float size) {
        this.i.v(unit, size);
    }

    public void u(int autoSizeTextType) {
        this.i.t(autoSizeTextType);
    }

    public void s(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        this.i.r(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
    }

    public void t(int[] presetSizes, int unit) {
        this.i.s(presetSizes, unit);
    }

    public int i() {
        return this.i.l();
    }

    public int g() {
        return this.i.j();
    }

    public int f() {
        return this.i.i();
    }

    public int e() {
        return this.i.h();
    }

    public int[] h() {
        return this.i.k();
    }

    public ColorStateList j() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f421a;
        }
        return null;
    }

    public void v(ColorStateList tintList) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f421a = tintList;
        u0Var.f424d = tintList != null;
        y();
    }

    public PorterDuff.Mode k() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f422b;
        }
        return null;
    }

    public void w(PorterDuff.Mode tintMode) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f422b = tintMode;
        u0Var.f423c = tintMode != null;
        y();
    }

    public final void y() {
        u0 u0Var = this.h;
        this.f455b = u0Var;
        this.f456c = u0Var;
        this.f457d = u0Var;
        this.f458e = u0Var;
        this.f459f = u0Var;
        this.f460g = u0Var;
    }

    public final void x(Drawable drawableLeft, Drawable drawableTop, Drawable drawableRight, Drawable drawableBottom, Drawable drawableStart, Drawable drawableEnd) {
        if (drawableStart != null || drawableEnd != null) {
            Drawable[] existingRel = this.f454a.getCompoundDrawablesRelative();
            this.f454a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableStart != null ? drawableStart : existingRel[0], drawableTop != null ? drawableTop : existingRel[1], drawableEnd != null ? drawableEnd : existingRel[2], drawableBottom != null ? drawableBottom : existingRel[3]);
        } else if (drawableLeft != null || drawableTop != null || drawableRight != null || drawableBottom != null) {
            Drawable[] existingRel2 = this.f454a.getCompoundDrawablesRelative();
            if (existingRel2[0] == null && existingRel2[2] == null) {
                Drawable[] existingAbs = this.f454a.getCompoundDrawables();
                this.f454a.setCompoundDrawablesWithIntrinsicBounds(drawableLeft != null ? drawableLeft : existingAbs[0], drawableTop != null ? drawableTop : existingAbs[1], drawableRight != null ? drawableRight : existingAbs[2], drawableBottom != null ? drawableBottom : existingAbs[3]);
                return;
            }
            this.f454a.setCompoundDrawablesRelativeWithIntrinsicBounds(existingRel2[0], drawableTop != null ? drawableTop : existingRel2[1], existingRel2[2], drawableBottom != null ? drawableBottom : existingRel2[3]);
        }
    }
}
