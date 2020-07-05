package p000;

import java.io.Closeable;

/* renamed from: ko */
public abstract class C0625ko implements Closeable {
    /* renamed from: a */
    public static C0625ko m1931a(byte[] bArr) {
        final C0758nc b = new C0758nc().mo2627c(bArr);
        final long length = (long) bArr.length;
        if (b != null) {
            return new C0625ko() {

                /* renamed from: a */
                final /* synthetic */ C0612kh f2717a = null;

                /* renamed from: a */
                public final long mo2397a() {
                    return length;
                }

                /* renamed from: b */
                public final C0761ne mo2398b() {
                    return b;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: a */
    public abstract long mo2397a();

    /* renamed from: b */
    public abstract C0761ne mo2398b();

    public void close() {
        C0633kv.m1972a((Closeable) mo2398b());
    }
}
