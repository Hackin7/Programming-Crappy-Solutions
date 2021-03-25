package a.b.o.j;

import a.h.g.a.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class o extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f245d;

    public o(Context context, a object) {
        super(context);
        if (object != null) {
            this.f245d = object;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return c(this.f245d.add(title));
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return c(this.f245d.add(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
        return c(this.f245d.add(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, int titleRes) {
        return c(this.f245d.add(groupId, itemId, order, titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return d(this.f245d.addSubMenu(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return d(this.f245d.addSubMenu(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
        return d(this.f245d.addSubMenu(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
        return d(this.f245d.addSubMenu(groupId, itemId, order, titleRes));
    }

    public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        MenuItem[] items = null;
        if (outSpecificItems != null) {
            items = new MenuItem[outSpecificItems.length];
        }
        int result = this.f245d.addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, items);
        if (items != null) {
            int z = items.length;
            for (int i = 0; i < z; i++) {
                outSpecificItems[i] = c(items[i]);
            }
        }
        return result;
    }

    public void removeItem(int id) {
        g(id);
        this.f245d.removeItem(id);
    }

    public void removeGroup(int groupId) {
        f(groupId);
        this.f245d.removeGroup(groupId);
    }

    public void clear() {
        e();
        this.f245d.clear();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        this.f245d.setGroupCheckable(group, checkable, exclusive);
    }

    public void setGroupVisible(int group, boolean visible) {
        this.f245d.setGroupVisible(group, visible);
    }

    public void setGroupEnabled(int group, boolean enabled) {
        this.f245d.setGroupEnabled(group, enabled);
    }

    public boolean hasVisibleItems() {
        return this.f245d.hasVisibleItems();
    }

    public MenuItem findItem(int id) {
        return c(this.f245d.findItem(id));
    }

    public int size() {
        return this.f245d.size();
    }

    public MenuItem getItem(int index) {
        return c(this.f245d.getItem(index));
    }

    public void close() {
        this.f245d.close();
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        return this.f245d.performShortcut(keyCode, event, flags);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return this.f245d.isShortcutKey(keyCode, event);
    }

    public boolean performIdentifierAction(int id, int flags) {
        return this.f245d.performIdentifierAction(id, flags);
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f245d.setQwertyMode(isQwerty);
    }
}
