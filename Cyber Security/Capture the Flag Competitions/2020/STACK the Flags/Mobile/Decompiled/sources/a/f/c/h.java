package a.f.c;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class h extends View {
    public h(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setVisibility(int visibility) {
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.a params = (ConstraintLayout.a) getLayoutParams();
        params.f1629a = margin;
        setLayoutParams(params);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.a params = (ConstraintLayout.a) getLayoutParams();
        params.f1630b = margin;
        setLayoutParams(params);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.a params = (ConstraintLayout.a) getLayoutParams();
        params.f1631c = ratio;
        setLayoutParams(params);
    }
}
