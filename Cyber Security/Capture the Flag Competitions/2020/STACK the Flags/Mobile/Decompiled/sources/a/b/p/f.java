package a.b.p;

import a.b.a;
import a.h.n.b;
import a.h.n.i;
import a.h.n.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class f extends Button implements b, j {

    /* renamed from: b  reason: collision with root package name */
    public final e f305b;

    /* renamed from: c  reason: collision with root package name */
    public final y f306c;

    public f(Context context, AttributeSet attrs) {
        this(context, attrs, a.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        t0.b(context);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f305b = eVar;
        eVar.e(attrs, defStyleAttr);
        y yVar = new y(this);
        this.f306c = yVar;
        yVar.m(attrs, defStyleAttr);
        this.f306c.b();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        e eVar = this.f305b;
        if (eVar != null) {
            eVar.g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        e eVar = this.f305b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        e eVar = this.f305b;
        if (eVar != null) {
            eVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f305b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        e eVar = this.f305b;
        if (eVar != null) {
            eVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f305b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f305b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f306c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        y yVar = this.f306c;
        if (yVar != null) {
            yVar.q(context, resId);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(Button.class.getName());
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        y yVar = this.f306c;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setTextSize(int unit, float size) {
        if (b.f997a) {
            super.setTextSize(unit, size);
            return;
        }
        y yVar = this.f306c;
        if (yVar != null) {
            yVar.z(unit, size);
        }
    }

    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        y yVar = this.f306c;
        if (yVar != null && !b.f997a && yVar.l()) {
            this.f306c.c();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (b.f997a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        y yVar = this.f306c;
        if (yVar != null) {
            yVar.u(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (b.f997a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        y yVar = this.f306c;
        if (yVar != null) {
            yVar.s(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (b.f997a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        y yVar = this.f306c;
        if (yVar != null) {
            yVar.t(presetSizes, unit);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.f997a) {
            y yVar = this.f306c;
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
        y yVar = this.f306c;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f997a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f306c;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f997a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f306c;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f997a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f306c;
        if (yVar != null) {
            return yVar.h();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean allCaps) {
        y yVar = this.f306c;
        if (yVar != null) {
            yVar.r(allCaps);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(i.p(this, actionModeCallback));
    }

    @Override // a.h.n.j
    public void setSupportCompoundDrawablesTintList(ColorStateList tint) {
        this.f306c.v(tint);
        this.f306c.b();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f306c.j();
    }

    @Override // a.h.n.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode tintMode) {
        this.f306c.w(tintMode);
        this.f306c.b();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f306c.k();
    }
}
