package b.c.a.a.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import b.c.a.a.e.b;
import b.c.a.a.e.c;
import net.sqlcipher.database.SQLiteDatabase;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static DisplayMetrics f2522a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f2523b = Float.intBitsToFloat(1);

    /* renamed from: c  reason: collision with root package name */
    public static Rect f2524c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public static Paint.FontMetrics f2525d = new Paint.FontMetrics();

    /* renamed from: e  reason: collision with root package name */
    public static Rect f2526e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public static c f2527f = h();

    /* renamed from: g  reason: collision with root package name */
    public static Rect f2528g = new Rect();
    public static Rect h = new Rect();
    public static Paint.FontMetrics i = new Paint.FontMetrics();

    static {
        Double.longBitsToDouble(1);
        int[] iArr = {1, 10, 100, SQLiteDatabase.SLEEP_AFTER_YIELD_QUANTUM, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    }

    public static void t(Context context) {
        if (context == null) {
            ViewConfiguration.getMinimumFlingVelocity();
            ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledMinimumFlingVelocity();
        viewConfiguration.getScaledMaximumFlingVelocity();
        f2522a = context.getResources().getDisplayMetrics();
    }

    public static float e(float dp) {
        DisplayMetrics displayMetrics = f2522a;
        if (displayMetrics != null) {
            return displayMetrics.density * dp;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return dp;
    }

    public static int d(Paint paint, String demoText) {
        return (int) paint.measureText(demoText);
    }

    public static int a(Paint paint, String demoText) {
        Rect r = f2524c;
        r.set(0, 0, 0, 0);
        paint.getTextBounds(demoText, 0, demoText.length(), r);
        return r.height();
    }

    public static float k(Paint paint) {
        return l(paint, f2525d);
    }

    public static float l(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float m(Paint paint) {
        return n(paint, f2525d);
    }

    public static float n(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static b b(Paint paint, String demoText) {
        b result = b.b(0.0f, 0.0f);
        c(paint, demoText, result);
        return result;
    }

    public static void c(Paint paint, String demoText, b outputFSize) {
        Rect r = f2526e;
        r.set(0, 0, 0, 0);
        paint.getTextBounds(demoText, 0, demoText.length(), r);
        outputFSize.f2508c = (float) r.width();
        outputFSize.f2509d = (float) r.height();
    }

    public static c h() {
        return new b(1);
    }

    public static c j() {
        return f2527f;
    }

    public static float w(double number) {
        if (Double.isInfinite(number) || Double.isNaN(number) || number == 0.0d) {
            return 0.0f;
        }
        float magnitude = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(number < 0.0d ? -number : number)))))));
        return ((float) Math.round(((double) magnitude) * number)) / magnitude;
    }

    public static int i(float number) {
        float i2 = w((double) number);
        if (Float.isInfinite(i2)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10((double) i2))) + 2;
    }

    public static double u(double d2) {
        if (d2 == Double.POSITIVE_INFINITY) {
            return d2;
        }
        double d3 = d2 + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d3) + (d3 >= 0.0d ? 1 : -1));
    }

    public static void p(c center, float dist, float angle, c outputPoint) {
        outputPoint.f2511c = (float) (((double) center.f2511c) + (((double) dist) * Math.cos(Math.toRadians((double) angle))));
        outputPoint.f2512d = (float) (((double) center.f2512d) + (((double) dist) * Math.sin(Math.toRadians((double) angle))));
    }

    @SuppressLint({"NewApi"})
    public static void v(View view) {
        view.postInvalidateOnAnimation();
    }

    public static float o(float angle) {
        while (angle < 0.0f) {
            angle += 360.0f;
        }
        return angle % 360.0f;
    }

    public static void f(Canvas canvas, Drawable drawable, int x, int y, int width, int height) {
        c drawOffset = c.b();
        drawOffset.f2511c = (float) (x - (width / 2));
        drawOffset.f2512d = (float) (y - (height / 2));
        drawable.copyBounds(f2528g);
        Rect rect = f2528g;
        int i2 = rect.left;
        int i3 = rect.top;
        drawable.setBounds(i2, i3, i2 + width, i3 + width);
        int saveId = canvas.save();
        canvas.translate(drawOffset.f2511c, drawOffset.f2512d);
        drawable.draw(canvas);
        canvas.restoreToCount(saveId);
    }

    public static void g(Canvas c2, String text, float x, float y, Paint paint, c anchor, float angleDegrees) {
        float lineHeight = paint.getFontMetrics(i);
        paint.getTextBounds(text, 0, text.length(), h);
        float drawOffsetX = 0.0f - ((float) h.left);
        float drawOffsetY = 0.0f + (-i.ascent);
        Paint.Align originalTextAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (angleDegrees != 0.0f) {
            float drawOffsetX2 = drawOffsetX - (((float) h.width()) * 0.5f);
            float drawOffsetY2 = drawOffsetY - (lineHeight * 0.5f);
            float translateX = x;
            float translateY = y;
            if (!(anchor.f2511c == 0.5f && anchor.f2512d == 0.5f)) {
                b rotatedSize = r((float) h.width(), lineHeight, angleDegrees);
                translateX -= rotatedSize.f2508c * (anchor.f2511c - 0.5f);
                translateY -= rotatedSize.f2509d * (anchor.f2512d - 0.5f);
                b.c(rotatedSize);
            }
            c2.save();
            c2.translate(translateX, translateY);
            c2.rotate(angleDegrees);
            c2.drawText(text, drawOffsetX2, drawOffsetY2, paint);
            c2.restore();
        } else {
            if (!(anchor.f2511c == 0.0f && anchor.f2512d == 0.0f)) {
                drawOffsetX -= ((float) h.width()) * anchor.f2511c;
                drawOffsetY -= anchor.f2512d * lineHeight;
            }
            c2.drawText(text, drawOffsetX + x, drawOffsetY + y, paint);
        }
        paint.setTextAlign(originalTextAlign);
    }

    public static b r(float rectangleWidth, float rectangleHeight, float degrees) {
        return s(rectangleWidth, rectangleHeight, 0.017453292f * degrees);
    }

    public static b s(float rectangleWidth, float rectangleHeight, float radians) {
        return b.b(Math.abs(((float) Math.cos((double) radians)) * rectangleWidth) + Math.abs(((float) Math.sin((double) radians)) * rectangleHeight), Math.abs(((float) Math.sin((double) radians)) * rectangleWidth) + Math.abs(((float) Math.cos((double) radians)) * rectangleHeight));
    }

    public static int q() {
        return Build.VERSION.SDK_INT;
    }
}
