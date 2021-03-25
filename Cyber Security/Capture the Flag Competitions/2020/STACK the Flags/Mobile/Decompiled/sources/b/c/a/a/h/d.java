package b.c.a.a.h;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import b.c.a.a.b.b;
import b.c.a.a.h.a;
import b.c.a.a.j.c;
import b.c.a.a.j.f;
import java.util.ArrayList;

public class d extends a<b<?>> {

    /* renamed from: g  reason: collision with root package name */
    public c f2482g = c.c(0.0f, 0.0f);
    public float h = 0.0f;
    public ArrayList<a> i = new ArrayList<>();
    public long j = 0;
    public float k = 0.0f;

    public d(b<?> bVar) {
        super(bVar);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View v, MotionEvent event) {
        if (!this.f2474e.onTouchEvent(event) && ((b) this.f2475f).w()) {
            float x = event.getX();
            float y = event.getY();
            int action = event.getAction();
            if (action == 0) {
                e(event);
                k();
                h();
                if (((b) this.f2475f).j()) {
                    i(x, y);
                }
                j(x, y);
                c cVar = this.f2482g;
                cVar.f2511c = x;
                cVar.f2512d = y;
            } else if (action == 1) {
                if (((b) this.f2475f).j()) {
                    k();
                    i(x, y);
                    float f2 = f();
                    this.k = f2;
                    if (f2 != 0.0f) {
                        this.j = AnimationUtils.currentAnimationTimeMillis();
                        f.v(this.f2475f);
                    }
                }
                ((b) this.f2475f).e();
                this.f2472c = 0;
                b(event);
            } else if (action == 2) {
                if (((b) this.f2475f).j()) {
                    i(x, y);
                }
                if (this.f2472c == 0) {
                    c cVar2 = this.f2482g;
                    if (a.a(x, cVar2.f2511c, y, cVar2.f2512d) > f.e(8.0f)) {
                        this.f2471b = a.EnumC0052a.ROTATE;
                        this.f2472c = 6;
                        ((b) this.f2475f).b();
                        b(event);
                    }
                }
                if (this.f2472c == 6) {
                    l(x, y);
                    ((b) this.f2475f).invalidate();
                }
                b(event);
            }
        }
        return true;
    }

    public void onLongPress(MotionEvent me) {
        this.f2471b = a.EnumC0052a.LONG_PRESS;
        b l = ((b) this.f2475f).getOnChartGestureListener();
        if (l != null) {
            l.d(me);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent e2) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent e2) {
        this.f2471b = a.EnumC0052a.SINGLE_TAP;
        b l = ((b) this.f2475f).getOnChartGestureListener();
        if (l != null) {
            l.b(e2);
        }
        if (!((b) this.f2475f).l()) {
            return false;
        }
        c(((b) this.f2475f).f(e2.getX(), e2.getY()));
        return true;
    }

    public final void h() {
        this.i.clear();
    }

    public final void i(float touchLocationX, float touchLocationY) {
        long currentTime = AnimationUtils.currentAnimationTimeMillis();
        this.i.add(new a(this, currentTime, ((b) this.f2475f).s(touchLocationX, touchLocationY)));
        int i2 = 0;
        int count = this.i.size();
        while (i2 < count - 2 && currentTime - this.i.get(i2).f2483a > 1000) {
            this.i.remove(0);
            count--;
            i2 = (i2 - 1) + 1;
        }
    }

    public final float f() {
        if (this.i.isEmpty()) {
            return 0.0f;
        }
        boolean z = false;
        a firstSample = this.i.get(0);
        ArrayList<a> arrayList = this.i;
        a lastSample = arrayList.get(arrayList.size() - 1);
        a beforeLastSample = firstSample;
        for (int i2 = this.i.size() - 1; i2 >= 0; i2--) {
            beforeLastSample = this.i.get(i2);
            if (beforeLastSample.f2484b != lastSample.f2484b) {
                break;
            }
        }
        float timeDelta = ((float) (lastSample.f2483a - firstSample.f2483a)) / 1000.0f;
        if (timeDelta == 0.0f) {
            timeDelta = 0.1f;
        }
        boolean clockwise = lastSample.f2484b >= beforeLastSample.f2484b;
        if (((double) Math.abs(lastSample.f2484b - beforeLastSample.f2484b)) > 270.0d) {
            if (!clockwise) {
                z = true;
            }
            clockwise = z;
        }
        float f2 = lastSample.f2484b;
        float f3 = firstSample.f2484b;
        if (((double) (f2 - f3)) > 180.0d) {
            firstSample.f2484b = (float) (((double) f3) + 360.0d);
        } else if (((double) (f3 - f2)) > 180.0d) {
            lastSample.f2484b = (float) (((double) f2) + 360.0d);
        }
        float velocity = Math.abs((lastSample.f2484b - firstSample.f2484b) / timeDelta);
        if (!clockwise) {
            return -velocity;
        }
        return velocity;
    }

    public void j(float x, float y) {
        this.h = ((b) this.f2475f).s(x, y) - ((b) this.f2475f).getRawRotationAngle();
    }

    public void l(float x, float y) {
        T t = this.f2475f;
        ((b) t).setRotationAngle(((b) t).s(x, y) - this.h);
    }

    public void k() {
        this.k = 0.0f;
    }

    public void g() {
        if (this.k != 0.0f) {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            this.k *= ((b) this.f2475f).getDragDecelerationFrictionCoef();
            T t = this.f2475f;
            ((b) t).setRotationAngle(((b) t).getRotationAngle() + (this.k * (((float) (currentTime - this.j)) / 1000.0f)));
            this.j = currentTime;
            if (((double) Math.abs(this.k)) >= 0.001d) {
                f.v(this.f2475f);
            } else {
                k();
            }
        }
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public long f2483a;

        /* renamed from: b  reason: collision with root package name */
        public float f2484b;

        public a(d dVar, long time, float angle) {
            this.f2483a = time;
            this.f2484b = angle;
        }
    }
}
