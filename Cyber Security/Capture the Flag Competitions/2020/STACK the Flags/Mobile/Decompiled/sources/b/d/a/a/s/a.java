package b.d.a.a.s;

public final class a {
    public static float a(float x1, float y1, float x2, float y2) {
        return (float) Math.hypot((double) (x2 - x1), (double) (y2 - y1));
    }

    public static float c(float start, float stop, float amount) {
        return ((1.0f - amount) * start) + (amount * stop);
    }

    public static float b(float pointX, float pointY, float rectLeft, float rectTop, float rectRight, float rectBottom) {
        return d(a(pointX, pointY, rectLeft, rectTop), a(pointX, pointY, rectRight, rectTop), a(pointX, pointY, rectRight, rectBottom), a(pointX, pointY, rectLeft, rectBottom));
    }

    public static float d(float a2, float b2, float c2, float d2) {
        if (a2 > b2 && a2 > c2 && a2 > d2) {
            return a2;
        }
        if (b2 <= c2 || b2 <= d2) {
            return c2 > d2 ? c2 : d2;
        }
        return b2;
    }
}
