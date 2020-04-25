package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

/* renamed from: av */
final class C0108av extends C0098ao implements OnKeyListener, OnItemClickListener, OnDismissListener, C0101aq {

    /* renamed from: e */
    private static final int f720e = C0123g.abc_popup_menu_item_layout;

    /* renamed from: a */
    final C0201ci f721a;

    /* renamed from: b */
    final OnGlobalLayoutListener f722b = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (C0108av.this.mo117d() && !C0108av.this.f721a.f998r) {
                View view = C0108av.this.f723c;
                if (view == null || !view.isShown()) {
                    C0108av.this.mo114c();
                } else {
                    C0108av.this.f721a.mo111b();
                }
            }
        }
    };

    /* renamed from: c */
    View f723c;

    /* renamed from: d */
    ViewTreeObserver f724d;

    /* renamed from: f */
    private final Context f725f;

    /* renamed from: h */
    private final C0019aj f726h;

    /* renamed from: i */
    private final C0018ai f727i;

    /* renamed from: j */
    private final boolean f728j;

    /* renamed from: k */
    private final int f729k;

    /* renamed from: l */
    private final int f730l;

    /* renamed from: m */
    private final int f731m;

    /* renamed from: n */
    private final OnAttachStateChangeListener f732n = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C0108av.this.f724d != null) {
                if (!C0108av.this.f724d.isAlive()) {
                    C0108av.this.f724d = view.getViewTreeObserver();
                }
                C0108av.this.f724d.removeGlobalOnLayoutListener(C0108av.this.f722b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o */
    private OnDismissListener f733o;

    /* renamed from: p */
    private View f734p;

    /* renamed from: q */
    private C0102a f735q;

    /* renamed from: r */
    private boolean f736r;

    /* renamed from: s */
    private boolean f737s;

    /* renamed from: t */
    private int f738t;

    /* renamed from: u */
    private int f739u = 0;

    /* renamed from: v */
    private boolean f740v;

    public C0108av(Context context, C0019aj ajVar, View view, int i, int i2, boolean z) {
        this.f725f = context;
        this.f726h = ajVar;
        this.f728j = z;
        this.f727i = new C0018ai(ajVar, LayoutInflater.from(context), this.f728j, f720e);
        this.f730l = i;
        this.f731m = i2;
        Resources resources = context.getResources();
        this.f729k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0120d.abc_config_prefDialogWidth));
        this.f734p = view;
        this.f721a = new C0201ci(this.f725f, this.f730l, this.f731m);
        ajVar.mo147a((C0101aq) this, context);
    }

    /* renamed from: a */
    public final void mo107a(int i) {
        this.f739u = i;
    }

    /* renamed from: a */
    public final void mo108a(C0019aj ajVar) {
    }

    /* renamed from: a */
    public final void mo94a(C0019aj ajVar, boolean z) {
        if (ajVar == this.f726h) {
            mo114c();
            if (this.f735q != null) {
                this.f735q.mo196a(ajVar, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo109a(View view) {
        this.f734p = view;
    }

    /* renamed from: a */
    public final void mo110a(OnDismissListener onDismissListener) {
        this.f733o = onDismissListener;
    }

    /* renamed from: a */
    public final void mo97a(C0102a aVar) {
        this.f735q = aVar;
    }

    /* renamed from: a */
    public final void mo98a(boolean z) {
        this.f737s = false;
        if (this.f727i != null) {
            this.f727i.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo99a() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102a(p000.C0111aw r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0071
            ap r0 = new ap
            android.content.Context r3 = r9.f725f
            android.view.View r5 = r9.f723c
            boolean r6 = r9.f728j
            int r7 = r9.f730l
            int r8 = r9.f731m
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            aq$a r2 = r9.f735q
            r0.mo821a(r2)
            boolean r2 = p000.C0098ao.m342b(r10)
            r0.mo822a(r2)
            android.widget.PopupWindow$OnDismissListener r2 = r9.f733o
            r0.f709c = r2
            r2 = 0
            r9.f733o = r2
            aj r2 = r9.f726h
            r2.mo148a(r1)
            ci r2 = r9.f721a
            int r2 = r2.f987g
            ci r3 = r9.f721a
            int r3 = r3.mo1215g()
            int r4 = r9.f739u
            android.view.View r5 = r9.f734p
            int r5 = p000.C0396gq.m1264b(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x0052
            android.view.View r4 = r9.f734p
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L_0x0052:
            boolean r4 = r0.mo826e()
            r5 = 1
            if (r4 == 0) goto L_0x005b
        L_0x0059:
            r0 = r5
            goto L_0x0065
        L_0x005b:
            android.view.View r4 = r0.f707a
            if (r4 != 0) goto L_0x0061
            r0 = r1
            goto L_0x0065
        L_0x0061:
            r0.mo820a(r2, r3, r5, r5)
            goto L_0x0059
        L_0x0065:
            if (r0 == 0) goto L_0x0071
            aq$a r0 = r9.f735q
            if (r0 == 0) goto L_0x0070
            aq$a r0 = r9.f735q
            r0.mo197a(r10)
        L_0x0070:
            return r5
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0108av.mo102a(aw):boolean");
    }

    /* renamed from: b */
    public final void mo111b() {
        boolean z = true;
        if (!mo117d()) {
            if (this.f736r || this.f734p == null) {
                z = false;
            } else {
                this.f723c = this.f734p;
                this.f721a.mo1212a((OnDismissListener) this);
                this.f721a.f994n = this;
                this.f721a.mo1214f();
                View view = this.f723c;
                boolean z2 = this.f724d == null;
                this.f724d = view.getViewTreeObserver();
                if (z2) {
                    this.f724d.addOnGlobalLayoutListener(this.f722b);
                }
                view.addOnAttachStateChangeListener(this.f732n);
                this.f721a.f993m = view;
                this.f721a.f990j = this.f739u;
                if (!this.f737s) {
                    this.f738t = m340a(this.f727i, null, this.f725f, this.f729k);
                    this.f737s = true;
                }
                this.f721a.mo1213b(this.f738t);
                this.f721a.mo1216h();
                this.f721a.f997q = this.f706g;
                this.f721a.mo111b();
                C0182cc ccVar = this.f721a.f985e;
                ccVar.setOnKeyListener(this);
                if (this.f740v && this.f726h.f107f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f725f).inflate(C0123g.abc_popup_menu_header_item_layout, ccVar, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f726h.f107f);
                    }
                    frameLayout.setEnabled(false);
                    ccVar.addHeaderView(frameLayout, null, false);
                }
                this.f721a.mo1061a((ListAdapter) this.f727i);
                this.f721a.mo111b();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public final void mo112b(int i) {
        this.f721a.f987g = i;
    }

    /* renamed from: b */
    public final void mo113b(boolean z) {
        this.f727i.f95b = z;
    }

    /* renamed from: c */
    public final void mo114c() {
        if (mo117d()) {
            this.f721a.mo114c();
        }
    }

    /* renamed from: c */
    public final void mo115c(int i) {
        this.f721a.mo1210a(i);
    }

    /* renamed from: c */
    public final void mo116c(boolean z) {
        this.f740v = z;
    }

    /* renamed from: d */
    public final boolean mo117d() {
        return !this.f736r && this.f721a.f999s.isShowing();
    }

    /* renamed from: e */
    public final ListView mo118e() {
        return this.f721a.f985e;
    }

    public final void onDismiss() {
        this.f736r = true;
        this.f726h.close();
        if (this.f724d != null) {
            if (!this.f724d.isAlive()) {
                this.f724d = this.f723c.getViewTreeObserver();
            }
            this.f724d.removeGlobalOnLayoutListener(this.f722b);
            this.f724d = null;
        }
        this.f723c.removeOnAttachStateChangeListener(this.f732n);
        if (this.f733o != null) {
            this.f733o.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo114c();
        return true;
    }
}
