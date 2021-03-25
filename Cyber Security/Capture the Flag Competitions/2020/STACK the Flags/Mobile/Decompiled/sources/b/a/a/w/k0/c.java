package b.a.a.w.k0;

import e.d;
import e.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

public abstract class c implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f2278f = new String[128];

    /* renamed from: b  reason: collision with root package name */
    public int f2279b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f2280c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    public String[] f2281d = new String[32];

    /* renamed from: e  reason: collision with root package name */
    public int[] f2282e = new int[32];

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract boolean l();

    public abstract boolean m();

    public abstract double n();

    public abstract int o();

    public abstract String p();

    public abstract String q();

    public abstract b s();

    public abstract int u(a aVar);

    public abstract void v();

    public abstract void w();

    static {
        for (int i = 0; i <= 31; i++) {
            f2278f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f2278f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c r(e.c source) {
        return new e(source);
    }

    public final void t(int newTop) {
        int i = this.f2279b;
        int[] iArr = this.f2280c;
        if (i == iArr.length) {
            if (i != 256) {
                this.f2280c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f2281d;
                this.f2281d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f2282e;
                this.f2282e = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new a("Nesting too deep at " + k());
            }
        }
        int[] iArr3 = this.f2280c;
        int i2 = this.f2279b;
        this.f2279b = i2 + 1;
        iArr3[i2] = newTop;
    }

    public final b y(String message) {
        throw new b(message + " at path " + k());
    }

    public final String k() {
        return d.a(this.f2279b, this.f2280c, this.f2281d, this.f2282e);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f2283a;

        /* renamed from: b  reason: collision with root package name */
        public final f f2284b;

        public a(String[] strings, f doubleQuoteSuffix) {
            this.f2283a = strings;
            this.f2284b = doubleQuoteSuffix;
        }

        public static a a(String... strings) {
            try {
                d[] result = new d[strings.length];
                e.a buffer = new e.a();
                for (int i = 0; i < strings.length; i++) {
                    c.x(buffer, strings[i]);
                    buffer.l();
                    result[i] = buffer.o();
                }
                return new a((String[]) strings.clone(), f.d(result));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static void x(e.b sink, String value) {
        String replacement;
        String[] replacements = f2278f;
        ((e.a) sink).C(34);
        int last = 0;
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char c2 = value.charAt(i);
            if (c2 < 128) {
                replacement = replacements[c2];
                if (replacement == null) {
                }
            } else if (c2 == 8232) {
                replacement = "\\u2028";
            } else if (c2 == 8233) {
                replacement = "\\u2029";
            }
            if (last < i) {
                ((e.a) sink).H(value, last, i);
            }
            ((e.a) sink).G(replacement);
            last = i + 1;
        }
        if (last < length) {
            ((e.a) sink).H(value, last, length);
        }
        ((e.a) sink).C(34);
    }
}
