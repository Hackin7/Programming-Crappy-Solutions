package p000;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.lang.reflect.InvocationTargetException;

/* renamed from: hp */
public class C0457hp implements ComponentCallbacks, OnCreateContextMenuListener, C0526ip, C0543jb {

    /* renamed from: X */
    private static final C0256dk<String, Class<?>> f1949X = new C0256dk<>();

    /* renamed from: a */
    static final Object f1950a = new Object();

    /* renamed from: A */
    String f1951A;

    /* renamed from: B */
    boolean f1952B;

    /* renamed from: C */
    boolean f1953C;

    /* renamed from: D */
    boolean f1954D;

    /* renamed from: E */
    boolean f1955E;

    /* renamed from: F */
    boolean f1956F;

    /* renamed from: G */
    boolean f1957G = true;

    /* renamed from: H */
    boolean f1958H;

    /* renamed from: I */
    ViewGroup f1959I;

    /* renamed from: J */
    View f1960J;

    /* renamed from: K */
    View f1961K;

    /* renamed from: L */
    boolean f1962L;

    /* renamed from: M */
    boolean f1963M = true;

    /* renamed from: N */
    C0461a f1964N;

    /* renamed from: O */
    boolean f1965O;

    /* renamed from: P */
    boolean f1966P;

    /* renamed from: Q */
    float f1967Q;

    /* renamed from: R */
    LayoutInflater f1968R;

    /* renamed from: S */
    boolean f1969S;

    /* renamed from: T */
    C0527iq f1970T = new C0527iq(this);

    /* renamed from: U */
    C0527iq f1971U;

    /* renamed from: V */
    C0526ip f1972V;

    /* renamed from: W */
    C0533iu<C0526ip> f1973W = new C0533iu<>();

    /* renamed from: b */
    int f1974b = 0;

    /* renamed from: c */
    Bundle f1975c;

    /* renamed from: d */
    SparseArray<Parcelable> f1976d;

    /* renamed from: e */
    Boolean f1977e;

    /* renamed from: f */
    int f1978f = -1;

    /* renamed from: g */
    String f1979g;

    /* renamed from: h */
    Bundle f1980h;

    /* renamed from: i */
    C0457hp f1981i;

    /* renamed from: j */
    int f1982j = -1;

    /* renamed from: k */
    int f1983k;

    /* renamed from: l */
    boolean f1984l;

    /* renamed from: m */
    boolean f1985m;

    /* renamed from: n */
    boolean f1986n;

    /* renamed from: o */
    boolean f1987o;

    /* renamed from: p */
    boolean f1988p;

    /* renamed from: q */
    boolean f1989q;

    /* renamed from: r */
    int f1990r;

    /* renamed from: s */
    C0472hv f1991s;

    /* renamed from: t */
    C0470ht f1992t;

    /* renamed from: u */
    C0472hv f1993u;

    /* renamed from: v */
    C0487hw f1994v;

    /* renamed from: w */
    C0542ja f1995w;

    /* renamed from: x */
    C0457hp f1996x;

    /* renamed from: y */
    int f1997y;

    /* renamed from: z */
    int f1998z;

    /* renamed from: hp$a */
    static class C0461a {

        /* renamed from: a */
        View f2002a;

        /* renamed from: b */
        Animator f2003b;

        /* renamed from: c */
        int f2004c;

        /* renamed from: d */
        int f2005d;

        /* renamed from: e */
        int f2006e;

        /* renamed from: f */
        int f2007f;

        /* renamed from: g */
        Object f2008g = null;

        /* renamed from: h */
        Object f2009h = C0457hp.f1950a;

        /* renamed from: i */
        Object f2010i = null;

        /* renamed from: j */
        Object f2011j = C0457hp.f1950a;

        /* renamed from: k */
        Object f2012k = null;

        /* renamed from: l */
        Object f2013l = C0457hp.f1950a;

        /* renamed from: m */
        Boolean f2014m;

        /* renamed from: n */
        Boolean f2015n;

        /* renamed from: o */
        C0310et f2016o = null;

        /* renamed from: p */
        C0310et f2017p = null;

        /* renamed from: q */
        boolean f2018q;

        /* renamed from: r */
        C0463c f2019r;

        /* renamed from: s */
        boolean f2020s;

        C0461a() {
        }
    }

    /* renamed from: hp$b */
    public static class C0462b extends RuntimeException {
        public C0462b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: hp$c */
    interface C0463c {
        /* renamed from: a */
        void mo1968a();

        /* renamed from: b */
        void mo1969b();
    }

    /* renamed from: L */
    private void m1426L() {
        if (this.f1992t == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f1993u = new C0472hv();
        this.f1993u.mo2014a(this.f1992t, (C0468hr) new C0468hr() {
            /* renamed from: a */
            public final View mo1965a(int i) {
                if (C0457hp.this.f1960J != null) {
                    return C0457hp.this.f1960J.findViewById(i);
                }
                throw new IllegalStateException("Fragment does not have a view");
            }

            /* renamed from: a */
            public final C0457hp mo1966a(Context context, String str, Bundle bundle) {
                return C0457hp.this.f1992t.mo1966a(context, str, bundle);
            }

            /* renamed from: a */
            public final boolean mo1967a() {
                return C0457hp.this.f1960J != null;
            }
        }, this);
    }

    /* renamed from: a */
    public static C0457hp m1427a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) f1949X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1949X.put(str, cls);
            }
            boolean z = false;
            C0457hp hpVar = (C0457hp) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(hpVar.getClass().getClassLoader());
                if (hpVar.f1978f >= 0) {
                    if (hpVar.f1991s != null) {
                        z = hpVar.f1991s.mo2004c();
                    }
                    if (z) {
                        throw new IllegalStateException("Fragment already active and state has been saved");
                    }
                }
                hpVar.f1980h = bundle;
            }
            return hpVar;
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0462b(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0462b(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0462b(sb3.toString(), e3);
        } catch (NoSuchMethodException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": could not find Fragment constructor");
            throw new C0462b(sb4.toString(), e4);
        } catch (InvocationTargetException e5) {
            StringBuilder sb5 = new StringBuilder("Unable to instantiate fragment ");
            sb5.append(str);
            sb5.append(": calling Fragment constructor caused an exception");
            throw new C0462b(sb5.toString(), e5);
        }
    }

    /* renamed from: a */
    static boolean m1428a(Context context, String str) {
        try {
            Class cls = (Class) f1949X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1949X.put(str, cls);
            }
            return C0457hp.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m1429f() {
    }

    /* renamed from: g */
    public static void m1430g() {
    }

    /* renamed from: h */
    public static void m1431h() {
    }

    /* renamed from: k */
    public static void m1432k() {
    }

    /* renamed from: l */
    public static Animation m1433l() {
        return null;
    }

    /* renamed from: m */
    public static Animator m1434m() {
        return null;
    }

    /* renamed from: n */
    public static void m1435n() {
    }

    /* renamed from: o */
    public static void m1436o() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final C0461a mo1919A() {
        if (this.f1964N == null) {
            this.f1964N = new C0461a();
        }
        return this.f1964N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final int mo1920B() {
        if (this.f1964N == null) {
            return 0;
        }
        return this.f1964N.f2005d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public final int mo1921C() {
        if (this.f1964N == null) {
            return 0;
        }
        return this.f1964N.f2006e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final int mo1922D() {
        if (this.f1964N == null) {
            return 0;
        }
        return this.f1964N.f2007f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final C0310et mo1923E() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2016o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final C0310et mo1924F() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2017p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final View mo1925G() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2002a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public final Animator mo1926H() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2003b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public final int mo1927I() {
        if (this.f1964N == null) {
            return 0;
        }
        return this.f1964N.f2004c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public final boolean mo1928J() {
        if (this.f1964N == null) {
            return false;
        }
        return this.f1964N.f2018q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public final boolean mo1929K() {
        if (this.f1964N == null) {
            return false;
        }
        return this.f1964N.f2020s;
    }

    /* renamed from: a */
    public final C0542ja mo1930a() {
        if (mo1943d() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f1995w == null) {
            this.f1995w = new C0542ja();
        }
        return this.f1995w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1931a(int i) {
        if (this.f1964N != null || i != 0) {
            mo1919A().f2005d = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1932a(int i, int i2) {
        if (this.f1964N != null || i != 0 || i2 != 0) {
            mo1919A();
            this.f1964N.f2006e = i;
            this.f1964N.f2007f = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1933a(int i, C0457hp hpVar) {
        StringBuilder sb;
        this.f1978f = i;
        if (hpVar != null) {
            sb = new StringBuilder();
            sb.append(hpVar.f1979g);
            sb.append(":");
        } else {
            sb = new StringBuilder("android:fragment:");
        }
        sb.append(this.f1978f);
        this.f1979g = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1934a(Animator animator) {
        mo1919A().f2003b = animator;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1935a(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f1993u == null) {
                    m1426L();
                }
                this.f1993u.mo2009a(parcelable, this.f1994v);
                this.f1994v = null;
                this.f1993u.mo2028g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1936a(View view) {
        mo1919A().f2002a = view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1937a(C0463c cVar) {
        mo1919A();
        if (cVar != this.f1964N.f2019r) {
            if (cVar == null || this.f1964N.f2019r == null) {
                if (this.f1964N.f2018q) {
                    this.f1964N.f2019r = cVar;
                }
                if (cVar != null) {
                    cVar.mo1969b();
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1938a(boolean z) {
        mo1919A().f2020s = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1939b(int i) {
        mo1919A().f2004c = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1940b(Bundle bundle) {
        if (this.f1993u != null) {
            this.f1993u.mo2026f();
        }
        this.f1974b = 1;
        boolean z = false;
        this.f1958H = false;
        this.f1958H = true;
        mo1935a(bundle);
        if (this.f1993u != null) {
            if (this.f1993u.f2064l > 0) {
                z = true;
            }
            if (!z) {
                this.f1993u.mo2028g();
            }
        }
        this.f1969S = true;
        if (!this.f1958H) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onCreate()");
            throw new C0511ie(sb.toString());
        }
        this.f1970T.mo2124a(C0523a.ON_CREATE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo1941b() {
        return this.f1990r > 0;
    }

    /* renamed from: c */
    public final C0522in mo1688c() {
        return this.f1970T;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo1942c(Bundle bundle) {
        if (this.f1993u != null) {
            Parcelable e = this.f1993u.mo2025e();
            if (e != null) {
                bundle.putParcelable("android:support:fragments", e);
            }
        }
    }

    /* renamed from: d */
    public final Context mo1943d() {
        if (this.f1992t == null) {
            return null;
        }
        return this.f1992t.f2039c;
    }

    /* renamed from: e */
    public final C0464hq mo1944e() {
        if (this.f1992t == null) {
            return null;
        }
        return (C0464hq) this.f1992t.f2038b;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final LayoutInflater mo1947i() {
        if (this.f1992t == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater c = this.f1992t.mo1994c();
        if (this.f1993u == null) {
            m1426L();
            if (this.f1974b >= 4) {
                this.f1993u.mo2033j();
            } else if (this.f1974b >= 3) {
                this.f1993u.mo2032i();
            } else if (this.f1974b >= 2) {
                this.f1993u.mo2030h();
            } else if (this.f1974b > 0) {
                this.f1993u.mo2028g();
            }
        }
        C0387gh.m1237a(c, this.f1993u);
        this.f1968R = c;
        return this.f1968R;
    }

    /* renamed from: j */
    public final void mo1948j() {
        this.f1958H = true;
        if ((this.f1992t == null ? null : this.f1992t.f2038b) != null) {
            this.f1958H = false;
            this.f1958H = true;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1958H = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        mo1944e().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f1958H = true;
    }

    /* renamed from: p */
    public final Object mo1952p() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2008g;
    }

    /* renamed from: q */
    public final Object mo1953q() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2009h == f1950a ? mo1952p() : this.f1964N.f2009h;
    }

    /* renamed from: r */
    public final Object mo1954r() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2010i;
    }

    /* renamed from: s */
    public final Object mo1955s() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2011j == f1950a ? mo1954r() : this.f1964N.f2011j;
    }

    /* renamed from: t */
    public final Object mo1956t() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2012k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0374fz.m1183a(this, sb);
        if (this.f1978f >= 0) {
            sb.append(" #");
            sb.append(this.f1978f);
        }
        if (this.f1997y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1997y));
        }
        if (this.f1951A != null) {
            sb.append(" ");
            sb.append(this.f1951A);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final Object mo1958u() {
        if (this.f1964N == null) {
            return null;
        }
        return this.f1964N.f2013l == f1950a ? mo1956t() : this.f1964N.f2013l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final void mo1959v() {
        C0463c cVar;
        if (this.f1964N == null) {
            cVar = null;
        } else {
            this.f1964N.f2018q = false;
            cVar = this.f1964N.f2019r;
            this.f1964N.f2019r = null;
        }
        if (cVar != null) {
            cVar.mo1968a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo1960w() {
        if (this.f1993u != null) {
            this.f1993u.mo2026f();
        }
        this.f1989q = true;
        this.f1972V = new C0526ip() {
            /* renamed from: c */
            public final C0522in mo1688c() {
                if (C0457hp.this.f1971U == null) {
                    C0457hp.this.f1971U = new C0527iq(C0457hp.this.f1972V);
                }
                return C0457hp.this.f1971U;
            }
        };
        this.f1971U = null;
        this.f1960J = null;
        if (this.f1960J != null) {
            this.f1972V.mo1688c();
            this.f1973W.mo811a(this.f1972V);
        } else if (this.f1971U != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.f1972V = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final void mo1961x() {
        if (this.f1993u != null) {
            this.f1993u.mo2026f();
        }
        this.f1974b = 2;
        this.f1958H = false;
        this.f1958H = true;
        if (!this.f1958H) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onActivityCreated()");
            throw new C0511ie(sb.toString());
        } else if (this.f1993u != null) {
            this.f1993u.mo2030h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final void mo1962y() {
        if (this.f1993u != null) {
            this.f1993u.mo2026f();
            this.f1993u.mo2024d();
        }
        this.f1974b = 3;
        this.f1958H = false;
        this.f1958H = true;
        if (!this.f1958H) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStart()");
            throw new C0511ie(sb.toString());
        }
        if (this.f1993u != null) {
            this.f1993u.mo2032i();
        }
        this.f1970T.mo2124a(C0523a.ON_START);
        if (this.f1960J != null) {
            this.f1971U.mo2124a(C0523a.ON_START);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final void mo1963z() {
        if (this.f1993u != null) {
            this.f1993u.mo2026f();
            this.f1993u.mo2024d();
        }
        this.f1974b = 4;
        this.f1958H = false;
        this.f1958H = true;
        if (!this.f1958H) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onResume()");
            throw new C0511ie(sb.toString());
        }
        if (this.f1993u != null) {
            this.f1993u.mo2033j();
            this.f1993u.mo2024d();
        }
        this.f1970T.mo2124a(C0523a.ON_RESUME);
        if (this.f1960J != null) {
            this.f1971U.mo2124a(C0523a.ON_RESUME);
        }
    }
}
