package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;

/* renamed from: fg */
public final class C0335fg {

    /* renamed from: a */
    private static final C0340fl f1619a;

    /* renamed from: b */
    private static final C0249di<String, Typeface> f1620b = new C0249di<>(16);

    static {
        C0340fl flVar = VERSION.SDK_INT >= 28 ? new C0339fk() : VERSION.SDK_INT >= 26 ? new C0338fj() : (VERSION.SDK_INT < 24 || !C0337fi.m1107a()) ? VERSION.SDK_INT >= 21 ? new C0336fh() : new C0340fl() : new C0337fi();
        f1619a = flVar;
    }

    /* renamed from: a */
    public static Typeface m1099a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f1619a.mo1703a(context, resources, i, str, i2);
        if (a != null) {
            f1620b.mo1411a(m1103b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m1100a(Context context, C0318a aVar, Resources resources, int i, int i2, C0327a aVar2) {
        Typeface typeface;
        if (aVar instanceof C0321d) {
            C0321d dVar = (C0321d) aVar;
            typeface = C0357fw.m1172a(context, dVar.f1604a, aVar2, dVar.f1606c == 0, dVar.f1605b, i2);
        } else {
            typeface = f1619a.mo1702a(context, (C0319b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo1697a(typeface, (Handler) null);
                } else {
                    aVar2.mo1696a(-3, (Handler) null);
                }
            }
        }
        if (typeface != null) {
            f1620b.mo1411a(m1103b(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m1101a(Context context, C0363b[] bVarArr, int i) {
        return f1619a.mo1701a(context, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m1102a(Resources resources, int i, int i2) {
        return (Typeface) f1620b.mo1410a(m1103b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m1103b(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }
}
