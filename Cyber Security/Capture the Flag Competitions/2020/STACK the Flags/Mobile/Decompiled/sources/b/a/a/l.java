package b.a.a;

import com.airbnb.lottie.LottieResult;
import java.util.Arrays;

public final class l<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f1940a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f1941b;

    public l(V value) {
        this.f1940a = value;
        this.f1941b = null;
    }

    public l(Throwable exception) {
        this.f1941b = exception;
        this.f1940a = null;
    }

    public V b() {
        return this.f1940a;
    }

    public Throwable a() {
        return this.f1941b;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        LottieResult<?> that = (l) o;
        if (b() != null && b().equals(that.b())) {
            return true;
        }
        if (a() == null || that.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }
}
