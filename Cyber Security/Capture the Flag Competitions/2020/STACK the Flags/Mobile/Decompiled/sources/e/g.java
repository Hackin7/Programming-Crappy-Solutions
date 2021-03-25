package e;

import java.nio.ByteBuffer;

public final class g implements c {

    /* renamed from: b  reason: collision with root package name */
    public final a f2836b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final k f2837c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2838d;

    public g(k source) {
        if (source != null) {
            this.f2837c = source;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // e.c
    public a d() {
        return this.f2836b;
    }

    @Override // e.k
    public long b(a sink, long byteCount) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (!this.f2838d) {
            a aVar = this.f2836b;
            if (aVar.f2826c == 0 && this.f2837c.b(aVar, 8192) == -1) {
                return -1;
            }
            return this.f2836b.b(sink, Math.min(byteCount, this.f2836b.f2826c));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // e.c
    public boolean c(long byteCount) {
        a aVar;
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (!this.f2838d) {
            do {
                aVar = this.f2836b;
                if (aVar.f2826c >= byteCount) {
                    return true;
                }
            } while (this.f2837c.b(aVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // e.c
    public int e(f options) {
        if (!this.f2838d) {
            do {
                int index = this.f2836b.u(options, true);
                if (index == -1) {
                    return -1;
                }
                if (index != -2) {
                    this.f2836b.w((long) options.f2834b[index].j());
                    return index;
                }
            } while (this.f2837c.b(this.f2836b, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        a aVar = this.f2836b;
        if (aVar.f2826c == 0 && this.f2837c.b(aVar, 8192) == -1) {
            return -1;
        }
        return this.f2836b.read(sink);
    }

    @Override // e.c
    public long a(d targetBytes) {
        return f(targetBytes, 0);
    }

    public long f(d targetBytes, long fromIndex) {
        if (!this.f2838d) {
            while (true) {
                long result = this.f2836b.j(targetBytes, fromIndex);
                if (result != -1) {
                    return result;
                }
                a aVar = this.f2836b;
                long lastBufferSize = aVar.f2826c;
                if (this.f2837c.b(aVar, 8192) == -1) {
                    return -1;
                }
                fromIndex = Math.max(fromIndex, lastBufferSize);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public boolean isOpen() {
        return !this.f2838d;
    }

    @Override // e.k, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (!this.f2838d) {
            this.f2838d = true;
            this.f2837c.close();
            this.f2836b.f();
        }
    }

    public String toString() {
        return "buffer(" + this.f2837c + ")";
    }
}
