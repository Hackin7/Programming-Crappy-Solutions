package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: hv */
final class C0472hv extends C0471hu implements Factory2 {

    /* renamed from: F */
    static final Interpolator f2042F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f2043G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f2044H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f2045I = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f2046a = false;

    /* renamed from: q */
    static Field f2047q;

    /* renamed from: A */
    Bundle f2048A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f2049B = null;

    /* renamed from: C */
    ArrayList<C0486h> f2050C;

    /* renamed from: D */
    C0487hw f2051D;

    /* renamed from: E */
    Runnable f2052E = new Runnable() {
        public final void run() {
            C0472hv.this.mo2024d();
        }
    };

    /* renamed from: J */
    private final CopyOnWriteArrayList<Object> f2053J = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<C0485g> f2054b;

    /* renamed from: c */
    boolean f2055c;

    /* renamed from: d */
    int f2056d = 0;

    /* renamed from: e */
    final ArrayList<C0457hp> f2057e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<C0457hp> f2058f;

    /* renamed from: g */
    ArrayList<C0453hn> f2059g;

    /* renamed from: h */
    ArrayList<C0457hp> f2060h;

    /* renamed from: i */
    ArrayList<C0453hn> f2061i;

    /* renamed from: j */
    ArrayList<Integer> f2062j;

    /* renamed from: k */
    ArrayList<Object> f2063k;

    /* renamed from: l */
    int f2064l = 0;

    /* renamed from: m */
    C0470ht f2065m;

    /* renamed from: n */
    C0468hr f2066n;

    /* renamed from: o */
    C0457hp f2067o;

    /* renamed from: p */
    C0457hp f2068p;

    /* renamed from: r */
    boolean f2069r;

    /* renamed from: s */
    boolean f2070s;

    /* renamed from: t */
    boolean f2071t;

    /* renamed from: u */
    boolean f2072u;

    /* renamed from: v */
    String f2073v;

    /* renamed from: w */
    boolean f2074w;

    /* renamed from: x */
    ArrayList<C0453hn> f2075x;

    /* renamed from: y */
    ArrayList<Boolean> f2076y;

    /* renamed from: z */
    ArrayList<C0457hp> f2077z;

    /* renamed from: hv$a */
    static class C0478a extends C0480b {

        /* renamed from: a */
        View f2091a;

        C0478a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f2091a = view;
        }

        public final void onAnimationEnd(Animation animation) {
            if (C0396gq.m1276m(this.f2091a) || VERSION.SDK_INT >= 24) {
                this.f2091a.post(new Runnable() {
                    public final void run() {
                        C0478a.this.f2091a.setLayerType(0, null);
                    }
                });
            } else {
                this.f2091a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: hv$b */
    static class C0480b implements AnimationListener {

        /* renamed from: a */
        private final AnimationListener f2093a;

        C0480b(AnimationListener animationListener) {
            this.f2093a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f2093a != null) {
                this.f2093a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f2093a != null) {
                this.f2093a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f2093a != null) {
                this.f2093a.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: hv$c */
    static class C0481c {

        /* renamed from: a */
        public final Animation f2094a;

        /* renamed from: b */
        public final Animator f2095b;

        C0481c(Animator animator) {
            this.f2094a = null;
            this.f2095b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0481c(Animation animation) {
            this.f2094a = animation;
            this.f2095b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: hv$d */
    static class C0482d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f2096a;

        C0482d(View view) {
            this.f2096a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f2096a.setLayerType(0, null);
            animator.removeListener(this);
        }

        public final void onAnimationStart(Animator animator) {
            this.f2096a.setLayerType(2, null);
        }
    }

    /* renamed from: hv$e */
    static class C0483e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f2097a;

        /* renamed from: b */
        private final View f2098b;

        /* renamed from: c */
        private boolean f2099c;

        /* renamed from: d */
        private boolean f2100d;

        C0483e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2097a = viewGroup;
            this.f2098b = view;
            addAnimation(animation);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            if (this.f2099c) {
                return !this.f2100d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2099c = true;
                C0510id.m1670a(this.f2097a, this);
            }
            return true;
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.f2099c) {
                return !this.f2100d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2099c = true;
                C0510id.m1670a(this.f2097a, this);
            }
            return true;
        }

        public final void run() {
            this.f2097a.endViewTransition(this.f2098b);
            this.f2100d = true;
        }
    }

    /* renamed from: hv$f */
    static class C0484f {

        /* renamed from: a */
        public static final int[] f2101a = {16842755, 16842960, 16842961};
    }

    /* renamed from: hv$g */
    interface C0485g {
        /* renamed from: a */
        boolean mo1909a(ArrayList<C0453hn> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: hv$h */
    static class C0486h implements C0463c {

        /* renamed from: a */
        final boolean f2102a;

        /* renamed from: b */
        final C0453hn f2103b;

        /* renamed from: c */
        int f2104c;

        C0486h(C0453hn hnVar, boolean z) {
            this.f2102a = z;
            this.f2103b = hnVar;
        }

        /* renamed from: a */
        public final void mo1968a() {
            boolean z = true;
            this.f2104c--;
            if (this.f2104c == 0) {
                C0472hv hvVar = this.f2103b.f1910a;
                synchronized (hvVar) {
                    boolean z2 = hvVar.f2050C != null && !hvVar.f2050C.isEmpty();
                    if (hvVar.f2054b == null || hvVar.f2054b.size() != 1) {
                        z = false;
                    }
                    if (z2 || z) {
                        hvVar.f2065m.f2040d.removeCallbacks(hvVar.f2052E);
                        hvVar.f2065m.f2040d.post(hvVar.f2052E);
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo1969b() {
            this.f2104c++;
        }

        /* renamed from: c */
        public final void mo2053c() {
            boolean z = this.f2104c > 0;
            C0472hv hvVar = this.f2103b.f1910a;
            int size = hvVar.f2057e.size();
            for (int i = 0; i < size; i++) {
                C0457hp hpVar = (C0457hp) hvVar.f2057e.get(i);
                hpVar.mo1937a((C0463c) null);
                if (z && hpVar.mo1928J()) {
                    if (hpVar.f1991s == null || hpVar.f1991s.f2065m == null) {
                        hpVar.mo1919A().f2018q = false;
                    } else if (Looper.myLooper() != hpVar.f1991s.f2065m.f2040d.getLooper()) {
                        hpVar.f1991s.f2065m.f2040d.postAtFrontOfQueue(new Runnable() {
                            public final void run() {
                                C0457hp.this.mo1959v();
                            }
                        });
                    } else {
                        hpVar.mo1959v();
                    }
                }
            }
            this.f2103b.f1910a.mo2010a(this.f2103b, this.f2102a, !z, true);
        }

        /* renamed from: d */
        public final void mo2054d() {
            this.f2103b.f1910a.mo2010a(this.f2103b, this.f2102a, false, false);
        }
    }

    C0472hv() {
    }

    /* renamed from: a */
    private int m1517a(ArrayList<C0453hn> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0245df<C0457hp> dfVar) {
        boolean z;
        boolean z2;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0453hn hnVar = (C0453hn) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            int i5 = 0;
            while (true) {
                z = true;
                if (i5 >= hnVar.f1911b.size()) {
                    z2 = false;
                    break;
                } else if (C0453hn.m1412a((C0454a) hnVar.f1911b.get(i5))) {
                    z2 = true;
                    break;
                } else {
                    i5++;
                }
            }
            if (!z2 || hnVar.mo1908a(arrayList, i4 + 1, i2)) {
                z = false;
            }
            if (z) {
                if (this.f2050C == null) {
                    this.f2050C = new ArrayList<>();
                }
                C0486h hVar = new C0486h(hnVar, booleanValue);
                this.f2050C.add(hVar);
                hnVar.mo1904a((C0463c) hVar);
                if (booleanValue) {
                    hnVar.mo1911b();
                } else {
                    hnVar.mo1907a(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, hnVar);
                }
                m1536b(dfVar);
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static AnimationListener m1518a(Animation animation) {
        String str;
        String str2;
        try {
            if (f2047q == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f2047q = declaredField;
                declaredField.setAccessible(true);
            }
            return (AnimationListener) f2047q.get(animation);
        } catch (NoSuchFieldException e) {
            e = e;
            str2 = "FragmentManager";
            str = "No field with the name mListener is found in Animation class";
            Log.e(str2, str, e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            str2 = "FragmentManager";
            str = "Cannot access Animation's mListener field";
            Log.e(str2, str, e);
            return null;
        }
    }

    /* renamed from: a */
    private C0457hp m1519a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        C0457hp hpVar = (C0457hp) this.f2058f.get(i);
        if (hpVar == null) {
            StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": index ");
            sb.append(i);
            m1530a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return hpVar;
    }

    /* renamed from: a */
    private static C0481c m1520a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f2043G);
        alphaAnimation.setDuration(220);
        return new C0481c((Animation) alphaAnimation);
    }

    /* renamed from: a */
    private static C0481c m1521a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f2042F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f2043G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0481c((Animation) animationSet);
    }

    /* renamed from: a */
    private C0481c m1522a(C0457hp hpVar, int i, boolean z, int i2) {
        char c;
        int B = hpVar.mo1920B();
        C0457hp.m1433l();
        C0457hp.m1434m();
        char c2 = 1;
        if (B != 0) {
            boolean equals = "anim".equals(this.f2065m.f2039c.getResources().getResourceTypeName(B));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f2065m.f2039c, B);
                    if (loadAnimation != null) {
                        return new C0481c(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f2065m.f2039c, B);
                    if (loadAnimator != null) {
                        return new C0481c(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f2065m.f2039c, B);
                    if (loadAnimation2 != null) {
                        return new C0481c(loadAnimation2);
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        char c3 = 65535;
        if (i != 4097) {
            if (i == 4099) {
                c = z ? (char) 5 : 6;
            } else if (i == 8194) {
                c = z ? (char) 3 : 4;
            }
            c3 = c;
        } else {
            if (!z) {
                c2 = 2;
            }
            c3 = c2;
        }
        if (c3 < 0) {
            return null;
        }
        switch (c3) {
            case 1:
                return m1521a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1521a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1521a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1521a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1520a(0.0f, 1.0f);
            case 6:
                return m1520a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f2065m.mo1996e()) {
                    i2 = this.f2065m.mo1997f();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    /* renamed from: a */
    private void m1523a(int i, C0453hn hnVar) {
        synchronized (this) {
            if (this.f2061i == null) {
                this.f2061i = new ArrayList<>();
            }
            int size = this.f2061i.size();
            if (i < size) {
                if (f2046a) {
                    StringBuilder sb = new StringBuilder("Setting back stack index ");
                    sb.append(i);
                    sb.append(" to ");
                    sb.append(hnVar);
                    Log.v("FragmentManager", sb.toString());
                }
                this.f2061i.set(i, hnVar);
            } else {
                while (size < i) {
                    this.f2061i.add(null);
                    if (this.f2062j == null) {
                        this.f2062j = new ArrayList<>();
                    }
                    if (f2046a) {
                        StringBuilder sb2 = new StringBuilder("Adding available back stack index ");
                        sb2.append(size);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.f2062j.add(Integer.valueOf(size));
                    size++;
                }
                if (f2046a) {
                    StringBuilder sb3 = new StringBuilder("Adding back stack index ");
                    sb3.append(i);
                    sb3.append(" with ");
                    sb3.append(hnVar);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.f2061i.add(hnVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1524a(android.view.View r5, p000.C0472hv.C0481c r6) {
        /*
            if (r5 == 0) goto L_0x0078
            if (r6 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x0052
            if (r6 != 0) goto L_0x000c
            goto L_0x0052
        L_0x000c:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r2 < r3) goto L_0x0052
            int r2 = r5.getLayerType()
            if (r2 != 0) goto L_0x0052
            boolean r2 = p000.C0396gq.m1271h(r5)
            if (r2 == 0) goto L_0x0052
            android.view.animation.Animation r2 = r6.f2094a
            boolean r2 = r2 instanceof android.view.animation.AlphaAnimation
            if (r2 == 0) goto L_0x0026
        L_0x0024:
            r2 = r1
            goto L_0x004f
        L_0x0026:
            android.view.animation.Animation r2 = r6.f2094a
            boolean r2 = r2 instanceof android.view.animation.AnimationSet
            if (r2 == 0) goto L_0x0049
            android.view.animation.Animation r2 = r6.f2094a
            android.view.animation.AnimationSet r2 = (android.view.animation.AnimationSet) r2
            java.util.List r2 = r2.getAnimations()
            r3 = r0
        L_0x0035:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0047
            java.lang.Object r4 = r2.get(r3)
            boolean r4 = r4 instanceof android.view.animation.AlphaAnimation
            if (r4 == 0) goto L_0x0044
            goto L_0x0024
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x0035
        L_0x0047:
            r2 = r0
            goto L_0x004f
        L_0x0049:
            android.animation.Animator r2 = r6.f2095b
            boolean r2 = m1533a(r2)
        L_0x004f:
            if (r2 == 0) goto L_0x0052
            r0 = r1
        L_0x0052:
            if (r0 == 0) goto L_0x0078
            android.animation.Animator r0 = r6.f2095b
            if (r0 == 0) goto L_0x0063
            android.animation.Animator r6 = r6.f2095b
            hv$d r0 = new hv$d
            r0.<init>(r5)
            r6.addListener(r0)
            return
        L_0x0063:
            android.view.animation.Animation r0 = r6.f2094a
            android.view.animation.Animation$AnimationListener r0 = m1518a(r0)
            r1 = 2
            r2 = 0
            r5.setLayerType(r1, r2)
            android.view.animation.Animation r6 = r6.f2094a
            hv$a r1 = new hv$a
            r1.<init>(r5, r0)
            r6.setAnimationListener(r1)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0472hv.m1524a(android.view.View, hv$c):void");
    }

    /* renamed from: a */
    private static void m1525a(C0245df<C0457hp> dfVar) {
        int size = dfVar.size();
        for (int i = 0; i < size; i++) {
            C0457hp hpVar = (C0457hp) dfVar.f1169a[i];
            if (!hpVar.f1984l) {
                View view = hpVar.f1960J;
                hpVar.f1967Q = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m1526a(C0457hp hpVar, Context context) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1526a(hpVar, context);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    private void m1527a(C0457hp hpVar, Bundle bundle) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1527a(hpVar, bundle);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    private void m1528a(C0457hp hpVar, View view, Bundle bundle) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1528a(hpVar, view, bundle);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    static void m1529a(C0487hw hwVar) {
        if (hwVar != null) {
            List<C0457hp> list = hwVar.f2105a;
            if (list != null) {
                for (C0457hp hpVar : list) {
                    hpVar.f1955E = true;
                }
            }
            List<C0487hw> list2 = hwVar.f2106b;
            if (list2 != null) {
                for (C0487hw a : list2) {
                    m1529a(a);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1530a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0376ga("FragmentManager"));
        if (this.f2065m != null) {
            try {
                this.f2065m.mo1992a("  ", printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo2001a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (((java.lang.Boolean) r10.get(r6)).booleanValue() != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3.mo2054d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (((java.lang.Boolean) r10.get(r6)).booleanValue() != false) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1531a(java.util.ArrayList<p000.C0453hn> r9, java.util.ArrayList<java.lang.Boolean> r10) {
        /*
            r8 = this;
            java.util.ArrayList<hv$h> r0 = r8.f2050C
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x000d
        L_0x0007:
            java.util.ArrayList<hv$h> r0 = r8.f2050C
            int r0 = r0.size()
        L_0x000d:
            r2 = r0
            r0 = r1
        L_0x000f:
            if (r0 >= r2) goto L_0x0079
            java.util.ArrayList<hv$h> r3 = r8.f2050C
            java.lang.Object r3 = r3.get(r0)
            hv$h r3 = (p000.C0472hv.C0486h) r3
            r4 = 1
            r5 = -1
            if (r9 == 0) goto L_0x0039
            boolean r6 = r3.f2102a
            if (r6 != 0) goto L_0x0039
            hn r6 = r3.f2103b
            int r6 = r9.indexOf(r6)
            if (r6 == r5) goto L_0x0039
            java.lang.Object r6 = r10.get(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0039
        L_0x0035:
            r3.mo2054d()
            goto L_0x0077
        L_0x0039:
            int r6 = r3.f2104c
            if (r6 != 0) goto L_0x003f
            r6 = r4
            goto L_0x0040
        L_0x003f:
            r6 = r1
        L_0x0040:
            if (r6 != 0) goto L_0x0050
            if (r9 == 0) goto L_0x0077
            hn r6 = r3.f2103b
            int r7 = r9.size()
            boolean r6 = r6.mo1908a(r9, r1, r7)
            if (r6 == 0) goto L_0x0077
        L_0x0050:
            java.util.ArrayList<hv$h> r6 = r8.f2050C
            r6.remove(r0)
            int r0 = r0 + -1
            int r2 = r2 + -1
            if (r9 == 0) goto L_0x0074
            boolean r6 = r3.f2102a
            if (r6 != 0) goto L_0x0074
            hn r6 = r3.f2103b
            int r6 = r9.indexOf(r6)
            if (r6 == r5) goto L_0x0074
            java.lang.Object r5 = r10.get(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0074
            goto L_0x0035
        L_0x0074:
            r3.mo2053c()
        L_0x0077:
            int r0 = r0 + r4
            goto L_0x000f
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0472hv.m1531a(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: a */
    private void m1532a(ArrayList<C0453hn> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0453hn> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0453hn) arrayList3.get(i4)).f1929t;
        if (this.f2077z == null) {
            this.f2077z = new ArrayList<>();
        } else {
            this.f2077z.clear();
        }
        this.f2077z.addAll(this.f2057e);
        C0457hp hpVar = this.f2068p;
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0453hn hnVar = (C0453hn) arrayList3.get(i6);
            hpVar = !((Boolean) arrayList4.get(i6)).booleanValue() ? hnVar.mo1901a(this.f2077z, hpVar) : hnVar.mo1910b(this.f2077z, hpVar);
            z2 = z2 || hnVar.f1918i;
        }
        this.f2077z.clear();
        if (!z) {
            C0495ia.m1622a(this, arrayList3, arrayList4, i4, i5, false);
        }
        m1540b(arrayList, arrayList2, i, i2);
        if (z) {
            C0245df dfVar = new C0245df();
            m1536b(dfVar);
            int a = m1517a(arrayList3, arrayList4, i4, i5, dfVar);
            m1525a(dfVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0495ia.m1622a(this, arrayList3, arrayList4, i4, i3, true);
            mo2007a(this.f2064l, true);
        }
        while (i4 < i5) {
            C0453hn hnVar2 = (C0453hn) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue() && hnVar2.f1922m >= 0) {
                int i7 = hnVar2.f1922m;
                synchronized (this) {
                    try {
                        this.f2061i.set(i7, null);
                        if (this.f2062j == null) {
                            this.f2062j = new ArrayList<>();
                        }
                        if (f2046a) {
                            StringBuilder sb = new StringBuilder("Freeing back stack index ");
                            sb.append(i7);
                            Log.v("FragmentManager", sb.toString());
                        }
                        this.f2062j.add(Integer.valueOf(i7));
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                hnVar2.f1922m = -1;
            }
            hnVar2.mo1902a();
            i4++;
        }
        if (z2) {
            m1561s();
        }
    }

    /* renamed from: a */
    private static boolean m1533a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m1533a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m1534b(int i) {
        int i2 = 8194;
        if (i != 4097) {
            if (i != 4099) {
                return i != 8194 ? 0 : 4097;
            }
            i2 = 4099;
        }
        return i2;
    }

    /* renamed from: b */
    private C0457hp m1535b(String str) {
        if (str != null) {
            for (int size = this.f2057e.size() - 1; size >= 0; size--) {
                C0457hp hpVar = (C0457hp) this.f2057e.get(size);
                if (hpVar != null && str.equals(hpVar.f1951A)) {
                    return hpVar;
                }
            }
        }
        if (!(this.f2058f == null || str == null)) {
            for (int size2 = this.f2058f.size() - 1; size2 >= 0; size2--) {
                C0457hp hpVar2 = (C0457hp) this.f2058f.valueAt(size2);
                if (hpVar2 != null && str.equals(hpVar2.f1951A)) {
                    return hpVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m1536b(C0245df<C0457hp> dfVar) {
        if (this.f2064l > 0) {
            int min = Math.min(this.f2064l, 3);
            int size = this.f2057e.size();
            for (int i = 0; i < size; i++) {
                C0457hp hpVar = (C0457hp) this.f2057e.get(i);
                if (hpVar.f1974b < min) {
                    mo2012a(hpVar, min, hpVar.mo1920B(), hpVar.mo1921C(), false);
                    if (hpVar.f1960J != null && !hpVar.f1952B && hpVar.f1965O) {
                        dfVar.add(hpVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m1537b(C0457hp hpVar, Context context) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1537b(hpVar, context);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    private void m1538b(C0457hp hpVar, Bundle bundle) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1538b(hpVar, bundle);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    private void m1539b(ArrayList<C0453hn> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m1531a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0453hn) arrayList.get(i)).f1929t) {
                    if (i2 != i) {
                        m1532a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0453hn) arrayList.get(i2)).f1929t) {
                            i2++;
                        }
                    }
                    m1532a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m1532a(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: b */
    private static void m1540b(ArrayList<C0453hn> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0453hn hnVar = (C0453hn) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                hnVar.mo1903a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                hnVar.mo1907a(z);
            } else {
                hnVar.mo1903a(1);
                hnVar.mo1911b();
            }
            i++;
        }
    }

    /* renamed from: c */
    private C0457hp m1541c(int i) {
        for (int size = this.f2057e.size() - 1; size >= 0; size--) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(size);
            if (hpVar != null && hpVar.f1997y == i) {
                return hpVar;
            }
        }
        if (this.f2058f != null) {
            for (int size2 = this.f2058f.size() - 1; size2 >= 0; size2--) {
                C0457hp hpVar2 = (C0457hp) this.f2058f.valueAt(size2);
                if (hpVar2 != null && hpVar2.f1997y == i) {
                    return hpVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m1542c(C0457hp hpVar, Bundle bundle) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1542c(hpVar, bundle);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1543c(java.util.ArrayList<p000.C0453hn> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<hv$g> r0 = r4.f2054b     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.util.ArrayList<hv$g> r0 = r4.f2054b     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            java.util.ArrayList<hv$g> r0 = r4.f2054b     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = r1
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<hv$g> r3 = r4.f2054b     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            hv$g r3 = (p000.C0472hv.C0485g) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.mo1909a(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<hv$g> r5 = r4.f2054b     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            ht r5 = r4.f2065m     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.f2040d     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.f2052E     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0472hv.m1543c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: d */
    public static void m1544d(C0457hp hpVar) {
        if (f2046a) {
            StringBuilder sb = new StringBuilder("hide: ");
            sb.append(hpVar);
            Log.v("FragmentManager", sb.toString());
        }
        if (!hpVar.f1952B) {
            hpVar.f1952B = true;
            hpVar.f1966P = true ^ hpVar.f1966P;
        }
    }

    /* renamed from: d */
    private void m1545d(C0457hp hpVar, Bundle bundle) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1545d(hpVar, bundle);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: e */
    public static void m1546e(C0457hp hpVar) {
        if (f2046a) {
            StringBuilder sb = new StringBuilder("show: ");
            sb.append(hpVar);
            Log.v("FragmentManager", sb.toString());
        }
        if (hpVar.f1952B) {
            hpVar.f1952B = false;
            hpVar.f1966P = !hpVar.f1966P;
        }
    }

    /* renamed from: i */
    private void m1547i(C0457hp hpVar) {
        mo2012a(hpVar, this.f2064l, 0, 0, false);
    }

    /* renamed from: j */
    private void m1548j(C0457hp hpVar) {
        if (hpVar.f1961K != null) {
            if (this.f2049B == null) {
                this.f2049B = new SparseArray<>();
            } else {
                this.f2049B.clear();
            }
            hpVar.f1961K.saveHierarchyState(this.f2049B);
            if (this.f2049B.size() > 0) {
                hpVar.f1976d = this.f2049B;
                this.f2049B = null;
            }
        }
    }

    /* renamed from: k */
    private void m1549k(C0457hp hpVar) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1549k(hpVar);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: l */
    private void m1550l(C0457hp hpVar) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1550l(hpVar);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: m */
    private void m1551m(C0457hp hpVar) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1551m(hpVar);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: n */
    private void m1552n(C0457hp hpVar) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1552n(hpVar);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: n */
    private boolean m1553n() {
        mo2024d();
        m1556p();
        if (this.f2068p != null) {
            C0472hv hvVar = this.f2068p.f1993u;
            if (hvVar != null && hvVar.mo2002a()) {
                return true;
            }
        }
        ArrayList<C0453hn> arrayList = this.f2075x;
        ArrayList<Boolean> arrayList2 = this.f2076y;
        boolean z = false;
        if (this.f2059g != null) {
            int size = this.f2059g.size() - 1;
            if (size >= 0) {
                arrayList.add(this.f2059g.remove(size));
                arrayList2.add(Boolean.valueOf(true));
                z = true;
            }
        }
        if (z) {
            this.f2055c = true;
            try {
                m1539b(this.f2075x, this.f2076y);
            } finally {
                m1558q();
            }
        }
        m1560r();
        m1563u();
        return z;
    }

    /* renamed from: o */
    private void m1554o() {
        if (this.f2058f != null) {
            for (int i = 0; i < this.f2058f.size(); i++) {
                C0457hp hpVar = (C0457hp) this.f2058f.valueAt(i);
                if (hpVar != null && hpVar.f1962L) {
                    if (this.f2055c) {
                        this.f2074w = true;
                    } else {
                        hpVar.f1962L = false;
                        mo2012a(hpVar, this.f2064l, 0, 0, false);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    private void m1555o(C0457hp hpVar) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1555o(hpVar);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: p */
    private void m1556p() {
        if (this.f2055c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2065m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() != this.f2065m.f2040d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (this.f2075x == null) {
                this.f2075x = new ArrayList<>();
                this.f2076y = new ArrayList<>();
            }
            this.f2055c = true;
            try {
                m1531a(null, null);
            } finally {
                this.f2055c = false;
            }
        }
    }

    /* renamed from: p */
    private void m1557p(C0457hp hpVar) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1557p(hpVar);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: q */
    private void m1558q() {
        this.f2055c = false;
        this.f2076y.clear();
        this.f2075x.clear();
    }

    /* renamed from: q */
    private void m1559q(C0457hp hpVar) {
        if (this.f2067o != null) {
            C0472hv hvVar = this.f2067o.f1991s;
            if (hvVar instanceof C0472hv) {
                hvVar.m1559q(hpVar);
            }
        }
        Iterator it = this.f2053J.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: r */
    private void m1560r() {
        if (this.f2074w) {
            this.f2074w = false;
            m1554o();
        }
    }

    /* renamed from: s */
    private void m1561s() {
        if (this.f2063k != null) {
            for (int i = 0; i < this.f2063k.size(); i++) {
                this.f2063k.get(i);
            }
        }
    }

    /* renamed from: t */
    private void m1562t() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0487hw hwVar;
        if (this.f2058f != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f2058f.size(); i++) {
                C0457hp hpVar = (C0457hp) this.f2058f.valueAt(i);
                if (hpVar != null) {
                    if (hpVar.f1954D) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hpVar);
                        hpVar.f1982j = hpVar.f1981i != null ? hpVar.f1981i.f1978f : -1;
                        if (f2046a) {
                            StringBuilder sb = new StringBuilder("retainNonConfig: keeping retained ");
                            sb.append(hpVar);
                            Log.v("FragmentManager", sb.toString());
                        }
                    }
                    if (hpVar.f1993u != null) {
                        hpVar.f1993u.m1562t();
                        hwVar = hpVar.f1993u.f2051D;
                    } else {
                        hwVar = hpVar.f1994v;
                    }
                    if (arrayList2 == null && hwVar != null) {
                        arrayList2 = new ArrayList(this.f2058f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(hwVar);
                    }
                    if (arrayList == null && hpVar.f1995w != null) {
                        arrayList = new ArrayList(this.f2058f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(hpVar.f1995w);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f2051D = null;
        } else {
            this.f2051D = new C0487hw(arrayList3, arrayList2, arrayList);
        }
    }

    /* renamed from: u */
    private void m1563u() {
        if (this.f2058f != null) {
            for (int size = this.f2058f.size() - 1; size >= 0; size--) {
                if (this.f2058f.valueAt(size) == null) {
                    this.f2058f.delete(this.f2058f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    public final C0457hp mo2005a(String str) {
        if (!(this.f2058f == null || str == null)) {
            for (int size = this.f2058f.size() - 1; size >= 0; size--) {
                C0457hp hpVar = (C0457hp) this.f2058f.valueAt(size);
                if (hpVar != null) {
                    if (!str.equals(hpVar.f1979g)) {
                        hpVar = hpVar.f1993u != null ? hpVar.f1993u.mo2005a(str) : null;
                    }
                    if (hpVar != null) {
                        return hpVar;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2006a(int i) {
        try {
            this.f2055c = true;
            mo2007a(i, false);
            this.f2055c = false;
            mo2024d();
        } catch (Throwable th) {
            this.f2055c = false;
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2007a(int i, boolean z) {
        if (this.f2065m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2064l) {
            this.f2064l = i;
            if (this.f2058f != null) {
                int size = this.f2057e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo2011a((C0457hp) this.f2057e.get(i2));
                }
                int size2 = this.f2058f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0457hp hpVar = (C0457hp) this.f2058f.valueAt(i3);
                    if (hpVar != null && ((hpVar.f1985m || hpVar.f1953C) && !hpVar.f1965O)) {
                        mo2011a(hpVar);
                    }
                }
                m1554o();
                if (this.f2069r && this.f2065m != null && this.f2064l == 4) {
                    this.f2065m.mo1995d();
                    this.f2069r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2008a(Configuration configuration) {
        for (int i = 0; i < this.f2057e.size(); i++) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(i);
            if (hpVar != null) {
                hpVar.onConfigurationChanged(configuration);
                if (hpVar.f1993u != null) {
                    hpVar.f1993u.mo2008a(configuration);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2009a(android.os.Parcelable r18, p000.C0487hw r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r19
            if (r18 != 0) goto L_0x0007
            return
        L_0x0007:
            r2 = r18
            hx r2 = (p000.C0488hx) r2
            hy[] r4 = r2.f2108a
            if (r4 != 0) goto L_0x0010
            return
        L_0x0010:
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x00a5
            java.util.List<hp> r6 = r3.f2105a
            java.util.List<hw> r7 = r3.f2106b
            java.util.List<ja> r8 = r3.f2107c
            if (r6 == 0) goto L_0x0021
            int r9 = r6.size()
            goto L_0x0022
        L_0x0021:
            r9 = r5
        L_0x0022:
            r10 = r5
        L_0x0023:
            if (r10 >= r9) goto L_0x00a7
            java.lang.Object r11 = r6.get(r10)
            hp r11 = (p000.C0457hp) r11
            boolean r12 = f2046a
            if (r12 == 0) goto L_0x0042
            java.lang.String r12 = "FragmentManager"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "restoreAllState: re-attaching retained "
            r13.<init>(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r12, r13)
        L_0x0042:
            r12 = r5
        L_0x0043:
            hy[] r13 = r2.f2108a
            int r13 = r13.length
            if (r12 >= r13) goto L_0x0055
            hy[] r13 = r2.f2108a
            r13 = r13[r12]
            int r13 = r13.f2114b
            int r14 = r11.f1978f
            if (r13 == r14) goto L_0x0055
            int r12 = r12 + 1
            goto L_0x0043
        L_0x0055:
            hy[] r13 = r2.f2108a
            int r13 = r13.length
            if (r12 != r13) goto L_0x0072
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Could not find active fragment with index "
            r14.<init>(r15)
            int r15 = r11.f1978f
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            r1.m1530a(r13)
        L_0x0072:
            hy[] r13 = r2.f2108a
            r12 = r13[r12]
            r12.f2124l = r11
            r11.f1976d = r4
            r11.f1990r = r5
            r11.f1987o = r5
            r11.f1984l = r5
            r11.f1981i = r4
            android.os.Bundle r13 = r12.f2123k
            if (r13 == 0) goto L_0x00a1
            android.os.Bundle r13 = r12.f2123k
            ht r14 = r1.f2065m
            android.content.Context r14 = r14.f2039c
            java.lang.ClassLoader r14 = r14.getClassLoader()
            r13.setClassLoader(r14)
            android.os.Bundle r13 = r12.f2123k
            java.lang.String r14 = "android:view_state"
            android.util.SparseArray r13 = r13.getSparseParcelableArray(r14)
            r11.f1976d = r13
            android.os.Bundle r12 = r12.f2123k
            r11.f1975c = r12
        L_0x00a1:
            int r10 = r10 + 1
            goto L_0x0023
        L_0x00a5:
            r7 = r4
            r8 = r7
        L_0x00a7:
            android.util.SparseArray r6 = new android.util.SparseArray
            hy[] r9 = r2.f2108a
            int r9 = r9.length
            r6.<init>(r9)
            r1.f2058f = r6
            r6 = r5
        L_0x00b2:
            hy[] r9 = r2.f2108a
            int r9 = r9.length
            if (r6 >= r9) goto L_0x01ad
            hy[] r9 = r2.f2108a
            r9 = r9[r6]
            if (r9 == 0) goto L_0x01a7
            if (r7 == 0) goto L_0x00cc
            int r11 = r7.size()
            if (r6 >= r11) goto L_0x00cc
            java.lang.Object r11 = r7.get(r6)
            hw r11 = (p000.C0487hw) r11
            goto L_0x00cd
        L_0x00cc:
            r11 = r4
        L_0x00cd:
            if (r8 == 0) goto L_0x00dc
            int r12 = r8.size()
            if (r6 >= r12) goto L_0x00dc
            java.lang.Object r12 = r8.get(r6)
            ja r12 = (p000.C0542ja) r12
            goto L_0x00dd
        L_0x00dc:
            r12 = r4
        L_0x00dd:
            ht r13 = r1.f2065m
            hr r14 = r1.f2066n
            hp r15 = r1.f2067o
            hp r5 = r9.f2124l
            if (r5 != 0) goto L_0x0174
            android.content.Context r5 = r13.f2039c
            android.os.Bundle r4 = r9.f2121i
            if (r4 == 0) goto L_0x00f6
            android.os.Bundle r4 = r9.f2121i
            java.lang.ClassLoader r10 = r5.getClassLoader()
            r4.setClassLoader(r10)
        L_0x00f6:
            if (r14 == 0) goto L_0x0103
            java.lang.String r4 = r9.f2113a
            android.os.Bundle r10 = r9.f2121i
            hp r4 = r14.mo1966a(r5, r4, r10)
        L_0x0100:
            r9.f2124l = r4
            goto L_0x010c
        L_0x0103:
            java.lang.String r4 = r9.f2113a
            android.os.Bundle r10 = r9.f2121i
            hp r4 = p000.C0457hp.m1427a(r5, r4, r10)
            goto L_0x0100
        L_0x010c:
            android.os.Bundle r4 = r9.f2123k
            if (r4 == 0) goto L_0x011f
            android.os.Bundle r4 = r9.f2123k
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r4.setClassLoader(r5)
            hp r4 = r9.f2124l
            android.os.Bundle r5 = r9.f2123k
            r4.f1975c = r5
        L_0x011f:
            hp r4 = r9.f2124l
            int r5 = r9.f2114b
            r4.mo1933a(r5, r15)
            hp r4 = r9.f2124l
            boolean r5 = r9.f2115c
            r4.f1986n = r5
            hp r4 = r9.f2124l
            r5 = 1
            r4.f1988p = r5
            hp r4 = r9.f2124l
            int r5 = r9.f2116d
            r4.f1997y = r5
            hp r4 = r9.f2124l
            int r5 = r9.f2117e
            r4.f1998z = r5
            hp r4 = r9.f2124l
            java.lang.String r5 = r9.f2118f
            r4.f1951A = r5
            hp r4 = r9.f2124l
            boolean r5 = r9.f2119g
            r4.f1954D = r5
            hp r4 = r9.f2124l
            boolean r5 = r9.f2120h
            r4.f1953C = r5
            hp r4 = r9.f2124l
            boolean r5 = r9.f2122j
            r4.f1952B = r5
            hp r4 = r9.f2124l
            hv r5 = r13.f2041e
            r4.f1991s = r5
            boolean r4 = f2046a
            if (r4 == 0) goto L_0x0174
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "Instantiated fragment "
            r5.<init>(r10)
            hp r10 = r9.f2124l
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r4, r5)
        L_0x0174:
            hp r4 = r9.f2124l
            r4.f1994v = r11
            hp r4 = r9.f2124l
            r4.f1995w = r12
            hp r4 = r9.f2124l
            boolean r5 = f2046a
            if (r5 == 0) goto L_0x019d
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "restoreAllState: active #"
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r11 = ": "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r5, r10)
        L_0x019d:
            android.util.SparseArray<hp> r5 = r1.f2058f
            int r10 = r4.f1978f
            r5.put(r10, r4)
            r4 = 0
            r9.f2124l = r4
        L_0x01a7:
            int r6 = r6 + 1
            r4 = 0
            r5 = 0
            goto L_0x00b2
        L_0x01ad:
            if (r3 == 0) goto L_0x01f6
            java.util.List<hp> r3 = r3.f2105a
            if (r3 == 0) goto L_0x01b8
            int r5 = r3.size()
            goto L_0x01b9
        L_0x01b8:
            r5 = 0
        L_0x01b9:
            r4 = 0
        L_0x01ba:
            if (r4 >= r5) goto L_0x01f6
            java.lang.Object r6 = r3.get(r4)
            hp r6 = (p000.C0457hp) r6
            int r7 = r6.f1982j
            if (r7 < 0) goto L_0x01f3
            android.util.SparseArray<hp> r7 = r1.f2058f
            int r8 = r6.f1982j
            java.lang.Object r7 = r7.get(r8)
            hp r7 = (p000.C0457hp) r7
            r6.f1981i = r7
            hp r7 = r6.f1981i
            if (r7 != 0) goto L_0x01f3
            java.lang.String r7 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Re-attaching retained fragment "
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r9 = " target no longer exists: "
            r8.append(r9)
            int r6 = r6.f1982j
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.w(r7, r6)
        L_0x01f3:
            int r4 = r4 + 1
            goto L_0x01ba
        L_0x01f6:
            java.util.ArrayList<hp> r3 = r1.f2057e
            r3.clear()
            int[] r3 = r2.f2109b
            if (r3 == 0) goto L_0x026f
            r3 = 0
        L_0x0200:
            int[] r4 = r2.f2109b
            int r4 = r4.length
            if (r3 >= r4) goto L_0x026f
            android.util.SparseArray<hp> r4 = r1.f2058f
            int[] r5 = r2.f2109b
            r5 = r5[r3]
            java.lang.Object r4 = r4.get(r5)
            hp r4 = (p000.C0457hp) r4
            if (r4 != 0) goto L_0x022d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "No instantiated fragment for index #"
            r6.<init>(r7)
            int[] r7 = r2.f2109b
            r7 = r7[r3]
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            r1.m1530a(r5)
        L_0x022d:
            r5 = 1
            r4.f1984l = r5
            boolean r6 = f2046a
            if (r6 == 0) goto L_0x024f
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "restoreAllState: added #"
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r8 = ": "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r6, r7)
        L_0x024f:
            java.util.ArrayList<hp> r6 = r1.f2057e
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L_0x025f
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already added!"
            r2.<init>(r3)
            throw r2
        L_0x025f:
            java.util.ArrayList<hp> r6 = r1.f2057e
            monitor-enter(r6)
            java.util.ArrayList<hp> r7 = r1.f2057e     // Catch:{ all -> 0x026b }
            r7.add(r4)     // Catch:{ all -> 0x026b }
            monitor-exit(r6)     // Catch:{ all -> 0x026b }
            int r3 = r3 + 1
            goto L_0x0200
        L_0x026b:
            r0 = move-exception
            r2 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x026b }
            throw r2
        L_0x026f:
            ho[] r3 = r2.f2110c
            if (r3 == 0) goto L_0x02dc
            java.util.ArrayList r3 = new java.util.ArrayList
            ho[] r4 = r2.f2110c
            int r4 = r4.length
            r3.<init>(r4)
            r1.f2059g = r3
            r3 = 0
        L_0x027e:
            ho[] r4 = r2.f2110c
            int r4 = r4.length
            if (r3 >= r4) goto L_0x02df
            ho[] r4 = r2.f2110c
            r4 = r4[r3]
            hn r4 = r4.mo1914a(r1)
            boolean r5 = f2046a
            if (r5 == 0) goto L_0x02ca
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "restoreAllState: back stack #"
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r7 = " (index "
            r6.append(r7)
            int r7 = r4.f1922m
            r6.append(r7)
            java.lang.String r7 = "): "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r5, r6)
            ga r5 = new ga
            java.lang.String r6 = "FragmentManager"
            r5.<init>(r6)
            java.io.PrintWriter r6 = new java.io.PrintWriter
            r6.<init>(r5)
            java.lang.String r5 = "  "
            r7 = 0
            r4.mo1906a(r5, r6, r7)
            r6.close()
            goto L_0x02cb
        L_0x02ca:
            r7 = 0
        L_0x02cb:
            java.util.ArrayList<hn> r5 = r1.f2059g
            r5.add(r4)
            int r5 = r4.f1922m
            if (r5 < 0) goto L_0x02d9
            int r5 = r4.f1922m
            r1.m1523a(r5, r4)
        L_0x02d9:
            int r3 = r3 + 1
            goto L_0x027e
        L_0x02dc:
            r3 = 0
            r1.f2059g = r3
        L_0x02df:
            int r3 = r2.f2111d
            if (r3 < 0) goto L_0x02ef
            android.util.SparseArray<hp> r3 = r1.f2058f
            int r4 = r2.f2111d
            java.lang.Object r3 = r3.get(r4)
            hp r3 = (p000.C0457hp) r3
            r1.f2068p = r3
        L_0x02ef:
            int r2 = r2.f2112e
            r1.f2056d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0472hv.mo2009a(android.os.Parcelable, hw):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2010a(C0453hn hnVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            hnVar.mo1907a(z3);
        } else {
            hnVar.mo1911b();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(hnVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0495ia.m1622a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo2007a(this.f2064l, true);
        }
        if (this.f2058f != null) {
            int size = this.f2058f.size();
            for (int i = 0; i < size; i++) {
                C0457hp hpVar = (C0457hp) this.f2058f.valueAt(i);
                if (hpVar != null && hpVar.f1960J != null && hpVar.f1965O && hnVar.mo1912b(hpVar.f1998z)) {
                    if (hpVar.f1967Q > 0.0f) {
                        hpVar.f1960J.setAlpha(hpVar.f1967Q);
                    }
                    if (z3) {
                        hpVar.f1967Q = 0.0f;
                    } else {
                        hpVar.f1967Q = -1.0f;
                        hpVar.f1965O = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2011a(final C0457hp hpVar) {
        if (hpVar != null) {
            int i = this.f2064l;
            if (hpVar.f1985m) {
                i = hpVar.mo1941b() ? Math.min(i, 1) : Math.min(i, 0);
            }
            mo2012a(hpVar, i, hpVar.mo1921C(), hpVar.mo1922D(), false);
            if (hpVar.f1960J != null) {
                ViewGroup viewGroup = hpVar.f1959I;
                View view = hpVar.f1960J;
                C0457hp hpVar2 = null;
                if (viewGroup != null && view != null) {
                    int indexOf = this.f2057e.indexOf(hpVar) - 1;
                    while (true) {
                        if (indexOf < 0) {
                            break;
                        }
                        C0457hp hpVar3 = (C0457hp) this.f2057e.get(indexOf);
                        if (hpVar3.f1959I == viewGroup && hpVar3.f1960J != null) {
                            hpVar2 = hpVar3;
                            break;
                        }
                        indexOf--;
                    }
                }
                if (hpVar2 != null) {
                    View view2 = hpVar2.f1960J;
                    ViewGroup viewGroup2 = hpVar.f1959I;
                    int indexOfChild = viewGroup2.indexOfChild(view2);
                    int indexOfChild2 = viewGroup2.indexOfChild(hpVar.f1960J);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup2.removeViewAt(indexOfChild2);
                        viewGroup2.addView(hpVar.f1960J, indexOfChild);
                    }
                }
                if (hpVar.f1965O && hpVar.f1959I != null) {
                    if (hpVar.f1967Q > 0.0f) {
                        hpVar.f1960J.setAlpha(hpVar.f1967Q);
                    }
                    hpVar.f1967Q = 0.0f;
                    hpVar.f1965O = false;
                    C0481c a = m1522a(hpVar, hpVar.mo1921C(), true, hpVar.mo1922D());
                    if (a != null) {
                        m1524a(hpVar.f1960J, a);
                        if (a.f2094a != null) {
                            hpVar.f1960J.startAnimation(a.f2094a);
                        } else {
                            a.f2095b.setTarget(hpVar.f1960J);
                            a.f2095b.start();
                        }
                    }
                }
            }
            if (hpVar.f1966P) {
                if (hpVar.f1960J != null) {
                    C0481c a2 = m1522a(hpVar, hpVar.mo1921C(), !hpVar.f1952B, hpVar.mo1922D());
                    if (a2 == null || a2.f2095b == null) {
                        if (a2 != null) {
                            m1524a(hpVar.f1960J, a2);
                            hpVar.f1960J.startAnimation(a2.f2094a);
                            a2.f2094a.start();
                        }
                        hpVar.f1960J.setVisibility((!hpVar.f1952B || hpVar.mo1929K()) ? 0 : 8);
                        if (hpVar.mo1929K()) {
                            hpVar.mo1938a(false);
                        }
                    } else {
                        a2.f2095b.setTarget(hpVar.f1960J);
                        if (!hpVar.f1952B) {
                            hpVar.f1960J.setVisibility(0);
                        } else if (hpVar.mo1929K()) {
                            hpVar.mo1938a(false);
                        } else {
                            final ViewGroup viewGroup3 = hpVar.f1959I;
                            final View view3 = hpVar.f1960J;
                            viewGroup3.startViewTransition(view3);
                            a2.f2095b.addListener(new AnimatorListenerAdapter() {
                                public final void onAnimationEnd(Animator animator) {
                                    viewGroup3.endViewTransition(view3);
                                    animator.removeListener(this);
                                    if (hpVar.f1960J != null) {
                                        hpVar.f1960J.setVisibility(8);
                                    }
                                }
                            });
                        }
                        m1524a(hpVar.f1960J, a2);
                        a2.f2095b.start();
                    }
                }
                if (hpVar.f1984l && hpVar.f1956F && hpVar.f1957G) {
                    this.f2069r = true;
                }
                hpVar.f1966P = false;
                boolean z = hpVar.f1952B;
                C0457hp.m1429f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01dd, code lost:
        if (f2046a == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01df, code lost:
        r2 = new java.lang.StringBuilder("moveto ACTIVITY_CREATED: ");
        r2.append(r7);
        android.util.Log.v("FragmentManager", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f4, code lost:
        if (r7.f1986n != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f8, code lost:
        if (r7.f1998z == 0) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fc, code lost:
        if (r7.f1998z != -1) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fe, code lost:
        r2 = new java.lang.StringBuilder("Cannot create fragment ");
        r2.append(r7);
        r2.append(" for a container view with no id");
        m1530a((java.lang.RuntimeException) new java.lang.IllegalArgumentException(r2.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0219, code lost:
        r0 = (android.view.ViewGroup) r6.f2066n.mo1965a(r7.f1998z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0223, code lost:
        if (r0 != null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0227, code lost:
        if (r7.f1988p != false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r2 = r16.mo1943d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x022d, code lost:
        if (r2 != null) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022f, code lost:
        r3 = new java.lang.StringBuilder("Fragment ");
        r3.append(r7);
        r3.append(" not attached to a context.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0247, code lost:
        throw new java.lang.IllegalStateException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0248, code lost:
        r2 = r2.getResources().getResourceName(r7.f1998z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0253, code lost:
        r2 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0282, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03c3, code lost:
        if (r11 >= 3) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03c7, code lost:
        if (f2046a == false) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03c9, code lost:
        r1 = new java.lang.StringBuilder("movefrom STARTED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03dc, code lost:
        r7.f1970T.mo2124a(p000.C0522in.C0523a.ON_STOP);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03e5, code lost:
        if (r7.f1993u == null) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03e7, code lost:
        r7.f1993u.mo2034k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03ec, code lost:
        r7.f1974b = 2;
        r7.f1958H = false;
        r7.f1958H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f4, code lost:
        if (r7.f1958H != false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03f6, code lost:
        r1 = new java.lang.StringBuilder("Fragment ");
        r1.append(r7);
        r1.append(" did not call through to super.onStop()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x040e, code lost:
        throw new p000.C0511ie(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x040f, code lost:
        m1552n(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0412, code lost:
        if (r11 >= 2) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0416, code lost:
        if (f2046a == false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0418, code lost:
        r1 = new java.lang.StringBuilder("movefrom ACTIVITY_CREATED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x042d, code lost:
        if (r7.f1960J == null) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0435, code lost:
        if (r6.f2065m.mo1993b() == false) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0439, code lost:
        if (r7.f1976d != null) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x043b, code lost:
        m1548j(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0440, code lost:
        if (r7.f1993u == null) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0442, code lost:
        r7.f1993u.mo2006a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0447, code lost:
        r7.f1974b = 1;
        r7.f1958H = false;
        r7.f1958H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x044f, code lost:
        if (r7.f1960J == null) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0451, code lost:
        r7.f1971U.mo2124a(p000.C0522in.C0523a.ON_DESTROY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x045a, code lost:
        if (r7.f1958H != false) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x045c, code lost:
        r1 = new java.lang.StringBuilder("Fragment ");
        r1.append(r7);
        r1.append(" did not call through to super.onDestroyView()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0474, code lost:
        throw new p000.C0511ie(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0475, code lost:
        p000.C0544jc.m1713a(r16).mo2139a();
        r7.f1989q = false;
        m1555o(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0483, code lost:
        if (r7.f1960J == null) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0487, code lost:
        if (r7.f1959I == null) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0489, code lost:
        r7.f1959I.endViewTransition(r7.f1960J);
        r7.f1960J.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0498, code lost:
        if (r6.f2064l <= 0) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x049c, code lost:
        if (r6.f2072u != false) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04a4, code lost:
        if (r7.f1960J.getVisibility() != 0) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04aa, code lost:
        if (r7.f1967Q < 0.0f) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04ac, code lost:
        r0 = m1522a(r7, r18, false, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04b5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04b6, code lost:
        r7.f1967Q = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04b8, code lost:
        if (r0 == null) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04ba, code lost:
        r1 = r7.f1960J;
        r2 = r7.f1959I;
        r2.startViewTransition(r1);
        r7.mo1939b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04c6, code lost:
        if (r0.f2094a == null) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c8, code lost:
        r3 = new p000.C0472hv.C0483e(r0.f2094a, r2, r1);
        r7.mo1936a(r7.f1960J);
        r3.setAnimationListener(new p000.C0472hv.C04742(r6, m1518a((android.view.animation.Animation) r3)));
        m1524a(r1, r0);
        r7.f1960J.startAnimation(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04e9, code lost:
        r3 = r0.f2095b;
        r7.mo1934a(r0.f2095b);
        r3.addListener(new p000.C0472hv.C04763(r6));
        r3.setTarget(r7.f1960J);
        m1524a(r7.f1960J, r0);
        r3.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0505, code lost:
        r7.f1959I.removeView(r7.f1960J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x050c, code lost:
        r7.f1959I = null;
        r7.f1960J = null;
        r7.f1972V = null;
        r7.f1973W.mo811a(null);
        r7.f1961K = null;
        r7.f1987o = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x051b, code lost:
        if (r11 > 0) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x051f, code lost:
        if (r6.f2072u == false) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0525, code lost:
        if (r16.mo1925G() == null) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0527, code lost:
        r0 = r16.mo1925G();
        r7.mo1936a((android.view.View) null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0536, code lost:
        if (r16.mo1926H() == null) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0538, code lost:
        r0 = r16.mo1926H();
        r7.mo1934a((android.animation.Animator) null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0546, code lost:
        if (r16.mo1925G() != null) goto L_0x0662;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x054c, code lost:
        if (r16.mo1926H() == null) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0552, code lost:
        if (f2046a == false) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0554, code lost:
        r1 = new java.lang.StringBuilder("movefrom CREATED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0569, code lost:
        if (r7.f1955E != false) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x056b, code lost:
        r7.f1970T.mo2124a(p000.C0522in.C0523a.ON_DESTROY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0574, code lost:
        if (r7.f1993u == null) goto L_0x057b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0576, code lost:
        r7.f1993u.mo2035l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x057b, code lost:
        r7.f1974b = 0;
        r7.f1958H = false;
        r7.f1969S = false;
        r7.f1958H = true;
        r0 = r16.mo1944e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0587, code lost:
        if (r0 == null) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x058d, code lost:
        if (r0.isChangingConfigurations() == false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x058f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0591, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0594, code lost:
        if (r7.f1995w == null) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0596, code lost:
        if (r0 != false) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0598, code lost:
        r7.f1995w.mo2138a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x059f, code lost:
        if (r7.f1958H != false) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05a1, code lost:
        r1 = new java.lang.StringBuilder("Fragment ");
        r1.append(r7);
        r1.append(" did not call through to super.onDestroy()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05b9, code lost:
        throw new p000.C0511ie(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05ba, code lost:
        r7.f1993u = null;
        m1557p(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05c0, code lost:
        r7.f1974b = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05c2, code lost:
        r7.f1958H = false;
        r7.f1958H = true;
        r7.f1968R = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05ca, code lost:
        if (r7.f1958H != false) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05cc, code lost:
        r1 = new java.lang.StringBuilder("Fragment ");
        r1.append(r7);
        r1.append(" did not call through to super.onDetach()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05e4, code lost:
        throw new p000.C0511ie(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05e7, code lost:
        if (r7.f1993u == null) goto L_0x060d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05eb, code lost:
        if (r7.f1955E != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05ed, code lost:
        r1 = new java.lang.StringBuilder("Child FragmentManager of ");
        r1.append(r7);
        r1.append(" was not  destroyed and this fragment is not retaining instance");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0605, code lost:
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0606, code lost:
        r7.f1993u.mo2035l();
        r7.f1993u = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x060d, code lost:
        m1559q(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0610, code lost:
        if (r20 != false) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0614, code lost:
        if (r7.f1955E != false) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0618, code lost:
        if (r7.f1978f < 0) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x061c, code lost:
        if (f2046a == false) goto L_0x0631;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x061e, code lost:
        r1 = new java.lang.StringBuilder("Freeing fragment index ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0631, code lost:
        r6.f2058f.put(r7.f1978f, null);
        r7.f1978f = -1;
        r7.f1979g = null;
        r7.f1984l = false;
        r7.f1985m = false;
        r7.f1986n = false;
        r7.f1987o = false;
        r7.f1988p = false;
        r7.f1990r = 0;
        r7.f1991s = null;
        r7.f1993u = null;
        r7.f1992t = null;
        r7.f1997y = 0;
        r7.f1998z = 0;
        r7.f1951A = null;
        r7.f1952B = false;
        r7.f1953C = false;
        r7.f1955E = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x065b, code lost:
        r7.f1992t = null;
        r7.f1996x = null;
        r7.f1991s = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0662, code lost:
        r7.mo1939b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a2, code lost:
        if (r7.f1986n == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a6, code lost:
        if (r7.f1989q != false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a8, code lost:
        r0 = r7.f1975c;
        r16.mo1947i();
        r0 = r7.f1975c;
        r16.mo1960w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b4, code lost:
        if (r7.f1960J == null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        r7.f1961K = r7.f1960J;
        r7.f1960J.setSaveFromParentEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c1, code lost:
        if (r7.f1952B == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c3, code lost:
        r7.f1960J.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c8, code lost:
        r0 = r7.f1960J;
        r0 = r7.f1975c;
        p000.C0457hp.m1435n();
        m1528a(r7, r7.f1960J, r7.f1975c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d7, code lost:
        r7.f1961K = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d9, code lost:
        if (r11 <= 1) goto L_0x0319;
     */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x066b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2012a(p000.C0457hp r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            boolean r0 = r7.f1984l
            r8 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r7.f1953C
            if (r0 == 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            r0 = r17
            goto L_0x0015
        L_0x0010:
            r0 = r17
            if (r0 <= r8) goto L_0x0015
            r0 = r8
        L_0x0015:
            boolean r1 = r7.f1985m
            if (r1 == 0) goto L_0x002b
            int r1 = r7.f1974b
            if (r0 <= r1) goto L_0x002b
            int r0 = r7.f1974b
            if (r0 != 0) goto L_0x0029
            boolean r0 = r16.mo1941b()
            if (r0 == 0) goto L_0x0029
            r0 = r8
            goto L_0x002b
        L_0x0029:
            int r0 = r7.f1974b
        L_0x002b:
            boolean r1 = r7.f1962L
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0039
            int r1 = r7.f1974b
            if (r1 >= r9) goto L_0x0039
            if (r0 <= r10) goto L_0x0039
            r11 = r10
            goto L_0x003a
        L_0x0039:
            r11 = r0
        L_0x003a:
            int r0 = r7.f1974b
            r12 = -1
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x035d
            boolean r0 = r7.f1986n
            if (r0 == 0) goto L_0x004a
            boolean r0 = r7.f1987o
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            android.view.View r0 = r16.mo1925G()
            if (r0 != 0) goto L_0x0056
            android.animation.Animator r0 = r16.mo1926H()
            if (r0 == 0) goto L_0x0068
        L_0x0056:
            r7.mo1936a(r14)
            r7.mo1934a(r14)
            int r2 = r16.mo1927I()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r0.mo2012a(r1, r2, r3, r4, r5)
        L_0x0068:
            int r0 = r7.f1974b
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x019e;
                case 2: goto L_0x0319;
                case 3: goto L_0x0338;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0666
        L_0x006f:
            if (r11 <= 0) goto L_0x019e
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATED: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0088:
            android.os.Bundle r0 = r7.f1975c
            if (r0 == 0) goto L_0x00dd
            android.os.Bundle r0 = r7.f1975c
            ht r1 = r6.f2065m
            android.content.Context r1 = r1.f2039c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f1975c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f1976d = r0
            android.os.Bundle r0 = r7.f1975c
            java.lang.String r1 = "android:target_state"
            hp r0 = r6.m1519a(r0, r1)
            r7.f1981i = r0
            hp r0 = r7.f1981i
            if (r0 == 0) goto L_0x00bb
            android.os.Bundle r0 = r7.f1975c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.f1983k = r0
        L_0x00bb:
            java.lang.Boolean r0 = r7.f1977e
            if (r0 == 0) goto L_0x00ca
            java.lang.Boolean r0 = r7.f1977e
            boolean r0 = r0.booleanValue()
            r7.f1963M = r0
            r7.f1977e = r14
            goto L_0x00d4
        L_0x00ca:
            android.os.Bundle r0 = r7.f1975c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f1963M = r0
        L_0x00d4:
            boolean r0 = r7.f1963M
            if (r0 != 0) goto L_0x00dd
            r7.f1962L = r8
            if (r11 <= r10) goto L_0x00dd
            r11 = r10
        L_0x00dd:
            ht r0 = r6.f2065m
            r7.f1992t = r0
            hp r0 = r6.f2067o
            r7.f1996x = r0
            hp r0 = r6.f2067o
            if (r0 == 0) goto L_0x00ee
            hp r0 = r6.f2067o
            hv r0 = r0.f1993u
            goto L_0x00f2
        L_0x00ee:
            ht r0 = r6.f2065m
            hv r0 = r0.f2041e
        L_0x00f2:
            r7.f1991s = r0
            hp r0 = r7.f1981i
            if (r0 == 0) goto L_0x0139
            android.util.SparseArray<hp> r0 = r6.f2058f
            hp r1 = r7.f1981i
            int r1 = r1.f1978f
            java.lang.Object r0 = r0.get(r1)
            hp r1 = r7.f1981i
            if (r0 == r1) goto L_0x0129
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            hp r2 = r7.f1981i
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0129:
            hp r0 = r7.f1981i
            int r0 = r0.f1974b
            if (r0 > 0) goto L_0x0139
            hp r1 = r7.f1981i
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r6
            r0.mo2012a(r1, r2, r3, r4, r5)
        L_0x0139:
            ht r0 = r6.f2065m
            android.content.Context r0 = r0.f2039c
            r6.m1526a(r7, r0)
            r7.f1958H = r13
            r7.f1958H = r8
            ht r0 = r7.f1992t
            if (r0 != 0) goto L_0x014a
            r0 = r14
            goto L_0x014e
        L_0x014a:
            ht r0 = r7.f1992t
            android.app.Activity r0 = r0.f2038b
        L_0x014e:
            if (r0 == 0) goto L_0x0154
            r7.f1958H = r13
            r7.f1958H = r8
        L_0x0154:
            boolean r0 = r7.f1958H
            if (r0 != 0) goto L_0x0171
            ie r0 = new ie
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0171:
            hp r0 = r7.f1996x
            if (r0 == 0) goto L_0x017a
            hp r0 = r7.f1996x
            p000.C0457hp.m1432k()
        L_0x017a:
            ht r0 = r6.f2065m
            android.content.Context r0 = r0.f2039c
            r6.m1537b(r7, r0)
            boolean r0 = r7.f1969S
            if (r0 != 0) goto L_0x0195
            android.os.Bundle r0 = r7.f1975c
            r6.m1527a(r7, r0)
            android.os.Bundle r0 = r7.f1975c
            r7.mo1940b(r0)
            android.os.Bundle r0 = r7.f1975c
            r6.m1538b(r7, r0)
            goto L_0x019c
        L_0x0195:
            android.os.Bundle r0 = r7.f1975c
            r7.mo1935a(r0)
            r7.f1974b = r8
        L_0x019c:
            r7.f1955E = r13
        L_0x019e:
            boolean r0 = r7.f1986n
            r1 = 8
            if (r0 == 0) goto L_0x01d9
            boolean r0 = r7.f1989q
            if (r0 != 0) goto L_0x01d9
            android.os.Bundle r0 = r7.f1975c
            r16.mo1947i()
            android.os.Bundle r0 = r7.f1975c
            r16.mo1960w()
            android.view.View r0 = r7.f1960J
            if (r0 == 0) goto L_0x01d7
            android.view.View r0 = r7.f1960J
            r7.f1961K = r0
            android.view.View r0 = r7.f1960J
            r0.setSaveFromParentEnabled(r13)
            boolean r0 = r7.f1952B
            if (r0 == 0) goto L_0x01c8
            android.view.View r0 = r7.f1960J
            r0.setVisibility(r1)
        L_0x01c8:
            android.view.View r0 = r7.f1960J
            android.os.Bundle r0 = r7.f1975c
            p000.C0457hp.m1435n()
            android.view.View r0 = r7.f1960J
            android.os.Bundle r2 = r7.f1975c
            r6.m1528a(r7, r0, r2)
            goto L_0x01d9
        L_0x01d7:
            r7.f1961K = r14
        L_0x01d9:
            if (r11 <= r8) goto L_0x0319
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x01f2
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto ACTIVITY_CREATED: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r0, r2)
        L_0x01f2:
            boolean r0 = r7.f1986n
            if (r0 != 0) goto L_0x02ce
            int r0 = r7.f1998z
            if (r0 == 0) goto L_0x0282
            int r0 = r7.f1998z
            if (r0 != r12) goto L_0x0219
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot create fragment "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = " for a container view with no id"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r6.m1530a(r0)
        L_0x0219:
            hr r0 = r6.f2066n
            int r2 = r7.f1998z
            android.view.View r0 = r0.mo1965a(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0283
            boolean r2 = r7.f1988p
            if (r2 != 0) goto L_0x0283
            android.content.Context r2 = r16.mo1943d()     // Catch:{ NotFoundException -> 0x0253 }
            if (r2 != 0) goto L_0x0248
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ NotFoundException -> 0x0253 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x0253 }
            java.lang.String r4 = "Fragment "
            r3.<init>(r4)     // Catch:{ NotFoundException -> 0x0253 }
            r3.append(r7)     // Catch:{ NotFoundException -> 0x0253 }
            java.lang.String r4 = " not attached to a context."
            r3.append(r4)     // Catch:{ NotFoundException -> 0x0253 }
            java.lang.String r3 = r3.toString()     // Catch:{ NotFoundException -> 0x0253 }
            r2.<init>(r3)     // Catch:{ NotFoundException -> 0x0253 }
            throw r2     // Catch:{ NotFoundException -> 0x0253 }
        L_0x0248:
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ NotFoundException -> 0x0253 }
            int r3 = r7.f1998z     // Catch:{ NotFoundException -> 0x0253 }
            java.lang.String r2 = r2.getResourceName(r3)     // Catch:{ NotFoundException -> 0x0253 }
            goto L_0x0255
        L_0x0253:
            java.lang.String r2 = "unknown"
        L_0x0255:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "No view found for id 0x"
            r4.<init>(r5)
            int r5 = r7.f1998z
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r4.append(r5)
            java.lang.String r5 = " ("
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ") for fragment "
            r4.append(r2)
            r4.append(r7)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            r6.m1530a(r3)
            goto L_0x0283
        L_0x0282:
            r0 = r14
        L_0x0283:
            r7.f1959I = r0
            android.os.Bundle r2 = r7.f1975c
            r16.mo1947i()
            android.os.Bundle r2 = r7.f1975c
            r16.mo1960w()
            android.view.View r2 = r7.f1960J
            if (r2 == 0) goto L_0x02cc
            android.view.View r2 = r7.f1960J
            r7.f1961K = r2
            android.view.View r2 = r7.f1960J
            r2.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x02a3
            android.view.View r2 = r7.f1960J
            r0.addView(r2)
        L_0x02a3:
            boolean r0 = r7.f1952B
            if (r0 == 0) goto L_0x02ac
            android.view.View r0 = r7.f1960J
            r0.setVisibility(r1)
        L_0x02ac:
            android.view.View r0 = r7.f1960J
            android.os.Bundle r0 = r7.f1975c
            p000.C0457hp.m1435n()
            android.view.View r0 = r7.f1960J
            android.os.Bundle r1 = r7.f1975c
            r6.m1528a(r7, r0, r1)
            android.view.View r0 = r7.f1960J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02c8
            android.view.ViewGroup r0 = r7.f1959I
            if (r0 == 0) goto L_0x02c8
            r0 = r8
            goto L_0x02c9
        L_0x02c8:
            r0 = r13
        L_0x02c9:
            r7.f1965O = r0
            goto L_0x02ce
        L_0x02cc:
            r7.f1961K = r14
        L_0x02ce:
            android.os.Bundle r0 = r7.f1975c
            r16.mo1961x()
            android.os.Bundle r0 = r7.f1975c
            r6.m1542c(r7, r0)
            android.view.View r0 = r7.f1960J
            if (r0 == 0) goto L_0x0317
            android.os.Bundle r0 = r7.f1975c
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f1976d
            if (r0 == 0) goto L_0x02eb
            android.view.View r0 = r7.f1961K
            android.util.SparseArray<android.os.Parcelable> r1 = r7.f1976d
            r0.restoreHierarchyState(r1)
            r7.f1976d = r14
        L_0x02eb:
            r7.f1958H = r13
            r7.f1958H = r8
            android.view.View r0 = r7.f1960J
            if (r0 == 0) goto L_0x02fa
            iq r0 = r7.f1971U
            in$a r1 = p000.C0522in.C0523a.ON_CREATE
            r0.mo2124a(r1)
        L_0x02fa:
            boolean r0 = r7.f1958H
            if (r0 != 0) goto L_0x0317
            ie r0 = new ie
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onViewStateRestored()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0317:
            r7.f1975c = r14
        L_0x0319:
            if (r11 <= r10) goto L_0x0338
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x0332
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto STARTED: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0332:
            r16.mo1962y()
            r15.m1549k(r16)
        L_0x0338:
            if (r11 <= r9) goto L_0x0666
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x0351
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto RESUMED: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0351:
            r16.mo1963z()
            r15.m1550l(r16)
            r7.f1975c = r14
            r7.f1976d = r14
            goto L_0x0666
        L_0x035d:
            int r0 = r7.f1974b
            if (r0 <= r11) goto L_0x0666
            int r0 = r7.f1974b
            switch(r0) {
                case 1: goto L_0x051b;
                case 2: goto L_0x0412;
                case 3: goto L_0x03c3;
                case 4: goto L_0x0368;
                default: goto L_0x0366;
            }
        L_0x0366:
            goto L_0x0666
        L_0x0368:
            r0 = 4
            if (r11 >= r0) goto L_0x03c3
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x0382
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom RESUMED: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0382:
            android.view.View r0 = r7.f1960J
            if (r0 == 0) goto L_0x038d
            iq r0 = r7.f1971U
            in$a r1 = p000.C0522in.C0523a.ON_PAUSE
            r0.mo2124a(r1)
        L_0x038d:
            iq r0 = r7.f1970T
            in$a r1 = p000.C0522in.C0523a.ON_PAUSE
            r0.mo2124a(r1)
            hv r0 = r7.f1993u
            if (r0 == 0) goto L_0x039d
            hv r0 = r7.f1993u
            r0.mo2006a(r9)
        L_0x039d:
            r7.f1974b = r9
            r7.f1958H = r13
            r7.f1958H = r8
            boolean r0 = r7.f1958H
            if (r0 != 0) goto L_0x03c0
            ie r0 = new ie
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onPause()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03c0:
            r15.m1551m(r16)
        L_0x03c3:
            if (r11 >= r9) goto L_0x0412
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x03dc
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom STARTED: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x03dc:
            iq r0 = r7.f1970T
            in$a r1 = p000.C0522in.C0523a.ON_STOP
            r0.mo2124a(r1)
            hv r0 = r7.f1993u
            if (r0 == 0) goto L_0x03ec
            hv r0 = r7.f1993u
            r0.mo2034k()
        L_0x03ec:
            r7.f1974b = r10
            r7.f1958H = r13
            r7.f1958H = r8
            boolean r0 = r7.f1958H
            if (r0 != 0) goto L_0x040f
            ie r0 = new ie
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onStop()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x040f:
            r15.m1552n(r16)
        L_0x0412:
            if (r11 >= r10) goto L_0x051b
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x042b
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x042b:
            android.view.View r0 = r7.f1960J
            if (r0 == 0) goto L_0x043e
            ht r0 = r6.f2065m
            boolean r0 = r0.mo1993b()
            if (r0 == 0) goto L_0x043e
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f1976d
            if (r0 != 0) goto L_0x043e
            r15.m1548j(r16)
        L_0x043e:
            hv r0 = r7.f1993u
            if (r0 == 0) goto L_0x0447
            hv r0 = r7.f1993u
            r0.mo2006a(r8)
        L_0x0447:
            r7.f1974b = r8
            r7.f1958H = r13
            r7.f1958H = r8
            android.view.View r0 = r7.f1960J
            if (r0 == 0) goto L_0x0458
            iq r0 = r7.f1971U
            in$a r1 = p000.C0522in.C0523a.ON_DESTROY
            r0.mo2124a(r1)
        L_0x0458:
            boolean r0 = r7.f1958H
            if (r0 != 0) goto L_0x0475
            ie r0 = new ie
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0475:
            jc r0 = p000.C0544jc.m1713a(r16)
            r0.mo2139a()
            r7.f1989q = r13
            r15.m1555o(r16)
            android.view.View r0 = r7.f1960J
            if (r0 == 0) goto L_0x050c
            android.view.ViewGroup r0 = r7.f1959I
            if (r0 == 0) goto L_0x050c
            android.view.ViewGroup r0 = r7.f1959I
            android.view.View r1 = r7.f1960J
            r0.endViewTransition(r1)
            android.view.View r0 = r7.f1960J
            r0.clearAnimation()
            int r0 = r6.f2064l
            r1 = 0
            if (r0 <= 0) goto L_0x04b5
            boolean r0 = r6.f2072u
            if (r0 != 0) goto L_0x04b5
            android.view.View r0 = r7.f1960J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x04b5
            float r0 = r7.f1967Q
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x04b5
            r0 = r18
            r2 = r19
            hv$c r0 = r6.m1522a(r7, r0, r13, r2)
            goto L_0x04b6
        L_0x04b5:
            r0 = r14
        L_0x04b6:
            r7.f1967Q = r1
            if (r0 == 0) goto L_0x0505
            android.view.View r1 = r7.f1960J
            android.view.ViewGroup r2 = r7.f1959I
            r2.startViewTransition(r1)
            r7.mo1939b(r11)
            android.view.animation.Animation r3 = r0.f2094a
            if (r3 == 0) goto L_0x04e9
            hv$e r3 = new hv$e
            android.view.animation.Animation r4 = r0.f2094a
            r3.<init>(r4, r2, r1)
            android.view.View r4 = r7.f1960J
            r7.mo1936a(r4)
            android.view.animation.Animation$AnimationListener r4 = m1518a(r3)
            hv$2 r5 = new hv$2
            r5.<init>(r4, r2, r7)
            r3.setAnimationListener(r5)
            m1524a(r1, r0)
            android.view.View r0 = r7.f1960J
            r0.startAnimation(r3)
            goto L_0x0505
        L_0x04e9:
            android.animation.Animator r3 = r0.f2095b
            android.animation.Animator r4 = r0.f2095b
            r7.mo1934a(r4)
            hv$3 r4 = new hv$3
            r4.<init>(r2, r1, r7)
            r3.addListener(r4)
            android.view.View r1 = r7.f1960J
            r3.setTarget(r1)
            android.view.View r1 = r7.f1960J
            m1524a(r1, r0)
            r3.start()
        L_0x0505:
            android.view.ViewGroup r0 = r7.f1959I
            android.view.View r1 = r7.f1960J
            r0.removeView(r1)
        L_0x050c:
            r7.f1959I = r14
            r7.f1960J = r14
            r7.f1972V = r14
            iu<ip> r0 = r7.f1973W
            r0.mo811a(r14)
            r7.f1961K = r14
            r7.f1987o = r13
        L_0x051b:
            if (r11 > 0) goto L_0x0666
            boolean r0 = r6.f2072u
            if (r0 == 0) goto L_0x0542
            android.view.View r0 = r16.mo1925G()
            if (r0 == 0) goto L_0x0532
            android.view.View r0 = r16.mo1925G()
            r7.mo1936a(r14)
            r0.clearAnimation()
            goto L_0x0542
        L_0x0532:
            android.animation.Animator r0 = r16.mo1926H()
            if (r0 == 0) goto L_0x0542
            android.animation.Animator r0 = r16.mo1926H()
            r7.mo1934a(r14)
            r0.cancel()
        L_0x0542:
            android.view.View r0 = r16.mo1925G()
            if (r0 != 0) goto L_0x0662
            android.animation.Animator r0 = r16.mo1926H()
            if (r0 == 0) goto L_0x0550
            goto L_0x0662
        L_0x0550:
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x0567
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATED: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0567:
            boolean r0 = r7.f1955E
            if (r0 != 0) goto L_0x05c0
            iq r0 = r7.f1970T
            in$a r1 = p000.C0522in.C0523a.ON_DESTROY
            r0.mo2124a(r1)
            hv r0 = r7.f1993u
            if (r0 == 0) goto L_0x057b
            hv r0 = r7.f1993u
            r0.mo2035l()
        L_0x057b:
            r7.f1974b = r13
            r7.f1958H = r13
            r7.f1969S = r13
            r7.f1958H = r8
            hq r0 = r16.mo1944e()
            if (r0 == 0) goto L_0x0591
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0591
            r0 = r8
            goto L_0x0592
        L_0x0591:
            r0 = r13
        L_0x0592:
            ja r1 = r7.f1995w
            if (r1 == 0) goto L_0x059d
            if (r0 != 0) goto L_0x059d
            ja r0 = r7.f1995w
            r0.mo2138a()
        L_0x059d:
            boolean r0 = r7.f1958H
            if (r0 != 0) goto L_0x05ba
            ie r0 = new ie
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onDestroy()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x05ba:
            r7.f1993u = r14
            r15.m1557p(r16)
            goto L_0x05c2
        L_0x05c0:
            r7.f1974b = r13
        L_0x05c2:
            r7.f1958H = r13
            r7.f1958H = r8
            r7.f1968R = r14
            boolean r0 = r7.f1958H
            if (r0 != 0) goto L_0x05e5
            ie r0 = new ie
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onDetach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x05e5:
            hv r0 = r7.f1993u
            if (r0 == 0) goto L_0x060d
            boolean r0 = r7.f1955E
            if (r0 != 0) goto L_0x0606
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Child FragmentManager of "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " was not  destroyed and this fragment is not retaining instance"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0606:
            hv r0 = r7.f1993u
            r0.mo2035l()
            r7.f1993u = r14
        L_0x060d:
            r15.m1559q(r16)
            if (r20 != 0) goto L_0x0666
            boolean r0 = r7.f1955E
            if (r0 != 0) goto L_0x065b
            int r0 = r7.f1978f
            if (r0 < 0) goto L_0x0666
            boolean r0 = f2046a
            if (r0 == 0) goto L_0x0631
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Freeing fragment index "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0631:
            android.util.SparseArray<hp> r0 = r6.f2058f
            int r1 = r7.f1978f
            r0.put(r1, r14)
            r7.f1978f = r12
            r7.f1979g = r14
            r7.f1984l = r13
            r7.f1985m = r13
            r7.f1986n = r13
            r7.f1987o = r13
            r7.f1988p = r13
            r7.f1990r = r13
            r7.f1991s = r14
            r7.f1993u = r14
            r7.f1992t = r14
            r7.f1997y = r13
            r7.f1998z = r13
            r7.f1951A = r14
            r7.f1952B = r13
            r7.f1953C = r13
            r7.f1955E = r13
            goto L_0x0666
        L_0x065b:
            r7.f1992t = r14
            r7.f1996x = r14
            r7.f1991s = r14
            goto L_0x0666
        L_0x0662:
            r7.mo1939b(r11)
            goto L_0x0667
        L_0x0666:
            r8 = r11
        L_0x0667:
            int r0 = r7.f1974b
            if (r0 == r8) goto L_0x0692
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f1974b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r7.f1974b = r8
        L_0x0692:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0472hv.mo2012a(hp, int, int, int, boolean):void");
    }

    /* renamed from: a */
    public final void mo2013a(C0457hp hpVar, boolean z) {
        if (f2046a) {
            StringBuilder sb = new StringBuilder("add: ");
            sb.append(hpVar);
            Log.v("FragmentManager", sb.toString());
        }
        mo2020b(hpVar);
        if (!hpVar.f1953C) {
            if (this.f2057e.contains(hpVar)) {
                StringBuilder sb2 = new StringBuilder("Fragment already added: ");
                sb2.append(hpVar);
                throw new IllegalStateException(sb2.toString());
            }
            synchronized (this.f2057e) {
                this.f2057e.add(hpVar);
            }
            hpVar.f1984l = true;
            hpVar.f1985m = false;
            if (hpVar.f1960J == null) {
                hpVar.f1966P = false;
            }
            if (hpVar.f1956F && hpVar.f1957G) {
                this.f2069r = true;
            }
            if (z) {
                m1547i(hpVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo2014a(C0470ht htVar, C0468hr hrVar, C0457hp hpVar) {
        if (this.f2065m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2065m = htVar;
        this.f2066n = hrVar;
        this.f2067o = hpVar;
    }

    /* renamed from: a */
    public final void mo2001a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (this.f2058f != null) {
            int size = this.f2058f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; i++) {
                    C0457hp hpVar = (C0457hp) this.f2058f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(hpVar);
                    if (hpVar != null) {
                        printWriter.print(sb2);
                        printWriter.print("mFragmentId=#");
                        printWriter.print(Integer.toHexString(hpVar.f1997y));
                        printWriter.print(" mContainerId=#");
                        printWriter.print(Integer.toHexString(hpVar.f1998z));
                        printWriter.print(" mTag=");
                        printWriter.println(hpVar.f1951A);
                        printWriter.print(sb2);
                        printWriter.print("mState=");
                        printWriter.print(hpVar.f1974b);
                        printWriter.print(" mIndex=");
                        printWriter.print(hpVar.f1978f);
                        printWriter.print(" mWho=");
                        printWriter.print(hpVar.f1979g);
                        printWriter.print(" mBackStackNesting=");
                        printWriter.println(hpVar.f1990r);
                        printWriter.print(sb2);
                        printWriter.print("mAdded=");
                        printWriter.print(hpVar.f1984l);
                        printWriter.print(" mRemoving=");
                        printWriter.print(hpVar.f1985m);
                        printWriter.print(" mFromLayout=");
                        printWriter.print(hpVar.f1986n);
                        printWriter.print(" mInLayout=");
                        printWriter.println(hpVar.f1987o);
                        printWriter.print(sb2);
                        printWriter.print("mHidden=");
                        printWriter.print(hpVar.f1952B);
                        printWriter.print(" mDetached=");
                        printWriter.print(hpVar.f1953C);
                        printWriter.print(" mMenuVisible=");
                        printWriter.print(hpVar.f1957G);
                        printWriter.print(" mHasMenu=");
                        printWriter.println(hpVar.f1956F);
                        printWriter.print(sb2);
                        printWriter.print("mRetainInstance=");
                        printWriter.print(hpVar.f1954D);
                        printWriter.print(" mRetaining=");
                        printWriter.print(hpVar.f1955E);
                        printWriter.print(" mUserVisibleHint=");
                        printWriter.println(hpVar.f1963M);
                        if (hpVar.f1991s != null) {
                            printWriter.print(sb2);
                            printWriter.print("mFragmentManager=");
                            printWriter.println(hpVar.f1991s);
                        }
                        if (hpVar.f1992t != null) {
                            printWriter.print(sb2);
                            printWriter.print("mHost=");
                            printWriter.println(hpVar.f1992t);
                        }
                        if (hpVar.f1996x != null) {
                            printWriter.print(sb2);
                            printWriter.print("mParentFragment=");
                            printWriter.println(hpVar.f1996x);
                        }
                        if (hpVar.f1980h != null) {
                            printWriter.print(sb2);
                            printWriter.print("mArguments=");
                            printWriter.println(hpVar.f1980h);
                        }
                        if (hpVar.f1975c != null) {
                            printWriter.print(sb2);
                            printWriter.print("mSavedFragmentState=");
                            printWriter.println(hpVar.f1975c);
                        }
                        if (hpVar.f1976d != null) {
                            printWriter.print(sb2);
                            printWriter.print("mSavedViewState=");
                            printWriter.println(hpVar.f1976d);
                        }
                        if (hpVar.f1981i != null) {
                            printWriter.print(sb2);
                            printWriter.print("mTarget=");
                            printWriter.print(hpVar.f1981i);
                            printWriter.print(" mTargetRequestCode=");
                            printWriter.println(hpVar.f1983k);
                        }
                        if (hpVar.mo1920B() != 0) {
                            printWriter.print(sb2);
                            printWriter.print("mNextAnim=");
                            printWriter.println(hpVar.mo1920B());
                        }
                        if (hpVar.f1959I != null) {
                            printWriter.print(sb2);
                            printWriter.print("mContainer=");
                            printWriter.println(hpVar.f1959I);
                        }
                        if (hpVar.f1960J != null) {
                            printWriter.print(sb2);
                            printWriter.print("mView=");
                            printWriter.println(hpVar.f1960J);
                        }
                        if (hpVar.f1961K != null) {
                            printWriter.print(sb2);
                            printWriter.print("mInnerView=");
                            printWriter.println(hpVar.f1960J);
                        }
                        if (hpVar.mo1925G() != null) {
                            printWriter.print(sb2);
                            printWriter.print("mAnimatingAway=");
                            printWriter.println(hpVar.mo1925G());
                            printWriter.print(sb2);
                            printWriter.print("mStateAfterAnimating=");
                            printWriter.println(hpVar.mo1927I());
                        }
                        if (hpVar.mo1943d() != null) {
                            C0544jc.m1713a(hpVar).mo2140a(sb2, printWriter);
                        }
                        if (hpVar.f1993u != null) {
                            printWriter.print(sb2);
                            StringBuilder sb3 = new StringBuilder("Child ");
                            sb3.append(hpVar.f1993u);
                            sb3.append(":");
                            printWriter.println(sb3.toString());
                            C0472hv hvVar = hpVar.f1993u;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(sb2);
                            sb4.append("  ");
                            hvVar.mo2001a(sb4.toString(), fileDescriptor, printWriter, strArr);
                        }
                    }
                }
            }
        }
        int size2 = this.f2057e.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                C0457hp hpVar2 = (C0457hp) this.f2057e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(hpVar2.toString());
            }
        }
        if (this.f2060h != null) {
            int size3 = this.f2060h.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size3; i3++) {
                    C0457hp hpVar3 = (C0457hp) this.f2060h.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(hpVar3.toString());
                }
            }
        }
        if (this.f2059g != null) {
            int size4 = this.f2059g.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size4; i4++) {
                    C0453hn hnVar = (C0453hn) this.f2059g.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(hnVar.toString());
                    hnVar.mo1905a(sb2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.f2061i != null) {
                int size5 = this.f2061i.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size5; i5++) {
                        C0453hn hnVar2 = (C0453hn) this.f2061i.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(hnVar2);
                    }
                }
            }
            if (this.f2062j != null && this.f2062j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f2062j.toArray()));
            }
        }
        if (this.f2054b != null) {
            int size6 = this.f2054b.size();
            if (size6 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size6; i6++) {
                    C0485g gVar = (C0485g) this.f2054b.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(gVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2065m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2066n);
        if (this.f2067o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2067o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2064l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2070s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2071t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2072u);
        if (this.f2069r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2069r);
        }
        if (this.f2073v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f2073v);
        }
    }

    /* renamed from: a */
    public final void mo2015a(boolean z) {
        for (int size = this.f2057e.size() - 1; size >= 0; size--) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(size);
            if (!(hpVar == null || hpVar.f1993u == null)) {
                hpVar.f1993u.mo2015a(z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2002a() {
        if (mo2004c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f2073v == null) {
            return m1553n();
        } else {
            StringBuilder sb = new StringBuilder("Can not perform this action inside of ");
            sb.append(this.f2073v);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo2016a(Menu menu) {
        boolean z;
        if (this.f2064l <= 0) {
            return false;
        }
        boolean z2 = false;
        for (int i = 0; i < this.f2057e.size(); i++) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(i);
            if (hpVar != null) {
                if (!hpVar.f1952B) {
                    boolean z3 = hpVar.f1956F && hpVar.f1957G;
                    z = hpVar.f1993u != null ? hpVar.f1993u.mo2016a(menu) | z3 : z3;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final boolean mo2017a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.f2064l <= 0) {
            return false;
        }
        ArrayList<C0457hp> arrayList = null;
        boolean z2 = false;
        for (int i = 0; i < this.f2057e.size(); i++) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(i);
            if (hpVar != null) {
                if (!hpVar.f1952B) {
                    z = hpVar.f1956F && hpVar.f1957G;
                    if (hpVar.f1993u != null) {
                        z |= hpVar.f1993u.mo2017a(menu, menuInflater);
                    }
                } else {
                    z = false;
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(hpVar);
                    z2 = true;
                }
            }
        }
        if (this.f2060h != null) {
            for (int i2 = 0; i2 < this.f2060h.size(); i2++) {
                C0457hp hpVar2 = (C0457hp) this.f2060h.get(i2);
                if (arrayList == null || !arrayList.contains(hpVar2)) {
                    C0457hp.m1436o();
                }
            }
        }
        this.f2060h = arrayList;
        return z2;
    }

    /* renamed from: a */
    public final boolean mo2018a(MenuItem menuItem) {
        if (this.f2064l <= 0) {
            return false;
        }
        for (int i = 0; i < this.f2057e.size(); i++) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(i);
            if (hpVar != null) {
                if (!hpVar.f1952B && hpVar.f1993u != null && hpVar.f1993u.mo2018a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final List<C0457hp> mo2003b() {
        List<C0457hp> list;
        if (this.f2057e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2057e) {
            list = (List) this.f2057e.clone();
        }
        return list;
    }

    /* renamed from: b */
    public final void mo2019b(Menu menu) {
        if (this.f2064l > 0) {
            for (int i = 0; i < this.f2057e.size(); i++) {
                C0457hp hpVar = (C0457hp) this.f2057e.get(i);
                if (!(hpVar == null || hpVar.f1952B || hpVar.f1993u == null)) {
                    hpVar.f1993u.mo2019b(menu);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2020b(C0457hp hpVar) {
        if (hpVar.f1978f < 0) {
            int i = this.f2056d;
            this.f2056d = i + 1;
            hpVar.mo1933a(i, this.f2067o);
            if (this.f2058f == null) {
                this.f2058f = new SparseArray<>();
            }
            this.f2058f.put(hpVar.f1978f, hpVar);
            if (f2046a) {
                StringBuilder sb = new StringBuilder("Allocated fragment index ");
                sb.append(hpVar);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo2021b(boolean z) {
        for (int size = this.f2057e.size() - 1; size >= 0; size--) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(size);
            if (!(hpVar == null || hpVar.f1993u == null)) {
                hpVar.f1993u.mo2021b(z);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo2022b(MenuItem menuItem) {
        if (this.f2064l <= 0) {
            return false;
        }
        for (int i = 0; i < this.f2057e.size(); i++) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(i);
            if (hpVar != null) {
                if (!hpVar.f1952B && hpVar.f1993u != null && hpVar.f1993u.mo2022b(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo2023c(C0457hp hpVar) {
        if (f2046a) {
            StringBuilder sb = new StringBuilder("remove: ");
            sb.append(hpVar);
            sb.append(" nesting=");
            sb.append(hpVar.f1990r);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !hpVar.mo1941b();
        if (!hpVar.f1953C || z) {
            synchronized (this.f2057e) {
                this.f2057e.remove(hpVar);
            }
            if (hpVar.f1956F && hpVar.f1957G) {
                this.f2069r = true;
            }
            hpVar.f1984l = false;
            hpVar.f1985m = true;
        }
    }

    /* renamed from: c */
    public final boolean mo2004c() {
        return this.f2070s || this.f2071t;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final boolean mo2024d() {
        m1556p();
        boolean z = false;
        while (m1543c(this.f2075x, this.f2076y)) {
            this.f2055c = true;
            try {
                m1539b(this.f2075x, this.f2076y);
                m1558q();
                z = true;
            } catch (Throwable th) {
                m1558q();
                throw th;
            }
        }
        m1560r();
        m1563u();
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Parcelable mo2025e() {
        C0455ho[] hoVarArr;
        int[] iArr;
        Bundle bundle;
        if (this.f2050C != null) {
            while (!this.f2050C.isEmpty()) {
                ((C0486h) this.f2050C.remove(0)).mo2053c();
            }
        }
        int size = this.f2058f == null ? 0 : this.f2058f.size();
        int i = 0;
        while (true) {
            hoVarArr = null;
            if (i >= size) {
                break;
            }
            C0457hp hpVar = (C0457hp) this.f2058f.valueAt(i);
            if (hpVar != null) {
                if (hpVar.mo1925G() != null) {
                    int I = hpVar.mo1927I();
                    View G = hpVar.mo1925G();
                    Animation animation = G.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        G.clearAnimation();
                    }
                    hpVar.mo1936a((View) null);
                    mo2012a(hpVar, I, 0, 0, false);
                } else if (hpVar.mo1926H() != null) {
                    hpVar.mo1926H().end();
                }
            }
            i++;
        }
        mo2024d();
        this.f2070s = true;
        this.f2051D = null;
        if (this.f2058f == null || this.f2058f.size() <= 0) {
            return null;
        }
        int size2 = this.f2058f.size();
        C0490hy[] hyVarArr = new C0490hy[size2];
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            C0457hp hpVar2 = (C0457hp) this.f2058f.valueAt(i2);
            if (hpVar2 != null) {
                if (hpVar2.f1978f < 0) {
                    StringBuilder sb = new StringBuilder("Failure saving state: active ");
                    sb.append(hpVar2);
                    sb.append(" has cleared index: ");
                    sb.append(hpVar2.f1978f);
                    m1530a((RuntimeException) new IllegalStateException(sb.toString()));
                }
                C0490hy hyVar = new C0490hy(hpVar2);
                hyVarArr[i2] = hyVar;
                if (hpVar2.f1974b <= 0 || hyVar.f2123k != null) {
                    hyVar.f2123k = hpVar2.f1975c;
                } else {
                    if (this.f2048A == null) {
                        this.f2048A = new Bundle();
                    }
                    hpVar2.mo1942c(this.f2048A);
                    m1545d(hpVar2, this.f2048A);
                    if (!this.f2048A.isEmpty()) {
                        bundle = this.f2048A;
                        this.f2048A = null;
                    } else {
                        bundle = null;
                    }
                    if (hpVar2.f1960J != null) {
                        m1548j(hpVar2);
                    }
                    if (hpVar2.f1976d != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", hpVar2.f1976d);
                    }
                    if (!hpVar2.f1963M) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", hpVar2.f1963M);
                    }
                    hyVar.f2123k = bundle;
                    if (hpVar2.f1981i != null) {
                        if (hpVar2.f1981i.f1978f < 0) {
                            StringBuilder sb2 = new StringBuilder("Failure saving state: ");
                            sb2.append(hpVar2);
                            sb2.append(" has target not in fragment manager: ");
                            sb2.append(hpVar2.f1981i);
                            m1530a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        if (hyVar.f2123k == null) {
                            hyVar.f2123k = new Bundle();
                        }
                        Bundle bundle2 = hyVar.f2123k;
                        String str = "android:target_state";
                        C0457hp hpVar3 = hpVar2.f1981i;
                        if (hpVar3.f1978f < 0) {
                            StringBuilder sb3 = new StringBuilder("Fragment ");
                            sb3.append(hpVar3);
                            sb3.append(" is not currently in the FragmentManager");
                            m1530a((RuntimeException) new IllegalStateException(sb3.toString()));
                        }
                        bundle2.putInt(str, hpVar3.f1978f);
                        if (hpVar2.f1983k != 0) {
                            hyVar.f2123k.putInt("android:target_req_state", hpVar2.f1983k);
                        }
                    }
                }
                if (f2046a) {
                    StringBuilder sb4 = new StringBuilder("Saved state of ");
                    sb4.append(hpVar2);
                    sb4.append(": ");
                    sb4.append(hyVar.f2123k);
                    Log.v("FragmentManager", sb4.toString());
                }
                z = true;
            }
        }
        if (!z) {
            if (f2046a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f2057e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                iArr[i3] = ((C0457hp) this.f2057e.get(i3)).f1978f;
                if (iArr[i3] < 0) {
                    StringBuilder sb5 = new StringBuilder("Failure saving state: active ");
                    sb5.append(this.f2057e.get(i3));
                    sb5.append(" has cleared index: ");
                    sb5.append(iArr[i3]);
                    m1530a((RuntimeException) new IllegalStateException(sb5.toString()));
                }
                if (f2046a) {
                    StringBuilder sb6 = new StringBuilder("saveAllState: adding fragment #");
                    sb6.append(i3);
                    sb6.append(": ");
                    sb6.append(this.f2057e.get(i3));
                    Log.v("FragmentManager", sb6.toString());
                }
            }
        } else {
            iArr = null;
        }
        if (this.f2059g != null) {
            int size4 = this.f2059g.size();
            if (size4 > 0) {
                hoVarArr = new C0455ho[size4];
                for (int i4 = 0; i4 < size4; i4++) {
                    hoVarArr[i4] = new C0455ho((C0453hn) this.f2059g.get(i4));
                    if (f2046a) {
                        StringBuilder sb7 = new StringBuilder("saveAllState: adding back stack #");
                        sb7.append(i4);
                        sb7.append(": ");
                        sb7.append(this.f2059g.get(i4));
                        Log.v("FragmentManager", sb7.toString());
                    }
                }
            }
        }
        C0488hx hxVar = new C0488hx();
        hxVar.f2108a = hyVarArr;
        hxVar.f2109b = iArr;
        hxVar.f2110c = hoVarArr;
        if (this.f2068p != null) {
            hxVar.f2111d = this.f2068p.f1978f;
        }
        hxVar.f2112e = this.f2056d;
        m1562t();
        return hxVar;
    }

    /* renamed from: f */
    public final void mo2026f() {
        this.f2051D = null;
        this.f2070s = false;
        this.f2071t = false;
        int size = this.f2057e.size();
        for (int i = 0; i < size; i++) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(i);
            if (!(hpVar == null || hpVar.f1993u == null)) {
                hpVar.f1993u.mo2026f();
            }
        }
    }

    /* renamed from: f */
    public final void mo2027f(C0457hp hpVar) {
        if (f2046a) {
            StringBuilder sb = new StringBuilder("detach: ");
            sb.append(hpVar);
            Log.v("FragmentManager", sb.toString());
        }
        if (!hpVar.f1953C) {
            hpVar.f1953C = true;
            if (hpVar.f1984l) {
                if (f2046a) {
                    StringBuilder sb2 = new StringBuilder("remove from detach: ");
                    sb2.append(hpVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f2057e) {
                    this.f2057e.remove(hpVar);
                }
                if (hpVar.f1956F && hpVar.f1957G) {
                    this.f2069r = true;
                }
                hpVar.f1984l = false;
            }
        }
    }

    /* renamed from: g */
    public final void mo2028g() {
        this.f2070s = false;
        this.f2071t = false;
        mo2006a(1);
    }

    /* renamed from: g */
    public final void mo2029g(C0457hp hpVar) {
        if (f2046a) {
            StringBuilder sb = new StringBuilder("attach: ");
            sb.append(hpVar);
            Log.v("FragmentManager", sb.toString());
        }
        if (hpVar.f1953C) {
            hpVar.f1953C = false;
            if (!hpVar.f1984l) {
                if (this.f2057e.contains(hpVar)) {
                    StringBuilder sb2 = new StringBuilder("Fragment already added: ");
                    sb2.append(hpVar);
                    throw new IllegalStateException(sb2.toString());
                }
                if (f2046a) {
                    StringBuilder sb3 = new StringBuilder("add from attach: ");
                    sb3.append(hpVar);
                    Log.v("FragmentManager", sb3.toString());
                }
                synchronized (this.f2057e) {
                    this.f2057e.add(hpVar);
                }
                hpVar.f1984l = true;
                if (hpVar.f1956F && hpVar.f1957G) {
                    this.f2069r = true;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo2030h() {
        this.f2070s = false;
        this.f2071t = false;
        mo2006a(2);
    }

    /* renamed from: h */
    public final void mo2031h(C0457hp hpVar) {
        if (hpVar == null || (this.f2058f.get(hpVar.f1978f) == hpVar && (hpVar.f1992t == null || hpVar.f1991s == this))) {
            this.f2068p = hpVar;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(hpVar);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    public final void mo2032i() {
        this.f2070s = false;
        this.f2071t = false;
        mo2006a(3);
    }

    /* renamed from: j */
    public final void mo2033j() {
        this.f2070s = false;
        this.f2071t = false;
        mo2006a(4);
    }

    /* renamed from: k */
    public final void mo2034k() {
        this.f2071t = true;
        mo2006a(2);
    }

    /* renamed from: l */
    public final void mo2035l() {
        this.f2072u = true;
        mo2024d();
        mo2006a(0);
        this.f2065m = null;
        this.f2066n = null;
        this.f2067o = null;
    }

    /* renamed from: m */
    public final void mo2036m() {
        for (int i = 0; i < this.f2057e.size(); i++) {
            C0457hp hpVar = (C0457hp) this.f2057e.get(i);
            if (hpVar != null) {
                hpVar.onLowMemory();
                if (hpVar.f1993u != null) {
                    hpVar.f1993u.mo2036m();
                }
            }
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0457hp hpVar;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0484f.f2101a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0457hp.m1428a(this.f2065m.f2039c, str2)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        C0457hp c = resourceId != -1 ? m1541c(resourceId) : null;
        if (c == null && string != null) {
            c = m1535b(string);
        }
        if (c == null && i != -1) {
            c = m1541c(i);
        }
        if (f2046a) {
            StringBuilder sb2 = new StringBuilder("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(str2);
            sb2.append(" existing=");
            sb2.append(c);
            Log.v("FragmentManager", sb2.toString());
        }
        if (c == null) {
            C0457hp a = this.f2066n.mo1966a(context2, str2, null);
            a.f1986n = true;
            a.f1997y = resourceId != 0 ? resourceId : i;
            a.f1998z = i;
            a.f1951A = string;
            a.f1987o = true;
            a.f1991s = this;
            a.f1992t = this.f2065m;
            Bundle bundle = a.f1975c;
            a.mo1948j();
            mo2013a(a, true);
            hpVar = a;
        } else if (c.f1987o) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(" with another fragment for ");
            sb3.append(str2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            c.f1987o = true;
            c.f1992t = this.f2065m;
            if (!c.f1955E) {
                Bundle bundle2 = c.f1975c;
                c.mo1948j();
            }
            hpVar = c;
        }
        if (this.f2064l > 0 || !hpVar.f1986n) {
            m1547i(hpVar);
        } else {
            mo2012a(hpVar, 1, 0, 0, false);
        }
        if (hpVar.f1960J == null) {
            StringBuilder sb4 = new StringBuilder("Fragment ");
            sb4.append(str2);
            sb4.append(" did not create a view.");
            throw new IllegalStateException(sb4.toString());
        }
        if (resourceId != 0) {
            hpVar.f1960J.setId(resourceId);
        }
        if (hpVar.f1960J.getTag() == null) {
            hpVar.f1960J.setTag(string);
        }
        return hpVar.f1960J;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0374fz.m1183a(this.f2067o != null ? this.f2067o : this.f2065m, sb);
        sb.append("}}");
        return sb.toString();
    }
}
