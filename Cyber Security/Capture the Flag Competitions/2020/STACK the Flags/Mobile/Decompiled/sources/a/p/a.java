package a.p;

import a.m.d;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f1315a;

    /* renamed from: b  reason: collision with root package name */
    public final SavedStateRegistry f1316b = new SavedStateRegistry();

    public a(b owner) {
        this.f1315a = owner;
    }

    public SavedStateRegistry b() {
        return this.f1316b;
    }

    public void c(Bundle savedState) {
        d lifecycle = this.f1315a.getLifecycle();
        if (lifecycle.b() == d.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.f1315a));
            this.f1316b.b(lifecycle, savedState);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle outBundle) {
        this.f1316b.c(outBundle);
    }

    public static a a(b owner) {
        return new a(owner);
    }
}
