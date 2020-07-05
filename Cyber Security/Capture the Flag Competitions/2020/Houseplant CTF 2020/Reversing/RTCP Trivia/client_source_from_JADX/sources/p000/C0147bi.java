package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bi */
public final class C0147bi {

    /* renamed from: a */
    private static final Mode f831a = Mode.SRC_IN;

    /* renamed from: b */
    private static C0147bi f832b;

    /* renamed from: c */
    private static final C0150c f833c = new C0150c();

    /* renamed from: d */
    private static final int[] f834d = {C0121e.abc_textfield_search_default_mtrl_alpha, C0121e.abc_textfield_default_mtrl_alpha, C0121e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f835e = {C0121e.abc_ic_commit_search_api_mtrl_alpha, C0121e.abc_seekbar_tick_mark_material, C0121e.abc_ic_menu_share_mtrl_alpha, C0121e.abc_ic_menu_copy_mtrl_am_alpha, C0121e.abc_ic_menu_cut_mtrl_alpha, C0121e.abc_ic_menu_selectall_mtrl_alpha, C0121e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f836f = {C0121e.abc_textfield_activated_mtrl_alpha, C0121e.abc_textfield_search_activated_mtrl_alpha, C0121e.abc_cab_background_top_mtrl_alpha, C0121e.abc_text_cursor_material, C0121e.abc_text_select_handle_left_mtrl_dark, C0121e.abc_text_select_handle_middle_mtrl_dark, C0121e.abc_text_select_handle_right_mtrl_dark, C0121e.abc_text_select_handle_left_mtrl_light, C0121e.abc_text_select_handle_middle_mtrl_light, C0121e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f837g = {C0121e.abc_popup_background_mtrl_mult, C0121e.abc_cab_background_internal_bg, C0121e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f838h = {C0121e.abc_tab_indicator_material, C0121e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f839i = {C0121e.abc_btn_check_material, C0121e.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, C0257dl<ColorStateList>> f840j;

    /* renamed from: k */
    private C0243de<String, C0151d> f841k;

    /* renamed from: l */
    private C0257dl<String> f842l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0248dh<WeakReference<ConstantState>>> f843m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f844n;

    /* renamed from: o */
    private boolean f845o;

    /* renamed from: bi$a */
    static class C0148a implements C0151d {
        C0148a() {
        }

        /* renamed from: a */
        public final Drawable mo970a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0787p.m2611a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: bi$b */
    static class C0149b implements C0151d {
        C0149b() {
        }

        /* renamed from: a */
        public final Drawable mo970a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0555jh.m1730a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: bi$c */
    static class C0150c extends C0249di<Integer, PorterDuffColorFilter> {
        public C0150c() {
            super(6);
        }

        /* renamed from: a */
        static int m501a(int i, Mode mode) {
            return (31 * (i + 31)) + mode.hashCode();
        }
    }

    /* renamed from: bi$d */
    interface C0151d {
        /* renamed from: a */
        Drawable mo970a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: bi$e */
    static class C0152e implements C0151d {
        C0152e() {
        }

        /* renamed from: a */
        public final Drawable mo970a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0565jn.m1748a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m481a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    private static synchronized PorterDuffColorFilter m482a(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0147bi.class) {
            porterDuffColorFilter = (PorterDuffColorFilter) f833c.mo1410a(Integer.valueOf(C0150c.m501a(i, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                f833c.mo1411a(Integer.valueOf(C0150c.m501a(i, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    private Drawable m483a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList b = mo969b(context, i);
        Mode mode = null;
        if (b != null) {
            if (C0181cb.m607b(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = C0345fn.m1156d(drawable);
            C0345fn.m1147a(drawable, b);
            if (i == C0121e.abc_switch_thumb_material) {
                mode = Mode.MULTIPLY;
            }
            if (mode != null) {
                C0345fn.m1150a(drawable, mode);
                return drawable;
            }
        } else {
            if (i == C0121e.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                m486a(layerDrawable.findDrawableByLayerId(16908288), C0211cn.m669a(context, C0117a.colorControlNormal), f831a);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C0117a.colorControlNormal;
            } else if (i == C0121e.abc_ratingbar_material || i == C0121e.abc_ratingbar_indicator_material || i == C0121e.abc_ratingbar_small_material) {
                layerDrawable = (LayerDrawable) drawable;
                m486a(layerDrawable.findDrawableByLayerId(16908288), C0211cn.m671c(context, C0117a.colorControlNormal), f831a);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C0117a.colorControlActivated;
            } else if (!m489a(context, i, drawable) && z) {
                return null;
            }
            m486a(findDrawableByLayerId, C0211cn.m669a(context, i2), f831a);
            m486a(layerDrawable.findDrawableByLayerId(16908301), C0211cn.m669a(context, C0117a.colorControlActivated), f831a);
            return drawable;
        }
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m484a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, dh<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f843m     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0045 }
            dh r0 = (p000.C0248dh) r0     // Catch:{ all -> 0x0045 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo1405a(r5, r1)     // Catch:{ all -> 0x0045 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0045 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0045 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0045 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f1179c     // Catch:{ all -> 0x0045 }
            int r2 = r0.f1181e     // Catch:{ all -> 0x0045 }
            int r4 = p000.C0247dg.m800a(r4, r2, r5)     // Catch:{ all -> 0x0045 }
            if (r4 < 0) goto L_0x0043
            java.lang.Object[] r5 = r0.f1180d     // Catch:{ all -> 0x0045 }
            r5 = r5[r4]     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = p000.C0248dh.f1177a     // Catch:{ all -> 0x0045 }
            if (r5 == r6) goto L_0x0043
            java.lang.Object[] r5 = r0.f1180d     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = p000.C0248dh.f1177a     // Catch:{ all -> 0x0045 }
            r5[r4] = r6     // Catch:{ all -> 0x0045 }
            r4 = 1
            r0.f1178b = r4     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r3)
            return r1
        L_0x0045:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0147bi.m484a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static synchronized C0147bi m485a() {
        C0147bi biVar;
        synchronized (C0147bi.class) {
            if (f832b == null) {
                C0147bi biVar2 = new C0147bi();
                f832b = biVar2;
                if (VERSION.SDK_INT < 24) {
                    biVar2.m488a("vector", (C0151d) new C0152e());
                    biVar2.m488a("animated-vector", (C0151d) new C0149b());
                    biVar2.m488a("animated-selector", (C0151d) new C0148a());
                }
            }
            biVar = f832b;
        }
        return biVar;
    }

    /* renamed from: a */
    private static void m486a(Drawable drawable, int i, Mode mode) {
        if (C0181cb.m607b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f831a;
        }
        drawable.setColorFilter(m482a(i, mode));
    }

    /* renamed from: a */
    static void m487a(Drawable drawable, C0213cp cpVar, int[] iArr) {
        if (!C0181cb.m607b(drawable) || drawable.mutate() == drawable) {
            if (cpVar.f1084d || cpVar.f1083c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = cpVar.f1084d ? cpVar.f1081a : null;
                Mode mode = cpVar.f1083c ? cpVar.f1082b : f831a;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = m482a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private void m488a(String str, C0151d dVar) {
        if (this.f841k == null) {
            this.f841k = new C0243de<>();
        }
        this.f841k.put(str, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m489a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f831a
            int[] r1 = f834d
            boolean r1 = m491a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = p000.C0116b.C0117a.colorControlNormal
        L_0x0012:
            r1 = r3
        L_0x0013:
            r7 = r5
            goto L_0x0043
        L_0x0015:
            int[] r1 = f836f
            boolean r1 = m491a(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = p000.C0116b.C0117a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = f837g
            boolean r1 = m491a(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = p000.C0116b.C0121e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003b
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            goto L_0x0013
        L_0x003b:
            int r1 = p000.C0116b.C0121e.abc_dialog_material_background
            if (r7 != r1) goto L_0x0040
            goto L_0x0012
        L_0x0040:
            r1 = r3
            r7 = r4
            r2 = r7
        L_0x0043:
            if (r7 == 0) goto L_0x0060
            boolean r7 = p000.C0181cb.m607b(r8)
            if (r7 == 0) goto L_0x004f
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004f:
            int r6 = p000.C0211cn.m669a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m482a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x005f
            r8.setAlpha(r1)
        L_0x005f:
            return r5
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0147bi.m489a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private synchronized boolean m490a(Context context, long j, Drawable drawable) {
        boolean z;
        ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0248dh dhVar = (C0248dh) this.f843m.get(context);
            if (dhVar == null) {
                dhVar = new C0248dh();
                this.f843m.put(context, dhVar);
            }
            dhVar.mo1406b(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m491a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private Drawable m492c(Context context, int i) {
        int next;
        if (this.f841k == null || this.f841k.isEmpty()) {
            return null;
        }
        if (this.f842l != null) {
            String str = (String) this.f842l.mo1489a(i, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f841k.get(str) == null)) {
                return null;
            }
        } else {
            this.f842l = new C0257dl<>();
        }
        if (this.f844n == null) {
            this.f844n = new TypedValue();
        }
        TypedValue typedValue = this.f844n;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = m481a(typedValue);
        Drawable a2 = m484a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f842l.mo1495c(i, name);
                C0151d dVar = (C0151d) this.f841k.get(name);
                if (dVar != null) {
                    a2 = dVar.mo970a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a2 != null) {
                    a2.setChangingConfigurations(typedValue.changingConfigurations);
                    m490a(context, a, a2);
                }
            } catch (Exception e) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e);
            }
        }
        if (a2 == null) {
            this.f842l.mo1495c(i, "appcompat_skip_skip");
        }
        return a2;
    }

    /* renamed from: d */
    private static ColorStateList m493d(Context context, int i) {
        int a = C0211cn.m669a(context, C0117a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0211cn.f1067a, C0211cn.f1070d, C0211cn.f1068b, C0211cn.f1074h}, new int[]{C0211cn.m671c(context, C0117a.colorButtonNormal), C0331fe.m1084a(a, i), C0331fe.m1084a(a, i), i});
    }

    /* renamed from: a */
    public final synchronized Drawable mo965a(Context context, int i) {
        return mo966a(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo966a(android.content.Context r9, int r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f845o     // Catch:{ all -> 0x0093 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0035
            r8.f845o = r2     // Catch:{ all -> 0x0093 }
            int r0 = p000.C0116b.C0121e.abc_vector_test     // Catch:{ all -> 0x0093 }
            android.graphics.drawable.Drawable r0 = r8.mo965a(r9, r0)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x002b
            boolean r3 = r0 instanceof p000.C0565jn     // Catch:{ all -> 0x0093 }
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0093 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = r1
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            if (r0 != 0) goto L_0x0035
        L_0x002b:
            r8.f845o = r1     // Catch:{ all -> 0x0093 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0093 }
            java.lang.String r10 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r9.<init>(r10)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x0035:
            android.graphics.drawable.Drawable r0 = r8.m492c(r9, r10)     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0080
            android.util.TypedValue r0 = r8.f844n     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0046
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            r8.f844n = r0     // Catch:{ all -> 0x0093 }
        L_0x0046:
            android.util.TypedValue r0 = r8.f844n     // Catch:{ all -> 0x0093 }
            android.content.res.Resources r3 = r9.getResources()     // Catch:{ all -> 0x0093 }
            r3.getValue(r10, r0, r2)     // Catch:{ all -> 0x0093 }
            long r3 = m481a(r0)     // Catch:{ all -> 0x0093 }
            android.graphics.drawable.Drawable r5 = r8.m484a(r9, r3)     // Catch:{ all -> 0x0093 }
            if (r5 != 0) goto L_0x007f
            int r6 = p000.C0116b.C0121e.abc_cab_background_top_material     // Catch:{ all -> 0x0093 }
            if (r10 != r6) goto L_0x0075
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x0093 }
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]     // Catch:{ all -> 0x0093 }
            int r7 = p000.C0116b.C0121e.abc_cab_background_internal_bg     // Catch:{ all -> 0x0093 }
            android.graphics.drawable.Drawable r7 = r8.mo965a(r9, r7)     // Catch:{ all -> 0x0093 }
            r6[r1] = r7     // Catch:{ all -> 0x0093 }
            int r1 = p000.C0116b.C0121e.abc_cab_background_top_mtrl_alpha     // Catch:{ all -> 0x0093 }
            android.graphics.drawable.Drawable r1 = r8.mo965a(r9, r1)     // Catch:{ all -> 0x0093 }
            r6[r2] = r1     // Catch:{ all -> 0x0093 }
            r5.<init>(r6)     // Catch:{ all -> 0x0093 }
        L_0x0075:
            if (r5 == 0) goto L_0x007f
            int r0 = r0.changingConfigurations     // Catch:{ all -> 0x0093 }
            r5.setChangingConfigurations(r0)     // Catch:{ all -> 0x0093 }
            r8.m490a(r9, r3, r5)     // Catch:{ all -> 0x0093 }
        L_0x007f:
            r0 = r5
        L_0x0080:
            if (r0 != 0) goto L_0x0086
            android.graphics.drawable.Drawable r0 = p000.C0313ev.m1047a(r9, r10)     // Catch:{ all -> 0x0093 }
        L_0x0086:
            if (r0 == 0) goto L_0x008c
            android.graphics.drawable.Drawable r0 = r8.m483a(r9, r10, r11, r0)     // Catch:{ all -> 0x0093 }
        L_0x008c:
            if (r0 == 0) goto L_0x0091
            p000.C0181cb.m606a(r0)     // Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r8)
            return r0
        L_0x0093:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0147bi.mo966a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized Drawable mo967a(Context context, C0224cw cwVar, int i) {
        Drawable c = m492c(context, i);
        if (c == null) {
            c = cwVar.mo1336a(i);
        }
        if (c == null) {
            return null;
        }
        return m483a(context, i, false, c);
    }

    /* renamed from: a */
    public final synchronized void mo968a(Context context) {
        C0248dh dhVar = (C0248dh) this.f843m.get(context);
        if (dhVar != null) {
            int i = dhVar.f1181e;
            Object[] objArr = dhVar.f1180d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            dhVar.f1181e = 0;
            dhVar.f1178b = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList mo969b(android.content.Context r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.WeakHashMap<android.content.Context, dl<android.content.res.ColorStateList>> r0 = r7.f840j     // Catch:{ all -> 0x011d }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.util.WeakHashMap<android.content.Context, dl<android.content.res.ColorStateList>> r0 = r7.f840j     // Catch:{ all -> 0x011d }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x011d }
            dl r0 = (p000.C0257dl) r0     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.mo1489a(r9, r1)     // Catch:{ all -> 0x011d }
            r1 = r0
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1     // Catch:{ all -> 0x011d }
        L_0x0017:
            if (r1 != 0) goto L_0x011b
            int r0 = p000.C0116b.C0121e.abc_edit_text_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x0026
            int r0 = p000.C0116b.C0119c.abc_tint_edittext     // Catch:{ all -> 0x011d }
        L_0x001f:
            android.content.res.ColorStateList r0 = p000.C0785o.m2607a(r8, r0)     // Catch:{ all -> 0x011d }
        L_0x0023:
            r1 = r0
            goto L_0x00f7
        L_0x0026:
            int r0 = p000.C0116b.C0121e.abc_switch_track_mtrl_alpha     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x002d
            int r0 = p000.C0116b.C0119c.abc_tint_switch_track     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x002d:
            int r0 = p000.C0116b.C0121e.abc_switch_thumb_material     // Catch:{ all -> 0x011d }
            r2 = 0
            if (r9 != r0) goto L_0x0095
            r0 = 3
            int[][] r1 = new int[r0][]     // Catch:{ all -> 0x011d }
            int[] r0 = new int[r0]     // Catch:{ all -> 0x011d }
            int r3 = p000.C0116b.C0117a.colorSwitchThumbNormal     // Catch:{ all -> 0x011d }
            android.content.res.ColorStateList r3 = p000.C0211cn.m670b(r8, r3)     // Catch:{ all -> 0x011d }
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x006a
            boolean r6 = r3.isStateful()     // Catch:{ all -> 0x011d }
            if (r6 == 0) goto L_0x006a
            int[] r6 = p000.C0211cn.f1067a     // Catch:{ all -> 0x011d }
            r1[r2] = r6     // Catch:{ all -> 0x011d }
            r6 = r1[r2]     // Catch:{ all -> 0x011d }
            int r6 = r3.getColorForState(r6, r2)     // Catch:{ all -> 0x011d }
            r0[r2] = r6     // Catch:{ all -> 0x011d }
            int[] r2 = p000.C0211cn.f1071e     // Catch:{ all -> 0x011d }
            r1[r5] = r2     // Catch:{ all -> 0x011d }
            int r2 = p000.C0116b.C0117a.colorControlActivated     // Catch:{ all -> 0x011d }
            int r2 = p000.C0211cn.m669a(r8, r2)     // Catch:{ all -> 0x011d }
            r0[r5] = r2     // Catch:{ all -> 0x011d }
            int[] r2 = p000.C0211cn.f1074h     // Catch:{ all -> 0x011d }
            r1[r4] = r2     // Catch:{ all -> 0x011d }
            int r2 = r3.getDefaultColor()     // Catch:{ all -> 0x011d }
            r0[r4] = r2     // Catch:{ all -> 0x011d }
            goto L_0x008e
        L_0x006a:
            int[] r3 = p000.C0211cn.f1067a     // Catch:{ all -> 0x011d }
            r1[r2] = r3     // Catch:{ all -> 0x011d }
            int r3 = p000.C0116b.C0117a.colorSwitchThumbNormal     // Catch:{ all -> 0x011d }
            int r3 = p000.C0211cn.m671c(r8, r3)     // Catch:{ all -> 0x011d }
            r0[r2] = r3     // Catch:{ all -> 0x011d }
            int[] r2 = p000.C0211cn.f1071e     // Catch:{ all -> 0x011d }
            r1[r5] = r2     // Catch:{ all -> 0x011d }
            int r2 = p000.C0116b.C0117a.colorControlActivated     // Catch:{ all -> 0x011d }
            int r2 = p000.C0211cn.m669a(r8, r2)     // Catch:{ all -> 0x011d }
            r0[r5] = r2     // Catch:{ all -> 0x011d }
            int[] r2 = p000.C0211cn.f1074h     // Catch:{ all -> 0x011d }
            r1[r4] = r2     // Catch:{ all -> 0x011d }
            int r2 = p000.C0116b.C0117a.colorSwitchThumbNormal     // Catch:{ all -> 0x011d }
            int r2 = p000.C0211cn.m669a(r8, r2)     // Catch:{ all -> 0x011d }
            r0[r4] = r2     // Catch:{ all -> 0x011d }
        L_0x008e:
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList     // Catch:{ all -> 0x011d }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x011d }
            r1 = r2
            goto L_0x00f7
        L_0x0095:
            int r0 = p000.C0116b.C0121e.abc_btn_default_mtrl_shape     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00a5
            int r0 = p000.C0116b.C0117a.colorButtonNormal     // Catch:{ all -> 0x011d }
            int r0 = p000.C0211cn.m669a(r8, r0)     // Catch:{ all -> 0x011d }
        L_0x009f:
            android.content.res.ColorStateList r0 = m493d(r8, r0)     // Catch:{ all -> 0x011d }
            goto L_0x0023
        L_0x00a5:
            int r0 = p000.C0116b.C0121e.abc_btn_borderless_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00af
            android.content.res.ColorStateList r0 = m493d(r8, r2)     // Catch:{ all -> 0x011d }
            goto L_0x0023
        L_0x00af:
            int r0 = p000.C0116b.C0121e.abc_btn_colored_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00ba
            int r0 = p000.C0116b.C0117a.colorAccent     // Catch:{ all -> 0x011d }
            int r0 = p000.C0211cn.m669a(r8, r0)     // Catch:{ all -> 0x011d }
            goto L_0x009f
        L_0x00ba:
            int r0 = p000.C0116b.C0121e.abc_spinner_mtrl_am_alpha     // Catch:{ all -> 0x011d }
            if (r9 == r0) goto L_0x00f3
            int r0 = p000.C0116b.C0121e.abc_spinner_textfield_background_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00c3
            goto L_0x00f3
        L_0x00c3:
            int[] r0 = f835e     // Catch:{ all -> 0x011d }
            boolean r0 = m491a(r0, r9)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00d3
            int r0 = p000.C0116b.C0117a.colorControlNormal     // Catch:{ all -> 0x011d }
            android.content.res.ColorStateList r0 = p000.C0211cn.m670b(r8, r0)     // Catch:{ all -> 0x011d }
            goto L_0x0023
        L_0x00d3:
            int[] r0 = f838h     // Catch:{ all -> 0x011d }
            boolean r0 = m491a(r0, r9)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00df
            int r0 = p000.C0116b.C0119c.abc_tint_default     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x00df:
            int[] r0 = f839i     // Catch:{ all -> 0x011d }
            boolean r0 = m491a(r0, r9)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00eb
            int r0 = p000.C0116b.C0119c.abc_tint_btn_checkable     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x00eb:
            int r0 = p000.C0116b.C0121e.abc_seekbar_thumb_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00f7
            int r0 = p000.C0116b.C0119c.abc_tint_seek_thumb     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x00f3:
            int r0 = p000.C0116b.C0119c.abc_tint_spinner     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x00f7:
            if (r1 == 0) goto L_0x011b
            java.util.WeakHashMap<android.content.Context, dl<android.content.res.ColorStateList>> r0 = r7.f840j     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x0104
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x011d }
            r0.<init>()     // Catch:{ all -> 0x011d }
            r7.f840j = r0     // Catch:{ all -> 0x011d }
        L_0x0104:
            java.util.WeakHashMap<android.content.Context, dl<android.content.res.ColorStateList>> r0 = r7.f840j     // Catch:{ all -> 0x011d }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x011d }
            dl r0 = (p000.C0257dl) r0     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x0118
            dl r0 = new dl     // Catch:{ all -> 0x011d }
            r0.<init>()     // Catch:{ all -> 0x011d }
            java.util.WeakHashMap<android.content.Context, dl<android.content.res.ColorStateList>> r2 = r7.f840j     // Catch:{ all -> 0x011d }
            r2.put(r8, r0)     // Catch:{ all -> 0x011d }
        L_0x0118:
            r0.mo1495c(r9, r1)     // Catch:{ all -> 0x011d }
        L_0x011b:
            monitor-exit(r7)
            return r1
        L_0x011d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0147bi.mo969b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
