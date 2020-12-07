package androidx.appcompat.widget;

import a.b.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: b  reason: collision with root package name */
    public int f1610b;

    /* renamed from: c  reason: collision with root package name */
    public int f1611c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<View> f1612d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f1613e;

    /* renamed from: f  reason: collision with root package name */
    public a f1614f;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f1610b = 0;
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.ViewStubCompat, defStyle, 0);
        this.f1611c = a2.getResourceId(j.ViewStubCompat_android_inflatedId, -1);
        this.f1610b = a2.getResourceId(j.ViewStubCompat_android_layout, 0);
        setId(a2.getResourceId(j.ViewStubCompat_android_id, -1));
        a2.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f1611c;
    }

    public void setInflatedId(int inflatedId) {
        this.f1611c = inflatedId;
    }

    public int getLayoutResource() {
        return this.f1610b;
    }

    public void setLayoutResource(int layoutResource) {
        this.f1610b = layoutResource;
    }

    public void setLayoutInflater(LayoutInflater inflater) {
        this.f1613e = inflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1613e;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public void setVisibility(int visibility) {
        WeakReference<View> weakReference = this.f1612d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(visibility);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(visibility);
        if (visibility == 0 || visibility == 4) {
            a();
        }
    }

    public View a() {
        LayoutInflater factory;
        ViewParent viewParent = getParent();
        if (!(viewParent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1610b != 0) {
            ViewGroup parent = (ViewGroup) viewParent;
            if (this.f1613e != null) {
                factory = this.f1613e;
            } else {
                factory = LayoutInflater.from(getContext());
            }
            View view = factory.inflate(this.f1610b, parent, false);
            int i = this.f1611c;
            if (i != -1) {
                view.setId(i);
            }
            int index = parent.indexOfChild(this);
            parent.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                parent.addView(view, index, layoutParams);
            } else {
                parent.addView(view, index);
            }
            this.f1612d = new WeakReference<>(view);
            a aVar = this.f1614f;
            if (aVar != null) {
                aVar.a(this, view);
            }
            return view;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(a inflateListener) {
        this.f1614f = inflateListener;
    }
}
