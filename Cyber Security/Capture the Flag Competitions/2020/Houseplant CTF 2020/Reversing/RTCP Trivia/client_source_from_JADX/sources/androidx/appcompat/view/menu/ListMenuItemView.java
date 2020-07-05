package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements SelectionBoundsAdjuster, C0104a {

    /* renamed from: a */
    private C0023al f309a;

    /* renamed from: b */
    private ImageView f310b;

    /* renamed from: c */
    private RadioButton f311c;

    /* renamed from: d */
    private TextView f312d;

    /* renamed from: e */
    private CheckBox f313e;

    /* renamed from: f */
    private TextView f314f;

    /* renamed from: g */
    private ImageView f315g;

    /* renamed from: h */
    private ImageView f316h;

    /* renamed from: i */
    private LinearLayout f317i;

    /* renamed from: j */
    private Drawable f318j;

    /* renamed from: k */
    private int f319k;

    /* renamed from: l */
    private Context f320l;

    /* renamed from: m */
    private boolean f321m;

    /* renamed from: n */
    private Drawable f322n;

    /* renamed from: o */
    private boolean f323o;

    /* renamed from: p */
    private int f324p;

    /* renamed from: q */
    private LayoutInflater f325q;

    /* renamed from: r */
    private boolean f326r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0215cr a = C0215cr.m676a(getContext(), attributeSet, C0126j.MenuView, i, 0);
        this.f318j = a.mo1312a(C0126j.MenuView_android_itemBackground);
        this.f319k = a.mo1324g(C0126j.MenuView_android_itemTextAppearance, -1);
        this.f321m = a.mo1313a(C0126j.MenuView_preserveIconSpacing, false);
        this.f320l = context;
        this.f322n = a.mo1312a(C0126j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0117a.dropDownListViewStyle, 0);
        this.f323o = obtainStyledAttributes.hasValue(0);
        a.f1087b.recycle();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m155a(View view, int i) {
        if (this.f317i != null) {
            this.f317i.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: b */
    private void m156b() {
        this.f311c = (RadioButton) getInflater().inflate(C0123g.abc_list_menu_item_radio, this, false);
        m155a(this.f311c, -1);
    }

    /* renamed from: c */
    private void m157c() {
        this.f313e = (CheckBox) getInflater().inflate(C0123g.abc_list_menu_item_checkbox, this, false);
        m155a(this.f313e, -1);
    }

    private LayoutInflater getInflater() {
        if (this.f325q == null) {
            this.f325q = LayoutInflater.from(getContext());
        }
        return this.f325q;
    }

    private void setShortcut$25d965e(boolean z) {
        String str;
        int i;
        int i2 = (!z || !this.f309a.mo209d()) ? 8 : 0;
        if (i2 == 0) {
            TextView textView = this.f314f;
            C0023al alVar = this.f309a;
            char c = alVar.mo206c();
            if (c == 0) {
                str = "";
            } else {
                Resources resources = alVar.f139d.f102a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(alVar.f139d.f102a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C0124h.abc_prepend_shortcut_label));
                }
                int i3 = alVar.f139d.mo166c() ? alVar.f138c : alVar.f137b;
                C0023al.m100a(sb, i3, 65536, resources.getString(C0124h.abc_menu_meta_shortcut_label));
                C0023al.m100a(sb, i3, 4096, resources.getString(C0124h.abc_menu_ctrl_shortcut_label));
                C0023al.m100a(sb, i3, 2, resources.getString(C0124h.abc_menu_alt_shortcut_label));
                C0023al.m100a(sb, i3, 1, resources.getString(C0124h.abc_menu_shift_shortcut_label));
                C0023al.m100a(sb, i3, 4, resources.getString(C0124h.abc_menu_sym_shortcut_label));
                C0023al.m100a(sb, i3, 8, resources.getString(C0124h.abc_menu_function_shortcut_label));
                if (c == 8) {
                    i = C0124h.abc_menu_delete_shortcut_label;
                } else if (c == 10) {
                    i = C0124h.abc_menu_enter_shortcut_label;
                } else if (c != ' ') {
                    sb.append(c);
                    str = sb.toString();
                } else {
                    i = C0124h.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f314f.getVisibility() != i2) {
            this.f314f.setVisibility(i2);
        }
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f315g != null) {
            this.f315g.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo340a(C0023al alVar) {
        String str;
        int i;
        this.f309a = alVar;
        int i2 = 0;
        this.f324p = 0;
        setVisibility(alVar.isVisible() ? 0 : 8);
        setTitle(alVar.mo201a((C0104a) this));
        setCheckable(alVar.isCheckable());
        boolean d = alVar.mo209d();
        alVar.mo206c();
        if (!d || !this.f309a.mo209d()) {
            i2 = 8;
        }
        if (i2 == 0) {
            TextView textView = this.f314f;
            C0023al alVar2 = this.f309a;
            char c = alVar2.mo206c();
            if (c == 0) {
                str = "";
            } else {
                Resources resources = alVar2.f139d.f102a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(alVar2.f139d.f102a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C0124h.abc_prepend_shortcut_label));
                }
                int i3 = alVar2.f139d.mo166c() ? alVar2.f138c : alVar2.f137b;
                C0023al.m100a(sb, i3, 65536, resources.getString(C0124h.abc_menu_meta_shortcut_label));
                C0023al.m100a(sb, i3, 4096, resources.getString(C0124h.abc_menu_ctrl_shortcut_label));
                C0023al.m100a(sb, i3, 2, resources.getString(C0124h.abc_menu_alt_shortcut_label));
                C0023al.m100a(sb, i3, 1, resources.getString(C0124h.abc_menu_shift_shortcut_label));
                C0023al.m100a(sb, i3, 4, resources.getString(C0124h.abc_menu_sym_shortcut_label));
                C0023al.m100a(sb, i3, 8, resources.getString(C0124h.abc_menu_function_shortcut_label));
                if (c == 8) {
                    i = C0124h.abc_menu_delete_shortcut_label;
                } else if (c == 10) {
                    i = C0124h.abc_menu_enter_shortcut_label;
                } else if (c != ' ') {
                    sb.append(c);
                    str = sb.toString();
                } else {
                    i = C0124h.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f314f.getVisibility() != i2) {
            this.f314f.setVisibility(i2);
        }
        setIcon(alVar.getIcon());
        setEnabled(alVar.isEnabled());
        setSubMenuArrowVisible(alVar.hasSubMenu());
        setContentDescription(alVar.getContentDescription());
    }

    /* renamed from: a */
    public final boolean mo341a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.f316h != null && this.f316h.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f316h.getLayoutParams();
            rect.top += this.f316h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public C0023al getItemData() {
        return this.f309a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0396gq.m1257a((View) this, this.f318j);
        this.f312d = (TextView) findViewById(C0122f.title);
        if (this.f319k != -1) {
            this.f312d.setTextAppearance(this.f320l, this.f319k);
        }
        this.f314f = (TextView) findViewById(C0122f.shortcut);
        this.f315g = (ImageView) findViewById(C0122f.submenuarrow);
        if (this.f315g != null) {
            this.f315g.setImageDrawable(this.f322n);
        }
        this.f316h = (ImageView) findViewById(C0122f.group_divider);
        this.f317i = (LinearLayout) findViewById(C0122f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f310b != null && this.f321m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f310b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f311c != null || this.f313e != null) {
            if (this.f309a.mo210e()) {
                if (this.f311c == null) {
                    m156b();
                }
                compoundButton2 = this.f311c;
                compoundButton = this.f313e;
            } else {
                if (this.f313e == null) {
                    m157c();
                }
                compoundButton2 = this.f313e;
                compoundButton = this.f311c;
            }
            if (z) {
                compoundButton2.setChecked(this.f309a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                if (this.f313e != null) {
                    this.f313e.setVisibility(8);
                }
                if (this.f311c != null) {
                    this.f311c.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f309a.mo210e()) {
            if (this.f311c == null) {
                m156b();
            }
            compoundButton = this.f311c;
        } else {
            if (this.f313e == null) {
                m157c();
            }
            compoundButton = this.f313e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f326r = z;
        this.f321m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        if (this.f316h != null) {
            this.f316h.setVisibility((this.f323o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f309a.f139d.f110i || this.f326r;
        if (!z && !this.f321m) {
            return;
        }
        if (this.f310b != null || drawable != null || this.f321m) {
            if (this.f310b == null) {
                this.f310b = (ImageView) getInflater().inflate(C0123g.abc_list_menu_item_icon, this, false);
                m155a(this.f310b, 0);
            }
            if (drawable != null || this.f321m) {
                ImageView imageView = this.f310b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f310b.getVisibility() != 0) {
                    this.f310b.setVisibility(0);
                }
                return;
            }
            this.f310b.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f312d.setText(charSequence);
            if (this.f312d.getVisibility() != 0) {
                this.f312d.setVisibility(0);
            }
        } else if (this.f312d.getVisibility() != 8) {
            this.f312d.setVisibility(8);
        }
    }
}
