package p000;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;

/* renamed from: lu */
public final class C0670lu implements C0659lk {

    /* renamed from: a */
    final C0613ki f2879a;

    /* renamed from: b */
    final C0654lh f2880b;

    /* renamed from: c */
    final C0761ne f2881c;

    /* renamed from: d */
    final C0760nd f2882d;

    /* renamed from: e */
    int f2883e = 0;

    /* renamed from: f */
    private long f2884f = 262144;

    /* renamed from: lu$a */
    abstract class C0671a implements C0778ns {

        /* renamed from: a */
        protected final C0765ni f2885a;

        /* renamed from: b */
        protected boolean f2886b;

        /* renamed from: c */
        protected long f2887c;

        private C0671a() {
            this.f2885a = new C0765ni(C0670lu.this.f2881c.mo2415a());
            this.f2887c = 0;
        }

        /* synthetic */ C0671a(C0670lu luVar, byte b) {
            this();
        }

        /* renamed from: a */
        public long mo2414a(C0758nc ncVar, long j) {
            try {
                long a = C0670lu.this.f2881c.mo2414a(ncVar, j);
                if (a > 0) {
                    this.f2887c += a;
                }
                return a;
            } catch (IOException e) {
                mo2464a(false, e);
                throw e;
            }
        }

        /* renamed from: a */
        public final C0779nt mo2415a() {
            return this.f2885a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo2464a(boolean z, IOException iOException) {
            if (C0670lu.this.f2883e != 6) {
                if (C0670lu.this.f2883e != 5) {
                    StringBuilder sb = new StringBuilder("state: ");
                    sb.append(C0670lu.this.f2883e);
                    throw new IllegalStateException(sb.toString());
                }
                C0670lu.m2074a(this.f2885a);
                C0670lu.this.f2883e = 6;
                if (C0670lu.this.f2880b != null) {
                    C0670lu.this.f2880b.mo2445a(!z, (C0659lk) C0670lu.this, iOException);
                }
            }
        }
    }

    /* renamed from: lu$b */
    final class C0672b implements C0777nr {

        /* renamed from: b */
        private final C0765ni f2890b = new C0765ni(C0670lu.this.f2882d.mo2465a());

        /* renamed from: c */
        private boolean f2891c;

        C0672b() {
        }

        /* renamed from: a */
        public final C0779nt mo2465a() {
            return this.f2890b;
        }

        /* renamed from: a_ */
        public final void mo2450a_(C0758nc ncVar, long j) {
            if (this.f2891c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C0670lu.this.f2882d.mo2651j(j);
                C0670lu.this.f2882d.mo2622b("\r\n");
                C0670lu.this.f2882d.mo2450a_(ncVar, j);
                C0670lu.this.f2882d.mo2622b("\r\n");
            }
        }

        public final synchronized void close() {
            if (!this.f2891c) {
                this.f2891c = true;
                C0670lu.this.f2882d.mo2622b("0\r\n\r\n");
                C0670lu.m2074a(this.f2890b);
                C0670lu.this.f2883e = 3;
            }
        }

        public final synchronized void flush() {
            if (!this.f2891c) {
                C0670lu.this.f2882d.flush();
            }
        }
    }

    /* renamed from: lu$c */
    class C0673c extends C0671a {

        /* renamed from: f */
        private final C0607kf f2893f;

        /* renamed from: g */
        private long f2894g = -1;

        /* renamed from: h */
        private boolean f2895h = true;

        C0673c(C0607kf kfVar) {
            super(C0670lu.this, 0);
            this.f2893f = kfVar;
        }

        /* renamed from: a */
        public final long mo2414a(C0758nc ncVar, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f2886b) {
                throw new IllegalStateException("closed");
            } else if (!this.f2895h) {
                return -1;
            } else {
                if (this.f2894g == 0 || this.f2894g == -1) {
                    if (this.f2894g != -1) {
                        C0670lu.this.f2881c.mo2658o();
                    }
                    try {
                        this.f2894g = C0670lu.this.f2881c.mo2655l();
                        String trim = C0670lu.this.f2881c.mo2658o().trim();
                        if (this.f2894g < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            StringBuilder sb2 = new StringBuilder("expected chunk size and optional extensions but was \"");
                            sb2.append(this.f2894g);
                            sb2.append(trim);
                            sb2.append("\"");
                            throw new ProtocolException(sb2.toString());
                        }
                        if (this.f2894g == 0) {
                            this.f2895h = false;
                            C0662lm.m2055a(C0670lu.this.f2879a.f2619k, this.f2893f, C0670lu.this.mo2463d());
                            mo2464a(true, (IOException) null);
                        }
                        if (!this.f2895h) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long a = super.mo2414a(ncVar, Math.min(j, this.f2894g));
                if (a == -1) {
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    mo2464a(false, (IOException) protocolException);
                    throw protocolException;
                }
                this.f2894g -= a;
                return a;
            }
        }

        public final void close() {
            if (!this.f2886b) {
                if (this.f2895h && !C0633kv.m1977a((C0778ns) this, TimeUnit.MILLISECONDS)) {
                    mo2464a(false, (IOException) null);
                }
                this.f2886b = true;
            }
        }
    }

    /* renamed from: lu$d */
    final class C0674d implements C0777nr {

        /* renamed from: b */
        private final C0765ni f2897b = new C0765ni(C0670lu.this.f2882d.mo2465a());

        /* renamed from: c */
        private boolean f2898c;

        /* renamed from: d */
        private long f2899d;

        C0674d(long j) {
            this.f2899d = j;
        }

        /* renamed from: a */
        public final C0779nt mo2465a() {
            return this.f2897b;
        }

        /* renamed from: a_ */
        public final void mo2450a_(C0758nc ncVar, long j) {
            if (this.f2898c) {
                throw new IllegalStateException("closed");
            }
            C0633kv.m1971a(ncVar.f3257b, j);
            if (j > this.f2899d) {
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.f2899d);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            C0670lu.this.f2882d.mo2450a_(ncVar, j);
            this.f2899d -= j;
        }

        public final void close() {
            if (!this.f2898c) {
                this.f2898c = true;
                if (this.f2899d > 0) {
                    throw new ProtocolException("unexpected end of stream");
                }
                C0670lu.m2074a(this.f2897b);
                C0670lu.this.f2883e = 3;
            }
        }

        public final void flush() {
            if (!this.f2898c) {
                C0670lu.this.f2882d.flush();
            }
        }
    }

    /* renamed from: lu$e */
    class C0675e extends C0671a {

        /* renamed from: f */
        private long f2901f;

        C0675e(long j) {
            super(C0670lu.this, 0);
            this.f2901f = j;
            if (this.f2901f == 0) {
                mo2464a(true, (IOException) null);
            }
        }

        /* renamed from: a */
        public final long mo2414a(C0758nc ncVar, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f2886b) {
                throw new IllegalStateException("closed");
            } else if (this.f2901f == 0) {
                return -1;
            } else {
                long a = super.mo2414a(ncVar, Math.min(this.f2901f, j));
                if (a == -1) {
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    mo2464a(false, (IOException) protocolException);
                    throw protocolException;
                }
                this.f2901f -= a;
                if (this.f2901f == 0) {
                    mo2464a(true, (IOException) null);
                }
                return a;
            }
        }

        public final void close() {
            if (!this.f2886b) {
                if (this.f2901f != 0 && !C0633kv.m1977a((C0778ns) this, TimeUnit.MILLISECONDS)) {
                    mo2464a(false, (IOException) null);
                }
                this.f2886b = true;
            }
        }
    }

    /* renamed from: lu$f */
    class C0676f extends C0671a {

        /* renamed from: f */
        private boolean f2903f;

        C0676f() {
            super(C0670lu.this, 0);
        }

        /* renamed from: a */
        public final long mo2414a(C0758nc ncVar, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f2886b) {
                throw new IllegalStateException("closed");
            } else if (this.f2903f) {
                return -1;
            } else {
                long a = super.mo2414a(ncVar, j);
                if (a != -1) {
                    return a;
                }
                this.f2903f = true;
                mo2464a(true, (IOException) null);
                return -1;
            }
        }

        public final void close() {
            if (!this.f2886b) {
                if (!this.f2903f) {
                    mo2464a(false, (IOException) null);
                }
                this.f2886b = true;
            }
        }
    }

    public C0670lu(C0613ki kiVar, C0654lh lhVar, C0761ne neVar, C0760nd ndVar) {
        this.f2879a = kiVar;
        this.f2880b = lhVar;
        this.f2881c = neVar;
        this.f2882d = ndVar;
    }

    /* renamed from: a */
    static void m2074a(C0765ni niVar) {
        C0779nt ntVar = niVar.f3272a;
        C0779nt ntVar2 = C0779nt.f3305c;
        if (ntVar2 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        niVar.f3272a = ntVar2;
        ntVar.mo2694f_();
        ntVar.mo2690d();
    }

    /* renamed from: e */
    private String m2075e() {
        String d = this.f2881c.mo2631d(this.f2884f);
        this.f2884f -= (long) d.length();
        return d;
    }

    /* renamed from: a */
    public final C0624a mo2451a(boolean z) {
        if (this.f2883e == 1 || this.f2883e == 3) {
            try {
                C0668ls a = C0668ls.m2073a(m2075e());
                C0624a aVar = new C0624a();
                aVar.f2706b = a.f2876a;
                aVar.f2707c = a.f2877b;
                aVar.f2708d = a.f2878c;
                C0624a a2 = aVar.mo2393a(mo2463d());
                if (z && a.f2877b == 100) {
                    return null;
                }
                if (a.f2877b == 100) {
                    this.f2883e = 3;
                    return a2;
                }
                this.f2883e = 4;
                return a2;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                sb.append(this.f2880b);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f2883e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final C0625ko mo2452a(C0623kn knVar) {
        C0600kc kcVar = this.f2880b.f2839f;
        C0580js jsVar = this.f2880b.f2838e;
        C0600kc.m1838q();
        String a = knVar.mo2387a("Content-Type");
        if (!C0662lm.m2057b(knVar)) {
            return new C0665lp(a, 0, C0768nl.m2508a(mo2461a(0)));
        }
        if ("chunked".equalsIgnoreCase(knVar.mo2387a("Transfer-Encoding"))) {
            C0607kf kfVar = knVar.f2692a.f2677a;
            if (this.f2883e != 4) {
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(this.f2883e);
                throw new IllegalStateException(sb.toString());
            }
            this.f2883e = 5;
            return new C0665lp(a, -1, C0768nl.m2508a((C0778ns) new C0673c(kfVar)));
        }
        long a2 = C0662lm.m2054a(knVar);
        if (a2 != -1) {
            return new C0665lp(a, a2, C0768nl.m2508a(mo2461a(a2)));
        }
        if (this.f2883e != 4) {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f2883e);
            throw new IllegalStateException(sb2.toString());
        } else if (this.f2880b == null) {
            throw new IllegalStateException("streamAllocation == null");
        } else {
            this.f2883e = 5;
            this.f2880b.mo2448d();
            return new C0665lp(a, -1, C0768nl.m2508a((C0778ns) new C0676f()));
        }
    }

    /* renamed from: a */
    public final C0777nr mo2453a(C0619kl klVar, long j) {
        if ("chunked".equalsIgnoreCase(klVar.mo2375a("Transfer-Encoding"))) {
            if (this.f2883e != 1) {
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(this.f2883e);
                throw new IllegalStateException(sb.toString());
            }
            this.f2883e = 2;
            return new C0672b();
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f2883e != 1) {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f2883e);
            throw new IllegalStateException(sb2.toString());
        } else {
            this.f2883e = 2;
            return new C0674d(j);
        }
    }

    /* renamed from: a */
    public final C0778ns mo2461a(long j) {
        if (this.f2883e != 4) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.f2883e);
            throw new IllegalStateException(sb.toString());
        }
        this.f2883e = 5;
        return new C0675e(j);
    }

    /* renamed from: a */
    public final void mo2454a() {
        this.f2882d.flush();
    }

    /* renamed from: a */
    public final void mo2462a(C0605ke keVar, String str) {
        if (this.f2883e != 0) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.f2883e);
            throw new IllegalStateException(sb.toString());
        }
        this.f2882d.mo2622b(str).mo2622b("\r\n");
        int length = keVar.f2577a.length / 2;
        for (int i = 0; i < length; i++) {
            this.f2882d.mo2622b(keVar.mo2322a(i)).mo2622b(": ").mo2622b(keVar.mo2325b(i)).mo2622b("\r\n");
        }
        this.f2882d.mo2622b("\r\n");
        this.f2883e = 1;
    }

    /* renamed from: a */
    public final void mo2455a(C0619kl klVar) {
        Type type = this.f2880b.mo2446b().f2804a.f2721b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(klVar.f2678b);
        sb.append(' ');
        if (!klVar.f2677a.mo2333b() && type == Type.HTTP) {
            sb.append(klVar.f2677a);
        } else {
            sb.append(C0666lq.m2067a(klVar.f2677a));
        }
        sb.append(" HTTP/1.1");
        mo2462a(klVar.f2679c, sb.toString());
    }

    /* renamed from: b */
    public final void mo2456b() {
        this.f2882d.flush();
    }

    /* renamed from: c */
    public final void mo2457c() {
        C0648ld b = this.f2880b.mo2446b();
        if (b != null) {
            C0633kv.m1973a(b.f2805b);
        }
    }

    /* renamed from: d */
    public final C0605ke mo2463d() {
        C0606a aVar = new C0606a();
        while (true) {
            String e = m2075e();
            if (e.length() == 0) {
                return aVar.mo2331a();
            }
            C0631kt.f2730a.mo2365a(aVar, e);
        }
    }
}
