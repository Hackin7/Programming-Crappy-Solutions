package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

/* renamed from: at */
class C0106at extends C0008ae<C0353fs> implements Menu {
    C0106at(Context context, C0353fs fsVar) {
        super(context, fsVar);
    }

    public MenuItem add(int i) {
        return mo105a(((C0353fs) this.f45d).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo105a(((C0353fs) this.f45d).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo105a(((C0353fs) this.f45d).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo105a(((C0353fs) this.f45d).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C0353fs) this.f45d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo105a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo106a(((C0353fs) this.f45d).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo106a(((C0353fs) this.f45d).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo106a(((C0353fs) this.f45d).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo106a(((C0353fs) this.f45d).addSubMenu(charSequence));
    }

    public void clear() {
        if (this.f43b != null) {
            this.f43b.clear();
        }
        if (this.f44c != null) {
            this.f44c.clear();
        }
        ((C0353fs) this.f45d).clear();
    }

    public void close() {
        ((C0353fs) this.f45d).close();
    }

    public MenuItem findItem(int i) {
        return mo105a(((C0353fs) this.f45d).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo105a(((C0353fs) this.f45d).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0353fs) this.f45d).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0353fs) this.f45d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0353fs) this.f45d).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0353fs) this.f45d).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        if (this.f43b != null) {
            Iterator it = this.f43b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((C0353fs) this.f45d).removeGroup(i);
    }

    public void removeItem(int i) {
        if (this.f43b != null) {
            Iterator it = this.f43b.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ((C0353fs) this.f45d).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0353fs) this.f45d).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0353fs) this.f45d).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0353fs) this.f45d).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0353fs) this.f45d).setQwertyMode(z);
    }

    public int size() {
        return ((C0353fs) this.f45d).size();
    }
}
