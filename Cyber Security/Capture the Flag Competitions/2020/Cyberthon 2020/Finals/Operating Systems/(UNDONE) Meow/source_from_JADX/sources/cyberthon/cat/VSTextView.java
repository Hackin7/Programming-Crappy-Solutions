package cyberthon.cat;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;

public class VSTextView extends TextView {
    private static final float DEFAULT_SPEED = 15.0f;
    public boolean continuousScrolling = true;
    public Scroller scroller;
    public float speed = DEFAULT_SPEED;

    public VSTextView(Context context) {
        super(context);
        init(null, 0);
        scrollerInstance(context);
    }

    public VSTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
        scrollerInstance(context);
    }

    public VSTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i);
        scrollerInstance(context);
    }

    private void init(AttributeSet attributeSet, int i) {
        initAttributes(getContext().obtainStyledAttributes(attributeSet, C0275R.styleable.MyTextView, i, 0));
    }

    /* access modifiers changed from: protected */
    public void initAttributes(TypedArray typedArray) {
        String string = typedArray.getString(0);
        if (string != null && !string.equals(null) && !string.equals(BuildConfig.FLAVOR)) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), string));
        }
    }

    public void scrollerInstance(Context context) {
        this.scroller = new Scroller(context, new LinearInterpolator());
        setScroller(this.scroller);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.scroller.isFinished()) {
            scroll();
        }
    }

    public void scroll() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        int lineCount = height + (getLineCount() * getLineHeight());
        this.scroller.startScroll(0, height * -1, 0, lineCount, (int) (((float) lineCount) * this.speed));
    }

    public void computeScroll() {
        super.computeScroll();
        Scroller scroller2 = this.scroller;
        if (scroller2 != null && scroller2.isFinished() && this.continuousScrolling) {
            scroll();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Scroller scroller2 = this.scroller;
        if (scroller2 != null && scroller2.isFinished() && this.continuousScrolling) {
            scroll();
        }
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setContinuousScrolling(boolean z) {
        this.continuousScrolling = z;
    }

    public boolean isContinuousScrolling() {
        return this.continuousScrolling;
    }
}
