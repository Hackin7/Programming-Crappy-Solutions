package a.h.m;

import android.view.MotionEvent;

public final class i {
    public static boolean a(MotionEvent event, int source) {
        return (event.getSource() & source) == source;
    }
}
