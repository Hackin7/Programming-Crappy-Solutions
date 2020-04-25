package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bx */
public class C0174bx extends TextView implements C0395gp, C0435hb {

    /* renamed from: a */
    private final C0142bd f909a;

    /* renamed from: b */
    private final C0172bw f910b;

    /* renamed from: c */
    private Future<C0371fy> f911c;

    public C0174bx(Context context) {
        this(context, null);
    }

    public C0174bx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0174bx(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        this.f909a = new C0142bd(this);
        this.f909a.mo925a(attributeSet, i);
        this.f910b = new C0172bw(this);
        this.f910b.mo1070a(attributeSet, i);
        this.f910b.mo1065a();
    }

    /* renamed from: a */
    private void mo341a() {
        if (this.f911c != null) {
            try {
                Future<C0371fy> future = this.f911c;
                this.f911c = null;
                C0440hg.m1393a((TextView) this, (C0371fy) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f909a != null) {
            this.f909a.mo928d();
        }
        if (this.f910b != null) {
            this.f910b.mo1065a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (f1879d) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f910b != null) {
            return Math.round(this.f910b.f896a.f918e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f1879d) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f910b != null) {
            return Math.round(this.f910b.f896a.f917d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f1879d) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f910b != null) {
            return Math.round(this.f910b.f896a.f916c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return f1879d ? super.getAutoSizeTextAvailableSizes() : this.f910b != null ? this.f910b.f896a.f919f : new int[0];
    }

    public int getAutoSizeTextType() {
        if (f1879d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f910b != null) {
            return this.f910b.f896a.f914a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f909a != null) {
            return this.f909a.mo926b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f909a != null) {
            return this.f909a.mo927c();
        }
        return null;
    }

    public CharSequence getText() {
        mo341a();
        return super.getText();
    }

    public C0372a getTextMetricsParamsCompat() {
        return C0440hg.m1391a(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0154bk.m504a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f910b != null) {
            this.f910b.mo1073b();
        }
    }

    public void onMeasure(int i, int i2) {
        mo341a();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f910b != null && !f1879d && this.f910b.f896a.mo1107d()) {
            this.f910b.f896a.mo1106c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f1879d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        if (this.f910b != null) {
            this.f910b.mo1068a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1879d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        if (this.f910b != null) {
            this.f910b.mo1072a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1879d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        if (this.f910b != null) {
            this.f910b.mo1066a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f909a != null) {
            this.f909a.mo921a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f909a != null) {
            this.f909a.mo922a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0440hg.m1390a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0440hg.m1392a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0440hg.m1394b(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0440hg.m1395c(this, i);
    }

    public void setPrecomputedText(C0371fy fyVar) {
        C0440hg.m1393a((TextView) this, fyVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f909a != null) {
            this.f909a.mo923a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f909a != null) {
            this.f909a.mo924a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f910b != null) {
            this.f910b.mo1069a(context, i);
        }
    }

    public void setTextFuture(Future<C0371fy> future) {
        this.f911c = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(C0372a aVar) {
        int i;
        if (VERSION.SDK_INT >= 18) {
            TextDirectionHeuristic textDirectionHeuristic = aVar.f1704b;
            if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
                if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                    i = 2;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                    i = 3;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                    i = 4;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                    i = 5;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i = 6;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i = 7;
                }
                setTextDirection(i);
            }
            i = 1;
            setTextDirection(i);
        }
        if (VERSION.SDK_INT < 23) {
            float textScaleX = aVar.f1703a.getTextScaleX();
            getPaint().set(aVar.f1703a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.f1703a);
        setBreakStrategy(aVar.f1705c);
        setHyphenationFrequency(aVar.f1706d);
    }

    public void setTextSize(int i, float f) {
        if (f1879d) {
            super.setTextSize(i, f);
            return;
        }
        if (this.f910b != null) {
            this.f910b.mo1067a(i, f);
        }
    }
}
