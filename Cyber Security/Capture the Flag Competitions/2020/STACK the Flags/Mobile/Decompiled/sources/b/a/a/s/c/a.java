package b.a.a.s.c;

import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f2035a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f2036b = false;

    /* renamed from: c  reason: collision with root package name */
    public final d<K> f2037c;

    /* renamed from: d  reason: collision with root package name */
    public float f2038d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public b.a.a.y.c<A> f2039e;

    /* renamed from: f  reason: collision with root package name */
    public A f2040f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f2041g = -1.0f;
    public float h = -1.0f;

    public interface b {
        void b();
    }

    public interface d<T> {
        float a();

        boolean b(float f2);

        float c();

        b.a.a.y.a<T> d();

        boolean e(float f2);

        boolean isEmpty();
    }

    public abstract A i(b.a.a.y.a<K> aVar, float f2);

    public a(List<? extends b.a.a.y.a<K>> list) {
        this.f2037c = n(list);
    }

    public void k() {
        this.f2036b = true;
    }

    public void a(b listener) {
        this.f2035a.add(listener);
    }

    public void l(float progress) {
        if (!this.f2037c.isEmpty()) {
            if (progress < g()) {
                progress = g();
            } else if (progress > c()) {
                progress = c();
            }
            if (progress != this.f2038d) {
                this.f2038d = progress;
                if (this.f2037c.e(progress)) {
                    j();
                }
            }
        }
    }

    public void j() {
        for (int i = 0; i < this.f2035a.size(); i++) {
            this.f2035a.get(i).b();
        }
    }

    public b.a.a.y.a<K> b() {
        b.a.a.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        Keyframe<K> keyframe = this.f2037c.d();
        b.a.a.c.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return keyframe;
    }

    public float e() {
        if (this.f2036b) {
            return 0.0f;
        }
        Keyframe<K> keyframe = b();
        if (keyframe.h()) {
            return 0.0f;
        }
        return (this.f2038d - keyframe.e()) / (keyframe.b() - keyframe.e());
    }

    public float d() {
        Keyframe<K> keyframe = b();
        if (keyframe.h()) {
            return 0.0f;
        }
        return keyframe.f2335d.getInterpolation(e());
    }

    public final float g() {
        if (this.f2041g == -1.0f) {
            this.f2041g = this.f2037c.c();
        }
        return this.f2041g;
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.f2037c.a();
        }
        return this.h;
    }

    public A h() {
        float progress = d();
        if (this.f2039e == null && this.f2037c.b(progress)) {
            return this.f2040f;
        }
        A value = i(b(), progress);
        this.f2040f = value;
        return value;
    }

    public float f() {
        return this.f2038d;
    }

    public void m(b.a.a.y.c<A> cVar) {
        b.a.a.y.c<A> cVar2 = this.f2039e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f2039e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public static <T> d<T> n(List<? extends b.a.a.y.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // b.a.a.s.c.a.d
        public boolean isEmpty() {
            return true;
        }

        @Override // b.a.a.s.c.a.d
        public boolean e(float progress) {
            return false;
        }

        @Override // b.a.a.s.c.a.d
        public b.a.a.y.a<T> d() {
            throw new IllegalStateException("not implemented");
        }

        @Override // b.a.a.s.c.a.d
        public float c() {
            return 0.0f;
        }

        @Override // b.a.a.s.c.a.d
        public float a() {
            return 1.0f;
        }

        @Override // b.a.a.s.c.a.d
        public boolean b(float interpolatedProgress) {
            throw new IllegalStateException("not implemented");
        }
    }

    public static final class f<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b.a.a.y.a<T> f2046a;

        /* renamed from: b  reason: collision with root package name */
        public float f2047b = -1.0f;

        public f(List<? extends b.a.a.y.a<T>> list) {
            this.f2046a = (b.a.a.y.a) list.get(0);
        }

        @Override // b.a.a.s.c.a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // b.a.a.s.c.a.d
        public boolean e(float progress) {
            return !this.f2046a.h();
        }

        @Override // b.a.a.s.c.a.d
        public b.a.a.y.a<T> d() {
            return this.f2046a;
        }

        @Override // b.a.a.s.c.a.d
        public float c() {
            return this.f2046a.e();
        }

        @Override // b.a.a.s.c.a.d
        public float a() {
            return this.f2046a.b();
        }

        @Override // b.a.a.s.c.a.d
        public boolean b(float interpolatedProgress) {
            if (this.f2047b == interpolatedProgress) {
                return true;
            }
            this.f2047b = interpolatedProgress;
            return false;
        }
    }

    public static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends b.a.a.y.a<T>> f2042a;

        /* renamed from: b  reason: collision with root package name */
        public b.a.a.y.a<T> f2043b;

        /* renamed from: c  reason: collision with root package name */
        public b.a.a.y.a<T> f2044c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f2045d = -1.0f;

        public e(List<? extends b.a.a.y.a<T>> list) {
            this.f2042a = list;
            this.f2043b = f(0.0f);
        }

        @Override // b.a.a.s.c.a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // b.a.a.s.c.a.d
        public boolean e(float progress) {
            if (this.f2043b.a(progress)) {
                return !this.f2043b.h();
            }
            this.f2043b = f(progress);
            return true;
        }

        public final b.a.a.y.a<T> f(float progress) {
            List<? extends b.a.a.y.a<T>> list = this.f2042a;
            Keyframe<T> keyframe = (b.a.a.y.a) list.get(list.size() - 1);
            if (progress >= keyframe.e()) {
                return keyframe;
            }
            for (int i = this.f2042a.size() - 2; i >= 1; i--) {
                Keyframe<T> keyframe2 = (b.a.a.y.a) this.f2042a.get(i);
                if (this.f2043b != keyframe2 && keyframe2.a(progress)) {
                    return keyframe2;
                }
            }
            return (b.a.a.y.a) this.f2042a.get(0);
        }

        @Override // b.a.a.s.c.a.d
        public b.a.a.y.a<T> d() {
            return this.f2043b;
        }

        @Override // b.a.a.s.c.a.d
        public float c() {
            return ((b.a.a.y.a) this.f2042a.get(0)).e();
        }

        @Override // b.a.a.s.c.a.d
        public float a() {
            List<? extends b.a.a.y.a<T>> list = this.f2042a;
            return ((b.a.a.y.a) list.get(list.size() - 1)).b();
        }

        @Override // b.a.a.s.c.a.d
        public boolean b(float interpolatedProgress) {
            if (this.f2044c == this.f2043b && this.f2045d == interpolatedProgress) {
                return true;
            }
            this.f2044c = this.f2043b;
            this.f2045d = interpolatedProgress;
            return false;
        }
    }
}
