package g.a.a.a;

import java.io.UnsupportedEncodingException;

public class a {

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f2898a;

        /* renamed from: b  reason: collision with root package name */
        public int f2899b;

        public b() {
        }
    }

    public static byte[] a(String str, int flags) {
        return b(str.getBytes(), flags);
    }

    public static byte[] b(byte[] input, int flags) {
        return c(input, 0, input.length, flags);
    }

    public static byte[] c(byte[] input, int offset, int len, int flags) {
        c decoder = new c(flags, new byte[((len * 3) / 4)]);
        if (decoder.a(input, offset, len, true)) {
            int i = decoder.f2899b;
            byte[] bArr = decoder.f2898a;
            if (i == bArr.length) {
                return bArr;
            }
            byte[] temp = new byte[i];
            System.arraycopy(bArr, 0, temp, 0, i);
            return temp;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static class c extends b {

        /* renamed from: f  reason: collision with root package name */
        public static final int[] f2900f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g  reason: collision with root package name */
        public static final int[] f2901g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c  reason: collision with root package name */
        public int f2902c;

        /* renamed from: d  reason: collision with root package name */
        public int f2903d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f2904e;

        public c(int flags, byte[] output) {
            super();
            this.f2898a = output;
            this.f2904e = (flags & 8) == 0 ? f2900f : f2901g;
            this.f2902c = 0;
            this.f2903d = 0;
        }

        public boolean a(byte[] input, int offset, int len, boolean finish) {
            if (this.f2902c == 6) {
                return false;
            }
            int p = offset;
            int len2 = len + offset;
            int state = this.f2902c;
            int value = this.f2903d;
            int op = 0;
            byte[] output = this.f2898a;
            int[] alphabet = this.f2904e;
            while (p < len2) {
                if (state == 0) {
                    while (p + 4 <= len2) {
                        int i = (alphabet[input[p] & 255] << 18) | (alphabet[input[p + 1] & 255] << 12) | (alphabet[input[p + 2] & 255] << 6) | alphabet[input[p + 3] & 255];
                        value = i;
                        if (i < 0) {
                            break;
                        }
                        output[op + 2] = (byte) value;
                        output[op + 1] = (byte) (value >> 8);
                        output[op] = (byte) (value >> 16);
                        op += 3;
                        p += 4;
                    }
                    if (p >= len2) {
                        break;
                    }
                }
                int p2 = p + 1;
                int d2 = alphabet[input[p] & 255];
                if (state != 0) {
                    if (state != 1) {
                        if (state != 2) {
                            if (state != 3) {
                                if (state != 4) {
                                    if (state == 5 && d2 != -1) {
                                        this.f2902c = 6;
                                        return false;
                                    }
                                } else if (d2 == -2) {
                                    state++;
                                } else if (d2 != -1) {
                                    this.f2902c = 6;
                                    return false;
                                }
                            } else if (d2 >= 0) {
                                value = (value << 6) | d2;
                                output[op + 2] = (byte) value;
                                output[op + 1] = (byte) (value >> 8);
                                output[op] = (byte) (value >> 16);
                                op += 3;
                                state = 0;
                            } else if (d2 == -2) {
                                output[op + 1] = (byte) (value >> 2);
                                output[op] = (byte) (value >> 10);
                                op += 2;
                                state = 5;
                            } else if (d2 != -1) {
                                this.f2902c = 6;
                                return false;
                            }
                        } else if (d2 >= 0) {
                            value = (value << 6) | d2;
                            state++;
                        } else if (d2 == -2) {
                            output[op] = (byte) (value >> 4);
                            state = 4;
                            op++;
                        } else if (d2 != -1) {
                            this.f2902c = 6;
                            return false;
                        }
                    } else if (d2 >= 0) {
                        value = (value << 6) | d2;
                        state++;
                    } else if (d2 != -1) {
                        this.f2902c = 6;
                        return false;
                    }
                } else if (d2 >= 0) {
                    value = d2;
                    state++;
                } else if (d2 != -1) {
                    this.f2902c = 6;
                    return false;
                }
                p = p2;
            }
            if (!finish) {
                this.f2902c = state;
                this.f2903d = value;
                this.f2899b = op;
                return true;
            } else if (state != 1) {
                if (state == 2) {
                    output[op] = (byte) (value >> 4);
                    op++;
                } else if (state == 3) {
                    int op2 = op + 1;
                    output[op] = (byte) (value >> 10);
                    op = op2 + 1;
                    output[op2] = (byte) (value >> 2);
                } else if (state == 4) {
                    this.f2902c = 6;
                    return false;
                }
                this.f2902c = state;
                this.f2899b = op;
                return true;
            } else {
                this.f2902c = 6;
                return false;
            }
        }
    }

    public static String f(byte[] input, int flags) {
        try {
            return new String(d(input, flags), "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static byte[] d(byte[] input, int flags) {
        return e(input, 0, input.length, flags);
    }

    public static byte[] e(byte[] input, int offset, int len, int flags) {
        d encoder = new d(flags, null);
        int output_len = (len / 3) * 4;
        int i = 2;
        if (!encoder.f2908f) {
            int i2 = len % 3;
            if (i2 == 1) {
                output_len += 2;
            } else if (i2 == 2) {
                output_len += 3;
            }
        } else if (len % 3 > 0) {
            output_len += 4;
        }
        if (encoder.f2909g && len > 0) {
            int i3 = ((len - 1) / 57) + 1;
            if (!encoder.h) {
                i = 1;
            }
            output_len += i3 * i;
        }
        encoder.f2898a = new byte[output_len];
        encoder.a(input, offset, len, true);
        return encoder.f2898a;
    }

    public static class d extends b {
        public static final byte[] j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        public static final byte[] k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f2905c;

        /* renamed from: d  reason: collision with root package name */
        public int f2906d;

        /* renamed from: e  reason: collision with root package name */
        public int f2907e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f2908f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f2909g;
        public final boolean h;
        public final byte[] i;

        public d(int flags, byte[] output) {
            super();
            this.f2898a = output;
            boolean z = true;
            this.f2908f = (flags & 1) == 0;
            this.f2909g = (flags & 2) == 0;
            this.h = (flags & 4) == 0 ? false : z;
            this.i = (flags & 8) == 0 ? j : k;
            this.f2905c = new byte[2];
            this.f2906d = 0;
            this.f2907e = this.f2909g ? 19 : -1;
        }

        public void a(byte[] input, int offset, int len, boolean finish) {
            byte b2;
            byte b3;
            byte b4;
            byte[] alphabet = this.i;
            byte[] output = this.f2898a;
            int op = 0;
            int count = this.f2907e;
            int p = offset;
            int len2 = len + offset;
            int v = -1;
            int i2 = this.f2906d;
            if (i2 != 1) {
                if (i2 == 2 && p + 1 <= len2) {
                    byte[] bArr = this.f2905c;
                    v = ((bArr[1] & 255) << 8) | ((bArr[0] & 255) << 16) | (input[p] & 255);
                    this.f2906d = 0;
                    p++;
                }
            } else if (p + 2 <= len2) {
                int p2 = p + 1;
                v = ((input[p] & 255) << 8) | ((this.f2905c[0] & 255) << 16) | (input[p2] & 255);
                this.f2906d = 0;
                p = p2 + 1;
            }
            if (v != -1) {
                int op2 = 0 + 1;
                output[0] = alphabet[(v >> 18) & 63];
                int op3 = op2 + 1;
                output[op2] = alphabet[(v >> 12) & 63];
                int op4 = op3 + 1;
                output[op3] = alphabet[(v >> 6) & 63];
                op = op4 + 1;
                output[op4] = alphabet[v & 63];
                count--;
                if (count == 0) {
                    if (this.h) {
                        output[op] = 13;
                        op++;
                    }
                    output[op] = 10;
                    count = 19;
                    op++;
                }
            }
            while (p + 3 <= len2) {
                int v2 = ((input[p] & 255) << 16) | ((input[p + 1] & 255) << 8) | (input[p + 2] & 255);
                output[op] = alphabet[(v2 >> 18) & 63];
                output[op + 1] = alphabet[(v2 >> 12) & 63];
                output[op + 2] = alphabet[(v2 >> 6) & 63];
                output[op + 3] = alphabet[v2 & 63];
                p += 3;
                op += 4;
                count--;
                if (count == 0) {
                    if (this.h) {
                        output[op] = 13;
                        op++;
                    }
                    output[op] = 10;
                    count = 19;
                    op++;
                }
            }
            if (finish) {
                int i3 = this.f2906d;
                if (p - i3 == len2 - 1) {
                    int t = 0;
                    if (i3 > 0) {
                        b4 = this.f2905c[0];
                        t = 0 + 1;
                    } else {
                        int i4 = p + 1;
                        b4 = input[p];
                    }
                    int v3 = (b4 & 255) << 4;
                    this.f2906d -= t;
                    int op5 = op + 1;
                    output[op] = alphabet[(v3 >> 6) & 63];
                    op = op5 + 1;
                    output[op5] = alphabet[v3 & 63];
                    if (this.f2908f) {
                        int op6 = op + 1;
                        output[op] = 61;
                        op = op6 + 1;
                        output[op6] = 61;
                    }
                    if (this.f2909g) {
                        if (this.h) {
                            output[op] = 13;
                            op++;
                        }
                        output[op] = 10;
                        op++;
                    }
                } else if (p - i3 == len2 - 2) {
                    int t2 = 0;
                    if (i3 > 1) {
                        b2 = this.f2905c[0];
                        t2 = 0 + 1;
                    } else {
                        b2 = input[p];
                        p++;
                    }
                    int i5 = (b2 & 255) << 10;
                    if (this.f2906d > 0) {
                        b3 = this.f2905c[t2];
                        t2++;
                    } else {
                        int i6 = p + 1;
                        b3 = input[p];
                    }
                    int v4 = i5 | ((b3 & 255) << 2);
                    this.f2906d -= t2;
                    int op7 = op + 1;
                    output[op] = alphabet[(v4 >> 12) & 63];
                    int op8 = op7 + 1;
                    output[op7] = alphabet[(v4 >> 6) & 63];
                    int op9 = op8 + 1;
                    output[op8] = alphabet[v4 & 63];
                    if (this.f2908f) {
                        output[op9] = 61;
                        op9++;
                    }
                    if (this.f2909g) {
                        if (this.h) {
                            output[op9] = 13;
                            op9++;
                        }
                        output[op9] = 10;
                        op9++;
                    }
                    op = op9;
                } else if (this.f2909g && op > 0 && count != 19) {
                    if (this.h) {
                        output[op] = 13;
                        op++;
                    }
                    output[op] = 10;
                    op++;
                }
            } else if (p == len2 - 1) {
                byte[] bArr2 = this.f2905c;
                int i7 = this.f2906d;
                this.f2906d = i7 + 1;
                bArr2[i7] = input[p];
            } else if (p == len2 - 2) {
                byte[] bArr3 = this.f2905c;
                int i8 = this.f2906d;
                int i9 = i8 + 1;
                this.f2906d = i9;
                bArr3[i8] = input[p];
                this.f2906d = i9 + 1;
                bArr3[i9] = input[p + 1];
            }
            this.f2899b = op;
            this.f2907e = count;
        }
    }
}
