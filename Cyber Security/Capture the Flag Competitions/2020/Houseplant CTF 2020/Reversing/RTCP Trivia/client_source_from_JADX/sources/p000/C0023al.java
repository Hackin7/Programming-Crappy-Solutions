package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

/* renamed from: al */
public final class C0023al implements C0354ft {

    /* renamed from: A */
    private boolean f131A = false;

    /* renamed from: B */
    private int f132B = 16;

    /* renamed from: C */
    private View f133C;

    /* renamed from: D */
    private OnActionExpandListener f134D;

    /* renamed from: E */
    private boolean f135E = false;

    /* renamed from: a */
    final int f136a;

    /* renamed from: b */
    public int f137b = 4096;

    /* renamed from: c */
    public int f138c = 4096;

    /* renamed from: d */
    public C0019aj f139d;

    /* renamed from: e */
    public int f140e = 0;

    /* renamed from: f */
    public C0381ge f141f;

    /* renamed from: g */
    ContextMenuInfo f142g;

    /* renamed from: h */
    private final int f143h;

    /* renamed from: i */
    private final int f144i;

    /* renamed from: j */
    private final int f145j;

    /* renamed from: k */
    private CharSequence f146k;

    /* renamed from: l */
    private CharSequence f147l;

    /* renamed from: m */
    private Intent f148m;

    /* renamed from: n */
    private char f149n;

    /* renamed from: o */
    private char f150o;

    /* renamed from: p */
    private Drawable f151p;

    /* renamed from: q */
    private int f152q = 0;

    /* renamed from: r */
    private C0111aw f153r;

    /* renamed from: s */
    private Runnable f154s;

    /* renamed from: t */
    private OnMenuItemClickListener f155t;

    /* renamed from: u */
    private CharSequence f156u;

    /* renamed from: v */
    private CharSequence f157v;

    /* renamed from: w */
    private ColorStateList f158w = null;

    /* renamed from: x */
    private Mode f159x = null;

    /* renamed from: y */
    private boolean f160y = false;

    /* renamed from: z */
    private boolean f161z = false;

    C0023al(C0019aj ajVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f139d = ajVar;
        this.f143h = i2;
        this.f144i = i;
        this.f145j = i3;
        this.f136a = i4;
        this.f146k = charSequence;
        this.f140e = i5;
    }

    /* renamed from: a */
    private Drawable m98a(Drawable drawable) {
        if (drawable != null && this.f131A && (this.f160y || this.f161z)) {
            drawable = C0345fn.m1156d(drawable).mutate();
            if (this.f160y) {
                C0345fn.m1147a(drawable, this.f158w);
            }
            if (this.f161z) {
                C0345fn.m1150a(drawable, this.f159x);
            }
            this.f131A = false;
        }
        return drawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0354ft setActionView(View view) {
        this.f133C = view;
        this.f141f = null;
        if (view != null && view.getId() == -1 && this.f143h > 0) {
            view.setId(this.f143h);
        }
        this.f139d.mo176h();
        return this;
    }

    /* renamed from: a */
    public static void m100a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private void m101e(boolean z) {
        int i = this.f132B;
        this.f132B = (z ? 2 : 0) | (this.f132B & -3);
        if (i != this.f132B) {
            this.f139d.mo163b(false);
        }
    }

    /* renamed from: a */
    public final C0354ft mo34a(C0381ge geVar) {
        if (this.f141f != null) {
            C0381ge geVar2 = this.f141f;
            geVar2.f1720f = null;
            geVar2.f1719e = null;
        }
        this.f133C = null;
        this.f141f = geVar;
        this.f139d.mo163b(true);
        if (this.f141f != null) {
            this.f141f.mo317a((C0383b) new C0383b() {
                /* renamed from: a */
                public final void mo251a() {
                    C0023al.this.f139d.mo174g();
                }
            });
        }
        return this;
    }

    /* renamed from: a */
    public final C0354ft setContentDescription(CharSequence charSequence) {
        this.f156u = charSequence;
        this.f139d.mo163b(false);
        return this;
    }

    /* renamed from: a */
    public final C0381ge mo36a() {
        return this.f141f;
    }

    /* renamed from: a */
    public final CharSequence mo201a(C0104a aVar) {
        return (aVar == null || !aVar.mo341a()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public final void mo202a(C0111aw awVar) {
        this.f153r = awVar;
        awVar.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public final void mo203a(boolean z) {
        this.f132B = (z ? 4 : 0) | (this.f132B & -5);
    }

    /* renamed from: b */
    public final C0354ft setTooltipText(CharSequence charSequence) {
        this.f157v = charSequence;
        this.f139d.mo163b(false);
        return this;
    }

    /* renamed from: b */
    public final boolean mo204b() {
        if ((this.f155t != null && this.f155t.onMenuItemClick(this)) || this.f139d.mo149a(this.f139d, (MenuItem) this)) {
            return true;
        }
        if (this.f154s != null) {
            this.f154s.run();
            return true;
        }
        if (this.f148m != null) {
            try {
                this.f139d.f102a.startActivity(this.f148m);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f141f != null && this.f141f.mo309b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo205b(boolean z) {
        int i = this.f132B;
        this.f132B = (z ? 0 : 8) | (this.f132B & -9);
        return i != this.f132B;
    }

    /* renamed from: c */
    public final char mo206c() {
        return this.f139d.mo166c() ? this.f150o : this.f149n;
    }

    /* renamed from: c */
    public final void mo207c(boolean z) {
        this.f132B = z ? this.f132B | 32 : this.f132B & -33;
    }

    public final boolean collapseActionView() {
        if ((this.f140e & 8) == 0) {
            return false;
        }
        if (this.f133C == null) {
            return true;
        }
        if (this.f134D == null || this.f134D.onMenuItemActionCollapse(this)) {
            return this.f139d.mo165b(this);
        }
        return false;
    }

    /* renamed from: d */
    public final void mo208d(boolean z) {
        this.f135E = z;
        this.f139d.mo163b(false);
    }

    /* renamed from: d */
    public final boolean mo209d() {
        return this.f139d.mo170d() && mo206c() != 0;
    }

    /* renamed from: e */
    public final boolean mo210e() {
        return (this.f132B & 4) != 0;
    }

    public final boolean expandActionView() {
        if (!mo227i()) {
            return false;
        }
        if (this.f134D == null || this.f134D.onMenuItemActionExpand(this)) {
            return this.f139d.mo150a(this);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo211f() {
        return (this.f132B & 32) == 32;
    }

    /* renamed from: g */
    public final boolean mo212g() {
        return (this.f140e & 1) == 1;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        if (this.f133C != null) {
            return this.f133C;
        }
        if (this.f141f == null) {
            return null;
        }
        this.f133C = this.f141f.mo316a((MenuItem) this);
        return this.f133C;
    }

    public final int getAlphabeticModifiers() {
        return this.f138c;
    }

    public final char getAlphabeticShortcut() {
        return this.f150o;
    }

    public final CharSequence getContentDescription() {
        return this.f156u;
    }

    public final int getGroupId() {
        return this.f144i;
    }

    public final Drawable getIcon() {
        Drawable b;
        if (this.f151p != null) {
            b = this.f151p;
        } else if (this.f152q == 0) {
            return null;
        } else {
            b = C0785o.m2608b(this.f139d.f102a, this.f152q);
            this.f152q = 0;
            this.f151p = b;
        }
        return m98a(b);
    }

    public final ColorStateList getIconTintList() {
        return this.f158w;
    }

    public final Mode getIconTintMode() {
        return this.f159x;
    }

    public final Intent getIntent() {
        return this.f148m;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f143h;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.f142g;
    }

    public final int getNumericModifiers() {
        return this.f137b;
    }

    public final char getNumericShortcut() {
        return this.f149n;
    }

    public final int getOrder() {
        return this.f145j;
    }

    public final SubMenu getSubMenu() {
        return this.f153r;
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f146k;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f147l != null ? this.f147l : this.f146k;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public final CharSequence getTooltipText() {
        return this.f157v;
    }

    /* renamed from: h */
    public final boolean mo225h() {
        return (this.f140e & 2) == 2;
    }

    public final boolean hasSubMenu() {
        return this.f153r != null;
    }

    /* renamed from: i */
    public final boolean mo227i() {
        if ((this.f140e & 8) != 0) {
            if (this.f133C == null && this.f141f != null) {
                this.f133C = this.f141f.mo316a((MenuItem) this);
            }
            if (this.f133C != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f135E;
    }

    public final boolean isCheckable() {
        return (this.f132B & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f132B & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f132B & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f141f == null || !this.f141f.mo318d()) ? (this.f132B & 8) == 0 : (this.f132B & 8) == 0 && this.f141f.mo319e();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f139d.f102a;
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f150o == c) {
            return this;
        }
        this.f150o = Character.toLowerCase(c);
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f150o == c && this.f138c == i) {
            return this;
        }
        this.f150o = Character.toLowerCase(c);
        this.f138c = KeyEvent.normalizeMetaState(i);
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f132B;
        this.f132B = z | (this.f132B & true) ? 1 : 0;
        if (i != this.f132B) {
            this.f139d.mo163b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f132B & 4) != 0) {
            C0019aj ajVar = this.f139d;
            int groupId = getGroupId();
            int size = ajVar.f104c.size();
            ajVar.mo171e();
            for (int i = 0; i < size; i++) {
                C0023al alVar = (C0023al) ajVar.f104c.get(i);
                if (alVar.getGroupId() == groupId && alVar.mo210e() && alVar.isCheckable()) {
                    alVar.m101e(alVar == this);
                }
            }
            ajVar.mo172f();
            return this;
        }
        m101e(z);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f132B = z ? this.f132B | 16 : this.f132B & -17;
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f151p = null;
        this.f152q = i;
        this.f131A = true;
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f152q = 0;
        this.f151p = drawable;
        this.f131A = true;
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f158w = colorStateList;
        this.f160y = true;
        this.f131A = true;
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f159x = mode;
        this.f161z = true;
        this.f131A = true;
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f148m = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f149n == c) {
            return this;
        }
        this.f149n = c;
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f149n == c && this.f137b == i) {
            return this;
        }
        this.f149n = c;
        this.f137b = KeyEvent.normalizeMetaState(i);
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f134D = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f155t = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f149n = c;
        this.f150o = Character.toLowerCase(c2);
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f149n = c;
        this.f137b = KeyEvent.normalizeMetaState(i);
        this.f150o = Character.toLowerCase(c2);
        this.f138c = KeyEvent.normalizeMetaState(i2);
        this.f139d.mo163b(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f140e = i;
                this.f139d.mo176h();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f139d.f102a.getString(i));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f146k = charSequence;
        this.f139d.mo163b(false);
        if (this.f153r != null) {
            this.f153r.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f147l = charSequence;
        this.f139d.mo163b(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo205b(z)) {
            this.f139d.mo174g();
        }
        return this;
    }

    public final String toString() {
        if (this.f146k != null) {
            return this.f146k.toString();
        }
        return null;
    }
}
