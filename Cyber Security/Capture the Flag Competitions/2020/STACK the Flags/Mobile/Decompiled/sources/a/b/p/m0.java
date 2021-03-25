package a.b.p;

import a.b.p.j;
import a.e.g;
import a.e.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class m0 {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static m0 i;
    public static final c j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, h<ColorStateList>> f369a;

    /* renamed from: b  reason: collision with root package name */
    public g<String, d> f370b;

    /* renamed from: c  reason: collision with root package name */
    public h<String> f371c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, a.e.d<WeakReference<Drawable.ConstantState>>> f372d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f373e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f374f;

    /* renamed from: g  reason: collision with root package name */
    public e f375g;

    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface e {
    }

    public static synchronized m0 h() {
        m0 m0Var;
        synchronized (m0.class) {
            if (i == null) {
                m0 m0Var2 = new m0();
                i = m0Var2;
                p(m0Var2);
            }
            m0Var = i;
        }
        return m0Var;
    }

    public static void p(m0 manager) {
        if (Build.VERSION.SDK_INT < 24) {
            manager.a("vector", new f());
            manager.a("animated-vector", new b());
            manager.a("animated-selector", new a());
        }
    }

    public synchronized void t(e hooks) {
        this.f375g = hooks;
    }

    public synchronized Drawable j(Context context, int resId) {
        return k(context, resId, false);
    }

    public synchronized Drawable k(Context context, int resId, boolean failIfNotKnown) {
        Drawable drawable;
        d(context);
        drawable = r(context, resId);
        if (drawable == null) {
            drawable = f(context, resId);
        }
        if (drawable == null) {
            drawable = a.h.e.a.c(context, resId);
        }
        if (drawable != null) {
            drawable = u(context, resId, failIfNotKnown, drawable);
        }
        if (drawable != null) {
            e0.b(drawable);
        }
        return drawable;
    }

    public synchronized void s(Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (a.e.d) this.f372d.get(context);
        if (cache != null) {
            cache.b();
        }
    }

    public static long e(TypedValue tv) {
        return (((long) tv.assetCookie) << 32) | ((long) tv.data);
    }

    public final Drawable f(Context context, int resId) {
        Drawable dr;
        if (this.f373e == null) {
            this.f373e = new TypedValue();
        }
        TypedValue tv = this.f373e;
        context.getResources().getValue(resId, tv, true);
        long key = e(tv);
        Drawable dr2 = i(context, key);
        if (dr2 != null) {
            return dr2;
        }
        e eVar = this.f375g;
        if (eVar == null) {
            dr = null;
        } else {
            dr = ((j.a) eVar).f(this, context, resId);
        }
        if (dr != null) {
            dr.setChangingConfigurations(tv.changingConfigurations);
            b(context, key, dr);
        }
        return dr;
    }

    public final Drawable u(Context context, int resId, boolean failIfNotKnown, Drawable drawable) {
        ColorStateList tintList = m(context, resId);
        if (tintList != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawable2 = a.h.f.l.a.q(drawable);
            a.h.f.l.a.o(drawable2, tintList);
            PorterDuff.Mode tintMode = o(resId);
            if (tintMode == null) {
                return drawable2;
            }
            a.h.f.l.a.p(drawable2, tintMode);
            return drawable2;
        }
        e eVar = this.f375g;
        if ((eVar == null || !((j.a) eVar).k(context, resId, drawable)) && !w(context, resId, drawable) && failIfNotKnown) {
            return null;
        }
        return drawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ Exception -> 0x00a6 }] */
    public final Drawable r(Context context, int resId) {
        int type;
        g<String, d> gVar = this.f370b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        h<String> hVar = this.f371c;
        if (hVar != null) {
            String cachedTagName = hVar.e(resId);
            if ("appcompat_skip_skip".equals(cachedTagName) || (cachedTagName != null && this.f370b.get(cachedTagName) == null)) {
                return null;
            }
        } else {
            this.f371c = new h<>();
        }
        if (this.f373e == null) {
            this.f373e = new TypedValue();
        }
        TypedValue tv = this.f373e;
        Resources res = context.getResources();
        res.getValue(resId, tv, true);
        long key = e(tv);
        Drawable dr = i(context, key);
        if (dr != null) {
            return dr;
        }
        CharSequence charSequence = tv.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlPullParser parser = res.getXml(resId);
                AttributeSet attrs = Xml.asAttributeSet(parser);
                while (true) {
                    type = parser.next();
                    if (type == 2 || type == 1) {
                        if (type != 2) {
                            String tagName = parser.getName();
                            this.f371c.a(resId, tagName);
                            d delegate = this.f370b.get(tagName);
                            if (delegate != null) {
                                dr = delegate.a(context, parser, attrs, context.getTheme());
                            }
                            if (dr != null) {
                                dr.setChangingConfigurations(tv.changingConfigurations);
                                b(context, key, dr);
                            }
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                }
                if (type != 2) {
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (dr == null) {
            this.f371c.a(resId, "appcompat_skip_skip");
        }
        return dr;
    }

    public final synchronized Drawable i(Context context, long key) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (a.e.d) this.f372d.get(context);
        if (cache == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> wr = cache.f(key);
        if (wr != null) {
            Drawable.ConstantState entry = wr.get();
            if (entry != null) {
                return entry.newDrawable(context.getResources());
            }
            cache.k(key);
        }
        return null;
    }

    public final synchronized boolean b(Context context, long key, Drawable drawable) {
        Drawable.ConstantState cs = drawable.getConstantState();
        if (cs == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (a.e.d) this.f372d.get(context);
        if (cache == null) {
            cache = new a.e.d<>();
            this.f372d.put(context, cache);
        }
        cache.j(key, new WeakReference<>(cs));
        return true;
    }

    public boolean w(Context context, int resId, Drawable drawable) {
        e eVar = this.f375g;
        return eVar != null && ((j.a) eVar).l(context, resId, drawable);
    }

    public final void a(String tagName, d delegate) {
        if (this.f370b == null) {
            this.f370b = new g<>();
        }
        this.f370b.put(tagName, delegate);
    }

    public PorterDuff.Mode o(int resId) {
        e eVar = this.f375g;
        if (eVar == null) {
            return null;
        }
        return ((j.a) eVar).i(resId);
    }

    public synchronized ColorStateList m(Context context, int resId) {
        ColorStateList tint;
        tint = n(context, resId);
        if (tint == null) {
            tint = this.f375g == null ? null : ((j.a) this.f375g).h(context, resId);
            if (tint != null) {
                c(context, resId, tint);
            }
        }
        return tint;
    }

    public final ColorStateList n(Context context, int resId) {
        SparseArrayCompat<ColorStateList> tints;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.f369a;
        if (weakHashMap == null || (tints = (h) weakHashMap.get(context)) == null) {
            return null;
        }
        return tints.e(resId);
    }

    public final void c(Context context, int resId, ColorStateList tintList) {
        if (this.f369a == null) {
            this.f369a = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> themeTints = (h) this.f369a.get(context);
        if (themeTints == null) {
            themeTints = new h<>();
            this.f369a.put(context, themeTints);
        }
        themeTints.a(resId, tintList);
    }

    public static class c extends a.e.e<Integer, PorterDuffColorFilter> {
        public c(int maxSize) {
            super(maxSize);
        }

        public PorterDuffColorFilter i(int color, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(color, mode)));
        }

        public PorterDuffColorFilter j(int color, PorterDuff.Mode mode, PorterDuffColorFilter filter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(color, mode)), filter);
        }

        public static int h(int color, PorterDuff.Mode mode) {
            return (((1 * 31) + color) * 31) + mode.hashCode();
        }
    }

    public static void v(Drawable drawable, u0 tint, int[] state) {
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            if (tint.f424d || tint.f423c) {
                drawable.setColorFilter(g(tint.f424d ? tint.f421a : null, tint.f423c ? tint.f422b : h, state));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public static PorterDuffColorFilter g(ColorStateList tint, PorterDuff.Mode tintMode, int[] state) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return l(tint.getColorForState(state, 0), tintMode);
    }

    public static synchronized PorterDuffColorFilter l(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter filter;
        synchronized (m0.class) {
            filter = j.i(color, mode);
            if (filter == null) {
                filter = new PorterDuffColorFilter(color, mode);
                j.j(color, mode, filter);
            }
        }
        return filter;
    }

    public final void d(Context context) {
        if (!this.f374f) {
            this.f374f = true;
            Drawable d2 = j(context, a.b.n.a.abc_vector_test);
            if (d2 == null || !q(d2)) {
                this.f374f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    public static boolean q(Drawable d2) {
        return (d2 instanceof a.s.a.a.g) || "android.graphics.drawable.VectorDrawable".equals(d2.getClass().getName());
    }

    public static class f implements d {
        @Override // a.b.p.m0.d
        public Drawable a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return a.s.a.a.g.c(context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    public static class b implements d {
        @Override // a.b.p.m0.d
        public Drawable a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return a.s.a.a.b.a(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    public static class a implements d {
        @Override // a.b.p.m0.d
        public Drawable a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return a.b.m.a.a.m(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }
}
