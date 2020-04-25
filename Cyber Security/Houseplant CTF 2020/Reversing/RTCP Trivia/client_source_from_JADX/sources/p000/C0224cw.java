package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: cw */
public final class C0224cw extends Resources {

    /* renamed from: a */
    private static boolean f1131a = false;

    /* renamed from: b */
    private final WeakReference<Context> f1132b;

    public C0224cw(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1132b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m736a() {
        return f1131a && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo1336a(int i) {
        return super.getDrawable(i);
    }

    public final Drawable getDrawable(int i) {
        Context context = (Context) this.f1132b.get();
        return context != null ? C0147bi.m485a().mo967a(context, this, i) : super.getDrawable(i);
    }
}
