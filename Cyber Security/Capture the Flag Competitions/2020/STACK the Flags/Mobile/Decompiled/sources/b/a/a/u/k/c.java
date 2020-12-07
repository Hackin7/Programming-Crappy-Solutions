package b.a.a.u.k;

import b.a.a.x.b;
import b.a.a.x.g;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2121a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f2122b;

    public c(float[] positions, int[] colors) {
        this.f2121a = positions;
        this.f2122b = colors;
    }

    public float[] b() {
        return this.f2121a;
    }

    public int[] a() {
        return this.f2122b;
    }

    public int c() {
        return this.f2122b.length;
    }

    public void d(c gc1, c gc2, float progress) {
        if (gc1.f2122b.length == gc2.f2122b.length) {
            for (int i = 0; i < gc1.f2122b.length; i++) {
                this.f2121a[i] = g.j(gc1.f2121a[i], gc2.f2121a[i], progress);
                this.f2122b[i] = b.c(progress, gc1.f2122b[i], gc2.f2122b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + gc1.f2122b.length + " vs " + gc2.f2122b.length + ")");
    }
}
