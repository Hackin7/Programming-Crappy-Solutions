package b.a.a.x;

import android.graphics.Path;
import android.graphics.PointF;
import b.a.a.s.b.k;
import b.a.a.u.a;
import b.a.a.u.e;
import b.a.a.u.k.l;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static PointF f2325a = new PointF();

    public static PointF a(PointF p1, PointF p2) {
        return new PointF(p1.x + p2.x, p1.y + p2.y);
    }

    public static void h(l shapeData, Path outPath) {
        outPath.reset();
        PointF initialPoint = shapeData.b();
        outPath.moveTo(initialPoint.x, initialPoint.y);
        f2325a.set(initialPoint.x, initialPoint.y);
        for (int i = 0; i < shapeData.a().size(); i++) {
            a curveData = shapeData.a().get(i);
            PointF cp1 = curveData.a();
            PointF cp2 = curveData.b();
            PointF vertex = curveData.c();
            if (!cp1.equals(f2325a) || !cp2.equals(vertex)) {
                outPath.cubicTo(cp1.x, cp1.y, cp2.x, cp2.y, vertex.x, vertex.y);
            } else {
                outPath.lineTo(vertex.x, vertex.y);
            }
            f2325a.set(vertex.x, vertex.y);
        }
        if (shapeData.d()) {
            outPath.close();
        }
    }

    public static float j(float a2, float b2, float percentage) {
        return ((b2 - a2) * percentage) + a2;
    }

    public static double i(double a2, double b2, double percentage) {
        return ((b2 - a2) * percentage) + a2;
    }

    public static int k(int a2, int b2, float percentage) {
        return (int) (((float) a2) + (((float) (b2 - a2)) * percentage));
    }

    public static int f(float x, float y) {
        return g((int) x, (int) y);
    }

    public static int g(int x, int y) {
        return x - (e(x, y) * y);
    }

    public static int e(int x, int y) {
        int r = x / y;
        int mod = x % y;
        if (((x ^ y) >= 0) || mod == 0) {
            return r;
        }
        return r - 1;
    }

    public static int c(int number, int min, int max) {
        return Math.max(min, Math.min(max, number));
    }

    public static float b(float number, float min, float max) {
        return Math.max(min, Math.min(max, number));
    }

    public static boolean d(float number, float rangeMin, float rangeMax) {
        return number >= rangeMin && number <= rangeMax;
    }

    public static void l(e keyPath, int depth, List<e> list, e currentPartialKeyPath, k content) {
        if (keyPath.c(content.i(), depth)) {
            list.add(currentPartialKeyPath.a(content.i()).i(content));
        }
    }
}
