package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public Drawable f327a;

    /* renamed from: b */
    public Drawable f328b;

    /* renamed from: c */
    public Drawable f329c;

    /* renamed from: d */
    public boolean f330d;

    /* renamed from: e */
    public boolean f331e;

    /* renamed from: f */
    private boolean f332f;

    /* renamed from: g */
    private View f333g;

    /* renamed from: h */
    private View f334h;

    /* renamed from: i */
    private View f335i;

    /* renamed from: j */
    private int f336j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0396gq.m1257a((View) this, (Drawable) new C0115az(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126j.ActionBar);
        this.f327a = obtainStyledAttributes.getDrawable(C0126j.ActionBar_background);
        this.f328b = obtainStyledAttributes.getDrawable(C0126j.ActionBar_backgroundStacked);
        this.f336j = obtainStyledAttributes.getDimensionPixelSize(C0126j.ActionBar_height, -1);
        if (getId() == C0122f.split_action_bar) {
            this.f330d = true;
            this.f329c = obtainStyledAttributes.getDrawable(C0126j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f330d ? this.f327a == null && this.f328b == null : this.f329c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private static boolean m160a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private static int m161b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f327a != null && this.f327a.isStateful()) {
            this.f327a.setState(getDrawableState());
        }
        if (this.f328b != null && this.f328b.isStateful()) {
            this.f328b.setState(getDrawableState());
        }
        if (this.f329c != null && this.f329c.isStateful()) {
            this.f329c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f333g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f327a != null) {
            this.f327a.jumpToCurrentState();
        }
        if (this.f328b != null) {
            this.f328b.jumpToCurrentState();
        }
        if (this.f329c != null) {
            this.f329c.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f334h = findViewById(C0122f.action_bar);
        this.f335i = findViewById(C0122f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f332f || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            android.view.View r6 = r5.f333g
            r8 = 8
            r10 = 1
            r0 = 0
            if (r6 == 0) goto L_0x0013
            int r1 = r6.getVisibility()
            if (r1 == r8) goto L_0x0013
            r1 = r10
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r6 == 0) goto L_0x0035
            int r2 = r6.getVisibility()
            if (r2 == r8) goto L_0x0035
            int r8 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r6.getMeasuredHeight()
            int r3 = r8 - r3
            int r4 = r2.bottomMargin
            int r3 = r3 - r4
            int r2 = r2.bottomMargin
            int r8 = r8 - r2
            r6.layout(r7, r3, r9, r8)
        L_0x0035:
            boolean r7 = r5.f330d
            if (r7 == 0) goto L_0x004e
            android.graphics.drawable.Drawable r6 = r5.f329c
            if (r6 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r6 = r5.f329c
            int r7 = r5.getMeasuredWidth()
            int r8 = r5.getMeasuredHeight()
            r6.setBounds(r0, r0, r7, r8)
            goto L_0x00be
        L_0x004c:
            r10 = r0
            goto L_0x00be
        L_0x004e:
            android.graphics.drawable.Drawable r7 = r5.f327a
            if (r7 == 0) goto L_0x00a1
            android.view.View r7 = r5.f334h
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0078
            android.graphics.drawable.Drawable r7 = r5.f327a
            android.view.View r8 = r5.f334h
            int r8 = r8.getLeft()
            android.view.View r9 = r5.f334h
            int r9 = r9.getTop()
            android.view.View r0 = r5.f334h
            int r0 = r0.getRight()
            android.view.View r2 = r5.f334h
        L_0x0070:
            int r2 = r2.getBottom()
            r7.setBounds(r8, r9, r0, r2)
            goto L_0x00a0
        L_0x0078:
            android.view.View r7 = r5.f335i
            if (r7 == 0) goto L_0x009b
            android.view.View r7 = r5.f335i
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x009b
            android.graphics.drawable.Drawable r7 = r5.f327a
            android.view.View r8 = r5.f335i
            int r8 = r8.getLeft()
            android.view.View r9 = r5.f335i
            int r9 = r9.getTop()
            android.view.View r0 = r5.f335i
            int r0 = r0.getRight()
            android.view.View r2 = r5.f335i
            goto L_0x0070
        L_0x009b:
            android.graphics.drawable.Drawable r7 = r5.f327a
            r7.setBounds(r0, r0, r0, r0)
        L_0x00a0:
            r0 = r10
        L_0x00a1:
            r5.f331e = r1
            if (r1 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r7 = r5.f328b
            if (r7 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r7 = r5.f328b
            int r8 = r6.getLeft()
            int r9 = r6.getTop()
            int r0 = r6.getRight()
            int r6 = r6.getBottom()
            r7.setBounds(r8, r9, r0, r6)
        L_0x00be:
            if (r10 == 0) goto L_0x00c3
            r5.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f334h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001e
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001e
            int r0 = r3.f336j
            if (r0 < 0) goto L_0x001e
            int r0 = r3.f336j
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001e:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f334h
            if (r4 != 0) goto L_0x0026
            return
        L_0x0026:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f333g
            if (r0 == 0) goto L_0x0073
            android.view.View r0 = r3.f333g
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0073
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x0073
            android.view.View r0 = r3.f334h
            boolean r0 = m160a(r0)
            if (r0 != 0) goto L_0x004b
            android.view.View r0 = r3.f334h
        L_0x0046:
            int r0 = m161b(r0)
            goto L_0x0057
        L_0x004b:
            android.view.View r0 = r3.f335i
            boolean r0 = m160a(r0)
            if (r0 != 0) goto L_0x0056
            android.view.View r0 = r3.f335i
            goto L_0x0046
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r4 != r1) goto L_0x005e
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x0061
        L_0x005e:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0061:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f333g
            int r1 = m161b(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.f327a != null) {
            this.f327a.setCallback(null);
            unscheduleDrawable(this.f327a);
        }
        this.f327a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f334h != null) {
                this.f327a.setBounds(this.f334h.getLeft(), this.f334h.getTop(), this.f334h.getRight(), this.f334h.getBottom());
            }
        }
        boolean z = false;
        if (!this.f330d ? this.f327a == null && this.f328b == null : this.f329c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        if (this.f329c != null) {
            this.f329c.setCallback(null);
            unscheduleDrawable(this.f329c);
        }
        this.f329c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f330d && this.f329c != null) {
                this.f329c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f330d ? this.f327a == null && this.f328b == null : this.f329c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        if (this.f328b != null) {
            this.f328b.setCallback(null);
            unscheduleDrawable(this.f328b);
        }
        this.f328b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f331e && this.f328b != null) {
                this.f328b.setBounds(this.f333g.getLeft(), this.f333g.getTop(), this.f333g.getRight(), this.f333g.getBottom());
            }
        }
        boolean z = false;
        if (!this.f330d ? this.f327a == null && this.f328b == null : this.f329c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0205cl clVar) {
        if (this.f333g != null) {
            removeView(this.f333g);
        }
        this.f333g = clVar;
        if (clVar != null) {
            addView(clVar);
            ViewGroup.LayoutParams layoutParams = clVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            clVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f332f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f327a != null) {
            this.f327a.setVisible(z, false);
        }
        if (this.f328b != null) {
            this.f328b.setVisible(z, false);
        }
        if (this.f329c != null) {
            this.f329c.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f327a && !this.f330d) || (drawable == this.f328b && this.f331e) || ((drawable == this.f329c && this.f330d) || super.verifyDrawable(drawable));
    }
}
