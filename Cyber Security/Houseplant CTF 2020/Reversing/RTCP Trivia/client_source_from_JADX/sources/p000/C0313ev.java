package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;

/* renamed from: ev */
public class C0313ev {

    /* renamed from: a */
    private static final Object f1592a = new Object();

    /* renamed from: b */
    private static TypedValue f1593b;

    /* renamed from: a */
    public static Drawable m1047a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT < 16) {
            synchronized (f1592a) {
                if (f1593b == null) {
                    f1593b = new TypedValue();
                }
                context.getResources().getValue(i, f1593b, true);
                i = f1593b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: a */
    public static boolean m1048a(Context context, Intent[] intentArr) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, null);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    /* renamed from: b */
    public static ColorStateList m1049b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }
}
