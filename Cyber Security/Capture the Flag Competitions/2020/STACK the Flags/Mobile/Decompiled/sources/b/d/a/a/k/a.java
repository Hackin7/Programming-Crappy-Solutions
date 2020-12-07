package b.d.a.a.k;

import a.l.a.a.b;
import a.l.a.a.c;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f2536a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f2537b = new a.l.a.a.a();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f2538c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f2539d = new DecelerateInterpolator();

    static {
        new LinearInterpolator();
    }

    public static float a(float startValue, float endValue, float fraction) {
        return ((endValue - startValue) * fraction) + startValue;
    }

    public static int b(int startValue, int endValue, float fraction) {
        return Math.round(((float) (endValue - startValue)) * fraction) + startValue;
    }
}
