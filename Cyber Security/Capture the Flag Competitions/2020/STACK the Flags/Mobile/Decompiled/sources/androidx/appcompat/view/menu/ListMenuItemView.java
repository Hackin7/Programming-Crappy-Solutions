package androidx.appcompat.view.menu;

import a.b.a;
import a.b.f;
import a.b.g;
import a.b.j;
import a.b.o.j.i;
import a.b.o.j.n;
import a.b.p.w0;
import a.h.m.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    public i f1531b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f1532c;

    /* renamed from: d  reason: collision with root package name */
    public RadioButton f1533d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f1534e;

    /* renamed from: f  reason: collision with root package name */
    public CheckBox f1535f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f1536g;
    public ImageView h;
    public ImageView i;
    public LinearLayout j;
    public Drawable k;
    public int l;
    public Context m;
    public boolean n;
    public Drawable o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    public ListMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        w0 a2 = w0.u(getContext(), attrs, j.MenuView, defStyleAttr, 0);
        this.k = a2.f(j.MenuView_android_itemBackground);
        this.l = a2.m(j.MenuView_android_itemTextAppearance, -1);
        this.n = a2.a(j.MenuView_preserveIconSpacing, false);
        this.m = context;
        this.o = a2.f(j.MenuView_subMenuArrow);
        TypedArray b2 = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.p = b2.hasValue(0);
        a2.v();
        b2.recycle();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        s.a0(this, this.k);
        TextView textView = (TextView) findViewById(f.title);
        this.f1534e = textView;
        int i2 = this.l;
        if (i2 != -1) {
            textView.setTextAppearance(this.m, i2);
        }
        this.f1536g = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(f.group_divider);
        this.j = (LinearLayout) findViewById(f.content);
    }

    @Override // a.b.o.j.n.a
    public void e(i itemData, int menuType) {
        this.f1531b = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        setTitle(itemData.i(this));
        setCheckable(itemData.isCheckable());
        boolean z = itemData.z();
        itemData.g();
        h(z);
        setIcon(itemData.getIcon());
        setEnabled(itemData.isEnabled());
        setSubMenuArrowVisible(itemData.hasSubMenu());
        setContentDescription(itemData.getContentDescription());
    }

    public final void a(View v) {
        b(v, -1);
    }

    public final void b(View v, int index) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(v, index);
        } else {
            addView(v, index);
        }
    }

    public void setForceShowIcon(boolean forceShow) {
        this.r = forceShow;
        this.n = forceShow;
    }

    public void setTitle(CharSequence title) {
        if (title != null) {
            this.f1534e.setText(title);
            if (this.f1534e.getVisibility() != 0) {
                this.f1534e.setVisibility(0);
            }
        } else if (this.f1534e.getVisibility() != 8) {
            this.f1534e.setVisibility(8);
        }
    }

    @Override // a.b.o.j.n.a
    public i getItemData() {
        return this.f1531b;
    }

    public void setCheckable(boolean checkable) {
        CompoundButton otherCompoundButton;
        CompoundButton compoundButton;
        if (checkable || this.f1533d != null || this.f1535f != null) {
            if (this.f1531b.m()) {
                if (this.f1533d == null) {
                    g();
                }
                compoundButton = this.f1533d;
                otherCompoundButton = this.f1535f;
            } else {
                if (this.f1535f == null) {
                    c();
                }
                compoundButton = this.f1535f;
                otherCompoundButton = this.f1533d;
            }
            if (checkable) {
                compoundButton.setChecked(this.f1531b.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (otherCompoundButton != null && otherCompoundButton.getVisibility() != 8) {
                    otherCompoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1535f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1533d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean checked) {
        CompoundButton compoundButton;
        if (this.f1531b.m()) {
            if (this.f1533d == null) {
                g();
            }
            compoundButton = this.f1533d;
        } else {
            if (this.f1535f == null) {
                c();
            }
            compoundButton = this.f1535f;
        }
        compoundButton.setChecked(checked);
    }

    private void setSubMenuArrowVisible(boolean hasSubmenu) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(hasSubmenu ? 0 : 8);
        }
    }

    public void h(boolean showShortcut) {
        int newVisibility = (!showShortcut || !this.f1531b.z()) ? 8 : 0;
        if (newVisibility == 0) {
            this.f1536g.setText(this.f1531b.h());
        }
        if (this.f1536g.getVisibility() != newVisibility) {
            this.f1536g.setVisibility(newVisibility);
        }
    }

    public void setIcon(Drawable icon) {
        boolean showIcon = this.f1531b.y() || this.r;
        if (!showIcon && !this.n) {
            return;
        }
        if (this.f1532c != null || icon != null || this.n) {
            if (this.f1532c == null) {
                f();
            }
            if (icon != null || this.n) {
                this.f1532c.setImageDrawable(showIcon ? icon : null);
                if (this.f1532c.getVisibility() != 0) {
                    this.f1532c.setVisibility(0);
                    return;
                }
                return;
            }
            this.f1532c.setVisibility(8);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f1532c != null && this.n) {
            ViewGroup.LayoutParams lp = getLayoutParams();
            LinearLayout.LayoutParams iconLp = (LinearLayout.LayoutParams) this.f1532c.getLayoutParams();
            int i2 = lp.height;
            if (i2 > 0 && iconLp.width <= 0) {
                iconLp.width = i2;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f1532c = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f1533d = radioButton;
        a(radioButton);
    }

    public final void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f1535f = checkBox;
        a(checkBox);
    }

    @Override // a.b.o.j.n.a
    public boolean d() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !groupDividerEnabled) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            rect.top += this.i.getHeight() + lp.topMargin + lp.bottomMargin;
        }
    }
}
