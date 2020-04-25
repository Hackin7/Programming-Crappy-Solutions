package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.C0051a;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: n */
public class C0748n extends C0177c implements C0051a {

    /* renamed from: s */
    static final /* synthetic */ boolean f3201s = true;

    /* renamed from: t */
    private static final Interpolator f3202t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f3203u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f3204A;

    /* renamed from: B */
    private boolean f3205B;

    /* renamed from: C */
    private ArrayList<Object> f3206C = new ArrayList<>();

    /* renamed from: D */
    private boolean f3207D;

    /* renamed from: E */
    private int f3208E = 0;

    /* renamed from: F */
    private boolean f3209F;

    /* renamed from: G */
    private boolean f3210G = true;

    /* renamed from: H */
    private boolean f3211H;

    /* renamed from: a */
    Context f3212a;

    /* renamed from: b */
    ActionBarOverlayLayout f3213b;

    /* renamed from: c */
    ActionBarContainer f3214c;

    /* renamed from: d */
    C0180ca f3215d;

    /* renamed from: e */
    ActionBarContextView f3216e;

    /* renamed from: f */
    View f3217f;

    /* renamed from: g */
    C0205cl f3218g;

    /* renamed from: h */
    C0752a f3219h;

    /* renamed from: i */
    C0802u f3220i;

    /* renamed from: j */
    C0803a f3221j;

    /* renamed from: k */
    boolean f3222k = true;

    /* renamed from: l */
    boolean f3223l;

    /* renamed from: m */
    boolean f3224m;

    /* renamed from: n */
    C0003aa f3225n;

    /* renamed from: o */
    boolean f3226o;

    /* renamed from: p */
    final C0406gu f3227p = new C0407gv() {
        /* renamed from: b */
        public final void mo8b(View view) {
            if (C0748n.this.f3222k && C0748n.this.f3217f != null) {
                C0748n.this.f3217f.setTranslationY(0.0f);
                C0748n.this.f3214c.setTranslationY(0.0f);
            }
            C0748n.this.f3214c.setVisibility(8);
            C0748n.this.f3214c.setTransitioning(false);
            C0748n.this.f3225n = null;
            C0748n nVar = C0748n.this;
            if (nVar.f3221j != null) {
                nVar.f3221j.mo1862a(nVar.f3220i);
                nVar.f3220i = null;
                nVar.f3221j = null;
            }
            if (C0748n.this.f3213b != null) {
                C0396gq.m1270g(C0748n.this.f3213b);
            }
        }
    };

    /* renamed from: q */
    final C0406gu f3228q = new C0407gv() {
        /* renamed from: b */
        public final void mo8b(View view) {
            C0748n.this.f3225n = null;
            C0748n.this.f3214c.requestLayout();
        }
    };

    /* renamed from: r */
    final C0408gw f3229r = new C0408gw() {
        /* renamed from: a */
        public final void mo1831a() {
            ((View) C0748n.this.f3214c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f3230v;

    /* renamed from: w */
    private Activity f3231w;

    /* renamed from: x */
    private Dialog f3232x;

    /* renamed from: y */
    private ArrayList<Object> f3233y = new ArrayList<>();

    /* renamed from: z */
    private int f3234z = -1;

    /* renamed from: n$a */
    public class C0752a extends C0802u implements C0020a {

        /* renamed from: a */
        final C0019aj f3238a;

        /* renamed from: e */
        private final Context f3240e;

        /* renamed from: f */
        private C0803a f3241f;

        /* renamed from: g */
        private WeakReference<View> f3242g;

        public C0752a(Context context, C0803a aVar) {
            this.f3240e = context;
            this.f3241f = aVar;
            C0019aj ajVar = new C0019aj(context);
            this.f3238a = ajVar;
            this.f3238a.mo144a((C0020a) this);
        }

        /* renamed from: a */
        public final MenuInflater mo2584a() {
            return new C0817z(this.f3240e);
        }

        /* renamed from: a */
        public final void mo2585a(int i) {
            mo2591b((CharSequence) C0748n.this.f3212a.getResources().getString(i));
        }

        /* renamed from: a */
        public final void mo193a(C0019aj ajVar) {
            if (this.f3241f != null) {
                mo2593d();
                C0748n.this.f3216e.mo395a();
            }
        }

        /* renamed from: a */
        public final void mo2586a(View view) {
            C0748n.this.f3216e.setCustomView(view);
            this.f3242g = new WeakReference<>(view);
        }

        /* renamed from: a */
        public final void mo2587a(CharSequence charSequence) {
            C0748n.this.f3216e.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public final void mo2588a(boolean z) {
            super.mo2588a(z);
            C0748n.this.f3216e.setTitleOptional(z);
        }

        /* renamed from: a */
        public final boolean mo194a(C0019aj ajVar, MenuItem menuItem) {
            if (this.f3241f != null) {
                return this.f3241f.mo1864a((C0802u) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public final Menu mo2589b() {
            return this.f3238a;
        }

        /* renamed from: b */
        public final void mo2590b(int i) {
            mo2587a((CharSequence) C0748n.this.f3212a.getResources().getString(i));
        }

        /* renamed from: b */
        public final void mo2591b(CharSequence charSequence) {
            C0748n.this.f3216e.setTitle(charSequence);
        }

        /* renamed from: c */
        public final void mo2592c() {
            if (C0748n.this.f3219h == this) {
                if (!C0748n.m2327a(C0748n.this.f3223l, C0748n.this.f3224m, false)) {
                    C0748n.this.f3220i = this;
                    C0748n.this.f3221j = this.f3241f;
                } else {
                    this.f3241f.mo1862a(this);
                }
                this.f3241f = null;
                C0748n.this.mo2583e(false);
                ActionBarContextView actionBarContextView = C0748n.this.f3216e;
                if (actionBarContextView.f337g == null) {
                    actionBarContextView.mo396b();
                }
                C0748n.this.f3215d.mo1128a().sendAccessibilityEvent(32);
                C0748n.this.f3213b.setHideOnContentScrollEnabled(C0748n.this.f3226o);
                C0748n.this.f3219h = null;
            }
        }

        /* renamed from: d */
        public final void mo2593d() {
            if (C0748n.this.f3219h == this) {
                this.f3238a.mo171e();
                try {
                    this.f3241f.mo1865b(this, this.f3238a);
                } finally {
                    this.f3238a.mo172f();
                }
            }
        }

        /* renamed from: e */
        public final boolean mo2594e() {
            this.f3238a.mo171e();
            try {
                return this.f3241f.mo1863a((C0802u) this, (Menu) this.f3238a);
            } finally {
                this.f3238a.mo172f();
            }
        }

        /* renamed from: f */
        public final CharSequence mo2595f() {
            return C0748n.this.f3216e.getTitle();
        }

        /* renamed from: g */
        public final CharSequence mo2596g() {
            return C0748n.this.f3216e.getSubtitle();
        }

        /* renamed from: h */
        public final boolean mo2597h() {
            return C0748n.this.f3216e.f338h;
        }

        /* renamed from: i */
        public final View mo2598i() {
            if (this.f3242g != null) {
                return (View) this.f3242g.get();
            }
            return null;
        }
    }

    public C0748n(Activity activity, boolean z) {
        this.f3231w = activity;
        View decorView = activity.getWindow().getDecorView();
        m2326a(decorView);
        if (!z) {
            this.f3217f = decorView.findViewById(16908290);
        }
    }

    public C0748n(Dialog dialog) {
        this.f3232x = dialog;
        m2326a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m2326a(View view) {
        C0180ca caVar;
        this.f3213b = (ActionBarOverlayLayout) view.findViewById(C0122f.decor_content_parent);
        if (this.f3213b != null) {
            this.f3213b.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(C0122f.action_bar);
        if (findViewById instanceof C0180ca) {
            caVar = (C0180ca) findViewById;
        } else if (findViewById instanceof Toolbar) {
            caVar = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.f3215d = caVar;
        this.f3216e = (ActionBarContextView) view.findViewById(C0122f.action_context_bar);
        this.f3214c = (ActionBarContainer) view.findViewById(C0122f.action_bar_container);
        if (this.f3215d == null || this.f3216e == null || this.f3214c == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb2.toString());
        }
        this.f3212a = this.f3215d.mo1138b();
        if ((this.f3215d.mo1154o() & 4) != 0) {
            this.f3204A = true;
        }
        C0801t a = C0801t.m2659a(this.f3212a);
        int i = a.f3390a.getApplicationInfo().targetSdkVersion;
        m2328f(a.mo2804b());
        TypedArray obtainStyledAttributes = this.f3212a.obtainStyledAttributes(null, C0126j.ActionBar, C0117a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0126j.ActionBar_hideOnContentScroll, false)) {
            if (!this.f3213b.f354b) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f3226o = true;
            this.f3213b.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0126j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            C0396gq.m1253a((View) this.f3214c, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    static boolean m2327a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: f */
    private void m2328f(boolean z) {
        this.f3207D = z;
        if (!this.f3207D) {
            this.f3215d.mo1135a((C0205cl) null);
            this.f3214c.setTabContainer(this.f3218g);
        } else {
            this.f3214c.setTabContainer(null);
            this.f3215d.mo1135a(this.f3218g);
        }
        boolean z2 = true;
        boolean z3 = this.f3215d.mo1155p() == 2;
        if (this.f3218g != null) {
            if (z3) {
                this.f3218g.setVisibility(0);
                if (this.f3213b != null) {
                    C0396gq.m1270g(this.f3213b);
                }
            } else {
                this.f3218g.setVisibility(8);
            }
        }
        this.f3215d.mo1137a(!this.f3207D && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3213b;
        if (this.f3207D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: g */
    private void m2329g(boolean z) {
        if (m2327a(this.f3223l, this.f3224m, this.f3209F)) {
            if (!this.f3210G) {
                this.f3210G = true;
                if (this.f3225n != null) {
                    this.f3225n.mo5b();
                }
                this.f3214c.setVisibility(0);
                if (this.f3208E != 0 || (!this.f3211H && !z)) {
                    this.f3214c.setAlpha(1.0f);
                    this.f3214c.setTranslationY(0.0f);
                    if (this.f3222k && this.f3217f != null) {
                        this.f3217f.setTranslationY(0.0f);
                    }
                    this.f3228q.mo8b(null);
                } else {
                    this.f3214c.setTranslationY(0.0f);
                    float f = (float) (-this.f3214c.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f3214c.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f3214c.setTranslationY(f);
                    C0003aa aaVar = new C0003aa();
                    C0402gt b = C0396gq.m1267d(this.f3214c).mo1826b(0.0f);
                    b.mo1824a(this.f3229r);
                    aaVar.mo2a(b);
                    if (this.f3222k && this.f3217f != null) {
                        this.f3217f.setTranslationY(f);
                        aaVar.mo2a(C0396gq.m1267d(this.f3217f).mo1826b(0.0f));
                    }
                    aaVar.mo1a(f3203u);
                    aaVar.mo6c();
                    aaVar.mo3a(this.f3228q);
                    this.f3225n = aaVar;
                    aaVar.mo4a();
                }
                if (this.f3213b != null) {
                    C0396gq.m1270g(this.f3213b);
                }
            }
        } else if (this.f3210G) {
            this.f3210G = false;
            if (this.f3225n != null) {
                this.f3225n.mo5b();
            }
            if (this.f3208E != 0 || (!this.f3211H && !z)) {
                this.f3227p.mo8b(null);
            } else {
                this.f3214c.setAlpha(1.0f);
                this.f3214c.setTransitioning(true);
                C0003aa aaVar2 = new C0003aa();
                float f2 = (float) (-this.f3214c.getHeight());
                if (z) {
                    int[] iArr2 = {0, 0};
                    this.f3214c.getLocationInWindow(iArr2);
                    f2 -= (float) iArr2[1];
                }
                C0402gt b2 = C0396gq.m1267d(this.f3214c).mo1826b(f2);
                b2.mo1824a(this.f3229r);
                aaVar2.mo2a(b2);
                if (this.f3222k && this.f3217f != null) {
                    aaVar2.mo2a(C0396gq.m1267d(this.f3217f).mo1826b(f2));
                }
                aaVar2.mo1a(f3202t);
                aaVar2.mo6c();
                aaVar2.mo3a(this.f3227p);
                this.f3225n = aaVar2;
                aaVar2.mo4a();
            }
        }
    }

    /* renamed from: a */
    public final int mo1109a() {
        return this.f3215d.mo1154o();
    }

    /* renamed from: a */
    public final C0802u mo1110a(C0803a aVar) {
        if (this.f3219h != null) {
            this.f3219h.mo2592c();
        }
        this.f3213b.setHideOnContentScrollEnabled(false);
        this.f3216e.mo396b();
        C0752a aVar2 = new C0752a(this.f3216e.getContext(), aVar);
        if (!aVar2.mo2594e()) {
            return null;
        }
        this.f3219h = aVar2;
        aVar2.mo2593d();
        this.f3216e.mo394a(aVar2);
        mo2583e(true);
        this.f3216e.sendAccessibilityEvent(32);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo466a(int i) {
        this.f3208E = i;
    }

    /* renamed from: a */
    public final void mo1111a(Configuration configuration) {
        m2328f(C0801t.m2659a(this.f3212a).mo2804b());
    }

    /* renamed from: a */
    public final void mo1112a(CharSequence charSequence) {
        this.f3215d.mo1136a(charSequence);
    }

    /* renamed from: a */
    public final void mo1113a(boolean z) {
        if (!this.f3204A) {
            int i = z ? 4 : 0;
            int o = this.f3215d.mo1154o();
            this.f3204A = true;
            this.f3215d.mo1140c((i & 4) | (o & -5));
        }
    }

    /* renamed from: a */
    public final boolean mo1114a(int i, KeyEvent keyEvent) {
        if (this.f3219h == null) {
            return false;
        }
        C0019aj ajVar = this.f3219h.f3238a;
        if (ajVar == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        ajVar.setQwertyMode(z);
        return ajVar.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public final Context mo1116b() {
        if (this.f3230v == null) {
            TypedValue typedValue = new TypedValue();
            this.f3212a.getTheme().resolveAttribute(C0117a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f3230v = new ContextThemeWrapper(this.f3212a, i);
            } else {
                this.f3230v = this.f3212a;
            }
        }
        return this.f3230v;
    }

    /* renamed from: b */
    public final void mo1117b(boolean z) {
        this.f3211H = z;
        if (!z && this.f3225n != null) {
            this.f3225n.mo5b();
        }
    }

    /* renamed from: c */
    public final void mo1118c(boolean z) {
        if (z != this.f3205B) {
            this.f3205B = z;
            int size = this.f3206C.size();
            for (int i = 0; i < size; i++) {
                this.f3206C.get(i);
            }
        }
    }

    /* renamed from: d */
    public final void mo467d(boolean z) {
        this.f3222k = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2583e(boolean r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0014
            boolean r1 = r8.f3209F
            if (r1 != 0) goto L_0x0026
            r1 = 1
            r8.f3209F = r1
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r8.f3213b
            if (r2 == 0) goto L_0x0023
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r8.f3213b
            r2.setShowingForActionMode(r1)
            goto L_0x0023
        L_0x0014:
            boolean r1 = r8.f3209F
            if (r1 == 0) goto L_0x0026
            r8.f3209F = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r8.f3213b
            if (r1 == 0) goto L_0x0023
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r8.f3213b
            r1.setShowingForActionMode(r0)
        L_0x0023:
            r8.m2329g(r0)
        L_0x0026:
            androidx.appcompat.widget.ActionBarContainer r1 = r8.f3214c
            boolean r1 = p000.C0396gq.m1275l(r1)
            r2 = 8
            r3 = 4
            if (r1 == 0) goto L_0x0089
            r4 = 200(0xc8, double:9.9E-322)
            r6 = 100
            if (r9 == 0) goto L_0x0044
            ca r9 = r8.f3215d
            gt r9 = r9.mo1129a(r3, r6)
            androidx.appcompat.widget.ActionBarContextView r1 = r8.f3216e
            gt r0 = r1.mo393a(r0, r4)
            goto L_0x0050
        L_0x0044:
            ca r9 = r8.f3215d
            gt r0 = r9.mo1129a(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f3216e
            gt r9 = r9.mo393a(r2, r6)
        L_0x0050:
            aa r1 = new aa
            r1.<init>()
            java.util.ArrayList<gt> r2 = r1.f0a
            r2.add(r9)
            java.lang.ref.WeakReference<android.view.View> r9 = r9.f1746a
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L_0x006d
            android.view.ViewPropertyAnimator r9 = r9.animate()
            long r2 = r9.getDuration()
            goto L_0x006f
        L_0x006d:
            r2 = 0
        L_0x006f:
            java.lang.ref.WeakReference<android.view.View> r9 = r0.f1746a
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L_0x0080
            android.view.ViewPropertyAnimator r9 = r9.animate()
            r9.setStartDelay(r2)
        L_0x0080:
            java.util.ArrayList<gt> r9 = r1.f0a
            r9.add(r0)
            r1.mo4a()
            return
        L_0x0089:
            if (r9 == 0) goto L_0x0096
            ca r9 = r8.f3215d
            r9.mo1143d(r3)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f3216e
            r9.setVisibility(r0)
            return
        L_0x0096:
            ca r9 = r8.f3215d
            r9.mo1143d(r0)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f3216e
            r9.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0748n.mo2583e(boolean):void");
    }

    /* renamed from: f */
    public final boolean mo1122f() {
        if (this.f3215d == null || !this.f3215d.mo1141c()) {
            return false;
        }
        this.f3215d.mo1142d();
        return true;
    }

    /* renamed from: h */
    public final void mo468h() {
        if (this.f3224m) {
            this.f3224m = false;
            m2329g(true);
        }
    }

    /* renamed from: i */
    public final void mo469i() {
        if (!this.f3224m) {
            this.f3224m = true;
            m2329g(true);
        }
    }

    /* renamed from: j */
    public final void mo470j() {
        if (this.f3225n != null) {
            this.f3225n.mo5b();
            this.f3225n = null;
        }
    }
}
