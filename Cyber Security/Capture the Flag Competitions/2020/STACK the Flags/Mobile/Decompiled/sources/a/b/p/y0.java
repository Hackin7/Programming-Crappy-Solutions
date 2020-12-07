package a.b.p;

import a.b.f;
import a.b.h;
import a.b.j;
import a.b.o.j.g;
import a.b.o.j.m;
import a.h.m.s;
import a.h.m.x;
import a.h.m.z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public class y0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f465a;

    /* renamed from: b  reason: collision with root package name */
    public int f466b;

    /* renamed from: c  reason: collision with root package name */
    public View f467c;

    /* renamed from: d  reason: collision with root package name */
    public View f468d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f469e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f470f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f471g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public c n;
    public int o;
    public int p;
    public Drawable q;

    public y0(Toolbar toolbar, boolean style) {
        this(toolbar, style, h.abc_action_bar_up_description);
    }

    public y0(Toolbar toolbar, boolean style, int defaultNavigationContentDescription) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f465a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.f471g = toolbar.getNavigationIcon();
        w0 a2 = w0.u(toolbar.getContext(), null, j.ActionBar, a.b.a.actionBarStyle, 0);
        this.q = a2.f(j.ActionBar_homeAsUpIndicator);
        if (style) {
            CharSequence title = a2.o(j.ActionBar_title);
            if (!TextUtils.isEmpty(title)) {
                G(title);
            }
            CharSequence subtitle = a2.o(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(subtitle)) {
                F(subtitle);
            }
            Drawable logo = a2.f(j.ActionBar_logo);
            if (logo != null) {
                B(logo);
            }
            Drawable icon = a2.f(j.ActionBar_icon);
            if (icon != null) {
                setIcon(icon);
            }
            if (this.f471g == null && (drawable = this.q) != null) {
                E(drawable);
            }
            x(a2.j(j.ActionBar_displayOptions, 0));
            int customNavId = a2.m(j.ActionBar_customNavigationLayout, 0);
            if (customNavId != 0) {
                z(LayoutInflater.from(this.f465a.getContext()).inflate(customNavId, (ViewGroup) this.f465a, false));
                x(this.f466b | 16);
            }
            int height = a2.l(j.ActionBar_height, 0);
            if (height > 0) {
                ViewGroup.LayoutParams lp = this.f465a.getLayoutParams();
                lp.height = height;
                this.f465a.setLayoutParams(lp);
            }
            int contentInsetStart = a2.d(j.ActionBar_contentInsetStart, -1);
            int contentInsetEnd = a2.d(j.ActionBar_contentInsetEnd, -1);
            if (contentInsetStart >= 0 || contentInsetEnd >= 0) {
                this.f465a.H(Math.max(contentInsetStart, 0), Math.max(contentInsetEnd, 0));
            }
            int titleTextStyle = a2.m(j.ActionBar_titleTextStyle, 0);
            if (titleTextStyle != 0) {
                Toolbar toolbar2 = this.f465a;
                toolbar2.L(toolbar2.getContext(), titleTextStyle);
            }
            int subtitleTextStyle = a2.m(j.ActionBar_subtitleTextStyle, 0);
            if (subtitleTextStyle != 0) {
                Toolbar toolbar3 = this.f465a;
                toolbar3.K(toolbar3.getContext(), subtitleTextStyle);
            }
            int popupTheme = a2.m(j.ActionBar_popupTheme, 0);
            if (popupTheme != 0) {
                this.f465a.setPopupTheme(popupTheme);
            }
        } else {
            this.f466b = y();
        }
        a2.v();
        A(defaultNavigationContentDescription);
        this.k = this.f465a.getNavigationContentDescription();
        this.f465a.setNavigationOnClickListener(new x0(this));
    }

    public void A(int defaultNavigationContentDescription) {
        if (defaultNavigationContentDescription != this.p) {
            this.p = defaultNavigationContentDescription;
            if (TextUtils.isEmpty(this.f465a.getNavigationContentDescription())) {
                C(this.p);
            }
        }
    }

    public final int y() {
        if (this.f465a.getNavigationIcon() == null) {
            return 11;
        }
        int opts = 11 | 4;
        this.q = this.f465a.getNavigationIcon();
        return opts;
    }

    @Override // a.b.p.d0
    public ViewGroup o() {
        return this.f465a;
    }

    @Override // a.b.p.d0
    public Context q() {
        return this.f465a.getContext();
    }

    @Override // a.b.p.d0
    public boolean u() {
        return this.f465a.v();
    }

    @Override // a.b.p.d0
    public void collapseActionView() {
        this.f465a.e();
    }

    @Override // a.b.p.d0
    public void setWindowCallback(Window.Callback cb) {
        this.l = cb;
    }

    @Override // a.b.p.d0
    public void setWindowTitle(CharSequence title) {
        if (!this.h) {
            H(title);
        }
    }

    @Override // a.b.p.d0
    public CharSequence getTitle() {
        return this.f465a.getTitle();
    }

    public void G(CharSequence title) {
        this.h = true;
        H(title);
    }

    public final void H(CharSequence title) {
        this.i = title;
        if ((this.f466b & 8) != 0) {
            this.f465a.setTitle(title);
        }
    }

    public void F(CharSequence subtitle) {
        this.j = subtitle;
        if ((this.f466b & 8) != 0) {
            this.f465a.setSubtitle(subtitle);
        }
    }

    @Override // a.b.p.d0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.p.d0
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.p.d0
    public void setIcon(int resId) {
        setIcon(resId != 0 ? a.b.l.a.a.d(q(), resId) : null);
    }

    @Override // a.b.p.d0
    public void setIcon(Drawable d2) {
        this.f469e = d2;
        K();
    }

    @Override // a.b.p.d0
    public void m(int resId) {
        B(resId != 0 ? a.b.l.a.a.d(q(), resId) : null);
    }

    public void B(Drawable d2) {
        this.f470f = d2;
        K();
    }

    public final void K() {
        Drawable logo = null;
        int i2 = this.f466b;
        if ((i2 & 2) != 0) {
            if ((i2 & 1) != 0) {
                Drawable drawable = this.f470f;
                if (drawable == null) {
                    drawable = this.f469e;
                }
                logo = drawable;
            } else {
                logo = this.f469e;
            }
        }
        this.f465a.setLogo(logo);
    }

    @Override // a.b.p.d0
    public boolean g() {
        return this.f465a.d();
    }

    @Override // a.b.p.d0
    public boolean c() {
        return this.f465a.A();
    }

    @Override // a.b.p.d0
    public boolean b() {
        return this.f465a.z();
    }

    @Override // a.b.p.d0
    public boolean e() {
        return this.f465a.O();
    }

    @Override // a.b.p.d0
    public boolean d() {
        return this.f465a.w();
    }

    @Override // a.b.p.d0
    public void f() {
        this.m = true;
    }

    @Override // a.b.p.d0
    public void a(Menu menu, m.a cb) {
        if (this.n == null) {
            c cVar = new c(this.f465a.getContext());
            this.n = cVar;
            cVar.p(f.action_menu_presenter);
        }
        this.n.h(cb);
        this.f465a.I((g) menu, this.n);
    }

    @Override // a.b.p.d0
    public void h() {
        this.f465a.f();
    }

    @Override // a.b.p.d0
    public int j() {
        return this.f466b;
    }

    @Override // a.b.p.d0
    public void x(int newOpts) {
        View view;
        int changed = this.f466b ^ newOpts;
        this.f466b = newOpts;
        if (changed != 0) {
            if ((changed & 4) != 0) {
                if ((newOpts & 4) != 0) {
                    I();
                }
                J();
            }
            if ((changed & 3) != 0) {
                K();
            }
            if ((changed & 8) != 0) {
                if ((newOpts & 8) != 0) {
                    this.f465a.setTitle(this.i);
                    this.f465a.setSubtitle(this.j);
                } else {
                    this.f465a.setTitle((CharSequence) null);
                    this.f465a.setSubtitle((CharSequence) null);
                }
            }
            if ((changed & 16) != 0 && (view = this.f468d) != null) {
                if ((newOpts & 16) != 0) {
                    this.f465a.addView(view);
                } else {
                    this.f465a.removeView(view);
                }
            }
        }
    }

    @Override // a.b.p.d0
    public void n(p0 tabView) {
        Toolbar toolbar;
        View view = this.f467c;
        if (view != null && view.getParent() == (toolbar = this.f465a)) {
            toolbar.removeView(this.f467c);
        }
        this.f467c = tabView;
        if (tabView != null && this.o == 2) {
            this.f465a.addView(tabView, 0);
            Toolbar.e lp = (Toolbar.e) this.f467c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) lp).width = -2;
            ((ViewGroup.MarginLayoutParams) lp).height = -2;
            lp.f2a = 8388691;
            tabView.setAllowCollapse(true);
        }
    }

    @Override // a.b.p.d0
    public void w(boolean collapsible) {
        this.f465a.setCollapsible(collapsible);
    }

    @Override // a.b.p.d0
    public void p(boolean enable) {
    }

    @Override // a.b.p.d0
    public int r() {
        return this.o;
    }

    public void z(View view) {
        View view2 = this.f468d;
        if (!(view2 == null || (this.f466b & 16) == 0)) {
            this.f465a.removeView(view2);
        }
        this.f468d = view;
        if (view != null && (this.f466b & 16) != 0) {
            this.f465a.addView(view);
        }
    }

    @Override // a.b.p.d0
    public x s(int visibility, long duration) {
        x b2 = s.b(this.f465a);
        b2.a(visibility == 0 ? 1.0f : 0.0f);
        b2.d(duration);
        b2.f(new a(visibility));
        return b2;
    }

    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        public boolean f472a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f473b;

        public a(int i) {
            this.f473b = i;
        }

        @Override // a.h.m.z, a.h.m.y
        public void b(View view) {
            y0.this.f465a.setVisibility(0);
        }

        @Override // a.h.m.y
        public void a(View view) {
            if (!this.f472a) {
                y0.this.f465a.setVisibility(this.f473b);
            }
        }

        @Override // a.h.m.z, a.h.m.y
        public void c(View view) {
            this.f472a = true;
        }
    }

    public void E(Drawable icon) {
        this.f471g = icon;
        J();
    }

    public final void J() {
        if ((this.f466b & 4) != 0) {
            Toolbar toolbar = this.f465a;
            Drawable drawable = this.f471g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f465a.setNavigationIcon((Drawable) null);
    }

    public void D(CharSequence description) {
        this.k = description;
        I();
    }

    public void C(int resId) {
        D(resId == 0 ? null : q().getString(resId));
    }

    public final void I() {
        if ((this.f466b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f465a.setNavigationContentDescription(this.p);
        } else {
            this.f465a.setNavigationContentDescription(this.k);
        }
    }

    @Override // a.b.p.d0
    public void k(int visible) {
        this.f465a.setVisibility(visible);
    }

    @Override // a.b.p.d0
    public void i(m.a actionMenuPresenterCallback, g.a menuBuilderCallback) {
        this.f465a.J(actionMenuPresenterCallback, menuBuilderCallback);
    }

    @Override // a.b.p.d0
    public Menu l() {
        return this.f465a.getMenu();
    }
}
