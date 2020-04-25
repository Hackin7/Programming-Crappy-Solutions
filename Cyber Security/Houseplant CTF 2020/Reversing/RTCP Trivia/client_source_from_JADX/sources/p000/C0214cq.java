package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: cq */
final class C0214cq extends C0203cj {

    /* renamed from: a */
    private final WeakReference<Context> f1085a;

    public C0214cq(Context context, Resources resources) {
        super(resources);
        this.f1085a = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1085a.get();
        if (!(drawable == null || context == null)) {
            C0147bi.m485a();
            C0147bi.m489a(context, i, drawable);
        }
        return drawable;
    }
}
