package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* renamed from: ae */
abstract class C0008ae<T> extends C0009af<T> {

    /* renamed from: a */
    final Context f42a;

    /* renamed from: b */
    Map<C0354ft, MenuItem> f43b;

    /* renamed from: c */
    Map<C0355fu, SubMenu> f44c;

    C0008ae(Context context, T t) {
        super(t);
        this.f42a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo105a(MenuItem menuItem) {
        if (!(menuItem instanceof C0354ft)) {
            return menuItem;
        }
        C0354ft ftVar = (C0354ft) menuItem;
        if (this.f43b == null) {
            this.f43b = new C0243de();
        }
        MenuItem menuItem2 = (MenuItem) this.f43b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0105as.m377a(this.f42a, ftVar);
        this.f43b.put(ftVar, a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo106a(SubMenu subMenu) {
        if (!(subMenu instanceof C0355fu)) {
            return subMenu;
        }
        C0355fu fuVar = (C0355fu) subMenu;
        if (this.f44c == null) {
            this.f44c = new C0243de();
        }
        SubMenu subMenu2 = (SubMenu) this.f44c.get(fuVar);
        if (subMenu2 == null) {
            SubMenu axVar = new C0112ax(this.f42a, fuVar);
            this.f44c.put(fuVar, axVar);
            subMenu2 = axVar;
        }
        return subMenu2;
    }
}
