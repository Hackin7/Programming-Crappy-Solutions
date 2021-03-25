package androidx.cardview.widget;

import a.d.d;
import a.d.e.b;
import a.d.e.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    public static final int[] i = {16842801};
    public static final c j;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1615b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1616c;

    /* renamed from: d  reason: collision with root package name */
    public int f1617d;

    /* renamed from: e  reason: collision with root package name */
    public int f1618e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f1619f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f1620g;
    public final b h;

    static {
        a.d.e.a aVar = new a.d.e.a();
        j = aVar;
        aVar.n();
    }

    public CardView(Context context, AttributeSet attrs) {
        this(context, attrs, a.d.a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ColorStateList backgroundColor;
        float maxElevation;
        int i2;
        this.f1619f = new Rect();
        this.f1620g = new Rect();
        this.h = new a();
        TypedArray a2 = context.obtainStyledAttributes(attrs, d.CardView, defStyleAttr, a.d.c.CardView);
        if (a2.hasValue(d.CardView_cardBackgroundColor)) {
            backgroundColor = a2.getColorStateList(d.CardView_cardBackgroundColor);
        } else {
            TypedArray aa = getContext().obtainStyledAttributes(i);
            int themeColorBackground = aa.getColor(0, 0);
            aa.recycle();
            float[] hsv = new float[3];
            Color.colorToHSV(themeColorBackground, hsv);
            if (hsv[2] > 0.5f) {
                i2 = getResources().getColor(a.d.b.cardview_light_background);
            } else {
                i2 = getResources().getColor(a.d.b.cardview_dark_background);
            }
            backgroundColor = ColorStateList.valueOf(i2);
        }
        float radius = a2.getDimension(d.CardView_cardCornerRadius, 0.0f);
        float elevation = a2.getDimension(d.CardView_cardElevation, 0.0f);
        float maxElevation2 = a2.getDimension(d.CardView_cardMaxElevation, 0.0f);
        this.f1615b = a2.getBoolean(d.CardView_cardUseCompatPadding, false);
        this.f1616c = a2.getBoolean(d.CardView_cardPreventCornerOverlap, true);
        int defaultPadding = a2.getDimensionPixelSize(d.CardView_contentPadding, 0);
        this.f1619f.left = a2.getDimensionPixelSize(d.CardView_contentPaddingLeft, defaultPadding);
        this.f1619f.top = a2.getDimensionPixelSize(d.CardView_contentPaddingTop, defaultPadding);
        this.f1619f.right = a2.getDimensionPixelSize(d.CardView_contentPaddingRight, defaultPadding);
        this.f1619f.bottom = a2.getDimensionPixelSize(d.CardView_contentPaddingBottom, defaultPadding);
        if (elevation > maxElevation2) {
            maxElevation = elevation;
        } else {
            maxElevation = maxElevation2;
        }
        this.f1617d = a2.getDimensionPixelSize(d.CardView_android_minWidth, 0);
        this.f1618e = a2.getDimensionPixelSize(d.CardView_android_minHeight, 0);
        a2.recycle();
        j.h(this.h, context, backgroundColor, radius, elevation, maxElevation);
    }

    public void setPadding(int left, int top, int right, int bottom) {
    }

    public void setPaddingRelative(int start, int top, int end, int bottom) {
    }

    public boolean getUseCompatPadding() {
        return this.f1615b;
    }

    public void setUseCompatPadding(boolean useCompatPadding) {
        if (this.f1615b != useCompatPadding) {
            this.f1615b = useCompatPadding;
            j.e(this.h);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!(j instanceof a.d.e.a)) {
            int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
            if (widthMode == Integer.MIN_VALUE || widthMode == 1073741824) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) j.d(this.h)), View.MeasureSpec.getSize(widthMeasureSpec)), widthMode);
            }
            int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
            if (heightMode == Integer.MIN_VALUE || heightMode == 1073741824) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) j.c(this.h)), View.MeasureSpec.getSize(heightMeasureSpec)), heightMode);
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setMinimumWidth(int minWidth) {
        this.f1617d = minWidth;
        super.setMinimumWidth(minWidth);
    }

    public void setMinimumHeight(int minHeight) {
        this.f1618e = minHeight;
        super.setMinimumHeight(minHeight);
    }

    public void setCardBackgroundColor(int color) {
        j.k(this.h, ColorStateList.valueOf(color));
    }

    public void setCardBackgroundColor(ColorStateList color) {
        j.k(this.h, color);
    }

    public ColorStateList getCardBackgroundColor() {
        return j.f(this.h);
    }

    public int getContentPaddingLeft() {
        return this.f1619f.left;
    }

    public int getContentPaddingRight() {
        return this.f1619f.right;
    }

    public int getContentPaddingTop() {
        return this.f1619f.top;
    }

    public int getContentPaddingBottom() {
        return this.f1619f.bottom;
    }

    public void setRadius(float radius) {
        j.i(this.h, radius);
    }

    public float getRadius() {
        return j.b(this.h);
    }

    public void setCardElevation(float elevation) {
        j.g(this.h, elevation);
    }

    public float getCardElevation() {
        return j.l(this.h);
    }

    public void setMaxCardElevation(float maxElevation) {
        j.m(this.h, maxElevation);
    }

    public float getMaxCardElevation() {
        return j.a(this.h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1616c;
    }

    public void setPreventCornerOverlap(boolean preventCornerOverlap) {
        if (preventCornerOverlap != this.f1616c) {
            this.f1616c = preventCornerOverlap;
            j.j(this.h);
        }
    }

    public class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1621a;

        public a() {
        }

        public void e(Drawable drawable) {
            this.f1621a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean d() {
            return CardView.this.getUseCompatPadding();
        }

        public boolean c() {
            return CardView.this.getPreventCornerOverlap();
        }

        public void f(int left, int top, int right, int bottom) {
            CardView.this.f1620g.set(left, top, right, bottom);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1619f;
            CardView.super.setPadding(rect.left + left, rect.top + top, rect.right + right, rect.bottom + bottom);
        }

        public Drawable a() {
            return this.f1621a;
        }

        public View b() {
            return CardView.this;
        }
    }
}
