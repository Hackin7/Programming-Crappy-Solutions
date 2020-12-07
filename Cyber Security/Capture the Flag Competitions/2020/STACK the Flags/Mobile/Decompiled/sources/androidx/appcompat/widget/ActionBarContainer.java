package androidx.appcompat.widget;

import a.b.f;
import a.b.j;
import a.b.p.b;
import a.b.p.p0;
import a.h.m.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f1537b;

    /* renamed from: c  reason: collision with root package name */
    public View f1538c;

    /* renamed from: d  reason: collision with root package name */
    public View f1539d;

    /* renamed from: e  reason: collision with root package name */
    public View f1540e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1541f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1542g;
    public Drawable h;
    public boolean i;
    public boolean j;
    public int k;

    public ActionBarContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        s.a0(this, new b(this));
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.ActionBar);
        this.f1541f = a2.getDrawable(j.ActionBar_background);
        this.f1542g = a2.getDrawable(j.ActionBar_backgroundStacked);
        this.k = a2.getDimensionPixelSize(j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == f.split_action_bar) {
            this.i = true;
            this.h = a2.getDrawable(j.ActionBar_backgroundSplit);
        }
        a2.recycle();
        if (this.i) {
            if (this.h != null) {
                z = false;
            }
        } else if (!(this.f1541f == null && this.f1542g == null)) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1539d = findViewById(f.action_bar);
        this.f1540e = findViewById(f.action_context_bar);
    }

    public void setPrimaryBackground(Drawable bg) {
        Drawable drawable = this.f1541f;
        if (drawable != null) {
            drawable.setCallback(null);
            unscheduleDrawable(this.f1541f);
        }
        this.f1541f = bg;
        if (bg != null) {
            bg.setCallback(this);
            View view = this.f1539d;
            if (view != null) {
                this.f1541f.setBounds(view.getLeft(), this.f1539d.getTop(), this.f1539d.getRight(), this.f1539d.getBottom());
            }
        }
        boolean z = true;
        if (this.i) {
            if (this.h != null) {
                z = false;
            }
        } else if (!(this.f1541f == null && this.f1542g == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f1542g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1542g);
        }
        this.f1542g = bg;
        if (bg != null) {
            bg.setCallback(this);
            if (this.j && (drawable = this.f1542g) != null) {
                drawable.setBounds(this.f1538c.getLeft(), this.f1538c.getTop(), this.f1538c.getRight(), this.f1538c.getBottom());
            }
        }
        boolean z = true;
        if (this.i) {
            if (this.h != null) {
                z = false;
            }
        } else if (!(this.f1541f == null && this.f1542g == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.h);
        }
        this.h = bg;
        boolean z = false;
        if (bg != null) {
            bg.setCallback(this);
            if (this.i && (drawable = this.h) != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.i) {
            if (this.h == null) {
                z = true;
            }
        } else if (this.f1541f == null && this.f1542g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean isVisible = visibility == 0;
        Drawable drawable = this.f1541f;
        if (drawable != null) {
            drawable.setVisible(isVisible, false);
        }
        Drawable drawable2 = this.f1542g;
        if (drawable2 != null) {
            drawable2.setVisible(isVisible, false);
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.setVisible(isVisible, false);
        }
    }

    public boolean verifyDrawable(Drawable who) {
        return (who == this.f1541f && !this.i) || (who == this.f1542g && this.j) || ((who == this.h && this.i) || super.verifyDrawable(who));
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1541f;
        if (drawable != null && drawable.isStateful()) {
            this.f1541f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1542g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1542g.setState(getDrawableState());
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.h.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1541f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1542g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean isTransitioning) {
        int i2;
        this.f1537b = isTransitioning;
        if (isTransitioning) {
            i2 = 393216;
        } else {
            i2 = 262144;
        }
        setDescendantFocusability(i2);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.f1537b || super.onInterceptTouchEvent(ev);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        super.onHoverEvent(ev);
        return true;
    }

    public void setTabContainer(p0 tabView) {
        View view = this.f1538c;
        if (view != null) {
            removeView(view);
        }
        this.f1538c = tabView;
        if (tabView != null) {
            addView(tabView);
            ViewGroup.LayoutParams lp = tabView.getLayoutParams();
            lp.width = -1;
            lp.height = -2;
            tabView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f1538c;
    }

    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback, int type) {
        if (type != 0) {
            return super.startActionModeForChild(child, callback, type);
        }
        return null;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public final int a(View view) {
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int topMarginForTabs;
        int i2;
        if (this.f1539d == null && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && (i2 = this.k) >= 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i2, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f1539d != null) {
            int mode = View.MeasureSpec.getMode(heightMeasureSpec);
            View view = this.f1538c;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f1539d)) {
                    topMarginForTabs = a(this.f1539d);
                } else if (!b(this.f1540e)) {
                    topMarginForTabs = a(this.f1540e);
                } else {
                    topMarginForTabs = 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f1538c) + topMarginForTabs, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(heightMeasureSpec) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b2) {
        Drawable drawable;
        super.onLayout(changed, l, t, r, b2);
        View tabContainer = this.f1538c;
        boolean hasTabs = (tabContainer == null || tabContainer.getVisibility() == 8) ? false : true;
        if (!(tabContainer == null || tabContainer.getVisibility() == 8)) {
            int containerHeight = getMeasuredHeight();
            int i2 = ((FrameLayout.LayoutParams) tabContainer.getLayoutParams()).bottomMargin;
            tabContainer.layout(l, (containerHeight - tabContainer.getMeasuredHeight()) - i2, r, containerHeight - i2);
        }
        boolean needsInvalidate = false;
        if (this.i) {
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                needsInvalidate = true;
            }
        } else {
            if (this.f1541f != null) {
                if (this.f1539d.getVisibility() == 0) {
                    this.f1541f.setBounds(this.f1539d.getLeft(), this.f1539d.getTop(), this.f1539d.getRight(), this.f1539d.getBottom());
                } else {
                    View view = this.f1540e;
                    if (view == null || view.getVisibility() != 0) {
                        this.f1541f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1541f.setBounds(this.f1540e.getLeft(), this.f1540e.getTop(), this.f1540e.getRight(), this.f1540e.getBottom());
                    }
                }
                needsInvalidate = true;
            }
            this.j = hasTabs;
            if (hasTabs && (drawable = this.f1542g) != null) {
                drawable.setBounds(tabContainer.getLeft(), tabContainer.getTop(), tabContainer.getRight(), tabContainer.getBottom());
                needsInvalidate = true;
            }
        }
        if (needsInvalidate) {
            invalidate();
        }
    }
}
