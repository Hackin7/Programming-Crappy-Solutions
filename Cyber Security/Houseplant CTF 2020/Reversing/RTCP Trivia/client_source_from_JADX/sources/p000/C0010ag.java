package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ag */
final class C0010ag extends C0098ao implements OnKeyListener, OnDismissListener, C0101aq {

    /* renamed from: h */
    private static final int f46h = C0123g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private C0102a f47A;

    /* renamed from: B */
    private OnDismissListener f48B;

    /* renamed from: a */
    final Handler f49a;

    /* renamed from: b */
    final List<C0015a> f50b = new ArrayList();

    /* renamed from: c */
    final OnGlobalLayoutListener f51c = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (C0010ag.this.mo117d() && C0010ag.this.f50b.size() > 0 && !((C0015a) C0010ag.this.f50b.get(0)).f80a.f998r) {
                View view = C0010ag.this.f52d;
                if (view == null || !view.isShown()) {
                    C0010ag.this.mo114c();
                    return;
                }
                for (C0015a aVar : C0010ag.this.f50b) {
                    aVar.f80a.mo111b();
                }
            }
        }
    };

    /* renamed from: d */
    View f52d;

    /* renamed from: e */
    ViewTreeObserver f53e;

    /* renamed from: f */
    boolean f54f;

    /* renamed from: i */
    private final Context f55i;

    /* renamed from: j */
    private final int f56j;

    /* renamed from: k */
    private final int f57k;

    /* renamed from: l */
    private final int f58l;

    /* renamed from: m */
    private final boolean f59m;

    /* renamed from: n */
    private final List<C0019aj> f60n = new ArrayList();

    /* renamed from: o */
    private final OnAttachStateChangeListener f61o = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C0010ag.this.f53e != null) {
                if (!C0010ag.this.f53e.isAlive()) {
                    C0010ag.this.f53e = view.getViewTreeObserver();
                }
                C0010ag.this.f53e.removeGlobalOnLayoutListener(C0010ag.this.f51c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: p */
    private final C0200ch f62p = new C0200ch() {
        /* renamed from: a */
        public final void mo125a(C0019aj ajVar, MenuItem menuItem) {
            C0010ag.this.f49a.removeCallbacksAndMessages(ajVar);
        }

        /* renamed from: b */
        public final void mo126b(final C0019aj ajVar, final MenuItem menuItem) {
            final C0015a aVar = null;
            C0010ag.this.f49a.removeCallbacksAndMessages(null);
            int size = C0010ag.this.f50b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (ajVar == ((C0015a) C0010ag.this.f50b.get(i)).f81b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0010ag.this.f50b.size()) {
                    aVar = (C0015a) C0010ag.this.f50b.get(i2);
                }
                C0010ag.this.f49a.postAtTime(new Runnable() {
                    public final void run() {
                        if (aVar != null) {
                            C0010ag.this.f54f = true;
                            aVar.f81b.mo148a(false);
                            C0010ag.this.f54f = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            ajVar.mo151a(menuItem, (C0101aq) null, 4);
                        }
                    }
                }, ajVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: q */
    private int f63q = 0;

    /* renamed from: r */
    private int f64r = 0;

    /* renamed from: s */
    private View f65s;

    /* renamed from: t */
    private int f66t;

    /* renamed from: u */
    private boolean f67u;

    /* renamed from: v */
    private boolean f68v;

    /* renamed from: w */
    private int f69w;

    /* renamed from: x */
    private int f70x;

    /* renamed from: y */
    private boolean f71y;

    /* renamed from: z */
    private boolean f72z;

    /* renamed from: ag$a */
    static class C0015a {

        /* renamed from: a */
        public final C0201ci f80a;

        /* renamed from: b */
        public final C0019aj f81b;

        /* renamed from: c */
        public final int f82c;

        public C0015a(C0201ci ciVar, C0019aj ajVar, int i) {
            this.f80a = ciVar;
            this.f81b = ajVar;
            this.f82c = i;
        }
    }

    public C0010ag(Context context, View view, int i, int i2, boolean z) {
        this.f55i = context;
        this.f65s = view;
        this.f57k = i;
        this.f58l = i2;
        this.f59m = z;
        this.f71y = false;
        this.f66t = m29g();
        Resources resources = context.getResources();
        this.f56j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0120d.abc_config_prefDialogWidth));
        this.f49a = new Handler();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ad  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28c(p000.C0019aj r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r0.f55i
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            ai r3 = new ai
            boolean r4 = r0.f59m
            int r5 = f46h
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r17.mo117d()
            r5 = 1
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.f71y
            if (r4 == 0) goto L_0x0021
            r3.f95b = r5
            goto L_0x002d
        L_0x0021:
            boolean r4 = r17.mo117d()
            if (r4 == 0) goto L_0x002d
            boolean r4 = p000.C0098ao.m342b(r18)
            r3.f95b = r4
        L_0x002d:
            android.content.Context r4 = r0.f55i
            int r6 = r0.f56j
            r7 = 0
            int r4 = m340a(r3, r7, r4, r6)
            ci r6 = new ci
            android.content.Context r8 = r0.f55i
            int r9 = r0.f57k
            int r10 = r0.f58l
            r6.<init>(r8, r9, r10)
            ch r8 = r0.f62p
            r6.f1015b = r8
            r6.f994n = r0
            r6.mo1212a(r0)
            android.view.View r8 = r0.f65s
            r6.f993m = r8
            int r8 = r0.f64r
            r6.f990j = r8
            r6.mo1214f()
            r6.mo1216h()
            r6.mo1061a(r3)
            r6.mo1213b(r4)
            int r3 = r0.f64r
            r6.f990j = r3
            java.util.List<ag$a> r3 = r0.f50b
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e2
            java.util.List<ag$a> r3 = r0.f50b
            java.util.List<ag$a> r9 = r0.f50b
            int r9 = r9.size()
            int r9 = r9 - r5
            java.lang.Object r3 = r3.get(r9)
            ag$a r3 = (p000.C0010ag.C0015a) r3
            aj r9 = r3.f81b
            int r10 = r9.size()
            r11 = r8
        L_0x0081:
            if (r11 >= r10) goto L_0x0097
            android.view.MenuItem r12 = r9.getItem(r11)
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L_0x0094
            android.view.SubMenu r13 = r12.getSubMenu()
            if (r1 != r13) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            int r11 = r11 + 1
            goto L_0x0081
        L_0x0097:
            r12 = r7
        L_0x0098:
            if (r12 != 0) goto L_0x009b
            goto L_0x00e4
        L_0x009b:
            ci r9 = r3.f80a
            cc r9 = r9.f985e
            android.widget.ListAdapter r10 = r9.getAdapter()
            boolean r11 = r10 instanceof android.widget.HeaderViewListAdapter
            if (r11 == 0) goto L_0x00b4
            android.widget.HeaderViewListAdapter r10 = (android.widget.HeaderViewListAdapter) r10
            int r11 = r10.getHeadersCount()
            android.widget.ListAdapter r10 = r10.getWrappedAdapter()
            ai r10 = (p000.C0018ai) r10
            goto L_0x00b7
        L_0x00b4:
            ai r10 = (p000.C0018ai) r10
            r11 = r8
        L_0x00b7:
            int r13 = r10.getCount()
            r14 = r8
        L_0x00bc:
            r15 = -1
            if (r14 >= r13) goto L_0x00ca
            al r7 = r10.getItem(r14)
            if (r12 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r14 = r14 + 1
            r7 = 0
            goto L_0x00bc
        L_0x00ca:
            r14 = r15
        L_0x00cb:
            if (r14 != r15) goto L_0x00ce
            goto L_0x00e3
        L_0x00ce:
            int r14 = r14 + r11
            int r7 = r9.getFirstVisiblePosition()
            int r14 = r14 - r7
            if (r14 < 0) goto L_0x00e3
            int r7 = r9.getChildCount()
            if (r14 < r7) goto L_0x00dd
            goto L_0x00e3
        L_0x00dd:
            android.view.View r7 = r9.getChildAt(r14)
            goto L_0x00e4
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            r7 = 0
        L_0x00e4:
            if (r7 == 0) goto L_0x01ad
            java.lang.reflect.Method r9 = p000.C0201ci.f1014a
            if (r9 == 0) goto L_0x0101
            java.lang.reflect.Method r9 = p000.C0201ci.f1014a     // Catch:{ Exception -> 0x00fa }
            android.widget.PopupWindow r10 = r6.f999s     // Catch:{ Exception -> 0x00fa }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00fa }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x00fa }
            r11[r8] = r12     // Catch:{ Exception -> 0x00fa }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0101
        L_0x00fa:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
        L_0x0101:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x010d
            android.widget.PopupWindow r9 = r6.f999s
            r10 = 0
            r9.setEnterTransition(r10)
        L_0x010d:
            java.util.List<ag$a> r9 = r0.f50b
            java.util.List<ag$a> r10 = r0.f50b
            int r10 = r10.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            ag$a r9 = (p000.C0010ag.C0015a) r9
            ci r9 = r9.f80a
            cc r9 = r9.f985e
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            android.view.View r13 = r0.f52d
            r13.getWindowVisibleDisplayFrame(r12)
            int r13 = r0.f66t
            if (r13 != r5) goto L_0x0142
            r11 = r11[r8]
            int r9 = r9.getWidth()
            int r11 = r11 + r9
            int r11 = r11 + r4
            int r9 = r12.right
            if (r11 > r9) goto L_0x0148
        L_0x0140:
            r9 = r5
            goto L_0x0149
        L_0x0142:
            r9 = r11[r8]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x0148
            goto L_0x0140
        L_0x0148:
            r9 = r8
        L_0x0149:
            if (r9 != r5) goto L_0x014d
            r11 = r5
            goto L_0x014e
        L_0x014d:
            r11 = r8
        L_0x014e:
            r0.f66t = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            r13 = 5
            if (r9 < r12) goto L_0x015c
            r6.f993m = r7
            r9 = r8
            r12 = r9
            goto L_0x018d
        L_0x015c:
            int[] r9 = new int[r10]
            android.view.View r12 = r0.f65s
            r12.getLocationOnScreen(r9)
            int[] r10 = new int[r10]
            r7.getLocationOnScreen(r10)
            int r12 = r0.f64r
            r12 = r12 & 7
            if (r12 != r13) goto L_0x0182
            r12 = r9[r8]
            android.view.View r14 = r0.f65s
            int r14 = r14.getWidth()
            int r12 = r12 + r14
            r9[r8] = r12
            r12 = r10[r8]
            int r14 = r7.getWidth()
            int r12 = r12 + r14
            r10[r8] = r12
        L_0x0182:
            r12 = r10[r8]
            r14 = r9[r8]
            int r12 = r12 - r14
            r10 = r10[r5]
            r9 = r9[r5]
            int r9 = r10 - r9
        L_0x018d:
            int r10 = r0.f64r
            r10 = r10 & r13
            if (r10 != r13) goto L_0x019c
            if (r11 == 0) goto L_0x0196
        L_0x0194:
            int r12 = r12 + r4
            goto L_0x01a3
        L_0x0196:
            int r4 = r7.getWidth()
        L_0x019a:
            int r12 = r12 - r4
            goto L_0x01a3
        L_0x019c:
            if (r11 == 0) goto L_0x019a
            int r4 = r7.getWidth()
            goto L_0x0194
        L_0x01a3:
            r6.f987g = r12
            r6.f989i = r5
            r6.f988h = r5
            r6.mo1210a(r9)
            goto L_0x01c2
        L_0x01ad:
            boolean r4 = r0.f67u
            if (r4 == 0) goto L_0x01b5
            int r4 = r0.f69w
            r6.f987g = r4
        L_0x01b5:
            boolean r4 = r0.f68v
            if (r4 == 0) goto L_0x01be
            int r4 = r0.f70x
            r6.mo1210a(r4)
        L_0x01be:
            android.graphics.Rect r4 = r0.f706g
            r6.f997q = r4
        L_0x01c2:
            ag$a r4 = new ag$a
            int r5 = r0.f66t
            r4.<init>(r6, r1, r5)
            java.util.List<ag$a> r5 = r0.f50b
            r5.add(r4)
            r6.mo111b()
            cc r4 = r6.f985e
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x0200
            boolean r3 = r0.f72z
            if (r3 == 0) goto L_0x0200
            java.lang.CharSequence r3 = r1.f107f
            if (r3 == 0) goto L_0x0200
            int r3 = p000.C0116b.C0123g.abc_popup_menu_header_item_layout
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f107f
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.mo111b()
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0010ag.m28c(aj):void");
    }

    /* renamed from: g */
    private int m29g() {
        return C0396gq.m1264b(this.f65s) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public final void mo107a(int i) {
        if (this.f63q != i) {
            this.f63q = i;
            this.f64r = C0384gf.m1231a(i, C0396gq.m1264b(this.f65s));
        }
    }

    /* renamed from: a */
    public final void mo108a(C0019aj ajVar) {
        ajVar.mo147a((C0101aq) this, this.f55i);
        if (mo117d()) {
            m28c(ajVar);
        } else {
            this.f60n.add(ajVar);
        }
    }

    /* renamed from: a */
    public final void mo94a(C0019aj ajVar, boolean z) {
        int size = this.f50b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ajVar == ((C0015a) this.f50b.get(i)).f81b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f50b.size()) {
                ((C0015a) this.f50b.get(i2)).f81b.mo148a(false);
            }
            C0015a aVar = (C0015a) this.f50b.remove(i);
            aVar.f81b.mo162b((C0101aq) this);
            if (this.f54f) {
                C0201ci ciVar = aVar.f80a;
                if (VERSION.SDK_INT >= 23) {
                    ciVar.f999s.setExitTransition(null);
                }
                aVar.f80a.f999s.setAnimationStyle(0);
            }
            aVar.f80a.mo114c();
            int size2 = this.f50b.size();
            this.f66t = size2 > 0 ? ((C0015a) this.f50b.get(size2 - 1)).f82c : m29g();
            if (size2 == 0) {
                mo114c();
                if (this.f47A != null) {
                    this.f47A.mo196a(ajVar, true);
                }
                if (this.f53e != null) {
                    if (this.f53e.isAlive()) {
                        this.f53e.removeGlobalOnLayoutListener(this.f51c);
                    }
                    this.f53e = null;
                }
                this.f52d.removeOnAttachStateChangeListener(this.f61o);
                this.f48B.onDismiss();
                return;
            }
            if (z) {
                ((C0015a) this.f50b.get(0)).f81b.mo148a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo109a(View view) {
        if (this.f65s != view) {
            this.f65s = view;
            this.f64r = C0384gf.m1231a(this.f63q, C0396gq.m1264b(this.f65s));
        }
    }

    /* renamed from: a */
    public final void mo110a(OnDismissListener onDismissListener) {
        this.f48B = onDismissListener;
    }

    /* renamed from: a */
    public final void mo97a(C0102a aVar) {
        this.f47A = aVar;
    }

    /* renamed from: a */
    public final void mo98a(boolean z) {
        for (C0015a aVar : this.f50b) {
            m341a(aVar.f80a.f985e.getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo99a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo102a(C0111aw awVar) {
        for (C0015a aVar : this.f50b) {
            if (awVar == aVar.f81b) {
                aVar.f80a.f985e.requestFocus();
                return true;
            }
        }
        if (!awVar.hasVisibleItems()) {
            return false;
        }
        mo108a((C0019aj) awVar);
        if (this.f47A != null) {
            this.f47A.mo197a(awVar);
        }
        return true;
    }

    /* renamed from: b */
    public final void mo111b() {
        if (!mo117d()) {
            for (C0019aj c : this.f60n) {
                m28c(c);
            }
            this.f60n.clear();
            this.f52d = this.f65s;
            if (this.f52d != null) {
                boolean z = this.f53e == null;
                this.f53e = this.f52d.getViewTreeObserver();
                if (z) {
                    this.f53e.addOnGlobalLayoutListener(this.f51c);
                }
                this.f52d.addOnAttachStateChangeListener(this.f61o);
            }
        }
    }

    /* renamed from: b */
    public final void mo112b(int i) {
        this.f67u = true;
        this.f69w = i;
    }

    /* renamed from: b */
    public final void mo113b(boolean z) {
        this.f71y = z;
    }

    /* renamed from: c */
    public final void mo114c() {
        int size = this.f50b.size();
        if (size > 0) {
            C0015a[] aVarArr = (C0015a[]) this.f50b.toArray(new C0015a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0015a aVar = aVarArr[i];
                if (aVar.f80a.f999s.isShowing()) {
                    aVar.f80a.mo114c();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo115c(int i) {
        this.f68v = true;
        this.f70x = i;
    }

    /* renamed from: c */
    public final void mo116c(boolean z) {
        this.f72z = z;
    }

    /* renamed from: d */
    public final boolean mo117d() {
        return this.f50b.size() > 0 && ((C0015a) this.f50b.get(0)).f80a.f999s.isShowing();
    }

    /* renamed from: e */
    public final ListView mo118e() {
        if (this.f50b.isEmpty()) {
            return null;
        }
        return ((C0015a) this.f50b.get(this.f50b.size() - 1)).f80a.f985e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo119f() {
        return false;
    }

    public final void onDismiss() {
        C0015a aVar;
        int size = this.f50b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C0015a) this.f50b.get(i);
            if (!aVar.f80a.f999s.isShowing()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f81b.mo148a(false);
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
