package a.b.l.a;

import a.b.p.m0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f91a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<C0002a>> f92b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f93c = new Object();

    public static ColorStateList c(Context context, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(resId);
        }
        ColorStateList csl = b(context, resId);
        if (csl != null) {
            return csl;
        }
        ColorStateList csl2 = f(context, resId);
        if (csl2 == null) {
            return a.h.e.a.b(context, resId);
        }
        a(context, resId, csl2);
        return csl2;
    }

    public static Drawable d(Context context, int resId) {
        return m0.h().j(context, resId);
    }

    public static ColorStateList f(Context context, int resId) {
        if (g(context, resId)) {
            return null;
        }
        Resources r = context.getResources();
        try {
            return a.h.e.c.a.a(r, r.getXml(resId), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    public static ColorStateList b(Context context, int resId) {
        C0002a entry;
        synchronized (f93c) {
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = f92b.get(context);
            if (!(entries == null || entries.size() <= 0 || (entry = (C0002a) entries.get(resId)) == null)) {
                if (entry.f95b.equals(context.getResources().getConfiguration())) {
                    return entry.f94a;
                }
                entries.remove(resId);
            }
            return null;
        }
    }

    public static void a(Context context, int resId, ColorStateList value) {
        synchronized (f93c) {
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = f92b.get(context);
            if (entries == null) {
                entries = new SparseArray<>();
                f92b.put(context, entries);
            }
            entries.append(resId, new C0002a(value, context.getResources().getConfiguration()));
        }
    }

    public static boolean g(Context context, int resId) {
        Resources r = context.getResources();
        TypedValue value = e();
        r.getValue(resId, value, true);
        int i = value.type;
        if (i < 28 || i > 31) {
            return false;
        }
        return true;
    }

    public static TypedValue e() {
        TypedValue tv = f91a.get();
        if (tv != null) {
            return tv;
        }
        TypedValue tv2 = new TypedValue();
        f91a.set(tv2);
        return tv2;
    }

    /* renamed from: a.b.l.a.a$a  reason: collision with other inner class name */
    public static class C0002a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f94a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f95b;

        public C0002a(ColorStateList value, Configuration configuration) {
            this.f94a = value;
            this.f95b = configuration;
        }
    }
}
