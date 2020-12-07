package a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class a {
    public static void a(Animator animator, AnimatorListenerAdapter listener) {
        animator.addPauseListener(listener);
    }

    public static void b(Animator animator) {
        animator.pause();
    }

    public static void c(Animator animator) {
        animator.resume();
    }
}
