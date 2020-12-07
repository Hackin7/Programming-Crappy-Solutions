package a.b.p;

import a.b.g;
import a.b.o.j.i;
import a.b.o.j.l;
import a.b.o.j.m;
import a.b.o.j.n;
import a.b.o.j.p;
import a.b.o.j.r;
import a.h.m.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

public class c extends a.b.o.j.b implements b.a {
    public d j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public final SparseBooleanArray t = new SparseBooleanArray();
    public e u;
    public a v;
    public RunnableC0007c w;
    public b x;
    public final f y = new f();
    public int z;

    public c(Context context) {
        super(context, g.abc_action_menu_layout, g.abc_action_menu_item_layout);
    }

    @Override // a.b.o.j.m, a.b.o.j.b
    public void d(Context context, a.b.o.j.g menu) {
        super.d(context, menu);
        Resources res = context.getResources();
        a.b.o.a abp = a.b.o.a.b(context);
        if (!this.n) {
            abp.h();
            this.m = true;
        }
        this.o = abp.c();
        this.q = abp.d();
        int width = this.o;
        if (this.m) {
            if (this.j == null) {
                d dVar = new d(this.f170b);
                this.j = dVar;
                if (this.l) {
                    dVar.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(spec, spec);
            }
            width -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = width;
        this.s = (int) (res.getDisplayMetrics().density * 56.0f);
    }

    public void F() {
        this.q = a.b.o.a.b(this.f171c).d();
        a.b.o.j.g gVar = this.f172d;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void J(boolean reserveOverflow) {
        this.m = reserveOverflow;
        this.n = true;
    }

    public void G(boolean isExclusive) {
        this.r = isExclusive;
    }

    public void I(Drawable icon) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.setImageDrawable(icon);
            return;
        }
        this.l = true;
        this.k = icon;
    }

    public Drawable A() {
        d dVar = this.j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.l) {
            return this.k;
        }
        return null;
    }

    @Override // a.b.o.j.b
    public n o(ViewGroup root) {
        n oldMenuView = this.i;
        n result = super.o(root);
        if (oldMenuView != result) {
            ((ActionMenuView) result).setPresenter(this);
        }
        return result;
    }

    @Override // a.b.o.j.b
    public View n(i item, View convertView, ViewGroup parent) {
        View actionView = item.getActionView();
        if (actionView == null || item.j()) {
            actionView = super.n(item, convertView, parent);
        }
        actionView.setVisibility(item.isActionViewExpanded() ? 8 : 0);
        ActionMenuView menuParent = (ActionMenuView) parent;
        ViewGroup.LayoutParams lp = actionView.getLayoutParams();
        if (!menuParent.checkLayoutParams(lp)) {
            actionView.setLayoutParams(menuParent.o(lp));
        }
        return actionView;
    }

    @Override // a.b.o.j.b
    public void f(i item, n.a itemView) {
        itemView.e(item, 0);
        ActionMenuItemView actionItemView = (ActionMenuItemView) itemView;
        actionItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.x == null) {
            this.x = new b();
        }
        actionItemView.setPopupCallback(this.x);
    }

    @Override // a.b.o.j.b
    public boolean q(int childIndex, i item) {
        return item.l();
    }

    @Override // a.b.o.j.m, a.b.o.j.b
    public void j(boolean cleared) {
        n nVar;
        super.j(cleared);
        ((View) this.i).requestLayout();
        a.b.o.j.g gVar = this.f172d;
        if (gVar != null) {
            ArrayList<MenuItemImpl> actionItems = gVar.s();
            int count = actionItems.size();
            for (int i = 0; i < count; i++) {
                a.h.m.b provider = ((i) actionItems.get(i)).b();
                if (provider != null) {
                    provider.i(this);
                }
            }
        }
        a.b.o.j.g gVar2 = this.f172d;
        ArrayList<MenuItemImpl> nonActionItems = gVar2 != null ? gVar2.z() : null;
        boolean hasOverflow = false;
        if (this.m && nonActionItems != null) {
            int count2 = nonActionItems.size();
            boolean z2 = false;
            if (count2 == 1) {
                hasOverflow = !((i) nonActionItems.get(0)).isActionViewExpanded();
            } else {
                if (count2 > 0) {
                    z2 = true;
                }
                hasOverflow = z2;
            }
        }
        if (hasOverflow) {
            if (this.j == null) {
                this.j = new d(this.f170b);
            }
            ViewGroup parent = (ViewGroup) this.j.getParent();
            if (parent != this.i) {
                if (parent != null) {
                    parent.removeView(this.j);
                }
                ActionMenuView menuView = (ActionMenuView) this.i;
                menuView.addView(this.j, menuView.F());
            }
        } else {
            d dVar = this.j;
            if (dVar != null && dVar.getParent() == (nVar = this.i)) {
                ((ViewGroup) nVar).removeView(this.j);
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.m);
    }

    @Override // a.b.o.j.b
    public boolean l(ViewGroup parent, int childIndex) {
        if (parent.getChildAt(childIndex) == this.j) {
            return false;
        }
        super.l(parent, childIndex);
        return true;
    }

    @Override // a.b.o.j.m, a.b.o.j.b
    public boolean i(r subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        r topSubMenu = subMenu;
        while (topSubMenu.e0() != this.f172d) {
            topSubMenu = (r) topSubMenu.e0();
        }
        View anchor = z(topSubMenu.getItem());
        if (anchor == null) {
            return false;
        }
        ((i) subMenu.getItem()).getItemId();
        boolean preserveIconSpacing = false;
        int count = subMenu.size();
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            MenuItem childItem = subMenu.getItem(i);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                preserveIconSpacing = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.f171c, subMenu, anchor);
        this.v = aVar;
        aVar.g(preserveIconSpacing);
        this.v.k();
        super.i(subMenu);
        return true;
    }

    public final View z(MenuItem item) {
        ViewGroup parent = (ViewGroup) this.i;
        if (parent == null) {
            return null;
        }
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = parent.getChildAt(i);
            if ((child instanceof n.a) && ((n.a) child).getItemData() == item) {
                return child;
            }
        }
        return null;
    }

    public boolean K() {
        a.b.o.j.g gVar;
        if (!this.m || E() || (gVar = this.f172d) == null || this.i == null || this.w != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0007c cVar = new RunnableC0007c(new e(this.f171c, this.f172d, this.j, true));
        this.w = cVar;
        ((View) this.i).post(cVar);
        return true;
    }

    public boolean B() {
        n nVar;
        RunnableC0007c cVar = this.w;
        if (cVar == null || (nVar = this.i) == null) {
            l popup = this.u;
            if (popup == null) {
                return false;
            }
            popup.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.w = null;
        return true;
    }

    public boolean y() {
        return B() | C();
    }

    public boolean C() {
        a aVar = this.v;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean E() {
        e eVar = this.u;
        return eVar != null && eVar.d();
    }

    public boolean D() {
        return this.w != null || E();
    }

    @Override // a.b.o.j.m
    public boolean c() {
        int itemsSize;
        ArrayList<MenuItemImpl> visibleItems;
        ArrayList<MenuItemImpl> visibleItems2;
        int maxActions;
        boolean isAction;
        int widthLimit;
        int widthLimit2;
        boolean z2;
        c cVar = this;
        a.b.o.j.g gVar = cVar.f172d;
        if (gVar != null) {
            visibleItems = gVar.E();
            itemsSize = visibleItems.size();
        } else {
            visibleItems = null;
            itemsSize = 0;
        }
        int maxActions2 = cVar.q;
        int widthLimit3 = cVar.p;
        int querySpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup parent = (ViewGroup) cVar.i;
        int requiredItems = 0;
        int requestedItems = 0;
        int firstActionWidth = 0;
        boolean hasOverflow = false;
        for (int i = 0; i < itemsSize; i++) {
            i item = (i) visibleItems.get(i);
            if (item.o()) {
                requiredItems++;
            } else if (item.n()) {
                requestedItems++;
            } else {
                hasOverflow = true;
            }
            if (cVar.r && item.isActionViewExpanded()) {
                maxActions2 = 0;
            }
        }
        if (cVar.m && (hasOverflow || requiredItems + requestedItems > maxActions2)) {
            maxActions2--;
        }
        int maxActions3 = maxActions2 - requiredItems;
        SparseBooleanArray seenGroups = cVar.t;
        seenGroups.clear();
        int i2 = 0;
        while (i2 < itemsSize) {
            i item2 = (i) visibleItems.get(i2);
            if (item2.o()) {
                View v2 = cVar.n(item2, null, parent);
                v2.measure(querySpec, querySpec);
                int measuredWidth = v2.getMeasuredWidth();
                int widthLimit4 = widthLimit3 - measuredWidth;
                if (firstActionWidth == 0) {
                    firstActionWidth = measuredWidth;
                }
                int groupId = item2.getGroupId();
                if (groupId != 0) {
                    widthLimit2 = widthLimit4;
                    z2 = true;
                    seenGroups.put(groupId, true);
                } else {
                    widthLimit2 = widthLimit4;
                    z2 = true;
                }
                item2.u(z2);
                widthLimit3 = widthLimit2;
                visibleItems2 = visibleItems;
            } else if (item2.n()) {
                int groupId2 = item2.getGroupId();
                boolean inGroup = seenGroups.get(groupId2);
                boolean isAction2 = (maxActions3 > 0 || inGroup) && widthLimit3 > 0;
                if (isAction2) {
                    maxActions = maxActions3;
                    View v3 = cVar.n(item2, null, parent);
                    v3.measure(querySpec, querySpec);
                    int measuredWidth2 = v3.getMeasuredWidth();
                    widthLimit3 -= measuredWidth2;
                    if (firstActionWidth == 0) {
                        firstActionWidth = measuredWidth2;
                    }
                    isAction = isAction2 & (widthLimit3 + firstActionWidth > 0);
                } else {
                    maxActions = maxActions3;
                    isAction = isAction2;
                }
                if (isAction && groupId2 != 0) {
                    seenGroups.put(groupId2, true);
                    visibleItems2 = visibleItems;
                    widthLimit = widthLimit3;
                } else if (inGroup) {
                    seenGroups.put(groupId2, false);
                    int j2 = 0;
                    while (j2 < i2) {
                        i areYouMyGroupie = (i) visibleItems.get(j2);
                        if (areYouMyGroupie.getGroupId() == groupId2) {
                            if (areYouMyGroupie.l()) {
                                maxActions++;
                            }
                            areYouMyGroupie.u(false);
                        }
                        j2++;
                        widthLimit3 = widthLimit3;
                        visibleItems = visibleItems;
                    }
                    visibleItems2 = visibleItems;
                    widthLimit = widthLimit3;
                } else {
                    visibleItems2 = visibleItems;
                    widthLimit = widthLimit3;
                }
                if (isAction) {
                    maxActions--;
                }
                item2.u(isAction);
                widthLimit3 = widthLimit;
                maxActions3 = maxActions;
            } else {
                visibleItems2 = visibleItems;
                item2.u(false);
            }
            i2++;
            cVar = this;
            itemsSize = itemsSize;
            visibleItems = visibleItems2;
        }
        return true;
    }

    @Override // a.b.o.j.m, a.b.o.j.b
    public void a(a.b.o.j.g menu, boolean allMenusAreClosing) {
        y();
        super.a(menu, allMenusAreClosing);
    }

    public void H(ActionMenuView menuView) {
        this.i = menuView;
        menuView.b(this.f172d);
    }

    public class d extends o implements ActionMenuView.a {
        public d(Context context) {
            super(context, null, a.b.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            z0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public class a extends h0 {
            public a(View src, c cVar) {
                super(src);
            }

            @Override // a.b.p.h0
            public p b() {
                e eVar = c.this.u;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // a.b.p.h0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // a.b.p.h0
            public boolean d() {
                c cVar = c.this;
                if (cVar.w != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        public boolean setFrame(int l, int t, int r, int b2) {
            boolean changed = super.setFrame(l, t, r, b2);
            Drawable d2 = getDrawable();
            Drawable bg = getBackground();
            if (!(d2 == null || bg == null)) {
                int width = getWidth();
                int height = getHeight();
                int halfEdge = Math.max(width, height) / 2;
                int offsetX = getPaddingLeft() - getPaddingRight();
                int centerX = (width + offsetX) / 2;
                int centerY = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.h.f.l.a.l(bg, centerX - halfEdge, centerY - halfEdge, centerX + halfEdge, centerY + halfEdge);
            }
            return changed;
        }
    }

    public class e extends l {
        public e(Context context, a.b.o.j.g menu, View anchorView, boolean overflowOnly) {
            super(context, menu, anchorView, overflowOnly, a.b.a.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.y);
        }

        @Override // a.b.o.j.l
        public void e() {
            if (c.this.f172d != null) {
                c.this.f172d.close();
            }
            c.this.u = null;
            super.e();
        }
    }

    public class a extends l {
        public a(Context context, r subMenu, View anchorView) {
            super(context, subMenu, anchorView, false, a.b.a.actionOverflowMenuStyle);
            if (!((i) subMenu.getItem()).l()) {
                View view = c.this.j;
                f(view == null ? (View) c.this.i : view);
            }
            j(c.this.y);
        }

        @Override // a.b.o.j.l
        public void e() {
            c cVar = c.this;
            cVar.v = null;
            cVar.z = 0;
            super.e();
        }
    }

    public class f implements m.a {
        public f() {
        }

        @Override // a.b.o.j.m.a
        public boolean b(a.b.o.j.g subMenu) {
            if (subMenu == c.this.f172d) {
                return false;
            }
            c.this.z = ((i) ((r) subMenu).getItem()).getItemId();
            m.a cb = c.this.m();
            if (cb != null) {
                return cb.b(subMenu);
            }
            return false;
        }

        @Override // a.b.o.j.m.a
        public void a(a.b.o.j.g menu, boolean allMenusAreClosing) {
            if (menu instanceof r) {
                menu.D().e(false);
            }
            m.a cb = c.this.m();
            if (cb != null) {
                cb.a(menu, allMenusAreClosing);
            }
        }
    }

    /* renamed from: a.b.p.c$c  reason: collision with other inner class name */
    public class RunnableC0007c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public e f288b;

        public RunnableC0007c(e popup) {
            this.f288b = popup;
        }

        public void run() {
            if (c.this.f172d != null) {
                c.this.f172d.d();
            }
            View menuView = (View) c.this.i;
            if (!(menuView == null || menuView.getWindowToken() == null || !this.f288b.m())) {
                c.this.u = this.f288b;
            }
            c.this.w = null;
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p a() {
            a aVar = c.this.v;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }
}
