package a.f.c;

import a.f.b.i.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class a extends c {
    public int i;
    public int j;
    public a.f.b.i.a k;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public int getType() {
        return this.i;
    }

    public void setType(int type) {
        this.i = type;
    }

    public final void o(e widget, int type, boolean isRtl) {
        this.j = type;
        if (isRtl) {
            int i2 = this.i;
            if (i2 == 5) {
                this.j = 1;
            } else if (i2 == 6) {
                this.j = 0;
            }
        } else {
            int i3 = this.i;
            if (i3 == 5) {
                this.j = 0;
            } else if (i3 == 6) {
                this.j = 1;
            }
        }
        if (widget instanceof a.f.b.i.a) {
            ((a.f.b.i.a) widget).j1(this.j);
        }
    }

    @Override // a.f.c.c
    public void h(e widget, boolean isRtl) {
        o(widget, this.i, isRtl);
    }

    @Override // a.f.c.c
    public void g(AttributeSet attrs) {
        super.g(attrs);
        this.k = new a.f.b.i.a();
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, k.ConstraintLayout_Layout);
            int N = a2.getIndexCount();
            for (int i2 = 0; i2 < N; i2++) {
                int attr = a2.getIndex(i2);
                if (attr == k.ConstraintLayout_Layout_barrierDirection) {
                    setType(a2.getInt(attr, 0));
                } else if (attr == k.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.k.i1(a2.getBoolean(attr, true));
                } else if (attr == k.ConstraintLayout_Layout_barrierMargin) {
                    this.k.k1(a2.getDimensionPixelSize(attr, 0));
                }
            }
            a2.recycle();
        }
        this.f702e = this.k;
        m();
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.k.i1(supportGone);
    }

    public boolean n() {
        return this.k.d1();
    }

    public void setDpMargin(int margin) {
        a.f.b.i.a aVar = this.k;
        aVar.k1((int) ((((float) margin) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public int getMargin() {
        return this.k.f1();
    }

    public void setMargin(int margin) {
        this.k.k1(margin);
    }
}
