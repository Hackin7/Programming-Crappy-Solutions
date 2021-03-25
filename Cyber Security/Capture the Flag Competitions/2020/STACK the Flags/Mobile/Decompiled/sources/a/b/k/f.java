package a.b.k;

import a.b.o.b;
import a.e.b;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class f {

    /* renamed from: b  reason: collision with root package name */
    public static int f6b = -100;

    /* renamed from: c  reason: collision with root package name */
    public static final b<WeakReference<f>> f7c = new b<>();

    /* renamed from: d  reason: collision with root package name */
    public static final Object f8d = new Object();

    public abstract boolean A(int i);

    public abstract void B(int i);

    public abstract void C(View view);

    public abstract void D(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void E(Toolbar toolbar);

    public abstract void G(CharSequence charSequence);

    public abstract a.b.o.b H(b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T i(int i);

    public abstract b k();

    public abstract MenuInflater m();

    public abstract a n();

    public abstract void o();

    public abstract void p();

    public abstract void q(Configuration configuration);

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();

    public static f g(Activity activity, e callback) {
        return new g(activity, callback);
    }

    public static f h(Dialog dialog, e callback) {
        return new g(dialog, callback);
    }

    public void F(int themeResId) {
    }

    @Deprecated
    public void e() {
    }

    public Context f(Context context) {
        e();
        return context;
    }

    public int l() {
        return -100;
    }

    public static int j() {
        return -100;
    }

    public static void c(f delegate) {
        synchronized (f8d) {
            z(delegate);
            f7c.add(new WeakReference<>(delegate));
        }
    }

    public static void y(f delegate) {
        synchronized (f8d) {
            z(delegate);
        }
    }

    public static void z(f toRemove) {
        synchronized (f8d) {
            Iterator<WeakReference<AppCompatDelegate>> i = f7c.iterator();
            while (i.hasNext()) {
                f delegate = (f) i.next().get();
                if (delegate == toRemove || delegate == null) {
                    i.remove();
                }
            }
        }
    }
}
