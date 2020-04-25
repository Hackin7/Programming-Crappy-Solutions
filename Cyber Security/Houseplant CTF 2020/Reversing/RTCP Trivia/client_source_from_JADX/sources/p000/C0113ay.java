package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: ay */
public abstract class C0113ay extends ViewGroup {

    /* renamed from: a */
    protected final C0114a f745a;

    /* renamed from: b */
    protected final Context f746b;

    /* renamed from: c */
    protected ActionMenuView f747c;

    /* renamed from: d */
    protected C0127ba f748d;

    /* renamed from: e */
    protected int f749e;

    /* renamed from: f */
    protected C0402gt f750f;

    /* renamed from: g */
    private boolean f751g;

    /* renamed from: h */
    private boolean f752h;

    /* renamed from: ay$a */
    public class C0114a implements C0406gu {

        /* renamed from: a */
        int f753a;

        /* renamed from: c */
        private boolean f755c = false;

        protected C0114a() {
        }

        /* renamed from: a */
        public final C0114a mo875a(C0402gt gtVar, int i) {
            C0113ay.this.f750f = gtVar;
            this.f753a = i;
            return this;
        }

        /* renamed from: a */
        public final void mo7a(View view) {
            C0113ay.super.setVisibility(0);
            this.f755c = false;
        }

        /* renamed from: b */
        public final void mo8b(View view) {
            if (!this.f755c) {
                C0113ay.this.f750f = null;
                C0113ay.super.setVisibility(this.f753a);
            }
        }

        /* renamed from: c */
        public final void mo876c(View view) {
            this.f755c = true;
        }
    }

    C0113ay(Context context) {
        this(context, null);
    }

    C0113ay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected C0113ay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f745a = new C0114a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0117a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f746b = context;
        } else {
            this.f746b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m408a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: a */
    protected static int m409a(View view, int i, int i2) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* renamed from: a */
    protected static int m410a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0402gt mo393a(int i, long j) {
        C0402gt a;
        if (this.f750f != null) {
            this.f750f.mo1825a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a = C0396gq.m1267d(this).mo1821a(1.0f);
        } else {
            a = C0396gq.m1267d(this).mo1821a(0.0f);
        }
        a.mo1822a(j);
        a.mo1823a((C0406gu) this.f745a.mo875a(a, i));
        return a;
    }

    /* renamed from: a */
    public boolean mo395a() {
        if (this.f748d != null) {
            return this.f748d.mo886d();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f750f != null ? this.f745a.f753a : getVisibility();
    }

    public int getContentHeight() {
        return this.f749e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0126j.ActionBar, C0117a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0126j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f748d != null) {
            this.f748d.mo883b();
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f752h = false;
        }
        if (!this.f752h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f752h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f752h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f751g = false;
        }
        if (!this.f751g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f751g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f751g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f749e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f750f != null) {
                this.f750f.mo1825a();
            }
            super.setVisibility(i);
        }
    }
}
