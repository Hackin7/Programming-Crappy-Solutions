package b.a.a.y;

import b.a.a.s.c.a;

public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f2341a = new b<>();

    /* renamed from: b  reason: collision with root package name */
    public T f2342b = null;

    public c(T staticValue) {
        this.f2342b = staticValue;
    }

    /* JADX WARN: Incorrect args count in method signature: (Lb/a/a/y/b<TT;>;)TT; */
    public Object a() {
        return this.f2342b;
    }

    public final T b(float startFrame, float endFrame, T startValue, T endValue, float linearKeyframeProgress, float interpolatedKeyframeProgress, float overallProgress) {
        this.f2341a.a(startFrame, endFrame, startValue, endValue, linearKeyframeProgress, interpolatedKeyframeProgress, overallProgress);
        return (T) a();
    }

    public final void c(a<?, ?> aVar) {
    }
}
