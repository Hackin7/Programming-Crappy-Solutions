package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: x */
public final class C0814x extends C0802u implements C0020a {

    /* renamed from: a */
    private Context f3415a;

    /* renamed from: b */
    private ActionBarContextView f3416b;

    /* renamed from: e */
    private C0803a f3417e;

    /* renamed from: f */
    private WeakReference<View> f3418f;

    /* renamed from: g */
    private boolean f3419g;

    /* renamed from: h */
    private boolean f3420h;

    /* renamed from: i */
    private C0019aj f3421i;

    public C0814x(Context context, ActionBarContextView actionBarContextView, C0803a aVar, boolean z) {
        this.f3415a = context;
        this.f3416b = actionBarContextView;
        this.f3417e = aVar;
        C0019aj ajVar = new C0019aj(actionBarContextView.getContext());
        this.f3421i = ajVar;
        this.f3421i.mo144a((C0020a) this);
        this.f3420h = z;
    }

    /* renamed from: a */
    public final MenuInflater mo2584a() {
        return new C0817z(this.f3416b.getContext());
    }

    /* renamed from: a */
    public final void mo2585a(int i) {
        mo2591b((CharSequence) this.f3415a.getString(i));
    }

    /* renamed from: a */
    public final void mo193a(C0019aj ajVar) {
        mo2593d();
        this.f3416b.mo395a();
    }

    /* renamed from: a */
    public final void mo2586a(View view) {
        this.f3416b.setCustomView(view);
        this.f3418f = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public final void mo2587a(CharSequence charSequence) {
        this.f3416b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public final void mo2588a(boolean z) {
        super.mo2588a(z);
        this.f3416b.setTitleOptional(z);
    }

    /* renamed from: a */
    public final boolean mo194a(C0019aj ajVar, MenuItem menuItem) {
        return this.f3417e.mo1864a((C0802u) this, menuItem);
    }

    /* renamed from: b */
    public final Menu mo2589b() {
        return this.f3421i;
    }

    /* renamed from: b */
    public final void mo2590b(int i) {
        mo2587a((CharSequence) this.f3415a.getString(i));
    }

    /* renamed from: b */
    public final void mo2591b(CharSequence charSequence) {
        this.f3416b.setTitle(charSequence);
    }

    /* renamed from: c */
    public final void mo2592c() {
        if (!this.f3419g) {
            this.f3419g = true;
            this.f3416b.sendAccessibilityEvent(32);
            this.f3417e.mo1862a(this);
        }
    }

    /* renamed from: d */
    public final void mo2593d() {
        this.f3417e.mo1865b(this, this.f3421i);
    }

    /* renamed from: f */
    public final CharSequence mo2595f() {
        return this.f3416b.getTitle();
    }

    /* renamed from: g */
    public final CharSequence mo2596g() {
        return this.f3416b.getSubtitle();
    }

    /* renamed from: h */
    public final boolean mo2597h() {
        return this.f3416b.f338h;
    }

    /* renamed from: i */
    public final View mo2598i() {
        if (this.f3418f != null) {
            return (View) this.f3418f.get();
        }
        return null;
    }
}
