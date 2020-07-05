package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: bt */
public final class C0163bt extends SeekBar {

    /* renamed from: a */
    private final C0164bu f867a;

    public C0163bt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.seekBarStyle);
    }

    private C0163bt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f867a = new C0164bu(this);
        this.f867a.mo1015a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0164bu buVar = this.f867a;
        Drawable drawable = buVar.f869c;
        if (drawable != null && drawable.isStateful() && drawable.setState(buVar.f868b.getDrawableState())) {
            buVar.f868b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C0164bu buVar = this.f867a;
        if (buVar.f869c != null) {
            buVar.f869c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0164bu buVar = this.f867a;
        if (buVar.f869c != null) {
            int max = buVar.f868b.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = buVar.f869c.getIntrinsicWidth();
                int intrinsicHeight = buVar.f869c.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                buVar.f869c.setBounds(-i2, -i, i2, i);
                float width = ((float) ((buVar.f868b.getWidth() - buVar.f868b.getPaddingLeft()) - buVar.f868b.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) buVar.f868b.getPaddingLeft(), (float) (buVar.f868b.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    buVar.f869c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
