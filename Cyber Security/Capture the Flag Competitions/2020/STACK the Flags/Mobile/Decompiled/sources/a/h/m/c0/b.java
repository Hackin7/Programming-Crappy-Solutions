package a.h.m.c0;

import android.view.accessibility.AccessibilityEvent;

public final class b {
    public static void b(AccessibilityEvent event, int changeTypes) {
        event.setContentChangeTypes(changeTypes);
    }

    public static int a(AccessibilityEvent event) {
        return event.getContentChangeTypes();
    }
}
