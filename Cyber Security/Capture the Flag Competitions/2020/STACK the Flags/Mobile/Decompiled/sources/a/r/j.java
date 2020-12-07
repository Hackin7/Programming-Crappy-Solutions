package a.r;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public class j implements TypeEvaluator<Rect> {
    /* renamed from: a */
    public Rect evaluate(float fraction, Rect startValue, Rect endValue) {
        int i = startValue.left;
        int left = i + ((int) (((float) (endValue.left - i)) * fraction));
        int i2 = startValue.top;
        int top = i2 + ((int) (((float) (endValue.top - i2)) * fraction));
        int i3 = startValue.right;
        int right = i3 + ((int) (((float) (endValue.right - i3)) * fraction));
        int i4 = startValue.bottom;
        return new Rect(left, top, right, i4 + ((int) (((float) (endValue.bottom - i4)) * fraction)));
    }
}
