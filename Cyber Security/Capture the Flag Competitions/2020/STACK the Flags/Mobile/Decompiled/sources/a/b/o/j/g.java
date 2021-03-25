package a.b.o.j;

import a.h.m.t;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements a.h.g.a.a {
    public static final int[] z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f208a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f209b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f210c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f211d;

    /* renamed from: e  reason: collision with root package name */
    public a f212e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<i> f213f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<i> f214g;
    public boolean h;
    public ArrayList<i> i;
    public ArrayList<i> j;
    public boolean k;
    public int l = 0;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<i> u = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<m>> v = new CopyOnWriteArrayList<>();
    public i w;
    public boolean x = false;
    public boolean y;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f208a = context;
        this.f209b = context.getResources();
        this.f213f = new ArrayList<>();
        this.f214g = new ArrayList<>();
        this.h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        b0(true);
    }

    public g S(int defaultShowAsAction) {
        this.l = defaultShowAsAction;
        return this;
    }

    public void b(m presenter) {
        c(presenter, this.f208a);
    }

    public void c(m presenter, Context menuContext) {
        this.v.add(new WeakReference<>(presenter));
        presenter.d(menuContext, this);
        this.k = true;
    }

    public void O(m presenter) {
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            m item = (m) ref.get();
            if (item == null || item == presenter) {
                this.v.remove(ref);
            }
        }
    }

    public final void i(boolean cleared) {
        if (!this.v.isEmpty()) {
            d0();
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                m presenter = (m) ref.get();
                if (presenter == null) {
                    this.v.remove(ref);
                } else {
                    presenter.j(cleared);
                }
            }
            c0();
        }
    }

    public final boolean j(r subMenu, m preferredPresenter) {
        if (this.v.isEmpty()) {
            return false;
        }
        boolean result = false;
        if (preferredPresenter != null) {
            result = preferredPresenter.i(subMenu);
        }
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            m presenter = (m) ref.get();
            if (presenter == null) {
                this.v.remove(ref);
            } else if (!result) {
                result = presenter.i(subMenu);
            }
        }
        return result;
    }

    public void Q(Bundle outStates) {
        SparseArray<Parcelable> viewStates = null;
        int itemCount = size();
        for (int i2 = 0; i2 < itemCount; i2++) {
            MenuItem item = getItem(i2);
            View v2 = item.getActionView();
            if (!(v2 == null || v2.getId() == -1)) {
                if (viewStates == null) {
                    viewStates = new SparseArray<>();
                }
                v2.saveHierarchyState(viewStates);
                if (item.isActionViewExpanded()) {
                    outStates.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(outStates);
            }
        }
        if (viewStates != null) {
            outStates.putSparseParcelableArray(t(), viewStates);
        }
    }

    public void P(Bundle states) {
        MenuItem itemToExpand;
        if (states != null) {
            SparseArray<Parcelable> viewStates = states.getSparseParcelableArray(t());
            int itemCount = size();
            for (int i2 = 0; i2 < itemCount; i2++) {
                MenuItem item = getItem(i2);
                View v2 = item.getActionView();
                if (!(v2 == null || v2.getId() == -1)) {
                    v2.restoreHierarchyState(viewStates);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).P(states);
                }
            }
            int expandedId = states.getInt("android:menu:expandedactionview");
            if (expandedId > 0 && (itemToExpand = findItem(expandedId)) != null) {
                itemToExpand.expandActionView();
            }
        }
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public void R(a cb) {
        this.f212e = cb;
    }

    public MenuItem a(int group, int id, int categoryOrder, CharSequence title) {
        int ordering = B(categoryOrder);
        i item = g(group, id, categoryOrder, ordering, title, this.l);
        ArrayList<i> arrayList = this.f213f;
        arrayList.add(n(arrayList, ordering), item);
        K(true);
        return item;
    }

    public final i g(int group, int id, int categoryOrder, int ordering, CharSequence title, int defaultShowAsAction) {
        return new i(this, group, id, categoryOrder, ordering, title, defaultShowAsAction);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return a(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return a(0, 0, 0, this.f209b.getString(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, CharSequence title) {
        return a(group, id, categoryOrder, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, int title) {
        return a(group, id, categoryOrder, this.f209b.getString(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return addSubMenu(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return addSubMenu(0, 0, 0, this.f209b.getString(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, CharSequence title) {
        i item = (i) a(group, id, categoryOrder, title);
        r subMenu = new r(this.f208a, this, item);
        item.w(subMenu);
        return subMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, int title) {
        return addSubMenu(group, id, categoryOrder, this.f209b.getString(title));
    }

    public void setGroupDividerEnabled(boolean enabled) {
        this.x = enabled;
    }

    public boolean F() {
        return this.x;
    }

    public int addIntentOptions(int group, int id, int categoryOrder, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        int i2;
        PackageManager pm = this.f208a.getPackageManager();
        int N = 0;
        List<ResolveInfo> lri = pm.queryIntentActivityOptions(caller, specifics, intent, 0);
        if (lri != null) {
            N = lri.size();
        }
        if ((flags & 1) == 0) {
            removeGroup(group);
        }
        for (int i3 = 0; i3 < N; i3++) {
            ResolveInfo ri = lri.get(i3);
            int i4 = ri.specificIndex;
            Intent rintent = new Intent(i4 < 0 ? intent : specifics[i4]);
            ActivityInfo activityInfo = ri.activityInfo;
            rintent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            i iVar = (i) add(group, id, categoryOrder, ri.loadLabel(pm));
            iVar.setIcon(ri.loadIcon(pm));
            MenuItem item = iVar.setIntent(rintent);
            if (outSpecificItems != null && (i2 = ri.specificIndex) >= 0) {
                outSpecificItems[i2] = item;
            }
        }
        return N;
    }

    public void removeItem(int id) {
        N(o(id), true);
    }

    public void removeGroup(int group) {
        int i2 = l(group);
        if (i2 >= 0) {
            int maxRemovable = this.f213f.size() - i2;
            int numRemoved = 0;
            while (true) {
                int numRemoved2 = numRemoved + 1;
                if (numRemoved >= maxRemovable || this.f213f.get(i2).getGroupId() != group) {
                    K(true);
                } else {
                    N(i2, false);
                    numRemoved = numRemoved2;
                }
            }
            K(true);
        }
    }

    public final void N(int index, boolean updateChildrenOnMenuViews) {
        if (index >= 0 && index < this.f213f.size()) {
            this.f213f.remove(index);
            if (updateChildrenOnMenuViews) {
                K(true);
            }
        }
    }

    public void clear() {
        i iVar = this.w;
        if (iVar != null) {
            f(iVar);
        }
        this.f213f.clear();
        K(true);
    }

    public void T(MenuItem item) {
        int group = item.getGroupId();
        int N = this.f213f.size();
        d0();
        for (int i2 = 0; i2 < N; i2++) {
            i curItem = this.f213f.get(i2);
            if (curItem.getGroupId() == group && curItem.m() && curItem.isCheckable()) {
                curItem.s(curItem == item);
            }
        }
        c0();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        int N = this.f213f.size();
        for (int i2 = 0; i2 < N; i2++) {
            i item = this.f213f.get(i2);
            if (item.getGroupId() == group) {
                item.t(exclusive);
                item.setCheckable(checkable);
            }
        }
    }

    public void setGroupVisible(int group, boolean visible) {
        int N = this.f213f.size();
        boolean changedAtLeastOneItem = false;
        for (int i2 = 0; i2 < N; i2++) {
            i item = this.f213f.get(i2);
            if (item.getGroupId() == group && item.x(visible)) {
                changedAtLeastOneItem = true;
            }
        }
        if (changedAtLeastOneItem) {
            K(true);
        }
    }

    public void setGroupEnabled(int group, boolean enabled) {
        int N = this.f213f.size();
        for (int i2 = 0; i2 < N; i2++) {
            i item = this.f213f.get(i2);
            if (item.getGroupId() == group) {
                item.setEnabled(enabled);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f213f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int id) {
        MenuItem possibleItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i item = this.f213f.get(i2);
            if (item.getItemId() == id) {
                return item;
            }
            if (item.hasSubMenu() && (possibleItem = ((g) item.getSubMenu()).findItem(id)) != null) {
                return possibleItem;
            }
        }
        return null;
    }

    public int o(int id) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f213f.get(i2).getItemId() == id) {
                return i2;
            }
        }
        return -1;
    }

    public int l(int group) {
        return m(group, 0);
    }

    public int m(int group, int start) {
        int size = size();
        if (start < 0) {
            start = 0;
        }
        for (int i2 = start; i2 < size; i2++) {
            if (this.f213f.get(i2).getGroupId() == group) {
                return i2;
            }
        }
        return -1;
    }

    public int size() {
        return this.f213f.size();
    }

    public MenuItem getItem(int index) {
        return this.f213f.get(index);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return p(keyCode, event) != null;
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f210c = isQwerty;
        K(false);
    }

    public static int B(int categoryOrder) {
        int index = (-65536 & categoryOrder) >> 16;
        if (index >= 0) {
            int[] iArr = z;
            if (index < iArr.length) {
                return (iArr[index] << 16) | (65535 & categoryOrder);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public boolean G() {
        return this.f210c;
    }

    public final void b0(boolean shortcutsVisible) {
        boolean z2 = true;
        if (!shortcutsVisible || this.f209b.getConfiguration().keyboard == 1 || !t.e(ViewConfiguration.get(this.f208a), this.f208a)) {
            z2 = false;
        }
        this.f211d = z2;
    }

    public boolean H() {
        return this.f211d;
    }

    public Resources C() {
        return this.f209b;
    }

    public Context u() {
        return this.f208a;
    }

    public boolean h(g menu, MenuItem item) {
        a aVar = this.f212e;
        return aVar != null && aVar.a(menu, item);
    }

    public void d() {
        a aVar = this.f212e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public static int n(ArrayList<i> arrayList, int ordering) {
        for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
            if (arrayList.get(i2).f() <= ordering) {
                return i2 + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        i item = p(keyCode, event);
        boolean handled = false;
        if (item != null) {
            handled = L(item, flags);
        }
        if ((flags & 2) != 0) {
            e(true);
        }
        return handled;
    }

    public void q(List<i> list, int keyCode, KeyEvent event) {
        boolean qwerty = G();
        int modifierState = event.getModifiers();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        if (event.getKeyData(possibleChars) || keyCode == 67) {
            int N = this.f213f.size();
            for (int i2 = 0; i2 < N; i2++) {
                i item = this.f213f.get(i2);
                if (item.hasSubMenu()) {
                    ((g) item.getSubMenu()).q(list, keyCode, event);
                }
                char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
                if (((modifierState & 69647) == (69647 & (qwerty ? item.getAlphabeticModifiers() : item.getNumericModifiers()))) && shortcutChar != 0) {
                    char[] cArr = possibleChars.meta;
                    if (shortcutChar != cArr[0] && shortcutChar != cArr[2]) {
                        if (qwerty && shortcutChar == '\b') {
                            if (keyCode != 67) {
                            }
                        }
                    }
                    if (item.isEnabled()) {
                        list.add(item);
                    }
                }
            }
        }
    }

    public i p(int keyCode, KeyEvent event) {
        char shortcutChar;
        ArrayList<MenuItemImpl> items = this.u;
        items.clear();
        q(items, keyCode, event);
        if (items.isEmpty()) {
            return null;
        }
        int metaState = event.getMetaState();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        event.getKeyData(possibleChars);
        int size = items.size();
        if (size == 1) {
            return (i) items.get(0);
        }
        boolean qwerty = G();
        for (int i2 = 0; i2 < size; i2++) {
            i item = (i) items.get(i2);
            if (qwerty) {
                shortcutChar = item.getAlphabeticShortcut();
            } else {
                shortcutChar = item.getNumericShortcut();
            }
            if ((shortcutChar == possibleChars.meta[0] && (metaState & 2) == 0) || ((shortcutChar == possibleChars.meta[2] && (metaState & 2) != 0) || (qwerty && shortcutChar == '\b' && keyCode == 67))) {
                return item;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int id, int flags) {
        return L(findItem(id), flags);
    }

    public boolean L(MenuItem item, int flags) {
        return M(item, null, flags);
    }

    public boolean M(MenuItem item, m preferredPresenter, int flags) {
        i itemImpl = (i) item;
        if (itemImpl == null || !itemImpl.isEnabled()) {
            return false;
        }
        boolean invoked = itemImpl.k();
        a.h.m.b provider = itemImpl.b();
        boolean providerHasSubMenu = provider != null && provider.a();
        if (itemImpl.j()) {
            invoked |= itemImpl.expandActionView();
            if (invoked) {
                e(true);
            }
        } else if (itemImpl.hasSubMenu() || providerHasSubMenu) {
            if ((flags & 4) == 0) {
                e(false);
            }
            if (!itemImpl.hasSubMenu()) {
                itemImpl.w(new r(u(), this, itemImpl));
            }
            r subMenu = (r) itemImpl.getSubMenu();
            if (providerHasSubMenu) {
                provider.f(subMenu);
            }
            invoked |= j(subMenu, preferredPresenter);
            if (!invoked) {
                e(true);
            }
        } else if ((flags & 1) == 0) {
            e(true);
        }
        return invoked;
    }

    public final void e(boolean closeAllMenus) {
        if (!this.t) {
            this.t = true;
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                m presenter = (m) ref.get();
                if (presenter == null) {
                    this.v.remove(ref);
                } else {
                    presenter.a(this, closeAllMenus);
                }
            }
            this.t = false;
        }
    }

    public void close() {
        e(true);
    }

    public void K(boolean structureChanged) {
        if (!this.p) {
            if (structureChanged) {
                this.h = true;
                this.k = true;
            }
            i(structureChanged);
            return;
        }
        this.q = true;
        if (structureChanged) {
            this.r = true;
        }
    }

    public void d0() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }

    public void c0() {
        this.p = false;
        if (this.q) {
            this.q = false;
            K(this.r);
        }
    }

    public void J() {
        this.h = true;
        K(true);
    }

    public void I() {
        this.k = true;
        K(true);
    }

    public ArrayList<i> E() {
        if (!this.h) {
            return this.f214g;
        }
        this.f214g.clear();
        int itemsSize = this.f213f.size();
        for (int i2 = 0; i2 < itemsSize; i2++) {
            i item = this.f213f.get(i2);
            if (item.isVisible()) {
                this.f214g.add(item);
            }
        }
        this.h = false;
        this.k = true;
        return this.f214g;
    }

    public void r() {
        ArrayList<MenuItemImpl> visibleItems = E();
        if (this.k) {
            boolean flagged = false;
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                m presenter = (m) ref.get();
                if (presenter == null) {
                    this.v.remove(ref);
                } else {
                    flagged |= presenter.c();
                }
            }
            if (flagged) {
                this.i.clear();
                this.j.clear();
                int itemsSize = visibleItems.size();
                for (int i2 = 0; i2 < itemsSize; i2++) {
                    i item = (i) visibleItems.get(i2);
                    if (item.l()) {
                        this.i.add(item);
                    } else {
                        this.j.add(item);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(E());
            }
            this.k = false;
        }
    }

    public ArrayList<i> s() {
        r();
        return this.i;
    }

    public ArrayList<i> z() {
        r();
        return this.j;
    }

    public void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        K(false);
    }

    public final void W(int titleRes, CharSequence title, int iconRes, Drawable icon, View view) {
        Resources r2 = C();
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (titleRes > 0) {
                this.m = r2.getText(titleRes);
            } else if (title != null) {
                this.m = title;
            }
            if (iconRes > 0) {
                this.n = a.h.e.a.c(u(), iconRes);
            } else if (icon != null) {
                this.n = icon;
            }
            this.o = null;
        }
        K(false);
    }

    public g Y(CharSequence title) {
        W(0, title, 0, null, null);
        return this;
    }

    public g X(int titleRes) {
        W(titleRes, null, 0, null, null);
        return this;
    }

    public g V(Drawable icon) {
        W(0, null, 0, icon, null);
        return this;
    }

    public g U(int iconRes) {
        W(0, null, iconRes, null, null);
        return this;
    }

    public g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    public CharSequence x() {
        return this.m;
    }

    public Drawable w() {
        return this.n;
    }

    public View y() {
        return this.o;
    }

    public g D() {
        return this;
    }

    public boolean A() {
        return this.s;
    }

    public boolean k(i item) {
        if (this.v.isEmpty()) {
            return false;
        }
        boolean expanded = false;
        d0();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            m presenter = (m) ref.get();
            if (presenter == null) {
                this.v.remove(ref);
            } else {
                boolean g2 = presenter.g(this, item);
                expanded = g2;
                if (g2) {
                    break;
                }
            }
        }
        c0();
        if (expanded) {
            this.w = item;
        }
        return expanded;
    }

    public boolean f(i item) {
        if (this.v.isEmpty() || this.w != item) {
            return false;
        }
        boolean collapsed = false;
        d0();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            m presenter = (m) ref.get();
            if (presenter == null) {
                this.v.remove(ref);
            } else {
                boolean e2 = presenter.e(this, item);
                collapsed = e2;
                if (e2) {
                    break;
                }
            }
        }
        c0();
        if (collapsed) {
            this.w = null;
        }
        return collapsed;
    }

    public i v() {
        return this.w;
    }

    public void a0(boolean override) {
        this.y = override;
    }
}
