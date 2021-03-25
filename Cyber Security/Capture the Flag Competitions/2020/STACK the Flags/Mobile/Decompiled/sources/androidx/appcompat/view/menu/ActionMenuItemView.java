package androidx.appcompat.view.menu;

import a.b.j;
import a.b.o.j.g;
import a.b.o.j.i;
import a.b.o.j.n;
import a.b.o.j.p;
import a.b.p.h0;
import a.b.p.z;
import a.b.p.z0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f  reason: collision with root package name */
    public i f1527f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f1528g;
    public Drawable h;
    public g.b i;
    public h0 j;
    public b k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Resources res = context.getResources();
        this.l = g();
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.ActionMenuItemView, defStyle, 0);
        this.n = a2.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        a2.recycle();
        this.p = (int) ((32.0f * res.getDisplayMetrics().density) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.l = g();
        h();
    }

    public final boolean g() {
        Configuration config = getContext().getResources().getConfiguration();
        int widthDp = config.screenWidthDp;
        return widthDp >= 480 || (widthDp >= 640 && config.screenHeightDp >= 480) || config.orientation == 2;
    }

    public void setPadding(int l2, int t, int r, int b2) {
        this.o = l2;
        super.setPadding(l2, t, r, b2);
    }

    @Override // a.b.o.j.n.a
    public i getItemData() {
        return this.f1527f;
    }

    @Override // a.b.o.j.n.a
    public void e(i itemData, int menuType) {
        this.f1527f = itemData;
        setIcon(itemData.getIcon());
        setTitle(itemData.i(this));
        setId(itemData.getItemId());
        setVisibility(itemData.isVisible() ? 0 : 8);
        setEnabled(itemData.isEnabled());
        if (itemData.hasSubMenu() && this.j == null) {
            this.j = new a();
        }
    }

    public boolean onTouchEvent(MotionEvent e2) {
        h0 h0Var;
        if (!this.f1527f.hasSubMenu() || (h0Var = this.j) == null || !h0Var.onTouch(this, e2)) {
            return super.onTouchEvent(e2);
        }
        return true;
    }

    public void onClick(View v) {
        g.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.f1527f);
        }
    }

    public void setItemInvoker(g.b invoker) {
        this.i = invoker;
    }

    public void setPopupCallback(b popupCallback) {
        this.k = popupCallback;
    }

    @Override // a.b.o.j.n.a
    public boolean d() {
        return true;
    }

    public void setCheckable(boolean checkable) {
    }

    public void setChecked(boolean checked) {
    }

    public void setExpandedFormat(boolean expandedFormat) {
        if (this.m != expandedFormat) {
            this.m = expandedFormat;
            i iVar = this.f1527f;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public final void h() {
        boolean z = true;
        boolean visible = !TextUtils.isEmpty(this.f1528g);
        if (this.h != null && (!this.f1527f.A() || (!this.l && !this.m))) {
            z = false;
        }
        boolean visible2 = visible & z;
        CharSequence charSequence = null;
        setText(visible2 ? this.f1528g : null);
        CharSequence contentDescription = this.f1527f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(visible2 ? null : this.f1527f.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1527f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!visible2) {
                charSequence = this.f1527f.getTitle();
            }
            z0.a(this, charSequence);
            return;
        }
        z0.a(this, tooltipText);
    }

    public void setIcon(Drawable icon) {
        this.h = icon;
        if (icon != null) {
            int width = icon.getIntrinsicWidth();
            int height = icon.getIntrinsicHeight();
            int i2 = this.p;
            if (width > i2) {
                float scale = ((float) i2) / ((float) width);
                width = this.p;
                height = (int) (((float) height) * scale);
            }
            int i3 = this.p;
            if (height > i3) {
                float scale2 = ((float) i3) / ((float) height);
                height = this.p;
                width = (int) (((float) width) * scale2);
            }
            icon.setBounds(0, 0, width, height);
        }
        setCompoundDrawables(icon, null, null, null);
        h();
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence title) {
        this.f1528g = title;
        h();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f1527f.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // a.b.p.z
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int targetWidth;
        int i2;
        boolean textVisible = f();
        if (textVisible && (i2 = this.o) >= 0) {
            super.setPadding(i2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int oldMeasuredWidth = getMeasuredWidth();
        if (widthMode == Integer.MIN_VALUE) {
            targetWidth = Math.min(widthSize, this.n);
        } else {
            targetWidth = this.n;
        }
        if (widthMode != 1073741824 && this.n > 0 && oldMeasuredWidth < targetWidth) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), heightMeasureSpec);
        }
        if (!textVisible && this.h != null) {
            super.setPadding((getMeasuredWidth() - this.h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // a.b.p.h0
        public p b() {
            b bVar = ActionMenuItemView.this.k;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // a.b.p.h0
        public boolean c() {
            p popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.i;
            if (bVar == null || !bVar.a(actionMenuItemView.f1527f) || (popup = b()) == null || !popup.b()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(null);
    }
}
