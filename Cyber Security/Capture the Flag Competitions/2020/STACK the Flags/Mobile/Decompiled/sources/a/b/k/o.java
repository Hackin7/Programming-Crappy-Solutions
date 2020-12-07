package a.b.k;

import a.b.f;
import a.b.j;
import a.b.k.a;
import a.b.o.b;
import a.b.o.h;
import a.b.o.j.g;
import a.b.p.d0;
import a.h.m.a0;
import a.h.m.s;
import a.h.m.x;
import a.h.m.y;
import a.h.m.z;
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
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class o extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new AccelerateInterpolator();
    public static final Interpolator B = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f77a;

    /* renamed from: b  reason: collision with root package name */
    public Context f78b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f79c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f80d;

    /* renamed from: e  reason: collision with root package name */
    public d0 f81e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f82f;

    /* renamed from: g  reason: collision with root package name */
    public View f83g;
    public boolean h;
    public d i;
    public a.b.o.b j;
    public b.a k;
    public boolean l;
    public ArrayList<a.b> m = new ArrayList<>();
    public boolean n;
    public int o = 0;
    public boolean p = true;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t = true;
    public h u;
    public boolean v;
    public boolean w;
    public final y x = new a();
    public final y y = new b();
    public final a0 z = new c();

    public class a extends z {
        public a() {
        }

        @Override // a.h.m.y
        public void a(View view) {
            View view2;
            o oVar = o.this;
            if (oVar.p && (view2 = oVar.f83g) != null) {
                view2.setTranslationY(0.0f);
                o.this.f80d.setTranslationY(0.0f);
            }
            o.this.f80d.setVisibility(8);
            o.this.f80d.setTransitioning(false);
            o oVar2 = o.this;
            oVar2.u = null;
            oVar2.r();
            ActionBarOverlayLayout actionBarOverlayLayout = o.this.f79c;
            if (actionBarOverlayLayout != null) {
                s.W(actionBarOverlayLayout);
            }
        }
    }

    public class b extends z {
        public b() {
        }

        @Override // a.h.m.y
        public void a(View view) {
            o oVar = o.this;
            oVar.u = null;
            oVar.f80d.requestLayout();
        }
    }

    public class c implements a0 {
        public c() {
        }

        public void a(View view) {
            ((View) o.this.f80d.getParent()).invalidate();
        }
    }

    public o(Activity activity, boolean overlayMode) {
        new ArrayList();
        View decor = activity.getWindow().getDecorView();
        z(decor);
        if (!overlayMode) {
            this.f83g = decor.findViewById(16908290);
        }
    }

    public o(Dialog dialog) {
        new ArrayList();
        z(dialog.getWindow().getDecorView());
    }

    public final void z(View decor) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) decor.findViewById(f.decor_content_parent);
        this.f79c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f81e = v(decor.findViewById(f.action_bar));
        this.f82f = (ActionBarContextView) decor.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) decor.findViewById(f.action_bar_container);
        this.f80d = actionBarContainer;
        d0 d0Var = this.f81e;
        if (d0Var == null || this.f82f == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f77a = d0Var.q();
        boolean homeAsUp = (this.f81e.j() & 4) != 0;
        if (homeAsUp) {
            this.h = true;
        }
        a.b.o.a abp = a.b.o.a.b(this.f77a);
        I(abp.a() || homeAsUp);
        G(abp.g());
        TypedArray a2 = this.f77a.obtainStyledAttributes(null, j.ActionBar, a.b.a.actionBarStyle, 0);
        if (a2.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            H(true);
        }
        int elevation = a2.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (elevation != 0) {
            F((float) elevation);
        }
        a2.recycle();
    }

    public final d0 v(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public void F(float elevation) {
        s.e0(this.f80d, elevation);
    }

    @Override // a.b.k.a
    public void g(Configuration newConfig) {
        G(a.b.o.a.b(this.f77a).g());
    }

    public final void G(boolean hasEmbeddedTabs) {
        this.n = hasEmbeddedTabs;
        if (!hasEmbeddedTabs) {
            this.f81e.n(null);
            this.f80d.setTabContainer(null);
        } else {
            this.f80d.setTabContainer(null);
            this.f81e.n(null);
        }
        boolean z2 = true;
        boolean isInTabMode = w() == 2;
        this.f81e.w(!this.n && isInTabMode);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f79c;
        if (this.n || !isInTabMode) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    public void r() {
        b.a aVar = this.k;
        if (aVar != null) {
            aVar.d(this.j);
            this.j = null;
            this.k = null;
        }
    }

    public void C(int visibility) {
        this.o = visibility;
    }

    @Override // a.b.k.a
    public void m(boolean enabled) {
        h hVar;
        this.v = enabled;
        if (!enabled && (hVar = this.u) != null) {
            hVar.a();
        }
    }

    @Override // a.b.k.a
    public void c(boolean isVisible) {
        if (isVisible != this.l) {
            this.l = isVisible;
            int count = this.m.size();
            for (int i2 = 0; i2 < count; i2++) {
                this.m.get(i2).a(isVisible);
            }
        }
    }

    public void D(boolean showHomeAsUp) {
        E(showHomeAsUp ? 4 : 0, 4);
    }

    public void I(boolean enable) {
        this.f81e.p(enable);
    }

    @Override // a.b.k.a
    public void n(CharSequence title) {
        this.f81e.setWindowTitle(title);
    }

    public void E(int options, int mask) {
        int current = this.f81e.j();
        if ((mask & 4) != 0) {
            this.h = true;
        }
        this.f81e.x((options & mask) | ((~mask) & current));
    }

    public int w() {
        return this.f81e.r();
    }

    @Override // a.b.k.a
    public int d() {
        return this.f81e.j();
    }

    @Override // a.b.k.a
    public a.b.o.b o(b.a callback) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.c();
        }
        this.f79c.setHideOnContentScrollEnabled(false);
        this.f82f.k();
        d mode = new d(this.f82f.getContext(), callback);
        if (!mode.t()) {
            return null;
        }
        this.i = mode;
        mode.k();
        this.f82f.h(mode);
        p(true);
        this.f82f.sendAccessibilityEvent(32);
        return mode;
    }

    public void u(boolean enabled) {
        this.p = enabled;
    }

    public final void K() {
        if (!this.s) {
            this.s = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f79c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            M(false);
        }
    }

    public void L() {
        if (this.r) {
            this.r = false;
            M(true);
        }
    }

    public final void x() {
        if (this.s) {
            this.s = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f79c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    public void y() {
        if (!this.r) {
            this.r = true;
            M(true);
        }
    }

    public void H(boolean hideOnContentScroll) {
        if (!hideOnContentScroll || this.f79c.w()) {
            this.w = hideOnContentScroll;
            this.f79c.setHideOnContentScrollEnabled(hideOnContentScroll);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public static boolean q(boolean hiddenByApp, boolean hiddenBySystem, boolean showingForMode) {
        if (showingForMode) {
            return true;
        }
        if (hiddenByApp || hiddenBySystem) {
            return false;
        }
        return true;
    }

    public final void M(boolean fromSystem) {
        if (q(false, this.r, this.s)) {
            if (!this.t) {
                this.t = true;
                t(fromSystem);
            }
        } else if (this.t) {
            this.t = false;
            s(fromSystem);
        }
    }

    public void t(boolean fromSystem) {
        View view;
        View view2;
        h hVar = this.u;
        if (hVar != null) {
            hVar.a();
        }
        this.f80d.setVisibility(0);
        if (this.o != 0 || (!this.v && !fromSystem)) {
            this.f80d.setAlpha(1.0f);
            this.f80d.setTranslationY(0.0f);
            if (this.p && (view = this.f83g) != null) {
                view.setTranslationY(0.0f);
            }
            this.y.a(null);
        } else {
            this.f80d.setTranslationY(0.0f);
            float startingY = (float) (-this.f80d.getHeight());
            if (fromSystem) {
                int[] topLeft = {0, 0};
                this.f80d.getLocationInWindow(topLeft);
                startingY -= (float) topLeft[1];
            }
            this.f80d.setTranslationY(startingY);
            h anim = new h();
            x a2 = s.b(this.f80d).k(0.0f);
            a2.i(this.z);
            anim.c(a2);
            if (this.p && (view2 = this.f83g) != null) {
                view2.setTranslationY(startingY);
                x b2 = s.b(this.f83g);
                b2.k(0.0f);
                anim.c(b2);
            }
            anim.f(B);
            anim.e(250);
            anim.g(this.y);
            this.u = anim;
            anim.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f79c;
        if (actionBarOverlayLayout != null) {
            s.W(actionBarOverlayLayout);
        }
    }

    public void s(boolean fromSystem) {
        View view;
        h hVar = this.u;
        if (hVar != null) {
            hVar.a();
        }
        if (this.o != 0 || (!this.v && !fromSystem)) {
            this.x.a(null);
            return;
        }
        this.f80d.setAlpha(1.0f);
        this.f80d.setTransitioning(true);
        h anim = new h();
        float endingY = (float) (-this.f80d.getHeight());
        if (fromSystem) {
            int[] topLeft = {0, 0};
            this.f80d.getLocationInWindow(topLeft);
            endingY -= (float) topLeft[1];
        }
        x a2 = s.b(this.f80d).k(endingY);
        a2.i(this.z);
        anim.c(a2);
        if (this.p && (view = this.f83g) != null) {
            x b2 = s.b(view);
            b2.k(endingY);
            anim.c(b2);
        }
        anim.f(A);
        anim.e(250);
        anim.g(this.x);
        this.u = anim;
        anim.h();
    }

    public void p(boolean toActionMode) {
        x fadeIn;
        x fadeOut;
        if (toActionMode) {
            K();
        } else {
            x();
        }
        if (J()) {
            if (toActionMode) {
                fadeOut = this.f81e.s(4, 100);
                fadeIn = this.f82f.f(0, 200);
            } else {
                fadeIn = this.f81e.s(0, 200);
                fadeOut = this.f82f.f(8, 100);
            }
            h set = new h();
            set.d(fadeOut, fadeIn);
            set.h();
        } else if (toActionMode) {
            this.f81e.k(4);
            this.f82f.setVisibility(0);
        } else {
            this.f81e.k(0);
            this.f82f.setVisibility(8);
        }
    }

    public final boolean J() {
        return s.K(this.f80d);
    }

    @Override // a.b.k.a
    public Context e() {
        if (this.f78b == null) {
            TypedValue outValue = new TypedValue();
            this.f77a.getTheme().resolveAttribute(a.b.a.actionBarWidgetTheme, outValue, true);
            int targetThemeRes = outValue.resourceId;
            if (targetThemeRes != 0) {
                this.f78b = new ContextThemeWrapper(this.f77a, targetThemeRes);
            } else {
                this.f78b = this.f77a;
            }
        }
        return this.f78b;
    }

    public void A() {
        h hVar = this.u;
        if (hVar != null) {
            hVar.a();
            this.u = null;
        }
    }

    public void B() {
    }

    @Override // a.b.k.a
    public boolean b() {
        d0 d0Var = this.f81e;
        if (d0Var == null || !d0Var.u()) {
            return false;
        }
        this.f81e.collapseActionView();
        return true;
    }

    public class d extends a.b.o.b implements g.a {

        /* renamed from: d  reason: collision with root package name */
        public final Context f87d;

        /* renamed from: e  reason: collision with root package name */
        public final g f88e;

        /* renamed from: f  reason: collision with root package name */
        public b.a f89f;

        /* renamed from: g  reason: collision with root package name */
        public WeakReference<View> f90g;

        public d(Context context, b.a callback) {
            this.f87d = context;
            this.f89f = callback;
            g gVar = new g(context);
            gVar.S(1);
            this.f88e = gVar;
            gVar.R(this);
        }

        @Override // a.b.o.b
        public MenuInflater f() {
            return new a.b.o.g(this.f87d);
        }

        @Override // a.b.o.b
        public Menu e() {
            return this.f88e;
        }

        @Override // a.b.o.b
        public void c() {
            o oVar = o.this;
            if (oVar.i == this) {
                if (!o.q(oVar.q, oVar.r, false)) {
                    o oVar2 = o.this;
                    oVar2.j = this;
                    oVar2.k = this.f89f;
                } else {
                    this.f89f.d(this);
                }
                this.f89f = null;
                o.this.p(false);
                o.this.f82f.g();
                o.this.f81e.o().sendAccessibilityEvent(32);
                o oVar3 = o.this;
                oVar3.f79c.setHideOnContentScrollEnabled(oVar3.w);
                o.this.i = null;
            }
        }

        @Override // a.b.o.b
        public void k() {
            if (o.this.i == this) {
                this.f88e.d0();
                try {
                    this.f89f.a(this, this.f88e);
                } finally {
                    this.f88e.c0();
                }
            }
        }

        public boolean t() {
            this.f88e.d0();
            try {
                return this.f89f.c(this, this.f88e);
            } finally {
                this.f88e.c0();
            }
        }

        @Override // a.b.o.b
        public void m(View view) {
            o.this.f82f.setCustomView(view);
            this.f90g = new WeakReference<>(view);
        }

        @Override // a.b.o.b
        public void o(CharSequence subtitle) {
            o.this.f82f.setSubtitle(subtitle);
        }

        @Override // a.b.o.b
        public void r(CharSequence title) {
            o.this.f82f.setTitle(title);
        }

        @Override // a.b.o.b
        public void q(int resId) {
            r(o.this.f77a.getResources().getString(resId));
        }

        @Override // a.b.o.b
        public void n(int resId) {
            o(o.this.f77a.getResources().getString(resId));
        }

        @Override // a.b.o.b
        public CharSequence i() {
            return o.this.f82f.getTitle();
        }

        @Override // a.b.o.b
        public CharSequence g() {
            return o.this.f82f.getSubtitle();
        }

        @Override // a.b.o.b
        public void s(boolean titleOptional) {
            super.s(titleOptional);
            o.this.f82f.setTitleOptional(titleOptional);
        }

        @Override // a.b.o.b
        public boolean l() {
            return o.this.f82f.j();
        }

        @Override // a.b.o.b
        public View d() {
            WeakReference<View> weakReference = this.f90g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.b.o.j.g.a
        public boolean a(g menu, MenuItem item) {
            b.a aVar = this.f89f;
            if (aVar != null) {
                return aVar.b(this, item);
            }
            return false;
        }

        @Override // a.b.o.j.g.a
        public void b(g menu) {
            if (this.f89f != null) {
                k();
                o.this.f82f.l();
            }
        }
    }

    @Override // a.b.k.a
    public void l(boolean enable) {
        if (!this.h) {
            D(enable);
        }
    }

    @Override // a.b.k.a
    public boolean i(int keyCode, KeyEvent event) {
        Menu menu;
        d dVar = this.i;
        if (dVar == null || (menu = dVar.e()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        menu.setQwertyMode(z2);
        return menu.performShortcut(keyCode, event, 0);
    }
}
