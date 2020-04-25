package p000;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: kz */
public final class C0641kz implements Closeable, Flushable {

    /* renamed from: a */
    static final Pattern f2772a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: j */
    static final /* synthetic */ boolean f2773j = true;

    /* renamed from: b */
    final C0717mj f2774b;

    /* renamed from: c */
    final int f2775c;

    /* renamed from: d */
    C0760nd f2776d;

    /* renamed from: e */
    final LinkedHashMap<String, C0643b> f2777e;

    /* renamed from: f */
    int f2778f;

    /* renamed from: g */
    boolean f2779g;

    /* renamed from: h */
    boolean f2780h;

    /* renamed from: i */
    boolean f2781i;

    /* renamed from: k */
    private long f2782k;

    /* renamed from: l */
    private long f2783l;

    /* renamed from: m */
    private final Executor f2784m;

    /* renamed from: n */
    private final Runnable f2785n;

    /* renamed from: kz$a */
    public final class C0642a {

        /* renamed from: a */
        final C0643b f2786a;

        /* renamed from: b */
        boolean f2787b;

        /* renamed from: c */
        final /* synthetic */ C0641kz f2788c;
    }

    /* renamed from: kz$b */
    final class C0643b {

        /* renamed from: a */
        final String f2789a;

        /* renamed from: b */
        final long[] f2790b;

        /* renamed from: c */
        final File[] f2791c;

        /* renamed from: d */
        final File[] f2792d;

        /* renamed from: e */
        boolean f2793e;

        /* renamed from: f */
        C0642a f2794f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2420a(C0760nd ndVar) {
            for (long k : this.f2790b) {
                ndVar.mo2646h(32).mo2654k(k);
            }
        }
    }

    /* renamed from: a */
    private synchronized void m1996a(C0642a aVar) {
        C0760nd ndVar;
        C0643b bVar = aVar.f2786a;
        if (bVar.f2794f != aVar) {
            throw new IllegalStateException();
        }
        for (int i = 0; i < this.f2775c; i++) {
            this.f2774b.mo2537a(bVar.f2792d[i]);
        }
        this.f2778f++;
        bVar.f2794f = null;
        if (false || bVar.f2793e) {
            bVar.f2793e = true;
            this.f2776d.mo2622b("CLEAN").mo2646h(32);
            this.f2776d.mo2622b(bVar.f2789a);
            bVar.mo2420a(this.f2776d);
            ndVar = this.f2776d;
        } else {
            this.f2777e.remove(bVar.f2789a);
            this.f2776d.mo2622b("REMOVE").mo2646h(32);
            this.f2776d.mo2622b(bVar.f2789a);
            ndVar = this.f2776d;
        }
        ndVar.mo2646h(10);
        this.f2776d.flush();
        if (this.f2783l > this.f2782k || m1997a()) {
            this.f2784m.execute(this.f2785n);
        }
    }

    /* renamed from: a */
    private boolean m1997a() {
        return this.f2778f >= 2000 && this.f2778f >= this.f2777e.size();
    }

    /* renamed from: a */
    private boolean m1998a(C0643b bVar) {
        if (bVar.f2794f != null) {
            C0642a aVar = bVar.f2794f;
            if (aVar.f2786a.f2794f == aVar) {
                for (int i = 0; i < aVar.f2788c.f2775c; i++) {
                    try {
                        aVar.f2788c.f2774b.mo2537a(aVar.f2786a.f2792d[i]);
                    } catch (IOException unused) {
                    }
                }
                aVar.f2786a.f2794f = null;
            }
        }
        for (int i2 = 0; i2 < this.f2775c; i2++) {
            this.f2774b.mo2537a(bVar.f2791c[i2]);
            this.f2783l -= bVar.f2790b[i2];
            bVar.f2790b[i2] = 0;
        }
        this.f2778f++;
        this.f2776d.mo2622b("REMOVE").mo2646h(32).mo2622b(bVar.f2789a).mo2646h(10);
        this.f2777e.remove(bVar.f2789a);
        if (m1997a()) {
            this.f2784m.execute(this.f2785n);
        }
        return true;
    }

    /* renamed from: b */
    private synchronized boolean m1999b() {
        return this.f2780h;
    }

    /* renamed from: c */
    private synchronized void m2000c() {
        if (m1999b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    private void m2001d() {
        while (this.f2783l > this.f2782k) {
            m1998a((C0643b) this.f2777e.values().iterator().next());
        }
        this.f2781i = false;
    }

    public final synchronized void close() {
        C0643b[] bVarArr;
        if (this.f2779g) {
            if (!this.f2780h) {
                for (C0643b bVar : (C0643b[]) this.f2777e.values().toArray(new C0643b[this.f2777e.size()])) {
                    if (bVar.f2794f != null) {
                        C0642a aVar = bVar.f2794f;
                        synchronized (aVar.f2788c) {
                            if (aVar.f2787b) {
                                throw new IllegalStateException();
                            }
                            if (aVar.f2786a.f2794f == aVar) {
                                aVar.f2788c.m1996a(aVar);
                            }
                            aVar.f2787b = true;
                        }
                    }
                }
                m2001d();
                this.f2776d.close();
                this.f2776d = null;
                this.f2780h = true;
                return;
            }
        }
        this.f2780h = true;
    }

    public final synchronized void flush() {
        if (this.f2779g) {
            m2000c();
            m2001d();
            this.f2776d.flush();
        }
    }
}
