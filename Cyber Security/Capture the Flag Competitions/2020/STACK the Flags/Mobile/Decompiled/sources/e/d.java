package e;

import java.io.Serializable;
import java.util.Arrays;

public class d implements Serializable, Comparable<d> {

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f2827e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f  reason: collision with root package name */
    public static final d f2828f = g(new byte[0]);

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2829b;

    /* renamed from: c  reason: collision with root package name */
    public transient int f2830c;

    /* renamed from: d  reason: collision with root package name */
    public transient String f2831d;

    public d(byte[] data) {
        this.f2829b = data;
    }

    public static d g(byte... data) {
        if (data != null) {
            return new d((byte[]) data.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static d c(String s) {
        if (s != null) {
            d byteString = new d(s.getBytes(m.f2849a));
            byteString.f2831d = s;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    public String m() {
        String result = this.f2831d;
        if (result != null) {
            return result;
        }
        String str = new String(this.f2829b, m.f2849a);
        this.f2831d = str;
        return str;
    }

    public String e() {
        byte[] bArr = this.f2829b;
        char[] result = new char[(bArr.length * 2)];
        int c2 = 0;
        for (byte b2 : bArr) {
            int c3 = c2 + 1;
            char[] cArr = f2827e;
            result[c2] = cArr[(b2 >> 4) & 15];
            c2 = c3 + 1;
            result[c3] = cArr[b2 & 15];
        }
        return new String(result);
    }

    public d l(int beginIndex, int endIndex) {
        if (beginIndex >= 0) {
            byte[] bArr = this.f2829b;
            if (endIndex <= bArr.length) {
                int subLen = endIndex - beginIndex;
                if (subLen < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (beginIndex == 0 && endIndex == bArr.length) {
                    return this;
                } else {
                    byte[] copy = new byte[subLen];
                    System.arraycopy(this.f2829b, beginIndex, copy, 0, subLen);
                    return new d(copy);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f2829b.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public byte d(int pos) {
        return this.f2829b[pos];
    }

    public int j() {
        return this.f2829b.length;
    }

    public byte[] f() {
        return this.f2829b;
    }

    public boolean h(int offset, d other, int otherOffset, int byteCount) {
        return other.i(otherOffset, this.f2829b, offset, byteCount);
    }

    public boolean i(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset >= 0) {
            byte[] bArr = this.f2829b;
            return offset <= bArr.length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && m.a(bArr, offset, other, otherOffset, byteCount);
        }
    }

    public final boolean k(d prefix) {
        return h(0, prefix, 0, prefix.j());
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof d) {
            int j = ((d) o).j();
            byte[] bArr = this.f2829b;
            if (j != bArr.length || !((d) o).i(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = this.f2830c;
        if (result != 0) {
            return result;
        }
        int hashCode = Arrays.hashCode(this.f2829b);
        this.f2830c = hashCode;
        return hashCode;
    }

    /* renamed from: b */
    public int compareTo(d byteString) {
        int sizeA = j();
        int sizeB = byteString.j();
        int size = Math.min(sizeA, sizeB);
        for (int i = 0; i < size; i++) {
            int byteA = d(i) & 255;
            int byteB = byteString.d(i) & 255;
            if (byteA != byteB) {
                if (byteA < byteB) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (sizeA == sizeB) {
            return 0;
        }
        if (sizeA < sizeB) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        if (this.f2829b.length == 0) {
            return "[size=0]";
        }
        String text = m();
        int i = a(text, 64);
        if (i != -1) {
            String safeText = text.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < text.length()) {
                return "[size=" + this.f2829b.length + " text=" + safeText + "…]";
            }
            return "[text=" + safeText + "]";
        } else if (this.f2829b.length <= 64) {
            return "[hex=" + e() + "]";
        } else {
            return "[size=" + this.f2829b.length + " hex=" + l(0, 64).e() + "…]";
        }
    }

    public static int a(String s, int codePointCount) {
        int i = 0;
        int j = 0;
        int length = s.length();
        while (i < length) {
            if (j == codePointCount) {
                return i;
            }
            int c2 = s.codePointAt(i);
            if ((Character.isISOControl(c2) && c2 != 10 && c2 != 13) || c2 == 65533) {
                return -1;
            }
            j++;
            i += Character.charCount(c2);
        }
        return s.length();
    }
}
