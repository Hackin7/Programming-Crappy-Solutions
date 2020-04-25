package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: my */
final class C0744my {

    /* renamed from: a */
    final boolean f3174a;

    /* renamed from: b */
    final C0761ne f3175b;

    /* renamed from: c */
    final C0745a f3176c;

    /* renamed from: d */
    boolean f3177d;

    /* renamed from: e */
    int f3178e;

    /* renamed from: f */
    long f3179f;

    /* renamed from: g */
    boolean f3180g;

    /* renamed from: h */
    boolean f3181h;

    /* renamed from: i */
    final C0758nc f3182i = new C0758nc();

    /* renamed from: j */
    private final C0758nc f3183j = new C0758nc();

    /* renamed from: k */
    private final byte[] f3184k;

    /* renamed from: l */
    private final C0759a f3185l;

    /* renamed from: my$a */
    public interface C0745a {
        /* renamed from: a */
        void mo2568a(int i, String str);

        /* renamed from: a */
        void mo2570a(C0762nf nfVar);

        /* renamed from: b */
        void mo2571b();

        /* renamed from: c */
        void mo2573c(String str);
    }

    C0744my(boolean z, C0761ne neVar, C0745a aVar) {
        if (neVar == null) {
            throw new NullPointerException("source == null");
        } else if (aVar == null) {
            throw new NullPointerException("frameCallback == null");
        } else {
            this.f3174a = z;
            this.f3175b = neVar;
            this.f3176c = aVar;
            C0759a aVar2 = null;
            this.f3184k = z ? null : new byte[4];
            if (!z) {
                aVar2 = new C0759a();
            }
            this.f3185l = aVar2;
        }
    }

    /* renamed from: d */
    private void m2314d() {
        while (!this.f3177d) {
            mo2578a();
            if (this.f3181h) {
                mo2579b();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2578a() {
        if (this.f3177d) {
            throw new IOException("closed");
        }
        long d_ = this.f3175b.mo2415a().mo2691d_();
        this.f3175b.mo2415a().mo2690d();
        try {
            byte f = this.f3175b.mo2638f() & 255;
            this.f3175b.mo2415a().mo2688a(d_, TimeUnit.NANOSECONDS);
            this.f3178e = f & 15;
            boolean z = false;
            this.f3180g = (f & 128) != 0;
            this.f3181h = (f & 8) != 0;
            if (!this.f3181h || this.f3180g) {
                boolean z2 = (f & 64) != 0;
                boolean z3 = (f & 32) != 0;
                boolean z4 = (f & 16) != 0;
                if (z2 || z3 || z4) {
                    throw new ProtocolException("Reserved flags are unsupported.");
                }
                byte f2 = this.f3175b.mo2638f() & 255;
                if ((f2 & 128) != 0) {
                    z = true;
                }
                if (z == this.f3174a) {
                    throw new ProtocolException(this.f3174a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                }
                this.f3179f = (long) (f2 & Byte.MAX_VALUE);
                if (this.f3179f == 126) {
                    this.f3179f = ((long) this.f3175b.mo2642g()) & 65535;
                } else if (this.f3179f == 127) {
                    this.f3179f = this.f3175b.mo2648i();
                    if (this.f3179f < 0) {
                        StringBuilder sb = new StringBuilder("Frame length 0x");
                        sb.append(Long.toHexString(this.f3179f));
                        sb.append(" > 0x7FFFFFFFFFFFFFFF");
                        throw new ProtocolException(sb.toString());
                    }
                }
                if (this.f3181h && this.f3179f > 125) {
                    throw new ProtocolException("Control frame must be less than 125B.");
                } else if (z) {
                    this.f3175b.mo2616a(this.f3184k);
                }
            } else {
                throw new ProtocolException("Control frames must be final.");
            }
        } catch (Throwable th) {
            this.f3175b.mo2415a().mo2688a(d_, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2579b() {
        if (this.f3179f > 0) {
            this.f3175b.mo2624b(this.f3183j, this.f3179f);
            if (!this.f3174a) {
                this.f3183j.mo2609a(this.f3185l);
                this.f3185l.mo2666a(0);
                C0743mx.m2312a(this.f3185l, this.f3184k);
                this.f3185l.close();
            }
        }
        switch (this.f3178e) {
            case 8:
                short s = 1005;
                String str = "";
                long j = this.f3183j.f3257b;
                if (j == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j != 0) {
                    s = this.f3183j.mo2642g();
                    str = this.f3183j.mo2657n();
                    String a = C0743mx.m2311a(s);
                    if (a != null) {
                        throw new ProtocolException(a);
                    }
                }
                this.f3176c.mo2568a(s, str);
                this.f3177d = true;
                return;
            case 9:
                this.f3176c.mo2570a(this.f3183j.mo2656m());
                return;
            case 10:
                C0745a aVar = this.f3176c;
                this.f3183j.mo2656m();
                aVar.mo2571b();
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.f3178e));
                throw new ProtocolException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2580c() {
        while (!this.f3177d) {
            if (this.f3179f > 0) {
                this.f3175b.mo2624b(this.f3182i, this.f3179f);
                if (!this.f3174a) {
                    this.f3182i.mo2609a(this.f3185l);
                    this.f3185l.mo2666a(this.f3182i.f3257b - this.f3179f);
                    C0743mx.m2312a(this.f3185l, this.f3184k);
                    this.f3185l.close();
                }
            }
            if (!this.f3180g) {
                m2314d();
                if (this.f3178e != 0) {
                    StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.f3178e));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }
}
