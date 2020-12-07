package a.h.m;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public Object f960a;

    public r(Object pointerIcon) {
        this.f960a = pointerIcon;
    }

    public Object a() {
        return this.f960a;
    }

    public static r b(Context context, int style) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new r(PointerIcon.getSystemIcon(context, style));
        }
        return new r(null);
    }
}
