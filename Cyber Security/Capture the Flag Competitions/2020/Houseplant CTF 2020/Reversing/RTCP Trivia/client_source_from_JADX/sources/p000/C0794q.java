package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: q */
class C0794q extends Drawable implements Callback {

    /* renamed from: a */
    C0797b f3336a;

    /* renamed from: b */
    int f3337b = -1;

    /* renamed from: c */
    private Rect f3338c;

    /* renamed from: d */
    private Drawable f3339d;

    /* renamed from: e */
    private Drawable f3340e;

    /* renamed from: f */
    private int f3341f = 255;

    /* renamed from: g */
    private boolean f3342g;

    /* renamed from: h */
    private int f3343h = -1;

    /* renamed from: i */
    private boolean f3344i;

    /* renamed from: j */
    private Runnable f3345j;

    /* renamed from: k */
    private long f3346k;

    /* renamed from: l */
    private long f3347l;

    /* renamed from: m */
    private C0796a f3348m;

    /* renamed from: q$a */
    static class C0796a implements Callback {

        /* renamed from: a */
        Callback f3350a;

        C0796a() {
        }

        /* renamed from: a */
        public final Callback mo2761a() {
            Callback callback = this.f3350a;
            this.f3350a = null;
            return callback;
        }

        public final void invalidateDrawable(Drawable drawable) {
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (this.f3350a != null) {
                this.f3350a.scheduleDrawable(drawable, runnable, j);
            }
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (this.f3350a != null) {
                this.f3350a.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: q$b */
    static abstract class C0797b extends ConstantState {

        /* renamed from: A */
        boolean f3351A;

        /* renamed from: B */
        int f3352B;

        /* renamed from: C */
        int f3353C;

        /* renamed from: D */
        int f3354D;

        /* renamed from: E */
        boolean f3355E;

        /* renamed from: F */
        ColorFilter f3356F;

        /* renamed from: G */
        boolean f3357G;

        /* renamed from: H */
        ColorStateList f3358H;

        /* renamed from: I */
        Mode f3359I;

        /* renamed from: J */
        boolean f3360J;

        /* renamed from: K */
        boolean f3361K;

        /* renamed from: c */
        final C0794q f3362c;

        /* renamed from: d */
        Resources f3363d;

        /* renamed from: e */
        int f3364e = 160;

        /* renamed from: f */
        int f3365f;

        /* renamed from: g */
        int f3366g;

        /* renamed from: h */
        SparseArray<ConstantState> f3367h;

        /* renamed from: i */
        Drawable[] f3368i;

        /* renamed from: j */
        int f3369j;

        /* renamed from: k */
        boolean f3370k;

        /* renamed from: l */
        boolean f3371l;

        /* renamed from: m */
        Rect f3372m;

        /* renamed from: n */
        boolean f3373n;

        /* renamed from: o */
        boolean f3374o;

        /* renamed from: p */
        int f3375p;

        /* renamed from: q */
        int f3376q;

        /* renamed from: r */
        int f3377r;

        /* renamed from: s */
        int f3378s;

        /* renamed from: t */
        boolean f3379t;

        /* renamed from: u */
        int f3380u;

        /* renamed from: v */
        boolean f3381v;

        /* renamed from: w */
        boolean f3382w;

        /* renamed from: x */
        boolean f3383x;

        /* renamed from: y */
        boolean f3384y;

        /* renamed from: z */
        boolean f3385z;

        C0797b(C0797b bVar, C0794q qVar, Resources resources) {
            this.f3370k = false;
            this.f3373n = false;
            this.f3385z = true;
            this.f3353C = 0;
            this.f3354D = 0;
            this.f3362c = qVar;
            Resources resources2 = resources != null ? resources : bVar != null ? bVar.f3363d : null;
            this.f3363d = resources2;
            this.f3364e = C0794q.m2636a(resources, bVar != null ? bVar.f3364e : 0);
            if (bVar != null) {
                this.f3365f = bVar.f3365f;
                this.f3366g = bVar.f3366g;
                this.f3383x = true;
                this.f3384y = true;
                this.f3370k = bVar.f3370k;
                this.f3373n = bVar.f3373n;
                this.f3385z = bVar.f3385z;
                this.f3351A = bVar.f3351A;
                this.f3352B = bVar.f3352B;
                this.f3353C = bVar.f3353C;
                this.f3354D = bVar.f3354D;
                this.f3355E = bVar.f3355E;
                this.f3356F = bVar.f3356F;
                this.f3357G = bVar.f3357G;
                this.f3358H = bVar.f3358H;
                this.f3359I = bVar.f3359I;
                this.f3360J = bVar.f3360J;
                this.f3361K = bVar.f3361K;
                if (bVar.f3364e == this.f3364e) {
                    if (bVar.f3371l) {
                        this.f3372m = new Rect(bVar.f3372m);
                        this.f3371l = true;
                    }
                    if (bVar.f3374o) {
                        this.f3375p = bVar.f3375p;
                        this.f3376q = bVar.f3376q;
                        this.f3377r = bVar.f3377r;
                        this.f3378s = bVar.f3378s;
                        this.f3374o = true;
                    }
                }
                if (bVar.f3379t) {
                    this.f3380u = bVar.f3380u;
                    this.f3379t = true;
                }
                if (bVar.f3381v) {
                    this.f3382w = bVar.f3382w;
                    this.f3381v = true;
                }
                Drawable[] drawableArr = bVar.f3368i;
                this.f3368i = new Drawable[drawableArr.length];
                this.f3369j = bVar.f3369j;
                SparseArray<ConstantState> sparseArray = bVar.f3367h;
                this.f3367h = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f3369j);
                int i = this.f3369j;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f3367h.put(i2, constantState);
                        } else {
                            this.f3368i[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f3368i = new Drawable[10];
            this.f3369j = 0;
        }

        /* renamed from: b */
        private Drawable m2643b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f3352B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f3362c);
            return mutate;
        }

        /* renamed from: a */
        public final int mo2765a(Drawable drawable) {
            int i = this.f3369j;
            if (i >= this.f3368i.length) {
                mo2769b(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f3362c);
            this.f3368i[i] = drawable;
            this.f3369j++;
            this.f3366g = drawable.getChangingConfigurations() | this.f3366g;
            mo2768b();
            this.f3372m = null;
            this.f3371l = false;
            this.f3374o = false;
            this.f3383x = false;
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2750a() {
            int i = this.f3369j;
            Drawable[] drawableArr = this.f3368i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f3351A = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2766a(Resources resources) {
            if (resources != null) {
                this.f3363d = resources;
                int a = C0794q.m2636a(resources, this.f3364e);
                int i = this.f3364e;
                this.f3364e = a;
                if (i != a) {
                    this.f3374o = false;
                    this.f3371l = false;
                }
            }
        }

        /* renamed from: b */
        public final Drawable mo2767b(int i) {
            Drawable drawable = this.f3368i[i];
            if (drawable != null) {
                return drawable;
            }
            if (this.f3367h != null) {
                int indexOfKey = this.f3367h.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m2643b(((ConstantState) this.f3367h.valueAt(indexOfKey)).newDrawable(this.f3363d));
                    this.f3368i[i] = b;
                    this.f3367h.removeAt(indexOfKey);
                    if (this.f3367h.size() == 0) {
                        this.f3367h = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo2768b() {
            this.f3379t = false;
            this.f3381v = false;
        }

        /* renamed from: b */
        public void mo2769b(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f3368i, 0, drawableArr, 0, i);
            this.f3368i = drawableArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo2770c() {
            if (this.f3367h != null) {
                int size = this.f3367h.size();
                for (int i = 0; i < size; i++) {
                    this.f3368i[this.f3367h.keyAt(i)] = m2643b(((ConstantState) this.f3367h.valueAt(i)).newDrawable(this.f3363d));
                }
                this.f3367h = null;
            }
        }

        public boolean canApplyTheme() {
            int i = this.f3369j;
            Drawable[] drawableArr = this.f3368i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f3367h.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo2772d() {
            this.f3374o = true;
            mo2770c();
            int i = this.f3369j;
            Drawable[] drawableArr = this.f3368i;
            this.f3376q = -1;
            this.f3375p = -1;
            this.f3378s = 0;
            this.f3377r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f3375p) {
                    this.f3375p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f3376q) {
                    this.f3376q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f3377r) {
                    this.f3377r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f3378s) {
                    this.f3378s = minimumHeight;
                }
            }
        }

        /* renamed from: e */
        public final synchronized boolean mo2773e() {
            if (this.f3383x) {
                return this.f3384y;
            }
            mo2770c();
            this.f3383x = true;
            int i = this.f3369j;
            Drawable[] drawableArr = this.f3368i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f3384y = false;
                    return false;
                }
            }
            this.f3384y = true;
            return true;
        }

        public int getChangingConfigurations() {
            return this.f3365f | this.f3366g;
        }
    }

    C0794q() {
    }

    /* renamed from: a */
    static int m2636a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    private void m2637a(Drawable drawable) {
        if (this.f3348m == null) {
            this.f3348m = new C0796a();
        }
        C0796a aVar = this.f3348m;
        aVar.f3350a = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.f3336a.f3353C <= 0 && this.f3342g) {
                drawable.setAlpha(this.f3341f);
            }
            if (this.f3336a.f3357G) {
                drawable.setColorFilter(this.f3336a.f3356F);
            } else {
                if (this.f3336a.f3360J) {
                    C0345fn.m1147a(drawable, this.f3336a.f3358H);
                }
                if (this.f3336a.f3361K) {
                    C0345fn.m1150a(drawable, this.f3336a.f3359I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3336a.f3385z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f3336a.f3355E);
            }
            Rect rect = this.f3338c;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f3348m.mo2761a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2710a(C0797b bVar) {
        this.f3336a = bVar;
        if (this.f3337b >= 0) {
            this.f3339d = bVar.mo2767b(this.f3337b);
            if (this.f3339d != null) {
                m2637a(this.f3339d);
            }
        }
        this.f3343h = -1;
        this.f3340e = null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2756a(boolean r12) {
        /*
            r11 = this;
            r0 = 1
            r11.f3342g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r11.f3339d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x003c
            long r9 = r11.f3346k
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x003e
            long r9 = r11.f3346k
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0024
            android.graphics.drawable.Drawable r3 = r11.f3339d
            int r9 = r11.f3341f
            r3.setAlpha(r9)
            goto L_0x003c
        L_0x0024:
            long r9 = r11.f3346k
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            q$b r9 = r11.f3336a
            int r9 = r9.f3353C
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r11.f3339d
            int r3 = 255 - r3
            int r10 = r11.f3341f
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = r0
            goto L_0x003f
        L_0x003c:
            r11.f3346k = r7
        L_0x003e:
            r3 = r6
        L_0x003f:
            android.graphics.drawable.Drawable r9 = r11.f3340e
            if (r9 == 0) goto L_0x0070
            long r9 = r11.f3347l
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0072
            long r9 = r11.f3347l
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 > 0) goto L_0x005b
            android.graphics.drawable.Drawable r0 = r11.f3340e
            r0.setVisible(r6, r6)
            r0 = 0
            r11.f3340e = r0
            r0 = -1
            r11.f3343h = r0
            goto L_0x0070
        L_0x005b:
            long r6 = r11.f3347l
            long r6 = r6 - r1
            long r6 = r6 * r4
            int r3 = (int) r6
            q$b r4 = r11.f3336a
            int r4 = r4.f3354D
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r11.f3340e
            int r5 = r11.f3341f
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x0073
        L_0x0070:
            r11.f3347l = r7
        L_0x0072:
            r0 = r3
        L_0x0073:
            if (r12 == 0) goto L_0x007f
            if (r0 == 0) goto L_0x007f
            java.lang.Runnable r12 = r11.f3345j
            r3 = 16
            long r1 = r1 + r3
            r11.scheduleSelf(r12, r1)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0794q.mo2756a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2757a(int i) {
        if (i == this.f3337b) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f3336a.f3354D > 0) {
            if (this.f3340e != null) {
                this.f3340e.setVisible(false, false);
            }
            if (this.f3339d != null) {
                this.f3340e = this.f3339d;
                this.f3343h = this.f3337b;
                this.f3347l = ((long) this.f3336a.f3354D) + uptimeMillis;
            } else {
                this.f3340e = null;
                this.f3343h = -1;
                this.f3347l = 0;
            }
        } else if (this.f3339d != null) {
            this.f3339d.setVisible(false, false);
        }
        if (i < 0 || i >= this.f3336a.f3369j) {
            this.f3339d = null;
            this.f3337b = -1;
        } else {
            Drawable b = this.f3336a.mo2767b(i);
            this.f3339d = b;
            this.f3337b = i;
            if (b != null) {
                if (this.f3336a.f3353C > 0) {
                    this.f3346k = uptimeMillis + ((long) this.f3336a.f3353C);
                }
                m2637a(b);
            }
        }
        if (!(this.f3346k == 0 && this.f3347l == 0)) {
            if (this.f3345j == null) {
                this.f3345j = new Runnable() {
                    public final void run() {
                        C0794q.this.mo2756a(true);
                        C0794q.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(this.f3345j);
            }
            mo2756a(true);
        }
        invalidateSelf();
        return true;
    }

    public void applyTheme(Theme theme) {
        C0797b bVar = this.f3336a;
        if (theme != null) {
            bVar.mo2770c();
            int i = bVar.f3369j;
            Drawable[] drawableArr = bVar.f3368i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    bVar.f3366g |= drawableArr[i2].getChangingConfigurations();
                }
            }
            bVar.mo2766a(theme.getResources());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0797b mo2712b() {
        return this.f3336a;
    }

    public boolean canApplyTheme() {
        return this.f3336a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        if (this.f3339d != null) {
            this.f3339d.draw(canvas);
        }
        if (this.f3340e != null) {
            this.f3340e.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f3341f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3336a.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        if (!this.f3336a.mo2773e()) {
            return null;
        }
        this.f3336a.f3365f = getChangingConfigurations();
        return this.f3336a;
    }

    public Drawable getCurrent() {
        return this.f3339d;
    }

    public void getHotspotBounds(Rect rect) {
        if (this.f3338c != null) {
            rect.set(this.f3338c);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f3336a.f3373n) {
            C0797b bVar = this.f3336a;
            if (!bVar.f3374o) {
                bVar.mo2772d();
            }
            return bVar.f3376q;
        } else if (this.f3339d != null) {
            return this.f3339d.getIntrinsicHeight();
        } else {
            return -1;
        }
    }

    public int getIntrinsicWidth() {
        if (this.f3336a.f3373n) {
            C0797b bVar = this.f3336a;
            if (!bVar.f3374o) {
                bVar.mo2772d();
            }
            return bVar.f3375p;
        } else if (this.f3339d != null) {
            return this.f3339d.getIntrinsicWidth();
        } else {
            return -1;
        }
    }

    public int getMinimumHeight() {
        if (this.f3336a.f3373n) {
            C0797b bVar = this.f3336a;
            if (!bVar.f3374o) {
                bVar.mo2772d();
            }
            return bVar.f3378s;
        } else if (this.f3339d != null) {
            return this.f3339d.getMinimumHeight();
        } else {
            return 0;
        }
    }

    public int getMinimumWidth() {
        if (this.f3336a.f3373n) {
            C0797b bVar = this.f3336a;
            if (!bVar.f3374o) {
                bVar.mo2772d();
            }
            return bVar.f3377r;
        } else if (this.f3339d != null) {
            return this.f3339d.getMinimumWidth();
        } else {
            return 0;
        }
    }

    public int getOpacity() {
        int i = -2;
        if (this.f3339d == null || !this.f3339d.isVisible()) {
            return -2;
        }
        C0797b bVar = this.f3336a;
        if (bVar.f3379t) {
            return bVar.f3380u;
        }
        bVar.mo2770c();
        int i2 = bVar.f3369j;
        Drawable[] drawableArr = bVar.f3368i;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        int i3 = i;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 = Drawable.resolveOpacity(i3, drawableArr[i4].getOpacity());
        }
        bVar.f3380u = i3;
        bVar.f3379t = true;
        return i3;
    }

    public void getOutline(Outline outline) {
        if (this.f3339d != null) {
            this.f3339d.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        C0797b bVar = this.f3336a;
        Rect rect2 = null;
        boolean z2 = true;
        if (!bVar.f3370k) {
            if (bVar.f3372m != null || bVar.f3371l) {
                rect2 = bVar.f3372m;
            } else {
                bVar.mo2770c();
                Rect rect3 = new Rect();
                int i = bVar.f3369j;
                Drawable[] drawableArr = bVar.f3368i;
                Rect rect4 = null;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect4 == null) {
                            rect4 = new Rect(0, 0, 0, 0);
                        }
                        if (rect3.left > rect4.left) {
                            rect4.left = rect3.left;
                        }
                        if (rect3.top > rect4.top) {
                            rect4.top = rect3.top;
                        }
                        if (rect3.right > rect4.right) {
                            rect4.right = rect3.right;
                        }
                        if (rect3.bottom > rect4.bottom) {
                            rect4.bottom = rect3.bottom;
                        }
                    }
                }
                bVar.f3371l = true;
                bVar.f3372m = rect4;
                rect2 = rect4;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            z = this.f3339d != null ? this.f3339d.getPadding(rect) : super.getPadding(rect);
        }
        if (!isAutoMirrored() || getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2) {
            int i3 = rect.left;
            rect.left = rect.right;
            rect.right = i3;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f3336a != null) {
            this.f3336a.mo2768b();
        }
        if (drawable == this.f3339d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f3336a.f3355E;
    }

    public boolean isStateful() {
        C0797b bVar = this.f3336a;
        if (bVar.f3381v) {
            return bVar.f3382w;
        }
        bVar.mo2770c();
        int i = bVar.f3369j;
        Drawable[] drawableArr = bVar.f3368i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        bVar.f3382w = z;
        bVar.f3381v = true;
        return z;
    }

    public void jumpToCurrentState() {
        boolean z;
        if (this.f3340e != null) {
            this.f3340e.jumpToCurrentState();
            this.f3340e = null;
            this.f3343h = -1;
            z = true;
        } else {
            z = false;
        }
        if (this.f3339d != null) {
            this.f3339d.jumpToCurrentState();
            if (this.f3342g) {
                this.f3339d.setAlpha(this.f3341f);
            }
        }
        if (this.f3347l != 0) {
            this.f3347l = 0;
            z = true;
        }
        if (this.f3346k != 0) {
            this.f3346k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f3344i && super.mutate() == this) {
            C0797b b = mo2712b();
            b.mo2750a();
            mo2710a(b);
            this.f3344i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f3340e != null) {
            this.f3340e.setBounds(rect);
        }
        if (this.f3339d != null) {
            this.f3339d.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        C0797b bVar = this.f3336a;
        int i2 = this.f3337b;
        int i3 = bVar.f3369j;
        Drawable[] drawableArr = bVar.f3368i;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        bVar.f3352B = i;
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable;
        if (this.f3340e != null) {
            drawable = this.f3340e;
        } else if (this.f3339d == null) {
            return false;
        } else {
            drawable = this.f3339d;
        }
        return drawable.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable;
        if (this.f3340e != null) {
            drawable = this.f3340e;
        } else if (this.f3339d == null) {
            return false;
        } else {
            drawable = this.f3339d;
        }
        return drawable.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f3339d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f3342g || this.f3341f != i) {
            this.f3342g = true;
            this.f3341f = i;
            if (this.f3339d != null) {
                if (this.f3346k == 0) {
                    this.f3339d.setAlpha(i);
                    return;
                }
                mo2756a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f3336a.f3355E != z) {
            this.f3336a.f3355E = z;
            if (this.f3339d != null) {
                C0345fn.m1151a(this.f3339d, this.f3336a.f3355E);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3336a.f3357G = true;
        if (this.f3336a.f3356F != colorFilter) {
            this.f3336a.f3356F = colorFilter;
            if (this.f3339d != null) {
                this.f3339d.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.f3336a.f3385z != z) {
            this.f3336a.f3385z = z;
            if (this.f3339d != null) {
                this.f3339d.setDither(this.f3336a.f3385z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f3339d != null) {
            C0345fn.m1144a(this.f3339d, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f3338c == null) {
            this.f3338c = new Rect(i, i2, i3, i4);
        } else {
            this.f3338c.set(i, i2, i3, i4);
        }
        if (this.f3339d != null) {
            C0345fn.m1146a(this.f3339d, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3336a.f3360J = true;
        if (this.f3336a.f3358H != colorStateList) {
            this.f3336a.f3358H = colorStateList;
            C0345fn.m1147a(this.f3339d, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        this.f3336a.f3361K = true;
        if (this.f3336a.f3359I != mode) {
            this.f3336a.f3359I = mode;
            C0345fn.m1150a(this.f3339d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f3340e != null) {
            this.f3340e.setVisible(z, z2);
        }
        if (this.f3339d != null) {
            this.f3339d.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f3339d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
