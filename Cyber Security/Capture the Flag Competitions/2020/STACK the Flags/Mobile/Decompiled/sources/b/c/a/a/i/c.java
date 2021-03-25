package b.c.a.a.i;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import b.c.a.a.a.a;
import b.c.a.a.f.b;
import b.c.a.a.g.a.d;
import b.c.a.a.j.f;
import b.c.a.a.j.g;

public abstract class c extends i {

    /* renamed from: b  reason: collision with root package name */
    public a f2491b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f2492c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f2493d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f2494e;

    public abstract void b(Canvas canvas);

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, b[] bVarArr);

    public abstract void e(Canvas canvas);

    public c(a animator, g viewPortHandler) {
        super(viewPortHandler);
        this.f2491b = animator;
        Paint paint = new Paint(1);
        this.f2492c = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f2494e = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.f2494e.setTextAlign(Paint.Align.CENTER);
        this.f2494e.setTextSize(f.e(9.0f));
        Paint paint3 = new Paint(1);
        this.f2493d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f2493d.setStrokeWidth(2.0f);
        this.f2493d.setColor(Color.rgb(255, 187, 115));
    }

    public void a(d set) {
        this.f2494e.setTypeface(set.g());
        this.f2494e.setTextSize(set.B());
    }
}
