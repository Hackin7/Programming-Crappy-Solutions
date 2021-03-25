package a.b.o;

import a.b.o.b;
import a.b.o.j.j;
import a.b.o.j.o;
import a.e.g;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f131a;

    /* renamed from: b  reason: collision with root package name */
    public final b f132b;

    public f(Context context, b supportActionMode) {
        this.f131a = context;
        this.f132b = supportActionMode;
    }

    public Object getTag() {
        return this.f132b.h();
    }

    public void setTag(Object tag) {
        this.f132b.p(tag);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence title) {
        this.f132b.r(title);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence subtitle) {
        this.f132b.o(subtitle);
    }

    public void invalidate() {
        this.f132b.k();
    }

    public void finish() {
        this.f132b.c();
    }

    public Menu getMenu() {
        return new o(this.f131a, (a.h.g.a.a) this.f132b.e());
    }

    public CharSequence getTitle() {
        return this.f132b.i();
    }

    @Override // android.view.ActionMode
    public void setTitle(int resId) {
        this.f132b.q(resId);
    }

    public CharSequence getSubtitle() {
        return this.f132b.g();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int resId) {
        this.f132b.n(resId);
    }

    public View getCustomView() {
        return this.f132b.d();
    }

    public void setCustomView(View view) {
        this.f132b.m(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f132b.f();
    }

    public boolean getTitleOptionalHint() {
        return this.f132b.j();
    }

    public void setTitleOptionalHint(boolean titleOptional) {
        this.f132b.s(titleOptional);
    }

    public boolean isTitleOptional() {
        return this.f132b.l();
    }

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f133a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f134b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<f> f135c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final g<Menu, Menu> f136d = new g<>();

        public a(Context context, ActionMode.Callback supportCallback) {
            this.f134b = context;
            this.f133a = supportCallback;
        }

        @Override // a.b.o.b.a
        public boolean c(b mode, Menu menu) {
            return this.f133a.onCreateActionMode(e(mode), f(menu));
        }

        @Override // a.b.o.b.a
        public boolean a(b mode, Menu menu) {
            return this.f133a.onPrepareActionMode(e(mode), f(menu));
        }

        @Override // a.b.o.b.a
        public boolean b(b mode, MenuItem item) {
            return this.f133a.onActionItemClicked(e(mode), new j(this.f134b, (a.h.g.a.b) item));
        }

        @Override // a.b.o.b.a
        public void d(b mode) {
            this.f133a.onDestroyActionMode(e(mode));
        }

        public final Menu f(Menu menu) {
            Menu wrapper = this.f136d.get(menu);
            if (wrapper != null) {
                return wrapper;
            }
            Menu wrapper2 = new o(this.f134b, (a.h.g.a.a) menu);
            this.f136d.put(menu, wrapper2);
            return wrapper2;
        }

        public ActionMode e(b mode) {
            int count = this.f135c.size();
            for (int i = 0; i < count; i++) {
                f wrapper = this.f135c.get(i);
                if (wrapper != null && wrapper.f132b == mode) {
                    return wrapper;
                }
            }
            f wrapper2 = new f(this.f134b, mode);
            this.f135c.add(wrapper2);
            return wrapper2;
        }
    }
}
