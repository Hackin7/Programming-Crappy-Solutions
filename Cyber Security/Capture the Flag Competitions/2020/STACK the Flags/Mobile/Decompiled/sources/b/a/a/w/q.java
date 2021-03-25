package b.a.a.w;

import a.e.h;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import b.a.a.d;
import b.a.a.w.k0.c;
import b.a.a.x.g;
import b.a.a.y.a;
import com.airbnb.lottie.value.Keyframe;
import java.lang.ref.WeakReference;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f2300a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static h<WeakReference<Interpolator>> f2301b;

    /* renamed from: c  reason: collision with root package name */
    public static c.a f2302c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    public static h<WeakReference<Interpolator>> e() {
        if (f2301b == null) {
            f2301b = new h<>();
        }
        return f2301b;
    }

    public static WeakReference<Interpolator> a(int hash) {
        WeakReference<Interpolator> e2;
        synchronized (q.class) {
            e2 = e().e(hash);
        }
        return e2;
    }

    public static void f(int hash, WeakReference<Interpolator> interpolator) {
        synchronized (q.class) {
            f2301b.i(hash, interpolator);
        }
    }

    public static <T> a<T> b(c reader, d composition, float scale, j0<T> j0Var, boolean animated) {
        if (animated) {
            return c(composition, reader, scale, j0Var);
        }
        return d(reader, scale, j0Var);
    }

    public static <T> a<T> c(d composition, c reader, float scale, j0<T> j0Var) {
        Interpolator interpolator;
        Interpolator interpolator2;
        Interpolator interpolator3 = null;
        reader.h();
        boolean hold = false;
        PointF pathCp1 = null;
        PointF pathCp2 = null;
        T endValue = null;
        T startValue = null;
        float startFrame = 0.0f;
        PointF cp2 = null;
        PointF cp1 = null;
        while (reader.l()) {
            switch (reader.u(f2302c)) {
                case 0:
                    startFrame = (float) reader.n();
                    break;
                case 1:
                    startValue = j0Var.a(reader, scale);
                    break;
                case 2:
                    endValue = j0Var.a(reader, scale);
                    break;
                case 3:
                    cp1 = p.e(reader, scale);
                    break;
                case 4:
                    cp2 = p.e(reader, scale);
                    break;
                case 5:
                    boolean z = true;
                    if (reader.o() != 1) {
                        z = false;
                    }
                    hold = z;
                    break;
                case 6:
                    pathCp1 = p.e(reader, scale);
                    break;
                case 7:
                    pathCp2 = p.e(reader, scale);
                    break;
                default:
                    reader.w();
                    break;
            }
        }
        reader.j();
        if (hold) {
            endValue = startValue;
            interpolator = f2300a;
        } else if (cp1 == null || cp2 == null) {
            interpolator = f2300a;
        } else {
            cp1.x = g.b(cp1.x, -scale, scale);
            cp1.y = g.b(cp1.y, -100.0f, 100.0f);
            cp2.x = g.b(cp2.x, -scale, scale);
            float b2 = g.b(cp2.y, -100.0f, 100.0f);
            cp2.y = b2;
            int hash = b.a.a.x.h.i(cp1.x, cp1.y, cp2.x, b2);
            WeakReference<Interpolator> interpolatorRef = a(hash);
            if (interpolatorRef != null) {
                interpolator3 = interpolatorRef.get();
            }
            if (interpolatorRef == null || interpolator3 == null) {
                cp1.x /= scale;
                cp1.y /= scale;
                float f2 = cp2.x / scale;
                cp2.x = f2;
                float f3 = cp2.y / scale;
                cp2.y = f3;
                try {
                    interpolator2 = a.h.m.d0.a.a(cp1.x, cp1.y, f2, f3);
                } catch (IllegalArgumentException e2) {
                    if (e2.getMessage().equals("The Path cannot loop back on itself.")) {
                        interpolator2 = a.h.m.d0.a.a(Math.min(cp1.x, 1.0f), cp1.y, Math.max(cp2.x, 0.0f), cp2.y);
                    } else {
                        interpolator2 = new LinearInterpolator();
                    }
                }
                try {
                    f(hash, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException e3) {
                }
                interpolator = interpolator2;
            } else {
                interpolator = interpolator3;
            }
        }
        Keyframe<T> keyframe = new a<>(composition, startValue, endValue, interpolator, startFrame, null);
        keyframe.m = pathCp1;
        keyframe.n = pathCp2;
        return keyframe;
    }

    public static <T> a<T> d(c reader, float scale, j0<T> j0Var) {
        return new a<>(j0Var.a(reader, scale));
    }
}
