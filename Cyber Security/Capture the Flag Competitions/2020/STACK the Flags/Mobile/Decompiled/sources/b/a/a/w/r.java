package b.a.a.w;

import b.a.a.d;
import b.a.a.s.c.h;
import b.a.a.w.k0.c;
import b.a.a.y.a;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.List;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f2303a = c.a.a("k");

    public static <T> List<a<T>> a(c reader, d composition, float scale, j0<T> j0Var) {
        List<Keyframe<T>> keyframes = new ArrayList<>();
        if (reader.s() == c.b.STRING) {
            composition.a("Lottie doesn't support expressions.");
            return keyframes;
        }
        reader.h();
        while (reader.l()) {
            if (reader.u(f2303a) != 0) {
                reader.w();
            } else if (reader.s() == c.b.BEGIN_ARRAY) {
                reader.g();
                if (reader.s() == c.b.NUMBER) {
                    keyframes.add(q.b(reader, composition, scale, j0Var, false));
                } else {
                    while (reader.l()) {
                        keyframes.add(q.b(reader, composition, scale, j0Var, true));
                    }
                }
                reader.i();
            } else {
                keyframes.add(q.b(reader, composition, scale, j0Var, false));
            }
        }
        reader.j();
        b(keyframes);
        return keyframes;
    }

    public static <T> void b(List<? extends a<T>> list) {
        T t;
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            Keyframe<T> keyframe = (a) list.get(i);
            Keyframe<T> nextKeyframe = (a) list.get(i + 1);
            keyframe.f2337f = Float.valueOf(nextKeyframe.f2336e);
            if (keyframe.f2334c == null && (t = nextKeyframe.f2333b) != null) {
                keyframe.f2334c = t;
                if (keyframe instanceof h) {
                    ((h) keyframe).i();
                }
            }
        }
        Keyframe<?> lastKeyframe = (a) list.get(size - 1);
        if ((lastKeyframe.f2333b == null || lastKeyframe.f2334c == null) && list.size() > 1) {
            list.remove(lastKeyframe);
        }
    }
}
