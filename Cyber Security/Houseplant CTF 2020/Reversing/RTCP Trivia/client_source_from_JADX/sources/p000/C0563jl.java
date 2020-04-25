package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: jl */
public final class C0563jl implements Interpolator {

    /* renamed from: a */
    private float[] f2287a;

    /* renamed from: b */
    private float[] f2288b;

    public C0563jl(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private C0563jl(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        Path path;
        TypedArray a = C0330fd.m1078a(resources, theme, attributeSet, C0553jf.f2271l);
        if (C0330fd.m1081a(xmlPullParser, "pathData")) {
            String c = C0330fd.m1083c(a, xmlPullParser, "pathData", 4);
            Path a2 = C0332ff.m1088a(c);
            if (a2 == null) {
                StringBuilder sb = new StringBuilder("The path is null, which is created from ");
                sb.append(c);
                throw new InflateException(sb.toString());
            }
            m1744a(a2);
        } else if (!C0330fd.m1081a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (!C0330fd.m1081a(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            float a3 = C0330fd.m1075a(a, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0330fd.m1075a(a, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0330fd.m1081a(xmlPullParser, "controlX2");
            if (a5 != C0330fd.m1081a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (!a5) {
                path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(a3, a4, 1.0f, 1.0f);
            } else {
                float a6 = C0330fd.m1075a(a, xmlPullParser, "controlX2", 2, 0.0f);
                float a7 = C0330fd.m1075a(a, xmlPullParser, "controlY2", 3, 0.0f);
                path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(a3, a4, a6, a7, 1.0f, 1.0f);
            }
            m1744a(path);
        }
        a.recycle();
    }

    /* renamed from: a */
    private void m1744a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            StringBuilder sb = new StringBuilder("The Path has a invalid length ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f2287a = new float[min];
        this.f2288b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
            this.f2287a[i2] = fArr[0];
            this.f2288b[i2] = fArr[1];
        }
        if (((double) Math.abs(this.f2287a[0])) <= 1.0E-5d && ((double) Math.abs(this.f2288b[0])) <= 1.0E-5d) {
            int i3 = min - 1;
            if (((double) Math.abs(this.f2287a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f2288b[i3] - 1.0f)) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    int i5 = i4 + 1;
                    float f2 = this.f2287a[i4];
                    if (f2 < f) {
                        StringBuilder sb2 = new StringBuilder("The Path cannot loop back on itself, x :");
                        sb2.append(f2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f2287a[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
        sb3.append(this.f2287a[0]);
        sb3.append(",");
        sb3.append(this.f2288b[0]);
        sb3.append(" end:");
        int i6 = min - 1;
        sb3.append(this.f2287a[i6]);
        sb3.append(",");
        sb3.append(this.f2288b[i6]);
        throw new IllegalArgumentException(sb3.toString());
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f2287a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f2287a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f2287a[length] - this.f2287a[i];
        if (f2 == 0.0f) {
            return this.f2288b[i];
        }
        float f3 = (f - this.f2287a[i]) / f2;
        float f4 = this.f2288b[i];
        return f4 + (f3 * (this.f2288b[length] - f4));
    }
}
