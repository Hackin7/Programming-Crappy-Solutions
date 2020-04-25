package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: co */
public final class C0212co extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1077a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0212co>> f1078b;

    /* renamed from: c */
    private final Resources f1079c;

    /* renamed from: d */
    private final Theme f1080d;

    private C0212co(Context context) {
        super(context);
        if (C0224cw.m736a()) {
            this.f1079c = new C0224cw(this, context.getResources());
            this.f1080d = this.f1079c.newTheme();
            this.f1080d.setTo(context.getTheme());
            return;
        }
        this.f1079c = new C0214cq(this, context.getResources());
        this.f1080d = null;
    }

    /* renamed from: a */
    public static Context m672a(Context context) {
        boolean z = false;
        if (!(context instanceof C0212co) && !(context.getResources() instanceof C0214cq) && !(context.getResources() instanceof C0224cw) && (VERSION.SDK_INT < 21 || C0224cw.m736a())) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (f1077a) {
            if (f1078b == null) {
                f1078b = new ArrayList<>();
            } else {
                for (int size = f1078b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f1078b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1078b.remove(size);
                    }
                }
                for (int size2 = f1078b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f1078b.get(size2);
                    C0212co coVar = weakReference2 != null ? (C0212co) weakReference2.get() : null;
                    if (coVar != null && coVar.getBaseContext() == context) {
                        return coVar;
                    }
                }
            }
            C0212co coVar2 = new C0212co(context);
            f1078b.add(new WeakReference(coVar2));
            return coVar2;
        }
    }

    public final AssetManager getAssets() {
        return this.f1079c.getAssets();
    }

    public final Resources getResources() {
        return this.f1079c;
    }

    public final Theme getTheme() {
        return this.f1080d == null ? super.getTheme() : this.f1080d;
    }

    public final void setTheme(int i) {
        if (this.f1080d == null) {
            super.setTheme(i);
        } else {
            this.f1080d.applyStyle(i, true);
        }
    }
}
