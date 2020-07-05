package p000;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: ct */
public final class C0219ct {
    /* renamed from: a */
    public static void m728a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0220cu.m729a(view, charSequence);
        }
    }
}
