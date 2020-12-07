package c.a.a;

public class c {
    public static long c(long x) {
        long z = ((x >>> 33) ^ x) * 7109453100751455733L;
        return (((z >>> 28) ^ z) * -3808689974395783757L) >>> 32;
    }

    public static long a(long state) {
        short s0 = (short) ((int) (state & 65535));
        short s1 = (short) ((int) (65535 & (state >>> 16)));
        short next = (short) (b((short) (s0 + s1), 9) + s0);
        short s12 = (short) (s1 ^ s0);
        return (((((long) next) << 16) | ((long) b(s12, 10))) << 16) | ((long) ((short) ((s12 << 5) ^ ((short) (b(s0, 13) ^ s12)))));
    }

    public static short b(short x, int k) {
        return (short) ((x << k) | (x >>> (32 - k)));
    }
}
