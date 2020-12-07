package b.d.a.a.l;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import b.d.a.a.b;
import b.d.a.a.g;

public class e {
    public static void a(View view, float elevation) {
        int dur = view.getResources().getInteger(g.app_bar_elevation_anim_duration);
        StateListAnimator sla = new StateListAnimator();
        sla.addState(new int[]{16842766, b.state_liftable, -b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration((long) dur));
        sla.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", elevation).setDuration((long) dur));
        sla.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(sla);
    }
}
