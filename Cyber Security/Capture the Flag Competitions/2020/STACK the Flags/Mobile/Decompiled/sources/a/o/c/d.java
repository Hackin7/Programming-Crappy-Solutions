package a.o.c;

import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class d extends RecyclerView.n implements RecyclerView.r {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A = 0;
    public final Runnable B = new a();
    public final RecyclerView.s C = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f1260a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1261b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f1262c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f1263d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1264e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1265f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f1266g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q = 0;
    public int r = 0;
    public RecyclerView s;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];
    public final ValueAnimator z = ValueAnimator.ofFloat(0.0f, 1.0f);

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d.this.q(500);
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int dx, int dy) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable, int defaultWidth, int scrollbarMinimumRange, int margin) {
        this.f1262c = verticalThumbDrawable;
        this.f1263d = verticalTrackDrawable;
        this.f1266g = horizontalThumbDrawable;
        this.h = horizontalTrackDrawable;
        this.f1264e = Math.max(defaultWidth, verticalThumbDrawable.getIntrinsicWidth());
        this.f1265f = Math.max(defaultWidth, verticalTrackDrawable.getIntrinsicWidth());
        this.i = Math.max(defaultWidth, horizontalThumbDrawable.getIntrinsicWidth());
        this.j = Math.max(defaultWidth, horizontalTrackDrawable.getIntrinsicWidth());
        this.f1260a = scrollbarMinimumRange;
        this.f1261b = margin;
        this.f1262c.setAlpha(255);
        this.f1263d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new C0036d());
        j(recyclerView);
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                l();
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                z();
            }
        }
    }

    public final void z() {
        this.s.i(this);
        this.s.k(this);
        this.s.l(this.C);
    }

    public final void l() {
        this.s.V0(this);
        this.s.W0(this);
        this.s.X0(this.C);
        k();
    }

    public void v() {
        this.s.invalidate();
    }

    public void y(int state) {
        if (state == 2 && this.v != 2) {
            this.f1262c.setState(D);
            k();
        }
        if (state == 0) {
            v();
        } else {
            A();
        }
        if (this.v == 2 && state != 2) {
            this.f1262c.setState(E);
            w(1200);
        } else if (state == 1) {
            w(1500);
        }
        this.v = state;
    }

    public final boolean s() {
        return s.v(this.s) == 1;
    }

    public void A() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0);
        this.z.start();
    }

    public void q(int duration) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration((long) duration);
        this.z.start();
    }

    public final void k() {
        this.s.removeCallbacks(this.B);
    }

    public final void w(int delay) {
        k();
        this.s.postDelayed(this.B, (long) delay);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView parent, RecyclerView.y state) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.t) {
                n(canvas);
            }
            if (this.u) {
                m(canvas);
            }
        }
    }

    public final void n(Canvas canvas) {
        int viewWidth = this.q;
        int i2 = this.f1264e;
        int left = viewWidth - i2;
        int i3 = this.l;
        int i4 = this.k;
        int top = i3 - (i4 / 2);
        this.f1262c.setBounds(0, 0, i2, i4);
        this.f1263d.setBounds(0, 0, this.f1265f, this.r);
        if (s()) {
            this.f1263d.draw(canvas);
            canvas.translate((float) this.f1264e, (float) top);
            canvas.scale(-1.0f, 1.0f);
            this.f1262c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f1264e), (float) (-top));
            return;
        }
        canvas.translate((float) left, 0.0f);
        this.f1263d.draw(canvas);
        canvas.translate(0.0f, (float) top);
        this.f1262c.draw(canvas);
        canvas.translate((float) (-left), (float) (-top));
    }

    public final void m(Canvas canvas) {
        int viewHeight = this.r;
        int i2 = this.i;
        int top = viewHeight - i2;
        int i3 = this.o;
        int i4 = this.n;
        int left = i3 - (i4 / 2);
        this.f1266g.setBounds(0, 0, i4, i2);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, (float) top);
        this.h.draw(canvas);
        canvas.translate((float) left, 0.0f);
        this.f1266g.draw(canvas);
        canvas.translate((float) (-left), (float) (-top));
    }

    public void B(int offsetX, int offsetY) {
        int verticalContentLength = this.s.computeVerticalScrollRange();
        int verticalVisibleLength = this.r;
        this.t = verticalContentLength - verticalVisibleLength > 0 && this.r >= this.f1260a;
        int horizontalContentLength = this.s.computeHorizontalScrollRange();
        int horizontalVisibleLength = this.q;
        boolean z2 = horizontalContentLength - horizontalVisibleLength > 0 && this.q >= this.f1260a;
        this.u = z2;
        if (this.t || z2) {
            if (this.t) {
                this.l = (int) ((((float) verticalVisibleLength) * (((float) offsetY) + (((float) verticalVisibleLength) / 2.0f))) / ((float) verticalContentLength));
                this.k = Math.min(verticalVisibleLength, (verticalVisibleLength * verticalVisibleLength) / verticalContentLength);
            }
            if (this.u) {
                this.o = (int) ((((float) horizontalVisibleLength) * (((float) offsetX) + (((float) horizontalVisibleLength) / 2.0f))) / ((float) horizontalContentLength));
                this.n = Math.min(horizontalVisibleLength, (horizontalVisibleLength * horizontalVisibleLength) / horizontalContentLength);
            }
            int i2 = this.v;
            if (i2 == 0 || i2 == 1) {
                y(1);
            }
        } else if (this.v != 0) {
            y(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(RecyclerView recyclerView, MotionEvent ev) {
        int i2 = this.v;
        if (i2 == 1) {
            boolean insideVerticalThumb = u(ev.getX(), ev.getY());
            boolean insideHorizontalThumb = t(ev.getX(), ev.getY());
            if (ev.getAction() != 0 || (!insideVerticalThumb && !insideHorizontalThumb)) {
                return false;
            }
            if (insideHorizontalThumb) {
                this.w = 1;
                this.p = (float) ((int) ev.getX());
            } else if (insideVerticalThumb) {
                this.w = 2;
                this.m = (float) ((int) ev.getY());
            }
            y(2);
            return true;
        } else if (i2 == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(RecyclerView recyclerView, MotionEvent me) {
        if (this.v != 0) {
            if (me.getAction() == 0) {
                boolean insideVerticalThumb = u(me.getX(), me.getY());
                boolean insideHorizontalThumb = t(me.getX(), me.getY());
                if (insideVerticalThumb || insideHorizontalThumb) {
                    if (insideHorizontalThumb) {
                        this.w = 1;
                        this.p = (float) ((int) me.getX());
                    } else if (insideVerticalThumb) {
                        this.w = 2;
                        this.m = (float) ((int) me.getY());
                    }
                    y(2);
                }
            } else if (me.getAction() == 1 && this.v == 2) {
                this.m = 0.0f;
                this.p = 0.0f;
                y(1);
                this.w = 0;
            } else if (me.getAction() == 2 && this.v == 2) {
                A();
                if (this.w == 1) {
                    r(me.getX());
                }
                if (this.w == 2) {
                    C(me.getY());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean disallowIntercept) {
    }

    public final void C(float y2) {
        int[] scrollbarRange = p();
        float y3 = Math.max((float) scrollbarRange[0], Math.min((float) scrollbarRange[1], y2));
        if (Math.abs(((float) this.l) - y3) >= 2.0f) {
            int scrollingBy = x(this.m, y3, scrollbarRange, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
            if (scrollingBy != 0) {
                this.s.scrollBy(0, scrollingBy);
            }
            this.m = y3;
        }
    }

    public final void r(float x2) {
        int[] scrollbarRange = o();
        float x3 = Math.max((float) scrollbarRange[0], Math.min((float) scrollbarRange[1], x2));
        if (Math.abs(((float) this.o) - x3) >= 2.0f) {
            int scrollingBy = x(this.p, x3, scrollbarRange, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
            if (scrollingBy != 0) {
                this.s.scrollBy(scrollingBy, 0);
            }
            this.p = x3;
        }
    }

    public final int x(float oldDragPos, float newDragPos, int[] scrollbarRange, int scrollRange, int scrollOffset, int viewLength) {
        int scrollbarLength = scrollbarRange[1] - scrollbarRange[0];
        if (scrollbarLength == 0) {
            return 0;
        }
        int totalPossibleOffset = scrollRange - viewLength;
        int scrollingBy = (int) (((float) totalPossibleOffset) * ((newDragPos - oldDragPos) / ((float) scrollbarLength)));
        int absoluteOffset = scrollOffset + scrollingBy;
        if (absoluteOffset >= totalPossibleOffset || absoluteOffset < 0) {
            return 0;
        }
        return scrollingBy;
    }

    public boolean u(float x2, float y2) {
        if (!s() ? x2 >= ((float) (this.q - this.f1264e)) : x2 <= ((float) (this.f1264e / 2))) {
            int i2 = this.l;
            int i3 = this.k;
            return y2 >= ((float) (i2 - (i3 / 2))) && y2 <= ((float) (i2 + (i3 / 2)));
        }
    }

    public boolean t(float x2, float y2) {
        if (y2 >= ((float) (this.r - this.i))) {
            int i2 = this.o;
            int i3 = this.n;
            return x2 >= ((float) (i2 - (i3 / 2))) && x2 <= ((float) (i2 + (i3 / 2)));
        }
    }

    public final int[] p() {
        int[] iArr = this.x;
        int i2 = this.f1261b;
        iArr[0] = i2;
        iArr[1] = this.r - i2;
        return iArr;
    }

    public final int[] o() {
        int[] iArr = this.y;
        int i2 = this.f1261b;
        iArr[0] = i2;
        iArr[1] = this.q - i2;
        return iArr;
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1269a = false;

        public c() {
        }

        public void onAnimationEnd(Animator animation) {
            if (this.f1269a) {
                this.f1269a = false;
            } else if (((Float) d.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.f1269a = true;
        }
    }

    /* renamed from: a.o.c.d$d  reason: collision with other inner class name */
    public class C0036d implements ValueAnimator.AnimatorUpdateListener {
        public C0036d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int alpha = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f1262c.setAlpha(alpha);
            d.this.f1263d.setAlpha(alpha);
            d.this.v();
        }
    }
}
