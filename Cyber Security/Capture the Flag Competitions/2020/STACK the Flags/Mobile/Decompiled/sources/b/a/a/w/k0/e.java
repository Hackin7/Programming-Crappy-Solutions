package b.a.a.w.k0;

import b.a.a.w.k0.c;
import e.a;
import e.c;
import e.d;
import java.io.EOFException;

public final class e extends c {
    public static final d m = d.c("'\\");
    public static final d n = d.c("\"\\");
    public static final d o = d.c("{}[]:, \n\t\r\f/\\;#=");
    public static final d p = d.c("\n\r");
    public static final d q = d.c("*/");

    /* renamed from: g  reason: collision with root package name */
    public final c f2291g;
    public final a h;
    public int i = 0;
    public long j;
    public int k;
    public String l;

    public e(c source) {
        if (source != null) {
            this.f2291g = source;
            this.h = source.d();
            t(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // b.a.a.w.k0.c
    public void g() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 3) {
            t(1);
            this.f2282e[this.f2279b - 1] = 0;
            this.i = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + s() + " at path " + k());
    }

    @Override // b.a.a.w.k0.c
    public void i() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 4) {
            int i2 = this.f2279b - 1;
            this.f2279b = i2;
            int[] iArr = this.f2282e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.i = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + s() + " at path " + k());
    }

    @Override // b.a.a.w.k0.c
    public void h() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 1) {
            t(3);
            this.i = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + s() + " at path " + k());
    }

    @Override // b.a.a.w.k0.c
    public void j() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 2) {
            int i2 = this.f2279b - 1;
            this.f2279b = i2;
            this.f2281d[i2] = null;
            int[] iArr = this.f2282e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.i = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + s() + " at path " + k());
    }

    @Override // b.a.a.w.k0.c
    public boolean l() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        return (p2 == 2 || p2 == 4 || p2 == 18) ? false : true;
    }

    @Override // b.a.a.w.k0.c
    public c.b s() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        switch (p2) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int A() {
        int[] iArr = this.f2280c;
        int i2 = this.f2279b;
        int peekStack = iArr[i2 - 1];
        if (peekStack == 1) {
            iArr[i2 - 1] = 2;
        } else if (peekStack == 2) {
            int c2 = D(true);
            this.h.l();
            if (c2 != 44) {
                if (c2 == 59) {
                    z();
                    throw null;
                } else if (c2 == 93) {
                    this.i = 4;
                    return 4;
                } else {
                    y("Unterminated array");
                    throw null;
                }
            }
        } else if (peekStack == 3 || peekStack == 5) {
            this.f2280c[this.f2279b - 1] = 4;
            if (peekStack == 5) {
                int c3 = D(true);
                this.h.l();
                if (c3 != 44) {
                    if (c3 == 59) {
                        z();
                        throw null;
                    } else if (c3 == 125) {
                        this.i = 2;
                        return 2;
                    } else {
                        y("Unterminated object");
                        throw null;
                    }
                }
            }
            int c4 = D(true);
            if (c4 == 34) {
                this.h.l();
                this.i = 13;
                return 13;
            } else if (c4 == 39) {
                this.h.l();
                z();
                throw null;
            } else if (c4 != 125) {
                z();
                throw null;
            } else if (peekStack != 5) {
                this.h.l();
                this.i = 2;
                return 2;
            } else {
                y("Expected name");
                throw null;
            }
        } else if (peekStack == 4) {
            iArr[i2 - 1] = 5;
            int c5 = D(true);
            this.h.l();
            if (c5 != 58) {
                if (c5 != 61) {
                    y("Expected ':'");
                    throw null;
                }
                z();
                throw null;
            }
        } else if (peekStack == 6) {
            iArr[i2 - 1] = 7;
        } else if (peekStack == 7) {
            if (D(false) == -1) {
                this.i = 18;
                return 18;
            }
            z();
            throw null;
        } else if (peekStack == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int c6 = D(true);
        if (c6 == 34) {
            this.h.l();
            this.i = 9;
            return 9;
        } else if (c6 != 39) {
            if (!(c6 == 44 || c6 == 59)) {
                if (c6 == 91) {
                    this.h.l();
                    this.i = 3;
                    return 3;
                } else if (c6 != 93) {
                    if (c6 != 123) {
                        int result = G();
                        if (result != 0) {
                            return result;
                        }
                        int result2 = H();
                        if (result2 != 0) {
                            return result2;
                        }
                        if (!C(this.h.i(0))) {
                            y("Expected value");
                            throw null;
                        }
                        z();
                        throw null;
                    }
                    this.h.l();
                    this.i = 1;
                    return 1;
                } else if (peekStack == 1) {
                    this.h.l();
                    this.i = 4;
                    return 4;
                }
            }
            if (peekStack == 1 || peekStack == 2) {
                z();
                throw null;
            }
            y("Unexpected value");
            throw null;
        } else {
            z();
            throw null;
        }
    }

    public final int G() {
        int peeking;
        String keywordUpper;
        String keyword;
        byte c2 = this.h.i(0);
        if (c2 == 116 || c2 == 84) {
            keyword = "true";
            keywordUpper = "TRUE";
            peeking = 5;
        } else if (c2 == 102 || c2 == 70) {
            keyword = "false";
            keywordUpper = "FALSE";
            peeking = 6;
        } else if (c2 != 110 && c2 != 78) {
            return 0;
        } else {
            keyword = "null";
            keywordUpper = "NULL";
            peeking = 7;
        }
        int length = keyword.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (!this.f2291g.c((long) (i2 + 1))) {
                return 0;
            }
            byte c3 = this.h.i((long) i2);
            if (!(c3 == keyword.charAt(i2) || c3 == keywordUpper.charAt(i2))) {
                return 0;
            }
        }
        if (this.f2291g.c((long) (length + 1)) && C(this.h.i((long) length))) {
            return 0;
        }
        this.h.w((long) length);
        this.i = peeking;
        return peeking;
    }

    public final int H() {
        byte c2;
        long value = 0;
        boolean negative = false;
        boolean fitsInLong = true;
        int last = 0;
        int i2 = 0;
        while (true) {
            boolean z = false;
            if (!this.f2291g.c((long) (i2 + 1))) {
                break;
            }
            c2 = this.h.i((long) i2);
            if (c2 != 43) {
                if (c2 == 69 || c2 == 101) {
                    if (last != 2 && last != 4) {
                        return 0;
                    }
                    last = 5;
                } else if (c2 != 45) {
                    if (c2 != 46) {
                        if (c2 >= 48 && c2 <= 57) {
                            if (last == 1 || last == 0) {
                                value = (long) (-(c2 - 48));
                                last = 2;
                            } else if (last == 2) {
                                if (value == 0) {
                                    return 0;
                                }
                                long newValue = (10 * value) - ((long) (c2 - 48));
                                if (value > -922337203685477580L || (value == -922337203685477580L && newValue < value)) {
                                    z = true;
                                }
                                fitsInLong &= z;
                                value = newValue;
                            } else if (last == 3) {
                                last = 4;
                            } else if (last == 5 || last == 6) {
                                last = 7;
                            }
                        }
                    } else if (last != 2) {
                        return 0;
                    } else {
                        last = 3;
                    }
                } else if (last == 0) {
                    negative = true;
                    last = 1;
                } else if (last != 5) {
                    return 0;
                } else {
                    last = 6;
                }
            } else if (last != 5) {
                return 0;
            } else {
                last = 6;
            }
            i2++;
        }
        if (C(c2)) {
            return 0;
        }
        if (last == 2 && fitsInLong && ((value != Long.MIN_VALUE || negative) && (value != 0 || !negative))) {
            this.j = negative ? value : -value;
            this.h.w((long) i2);
            this.i = 16;
            return 16;
        } else if (last != 2 && last != 4 && last != 7) {
            return 0;
        } else {
            this.k = i2;
            this.i = 17;
            return 17;
        }
    }

    public final boolean C(int c2) {
        if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == 32) {
            return false;
        }
        if (c2 != 35) {
            if (c2 == 44) {
                return false;
            }
            if (!(c2 == 47 || c2 == 61)) {
                if (c2 == 123 || c2 == 125 || c2 == 58) {
                    return false;
                }
                if (c2 != 59) {
                    switch (c2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        z();
        throw null;
    }

    @Override // b.a.a.w.k0.c
    public String p() {
        String result;
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 14) {
            result = F();
        } else if (p2 == 13) {
            result = E(n);
        } else if (p2 == 12) {
            result = E(m);
        } else if (p2 == 15) {
            result = this.l;
        } else {
            throw new a("Expected a name but was " + s() + " at path " + k());
        }
        this.i = 0;
        this.f2281d[this.f2279b - 1] = result;
        return result;
    }

    @Override // b.a.a.w.k0.c
    public int u(c.a options) {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 < 12 || p2 > 15) {
            return -1;
        }
        if (p2 == 15) {
            return B(this.l, options);
        }
        int result = this.f2291g.e(options.f2284b);
        if (result != -1) {
            this.i = 0;
            this.f2281d[this.f2279b - 1] = options.f2283a[result];
            return result;
        }
        String lastPathName = this.f2281d[this.f2279b - 1];
        String nextName = p();
        int result2 = B(nextName, options);
        if (result2 == -1) {
            this.i = 15;
            this.l = nextName;
            this.f2281d[this.f2279b - 1] = lastPathName;
        }
        return result2;
    }

    @Override // b.a.a.w.k0.c
    public void v() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 14) {
            K();
        } else if (p2 == 13) {
            J(n);
        } else if (p2 == 12) {
            J(m);
        } else if (p2 != 15) {
            throw new a("Expected a name but was " + s() + " at path " + k());
        }
        this.i = 0;
        this.f2281d[this.f2279b - 1] = "null";
    }

    public final int B(String name, c.a options) {
        int size = options.f2283a.length;
        for (int i2 = 0; i2 < size; i2++) {
            if (name.equals(options.f2283a[i2])) {
                this.i = 0;
                this.f2281d[this.f2279b - 1] = name;
                return i2;
            }
        }
        return -1;
    }

    @Override // b.a.a.w.k0.c
    public String q() {
        String result;
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 10) {
            result = F();
        } else if (p2 == 9) {
            result = E(n);
        } else if (p2 == 8) {
            result = E(m);
        } else if (p2 == 11) {
            result = this.l;
            this.l = null;
        } else if (p2 == 16) {
            result = Long.toString(this.j);
        } else if (p2 == 17) {
            result = this.h.t((long) this.k);
        } else {
            throw new a("Expected a string but was " + s() + " at path " + k());
        }
        this.i = 0;
        int[] iArr = this.f2282e;
        int i2 = this.f2279b - 1;
        iArr[i2] = iArr[i2] + 1;
        return result;
    }

    @Override // b.a.a.w.k0.c
    public boolean m() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 5) {
            this.i = 0;
            int[] iArr = this.f2282e;
            int i2 = this.f2279b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (p2 == 6) {
            this.i = 0;
            int[] iArr2 = this.f2282e;
            int i3 = this.f2279b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + s() + " at path " + k());
        }
    }

    @Override // b.a.a.w.k0.c
    public double n() {
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 16) {
            this.i = 0;
            int[] iArr = this.f2282e;
            int i2 = this.f2279b - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.j;
        }
        if (p2 == 17) {
            this.l = this.h.t((long) this.k);
        } else if (p2 == 9) {
            this.l = E(n);
        } else if (p2 == 8) {
            this.l = E(m);
        } else if (p2 == 10) {
            this.l = F();
        } else if (p2 != 11) {
            throw new a("Expected a double but was " + s() + " at path " + k());
        }
        this.i = 11;
        try {
            double result = Double.parseDouble(this.l);
            if (Double.isNaN(result) || Double.isInfinite(result)) {
                throw new b("JSON forbids NaN and infinities: " + result + " at path " + k());
            }
            this.l = null;
            this.i = 0;
            int[] iArr2 = this.f2282e;
            int i3 = this.f2279b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return result;
        } catch (NumberFormatException e2) {
            throw new a("Expected a double but was " + this.l + " at path " + k());
        }
    }

    public final String E(d runTerminator) {
        StringBuilder builder = null;
        while (true) {
            long index = this.f2291g.a(runTerminator);
            if (index == -1) {
                y("Unterminated string");
                throw null;
            } else if (this.h.i(index) == 92) {
                if (builder == null) {
                    builder = new StringBuilder();
                }
                builder.append(this.h.t(index));
                this.h.l();
                builder.append(I());
            } else if (builder == null) {
                String result = this.h.t(index);
                this.h.l();
                return result;
            } else {
                builder.append(this.h.t(index));
                this.h.l();
                return builder.toString();
            }
        }
    }

    public final String F() {
        long i2 = this.f2291g.a(o);
        int i3 = (i2 > -1 ? 1 : (i2 == -1 ? 0 : -1));
        a aVar = this.h;
        return i3 != 0 ? aVar.t(i2) : aVar.s();
    }

    public final void J(d runTerminator) {
        while (true) {
            long index = this.f2291g.a(runTerminator);
            if (index == -1) {
                y("Unterminated string");
                throw null;
            } else if (this.h.i(index) == 92) {
                this.h.w(1 + index);
                I();
            } else {
                this.h.w(1 + index);
                return;
            }
        }
    }

    public final void K() {
        long i2 = this.f2291g.a(o);
        a aVar = this.h;
        aVar.w(i2 != -1 ? i2 : aVar.v());
    }

    @Override // b.a.a.w.k0.c
    public int o() {
        String str;
        int p2 = this.i;
        if (p2 == 0) {
            p2 = A();
        }
        if (p2 == 16) {
            long j2 = this.j;
            int result = (int) j2;
            if (j2 == ((long) result)) {
                this.i = 0;
                int[] iArr = this.f2282e;
                int i2 = this.f2279b - 1;
                iArr[i2] = iArr[i2] + 1;
                return result;
            }
            throw new a("Expected an int but was " + this.j + " at path " + k());
        }
        if (p2 == 17) {
            this.l = this.h.t((long) this.k);
        } else if (p2 == 9 || p2 == 8) {
            if (p2 == 9) {
                str = E(n);
            } else {
                str = E(m);
            }
            this.l = str;
            try {
                int result2 = Integer.parseInt(str);
                this.i = 0;
                int[] iArr2 = this.f2282e;
                int i3 = this.f2279b - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return result2;
            } catch (NumberFormatException e2) {
            }
        } else if (p2 != 11) {
            throw new a("Expected an int but was " + s() + " at path " + k());
        }
        this.i = 11;
        try {
            double asDouble = Double.parseDouble(this.l);
            int result3 = (int) asDouble;
            if (((double) result3) == asDouble) {
                this.l = null;
                this.i = 0;
                int[] iArr3 = this.f2282e;
                int i4 = this.f2279b - 1;
                iArr3[i4] = iArr3[i4] + 1;
                return result3;
            }
            throw new a("Expected an int but was " + this.l + " at path " + k());
        } catch (NumberFormatException e3) {
            throw new a("Expected an int but was " + this.l + " at path " + k());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.i = 0;
        this.f2280c[0] = 8;
        this.f2279b = 1;
        this.h.f();
        this.f2291g.close();
    }

    @Override // b.a.a.w.k0.c
    public void w() {
        int count = 0;
        do {
            int p2 = this.i;
            if (p2 == 0) {
                p2 = A();
            }
            if (p2 == 3) {
                t(1);
                count++;
            } else if (p2 == 1) {
                t(3);
                count++;
            } else if (p2 == 4) {
                count--;
                if (count >= 0) {
                    this.f2279b--;
                } else {
                    throw new a("Expected a value but was " + s() + " at path " + k());
                }
            } else if (p2 == 2) {
                count--;
                if (count >= 0) {
                    this.f2279b--;
                } else {
                    throw new a("Expected a value but was " + s() + " at path " + k());
                }
            } else if (p2 == 14 || p2 == 10) {
                K();
            } else if (p2 == 9 || p2 == 13) {
                J(n);
            } else if (p2 == 8 || p2 == 12) {
                J(m);
            } else if (p2 == 17) {
                this.h.w((long) this.k);
            } else if (p2 == 18) {
                throw new a("Expected a value but was " + s() + " at path " + k());
            }
            this.i = 0;
        } while (count != 0);
        int[] iArr = this.f2282e;
        int i2 = this.f2279b;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f2281d[i2 - 1] = "null";
    }

    public final int D(boolean throwOnEof) {
        int p2 = 0;
        while (this.f2291g.c((long) (p2 + 1))) {
            int p3 = p2 + 1;
            int c2 = this.h.i((long) p2);
            if (c2 == 10 || c2 == 32 || c2 == 13 || c2 == 9) {
                p2 = p3;
            } else {
                this.h.w((long) (p3 - 1));
                if (c2 == 47) {
                    if (!this.f2291g.c(2)) {
                        return c2;
                    }
                    z();
                    throw null;
                } else if (c2 != 35) {
                    return c2;
                } else {
                    z();
                    throw null;
                }
            }
        }
        if (!throwOnEof) {
            return -1;
        }
        throw new EOFException("End of input");
    }

    public final void z() {
        y("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public String toString() {
        return "JsonReader(" + this.f2291g + ")";
    }

    public final char I() {
        int i2;
        if (this.f2291g.c(1)) {
            byte escaped = this.h.l();
            if (escaped == 10 || escaped == 34 || escaped == 39 || escaped == 47 || escaped == 92) {
                return (char) escaped;
            }
            if (escaped == 98) {
                return '\b';
            }
            if (escaped == 102) {
                return '\f';
            }
            if (escaped == 110) {
                return '\n';
            }
            if (escaped == 114) {
                return '\r';
            }
            if (escaped == 116) {
                return '\t';
            }
            if (escaped != 117) {
                y("Invalid escape sequence: \\" + ((char) escaped));
                throw null;
            } else if (this.f2291g.c(4)) {
                char result = 0;
                int end = 0 + 4;
                for (int i3 = 0; i3 < end; i3++) {
                    byte c2 = this.h.i((long) i3);
                    char result2 = (char) (result << 4);
                    if (c2 >= 48 && c2 <= 57) {
                        i2 = c2 - 48;
                    } else if (c2 >= 97 && c2 <= 102) {
                        i2 = (c2 - 97) + 10;
                    } else if (c2 < 65 || c2 > 70) {
                        y("\\u" + this.h.t(4));
                        throw null;
                    } else {
                        i2 = (c2 - 65) + 10;
                    }
                    result = (char) (i2 + result2);
                }
                this.h.w(4);
                return result;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + k());
            }
        } else {
            y("Unterminated escape sequence");
            throw null;
        }
    }
}
