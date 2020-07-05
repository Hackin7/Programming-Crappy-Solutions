package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: ce */
public abstract class C0187ce implements OnAttachStateChangeListener, OnTouchListener {

    /* renamed from: a */
    private final float f943a;

    /* renamed from: b */
    private final int f944b;

    /* renamed from: c */
    final View f945c;

    /* renamed from: d */
    boolean f946d;

    /* renamed from: e */
    private final int f947e;

    /* renamed from: f */
    private Runnable f948f;

    /* renamed from: g */
    private Runnable f949g;

    /* renamed from: h */
    private int f950h;

    /* renamed from: i */
    private final int[] f951i = new int[2];

    /* renamed from: ce$a */
    class C0188a implements Runnable {
        C0188a() {
        }

        public final void run() {
            ViewParent parent = C0187ce.this.f945c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: ce$b */
    class C0189b implements Runnable {
        C0189b() {
        }

        public final void run() {
            C0187ce ceVar = C0187ce.this;
            ceVar.mo1177d();
            View view = ceVar.f945c;
            if (view.isEnabled() && !view.isLongClickable() && ceVar.mo360b()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                ceVar.f946d = true;
            }
        }
    }

    public C0187ce(View view) {
        this.f945c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f943a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f944b = ViewConfiguration.getTapTimeout();
        this.f947e = (this.f944b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    public abstract C0107au mo359a();

    /* renamed from: b */
    public boolean mo360b() {
        C0107au a = mo359a();
        if (a != null && !a.mo117d()) {
            a.mo111b();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo894c() {
        C0107au a = mo359a();
        if (a != null && a.mo117d()) {
            a.mo114c();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1177d() {
        if (this.f949g != null) {
            this.f945c.removeCallbacks(this.f949g);
        }
        if (this.f948f != null) {
            this.f945c.removeCallbacks(this.f948f);
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r11 = r10.f946d
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0071
            android.view.View r2 = r10.f945c
            au r3 = r10.mo359a()
            if (r3 == 0) goto L_0x0061
            boolean r4 = r3.mo117d()
            if (r4 != 0) goto L_0x0015
            goto L_0x0061
        L_0x0015:
            android.widget.ListView r3 = r3.mo118e()
            cc r3 = (p000.C0182cc) r3
            if (r3 == 0) goto L_0x0061
            boolean r4 = r3.isShown()
            if (r4 != 0) goto L_0x0024
            goto L_0x0061
        L_0x0024:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtainNoHistory(r12)
            int[] r5 = r10.f951i
            r2.getLocationOnScreen(r5)
            r2 = r5[r1]
            float r2 = (float) r2
            r5 = r5[r0]
            float r5 = (float) r5
            r4.offsetLocation(r2, r5)
            int[] r2 = r10.f951i
            r3.getLocationOnScreen(r2)
            r5 = r2[r1]
            int r5 = -r5
            float r5 = (float) r5
            r2 = r2[r0]
            int r2 = -r2
            float r2 = (float) r2
            r4.offsetLocation(r5, r2)
            int r2 = r10.f950h
            boolean r2 = r3.mo1158a(r4, r2)
            r4.recycle()
            int r12 = r12.getActionMasked()
            if (r12 == r0) goto L_0x005a
            r3 = 3
            if (r12 == r3) goto L_0x005a
            r12 = r0
            goto L_0x005b
        L_0x005a:
            r12 = r1
        L_0x005b:
            if (r2 == 0) goto L_0x0061
            if (r12 == 0) goto L_0x0061
            r12 = r0
            goto L_0x0062
        L_0x0061:
            r12 = r1
        L_0x0062:
            if (r12 != 0) goto L_0x006e
            boolean r12 = r10.mo894c()
            if (r12 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r12 = r1
            goto L_0x011f
        L_0x006e:
            r12 = r0
            goto L_0x011f
        L_0x0071:
            android.view.View r2 = r10.f945c
            boolean r3 = r2.isEnabled()
            if (r3 == 0) goto L_0x00fc
            int r3 = r12.getActionMasked()
            switch(r3) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00cc;
                case 2: goto L_0x0082;
                case 3: goto L_0x00cc;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00fc
        L_0x0082:
            int r3 = r10.f950h
            int r3 = r12.findPointerIndex(r3)
            if (r3 < 0) goto L_0x00fc
            float r4 = r12.getX(r3)
            float r12 = r12.getY(r3)
            float r3 = r10.f943a
            float r5 = -r3
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00bd
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00bd
            int r5 = r2.getRight()
            int r6 = r2.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r3
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bd
            int r4 = r2.getBottom()
            int r5 = r2.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r3
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x00bd
            r12 = r0
            goto L_0x00be
        L_0x00bd:
            r12 = r1
        L_0x00be:
            if (r12 != 0) goto L_0x00fc
            r10.mo1177d()
            android.view.ViewParent r12 = r2.getParent()
            r12.requestDisallowInterceptTouchEvent(r0)
            r12 = r0
            goto L_0x00fd
        L_0x00cc:
            r10.mo1177d()
            goto L_0x00fc
        L_0x00d0:
            int r12 = r12.getPointerId(r1)
            r10.f950h = r12
            java.lang.Runnable r12 = r10.f948f
            if (r12 != 0) goto L_0x00e1
            ce$a r12 = new ce$a
            r12.<init>()
            r10.f948f = r12
        L_0x00e1:
            java.lang.Runnable r12 = r10.f948f
            int r3 = r10.f944b
            long r3 = (long) r3
            r2.postDelayed(r12, r3)
            java.lang.Runnable r12 = r10.f949g
            if (r12 != 0) goto L_0x00f4
            ce$b r12 = new ce$b
            r12.<init>()
            r10.f949g = r12
        L_0x00f4:
            java.lang.Runnable r12 = r10.f949g
            int r3 = r10.f947e
            long r3 = (long) r3
            r2.postDelayed(r12, r3)
        L_0x00fc:
            r12 = r1
        L_0x00fd:
            if (r12 == 0) goto L_0x0107
            boolean r12 = r10.mo360b()
            if (r12 == 0) goto L_0x0107
            r12 = r0
            goto L_0x0108
        L_0x0107:
            r12 = r1
        L_0x0108:
            if (r12 == 0) goto L_0x011f
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r3 = r10.f945c
            r3.onTouchEvent(r2)
            r2.recycle()
        L_0x011f:
            r10.f946d = r12
            if (r12 != 0) goto L_0x0127
            if (r11 == 0) goto L_0x0126
            return r0
        L_0x0126:
            return r1
        L_0x0127:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0187ce.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f946d = false;
        this.f950h = -1;
        if (this.f948f != null) {
            this.f945c.removeCallbacks(this.f948f);
        }
    }
}
