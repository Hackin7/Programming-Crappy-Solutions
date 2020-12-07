package a.h.m.c0;

import android.view.accessibility.AccessibilityManager;
import b.d.a.a.w.d;

public final class c {

    public interface a {
    }

    public static boolean a(AccessibilityManager manager, a listener) {
        if (listener == null) {
            return false;
        }
        return manager.addTouchExplorationStateChangeListener(new b(listener));
    }

    public static boolean b(AccessibilityManager manager, a listener) {
        if (listener == null) {
            return false;
        }
        return manager.removeTouchExplorationStateChangeListener(new b(listener));
    }

    public static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final a f930a;

        public b(a listener) {
            this.f930a = listener;
        }

        public int hashCode() {
            return this.f930a.hashCode();
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            return this.f930a.equals(((b) o).f930a);
        }

        public void onTouchExplorationStateChanged(boolean enabled) {
            ((d.a) this.f930a).a(enabled);
        }
    }
}
