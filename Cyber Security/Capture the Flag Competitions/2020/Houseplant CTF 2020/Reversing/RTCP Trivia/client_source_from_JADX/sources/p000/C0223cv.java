package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

/* renamed from: cv */
final class C0223cv {

    /* renamed from: a */
    final Context f1124a;

    /* renamed from: b */
    final View f1125b;

    /* renamed from: c */
    final TextView f1126c;

    /* renamed from: d */
    final LayoutParams f1127d = new LayoutParams();

    /* renamed from: e */
    final Rect f1128e = new Rect();

    /* renamed from: f */
    final int[] f1129f = new int[2];

    /* renamed from: g */
    final int[] f1130g = new int[2];

    C0223cv(Context context) {
        this.f1124a = context;
        this.f1125b = LayoutInflater.from(this.f1124a).inflate(C0123g.abc_tooltip, null);
        this.f1126c = (TextView) this.f1125b.findViewById(C0122f.message);
        this.f1127d.setTitle(getClass().getSimpleName());
        this.f1127d.packageName = this.f1124a.getPackageName();
        this.f1127d.type = 1002;
        this.f1127d.width = -2;
        this.f1127d.height = -2;
        this.f1127d.format = -3;
        this.f1127d.windowAnimations = C0125i.Animation_AppCompat_Tooltip;
        this.f1127d.flags = 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1334a() {
        if (mo1335b()) {
            ((WindowManager) this.f1124a.getSystemService("window")).removeView(this.f1125b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo1335b() {
        return this.f1125b.getParent() != null;
    }
}
