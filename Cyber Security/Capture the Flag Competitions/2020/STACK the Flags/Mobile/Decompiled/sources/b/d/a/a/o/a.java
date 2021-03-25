package b.d.a.a.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import b.d.a.a.o.c;

public final class a {
    public static Animator a(c view, float centerX, float centerY, float endRadius) {
        Animator revealInfoAnimator = ObjectAnimator.ofObject(view, c.C0056c.f2597a, c.b.f2595b, new c.e(centerX, centerY, endRadius));
        c.e revealInfo = view.getRevealInfo();
        if (revealInfo != null) {
            Animator circularRevealAnimator = ViewAnimationUtils.createCircularReveal((View) view, (int) centerX, (int) centerY, revealInfo.f2601c, endRadius);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(revealInfoAnimator, circularRevealAnimator);
            return set;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b.d.a.a.o.a$a  reason: collision with other inner class name */
    public static class C0055a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f2594a;

        public C0055a(c cVar) {
            this.f2594a = cVar;
        }

        public void onAnimationStart(Animator animation) {
            this.f2594a.a();
        }

        public void onAnimationEnd(Animator animation) {
            this.f2594a.b();
        }
    }

    public static Animator.AnimatorListener b(c view) {
        return new C0055a(view);
    }
}
