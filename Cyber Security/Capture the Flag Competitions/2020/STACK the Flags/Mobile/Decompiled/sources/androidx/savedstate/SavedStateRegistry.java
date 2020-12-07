package androidx.savedstate;

import a.m.d;
import a.m.e;
import a.m.g;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a  reason: collision with root package name */
    public a.c.a.b.b<String, b> f1837a = new a.c.a.b.b<>();

    /* renamed from: b  reason: collision with root package name */
    public Bundle f1838b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1839c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1840d;

    public interface a {
        void a(a.p.b bVar);
    }

    public interface b {
        Bundle a();
    }

    public Bundle a(String key) {
        if (this.f1839c) {
            Bundle bundle = this.f1838b;
            if (bundle == null) {
                return null;
            }
            Bundle result = bundle.getBundle(key);
            this.f1838b.remove(key);
            if (this.f1838b.isEmpty()) {
                this.f1838b = null;
            }
            return result;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(d lifecycle, Bundle savedState) {
        if (!this.f1839c) {
            if (savedState != null) {
                this.f1838b = savedState.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            lifecycle.a(new e() {
                /* class androidx.savedstate.SavedStateRegistry.AnonymousClass1 */

                @Override // a.m.e
                public void d(g source, d.a event) {
                    if (event == d.a.ON_START) {
                        SavedStateRegistry.this.f1840d = true;
                    } else if (event == d.a.ON_STOP) {
                        SavedStateRegistry.this.f1840d = false;
                    }
                }
            });
            this.f1839c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    public void c(Bundle outBundle) {
        Bundle components = new Bundle();
        Bundle bundle = this.f1838b;
        if (bundle != null) {
            components.putAll(bundle);
        }
        a.c.a.b.b<K, V>.d d2 = this.f1837a.d();
        while (d2.hasNext()) {
            Map.Entry<String, SavedStateProvider> entry1 = (Map.Entry) d2.next();
            components.putBundle(entry1.getKey(), ((b) entry1.getValue()).a());
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", components);
    }
}
