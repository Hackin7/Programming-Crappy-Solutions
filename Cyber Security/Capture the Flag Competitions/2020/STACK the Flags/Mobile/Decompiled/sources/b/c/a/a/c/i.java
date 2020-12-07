package b.c.a.a.c;

public class i extends a {
    public boolean A = true;
    public boolean B = true;
    public boolean C = false;
    public float D = 10.0f;
    public float E = 10.0f;

    public enum a {
        LEFT,
        RIGHT
    }

    public enum b {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public i(a position) {
        b bVar = b.OUTSIDE_CHART;
        this.f2393c = 0.0f;
    }

    public boolean w() {
        return this.B;
    }

    public boolean v() {
        return this.A;
    }

    public boolean x() {
        return this.C;
    }

    public float u() {
        return this.D;
    }

    public float t() {
        return this.E;
    }

    @Override // b.c.a.a.c.a
    public void h(float dataMin, float dataMax) {
        float min = dataMin;
        float max = dataMax;
        if (Math.abs(max - min) == 0.0f) {
            max += 1.0f;
            min -= 1.0f;
        }
        float range = Math.abs(max - min);
        this.y = this.v ? this.y : min - ((range / 100.0f) * t());
        float u = this.w ? this.x : ((range / 100.0f) * u()) + max;
        this.x = u;
        this.z = Math.abs(this.y - u);
    }
}
