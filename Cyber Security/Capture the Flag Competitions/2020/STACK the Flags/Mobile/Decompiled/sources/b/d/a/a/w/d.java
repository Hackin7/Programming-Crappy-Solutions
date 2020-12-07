package b.d.a.a.w;

import a.h.m.c0.c;
import a.h.m.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import b.d.a.a.j;

public class d extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public final AccessibilityManager f2655b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f2656c;

    /* renamed from: d  reason: collision with root package name */
    public c f2657d;

    /* renamed from: e  reason: collision with root package name */
    public b f2658e;

    public d(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.SnackbarLayout);
        if (a2.hasValue(j.SnackbarLayout_elevation)) {
            s.e0(this, (float) a2.getDimensionPixelSize(j.SnackbarLayout_elevation, 0));
        }
        a2.recycle();
        this.f2655b = (AccessibilityManager) context.getSystemService("accessibility");
        a aVar = new a();
        this.f2656c = aVar;
        c.a(this.f2655b, aVar);
        setClickableOrFocusableBasedOnAccessibility(this.f2655b.isTouchExplorationEnabled());
    }

    public class a implements c.a {
        public a() {
        }

        public void a(boolean enabled) {
            d.this.setClickableOrFocusableBasedOnAccessibility(enabled);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setClickableOrFocusableBasedOnAccessibility(boolean touchExplorationEnabled) {
        setClickable(!touchExplorationEnabled);
        setFocusable(touchExplorationEnabled);
    }

    public void onLayout(boolean changed, int l, int t, int r, int b2) {
        super.onLayout(changed, l, t, r, b2);
        c cVar = this.f2657d;
        if (cVar != null) {
            cVar.a(this, l, t, r, b2);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f2658e;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        s.W(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2658e;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        c.b(this.f2655b, this.f2656c);
    }

    public void setOnLayoutChangeListener(c onLayoutChangeListener) {
        this.f2657d = onLayoutChangeListener;
    }

    public void setOnAttachStateChangeListener(b listener) {
        this.f2658e = listener;
    }
}
