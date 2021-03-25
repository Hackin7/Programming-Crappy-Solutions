package b.c.a.a.b;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.c.a.a.c.h;
import b.c.a.a.d.c;
import b.c.a.a.d.e;
import b.c.a.a.f.b;
import b.c.a.a.g.a.d;
import b.c.a.a.j.f;
import b.c.a.a.j.g;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.BuildConfig;

public abstract class a<T extends c<? extends d<? extends e>>> extends ViewGroup {
    public boolean A = false;
    public b[] B;
    public float C = 0.0f;
    public boolean D = true;
    public b.c.a.a.c.d E;
    public ArrayList<Runnable> F = new ArrayList<>();
    public boolean G = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2383b = false;

    /* renamed from: c  reason: collision with root package name */
    public T f2384c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2385d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2386e = true;

    /* renamed from: f  reason: collision with root package name */
    public float f2387f = 0.9f;

    /* renamed from: g  reason: collision with root package name */
    public b.c.a.a.e.b f2388g = new b.c.a.a.e.b(0);
    public Paint h;
    public Paint i;
    public h j;
    public boolean k = true;
    public b.c.a.a.c.c l;
    public b.c.a.a.c.e m;
    public b.c.a.a.h.c n;
    public b.c.a.a.h.a o;
    public String p = "No chart data available.";
    public b.c.a.a.h.b q;
    public b.c.a.a.i.d r;
    public b.c.a.a.i.c s;
    public b.c.a.a.f.c t;
    public g u = new g();
    public b.c.a.a.a.a v;
    public float w = 0.0f;
    public float x = 0.0f;
    public float y = 0.0f;
    public float z = 0.0f;

    public abstract void a();

    public abstract /* synthetic */ int getMaxVisibleCount();

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public abstract void m();

    public a(Context context, AttributeSet attrs) {
        super(context, attrs);
        i();
    }

    public void i() {
        setWillNotDraw(false);
        this.v = new b.c.a.a.a.a(new C0050a());
        f.t(getContext());
        this.C = f.e(500.0f);
        this.l = new b.c.a.a.c.c();
        b.c.a.a.c.e eVar = new b.c.a.a.c.e();
        this.m = eVar;
        this.r = new b.c.a.a.i.d(this.u, eVar);
        this.j = new h();
        this.h = new Paint(1);
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.i.setTextAlign(Paint.Align.CENTER);
        this.i.setTextSize(f.e(12.0f));
        if (this.f2383b) {
            Log.i(BuildConfig.FLAVOR, "Chart.init()");
        }
    }

    /* renamed from: b.c.a.a.b.a$a  reason: collision with other inner class name */
    public class C0050a implements ValueAnimator.AnimatorUpdateListener {
        public C0050a() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            a.this.postInvalidate();
        }
    }

    public void setData(T data) {
        this.f2384c = data;
        this.A = false;
        if (data != null) {
            n(data.n(), data.l());
            for (d set : this.f2384c.f()) {
                if (set.h() || set.D() == this.f2388g) {
                    set.I(this.f2388g);
                }
            }
            m();
            if (this.f2383b) {
                Log.i("MPAndroidChart", "Data is set.");
            }
        }
    }

    public void n(float min, float max) {
        float reference;
        T t2 = this.f2384c;
        if (t2 == null || t2.g() < 2) {
            reference = Math.max(Math.abs(min), Math.abs(max));
        } else {
            reference = Math.abs(max - min);
        }
        this.f2388g.e(f.i(reference));
    }

    public void onDraw(Canvas canvas) {
        if (this.f2384c == null) {
            if (!TextUtils.isEmpty(this.p)) {
                b.c.a.a.j.c c2 = getCenter();
                canvas.drawText(this.p, c2.f2511c, c2.f2512d, this.i);
            }
        } else if (!this.A) {
            a();
            this.A = true;
        }
    }

    public void c(Canvas c2) {
        float y2;
        float x2;
        b.c.a.a.c.c cVar = this.l;
        if (cVar != null && cVar.f()) {
            this.l.h();
            b.c.a.a.j.c position = null;
            this.h.setTypeface(this.l.c());
            this.h.setTextSize(this.l.b());
            this.h.setColor(this.l.a());
            this.h.setTextAlign(this.l.j());
            if (0 == 0) {
                x2 = (((float) getWidth()) - this.u.v()) - this.l.d();
                y2 = (((float) getHeight()) - this.u.t()) - this.l.e();
            } else {
                x2 = position.f2511c;
                y2 = position.f2512d;
            }
            c2.drawText(this.l.i(), x2, y2, this.h);
        }
    }

    public float getMaxHighlightDistance() {
        return this.C;
    }

    public void setMaxHighlightDistance(float distDp) {
        this.C = f.e(distDp);
    }

    public b[] getHighlighted() {
        return this.B;
    }

    public boolean l() {
        return this.f2385d;
    }

    public void setHighlightPerTapEnabled(boolean enabled) {
        this.f2385d = enabled;
    }

    public boolean p() {
        b[] bVarArr = this.B;
        return (bVarArr == null || bVarArr.length <= 0 || bVarArr[0] == null) ? false : true;
    }

    public void setLastHighlighted(b[] highs) {
        if (highs == null || highs.length <= 0 || highs[0] == null) {
            this.o.d(null);
        } else {
            this.o.d(highs[0]);
        }
    }

    public void h(b high, boolean callListener) {
        e e2 = null;
        if (high == null) {
            this.B = null;
        } else {
            if (this.f2383b) {
                Log.i("MPAndroidChart", "Highlighted: " + high.toString());
            }
            e2 = this.f2384c.h(high);
            if (e2 == null) {
                this.B = null;
                high = null;
            } else {
                this.B = new b[]{high};
            }
        }
        setLastHighlighted(this.B);
        if (callListener && this.n != null) {
            if (!p()) {
                this.n.b();
            } else {
                this.n.a(e2, high);
            }
        }
        invalidate();
    }

    public b f(float x2, float y2) {
        if (this.f2384c != null) {
            return ((b.c.a.a.f.e) getHighlighter()).b(x2, y2);
        }
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }

    public void setOnTouchListener(b.c.a.a.h.a l2) {
        this.o = l2;
    }

    public b.c.a.a.h.a getOnTouchListener() {
        return this.o;
    }

    public void d(Canvas canvas) {
        if (this.E != null && k() && p()) {
            int i2 = 0;
            while (true) {
                b[] bVarArr = this.B;
                if (i2 < bVarArr.length) {
                    b highlight = bVarArr[i2];
                    d set = this.f2384c.d(highlight.b());
                    e e2 = this.f2384c.h(this.B[i2]);
                    int entryIndex = set.R(e2);
                    if (e2 != null && ((float) entryIndex) <= ((float) set.E()) * this.v.a()) {
                        float[] pos = g(highlight);
                        if (this.u.m(pos[0], pos[1])) {
                            this.E.a(e2, highlight);
                            this.E.b(canvas, pos[0], pos[1]);
                        }
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public float[] g(b high) {
        return new float[]{high.c(), high.d()};
    }

    public b.c.a.a.a.a getAnimator() {
        return this.v;
    }

    public boolean j() {
        return this.f2386e;
    }

    public void setDragDecelerationEnabled(boolean enabled) {
        this.f2386e = enabled;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f2387f;
    }

    public void setDragDecelerationFrictionCoef(float newValue) {
        if (newValue < 0.0f) {
            newValue = 0.0f;
        }
        if (newValue >= 1.0f) {
            newValue = 0.999f;
        }
        this.f2387f = newValue;
    }

    public h getXAxis() {
        return this.j;
    }

    public b.c.a.a.e.c getDefaultValueFormatter() {
        return this.f2388g;
    }

    public void setOnChartValueSelectedListener(b.c.a.a.h.c l2) {
        this.n = l2;
    }

    public void setOnChartGestureListener(b.c.a.a.h.b l2) {
        this.q = l2;
    }

    public b.c.a.a.h.b getOnChartGestureListener() {
        return this.q;
    }

    public float getYMax() {
        return this.f2384c.l();
    }

    public float getYMin() {
        return this.f2384c.n();
    }

    public float getXChartMax() {
        return this.j.x;
    }

    public float getXChartMin() {
        return this.j.y;
    }

    public float getXRange() {
        return this.j.z;
    }

    public b.c.a.a.j.c getCenter() {
        return b.c.a.a.j.c.c(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    public b.c.a.a.j.c getCenterOffsets() {
        return this.u.h();
    }

    public void setExtraTopOffset(float offset) {
        this.w = f.e(offset);
    }

    public float getExtraTopOffset() {
        return this.w;
    }

    public void setExtraRightOffset(float offset) {
        this.x = f.e(offset);
    }

    public float getExtraRightOffset() {
        return this.x;
    }

    public void setExtraBottomOffset(float offset) {
        this.y = f.e(offset);
    }

    public float getExtraBottomOffset() {
        return this.y;
    }

    public void setExtraLeftOffset(float offset) {
        this.z = f.e(offset);
    }

    public float getExtraLeftOffset() {
        return this.z;
    }

    public void setLogEnabled(boolean enabled) {
        this.f2383b = enabled;
    }

    public void setNoDataText(String text) {
        this.p = text;
    }

    public void setNoDataTextColor(int color) {
        this.i.setColor(color);
    }

    public void setNoDataTextTypeface(Typeface tf) {
        this.i.setTypeface(tf);
    }

    public void setTouchEnabled(boolean enabled) {
        this.k = enabled;
    }

    public void setMarker(b.c.a.a.c.d marker) {
        this.E = marker;
    }

    public b.c.a.a.c.d getMarker() {
        return this.E;
    }

    @Deprecated
    public void setMarkerView(b.c.a.a.c.d v2) {
        setMarker(v2);
    }

    @Deprecated
    public b.c.a.a.c.d getMarkerView() {
        return getMarker();
    }

    public void setDescription(b.c.a.a.c.c desc) {
        this.l = desc;
    }

    public b.c.a.a.c.c getDescription() {
        return this.l;
    }

    public b.c.a.a.c.e getLegend() {
        return this.m;
    }

    public b.c.a.a.i.d getLegendRenderer() {
        return this.r;
    }

    public RectF getContentRect() {
        return this.u.i();
    }

    public void b() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void e() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Deprecated
    public void setDrawMarkerViews(boolean enabled) {
        setDrawMarkers(enabled);
    }

    public boolean k() {
        return this.D;
    }

    public void setDrawMarkers(boolean enabled) {
        this.D = enabled;
    }

    public T getData() {
        return this.f2384c;
    }

    public g getViewPortHandler() {
        return this.u;
    }

    public b.c.a.a.i.c getRenderer() {
        return this.s;
    }

    public void setRenderer(b.c.a.a.i.c renderer) {
        if (renderer != null) {
            this.s = renderer;
        }
    }

    public b.c.a.a.f.c getHighlighter() {
        return this.t;
    }

    public void setHighlighter(b.c.a.a.f.a highlighter) {
        this.t = highlighter;
    }

    public b.c.a.a.j.c getCenterOfView() {
        return getCenter();
    }

    public Bitmap getChartBitmap() {
        Bitmap returnedBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(returnedBitmap);
        Drawable bgDrawable = getBackground();
        if (bgDrawable != null) {
            bgDrawable.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return returnedBitmap;
    }

    public ArrayList<Runnable> getJobs() {
        return this.F;
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).layout(left, top, right, bottom);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = (int) f.e(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), ViewGroup.resolveSize(size, widthMeasureSpec)), Math.max(getSuggestedMinimumHeight(), ViewGroup.resolveSize(size, heightMeasureSpec)));
    }

    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        if (this.f2383b) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (w2 > 0 && h2 > 0 && w2 < 10000 && h2 < 10000) {
            if (this.f2383b) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + w2 + ", height: " + h2);
            }
            this.u.y((float) w2, (float) h2);
        } else if (this.f2383b) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + w2 + ", height: " + h2);
        }
        m();
        Iterator<Runnable> it = this.F.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.F.clear();
        super.onSizeChanged(w2, h2, oldw, oldh);
    }

    public void setHardwareAccelerationEnabled(boolean enabled) {
        if (enabled) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.G) {
            o(this);
        }
    }

    public final void o(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            for (int i2 = 0; i2 < ((ViewGroup) view).getChildCount(); i2++) {
                o(((ViewGroup) view).getChildAt(i2));
            }
            ((ViewGroup) view).removeAllViews();
        }
    }

    public void setUnbindEnabled(boolean enabled) {
        this.G = enabled;
    }
}
