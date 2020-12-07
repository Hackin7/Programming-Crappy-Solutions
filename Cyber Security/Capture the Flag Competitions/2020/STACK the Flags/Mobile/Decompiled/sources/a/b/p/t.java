package a.b.p;

import a.b.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class t extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    public final r f418b;

    public t(Context context, AttributeSet attrs) {
        this(context, attrs, a.ratingBarStyle);
    }

    public t(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        r0.a(this, getContext());
        r rVar = new r(this);
        this.f418b = rVar;
        rVar.c(attrs, defStyleAttr);
    }

    public synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Bitmap sampleTile = this.f418b.b();
        if (sampleTile != null) {
            setMeasuredDimension(View.resolveSizeAndState(sampleTile.getWidth() * getNumStars(), widthMeasureSpec, 0), getMeasuredHeight());
        }
    }
}
