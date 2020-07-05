package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: o */
public final class C0785o {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3316a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0786a>> f3317b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3318c = new Object();

    /* renamed from: o$a */
    static class C0786a {

        /* renamed from: a */
        final ColorStateList f3319a;

        /* renamed from: b */
        final Configuration f3320b;

        C0786a(ColorStateList colorStateList, Configuration configuration) {
            this.f3319a = colorStateList;
            this.f3320b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m2607a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m2610d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m2609c(context, i);
        if (c == null) {
            return C0313ev.m1049b(context, i);
        }
        synchronized (f3318c) {
            SparseArray sparseArray = (SparseArray) f3317b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f3317b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0786a(c, context.getResources().getConfiguration()));
        }
        return c;
    }

    /* renamed from: b */
    public static Drawable m2608b(Context context, int i) {
        return C0147bi.m485a().mo965a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m2609c(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) f3316a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f3316a.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            z = false;
        }
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return C0315ex.m1051a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2610d(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f3318c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<o$a>> r1 = f3317b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            o$a r2 = (p000.C0785o.C0786a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f3320b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f3319a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0785o.m2610d(android.content.Context, int):android.content.res.ColorStateList");
    }
}
