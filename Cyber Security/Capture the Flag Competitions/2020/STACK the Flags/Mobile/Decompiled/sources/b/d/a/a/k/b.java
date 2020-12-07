package b.d.a.a.k;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

public class b {
    public static void a(AnimatorSet animatorSet, List<Animator> items) {
        long totalDuration = 0;
        int count = items.size();
        for (int i = 0; i < count; i++) {
            Animator animator = items.get(i);
            totalDuration = Math.max(totalDuration, animator.getStartDelay() + animator.getDuration());
        }
        Animator fix = ValueAnimator.ofInt(0, 0);
        fix.setDuration(totalDuration);
        items.add(0, fix);
        animatorSet.playTogether(items);
    }
}
