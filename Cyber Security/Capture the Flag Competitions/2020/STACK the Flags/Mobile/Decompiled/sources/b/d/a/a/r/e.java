package b.d.a.a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f2637a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f2638b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f2639c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f2640d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            if (eVar.f2639c == animator) {
                eVar.f2639c = null;
            }
        }
    }

    public void a(int[] specs, ValueAnimator animator) {
        b tuple = new b(specs, animator);
        animator.addListener(this.f2640d);
        this.f2637a.add(tuple);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f2642a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f2643b;

        public b(int[] specs, ValueAnimator animator) {
            this.f2642a = specs;
            this.f2643b = animator;
        }
    }
}
