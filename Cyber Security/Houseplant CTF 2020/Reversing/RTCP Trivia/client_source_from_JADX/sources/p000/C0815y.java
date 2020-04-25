package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: y */
public final class C0815y extends ActionMode {

    /* renamed from: a */
    final Context f3422a;

    /* renamed from: b */
    final C0802u f3423b;

    /* renamed from: y$a */
    public static class C0816a implements C0803a {

        /* renamed from: a */
        final Callback f3424a;

        /* renamed from: b */
        final Context f3425b;

        /* renamed from: c */
        final ArrayList<C0815y> f3426c = new ArrayList<>();

        /* renamed from: d */
        final C0256dk<Menu, Menu> f3427d = new C0256dk<>();

        public C0816a(Context context, Callback callback) {
            this.f3425b = context;
            this.f3424a = callback;
        }

        /* renamed from: a */
        private Menu m2707a(Menu menu) {
            Menu menu2 = (Menu) this.f3427d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0105as.m376a(this.f3425b, (C0353fs) menu);
            this.f3427d.put(menu, a);
            return a;
        }

        /* renamed from: a */
        public final void mo1862a(C0802u uVar) {
            this.f3424a.onDestroyActionMode(mo2836b(uVar));
        }

        /* renamed from: a */
        public final boolean mo1863a(C0802u uVar, Menu menu) {
            return this.f3424a.onCreateActionMode(mo2836b(uVar), m2707a(menu));
        }

        /* renamed from: a */
        public final boolean mo1864a(C0802u uVar, MenuItem menuItem) {
            return this.f3424a.onActionItemClicked(mo2836b(uVar), C0105as.m377a(this.f3425b, (C0354ft) menuItem));
        }

        /* renamed from: b */
        public final ActionMode mo2836b(C0802u uVar) {
            int size = this.f3426c.size();
            for (int i = 0; i < size; i++) {
                C0815y yVar = (C0815y) this.f3426c.get(i);
                if (yVar != null && yVar.f3423b == uVar) {
                    return yVar;
                }
            }
            C0815y yVar2 = new C0815y(this.f3425b, uVar);
            this.f3426c.add(yVar2);
            return yVar2;
        }

        /* renamed from: b */
        public final boolean mo1865b(C0802u uVar, Menu menu) {
            return this.f3424a.onPrepareActionMode(mo2836b(uVar), m2707a(menu));
        }
    }

    public C0815y(Context context, C0802u uVar) {
        this.f3422a = context;
        this.f3423b = uVar;
    }

    public final void finish() {
        this.f3423b.mo2592c();
    }

    public final View getCustomView() {
        return this.f3423b.mo2598i();
    }

    public final Menu getMenu() {
        return C0105as.m376a(this.f3422a, (C0353fs) this.f3423b.mo2589b());
    }

    public final MenuInflater getMenuInflater() {
        return this.f3423b.mo2584a();
    }

    public final CharSequence getSubtitle() {
        return this.f3423b.mo2596g();
    }

    public final Object getTag() {
        return this.f3423b.f3391c;
    }

    public final CharSequence getTitle() {
        return this.f3423b.mo2595f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f3423b.f3392d;
    }

    public final void invalidate() {
        this.f3423b.mo2593d();
    }

    public final boolean isTitleOptional() {
        return this.f3423b.mo2597h();
    }

    public final void setCustomView(View view) {
        this.f3423b.mo2586a(view);
    }

    public final void setSubtitle(int i) {
        this.f3423b.mo2590b(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f3423b.mo2587a(charSequence);
    }

    public final void setTag(Object obj) {
        this.f3423b.f3391c = obj;
    }

    public final void setTitle(int i) {
        this.f3423b.mo2585a(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f3423b.mo2591b(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f3423b.mo2588a(z);
    }
}
