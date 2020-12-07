package b.a.a.x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import b.a.a.s.b.s;
import b.a.a.s.c.c;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final PathMeasure f2326a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public static final Path f2327b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public static final Path f2328c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f2329d = new float[4];

    /* renamed from: e  reason: collision with root package name */
    public static final float f2330e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f  reason: collision with root package name */
    public static float f2331f = -1.0f;

    public static Path d(PointF startPoint, PointF endPoint, PointF cp1, PointF cp2) {
        Path path = new Path();
        path.moveTo(startPoint.x, startPoint.y);
        if (cp1 == null || cp2 == null || (cp1.length() == 0.0f && cp2.length() == 0.0f)) {
            path.lineTo(endPoint.x, endPoint.y);
        } else {
            float f2 = cp1.x + startPoint.x;
            float f3 = startPoint.y;
            float f4 = endPoint.x;
            float f5 = endPoint.y;
            path.cubicTo(f2, cp1.y + f3, f4 + cp2.x, f5 + cp2.y, f4, f5);
        }
        return path;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e2) {
            }
        }
    }

    public static float g(Matrix matrix) {
        float[] fArr = f2329d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f2330e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        float[] fArr2 = f2329d;
        return (float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]));
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f2329d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f2329d;
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return true;
        }
        return false;
    }

    public static void b(Path path, s trimPath) {
        if (trimPath != null && !trimPath.l()) {
            a(path, ((c) trimPath.j()).o() / 100.0f, ((c) trimPath.e()).o() / 100.0f, ((c) trimPath.f()).o() / 360.0f);
        }
    }

    public static void a(Path path, float startValue, float endValue, float offsetValue) {
        b.a.a.c.a("applyTrimPathIfNeeded");
        f2326a.setPath(path, false);
        float length = f2326a.getLength();
        if (startValue == 1.0f && endValue == 0.0f) {
            b.a.a.c.b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((endValue - startValue) - 1.0f)) < 0.01d) {
            b.a.a.c.b("applyTrimPathIfNeeded");
        } else {
            float start = length * startValue;
            float end = length * endValue;
            float offset = offsetValue * length;
            float newStart = Math.min(start, end) + offset;
            float newEnd = Math.max(start, end) + offset;
            if (newStart >= length && newEnd >= length) {
                newStart = (float) g.f(newStart, length);
                newEnd = (float) g.f(newEnd, length);
            }
            if (newStart < 0.0f) {
                newStart = (float) g.f(newStart, length);
            }
            if (newEnd < 0.0f) {
                newEnd = (float) g.f(newEnd, length);
            }
            if (newStart == newEnd) {
                path.reset();
                b.a.a.c.b("applyTrimPathIfNeeded");
                return;
            }
            if (newStart >= newEnd) {
                newStart -= length;
            }
            f2327b.reset();
            f2326a.getSegment(newStart, newEnd, f2327b, true);
            if (newEnd > length) {
                f2328c.reset();
                f2326a.getSegment(0.0f, newEnd % length, f2328c, true);
                f2327b.addPath(f2328c);
            } else if (newStart < 0.0f) {
                f2328c.reset();
                f2326a.getSegment(length + newStart, length, f2328c, true);
                f2327b.addPath(f2328c);
            }
            path.set(f2327b);
            b.a.a.c.b("applyTrimPathIfNeeded");
        }
    }

    public static boolean j(int major, int minor, int patch, int minMajor, int minMinor, int minPatch) {
        if (major < minMajor) {
            return false;
        }
        if (major > minMajor) {
            return true;
        }
        if (minor < minMinor) {
            return false;
        }
        if (minor <= minMinor && patch < minPatch) {
            return false;
        }
        return true;
    }

    public static int i(float a2, float b2, float c2, float d2) {
        int result = 17;
        if (a2 != 0.0f) {
            result = (int) (((float) (17 * 31)) * a2);
        }
        if (b2 != 0.0f) {
            result = (int) (((float) (result * 31)) * b2);
        }
        if (c2 != 0.0f) {
            result = (int) (((float) (result * 31)) * c2);
        }
        if (d2 != 0.0f) {
            return (int) (((float) (result * 31)) * d2);
        }
        return result;
    }

    public static float e() {
        if (f2331f == -1.0f) {
            f2331f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f2331f;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap l(Bitmap bitmap, int width, int height) {
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            return bitmap;
        }
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        bitmap.recycle();
        return resizedBitmap;
    }

    public static boolean k(Throwable e2) {
        return (e2 instanceof SocketException) || (e2 instanceof ClosedChannelException) || (e2 instanceof InterruptedIOException) || (e2 instanceof ProtocolException) || (e2 instanceof SSLException) || (e2 instanceof UnknownHostException) || (e2 instanceof UnknownServiceException);
    }

    public static void m(Canvas canvas, RectF rect, Paint paint) {
        n(canvas, rect, paint, 31);
    }

    public static void n(Canvas canvas, RectF rect, Paint paint, int flag) {
        b.a.a.c.a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rect, paint, flag);
        } else {
            canvas.saveLayer(rect, paint);
        }
        b.a.a.c.b("Utils#saveLayer");
    }
}
