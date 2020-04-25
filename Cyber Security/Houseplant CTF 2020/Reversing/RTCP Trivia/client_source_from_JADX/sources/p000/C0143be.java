package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: be */
public final class C0143be extends Button implements C0395gp, C0435hb {

    /* renamed from: a */
    private final C0142bd f820a;

    /* renamed from: b */
    private final C0172bw f821b;

    public C0143be(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.buttonStyle);
    }

    private C0143be(Context context, AttributeSet attributeSet, int i) {
        super(C0212co.m672a(context), attributeSet, i);
        this.f820a = new C0142bd(this);
        this.f820a.mo925a(attributeSet, i);
        this.f821b = new C0172bw(this);
        this.f821b.mo1070a(attributeSet, i);
        this.f821b.mo1065a();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f820a != null) {
            this.f820a.mo928d();
        }
        if (this.f821b != null) {
            this.f821b.mo1065a();
        }
    }

    public final int getAutoSizeMaxTextSize() {
        if (f1879d) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f821b != null) {
            return Math.round(this.f821b.f896a.f918e);
        }
        return -1;
    }

    public final int getAutoSizeMinTextSize() {
        if (f1879d) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f821b != null) {
            return Math.round(this.f821b.f896a.f917d);
        }
        return -1;
    }

    public final int getAutoSizeStepGranularity() {
        if (f1879d) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f821b != null) {
            return Math.round(this.f821b.f896a.f916c);
        }
        return -1;
    }

    public final int[] getAutoSizeTextAvailableSizes() {
        return f1879d ? super.getAutoSizeTextAvailableSizes() : this.f821b != null ? this.f821b.f896a.f919f : new int[0];
    }

    public final int getAutoSizeTextType() {
        if (f1879d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f821b != null) {
            return this.f821b.f896a.f914a;
        }
        return 0;
    }

    public final ColorStateList getSupportBackgroundTintList() {
        if (this.f820a != null) {
            return this.f820a.mo926b();
        }
        return null;
    }

    public final Mode getSupportBackgroundTintMode() {
        if (this.f820a != null) {
            return this.f820a.mo927c();
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f821b != null) {
            this.f821b.mo1073b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f821b != null && !f1879d && this.f821b.f896a.mo1107d()) {
            this.f821b.f896a.mo1106c();
        }
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f1879d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        if (this.f821b != null) {
            this.f821b.mo1068a(i, i2, i3, i4);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1879d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        if (this.f821b != null) {
            this.f821b.mo1072a(iArr, i);
        }
    }

    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1879d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        if (this.f821b != null) {
            this.f821b.mo1066a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f820a != null) {
            this.f820a.mo921a();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f820a != null) {
            this.f820a.mo922a(i);
        }
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0440hg.m1390a((TextView) this, callback));
    }

    public final void setSupportAllCaps(boolean z) {
        if (this.f821b != null) {
            this.f821b.mo1071a(z);
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f820a != null) {
            this.f820a.mo923a(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        if (this.f820a != null) {
            this.f820a.mo924a(mode);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f821b != null) {
            this.f821b.mo1069a(context, i);
        }
    }

    public final void setTextSize(int i, float f) {
        if (f1879d) {
            super.setTextSize(i, f);
            return;
        }
        if (this.f821b != null) {
            this.f821b.mo1067a(i, f);
        }
    }
}
