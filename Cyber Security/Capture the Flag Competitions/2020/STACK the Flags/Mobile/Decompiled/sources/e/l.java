package e;

import java.io.InterruptedIOException;

public class l {
    static {
        new a();
    }

    public class a extends l {
        @Override // e.l
        public void a() {
        }
    }

    public void a() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
