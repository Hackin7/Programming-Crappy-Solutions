package a.h.l;

import android.util.Log;
import java.io.Writer;

@Deprecated
public class b extends Writer {

    /* renamed from: b  reason: collision with root package name */
    public final String f900b;

    /* renamed from: c  reason: collision with root package name */
    public StringBuilder f901c = new StringBuilder(128);

    public b(String tag) {
        this.f900b = tag;
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        f();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        f();
    }

    @Override // java.io.Writer
    public void write(char[] buf, int offset, int count) {
        for (int i = 0; i < count; i++) {
            char c2 = buf[offset + i];
            if (c2 == '\n') {
                f();
            } else {
                this.f901c.append(c2);
            }
        }
    }

    public final void f() {
        if (this.f901c.length() > 0) {
            Log.d(this.f900b, this.f901c.toString());
            StringBuilder sb = this.f901c;
            sb.delete(0, sb.length());
        }
    }
}
