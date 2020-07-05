package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends C0113ay {

    /* renamed from: g */
    public View f337g;

    /* renamed from: h */
    public boolean f338h;

    /* renamed from: i */
    private CharSequence f339i;

    /* renamed from: j */
    private CharSequence f340j;

    /* renamed from: k */
    private View f341k;

    /* renamed from: l */
    private LinearLayout f342l;

    /* renamed from: m */
    private TextView f343m;

    /* renamed from: n */
    private TextView f344n;

    /* renamed from: o */
    private int f345o;

    /* renamed from: p */
    private int f346p;

    /* renamed from: q */
    private int f347q;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0215cr a = C0215cr.m676a(context, attributeSet, C0126j.ActionMode, i, 0);
        C0396gq.m1257a((View) this, a.mo1312a(C0126j.ActionMode_background));
        this.f345o = a.mo1324g(C0126j.ActionMode_titleTextStyle, 0);
        this.f346p = a.mo1324g(C0126j.ActionMode_subtitleTextStyle, 0);
        this.f749e = a.mo1322f(C0126j.ActionMode_height, 0);
        this.f347q = a.mo1324g(C0126j.ActionMode_closeItemLayout, C0123g.abc_action_mode_close_item_material);
        a.f1087b.recycle();
    }

    /* renamed from: c */
    private void m162c() {
        if (this.f342l == null) {
            LayoutInflater.from(getContext()).inflate(C0123g.abc_action_bar_title_item, this);
            this.f342l = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f343m = (TextView) this.f342l.findViewById(C0122f.action_bar_title);
            this.f344n = (TextView) this.f342l.findViewById(C0122f.action_bar_subtitle);
            if (this.f345o != 0) {
                this.f343m.setTextAppearance(getContext(), this.f345o);
            }
            if (this.f346p != 0) {
                this.f344n.setTextAppearance(getContext(), this.f346p);
            }
        }
        this.f343m.setText(this.f339i);
        this.f344n.setText(this.f340j);
        boolean z = !TextUtils.isEmpty(this.f339i);
        boolean z2 = !TextUtils.isEmpty(this.f340j);
        int i = 8;
        this.f344n.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f342l;
        if (z || z2) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f342l.getParent() == null) {
            addView(this.f342l);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0402gt mo393a(int i, long j) {
        return super.mo393a(i, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r3.f337g.getParent() == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo394a(final p000.C0802u r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f337g
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f347q
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f337g = r0
        L_0x0015:
            android.view.View r0 = r3.f337g
            r3.addView(r0)
            goto L_0x0024
        L_0x001b:
            android.view.View r0 = r3.f337g
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0024
            goto L_0x0015
        L_0x0024:
            android.view.View r0 = r3.f337g
            int r1 = p000.C0116b.C0122f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$1 r1 = new androidx.appcompat.widget.ActionBarContextView$1
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo2589b()
            aj r4 = (p000.C0019aj) r4
            ba r0 = r3.f748d
            if (r0 == 0) goto L_0x0043
            ba r0 = r3.f748d
            r0.mo888f()
        L_0x0043:
            ba r0 = new ba
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f748d = r0
            ba r0 = r3.f748d
            r0.mo885c()
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            ba r1 = r3.f748d
            android.content.Context r2 = r3.f746b
            r4.mo147a(r1, r2)
            ba r4 = r3.f748d
            ar r4 = r4.mo93a(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f747c = r4
            androidx.appcompat.widget.ActionMenuView r4 = r3.f747c
            r1 = 0
            p000.C0396gq.m1257a(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f747c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo394a(u):void");
    }

    /* renamed from: a */
    public final boolean mo395a() {
        if (this.f748d != null) {
            return this.f748d.mo886d();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo396b() {
        removeAllViews();
        this.f341k = null;
        this.f747c = null;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f340j;
    }

    public CharSequence getTitle() {
        return this.f339i;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f748d != null) {
            this.f748d.mo887e();
            this.f748d.mo889g();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f339i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = C0225cx.m739a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!(this.f337g == null || this.f337g.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f337g.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m408a(paddingRight, i5, a);
            paddingRight = m408a(a2 + m410a(this.f337g, a2, paddingTop, paddingTop2, a), i6, a);
        }
        if (!(this.f342l == null || this.f341k != null || this.f342l.getVisibility() == 8)) {
            paddingRight += m410a(this.f342l, paddingRight, paddingTop, paddingTop2, a);
        }
        if (this.f341k != null) {
            m410a(this.f341k, paddingRight, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f747c != null) {
            m410a(this.f747c, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        } else {
            int size = MeasureSpec.getSize(i);
            int size2 = this.f749e > 0 ? this.f749e : MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = size2 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            if (this.f337g != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f337g.getLayoutParams();
                paddingLeft = m409a(this.f337g, paddingLeft, makeMeasureSpec) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f747c != null && this.f747c.getParent() == this) {
                paddingLeft = m409a((View) this.f747c, paddingLeft, makeMeasureSpec);
            }
            if (this.f342l != null && this.f341k == null) {
                if (this.f338h) {
                    this.f342l.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f342l.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f342l.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = m409a((View) this.f342l, paddingLeft, makeMeasureSpec);
                }
            }
            if (this.f341k != null) {
                LayoutParams layoutParams = this.f341k.getLayoutParams();
                int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i4 = Math.min(layoutParams.height, i4);
                }
                this.f341k.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i5), MeasureSpec.makeMeasureSpec(i4, i3));
            }
            if (this.f749e <= 0) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i6) {
                        i6 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i6);
                return;
            }
            setMeasuredDimension(size, size2);
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f749e = i;
    }

    public void setCustomView(View view) {
        if (this.f341k != null) {
            removeView(this.f341k);
        }
        this.f341k = view;
        if (!(view == null || this.f342l == null)) {
            removeView(this.f342l);
            this.f342l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f340j = charSequence;
        m162c();
    }

    public void setTitle(CharSequence charSequence) {
        this.f339i = charSequence;
        m162c();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f338h) {
            requestLayout();
        }
        this.f338h = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
