package p000;

import java.net.ProtocolException;

/* renamed from: ls */
public final class C0668ls {

    /* renamed from: a */
    public final C0616kj f2876a;

    /* renamed from: b */
    public final int f2877b;

    /* renamed from: c */
    public final String f2878c;

    private C0668ls(C0616kj kjVar, int i, String str) {
        this.f2876a = kjVar;
        this.f2877b = i;
        this.f2878c = str;
    }

    /* renamed from: a */
    public static C0668ls m2073a(String str) {
        C0616kj kjVar;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                StringBuilder sb = new StringBuilder("Unexpected status line: ");
                sb.append(str);
                throw new ProtocolException(sb.toString());
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                kjVar = C0616kj.HTTP_1_0;
            } else if (charAt == 1) {
                kjVar = C0616kj.HTTP_1_1;
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected status line: ");
                sb2.append(str);
                throw new ProtocolException(sb2.toString());
            }
        } else if (str.startsWith("ICY ")) {
            kjVar = C0616kj.HTTP_1_0;
            i = 4;
        } else {
            StringBuilder sb3 = new StringBuilder("Unexpected status line: ");
            sb3.append(str);
            throw new ProtocolException(sb3.toString());
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            StringBuilder sb4 = new StringBuilder("Unexpected status line: ");
            sb4.append(str);
            throw new ProtocolException(sb4.toString());
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            String str2 = "";
            if (str.length() > i2) {
                if (str.charAt(i2) != ' ') {
                    StringBuilder sb5 = new StringBuilder("Unexpected status line: ");
                    sb5.append(str);
                    throw new ProtocolException(sb5.toString());
                }
                str2 = str.substring(i + 4);
            }
            return new C0668ls(kjVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            StringBuilder sb6 = new StringBuilder("Unexpected status line: ");
            sb6.append(str);
            throw new ProtocolException(sb6.toString());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2876a == C0616kj.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f2877b);
        if (this.f2878c != null) {
            sb.append(' ');
            sb.append(this.f2878c);
        }
        return sb.toString();
    }
}
