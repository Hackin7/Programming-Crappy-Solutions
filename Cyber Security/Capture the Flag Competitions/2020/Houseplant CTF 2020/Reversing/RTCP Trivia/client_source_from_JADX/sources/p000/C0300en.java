package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0088a;

/* renamed from: en */
public final class C0300en extends View {
    public C0300en(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setGuidelineBegin(int i) {
        C0088a aVar = (C0088a) getLayoutParams();
        aVar.f614a = i;
        setLayoutParams(aVar);
    }

    public final void setGuidelineEnd(int i) {
        C0088a aVar = (C0088a) getLayoutParams();
        aVar.f628b = i;
        setLayoutParams(aVar);
    }

    public final void setGuidelinePercent(float f) {
        C0088a aVar = (C0088a) getLayoutParams();
        aVar.f629c = f;
        setLayoutParams(aVar);
    }

    public final void setVisibility(int i) {
    }
}
