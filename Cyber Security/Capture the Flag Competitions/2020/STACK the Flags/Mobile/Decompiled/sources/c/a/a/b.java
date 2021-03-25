package c.a.a;

public class b {
    public static String b(long id, String[] chunks) {
        long state = c.a(c.c(id & 4294967295L));
        long state2 = c.a(state);
        int index = (int) (((id >>> 32) ^ ((state >>> 32) & 65535)) ^ ((state2 >>> 16) & -65536));
        long state3 = a(index, chunks, state2);
        int length = (int) ((state3 >>> 32) & 65535);
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            state3 = a(index + i + 1, chunks, state3);
            chars[i] = (char) ((int) ((state3 >>> 32) & 65535));
        }
        return new String(chars);
    }

    public static long a(int charIndex, String[] chunks, long state) {
        return (((long) chunks[charIndex / 8191].charAt(charIndex % 8191)) << 32) ^ c.a(state);
    }
}
