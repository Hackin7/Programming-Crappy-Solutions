package a.h.m;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f926a;

    public c(Object displayCutout) {
        this.f926a = displayCutout;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        c other = (c) o;
        Object obj = this.f926a;
        if (obj != null) {
            return obj.equals(other.f926a);
        }
        if (other.f926a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f926a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f926a + "}";
    }

    public static c a(Object displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new c(displayCutout);
    }
}
