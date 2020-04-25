package p000;

import android.util.Log;
import java.io.Writer;

/* renamed from: ga */
public final class C0376ga extends Writer {

    /* renamed from: a */
    private final String f1713a;

    /* renamed from: b */
    private StringBuilder f1714b = new StringBuilder(128);

    public C0376ga(String str) {
        this.f1713a = str;
    }

    /* renamed from: a */
    private void m1206a() {
        if (this.f1714b.length() > 0) {
            Log.d(this.f1713a, this.f1714b.toString());
            this.f1714b.delete(0, this.f1714b.length());
        }
    }

    public final void close() {
        m1206a();
    }

    public final void flush() {
        m1206a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m1206a();
            } else {
                this.f1714b.append(c);
            }
        }
    }
}
