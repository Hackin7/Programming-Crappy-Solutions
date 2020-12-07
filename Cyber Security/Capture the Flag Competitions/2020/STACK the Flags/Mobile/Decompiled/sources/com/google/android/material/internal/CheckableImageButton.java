package com.google.android.material.internal;

import a.b.p.m;
import a.h.m.c0.d;
import a.h.m.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;

public class CheckableImageButton extends m implements Checkable {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2751e = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f2752d;

    public CheckableImageButton(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        s.Z(this, new a());
    }

    public class a extends a.h.m.a {
        public a() {
        }

        @Override // a.h.m.a
        public void f(View host, AccessibilityEvent event) {
            super.f(host, event);
            event.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // a.h.m.a
        public void g(View host, d info) {
            super.g(host, info);
            info.I(true);
            info.J(CheckableImageButton.this.isChecked());
        }
    }

    public void setChecked(boolean checked) {
        if (this.f2752d != checked) {
            this.f2752d = checked;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.f2752d;
    }

    public void toggle() {
        setChecked(!this.f2752d);
    }

    public int[] onCreateDrawableState(int extraSpace) {
        if (this.f2752d) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(f2751e.length + extraSpace), f2751e);
        }
        return super.onCreateDrawableState(extraSpace);
    }
}
