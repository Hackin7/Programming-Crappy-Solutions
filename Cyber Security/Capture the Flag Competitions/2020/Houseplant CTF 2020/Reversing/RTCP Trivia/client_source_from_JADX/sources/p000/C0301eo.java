package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0088a;

/* renamed from: eo */
public final class C0301eo extends View {

    /* renamed from: a */
    public int f1584a;

    /* renamed from: b */
    public View f1585b;

    /* renamed from: c */
    public int f1586c;

    public final View getContent() {
        return this.f1585b;
    }

    public final int getEmptyVisibility() {
        return this.f1586c;
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public final void setContentId(int i) {
        if (this.f1584a != i) {
            if (this.f1585b != null) {
                this.f1585b.setVisibility(0);
                ((C0088a) this.f1585b.getLayoutParams()).f615aa = false;
                this.f1585b = null;
            }
            this.f1584a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public final void setEmptyVisibility(int i) {
        this.f1586c = i;
    }
}
