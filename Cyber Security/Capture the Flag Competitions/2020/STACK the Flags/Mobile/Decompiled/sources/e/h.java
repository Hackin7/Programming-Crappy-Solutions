package e;

import javax.annotation.Nullable;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2839a;

    /* renamed from: b  reason: collision with root package name */
    public int f2840b;

    /* renamed from: c  reason: collision with root package name */
    public int f2841c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2842d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2843e;

    /* renamed from: f  reason: collision with root package name */
    public h f2844f;

    /* renamed from: g  reason: collision with root package name */
    public h f2845g;

    public h() {
        this.f2839a = new byte[8192];
        this.f2843e = true;
        this.f2842d = false;
    }

    public h(byte[] data, int pos, int limit, boolean shared, boolean owner) {
        this.f2839a = data;
        this.f2840b = pos;
        this.f2841c = limit;
        this.f2842d = shared;
        this.f2843e = owner;
    }

    public final h d() {
        this.f2842d = true;
        return new h(this.f2839a, this.f2840b, this.f2841c, true, false);
    }

    @Nullable
    public final h b() {
        h result = this.f2844f;
        if (result == this) {
            result = null;
        }
        h hVar = this.f2845g;
        hVar.f2844f = this.f2844f;
        this.f2844f.f2845g = hVar;
        this.f2844f = null;
        this.f2845g = null;
        return result;
    }

    public final h c(h segment) {
        segment.f2845g = this;
        segment.f2844f = this.f2844f;
        this.f2844f.f2845g = segment;
        this.f2844f = segment;
        return segment;
    }

    public final h e(int byteCount) {
        h prefix;
        if (byteCount <= 0 || byteCount > this.f2841c - this.f2840b) {
            throw new IllegalArgumentException();
        }
        if (byteCount >= 1024) {
            prefix = d();
        } else {
            prefix = i.b();
            System.arraycopy(this.f2839a, this.f2840b, prefix.f2839a, 0, byteCount);
        }
        prefix.f2841c = prefix.f2840b + byteCount;
        this.f2840b += byteCount;
        this.f2845g.c(prefix);
        return prefix;
    }

    public final void a() {
        h hVar = this.f2845g;
        if (hVar == this) {
            throw new IllegalStateException();
        } else if (hVar.f2843e) {
            int byteCount = this.f2841c - this.f2840b;
            if (byteCount <= (8192 - hVar.f2841c) + (hVar.f2842d ? 0 : hVar.f2840b)) {
                f(this.f2845g, byteCount);
                b();
                i.a(this);
            }
        }
    }

    public final void f(h sink, int byteCount) {
        if (sink.f2843e) {
            int i = sink.f2841c;
            if (i + byteCount > 8192) {
                if (!sink.f2842d) {
                    int i2 = sink.f2840b;
                    if ((i + byteCount) - i2 <= 8192) {
                        byte[] bArr = sink.f2839a;
                        System.arraycopy(bArr, i2, bArr, 0, i - i2);
                        sink.f2841c -= sink.f2840b;
                        sink.f2840b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f2839a, this.f2840b, sink.f2839a, sink.f2841c, byteCount);
            sink.f2841c += byteCount;
            this.f2840b += byteCount;
            return;
        }
        throw new IllegalArgumentException();
    }
}
