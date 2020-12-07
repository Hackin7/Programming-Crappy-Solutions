package a.m;

import java.util.concurrent.atomic.AtomicReference;

public abstract class d {

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public abstract void a(f fVar);

    public abstract b b();

    public abstract void c(f fVar);

    public d() {
        new AtomicReference();
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean a(b state) {
            return compareTo(state) >= 0;
        }
    }
}
