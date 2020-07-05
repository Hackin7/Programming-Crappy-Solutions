package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ax */
final class C0112ax extends C0106at implements SubMenu {
    C0112ax(Context context, C0355fu fuVar) {
        super(context, fuVar);
    }

    public final void clearHeader() {
        ((C0355fu) this.f45d).clearHeader();
    }

    public final MenuItem getItem() {
        return mo105a(((C0355fu) this.f45d).getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        ((C0355fu) this.f45d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((C0355fu) this.f45d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        ((C0355fu) this.f45d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((C0355fu) this.f45d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((C0355fu) this.f45d).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        ((C0355fu) this.f45d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((C0355fu) this.f45d).setIcon(drawable);
        return this;
    }
}
