package b.c.a.a.h;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import b.c.a.a.b.a;
import b.c.a.a.f.b;

public abstract class a<T extends b.c.a.a.b.a<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public EnumC0052a f2471b = EnumC0052a.NONE;

    /* renamed from: c  reason: collision with root package name */
    public int f2472c = 0;

    /* renamed from: d  reason: collision with root package name */
    public b f2473d;

    /* renamed from: e  reason: collision with root package name */
    public GestureDetector f2474e;

    /* renamed from: f  reason: collision with root package name */
    public T f2475f;

    /* renamed from: b.c.a.a.h.a$a  reason: collision with other inner class name */
    public enum EnumC0052a {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public a(T chart) {
        this.f2475f = chart;
        this.f2474e = new GestureDetector(chart.getContext(), this);
    }

    public void e(MotionEvent me) {
        b l = this.f2475f.getOnChartGestureListener();
        if (l != null) {
            l.a(me, this.f2471b);
        }
    }

    public void b(MotionEvent me) {
        b l = this.f2475f.getOnChartGestureListener();
        if (l != null) {
            l.c(me, this.f2471b);
        }
    }

    public void d(b high) {
        this.f2473d = high;
    }

    public void c(b h) {
        if (h == null || h.a(this.f2473d)) {
            this.f2475f.h(null, true);
            this.f2473d = null;
            return;
        }
        this.f2475f.h(h, true);
        this.f2473d = h;
    }

    public static float a(float eventX, float startX, float eventY, float startY) {
        float dx = eventX - startX;
        float dy = eventY - startY;
        return (float) Math.sqrt((double) ((dx * dx) + (dy * dy)));
    }
}
