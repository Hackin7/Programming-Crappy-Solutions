package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f563a;

    /* renamed from: b */
    private int f564b;

    /* renamed from: c */
    private WeakReference<View> f565c;

    /* renamed from: d */
    private LayoutInflater f566d;

    /* renamed from: e */
    private C0087a f567e;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0087a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f563a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126j.ViewStubCompat, i, 0);
        this.f564b = obtainStyledAttributes.getResourceId(C0126j.ViewStubCompat_android_inflatedId, -1);
        this.f563a = obtainStyledAttributes.getResourceId(C0126j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0126j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public final View mo697a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f563a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = (this.f566d != null ? this.f566d : LayoutInflater.from(getContext())).inflate(this.f563a, viewGroup, false);
            if (this.f564b != -1) {
                inflate.setId(this.f564b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f565c = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public final int getInflatedId() {
        return this.f564b;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.f566d;
    }

    public final int getLayoutResource() {
        return this.f563a;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setInflatedId(int i) {
        this.f564b = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f566d = layoutInflater;
    }

    public final void setLayoutResource(int i) {
        this.f563a = i;
    }

    public final void setOnInflateListener(C0087a aVar) {
        this.f567e = aVar;
    }

    public final void setVisibility(int i) {
        if (this.f565c != null) {
            View view = (View) this.f565c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo697a();
        }
    }
}
