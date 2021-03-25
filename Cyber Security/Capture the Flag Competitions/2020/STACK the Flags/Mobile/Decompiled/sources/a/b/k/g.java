package a.b.k;

import a.b.o.b;
import a.b.o.f;
import a.b.o.j.e;
import a.b.o.j.g;
import a.b.o.j.m;
import a.b.p.c0;
import a.b.p.c1;
import a.b.p.d1;
import a.b.p.g0;
import a.b.p.w0;
import a.h.e.c.f;
import a.h.m.b0;
import a.h.m.e;
import a.h.m.x;
import a.h.m.z;
import a.m.d;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class g extends f implements g.a, LayoutInflater.Factory2 {
    public static final a.e.g<String, Integer> b0 = new a.e.g<>();
    public static final boolean c0 = false;
    public static final int[] d0 = {16842836};
    public static final boolean e0 = (!"robolectric".equals(Build.FINGERPRINT));
    public static final boolean f0 = true;
    public static boolean g0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public t[] H;
    public t I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public m S;
    public m T;
    public boolean U;
    public int V;
    public final Runnable W;
    public boolean X;
    public Rect Y;
    public Rect Z;
    public j a0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f9e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f10f;

    /* renamed from: g  reason: collision with root package name */
    public Window f11g;
    public k h;
    public final e i;
    public a j;
    public MenuInflater k;
    public CharSequence l;
    public c0 m;
    public i n;
    public u o;
    public a.b.o.b p;
    public ActionBarContextView q;
    public PopupWindow r;
    public Runnable s;
    public x t;
    public boolean u;
    public boolean v;
    public ViewGroup w;
    public TextView x;
    public View y;
    public boolean z;

    static {
        if (c0 && !g0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f12a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f12a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable throwable) {
            if (a(throwable)) {
                Throwable wrapped = new Resources.NotFoundException(throwable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                wrapped.initCause(throwable.getCause());
                wrapped.setStackTrace(throwable.getStackTrace());
                this.f12a.uncaughtException(thread, wrapped);
                return;
            }
            this.f12a.uncaughtException(thread, throwable);
        }

        public final boolean a(Throwable throwable) {
            String message;
            if (!(throwable instanceof Resources.NotFoundException) || (message = throwable.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            g gVar = g.this;
            if ((gVar.V & 1) != 0) {
                gVar.X(0);
            }
            g gVar2 = g.this;
            if ((gVar2.V & 4096) != 0) {
                gVar2.X(108);
            }
            g gVar3 = g.this;
            gVar3.U = false;
            gVar3.V = 0;
        }
    }

    public g(Activity activity, e callback) {
        this(activity, null, callback, activity);
    }

    public g(Dialog dialog, e callback) {
        this(dialog.getContext(), dialog.getWindow(), callback, dialog);
    }

    public g(Context context, Window window, e callback, Object host) {
        Integer value;
        d activity;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f10f = context;
        this.i = callback;
        this.f9e = host;
        if (this.O == -100 && (host instanceof Dialog) && (activity = K0()) != null) {
            this.O = activity.getDelegate().l();
        }
        if (this.O == -100 && (value = b0.get(this.f9e.getClass().getName())) != null) {
            this.O = value.intValue();
            b0.remove(this.f9e.getClass().getName());
        }
        if (window != null) {
            L(window);
        }
        a.b.p.j.h();
    }

    @Override // a.b.k.f
    public Context f(Context baseContext) {
        Configuration configOverlay;
        boolean needsThemeRebase = true;
        this.K = true;
        int modeToApply = q0(baseContext, M());
        if (f0 && (baseContext instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) baseContext, S(baseContext, modeToApply, null));
                return baseContext;
            } catch (IllegalStateException e2) {
            }
        }
        if (baseContext instanceof a.b.o.d) {
            try {
                ((a.b.o.d) baseContext).a(S(baseContext, modeToApply, null));
                return baseContext;
            } catch (IllegalStateException e3) {
            }
        }
        if (!e0) {
            super.f(baseContext);
            return baseContext;
        }
        try {
            Configuration appConfig = baseContext.getPackageManager().getResourcesForApplication(baseContext.getApplicationInfo()).getConfiguration();
            Configuration baseConfig = baseContext.getResources().getConfiguration();
            if (!appConfig.equals(baseConfig)) {
                configOverlay = c0(appConfig, baseConfig);
            } else {
                configOverlay = null;
            }
            Configuration config = S(baseContext, modeToApply, configOverlay);
            a.b.o.d wrappedContext = new a.b.o.d(baseContext, a.b.i.Theme_AppCompat_Empty);
            wrappedContext.a(config);
            try {
                if (baseContext.getTheme() == null) {
                    needsThemeRebase = false;
                }
            } catch (NullPointerException e4) {
                needsThemeRebase = false;
            }
            if (needsThemeRebase) {
                f.b.a(wrappedContext.getTheme());
            }
            super.f(wrappedContext);
            return wrappedContext;
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException("Application failed to obtain resources from itself", e5);
        }
    }

    public static class r {
        public static void a(ContextThemeWrapper context, Configuration overrideConfiguration) {
            context.applyOverrideConfiguration(overrideConfiguration);
        }
    }

    @Override // a.b.k.f
    public void r(Bundle savedInstanceState) {
        this.K = true;
        J(false);
        a0();
        Object obj = this.f9e;
        if (obj instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = a.h.d.e.c((Activity) obj);
            } catch (IllegalArgumentException e2) {
            }
            if (parentActivityName != null) {
                a ab = B0();
                if (ab == null) {
                    this.X = true;
                } else {
                    ab.l(true);
                }
            }
            f.c(this);
        }
        this.L = true;
    }

    @Override // a.b.k.f
    public void t(Bundle savedInstanceState) {
        Z();
    }

    @Override // a.b.k.f
    public a n() {
        j0();
        return this.j;
    }

    public final a B0() {
        return this.j;
    }

    public final Window.Callback i0() {
        return this.f11g.getCallback();
    }

    public final void j0() {
        Z();
        if (this.B && this.j == null) {
            Object obj = this.f9e;
            if (obj instanceof Activity) {
                this.j = new o((Activity) this.f9e, this.C);
            } else if (obj instanceof Dialog) {
                this.j = new o((Dialog) this.f9e);
            }
            a aVar = this.j;
            if (aVar != null) {
                aVar.l(this.X);
            }
        }
    }

    @Override // a.b.k.f
    public void E(Toolbar toolbar) {
        if (this.f9e instanceof Activity) {
            a ab = n();
            if (!(ab instanceof o)) {
                this.k = null;
                if (ab != null) {
                    ab.h();
                }
                if (toolbar != null) {
                    l tbab = new l(toolbar, h0(), this.h);
                    this.j = tbab;
                    this.f11g.setCallback(tbab.q());
                } else {
                    this.j = null;
                    this.f11g.setCallback(this.h);
                }
                p();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final Context d0() {
        Context context = null;
        a ab = n();
        if (ab != null) {
            context = ab.e();
        }
        if (context == null) {
            return this.f10f;
        }
        return context;
    }

    @Override // a.b.k.f
    public MenuInflater m() {
        if (this.k == null) {
            j0();
            a aVar = this.j;
            this.k = new a.b.o.g(aVar != null ? aVar.e() : this.f10f);
        }
        return this.k;
    }

    @Override // a.b.k.f
    public <T extends View> T i(int id) {
        Z();
        return (T) this.f11g.findViewById(id);
    }

    @Override // a.b.k.f
    public void q(Configuration newConfig) {
        a ab;
        if (this.B && this.v && (ab = n()) != null) {
            ab.g(newConfig);
        }
        a.b.p.j.b().g(this.f10f);
        J(false);
    }

    @Override // a.b.k.f
    public void w() {
        this.M = true;
        I();
    }

    @Override // a.b.k.f
    public void x() {
        this.M = false;
        a ab = n();
        if (ab != null) {
            ab.m(false);
        }
    }

    @Override // a.b.k.f
    public void u() {
        a ab = n();
        if (ab != null) {
            ab.m(true);
        }
    }

    @Override // a.b.k.f
    public void C(View v2) {
        Z();
        ViewGroup contentParent = (ViewGroup) this.w.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v2);
        this.h.a().onContentChanged();
    }

    @Override // a.b.k.f
    public void B(int resId) {
        Z();
        ViewGroup contentParent = (ViewGroup) this.w.findViewById(16908290);
        contentParent.removeAllViews();
        LayoutInflater.from(this.f10f).inflate(resId, contentParent);
        this.h.a().onContentChanged();
    }

    @Override // a.b.k.f
    public void D(View v2, ViewGroup.LayoutParams lp) {
        Z();
        ViewGroup contentParent = (ViewGroup) this.w.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v2, lp);
        this.h.a().onContentChanged();
    }

    @Override // a.b.k.f
    public void d(View v2, ViewGroup.LayoutParams lp) {
        Z();
        ((ViewGroup) this.w.findViewById(16908290)).addView(v2, lp);
        this.h.a().onContentChanged();
    }

    @Override // a.b.k.f
    public void v(Bundle outState) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    @Override // a.b.k.f
    public void s() {
        a aVar;
        if (this.f9e instanceof Activity) {
            f.y(this);
        }
        if (this.U) {
            this.f11g.getDecorView().removeCallbacks(this.W);
        }
        this.M = false;
        this.N = true;
        if (this.O != -100) {
            Object obj = this.f9e;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                b0.put(this.f9e.getClass().getName(), Integer.valueOf(this.O));
                aVar = this.j;
                if (aVar != null) {
                    aVar.h();
                }
                P();
            }
        }
        b0.remove(this.f9e.getClass().getName());
        aVar = this.j;
        if (aVar != null) {
        }
        P();
    }

    public final void P() {
        m mVar = this.S;
        if (mVar != null) {
            mVar.a();
        }
        m mVar2 = this.T;
        if (mVar2 != null) {
            mVar2.a();
        }
    }

    @Override // a.b.k.f
    public void F(int themeResId) {
        this.P = themeResId;
    }

    public final void a0() {
        if (this.f11g == null) {
            Object obj = this.f9e;
            if (obj instanceof Activity) {
                L(((Activity) obj).getWindow());
            }
        }
        if (this.f11g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void L(Window window) {
        if (this.f11g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof k)) {
                k kVar = new k(callback);
                this.h = kVar;
                window.setCallback(kVar);
                w0 a2 = w0.t(this.f10f, null, d0);
                Drawable winBg = a2.g(0);
                if (winBg != null) {
                    window.setBackgroundDrawable(winBg);
                }
                a2.v();
                this.f11g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void Z() {
        if (!this.v) {
            this.w = T();
            CharSequence title = h0();
            if (!TextUtils.isEmpty(title)) {
                c0 c0Var = this.m;
                if (c0Var != null) {
                    c0Var.setWindowTitle(title);
                } else if (B0() != null) {
                    B0().n(title);
                } else {
                    TextView textView = this.x;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            K();
            z0();
            this.v = true;
            t st = g0(0);
            if (!this.N && st.j == null) {
                n0(108);
            }
        }
    }

    public final ViewGroup T() {
        Context themedContext;
        TypedArray a2 = this.f10f.obtainStyledAttributes(a.b.j.AppCompatTheme);
        if (a2.hasValue(a.b.j.AppCompatTheme_windowActionBar)) {
            if (a2.getBoolean(a.b.j.AppCompatTheme_windowNoTitle, false)) {
                A(1);
            } else if (a2.getBoolean(a.b.j.AppCompatTheme_windowActionBar, false)) {
                A(108);
            }
            if (a2.getBoolean(a.b.j.AppCompatTheme_windowActionBarOverlay, false)) {
                A(109);
            }
            if (a2.getBoolean(a.b.j.AppCompatTheme_windowActionModeOverlay, false)) {
                A(10);
            }
            this.E = a2.getBoolean(a.b.j.AppCompatTheme_android_windowIsFloating, false);
            a2.recycle();
            a0();
            this.f11g.getDecorView();
            LayoutInflater inflater = LayoutInflater.from(this.f10f);
            ViewGroup subDecor = null;
            if (this.F) {
                subDecor = this.D ? (ViewGroup) inflater.inflate(a.b.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) inflater.inflate(a.b.g.abc_screen_simple, (ViewGroup) null);
            } else if (this.E) {
                subDecor = (ViewGroup) inflater.inflate(a.b.g.abc_dialog_title_material, (ViewGroup) null);
                this.C = false;
                this.B = false;
            } else if (this.B) {
                TypedValue outValue = new TypedValue();
                this.f10f.getTheme().resolveAttribute(a.b.a.actionBarTheme, outValue, true);
                if (outValue.resourceId != 0) {
                    themedContext = new a.b.o.d(this.f10f, outValue.resourceId);
                } else {
                    themedContext = this.f10f;
                }
                subDecor = (ViewGroup) LayoutInflater.from(themedContext).inflate(a.b.g.abc_screen_toolbar, (ViewGroup) null);
                c0 c0Var = (c0) subDecor.findViewById(a.b.f.decor_content_parent);
                this.m = c0Var;
                c0Var.setWindowCallback(i0());
                if (this.C) {
                    this.m.k(109);
                }
                if (this.z) {
                    this.m.k(2);
                }
                if (this.A) {
                    this.m.k(5);
                }
            }
            if (subDecor != null) {
                a.h.m.s.j0(subDecor, new c());
                if (this.m == null) {
                    this.x = (TextView) subDecor.findViewById(a.b.f.title);
                }
                d1.c(subDecor);
                ContentFrameLayout contentView = (ContentFrameLayout) subDecor.findViewById(a.b.f.action_bar_activity_content);
                ViewGroup windowContentView = (ViewGroup) this.f11g.findViewById(16908290);
                if (windowContentView != null) {
                    while (windowContentView.getChildCount() > 0) {
                        View child = windowContentView.getChildAt(0);
                        windowContentView.removeViewAt(0);
                        contentView.addView(child);
                    }
                    windowContentView.setId(-1);
                    contentView.setId(16908290);
                    if (windowContentView instanceof FrameLayout) {
                        ((FrameLayout) windowContentView).setForeground(null);
                    }
                }
                this.f11g.setContentView(subDecor);
                contentView.setAttachListener(new e());
                return subDecor;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        a2.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public class c implements a.h.m.p {
        public c() {
        }

        @Override // a.h.m.p
        public b0 a(View v, b0 insets) {
            int top = insets.g();
            int newTop = g.this.N0(insets, null);
            if (top != newTop) {
                insets = insets.l(insets.e(), newTop, insets.f(), insets.d());
            }
            return a.h.m.s.R(v, insets);
        }
    }

    public class d implements g0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f15a;

        public void a(Rect insets) {
            insets.top = this.f15a.N0(null, insets);
        }
    }

    public class e implements ContentFrameLayout.a {
        public e() {
        }

        public void a() {
        }

        public void b() {
            g.this.V();
        }
    }

    public void z0() {
    }

    public final void K() {
        ContentFrameLayout cfl = (ContentFrameLayout) this.w.findViewById(16908290);
        View windowDecor = this.f11g.getDecorView();
        cfl.a(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        TypedArray a2 = this.f10f.obtainStyledAttributes(a.b.j.AppCompatTheme);
        a2.getValue(a.b.j.AppCompatTheme_windowMinWidthMajor, cfl.getMinWidthMajor());
        a2.getValue(a.b.j.AppCompatTheme_windowMinWidthMinor, cfl.getMinWidthMinor());
        if (a2.hasValue(a.b.j.AppCompatTheme_windowFixedWidthMajor)) {
            a2.getValue(a.b.j.AppCompatTheme_windowFixedWidthMajor, cfl.getFixedWidthMajor());
        }
        if (a2.hasValue(a.b.j.AppCompatTheme_windowFixedWidthMinor)) {
            a2.getValue(a.b.j.AppCompatTheme_windowFixedWidthMinor, cfl.getFixedWidthMinor());
        }
        if (a2.hasValue(a.b.j.AppCompatTheme_windowFixedHeightMajor)) {
            a2.getValue(a.b.j.AppCompatTheme_windowFixedHeightMajor, cfl.getFixedHeightMajor());
        }
        if (a2.hasValue(a.b.j.AppCompatTheme_windowFixedHeightMinor)) {
            a2.getValue(a.b.j.AppCompatTheme_windowFixedHeightMinor, cfl.getFixedHeightMinor());
        }
        a2.recycle();
        cfl.requestLayout();
    }

    @Override // a.b.k.f
    public boolean A(int featureId) {
        int featureId2 = F0(featureId);
        if (this.F && featureId2 == 108) {
            return false;
        }
        if (this.B && featureId2 == 1) {
            this.B = false;
        }
        if (featureId2 == 1) {
            J0();
            this.F = true;
            return true;
        } else if (featureId2 == 2) {
            J0();
            this.z = true;
            return true;
        } else if (featureId2 == 5) {
            J0();
            this.A = true;
            return true;
        } else if (featureId2 == 10) {
            J0();
            this.D = true;
            return true;
        } else if (featureId2 == 108) {
            J0();
            this.B = true;
            return true;
        } else if (featureId2 != 109) {
            return this.f11g.requestFeature(featureId2);
        } else {
            J0();
            this.C = true;
            return true;
        }
    }

    @Override // a.b.k.f
    public final void G(CharSequence title) {
        this.l = title;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.setWindowTitle(title);
        } else if (B0() != null) {
            B0().n(title);
        } else {
            TextView textView = this.x;
            if (textView != null) {
                textView.setText(title);
            }
        }
    }

    public final CharSequence h0() {
        Object obj = this.f9e;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.l;
    }

    public void y0(int featureId) {
        if (featureId == 108) {
            a ab = n();
            if (ab != null) {
                ab.c(false);
            }
        } else if (featureId == 0) {
            t st = g0(featureId);
            if (st.o) {
                R(st, false);
            }
        }
    }

    public void x0(int featureId) {
        a ab;
        if (featureId == 108 && (ab = n()) != null) {
            ab.c(true);
        }
    }

    @Override // a.b.o.j.g.a
    public boolean a(a.b.o.j.g menu, MenuItem item) {
        t panel;
        Window.Callback cb = i0();
        if (cb == null || this.N || (panel = b0(menu.D())) == null) {
            return false;
        }
        return cb.onMenuItemSelected(panel.f32a, item);
    }

    @Override // a.b.o.j.g.a
    public void b(a.b.o.j.g menu) {
        E0(true);
    }

    @Override // a.b.k.f
    public a.b.o.b H(b.a callback) {
        e eVar;
        if (callback != null) {
            a.b.o.b bVar = this.p;
            if (bVar != null) {
                bVar.c();
            }
            b.a wrappedCallback = new j(callback);
            a ab = n();
            if (ab != null) {
                a.b.o.b o2 = ab.o(wrappedCallback);
                this.p = o2;
                if (!(o2 == null || (eVar = this.i) == null)) {
                    eVar.onSupportActionModeStarted(o2);
                }
            }
            if (this.p == null) {
                this.p = I0(wrappedCallback);
            }
            return this.p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // a.b.k.f
    public void p() {
        a ab = n();
        if (ab == null || !ab.f()) {
            n0(0);
        }
    }

    public a.b.o.b I0(b.a callback) {
        e eVar;
        Context actionBarContext;
        Y();
        a.b.o.b bVar = this.p;
        if (bVar != null) {
            bVar.c();
        }
        if (!(callback instanceof j)) {
            callback = new j(callback);
        }
        a.b.o.b mode = null;
        e eVar2 = this.i;
        if (eVar2 != null && !this.N) {
            try {
                mode = eVar2.onWindowStartingSupportActionMode(callback);
            } catch (AbstractMethodError e2) {
            }
        }
        if (mode != null) {
            this.p = mode;
        } else {
            boolean z2 = true;
            if (this.q == null) {
                if (this.E) {
                    TypedValue outValue = new TypedValue();
                    Resources.Theme baseTheme = this.f10f.getTheme();
                    baseTheme.resolveAttribute(a.b.a.actionBarTheme, outValue, true);
                    if (outValue.resourceId != 0) {
                        Resources.Theme actionBarTheme = this.f10f.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        a.b.o.d dVar = new a.b.o.d(this.f10f, 0);
                        dVar.getTheme().setTo(actionBarTheme);
                        actionBarContext = dVar;
                    } else {
                        actionBarContext = this.f10f;
                    }
                    this.q = new ActionBarContextView(actionBarContext);
                    PopupWindow popupWindow = new PopupWindow(actionBarContext, (AttributeSet) null, a.b.a.actionModePopupWindowStyle);
                    this.r = popupWindow;
                    a.h.n.h.b(popupWindow, 2);
                    this.r.setContentView(this.q);
                    this.r.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(a.b.a.actionBarSize, outValue, true);
                    this.q.setContentHeight(TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics()));
                    this.r.setHeight(-2);
                    this.s = new f();
                } else {
                    ViewStubCompat stub = (ViewStubCompat) this.w.findViewById(a.b.f.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(d0()));
                        this.q = (ActionBarContextView) stub.a();
                    }
                }
            }
            if (this.q != null) {
                Y();
                this.q.k();
                Context context = this.q.getContext();
                ActionBarContextView actionBarContextView = this.q;
                if (this.r != null) {
                    z2 = false;
                }
                a.b.o.e eVar3 = new a.b.o.e(context, actionBarContextView, callback, z2);
                if (callback.c(eVar3, eVar3.e())) {
                    eVar3.k();
                    this.q.h(eVar3);
                    this.p = eVar3;
                    if (G0()) {
                        this.q.setAlpha(0.0f);
                        x b2 = a.h.m.s.b(this.q);
                        b2.a(1.0f);
                        this.t = b2;
                        b2.f(new C0001g());
                    } else {
                        this.q.setAlpha(1.0f);
                        this.q.setVisibility(0);
                        this.q.sendAccessibilityEvent(32);
                        if (this.q.getParent() instanceof View) {
                            a.h.m.s.W((View) this.q.getParent());
                        }
                    }
                    if (this.r != null) {
                        this.f11g.getDecorView().post(this.s);
                    }
                } else {
                    this.p = null;
                }
            }
        }
        a.b.o.b bVar2 = this.p;
        if (!(bVar2 == null || (eVar = this.i) == null)) {
            eVar.onSupportActionModeStarted(bVar2);
        }
        return this.p;
    }

    public class f implements Runnable {
        public f() {
        }

        public void run() {
            g gVar = g.this;
            gVar.r.showAtLocation(gVar.q, 55, 0, 0);
            g.this.Y();
            if (g.this.G0()) {
                g.this.q.setAlpha(0.0f);
                g gVar2 = g.this;
                x b2 = a.h.m.s.b(gVar2.q);
                b2.a(1.0f);
                gVar2.t = b2;
                g.this.t.f(new a());
                return;
            }
            g.this.q.setAlpha(1.0f);
            g.this.q.setVisibility(0);
        }

        public class a extends z {
            public a() {
            }

            @Override // a.h.m.z, a.h.m.y
            public void b(View view) {
                g.this.q.setVisibility(0);
            }

            @Override // a.h.m.y
            public void a(View view) {
                g.this.q.setAlpha(1.0f);
                g.this.t.f(null);
                g.this.t = null;
            }
        }
    }

    /* renamed from: a.b.k.g$g  reason: collision with other inner class name */
    public class C0001g extends z {
        public C0001g() {
        }

        @Override // a.h.m.z, a.h.m.y
        public void b(View view) {
            g.this.q.setVisibility(0);
            g.this.q.sendAccessibilityEvent(32);
            if (g.this.q.getParent() instanceof View) {
                a.h.m.s.W((View) g.this.q.getParent());
            }
        }

        @Override // a.h.m.y
        public void a(View view) {
            g.this.q.setAlpha(1.0f);
            g.this.t.f(null);
            g.this.t = null;
        }
    }

    public final boolean G0() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && a.h.m.s.K(viewGroup);
    }

    public boolean p0() {
        return this.u;
    }

    public void Y() {
        x xVar = this.t;
        if (xVar != null) {
            xVar.b();
        }
    }

    public boolean r0() {
        a.b.o.b bVar = this.p;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        a ab = n();
        if (ab == null || !ab.b()) {
            return false;
        }
        return true;
    }

    public boolean u0(int keyCode, KeyEvent ev) {
        a ab = n();
        if (ab != null && ab.i(keyCode, ev)) {
            return true;
        }
        t tVar = this.I;
        if (tVar == null || !C0(tVar, ev.getKeyCode(), ev, 1)) {
            if (this.I == null) {
                t st = g0(0);
                D0(st, ev);
                boolean handled = C0(st, ev.getKeyCode(), ev, 1);
                st.m = false;
                if (handled) {
                    return true;
                }
            }
            return false;
        }
        t tVar2 = this.I;
        if (tVar2 != null) {
            tVar2.n = true;
        }
        return true;
    }

    public boolean W(KeyEvent event) {
        View root;
        Object obj = this.f9e;
        boolean isDown = true;
        if (((obj instanceof e.a) || (obj instanceof h)) && (root = this.f11g.getDecorView()) != null && a.h.m.e.d(root, event)) {
            return true;
        }
        if (event.getKeyCode() == 82 && this.h.a().dispatchKeyEvent(event)) {
            return true;
        }
        int keyCode = event.getKeyCode();
        if (event.getAction() != 0) {
            isDown = false;
        }
        return isDown ? s0(keyCode, event) : v0(keyCode, event);
    }

    public boolean v0(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            boolean wasLongPressBackDown = this.J;
            this.J = false;
            t st = g0(0);
            if (st.o) {
                if (!wasLongPressBackDown) {
                    R(st, true);
                }
                return true;
            } else if (r0()) {
                return true;
            }
        } else if (keyCode == 82) {
            w0(0, event);
            return true;
        }
        return false;
    }

    public boolean s0(int keyCode, KeyEvent event) {
        boolean z2 = true;
        if (keyCode == 4) {
            if ((event.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.J = z2;
        } else if (keyCode == 82) {
            t0(0, event);
            return true;
        }
        return false;
    }

    public View U(View parent, String name, Context context, AttributeSet attrs) {
        boolean z2 = false;
        if (this.a0 == null) {
            String viewInflaterClassName = this.f10f.obtainStyledAttributes(a.b.j.AppCompatTheme).getString(a.b.j.AppCompatTheme_viewInflaterClass);
            if (viewInflaterClassName == null) {
                this.a0 = new j();
            } else {
                try {
                    this.a0 = (j) Class.forName(viewInflaterClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable t2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t2);
                    this.a0 = new j();
                }
            }
        }
        boolean inheritContext = false;
        if (c0) {
            if (!(attrs instanceof XmlPullParser)) {
                z2 = H0((ViewParent) parent);
            } else if (((XmlPullParser) attrs).getDepth() > 1) {
                z2 = true;
            }
            inheritContext = z2;
        }
        j jVar = this.a0;
        boolean z3 = c0;
        c1.b();
        return jVar.createView(parent, name, context, attrs, inheritContext, z3, true, false);
    }

    public final boolean H0(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        View windowDecor = this.f11g.getDecorView();
        while (parent != null) {
            if (parent == windowDecor || !(parent instanceof View) || a.h.m.s.J((View) parent)) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }

    @Override // a.b.k.f
    public void o() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.f10f);
        if (layoutInflater.getFactory() == null) {
            a.h.m.f.a(layoutInflater, this);
        } else if (!(layoutInflater.getFactory2() instanceof g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return U(parent, name, context, attrs);
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    public final d K0() {
        for (Context context = this.f10f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof d) {
                return (d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    public final void A0(t st, KeyEvent event) {
        ViewGroup.LayoutParams lp;
        if (!st.o && !this.N) {
            if (st.f32a == 0) {
                if ((this.f10f.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback cb = i0();
            if (cb == null || cb.onMenuOpened(st.f32a, st.j)) {
                WindowManager wm = (WindowManager) this.f10f.getSystemService("window");
                if (wm != null && D0(st, event)) {
                    int width = -2;
                    if (st.f38g == null || st.q) {
                        ViewGroup viewGroup = st.f38g;
                        if (viewGroup == null) {
                            l0(st);
                            if (st.f38g == null) {
                                return;
                            }
                        } else if (st.q && viewGroup.getChildCount() > 0) {
                            st.f38g.removeAllViews();
                        }
                        if (!k0(st) || !st.b()) {
                            st.q = true;
                            return;
                        }
                        ViewGroup.LayoutParams lp2 = st.h.getLayoutParams();
                        if (lp2 == null) {
                            lp2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        st.f38g.setBackgroundResource(st.f33b);
                        ViewParent shownPanelParent = st.h.getParent();
                        if (shownPanelParent instanceof ViewGroup) {
                            ((ViewGroup) shownPanelParent).removeView(st.h);
                        }
                        st.f38g.addView(st.h, lp2);
                        if (!st.h.hasFocus()) {
                            st.h.requestFocus();
                        }
                    } else {
                        View view = st.i;
                        if (!(view == null || (lp = view.getLayoutParams()) == null || lp.width != -1)) {
                            width = -1;
                        }
                    }
                    st.n = false;
                    WindowManager.LayoutParams lp3 = new WindowManager.LayoutParams(width, -2, st.f35d, st.f36e, 1002, 8519680, -3);
                    lp3.gravity = st.f34c;
                    lp3.windowAnimations = st.f37f;
                    wm.addView(st.f38g, lp3);
                    st.o = true;
                    return;
                }
                return;
            }
            R(st, true);
        }
    }

    public final boolean l0(t st) {
        st.d(d0());
        st.f38g = new s(st.l);
        st.f34c = 81;
        return true;
    }

    public final void E0(boolean toggleMenuMode) {
        c0 c0Var = this.m;
        if (c0Var == null || !c0Var.g() || (ViewConfiguration.get(this.f10f).hasPermanentMenuKey() && !this.m.b())) {
            t st = g0(0);
            st.q = true;
            R(st, false);
            A0(st, null);
            return;
        }
        Window.Callback cb = i0();
        if (this.m.c() && toggleMenuMode) {
            this.m.d();
            if (!this.N) {
                cb.onPanelClosed(108, g0(0).j);
            }
        } else if (cb != null && !this.N) {
            if (this.U && (1 & this.V) != 0) {
                this.f11g.getDecorView().removeCallbacks(this.W);
                this.W.run();
            }
            t st2 = g0(0);
            a.b.o.j.g gVar = st2.j;
            if (gVar != null && !st2.r && cb.onPreparePanel(0, st2.i, gVar)) {
                cb.onMenuOpened(108, st2.j);
                this.m.e();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0053 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.b.o.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final boolean m0(t st) {
        ?? r0 = this.f10f;
        int i2 = st.f32a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue outValue = new TypedValue();
            Resources.Theme baseTheme = r0.getTheme();
            baseTheme.resolveAttribute(a.b.a.actionBarTheme, outValue, true);
            Resources.Theme widgetTheme = null;
            if (outValue.resourceId != 0) {
                widgetTheme = r0.getResources().newTheme();
                widgetTheme.setTo(baseTheme);
                widgetTheme.applyStyle(outValue.resourceId, true);
                widgetTheme.resolveAttribute(a.b.a.actionBarWidgetTheme, outValue, true);
            } else {
                baseTheme.resolveAttribute(a.b.a.actionBarWidgetTheme, outValue, true);
            }
            if (outValue.resourceId != 0) {
                if (widgetTheme == null) {
                    widgetTheme = r0.getResources().newTheme();
                    widgetTheme.setTo(baseTheme);
                }
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            if (widgetTheme != null) {
                r0 = new a.b.o.d((Context) r0, 0);
                r0.getTheme().setTo(widgetTheme);
            }
        }
        a.b.o.j.g menu = new a.b.o.j.g(r0);
        menu.R(this);
        st.c(menu);
        return true;
    }

    public final boolean k0(t st) {
        View view = st.i;
        if (view != null) {
            st.h = view;
            return true;
        } else if (st.j == null) {
            return false;
        } else {
            if (this.o == null) {
                this.o = new u();
            }
            View view2 = (View) st.a(this.o);
            st.h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    public final boolean D0(t st, KeyEvent event) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.N) {
            return false;
        }
        if (st.m) {
            return true;
        }
        t tVar = this.I;
        if (!(tVar == null || tVar == st)) {
            R(tVar, false);
        }
        Window.Callback cb = i0();
        if (cb != null) {
            st.i = cb.onCreatePanelView(st.f32a);
        }
        int i2 = st.f32a;
        boolean isActionBarMenu = i2 == 0 || i2 == 108;
        if (isActionBarMenu && (c0Var3 = this.m) != null) {
            c0Var3.f();
        }
        if (st.i == null && (!isActionBarMenu || !(B0() instanceof l))) {
            if (st.j == null || st.r) {
                if (st.j == null) {
                    m0(st);
                    if (st.j == null) {
                        return false;
                    }
                }
                if (isActionBarMenu && this.m != null) {
                    if (this.n == null) {
                        this.n = new i();
                    }
                    this.m.a(st.j, this.n);
                }
                st.j.d0();
                if (!cb.onCreatePanelMenu(st.f32a, st.j)) {
                    st.c(null);
                    if (isActionBarMenu && (c0Var2 = this.m) != null) {
                        c0Var2.a(null, this.n);
                    }
                    return false;
                }
                st.r = false;
            }
            st.j.d0();
            Bundle bundle = st.s;
            if (bundle != null) {
                st.j.P(bundle);
                st.s = null;
            }
            if (!cb.onPreparePanel(0, st.i, st.j)) {
                if (isActionBarMenu && (c0Var = this.m) != null) {
                    c0Var.a(null, this.n);
                }
                st.j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() != 1;
            st.p = z2;
            st.j.setQwertyMode(z2);
            st.j.c0();
        }
        st.m = true;
        st.n = false;
        this.I = st;
        return true;
    }

    public void O(a.b.o.j.g menu) {
        if (!this.G) {
            this.G = true;
            this.m.l();
            Window.Callback cb = i0();
            if (cb != null && !this.N) {
                cb.onPanelClosed(108, menu);
            }
            this.G = false;
        }
    }

    public void Q(int featureId) {
        R(g0(featureId), true);
    }

    public void R(t st, boolean doCallback) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!doCallback || st.f32a != 0 || (c0Var = this.m) == null || !c0Var.c()) {
            WindowManager wm = (WindowManager) this.f10f.getSystemService("window");
            if (!(wm == null || !st.o || (viewGroup = st.f38g) == null)) {
                wm.removeView(viewGroup);
                if (doCallback) {
                    N(st.f32a, st, null);
                }
            }
            st.m = false;
            st.n = false;
            st.o = false;
            st.h = null;
            st.q = true;
            if (this.I == st) {
                this.I = null;
                return;
            }
            return;
        }
        O(st.j);
    }

    public final boolean t0(int featureId, KeyEvent event) {
        if (event.getRepeatCount() != 0) {
            return false;
        }
        t st = g0(featureId);
        if (!st.o) {
            return D0(st, event);
        }
        return false;
    }

    public final boolean w0(int featureId, KeyEvent event) {
        c0 c0Var;
        if (this.p != null) {
            return false;
        }
        boolean handled = false;
        t st = g0(featureId);
        if (featureId != 0 || (c0Var = this.m) == null || !c0Var.g() || ViewConfiguration.get(this.f10f).hasPermanentMenuKey()) {
            if (st.o || st.n) {
                handled = st.o;
                R(st, true);
            } else if (st.m) {
                boolean show = true;
                if (st.r) {
                    st.m = false;
                    show = D0(st, event);
                }
                if (show) {
                    A0(st, event);
                    handled = true;
                }
            }
        } else if (this.m.c()) {
            handled = this.m.d();
        } else if (!this.N && D0(st, event)) {
            handled = this.m.e();
        }
        if (handled) {
            AudioManager audioManager = (AudioManager) this.f10f.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return handled;
    }

    public void N(int featureId, t panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0) {
                t[] tVarArr = this.H;
                if (featureId < tVarArr.length) {
                    panel = tVarArr[featureId];
                }
            }
            if (panel != null) {
                menu = panel.j;
            }
        }
        if ((panel == null || panel.o) && !this.N) {
            this.h.a().onPanelClosed(featureId, menu);
        }
    }

    public t b0(Menu menu) {
        t[] panels = this.H;
        int N2 = panels != null ? panels.length : 0;
        for (int i2 = 0; i2 < N2; i2++) {
            t panel = panels[i2];
            if (panel != null && panel.j == menu) {
                return panel;
            }
        }
        return null;
    }

    /* JADX INFO: Multiple debug info for r1v1 a.b.k.g$t: [D('nar' a.b.k.g$t[]), D('st' a.b.k.g$t)] */
    public t g0(int featureId) {
        t[] tVarArr = this.H;
        t[] ar = tVarArr;
        if (tVarArr == null || ar.length <= featureId) {
            t[] nar = new t[(featureId + 1)];
            if (ar != null) {
                System.arraycopy(ar, 0, nar, 0, ar.length);
            }
            ar = nar;
            this.H = nar;
        }
        t st = ar[featureId];
        if (st != null) {
            return st;
        }
        t st2 = new t(featureId);
        ar[featureId] = st2;
        return st2;
    }

    public final boolean C0(t st, int keyCode, KeyEvent event, int flags) {
        a.b.o.j.g gVar;
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.m || D0(st, event)) && (gVar = st.j) != null) {
            handled = gVar.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 1) == 0 && this.m == null) {
            R(st, true);
        }
        return handled;
    }

    public final void n0(int featureId) {
        this.V |= 1 << featureId;
        if (!this.U) {
            a.h.m.s.U(this.f11g.getDecorView(), this.W);
            this.U = true;
        }
    }

    public void X(int featureId) {
        t st = g0(featureId);
        if (st.j != null) {
            Bundle savedActionViewStates = new Bundle();
            st.j.Q(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st.s = savedActionViewStates;
            }
            st.j.d0();
            st.j.clear();
        }
        st.r = true;
        st.q = true;
        if ((featureId == 108 || featureId == 0) && this.m != null) {
            t st2 = g0(0);
            st2.m = false;
            D0(st2, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0132  */
    public final int N0(b0 insets, Rect rectInsets) {
        int systemWindowInsetTop;
        View view;
        int systemWindowInsetTop2;
        int systemWindowInsetTop3;
        int systemWindowInsetTop4 = 0;
        if (insets != null) {
            systemWindowInsetTop4 = insets.g();
        } else if (rectInsets != null) {
            systemWindowInsetTop4 = rectInsets.top;
        }
        boolean showStatusGuard = false;
        ActionBarContextView actionBarContextView = this.q;
        if (actionBarContextView == null) {
            systemWindowInsetTop2 = systemWindowInsetTop4;
        } else if (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            boolean mlpChanged = false;
            if (this.q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect innerInsets = this.Y;
                Rect rect = this.Z;
                if (insets == null) {
                    innerInsets.set(rectInsets);
                } else {
                    innerInsets.set(insets.e(), insets.g(), insets.f(), insets.d());
                }
                d1.a(this.w, innerInsets, rect);
                int newTopMargin = innerInsets.top;
                int newLeftMargin = innerInsets.left;
                int newRightMargin = innerInsets.right;
                b0 rootInsets = a.h.m.s.A(this.w);
                int newGuardLeftMargin = rootInsets == null ? 0 : rootInsets.e();
                int newGuardRightMargin = rootInsets == null ? 0 : rootInsets.f();
                if (!(mlp.topMargin == newTopMargin && mlp.leftMargin == newLeftMargin && mlp.rightMargin == newRightMargin)) {
                    mlp.topMargin = newTopMargin;
                    mlp.leftMargin = newLeftMargin;
                    mlp.rightMargin = newRightMargin;
                    mlpChanged = true;
                }
                if (newTopMargin <= 0 || this.y != null) {
                    systemWindowInsetTop3 = systemWindowInsetTop4;
                    View view2 = this.y;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (!(lp.height == mlp.topMargin && lp.leftMargin == newGuardLeftMargin && lp.rightMargin == newGuardRightMargin)) {
                            lp.height = mlp.topMargin;
                            lp.leftMargin = newGuardLeftMargin;
                            lp.rightMargin = newGuardRightMargin;
                            this.y.setLayoutParams(lp);
                        }
                    }
                } else {
                    View view3 = new View(this.f10f);
                    this.y = view3;
                    view3.setVisibility(8);
                    systemWindowInsetTop3 = systemWindowInsetTop4;
                    FrameLayout.LayoutParams lp2 = new FrameLayout.LayoutParams(-1, mlp.topMargin, 51);
                    lp2.leftMargin = newGuardLeftMargin;
                    lp2.rightMargin = newGuardRightMargin;
                    this.w.addView(this.y, -1, lp2);
                }
                boolean showStatusGuard2 = this.y != null;
                if (showStatusGuard2 && this.y.getVisibility() != 0) {
                    O0(this.y);
                }
                if (this.D || !showStatusGuard2) {
                    systemWindowInsetTop = systemWindowInsetTop3;
                } else {
                    systemWindowInsetTop = 0;
                }
                showStatusGuard = showStatusGuard2;
            } else if (mlp.topMargin != 0) {
                mlpChanged = true;
                mlp.topMargin = 0;
                systemWindowInsetTop = systemWindowInsetTop4;
            } else {
                systemWindowInsetTop = systemWindowInsetTop4;
            }
            if (mlpChanged) {
                this.q.setLayoutParams(mlp);
            }
            view = this.y;
            if (view != null) {
                view.setVisibility(showStatusGuard ? 0 : 8);
            }
            return systemWindowInsetTop;
        } else {
            systemWindowInsetTop2 = systemWindowInsetTop4;
        }
        systemWindowInsetTop = systemWindowInsetTop2;
        view = this.y;
        if (view != null) {
        }
        return systemWindowInsetTop;
    }

    public final void O0(View v2) {
        int i2;
        if ((a.h.m.s.C(v2) & 8192) != 0) {
            i2 = a.h.e.a.a(this.f10f, a.b.c.abc_decor_view_status_guard_light);
        } else {
            i2 = a.h.e.a.a(this.f10f, a.b.c.abc_decor_view_status_guard);
        }
        v2.setBackgroundColor(i2);
    }

    public final void J0() {
        if (this.v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int F0(int featureId) {
        if (featureId == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (featureId != 9) {
            return featureId;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    public void V() {
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.l();
        }
        if (this.r != null) {
            this.f11g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException e2) {
                }
            }
            this.r = null;
        }
        Y();
        a.b.o.j.g gVar = g0(0).j;
        if (gVar != null) {
            gVar.close();
        }
    }

    public boolean I() {
        return J(true);
    }

    public final boolean J(boolean allowRecreation) {
        if (this.N) {
            return false;
        }
        int nightMode = M();
        boolean applied = L0(q0(this.f10f, nightMode), allowRecreation);
        if (nightMode == 0) {
            f0(this.f10f).e();
        } else {
            m mVar = this.S;
            if (mVar != null) {
                mVar.a();
            }
        }
        if (nightMode == 3) {
            e0(this.f10f).e();
        } else {
            m mVar2 = this.T;
            if (mVar2 != null) {
                mVar2.a();
            }
        }
        return applied;
    }

    @Override // a.b.k.f
    public int l() {
        return this.O;
    }

    public int q0(Context context, int mode) {
        if (mode == -100) {
            return -1;
        }
        if (mode != -1) {
            if (mode != 0) {
                if (!(mode == 1 || mode == 2)) {
                    if (mode == 3) {
                        return e0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return f0(context).c();
            } else {
                return -1;
            }
        }
        return mode;
    }

    public final int M() {
        int i2 = this.O;
        if (i2 != -100) {
            return i2;
        }
        f.j();
        return -100;
    }

    public final Configuration S(Context context, int mode, Configuration configOverlay) {
        int newNightMode;
        if (mode == 1) {
            newNightMode = 16;
        } else if (mode != 2) {
            newNightMode = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            newNightMode = 32;
        }
        Configuration overrideConf = new Configuration();
        overrideConf.fontScale = 0.0f;
        if (configOverlay != null) {
            overrideConf.setTo(configOverlay);
        }
        overrideConf.uiMode = (overrideConf.uiMode & -49) | newNightMode;
        return overrideConf;
    }

    public final boolean L0(int mode, boolean allowRecreation) {
        boolean handled = false;
        Configuration overrideConfig = S(this.f10f, mode, null);
        boolean activityHandlingUiMode = o0();
        int currentNightMode = this.f10f.getResources().getConfiguration().uiMode & 48;
        int newNightMode = overrideConfig.uiMode & 48;
        if (currentNightMode != newNightMode && allowRecreation && !activityHandlingUiMode && this.K && (e0 || this.L)) {
            Object obj = this.f9e;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                a.h.d.a.i((Activity) this.f9e);
                handled = true;
            }
        }
        if (!handled && currentNightMode != newNightMode) {
            M0(newNightMode, activityHandlingUiMode, null);
            handled = true;
        }
        if (handled) {
            Object obj2 = this.f9e;
            if (obj2 instanceof d) {
                ((d) obj2).onNightModeChanged(mode);
            }
        }
        return handled;
    }

    public final void M0(int uiModeNightModeValue, boolean callOnConfigChange, Configuration configOverlay) {
        Resources res = this.f10f.getResources();
        Configuration conf = new Configuration(res.getConfiguration());
        if (configOverlay != null) {
            conf.updateFrom(configOverlay);
        }
        conf.uiMode = (res.getConfiguration().uiMode & -49) | uiModeNightModeValue;
        res.updateConfiguration(conf, null);
        if (Build.VERSION.SDK_INT < 26) {
            k.a(res);
        }
        int i2 = this.P;
        if (i2 != 0) {
            this.f10f.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f10f.getTheme().applyStyle(this.P, true);
            }
        }
        if (callOnConfigChange) {
            Object obj = this.f9e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof a.m.g) {
                    if (((a.m.g) activity).getLifecycle().b().a(d.b.STARTED)) {
                        activity.onConfigurationChanged(conf);
                    }
                } else if (this.M) {
                    activity.onConfigurationChanged(conf);
                }
            }
        }
    }

    public final m f0(Context context) {
        if (this.S == null) {
            this.S = new n(n.a(context));
        }
        return this.S;
    }

    public final m e0(Context context) {
        if (this.T == null) {
            this.T = new l(context);
        }
        return this.T;
    }

    public final boolean o0() {
        if (!this.R && (this.f9e instanceof Activity)) {
            PackageManager pm = this.f10f.getPackageManager();
            if (pm == null) {
                return false;
            }
            int flags = 0;
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    flags = 269221888;
                } else if (Build.VERSION.SDK_INT >= 24) {
                    flags = 786432;
                }
                ActivityInfo info = pm.getActivityInfo(new ComponentName(this.f10f, this.f9e.getClass()), flags);
                this.Q = (info == null || (info.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    public class j implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public b.a f21a;

        public j(b.a wrapped) {
            this.f21a = wrapped;
        }

        @Override // a.b.o.b.a
        public boolean c(a.b.o.b mode, Menu menu) {
            return this.f21a.c(mode, menu);
        }

        @Override // a.b.o.b.a
        public boolean a(a.b.o.b mode, Menu menu) {
            a.h.m.s.W(g.this.w);
            return this.f21a.a(mode, menu);
        }

        @Override // a.b.o.b.a
        public boolean b(a.b.o.b mode, MenuItem item) {
            return this.f21a.b(mode, item);
        }

        @Override // a.b.o.b.a
        public void d(a.b.o.b mode) {
            this.f21a.d(mode);
            g gVar = g.this;
            if (gVar.r != null) {
                gVar.f11g.getDecorView().removeCallbacks(g.this.s);
            }
            g gVar2 = g.this;
            if (gVar2.q != null) {
                gVar2.Y();
                g gVar3 = g.this;
                x b2 = a.h.m.s.b(gVar3.q);
                b2.a(0.0f);
                gVar3.t = b2;
                g.this.t.f(new a());
            }
            g gVar4 = g.this;
            e eVar = gVar4.i;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(gVar4.p);
            }
            g gVar5 = g.this;
            gVar5.p = null;
            a.h.m.s.W(gVar5.w);
        }

        public class a extends z {
            public a() {
            }

            @Override // a.h.m.y
            public void a(View view) {
                g.this.q.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.q.getParent() instanceof View) {
                    a.h.m.s.W((View) g.this.q.getParent());
                }
                g.this.q.removeAllViews();
                g.this.t.f(null);
                g gVar2 = g.this;
                gVar2.t = null;
                a.h.m.s.W(gVar2.w);
            }
        }
    }

    public final class u implements m.a {
        public u() {
        }

        @Override // a.b.o.j.m.a
        public void a(a.b.o.j.g menu, boolean allMenusAreClosing) {
            Menu parentMenu = menu.D();
            boolean isSubMenu = parentMenu != menu;
            t panel = g.this.b0(isSubMenu ? parentMenu : menu);
            if (panel == null) {
                return;
            }
            if (isSubMenu) {
                g.this.N(panel.f32a, panel, parentMenu);
                g.this.R(panel, true);
                return;
            }
            g.this.R(panel, allMenusAreClosing);
        }

        @Override // a.b.o.j.m.a
        public boolean b(a.b.o.j.g subMenu) {
            Window.Callback cb;
            if (subMenu != subMenu.D()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.B || (cb = gVar.i0()) == null || g.this.N) {
                return true;
            }
            cb.onMenuOpened(108, subMenu);
            return true;
        }
    }

    public final class i implements m.a {
        public i() {
        }

        @Override // a.b.o.j.m.a
        public boolean b(a.b.o.j.g subMenu) {
            Window.Callback cb = g.this.i0();
            if (cb == null) {
                return true;
            }
            cb.onMenuOpened(108, subMenu);
            return true;
        }

        @Override // a.b.o.j.m.a
        public void a(a.b.o.j.g menu, boolean allMenusAreClosing) {
            g.this.O(menu);
        }
    }

    public static final class t {

        /* renamed from: a  reason: collision with root package name */
        public int f32a;

        /* renamed from: b  reason: collision with root package name */
        public int f33b;

        /* renamed from: c  reason: collision with root package name */
        public int f34c;

        /* renamed from: d  reason: collision with root package name */
        public int f35d;

        /* renamed from: e  reason: collision with root package name */
        public int f36e;

        /* renamed from: f  reason: collision with root package name */
        public int f37f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f38g;
        public View h;
        public View i;
        public a.b.o.j.g j;
        public a.b.o.j.e k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public t(int featureId) {
            this.f32a = featureId;
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            if (this.i == null && ((e.a) this.k.b()).getCount() <= 0) {
                return false;
            }
            return true;
        }

        public void d(Context context) {
            TypedValue outValue = new TypedValue();
            Resources.Theme widgetTheme = context.getResources().newTheme();
            widgetTheme.setTo(context.getTheme());
            widgetTheme.resolveAttribute(a.b.a.actionBarPopupTheme, outValue, true);
            int i2 = outValue.resourceId;
            if (i2 != 0) {
                widgetTheme.applyStyle(i2, true);
            }
            widgetTheme.resolveAttribute(a.b.a.panelMenuListTheme, outValue, true);
            int i3 = outValue.resourceId;
            if (i3 != 0) {
                widgetTheme.applyStyle(i3, true);
            } else {
                widgetTheme.applyStyle(a.b.i.Theme_AppCompat_CompactMenu, true);
            }
            a.b.o.d dVar = new a.b.o.d(context, 0);
            dVar.getTheme().setTo(widgetTheme);
            this.l = dVar;
            TypedArray a2 = dVar.obtainStyledAttributes(a.b.j.AppCompatTheme);
            this.f33b = a2.getResourceId(a.b.j.AppCompatTheme_panelBackground, 0);
            this.f37f = a2.getResourceId(a.b.j.AppCompatTheme_android_windowAnimationStyle, 0);
            a2.recycle();
        }

        public void c(a.b.o.j.g menu) {
            a.b.o.j.e eVar;
            a.b.o.j.g gVar = this.j;
            if (menu != gVar) {
                if (gVar != null) {
                    gVar.O(this.k);
                }
                this.j = menu;
                if (menu != null && (eVar = this.k) != null) {
                    menu.b(eVar);
                }
            }
        }

        public a.b.o.j.n a(m.a cb) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                a.b.o.j.e eVar = new a.b.o.j.e(this.l, a.b.g.abc_list_menu_item_layout);
                this.k = eVar;
                eVar.h(cb);
                this.j.b(this.k);
            }
            return this.k.f(this.f38g);
        }
    }

    public class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent event) {
            return g.this.W(event) || super.dispatchKeyEvent(event);
        }

        public boolean onInterceptTouchEvent(MotionEvent event) {
            if (event.getAction() != 0 || !b((int) event.getX(), (int) event.getY())) {
                return super.onInterceptTouchEvent(event);
            }
            g.this.Q(0);
            return true;
        }

        public void setBackgroundResource(int resid) {
            setBackgroundDrawable(a.b.l.a.a.d(getContext(), resid));
        }

        public final boolean b(int x, int y) {
            return x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5;
        }
    }

    public class k extends a.b.o.i {
        public k(Window.Callback callback) {
            super(callback);
        }

        @Override // a.b.o.i
        public boolean dispatchKeyEvent(KeyEvent event) {
            return g.this.W(event) || super.dispatchKeyEvent(event);
        }

        @Override // a.b.o.i
        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            return super.dispatchKeyShortcutEvent(event) || g.this.u0(event.getKeyCode(), event);
        }

        @Override // a.b.o.i
        public boolean onCreatePanelMenu(int featureId, Menu menu) {
            if (featureId != 0 || (menu instanceof a.b.o.j.g)) {
                return super.onCreatePanelMenu(featureId, menu);
            }
            return false;
        }

        @Override // a.b.o.i
        public void onContentChanged() {
        }

        @Override // a.b.o.i
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            a.b.o.j.g mb = menu instanceof a.b.o.j.g ? (a.b.o.j.g) menu : null;
            if (featureId == 0 && mb == null) {
                return false;
            }
            if (mb != null) {
                mb.a0(true);
            }
            boolean handled = super.onPreparePanel(featureId, view, menu);
            if (mb != null) {
                mb.a0(false);
            }
            return handled;
        }

        @Override // a.b.o.i
        public boolean onMenuOpened(int featureId, Menu menu) {
            super.onMenuOpened(featureId, menu);
            g.this.x0(featureId);
            return true;
        }

        @Override // a.b.o.i
        public void onPanelClosed(int featureId, Menu menu) {
            super.onPanelClosed(featureId, menu);
            g.this.y0(featureId);
        }

        @Override // a.b.o.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (g.this.p0()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public final ActionMode b(ActionMode.Callback callback) {
            f.a callbackWrapper = new f.a(g.this.f10f, callback);
            a.b.o.b supportActionMode = g.this.H(callbackWrapper);
            if (supportActionMode != null) {
                return callbackWrapper.e(supportActionMode);
            }
            return null;
        }

        @Override // a.b.o.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            if (!g.this.p0() || type != 0) {
                return super.onWindowStartingActionMode(callback, type);
            }
            return b(callback);
        }

        @Override // a.b.o.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
            a.b.o.j.g gVar = g.this.g0(0).j;
            if (gVar != null) {
                super.onProvideKeyboardShortcuts(data, gVar, deviceId);
            } else {
                super.onProvideKeyboardShortcuts(data, menu, deviceId);
            }
        }
    }

    public abstract class m {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f27a;

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public m() {
        }

        public void e() {
            a();
            IntentFilter filter = b();
            if (filter != null && filter.countActions() != 0) {
                if (this.f27a == null) {
                    this.f27a = new a();
                }
                g.this.f10f.registerReceiver(this.f27a, filter);
            }
        }

        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                m.this.d();
            }
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f27a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f10f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException e2) {
                }
                this.f27a = null;
            }
        }
    }

    public class n extends m {

        /* renamed from: c  reason: collision with root package name */
        public final n f30c;

        public n(n twilightManager) {
            super();
            this.f30c = twilightManager;
        }

        @Override // a.b.k.g.m
        public int c() {
            return this.f30c.d() ? 2 : 1;
        }

        @Override // a.b.k.g.m
        public void d() {
            g.this.I();
        }

        @Override // a.b.k.g.m
        public IntentFilter b() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.intent.action.TIME_SET");
            filter.addAction("android.intent.action.TIMEZONE_CHANGED");
            filter.addAction("android.intent.action.TIME_TICK");
            return filter;
        }
    }

    public class l extends m {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f25c;

        public l(Context context) {
            super();
            this.f25c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // a.b.k.g.m
        public int c() {
            return this.f25c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // a.b.k.g.m
        public void d() {
            g.this.I();
        }

        @Override // a.b.k.g.m
        public IntentFilter b() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return filter;
        }
    }

    @Override // a.b.k.f
    public final b k() {
        return new h(this);
    }

    public class h implements b {
        public h(g gVar) {
        }
    }

    public static Configuration c0(Configuration base, Configuration change) {
        Configuration delta = new Configuration();
        delta.fontScale = 0.0f;
        if (change == null || base.diff(change) == 0) {
            return delta;
        }
        float f2 = base.fontScale;
        float f3 = change.fontScale;
        if (f2 != f3) {
            delta.fontScale = f3;
        }
        int i2 = base.mcc;
        int i3 = change.mcc;
        if (i2 != i3) {
            delta.mcc = i3;
        }
        int i4 = base.mnc;
        int i5 = change.mnc;
        if (i4 != i5) {
            delta.mnc = i5;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            p.a(base, change, delta);
        } else if (!a.h.l.c.a(base.locale, change.locale)) {
            delta.locale = change.locale;
        }
        int i6 = base.touchscreen;
        int i7 = change.touchscreen;
        if (i6 != i7) {
            delta.touchscreen = i7;
        }
        int i8 = base.keyboard;
        int i9 = change.keyboard;
        if (i8 != i9) {
            delta.keyboard = i9;
        }
        int i10 = base.keyboardHidden;
        int i11 = change.keyboardHidden;
        if (i10 != i11) {
            delta.keyboardHidden = i11;
        }
        int i12 = base.navigation;
        int i13 = change.navigation;
        if (i12 != i13) {
            delta.navigation = i13;
        }
        int i14 = base.navigationHidden;
        int i15 = change.navigationHidden;
        if (i14 != i15) {
            delta.navigationHidden = i15;
        }
        int i16 = base.orientation;
        int i17 = change.orientation;
        if (i16 != i17) {
            delta.orientation = i17;
        }
        int i18 = base.screenLayout & 15;
        int i19 = change.screenLayout;
        if (i18 != (i19 & 15)) {
            delta.screenLayout |= i19 & 15;
        }
        int i20 = base.screenLayout & 192;
        int i21 = change.screenLayout;
        if (i20 != (i21 & 192)) {
            delta.screenLayout |= i21 & 192;
        }
        int i22 = base.screenLayout & 48;
        int i23 = change.screenLayout;
        if (i22 != (i23 & 48)) {
            delta.screenLayout |= i23 & 48;
        }
        int i24 = base.screenLayout & 768;
        int i25 = change.screenLayout;
        if (i24 != (i25 & 768)) {
            delta.screenLayout |= i25 & 768;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            q.a(base, change, delta);
        }
        int i26 = base.uiMode & 15;
        int i27 = change.uiMode;
        if (i26 != (i27 & 15)) {
            delta.uiMode |= i27 & 15;
        }
        int i28 = base.uiMode & 48;
        int i29 = change.uiMode;
        if (i28 != (i29 & 48)) {
            delta.uiMode |= i29 & 48;
        }
        int i30 = base.screenWidthDp;
        int i31 = change.screenWidthDp;
        if (i30 != i31) {
            delta.screenWidthDp = i31;
        }
        int i32 = base.screenHeightDp;
        int i33 = change.screenHeightDp;
        if (i32 != i33) {
            delta.screenHeightDp = i33;
        }
        int i34 = base.smallestScreenWidthDp;
        int i35 = change.smallestScreenWidthDp;
        if (i34 != i35) {
            delta.smallestScreenWidthDp = i35;
        }
        o.a(base, change, delta);
        return delta;
    }

    public static class o {
        public static void a(Configuration base, Configuration change, Configuration delta) {
            int i = base.densityDpi;
            int i2 = change.densityDpi;
            if (i != i2) {
                delta.densityDpi = i2;
            }
        }
    }

    public static class p {
        public static void a(Configuration base, Configuration change, Configuration delta) {
            LocaleList baseLocales = base.getLocales();
            LocaleList changeLocales = change.getLocales();
            if (!baseLocales.equals(changeLocales)) {
                delta.setLocales(changeLocales);
                delta.locale = change.locale;
            }
        }
    }

    public static class q {
        public static void a(Configuration base, Configuration change, Configuration delta) {
            int i = base.colorMode & 3;
            int i2 = change.colorMode;
            if (i != (i2 & 3)) {
                delta.colorMode |= i2 & 3;
            }
            int i3 = base.colorMode & 12;
            int i4 = change.colorMode;
            if (i3 != (i4 & 12)) {
                delta.colorMode |= i4 & 12;
            }
        }
    }
}
