package a.o.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class j {
    public static int b(RecyclerView.y state, h orientation, View startChild, View endChild, RecyclerView.o lm, boolean smoothScrollbarEnabled, boolean reverseLayout) {
        int itemsBefore;
        if (lm.I() == 0 || state.b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        int minPosition = Math.min(lm.f0(startChild), lm.f0(endChild));
        int maxPosition = Math.max(lm.f0(startChild), lm.f0(endChild));
        if (reverseLayout) {
            itemsBefore = Math.max(0, (state.b() - maxPosition) - 1);
        } else {
            itemsBefore = Math.max(0, minPosition);
        }
        if (!smoothScrollbarEnabled) {
            return itemsBefore;
        }
        return Math.round((((float) itemsBefore) * (((float) Math.abs(orientation.d(endChild) - orientation.g(startChild))) / ((float) (Math.abs(lm.f0(startChild) - lm.f0(endChild)) + 1)))) + ((float) (orientation.m() - orientation.g(startChild))));
    }

    public static int a(RecyclerView.y state, h orientation, View startChild, View endChild, RecyclerView.o lm, boolean smoothScrollbarEnabled) {
        if (lm.I() == 0 || state.b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return Math.abs(lm.f0(startChild) - lm.f0(endChild)) + 1;
        }
        return Math.min(orientation.n(), orientation.d(endChild) - orientation.g(startChild));
    }

    public static int c(RecyclerView.y state, h orientation, View startChild, View endChild, RecyclerView.o lm, boolean smoothScrollbarEnabled) {
        if (lm.I() == 0 || state.b() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return state.b();
        }
        return (int) ((((float) (orientation.d(endChild) - orientation.g(startChild))) / ((float) (Math.abs(lm.f0(startChild) - lm.f0(endChild)) + 1))) * ((float) state.b()));
    }
}
