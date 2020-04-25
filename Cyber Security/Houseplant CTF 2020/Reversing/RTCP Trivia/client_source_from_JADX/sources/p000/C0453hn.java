package p000;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: hn */
final class C0453hn extends C0492hz implements C0485g {

    /* renamed from: a */
    final C0472hv f1910a;

    /* renamed from: b */
    ArrayList<C0454a> f1911b = new ArrayList<>();

    /* renamed from: c */
    int f1912c;

    /* renamed from: d */
    int f1913d;

    /* renamed from: e */
    int f1914e;

    /* renamed from: f */
    int f1915f;

    /* renamed from: g */
    int f1916g;

    /* renamed from: h */
    int f1917h;

    /* renamed from: i */
    boolean f1918i;

    /* renamed from: j */
    boolean f1919j = true;

    /* renamed from: k */
    String f1920k;

    /* renamed from: l */
    boolean f1921l;

    /* renamed from: m */
    int f1922m = -1;

    /* renamed from: n */
    int f1923n;

    /* renamed from: o */
    CharSequence f1924o;

    /* renamed from: p */
    int f1925p;

    /* renamed from: q */
    CharSequence f1926q;

    /* renamed from: r */
    ArrayList<String> f1927r;

    /* renamed from: s */
    ArrayList<String> f1928s;

    /* renamed from: t */
    boolean f1929t = false;

    /* renamed from: u */
    ArrayList<Runnable> f1930u;

    /* renamed from: hn$a */
    static final class C0454a {

        /* renamed from: a */
        int f1931a;

        /* renamed from: b */
        C0457hp f1932b;

        /* renamed from: c */
        int f1933c;

        /* renamed from: d */
        int f1934d;

        /* renamed from: e */
        int f1935e;

        /* renamed from: f */
        int f1936f;

        C0454a() {
        }

        C0454a(int i, C0457hp hpVar) {
            this.f1931a = i;
            this.f1932b = hpVar;
        }
    }

    public C0453hn(C0472hv hvVar) {
        this.f1910a = hvVar;
    }

    /* renamed from: a */
    static boolean m1412a(C0454a aVar) {
        C0457hp hpVar = aVar.f1932b;
        return hpVar != null && hpVar.f1984l && hpVar.f1960J != null && !hpVar.f1953C && !hpVar.f1952B && hpVar.mo1928J();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0457hp mo1901a(ArrayList<C0457hp> arrayList, C0457hp hpVar) {
        int i;
        C0457hp hpVar2 = hpVar;
        int i2 = 0;
        while (i < this.f1911b.size()) {
            C0454a aVar = (C0454a) this.f1911b.get(i);
            switch (aVar.f1931a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f1932b);
                    break;
                case 2:
                    C0457hp hpVar3 = aVar.f1932b;
                    int i3 = hpVar3.f1998z;
                    C0457hp hpVar4 = hpVar2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0457hp hpVar5 = (C0457hp) arrayList.get(size);
                        if (hpVar5.f1998z == i3) {
                            if (hpVar5 == hpVar3) {
                                z = true;
                            } else {
                                if (hpVar5 == hpVar4) {
                                    this.f1911b.add(i4, new C0454a(9, hpVar5));
                                    i4++;
                                    hpVar4 = null;
                                }
                                C0454a aVar2 = new C0454a(3, hpVar5);
                                aVar2.f1933c = aVar.f1933c;
                                aVar2.f1935e = aVar.f1935e;
                                aVar2.f1934d = aVar.f1934d;
                                aVar2.f1936f = aVar.f1936f;
                                this.f1911b.add(i4, aVar2);
                                arrayList.remove(hpVar5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f1911b.remove(i4);
                        i = i4 - 1;
                    } else {
                        aVar.f1931a = 1;
                        arrayList.add(hpVar3);
                        i = i4;
                    }
                    hpVar2 = hpVar4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f1932b);
                    if (aVar.f1932b != hpVar2) {
                        break;
                    } else {
                        this.f1911b.add(i, new C0454a(9, aVar.f1932b));
                        i++;
                        hpVar2 = null;
                        break;
                    }
                case 8:
                    this.f1911b.add(i, new C0454a(9, hpVar2));
                    i++;
                    hpVar2 = aVar.f1932b;
                    break;
            }
            i2 = i + 1;
        }
        return hpVar2;
    }

    /* renamed from: a */
    public final void mo1902a() {
        if (this.f1930u != null) {
            int size = this.f1930u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f1930u.get(i)).run();
            }
            this.f1930u = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1903a(int i) {
        if (this.f1918i) {
            if (C0472hv.f2046a) {
                StringBuilder sb = new StringBuilder("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            int size = this.f1911b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0454a aVar = (C0454a) this.f1911b.get(i2);
                if (aVar.f1932b != null) {
                    aVar.f1932b.f1990r += i;
                    if (C0472hv.f2046a) {
                        StringBuilder sb2 = new StringBuilder("Bump nesting of ");
                        sb2.append(aVar.f1932b);
                        sb2.append(" to ");
                        sb2.append(aVar.f1932b.f1990r);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1904a(C0463c cVar) {
        for (int i = 0; i < this.f1911b.size(); i++) {
            C0454a aVar = (C0454a) this.f1911b.get(i);
            if (m1412a(aVar)) {
                aVar.f1932b.mo1937a(cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo1905a(String str, PrintWriter printWriter) {
        mo1906a(str, printWriter, true);
    }

    /* renamed from: a */
    public final void mo1906a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1920k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1922m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1921l);
            if (this.f1916g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1916g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1917h));
            }
            if (!(this.f1912c == 0 && this.f1913d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1912c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1913d));
            }
            if (!(this.f1914e == 0 && this.f1915f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1914e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1915f));
            }
            if (!(this.f1923n == 0 && this.f1924o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1923n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1924o);
            }
            if (!(this.f1925p == 0 && this.f1926q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1925p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1926q);
            }
        }
        if (!this.f1911b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            int size = this.f1911b.size();
            for (int i = 0; i < size; i++) {
                C0454a aVar = (C0454a) this.f1911b.get(i);
                switch (aVar.f1931a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("cmd=");
                        sb2.append(aVar.f1931a);
                        str2 = sb2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1932b);
                if (z) {
                    if (!(aVar.f1933c == 0 && aVar.f1934d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1933c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1934d));
                    }
                    if (aVar.f1935e != 0 || aVar.f1936f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1935e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1936f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1907a(boolean z) {
        for (int size = this.f1911b.size() - 1; size >= 0; size--) {
            C0454a aVar = (C0454a) this.f1911b.get(size);
            C0457hp hpVar = aVar.f1932b;
            if (hpVar != null) {
                hpVar.mo1932a(C0472hv.m1534b(this.f1916g), this.f1917h);
            }
            int i = aVar.f1931a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        hpVar.mo1931a(aVar.f1935e);
                        this.f1910a.mo2013a(hpVar, false);
                        break;
                    case 4:
                        hpVar.mo1931a(aVar.f1935e);
                        C0472hv.m1546e(hpVar);
                        break;
                    case 5:
                        hpVar.mo1931a(aVar.f1936f);
                        C0472hv.m1544d(hpVar);
                        break;
                    case 6:
                        hpVar.mo1931a(aVar.f1935e);
                        this.f1910a.mo2029g(hpVar);
                        break;
                    case 7:
                        hpVar.mo1931a(aVar.f1936f);
                        this.f1910a.mo2027f(hpVar);
                        break;
                    case 8:
                        this.f1910a.mo2031h(null);
                        break;
                    case 9:
                        this.f1910a.mo2031h(hpVar);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown cmd: ");
                        sb.append(aVar.f1931a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                hpVar.mo1931a(aVar.f1936f);
                this.f1910a.mo2023c(hpVar);
            }
            if (!(this.f1929t || aVar.f1931a == 3 || hpVar == null)) {
                this.f1910a.mo2011a(hpVar);
            }
        }
        if (!this.f1929t && z) {
            this.f1910a.mo2007a(this.f1910a.f2064l, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1908a(ArrayList<C0453hn> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1911b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0454a aVar = (C0454a) this.f1911b.get(i4);
            int i5 = aVar.f1932b != null ? aVar.f1932b.f1998z : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0453hn hnVar = (C0453hn) arrayList.get(i6);
                    int size2 = hnVar.f1911b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0454a aVar2 = (C0454a) hnVar.f1911b.get(i7);
                        if ((aVar2.f1932b != null ? aVar2.f1932b.f1998z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1909a(ArrayList<C0453hn> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0472hv.f2046a) {
            StringBuilder sb = new StringBuilder("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f1918i) {
            C0472hv hvVar = this.f1910a;
            if (hvVar.f2059g == null) {
                hvVar.f2059g = new ArrayList<>();
            }
            hvVar.f2059g.add(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0457hp mo1910b(ArrayList<C0457hp> arrayList, C0457hp hpVar) {
        for (int i = 0; i < this.f1911b.size(); i++) {
            C0454a aVar = (C0454a) this.f1911b.get(i);
            int i2 = aVar.f1931a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            hpVar = null;
                            break;
                        case 9:
                            hpVar = aVar.f1932b;
                            break;
                    }
                }
                arrayList.add(aVar.f1932b);
            }
            arrayList.remove(aVar.f1932b);
        }
        return hpVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1911b() {
        int size = this.f1911b.size();
        for (int i = 0; i < size; i++) {
            C0454a aVar = (C0454a) this.f1911b.get(i);
            C0457hp hpVar = aVar.f1932b;
            if (hpVar != null) {
                hpVar.mo1932a(this.f1916g, this.f1917h);
            }
            int i2 = aVar.f1931a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        hpVar.mo1931a(aVar.f1934d);
                        this.f1910a.mo2023c(hpVar);
                        break;
                    case 4:
                        hpVar.mo1931a(aVar.f1934d);
                        C0472hv.m1544d(hpVar);
                        break;
                    case 5:
                        hpVar.mo1931a(aVar.f1933c);
                        C0472hv.m1546e(hpVar);
                        break;
                    case 6:
                        hpVar.mo1931a(aVar.f1934d);
                        this.f1910a.mo2027f(hpVar);
                        break;
                    case 7:
                        hpVar.mo1931a(aVar.f1933c);
                        this.f1910a.mo2029g(hpVar);
                        break;
                    case 8:
                        this.f1910a.mo2031h(hpVar);
                        break;
                    case 9:
                        this.f1910a.mo2031h(null);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown cmd: ");
                        sb.append(aVar.f1931a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                hpVar.mo1931a(aVar.f1933c);
                this.f1910a.mo2013a(hpVar, false);
            }
            if (!(this.f1929t || aVar.f1931a == 1 || hpVar == null)) {
                this.f1910a.mo2011a(hpVar);
            }
        }
        if (!this.f1929t) {
            this.f1910a.mo2007a(this.f1910a.f2064l, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo1912b(int i) {
        int size = this.f1911b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0454a aVar = (C0454a) this.f1911b.get(i2);
            int i3 = aVar.f1932b != null ? aVar.f1932b.f1998z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1922m >= 0) {
            sb.append(" #");
            sb.append(this.f1922m);
        }
        if (this.f1920k != null) {
            sb.append(" ");
            sb.append(this.f1920k);
        }
        sb.append("}");
        return sb.toString();
    }
}
