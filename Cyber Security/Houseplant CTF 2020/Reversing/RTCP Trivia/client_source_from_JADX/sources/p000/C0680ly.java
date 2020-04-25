package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ly */
final class C0680ly {

    /* renamed from: a */
    static final C0679lx[] f2926a = {new C0679lx(C0679lx.f2922f, ""), new C0679lx(C0679lx.f2919c, "GET"), new C0679lx(C0679lx.f2919c, "POST"), new C0679lx(C0679lx.f2920d, "/"), new C0679lx(C0679lx.f2920d, "/index.html"), new C0679lx(C0679lx.f2921e, "http"), new C0679lx(C0679lx.f2921e, "https"), new C0679lx(C0679lx.f2918b, "200"), new C0679lx(C0679lx.f2918b, "204"), new C0679lx(C0679lx.f2918b, "206"), new C0679lx(C0679lx.f2918b, "304"), new C0679lx(C0679lx.f2918b, "400"), new C0679lx(C0679lx.f2918b, "404"), new C0679lx(C0679lx.f2918b, "500"), new C0679lx("accept-charset", ""), new C0679lx("accept-encoding", "gzip, deflate"), new C0679lx("accept-language", ""), new C0679lx("accept-ranges", ""), new C0679lx("accept", ""), new C0679lx("access-control-allow-origin", ""), new C0679lx("age", ""), new C0679lx("allow", ""), new C0679lx("authorization", ""), new C0679lx("cache-control", ""), new C0679lx("content-disposition", ""), new C0679lx("content-encoding", ""), new C0679lx("content-language", ""), new C0679lx("content-length", ""), new C0679lx("content-location", ""), new C0679lx("content-range", ""), new C0679lx("content-type", ""), new C0679lx("cookie", ""), new C0679lx("date", ""), new C0679lx("etag", ""), new C0679lx("expect", ""), new C0679lx("expires", ""), new C0679lx("from", ""), new C0679lx("host", ""), new C0679lx("if-match", ""), new C0679lx("if-modified-since", ""), new C0679lx("if-none-match", ""), new C0679lx("if-range", ""), new C0679lx("if-unmodified-since", ""), new C0679lx("last-modified", ""), new C0679lx("link", ""), new C0679lx("location", ""), new C0679lx("max-forwards", ""), new C0679lx("proxy-authenticate", ""), new C0679lx("proxy-authorization", ""), new C0679lx("range", ""), new C0679lx("referer", ""), new C0679lx("refresh", ""), new C0679lx("retry-after", ""), new C0679lx("server", ""), new C0679lx("set-cookie", ""), new C0679lx("strict-transport-security", ""), new C0679lx("transfer-encoding", ""), new C0679lx("user-agent", ""), new C0679lx("vary", ""), new C0679lx("via", ""), new C0679lx("www-authenticate", "")};

    /* renamed from: b */
    static final Map<C0762nf, Integer> f2927b;

    /* renamed from: ly$a */
    static final class C0681a {

        /* renamed from: a */
        final List<C0679lx> f2928a;

        /* renamed from: b */
        final C0761ne f2929b;

        /* renamed from: c */
        final int f2930c;

        /* renamed from: d */
        int f2931d;

        /* renamed from: e */
        C0679lx[] f2932e;

        /* renamed from: f */
        int f2933f;

        /* renamed from: g */
        int f2934g;

        /* renamed from: h */
        int f2935h;

        C0681a(C0778ns nsVar) {
            this(nsVar, 0);
        }

        private C0681a(C0778ns nsVar, byte b) {
            this.f2928a = new ArrayList();
            this.f2932e = new C0679lx[8];
            this.f2933f = this.f2932e.length - 1;
            this.f2934g = 0;
            this.f2935h = 0;
            this.f2930c = 4096;
            this.f2931d = 4096;
            this.f2929b = C0768nl.m2508a(nsVar);
        }

        /* renamed from: c */
        private void m2098c() {
            Arrays.fill(this.f2932e, null);
            this.f2933f = this.f2932e.length - 1;
            this.f2934g = 0;
            this.f2935h = 0;
        }

        /* renamed from: c */
        static boolean m2099c(int i) {
            return i >= 0 && i <= C0680ly.f2926a.length - 1;
        }

        /* renamed from: d */
        private int m2100d() {
            return this.f2929b.mo2638f() & 255;
        }

        /* renamed from: d */
        private int m2101d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f2932e.length;
                while (true) {
                    length--;
                    if (length < this.f2933f || i <= 0) {
                        System.arraycopy(this.f2932e, this.f2933f + 1, this.f2932e, this.f2933f + 1 + i2, this.f2934g);
                        this.f2933f += i2;
                    } else {
                        i -= this.f2932e[length].f2925i;
                        this.f2935h -= this.f2932e[length].f2925i;
                        this.f2934g--;
                        i2++;
                    }
                }
                System.arraycopy(this.f2932e, this.f2933f + 1, this.f2932e, this.f2933f + 1 + i2, this.f2934g);
                this.f2933f += i2;
            }
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo2471a(int i) {
            return this.f2933f + 1 + i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo2472a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int d = m2100d();
                if ((d & 128) == 0) {
                    return i2 + (d << i4);
                }
                i2 += (d & 127) << i4;
                i4 += 7;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2473a() {
            if (this.f2931d < this.f2935h) {
                if (this.f2931d == 0) {
                    m2098c();
                    return;
                }
                m2101d(this.f2935h - this.f2931d);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2474a(C0679lx lxVar) {
            this.f2928a.add(lxVar);
            int i = lxVar.f2925i;
            if (i > this.f2931d) {
                m2098c();
                return;
            }
            m2101d((this.f2935h + i) - this.f2931d);
            if (this.f2934g + 1 > this.f2932e.length) {
                C0679lx[] lxVarArr = new C0679lx[(this.f2932e.length * 2)];
                System.arraycopy(this.f2932e, 0, lxVarArr, this.f2932e.length, this.f2932e.length);
                this.f2933f = this.f2932e.length - 1;
                this.f2932e = lxVarArr;
            }
            int i2 = this.f2933f;
            this.f2933f = i2 - 1;
            this.f2932e[i2] = lxVar;
            this.f2934g++;
            this.f2935h += i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C0762nf mo2475b() {
            int d = m2100d();
            boolean z = (d & 128) == 128;
            int a = mo2472a(d, 127);
            if (!z) {
                return this.f2929b.mo2629c((long) a);
            }
            C0711mf a2 = C0711mf.m2219a();
            byte[] f = this.f2929b.mo2640f((long) a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            C0712a aVar = a2.f3088a;
            byte b = 0;
            for (byte b2 : f) {
                b = (b << 8) | (b2 & 255);
                i += 8;
                while (i >= 8) {
                    aVar = aVar.f3089a[(b >>> (i - 8)) & 255];
                    if (aVar.f3089a == null) {
                        byteArrayOutputStream.write(aVar.f3090b);
                        i -= aVar.f3091c;
                        aVar = a2.f3088a;
                    } else {
                        i -= 8;
                    }
                }
            }
            while (i > 0) {
                C0712a aVar2 = aVar.f3089a[(b << (8 - i)) & 255];
                if (aVar2.f3089a != null || aVar2.f3091c > i) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f3090b);
                i -= aVar2.f3091c;
                aVar = a2.f3088a;
            }
            return C0762nf.m2472a(byteArrayOutputStream.toByteArray());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C0762nf mo2476b(int i) {
            C0679lx lxVar;
            if (m2099c(i)) {
                lxVar = C0680ly.f2926a[i];
            } else {
                int a = mo2471a(i - C0680ly.f2926a.length);
                if (a < 0 || a >= this.f2932e.length) {
                    StringBuilder sb = new StringBuilder("Header index too large ");
                    sb.append(i + 1);
                    throw new IOException(sb.toString());
                }
                lxVar = this.f2932e[a];
            }
            return lxVar.f2923g;
        }
    }

    /* renamed from: ly$b */
    static final class C0682b {

        /* renamed from: a */
        int f2936a;

        /* renamed from: b */
        int f2937b;

        /* renamed from: c */
        C0679lx[] f2938c;

        /* renamed from: d */
        int f2939d;

        /* renamed from: e */
        int f2940e;

        /* renamed from: f */
        int f2941f;

        /* renamed from: g */
        private final C0758nc f2942g;

        /* renamed from: h */
        private final boolean f2943h;

        /* renamed from: i */
        private int f2944i;

        /* renamed from: j */
        private boolean f2945j;

        C0682b(C0758nc ncVar) {
            this(ncVar, 0);
        }

        private C0682b(C0758nc ncVar, byte b) {
            this.f2944i = Integer.MAX_VALUE;
            this.f2938c = new C0679lx[8];
            this.f2939d = this.f2938c.length - 1;
            this.f2940e = 0;
            this.f2941f = 0;
            this.f2936a = 4096;
            this.f2937b = 4096;
            this.f2943h = true;
            this.f2942g = ncVar;
        }

        /* renamed from: a */
        private void m2108a() {
            Arrays.fill(this.f2938c, null);
            this.f2939d = this.f2938c.length - 1;
            this.f2940e = 0;
            this.f2941f = 0;
        }

        /* renamed from: a */
        private void m2109a(int i, int i2, int i3) {
            int i4;
            C0758nc ncVar;
            if (i < i2) {
                ncVar = this.f2942g;
                i4 = i | i3;
            } else {
                this.f2942g.mo2646h(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f2942g.mo2646h(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                ncVar = this.f2942g;
            }
            ncVar.mo2646h(i4);
        }

        /* renamed from: a */
        private void m2110a(C0679lx lxVar) {
            int i = lxVar.f2925i;
            if (i > this.f2937b) {
                m2108a();
                return;
            }
            m2112b((this.f2941f + i) - this.f2937b);
            if (this.f2940e + 1 > this.f2938c.length) {
                C0679lx[] lxVarArr = new C0679lx[(this.f2938c.length * 2)];
                System.arraycopy(this.f2938c, 0, lxVarArr, this.f2938c.length, this.f2938c.length);
                this.f2939d = this.f2938c.length - 1;
                this.f2938c = lxVarArr;
            }
            int i2 = this.f2939d;
            this.f2939d = i2 - 1;
            this.f2938c[i2] = lxVar;
            this.f2940e++;
            this.f2941f += i;
        }

        /* renamed from: a */
        private void m2111a(C0762nf nfVar) {
            int g;
            int i;
            if (this.f2943h) {
                C0711mf.m2219a();
                if (C0711mf.m2218a(nfVar) < nfVar.mo2681g()) {
                    C0758nc ncVar = new C0758nc();
                    C0711mf.m2219a();
                    C0711mf.m2220a(nfVar, ncVar);
                    nfVar = ncVar.mo2656m();
                    g = nfVar.mo2681g();
                    i = 128;
                    m2109a(g, 127, i);
                    this.f2942g.mo2623b(nfVar);
                }
            }
            g = nfVar.mo2681g();
            i = 0;
            m2109a(g, 127, i);
            this.f2942g.mo2623b(nfVar);
        }

        /* renamed from: b */
        private int m2112b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f2938c.length;
                while (true) {
                    length--;
                    if (length < this.f2939d || i <= 0) {
                        System.arraycopy(this.f2938c, this.f2939d + 1, this.f2938c, this.f2939d + 1 + i2, this.f2940e);
                        Arrays.fill(this.f2938c, this.f2939d + 1, this.f2939d + 1 + i2, null);
                        this.f2939d += i2;
                    } else {
                        i -= this.f2938c[length].f2925i;
                        this.f2941f -= this.f2938c[length].f2925i;
                        this.f2940e--;
                        i2++;
                    }
                }
                System.arraycopy(this.f2938c, this.f2939d + 1, this.f2938c, this.f2939d + 1 + i2, this.f2940e);
                Arrays.fill(this.f2938c, this.f2939d + 1, this.f2939d + 1 + i2, null);
                this.f2939d += i2;
            }
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2477a(int i) {
            this.f2936a = i;
            int min = Math.min(i, 16384);
            if (this.f2937b != min) {
                if (min < this.f2937b) {
                    this.f2944i = Math.min(this.f2944i, min);
                }
                this.f2945j = true;
                this.f2937b = min;
                if (this.f2937b < this.f2941f) {
                    if (this.f2937b == 0) {
                        m2108a();
                        return;
                    }
                    m2112b(this.f2941f - this.f2937b);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2478a(java.util.List<p000.C0679lx> r14) {
            /*
                r13 = this;
                boolean r0 = r13.f2945j
                r1 = 0
                if (r0 == 0) goto L_0x0020
                int r0 = r13.f2944i
                int r2 = r13.f2937b
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0014
                int r0 = r13.f2944i
                r13.m2109a(r0, r4, r3)
            L_0x0014:
                r13.f2945j = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f2944i = r0
                int r0 = r13.f2937b
                r13.m2109a(r0, r4, r3)
            L_0x0020:
                int r0 = r14.size()
                r2 = r1
            L_0x0025:
                if (r2 >= r0) goto L_0x00ed
                java.lang.Object r3 = r14.get(r2)
                lx r3 = (p000.C0679lx) r3
                nf r4 = r3.f2923g
                nf r4 = r4.mo2680f()
                nf r5 = r3.f2924h
                java.util.Map<nf, java.lang.Integer> r6 = p000.C0680ly.f2927b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                r8 = 1
                if (r6 == 0) goto L_0x0070
                int r6 = r6.intValue()
                int r6 = r6 + r8
                if (r6 <= r8) goto L_0x006d
                r9 = 8
                if (r6 >= r9) goto L_0x006d
                lx[] r9 = p000.C0680ly.f2926a
                int r10 = r6 + -1
                r9 = r9[r10]
                nf r9 = r9.f2924h
                boolean r9 = p000.C0633kv.m1975a(r9, r5)
                if (r9 == 0) goto L_0x005b
                goto L_0x0071
            L_0x005b:
                lx[] r9 = p000.C0680ly.f2926a
                r9 = r9[r6]
                nf r9 = r9.f2924h
                boolean r9 = p000.C0633kv.m1975a(r9, r5)
                if (r9 == 0) goto L_0x006d
                int r9 = r6 + 1
                r12 = r9
                r9 = r6
                r6 = r12
                goto L_0x0072
            L_0x006d:
                r9 = r6
                r6 = r7
                goto L_0x0072
            L_0x0070:
                r6 = r7
            L_0x0071:
                r9 = r6
            L_0x0072:
                if (r6 != r7) goto L_0x00a9
                int r10 = r13.f2939d
                int r10 = r10 + r8
                lx[] r8 = r13.f2938c
                int r8 = r8.length
            L_0x007a:
                if (r10 >= r8) goto L_0x00a9
                lx[] r11 = r13.f2938c
                r11 = r11[r10]
                nf r11 = r11.f2923g
                boolean r11 = p000.C0633kv.m1975a(r11, r4)
                if (r11 == 0) goto L_0x00a6
                lx[] r11 = r13.f2938c
                r11 = r11[r10]
                nf r11 = r11.f2924h
                boolean r11 = p000.C0633kv.m1975a(r11, r5)
                if (r11 == 0) goto L_0x009c
                int r6 = r13.f2939d
                int r10 = r10 - r6
                lx[] r6 = p000.C0680ly.f2926a
                int r6 = r6.length
                int r6 = r6 + r10
                goto L_0x00a9
            L_0x009c:
                if (r9 != r7) goto L_0x00a6
                int r9 = r13.f2939d
                int r9 = r10 - r9
                lx[] r11 = p000.C0680ly.f2926a
                int r11 = r11.length
                int r9 = r9 + r11
            L_0x00a6:
                int r10 = r10 + 1
                goto L_0x007a
            L_0x00a9:
                if (r6 == r7) goto L_0x00b3
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.m2109a(r6, r3, r4)
                goto L_0x00e9
            L_0x00b3:
                r6 = 64
                if (r9 != r7) goto L_0x00c6
                nc r7 = r13.f2942g
                r7.mo2646h(r6)
                r13.m2111a(r4)
            L_0x00bf:
                r13.m2111a(r5)
                r13.m2110a(r3)
                goto L_0x00e9
            L_0x00c6:
                nf r7 = p000.C0679lx.f2917a
                int r8 = r7.mo2681g()
                boolean r7 = r4.mo2672a(r1, r7, r1, r8)
                if (r7 == 0) goto L_0x00e3
                nf r7 = p000.C0679lx.f2922f
                boolean r4 = r7.equals(r4)
                if (r4 != 0) goto L_0x00e3
                r3 = 15
                r13.m2109a(r9, r3, r1)
                r13.m2111a(r5)
                goto L_0x00e9
            L_0x00e3:
                r4 = 63
                r13.m2109a(r9, r4, r6)
                goto L_0x00bf
            L_0x00e9:
                int r2 = r2 + 1
                goto L_0x0025
            L_0x00ed:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0680ly.C0682b.mo2478a(java.util.List):void");
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f2926a.length);
        for (int i = 0; i < f2926a.length; i++) {
            if (!linkedHashMap.containsKey(f2926a[i].f2923g)) {
                linkedHashMap.put(f2926a[i].f2923g, Integer.valueOf(i));
            }
        }
        f2927b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    static C0762nf m2097a(C0762nf nfVar) {
        int g = nfVar.mo2681g();
        int i = 0;
        while (i < g) {
            byte a = nfVar.mo2668a(i);
            if (a < 65 || a > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(nfVar.mo2669a());
                throw new IOException(sb.toString());
            }
        }
        return nfVar;
    }
}
