package a.b.o.j;

import a.b.h;
import a.b.o.j.n;
import a.h.g.a.b;
import a.h.m.b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import net.sqlcipher.BuildConfig;

public final class i implements b {
    public a.h.m.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a  reason: collision with root package name */
    public final int f218a;

    /* renamed from: b  reason: collision with root package name */
    public final int f219b;

    /* renamed from: c  reason: collision with root package name */
    public final int f220c;

    /* renamed from: d  reason: collision with root package name */
    public final int f221d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f222e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f223f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f224g;
    public char h;
    public int i = 4096;
    public char j;
    public int k = 4096;
    public Drawable l;
    public int m = 0;
    public g n;
    public r o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public int y = 0;
    public View z;

    @Override // a.h.g.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        p(i2);
        return this;
    }

    @Override // a.h.g.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        q(view);
        return this;
    }

    @Override // a.h.g.a.b
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        v(i2);
        return this;
    }

    public i(g menu, int group, int id, int categoryOrder, int ordering, CharSequence title, int showAsAction) {
        this.n = menu;
        this.f218a = id;
        this.f219b = group;
        this.f220c = categoryOrder;
        this.f221d = ordering;
        this.f222e = title;
        this.y = showAsAction;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.p;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        if (this.f224g != null) {
            try {
                this.n.u().startActivity(this.f224g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        a.h.m.b bVar = this.A;
        if (bVar == null || !bVar.e()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    public MenuItem setEnabled(boolean enabled) {
        if (enabled) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.n.K(false);
        return this;
    }

    public int getGroupId() {
        return this.f219b;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f218a;
    }

    public int getOrder() {
        return this.f220c;
    }

    public int f() {
        return this.f221d;
    }

    public Intent getIntent() {
        return this.f224g;
    }

    public MenuItem setIntent(Intent intent) {
        this.f224g = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        if (this.j == alphaChar) {
            return this;
        }
        this.j = Character.toLowerCase(alphaChar);
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        if (this.j == alphaChar && this.k == alphaModifiers) {
            return this;
        }
        this.j = Character.toLowerCase(alphaChar);
        this.k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public int getAlphabeticModifiers() {
        return this.k;
    }

    public char getNumericShortcut() {
        return this.h;
    }

    @Override // a.h.g.a.b
    public int getNumericModifiers() {
        return this.i;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        if (this.h == numericChar) {
            return this;
        }
        this.h = numericChar;
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        if (this.h == numericChar && this.i == numericModifiers) {
            return this;
        }
        this.h = numericChar;
        this.i = KeyEvent.normalizeMetaState(numericModifiers);
        this.n.K(false);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.h = numericChar;
        this.j = Character.toLowerCase(alphaChar);
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.h = numericChar;
        this.i = KeyEvent.normalizeMetaState(numericModifiers);
        this.j = Character.toLowerCase(alphaChar);
        this.k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.n.K(false);
        return this;
    }

    public char g() {
        return this.n.G() ? this.j : this.h;
    }

    public String h() {
        char shortcut = g();
        if (shortcut == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources res = this.n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.u()).hasPermanentMenuKey()) {
            sb.append(res.getString(h.abc_prepend_shortcut_label));
        }
        int modifiers = this.n.G() ? this.k : this.i;
        d(sb, modifiers, 65536, res.getString(h.abc_menu_meta_shortcut_label));
        d(sb, modifiers, 4096, res.getString(h.abc_menu_ctrl_shortcut_label));
        d(sb, modifiers, 2, res.getString(h.abc_menu_alt_shortcut_label));
        d(sb, modifiers, 1, res.getString(h.abc_menu_shift_shortcut_label));
        d(sb, modifiers, 4, res.getString(h.abc_menu_sym_shortcut_label));
        d(sb, modifiers, 8, res.getString(h.abc_menu_function_shortcut_label));
        if (shortcut == '\b') {
            sb.append(res.getString(h.abc_menu_delete_shortcut_label));
        } else if (shortcut == '\n') {
            sb.append(res.getString(h.abc_menu_enter_shortcut_label));
        } else if (shortcut != ' ') {
            sb.append(shortcut);
        } else {
            sb.append(res.getString(h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, int modifiers, int flag, String label) {
        if ((modifiers & flag) == flag) {
            sb.append(label);
        }
    }

    public boolean z() {
        return this.n.H() && g() != 0;
    }

    public SubMenu getSubMenu() {
        return this.o;
    }

    public boolean hasSubMenu() {
        return this.o != null;
    }

    public void w(r subMenu) {
        this.o = subMenu;
        subMenu.setHeaderTitle(getTitle());
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f222e;
    }

    public CharSequence i(n.a itemView) {
        if (itemView == null || !itemView.d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f222e = title;
        this.n.K(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.setHeaderTitle(title);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        setTitle(this.n.u().getString(title));
        return this;
    }

    public CharSequence getTitleCondensed() {
        CharSequence ctitle = this.f223f;
        if (ctitle != null) {
            return ctitle;
        }
        return this.f222e;
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f223f = title;
        if (title == null) {
            CharSequence title2 = this.f222e;
        }
        this.n.K(false);
        return this;
    }

    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable icon = a.b.l.a.a.d(this.n.u(), this.m);
        this.m = 0;
        this.l = icon;
        return e(icon);
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.m = 0;
        this.l = icon;
        this.w = true;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconResId) {
        this.l = null;
        this.m = iconResId;
        this.w = true;
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.s = iconTintList;
        this.u = true;
        this.w = true;
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // a.h.g.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.t = iconTintMode;
        this.v = true;
        this.w = true;
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    public final Drawable e(Drawable icon) {
        if (icon != null && this.w && (this.u || this.v)) {
            icon = a.h.f.l.a.q(icon).mutate();
            if (this.u) {
                a.h.f.l.a.o(icon, this.s);
            }
            if (this.v) {
                a.h.f.l.a.p(icon, this.t);
            }
            this.w = false;
        }
        return icon;
    }

    public boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    public MenuItem setCheckable(boolean checkable) {
        int oldFlags = this.x;
        int i2 = (this.x & -2) | (checkable ? 1 : 0);
        this.x = i2;
        if (oldFlags != i2) {
            this.n.K(false);
        }
        return this;
    }

    public void t(boolean exclusive) {
        this.x = (this.x & -5) | (exclusive ? 4 : 0);
    }

    public boolean m() {
        return (this.x & 4) != 0;
    }

    public boolean isChecked() {
        return (this.x & 2) == 2;
    }

    public MenuItem setChecked(boolean checked) {
        if ((this.x & 4) != 0) {
            this.n.T(this);
        } else {
            s(checked);
        }
        return this;
    }

    public void s(boolean checked) {
        int oldFlags = this.x;
        int i2 = (this.x & -3) | (checked ? 2 : 0);
        this.x = i2;
        if (oldFlags != i2) {
            this.n.K(false);
        }
    }

    public boolean isVisible() {
        a.h.m.b bVar = this.A;
        if (bVar == null || !bVar.g()) {
            if ((this.x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.x & 8) != 0 || !this.A.b()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean x(boolean shown) {
        int oldFlags = this.x;
        int i2 = (this.x & -9) | (shown ? 0 : 8);
        this.x = i2;
        if (oldFlags != i2) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean shown) {
        if (x(shown)) {
            this.n.J();
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener clickListener) {
        this.p = clickListener;
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f222e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    public void c() {
        this.n.I();
    }

    public boolean y() {
        return this.n.A();
    }

    public boolean l() {
        return (this.x & 32) == 32;
    }

    public boolean n() {
        return (this.y & 1) == 1;
    }

    public boolean o() {
        return (this.y & 2) == 2;
    }

    public void u(boolean isActionButton) {
        if (isActionButton) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    public boolean A() {
        return (this.y & 4) == 4;
    }

    @Override // a.h.g.a.b
    public void setShowAsAction(int actionEnum) {
        int i2 = actionEnum & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.y = actionEnum;
            this.n.I();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public b q(View view) {
        int i2;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f218a) > 0) {
            view.setId(i2);
        }
        this.n.I();
        return this;
    }

    public b p(int resId) {
        Context context = this.n.u();
        q(LayoutInflater.from(context).inflate(resId, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // a.h.g.a.b
    public View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        a.h.m.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d2 = bVar.d(this);
        this.z = d2;
        return d2;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // a.h.g.a.b
    public a.h.m.b b() {
        return this.A;
    }

    @Override // a.h.g.a.b
    public b a(a.h.m.b actionProvider) {
        a.h.m.b bVar = this.A;
        if (bVar != null) {
            bVar.h();
        }
        this.z = null;
        this.A = actionProvider;
        this.n.K(true);
        a.h.m.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.j(new a());
        }
        return this;
    }

    public class a implements b.AbstractC0024b {
        public a() {
        }

        public void a(boolean isVisible) {
            i.this.n.J();
        }
    }

    public a.h.g.a.b v(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // a.h.g.a.b
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.k(this);
        }
        return false;
    }

    @Override // a.h.g.a.b
    public boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public boolean j() {
        a.h.m.b bVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (bVar = this.A) != null) {
            this.z = bVar.d(this);
        }
        if (this.z != null) {
            return true;
        }
        return false;
    }

    public void r(boolean isExpanded) {
        this.C = isExpanded;
        this.n.K(false);
    }

    @Override // a.h.g.a.b
    public boolean isActionViewExpanded() {
        return this.C;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.B = listener;
        return this;
    }

    @Override // a.h.g.a.b
    public a.h.g.a.b setContentDescription(CharSequence contentDescription) {
        this.q = contentDescription;
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public CharSequence getContentDescription() {
        return this.q;
    }

    @Override // a.h.g.a.b
    public a.h.g.a.b setTooltipText(CharSequence tooltipText) {
        this.r = tooltipText;
        this.n.K(false);
        return this;
    }

    @Override // a.h.g.a.b
    public CharSequence getTooltipText() {
        return this.r;
    }
}
