package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

/* renamed from: cg */
public class C0192cg implements C0107au {

    /* renamed from: a */
    private static Method f971a;

    /* renamed from: b */
    private static Method f972b;

    /* renamed from: c */
    private static Method f973c;

    /* renamed from: A */
    private boolean f974A;

    /* renamed from: B */
    private View f975B;

    /* renamed from: C */
    private DataSetObserver f976C;

    /* renamed from: D */
    private Drawable f977D;

    /* renamed from: E */
    private OnItemSelectedListener f978E;

    /* renamed from: F */
    private final C0198d f979F;

    /* renamed from: G */
    private final C0197c f980G;

    /* renamed from: H */
    private final C0195a f981H;

    /* renamed from: I */
    private Runnable f982I;

    /* renamed from: J */
    private final Rect f983J;

    /* renamed from: d */
    private Context f984d;

    /* renamed from: e */
    public C0182cc f985e;

    /* renamed from: f */
    int f986f;

    /* renamed from: g */
    public int f987g;

    /* renamed from: h */
    public boolean f988h;

    /* renamed from: i */
    public boolean f989i;

    /* renamed from: j */
    public int f990j;

    /* renamed from: k */
    int f991k;

    /* renamed from: l */
    int f992l;

    /* renamed from: m */
    public View f993m;

    /* renamed from: n */
    public OnItemClickListener f994n;

    /* renamed from: o */
    final C0199e f995o;

    /* renamed from: p */
    final Handler f996p;

    /* renamed from: q */
    public Rect f997q;

    /* renamed from: r */
    public boolean f998r;

    /* renamed from: s */
    public PopupWindow f999s;

    /* renamed from: t */
    private ListAdapter f1000t;

    /* renamed from: u */
    private int f1001u;

    /* renamed from: v */
    private int f1002v;

    /* renamed from: w */
    private int f1003w;

    /* renamed from: x */
    private boolean f1004x;

    /* renamed from: y */
    private boolean f1005y;

    /* renamed from: z */
    private boolean f1006z;

    /* renamed from: cg$a */
    class C0195a implements Runnable {
        C0195a() {
        }

        public final void run() {
            C0192cg.this.mo1217i();
        }
    }

    /* renamed from: cg$b */
    class C0196b extends DataSetObserver {
        C0196b() {
        }

        public final void onChanged() {
            if (C0192cg.this.f999s.isShowing()) {
                C0192cg.this.mo111b();
            }
        }

        public final void onInvalidated() {
            C0192cg.this.mo114c();
        }
    }

    /* renamed from: cg$c */
    class C0197c implements OnScrollListener {
        C0197c() {
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0192cg.this.mo1218j() && C0192cg.this.f999s.getContentView() != null) {
                C0192cg.this.f996p.removeCallbacks(C0192cg.this.f995o);
                C0192cg.this.f995o.run();
            }
        }
    }

    /* renamed from: cg$d */
    class C0198d implements OnTouchListener {
        C0198d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && C0192cg.this.f999s != null && C0192cg.this.f999s.isShowing() && x >= 0 && x < C0192cg.this.f999s.getWidth() && y >= 0 && y < C0192cg.this.f999s.getHeight()) {
                C0192cg.this.f996p.postDelayed(C0192cg.this.f995o, 250);
            } else if (action == 1) {
                C0192cg.this.f996p.removeCallbacks(C0192cg.this.f995o);
            }
            return false;
        }
    }

    /* renamed from: cg$e */
    class C0199e implements Runnable {
        C0199e() {
        }

        public final void run() {
            if (C0192cg.this.f985e != null && C0396gq.m1276m(C0192cg.this.f985e) && C0192cg.this.f985e.getCount() > C0192cg.this.f985e.getChildCount() && C0192cg.this.f985e.getChildCount() <= C0192cg.this.f991k) {
                C0192cg.this.f999s.setInputMethodMode(2);
                C0192cg.this.mo111b();
            }
        }
    }

    static {
        try {
            f971a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f972b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f973c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0192cg(Context context) {
        this(context, null, C0117a.listPopupWindowStyle);
    }

    public C0192cg(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0192cg(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1001u = -2;
        this.f986f = -2;
        this.f1003w = 1002;
        this.f1005y = true;
        this.f990j = 0;
        this.f1006z = false;
        this.f974A = false;
        this.f991k = Integer.MAX_VALUE;
        this.f992l = 0;
        this.f995o = new C0199e();
        this.f979F = new C0198d();
        this.f980G = new C0197c();
        this.f981H = new C0195a();
        this.f983J = new Rect();
        this.f984d = context;
        this.f996p = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126j.ListPopupWindow, i, i2);
        this.f987g = obtainStyledAttributes.getDimensionPixelOffset(C0126j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1002v = obtainStyledAttributes.getDimensionPixelOffset(C0126j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1002v != 0) {
            this.f1004x = true;
        }
        obtainStyledAttributes.recycle();
        this.f999s = new C0159bp(context, attributeSet, i, i2);
        this.f999s.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m626a(View view, int i, boolean z) {
        if (f972b != null) {
            try {
                return ((Integer) f972b.invoke(this.f999s, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f999s.getMaxAvailableHeight(view, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0182cc mo1209a(Context context, boolean z) {
        return new C0182cc(context, z);
    }

    /* renamed from: a */
    public final void mo1210a(int i) {
        this.f1002v = i;
        this.f1004x = true;
    }

    /* renamed from: a */
    public final void mo1211a(Drawable drawable) {
        this.f999s.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo1061a(ListAdapter listAdapter) {
        if (this.f976C == null) {
            this.f976C = new C0196b();
        } else if (this.f1000t != null) {
            this.f1000t.unregisterDataSetObserver(this.f976C);
        }
        this.f1000t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f976C);
        }
        if (this.f985e != null) {
            this.f985e.setAdapter(this.f1000t);
        }
    }

    /* renamed from: a */
    public final void mo1212a(OnDismissListener onDismissListener) {
        this.f999s.setOnDismissListener(onDismissListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012b, code lost:
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, 1073741824);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0163, code lost:
        r1 = r13.f985e.mo1157a(r1, 0, -1, r6 - r0, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016e, code lost:
        if (r1 <= 0) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        r0 = r0 + (r5 + (r13.f985e.getPaddingTop() + r13.f985e.getPaddingBottom()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017f, code lost:
        r1 = r1 + r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111b() {
        /*
            r13 = this;
            cc r0 = r13.f985e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x00c2
            android.content.Context r0 = r13.f984d
            cg$1 r5 = new cg$1
            r5.<init>()
            r13.f982I = r5
            boolean r5 = r13.f998r
            r5 = r5 ^ r2
            cc r5 = r13.mo1209a(r0, r5)
            r13.f985e = r5
            android.graphics.drawable.Drawable r5 = r13.f977D
            if (r5 == 0) goto L_0x0026
            cc r5 = r13.f985e
            android.graphics.drawable.Drawable r6 = r13.f977D
            r5.setSelector(r6)
        L_0x0026:
            cc r5 = r13.f985e
            android.widget.ListAdapter r6 = r13.f1000t
            r5.setAdapter(r6)
            cc r5 = r13.f985e
            android.widget.AdapterView$OnItemClickListener r6 = r13.f994n
            r5.setOnItemClickListener(r6)
            cc r5 = r13.f985e
            r5.setFocusable(r2)
            cc r5 = r13.f985e
            r5.setFocusableInTouchMode(r2)
            cc r5 = r13.f985e
            cg$2 r6 = new cg$2
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            cc r5 = r13.f985e
            cg$c r6 = r13.f980G
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r13.f978E
            if (r5 == 0) goto L_0x005a
            cc r5 = r13.f985e
            android.widget.AdapterView$OnItemSelectedListener r6 = r13.f978E
            r5.setOnItemSelectedListener(r6)
        L_0x005a:
            cc r5 = r13.f985e
            android.view.View r6 = r13.f975B
            if (r6 == 0) goto L_0x00bb
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r3, r8)
            int r8 = r13.f992l
            switch(r8) {
                case 0: goto L_0x0091;
                case 1: goto L_0x008a;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.String r0 = "ListPopupWindow"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid hint position "
            r5.<init>(r8)
            int r8 = r13.f992l
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            goto L_0x0097
        L_0x008a:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0097
        L_0x0091:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0097:
            int r0 = r13.f986f
            if (r0 < 0) goto L_0x009f
            int r0 = r13.f986f
            r5 = r1
            goto L_0x00a1
        L_0x009f:
            r0 = r3
            r5 = r0
        L_0x00a1:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r3)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00bc
        L_0x00bb:
            r0 = r3
        L_0x00bc:
            android.widget.PopupWindow r6 = r13.f999s
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00c2:
            android.widget.PopupWindow r0 = r13.f999s
            r0.getContentView()
            android.view.View r0 = r13.f975B
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = r3
        L_0x00dd:
            android.widget.PopupWindow r5 = r13.f999s
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00ff
            android.graphics.Rect r6 = r13.f983J
            r5.getPadding(r6)
            android.graphics.Rect r5 = r13.f983J
            int r5 = r5.top
            android.graphics.Rect r6 = r13.f983J
            int r6 = r6.bottom
            int r5 = r5 + r6
            boolean r6 = r13.f1004x
            if (r6 != 0) goto L_0x0105
            android.graphics.Rect r6 = r13.f983J
            int r6 = r6.top
            int r6 = -r6
            r13.f1002v = r6
            goto L_0x0105
        L_0x00ff:
            android.graphics.Rect r5 = r13.f983J
            r5.setEmpty()
            r5 = r3
        L_0x0105:
            android.widget.PopupWindow r6 = r13.f999s
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0110
            r6 = r2
            goto L_0x0111
        L_0x0110:
            r6 = r3
        L_0x0111:
            android.view.View r7 = r13.f993m
            int r8 = r13.f1002v
            int r6 = r13.m626a(r7, r8, r6)
            boolean r7 = r13.f1006z
            if (r7 != 0) goto L_0x0181
            int r7 = r13.f1001u
            if (r7 != r4) goto L_0x0122
            goto L_0x0181
        L_0x0122:
            int r7 = r13.f986f
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case -2: goto L_0x0148;
                case -1: goto L_0x0131;
                default: goto L_0x0129;
            }
        L_0x0129:
            int r1 = r13.f986f
        L_0x012b:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
        L_0x012f:
            r8 = r1
            goto L_0x0163
        L_0x0131:
            android.content.Context r1 = r13.f984d
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            android.graphics.Rect r7 = r13.f983J
            int r7 = r7.left
            android.graphics.Rect r9 = r13.f983J
            int r9 = r9.right
            int r7 = r7 + r9
            int r1 = r1 - r7
            goto L_0x012b
        L_0x0148:
            android.content.Context r7 = r13.f984d
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            android.graphics.Rect r8 = r13.f983J
            int r8 = r8.left
            android.graphics.Rect r9 = r13.f983J
            int r9 = r9.right
            int r8 = r8 + r9
            int r7 = r7 - r8
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            goto L_0x012f
        L_0x0163:
            cc r7 = r13.f985e
            r9 = 0
            r10 = -1
            int r11 = r6 - r0
            r12 = -1
            int r1 = r7.mo1157a(r8, r9, r10, r11, r12)
            if (r1 <= 0) goto L_0x017f
            cc r6 = r13.f985e
            int r6 = r6.getPaddingTop()
            cc r7 = r13.f985e
            int r7 = r7.getPaddingBottom()
            int r6 = r6 + r7
            int r5 = r5 + r6
            int r0 = r0 + r5
        L_0x017f:
            int r1 = r1 + r0
            goto L_0x0183
        L_0x0181:
            int r6 = r6 + r5
            r1 = r6
        L_0x0183:
            boolean r0 = r13.mo1218j()
            android.widget.PopupWindow r5 = r13.f999s
            int r6 = r13.f1003w
            p000.C0439hf.m1388a(r5, r6)
            android.widget.PopupWindow r5 = r13.f999s
            boolean r5 = r5.isShowing()
            r6 = -2
            if (r5 == 0) goto L_0x020d
            android.view.View r5 = r13.f993m
            boolean r5 = p000.C0396gq.m1276m(r5)
            if (r5 != 0) goto L_0x01a0
            return
        L_0x01a0:
            int r5 = r13.f986f
            if (r5 != r4) goto L_0x01a6
            r5 = r4
            goto L_0x01b3
        L_0x01a6:
            int r5 = r13.f986f
            if (r5 != r6) goto L_0x01b1
            android.view.View r5 = r13.f993m
            int r5 = r5.getWidth()
            goto L_0x01b3
        L_0x01b1:
            int r5 = r13.f986f
        L_0x01b3:
            int r7 = r13.f1001u
            if (r7 != r4) goto L_0x01e1
            if (r0 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x01ba:
            r1 = r4
        L_0x01bb:
            if (r0 == 0) goto L_0x01cf
            android.widget.PopupWindow r0 = r13.f999s
            int r6 = r13.f986f
            if (r6 != r4) goto L_0x01c5
            r6 = r4
            goto L_0x01c6
        L_0x01c5:
            r6 = r3
        L_0x01c6:
            r0.setWidth(r6)
            android.widget.PopupWindow r0 = r13.f999s
            r0.setHeight(r3)
            goto L_0x01e8
        L_0x01cf:
            android.widget.PopupWindow r0 = r13.f999s
            int r6 = r13.f986f
            if (r6 != r4) goto L_0x01d7
            r6 = r4
            goto L_0x01d8
        L_0x01d7:
            r6 = r3
        L_0x01d8:
            r0.setWidth(r6)
            android.widget.PopupWindow r0 = r13.f999s
            r0.setHeight(r4)
            goto L_0x01e8
        L_0x01e1:
            int r0 = r13.f1001u
            if (r0 == r6) goto L_0x01e8
            int r0 = r13.f1001u
            r1 = r0
        L_0x01e8:
            android.widget.PopupWindow r0 = r13.f999s
            boolean r6 = r13.f974A
            if (r6 != 0) goto L_0x01f3
            boolean r6 = r13.f1006z
            if (r6 != 0) goto L_0x01f3
            goto L_0x01f4
        L_0x01f3:
            r2 = r3
        L_0x01f4:
            r0.setOutsideTouchable(r2)
            android.widget.PopupWindow r6 = r13.f999s
            android.view.View r7 = r13.f993m
            int r8 = r13.f987g
            int r9 = r13.f1002v
            if (r5 >= 0) goto L_0x0203
            r10 = r4
            goto L_0x0204
        L_0x0203:
            r10 = r5
        L_0x0204:
            if (r1 >= 0) goto L_0x0208
            r11 = r4
            goto L_0x0209
        L_0x0208:
            r11 = r1
        L_0x0209:
            r6.update(r7, r8, r9, r10, r11)
            return
        L_0x020d:
            int r0 = r13.f986f
            if (r0 != r4) goto L_0x0213
            r0 = r4
            goto L_0x0220
        L_0x0213:
            int r0 = r13.f986f
            if (r0 != r6) goto L_0x021e
            android.view.View r0 = r13.f993m
            int r0 = r0.getWidth()
            goto L_0x0220
        L_0x021e:
            int r0 = r13.f986f
        L_0x0220:
            int r5 = r13.f1001u
            if (r5 != r4) goto L_0x0226
            r1 = r4
            goto L_0x022c
        L_0x0226:
            int r5 = r13.f1001u
            if (r5 == r6) goto L_0x022c
            int r1 = r13.f1001u
        L_0x022c:
            android.widget.PopupWindow r5 = r13.f999s
            r5.setWidth(r0)
            android.widget.PopupWindow r0 = r13.f999s
            r0.setHeight(r1)
            java.lang.reflect.Method r0 = f971a
            if (r0 == 0) goto L_0x0251
            java.lang.reflect.Method r0 = f971a     // Catch:{ Exception -> 0x024a }
            android.widget.PopupWindow r1 = r13.f999s     // Catch:{ Exception -> 0x024a }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x024a }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x024a }
            r5[r3] = r6     // Catch:{ Exception -> 0x024a }
            r0.invoke(r1, r5)     // Catch:{ Exception -> 0x024a }
            goto L_0x0251
        L_0x024a:
            java.lang.String r0 = "ListPopupWindow"
            java.lang.String r1 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L_0x0251:
            android.widget.PopupWindow r0 = r13.f999s
            boolean r1 = r13.f974A
            if (r1 != 0) goto L_0x025d
            boolean r1 = r13.f1006z
            if (r1 != 0) goto L_0x025d
            r1 = r2
            goto L_0x025e
        L_0x025d:
            r1 = r3
        L_0x025e:
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r13.f999s
            cg$d r1 = r13.f979F
            r0.setTouchInterceptor(r1)
            boolean r0 = r13.f989i
            if (r0 == 0) goto L_0x0273
            android.widget.PopupWindow r0 = r13.f999s
            boolean r1 = r13.f988h
            p000.C0439hf.m1389a(r0, r1)
        L_0x0273:
            java.lang.reflect.Method r0 = f973c
            if (r0 == 0) goto L_0x028d
            java.lang.reflect.Method r0 = f973c     // Catch:{ Exception -> 0x0285 }
            android.widget.PopupWindow r1 = r13.f999s     // Catch:{ Exception -> 0x0285 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0285 }
            android.graphics.Rect r5 = r13.f997q     // Catch:{ Exception -> 0x0285 }
            r2[r3] = r5     // Catch:{ Exception -> 0x0285 }
            r0.invoke(r1, r2)     // Catch:{ Exception -> 0x0285 }
            goto L_0x028d
        L_0x0285:
            r0 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r2 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r2, r0)
        L_0x028d:
            android.widget.PopupWindow r0 = r13.f999s
            android.view.View r1 = r13.f993m
            int r2 = r13.f987g
            int r3 = r13.f1002v
            int r5 = r13.f990j
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 19
            if (r6 < r7) goto L_0x02a1
            r0.showAsDropDown(r1, r2, r3, r5)
            goto L_0x02bb
        L_0x02a1:
            int r6 = p000.C0396gq.m1264b(r1)
            int r5 = p000.C0384gf.m1231a(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L_0x02b8
            int r5 = r0.getWidth()
            int r6 = r1.getWidth()
            int r5 = r5 - r6
            int r2 = r2 - r5
        L_0x02b8:
            r0.showAsDropDown(r1, r2, r3)
        L_0x02bb:
            cc r0 = r13.f985e
            r0.setSelection(r4)
            boolean r0 = r13.f998r
            if (r0 == 0) goto L_0x02cc
            cc r0 = r13.f985e
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x02cf
        L_0x02cc:
            r13.mo1217i()
        L_0x02cf:
            boolean r0 = r13.f998r
            if (r0 != 0) goto L_0x02da
            android.os.Handler r0 = r13.f996p
            cg$a r1 = r13.f981H
            r0.post(r1)
        L_0x02da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0192cg.mo111b():void");
    }

    /* renamed from: b */
    public final void mo1213b(int i) {
        Drawable background = this.f999s.getBackground();
        if (background != null) {
            background.getPadding(this.f983J);
            this.f986f = this.f983J.left + this.f983J.right + i;
            return;
        }
        this.f986f = i;
    }

    /* renamed from: c */
    public final void mo114c() {
        this.f999s.dismiss();
        if (this.f975B != null) {
            ViewParent parent = this.f975B.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f975B);
            }
        }
        this.f999s.setContentView(null);
        this.f985e = null;
        this.f996p.removeCallbacks(this.f995o);
    }

    /* renamed from: d */
    public final boolean mo117d() {
        return this.f999s.isShowing();
    }

    /* renamed from: e */
    public final ListView mo118e() {
        return this.f985e;
    }

    /* renamed from: f */
    public final void mo1214f() {
        this.f998r = true;
        this.f999s.setFocusable(true);
    }

    /* renamed from: g */
    public final int mo1215g() {
        if (!this.f1004x) {
            return 0;
        }
        return this.f1002v;
    }

    /* renamed from: h */
    public final void mo1216h() {
        this.f999s.setInputMethodMode(2);
    }

    /* renamed from: i */
    public final void mo1217i() {
        C0182cc ccVar = this.f985e;
        if (ccVar != null) {
            ccVar.setListSelectionHidden(true);
            ccVar.requestLayout();
        }
    }

    /* renamed from: j */
    public final boolean mo1218j() {
        return this.f999s.getInputMethodMode() == 2;
    }
}
