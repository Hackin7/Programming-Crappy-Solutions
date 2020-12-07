package a.b.o.j;

import a.b.o.j.i;
import a.h.m.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final a.h.g.a.b f226d;

    /* renamed from: e  reason: collision with root package name */
    public Method f227e;

    public j(Context context, a.h.g.a.b object) {
        super(context);
        if (object != null) {
            this.f226d = object;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public int getItemId() {
        return this.f226d.getItemId();
    }

    public int getGroupId() {
        return this.f226d.getGroupId();
    }

    public int getOrder() {
        return this.f226d.getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f226d.setTitle(title);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        this.f226d.setTitle(title);
        return this;
    }

    public CharSequence getTitle() {
        return this.f226d.getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f226d.setTitleCondensed(title);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return this.f226d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f226d.setIcon(icon);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.f226d.setIcon(iconRes);
        return this;
    }

    public Drawable getIcon() {
        return this.f226d.getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        this.f226d.setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return this.f226d.getIntent();
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f226d.setShortcut(numericChar, alphaChar);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f226d.setShortcut(numericChar, alphaChar, numericModifiers, alphaModifiers);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f226d.setNumericShortcut(numericChar);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f226d.setNumericShortcut(numericChar, numericModifiers);
        return this;
    }

    public char getNumericShortcut() {
        return this.f226d.getNumericShortcut();
    }

    public int getNumericModifiers() {
        return this.f226d.getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f226d.setAlphabeticShortcut(alphaChar);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f226d.setAlphabeticShortcut(alphaChar, alphaModifiers);
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f226d.getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return this.f226d.getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean checkable) {
        this.f226d.setCheckable(checkable);
        return this;
    }

    public boolean isCheckable() {
        return this.f226d.isCheckable();
    }

    public MenuItem setChecked(boolean checked) {
        this.f226d.setChecked(checked);
        return this;
    }

    public boolean isChecked() {
        return this.f226d.isChecked();
    }

    public MenuItem setVisible(boolean visible) {
        return this.f226d.setVisible(visible);
    }

    public boolean isVisible() {
        return this.f226d.isVisible();
    }

    public MenuItem setEnabled(boolean enabled) {
        this.f226d.setEnabled(enabled);
        return this;
    }

    public boolean isEnabled() {
        return this.f226d.isEnabled();
    }

    public boolean hasSubMenu() {
        return this.f226d.hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return d(this.f226d.getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        this.f226d.setOnMenuItemClickListener(menuItemClickListener != null ? new e(menuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f226d.getMenuInfo();
    }

    public void setShowAsAction(int actionEnum) {
        this.f226d.setShowAsAction(actionEnum);
    }

    public MenuItem setShowAsActionFlags(int actionEnum) {
        this.f226d.setShowAsActionFlags(actionEnum);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f226d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int resId) {
        this.f226d.setActionView(resId);
        View actionView = this.f226d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f226d.setActionView(new c(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = this.f226d.getActionView();
        if (actionView instanceof c) {
            return ((c) actionView).a();
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider provider) {
        this.f226d.a(provider != null ? new b(this, this.f176a, provider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        a.h.m.b provider = this.f226d.b();
        if (provider instanceof a) {
            return ((a) provider).f228b;
        }
        return null;
    }

    public boolean expandActionView() {
        return this.f226d.expandActionView();
    }

    public boolean collapseActionView() {
        return this.f226d.collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return this.f226d.isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.f226d.setOnActionExpandListener(listener != null ? new d(listener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence contentDescription) {
        this.f226d.setContentDescription(contentDescription);
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f226d.getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence tooltipText) {
        this.f226d.setTooltipText(tooltipText);
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f226d.getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList tint) {
        this.f226d.setIconTintList(tint);
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f226d.getIconTintList();
    }

    public MenuItem setIconTintMode(PorterDuff.Mode tintMode) {
        this.f226d.setIconTintMode(tintMode);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f226d.getIconTintMode();
    }

    public void h(boolean checkable) {
        try {
            if (this.f227e == null) {
                this.f227e = this.f226d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f227e.invoke(this.f226d, Boolean.valueOf(checkable));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f234a;

        public e(MenuItem.OnMenuItemClickListener object) {
            this.f234a = object;
        }

        public boolean onMenuItemClick(MenuItem item) {
            return this.f234a.onMenuItemClick(j.this.c(item));
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f232a;

        public d(MenuItem.OnActionExpandListener object) {
            this.f232a = object;
        }

        public boolean onMenuItemActionExpand(MenuItem item) {
            return this.f232a.onMenuItemActionExpand(j.this.c(item));
        }

        public boolean onMenuItemActionCollapse(MenuItem item) {
            return this.f232a.onMenuItemActionCollapse(j.this.c(item));
        }
    }

    public class a extends a.h.m.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f228b;

        public a(Context context, ActionProvider inner) {
            super(context);
            this.f228b = inner;
        }

        @Override // a.h.m.b
        public View c() {
            return this.f228b.onCreateActionView();
        }

        @Override // a.h.m.b
        public boolean e() {
            return this.f228b.onPerformDefaultAction();
        }

        @Override // a.h.m.b
        public boolean a() {
            return this.f228b.hasSubMenu();
        }

        @Override // a.h.m.b
        public void f(SubMenu subMenu) {
            this.f228b.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.AbstractC0024b f230d;

        public b(j jVar, Context context, ActionProvider inner) {
            super(context, inner);
        }

        @Override // a.h.m.b
        public View d(MenuItem forItem) {
            return this.f228b.onCreateActionView(forItem);
        }

        @Override // a.h.m.b
        public boolean g() {
            return this.f228b.overridesItemVisibility();
        }

        @Override // a.h.m.b
        public boolean b() {
            return this.f228b.isVisible();
        }

        @Override // a.h.m.b
        public void j(b.AbstractC0024b listener) {
            this.f230d = listener;
            this.f228b.setVisibilityListener(listener != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean isVisible) {
            b.AbstractC0024b bVar = this.f230d;
            if (bVar != null) {
                ((i.a) bVar).a(isVisible);
            }
        }
    }

    public static class c extends FrameLayout implements a.b.o.c {

        /* renamed from: b  reason: collision with root package name */
        public final CollapsibleActionView f231b;

        public c(View actionView) {
            super(actionView.getContext());
            this.f231b = (CollapsibleActionView) actionView;
            addView(actionView);
        }

        @Override // a.b.o.c
        public void c() {
            this.f231b.onActionViewExpanded();
        }

        @Override // a.b.o.c
        public void f() {
            this.f231b.onActionViewCollapsed();
        }

        public View a() {
            return (View) this.f231b;
        }
    }
}
