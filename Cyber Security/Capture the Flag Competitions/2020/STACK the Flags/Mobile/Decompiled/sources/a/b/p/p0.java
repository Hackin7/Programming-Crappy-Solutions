package a.b.p;

import a.b.k.a;
import android.content.res.Configuration;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    public Runnable f391b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f392c;

    /* renamed from: d  reason: collision with root package name */
    public int f393d;

    /* renamed from: e  reason: collision with root package name */
    public int f394e;

    /* renamed from: f  reason: collision with root package name */
    public int f395f;

    /* renamed from: g  reason: collision with root package name */
    public int f396g;

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: Multiple debug info for r1v1 int: [D('widthMode' int), D('widthMeasureSpec' int)] */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setFillViewport(View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824);
        throw null;
    }

    public void setAllowCollapse(boolean allowCollapse) {
        this.f392c = allowCollapse;
    }

    public void setTabSelected(int position) {
        this.f396g = position;
        throw null;
    }

    public void setContentHeight(int contentHeight) {
        this.f395f = contentHeight;
        requestLayout();
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        a.b.o.a abp = a.b.o.a.b(getContext());
        setContentHeight(abp.f());
        this.f394e = abp.e();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f391b;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f391b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        ((a) view).a().a();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public class a extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        public a.c f397b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p0 f398c;

        public void setSelected(boolean selected) {
            boolean changed = isSelected() != selected;
            super.setSelected(selected);
            if (changed && selected) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(event);
            event.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            super.onInitializeAccessibilityNodeInfo(info);
            info.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int i;
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (this.f398c.f393d > 0 && getMeasuredWidth() > (i = this.f398c.f393d)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), heightMeasureSpec);
            }
        }

        public a.c a() {
            return this.f397b;
        }
    }
}
