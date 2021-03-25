package b.d.a.a.r;

import a.b.p.i0;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import b.d.a.a.j;

public class d extends i0 {
    public Drawable q;
    public final Rect r;
    public final Rect s;
    public int t;
    public boolean u;
    public boolean v;

    public d(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public d(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.r = new Rect();
        this.s = new Rect();
        this.t = 119;
        this.u = true;
        this.v = false;
        TypedArray a2 = f.h(context, attrs, j.ForegroundLinearLayout, defStyle, 0, new int[0]);
        this.t = a2.getInt(j.ForegroundLinearLayout_android_foregroundGravity, this.t);
        Drawable d2 = a2.getDrawable(j.ForegroundLinearLayout_android_foreground);
        if (d2 != null) {
            setForeground(d2);
        }
        this.u = a2.getBoolean(j.ForegroundLinearLayout_foregroundInsidePadding, true);
        a2.recycle();
    }

    public int getForegroundGravity() {
        return this.t;
    }

    public void setForegroundGravity(int foregroundGravity) {
        if (this.t != foregroundGravity) {
            if ((8388615 & foregroundGravity) == 0) {
                foregroundGravity |= 8388611;
            }
            if ((foregroundGravity & 112) == 0) {
                foregroundGravity |= 48;
            }
            this.t = foregroundGravity;
            if (foregroundGravity == 119 && this.q != null) {
                this.q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.q;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful()) {
            this.q.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.q);
            }
            this.q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.q;
    }

    @Override // a.b.p.i0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.v |= changed;
    }

    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.v = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.q != null) {
            Drawable foreground = this.q;
            if (this.v) {
                this.v = false;
                Rect selfBounds = this.r;
                Rect overlayBounds = this.s;
                int w = getRight() - getLeft();
                int h = getBottom() - getTop();
                if (this.u) {
                    selfBounds.set(0, 0, w, h);
                } else {
                    selfBounds.set(getPaddingLeft(), getPaddingTop(), w - getPaddingRight(), h - getPaddingBottom());
                }
                Gravity.apply(this.t, foreground.getIntrinsicWidth(), foreground.getIntrinsicHeight(), selfBounds, overlayBounds);
                foreground.setBounds(overlayBounds);
            }
            foreground.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float x, float y) {
        super.drawableHotspotChanged(x, y);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setHotspot(x, y);
        }
    }
}
