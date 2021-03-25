package a.h.l;

import java.util.Objects;

public class c {
    public static boolean a(Object a2, Object b2) {
        return Objects.equals(a2, b2);
    }

    public static int b(Object... values) {
        return Objects.hash(values);
    }
}
