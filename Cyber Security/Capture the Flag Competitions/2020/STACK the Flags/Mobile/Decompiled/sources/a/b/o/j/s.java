package a.b.o.j;

import a.h.g.a.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class s extends o implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final c f253e;

    public s(Context context, c subMenu) {
        super(context, subMenu);
        this.f253e = subMenu;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        this.f253e.setHeaderTitle(titleRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        this.f253e.setHeaderTitle(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        this.f253e.setHeaderIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        this.f253e.setHeaderIcon(icon);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f253e.setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        this.f253e.clearHeader();
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        this.f253e.setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        this.f253e.setIcon(icon);
        return this;
    }

    public MenuItem getItem() {
        return c(this.f253e.getItem());
    }
}
