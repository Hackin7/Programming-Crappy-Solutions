package b.d.a.a.k;

import a.e.g;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final g<String, i> f2548a = new g<>();

    public boolean g(String name) {
        return this.f2548a.get(name) != null;
    }

    public i e(String name) {
        if (g(name)) {
            return this.f2548a.get(name);
        }
        throw new IllegalArgumentException();
    }

    public void h(String name, i timing) {
        this.f2548a.put(name, timing);
    }

    public long f() {
        long duration = 0;
        int count = this.f2548a.size();
        for (int i = 0; i < count; i++) {
            i timing = this.f2548a.m(i);
            duration = Math.max(duration, timing.c() + timing.d());
        }
        return duration;
    }

    public static h b(Context context, TypedArray attributes, int index) {
        int resourceId;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static h c(Context context, int id) {
        try {
            Animator animator = AnimatorInflater.loadAnimator(context, id);
            if (animator instanceof AnimatorSet) {
                return d(((AnimatorSet) animator).getChildAnimations());
            }
            if (animator == null) {
                return null;
            }
            List<Animator> animators = new ArrayList<>();
            animators.add(animator);
            return d(animators);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(id), e2);
            return null;
        }
    }

    public static h d(List<Animator> animators) {
        h spec = new h();
        int count = animators.size();
        for (int i = 0; i < count; i++) {
            a(spec, animators.get(i));
        }
        return spec;
    }

    public static void a(h spec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator anim = (ObjectAnimator) animator;
            spec.h(anim.getPropertyName(), i.b(anim));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.f2548a.equals(((h) o).f2548a);
    }

    public int hashCode() {
        return this.f2548a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2548a + "}\n";
    }
}
