package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: bw */
final class C0172bw {

    /* renamed from: a */
    final C0175by f896a;

    /* renamed from: b */
    int f897b = 0;

    /* renamed from: c */
    Typeface f898c;

    /* renamed from: d */
    boolean f899d;

    /* renamed from: e */
    private final TextView f900e;

    /* renamed from: f */
    private C0213cp f901f;

    /* renamed from: g */
    private C0213cp f902g;

    /* renamed from: h */
    private C0213cp f903h;

    /* renamed from: i */
    private C0213cp f904i;

    /* renamed from: j */
    private C0213cp f905j;

    /* renamed from: k */
    private C0213cp f906k;

    C0172bw(TextView textView) {
        this.f900e = textView;
        this.f896a = new C0175by(this.f900e);
    }

    /* renamed from: a */
    private static C0213cp m524a(Context context, C0147bi biVar, int i) {
        ColorStateList b = biVar.mo969b(context, i);
        if (b == null) {
            return null;
        }
        C0213cp cpVar = new C0213cp();
        cpVar.f1084d = true;
        cpVar.f1081a = b;
        return cpVar;
    }

    /* renamed from: a */
    private void m525a(Context context, C0215cr crVar) {
        Typeface typeface;
        this.f897b = crVar.mo1311a(C0126j.TextAppearance_android_textStyle, this.f897b);
        boolean z = true;
        if (crVar.mo1323f(C0126j.TextAppearance_android_fontFamily) || crVar.mo1323f(C0126j.TextAppearance_fontFamily)) {
            Typeface typeface2 = null;
            this.f898c = null;
            int i = crVar.mo1323f(C0126j.TextAppearance_fontFamily) ? C0126j.TextAppearance_fontFamily : C0126j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f900e);
                C01731 r10 = new C0327a() {
                    /* renamed from: a */
                    public final void mo1074a(Typeface typeface) {
                        C0172bw bwVar = C0172bw.this;
                        WeakReference weakReference = weakReference;
                        if (bwVar.f899d) {
                            bwVar.f898c = typeface;
                            TextView textView = (TextView) weakReference.get();
                            if (textView != null) {
                                textView.setTypeface(typeface, bwVar.f897b);
                            }
                        }
                    }
                };
                try {
                    int i2 = this.f897b;
                    int resourceId = crVar.f1087b.getResourceId(i, 0);
                    if (resourceId != 0) {
                        if (crVar.f1088c == null) {
                            crVar.f1088c = new TypedValue();
                        }
                        Context context2 = crVar.f1086a;
                        TypedValue typedValue = crVar.f1088c;
                        if (!context2.isRestricted()) {
                            Resources resources = context2.getResources();
                            resources.getValue(resourceId, typedValue, true);
                            typeface2 = C0326fc.m1071a(context2, resources, typedValue, resourceId, i2, r10);
                        }
                    }
                    this.f898c = typeface2;
                    if (this.f898c != null) {
                        z = false;
                    }
                    this.f899d = z;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f898c == null) {
                String d = crVar.mo1319d(i);
                if (d != null) {
                    this.f898c = Typeface.create(d, this.f897b);
                }
            }
        } else if (crVar.mo1323f(C0126j.TextAppearance_android_typeface)) {
            this.f899d = false;
            switch (crVar.mo1311a(C0126j.TextAppearance_android_typeface, 1)) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    this.f898c = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
            this.f898c = typeface;
        }
    }

    /* renamed from: a */
    private void m526a(Drawable drawable, C0213cp cpVar) {
        if (drawable != null && cpVar != null) {
            C0147bi.m487a(drawable, cpVar, this.f900e.getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1065a() {
        if (!(this.f901f == null && this.f902g == null && this.f903h == null && this.f904i == null)) {
            Drawable[] compoundDrawables = this.f900e.getCompoundDrawables();
            m526a(compoundDrawables[0], this.f901f);
            m526a(compoundDrawables[1], this.f902g);
            m526a(compoundDrawables[2], this.f903h);
            m526a(compoundDrawables[3], this.f904i);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f905j != null || this.f906k != null) {
            Drawable[] compoundDrawablesRelative = this.f900e.getCompoundDrawablesRelative();
            m526a(compoundDrawablesRelative[0], this.f905j);
            m526a(compoundDrawablesRelative[2], this.f906k);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1066a(int i) {
        C0175by byVar = this.f896a;
        if (byVar.mo1108e()) {
            switch (i) {
                case 0:
                    byVar.f914a = 0;
                    byVar.f917d = -1.0f;
                    byVar.f918e = -1.0f;
                    byVar.f916c = -1.0f;
                    byVar.f919f = new int[0];
                    byVar.f915b = false;
                    break;
                case 1:
                    DisplayMetrics displayMetrics = byVar.f921h.getResources().getDisplayMetrics();
                    byVar.mo1102a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (byVar.mo1105b()) {
                        byVar.mo1106c();
                        return;
                    }
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown auto-size text type: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1067a(int i, float f) {
        if (!C0435hb.f1879d && !this.f896a.mo1107d()) {
            this.f896a.mo1103a(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1068a(int i, int i2, int i3, int i4) {
        C0175by byVar = this.f896a;
        if (byVar.mo1108e()) {
            DisplayMetrics displayMetrics = byVar.f921h.getResources().getDisplayMetrics();
            byVar.mo1102a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (byVar.mo1105b()) {
                byVar.mo1106c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1069a(Context context, int i) {
        C0215cr a = C0215cr.m674a(context, i, C0126j.TextAppearance);
        if (a.mo1323f(C0126j.TextAppearance_textAllCaps)) {
            mo1071a(a.mo1313a(C0126j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo1323f(C0126j.TextAppearance_android_textColor)) {
            ColorStateList e = a.mo1321e(C0126j.TextAppearance_android_textColor);
            if (e != null) {
                this.f900e.setTextColor(e);
            }
        }
        m525a(context, a);
        a.f1087b.recycle();
        if (this.f898c != null) {
            this.f900e.setTypeface(this.f898c, this.f897b);
        }
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public final void mo1070a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.f900e.getContext();
        C0147bi a = C0147bi.m485a();
        C0215cr a2 = C0215cr.m676a(context, attributeSet2, C0126j.AppCompatTextHelper, i2, 0);
        int g = a2.mo1324g(C0126j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo1323f(C0126j.AppCompatTextHelper_android_drawableLeft)) {
            this.f901f = m524a(context, a, a2.mo1324g(C0126j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo1323f(C0126j.AppCompatTextHelper_android_drawableTop)) {
            this.f902g = m524a(context, a, a2.mo1324g(C0126j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo1323f(C0126j.AppCompatTextHelper_android_drawableRight)) {
            this.f903h = m524a(context, a, a2.mo1324g(C0126j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo1323f(C0126j.AppCompatTextHelper_android_drawableBottom)) {
            this.f904i = m524a(context, a, a2.mo1324g(C0126j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (VERSION.SDK_INT >= 17) {
            if (a2.mo1323f(C0126j.AppCompatTextHelper_android_drawableStart)) {
                this.f905j = m524a(context, a, a2.mo1324g(C0126j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.mo1323f(C0126j.AppCompatTextHelper_android_drawableEnd)) {
                this.f906k = m524a(context, a, a2.mo1324g(C0126j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.f1087b.recycle();
        boolean z3 = this.f900e.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            C0215cr a3 = C0215cr.m674a(context, g, C0126j.TextAppearance);
            if (z3 || !a3.mo1323f(C0126j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo1313a(C0126j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m525a(context, a3);
            if (VERSION.SDK_INT < 23) {
                ColorStateList e = a3.mo1323f(C0126j.TextAppearance_android_textColor) ? a3.mo1321e(C0126j.TextAppearance_android_textColor) : null;
                colorStateList = a3.mo1323f(C0126j.TextAppearance_android_textColorHint) ? a3.mo1321e(C0126j.TextAppearance_android_textColorHint) : null;
                if (a3.mo1323f(C0126j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = a3.mo1321e(C0126j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = e;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.f1087b.recycle();
        } else {
            z2 = false;
            z = false;
            colorStateList2 = null;
            colorStateList = null;
        }
        C0215cr a4 = C0215cr.m676a(context, attributeSet2, C0126j.TextAppearance, i2, 0);
        if (!z3 && a4.mo1323f(C0126j.TextAppearance_textAllCaps)) {
            z = a4.mo1313a(C0126j.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        if (VERSION.SDK_INT < 23) {
            if (a4.mo1323f(C0126j.TextAppearance_android_textColor)) {
                colorStateList3 = a4.mo1321e(C0126j.TextAppearance_android_textColor);
            }
            if (a4.mo1323f(C0126j.TextAppearance_android_textColorHint)) {
                colorStateList = a4.mo1321e(C0126j.TextAppearance_android_textColorHint);
            }
            if (a4.mo1323f(C0126j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a4.mo1321e(C0126j.TextAppearance_android_textColorLink);
            }
        }
        m525a(context, a4);
        a4.f1087b.recycle();
        if (colorStateList3 != null) {
            this.f900e.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f900e.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f900e.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z2) {
            mo1071a(z);
        }
        if (this.f898c != null) {
            this.f900e.setTypeface(this.f898c, this.f897b);
        }
        C0175by byVar = this.f896a;
        TypedArray obtainStyledAttributes = byVar.f921h.obtainStyledAttributes(attributeSet2, C0126j.AppCompatTextView, i2, 0);
        if (obtainStyledAttributes.hasValue(C0126j.AppCompatTextView_autoSizeTextType)) {
            byVar.f914a = obtainStyledAttributes.getInt(C0126j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0126j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0126j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0126j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0126j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0126j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0126j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0126j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0126j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                    }
                    byVar.f919f = C0175by.m540a(iArr);
                    byVar.mo1104a();
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!byVar.mo1108e()) {
            byVar.f914a = 0;
        } else if (byVar.f914a == 1) {
            if (!byVar.f920g) {
                DisplayMetrics displayMetrics = byVar.f921h.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                byVar.mo1102a(dimension2, dimension3, dimension);
            }
            byVar.mo1105b();
        }
        if (C0435hb.f1879d && this.f896a.f914a != 0) {
            int[] iArr2 = this.f896a.f919f;
            if (iArr2.length > 0) {
                if (((float) this.f900e.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f900e.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f896a.f917d), Math.round(this.f896a.f918e), Math.round(this.f896a.f916c), 0);
                } else {
                    this.f900e.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                }
            }
        }
        C0215cr a5 = C0215cr.m675a(context, attributeSet2, C0126j.AppCompatTextView);
        int e2 = a5.mo1320e(C0126j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int e3 = a5.mo1320e(C0126j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int e4 = a5.mo1320e(C0126j.AppCompatTextView_lineHeight, -1);
        a5.f1087b.recycle();
        if (e2 != -1) {
            C0440hg.m1392a(this.f900e, e2);
        }
        if (e3 != -1) {
            C0440hg.m1394b(this.f900e, e3);
        }
        if (e4 != -1) {
            C0440hg.m1395c(this.f900e, e4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1071a(boolean z) {
        this.f900e.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1072a(int[] iArr, int i) {
        C0175by byVar = this.f896a;
        if (byVar.mo1108e()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = byVar.f921h.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                byVar.f919f = C0175by.m540a(iArr2);
                if (!byVar.mo1104a()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                byVar.f920g = false;
            }
            if (byVar.mo1105b()) {
                byVar.mo1106c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1073b() {
        if (!C0435hb.f1879d) {
            this.f896a.mo1106c();
        }
    }
}
