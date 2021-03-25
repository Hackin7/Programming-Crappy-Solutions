package a.h.f;

import android.graphics.Path;
import android.util.Log;
import androidx.core.graphics.PathParser;
import java.util.ArrayList;

public class c {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f816a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f817b;
    }

    public static float[] c(float[] original, int start, int end) {
        if (start <= end) {
            int originalLength = original.length;
            if (start < 0 || start > originalLength) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int resultLength = end - start;
            float[] result = new float[resultLength];
            System.arraycopy(original, start, result, 0, Math.min(resultLength, originalLength - start));
            return result;
        }
        throw new IllegalArgumentException();
    }

    public static Path e(String pathData) {
        Path path = new Path();
        b[] nodes = d(pathData);
        if (nodes == null) {
            return null;
        }
        try {
            b.e(nodes, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + pathData, e2);
        }
    }

    public static b[] d(String pathData) {
        if (pathData == null) {
            return null;
        }
        int start = 0;
        int end = 1;
        ArrayList<PathParser.PathDataNode> list = new ArrayList<>();
        while (end < pathData.length()) {
            int end2 = i(pathData, end);
            String s = pathData.substring(start, end2).trim();
            if (s.length() > 0) {
                a(list, s.charAt(0), h(s));
            }
            start = end2;
            end = end2 + 1;
        }
        if (end - start == 1 && start < pathData.length()) {
            a(list, pathData.charAt(start), new float[0]);
        }
        return (b[]) list.toArray(new b[list.size()]);
    }

    public static b[] f(b[] source) {
        if (source == null) {
            return null;
        }
        b[] copy = new b[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = new b(source[i]);
        }
        return copy;
    }

    public static boolean b(b[] nodesFrom, b[] nodesTo) {
        if (nodesFrom == null || nodesTo == null || nodesFrom.length != nodesTo.length) {
            return false;
        }
        for (int i = 0; i < nodesFrom.length; i++) {
            if (!(nodesFrom[i].f818a == nodesTo[i].f818a && nodesFrom[i].f819b.length == nodesTo[i].f819b.length)) {
                return false;
            }
        }
        return true;
    }

    public static void j(b[] target, b[] source) {
        for (int i = 0; i < source.length; i++) {
            target[i].f818a = source[i].f818a;
            for (int j = 0; j < source[i].f819b.length; j++) {
                target[i].f819b[j] = source[i].f819b[j];
            }
        }
    }

    public static int i(String s, int end) {
        while (end < s.length()) {
            char c2 = s.charAt(end);
            if (((c2 - 'A') * (c2 - 'Z') <= 0 || (c2 - 'a') * (c2 - 'z') <= 0) && c2 != 'e' && c2 != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    public static void a(ArrayList<b> arrayList, char cmd, float[] val) {
        arrayList.add(new b(cmd, val));
    }

    public static float[] h(String s) {
        if (s.charAt(0) == 'z' || s.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] results = new float[s.length()];
            int count = 0;
            int startPosition = 1;
            a result = new a();
            int totalLength = s.length();
            while (startPosition < totalLength) {
                g(s, startPosition, result);
                int endPosition = result.f816a;
                if (startPosition < endPosition) {
                    results[count] = Float.parseFloat(s.substring(startPosition, endPosition));
                    count++;
                }
                if (result.f817b) {
                    startPosition = endPosition;
                } else {
                    startPosition = endPosition + 1;
                }
            }
            return c(results, 0, count);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + s + "\"", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[LOOP:0: B:1:0x0007->B:20:0x003b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC] */
    public static void g(String s, int start, a result) {
        boolean foundSeparator = false;
        result.f817b = false;
        boolean secondDot = false;
        boolean isExponential = false;
        for (int currentIndex = start; currentIndex < s.length(); currentIndex++) {
            isExponential = false;
            char currentChar = s.charAt(currentIndex);
            if (currentChar != ' ') {
                if (currentChar == 'E' || currentChar == 'e') {
                    isExponential = true;
                    if (foundSeparator) {
                        result.f816a = currentIndex;
                    }
                } else {
                    switch (currentChar) {
                        case '-':
                            if (currentIndex != start && !isExponential) {
                                foundSeparator = true;
                                result.f817b = true;
                                break;
                            }
                        case '.':
                            if (!secondDot) {
                                secondDot = true;
                                break;
                            } else {
                                foundSeparator = true;
                                result.f817b = true;
                                break;
                            }
                    }
                    if (foundSeparator) {
                    }
                }
            }
            foundSeparator = true;
            if (foundSeparator) {
            }
        }
        result.f816a = currentIndex;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public char f818a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f819b;

        public b(char type, float[] params) {
            this.f818a = type;
            this.f819b = params;
        }

        public b(b n) {
            this.f818a = n.f818a;
            float[] fArr = n.f819b;
            this.f819b = c.c(fArr, 0, fArr.length);
        }

        public static void e(b[] node, Path path) {
            float[] current = new float[6];
            char previousCommand = 'm';
            for (int i = 0; i < node.length; i++) {
                a(path, current, previousCommand, node[i].f818a, node[i].f819b);
                previousCommand = node[i].f818a;
            }
        }

        public void d(b nodeFrom, b nodeTo, float fraction) {
            this.f818a = nodeFrom.f818a;
            int i = 0;
            while (true) {
                float[] fArr = nodeFrom.f819b;
                if (i < fArr.length) {
                    this.f819b[i] = (fArr[i] * (1.0f - fraction)) + (nodeTo.f819b[i] * fraction);
                    i++;
                } else {
                    return;
                }
            }
        }

        public static void a(Path path, float[] current, char previousCmd, char cmd, float[] val) {
            int incr;
            int k;
            float reflectiveCtrlPointY;
            float reflectiveCtrlPointX;
            float reflectiveCtrlPointY2;
            float reflectiveCtrlPointX2;
            char c2 = cmd;
            float currentX = current[0];
            float currentY = current[1];
            float ctrlPointX = current[2];
            float ctrlPointY = current[3];
            float currentSegmentStartX = current[4];
            float currentSegmentStartY = current[5];
            switch (c2) {
                case 'A':
                case 'a':
                    incr = 7;
                    break;
                case 'C':
                case 'c':
                    incr = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    incr = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    incr = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    incr = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    currentX = currentSegmentStartX;
                    currentY = currentSegmentStartY;
                    ctrlPointX = currentSegmentStartX;
                    ctrlPointY = currentSegmentStartY;
                    path.moveTo(currentX, currentY);
                    incr = 2;
                    break;
                default:
                    incr = 2;
                    break;
            }
            char previousCmd2 = previousCmd;
            int k2 = 0;
            float currentX2 = currentX;
            float ctrlPointX2 = ctrlPointX;
            float ctrlPointY2 = ctrlPointY;
            float currentSegmentStartX2 = currentSegmentStartX;
            float currentSegmentStartY2 = currentSegmentStartY;
            float currentY2 = currentY;
            while (k2 < val.length) {
                if (c2 == 'A') {
                    k = k2;
                    c(path, currentX2, currentY2, val[k + 5], val[k + 6], val[k + 0], val[k + 1], val[k + 2], val[k + 3] != 0.0f, val[k + 4] != 0.0f);
                    float currentX3 = val[k + 5];
                    float currentY3 = val[k + 6];
                    currentX2 = currentX3;
                    currentY2 = currentY3;
                    ctrlPointX2 = currentX3;
                    ctrlPointY2 = currentY3;
                } else if (c2 == 'C') {
                    k = k2;
                    path.cubicTo(val[k + 0], val[k + 1], val[k + 2], val[k + 3], val[k + 4], val[k + 5]);
                    currentX2 = val[k + 4];
                    currentY2 = val[k + 5];
                    ctrlPointX2 = val[k + 2];
                    ctrlPointY2 = val[k + 3];
                } else if (c2 == 'H') {
                    k = k2;
                    path.lineTo(val[k + 0], currentY2);
                    currentX2 = val[k + 0];
                } else if (c2 == 'Q') {
                    k = k2;
                    path.quadTo(val[k + 0], val[k + 1], val[k + 2], val[k + 3]);
                    ctrlPointX2 = val[k + 0];
                    ctrlPointY2 = val[k + 1];
                    currentX2 = val[k + 2];
                    currentY2 = val[k + 3];
                } else if (c2 == 'V') {
                    k = k2;
                    path.lineTo(currentX2, val[k + 0]);
                    currentY2 = val[k + 0];
                } else if (c2 == 'a') {
                    k = k2;
                    c(path, currentX2, currentY2, val[k2 + 5] + currentX2, val[k2 + 6] + currentY2, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3] != 0.0f, val[k2 + 4] != 0.0f);
                    currentX2 += val[k + 5];
                    currentY2 += val[k + 6];
                    ctrlPointX2 = currentX2;
                    ctrlPointY2 = currentY2;
                } else if (c2 == 'c') {
                    path.rCubicTo(val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3], val[k2 + 4], val[k2 + 5]);
                    float ctrlPointX3 = val[k2 + 2] + currentX2;
                    float ctrlPointY3 = currentY2 + val[k2 + 3];
                    currentX2 += val[k2 + 4];
                    ctrlPointX2 = ctrlPointX3;
                    ctrlPointY2 = ctrlPointY3;
                    k = k2;
                    currentY2 = val[k2 + 5] + currentY2;
                } else if (c2 == 'h') {
                    path.rLineTo(val[k2 + 0], 0.0f);
                    currentX2 += val[k2 + 0];
                    k = k2;
                } else if (c2 == 'q') {
                    path.rQuadTo(val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    float ctrlPointX4 = val[k2 + 0] + currentX2;
                    float ctrlPointY4 = currentY2 + val[k2 + 1];
                    currentX2 += val[k2 + 2];
                    ctrlPointX2 = ctrlPointX4;
                    ctrlPointY2 = ctrlPointY4;
                    k = k2;
                    currentY2 = val[k2 + 3] + currentY2;
                } else if (c2 == 'v') {
                    path.rLineTo(0.0f, val[k2 + 0]);
                    currentY2 += val[k2 + 0];
                    k = k2;
                } else if (c2 == 'L') {
                    path.lineTo(val[k2 + 0], val[k2 + 1]);
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    k = k2;
                } else if (c2 == 'M') {
                    float currentX4 = val[k2 + 0];
                    float currentY4 = val[k2 + 1];
                    if (k2 > 0) {
                        path.lineTo(val[k2 + 0], val[k2 + 1]);
                        currentX2 = currentX4;
                        currentY2 = currentY4;
                        k = k2;
                    } else {
                        path.moveTo(val[k2 + 0], val[k2 + 1]);
                        currentX2 = currentX4;
                        currentY2 = currentY4;
                        currentSegmentStartX2 = currentX4;
                        currentSegmentStartY2 = currentY4;
                        k = k2;
                    }
                } else if (c2 == 'S') {
                    if (previousCmd2 == 'c' || previousCmd2 == 's' || previousCmd2 == 'C' || previousCmd2 == 'S') {
                        reflectiveCtrlPointX = (currentX2 * 2.0f) - ctrlPointX2;
                        reflectiveCtrlPointY = (currentY2 * 2.0f) - ctrlPointY2;
                    } else {
                        reflectiveCtrlPointX = currentX2;
                        reflectiveCtrlPointY = currentY2;
                    }
                    path.cubicTo(reflectiveCtrlPointX, reflectiveCtrlPointY, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    ctrlPointX2 = val[k2 + 0];
                    ctrlPointY2 = val[k2 + 1];
                    currentX2 = val[k2 + 2];
                    currentY2 = val[k2 + 3];
                    k = k2;
                } else if (c2 == 'T') {
                    float reflectiveCtrlPointX3 = currentX2;
                    float reflectiveCtrlPointY3 = currentY2;
                    if (previousCmd2 == 'q' || previousCmd2 == 't' || previousCmd2 == 'Q' || previousCmd2 == 'T') {
                        reflectiveCtrlPointX3 = (currentX2 * 2.0f) - ctrlPointX2;
                        reflectiveCtrlPointY3 = (currentY2 * 2.0f) - ctrlPointY2;
                    }
                    path.quadTo(reflectiveCtrlPointX3, reflectiveCtrlPointY3, val[k2 + 0], val[k2 + 1]);
                    ctrlPointX2 = reflectiveCtrlPointX3;
                    ctrlPointY2 = reflectiveCtrlPointY3;
                    currentX2 = val[k2 + 0];
                    currentY2 = val[k2 + 1];
                    k = k2;
                } else if (c2 == 'l') {
                    path.rLineTo(val[k2 + 0], val[k2 + 1]);
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    k = k2;
                } else if (c2 == 'm') {
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    if (k2 > 0) {
                        path.rLineTo(val[k2 + 0], val[k2 + 1]);
                        k = k2;
                    } else {
                        path.rMoveTo(val[k2 + 0], val[k2 + 1]);
                        currentSegmentStartX2 = currentX2;
                        currentSegmentStartY2 = currentY2;
                        k = k2;
                    }
                } else if (c2 == 's') {
                    if (previousCmd2 == 'c' || previousCmd2 == 's' || previousCmd2 == 'C' || previousCmd2 == 'S') {
                        reflectiveCtrlPointX2 = currentX2 - ctrlPointX2;
                        reflectiveCtrlPointY2 = currentY2 - ctrlPointY2;
                    } else {
                        reflectiveCtrlPointX2 = 0.0f;
                        reflectiveCtrlPointY2 = 0.0f;
                    }
                    path.rCubicTo(reflectiveCtrlPointX2, reflectiveCtrlPointY2, val[k2 + 0], val[k2 + 1], val[k2 + 2], val[k2 + 3]);
                    float ctrlPointX5 = val[k2 + 0] + currentX2;
                    float ctrlPointY5 = currentY2 + val[k2 + 1];
                    currentX2 += val[k2 + 2];
                    ctrlPointX2 = ctrlPointX5;
                    ctrlPointY2 = ctrlPointY5;
                    k = k2;
                    currentY2 = val[k2 + 3] + currentY2;
                } else if (c2 != 't') {
                    k = k2;
                } else {
                    float reflectiveCtrlPointX4 = 0.0f;
                    float reflectiveCtrlPointY4 = 0.0f;
                    if (previousCmd2 == 'q' || previousCmd2 == 't' || previousCmd2 == 'Q' || previousCmd2 == 'T') {
                        reflectiveCtrlPointX4 = currentX2 - ctrlPointX2;
                        reflectiveCtrlPointY4 = currentY2 - ctrlPointY2;
                    }
                    path.rQuadTo(reflectiveCtrlPointX4, reflectiveCtrlPointY4, val[k2 + 0], val[k2 + 1]);
                    float ctrlPointX6 = currentX2 + reflectiveCtrlPointX4;
                    float ctrlPointY6 = currentY2 + reflectiveCtrlPointY4;
                    currentX2 += val[k2 + 0];
                    currentY2 += val[k2 + 1];
                    ctrlPointX2 = ctrlPointX6;
                    ctrlPointY2 = ctrlPointY6;
                    k = k2;
                }
                previousCmd2 = cmd;
                k2 = k + incr;
                c2 = cmd;
            }
            current[0] = currentX2;
            current[1] = currentY2;
            current[2] = ctrlPointX2;
            current[3] = ctrlPointY2;
            current[4] = currentSegmentStartX2;
            current[5] = currentSegmentStartY2;
        }

        public static void c(Path p, float x0, float y0, float x1, float y1, float a2, float b2, float theta, boolean isMoreThanHalf, boolean isPositiveArc) {
            double cy;
            double cx;
            double thetaD = Math.toRadians((double) theta);
            double cosTheta = Math.cos(thetaD);
            double sinTheta = Math.sin(thetaD);
            double x0p = ((((double) x0) * cosTheta) + (((double) y0) * sinTheta)) / ((double) a2);
            double y0p = ((((double) (-x0)) * sinTheta) + (((double) y0) * cosTheta)) / ((double) b2);
            double x1p = ((((double) x1) * cosTheta) + (((double) y1) * sinTheta)) / ((double) a2);
            double y1p = ((((double) (-x1)) * sinTheta) + (((double) y1) * cosTheta)) / ((double) b2);
            double dx = x0p - x1p;
            double dy = y0p - y1p;
            double xm = (x0p + x1p) / 2.0d;
            double ym = (y0p + y1p) / 2.0d;
            double dsq = (dx * dx) + (dy * dy);
            if (dsq == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double disc = (1.0d / dsq) - 0.25d;
            if (disc < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + dsq);
                float adjust = (float) (Math.sqrt(dsq) / 1.99999d);
                c(p, x0, y0, x1, y1, a2 * adjust, b2 * adjust, theta, isMoreThanHalf, isPositiveArc);
                return;
            }
            double s = Math.sqrt(disc);
            double sdx = s * dx;
            double sdy = s * dy;
            if (isMoreThanHalf == isPositiveArc) {
                cx = xm - sdy;
                cy = ym + sdx;
            } else {
                cx = xm + sdy;
                cy = ym - sdx;
            }
            double eta0 = Math.atan2(y0p - cy, x0p - cx);
            double sweep = Math.atan2(y1p - cy, x1p - cx) - eta0;
            if (isPositiveArc != (sweep >= 0.0d)) {
                if (sweep > 0.0d) {
                    sweep -= 6.283185307179586d;
                } else {
                    sweep += 6.283185307179586d;
                }
            }
            double cx2 = cx * ((double) a2);
            double cy2 = ((double) b2) * cy;
            b(p, (cx2 * cosTheta) - (cy2 * sinTheta), (cx2 * sinTheta) + (cy2 * cosTheta), (double) a2, (double) b2, (double) x0, (double) y0, thetaD, eta0, sweep);
        }

        /* JADX INFO: Multiple debug info for r2v12 double: [D('e2x' double), D('anglePerSegment' double)] */
        /* JADX INFO: Multiple debug info for r11v2 double: [D('cosEta1' double), D('e2y' double)] */
        /* JADX INFO: Multiple debug info for r4v6 double: [D('numSegments' int), D('q1y' double)] */
        public static void b(Path p, double cx, double cy, double a2, double b2, double e1x, double e1y, double theta, double start, double sweep) {
            double e1x2 = a2;
            int numSegments = (int) Math.ceil(Math.abs((sweep * 4.0d) / 3.141592653589793d));
            double cosTheta = Math.cos(theta);
            double sinTheta = Math.sin(theta);
            double cosEta1 = Math.cos(start);
            double sinEta1 = Math.sin(start);
            double ep1y = ((-e1x2) * sinTheta * sinEta1) + (b2 * cosTheta * cosEta1);
            double anglePerSegment = sweep / ((double) numSegments);
            double eta1 = start;
            int i = 0;
            double eta12 = e1x;
            double ep1x = (((-e1x2) * cosTheta) * sinEta1) - ((b2 * sinTheta) * cosEta1);
            double e1y2 = e1y;
            while (i < numSegments) {
                double eta2 = eta1 + anglePerSegment;
                double sinEta2 = Math.sin(eta2);
                double cosEta2 = Math.cos(eta2);
                double anglePerSegment2 = (cx + ((e1x2 * cosTheta) * cosEta2)) - ((b2 * sinTheta) * sinEta2);
                double e2y = cy + (e1x2 * sinTheta * cosEta2) + (b2 * cosTheta * sinEta2);
                double ep2x = (((-e1x2) * cosTheta) * sinEta2) - ((b2 * sinTheta) * cosEta2);
                double ep2y = ((-e1x2) * sinTheta * sinEta2) + (b2 * cosTheta * cosEta2);
                double tanDiff2 = Math.tan((eta2 - eta1) / 2.0d);
                double alpha = (Math.sin(eta2 - eta1) * (Math.sqrt(((tanDiff2 * 3.0d) * tanDiff2) + 4.0d) - 1.0d)) / 3.0d;
                p.rLineTo(0.0f, 0.0f);
                p.cubicTo((float) (eta12 + (alpha * ep1x)), (float) (e1y2 + (alpha * ep1y)), (float) (anglePerSegment2 - (alpha * ep2x)), (float) (e2y - (alpha * ep2y)), (float) anglePerSegment2, (float) e2y);
                eta1 = eta2;
                e1y2 = e2y;
                ep1x = ep2x;
                ep1y = ep2y;
                eta12 = anglePerSegment2;
                i++;
                numSegments = numSegments;
                sinEta1 = sinEta1;
                anglePerSegment = anglePerSegment;
                cosEta1 = cosEta1;
                cosTheta = cosTheta;
                sinTheta = sinTheta;
                e1x2 = a2;
            }
        }
    }
}
