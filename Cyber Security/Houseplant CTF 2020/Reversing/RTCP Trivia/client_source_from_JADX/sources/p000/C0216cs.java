package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0082a;
import androidx.appcompat.widget.Toolbar.C0083b;

/* renamed from: cs */
public final class C0216cs implements C0180ca {

    /* renamed from: a */
    Toolbar f1089a;

    /* renamed from: b */
    CharSequence f1090b;

    /* renamed from: c */
    Callback f1091c;

    /* renamed from: d */
    boolean f1092d;

    /* renamed from: e */
    private int f1093e;

    /* renamed from: f */
    private View f1094f;

    /* renamed from: g */
    private View f1095g;

    /* renamed from: h */
    private Drawable f1096h;

    /* renamed from: i */
    private Drawable f1097i;

    /* renamed from: j */
    private Drawable f1098j;

    /* renamed from: k */
    private boolean f1099k;

    /* renamed from: l */
    private CharSequence f1100l;

    /* renamed from: m */
    private CharSequence f1101m;

    /* renamed from: n */
    private C0127ba f1102n;

    /* renamed from: o */
    private int f1103o;

    /* renamed from: p */
    private int f1104p;

    /* renamed from: q */
    private Drawable f1105q;

    public C0216cs(Toolbar toolbar) {
        this(toolbar, C0124h.abc_action_bar_up_description);
    }

    private C0216cs(Toolbar toolbar, int i) {
        this.f1103o = 0;
        this.f1104p = 0;
        this.f1089a = toolbar;
        this.f1090b = toolbar.getTitle();
        this.f1100l = toolbar.getSubtitle();
        this.f1099k = this.f1090b != null;
        this.f1098j = toolbar.getNavigationIcon();
        String str = null;
        C0215cr a = C0215cr.m676a(toolbar.getContext(), null, C0126j.ActionBar, C0117a.actionBarStyle, 0);
        this.f1105q = a.mo1312a(C0126j.ActionBar_homeAsUpIndicator);
        CharSequence c = a.mo1317c(C0126j.ActionBar_title);
        if (!TextUtils.isEmpty(c)) {
            this.f1099k = true;
            m692b(c);
        }
        CharSequence c2 = a.mo1317c(C0126j.ActionBar_subtitle);
        if (!TextUtils.isEmpty(c2)) {
            this.f1100l = c2;
            if ((this.f1093e & 8) != 0) {
                this.f1089a.setSubtitle(c2);
            }
        }
        Drawable a2 = a.mo1312a(C0126j.ActionBar_logo);
        if (a2 != null) {
            m691b(a2);
        }
        Drawable a3 = a.mo1312a(C0126j.ActionBar_icon);
        if (a3 != null) {
            mo1131a(a3);
        }
        if (this.f1098j == null && this.f1105q != null) {
            this.f1098j = this.f1105q;
            m694s();
        }
        mo1140c(a.mo1311a(C0126j.ActionBar_displayOptions, 0));
        int g = a.mo1324g(C0126j.ActionBar_customNavigationLayout, 0);
        if (g != 0) {
            View inflate = LayoutInflater.from(this.f1089a.getContext()).inflate(g, this.f1089a, false);
            if (!(this.f1095g == null || (this.f1093e & 16) == 0)) {
                this.f1089a.removeView(this.f1095g);
            }
            this.f1095g = inflate;
            if (!(inflate == null || (this.f1093e & 16) == 0)) {
                this.f1089a.addView(this.f1095g);
            }
            mo1140c(this.f1093e | 16);
        }
        int f = a.mo1322f(C0126j.ActionBar_height, 0);
        if (f > 0) {
            LayoutParams layoutParams = this.f1089a.getLayoutParams();
            layoutParams.height = f;
            this.f1089a.setLayoutParams(layoutParams);
        }
        int d = a.mo1318d(C0126j.ActionBar_contentInsetStart, -1);
        int d2 = a.mo1318d(C0126j.ActionBar_contentInsetEnd, -1);
        if (d >= 0 || d2 >= 0) {
            Toolbar toolbar2 = this.f1089a;
            int max = Math.max(d, 0);
            int max2 = Math.max(d2, 0);
            toolbar2.mo628f();
            toolbar2.f540m.mo1275a(max, max2);
        }
        int g2 = a.mo1324g(C0126j.ActionBar_titleTextStyle, 0);
        if (g2 != 0) {
            Toolbar toolbar3 = this.f1089a;
            Context context = this.f1089a.getContext();
            toolbar3.f537j = g2;
            if (toolbar3.f529b != null) {
                toolbar3.f529b.setTextAppearance(context, g2);
            }
        }
        int g3 = a.mo1324g(C0126j.ActionBar_subtitleTextStyle, 0);
        if (g3 != 0) {
            Toolbar toolbar4 = this.f1089a;
            Context context2 = this.f1089a.getContext();
            toolbar4.f538k = g3;
            if (toolbar4.f530c != null) {
                toolbar4.f530c.setTextAppearance(context2, g3);
            }
        }
        int g4 = a.mo1324g(C0126j.ActionBar_popupTheme, 0);
        if (g4 != 0) {
            this.f1089a.setPopupTheme(g4);
        }
        a.f1087b.recycle();
        if (i != this.f1104p) {
            this.f1104p = i;
            if (TextUtils.isEmpty(this.f1089a.getNavigationContentDescription())) {
                int i2 = this.f1104p;
                if (i2 != 0) {
                    str = this.f1089a.getContext().getString(i2);
                }
                this.f1101m = str;
                m695t();
            }
        }
        this.f1101m = this.f1089a.getNavigationContentDescription();
        this.f1089a.setNavigationOnClickListener(new OnClickListener() {

            /* renamed from: a */
            final C0006ac f1106a = new C0006ac(C0216cs.this.f1089a.getContext(), C0216cs.this.f1090b);

            public final void onClick(View view) {
                if (C0216cs.this.f1091c != null && C0216cs.this.f1092d) {
                    C0216cs.this.f1091c.onMenuItemSelected(0, this.f1106a);
                }
            }
        });
    }

    /* renamed from: b */
    private void m691b(Drawable drawable) {
        this.f1097i = drawable;
        m693r();
    }

    /* renamed from: b */
    private void m692b(CharSequence charSequence) {
        this.f1090b = charSequence;
        if ((this.f1093e & 8) != 0) {
            this.f1089a.setTitle(charSequence);
        }
    }

    /* renamed from: r */
    private void m693r() {
        Drawable drawable = (this.f1093e & 2) != 0 ? ((this.f1093e & 1) == 0 || this.f1097i == null) ? this.f1096h : this.f1097i : null;
        this.f1089a.setLogo(drawable);
    }

    /* renamed from: s */
    private void m694s() {
        if ((this.f1093e & 4) != 0) {
            this.f1089a.setNavigationIcon(this.f1098j != null ? this.f1098j : this.f1105q);
        } else {
            this.f1089a.setNavigationIcon((Drawable) null);
        }
    }

    /* renamed from: t */
    private void m695t() {
        if ((this.f1093e & 4) != 0) {
            if (TextUtils.isEmpty(this.f1101m)) {
                this.f1089a.setNavigationContentDescription(this.f1104p);
                return;
            }
            this.f1089a.setNavigationContentDescription(this.f1101m);
        }
    }

    /* renamed from: a */
    public final ViewGroup mo1128a() {
        return this.f1089a;
    }

    /* renamed from: a */
    public final C0402gt mo1129a(final int i, long j) {
        return C0396gq.m1267d(this.f1089a).mo1821a(i == 0 ? 1.0f : 0.0f).mo1822a(j).mo1823a((C0406gu) new C0407gv() {

            /* renamed from: c */
            private boolean f1110c = false;

            /* renamed from: a */
            public final void mo7a(View view) {
                C0216cs.this.f1089a.setVisibility(0);
            }

            /* renamed from: b */
            public final void mo8b(View view) {
                if (!this.f1110c) {
                    C0216cs.this.f1089a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public final void mo876c(View view) {
                this.f1110c = true;
            }
        });
    }

    /* renamed from: a */
    public final void mo1130a(int i) {
        mo1131a(i != 0 ? C0785o.m2608b(this.f1089a.getContext(), i) : null);
    }

    /* renamed from: a */
    public final void mo1131a(Drawable drawable) {
        this.f1096h = drawable;
        m693r();
    }

    /* renamed from: a */
    public final void mo1132a(Menu menu, C0102a aVar) {
        if (this.f1102n == null) {
            this.f1102n = new C0127ba(this.f1089a.getContext());
            this.f1102n.f39h = C0122f.action_menu_presenter;
        }
        this.f1102n.f37f = aVar;
        Toolbar toolbar = this.f1089a;
        C0019aj ajVar = (C0019aj) menu;
        C0127ba baVar = this.f1102n;
        if (ajVar != null || toolbar.f528a != null) {
            toolbar.mo627d();
            C0019aj ajVar2 = toolbar.f528a.f381a;
            if (ajVar2 != ajVar) {
                if (ajVar2 != null) {
                    ajVar2.mo162b((C0101aq) toolbar.f543p);
                    ajVar2.mo162b((C0101aq) toolbar.f544q);
                }
                if (toolbar.f544q == null) {
                    toolbar.f544q = new C0082a();
                }
                baVar.f764l = true;
                if (ajVar != null) {
                    ajVar.mo147a((C0101aq) baVar, toolbar.f535h);
                    ajVar.mo147a((C0101aq) toolbar.f544q, toolbar.f535h);
                } else {
                    baVar.mo96a(toolbar.f535h, (C0019aj) null);
                    toolbar.f544q.mo96a(toolbar.f535h, (C0019aj) null);
                    baVar.mo98a(true);
                    toolbar.f544q.mo98a(true);
                }
                toolbar.f528a.setPopupTheme(toolbar.f536i);
                toolbar.f528a.setPresenter(baVar);
                toolbar.f543p = baVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo1133a(Callback callback) {
        this.f1091c = callback;
    }

    /* renamed from: a */
    public final void mo1134a(C0102a aVar, C0020a aVar2) {
        Toolbar toolbar = this.f1089a;
        toolbar.f545r = aVar;
        toolbar.f546s = aVar2;
        if (toolbar.f528a != null) {
            toolbar.f528a.mo472a(aVar, aVar2);
        }
    }

    /* renamed from: a */
    public final void mo1135a(C0205cl clVar) {
        if (this.f1094f != null && this.f1094f.getParent() == this.f1089a) {
            this.f1089a.removeView(this.f1094f);
        }
        this.f1094f = clVar;
        if (clVar != null && this.f1103o == 2) {
            this.f1089a.addView(this.f1094f, 0);
            C0083b bVar = (C0083b) this.f1094f.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f924a = 8388691;
            clVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public final void mo1136a(CharSequence charSequence) {
        if (!this.f1099k) {
            m692b(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo1137a(boolean z) {
        this.f1089a.setCollapsible(z);
    }

    /* renamed from: b */
    public final Context mo1138b() {
        return this.f1089a.getContext();
    }

    /* renamed from: b */
    public final void mo1139b(int i) {
        m691b(i != 0 ? C0785o.m2608b(this.f1089a.getContext(), i) : null);
    }

    /* renamed from: c */
    public final void mo1140c(int i) {
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1093e ^ i;
        this.f1093e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m695t();
                }
                m694s();
            }
            if ((i2 & 3) != 0) {
                m693r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1089a.setTitle(this.f1090b);
                    toolbar = this.f1089a;
                    charSequence = this.f1100l;
                } else {
                    charSequence = null;
                    this.f1089a.setTitle((CharSequence) null);
                    toolbar = this.f1089a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if (!((i2 & 16) == 0 || this.f1095g == null)) {
                if ((i & 16) != 0) {
                    this.f1089a.addView(this.f1095g);
                    return;
                }
                this.f1089a.removeView(this.f1095g);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo1141c() {
        Toolbar toolbar = this.f1089a;
        return (toolbar.f544q == null || toolbar.f544q.f558b == null) ? false : true;
    }

    /* renamed from: d */
    public final void mo1142d() {
        this.f1089a.mo625c();
    }

    /* renamed from: d */
    public final void mo1143d(int i) {
        this.f1089a.setVisibility(i);
    }

    /* renamed from: e */
    public final CharSequence mo1144e() {
        return this.f1089a.getTitle();
    }

    /* renamed from: f */
    public final void mo1145f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: g */
    public final void mo1146g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: h */
    public final boolean mo1147h() {
        Toolbar toolbar = this.f1089a;
        return toolbar.getVisibility() == 0 && toolbar.f528a != null && toolbar.f528a.f382b;
    }

    /* renamed from: i */
    public final boolean mo1148i() {
        return this.f1089a.mo623a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1149j() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1089a
            androidx.appcompat.widget.ActionMenuView r1 = r0.f528a
            r2 = 0
            if (r1 == 0) goto L_0x0026
            androidx.appcompat.widget.ActionMenuView r0 = r0.f528a
            ba r1 = r0.f383c
            r3 = 1
            if (r1 == 0) goto L_0x0022
            ba r0 = r0.f383c
            ba$c r1 = r0.f767o
            if (r1 != 0) goto L_0x001d
            boolean r0 = r0.mo890h()
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = r2
            goto L_0x001e
        L_0x001d:
            r0 = r3
        L_0x001e:
            if (r0 == 0) goto L_0x0022
            r0 = r3
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            return r3
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0216cs.mo1149j():boolean");
    }

    /* renamed from: k */
    public final boolean mo1150k() {
        return this.f1089a.mo624b();
    }

    /* renamed from: l */
    public final boolean mo1151l() {
        Toolbar toolbar = this.f1089a;
        if (toolbar.f528a != null) {
            ActionMenuView actionMenuView = toolbar.f528a;
            if (actionMenuView.f383c != null && actionMenuView.f383c.mo887e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void mo1152m() {
        this.f1092d = true;
    }

    /* renamed from: n */
    public final void mo1153n() {
        Toolbar toolbar = this.f1089a;
        if (toolbar.f528a != null) {
            toolbar.f528a.mo474b();
        }
    }

    /* renamed from: o */
    public final int mo1154o() {
        return this.f1093e;
    }

    /* renamed from: p */
    public final int mo1155p() {
        return this.f1103o;
    }

    /* renamed from: q */
    public final Menu mo1156q() {
        return this.f1089a.getMenu();
    }
}
