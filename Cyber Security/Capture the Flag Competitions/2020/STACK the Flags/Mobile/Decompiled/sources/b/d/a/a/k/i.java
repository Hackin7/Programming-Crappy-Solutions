package b.d.a.a.k;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public long f2549a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f2550b = 300;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f2551c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f2552d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f2553e = 1;

    public i(long delay, long duration) {
        this.f2549a = delay;
        this.f2550b = duration;
    }

    public i(long delay, long duration, TimeInterpolator interpolator) {
        this.f2549a = delay;
        this.f2550b = duration;
        this.f2551c = interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setRepeatCount(g());
            ((ValueAnimator) animator).setRepeatMode(h());
        }
    }

    public long c() {
        return this.f2549a;
    }

    public long d() {
        return this.f2550b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f2551c;
        return timeInterpolator != null ? timeInterpolator : a.f2536a;
    }

    public int g() {
        return this.f2552d;
    }

    public int h() {
        return this.f2553e;
    }

    public static i b(ValueAnimator animator) {
        i timing = new i(animator.getStartDelay(), animator.getDuration(), f(animator));
        timing.f2552d = animator.getRepeatCount();
        timing.f2553e = animator.getRepeatMode();
        return timing;
    }

    public static TimeInterpolator f(ValueAnimator animator) {
        TimeInterpolator interpolator = animator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f2536a;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f2537b;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return a.f2538c;
        }
        return interpolator;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        i that = (i) o;
        if (c() == that.c() && d() == that.d() && g() == that.g() && h() == that.h()) {
            return e().getClass().equals(that.e().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
