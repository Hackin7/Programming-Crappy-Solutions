package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.C0046b;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ActionMenuView.C0053a;
import java.util.ArrayList;

/* renamed from: ba */
public final class C0127ba extends C0007ad implements C0382a {

    /* renamed from: A */
    private final SparseBooleanArray f758A = new SparseBooleanArray();

    /* renamed from: B */
    private View f759B;

    /* renamed from: C */
    private C0129b f760C;

    /* renamed from: i */
    public C0131d f761i;

    /* renamed from: j */
    public Drawable f762j;

    /* renamed from: k */
    public boolean f763k;

    /* renamed from: l */
    public boolean f764l;

    /* renamed from: m */
    C0133e f765m;

    /* renamed from: n */
    C0128a f766n;

    /* renamed from: o */
    C0130c f767o;

    /* renamed from: p */
    final C0134f f768p = new C0134f();

    /* renamed from: q */
    int f769q;

    /* renamed from: r */
    private boolean f770r;

    /* renamed from: s */
    private boolean f771s;

    /* renamed from: t */
    private int f772t;

    /* renamed from: u */
    private int f773u;

    /* renamed from: v */
    private int f774v;

    /* renamed from: w */
    private boolean f775w;

    /* renamed from: x */
    private boolean f776x;

    /* renamed from: y */
    private boolean f777y;

    /* renamed from: z */
    private int f778z;

    /* renamed from: ba$a */
    class C0128a extends C0099ap {
        public C0128a(Context context, C0111aw awVar, View view) {
            super(context, awVar, view, false, C0117a.actionOverflowMenuStyle);
            if (!((C0023al) awVar.getItem()).mo211f()) {
                this.f707a = C0127ba.this.f761i == null ? (View) C0127ba.this.f38g : C0127ba.this.f761i;
            }
            mo821a((C0102a) C0127ba.this.f768p);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo825d() {
            C0127ba.this.f766n = null;
            C0127ba.this.f769q = 0;
            super.mo825d();
        }
    }

    /* renamed from: ba$b */
    class C0129b extends C0046b {
        C0129b() {
        }

        /* renamed from: a */
        public final C0107au mo361a() {
            if (C0127ba.this.f766n != null) {
                return C0127ba.this.f766n.mo819a();
            }
            return null;
        }
    }

    /* renamed from: ba$c */
    class C0130c implements Runnable {

        /* renamed from: b */
        private C0133e f782b;

        public C0130c(C0133e eVar) {
            this.f782b = eVar;
        }

        public final void run() {
            if (C0127ba.this.f34c != null) {
                C0019aj e = C0127ba.this.f34c;
                if (e.f103b != null) {
                    e.f103b.mo193a(e);
                }
            }
            View view = (View) C0127ba.this.f38g;
            if (!(view == null || view.getWindowToken() == null || !this.f782b.mo823b())) {
                C0127ba.this.f765m = this.f782b;
            }
            C0127ba.this.f767o = null;
        }
    }

    /* renamed from: ba$d */
    public class C0131d extends C0157bn implements C0053a {

        /* renamed from: b */
        private final float[] f784b = new float[2];

        public C0131d(Context context) {
            super(context, null, C0117a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0219ct.m728a(this, getContentDescription());
            setOnTouchListener(new C0187ce(this, C0127ba.this) {
                /* renamed from: a */
                public final C0107au mo359a() {
                    if (C0127ba.this.f765m == null) {
                        return null;
                    }
                    return C0127ba.this.f765m.mo819a();
                }

                /* renamed from: b */
                public final boolean mo360b() {
                    C0127ba.this.mo886d();
                    return true;
                }

                /* renamed from: c */
                public final boolean mo894c() {
                    if (C0127ba.this.f767o != null) {
                        return false;
                    }
                    C0127ba.this.mo887e();
                    return true;
                }
            });
        }

        /* renamed from: c */
        public final boolean mo343c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo344d() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0127ba.this.mo886d();
            return true;
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0345fn.m1146a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: ba$e */
    class C0133e extends C0099ap {
        public C0133e(Context context, C0019aj ajVar, View view) {
            super(context, ajVar, view, true, C0117a.actionOverflowMenuStyle);
            mo821a((C0102a) C0127ba.this.f768p);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo825d() {
            if (C0127ba.this.f34c != null) {
                C0127ba.this.f34c.close();
            }
            C0127ba.this.f765m = null;
            super.mo825d();
        }
    }

    /* renamed from: ba$f */
    class C0134f implements C0102a {
        C0134f() {
        }

        /* renamed from: a */
        public final void mo196a(C0019aj ajVar, boolean z) {
            if (ajVar instanceof C0111aw) {
                ajVar.mo182l().mo148a(false);
            }
            C0102a aVar = C0127ba.this.f37f;
            if (aVar != null) {
                aVar.mo196a(ajVar, z);
            }
        }

        /* renamed from: a */
        public final boolean mo197a(C0019aj ajVar) {
            if (ajVar == null) {
                return false;
            }
            C0127ba.this.f769q = ((C0111aw) ajVar).getItem().getItemId();
            C0102a aVar = C0127ba.this.f37f;
            if (aVar != null) {
                return aVar.mo197a(ajVar);
            }
            return false;
        }
    }

    public C0127ba(Context context) {
        super(context, C0123g.abc_action_menu_layout, C0123g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public final View mo92a(C0023al alVar, View view, ViewGroup viewGroup) {
        View actionView = alVar.getActionView();
        if (actionView == null || alVar.mo227i()) {
            actionView = super.mo92a(alVar, view, viewGroup);
        }
        actionView.setVisibility(alVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m187a(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public final C0103ar mo93a(ViewGroup viewGroup) {
        C0103ar arVar = this.f38g;
        C0103ar a = super.mo93a(viewGroup);
        if (arVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo94a(C0019aj ajVar, boolean z) {
        mo888f();
        super.mo94a(ajVar, z);
    }

    /* renamed from: a */
    public final void mo95a(C0023al alVar, C0104a aVar) {
        aVar.mo340a(alVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f38g);
        if (this.f760C == null) {
            this.f760C = new C0129b();
        }
        actionMenuItemView.setPopupCallback(this.f760C);
    }

    /* renamed from: a */
    public final void mo96a(Context context, C0019aj ajVar) {
        super.mo96a(context, ajVar);
        Resources resources = context.getResources();
        C0801t a = C0801t.m2659a(context);
        if (!this.f771s) {
            boolean z = true;
            if (VERSION.SDK_INT < 19 && ViewConfiguration.get(a.f3390a).hasPermanentMenuKey()) {
                z = false;
            }
            this.f770r = z;
        }
        if (!this.f777y) {
            this.f772t = a.f3390a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.f775w) {
            this.f774v = a.mo2803a();
        }
        int i = this.f772t;
        if (this.f770r) {
            if (this.f761i == null) {
                this.f761i = new C0131d(this.f32a);
                if (this.f763k) {
                    this.f761i.setImageDrawable(this.f762j);
                    this.f762j = null;
                    this.f763k = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f761i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f761i.getMeasuredWidth();
        } else {
            this.f761i = null;
        }
        this.f773u = i;
        this.f778z = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f759B = null;
    }

    /* renamed from: a */
    public final void mo882a(ActionMenuView actionMenuView) {
        this.f38g = actionMenuView;
        actionMenuView.f381a = this.f34c;
    }

    /* renamed from: a */
    public final void mo98a(boolean z) {
        super.mo98a(z);
        ((View) this.f38g).requestLayout();
        boolean z2 = false;
        if (this.f34c != null) {
            C0019aj ajVar = this.f34c;
            ajVar.mo180j();
            ArrayList<C0023al> arrayList = ajVar.f105d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0381ge geVar = ((C0023al) arrayList.get(i)).f141f;
                if (geVar != null) {
                    geVar.f1719e = this;
                }
            }
        }
        ArrayList k = this.f34c != null ? this.f34c.mo181k() : null;
        if (this.f770r && k != null) {
            int size2 = k.size();
            if (size2 == 1) {
                z2 = !((C0023al) k.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f761i == null) {
                this.f761i = new C0131d(this.f32a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f761i.getParent();
            if (viewGroup != this.f38g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f761i);
                }
                ((ActionMenuView) this.f38g).addView(this.f761i, ActionMenuView.m186a());
            }
        } else if (this.f761i != null && this.f761i.getParent() == this.f38g) {
            ((ViewGroup) this.f38g).removeView(this.f761i);
        }
        ((ActionMenuView) this.f38g).setOverflowReserved(this.f770r);
    }

    /* renamed from: a */
    public final boolean mo99a() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        C0127ba baVar = this;
        boolean z3 = false;
        if (baVar.f34c != null) {
            arrayList = baVar.f34c.mo178i();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = baVar.f774v;
        int i6 = baVar.f773u;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) baVar.f38g;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        int i9 = i5;
        for (int i10 = 0; i10 < i; i10++) {
            C0023al alVar = (C0023al) arrayList.get(i10);
            if (alVar.mo225h()) {
                i7++;
            } else if (alVar.mo212g()) {
                i8++;
            } else {
                z4 = true;
            }
            if (baVar.f764l && alVar.isActionViewExpanded()) {
                i9 = 0;
            }
        }
        if (baVar.f770r && (z4 || i8 + i7 > i9)) {
            i9--;
        }
        int i11 = i9 - i7;
        SparseBooleanArray sparseBooleanArray = baVar.f758A;
        sparseBooleanArray.clear();
        if (baVar.f776x) {
            i3 = i6 / baVar.f778z;
            i2 = ((i6 % baVar.f778z) / i3) + baVar.f778z;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i12 = 0;
        int i13 = i6;
        int i14 = 0;
        while (i14 < i) {
            C0023al alVar2 = (C0023al) arrayList.get(i14);
            if (alVar2.mo225h()) {
                View a = baVar.mo92a(alVar2, baVar.f759B, viewGroup);
                if (baVar.f759B == null) {
                    baVar.f759B = a;
                }
                if (baVar.f776x) {
                    i3 -= ActionMenuView.m185a(a, i2, i3, makeMeasureSpec, z3 ? 1 : 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int groupId = alVar2.getGroupId();
                if (groupId != 0) {
                    z2 = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z2 = true;
                }
                alVar2.mo207c(z2);
                z = z3;
                i4 = i;
            } else if (alVar2.mo212g()) {
                int groupId2 = alVar2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                boolean z6 = (i11 > 0 || z5) && i13 > 0 && (!baVar.f776x || i3 > 0);
                if (z6) {
                    boolean z7 = z6;
                    View a2 = baVar.mo92a(alVar2, baVar.f759B, viewGroup);
                    i4 = i;
                    if (baVar.f759B == null) {
                        baVar.f759B = a2;
                    }
                    if (baVar.f776x) {
                        int a3 = ActionMenuView.m185a(a2, i2, i3, makeMeasureSpec, 0);
                        i3 -= a3;
                        if (a3 == 0) {
                            z7 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z6 = z7 & (!baVar.f776x ? i13 + i12 > 0 : i13 >= 0);
                } else {
                    boolean z8 = z6;
                    i4 = i;
                }
                if (z6 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i14) {
                        C0023al alVar3 = (C0023al) arrayList.get(i15);
                        if (alVar3.getGroupId() == groupId2) {
                            if (alVar3.mo211f()) {
                                i11++;
                            }
                            alVar3.mo207c(false);
                        }
                        i15++;
                    }
                }
                if (z6) {
                    i11--;
                }
                alVar2.mo207c(z6);
                z = false;
            } else {
                z = z3;
                i4 = i;
                alVar2.mo207c(z);
            }
            i14++;
            z3 = z;
            i = i4;
            baVar = this;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo100a(C0023al alVar) {
        return alVar.mo211f();
    }

    /* renamed from: a */
    public final boolean mo101a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f761i) {
            return false;
        }
        return super.mo101a(viewGroup, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102a(p000.C0111aw r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            aj r2 = r0.f743l
            aj r3 = r7.f34c
            if (r2 == r3) goto L_0x0014
            aj r0 = r0.f743l
            aw r0 = (p000.C0111aw) r0
            goto L_0x0009
        L_0x0014:
            android.view.MenuItem r0 = r0.getItem()
            ar r2 = r7.f38g
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x003a
            int r3 = r2.getChildCount()
            r4 = r1
        L_0x0023:
            if (r4 >= r3) goto L_0x003a
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof p000.C0103ar.C0104a
            if (r6 == 0) goto L_0x0037
            r6 = r5
            ar$a r6 = (p000.C0103ar.C0104a) r6
            al r6 = r6.getItemData()
            if (r6 != r0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 != 0) goto L_0x003e
            return r1
        L_0x003e:
            android.view.MenuItem r0 = r8.getItem()
            int r0 = r0.getItemId()
            r7.f769q = r0
            int r0 = r8.size()
            r2 = r1
        L_0x004d:
            r3 = 1
            if (r2 >= r0) goto L_0x0065
            android.view.MenuItem r4 = r8.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x0062
            r1 = r3
            goto L_0x0065
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004d
        L_0x0065:
            ba$a r0 = new ba$a
            android.content.Context r2 = r7.f33b
            r0.<init>(r2, r8, r5)
            r7.f766n = r0
            ba$a r0 = r7.f766n
            r0.mo822a(r1)
            ba$a r0 = r7.f766n
            boolean r0 = r0.mo823b()
            if (r0 != 0) goto L_0x0083
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r8.<init>(r0)
            throw r8
        L_0x0083:
            super.mo102a(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0127ba.mo102a(aw):boolean");
    }

    /* renamed from: b */
    public final void mo883b() {
        if (!this.f775w) {
            this.f774v = C0801t.m2659a(this.f33b).mo2803a();
        }
        if (this.f34c != null) {
            this.f34c.mo163b(true);
        }
    }

    /* renamed from: b */
    public final void mo884b(boolean z) {
        if (z) {
            super.mo102a((C0111aw) null);
            return;
        }
        if (this.f34c != null) {
            this.f34c.mo148a(false);
        }
    }

    /* renamed from: c */
    public final void mo885c() {
        this.f770r = true;
        this.f771s = true;
    }

    /* renamed from: d */
    public final boolean mo886d() {
        if (!this.f770r || mo890h() || this.f34c == null || this.f38g == null || this.f767o != null || this.f34c.mo181k().isEmpty()) {
            return false;
        }
        this.f767o = new C0130c(new C0133e(this.f33b, this.f34c, this.f761i));
        ((View) this.f38g).post(this.f767o);
        super.mo102a((C0111aw) null);
        return true;
    }

    /* renamed from: e */
    public final boolean mo887e() {
        if (this.f767o == null || this.f38g == null) {
            C0133e eVar = this.f765m;
            if (eVar == null) {
                return false;
            }
            eVar.mo824c();
            return true;
        }
        ((View) this.f38g).removeCallbacks(this.f767o);
        this.f767o = null;
        return true;
    }

    /* renamed from: f */
    public final boolean mo888f() {
        return mo887e() | mo889g();
    }

    /* renamed from: g */
    public final boolean mo889g() {
        if (this.f766n == null) {
            return false;
        }
        this.f766n.mo824c();
        return true;
    }

    /* renamed from: h */
    public final boolean mo890h() {
        return this.f765m != null && this.f765m.mo826e();
    }
}
