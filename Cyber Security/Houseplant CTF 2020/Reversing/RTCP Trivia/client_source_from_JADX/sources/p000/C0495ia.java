package p000;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: ia */
final class C0495ia {

    /* renamed from: a */
    private static final int[] f2128a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0506ic f2129b = (VERSION.SDK_INT >= 21 ? new C0501ib() : null);

    /* renamed from: c */
    private static final C0506ic f2130c = m1612a();

    /* renamed from: ia$a */
    static class C0500a {

        /* renamed from: a */
        public C0457hp f2159a;

        /* renamed from: b */
        public boolean f2160b;

        /* renamed from: c */
        public C0453hn f2161c;

        /* renamed from: d */
        public C0457hp f2162d;

        /* renamed from: e */
        public boolean f2163e;

        /* renamed from: f */
        public C0453hn f2164f;

        C0500a() {
        }
    }

    /* renamed from: a */
    static View m1608a(C0243de<String, View> deVar, C0500a aVar, Object obj, boolean z) {
        C0453hn hnVar = aVar.f2161c;
        if (obj == null || deVar == null || hnVar.f1927r == null || hnVar.f1927r.isEmpty()) {
            return null;
        }
        return (View) deVar.get((String) (z ? hnVar.f1927r : hnVar.f1928s).get(0));
    }

    /* renamed from: a */
    private static C0243de<String, String> m1609a(int i, ArrayList<C0453hn> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C0243de<String, String> deVar = new C0243de<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0453hn hnVar = (C0453hn) arrayList.get(i4);
            if (hnVar.mo1912b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (hnVar.f1927r != null) {
                    int size = hnVar.f1927r.size();
                    if (booleanValue) {
                        arrayList3 = hnVar.f1927r;
                        arrayList4 = hnVar.f1928s;
                    } else {
                        ArrayList arrayList5 = hnVar.f1927r;
                        arrayList3 = hnVar.f1928s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) deVar.remove(str2);
                        if (str3 != null) {
                            deVar.put(str, str3);
                        } else {
                            deVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return deVar;
    }

    /* renamed from: a */
    static C0243de<String, View> m1610a(C0506ic icVar, C0243de<String, String> deVar, Object obj, C0500a aVar) {
        C0310et etVar;
        ArrayList<String> arrayList;
        C0457hp hpVar = aVar.f2159a;
        View view = hpVar.f1960J;
        if (deVar.isEmpty() || obj == null || view == null) {
            deVar.clear();
            return null;
        }
        C0243de<String, View> deVar2 = new C0243de<>();
        icVar.mo2108a((Map<String, View>) deVar2, view);
        C0453hn hnVar = aVar.f2161c;
        if (aVar.f2160b) {
            etVar = hpVar.mo1924F();
            arrayList = hnVar.f1927r;
        } else {
            etVar = hpVar.mo1923E();
            arrayList = hnVar.f1928s;
        }
        if (arrayList != null) {
            C0250dj.m814a((Map<K, V>) deVar2, (Collection<?>) arrayList);
            C0250dj.m814a((Map<K, V>) deVar2, deVar.values());
        }
        if (etVar != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) deVar2.get(str);
                if (view2 == null) {
                    String a = m1617a(deVar, str);
                    if (a != null) {
                        deVar.remove(a);
                    }
                } else if (!str.equals(C0396gq.m1268e(view2))) {
                    String a2 = m1617a(deVar, str);
                    if (a2 != null) {
                        deVar.put(a2, C0396gq.m1268e(view2));
                    }
                }
            }
        } else {
            for (int size2 = deVar.size() - 1; size2 >= 0; size2--) {
                if (!deVar2.containsKey((String) deVar.mo1475c(size2))) {
                    deVar.mo1479d(size2);
                }
            }
        }
        return deVar2;
    }

    /* renamed from: a */
    private static C0500a m1611a(C0500a aVar, SparseArray<C0500a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0500a aVar2 = new C0500a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private static C0506ic m1612a() {
        try {
            return (C0506ic) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C0506ic m1613a(C0457hp hpVar, C0457hp hpVar2) {
        ArrayList arrayList = new ArrayList();
        if (hpVar != null) {
            Object r = hpVar.mo1954r();
            if (r != null) {
                arrayList.add(r);
            }
            Object q = hpVar.mo1953q();
            if (q != null) {
                arrayList.add(q);
            }
            Object u = hpVar.mo1958u();
            if (u != null) {
                arrayList.add(u);
            }
        }
        if (hpVar2 != null) {
            Object p = hpVar2.mo1952p();
            if (p != null) {
                arrayList.add(p);
            }
            Object s = hpVar2.mo1955s();
            if (s != null) {
                arrayList.add(s);
            }
            Object t = hpVar2.mo1956t();
            if (t != null) {
                arrayList.add(t);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f2129b != null && m1626a(f2129b, (List<Object>) arrayList)) {
            return f2129b;
        }
        if (f2130c != null && m1626a(f2130c, (List<Object>) arrayList)) {
            return f2130c;
        }
        if (f2129b == null && f2130c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static Object m1614a(C0506ic icVar, C0457hp hpVar, C0457hp hpVar2, boolean z) {
        if (hpVar == null || hpVar2 == null) {
            return null;
        }
        return icVar.mo2092c(icVar.mo2087b(z ? hpVar2.mo1958u() : hpVar.mo1956t()));
    }

    /* renamed from: a */
    private static Object m1615a(C0506ic icVar, C0457hp hpVar, boolean z) {
        if (hpVar == null) {
            return null;
        }
        return icVar.mo2087b(z ? hpVar.mo1955s() : hpVar.mo1952p());
    }

    /* renamed from: a */
    private static Object m1616a(C0506ic icVar, Object obj, Object obj2, Object obj3, C0457hp hpVar, boolean z) {
        Boolean bool;
        boolean z2 = true;
        if (!(obj == null || obj2 == null || hpVar == null)) {
            if (z) {
                if (!(hpVar.f1964N == null || hpVar.f1964N.f2014m == null)) {
                    bool = hpVar.f1964N.f2014m;
                }
            } else if (!(hpVar.f1964N == null || hpVar.f1964N.f2015n == null)) {
                bool = hpVar.f1964N.f2015n;
            }
            z2 = bool.booleanValue();
        }
        return z2 ? icVar.mo2078a(obj2, obj, obj3) : icVar.mo2088b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m1617a(C0243de<String, String> deVar, String str) {
        int size = deVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(deVar.mo1475c(i))) {
                return (String) deVar.mo1474b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static ArrayList<View> m1618a(C0506ic icVar, Object obj, C0457hp hpVar, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2;
        if (obj != null) {
            arrayList2 = new ArrayList<>();
            View view2 = hpVar.f1960J;
            if (view2 != null) {
                icVar.mo2107a(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                icVar.mo2084a(obj, arrayList2);
                return arrayList2;
            }
        } else {
            arrayList2 = null;
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static void m1619a(C0453hn hnVar, SparseArray<C0500a> sparseArray, boolean z) {
        int size = hnVar.f1911b.size();
        for (int i = 0; i < size; i++) {
            m1620a(hnVar, (C0454a) hnVar.f1911b.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        if (r6.f1984l != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0072, code lost:
        r8 = r12;
        r12 = true;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0081, code lost:
        if (r6.f1952B == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0083, code lost:
        r12 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0091  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1620a(p000.C0453hn r11, p000.C0453hn.C0454a r12, android.util.SparseArray<p000.C0495ia.C0500a> r13, boolean r14, boolean r15) {
        /*
            hp r6 = r12.f1932b
            if (r6 != 0) goto L_0x0005
            return
        L_0x0005:
            int r7 = r6.f1998z
            if (r7 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r14 == 0) goto L_0x0013
            int[] r0 = f2128a
            int r12 = r12.f1931a
            r12 = r0[r12]
            goto L_0x0015
        L_0x0013:
            int r12 = r12.f1931a
        L_0x0015:
            r0 = 0
            r1 = 1
            if (r12 == r1) goto L_0x0076
            switch(r12) {
                case 3: goto L_0x004c;
                case 4: goto L_0x0034;
                case 5: goto L_0x0021;
                case 6: goto L_0x004c;
                case 7: goto L_0x0076;
                default: goto L_0x001c;
            }
        L_0x001c:
            r12 = r0
            r1 = r12
            r8 = r1
            goto L_0x0089
        L_0x0021:
            if (r15 == 0) goto L_0x0030
            boolean r12 = r6.f1966P
            if (r12 == 0) goto L_0x0085
            boolean r12 = r6.f1952B
            if (r12 != 0) goto L_0x0085
            boolean r12 = r6.f1984l
            if (r12 == 0) goto L_0x0085
            goto L_0x0083
        L_0x0030:
            boolean r12 = r6.f1952B
            goto L_0x0086
        L_0x0034:
            if (r15 == 0) goto L_0x0043
            boolean r12 = r6.f1966P
            if (r12 == 0) goto L_0x0067
            boolean r12 = r6.f1984l
            if (r12 == 0) goto L_0x0067
            boolean r12 = r6.f1952B
            if (r12 == 0) goto L_0x0067
        L_0x0042:
            goto L_0x0065
        L_0x0043:
            boolean r12 = r6.f1984l
            if (r12 == 0) goto L_0x0067
            boolean r12 = r6.f1952B
            if (r12 != 0) goto L_0x0067
            goto L_0x0042
        L_0x004c:
            if (r15 == 0) goto L_0x0069
            boolean r12 = r6.f1984l
            if (r12 != 0) goto L_0x0067
            android.view.View r12 = r6.f1960J
            if (r12 == 0) goto L_0x0067
            android.view.View r12 = r6.f1960J
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x0067
            float r12 = r6.f1967Q
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 < 0) goto L_0x0067
        L_0x0065:
            r12 = r1
            goto L_0x0072
        L_0x0067:
            r12 = r0
            goto L_0x0072
        L_0x0069:
            boolean r12 = r6.f1984l
            if (r12 == 0) goto L_0x0067
            boolean r12 = r6.f1952B
            if (r12 != 0) goto L_0x0067
            goto L_0x0065
        L_0x0072:
            r8 = r12
            r12 = r1
            r1 = r0
            goto L_0x0089
        L_0x0076:
            if (r15 == 0) goto L_0x007b
            boolean r12 = r6.f1965O
            goto L_0x0086
        L_0x007b:
            boolean r12 = r6.f1984l
            if (r12 != 0) goto L_0x0085
            boolean r12 = r6.f1952B
            if (r12 != 0) goto L_0x0085
        L_0x0083:
            r12 = r1
            goto L_0x0086
        L_0x0085:
            r12 = r0
        L_0x0086:
            r8 = r0
            r0 = r12
            r12 = r8
        L_0x0089:
            java.lang.Object r2 = r13.get(r7)
            ia$a r2 = (p000.C0495ia.C0500a) r2
            if (r0 == 0) goto L_0x009b
            ia$a r2 = m1611a(r2, r13, r7)
            r2.f2159a = r6
            r2.f2160b = r14
            r2.f2161c = r11
        L_0x009b:
            r9 = r2
            r10 = 0
            if (r15 != 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00c2
            if (r9 == 0) goto L_0x00a9
            hp r0 = r9.f2162d
            if (r0 != r6) goto L_0x00a9
            r9.f2162d = r10
        L_0x00a9:
            hv r0 = r11.f1910a
            int r1 = r6.f1974b
            if (r1 > 0) goto L_0x00c2
            int r1 = r0.f2064l
            if (r1 <= 0) goto L_0x00c2
            boolean r1 = r11.f1929t
            if (r1 != 0) goto L_0x00c2
            r0.mo2020b(r6)
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r6
            r0.mo2012a(r1, r2, r3, r4, r5)
        L_0x00c2:
            if (r8 == 0) goto L_0x00d4
            if (r9 == 0) goto L_0x00ca
            hp r0 = r9.f2162d
            if (r0 != 0) goto L_0x00d4
        L_0x00ca:
            ia$a r9 = m1611a(r9, r13, r7)
            r9.f2162d = r6
            r9.f2163e = r14
            r9.f2164f = r11
        L_0x00d4:
            if (r15 != 0) goto L_0x00e0
            if (r12 == 0) goto L_0x00e0
            if (r9 == 0) goto L_0x00e0
            hp r11 = r9.f2159a
            if (r11 != r6) goto L_0x00e0
            r9.f2159a = r10
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0495ia.m1620a(hn, hn$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    static void m1621a(C0457hp hpVar, C0457hp hpVar2, boolean z, C0243de<String, View> deVar) {
        if ((z ? hpVar2.mo1923E() : hpVar.mo1923E()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = deVar == null ? 0 : deVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(deVar.mo1474b(i));
                arrayList.add(deVar.mo1475c(i));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x036d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017f A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1622a(p000.C0472hv r46, java.util.ArrayList<p000.C0453hn> r47, java.util.ArrayList<java.lang.Boolean> r48, int r49, int r50, boolean r51) {
        /*
            r0 = r46
            r1 = r47
            r2 = r48
            r3 = r50
            r4 = r51
            int r5 = r0.f2064l
            if (r5 > 0) goto L_0x000f
            return
        L_0x000f:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r6 = r49
        L_0x0016:
            if (r6 >= r3) goto L_0x0034
            java.lang.Object r7 = r1.get(r6)
            hn r7 = (p000.C0453hn) r7
            java.lang.Object r8 = r2.get(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x002e
            m1629b(r7, r5, r4)
            goto L_0x0031
        L_0x002e:
            m1619a(r7, r5, r4)
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0034:
            int r6 = r5.size()
            if (r6 == 0) goto L_0x037f
            android.view.View r6 = new android.view.View
            ht r7 = r0.f2065m
            android.content.Context r7 = r7.f2039c
            r6.<init>(r7)
            int r15 = r5.size()
            r13 = 0
        L_0x0048:
            if (r13 >= r15) goto L_0x037f
            int r7 = r5.keyAt(r13)
            r12 = r49
            de r11 = m1609a(r7, r1, r2, r12, r3)
            java.lang.Object r8 = r5.valueAt(r13)
            r10 = r8
            ia$a r10 = (p000.C0495ia.C0500a) r10
            r20 = 0
            if (r4 == 0) goto L_0x01db
            hr r8 = r0.f2066n
            boolean r8 = r8.mo1967a()
            if (r8 == 0) goto L_0x0070
            hr r8 = r0.f2066n
            android.view.View r7 = r8.mo1965a(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0072
        L_0x0070:
            r7 = r20
        L_0x0072:
            if (r7 == 0) goto L_0x01d2
            hp r8 = r10.f2159a
            hp r9 = r10.f2162d
            ic r14 = m1613a(r9, r8)
            if (r14 == 0) goto L_0x01d2
            boolean r1 = r10.f2160b
            boolean r2 = r10.f2163e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r29 = r5
            java.lang.Object r5 = m1615a(r14, r8, r1)
            java.lang.Object r2 = m1628b(r14, r9, r2)
            hp r12 = r10.f2159a
            r30 = r13
            hp r13 = r10.f2162d
            if (r12 == 0) goto L_0x00a7
            r31 = r15
            android.view.View r15 = r12.f1960J
            r0 = 0
            r15.setVisibility(r0)
            goto L_0x00a9
        L_0x00a7:
            r31 = r15
        L_0x00a9:
            if (r12 == 0) goto L_0x014e
            if (r13 != 0) goto L_0x00af
            goto L_0x014e
        L_0x00af:
            boolean r0 = r10.f2160b
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x00bc
            r32 = r1
            r15 = r20
            goto L_0x00c2
        L_0x00bc:
            java.lang.Object r15 = m1614a(r14, r12, r13, r0)
            r32 = r1
        L_0x00c2:
            de r1 = m1627b(r14, r11, r15, r10)
            r33 = r8
            de r8 = m1610a(r14, r11, r15, r10)
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x00d7
            r1.clear()
        L_0x00d7:
            if (r8 == 0) goto L_0x00dc
            r8.clear()
        L_0x00dc:
            r15 = r20
            goto L_0x00f1
        L_0x00df:
            r34 = r15
            java.util.Set r15 = r11.keySet()
            m1625a(r4, r1, r15)
            java.util.Collection r15 = r11.values()
            m1625a(r3, r8, r15)
            r15 = r34
        L_0x00f1:
            if (r5 != 0) goto L_0x00fc
            if (r2 != 0) goto L_0x00fc
            if (r15 != 0) goto L_0x00fc
            r36 = r3
        L_0x00f9:
            r35 = r11
            goto L_0x0155
        L_0x00fc:
            m1621a(r12, r13, r0, r1)
            if (r15 == 0) goto L_0x0131
            r3.add(r6)
            r14.mo2082a(r15, r6, r4)
            r35 = r11
            boolean r11 = r10.f2163e
            r36 = r3
            hn r3 = r10.f2164f
            r21 = r14
            r22 = r15
            r23 = r2
            r24 = r1
            r25 = r11
            r26 = r3
            m1623a(r21, r22, r23, r24, r25, r26)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.View r20 = m1608a(r8, r10, r5, r0)
            if (r20 == 0) goto L_0x012c
            r14.mo2080a(r5, r1)
        L_0x012c:
            r28 = r1
            r26 = r20
            goto L_0x0139
        L_0x0131:
            r36 = r3
            r35 = r11
            r26 = r20
            r28 = r26
        L_0x0139:
            ia$3 r1 = new ia$3
            r21 = r1
            r22 = r12
            r23 = r13
            r24 = r0
            r25 = r8
            r27 = r14
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            p000.C0510id.m1670a(r7, r1)
            goto L_0x0157
        L_0x014e:
            r32 = r1
            r36 = r3
            r33 = r8
            goto L_0x00f9
        L_0x0155:
            r15 = r20
        L_0x0157:
            if (r5 != 0) goto L_0x015d
            if (r15 != 0) goto L_0x015d
            if (r2 == 0) goto L_0x01d8
        L_0x015d:
            java.util.ArrayList r0 = m1618a(r14, r2, r9, r4, r6)
            r1 = r33
            r3 = r36
            java.util.ArrayList r8 = m1618a(r14, r5, r1, r3, r6)
            r10 = 4
            m1624a(r8, r10)
            r21 = r14
            r22 = r5
            r23 = r2
            r24 = r15
            r25 = r1
            r26 = r32
            java.lang.Object r1 = m1616a(r21, r22, r23, r24, r25, r26)
            if (r1 == 0) goto L_0x01d8
            if (r9 == 0) goto L_0x01a2
            if (r2 == 0) goto L_0x01a2
            boolean r10 = r9.f1984l
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r9.f1952B
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r9.f1966P
            if (r10 == 0) goto L_0x01a2
            r10 = 1
            r9.mo1938a(r10)
            android.view.View r10 = r9.f1960J
            r14.mo2090b(r2, r10, r0)
            android.view.ViewGroup r9 = r9.f1959I
            ia$1 r10 = new ia$1
            r10.<init>(r0)
            p000.C0510id.m1670a(r9, r10)
        L_0x01a2:
            java.util.ArrayList r20 = p000.C0506ic.m1647a(r3)
            r21 = r14
            r22 = r1
            r23 = r5
            r24 = r8
            r25 = r2
            r26 = r0
            r27 = r15
            r28 = r3
            r21.mo2083a(r22, r23, r24, r25, r26, r27, r28)
            r14.mo2079a(r7, r1)
            r16 = r14
            r17 = r7
            r18 = r4
            r19 = r3
            r21 = r35
            r16.mo2106a(r17, r18, r19, r20, r21)
            r0 = 0
            m1624a(r8, r0)
            r14.mo2085a(r15, r4, r3)
            goto L_0x0367
        L_0x01d2:
            r29 = r5
            r30 = r13
            r31 = r15
        L_0x01d8:
            r0 = 0
            goto L_0x0367
        L_0x01db:
            r1 = r0
            r29 = r5
            r35 = r11
            r30 = r13
            r31 = r15
            r0 = 0
            hr r2 = r1.f2066n
            boolean r2 = r2.mo1967a()
            if (r2 == 0) goto L_0x01f6
            hr r2 = r1.f2066n
            android.view.View r2 = r2.mo1965a(r7)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x01f8
        L_0x01f6:
            r2 = r20
        L_0x01f8:
            if (r2 == 0) goto L_0x0367
            hp r3 = r10.f2159a
            hp r4 = r10.f2162d
            ic r5 = m1613a(r4, r3)
            if (r5 == 0) goto L_0x0367
            boolean r7 = r10.f2160b
            boolean r8 = r10.f2163e
            java.lang.Object r9 = m1615a(r5, r3, r7)
            java.lang.Object r8 = m1628b(r5, r4, r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            hp r14 = r10.f2159a
            hp r13 = r10.f2162d
            if (r14 == 0) goto L_0x02e5
            if (r13 != 0) goto L_0x0224
            goto L_0x02e5
        L_0x0224:
            boolean r12 = r10.f2160b
            r11 = r35
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x0231
            r0 = r20
            goto L_0x0237
        L_0x0231:
            java.lang.Object r16 = m1614a(r5, r14, r13, r12)
            r0 = r16
        L_0x0237:
            de r1 = m1627b(r5, r11, r0, r10)
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x0244
            r0 = r20
            goto L_0x024f
        L_0x0244:
            r37 = r0
            java.util.Collection r0 = r1.values()
            r7.addAll(r0)
            r0 = r37
        L_0x024f:
            if (r9 != 0) goto L_0x026c
            if (r8 != 0) goto L_0x026c
            if (r0 != 0) goto L_0x026c
            r38 = r3
            r40 = r4
            r45 = r7
            r1 = r8
            r3 = r9
            r0 = r10
            r42 = r11
            r44 = r15
            r17 = r20
            r22 = r30
            r21 = r31
            r23 = 0
            goto L_0x02fd
        L_0x026c:
            m1621a(r14, r13, r12, r1)
            if (r0 == 0) goto L_0x029c
            r38 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r5.mo2082a(r0, r6, r7)
            r39 = r7
            boolean r7 = r10.f2163e
            r40 = r4
            hn r4 = r10.f2164f
            r17 = r11
            r11 = r5
            r18 = r12
            r12 = r0
            r19 = r13
            r13 = r8
            r21 = r14
            r14 = r1
            r1 = r15
            r15 = r7
            r16 = r4
            m1623a(r11, r12, r13, r14, r15, r16)
            if (r9 == 0) goto L_0x02ad
            r5.mo2080a(r9, r3)
            goto L_0x02ad
        L_0x029c:
            r38 = r3
            r40 = r4
            r39 = r7
            r17 = r11
            r18 = r12
            r19 = r13
            r21 = r14
            r1 = r15
            r3 = r20
        L_0x02ad:
            ia$4 r4 = new ia$4
            r15 = r39
            r7 = r4
            r14 = r8
            r8 = r5
            r13 = r9
            r9 = r17
            r12 = r10
            r10 = r0
            r41 = r0
            r0 = r17
            r11 = r12
            r42 = r0
            r0 = r12
            r12 = r1
            r43 = r13
            r22 = r30
            r13 = r6
            r44 = r1
            r1 = r14
            r23 = 0
            r14 = r21
            r45 = r15
            r21 = r31
            r15 = r19
            r16 = r18
            r17 = r45
            r18 = r43
            r19 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            p000.C0510id.m1670a(r2, r4)
            r17 = r41
            goto L_0x02fb
        L_0x02e5:
            r23 = r0
            r38 = r3
            r40 = r4
            r45 = r7
            r1 = r8
            r43 = r9
            r0 = r10
            r44 = r15
            r22 = r30
            r21 = r31
            r42 = r35
            r17 = r20
        L_0x02fb:
            r3 = r43
        L_0x02fd:
            if (r3 != 0) goto L_0x0303
            if (r17 != 0) goto L_0x0303
            if (r1 == 0) goto L_0x036d
        L_0x0303:
            r4 = r40
            r7 = r45
            java.util.ArrayList r4 = m1618a(r5, r1, r4, r7, r6)
            if (r4 == 0) goto L_0x0313
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x0315
        L_0x0313:
            r1 = r20
        L_0x0315:
            r5.mo2089b(r3, r6)
            boolean r0 = r0.f2160b
            r11 = r5
            r12 = r3
            r13 = r1
            r14 = r17
            r15 = r38
            r16 = r0
            java.lang.Object r0 = m1616a(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x036d
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = r5
            r12 = r0
            r13 = r3
            r14 = r10
            r15 = r1
            r16 = r4
            r18 = r44
            r11.mo2083a(r12, r13, r14, r15, r16, r17, r18)
            ia$2 r15 = new ia$2
            r7 = r15
            r8 = r3
            r9 = r5
            r3 = r10
            r10 = r6
            r11 = r38
            r12 = r44
            r13 = r3
            r14 = r4
            r3 = r15
            r15 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            p000.C0510id.m1670a(r2, r3)
            ic$2 r1 = new ic$2
            r3 = r42
            r4 = r44
            r1.<init>(r4, r3)
            p000.C0510id.m1670a(r2, r1)
            r5.mo2079a(r2, r0)
            ic$3 r0 = new ic$3
            r0.<init>(r4, r3)
            p000.C0510id.m1670a(r2, r0)
            goto L_0x036d
        L_0x0367:
            r23 = r0
            r22 = r30
            r21 = r31
        L_0x036d:
            int r13 = r22 + 1
            r15 = r21
            r5 = r29
            r0 = r46
            r1 = r47
            r2 = r48
            r3 = r50
            r4 = r51
            goto L_0x0048
        L_0x037f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0495ia.m1622a(hv, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    /* renamed from: a */
    private static void m1623a(C0506ic icVar, Object obj, Object obj2, C0243de<String, View> deVar, boolean z, C0453hn hnVar) {
        if (hnVar.f1927r != null && !hnVar.f1927r.isEmpty()) {
            View view = (View) deVar.get((String) (z ? hnVar.f1928s : hnVar.f1927r).get(0));
            icVar.mo2081a(obj, view);
            if (obj2 != null) {
                icVar.mo2081a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    static void m1624a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static void m1625a(ArrayList<View> arrayList, C0243de<String, View> deVar, Collection<String> collection) {
        for (int size = deVar.size() - 1; size >= 0; size--) {
            View view = (View) deVar.mo1475c(size);
            if (collection.contains(C0396gq.m1268e(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static boolean m1626a(C0506ic icVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!icVar.mo2086a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0243de<String, View> m1627b(C0506ic icVar, C0243de<String, String> deVar, Object obj, C0500a aVar) {
        C0310et etVar;
        ArrayList<String> arrayList;
        if (deVar.isEmpty() || obj == null) {
            deVar.clear();
            return null;
        }
        C0457hp hpVar = aVar.f2162d;
        C0243de<String, View> deVar2 = new C0243de<>();
        icVar.mo2108a((Map<String, View>) deVar2, hpVar.f1960J);
        C0453hn hnVar = aVar.f2164f;
        if (aVar.f2163e) {
            etVar = hpVar.mo1923E();
            arrayList = hnVar.f1928s;
        } else {
            etVar = hpVar.mo1924F();
            arrayList = hnVar.f1927r;
        }
        C0250dj.m814a((Map<K, V>) deVar2, (Collection<?>) arrayList);
        if (etVar != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) deVar2.get(str);
                if (view == null) {
                    deVar.remove(str);
                } else if (!str.equals(C0396gq.m1268e(view))) {
                    deVar.put(C0396gq.m1268e(view), (String) deVar.remove(str));
                }
            }
        } else {
            C0250dj.m814a((Map<K, V>) deVar, (Collection<?>) deVar2.keySet());
        }
        return deVar2;
    }

    /* renamed from: b */
    private static Object m1628b(C0506ic icVar, C0457hp hpVar, boolean z) {
        if (hpVar == null) {
            return null;
        }
        return icVar.mo2087b(z ? hpVar.mo1953q() : hpVar.mo1954r());
    }

    /* renamed from: b */
    private static void m1629b(C0453hn hnVar, SparseArray<C0500a> sparseArray, boolean z) {
        if (hnVar.f1910a.f2066n.mo1967a()) {
            for (int size = hnVar.f1911b.size() - 1; size >= 0; size--) {
                m1620a(hnVar, (C0454a) hnVar.f1911b.get(size), sparseArray, true, z);
            }
        }
    }
}
