package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController.C0037a;

/* renamed from: d */
public final class C0230d extends C0493i implements DialogInterface {

    /* renamed from: a */
    final AlertController f1139a = new AlertController(getContext(), this, getWindow());

    /* renamed from: d$a */
    public static class C0231a {

        /* renamed from: a */
        public final C0037a f1140a;

        /* renamed from: b */
        private final int f1141b;

        public C0231a(Context context) {
            this(context, C0230d.m746a(context, 0));
        }

        private C0231a(Context context, int i) {
            this.f1140a = new C0037a(new ContextThemeWrapper(context, C0230d.m746a(context, i)));
            this.f1141b = i;
        }

        /* JADX WARNING: type inference failed for: r14v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r14v1, types: [androidx.appcompat.app.AlertController$c] */
        /* JADX WARNING: type inference failed for: r14v2, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r14v3, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r4v19, types: [androidx.appcompat.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r4v20, types: [androidx.appcompat.app.AlertController$a$1] */
        /* JADX WARNING: type inference failed for: r14v6 */
        /* JADX WARNING: type inference failed for: r14v7 */
        /* JADX WARNING: type inference failed for: r14v8 */
        /* JADX WARNING: type inference failed for: r4v31, types: [androidx.appcompat.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r4v32, types: [androidx.appcompat.app.AlertController$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v6
          assigns: [androidx.appcompat.app.AlertController$a$2, androidx.appcompat.app.AlertController$a$1]
          uses: [android.widget.ListAdapter, androidx.appcompat.app.AlertController$a$2, androidx.appcompat.app.AlertController$a$1]
          mth insns count: 198
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0150  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0159  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x015d  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01c0  */
        /* JADX WARNING: Unknown variable types count: 6 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p000.C0230d mo1348a() {
            /*
                r20 = this;
                r0 = r20
                d r1 = new d
                androidx.appcompat.app.AlertController$a r2 = r0.f1140a
                android.content.Context r2 = r2.f246a
                int r3 = r0.f1141b
                r1.<init>(r2, r3)
                androidx.appcompat.app.AlertController$a r2 = r0.f1140a
                androidx.appcompat.app.AlertController r10 = r1.f1139a
                android.view.View r3 = r2.f252g
                r11 = 1
                r12 = 0
                if (r3 == 0) goto L_0x001c
                android.view.View r3 = r2.f252g
                r10.f177G = r3
                goto L_0x0069
            L_0x001c:
                java.lang.CharSequence r3 = r2.f251f
                if (r3 == 0) goto L_0x0025
                java.lang.CharSequence r3 = r2.f251f
                r10.mo323a(r3)
            L_0x0025:
                android.graphics.drawable.Drawable r3 = r2.f249d
                if (r3 == 0) goto L_0x0047
                android.graphics.drawable.Drawable r3 = r2.f249d
                r10.f173C = r3
                r10.f172B = r12
                android.widget.ImageView r4 = r10.f174D
                if (r4 == 0) goto L_0x0047
                if (r3 == 0) goto L_0x0040
                android.widget.ImageView r4 = r10.f174D
                r4.setVisibility(r12)
                android.widget.ImageView r4 = r10.f174D
                r4.setImageDrawable(r3)
                goto L_0x0047
            L_0x0040:
                android.widget.ImageView r3 = r10.f174D
                r4 = 8
                r3.setVisibility(r4)
            L_0x0047:
                int r3 = r2.f248c
                if (r3 == 0) goto L_0x0050
                int r3 = r2.f248c
                r10.mo321a(r3)
            L_0x0050:
                int r3 = r2.f250e
                if (r3 == 0) goto L_0x0069
                int r3 = r2.f250e
                android.util.TypedValue r4 = new android.util.TypedValue
                r4.<init>()
                android.content.Context r5 = r10.f190a
                android.content.res.Resources$Theme r5 = r5.getTheme()
                r5.resolveAttribute(r3, r4, r11)
                int r3 = r4.resourceId
                r10.mo321a(r3)
            L_0x0069:
                java.lang.CharSequence r3 = r2.f253h
                if (r3 == 0) goto L_0x007a
                java.lang.CharSequence r3 = r2.f253h
                r10.f195f = r3
                android.widget.TextView r4 = r10.f176F
                if (r4 == 0) goto L_0x007a
                android.widget.TextView r4 = r10.f176F
                r4.setText(r3)
            L_0x007a:
                java.lang.CharSequence r3 = r2.f254i
                if (r3 != 0) goto L_0x0082
                android.graphics.drawable.Drawable r3 = r2.f255j
                if (r3 == 0) goto L_0x008e
            L_0x0082:
                r4 = -1
                java.lang.CharSequence r5 = r2.f254i
                android.content.DialogInterface$OnClickListener r6 = r2.f256k
                r7 = 0
                android.graphics.drawable.Drawable r8 = r2.f255j
                r3 = r10
                r3.mo322a(r4, r5, r6, r7, r8)
            L_0x008e:
                java.lang.CharSequence r3 = r2.f257l
                if (r3 != 0) goto L_0x0096
                android.graphics.drawable.Drawable r3 = r2.f258m
                if (r3 == 0) goto L_0x00a2
            L_0x0096:
                r4 = -2
                java.lang.CharSequence r5 = r2.f257l
                android.content.DialogInterface$OnClickListener r6 = r2.f259n
                r7 = 0
                android.graphics.drawable.Drawable r8 = r2.f258m
                r3 = r10
                r3.mo322a(r4, r5, r6, r7, r8)
            L_0x00a2:
                java.lang.CharSequence r3 = r2.f260o
                if (r3 != 0) goto L_0x00aa
                android.graphics.drawable.Drawable r3 = r2.f261p
                if (r3 == 0) goto L_0x00b6
            L_0x00aa:
                r4 = -3
                java.lang.CharSequence r5 = r2.f260o
                android.content.DialogInterface$OnClickListener r6 = r2.f262q
                r7 = 0
                android.graphics.drawable.Drawable r8 = r2.f261p
                r3 = r10
                r3.mo322a(r4, r5, r6, r7, r8)
            L_0x00b6:
                java.lang.CharSequence[] r3 = r2.f267v
                r13 = 0
                if (r3 != 0) goto L_0x00c3
                android.database.Cursor r3 = r2.f241K
                if (r3 != 0) goto L_0x00c3
                android.widget.ListAdapter r3 = r2.f268w
                if (r3 == 0) goto L_0x0167
            L_0x00c3:
                android.view.LayoutInflater r3 = r2.f247b
                int r4 = r10.f182L
                android.view.View r3 = r3.inflate(r4, r13)
                androidx.appcompat.app.AlertController$RecycleListView r3 = (androidx.appcompat.app.AlertController.RecycleListView) r3
                boolean r4 = r2.f237G
                if (r4 == 0) goto L_0x00f2
                android.database.Cursor r4 = r2.f241K
                if (r4 != 0) goto L_0x00e4
                androidx.appcompat.app.AlertController$a$1 r14 = new androidx.appcompat.app.AlertController$a$1
                android.content.Context r6 = r2.f246a
                int r7 = r10.f183M
                java.lang.CharSequence[] r8 = r2.f267v
                r4 = r14
                r5 = r2
                r9 = r3
                r4.<init>(r6, r7, r8, r9)
                goto L_0x012f
            L_0x00e4:
                androidx.appcompat.app.AlertController$a$2 r14 = new androidx.appcompat.app.AlertController$a$2
                android.content.Context r6 = r2.f246a
                android.database.Cursor r7 = r2.f241K
                r4 = r14
                r5 = r2
                r8 = r3
                r9 = r10
                r4.<init>(r6, r7, r8, r9)
                goto L_0x012f
            L_0x00f2:
                boolean r4 = r2.f238H
                if (r4 == 0) goto L_0x00f9
                int r4 = r10.f184N
                goto L_0x00fb
            L_0x00f9:
                int r4 = r10.f185O
            L_0x00fb:
                android.database.Cursor r5 = r2.f241K
                if (r5 == 0) goto L_0x011f
                android.widget.SimpleCursorAdapter r5 = new android.widget.SimpleCursorAdapter
                android.content.Context r15 = r2.f246a
                android.database.Cursor r6 = r2.f241K
                java.lang.String[] r7 = new java.lang.String[r11]
                java.lang.String r8 = r2.f242L
                r7[r12] = r8
                int[] r8 = new int[r11]
                r9 = 16908308(0x1020014, float:2.3877285E-38)
                r8[r12] = r9
                r14 = r5
                r16 = r4
                r17 = r6
                r18 = r7
                r19 = r8
                r14.<init>(r15, r16, r17, r18, r19)
                goto L_0x012f
            L_0x011f:
                android.widget.ListAdapter r5 = r2.f268w
                if (r5 == 0) goto L_0x0126
                android.widget.ListAdapter r14 = r2.f268w
                goto L_0x012f
            L_0x0126:
                androidx.appcompat.app.AlertController$c r14 = new androidx.appcompat.app.AlertController$c
                android.content.Context r5 = r2.f246a
                java.lang.CharSequence[] r6 = r2.f267v
                r14.<init>(r5, r4, r6)
            L_0x012f:
                r10.f178H = r14
                int r4 = r2.f239I
                r10.f179I = r4
                android.content.DialogInterface$OnClickListener r4 = r2.f269x
                if (r4 == 0) goto L_0x0142
                androidx.appcompat.app.AlertController$a$3 r4 = new androidx.appcompat.app.AlertController$a$3
                r4.<init>(r10)
            L_0x013e:
                r3.setOnItemClickListener(r4)
                goto L_0x014c
            L_0x0142:
                android.content.DialogInterface$OnMultiChoiceClickListener r4 = r2.f240J
                if (r4 == 0) goto L_0x014c
                androidx.appcompat.app.AlertController$a$4 r4 = new androidx.appcompat.app.AlertController$a$4
                r4.<init>(r3, r10)
                goto L_0x013e
            L_0x014c:
                android.widget.AdapterView$OnItemSelectedListener r4 = r2.f244N
                if (r4 == 0) goto L_0x0155
                android.widget.AdapterView$OnItemSelectedListener r4 = r2.f244N
                r3.setOnItemSelectedListener(r4)
            L_0x0155:
                boolean r4 = r2.f238H
                if (r4 == 0) goto L_0x015d
                r3.setChoiceMode(r11)
                goto L_0x0165
            L_0x015d:
                boolean r4 = r2.f237G
                if (r4 == 0) goto L_0x0165
                r4 = 2
                r3.setChoiceMode(r4)
            L_0x0165:
                r10.f196g = r3
            L_0x0167:
                android.view.View r3 = r2.f271z
                if (r3 == 0) goto L_0x0191
                boolean r3 = r2.f235E
                if (r3 == 0) goto L_0x0188
                android.view.View r3 = r2.f271z
                int r4 = r2.f231A
                int r5 = r2.f232B
                int r6 = r2.f233C
                int r2 = r2.f234D
                r10.f197h = r3
                r10.f198i = r12
                r10.f203n = r11
                r10.f199j = r4
                r10.f200k = r5
                r10.f201l = r6
                r10.f202m = r2
                goto L_0x019c
            L_0x0188:
                android.view.View r2 = r2.f271z
                r10.f197h = r2
                r10.f198i = r12
            L_0x018e:
                r10.f203n = r12
                goto L_0x019c
            L_0x0191:
                int r3 = r2.f270y
                if (r3 == 0) goto L_0x019c
                int r2 = r2.f270y
                r10.f197h = r13
                r10.f198i = r2
                goto L_0x018e
            L_0x019c:
                androidx.appcompat.app.AlertController$a r2 = r0.f1140a
                boolean r2 = r2.f263r
                r1.setCancelable(r2)
                androidx.appcompat.app.AlertController$a r2 = r0.f1140a
                boolean r2 = r2.f263r
                if (r2 == 0) goto L_0x01ac
                r1.setCanceledOnTouchOutside(r11)
            L_0x01ac:
                androidx.appcompat.app.AlertController$a r2 = r0.f1140a
                android.content.DialogInterface$OnCancelListener r2 = r2.f264s
                r1.setOnCancelListener(r2)
                androidx.appcompat.app.AlertController$a r2 = r0.f1140a
                android.content.DialogInterface$OnDismissListener r2 = r2.f265t
                r1.setOnDismissListener(r2)
                androidx.appcompat.app.AlertController$a r2 = r0.f1140a
                android.content.DialogInterface$OnKeyListener r2 = r2.f266u
                if (r2 == 0) goto L_0x01c7
                androidx.appcompat.app.AlertController$a r2 = r0.f1140a
                android.content.DialogInterface$OnKeyListener r2 = r2.f266u
                r1.setOnKeyListener(r2)
            L_0x01c7:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0230d.C0231a.mo1348a():d");
        }
    }

    protected C0230d(Context context, int i) {
        super(context, m746a(context, i));
    }

    /* renamed from: a */
    static int m746a(Context context, int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0117a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x030a, code lost:
        if (r2 != null) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0315, code lost:
        if (r2 != null) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0375, code lost:
        if (r5 != null) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ca, code lost:
        if (r5 != null) goto L_0x0377;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0347  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            androidx.appcompat.app.AlertController r15 = r14.f1139a
            int r0 = r15.f181K
            r1 = 1
            if (r0 == 0) goto L_0x0011
            int r0 = r15.f187Q
            if (r0 != r1) goto L_0x0011
            int r0 = r15.f181K
            goto L_0x0013
        L_0x0011:
            int r0 = r15.f180J
        L_0x0013:
            i r2 = r15.f191b
            r2.setContentView(r0)
            android.view.Window r0 = r15.f192c
            int r2 = p000.C0116b.C0122f.parentPanel
            android.view.View r0 = r0.findViewById(r2)
            int r2 = p000.C0116b.C0122f.topPanel
            android.view.View r2 = r0.findViewById(r2)
            int r3 = p000.C0116b.C0122f.contentPanel
            android.view.View r3 = r0.findViewById(r3)
            int r4 = p000.C0116b.C0122f.buttonPanel
            android.view.View r4 = r0.findViewById(r4)
            int r5 = p000.C0116b.C0122f.customPanel
            android.view.View r0 = r0.findViewById(r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r5 = r15.f197h
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x0043
            android.view.View r5 = r15.f197h
            goto L_0x0055
        L_0x0043:
            int r5 = r15.f198i
            if (r5 == 0) goto L_0x0054
            android.content.Context r5 = r15.f190a
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r8 = r15.f198i
            android.view.View r5 = r5.inflate(r8, r0, r7)
            goto L_0x0055
        L_0x0054:
            r5 = r6
        L_0x0055:
            if (r5 == 0) goto L_0x0059
            r8 = r1
            goto L_0x005a
        L_0x0059:
            r8 = r7
        L_0x005a:
            if (r8 == 0) goto L_0x0062
            boolean r9 = androidx.appcompat.app.AlertController.m136a(r5)
            if (r9 != 0) goto L_0x0069
        L_0x0062:
            android.view.Window r9 = r15.f192c
            r10 = 131072(0x20000, float:1.83671E-40)
            r9.setFlags(r10, r10)
        L_0x0069:
            r9 = -1
            r10 = 8
            if (r8 == 0) goto L_0x009d
            android.view.Window r8 = r15.f192c
            int r11 = p000.C0116b.C0122f.custom
            android.view.View r8 = r8.findViewById(r11)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r11.<init>(r9, r9)
            r8.addView(r5, r11)
            boolean r5 = r15.f203n
            if (r5 == 0) goto L_0x008f
            int r5 = r15.f199j
            int r11 = r15.f200k
            int r12 = r15.f201l
            int r13 = r15.f202m
            r8.setPadding(r5, r11, r12, r13)
        L_0x008f:
            android.widget.ListView r5 = r15.f196g
            if (r5 == 0) goto L_0x00a0
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            cf$a r5 = (p000.C0190cf.C0191a) r5
            r8 = 0
            r5.f969g = r8
            goto L_0x00a0
        L_0x009d:
            r0.setVisibility(r10)
        L_0x00a0:
            int r5 = p000.C0116b.C0122f.topPanel
            android.view.View r5 = r0.findViewById(r5)
            int r8 = p000.C0116b.C0122f.contentPanel
            android.view.View r8 = r0.findViewById(r8)
            int r11 = p000.C0116b.C0122f.buttonPanel
            android.view.View r11 = r0.findViewById(r11)
            android.view.ViewGroup r2 = androidx.appcompat.app.AlertController.m133a(r5, r2)
            android.view.ViewGroup r3 = androidx.appcompat.app.AlertController.m133a(r8, r3)
            android.view.ViewGroup r4 = androidx.appcompat.app.AlertController.m133a(r11, r4)
            android.view.Window r5 = r15.f192c
            int r8 = p000.C0116b.C0122f.scrollView
            android.view.View r5 = r5.findViewById(r8)
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            r15.f171A = r5
            androidx.core.widget.NestedScrollView r5 = r15.f171A
            r5.setFocusable(r7)
            androidx.core.widget.NestedScrollView r5 = r15.f171A
            r5.setNestedScrollingEnabled(r7)
            r5 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r15.f176F = r5
            android.widget.TextView r5 = r15.f176F
            if (r5 == 0) goto L_0x011e
            java.lang.CharSequence r5 = r15.f195f
            if (r5 == 0) goto L_0x00ef
            android.widget.TextView r5 = r15.f176F
            java.lang.CharSequence r8 = r15.f195f
            r5.setText(r8)
            goto L_0x011e
        L_0x00ef:
            android.widget.TextView r5 = r15.f176F
            r5.setVisibility(r10)
            androidx.core.widget.NestedScrollView r5 = r15.f171A
            android.widget.TextView r8 = r15.f176F
            r5.removeView(r8)
            android.widget.ListView r5 = r15.f196g
            if (r5 == 0) goto L_0x011b
            androidx.core.widget.NestedScrollView r5 = r15.f171A
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.core.widget.NestedScrollView r8 = r15.f171A
            int r8 = r5.indexOfChild(r8)
            r5.removeViewAt(r8)
            android.widget.ListView r11 = r15.f196g
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r12.<init>(r9, r9)
            r5.addView(r11, r8, r12)
            goto L_0x011e
        L_0x011b:
            r3.setVisibility(r10)
        L_0x011e:
            r5 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r15.f204o = r5
            android.widget.Button r5 = r15.f204o
            android.view.View$OnClickListener r8 = r15.f189S
            r5.setOnClickListener(r8)
            java.lang.CharSequence r5 = r15.f205p
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r5 = r15.f207r
            if (r5 != 0) goto L_0x0143
            android.widget.Button r5 = r15.f204o
            r5.setVisibility(r10)
            r5 = r7
            goto L_0x0164
        L_0x0143:
            android.widget.Button r5 = r15.f204o
            java.lang.CharSequence r8 = r15.f205p
            r5.setText(r8)
            android.graphics.drawable.Drawable r5 = r15.f207r
            if (r5 == 0) goto L_0x015e
            android.graphics.drawable.Drawable r5 = r15.f207r
            int r8 = r15.f193d
            int r11 = r15.f193d
            r5.setBounds(r7, r7, r8, r11)
            android.widget.Button r5 = r15.f204o
            android.graphics.drawable.Drawable r8 = r15.f207r
            r5.setCompoundDrawables(r8, r6, r6, r6)
        L_0x015e:
            android.widget.Button r5 = r15.f204o
            r5.setVisibility(r7)
            r5 = r1
        L_0x0164:
            r8 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            r15.f208s = r8
            android.widget.Button r8 = r15.f208s
            android.view.View$OnClickListener r11 = r15.f189S
            r8.setOnClickListener(r11)
            java.lang.CharSequence r8 = r15.f209t
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0188
            android.graphics.drawable.Drawable r8 = r15.f211v
            if (r8 != 0) goto L_0x0188
            android.widget.Button r8 = r15.f208s
            r8.setVisibility(r10)
            goto L_0x01aa
        L_0x0188:
            android.widget.Button r8 = r15.f208s
            java.lang.CharSequence r11 = r15.f209t
            r8.setText(r11)
            android.graphics.drawable.Drawable r8 = r15.f211v
            if (r8 == 0) goto L_0x01a3
            android.graphics.drawable.Drawable r8 = r15.f211v
            int r11 = r15.f193d
            int r12 = r15.f193d
            r8.setBounds(r7, r7, r11, r12)
            android.widget.Button r8 = r15.f208s
            android.graphics.drawable.Drawable r11 = r15.f211v
            r8.setCompoundDrawables(r11, r6, r6, r6)
        L_0x01a3:
            android.widget.Button r8 = r15.f208s
            r8.setVisibility(r7)
            r5 = r5 | 2
        L_0x01aa:
            r8 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            r15.f212w = r8
            android.widget.Button r8 = r15.f212w
            android.view.View$OnClickListener r11 = r15.f189S
            r8.setOnClickListener(r11)
            java.lang.CharSequence r8 = r15.f213x
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x01ce
            android.graphics.drawable.Drawable r8 = r15.f215z
            if (r8 != 0) goto L_0x01ce
            android.widget.Button r8 = r15.f212w
            r8.setVisibility(r10)
            goto L_0x01f0
        L_0x01ce:
            android.widget.Button r8 = r15.f212w
            java.lang.CharSequence r11 = r15.f213x
            r8.setText(r11)
            android.graphics.drawable.Drawable r8 = r15.f207r
            if (r8 == 0) goto L_0x01e9
            android.graphics.drawable.Drawable r8 = r15.f207r
            int r11 = r15.f193d
            int r12 = r15.f193d
            r8.setBounds(r7, r7, r11, r12)
            android.widget.Button r8 = r15.f204o
            android.graphics.drawable.Drawable r11 = r15.f207r
            r8.setCompoundDrawables(r11, r6, r6, r6)
        L_0x01e9:
            android.widget.Button r8 = r15.f212w
            r8.setVisibility(r7)
            r5 = r5 | 4
        L_0x01f0:
            android.content.Context r8 = r15.f190a
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            int r12 = p000.C0116b.C0117a.alertDialogCenterButtons
            r8.resolveAttribute(r12, r11, r1)
            int r8 = r11.data
            if (r8 == 0) goto L_0x0206
            r8 = r1
            goto L_0x0207
        L_0x0206:
            r8 = r7
        L_0x0207:
            r11 = 2
            if (r8 == 0) goto L_0x021d
            if (r5 != r1) goto L_0x0212
            android.widget.Button r8 = r15.f204o
        L_0x020e:
            androidx.appcompat.app.AlertController.m135a(r8)
            goto L_0x021d
        L_0x0212:
            if (r5 != r11) goto L_0x0217
            android.widget.Button r8 = r15.f208s
            goto L_0x020e
        L_0x0217:
            r8 = 4
            if (r5 != r8) goto L_0x021d
            android.widget.Button r8 = r15.f212w
            goto L_0x020e
        L_0x021d:
            if (r5 == 0) goto L_0x0221
            r5 = r1
            goto L_0x0222
        L_0x0221:
            r5 = r7
        L_0x0222:
            if (r5 != 0) goto L_0x0227
            r4.setVisibility(r10)
        L_0x0227:
            android.view.View r5 = r15.f177G
            if (r5 == 0) goto L_0x0243
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r8 = -2
            r5.<init>(r9, r8)
            android.view.View r8 = r15.f177G
            r2.addView(r8, r7, r5)
            android.view.Window r5 = r15.f192c
            int r8 = p000.C0116b.C0122f.title_template
            android.view.View r5 = r5.findViewById(r8)
            r5.setVisibility(r10)
            goto L_0x02be
        L_0x0243:
            android.view.Window r5 = r15.f192c
            r8 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r5 = r5.findViewById(r8)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r15.f174D = r5
            java.lang.CharSequence r5 = r15.f194e
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x02ab
            boolean r5 = r15.f186P
            if (r5 == 0) goto L_0x02ab
            android.view.Window r5 = r15.f192c
            int r8 = p000.C0116b.C0122f.alertTitle
            android.view.View r5 = r5.findViewById(r8)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r15.f175E = r5
            android.widget.TextView r5 = r15.f175E
            java.lang.CharSequence r8 = r15.f194e
            r5.setText(r8)
            int r5 = r15.f172B
            if (r5 == 0) goto L_0x027c
            android.widget.ImageView r5 = r15.f174D
            int r8 = r15.f172B
            r5.setImageResource(r8)
            goto L_0x02be
        L_0x027c:
            android.graphics.drawable.Drawable r5 = r15.f173C
            if (r5 == 0) goto L_0x0288
            android.widget.ImageView r5 = r15.f174D
            android.graphics.drawable.Drawable r8 = r15.f173C
            r5.setImageDrawable(r8)
            goto L_0x02be
        L_0x0288:
            android.widget.TextView r5 = r15.f175E
            android.widget.ImageView r8 = r15.f174D
            int r8 = r8.getPaddingLeft()
            android.widget.ImageView r9 = r15.f174D
            int r9 = r9.getPaddingTop()
            android.widget.ImageView r12 = r15.f174D
            int r12 = r12.getPaddingRight()
            android.widget.ImageView r13 = r15.f174D
            int r13 = r13.getPaddingBottom()
            r5.setPadding(r8, r9, r12, r13)
            android.widget.ImageView r5 = r15.f174D
            r5.setVisibility(r10)
            goto L_0x02be
        L_0x02ab:
            android.view.Window r5 = r15.f192c
            int r8 = p000.C0116b.C0122f.title_template
            android.view.View r5 = r5.findViewById(r8)
            r5.setVisibility(r10)
            android.widget.ImageView r5 = r15.f174D
            r5.setVisibility(r10)
            r2.setVisibility(r10)
        L_0x02be:
            if (r0 == 0) goto L_0x02c8
            int r0 = r0.getVisibility()
            if (r0 == r10) goto L_0x02c8
            r0 = r1
            goto L_0x02c9
        L_0x02c8:
            r0 = r7
        L_0x02c9:
            if (r2 == 0) goto L_0x02d3
            int r5 = r2.getVisibility()
            if (r5 == r10) goto L_0x02d3
            r5 = r1
            goto L_0x02d4
        L_0x02d3:
            r5 = r7
        L_0x02d4:
            if (r4 == 0) goto L_0x02de
            int r4 = r4.getVisibility()
            if (r4 == r10) goto L_0x02de
            r4 = r1
            goto L_0x02df
        L_0x02de:
            r4 = r7
        L_0x02df:
            if (r4 != 0) goto L_0x02ee
            if (r3 == 0) goto L_0x02ee
            int r8 = p000.C0116b.C0122f.textSpacerNoButtons
            android.view.View r8 = r3.findViewById(r8)
            if (r8 == 0) goto L_0x02ee
            r8.setVisibility(r7)
        L_0x02ee:
            if (r5 == 0) goto L_0x030d
            androidx.core.widget.NestedScrollView r8 = r15.f171A
            if (r8 == 0) goto L_0x02f9
            androidx.core.widget.NestedScrollView r8 = r15.f171A
            r8.setClipToPadding(r1)
        L_0x02f9:
            java.lang.CharSequence r8 = r15.f195f
            if (r8 != 0) goto L_0x0304
            android.widget.ListView r8 = r15.f196g
            if (r8 == 0) goto L_0x0302
            goto L_0x0304
        L_0x0302:
            r2 = r6
            goto L_0x030a
        L_0x0304:
            int r8 = p000.C0116b.C0122f.titleDividerNoCustom
            android.view.View r2 = r2.findViewById(r8)
        L_0x030a:
            if (r2 == 0) goto L_0x031a
            goto L_0x0317
        L_0x030d:
            if (r3 == 0) goto L_0x031a
            int r2 = p000.C0116b.C0122f.textSpacerNoTitle
            android.view.View r2 = r3.findViewById(r2)
            if (r2 == 0) goto L_0x031a
        L_0x0317:
            r2.setVisibility(r7)
        L_0x031a:
            android.widget.ListView r2 = r15.f196g
            boolean r2 = r2 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r2 == 0) goto L_0x0345
            android.widget.ListView r2 = r15.f196g
            androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController.RecycleListView) r2
            if (r4 == 0) goto L_0x0328
            if (r5 != 0) goto L_0x0345
        L_0x0328:
            int r8 = r2.getPaddingLeft()
            if (r5 == 0) goto L_0x0333
            int r9 = r2.getPaddingTop()
            goto L_0x0335
        L_0x0333:
            int r9 = r2.f229a
        L_0x0335:
            int r10 = r2.getPaddingRight()
            if (r4 == 0) goto L_0x0340
            int r12 = r2.getPaddingBottom()
            goto L_0x0342
        L_0x0340:
            int r12 = r2.f230b
        L_0x0342:
            r2.setPadding(r8, r9, r10, r12)
        L_0x0345:
            if (r0 != 0) goto L_0x03cd
            android.widget.ListView r0 = r15.f196g
            if (r0 == 0) goto L_0x034e
            android.widget.ListView r0 = r15.f196g
            goto L_0x0350
        L_0x034e:
            androidx.core.widget.NestedScrollView r0 = r15.f171A
        L_0x0350:
            if (r0 == 0) goto L_0x03cd
            if (r4 == 0) goto L_0x0355
            r7 = r11
        L_0x0355:
            r2 = r5 | r7
            android.view.Window r4 = r15.f192c
            int r5 = p000.C0116b.C0122f.scrollIndicatorUp
            android.view.View r4 = r4.findViewById(r5)
            android.view.Window r5 = r15.f192c
            int r7 = p000.C0116b.C0122f.scrollIndicatorDown
            android.view.View r5 = r5.findViewById(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            if (r7 < r8) goto L_0x037b
            p000.C0396gq.m1254a(r0, r2)
            if (r4 == 0) goto L_0x0375
            r3.removeView(r4)
        L_0x0375:
            if (r5 == 0) goto L_0x03cd
        L_0x0377:
            r3.removeView(r5)
            goto L_0x03cd
        L_0x037b:
            if (r4 == 0) goto L_0x0385
            r0 = r2 & 1
            if (r0 != 0) goto L_0x0385
            r3.removeView(r4)
            r4 = r6
        L_0x0385:
            if (r5 == 0) goto L_0x038f
            r0 = r2 & 2
            if (r0 != 0) goto L_0x038f
            r3.removeView(r5)
            r5 = r6
        L_0x038f:
            if (r4 != 0) goto L_0x0393
            if (r5 == 0) goto L_0x03cd
        L_0x0393:
            java.lang.CharSequence r0 = r15.f195f
            if (r0 == 0) goto L_0x03ac
            androidx.core.widget.NestedScrollView r0 = r15.f171A
            androidx.appcompat.app.AlertController$2 r2 = new androidx.appcompat.app.AlertController$2
            r2.<init>(r4, r5)
            r0.setOnScrollChangeListener(r2)
            androidx.core.widget.NestedScrollView r0 = r15.f171A
            androidx.appcompat.app.AlertController$3 r2 = new androidx.appcompat.app.AlertController$3
            r2.<init>(r4, r5)
            r0.post(r2)
            goto L_0x03cd
        L_0x03ac:
            android.widget.ListView r0 = r15.f196g
            if (r0 == 0) goto L_0x03c5
            android.widget.ListView r0 = r15.f196g
            androidx.appcompat.app.AlertController$4 r2 = new androidx.appcompat.app.AlertController$4
            r2.<init>(r4, r5)
            r0.setOnScrollListener(r2)
            android.widget.ListView r0 = r15.f196g
            androidx.appcompat.app.AlertController$5 r2 = new androidx.appcompat.app.AlertController$5
            r2.<init>(r4, r5)
            r0.post(r2)
            goto L_0x03cd
        L_0x03c5:
            if (r4 == 0) goto L_0x03ca
            r3.removeView(r4)
        L_0x03ca:
            if (r5 == 0) goto L_0x03cd
            goto L_0x0377
        L_0x03cd:
            android.widget.ListView r0 = r15.f196g
            if (r0 == 0) goto L_0x03e4
            android.widget.ListAdapter r2 = r15.f178H
            if (r2 == 0) goto L_0x03e4
            android.widget.ListAdapter r2 = r15.f178H
            r0.setAdapter(r2)
            int r15 = r15.f179I
            if (r15 < 0) goto L_0x03e4
            r0.setItemChecked(r15, r1)
            r0.setSelection(r15)
        L_0x03e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0230d.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f1139a;
        if (alertController.f171A != null && alertController.f171A.mo746a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f1139a;
        if (alertController.f171A != null && alertController.f171A.mo746a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1139a.mo323a(charSequence);
    }
}
