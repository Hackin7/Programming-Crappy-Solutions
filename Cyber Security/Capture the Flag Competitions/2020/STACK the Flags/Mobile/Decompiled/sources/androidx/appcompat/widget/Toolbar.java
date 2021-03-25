package androidx.appcompat.widget;

import a.b.j;
import a.b.k.a;
import a.b.k.l;
import a.b.o.j.g;
import a.b.o.j.i;
import a.b.o.j.m;
import a.b.o.j.r;
import a.b.p.d0;
import a.b.p.d1;
import a.b.p.o;
import a.b.p.o0;
import a.b.p.w0;
import a.b.p.y0;
import a.b.p.z;
import a.h.m.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public f H;
    public final ActionMenuView.e I;
    public y0 J;
    public a.b.p.c K;
    public d L;
    public m.a M;
    public g.a N;
    public boolean O;
    public final Runnable P;

    /* renamed from: b  reason: collision with root package name */
    public ActionMenuView f1595b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f1596c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f1597d;

    /* renamed from: e  reason: collision with root package name */
    public ImageButton f1598e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f1599f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1600g;
    public CharSequence h;
    public ImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public o0 u;
    public int v;
    public int w;
    public int x;
    public CharSequence y;
    public CharSequence z;

    public interface f {
    }

    public class a implements ActionMenuView.e {
        public a() {
        }

        public boolean a(MenuItem item) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return ((l.b) fVar).a(item);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.O();
        }
    }

    public Toolbar(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        w0 a2 = w0.u(getContext(), attrs, j.Toolbar, defStyleAttr, 0);
        s.X(this, context, j.Toolbar, attrs, a2.q(), defStyleAttr, 0);
        this.m = a2.m(j.Toolbar_titleTextAppearance, 0);
        this.n = a2.m(j.Toolbar_subtitleTextAppearance, 0);
        this.x = a2.k(j.Toolbar_android_gravity, this.x);
        this.o = a2.k(j.Toolbar_buttonGravity, 48);
        int titleMargin = a2.d(j.Toolbar_titleMargin, 0);
        titleMargin = a2.r(j.Toolbar_titleMargins) ? a2.d(j.Toolbar_titleMargins, titleMargin) : titleMargin;
        this.t = titleMargin;
        this.s = titleMargin;
        this.r = titleMargin;
        this.q = titleMargin;
        int marginStart = a2.d(j.Toolbar_titleMarginStart, -1);
        if (marginStart >= 0) {
            this.q = marginStart;
        }
        int marginEnd = a2.d(j.Toolbar_titleMarginEnd, -1);
        if (marginEnd >= 0) {
            this.r = marginEnd;
        }
        int marginTop = a2.d(j.Toolbar_titleMarginTop, -1);
        if (marginTop >= 0) {
            this.s = marginTop;
        }
        int marginBottom = a2.d(j.Toolbar_titleMarginBottom, -1);
        if (marginBottom >= 0) {
            this.t = marginBottom;
        }
        this.p = a2.e(j.Toolbar_maxButtonHeight, -1);
        int contentInsetStart = a2.d(j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int contentInsetEnd = a2.d(j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int contentInsetLeft = a2.e(j.Toolbar_contentInsetLeft, 0);
        int contentInsetRight = a2.e(j.Toolbar_contentInsetRight, 0);
        h();
        this.u.e(contentInsetLeft, contentInsetRight);
        if (!(contentInsetStart == Integer.MIN_VALUE && contentInsetEnd == Integer.MIN_VALUE)) {
            this.u.g(contentInsetStart, contentInsetEnd);
        }
        this.v = a2.d(j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.w = a2.d(j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1600g = a2.f(j.Toolbar_collapseIcon);
        this.h = a2.o(j.Toolbar_collapseContentDescription);
        CharSequence title = a2.o(j.Toolbar_title);
        if (!TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        CharSequence subtitle = a2.o(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(subtitle)) {
            setSubtitle(subtitle);
        }
        this.k = getContext();
        setPopupTheme(a2.m(j.Toolbar_popupTheme, 0));
        Drawable navIcon = a2.f(j.Toolbar_navigationIcon);
        if (navIcon != null) {
            setNavigationIcon(navIcon);
        }
        CharSequence navDesc = a2.o(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(navDesc)) {
            setNavigationContentDescription(navDesc);
        }
        Drawable logo = a2.f(j.Toolbar_logo);
        if (logo != null) {
            setLogo(logo);
        }
        CharSequence logoDesc = a2.o(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(logoDesc)) {
            setLogoDescription(logoDesc);
        }
        if (a2.r(j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.c(j.Toolbar_titleTextColor));
        }
        if (a2.r(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.c(j.Toolbar_subtitleTextColor));
        }
        if (a2.r(j.Toolbar_menu)) {
            x(a2.m(j.Toolbar_menu, 0));
        }
        a2.v();
    }

    public void setPopupTheme(int resId) {
        if (this.l != resId) {
            this.l = resId;
            if (resId == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.l;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public void setTitleMarginStart(int margin) {
        this.q = margin;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public void setTitleMarginTop(int margin) {
        this.s = margin;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public void setTitleMarginEnd(int margin) {
        this.r = margin;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public void setTitleMarginBottom(int margin) {
        this.t = margin;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        h();
        o0 o0Var = this.u;
        boolean z2 = true;
        if (layoutDirection != 1) {
            z2 = false;
        }
        o0Var.f(z2);
    }

    public void setLogo(int resId) {
        setLogo(a.b.l.a.a.d(getContext(), resId));
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1595b) != null && actionMenuView.K();
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1595b;
        return actionMenuView != null && actionMenuView.J();
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f1595b;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.f1595b;
        return actionMenuView != null && actionMenuView.P();
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1595b;
        return actionMenuView != null && actionMenuView.H();
    }

    public void I(a.b.o.j.g menu, a.b.p.c outerPresenter) {
        if (menu != null || this.f1595b != null) {
            k();
            a.b.o.j.g oldMenu = this.f1595b.N();
            if (oldMenu != menu) {
                if (oldMenu != null) {
                    oldMenu.O(this.K);
                    oldMenu.O(this.L);
                }
                if (this.L == null) {
                    this.L = new d();
                }
                outerPresenter.G(true);
                if (menu != null) {
                    menu.c(outerPresenter, this.k);
                    menu.c(this.L, this.k);
                } else {
                    outerPresenter.d(this.k, null);
                    this.L.d(this.k, null);
                    outerPresenter.j(true);
                    this.L.j(true);
                }
                this.f1595b.setPopupTheme(this.l);
                this.f1595b.setPresenter(outerPresenter);
                this.K = outerPresenter;
            }
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1595b;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f1599f)) {
                c(this.f1599f, true);
            }
        } else {
            ImageView imageView = this.f1599f;
            if (imageView != null && y(imageView)) {
                removeView(this.f1599f);
                this.F.remove(this.f1599f);
            }
        }
        ImageView imageView2 = this.f1599f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1599f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int resId) {
        setLogoDescription(getContext().getText(resId));
    }

    public void setLogoDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            i();
        }
        ImageView imageView = this.f1599f;
        if (imageView != null) {
            imageView.setContentDescription(description);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1599f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public final void i() {
        if (this.f1599f == null) {
            this.f1599f = new o(getContext());
        }
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f1605c == null) ? false : true;
    }

    public void e() {
        i item;
        d dVar = this.L;
        if (dVar == null) {
            item = null;
        } else {
            item = dVar.f1605c;
        }
        if (item != null) {
            item.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    public void setTitle(CharSequence title) {
        if (!TextUtils.isEmpty(title)) {
            if (this.f1596c == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f1596c = zVar;
                zVar.setSingleLine();
                this.f1596c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.f1596c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1596c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1596c)) {
                c(this.f1596c, true);
            }
        } else {
            TextView textView = this.f1596c;
            if (textView != null && y(textView)) {
                removeView(this.f1596c);
                this.F.remove(this.f1596c);
            }
        }
        TextView textView2 = this.f1596c;
        if (textView2 != null) {
            textView2.setText(title);
        }
        this.y = title;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public void setSubtitle(int resId) {
        setSubtitle(getContext().getText(resId));
    }

    public void setSubtitle(CharSequence subtitle) {
        if (!TextUtils.isEmpty(subtitle)) {
            if (this.f1597d == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f1597d = zVar;
                zVar.setSingleLine();
                this.f1597d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.f1597d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f1597d.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1597d)) {
                c(this.f1597d, true);
            }
        } else {
            TextView textView = this.f1597d;
            if (textView != null && y(textView)) {
                removeView(this.f1597d);
                this.F.remove(this.f1597d);
            }
        }
        TextView textView2 = this.f1597d;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
        this.z = subtitle;
    }

    public void L(Context context, int resId) {
        this.m = resId;
        TextView textView = this.f1596c;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void K(Context context, int resId) {
        this.n = resId;
        TextView textView = this.f1597d;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void setTitleTextColor(int color) {
        setTitleTextColor(ColorStateList.valueOf(color));
    }

    public void setTitleTextColor(ColorStateList color) {
        this.A = color;
        TextView textView = this.f1596c;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public void setSubtitleTextColor(int color) {
        setSubtitleTextColor(ColorStateList.valueOf(color));
    }

    public void setSubtitleTextColor(ColorStateList color) {
        this.B = color;
        TextView textView = this.f1597d;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1598e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int resId) {
        setNavigationContentDescription(resId != 0 ? getContext().getText(resId) : null);
    }

    public void setNavigationContentDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            l();
        }
        ImageButton imageButton = this.f1598e;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public void setNavigationIcon(int resId) {
        setNavigationIcon(a.b.l.a.a.d(getContext(), resId));
    }

    public void setNavigationIcon(Drawable icon) {
        if (icon != null) {
            l();
            if (!y(this.f1598e)) {
                c(this.f1598e, true);
            }
        } else {
            ImageButton imageButton = this.f1598e;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f1598e);
                this.F.remove(this.f1598e);
            }
        }
        ImageButton imageButton2 = this.f1598e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(icon);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1598e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener listener) {
        l();
        this.f1598e.setOnClickListener(listener);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int resId) {
        setCollapseContentDescription(resId != 0 ? getContext().getText(resId) : null);
    }

    public void setCollapseContentDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            g();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int resId) {
        setCollapseIcon(a.b.l.a.a.d(getContext(), resId));
    }

    public void setCollapseIcon(Drawable icon) {
        if (icon != null) {
            g();
            this.i.setImageDrawable(icon);
            return;
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1600g);
        }
    }

    public Menu getMenu() {
        j();
        return this.f1595b.getMenu();
    }

    public void setOverflowIcon(Drawable icon) {
        j();
        this.f1595b.setOverflowIcon(icon);
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1595b.getOverflowIcon();
    }

    public final void j() {
        k();
        if (this.f1595b.N() == null) {
            a.b.o.j.g menu = (a.b.o.j.g) this.f1595b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f1595b.setExpandedActionViewsExclusive(true);
            menu.c(this.L, this.k);
        }
    }

    public final void k() {
        if (this.f1595b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1595b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f1595b.setOnMenuItemClickListener(this.I);
            this.f1595b.O(this.M, this.N);
            e lp = generateDefaultLayoutParams();
            lp.f2a = 8388613 | (this.o & 112);
            this.f1595b.setLayoutParams(lp);
            c(this.f1595b, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new a.b.o.g(getContext());
    }

    public void x(int resId) {
        getMenuInflater().inflate(resId, getMenu());
    }

    public void setOnMenuItemClickListener(f listener) {
        this.H = listener;
    }

    public void H(int contentInsetStart, int contentInsetEnd) {
        h();
        this.u.g(contentInsetStart, contentInsetEnd);
    }

    public int getContentInsetStart() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.v;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int insetStartWithNavigation) {
        if (insetStartWithNavigation < 0) {
            insetStartWithNavigation = Integer.MIN_VALUE;
        }
        if (insetStartWithNavigation != this.v) {
            this.v = insetStartWithNavigation;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.w;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int insetEndWithActions) {
        if (insetEndWithActions < 0) {
            insetEndWithActions = Integer.MIN_VALUE;
        }
        if (insetEndWithActions != this.w) {
            this.w = insetEndWithActions;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.v, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean hasActions = false;
        ActionMenuView actionMenuView = this.f1595b;
        if (actionMenuView != null) {
            a.b.o.j.g mb = actionMenuView.N();
            hasActions = mb != null && mb.hasVisibleItems();
        }
        if (hasActions) {
            return Math.max(getContentInsetEnd(), Math.max(this.w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (s.v(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (s.v(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public final void l() {
        if (this.f1598e == null) {
            this.f1598e = new a.b.p.m(getContext(), null, a.b.a.toolbarNavigationButtonStyle);
            e lp = generateDefaultLayoutParams();
            lp.f2a = 8388611 | (this.o & 112);
            this.f1598e.setLayoutParams(lp);
        }
    }

    public void g() {
        if (this.i == null) {
            a.b.p.m mVar = new a.b.p.m(getContext(), null, a.b.a.toolbarNavigationButtonStyle);
            this.i = mVar;
            mVar.setImageDrawable(this.f1600g);
            this.i.setContentDescription(this.h);
            e lp = generateDefaultLayoutParams();
            lp.f2a = 8388611 | (this.o & 112);
            lp.f1607b = 2;
            this.i.setLayoutParams(lp);
            this.i.setOnClickListener(new c());
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View v) {
            Toolbar.this.e();
        }
    }

    public final void c(View v2, boolean allowHide) {
        e lp;
        ViewGroup.LayoutParams vlp = v2.getLayoutParams();
        if (vlp == null) {
            lp = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(vlp)) {
            lp = generateLayoutParams(vlp);
        } else {
            lp = (e) vlp;
        }
        lp.f1607b = 1;
        if (!allowHide || this.j == null) {
            addView(v2, lp);
            return;
        }
        v2.setLayoutParams(lp);
        this.F.add(v2);
    }

    public Parcelable onSaveInstanceState() {
        i iVar;
        g state = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (!(dVar == null || (iVar = dVar.f1605c) == null)) {
            state.f1608d = iVar.getItemId();
        }
        state.f1609e = A();
        return state;
    }

    public void onRestoreInstanceState(Parcelable state) {
        MenuItem item;
        if (!(state instanceof g)) {
            super.onRestoreInstanceState(state);
            return;
        }
        g ss = (g) state;
        super.onRestoreInstanceState(ss.a());
        ActionMenuView actionMenuView = this.f1595b;
        Menu menu = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = ss.f1608d;
        if (!(i2 == 0 || this.L == null || menu == null || (item = menu.findItem(i2)) == null)) {
            item.expandActionView();
        }
        if (ss.f1609e) {
            F();
        }
    }

    public final void F() {
        removeCallbacks(this.P);
        post(this.P);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.C = true;
            }
        }
        if (action == 1 || action == 3) {
            this.C = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.D = true;
            }
        }
        if (action == 10 || action == 3) {
            this.D = false;
        }
        return true;
    }

    public final void E(View child, int parentWidthSpec, int widthUsed, int parentHeightSpec, int heightUsed, int heightConstraint) {
        int size;
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int childWidthSpec = ViewGroup.getChildMeasureSpec(parentWidthSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width);
        int childHeightSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        int childHeightMode = View.MeasureSpec.getMode(childHeightSpec);
        if (childHeightMode != 1073741824 && heightConstraint >= 0) {
            if (childHeightMode != 0) {
                size = Math.min(View.MeasureSpec.getSize(childHeightSpec), heightConstraint);
            } else {
                size = heightConstraint;
            }
            childHeightSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        child.measure(childWidthSpec, childHeightSpec);
    }

    public final int D(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed, int[] collapsingMargins) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int leftDiff = lp.leftMargin - collapsingMargins[0];
        int rightDiff = lp.rightMargin - collapsingMargins[1];
        int hMargins = Math.max(0, leftDiff) + Math.max(0, rightDiff);
        collapsingMargins[0] = Math.max(0, -leftDiff);
        collapsingMargins[1] = Math.max(0, -rightDiff);
        child.measure(ViewGroup.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + hMargins + widthUsed, lp.width), ViewGroup.getChildMeasureSpec(parentHeightMeasureSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height));
        return child.getMeasuredWidth() + hMargins;
    }

    public final boolean M() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if (N(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int marginEndIndex;
        int marginStartIndex;
        int marginStartIndex2;
        int menuWidth;
        int titleHeight;
        int childCount;
        int childState;
        int height = 0;
        int childState2 = 0;
        int[] collapsingMargins = this.G;
        if (d1.b(this)) {
            marginStartIndex = 1;
            marginEndIndex = 0;
        } else {
            marginStartIndex = 0;
            marginEndIndex = 1;
        }
        int navWidth = 0;
        if (N(this.f1598e)) {
            E(this.f1598e, widthMeasureSpec, 0, heightMeasureSpec, 0, this.p);
            navWidth = this.f1598e.getMeasuredWidth() + s(this.f1598e);
            height = Math.max(0, this.f1598e.getMeasuredHeight() + t(this.f1598e));
            childState2 = View.combineMeasuredStates(0, this.f1598e.getMeasuredState());
        }
        if (N(this.i)) {
            E(this.i, widthMeasureSpec, 0, heightMeasureSpec, 0, this.p);
            navWidth = this.i.getMeasuredWidth() + s(this.i);
            height = Math.max(height, this.i.getMeasuredHeight() + t(this.i));
            childState2 = View.combineMeasuredStates(childState2, this.i.getMeasuredState());
        }
        int contentInsetStart = getCurrentContentInsetStart();
        int width = 0 + Math.max(contentInsetStart, navWidth);
        collapsingMargins[marginStartIndex] = Math.max(0, contentInsetStart - navWidth);
        if (N(this.f1595b)) {
            marginStartIndex2 = 0;
            E(this.f1595b, widthMeasureSpec, width, heightMeasureSpec, 0, this.p);
            int menuWidth2 = this.f1595b.getMeasuredWidth() + s(this.f1595b);
            height = Math.max(height, this.f1595b.getMeasuredHeight() + t(this.f1595b));
            childState2 = View.combineMeasuredStates(childState2, this.f1595b.getMeasuredState());
            menuWidth = menuWidth2;
        } else {
            marginStartIndex2 = 0;
            menuWidth = 0;
        }
        int contentInsetEnd = getCurrentContentInsetEnd();
        int width2 = width + Math.max(contentInsetEnd, menuWidth);
        collapsingMargins[marginEndIndex] = Math.max(marginStartIndex2, contentInsetEnd - menuWidth);
        if (N(this.j)) {
            width2 += D(this.j, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            height = Math.max(height, this.j.getMeasuredHeight() + t(this.j));
            childState2 = View.combineMeasuredStates(childState2, this.j.getMeasuredState());
        }
        if (N(this.f1599f)) {
            width2 += D(this.f1599f, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            height = Math.max(height, this.f1599f.getMeasuredHeight() + t(this.f1599f));
            childState2 = View.combineMeasuredStates(childState2, this.f1599f.getMeasuredState());
        }
        int childCount2 = getChildCount();
        int childState3 = childState2;
        int height2 = height;
        int width3 = width2;
        int i2 = 0;
        while (i2 < childCount2) {
            View child = getChildAt(i2);
            if (((e) child.getLayoutParams()).f1607b != 0) {
                childState = childState3;
                childCount = childCount2;
            } else if (!N(child)) {
                childState = childState3;
                childCount = childCount2;
            } else {
                childCount = childCount2;
                width3 += D(child, widthMeasureSpec, width3, heightMeasureSpec, 0, collapsingMargins);
                height2 = Math.max(height2, child.getMeasuredHeight() + t(child));
                childState3 = View.combineMeasuredStates(childState3, child.getMeasuredState());
                i2++;
                childCount2 = childCount;
            }
            childState3 = childState;
            i2++;
            childCount2 = childCount;
        }
        int childState4 = childState3;
        int titleWidth = 0;
        int titleHeight2 = 0;
        int titleVertMargins = this.s + this.t;
        int titleHorizMargins = this.q + this.r;
        if (N(this.f1596c)) {
            D(this.f1596c, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleVertMargins, collapsingMargins);
            titleWidth = this.f1596c.getMeasuredWidth() + s(this.f1596c);
            titleHeight2 = this.f1596c.getMeasuredHeight() + t(this.f1596c);
            childState4 = View.combineMeasuredStates(childState4, this.f1596c.getMeasuredState());
        }
        if (N(this.f1597d)) {
            titleWidth = Math.max(titleWidth, D(this.f1597d, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleHeight2 + titleVertMargins, collapsingMargins));
            int titleHeight3 = titleHeight2 + this.f1597d.getMeasuredHeight() + t(this.f1597d);
            childState4 = View.combineMeasuredStates(childState4, this.f1597d.getMeasuredState());
            titleHeight = titleHeight3;
        } else {
            titleHeight = titleHeight2;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(width3 + titleWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, -16777216 & childState4), M() ? 0 : View.resolveSizeAndState(Math.max(Math.max(height2, titleHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState4 << 16));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        if (r33.f1596c.getMeasuredWidth() <= 0) goto L_0x0163;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0257  */
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int paddingRight;
        int alignmentHeight;
        int paddingLeft;
        int width;
        boolean titleHasWidth;
        int i2;
        int left;
        int spaceBelow;
        int left2;
        boolean isRtl = s.v(this) == 1;
        int width2 = getWidth();
        int height = getHeight();
        int paddingLeft2 = getPaddingLeft();
        int paddingRight2 = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int left3 = paddingLeft2;
        int right = width2 - paddingRight2;
        int[] collapsingMargins = this.G;
        collapsingMargins[1] = 0;
        collapsingMargins[0] = 0;
        int minHeight = s.w(this);
        int alignmentHeight2 = minHeight >= 0 ? Math.min(minHeight, b2 - t2) : 0;
        if (N(this.f1598e)) {
            if (isRtl) {
                right = C(this.f1598e, right, collapsingMargins, alignmentHeight2);
            } else {
                left3 = B(this.f1598e, left3, collapsingMargins, alignmentHeight2);
            }
        }
        if (N(this.i)) {
            if (isRtl) {
                right = C(this.i, right, collapsingMargins, alignmentHeight2);
            } else {
                left3 = B(this.i, left3, collapsingMargins, alignmentHeight2);
            }
        }
        if (N(this.f1595b)) {
            if (isRtl) {
                left3 = B(this.f1595b, left3, collapsingMargins, alignmentHeight2);
            } else {
                right = C(this.f1595b, right, collapsingMargins, alignmentHeight2);
            }
        }
        int contentInsetLeft = getCurrentContentInsetLeft();
        int contentInsetRight = getCurrentContentInsetRight();
        collapsingMargins[0] = Math.max(0, contentInsetLeft - left3);
        collapsingMargins[1] = Math.max(0, contentInsetRight - ((width2 - paddingRight2) - right));
        int left4 = Math.max(left3, contentInsetLeft);
        int right2 = Math.min(right, (width2 - paddingRight2) - contentInsetRight);
        if (N(this.j)) {
            if (isRtl) {
                right2 = C(this.j, right2, collapsingMargins, alignmentHeight2);
            } else {
                left4 = B(this.j, left4, collapsingMargins, alignmentHeight2);
            }
        }
        if (N(this.f1599f)) {
            if (isRtl) {
                right2 = C(this.f1599f, right2, collapsingMargins, alignmentHeight2);
            } else {
                left4 = B(this.f1599f, left4, collapsingMargins, alignmentHeight2);
            }
        }
        boolean layoutTitle = N(this.f1596c);
        boolean layoutSubtitle = N(this.f1597d);
        int titleHeight = 0;
        if (layoutTitle) {
            e lp = (e) this.f1596c.getLayoutParams();
            paddingRight = paddingRight2;
            titleHeight = 0 + ((ViewGroup.MarginLayoutParams) lp).topMargin + this.f1596c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
        } else {
            paddingRight = paddingRight2;
        }
        if (layoutSubtitle) {
            e lp2 = (e) this.f1597d.getLayoutParams();
            titleHeight += ((ViewGroup.MarginLayoutParams) lp2).topMargin + this.f1597d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp2).bottomMargin;
        }
        if (layoutTitle || layoutSubtitle) {
            View topChild = layoutTitle ? this.f1596c : this.f1597d;
            View bottomChild = layoutSubtitle ? this.f1597d : this.f1596c;
            e toplp = (e) topChild.getLayoutParams();
            e bottomlp = (e) bottomChild.getLayoutParams();
            if (layoutTitle) {
            }
            if (!layoutSubtitle || this.f1597d.getMeasuredWidth() <= 0) {
                titleHasWidth = false;
                width = width2;
                i2 = this.x & 112;
                paddingLeft = paddingLeft2;
                if (i2 != 48) {
                    left = left4;
                    alignmentHeight = alignmentHeight2;
                    spaceBelow = getPaddingTop() + ((ViewGroup.MarginLayoutParams) toplp).topMargin + this.s;
                } else if (i2 != 80) {
                    int spaceAbove = (((height - paddingTop) - paddingBottom) - titleHeight) / 2;
                    int space = ((ViewGroup.MarginLayoutParams) toplp).topMargin;
                    alignmentHeight = alignmentHeight2;
                    int alignmentHeight3 = this.s;
                    left = left4;
                    if (spaceAbove < space + alignmentHeight3) {
                        spaceAbove = space + alignmentHeight3;
                    } else {
                        int spaceBelow2 = (((height - paddingBottom) - titleHeight) - spaceAbove) - paddingTop;
                        int i3 = ((ViewGroup.MarginLayoutParams) toplp).bottomMargin;
                        int i4 = this.t;
                        if (spaceBelow2 < i3 + i4) {
                            spaceAbove = Math.max(0, spaceAbove - ((((ViewGroup.MarginLayoutParams) bottomlp).bottomMargin + i4) - spaceBelow2));
                        }
                    }
                    spaceBelow = paddingTop + spaceAbove;
                } else {
                    left = left4;
                    alignmentHeight = alignmentHeight2;
                    spaceBelow = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) bottomlp).bottomMargin) - this.t) - titleHeight;
                }
                if (!isRtl) {
                    int rd = (titleHasWidth ? this.q : 0) - collapsingMargins[1];
                    right2 -= Math.max(0, rd);
                    collapsingMargins[1] = Math.max(0, -rd);
                    int titleRight = right2;
                    int subtitleRight = right2;
                    if (layoutTitle) {
                        int titleLeft = titleRight - this.f1596c.getMeasuredWidth();
                        int titleBottom = this.f1596c.getMeasuredHeight() + spaceBelow;
                        this.f1596c.layout(titleLeft, spaceBelow, titleRight, titleBottom);
                        titleRight = titleLeft - this.r;
                        spaceBelow = titleBottom + ((ViewGroup.MarginLayoutParams) ((e) this.f1596c.getLayoutParams())).bottomMargin;
                    }
                    if (layoutSubtitle) {
                        e lp3 = (e) this.f1597d.getLayoutParams();
                        int titleTop = spaceBelow + ((ViewGroup.MarginLayoutParams) lp3).topMargin;
                        int subtitleBottom = this.f1597d.getMeasuredHeight() + titleTop;
                        this.f1597d.layout(subtitleRight - this.f1597d.getMeasuredWidth(), titleTop, subtitleRight, subtitleBottom);
                        subtitleRight -= this.r;
                        int titleTop2 = subtitleBottom + ((ViewGroup.MarginLayoutParams) lp3).bottomMargin;
                    }
                    if (titleHasWidth) {
                        right2 = Math.min(titleRight, subtitleRight);
                    }
                    left4 = left;
                } else {
                    int ld = (titleHasWidth ? this.q : 0) - collapsingMargins[0];
                    int left5 = left + Math.max(0, ld);
                    collapsingMargins[0] = Math.max(0, -ld);
                    int titleLeft2 = left5;
                    int subtitleLeft = left5;
                    if (layoutTitle) {
                        int titleRight2 = this.f1596c.getMeasuredWidth() + titleLeft2;
                        left2 = left5;
                        int titleBottom2 = this.f1596c.getMeasuredHeight() + spaceBelow;
                        this.f1596c.layout(titleLeft2, spaceBelow, titleRight2, titleBottom2);
                        titleLeft2 = titleRight2 + this.r;
                        spaceBelow = titleBottom2 + ((ViewGroup.MarginLayoutParams) ((e) this.f1596c.getLayoutParams())).bottomMargin;
                    } else {
                        left2 = left5;
                    }
                    if (layoutSubtitle) {
                        e lp4 = (e) this.f1597d.getLayoutParams();
                        int titleTop3 = spaceBelow + ((ViewGroup.MarginLayoutParams) lp4).topMargin;
                        int subtitleRight2 = this.f1597d.getMeasuredWidth() + subtitleLeft;
                        int subtitleBottom2 = this.f1597d.getMeasuredHeight() + titleTop3;
                        this.f1597d.layout(subtitleLeft, titleTop3, subtitleRight2, subtitleBottom2);
                        subtitleLeft = subtitleRight2 + this.r;
                        int titleTop4 = subtitleBottom2 + ((ViewGroup.MarginLayoutParams) lp4).bottomMargin;
                    }
                    if (titleHasWidth) {
                        left4 = Math.max(titleLeft2, subtitleLeft);
                    } else {
                        left4 = left2;
                    }
                }
            }
            titleHasWidth = true;
            width = width2;
            i2 = this.x & 112;
            paddingLeft = paddingLeft2;
            if (i2 != 48) {
            }
            if (!isRtl) {
            }
        } else {
            width = width2;
            paddingLeft = paddingLeft2;
            alignmentHeight = alignmentHeight2;
        }
        b(this.E, 3);
        int leftViewsCount = this.E.size();
        for (int i5 = 0; i5 < leftViewsCount; i5++) {
            left4 = B(this.E.get(i5), left4, collapsingMargins, alignmentHeight);
        }
        b(this.E, 5);
        int rightViewsCount = this.E.size();
        for (int i6 = 0; i6 < rightViewsCount; i6++) {
            right2 = C(this.E.get(i6), right2, collapsingMargins, alignmentHeight);
        }
        b(this.E, 1);
        int centerViewsWidth = u(this.E, collapsingMargins);
        int centerLeft = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (centerViewsWidth / 2);
        int centerRight = centerLeft + centerViewsWidth;
        if (centerLeft < left4) {
            centerLeft = left4;
        } else if (centerRight > right2) {
            centerLeft -= centerRight - right2;
        }
        int centerViewsCount = this.E.size();
        int i7 = 0;
        while (i7 < centerViewsCount) {
            centerLeft = B(this.E.get(i7), centerLeft, collapsingMargins, alignmentHeight);
            i7++;
            left4 = left4;
        }
        this.E.clear();
    }

    public final int u(List<View> views, int[] collapsingMargins) {
        int collapseLeft = collapsingMargins[0];
        int collapseRight = collapsingMargins[1];
        int width = 0;
        int count = views.size();
        for (int i2 = 0; i2 < count; i2++) {
            View v2 = views.get(i2);
            e lp = (e) v2.getLayoutParams();
            int l2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapseLeft;
            int r2 = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapseRight;
            int leftMargin = Math.max(0, l2);
            int rightMargin = Math.max(0, r2);
            collapseLeft = Math.max(0, -l2);
            collapseRight = Math.max(0, -r2);
            width += v2.getMeasuredWidth() + leftMargin + rightMargin;
        }
        return width;
    }

    public final int B(View child, int left, int[] collapsingMargins, int alignmentHeight) {
        e lp = (e) child.getLayoutParams();
        int l2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapsingMargins[0];
        int left2 = left + Math.max(0, l2);
        collapsingMargins[0] = Math.max(0, -l2);
        int top = q(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(left2, top, left2 + childWidth, child.getMeasuredHeight() + top);
        return left2 + ((ViewGroup.MarginLayoutParams) lp).rightMargin + childWidth;
    }

    public final int C(View child, int right, int[] collapsingMargins, int alignmentHeight) {
        e lp = (e) child.getLayoutParams();
        int r2 = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapsingMargins[1];
        int right2 = right - Math.max(0, r2);
        collapsingMargins[1] = Math.max(0, -r2);
        int top = q(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(right2 - childWidth, top, right2, child.getMeasuredHeight() + top);
        return right2 - (((ViewGroup.MarginLayoutParams) lp).leftMargin + childWidth);
    }

    public final int q(View child, int alignmentHeight) {
        e lp = (e) child.getLayoutParams();
        int childHeight = child.getMeasuredHeight();
        int alignmentOffset = alignmentHeight > 0 ? (childHeight - alignmentHeight) / 2 : 0;
        int r2 = r(lp.f2a);
        if (r2 == 48) {
            return getPaddingTop() - alignmentOffset;
        }
        if (r2 == 80) {
            return (((getHeight() - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) - alignmentOffset;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int spaceAbove = (((height - paddingTop) - paddingBottom) - childHeight) / 2;
        if (spaceAbove < ((ViewGroup.MarginLayoutParams) lp).topMargin) {
            spaceAbove = ((ViewGroup.MarginLayoutParams) lp).topMargin;
        } else {
            int spaceBelow = (((height - paddingBottom) - childHeight) - spaceAbove) - paddingTop;
            int i2 = ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
            if (spaceBelow < i2) {
                spaceAbove = Math.max(0, spaceAbove - (i2 - spaceBelow));
            }
        }
        return paddingTop + spaceAbove;
    }

    public final int r(int gravity) {
        int vgrav = gravity & 112;
        if (vgrav == 16 || vgrav == 48 || vgrav == 80) {
            return vgrav;
        }
        return this.x & 112;
    }

    public final void b(List<View> views, int gravity) {
        boolean isRtl = true;
        if (s.v(this) != 1) {
            isRtl = false;
        }
        int childCount = getChildCount();
        int absGrav = a.h.m.d.b(gravity, s.v(this));
        views.clear();
        if (isRtl) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View child = getChildAt(i2);
                e lp = (e) child.getLayoutParams();
                if (lp.f1607b == 0 && N(child) && p(lp.f2a) == absGrav) {
                    views.add(child);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View child2 = getChildAt(i3);
            e lp2 = (e) child2.getLayoutParams();
            if (lp2.f1607b == 0 && N(child2) && p(lp2.f2a) == absGrav) {
                views.add(child2);
            }
        }
    }

    public final int p(int gravity) {
        int ld = s.v(this);
        int hGrav = a.h.m.d.b(gravity, ld) & 7;
        if (hGrav == 1 || hGrav == 3 || hGrav == 5) {
            return hGrav;
        }
        if (ld == 1) {
            return 5;
        }
        return 3;
    }

    public final boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final int s(View v2) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        return a.h.m.g.b(mlp) + a.h.m.g.a(mlp);
    }

    public final int t(View v2) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        return mlp.topMargin + mlp.bottomMargin;
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attrs) {
        return new e(getContext(), attrs);
    }

    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams p2) {
        if (p2 instanceof e) {
            return new e((e) p2);
        }
        if (p2 instanceof a.C0000a) {
            return new e((a.C0000a) p2);
        }
        if (p2 instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) p2);
        }
        return new e(p2);
    }

    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return super.checkLayoutParams(p2) && (p2 instanceof e);
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new y0(this, true);
        }
        return this.J;
    }

    public void G() {
        for (int i2 = getChildCount() - 1; i2 >= 0; i2--) {
            View child = getChildAt(i2);
            if (!(((e) child.getLayoutParams()).f1607b == 2 || child == this.f1595b)) {
                removeViewAt(i2);
                this.F.add(child);
            }
        }
    }

    public void a() {
        for (int i2 = this.F.size() - 1; i2 >= 0; i2--) {
            addView(this.F.get(i2));
        }
        this.F.clear();
    }

    public final boolean y(View child) {
        return child.getParent() == this || this.F.contains(child);
    }

    public void setCollapsible(boolean collapsible) {
        this.O = collapsible;
        requestLayout();
    }

    public void J(m.a pcb, g.a mcb) {
        this.M = pcb;
        this.N = mcb;
        ActionMenuView actionMenuView = this.f1595b;
        if (actionMenuView != null) {
            actionMenuView.O(pcb, mcb);
        }
    }

    public final void h() {
        if (this.u == null) {
            this.u = new o0();
        }
    }

    public final TextView getTitleTextView() {
        return this.f1596c;
    }

    public final TextView getSubtitleTextView() {
        return this.f1597d;
    }

    public a.b.p.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Context getPopupContext() {
        return this.k;
    }

    public static class e extends a.C0000a {

        /* renamed from: b  reason: collision with root package name */
        public int f1607b = 0;

        public e(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public e(int width, int height) {
            super(width, height);
            this.f2a = 8388627;
        }

        public e(e source) {
            super((a.C0000a) source);
            this.f1607b = source.f1607b;
        }

        public e(a.C0000a source) {
            super(source);
        }

        public e(ViewGroup.MarginLayoutParams source) {
            super(source);
            a(source);
        }

        public e(ViewGroup.LayoutParams source) {
            super(source);
        }

        public void a(ViewGroup.MarginLayoutParams source) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = source.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = source.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = source.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = source.bottomMargin;
        }
    }

    public static class g extends a.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public int f1608d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1609e;

        public g(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f1608d = source.readInt();
            this.f1609e = source.readInt() != 0;
        }

        public g(Parcelable superState) {
            super(superState);
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f1608d);
            out.writeInt(this.f1609e ? 1 : 0);
        }

        public class a implements Parcelable.ClassLoaderCreator<g> {
            /* renamed from: b */
            public g createFromParcel(Parcel in, ClassLoader loader) {
                return new g(in, loader);
            }

            /* renamed from: a */
            public g createFromParcel(Parcel in) {
                return new g(in, null);
            }

            /* renamed from: c */
            public g[] newArray(int size) {
                return new g[size];
            }
        }
    }

    public class d implements m {

        /* renamed from: b  reason: collision with root package name */
        public a.b.o.j.g f1604b;

        /* renamed from: c  reason: collision with root package name */
        public i f1605c;

        public d() {
        }

        @Override // a.b.o.j.m
        public void d(Context context, a.b.o.j.g menu) {
            i iVar;
            a.b.o.j.g gVar = this.f1604b;
            if (!(gVar == null || (iVar = this.f1605c) == null)) {
                gVar.f(iVar);
            }
            this.f1604b = menu;
        }

        @Override // a.b.o.j.m
        public void j(boolean cleared) {
            if (this.f1605c != null) {
                boolean found = false;
                a.b.o.j.g gVar = this.f1604b;
                if (gVar != null) {
                    int count = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= count) {
                            break;
                        } else if (this.f1604b.getItem(i) == this.f1605c) {
                            found = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!found) {
                    e(this.f1604b, this.f1605c);
                }
            }
        }

        @Override // a.b.o.j.m
        public void h(m.a cb) {
        }

        @Override // a.b.o.j.m
        public boolean i(r subMenu) {
            return false;
        }

        @Override // a.b.o.j.m
        public void a(a.b.o.j.g menu, boolean allMenusAreClosing) {
        }

        @Override // a.b.o.j.m
        public boolean c() {
            return false;
        }

        @Override // a.b.o.j.m
        public boolean g(a.b.o.j.g menu, i item) {
            Toolbar.this.g();
            ViewParent collapseButtonParent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (collapseButtonParent != toolbar) {
                if (collapseButtonParent instanceof ViewGroup) {
                    ((ViewGroup) collapseButtonParent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = item.getActionView();
            this.f1605c = item;
            ViewParent expandedActionParent = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (expandedActionParent != toolbar3) {
                if (expandedActionParent instanceof ViewGroup) {
                    ((ViewGroup) expandedActionParent).removeView(toolbar3.j);
                }
                e lp = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                lp.f2a = 8388611 | (toolbar4.o & 112);
                lp.f1607b = 2;
                toolbar4.j.setLayoutParams(lp);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            item.r(true);
            View view = Toolbar.this.j;
            if (view instanceof a.b.o.c) {
                ((a.b.o.c) view).c();
            }
            return true;
        }

        @Override // a.b.o.j.m
        public boolean e(a.b.o.j.g menu, i item) {
            View view = Toolbar.this.j;
            if (view instanceof a.b.o.c) {
                ((a.b.o.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            toolbar3.a();
            this.f1605c = null;
            Toolbar.this.requestLayout();
            item.r(false);
            return true;
        }
    }
}
