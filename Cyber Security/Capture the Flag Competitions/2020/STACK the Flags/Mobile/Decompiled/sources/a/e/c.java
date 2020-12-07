package a.e;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f516a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f517b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f518c = new Object[0];

    public static int e(int need) {
        return d(need * 4) / 4;
    }

    public static int f(int need) {
        return d(need * 8) / 8;
    }

    public static int d(int need) {
        for (int i = 4; i < 32; i++) {
            if (need <= (1 << i) - 12) {
                return (1 << i) - 12;
            }
        }
        return need;
    }

    public static boolean c(Object a2, Object b2) {
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    public static int a(int[] array, int size, int value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal <= value) {
                return mid;
            } else {
                hi = mid - 1;
            }
        }
        return ~lo;
    }

    public static int b(long[] array, int size, long value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            long midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal <= value) {
                return mid;
            } else {
                hi = mid - 1;
            }
        }
        return ~lo;
    }
}
