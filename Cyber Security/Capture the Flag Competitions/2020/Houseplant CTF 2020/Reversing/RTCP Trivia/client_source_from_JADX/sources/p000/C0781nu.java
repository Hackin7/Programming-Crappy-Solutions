package p000;

import java.nio.charset.Charset;

/* renamed from: nu */
public final class C0781nu {

    /* renamed from: a */
    public static final Charset f3309a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m2594a(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: a */
    public static short m2595a(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: a */
    public static void m2596a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    /* renamed from: a */
    public static void m2597a(Throwable th) {
        throw th;
    }

    /* renamed from: a */
    public static boolean m2598a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
