package b.c.a.a.j;

import b.c.a.a.j.d.a;

public class d<T extends a> {

    /* renamed from: g  reason: collision with root package name */
    public static int f2513g = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f2514a;

    /* renamed from: b  reason: collision with root package name */
    public int f2515b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2516c;

    /* renamed from: d  reason: collision with root package name */
    public int f2517d;

    /* renamed from: e  reason: collision with root package name */
    public T f2518e;

    /* renamed from: f  reason: collision with root package name */
    public float f2519f;

    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static int f2520b = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f2521a = -1;

        public abstract a a();
    }

    public static synchronized d a(int withCapacity, a object) {
        d result;
        synchronized (d.class) {
            result = new d(withCapacity, object);
            result.f2514a = f2513g;
            f2513g++;
        }
        return result;
    }

    public d(int withCapacity, T object) {
        if (withCapacity > 0) {
            this.f2515b = withCapacity;
            this.f2516c = new Object[withCapacity];
            this.f2517d = 0;
            this.f2518e = object;
            this.f2519f = 1.0f;
            d();
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    public void g(float percentage) {
        float p = percentage;
        if (p > 1.0f) {
            p = 1.0f;
        } else if (p < 0.0f) {
            p = 0.0f;
        }
        this.f2519f = p;
    }

    public final void d() {
        e(this.f2519f);
    }

    public final void e(float percentage) {
        int i = this.f2515b;
        int portionOfCapacity = (int) (((float) i) * percentage);
        if (portionOfCapacity < 1) {
            portionOfCapacity = 1;
        } else if (portionOfCapacity > i) {
            portionOfCapacity = this.f2515b;
        }
        for (int i2 = 0; i2 < portionOfCapacity; i2++) {
            this.f2516c[i2] = this.f2518e.a();
        }
        this.f2517d = portionOfCapacity - 1;
    }

    public synchronized T b() {
        T result;
        if (this.f2517d == -1 && this.f2519f > 0.0f) {
            d();
        }
        result = (T) ((a) this.f2516c[this.f2517d]);
        result.f2521a = -1;
        this.f2517d--;
        return result;
    }

    public synchronized void c(T object) {
        if (object.f2521a == -1) {
            int i = this.f2517d + 1;
            this.f2517d = i;
            if (i >= this.f2516c.length) {
                f();
            }
            object.f2521a = this.f2514a;
            this.f2516c[this.f2517d] = object;
        } else if (object.f2521a == this.f2514a) {
            throw new IllegalArgumentException("The object passed is already stored in this pool!");
        } else {
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + object.f2521a + ".  Object cannot belong to two different pool instances simultaneously!");
        }
    }

    public final void f() {
        int oldCapacity = this.f2515b;
        int i = this.f2515b * 2;
        this.f2515b = i;
        Object[] temp = new Object[i];
        for (int i2 = 0; i2 < oldCapacity; i2++) {
            temp[i2] = this.f2516c[i2];
        }
        this.f2516c = temp;
    }
}
