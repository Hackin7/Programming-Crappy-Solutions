package p000;

/* renamed from: mx */
public final class C0743mx {
    /* renamed from: a */
    static String m2311a(int i) {
        StringBuilder sb;
        if (i < 1000 || i >= 5000) {
            sb = new StringBuilder("Code must be in range [1000,5000): ");
            sb.append(i);
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            sb = new StringBuilder("Code ");
            sb.append(i);
            sb.append(" is reserved and may not be used.");
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m2312a(C0759a aVar, byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        do {
            byte[] bArr2 = aVar.f3261d;
            int i2 = aVar.f3262e;
            int i3 = aVar.f3263f;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
            if (aVar.f3260c == aVar.f3258a.f3257b) {
                throw new IllegalStateException();
            }
        } while (aVar.mo2666a(aVar.f3260c == -1 ? 0 : aVar.f3260c + ((long) (aVar.f3263f - aVar.f3262e))) != -1);
    }

    /* renamed from: b */
    static void m2313b(int i) {
        String a = m2311a(i);
        if (a != null) {
            throw new IllegalArgumentException(a);
        }
    }
}
