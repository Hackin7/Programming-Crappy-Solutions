package p000;

import java.lang.reflect.Array;

/* renamed from: fb */
final class C0325fb {

    /* renamed from: a */
    static final /* synthetic */ boolean f1609a = true;

    private C0325fb() {
    }

    /* renamed from: a */
    private static int m1068a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static int[] m1069a(int[] iArr, int i, int i2) {
        if (f1609a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[m1068a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static <T> T[] m1070a(T[] tArr, int i, T t) {
        if (f1609a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m1068a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }
}
