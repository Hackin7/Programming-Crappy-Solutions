package com.google.android.material.internal;

import a.b.o.j.i;
import a.b.o.j.n;
import a.b.p.i0;
import a.b.p.z0;
import a.h.m.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import b.d.a.a.e;
import b.d.a.a.f;
import b.d.a.a.h;
import b.d.a.a.r.d;

public class NavigationMenuItemView extends d implements n.a {
    public static final int[] G = {16842912};
    public FrameLayout A;
    public i B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final a.h.m.a F;
    public final int w;
    public boolean x;
    public boolean y;
    public final CheckedTextView z;

    public class a extends a.h.m.a {
        public a() {
        }

        @Override // a.h.m.a
        public void g(View host, a.h.m.c0.d info) {
            super.g(host, info);
            info.I(NavigationMenuItemView.this.y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.F = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.design_navigation_menu_item, (ViewGroup) this, true);
        this.w = context.getResources().getDimensionPixelSize(b.d.a.a.d.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        s.Z(this.z, this.F);
    }

    @Override // a.b.o.j.n.a
    public void e(i itemData, int menuType) {
        this.B = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            s.a0(this, C());
        }
        setCheckable(itemData.isCheckable());
        setChecked(itemData.isChecked());
        setEnabled(itemData.isEnabled());
        setTitle(itemData.getTitle());
        setIcon(itemData.getIcon());
        setActionView(itemData.getActionView());
        setContentDescription(itemData.getContentDescription());
        z0.a(this, itemData.getTooltipText());
        B();
    }

    public final boolean D() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    public final void B() {
        if (D()) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                i0.a params = (i0.a) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) params).width = -1;
                this.A.setLayoutParams(params);
                return;
            }
            return;
        }
        this.z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            i0.a params2 = (i0.a) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) params2).width = -2;
            this.A.setLayoutParams(params2);
        }
    }

    private void setActionView(View actionView) {
        if (actionView != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(actionView);
        }
    }

    public final StateListDrawable C() {
        TypedValue value = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.b.a.colorControlHighlight, value, true)) {
            return null;
        }
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(G, new ColorDrawable(value.data));
        drawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return drawable;
    }

    @Override // a.b.o.j.n.a
    public i getItemData() {
        return this.B;
    }

    public void setTitle(CharSequence title) {
        this.z.setText(title);
    }

    public void setCheckable(boolean checkable) {
        refreshDrawableState();
        if (this.y != checkable) {
            this.y = checkable;
            this.F.l(this.z, 2048);
        }
    }

    public void setChecked(boolean checked) {
        refreshDrawableState();
        this.z.setChecked(checked);
    }

    public void setIcon(Drawable icon) {
        if (icon != null) {
            if (this.D) {
                Drawable.ConstantState state = icon.getConstantState();
                icon = a.h.f.l.a.q(state == null ? icon : state.newDrawable()).mutate();
                a.h.f.l.a.o(icon, this.C);
            }
            int i = this.w;
            icon.setBounds(0, 0, i, i);
        } else if (this.x) {
            if (this.E == null) {
                Drawable a2 = a.h.e.c.f.a(getResources(), e.navigation_empty_icon, getContext().getTheme());
                this.E = a2;
                if (a2 != null) {
                    int i2 = this.w;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            icon = this.E;
        }
        a.h.n.i.i(this.z, icon, null, null, null);
    }

    @Override // a.b.o.j.n.a
    public boolean d() {
        return false;
    }

    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        i iVar = this.B;
        if (iVar != null && iVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(drawableState, G);
        }
        return drawableState;
    }

    public void setIconTintList(ColorStateList tintList) {
        this.C = tintList;
        this.D = tintList != null;
        i iVar = this.B;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setTextAppearance(int textAppearance) {
        a.h.n.i.n(this.z, textAppearance);
    }

    public void setTextColor(ColorStateList colors) {
        this.z.setTextColor(colors);
    }

    public void setNeedsEmptyIcon(boolean needsEmptyIcon) {
        this.x = needsEmptyIcon;
    }

    public void setHorizontalPadding(int padding) {
        setPadding(padding, 0, padding, 0);
    }

    public void setIconPadding(int padding) {
        this.z.setCompoundDrawablePadding(padding);
    }
}
