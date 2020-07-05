package p000;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: u */
public abstract class C0802u {

    /* renamed from: c */
    Object f3391c;

    /* renamed from: d */
    boolean f3392d;

    /* renamed from: u$a */
    public interface C0803a {
        /* renamed from: a */
        void mo1862a(C0802u uVar);

        /* renamed from: a */
        boolean mo1863a(C0802u uVar, Menu menu);

        /* renamed from: a */
        boolean mo1864a(C0802u uVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo1865b(C0802u uVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo2584a();

    /* renamed from: a */
    public abstract void mo2585a(int i);

    /* renamed from: a */
    public abstract void mo2586a(View view);

    /* renamed from: a */
    public abstract void mo2587a(CharSequence charSequence);

    /* renamed from: a */
    public void mo2588a(boolean z) {
        this.f3392d = z;
    }

    /* renamed from: b */
    public abstract Menu mo2589b();

    /* renamed from: b */
    public abstract void mo2590b(int i);

    /* renamed from: b */
    public abstract void mo2591b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo2592c();

    /* renamed from: d */
    public abstract void mo2593d();

    /* renamed from: f */
    public abstract CharSequence mo2595f();

    /* renamed from: g */
    public abstract CharSequence mo2596g();

    /* renamed from: h */
    public boolean mo2597h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo2598i();
}
