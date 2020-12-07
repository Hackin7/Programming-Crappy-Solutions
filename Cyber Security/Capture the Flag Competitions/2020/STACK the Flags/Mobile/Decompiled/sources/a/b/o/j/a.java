package a.b.o.j;

import a.h.g.a.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f163a;

    /* renamed from: b  reason: collision with root package name */
    public final int f164b;

    /* renamed from: c  reason: collision with root package name */
    public final int f165c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f166d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f167e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f168f;

    /* renamed from: g  reason: collision with root package name */
    public char f169g;
    public int h = 4096;
    public char i;
    public int j = 4096;
    public Drawable k;
    public Context l;
    public CharSequence m;
    public CharSequence n;
    public ColorStateList o = null;
    public PorterDuff.Mode p = null;
    public boolean q = false;
    public boolean r = false;
    public int s = 16;

    @Override // a.h.g.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        e();
        throw null;
    }

    @Override // a.h.g.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        d();
        throw null;
    }

    @Override // a.h.g.a.b
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        f(i2);
        return this;
    }

    public a(Context context, int group, int id, int ordering, CharSequence title) {
        this.l = context;
        this.f163a = id;
        this.f164b = group;
        this.f165c = ordering;
        this.f166d = title;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // a.h.g.a.b
    public int getAlphabeticModifiers() {
        return this.j;
    }

    public int getGroupId() {
        return this.f164b;
    }

    public Drawable getIcon() {
        return this.k;
    }

    public Intent getIntent() {
        return this.f168f;
    }

    public int getItemId() {
        return this.f163a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f169g;
    }

    @Override // a.h.g.a.b
    public int getNumericModifiers() {
        return this.h;
    }

    public int getOrder() {
        return this.f165c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f166d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f167e;
        return charSequence != null ? charSequence : this.f166d;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // a.h.g.a.b
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.i = Character.toLowerCase(alphaChar);
        this.j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    public MenuItem setCheckable(boolean checkable) {
        this.s = (this.s & -2) | (checkable ? 1 : 0);
        return this;
    }

    public MenuItem setChecked(boolean checked) {
        this.s = (this.s & -3) | (checked ? 2 : 0);
        return this;
    }

    public MenuItem setEnabled(boolean enabled) {
        this.s = (this.s & -17) | (enabled ? 16 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.k = icon;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.k = a.h.e.a.c(this.l, iconRes);
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f168f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f169g = numericChar;
        return this;
    }

    @Override // a.h.g.a.b
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f169g = numericChar;
        this.h = KeyEvent.normalizeMetaState(numericModifiers);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f169g = numericChar;
        this.i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // a.h.g.a.b
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f169g = numericChar;
        this.h = KeyEvent.normalizeMetaState(numericModifiers);
        this.i = Character.toLowerCase(alphaChar);
        this.j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f166d = title;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        this.f166d = this.l.getResources().getString(title);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f167e = title;
        return this;
    }

    public MenuItem setVisible(boolean visible) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (visible) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }

    @Override // a.h.g.a.b
    public void setShowAsAction(int show) {
    }

    public b d() {
        throw new UnsupportedOperationException();
    }

    @Override // a.h.g.a.b
    public View getActionView() {
        return null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public b e() {
        throw new UnsupportedOperationException();
    }

    @Override // a.h.g.a.b
    public a.h.m.b b() {
        return null;
    }

    @Override // a.h.g.a.b
    public b a(a.h.m.b actionProvider) {
        throw new UnsupportedOperationException();
    }

    public b f(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // a.h.g.a.b
    public boolean expandActionView() {
        return false;
    }

    @Override // a.h.g.a.b
    public boolean collapseActionView() {
        return false;
    }

    @Override // a.h.g.a.b
    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        throw new UnsupportedOperationException();
    }

    @Override // a.h.g.a.b
    public b setContentDescription(CharSequence contentDescription) {
        this.m = contentDescription;
        return this;
    }

    @Override // a.h.g.a.b
    public CharSequence getContentDescription() {
        return this.m;
    }

    @Override // a.h.g.a.b
    public b setTooltipText(CharSequence tooltipText) {
        this.n = tooltipText;
        return this;
    }

    @Override // a.h.g.a.b
    public CharSequence getTooltipText() {
        return this.n;
    }

    @Override // a.h.g.a.b
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.o = iconTintList;
        this.q = true;
        c();
        return this;
    }

    @Override // a.h.g.a.b
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // a.h.g.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.p = iconTintMode;
        this.r = true;
        c();
        return this;
    }

    @Override // a.h.g.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    public final void c() {
        if (this.k == null) {
            return;
        }
        if (this.q || this.r) {
            Drawable q2 = a.h.f.l.a.q(this.k);
            this.k = q2;
            Drawable mutate = q2.mutate();
            this.k = mutate;
            if (this.q) {
                a.h.f.l.a.o(mutate, this.o);
            }
            if (this.r) {
                a.h.f.l.a.p(this.k, this.p);
            }
        }
    }
}
