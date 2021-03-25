package a.b.p;

import a.b.j;
import a.h.m.s;
import a.h.m.x;
import a.h.m.y;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;

public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public final C0006a f254b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f255c;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuView f256d;

    /* renamed from: e  reason: collision with root package name */
    public c f257e;

    /* renamed from: f  reason: collision with root package name */
    public int f258f;

    /* renamed from: g  reason: collision with root package name */
    public x f259g;
    public boolean h;
    public boolean i;

    public abstract void setContentHeight(int i2);

    public a(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public a(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f254b = new C0006a();
        TypedValue tv = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.b.a.actionBarPopupTheme, tv, true) || tv.resourceId == 0) {
            this.f255c = context;
        } else {
            this.f255c = new ContextThemeWrapper(context, tv.resourceId);
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        TypedArray a2 = getContext().obtainStyledAttributes(null, j.ActionBar, a.b.a.actionBarStyle, 0);
        setContentHeight(a2.getLayoutDimension(j.ActionBar_height, 0));
        a2.recycle();
        c cVar = this.f257e;
        if (cVar != null) {
            cVar.F();
        }
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.h = true;
            }
        }
        if (action == 1 || action == 3) {
            this.h = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.i = true;
            }
        }
        if (action == 10 || action == 3) {
            this.i = false;
        }
        return true;
    }

    public int getContentHeight() {
        return this.f258f;
    }

    public int getAnimatedVisibility() {
        if (this.f259g != null) {
            return this.f254b.f261b;
        }
        return getVisibility();
    }

    public x f(int visibility, long duration) {
        x xVar = this.f259g;
        if (xVar != null) {
            xVar.b();
        }
        if (visibility == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            x anim = s.b(this).a(1.0f);
            anim.d(duration);
            C0006a aVar = this.f254b;
            aVar.d(anim, visibility);
            anim.f(aVar);
            return anim;
        }
        x anim2 = s.b(this).a(0.0f);
        anim2.d(duration);
        C0006a aVar2 = this.f254b;
        aVar2.d(anim2, visibility);
        anim2.f(aVar2);
        return anim2;
    }

    public void setVisibility(int visibility) {
        if (visibility != getVisibility()) {
            x xVar = this.f259g;
            if (xVar != null) {
                xVar.b();
            }
            super.setVisibility(visibility);
        }
    }

    public int c(View child, int availableWidth, int childSpecHeight, int spacing) {
        child.measure(View.MeasureSpec.makeMeasureSpec(availableWidth, Integer.MIN_VALUE), childSpecHeight);
        return Math.max(0, (availableWidth - child.getMeasuredWidth()) - spacing);
    }

    public static int d(int x, int val, boolean isRtl) {
        return isRtl ? x - val : x + val;
    }

    public int e(View child, int x, int y, int contentHeight, boolean reverse) {
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        int childTop = ((contentHeight - childHeight) / 2) + y;
        if (reverse) {
            child.layout(x - childWidth, childTop, x, childTop + childHeight);
        } else {
            child.layout(x, childTop, x + childWidth, childTop + childHeight);
        }
        return reverse ? -childWidth : childWidth;
    }

    /* renamed from: a.b.p.a$a  reason: collision with other inner class name */
    public class C0006a implements y {

        /* renamed from: a  reason: collision with root package name */
        public boolean f260a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f261b;

        public C0006a() {
        }

        public C0006a d(x animation, int visibility) {
            a.this.f259g = animation;
            this.f261b = visibility;
            return this;
        }

        @Override // a.h.m.y
        public void b(View view) {
            a.super.setVisibility(0);
            this.f260a = false;
        }

        @Override // a.h.m.y
        public void a(View view) {
            if (!this.f260a) {
                a aVar = a.this;
                aVar.f259g = null;
                a.super.setVisibility(this.f261b);
            }
        }

        @Override // a.h.m.y
        public void c(View view) {
            this.f260a = true;
        }
    }
}
