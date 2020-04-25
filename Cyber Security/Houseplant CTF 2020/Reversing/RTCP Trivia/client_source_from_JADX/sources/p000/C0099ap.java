package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: ap */
public class C0099ap {

    /* renamed from: a */
    protected View f707a;

    /* renamed from: b */
    protected int f708b = 8388613;

    /* renamed from: c */
    OnDismissListener f709c;

    /* renamed from: d */
    private final Context f710d;

    /* renamed from: e */
    private final C0019aj f711e;

    /* renamed from: f */
    private final boolean f712f;

    /* renamed from: g */
    private final int f713g;

    /* renamed from: h */
    private final int f714h;

    /* renamed from: i */
    private boolean f715i;

    /* renamed from: j */
    private C0102a f716j;

    /* renamed from: k */
    private C0098ao f717k;

    /* renamed from: l */
    private final OnDismissListener f718l;

    public C0099ap(Context context, C0019aj ajVar, View view, boolean z, int i) {
        this(context, ajVar, view, z, i, 0);
    }

    public C0099ap(Context context, C0019aj ajVar, View view, boolean z, int i, int i2) {
        this.f708b = 8388611;
        this.f718l = new OnDismissListener() {
            public final void onDismiss() {
                C0099ap.this.mo825d();
            }
        };
        this.f710d = context;
        this.f711e = ajVar;
        this.f707a = view;
        this.f712f = z;
        this.f713g = i;
        this.f714h = i2;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [ao] */
    /* JADX WARNING: type inference failed for: r7v0, types: [av] */
    /* JADX WARNING: type inference failed for: r1v12, types: [ag] */
    /* JADX WARNING: type inference failed for: r7v1, types: [av] */
    /* JADX WARNING: type inference failed for: r1v13, types: [ag] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [av]
      assigns: [av, ag]
      uses: [av, ao, ag]
      mth insns count: 53
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0098ao mo819a() {
        /*
            r14 = this;
            ao r0 = r14.f717k
            if (r0 != 0) goto L_0x0082
            android.content.Context r0 = r14.f710d
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0021
            r0.getRealSize(r1)
            goto L_0x0024
        L_0x0021:
            r0.getSize(r1)
        L_0x0024:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f710d
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p000.C0116b.C0120d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0050
            ag r0 = new ag
            android.content.Context r2 = r14.f710d
            android.view.View r3 = r14.f707a
            int r4 = r14.f713g
            int r5 = r14.f714h
            boolean r6 = r14.f712f
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0062
        L_0x0050:
            av r0 = new av
            android.content.Context r8 = r14.f710d
            aj r9 = r14.f711e
            android.view.View r10 = r14.f707a
            int r11 = r14.f713g
            int r12 = r14.f714h
            boolean r13 = r14.f712f
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0062:
            aj r1 = r14.f711e
            r0.mo108a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f718l
            r0.mo110a(r1)
            android.view.View r1 = r14.f707a
            r0.mo109a(r1)
            aq$a r1 = r14.f716j
            r0.mo97a(r1)
            boolean r1 = r14.f715i
            r0.mo113b(r1)
            int r1 = r14.f708b
            r0.mo107a(r1)
            r14.f717k = r0
        L_0x0082:
            ao r0 = r14.f717k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0099ap.mo819a():ao");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo820a(int i, int i2, boolean z, boolean z2) {
        C0098ao a = mo819a();
        a.mo116c(z2);
        if (z) {
            if ((C0384gf.m1231a(this.f708b, C0396gq.m1264b(this.f707a)) & 7) == 5) {
                i -= this.f707a.getWidth();
            }
            a.mo112b(i);
            a.mo115c(i2);
            int i3 = (int) ((48.0f * this.f710d.getResources().getDisplayMetrics().density) / 2.0f);
            a.f706g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.mo111b();
    }

    /* renamed from: a */
    public final void mo821a(C0102a aVar) {
        this.f716j = aVar;
        if (this.f717k != null) {
            this.f717k.mo97a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo822a(boolean z) {
        this.f715i = z;
        if (this.f717k != null) {
            this.f717k.mo113b(z);
        }
    }

    /* renamed from: b */
    public final boolean mo823b() {
        if (mo826e()) {
            return true;
        }
        if (this.f707a == null) {
            return false;
        }
        mo820a(0, 0, false, false);
        return true;
    }

    /* renamed from: c */
    public final void mo824c() {
        if (mo826e()) {
            this.f717k.mo114c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo825d() {
        this.f717k = null;
        if (this.f709c != null) {
            this.f709c.onDismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo826e() {
        return this.f717k != null && this.f717k.mo117d();
    }
}
