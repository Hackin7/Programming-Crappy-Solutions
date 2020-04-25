package p000;

/* renamed from: kw */
public final class C0636kw implements C0610kg {

    /* renamed from: a */
    final C0645la f2752a;

    public C0636kw(C0645la laVar) {
        this.f2752a = laVar;
    }

    /* renamed from: a */
    private static C0605ke m1987a(C0605ke keVar, C0605ke keVar2) {
        C0606a aVar = new C0606a();
        int length = keVar.f2577a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = keVar.mo2322a(i);
            String b = keVar.mo2325b(i);
            if ((!"Warning".equalsIgnoreCase(a) || !b.startsWith("1")) && (m1990b(a) || !m1989a(a) || keVar2.mo2323a(a) == null)) {
                C0631kt.f2730a.mo2366a(aVar, a, b);
            }
        }
        int length2 = keVar2.f2577a.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String a2 = keVar2.mo2322a(i2);
            if (!m1990b(a2) && m1989a(a2)) {
                C0631kt.f2730a.mo2366a(aVar, a2, keVar2.mo2325b(i2));
            }
        }
        return aVar.mo2331a();
    }

    /* renamed from: a */
    private static C0623kn m1988a(C0623kn knVar) {
        if (knVar == null || knVar.f2698g == null) {
            return knVar;
        }
        C0624a a = knVar.mo2388a();
        a.f2711g = null;
        return a.mo2395a();
    }

    /* renamed from: a */
    private static boolean m1989a(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: b */
    private static boolean m1990b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kl, kn] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v0, types: [kl, kn]
      assigns: []
      uses: [kl, kn]
      mth insns count: 333
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c5  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0623kn mo2349a(p000.C0610kg.C0611a r20) {
        /*
            r19 = this;
            r1 = r19
            la r2 = r1.f2752a
            r3 = 0
            if (r2 == 0) goto L_0x000e
            la r2 = r1.f2752a
            kn r2 = r2.mo2422a()
            goto L_0x000f
        L_0x000e:
            r2 = r3
        L_0x000f:
            long r4 = java.lang.System.currentTimeMillis()
            ky$a r6 = new ky$a
            kl r7 = r20.mo2350a()
            r6.<init>(r4, r7, r2)
            kn r4 = r6.f2762c
            if (r4 != 0) goto L_0x002a
            ky r4 = new ky
            kl r5 = r6.f2761b
            r4.<init>(r5, r3)
        L_0x0027:
            r5 = r3
            goto L_0x0216
        L_0x002a:
            kl r4 = r6.f2761b
            kf r4 = r4.f2677a
            boolean r4 = r4.mo2333b()
            if (r4 == 0) goto L_0x0042
            kn r4 = r6.f2762c
            kd r4 = r4.f2696e
            if (r4 != 0) goto L_0x0042
            ky r4 = new ky
            kl r5 = r6.f2761b
            r4.<init>(r5, r3)
            goto L_0x0027
        L_0x0042:
            kn r4 = r6.f2762c
            kl r5 = r6.f2761b
            boolean r4 = p000.C0639ky.m1995a(r4, r5)
            if (r4 != 0) goto L_0x0054
            ky r4 = new ky
            kl r5 = r6.f2761b
            r4.<init>(r5, r3)
            goto L_0x0027
        L_0x0054:
            kl r4 = r6.f2761b
            jr r4 = r4.mo2377b()
            boolean r5 = r4.f2375c
            if (r5 != 0) goto L_0x020e
            kl r5 = r6.f2761b
            java.lang.String r7 = "If-Modified-Since"
            java.lang.String r7 = r5.mo2375a(r7)
            if (r7 != 0) goto L_0x0073
            java.lang.String r7 = "If-None-Match"
            java.lang.String r5 = r5.mo2375a(r7)
            if (r5 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r5 = 0
            goto L_0x0074
        L_0x0073:
            r5 = 1
        L_0x0074:
            if (r5 == 0) goto L_0x0078
            goto L_0x020e
        L_0x0078:
            kn r5 = r6.f2762c
            jr r5 = r5.mo2389b()
            boolean r7 = r5.f2384l
            if (r7 == 0) goto L_0x008a
            ky r4 = new ky
            kn r5 = r6.f2762c
            r4.<init>(r3, r5)
            goto L_0x0027
        L_0x008a:
            java.util.Date r7 = r6.f2763d
            r10 = 0
            if (r7 == 0) goto L_0x009e
            long r12 = r6.f2769j
            java.util.Date r7 = r6.f2763d
            long r14 = r7.getTime()
            long r12 = r12 - r14
            long r12 = java.lang.Math.max(r10, r12)
            goto L_0x009f
        L_0x009e:
            r12 = r10
        L_0x009f:
            int r7 = r6.f2771l
            r14 = -1
            if (r7 == r14) goto L_0x00b1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            int r15 = r6.f2771l
            long r8 = (long) r15
            long r7 = r7.toMillis(r8)
            long r12 = java.lang.Math.max(r12, r7)
        L_0x00b1:
            long r7 = r6.f2769j
            r17 = r4
            long r3 = r6.f2768i
            long r7 = r7 - r3
            long r3 = r6.f2760a
            long r10 = r6.f2769j
            long r3 = r3 - r10
            long r12 = r12 + r7
            long r12 = r12 + r3
            kn r3 = r6.f2762c
            jr r3 = r3.mo2389b()
            int r4 = r3.f2377e
            if (r4 == r14) goto L_0x00d9
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            int r3 = r3.f2377e
            long r7 = (long) r3
            long r10 = r4.toMillis(r7)
        L_0x00d2:
            r7 = r10
            r3 = r17
        L_0x00d5:
            r10 = 0
            goto L_0x0142
        L_0x00d9:
            java.util.Date r3 = r6.f2767h
            if (r3 == 0) goto L_0x00fe
            java.util.Date r3 = r6.f2763d
            if (r3 == 0) goto L_0x00e8
            java.util.Date r3 = r6.f2763d
            long r3 = r3.getTime()
            goto L_0x00ea
        L_0x00e8:
            long r3 = r6.f2769j
        L_0x00ea:
            java.util.Date r7 = r6.f2767h
            long r7 = r7.getTime()
            long r10 = r7 - r3
            r3 = 0
            int r7 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f9
            goto L_0x00d2
        L_0x00f9:
            r3 = r17
            r7 = 0
            goto L_0x00d5
        L_0x00fe:
            java.util.Date r3 = r6.f2765f
            if (r3 == 0) goto L_0x013d
            kn r3 = r6.f2762c
            kl r3 = r3.f2692a
            kf r3 = r3.f2677a
            java.util.List<java.lang.String> r4 = r3.f2583d
            if (r4 != 0) goto L_0x010e
            r3 = 0
            goto L_0x011c
        L_0x010e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.List<java.lang.String> r3 = r3.f2583d
            p000.C0607kf.m1862b(r4, r3)
            java.lang.String r3 = r4.toString()
        L_0x011c:
            if (r3 != 0) goto L_0x013d
            java.util.Date r3 = r6.f2763d
            if (r3 == 0) goto L_0x0129
            java.util.Date r3 = r6.f2763d
            long r3 = r3.getTime()
            goto L_0x012b
        L_0x0129:
            long r3 = r6.f2768i
        L_0x012b:
            java.util.Date r7 = r6.f2765f
            long r7 = r7.getTime()
            long r3 = r3 - r7
            r10 = 0
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x013f
            r7 = 10
            long r3 = r3 / r7
            r7 = r3
            goto L_0x0140
        L_0x013d:
            r10 = 0
        L_0x013f:
            r7 = r10
        L_0x0140:
            r3 = r17
        L_0x0142:
            int r4 = r3.f2377e
            if (r4 == r14) goto L_0x0153
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            int r9 = r3.f2377e
            long r10 = (long) r9
            long r9 = r4.toMillis(r10)
            long r7 = java.lang.Math.min(r7, r9)
        L_0x0153:
            int r4 = r3.f2382j
            if (r4 == r14) goto L_0x0161
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            int r9 = r3.f2382j
            long r9 = (long) r9
            long r10 = r4.toMillis(r9)
            goto L_0x0163
        L_0x0161:
            r10 = 0
        L_0x0163:
            boolean r4 = r5.f2380h
            if (r4 != 0) goto L_0x0175
            int r4 = r3.f2381i
            if (r4 == r14) goto L_0x0175
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            int r3 = r3.f2381i
            long r14 = (long) r3
            long r3 = r4.toMillis(r14)
            goto L_0x0177
        L_0x0175:
            r3 = 0
        L_0x0177:
            boolean r5 = r5.f2375c
            if (r5 != 0) goto L_0x01c1
            long r10 = r10 + r12
            long r3 = r3 + r7
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x01c1
            kn r3 = r6.f2762c
            kn$a r3 = r3.mo2388a()
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0192
            java.lang.String r4 = "Warning"
            java.lang.String r5 = "110 HttpURLConnection \"Response is stale\""
            r3.mo2392a(r4, r5)
        L_0x0192:
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b6
            kn r4 = r6.f2762c
            jr r4 = r4.mo2389b()
            int r4 = r4.f2377e
            r5 = -1
            if (r4 != r5) goto L_0x01ab
            java.util.Date r4 = r6.f2767h
            if (r4 != 0) goto L_0x01ab
            r16 = 1
            goto L_0x01ad
        L_0x01ab:
            r16 = 0
        L_0x01ad:
            if (r16 == 0) goto L_0x01b6
            java.lang.String r4 = "Warning"
            java.lang.String r5 = "113 HttpURLConnection \"Heuristic expiration\""
            r3.mo2392a(r4, r5)
        L_0x01b6:
            ky r4 = new ky
            kn r3 = r3.mo2395a()
            r5 = 0
            r4.<init>(r5, r3)
            goto L_0x0216
        L_0x01c1:
            java.lang.String r3 = r6.f2770k
            if (r3 == 0) goto L_0x01ca
            java.lang.String r3 = "If-None-Match"
            java.lang.String r4 = r6.f2770k
            goto L_0x01db
        L_0x01ca:
            java.util.Date r3 = r6.f2765f
            if (r3 == 0) goto L_0x01d3
            java.lang.String r3 = "If-Modified-Since"
            java.lang.String r4 = r6.f2766g
            goto L_0x01db
        L_0x01d3:
            java.util.Date r3 = r6.f2763d
            if (r3 == 0) goto L_0x0205
            java.lang.String r3 = "If-Modified-Since"
            java.lang.String r4 = r6.f2764e
        L_0x01db:
            kl r5 = r6.f2761b
            ke r5 = r5.f2679c
            ke$a r5 = r5.mo2324a()
            kt r7 = p000.C0631kt.f2730a
            r7.mo2366a(r5, r3, r4)
            kl r3 = r6.f2761b
            kl$a r3 = r3.mo2376a()
            ke r4 = r5.mo2331a()
            ke$a r4 = r4.mo2324a()
            r3.f2685c = r4
            kl r3 = r3.mo2383a()
            ky r4 = new ky
            kn r5 = r6.f2762c
            r4.<init>(r3, r5)
            r5 = 0
            goto L_0x0216
        L_0x0205:
            ky r4 = new ky
            kl r3 = r6.f2761b
            r5 = 0
            r4.<init>(r3, r5)
            goto L_0x0216
        L_0x020e:
            r5 = r3
            ky r4 = new ky
            kl r3 = r6.f2761b
            r4.<init>(r3, r5)
        L_0x0216:
            kl r3 = r4.f2758a
            if (r3 == 0) goto L_0x0229
            kl r3 = r6.f2761b
            jr r3 = r3.mo2377b()
            boolean r3 = r3.f2383k
            if (r3 == 0) goto L_0x0229
            ky r4 = new ky
            r4.<init>(r5, r5)
        L_0x0229:
            kl r3 = r4.f2758a
            kn r4 = r4.f2759b
            if (r2 == 0) goto L_0x0236
            if (r4 != 0) goto L_0x0236
            ko r5 = r2.f2698g
            p000.C0633kv.m1972a(r5)
        L_0x0236:
            if (r3 != 0) goto L_0x0264
            if (r4 != 0) goto L_0x0264
            kn$a r2 = new kn$a
            r2.<init>()
            kl r3 = r20.mo2350a()
            r2.f2705a = r3
            kj r3 = p000.C0616kj.HTTP_1_1
            r2.f2706b = r3
            r3 = 504(0x1f8, float:7.06E-43)
            r2.f2707c = r3
            java.lang.String r3 = "Unsatisfiable Request (only-if-cached)"
            r2.f2708d = r3
            ko r3 = p000.C0633kv.f2734c
            r2.f2711g = r3
            r3 = -1
            r2.f2715k = r3
            long r3 = java.lang.System.currentTimeMillis()
            r2.f2716l = r3
            kn r2 = r2.mo2395a()
            return r2
        L_0x0264:
            if (r3 != 0) goto L_0x0277
            kn$a r2 = r4.mo2388a()
            kn r3 = m1988a(r4)
            kn$a r2 = r2.mo2396b(r3)
            kn r2 = r2.mo2395a()
            return r2
        L_0x0277:
            r5 = r20
            kn r5 = r5.mo2351a(r3)     // Catch:{ all -> 0x0354 }
            if (r5 != 0) goto L_0x0286
            if (r2 == 0) goto L_0x0286
            ko r2 = r2.f2698g
            p000.C0633kv.m1972a(r2)
        L_0x0286:
            if (r4 == 0) goto L_0x02c5
            int r2 = r5.f2694c
            r6 = 304(0x130, float:4.26E-43)
            if (r2 != r6) goto L_0x02c0
            kn$a r2 = r4.mo2388a()
            ke r3 = r4.f2697f
            ke r6 = r5.f2697f
            ke r3 = m1987a(r3, r6)
            kn$a r2 = r2.mo2393a(r3)
            long r6 = r5.f2702k
            r2.f2715k = r6
            long r6 = r5.f2703l
            r2.f2716l = r6
            kn r3 = m1988a(r4)
            kn$a r2 = r2.mo2396b(r3)
            kn r3 = m1988a(r5)
            kn$a r2 = r2.mo2394a(r3)
            kn r2 = r2.mo2395a()
            ko r3 = r5.f2698g
            r3.close()
            return r2
        L_0x02c0:
            ko r2 = r4.f2698g
            p000.C0633kv.m1972a(r2)
        L_0x02c5:
            kn$a r2 = r5.mo2388a()
            kn r4 = m1988a(r4)
            kn$a r2 = r2.mo2396b(r4)
            kn r4 = m1988a(r5)
            kn$a r2 = r2.mo2394a(r4)
            kn r2 = r2.mo2395a()
            la r4 = r1.f2752a
            if (r4 == 0) goto L_0x0353
            boolean r4 = p000.C0662lm.m2057b(r2)
            if (r4 == 0) goto L_0x032c
            boolean r4 = p000.C0639ky.m1995a(r2, r3)
            if (r4 == 0) goto L_0x032c
            la r3 = r1.f2752a
            kx r3 = r3.mo2423b()
            if (r3 != 0) goto L_0x02f6
            return r2
        L_0x02f6:
            nr r4 = r3.mo2417a()
            if (r4 != 0) goto L_0x02fd
            return r2
        L_0x02fd:
            ko r5 = r2.f2698g
            ne r5 = r5.mo2398b()
            nd r4 = p000.C0768nl.m2507a(r4)
            kw$1 r6 = new kw$1
            r6.<init>(r5, r3, r4)
            java.lang.String r3 = "Content-Type"
            java.lang.String r3 = r2.mo2387a(r3)
            ko r4 = r2.f2698g
            long r4 = r4.mo2397a()
            kn$a r2 = r2.mo2388a()
            lp r7 = new lp
            ne r6 = p000.C0768nl.m2508a(r6)
            r7.<init>(r3, r4, r6)
            r2.f2711g = r7
            kn r2 = r2.mo2395a()
            return r2
        L_0x032c:
            java.lang.String r3 = r3.f2678b
            java.lang.String r4 = "POST"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0353
            java.lang.String r4 = "PATCH"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0353
            java.lang.String r4 = "PUT"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0353
            java.lang.String r4 = "DELETE"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0353
            java.lang.String r4 = "MOVE"
            r3.equals(r4)
        L_0x0353:
            return r2
        L_0x0354:
            r0 = move-exception
            if (r2 == 0) goto L_0x035c
            ko r2 = r2.f2698g
            p000.C0633kv.m1972a(r2)
        L_0x035c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0636kw.mo2349a(kg$a):kn");
    }
}
