package a.f.c;

import a.f.b.i.e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class i extends View {

    /* renamed from: b  reason: collision with root package name */
    public int f755b;

    /* renamed from: c  reason: collision with root package name */
    public View f756c;

    /* renamed from: d  reason: collision with root package name */
    public int f757d;

    public void setEmptyVisibility(int visibility) {
        this.f757d = visibility;
    }

    public int getEmptyVisibility() {
        return this.f757d;
    }

    public View getContent() {
        return this.f756c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect r = new Rect();
            canvas.getClipBounds(r);
            paint.setTextSize((float) r.height());
            int cHeight = r.height();
            int cWidth = r.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, "?".length(), r);
            canvas.drawText("?", ((((float) cWidth) / 2.0f) - (((float) r.width()) / 2.0f)) - ((float) r.left), ((((float) cHeight) / 2.0f) + (((float) r.height()) / 2.0f)) - ((float) r.bottom), paint);
        }
    }

    public void b(ConstraintLayout container) {
        if (this.f755b == -1 && !isInEditMode()) {
            setVisibility(this.f757d);
        }
        View findViewById = container.findViewById(this.f755b);
        this.f756c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.a) findViewById.getLayoutParams()).a0 = true;
            this.f756c.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int id) {
        View v;
        if (this.f755b != id) {
            View view = this.f756c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f756c.getLayoutParams()).a0 = false;
                this.f756c = null;
            }
            this.f755b = id;
            if (id != -1 && (v = ((View) getParent()).findViewById(id)) != null) {
                v.setVisibility(8);
            }
        }
    }

    public void a() {
        if (this.f756c != null) {
            ConstraintLayout.a layoutParams = (ConstraintLayout.a) getLayoutParams();
            ConstraintLayout.a layoutParamsContent = (ConstraintLayout.a) this.f756c.getLayoutParams();
            layoutParamsContent.m0.R0(0);
            if (layoutParams.m0.w() != e.a.FIXED) {
                layoutParams.m0.S0(layoutParamsContent.m0.P());
            }
            if (layoutParams.m0.M() != e.a.FIXED) {
                layoutParams.m0.t0(layoutParamsContent.m0.t());
            }
            layoutParamsContent.m0.R0(8);
        }
    }
}
