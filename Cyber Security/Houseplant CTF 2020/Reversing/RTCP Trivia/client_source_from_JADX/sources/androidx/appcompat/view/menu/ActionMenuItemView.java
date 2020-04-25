package androidx.appcompat.view.menu;

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
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.ActionMenuView.C0053a;

public class ActionMenuItemView extends C0174bx implements OnClickListener, C0053a, C0104a {

    /* renamed from: a */
    C0023al f294a;

    /* renamed from: b */
    C0021b f295b;

    /* renamed from: c */
    C0046b f296c;

    /* renamed from: e */
    private CharSequence f297e;

    /* renamed from: f */
    private Drawable f298f;

    /* renamed from: g */
    private C0187ce f299g;

    /* renamed from: h */
    private boolean f300h;

    /* renamed from: i */
    private boolean f301i;

    /* renamed from: j */
    private int f302j;

    /* renamed from: k */
    private int f303k;

    /* renamed from: l */
    private int f304l;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    class C0045a extends C0187ce {
        public C0045a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public final C0107au mo359a() {
            if (ActionMenuItemView.this.f296c != null) {
                return ActionMenuItemView.this.f296c.mo361a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo360b() {
            if (ActionMenuItemView.this.f295b != null && ActionMenuItemView.this.f295b.mo195a(ActionMenuItemView.this.f294a)) {
                C0107au a = mo359a();
                if (a != null && a.mo117d()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0046b {
        /* renamed from: a */
        public abstract C0107au mo361a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f300h = m143e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126j.ActionMenuItemView, i, 0);
        this.f302j = obtainStyledAttributes.getDimensionPixelSize(C0126j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f304l = (int) ((32.0f * resources.getDisplayMetrics().density) + 0.5f);
        setOnClickListener(this);
        this.f303k = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m143e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m144f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f297e);
        if (this.f298f != null) {
            if (!((this.f294a.f140e & 4) == 4) || (!this.f300h && !this.f301i)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f297e : null);
        CharSequence contentDescription = this.f294a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f294a.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f294a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f294a.getTitle();
            }
            C0219ct.m728a(this, charSequence);
            return;
        }
        C0219ct.m728a(this, tooltipText);
    }

    /* renamed from: a */
    public final void mo340a(C0023al alVar) {
        this.f294a = alVar;
        setIcon(alVar.getIcon());
        setTitle(alVar.mo201a((C0104a) this));
        setId(alVar.getItemId());
        setVisibility(alVar.isVisible() ? 0 : 8);
        setEnabled(alVar.isEnabled());
        if (alVar.hasSubMenu() && this.f299g == null) {
            this.f299g = new C0045a();
        }
    }

    /* renamed from: a */
    public final boolean mo341a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo342b() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: c */
    public final boolean mo343c() {
        return mo342b() && this.f294a.getIcon() == null;
    }

    /* renamed from: d */
    public final boolean mo344d() {
        return mo342b();
    }

    public C0023al getItemData() {
        return this.f294a;
    }

    public void onClick(View view) {
        if (this.f295b != null) {
            this.f295b.mo195a(this.f294a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f300h = m143e();
        m144f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean b = mo342b();
        if (b && this.f303k >= 0) {
            super.setPadding(this.f303k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f302j) : this.f302j;
        if (mode != 1073741824 && this.f302j > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!b && this.f298f != null) {
            super.setPadding((getMeasuredWidth() - this.f298f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f294a.hasSubMenu() || this.f299g == null || !this.f299g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f301i != z) {
            this.f301i = z;
            if (this.f294a != null) {
                this.f294a.f139d.mo176h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f298f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f304l) {
                float f = ((float) this.f304l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f304l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f304l) {
                float f2 = ((float) this.f304l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f304l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m144f();
    }

    public void setItemInvoker(C0021b bVar) {
        this.f295b = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f303k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0046b bVar) {
        this.f296c = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f297e = charSequence;
        m144f();
    }
}
