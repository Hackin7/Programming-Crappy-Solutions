package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: g */
public abstract class C0375g {

    /* renamed from: a */
    static int f1712a = -1;

    C0375g() {
    }

    /* renamed from: a */
    public static C0375g m1184a(Activity activity, C0322f fVar) {
        return new C0414h(activity, activity.getWindow(), fVar);
    }

    /* renamed from: a */
    public static C0375g m1185a(Dialog dialog, C0322f fVar) {
        return new C0414h(dialog.getContext(), dialog.getWindow(), fVar);
    }

    /* renamed from: a */
    public abstract <T extends View> T mo1777a(int i);

    /* renamed from: a */
    public abstract C0177c mo1778a();

    /* renamed from: a */
    public abstract void mo1779a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo1780a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo1781a(View view);

    /* renamed from: a */
    public abstract void mo1782a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo1783a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo1784b();

    /* renamed from: b */
    public abstract void mo1785b(int i);

    /* renamed from: b */
    public abstract void mo1786b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo1787b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo1788c();

    /* renamed from: c */
    public abstract boolean mo1789c(int i);

    /* renamed from: d */
    public abstract void mo1790d();

    /* renamed from: e */
    public abstract void mo1791e();

    /* renamed from: f */
    public abstract void mo1792f();

    /* renamed from: g */
    public abstract void mo1793g();

    /* renamed from: h */
    public abstract void mo1794h();

    /* renamed from: i */
    public abstract void mo1795i();

    /* renamed from: j */
    public abstract boolean mo1796j();
}
