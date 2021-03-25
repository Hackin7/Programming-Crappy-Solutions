package androidx.appcompat.widget;

import a.b.k.g;
import a.h.m.s;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f1563b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1564c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f1565d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1566e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f1567f;

    /* renamed from: g  reason: collision with root package name */
    public TypedValue f1568g;
    public final Rect h;
    public a i;

    public interface a {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.h = new Rect();
    }

    public void setAttachListener(a attachListener) {
        this.i = attachListener;
    }

    public void a(int left, int top, int right, int bottom) {
        this.h.set(left, top, right, bottom);
        if (s.K(this)) {
            requestLayout();
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i2;
        int i3;
        int i4;
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        boolean isPortrait = metrics.widthPixels < metrics.heightPixels;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean fixedWidth = false;
        if (widthMode == Integer.MIN_VALUE) {
            TypedValue tvw = isPortrait ? this.f1566e : this.f1565d;
            if (!(tvw == null || (i4 = tvw.type) == 0)) {
                int w = 0;
                if (i4 == 5) {
                    w = (int) tvw.getDimension(metrics);
                } else if (i4 == 6) {
                    int i5 = metrics.widthPixels;
                    w = (int) tvw.getFraction((float) i5, (float) i5);
                }
                if (w > 0) {
                    Rect rect = this.h;
                    widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(w - (rect.left + rect.right), View.MeasureSpec.getSize(widthMeasureSpec)), 1073741824);
                    fixedWidth = true;
                }
            }
        }
        if (heightMode == Integer.MIN_VALUE) {
            TypedValue tvh = isPortrait ? this.f1567f : this.f1568g;
            if (!(tvh == null || (i3 = tvh.type) == 0)) {
                int h2 = 0;
                if (i3 == 5) {
                    h2 = (int) tvh.getDimension(metrics);
                } else if (i3 == 6) {
                    int i6 = metrics.heightPixels;
                    h2 = (int) tvh.getFraction((float) i6, (float) i6);
                }
                if (h2 > 0) {
                    Rect rect2 = this.h;
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(h2 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(heightMeasureSpec)), 1073741824);
                }
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        boolean measure = false;
        int widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        if (!fixedWidth && widthMode == Integer.MIN_VALUE) {
            TypedValue tv = isPortrait ? this.f1564c : this.f1563b;
            if (!(tv == null || (i2 = tv.type) == 0)) {
                int min = 0;
                if (i2 == 5) {
                    min = (int) tv.getDimension(metrics);
                } else if (i2 == 6) {
                    int i7 = metrics.widthPixels;
                    min = (int) tv.getFraction((float) i7, (float) i7);
                }
                if (min > 0) {
                    Rect rect3 = this.h;
                    min -= rect3.left + rect3.right;
                }
                if (width < min) {
                    widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
                    measure = true;
                }
            }
        }
        if (measure) {
            super.onMeasure(widthMeasureSpec2, heightMeasureSpec);
        }
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1563b == null) {
            this.f1563b = new TypedValue();
        }
        return this.f1563b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1564c == null) {
            this.f1564c = new TypedValue();
        }
        return this.f1564c;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1565d == null) {
            this.f1565d = new TypedValue();
        }
        return this.f1565d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1566e == null) {
            this.f1566e = new TypedValue();
        }
        return this.f1566e;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1567f == null) {
            this.f1567f = new TypedValue();
        }
        return this.f1567f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1568g == null) {
            this.f1568g = new TypedValue();
        }
        return this.f1568g;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.i;
        if (aVar != null) {
            ((g.e) aVar).a();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.i;
        if (aVar != null) {
            ((g.e) aVar).b();
        }
    }
}
