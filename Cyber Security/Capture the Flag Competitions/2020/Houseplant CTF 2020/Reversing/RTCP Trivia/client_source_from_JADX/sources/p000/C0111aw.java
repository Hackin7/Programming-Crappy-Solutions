package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: aw */
public final class C0111aw extends C0019aj implements SubMenu {

    /* renamed from: l */
    public C0019aj f743l;

    /* renamed from: m */
    private C0023al f744m;

    public C0111aw(Context context, C0019aj ajVar, C0023al alVar) {
        super(context);
        this.f743l = ajVar;
        this.f744m = alVar;
    }

    /* renamed from: a */
    public final String mo142a() {
        int itemId = this.f744m != null ? this.f744m.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo142a());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo144a(C0020a aVar) {
        this.f743l.mo144a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo149a(C0019aj ajVar, MenuItem menuItem) {
        return super.mo149a(ajVar, menuItem) || this.f743l.mo149a(ajVar, menuItem);
    }

    /* renamed from: a */
    public final boolean mo150a(C0023al alVar) {
        return this.f743l.mo150a(alVar);
    }

    /* renamed from: b */
    public final boolean mo164b() {
        return this.f743l.mo164b();
    }

    /* renamed from: b */
    public final boolean mo165b(C0023al alVar) {
        return this.f743l.mo165b(alVar);
    }

    /* renamed from: c */
    public final boolean mo166c() {
        return this.f743l.mo166c();
    }

    /* renamed from: d */
    public final boolean mo170d() {
        return this.f743l.mo170d();
    }

    public final MenuItem getItem() {
        return this.f744m;
    }

    /* renamed from: l */
    public final C0019aj mo182l() {
        return this.f743l.mo182l();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.f743l.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        super.mo143a(0, null, i, null, null);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.mo143a(0, null, 0, drawable, null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        super.mo143a(i, null, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo143a(0, charSequence, 0, null, null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.mo143a(0, null, 0, null, view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f744m.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f744m.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.f743l.setQwertyMode(z);
    }
}
