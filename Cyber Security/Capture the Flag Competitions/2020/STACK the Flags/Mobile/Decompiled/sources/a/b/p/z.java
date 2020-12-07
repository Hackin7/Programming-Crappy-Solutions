package a.b.p;

import a.h.f.d;
import a.h.k.a;
import a.h.n.b;
import a.h.n.i;
import a.h.n.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class z extends TextView implements j, b {

    /* renamed from: b  reason: collision with root package name */
    public final e f475b;

    /* renamed from: c  reason: collision with root package name */
    public final y f476c;

    /* renamed from: d  reason: collision with root package name */
    public final x f477d;

    /* renamed from: e  reason: collision with root package name */
    public Future<a> f478e;

    public z(Context context) {
        this(context, null);
    }

    public z(Context context, AttributeSet attrs) {
        this(context, attrs, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        t0.b(context);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f475b = eVar;
        eVar.e(attrs, defStyleAttr);
        y yVar = new y(this);
        this.f476c = yVar;
        yVar.m(attrs, defStyleAttr);
        this.f476c.b();
        this.f477d = new x(this);
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        e eVar = this.f475b;
        if (eVar != null) {
            eVar.g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        e eVar = this.f475b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        e eVar = this.f475b;
        if (eVar != null) {
            eVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f475b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        e eVar = this.f475b;
        if (eVar != null) {
            eVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f475b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.q(context, resId);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f475b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setTextSize(int unit, float size) {
        if (b.f997a) {
            super.setTextSize(unit, size);
            return;
        }
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.z(unit, size);
        }
    }

    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        y yVar = this.f476c;
        if (yVar != null && !b.f997a && yVar.l()) {
            this.f476c.c();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (b.f997a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.u(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (b.f997a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.s(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (b.f997a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.t(presetSizes, unit);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.f997a) {
            y yVar = this.f476c;
            if (yVar != null) {
                return yVar.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (b.f997a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f476c;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f997a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f476c;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f997a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f476c;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f997a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f476c;
        if (yVar != null) {
            return yVar.h();
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        l.a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setFirstBaselineToTopHeight(int firstBaselineToTopHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        } else {
            i.j(this, firstBaselineToTopHeight);
        }
    }

    public void setLastBaselineToBottomHeight(int lastBaselineToBottomHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
        } else {
            i.k(this, lastBaselineToBottomHeight);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return i.a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.b(this);
    }

    public void setLineHeight(int lineHeight) {
        i.l(this, lineHeight);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(i.p(this, actionModeCallback));
    }

    public a.C0021a getTextMetricsParamsCompat() {
        return i.f(this);
    }

    public void setTextMetricsParamsCompat(a.C0021a params) {
        i.o(this, params);
    }

    public void setPrecomputedText(a precomputed) {
        i.m(this, precomputed);
    }

    public final void c() {
        Future<PrecomputedTextCompat> future = this.f478e;
        if (future != null) {
            try {
                this.f478e = null;
                i.m(this, (a) future.get());
            } catch (InterruptedException | ExecutionException e2) {
            }
        }
    }

    public CharSequence getText() {
        c();
        return super.getText();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f477d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f477d) == null) {
            return super.getTextClassifier();
        }
        return xVar.a();
    }

    public void setTextFuture(Future<a> future) {
        this.f478e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        c();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawables(left, top, right, bottom);
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        super.setCompoundDrawablesRelative(start, top, end, bottom);
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = left != 0 ? a.b.l.a.a.d(context, left) : null;
        Drawable d3 = top != 0 ? a.b.l.a.a.d(context, top) : null;
        Drawable d4 = right != 0 ? a.b.l.a.a.d(context, right) : null;
        if (bottom != 0) {
            drawable = a.b.l.a.a.d(context, bottom);
        }
        setCompoundDrawablesWithIntrinsicBounds(d2, d3, d4, drawable);
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = start != 0 ? a.b.l.a.a.d(context, start) : null;
        Drawable d3 = top != 0 ? a.b.l.a.a.d(context, top) : null;
        Drawable d4 = end != 0 ? a.b.l.a.a.d(context, end) : null;
        if (bottom != 0) {
            drawable = a.b.l.a.a.d(context, bottom);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d2, d3, d4, drawable);
        y yVar = this.f476c;
        if (yVar != null) {
            yVar.p();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f476c.j();
    }

    @Override // a.h.n.j
    public void setSupportCompoundDrawablesTintList(ColorStateList tintList) {
        this.f476c.v(tintList);
        this.f476c.b();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f476c.k();
    }

    @Override // a.h.n.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode tintMode) {
        this.f476c.w(tintMode);
        this.f476c.b();
    }

    public void setTypeface(Typeface tf, int style) {
        Typeface finalTypeface = null;
        if (tf != null && style > 0) {
            finalTypeface = d.a(getContext(), tf, style);
        }
        super.setTypeface(finalTypeface != null ? finalTypeface : tf, style);
    }
}
