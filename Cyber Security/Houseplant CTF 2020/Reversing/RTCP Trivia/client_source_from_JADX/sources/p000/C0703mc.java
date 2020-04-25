package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: mc */
final class C0703mc implements Closeable {

    /* renamed from: a */
    static final Logger f3041a = Logger.getLogger(C0683lz.class.getName());

    /* renamed from: b */
    final C0761ne f3042b;

    /* renamed from: c */
    final boolean f3043c;

    /* renamed from: d */
    final C0681a f3044d = new C0681a(this.f3045e);

    /* renamed from: e */
    private final C0704a f3045e = new C0704a(this.f3042b);

    /* renamed from: mc$a */
    static final class C0704a implements C0778ns {

        /* renamed from: a */
        int f3046a;

        /* renamed from: b */
        byte f3047b;

        /* renamed from: c */
        int f3048c;

        /* renamed from: d */
        int f3049d;

        /* renamed from: e */
        short f3050e;

        /* renamed from: f */
        private final C0761ne f3051f;

        C0704a(C0761ne neVar) {
            this.f3051f = neVar;
        }

        /* renamed from: a */
        public final long mo2414a(C0758nc ncVar, long j) {
            while (this.f3049d == 0) {
                this.f3051f.mo2643g((long) this.f3050e);
                this.f3050e = 0;
                if ((this.f3047b & 4) != 0) {
                    return -1;
                }
                int i = this.f3048c;
                int a = C0703mc.m2169a(this.f3051f);
                this.f3049d = a;
                this.f3046a = a;
                byte f = (byte) (this.f3051f.mo2638f() & 255);
                this.f3047b = (byte) (this.f3051f.mo2638f() & 255);
                if (C0703mc.f3041a.isLoggable(Level.FINE)) {
                    C0703mc.f3041a.fine(C0683lz.m2116a(true, this.f3048c, this.f3046a, f, this.f3047b));
                }
                this.f3048c = this.f3051f.mo2644h() & Integer.MAX_VALUE;
                if (f != 9) {
                    throw C0683lz.m2117b("%s != TYPE_CONTINUATION", Byte.valueOf(f));
                } else if (this.f3048c != i) {
                    throw C0683lz.m2117b("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            long a2 = this.f3051f.mo2414a(ncVar, Math.min(j, (long) this.f3049d));
            if (a2 == -1) {
                return -1;
            }
            this.f3049d = (int) (((long) this.f3049d) - a2);
            return a2;
        }

        /* renamed from: a */
        public final C0779nt mo2415a() {
            return this.f3051f.mo2415a();
        }

        public final void close() {
        }
    }

    /* renamed from: mc$b */
    interface C0705b {
        /* renamed from: a */
        void mo2492a(int i, long j);

        /* renamed from: a */
        void mo2493a(int i, List<C0679lx> list);

        /* renamed from: a */
        void mo2494a(int i, C0678lw lwVar);

        /* renamed from: a */
        void mo2495a(int i, C0762nf nfVar);

        /* renamed from: a */
        void mo2496a(C0715mh mhVar);

        /* renamed from: a */
        void mo2497a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo2498a(boolean z, int i, List<C0679lx> list);

        /* renamed from: a */
        void mo2499a(boolean z, int i, C0761ne neVar, int i2);
    }

    C0703mc(C0761ne neVar, boolean z) {
        this.f3042b = neVar;
        this.f3043c = z;
    }

    /* renamed from: a */
    private static int m2168a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C0683lz.m2117b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: a */
    static int m2169a(C0761ne neVar) {
        return (neVar.mo2638f() & 255) | ((neVar.mo2638f() & 255) << 16) | ((neVar.mo2638f() & 255) << 8);
    }

    /* renamed from: a */
    private List<C0679lx> m2170a(int i, short s, byte b, int i2) {
        List<C0679lx> list;
        C0679lx lxVar;
        C0679lx lxVar2;
        C0704a aVar = this.f3045e;
        this.f3045e.f3049d = i;
        aVar.f3046a = i;
        this.f3045e.f3050e = s;
        this.f3045e.f3047b = b;
        this.f3045e.f3048c = i2;
        C0681a aVar2 = this.f3044d;
        while (!aVar2.f2929b.mo2633d()) {
            byte f = aVar2.f2929b.mo2638f() & 255;
            if (f == 128) {
                throw new IOException("index == 0");
            } else if ((f & 128) == 128) {
                int a = aVar2.mo2472a(f, 127) - 1;
                if (C0681a.m2099c(a)) {
                    aVar2.f2928a.add(C0680ly.f2926a[a]);
                } else {
                    int a2 = aVar2.mo2471a(a - C0680ly.f2926a.length);
                    if (a2 < 0 || a2 >= aVar2.f2932e.length) {
                        StringBuilder sb = new StringBuilder("Header index too large ");
                        sb.append(a + 1);
                        throw new IOException(sb.toString());
                    }
                    aVar2.f2928a.add(aVar2.f2932e[a2]);
                }
            } else {
                if (f == 64) {
                    lxVar2 = new C0679lx(C0680ly.m2097a(aVar2.mo2475b()), aVar2.mo2475b());
                } else if ((f & 64) == 64) {
                    lxVar2 = new C0679lx(aVar2.mo2476b(aVar2.mo2472a(f, 63) - 1), aVar2.mo2475b());
                } else if ((f & 32) == 32) {
                    aVar2.f2931d = aVar2.mo2472a(f, 31);
                    if (aVar2.f2931d < 0 || aVar2.f2931d > aVar2.f2930c) {
                        StringBuilder sb2 = new StringBuilder("Invalid dynamic table size update ");
                        sb2.append(aVar2.f2931d);
                        throw new IOException(sb2.toString());
                    }
                    aVar2.mo2473a();
                } else {
                    if (f == 16 || f == 0) {
                        C0762nf a3 = C0680ly.m2097a(aVar2.mo2475b());
                        C0762nf b2 = aVar2.mo2475b();
                        list = aVar2.f2928a;
                        lxVar = new C0679lx(a3, b2);
                    } else {
                        C0762nf b3 = aVar2.mo2476b(aVar2.mo2472a(f, 15) - 1);
                        C0762nf b4 = aVar2.mo2475b();
                        list = aVar2.f2928a;
                        lxVar = new C0679lx(b3, b4);
                    }
                    list.add(lxVar);
                }
                aVar2.mo2474a(lxVar2);
            }
        }
        C0681a aVar3 = this.f3044d;
        ArrayList arrayList = new ArrayList(aVar3.f2928a);
        aVar3.f2928a.clear();
        return arrayList;
    }

    /* renamed from: a */
    private void m2171a() {
        this.f3042b.mo2644h();
        this.f3042b.mo2638f();
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [short, int] */
    /* JADX WARNING: type inference failed for: r0v6, types: [short] */
    /* JADX WARNING: type inference failed for: r0v7, types: [short] */
    /* JADX WARNING: type inference failed for: r0v11, types: [short] */
    /* JADX WARNING: type inference failed for: r0v12, types: [short] */
    /* JADX WARNING: type inference failed for: r0v16, types: [short] */
    /* JADX WARNING: type inference failed for: r0v17, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v18
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], short]
      uses: [boolean, short, int]
      mth insns count: 286
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2500a(boolean r11, p000.C0703mc.C0705b r12) {
        /*
            r10 = this;
            r0 = 0
            ne r1 = r10.f3042b     // Catch:{ IOException -> 0x02a7 }
            r2 = 9
            r1.mo2615a(r2)     // Catch:{ IOException -> 0x02a7 }
            ne r1 = r10.f3042b
            int r1 = m2169a(r1)
            r2 = 1
            if (r1 < 0) goto L_0x0298
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 <= r3) goto L_0x0017
            goto L_0x0298
        L_0x0017:
            ne r4 = r10.f3042b
            byte r4 = r4.mo2638f()
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 4
            if (r11 == 0) goto L_0x0034
            if (r4 == r5) goto L_0x0034
            java.lang.String r11 = "Expected a SETTINGS frame but was %s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0034:
            ne r11 = r10.f3042b
            byte r11 = r11.mo2638f()
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            ne r6 = r10.f3042b
            int r6 = r6.mo2644h()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            java.util.logging.Logger r8 = f3041a
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            boolean r8 = r8.isLoggable(r9)
            if (r8 == 0) goto L_0x005a
            java.util.logging.Logger r8 = f3041a
            java.lang.String r9 = p000.C0683lz.m2116a(r2, r6, r1, r4, r11)
            r8.fine(r9)
        L_0x005a:
            r8 = 8
            switch(r4) {
                case 0: goto L_0x0258;
                case 1: goto L_0x0224;
                case 2: goto L_0x0203;
                case 3: goto L_0x01c8;
                case 4: goto L_0x0145;
                case 5: goto L_0x0118;
                case 6: goto L_0x00e8;
                case 7: goto L_0x009b;
                case 8: goto L_0x0066;
                default: goto L_0x005f;
            }
        L_0x005f:
            ne r11 = r10.f3042b
            long r0 = (long) r1
        L_0x0062:
            r11.mo2643g(r0)
            return r2
        L_0x0066:
            if (r1 == r5) goto L_0x0077
            java.lang.String r11 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0077:
            ne r11 = r10.f3042b
            int r11 = r11.mo2644h()
            long r3 = (long) r11
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r7
            r7 = 0
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0097
            java.lang.String r11 = "windowSizeIncrement was 0"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0097:
            r12.mo2492a(r6, r3)
            return r2
        L_0x009b:
            if (r1 >= r8) goto L_0x00ac
            java.lang.String r11 = "TYPE_GOAWAY length < 8: %s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x00ac:
            if (r6 == 0) goto L_0x00b7
            java.lang.String r11 = "TYPE_GOAWAY streamId != 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x00b7:
            ne r11 = r10.f3042b
            int r11 = r11.mo2644h()
            ne r3 = r10.f3042b
            int r3 = r3.mo2644h()
            int r1 = r1 - r8
            lw r4 = p000.C0678lw.m2096a(r3)
            if (r4 != 0) goto L_0x00d9
            java.lang.String r11 = "TYPE_GOAWAY unexpected error code: %d"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x00d9:
            nf r0 = p000.C0762nf.f3266b
            if (r1 <= 0) goto L_0x00e4
            ne r0 = r10.f3042b
            long r3 = (long) r1
            nf r0 = r0.mo2629c(r3)
        L_0x00e4:
            r12.mo2495a(r11, r0)
            return r2
        L_0x00e8:
            if (r1 == r8) goto L_0x00f9
            java.lang.String r11 = "TYPE_PING length != 8: %s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x00f9:
            if (r6 == 0) goto L_0x0104
            java.lang.String r11 = "TYPE_PING streamId != 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0104:
            ne r1 = r10.f3042b
            int r1 = r1.mo2644h()
            ne r3 = r10.f3042b
            int r3 = r3.mo2644h()
            r11 = r11 & r2
            if (r11 == 0) goto L_0x0114
            r0 = r2
        L_0x0114:
            r12.mo2497a(r0, r1, r3)
            return r2
        L_0x0118:
            if (r6 != 0) goto L_0x0123
            java.lang.String r11 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0123:
            r3 = r11 & 8
            if (r3 == 0) goto L_0x0130
            ne r0 = r10.f3042b
            byte r0 = r0.mo2638f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0130:
            ne r3 = r10.f3042b
            int r3 = r3.mo2644h()
            r3 = r3 & r7
            int r1 = r1 + -4
            int r1 = m2168a(r1, r11, r0)
            java.util.List r11 = r10.m2170a(r1, r0, r11, r6)
            r12.mo2493a(r3, r11)
            return r2
        L_0x0145:
            if (r6 == 0) goto L_0x0150
            java.lang.String r11 = "TYPE_SETTINGS streamId != 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0150:
            r11 = r11 & r2
            if (r11 == 0) goto L_0x015e
            if (r1 == 0) goto L_0x0297
            java.lang.String r11 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x015e:
            int r11 = r1 % 6
            if (r11 == 0) goto L_0x0171
            java.lang.String r11 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0171:
            mh r11 = new mh
            r11.<init>()
            r4 = r0
        L_0x0177:
            if (r4 >= r1) goto L_0x01c4
            ne r6 = r10.f3042b
            short r6 = r6.mo2642g()
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            ne r7 = r10.f3042b
            int r7 = r7.mo2644h()
            switch(r6) {
                case 1: goto L_0x01be;
                case 2: goto L_0x01b1;
                case 3: goto L_0x01af;
                case 4: goto L_0x01a3;
                case 5: goto L_0x018d;
                default: goto L_0x018c;
            }
        L_0x018c:
            goto L_0x01be
        L_0x018d:
            if (r7 < r3) goto L_0x0194
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 <= r8) goto L_0x01be
        L_0x0194:
            java.lang.String r11 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x01a3:
            r6 = 7
            if (r7 >= 0) goto L_0x01be
            java.lang.String r11 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x01af:
            r6 = r5
            goto L_0x01be
        L_0x01b1:
            if (r7 == 0) goto L_0x01be
            if (r7 == r2) goto L_0x01be
            java.lang.String r11 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x01be:
            r11.mo2534a(r6, r7)
            int r4 = r4 + 6
            goto L_0x0177
        L_0x01c4:
            r12.mo2496a(r11)
            return r2
        L_0x01c8:
            if (r1 == r5) goto L_0x01d9
            java.lang.String r11 = "TYPE_RST_STREAM length: %d != 4"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x01d9:
            if (r6 != 0) goto L_0x01e4
            java.lang.String r11 = "TYPE_RST_STREAM streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x01e4:
            ne r11 = r10.f3042b
            int r11 = r11.mo2644h()
            lw r1 = p000.C0678lw.m2096a(r11)
            if (r1 != 0) goto L_0x01ff
            java.lang.String r12 = "TYPE_RST_STREAM unexpected error code: %d"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1[r0] = r11
            java.io.IOException r11 = p000.C0683lz.m2117b(r12, r1)
            throw r11
        L_0x01ff:
            r12.mo2494a(r6, r1)
            return r2
        L_0x0203:
            r11 = 5
            if (r1 == r11) goto L_0x0215
            java.lang.String r11 = "TYPE_PRIORITY length: %d != 5"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0215:
            if (r6 != 0) goto L_0x0220
            java.lang.String r11 = "TYPE_PRIORITY streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0220:
            r10.m2171a()
            return r2
        L_0x0224:
            if (r6 != 0) goto L_0x022f
            java.lang.String r11 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x022f:
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0235
            r3 = r2
            goto L_0x0236
        L_0x0235:
            r3 = r0
        L_0x0236:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0243
            ne r0 = r10.f3042b
            byte r0 = r0.mo2638f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0243:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x024c
            r10.m2171a()
            int r1 = r1 + -5
        L_0x024c:
            int r1 = m2168a(r1, r11, r0)
            java.util.List r11 = r10.m2170a(r1, r0, r11, r6)
            r12.mo2498a(r3, r6, r11)
            return r2
        L_0x0258:
            if (r6 != 0) goto L_0x0263
            java.lang.String r11 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x0263:
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0269
            r3 = r2
            goto L_0x026a
        L_0x0269:
            r3 = r0
        L_0x026a:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0270
            r4 = r2
            goto L_0x0271
        L_0x0270:
            r4 = r0
        L_0x0271:
            if (r4 == 0) goto L_0x027c
            java.lang.String r11 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x027c:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0289
            ne r0 = r10.f3042b
            byte r0 = r0.mo2638f()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0289:
            int r11 = m2168a(r1, r11, r0)
            ne r1 = r10.f3042b
            r12.mo2499a(r3, r6, r1, r11)
            ne r11 = r10.f3042b
            long r0 = (long) r0
            goto L_0x0062
        L_0x0297:
            return r2
        L_0x0298:
            java.lang.String r11 = "FRAME_SIZE_ERROR: %s"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r0] = r1
            java.io.IOException r11 = p000.C0683lz.m2117b(r11, r12)
            throw r11
        L_0x02a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0703mc.mo2500a(boolean, mc$b):boolean");
    }

    public final void close() {
        this.f3042b.close();
    }
}
