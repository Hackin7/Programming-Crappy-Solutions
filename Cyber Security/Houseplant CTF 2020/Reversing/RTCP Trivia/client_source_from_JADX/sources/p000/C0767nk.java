package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: nk */
public final class C0767nk implements C0778ns {

    /* renamed from: a */
    private final C0761ne f3278a;

    /* renamed from: b */
    private final Inflater f3279b;

    /* renamed from: c */
    private int f3280c;

    /* renamed from: d */
    private boolean f3281d;

    C0767nk(C0761ne neVar, Inflater inflater) {
        if (neVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        } else {
            this.f3278a = neVar;
            this.f3279b = inflater;
        }
    }

    /* renamed from: b */
    private void m2504b() {
        if (this.f3280c != 0) {
            int remaining = this.f3280c - this.f3279b.getRemaining();
            this.f3280c -= remaining;
            this.f3278a.mo2643g((long) remaining);
        }
    }

    /* renamed from: a */
    public final long mo2414a(C0758nc ncVar, long j) {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f3281d) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            do {
                z = false;
                if (this.f3279b.needsInput()) {
                    m2504b();
                    if (this.f3279b.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.f3278a.mo2633d()) {
                        z = true;
                    } else {
                        C0774no noVar = this.f3278a.mo2618b().f3256a;
                        this.f3280c = noVar.f3296c - noVar.f3295b;
                        this.f3279b.setInput(noVar.f3294a, noVar.f3295b, this.f3280c);
                    }
                }
                try {
                    C0774no e = ncVar.mo2636e(1);
                    int inflate = this.f3279b.inflate(e.f3294a, e.f3296c, (int) Math.min(j, (long) (8192 - e.f3296c)));
                    if (inflate > 0) {
                        e.f3296c += inflate;
                        long j2 = (long) inflate;
                        ncVar.f3257b += j2;
                        return j2;
                    }
                    if (!this.f3279b.finished()) {
                        if (this.f3279b.needsDictionary()) {
                        }
                    }
                    m2504b();
                    if (e.f3295b == e.f3296c) {
                        ncVar.f3256a = e.mo2707c();
                        C0775np.m2563a(e);
                    }
                    return -1;
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            } while (!z);
            throw new EOFException("source exhausted prematurely");
        }
    }

    /* renamed from: a */
    public final C0779nt mo2415a() {
        return this.f3278a.mo2415a();
    }

    public final void close() {
        if (!this.f3281d) {
            this.f3279b.end();
            this.f3281d = true;
            this.f3278a.close();
        }
    }
}
