package p000;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: nf */
public class C0762nf implements Serializable, Comparable<C0762nf> {

    /* renamed from: a */
    static final char[] f3265a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final C0762nf f3266b = m2472a(new byte[0]);

    /* renamed from: c */
    final byte[] f3267c;

    /* renamed from: d */
    transient int f3268d;

    /* renamed from: e */
    transient String f3269e;

    C0762nf(byte[] bArr) {
        this.f3267c = bArr;
    }

    /* renamed from: a */
    private static int m2470a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                StringBuilder sb = new StringBuilder("Unexpected hex digit: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static C0762nf m2471a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C0762nf nfVar = new C0762nf(str.getBytes(C0781nu.f3309a));
        nfVar.f3269e = str;
        return nfVar;
    }

    /* renamed from: a */
    public static C0762nf m2472a(byte... bArr) {
        if (bArr != null) {
            return new C0762nf((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: b */
    public static C0762nf m2473b(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sb = new StringBuilder("Unexpected hex string: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m2470a(str.charAt(i2)) << 4) + m2470a(str.charAt(i2 + 1)));
        }
        return m2472a(bArr);
    }

    /* renamed from: c */
    private C0762nf m2474c(String str) {
        try {
            return m2472a(MessageDigest.getInstance(str).digest(this.f3267c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public byte mo2668a(int i) {
        return this.f3267c[i];
    }

    /* renamed from: a */
    public String mo2669a() {
        String str = this.f3269e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f3267c, C0781nu.f3309a);
        this.f3269e = str2;
        return str2;
    }

    /* renamed from: a */
    public C0762nf mo2670a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (i2 > this.f3267c.length) {
            StringBuilder sb = new StringBuilder("endIndex > length(");
            sb.append(this.f3267c.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } else {
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            } else if (i == 0 && i2 == this.f3267c.length) {
                return this;
            } else {
                byte[] bArr = new byte[i3];
                System.arraycopy(this.f3267c, i, bArr, 0, i3);
                return new C0762nf(bArr);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2671a(C0758nc ncVar) {
        ncVar.mo2628c(this.f3267c, 0, this.f3267c.length);
    }

    /* renamed from: a */
    public boolean mo2672a(int i, C0762nf nfVar, int i2, int i3) {
        return nfVar.mo2673a(0, this.f3267c, 0, i3);
    }

    /* renamed from: a */
    public boolean mo2673a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.f3267c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C0781nu.m2598a(this.f3267c, i, bArr, i2, i3);
    }

    /* renamed from: b */
    public String mo2674b() {
        return C0757nb.m2379a(this.f3267c);
    }

    /* renamed from: c */
    public C0762nf mo2675c() {
        return m2474c("SHA-1");
    }

    public /* synthetic */ int compareTo(Object obj) {
        C0762nf nfVar = (C0762nf) obj;
        int g = mo2681g();
        int g2 = nfVar.mo2681g();
        int min = Math.min(g, g2);
        for (int i = 0; i < min; i++) {
            byte a = mo2668a(i) & 255;
            byte a2 = nfVar.mo2668a(i) & 255;
            if (a != a2) {
                return a < a2 ? -1 : 1;
            }
        }
        if (g == g2) {
            return 0;
        }
        return g < g2 ? -1 : 1;
    }

    /* renamed from: d */
    public C0762nf mo2677d() {
        return m2474c("SHA-256");
    }

    /* renamed from: e */
    public String mo2678e() {
        byte[] bArr;
        char[] cArr = new char[(this.f3267c.length * 2)];
        int i = 0;
        for (byte b : this.f3267c) {
            int i2 = i + 1;
            cArr[i] = f3265a[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = f3265a[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0762nf) {
            C0762nf nfVar = (C0762nf) obj;
            return nfVar.mo2681g() == this.f3267c.length && nfVar.mo2673a(0, this.f3267c, 0, this.f3267c.length);
        }
    }

    /* renamed from: f */
    public C0762nf mo2680f() {
        int i = 0;
        while (i < this.f3267c.length) {
            byte b = this.f3267c[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr = (byte[]) this.f3267c.clone();
                bArr[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr.length; i2++) {
                    byte b2 = bArr[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr[i2] = (byte) (b2 + 32);
                    }
                }
                return new C0762nf(bArr);
            }
        }
        return this;
    }

    /* renamed from: g */
    public int mo2681g() {
        return this.f3267c.length;
    }

    /* renamed from: h */
    public byte[] mo2682h() {
        return (byte[]) this.f3267c.clone();
    }

    public int hashCode() {
        int i = this.f3268d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f3267c);
        this.f3268d = hashCode;
        return hashCode;
    }

    public String toString() {
        String replace;
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        if (this.f3267c.length == 0) {
            return "[size=0]";
        }
        String a = mo2669a();
        int length = a.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = a.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i != -1) {
            replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a.length()) {
                sb2 = new StringBuilder("[size=");
                sb2.append(this.f3267c.length);
                sb2.append(" text=");
                sb2.append(replace);
                str = "…]";
                sb2.append(str);
                return sb2.toString();
            }
            sb = new StringBuilder("[text=");
        } else if (this.f3267c.length <= 64) {
            sb = new StringBuilder("[hex=");
            replace = mo2678e();
        } else {
            sb2 = new StringBuilder("[size=");
            sb2.append(this.f3267c.length);
            sb2.append(" hex=");
            replace = mo2670a(0, 64).mo2678e();
            sb2.append(replace);
            str = "…]";
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append(replace);
        str = "]";
        sb2.append(str);
        return sb2.toString();
    }
}
