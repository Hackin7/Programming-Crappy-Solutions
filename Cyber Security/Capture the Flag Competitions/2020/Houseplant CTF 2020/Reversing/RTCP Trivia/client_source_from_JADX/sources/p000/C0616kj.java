package p000;

import java.io.IOException;

/* renamed from: kj */
public enum C0616kj {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");
    

    /* renamed from: f */
    private final String f2668f;

    private C0616kj(String str) {
        this.f2668f = str;
    }

    /* renamed from: a */
    public static C0616kj m1901a(String str) {
        if (str.equals(HTTP_1_0.f2668f)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f2668f)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.f2668f)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f2668f)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f2668f)) {
            return QUIC;
        }
        StringBuilder sb = new StringBuilder("Unexpected protocol: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    public final String toString() {
        return this.f2668f;
    }
}
