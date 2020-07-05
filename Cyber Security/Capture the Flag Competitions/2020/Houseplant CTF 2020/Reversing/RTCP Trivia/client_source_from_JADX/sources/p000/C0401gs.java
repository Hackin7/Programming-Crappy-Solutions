package p000;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: gs */
public final class C0401gs {
    /* renamed from: a */
    public static boolean m1285a(ViewParent viewParent, View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        } else {
            if (viewParent instanceof C0391gl) {
                return ((C0391gl) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m1286a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        } else {
            if (viewParent instanceof C0391gl) {
                return ((C0391gl) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m1287a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0392gm) {
            return ((C0392gm) viewParent).mo745a(i);
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStartNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C0391gl) {
                return ((C0391gl) viewParent).onStartNestedScroll(view, view2, i);
            }
        }
        return false;
    }
}
