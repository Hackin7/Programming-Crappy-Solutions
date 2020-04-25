package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: bs */
public final class C0162bs extends RatingBar {

    /* renamed from: a */
    private final C0160bq f866a;

    public C0162bs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.ratingBarStyle);
    }

    private C0162bs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f866a = new C0160bq(this);
        this.f866a.mo1015a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f866a.f862a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
