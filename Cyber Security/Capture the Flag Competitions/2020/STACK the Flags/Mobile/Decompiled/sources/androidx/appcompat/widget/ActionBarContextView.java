package androidx.appcompat.widget;

import a.b.f;
import a.b.g;
import a.b.j;
import a.b.o.b;
import a.b.p.c;
import a.b.p.d1;
import a.b.p.w0;
import a.h.m.s;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a.b.p.a {
    public CharSequence j;
    public CharSequence k;
    public View l;
    public View m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public int q;
    public int r;
    public boolean s;
    public int t;

    @Override // a.b.p.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // a.b.p.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // a.b.p.a
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        w0 a2 = w0.u(context, attrs, j.ActionMode, defStyle, 0);
        s.a0(this, a2.f(j.ActionMode_background));
        this.q = a2.m(j.ActionMode_titleTextStyle, 0);
        this.r = a2.m(j.ActionMode_subtitleTextStyle, 0);
        this.f258f = a2.l(j.ActionMode_height, 0);
        this.t = a2.m(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
        a2.v();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f257e;
        if (cVar != null) {
            cVar.B();
            this.f257e.C();
        }
    }

    @Override // a.b.p.a
    public void setContentHeight(int height) {
        this.f258f = height;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
        }
        this.m = view;
        if (!(view == null || (linearLayout = this.n) == null)) {
            removeView(linearLayout);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence title) {
        this.j = title;
        i();
    }

    public void setSubtitle(CharSequence subtitle) {
        this.k = subtitle;
        i();
    }

    public CharSequence getTitle() {
        return this.j;
    }

    public CharSequence getSubtitle() {
        return this.k;
    }

    public final void i() {
        if (this.n == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.n = linearLayout;
            this.o = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.p = (TextView) this.n.findViewById(f.action_bar_subtitle);
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
        }
        this.o.setText(this.j);
        this.p.setText(this.k);
        boolean hasTitle = !TextUtils.isEmpty(this.j);
        boolean hasSubtitle = !TextUtils.isEmpty(this.k);
        int i = 0;
        this.p.setVisibility(hasSubtitle ? 0 : 8);
        LinearLayout linearLayout2 = this.n;
        if (!hasTitle && !hasSubtitle) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    public void h(b mode) {
        View view = this.l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.t, (ViewGroup) this, false);
            this.l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.l);
        }
        this.l.findViewById(f.action_mode_close_button).setOnClickListener(new a(this, mode));
        a.b.o.j.g menu = (a.b.o.j.g) mode.e();
        c cVar = this.f257e;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f257e = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menu.c(this.f257e, this.f255c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f257e.o(this);
        this.f256d = actionMenuView;
        s.a0(actionMenuView, null);
        addView(this.f256d, layoutParams);
    }

    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f1543b;

        public a(ActionBarContextView this$0, b bVar) {
            this.f1543b = bVar;
        }

        public void onClick(View v) {
            this.f1543b.c();
        }
    }

    public void g() {
        if (this.l == null) {
            k();
        }
    }

    public void k() {
        removeAllViews();
        this.m = null;
        this.f256d = null;
    }

    public boolean l() {
        c cVar = this.f257e;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int customHeightMode = 1073741824;
        if (View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(heightMeasureSpec) != 0) {
            int contentWidth = View.MeasureSpec.getSize(widthMeasureSpec);
            int maxHeight = this.f258f;
            if (maxHeight <= 0) {
                maxHeight = View.MeasureSpec.getSize(heightMeasureSpec);
            }
            int verticalPadding = getPaddingTop() + getPaddingBottom();
            int availableWidth = (contentWidth - getPaddingLeft()) - getPaddingRight();
            int height = maxHeight - verticalPadding;
            int childSpecHeight = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
            View view = this.l;
            int i = 0;
            if (view != null) {
                int availableWidth2 = c(view, availableWidth, childSpecHeight, 0);
                ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
                availableWidth = availableWidth2 - (lp.leftMargin + lp.rightMargin);
            }
            ActionMenuView actionMenuView = this.f256d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                availableWidth = c(this.f256d, availableWidth, childSpecHeight, 0);
            }
            LinearLayout linearLayout = this.n;
            if (linearLayout != null && this.m == null) {
                if (this.s) {
                    this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), childSpecHeight);
                    int titleWidth = this.n.getMeasuredWidth();
                    boolean titleFits = titleWidth <= availableWidth;
                    if (titleFits) {
                        availableWidth -= titleWidth;
                    }
                    LinearLayout linearLayout2 = this.n;
                    if (!titleFits) {
                        i = 8;
                    }
                    linearLayout2.setVisibility(i);
                } else {
                    availableWidth = c(linearLayout, availableWidth, childSpecHeight, 0);
                }
            }
            View view2 = this.m;
            if (view2 != null) {
                ViewGroup.LayoutParams lp2 = view2.getLayoutParams();
                int customWidthMode = lp2.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i2 = lp2.width;
                int customWidth = i2 >= 0 ? Math.min(i2, availableWidth) : availableWidth;
                if (lp2.height == -2) {
                    customHeightMode = Integer.MIN_VALUE;
                }
                int i3 = lp2.height;
                this.m.measure(View.MeasureSpec.makeMeasureSpec(customWidth, customWidthMode), View.MeasureSpec.makeMeasureSpec(i3 >= 0 ? Math.min(i3, height) : height, customHeightMode));
            }
            if (this.f258f <= 0) {
                int measuredHeight = 0;
                int count = getChildCount();
                for (int i4 = 0; i4 < count; i4++) {
                    int paddedViewHeight = getChildAt(i4).getMeasuredHeight() + verticalPadding;
                    if (paddedViewHeight > measuredHeight) {
                        measuredHeight = paddedViewHeight;
                    }
                }
                setMeasuredDimension(contentWidth, measuredHeight);
                return;
            }
            setMeasuredDimension(contentWidth, maxHeight);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int x;
        boolean isLayoutRtl = d1.b(this);
        int x2 = isLayoutRtl ? (r2 - l2) - getPaddingRight() : getPaddingLeft();
        int y = getPaddingTop();
        int contentHeight = ((b2 - t2) - getPaddingTop()) - getPaddingBottom();
        View view = this.l;
        if (view == null || view.getVisibility() == 8) {
            x = x2;
        } else {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int startMargin = isLayoutRtl ? lp.rightMargin : lp.leftMargin;
            int endMargin = isLayoutRtl ? lp.leftMargin : lp.rightMargin;
            int x3 = a.b.p.a.d(x2, startMargin, isLayoutRtl);
            x = a.b.p.a.d(x3 + e(this.l, x3, y, contentHeight, isLayoutRtl), endMargin, isLayoutRtl);
        }
        LinearLayout linearLayout = this.n;
        if (!(linearLayout == null || this.m != null || linearLayout.getVisibility() == 8)) {
            x += e(this.n, x, y, contentHeight, isLayoutRtl);
        }
        View view2 = this.m;
        if (view2 != null) {
            int x4 = x + e(view2, x, y, contentHeight, isLayoutRtl);
        }
        int x5 = isLayoutRtl ? getPaddingLeft() : (r2 - l2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f256d;
        if (actionMenuView != null) {
            int x6 = x5 + e(actionMenuView, x5, y, contentHeight, !isLayoutRtl);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == 32) {
            event.setSource(this);
            event.setClassName(getClass().getName());
            event.setPackageName(getContext().getPackageName());
            event.setContentDescription(this.j);
            return;
        }
        super.onInitializeAccessibilityEvent(event);
    }

    public void setTitleOptional(boolean titleOptional) {
        if (titleOptional != this.s) {
            requestLayout();
        }
        this.s = titleOptional;
    }

    public boolean j() {
        return this.s;
    }
}
