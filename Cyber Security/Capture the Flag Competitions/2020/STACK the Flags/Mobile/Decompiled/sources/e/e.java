package e;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public final class e {
    static {
        Logger.getLogger(e.class.getName());
    }

    public static c a(k source) {
        return new g(source);
    }

    public static k c(InputStream in) {
        return d(in, new l());
    }

    public static k d(InputStream in, l timeout) {
        if (in == null) {
            throw new IllegalArgumentException("in == null");
        } else if (timeout != null) {
            return new a(timeout, in);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public class a implements k {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l f2832b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ InputStream f2833c;

        public a(l lVar, InputStream inputStream) {
            this.f2832b = lVar;
            this.f2833c = inputStream;
        }

        @Override // e.k
        public long b(a sink, long byteCount) {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            } else if (byteCount == 0) {
                return 0;
            } else {
                try {
                    this.f2832b.a();
                    h tail = sink.z(1);
                    int bytesRead = this.f2833c.read(tail.f2839a, tail.f2841c, (int) Math.min(byteCount, (long) (8192 - tail.f2841c)));
                    if (bytesRead == -1) {
                        return -1;
                    }
                    tail.f2841c += bytesRead;
                    sink.f2826c += (long) bytesRead;
                    return (long) bytesRead;
                } catch (AssertionError e2) {
                    if (e.b(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        @Override // e.k, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2833c.close();
        }

        public String toString() {
            return "source(" + this.f2833c + ")";
        }
    }

    public static boolean b(AssertionError e2) {
        return (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) ? false : true;
    }
}
