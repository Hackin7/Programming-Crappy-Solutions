package com.cuberto.liquid_swipe;

import a.h.m.s;
import a.h.m.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.viewpager.widget.ViewPager;
import b.b.a.d;
import b.b.a.e.c;

public final class LiquidPager extends ViewPager implements ViewTreeObserver.OnDrawListener, d {
    public c f0;
    public b.b.a.e.d g0;
    public boolean h0;
    public int i0 = b.b.a.b.ic_button;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiquidPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        d.c.a.a.b(context, "context");
        setWillNotDraw(false);
        getViewTreeObserver().addOnDrawListener(this);
        g(new b(this));
        if (!s.K(this) || isLayoutRequested()) {
            addOnLayoutChangeListener(new a(this));
        } else {
            invalidate();
            c cVar = this.f0;
            if (cVar != null) {
                cVar.D(getCurrentItem());
            }
            b.b.a.e.d dVar = this.g0;
            if (dVar != null) {
                dVar.D(getCurrentItem());
            }
        }
        this.i0 = context.obtainStyledAttributes(attrs, b.b.a.c.LiquidPager).getResourceId(b.b.a.c.LiquidPager_button_drawable, b.b.a.b.ic_button);
    }

    public static final class b implements ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiquidPager f2683a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(LiquidPager $outer) {
            this.f2683a = $outer;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int position) {
            this.f2683a.invalidate();
            c cVar = this.f2683a.f0;
            if (cVar != null) {
                cVar.D(position);
            }
            b.b.a.e.d dVar = this.f2683a.g0;
            if (dVar != null) {
                dVar.D(position);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiquidPager f2682a;

        public a(LiquidPager liquidPager) {
            this.f2682a = liquidPager;
        }

        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            d.c.a.a.b(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f2682a.invalidate();
            c cVar = this.f2682a.f0;
            if (cVar != null) {
                cVar.D(this.f2682a.getCurrentItem());
            }
            b.b.a.e.d dVar = this.f2682a.g0;
            if (dVar != null) {
                dVar.D(this.f2682a.getCurrentItem());
            }
        }
    }

    public final void setButtonDrawable(int drawableId) {
        this.i0 = drawableId;
        b.b.a.e.d dVar = this.g0;
        if (dVar != null) {
            dVar.g0(getResources().getDrawable(this.i0, null));
        }
    }

    @Override // b.b.a.d
    public int getCount() {
        a.u.a.a adapter = getAdapter();
        if (adapter != null) {
            return adapter.getCount();
        }
        return 0;
    }

    @Override // b.b.a.d
    public Bitmap d(int direction) {
        b.b.a.e.b.f2369c.a();
        if (direction == 0) {
            return X(getCurrentItem() - 1);
        }
        return X(getCurrentItem() + 1);
    }

    public Bitmap X(int position) {
        View childAt = getChildAt(position);
        if (childAt != null) {
            return v.b(childAt, null, 1);
        }
        return null;
    }

    @Override // b.b.a.d
    public void b() {
        invalidate();
    }

    @Override // b.b.a.d
    public void a(int direction) {
        b.b.a.e.b.f2369c.a();
        int currentItem = getCurrentItem();
        Q(direction == 0 ? currentItem + 1 : currentItem - 1, false);
    }

    @Override // b.b.a.d
    public void c(boolean block) {
        this.h0 = block;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Resources resources = getResources();
        d.c.a.a.a(resources, "resources");
        float density = resources.getDisplayMetrics().density;
        this.f0 = new c(w, h, 0.0f, density, this);
        b.b.a.e.d dVar = new b.b.a.e.d(w, h, 0.0f, density, this);
        this.g0 = dVar;
        if (dVar != null) {
            dVar.g0(getResources().getDrawable(this.i0, null));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent ev) {
        boolean left;
        boolean right;
        d.c.a.a.b(ev, "ev");
        if (!this.h0) {
            int action = ev.getAction();
            if (action == 0) {
                c cVar = this.f0;
                boolean left2 = cVar != null ? cVar.T(ev) : false;
                b.b.a.e.d dVar = this.g0;
                boolean right2 = dVar != null ? dVar.d0(ev) : false;
                if (left2 || right2) {
                    return true;
                }
                return false;
            } else if (action == 1) {
                c cVar2 = this.f0;
                if (cVar2 != null) {
                    cVar2.V(ev);
                    left = true;
                } else {
                    left = false;
                }
                b.b.a.e.d dVar2 = this.g0;
                if (dVar2 != null) {
                    dVar2.f0(ev);
                    right = true;
                } else {
                    right = false;
                }
                if (left || right) {
                    return true;
                }
                return false;
            } else if (action == 2) {
                c cVar3 = this.f0;
                boolean left3 = cVar3 != null ? cVar3.U(ev) : false;
                b.b.a.e.d dVar3 = this.g0;
                boolean right3 = dVar3 != null ? dVar3.e0(ev) : false;
                if (left3 || right3) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        c cVar = this.f0;
        if (cVar != null) {
            cVar.R(canvas);
        }
        b.b.a.e.d dVar = this.g0;
        if (dVar != null) {
            dVar.a0(canvas);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c cVar = this.f0;
        if (cVar != null) {
            cVar.R(canvas);
        }
        b.b.a.e.d dVar = this.g0;
        if (dVar != null) {
            dVar.a0(canvas);
        }
    }

    public void onDraw() {
        c cVar = this.f0;
        if (cVar == null || !cVar.C()) {
            b.b.a.e.d dVar = this.g0;
            if (dVar == null || !dVar.C()) {
                c cVar2 = this.f0;
                if (cVar2 != null) {
                    cVar2.D(getCurrentItem());
                }
                b.b.a.e.d dVar2 = this.g0;
                if (dVar2 != null) {
                    dVar2.D(getCurrentItem());
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOffscreenPageLimit(int limit) {
        super.setOffscreenPageLimit(getCount());
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(a.u.a.a adapter) {
        super.setAdapter(adapter);
        setOffscreenPageLimit(getCount());
    }
}
