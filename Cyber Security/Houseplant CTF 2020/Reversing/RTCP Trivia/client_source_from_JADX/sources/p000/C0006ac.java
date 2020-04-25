package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ac */
public final class C0006ac implements C0354ft {

    /* renamed from: a */
    private final int f10a;

    /* renamed from: b */
    private final int f11b;

    /* renamed from: c */
    private final int f12c;

    /* renamed from: d */
    private final int f13d;

    /* renamed from: e */
    private CharSequence f14e;

    /* renamed from: f */
    private CharSequence f15f;

    /* renamed from: g */
    private Intent f16g;

    /* renamed from: h */
    private char f17h;

    /* renamed from: i */
    private int f18i = 4096;

    /* renamed from: j */
    private char f19j;

    /* renamed from: k */
    private int f20k = 4096;

    /* renamed from: l */
    private Drawable f21l;

    /* renamed from: m */
    private int f22m = 0;

    /* renamed from: n */
    private Context f23n;

    /* renamed from: o */
    private OnMenuItemClickListener f24o;

    /* renamed from: p */
    private CharSequence f25p;

    /* renamed from: q */
    private CharSequence f26q;

    /* renamed from: r */
    private ColorStateList f27r = null;

    /* renamed from: s */
    private Mode f28s = null;

    /* renamed from: t */
    private boolean f29t = false;

    /* renamed from: u */
    private boolean f30u = false;

    /* renamed from: v */
    private int f31v = 16;

    public C0006ac(Context context, CharSequence charSequence) {
        this.f23n = context;
        this.f10a = 16908332;
        this.f11b = 0;
        this.f12c = 0;
        this.f13d = 0;
        this.f14e = charSequence;
    }

    /* renamed from: b */
    private void m8b() {
        if (this.f21l == null) {
            return;
        }
        if (this.f29t || this.f30u) {
            this.f21l = C0345fn.m1156d(this.f21l);
            this.f21l = this.f21l.mutate();
            if (this.f29t) {
                C0345fn.m1147a(this.f21l, this.f27r);
            }
            if (this.f30u) {
                C0345fn.m1150a(this.f21l, this.f28s);
            }
        }
    }

    /* renamed from: a */
    public final C0354ft mo34a(C0381ge geVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final C0354ft mo35a(CharSequence charSequence) {
        this.f25p = charSequence;
        return this;
    }

    /* renamed from: a */
    public final C0381ge mo36a() {
        return null;
    }

    /* renamed from: b */
    public final C0354ft mo37b(CharSequence charSequence) {
        this.f26q = charSequence;
        return this;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f20k;
    }

    public final char getAlphabeticShortcut() {
        return this.f19j;
    }

    public final CharSequence getContentDescription() {
        return this.f25p;
    }

    public final int getGroupId() {
        return this.f11b;
    }

    public final Drawable getIcon() {
        return this.f21l;
    }

    public final ColorStateList getIconTintList() {
        return this.f27r;
    }

    public final Mode getIconTintMode() {
        return this.f28s;
    }

    public final Intent getIntent() {
        return this.f16g;
    }

    public final int getItemId() {
        return this.f10a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f18i;
    }

    public final char getNumericShortcut() {
        return this.f17h;
    }

    public final int getOrder() {
        return this.f13d;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f14e;
    }

    public final CharSequence getTitleCondensed() {
        return this.f15f != null ? this.f15f : this.f14e;
    }

    public final CharSequence getTooltipText() {
        return this.f26q;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f31v & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f31v & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f31v & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f31v & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f19j = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f19j = Character.toLowerCase(c);
        this.f20k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f31v = z | (this.f31v & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f31v = (z ? 2 : 0) | (this.f31v & -3);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f25p = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f31v = (z ? 16 : 0) | (this.f31v & -17);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f22m = i;
        this.f21l = C0313ev.m1047a(this.f23n, i);
        m8b();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f21l = drawable;
        this.f22m = 0;
        m8b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f27r = colorStateList;
        this.f29t = true;
        m8b();
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f28s = mode;
        this.f30u = true;
        m8b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f16g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f17h = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f17h = c;
        this.f18i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f24o = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f17h = c;
        this.f19j = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f17h = c;
        this.f18i = KeyEvent.normalizeMetaState(i);
        this.f19j = Character.toLowerCase(c2);
        this.f20k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f14e = this.f23n.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14e = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f15f = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f26q = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f31v & 8;
        if (z) {
            i = 0;
        }
        this.f31v = i2 | i;
        return this;
    }
}
