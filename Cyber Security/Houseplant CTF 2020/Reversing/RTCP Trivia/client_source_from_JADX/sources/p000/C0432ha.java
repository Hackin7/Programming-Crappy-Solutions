package p000;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: ha */
public abstract class C0432ha implements OnTouchListener {

    /* renamed from: r */
    private static final int f1849r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C0433a f1850a = new C0433a();

    /* renamed from: b */
    final View f1851b;

    /* renamed from: c */
    boolean f1852c;

    /* renamed from: d */
    boolean f1853d;

    /* renamed from: e */
    boolean f1854e;

    /* renamed from: f */
    private final Interpolator f1855f = new AccelerateInterpolator();

    /* renamed from: g */
    private Runnable f1856g;

    /* renamed from: h */
    private float[] f1857h = {0.0f, 0.0f};

    /* renamed from: i */
    private float[] f1858i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private int f1859j;

    /* renamed from: k */
    private int f1860k;

    /* renamed from: l */
    private float[] f1861l = {0.0f, 0.0f};

    /* renamed from: m */
    private float[] f1862m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f1863n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f1864o;

    /* renamed from: p */
    private boolean f1865p;

    /* renamed from: q */
    private boolean f1866q;

    /* renamed from: ha$a */
    static class C0433a {

        /* renamed from: a */
        int f1867a;

        /* renamed from: b */
        int f1868b;

        /* renamed from: c */
        float f1869c;

        /* renamed from: d */
        float f1870d;

        /* renamed from: e */
        long f1871e = Long.MIN_VALUE;

        /* renamed from: f */
        long f1872f = 0;

        /* renamed from: g */
        int f1873g = 0;

        /* renamed from: h */
        int f1874h = 0;

        /* renamed from: i */
        long f1875i = -1;

        /* renamed from: j */
        float f1876j;

        /* renamed from: k */
        int f1877k;

        C0433a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final float mo1877a(long j) {
            if (j < this.f1871e) {
                return 0.0f;
            }
            if (this.f1875i < 0 || j < this.f1875i) {
                return 0.5f * C0432ha.m1376a(((float) (j - this.f1871e)) / ((float) this.f1867a), 0.0f, 1.0f);
            }
            return (1.0f - this.f1876j) + (this.f1876j * C0432ha.m1376a(((float) (j - this.f1875i)) / ((float) this.f1877k), 0.0f, 1.0f));
        }
    }

    /* renamed from: ha$b */
    class C0434b implements Runnable {
        C0434b() {
        }

        public final void run() {
            if (C0432ha.this.f1854e) {
                if (C0432ha.this.f1852c) {
                    C0432ha.this.f1852c = false;
                    C0433a aVar = C0432ha.this.f1850a;
                    aVar.f1871e = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f1875i = -1;
                    aVar.f1872f = aVar.f1871e;
                    aVar.f1876j = 0.5f;
                    aVar.f1873g = 0;
                    aVar.f1874h = 0;
                }
                C0433a aVar2 = C0432ha.this.f1850a;
                if ((aVar2.f1875i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f1875i + ((long) aVar2.f1877k)) || !C0432ha.this.mo1874a()) {
                    C0432ha.this.f1854e = false;
                    return;
                }
                if (C0432ha.this.f1853d) {
                    C0432ha.this.f1853d = false;
                    C0432ha haVar = C0432ha.this;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    haVar.f1851b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f1872f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = aVar2.mo1877a(currentAnimationTimeMillis);
                float f = (-4.0f * a * a) + (4.0f * a);
                long j = currentAnimationTimeMillis - aVar2.f1872f;
                aVar2.f1872f = currentAnimationTimeMillis;
                float f2 = ((float) j) * f;
                aVar2.f1873g = (int) (aVar2.f1869c * f2);
                aVar2.f1874h = (int) (f2 * aVar2.f1870d);
                C0432ha.this.mo1873a(aVar2.f1874h);
                C0396gq.m1260a(C0432ha.this.f1851b, (Runnable) this);
            }
        }
    }

    public C0432ha(View view) {
        this.f1851b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((315.0f * displayMetrics.density) + 0.5f);
        float f = ((float) i) / 1000.0f;
        this.f1863n[0] = f;
        this.f1863n[1] = f;
        float f2 = ((float) i2) / 1000.0f;
        this.f1862m[0] = f2;
        this.f1862m[1] = f2;
        this.f1859j = 1;
        this.f1858i[0] = Float.MAX_VALUE;
        this.f1858i[1] = Float.MAX_VALUE;
        this.f1857h[0] = 0.2f;
        this.f1857h[1] = 0.2f;
        this.f1861l[0] = 0.001f;
        this.f1861l[1] = 0.001f;
        this.f1860k = f1849r;
        this.f1850a.f1867a = 500;
        this.f1850a.f1868b = 500;
    }

    /* renamed from: a */
    private float m1375a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f1859j) {
            case 0:
            case 1:
                if (f < f2) {
                    return f >= 0.0f ? 1.0f - (f / f2) : (!this.f1854e || this.f1859j != 1) ? 0.0f : 1.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
            default:
                return 0.0f;
        }
    }

    /* renamed from: a */
    static float m1376a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float m1377a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1857h
            r0 = r0[r4]
            float[] r1 = r3.f1858i
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m1376a(r0, r2, r1)
            float r1 = r3.m1375a(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m1375a(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            android.view.animation.Interpolator r6 = r3.f1855f
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002f
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0038
            android.view.animation.Interpolator r6 = r3.f1855f
            float r5 = r6.getInterpolation(r5)
        L_0x002f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m1376a(r5, r6, r0)
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.f1861l
            r0 = r0[r4]
            float[] r1 = r3.f1862m
            r1 = r1[r4]
            float[] r2 = r3.f1863n
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0053
            float r5 = r5 * r0
            float r4 = m1376a(r5, r1, r4)
            return r4
        L_0x0053:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m1376a(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0432ha.m1377a(int, float, float, float):float");
    }

    /* renamed from: b */
    private void m1378b() {
        int i = 0;
        if (this.f1852c) {
            this.f1854e = false;
            return;
        }
        C0433a aVar = this.f1850a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f1871e);
        int i3 = aVar.f1868b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f1877k = i;
        aVar.f1876j = aVar.mo1877a(currentAnimationTimeMillis);
        aVar.f1875i = currentAnimationTimeMillis;
    }

    /* renamed from: a */
    public final C0432ha mo1872a(boolean z) {
        if (this.f1865p && !z) {
            m1378b();
        }
        this.f1865p = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo1873a(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1874a() {
        C0433a aVar = this.f1850a;
        int abs = (int) (aVar.f1870d / Math.abs(aVar.f1870d));
        int abs2 = (int) (aVar.f1869c / Math.abs(aVar.f1869c));
        return abs != 0 && mo1875b(abs);
    }

    /* renamed from: b */
    public abstract boolean mo1875b(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f1865p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1853d = true;
                this.f1864o = false;
                break;
            case 1:
            case 3:
                m1378b();
                break;
            case 2:
                break;
        }
        float a = m1377a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1851b.getWidth());
        float a2 = m1377a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1851b.getHeight());
        C0433a aVar = this.f1850a;
        aVar.f1869c = a;
        aVar.f1870d = a2;
        if (!this.f1854e && mo1874a()) {
            if (this.f1856g == null) {
                this.f1856g = new C0434b();
            }
            this.f1854e = true;
            this.f1852c = true;
            if (this.f1864o || this.f1860k <= 0) {
                this.f1856g.run();
            } else {
                C0396gq.m1261a(this.f1851b, this.f1856g, (long) this.f1860k);
            }
            this.f1864o = true;
        }
        return this.f1866q && this.f1854e;
    }
}
