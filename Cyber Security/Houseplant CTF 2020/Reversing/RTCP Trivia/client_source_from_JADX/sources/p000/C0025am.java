package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: am */
public class C0025am extends C0008ae<C0354ft> implements MenuItem {

    /* renamed from: e */
    public Method f163e;

    /* renamed from: am$a */
    class C0026a extends C0381ge {

        /* renamed from: a */
        final ActionProvider f164a;

        public C0026a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f164a = actionProvider;
        }

        /* renamed from: a */
        public final View mo307a() {
            return this.f164a.onCreateActionView();
        }

        /* renamed from: a */
        public final void mo308a(SubMenu subMenu) {
            this.f164a.onPrepareSubMenu(C0025am.this.mo106a(subMenu));
        }

        /* renamed from: b */
        public final boolean mo309b() {
            return this.f164a.onPerformDefaultAction();
        }

        /* renamed from: c */
        public final boolean mo310c() {
            return this.f164a.hasSubMenu();
        }
    }

    /* renamed from: am$b */
    static class C0027b extends FrameLayout implements C0804v {

        /* renamed from: a */
        final CollapsibleActionView f166a;

        C0027b(View view) {
            super(view.getContext());
            this.f166a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public final void mo311a() {
            this.f166a.onActionViewExpanded();
        }

        /* renamed from: b */
        public final void mo312b() {
            this.f166a.onActionViewCollapsed();
        }
    }

    /* renamed from: am$c */
    class C0028c extends C0009af<OnActionExpandListener> implements OnActionExpandListener {
        C0028c(OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f45d).onMenuItemActionCollapse(C0025am.this.mo105a(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f45d).onMenuItemActionExpand(C0025am.this.mo105a(menuItem));
        }
    }

    /* renamed from: am$d */
    class C0029d extends C0009af<OnMenuItemClickListener> implements OnMenuItemClickListener {
        C0029d(OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.f45d).onMenuItemClick(C0025am.this.mo105a(menuItem));
        }
    }

    C0025am(Context context, C0354ft ftVar) {
        super(context, ftVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0026a mo252a(ActionProvider actionProvider) {
        return new C0026a(this.f42a, actionProvider);
    }

    public boolean collapseActionView() {
        return ((C0354ft) this.f45d).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0354ft) this.f45d).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0381ge a = ((C0354ft) this.f45d).mo36a();
        if (a instanceof C0026a) {
            return ((C0026a) a).f164a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C0354ft) this.f45d).getActionView();
        return actionView instanceof C0027b ? (View) ((C0027b) actionView).f166a : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0354ft) this.f45d).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0354ft) this.f45d).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0354ft) this.f45d).getContentDescription();
    }

    public int getGroupId() {
        return ((C0354ft) this.f45d).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0354ft) this.f45d).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0354ft) this.f45d).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0354ft) this.f45d).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0354ft) this.f45d).getIntent();
    }

    public int getItemId() {
        return ((C0354ft) this.f45d).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0354ft) this.f45d).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0354ft) this.f45d).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0354ft) this.f45d).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0354ft) this.f45d).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo106a(((C0354ft) this.f45d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0354ft) this.f45d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0354ft) this.f45d).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0354ft) this.f45d).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0354ft) this.f45d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0354ft) this.f45d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0354ft) this.f45d).isCheckable();
    }

    public boolean isChecked() {
        return ((C0354ft) this.f45d).isChecked();
    }

    public boolean isEnabled() {
        return ((C0354ft) this.f45d).isEnabled();
    }

    public boolean isVisible() {
        return ((C0354ft) this.f45d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0354ft) this.f45d).mo34a((C0381ge) actionProvider != null ? mo252a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0354ft) this.f45d).setActionView(i);
        View actionView = ((C0354ft) this.f45d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0354ft) this.f45d).setActionView((View) new C0027b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0027b(view);
        }
        ((C0354ft) this.f45d).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0354ft) this.f45d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0354ft) this.f45d).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0354ft) this.f45d).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0354ft) this.f45d).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0354ft) this.f45d).mo35a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0354ft) this.f45d).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0354ft) this.f45d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0354ft) this.f45d).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0354ft) this.f45d).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0354ft) this.f45d).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0354ft) this.f45d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0354ft) this.f45d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0354ft) this.f45d).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0354ft) this.f45d).setOnActionExpandListener(onActionExpandListener != null ? new C0028c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0354ft) this.f45d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0029d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0354ft) this.f45d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0354ft) this.f45d).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0354ft) this.f45d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0354ft) this.f45d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0354ft) this.f45d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0354ft) this.f45d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0354ft) this.f45d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0354ft) this.f45d).mo37b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0354ft) this.f45d).setVisible(z);
    }
}
