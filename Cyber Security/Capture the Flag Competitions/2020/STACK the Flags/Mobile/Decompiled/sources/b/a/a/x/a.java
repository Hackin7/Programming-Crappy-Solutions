package b.a.a.x;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {

    /* renamed from: b  reason: collision with root package name */
    public final Set<ValueAnimator.AnimatorUpdateListener> f2315b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f2316c = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void setStartDelay(long startDelay) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.ValueAnimator
    public ValueAnimator setDuration(long duration) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator value) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener listener) {
        this.f2315b.add(listener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener listener) {
        this.f2315b.remove(listener);
    }

    public void removeAllUpdateListeners() {
        this.f2315b.clear();
    }

    public void addListener(Animator.AnimatorListener listener) {
        this.f2316c.add(listener);
    }

    public void removeListener(Animator.AnimatorListener listener) {
        this.f2316c.remove(listener);
    }

    public void removeAllListeners() {
        this.f2316c.clear();
    }

    public void d(boolean isReverse) {
        for (Animator.AnimatorListener listener : this.f2316c) {
            if (Build.VERSION.SDK_INT >= 26) {
                listener.onAnimationStart(this, isReverse);
            } else {
                listener.onAnimationStart(this);
            }
        }
    }

    public void c() {
        for (Animator.AnimatorListener listener : this.f2316c) {
            listener.onAnimationRepeat(this);
        }
    }

    public void b(boolean isReverse) {
        for (Animator.AnimatorListener listener : this.f2316c) {
            if (Build.VERSION.SDK_INT >= 26) {
                listener.onAnimationEnd(this, isReverse);
            } else {
                listener.onAnimationEnd(this);
            }
        }
    }

    public void a() {
        for (Animator.AnimatorListener listener : this.f2316c) {
            listener.onAnimationCancel(this);
        }
    }

    public void e() {
        for (ValueAnimator.AnimatorUpdateListener listener : this.f2315b) {
            listener.onAnimationUpdate(this);
        }
    }
}
