package p000;

import java.io.IOException;

/* renamed from: lz */
public final class C0683lz {

    /* renamed from: a */
    static final C0762nf f2946a = C0762nf.m2471a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    static final String[] f2947b = new String[64];

    /* renamed from: c */
    static final String[] f2948c = new String[256];

    /* renamed from: d */
    private static final String[] f2949d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    static {
        for (int i = 0; i < f2948c.length; i++) {
            f2948c[i] = C0633kv.m1966a("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f2947b[0] = "";
        f2947b[1] = "END_STREAM";
        int[] iArr = {1};
        f2947b[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr = f2947b;
            int i4 = i3 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(f2947b[i3]);
            sb.append("|PADDED");
            strArr[i4] = sb.toString();
        }
        f2947b[4] = "END_HEADERS";
        f2947b[32] = "PRIORITY";
        f2947b[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                String[] strArr2 = f2947b;
                int i9 = i8 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f2947b[i8]);
                sb2.append('|');
                sb2.append(f2947b[i6]);
                strArr2[i9] = sb2.toString();
                String[] strArr3 = f2947b;
                int i10 = i9 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f2947b[i8]);
                sb3.append('|');
                sb3.append(f2947b[i6]);
                sb3.append("|PADDED");
                strArr3[i10] = sb3.toString();
            }
        }
        for (int i11 = 0; i11 < f2947b.length; i11++) {
            if (f2947b[i11] == null) {
                f2947b[i11] = f2948c[i11];
            }
        }
    }

    private C0683lz() {
    }

    /* renamed from: a */
    static IllegalArgumentException m2115a(String str, Object... objArr) {
        throw new IllegalArgumentException(C0633kv.m1966a(str, objArr));
    }

    /* renamed from: a */
    static String m2116a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String str3;
        String a = b < f2949d.length ? f2949d[b] : C0633kv.m1966a("0x%02x", Byte.valueOf(b));
        if (b2 != 0) {
            switch (b) {
                case 2:
                case 3:
                case 7:
                case 8:
                    str = f2948c[b2];
                    break;
                case 4:
                case 6:
                    if (b2 != 1) {
                        str = f2948c[b2];
                        break;
                    } else {
                        str = "ACK";
                        break;
                    }
                default:
                    String str4 = b2 < f2947b.length ? f2947b[b2] : f2948c[b2];
                    if (b == 5 && (b2 & 4) != 0) {
                        str2 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (b != 0 || (b2 & 32) == 0) {
                        str = str4;
                        break;
                    } else {
                        str2 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = str4.replace(str2, str3);
                    break;
            }
        } else {
            str = "";
        }
        String str5 = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = str;
        return C0633kv.m1966a(str5, objArr);
    }

    /* renamed from: b */
    static IOException m2117b(String str, Object... objArr) {
        throw new IOException(C0633kv.m1966a(str, objArr));
    }
}
