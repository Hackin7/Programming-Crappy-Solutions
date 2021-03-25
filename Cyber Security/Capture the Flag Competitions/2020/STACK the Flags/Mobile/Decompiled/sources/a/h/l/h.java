package a.h.l;

public final class h {
    public static <T> T b(T reference) {
        if (reference != null) {
            return reference;
        }
        throw null;
    }

    public static <T> T c(T reference, Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    public static int a(int value) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException();
    }
}
