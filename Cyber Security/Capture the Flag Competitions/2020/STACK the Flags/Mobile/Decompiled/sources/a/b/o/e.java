package a.b.o;

import a.b.o.b;
import a.b.o.j.g;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements g.a {

    /* renamed from: d  reason: collision with root package name */
    public Context f127d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContextView f128e;

    /* renamed from: f  reason: collision with root package name */
    public b.a f129f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f130g;
    public boolean h;
    public g i;

    public e(Context context, ActionBarContextView view, b.a callback, boolean isFocusable) {
        this.f127d = context;
        this.f128e = view;
        this.f129f = callback;
        g gVar = new g(view.getContext());
        gVar.S(1);
        this.i = gVar;
        gVar.R(this);
    }

    @Override // a.b.o.b
    public void r(CharSequence title) {
        this.f128e.setTitle(title);
    }

    @Override // a.b.o.b
    public void o(CharSequence subtitle) {
        this.f128e.setSubtitle(subtitle);
    }

    @Override // a.b.o.b
    public void q(int resId) {
        r(this.f127d.getString(resId));
    }

    @Override // a.b.o.b
    public void n(int resId) {
        o(this.f127d.getString(resId));
    }

    @Override // a.b.o.b
    public void s(boolean titleOptional) {
        super.s(titleOptional);
        this.f128e.setTitleOptional(titleOptional);
    }

    @Override // a.b.o.b
    public boolean l() {
        return this.f128e.j();
    }

    @Override // a.b.o.b
    public void m(View view) {
        this.f128e.setCustomView(view);
        this.f130g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // a.b.o.b
    public void k() {
        this.f129f.a(this, this.i);
    }

    @Override // a.b.o.b
    public void c() {
        if (!this.h) {
            this.h = true;
            this.f128e.sendAccessibilityEvent(32);
            this.f129f.d(this);
        }
    }

    @Override // a.b.o.b
    public Menu e() {
        return this.i;
    }

    @Override // a.b.o.b
    public CharSequence i() {
        return this.f128e.getTitle();
    }

    @Override // a.b.o.b
    public CharSequence g() {
        return this.f128e.getSubtitle();
    }

    @Override // a.b.o.b
    public View d() {
        WeakReference<View> weakReference = this.f130g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.b.o.b
    public MenuInflater f() {
        return new g(this.f128e.getContext());
    }

    @Override // a.b.o.j.g.a
    public boolean a(g menu, MenuItem item) {
        return this.f129f.b(this, item);
    }

    @Override // a.b.o.j.g.a
    public void b(g menu) {
        k();
        this.f128e.l();
    }
}
